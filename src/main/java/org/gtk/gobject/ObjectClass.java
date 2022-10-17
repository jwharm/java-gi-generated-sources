package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The class structure for the GObject type.
 * <p>
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

    public ObjectClass(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_object_class_find_property = Interop.downcallHandle(
        "g_object_class_find_property",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up the {@link ParamSpec} for a property of a class.
     */
    public @NotNull ParamSpec findProperty(@NotNull java.lang.String propertyName) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_object_class_find_property.invokeExact(handle(), Interop.allocateNativeString(propertyName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_object_class_install_properties = Interop.downcallHandle(
        "g_object_class_install_properties",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
     * <p>
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
     * <p>
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
     */
    public @NotNull void installProperties(@NotNull int nPspecs, @NotNull ParamSpec[] pspecs) {
        try {
            g_object_class_install_properties.invokeExact(handle(), nPspecs, Interop.allocateNativeArray(pspecs));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_object_class_install_property = Interop.downcallHandle(
        "g_object_class_install_property",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
     */
    public @NotNull void installProperty(@NotNull int propertyId, @NotNull ParamSpec pspec) {
        try {
            g_object_class_install_property.invokeExact(handle(), propertyId, pspec.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_object_class_list_properties = Interop.downcallHandle(
        "g_object_class_list_properties",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get an array of {@link ParamSpec}* for all properties of a class.
     */
    public ParamSpec[] listProperties(@NotNull Out<Integer> nProperties) {
        MemorySegment nPropertiesPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_object_class_list_properties.invokeExact(handle(), (Addressable) nPropertiesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nProperties.set(nPropertiesPOINTER.get(ValueLayout.JAVA_INT, 0));
        ParamSpec[] resultARRAY = new ParamSpec[nProperties.get().intValue()];
        for (int I = 0; I < nProperties.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.ADDRESS, I);
            resultARRAY[I] = new ParamSpec(Refcounted.get(OBJ, false));
        }
        return resultARRAY;
    }
    
    private static final MethodHandle g_object_class_override_property = Interop.downcallHandle(
        "g_object_class_override_property",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
     */
    public @NotNull void overrideProperty(@NotNull int propertyId, @NotNull java.lang.String name) {
        try {
            g_object_class_override_property.invokeExact(handle(), propertyId, Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
