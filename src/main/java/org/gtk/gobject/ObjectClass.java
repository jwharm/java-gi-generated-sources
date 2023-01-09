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
public class ObjectClass extends Struct {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GObjectClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
            Interop.valueLayout.C_LONG.withName("flags"),
            Interop.valueLayout.C_LONG.withName("n_construct_properties"),
            Interop.valueLayout.ADDRESS.withName("pspecs"),
            Interop.valueLayout.C_LONG.withName("n_pspecs"),
            MemoryLayout.sequenceLayout(3, Interop.valueLayout.ADDRESS).withName("pdummy")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ObjectClass}
     * @return A new, uninitialized @{link ObjectClass}
     */
    public static ObjectClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ObjectClass newInstance = new ObjectClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_type_class}
     * @return The value of the field {@code g_type_class}
     */
    public org.gtk.gobject.TypeClass getGTypeClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_type_class"));
        return org.gtk.gobject.TypeClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code g_type_class}
     * @param gTypeClass The new value of the field {@code g_type_class}
     */
    public void setGTypeClass(org.gtk.gobject.TypeClass gTypeClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_type_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gTypeClass == null ? MemoryAddress.NULL : gTypeClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ConstructorCallback} callback.
     */
    @FunctionalInterface
    public interface ConstructorCallback {
    
        org.gtk.gobject.GObject run(org.gtk.glib.Type type, int nConstructProperties, org.gtk.gobject.ObjectConstructParam constructProperties);
        
        @ApiStatus.Internal default Addressable upcall(long type, int nConstructProperties, MemoryAddress constructProperties) {
            var RESULT = run(new org.gtk.glib.Type(type), nConstructProperties, org.gtk.gobject.ObjectConstructParam.fromAddress.marshal(constructProperties, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ConstructorCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code constructor}
     * @param constructor The new value of the field {@code constructor}
     */
    public void setConstructor(ConstructorCallback constructor) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("constructor"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (constructor == null ? MemoryAddress.NULL : constructor.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetPropertyCallback} callback.
     */
    @FunctionalInterface
    public interface SetPropertyCallback {
    
        void run(org.gtk.gobject.GObject object, int propertyId, org.gtk.gobject.Value value, org.gtk.gobject.ParamSpec pspec);
        
        @ApiStatus.Internal default void upcall(MemoryAddress object, int propertyId, MemoryAddress value, MemoryAddress pspec) {
            run((org.gtk.gobject.GObject) Interop.register(object, org.gtk.gobject.GObject.fromAddress).marshal(object, null), propertyId, org.gtk.gobject.Value.fromAddress.marshal(value, null), (org.gtk.gobject.ParamSpec) Interop.register(pspec, org.gtk.gobject.ParamSpec.fromAddress).marshal(pspec, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetPropertyCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_property}
     * @param setProperty The new value of the field {@code set_property}
     */
    public void setSetProperty(SetPropertyCallback setProperty) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_property"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setProperty == null ? MemoryAddress.NULL : setProperty.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetPropertyCallback} callback.
     */
    @FunctionalInterface
    public interface GetPropertyCallback {
    
        void run(org.gtk.gobject.GObject object, int propertyId, org.gtk.gobject.Value value, org.gtk.gobject.ParamSpec pspec);
        
        @ApiStatus.Internal default void upcall(MemoryAddress object, int propertyId, MemoryAddress value, MemoryAddress pspec) {
            run((org.gtk.gobject.GObject) Interop.register(object, org.gtk.gobject.GObject.fromAddress).marshal(object, null), propertyId, org.gtk.gobject.Value.fromAddress.marshal(value, null), (org.gtk.gobject.ParamSpec) Interop.register(pspec, org.gtk.gobject.ParamSpec.fromAddress).marshal(pspec, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetPropertyCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_property}
     * @param getProperty The new value of the field {@code get_property}
     */
    public void setGetProperty(GetPropertyCallback getProperty) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_property"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getProperty == null ? MemoryAddress.NULL : getProperty.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DisposeCallback} callback.
     */
    @FunctionalInterface
    public interface DisposeCallback {
    
        void run(org.gtk.gobject.GObject object);
        
        @ApiStatus.Internal default void upcall(MemoryAddress object) {
            run((org.gtk.gobject.GObject) Interop.register(object, org.gtk.gobject.GObject.fromAddress).marshal(object, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DisposeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code dispose}
     * @param dispose The new value of the field {@code dispose}
     */
    public void setDispose(DisposeCallback dispose) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dispose"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dispose == null ? MemoryAddress.NULL : dispose.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code FinalizeCallback} callback.
     */
    @FunctionalInterface
    public interface FinalizeCallback {
    
        void run(org.gtk.gobject.GObject object);
        
        @ApiStatus.Internal default void upcall(MemoryAddress object) {
            run((org.gtk.gobject.GObject) Interop.register(object, org.gtk.gobject.GObject.fromAddress).marshal(object, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FinalizeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code finalize}
     * @param finalize The new value of the field {@code finalize}
     */
    public void setFinalize(FinalizeCallback finalize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("finalize"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (finalize == null ? MemoryAddress.NULL : finalize.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DispatchPropertiesChangedCallback} callback.
     */
    @FunctionalInterface
    public interface DispatchPropertiesChangedCallback {
    
        void run(org.gtk.gobject.GObject object, int nPspecs, PointerProxy<org.gtk.gobject.ParamSpec> pspecs);
        
        @ApiStatus.Internal default void upcall(MemoryAddress object, int nPspecs, MemoryAddress pspecs) {
            run((org.gtk.gobject.GObject) Interop.register(object, org.gtk.gobject.GObject.fromAddress).marshal(object, null), nPspecs, new PointerProxy<org.gtk.gobject.ParamSpec>(pspecs, org.gtk.gobject.ParamSpec.fromAddress));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DispatchPropertiesChangedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code dispatch_properties_changed}
     * @param dispatchPropertiesChanged The new value of the field {@code dispatch_properties_changed}
     */
    public void setDispatchPropertiesChanged(DispatchPropertiesChangedCallback dispatchPropertiesChanged) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dispatch_properties_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dispatchPropertiesChanged == null ? MemoryAddress.NULL : dispatchPropertiesChanged.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code NotifyCallback} callback.
     */
    @FunctionalInterface
    public interface NotifyCallback {
    
        void run(org.gtk.gobject.GObject object, org.gtk.gobject.ParamSpec pspec);
        
        @ApiStatus.Internal default void upcall(MemoryAddress object, MemoryAddress pspec) {
            run((org.gtk.gobject.GObject) Interop.register(object, org.gtk.gobject.GObject.fromAddress).marshal(object, null), (org.gtk.gobject.ParamSpec) Interop.register(pspec, org.gtk.gobject.ParamSpec.fromAddress).marshal(pspec, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), NotifyCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code notify}
     * @param notify The new value of the field {@code notify}
     */
    public void setNotify(NotifyCallback notify) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("notify"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (notify == null ? MemoryAddress.NULL : notify.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ConstructedCallback} callback.
     */
    @FunctionalInterface
    public interface ConstructedCallback {
    
        void run(org.gtk.gobject.GObject object);
        
        @ApiStatus.Internal default void upcall(MemoryAddress object) {
            run((org.gtk.gobject.GObject) Interop.register(object, org.gtk.gobject.GObject.fromAddress).marshal(object, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ConstructedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code constructed}
     * @param constructed The new value of the field {@code constructed}
     */
    public void setConstructed(ConstructedCallback constructed) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("constructed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (constructed == null ? MemoryAddress.NULL : constructed.toCallback()));
        }
    }
    
    /**
     * Create a ObjectClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ObjectClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ObjectClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ObjectClass(input);
    
    /**
     * Looks up the {@link ParamSpec} for a property of a class.
     * @param propertyName the name of the property to look up
     * @return the {@link ParamSpec} for the property, or
     *          {@code null} if the class doesn't have a property of that name
     */
    public org.gtk.gobject.ParamSpec findProperty(java.lang.String propertyName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_object_class_find_property.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(propertyName, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return (org.gtk.gobject.ParamSpec) Interop.register(RESULT, org.gtk.gobject.ParamSpec.fromAddress).marshal(RESULT, null);
        }
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
     * The property id of 0 is treated specially by {@link GObject} and it should not
     * be used to store a {@link ParamSpec}.
     * <p>
     * This function should be used if you plan to use a static array of
     * {@code GParamSpecs} and g_object_notify_by_pspec(). For instance, this
     * class initialization:
     * <pre>{@code <!-- language="C" -->
     * typedef enum {
     *   PROP_FOO = 1,
     *   PROP_BAR,
     *   N_PROPERTIES
     * } MyObjectProperty;
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
     *                       G_PARAM_READWRITE | G_PARAM_STATIC_STRINGS);
     * 
     *   obj_properties[PROP_BAR] =
     *     g_param_spec_string ("bar", "Bar", "Bar",
     *                          NULL,
     *                          G_PARAM_READWRITE | G_PARAM_STATIC_STRINGS);
     * 
     *   gobject_class->set_property = my_object_set_property;
     *   gobject_class->get_property = my_object_get_property;
     *   g_object_class_install_properties (gobject_class,
     *                                      G_N_ELEMENTS (obj_properties),
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
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_object_class_install_properties.invokeExact(
                        handle(),
                        nPspecs,
                        Interop.allocateNativeArray(pspecs, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    public void installProperty(int propertyId, org.gtk.gobject.ParamSpec pspec) {
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
    public org.gtk.gobject.ParamSpec[] listProperties(Out<Integer> nProperties) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment nPropertiesPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_object_class_list_properties.invokeExact(
                        handle(),
                        (Addressable) nPropertiesPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    nProperties.set(nPropertiesPOINTER.get(Interop.valueLayout.C_INT, 0));
            org.gtk.gobject.ParamSpec[] resultARRAY = new org.gtk.gobject.ParamSpec[nProperties.get().intValue()];
            for (int I = 0; I < nProperties.get().intValue(); I++) {
                var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
                resultARRAY[I] = (org.gtk.gobject.ParamSpec) Interop.register(OBJ, org.gtk.gobject.ParamSpec.fromAddress).marshal(OBJ, null);
            }
            return resultARRAY;
        }
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
    public void overrideProperty(int propertyId, java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_object_class_override_property.invokeExact(
                        handle(),
                        propertyId,
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_object_class_find_property = Interop.downcallHandle(
                "g_object_class_find_property",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_object_class_install_properties = Interop.downcallHandle(
                "g_object_class_install_properties",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_object_class_install_property = Interop.downcallHandle(
                "g_object_class_install_property",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_object_class_list_properties = Interop.downcallHandle(
                "g_object_class_list_properties",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_object_class_override_property = Interop.downcallHandle(
                "g_object_class_override_property",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link ObjectClass.Builder} object constructs a {@link ObjectClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ObjectClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ObjectClass struct;
        
        private Builder() {
            struct = ObjectClass.allocate();
        }
        
        /**
         * Finish building the {@link ObjectClass} struct.
         * @return A new instance of {@code ObjectClass} with the fields 
         *         that were set in the Builder object.
         */
        public ObjectClass build() {
            return struct;
        }
        
        /**
         * the parent class
         * @param gTypeClass The value for the {@code gTypeClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGTypeClass(org.gtk.gobject.TypeClass gTypeClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("g_type_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gTypeClass == null ? MemoryAddress.NULL : gTypeClass.handle()));
                return this;
            }
        }
        
        public Builder setConstructProperties(org.gtk.glib.SList constructProperties) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("construct_properties"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (constructProperties == null ? MemoryAddress.NULL : constructProperties.handle()));
                return this;
            }
        }
        
        public Builder setConstructor(ConstructorCallback constructor) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("constructor"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (constructor == null ? MemoryAddress.NULL : constructor.toCallback()));
                return this;
            }
        }
        
        public Builder setSetProperty(SetPropertyCallback setProperty) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_property"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setProperty == null ? MemoryAddress.NULL : setProperty.toCallback()));
                return this;
            }
        }
        
        public Builder setGetProperty(GetPropertyCallback getProperty) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_property"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getProperty == null ? MemoryAddress.NULL : getProperty.toCallback()));
                return this;
            }
        }
        
        public Builder setDispose(DisposeCallback dispose) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("dispose"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dispose == null ? MemoryAddress.NULL : dispose.toCallback()));
                return this;
            }
        }
        
        public Builder setFinalize(FinalizeCallback finalize) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("finalize"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (finalize == null ? MemoryAddress.NULL : finalize.toCallback()));
                return this;
            }
        }
        
        public Builder setDispatchPropertiesChanged(DispatchPropertiesChangedCallback dispatchPropertiesChanged) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("dispatch_properties_changed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dispatchPropertiesChanged == null ? MemoryAddress.NULL : dispatchPropertiesChanged.toCallback()));
                return this;
            }
        }
        
        public Builder setNotify(NotifyCallback notify) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("notify"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (notify == null ? MemoryAddress.NULL : notify.toCallback()));
                return this;
            }
        }
        
        public Builder setConstructed(ConstructedCallback constructed) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("constructed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (constructed == null ? MemoryAddress.NULL : constructed.toCallback()));
                return this;
            }
        }
        
        public Builder setFlags(long flags) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), flags);
                return this;
            }
        }
        
        public Builder setNConstructProperties(long nConstructProperties) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("n_construct_properties"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), nConstructProperties);
                return this;
            }
        }
        
        public Builder setPspecs(java.lang.foreign.MemoryAddress pspecs) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("pspecs"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pspecs == null ? MemoryAddress.NULL : (Addressable) pspecs));
                return this;
            }
        }
        
        public Builder setNPspecs(long nPspecs) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("n_pspecs"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), nPspecs);
                return this;
            }
        }
        
        public Builder setPdummy(java.lang.foreign.MemoryAddress[] pdummy) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("pdummy"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pdummy == null ? MemoryAddress.NULL : Interop.allocateNativeArray(pdummy, false, SCOPE)));
                return this;
            }
        }
    }
}
