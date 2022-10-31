package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The class structure for the GObject type.
 * <pre>{@code <!-- language="C" -->
 * // Example of implementing a singleton using a constructor.
 * static MySingleton *the_singleton = NULL;
 * 
 * static GObject*
 * my_singleton_constructor (GType                  type,
 *                           guint                  n_construct_params,
 *                           GObjectConstructParam *construct_params)
 * {
 *   GObject *object;
 *   
 *   if (!the_singleton)
 *     {
 *       object = G_OBJECT_CLASS (parent_class)->constructor (type,
 *                                                            n_construct_params,
 *                                                            construct_params);
 *       the_singleton = MY_SINGLETON (object);
 *     }
 *   else
 *     object = g_object_ref (G_OBJECT (the_singleton));
 * 
 *   return object;
 * }
 * }</pre>
 */
public class ObjectClass extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GObjectClass";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeClass.getMemoryLayout().withName("g_type_class"),
        Interop.valueLayout.ADDRESS.withName("construct_properties"),
        Interop.valueLayout.ADDRESS.withName("constructor"),
        Interop.valueLayout.ADDRESS.withName("set_property"),
        Interop.valueLayout.ADDRESS.withName("get_property"),
        Interop.valueLayout.ADDRESS.withName("dispose"),
        Interop.valueLayout.ADDRESS.withName("finalize"),
        Interop.valueLayout.ADDRESS.withName("dispatch_properties_changed"),
        Interop.valueLayout.ADDRESS.withName("notify"),
        Interop.valueLayout.ADDRESS.withName("constructed"),
        ValueLayout.JAVA_LONG.withName("flags"),
        MemoryLayout.paddingLayout(64),
        MemoryLayout.sequenceLayout(6, ValueLayout.ADDRESS).withName("pdummy")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static ObjectClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ObjectClass newInstance = new ObjectClass(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_type_class}
     * @return The value of the field {@code g_type_class}
     */
    public org.gtk.gobject.TypeClass g_type_class$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_type_class"));
        return new org.gtk.gobject.TypeClass(Refcounted.get(((MemoryAddress) handle()).addOffset(OFFSET), false));
    }
    
    @ApiStatus.Internal
    public ObjectClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Looks up the {@link ParamSpec} for a property of a class.
     * @param propertyName the name of the property to look up
     * @return the {@link ParamSpec} for the property, or
     *          {@code null} if the class doesn't have a property of that name
     */
    public @NotNull org.gtk.gobject.ParamSpec findProperty(@NotNull java.lang.String propertyName) {
        java.util.Objects.requireNonNull(propertyName, "Parameter 'propertyName' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_object_class_find_property.invokeExact(
                    handle(),
                    Interop.allocateNativeString(propertyName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(Refcounted.get(RESULT, false));
    }
    
    /**
     * Installs new properties from an array of {@code GParamSpecs}.
     * <p>
     * All properties should be installed during the class initializer.  It
     * is possible to install properties after that, but doing so is not
     * recommend, and specifically, is not guaranteed to be thread-safe vs.
     * use of properties on the same type on other threads.
     * <p>
     * The property id of each property is the index of each {@link ParamSpec} in
     * the {@code pspecs} array.
     * <p>
     * The property id of 0 is treated specially by {@link Object} and it should not
     * be used to store a {@link ParamSpec}.
     * <p>
     * This function should be used if you plan to use a static array of
     * {@code GParamSpecs} and g_object_notify_by_pspec(). For instance, this
     * class initialization:
     * <pre>{@code <!-- language="C" -->
     * enum {
     *   PROP_0, PROP_FOO, PROP_BAR, N_PROPERTIES
     * };
     * 
     * static GParamSpec *obj_properties[N_PROPERTIES] = { NULL, };
     * 
     * static void
     * my_object_class_init (MyObjectClass *klass)
     * {
     *   GObjectClass *gobject_class = G_OBJECT_CLASS (klass);
     * 
     *   obj_properties[PROP_FOO] =
     *     g_param_spec_int ("foo", "Foo", "Foo",
     *                       -1, G_MAXINT,
     *                       0,
     *                       G_PARAM_READWRITE);
     * 
     *   obj_properties[PROP_BAR] =
     *     g_param_spec_string ("bar", "Bar", "Bar",
     *                          NULL,
     *                          G_PARAM_READWRITE);
     * 
     *   gobject_class->set_property = my_object_set_property;
     *   gobject_class->get_property = my_object_get_property;
     *   g_object_class_install_properties (gobject_class,
     *                                      N_PROPERTIES,
     *                                      obj_properties);
     * }
     * }</pre>
     * <p>
     * allows calling g_object_notify_by_pspec() to notify of property changes:
     * <pre>{@code <!-- language="C" -->
     * void
     * my_object_set_foo (MyObject *self, gint foo)
     * {
     *   if (self->foo != foo)
     *     {
     *       self->foo = foo;
     *       g_object_notify_by_pspec (G_OBJECT (self), obj_properties[PROP_FOO]);
     *     }
     *  }
     * }</pre>
     * @param nPspecs the length of the {@code GParamSpecs} array
     * @param pspecs the {@code GParamSpecs} array
     *   defining the new properties
     */
    public void installProperties(int nPspecs, org.gtk.gobject.ParamSpec[] pspecs) {
        java.util.Objects.requireNonNull(pspecs, "Parameter 'pspecs' must not be null");
        try {
            DowncallHandles.g_object_class_install_properties.invokeExact(
                    handle(),
                    nPspecs,
                    Interop.allocateNativeArray(pspecs, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Installs a new property.
     * <p>
     * All properties should be installed during the class initializer.  It
     * is possible to install properties after that, but doing so is not
     * recommend, and specifically, is not guaranteed to be thread-safe vs.
     * use of properties on the same type on other threads.
     * <p>
     * Note that it is possible to redefine a property in a derived class,
     * by installing a property with the same name. This can be useful at times,
     * e.g. to change the range of allowed values or the default value.
     * @param propertyId the id for the new property
     * @param pspec the {@link ParamSpec} for the new property
     */
    public void installProperty(int propertyId, @NotNull org.gtk.gobject.ParamSpec pspec) {
        java.util.Objects.requireNonNull(pspec, "Parameter 'pspec' must not be null");
        try {
            DowncallHandles.g_object_class_install_property.invokeExact(
                    handle(),
                    propertyId,
                    pspec.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get an array of {@link ParamSpec}* for all properties of a class.
     * @param nProperties return location for the length of the returned array
     * @return an array of
     *          {@link ParamSpec}* which should be freed after use
     */
    public @NotNull org.gtk.gobject.ParamSpec[] listProperties(Out<Integer> nProperties) {
        java.util.Objects.requireNonNull(nProperties, "Parameter 'nProperties' must not be null");
        MemorySegment nPropertiesPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_object_class_list_properties.invokeExact(
                    handle(),
                    (Addressable) nPropertiesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nProperties.set(nPropertiesPOINTER.get(ValueLayout.JAVA_INT, 0));
        org.gtk.gobject.ParamSpec[] resultARRAY = new org.gtk.gobject.ParamSpec[nProperties.get().intValue()];
        for (int I = 0; I < nProperties.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.ADDRESS, I);
            resultARRAY[I] = new org.gtk.gobject.ParamSpec(Refcounted.get(OBJ, false));
        }
        return resultARRAY;
    }
    
    /**
     * Registers {@code property_id} as referring to a property with the name
     * {@code name} in a parent class or in an interface implemented by {@code oclass}.
     * This allows this class to "override" a property implementation in
     * a parent class or to provide the implementation of a property from
     * an interface.
     * <p>
     * Internally, overriding is implemented by creating a property of type
     * {@link ParamSpecOverride}; generally operations that query the properties of
     * the object class, such as g_object_class_find_property() or
     * g_object_class_list_properties() will return the overridden
     * property. However, in one case, the {@code construct_properties} argument of
     * the {@code constructor} virtual function, the {@link ParamSpecOverride} is passed
     * instead, so that the {@code param_id} field of the {@link ParamSpec} will be
     * correct.  For virtually all uses, this makes no difference. If you
     * need to get the overridden property, you can call
     * g_param_spec_get_redirect_target().
     * @param propertyId the new property ID
     * @param name the name of a property registered in a parent class or
     *  in an interface of this class.
     */
    public void overrideProperty(int propertyId, @NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        try {
            DowncallHandles.g_object_class_override_property.invokeExact(
                    handle(),
                    propertyId,
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_object_class_find_property = Interop.downcallHandle(
            "g_object_class_find_property",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_class_install_properties = Interop.downcallHandle(
            "g_object_class_install_properties",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_class_install_property = Interop.downcallHandle(
            "g_object_class_install_property",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_class_list_properties = Interop.downcallHandle(
            "g_object_class_list_properties",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_object_class_override_property = Interop.downcallHandle(
            "g_object_class_override_property",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
    }
}
