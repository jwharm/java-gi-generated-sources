package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link TypeModule} provides a simple implementation of the {@link TypePlugin}
 * interface.
 * <p>
 * The model of {@link TypeModule} is a dynamically loaded module which
 * implements some number of types and interface implementations.
 * <p>
 * When the module is loaded, it registers its types and interfaces
 * using g_type_module_register_type() and g_type_module_add_interface().
 * As long as any instances of these types and interface implementations
 * are in use, the module is kept loaded. When the types and interfaces
 * are gone, the module may be unloaded. If the types and interfaces
 * become used again, the module will be reloaded. Note that the last
 * reference cannot be released from within the module code, since that
 * would lead to the caller's code being unloaded before g_object_unref()
 * returns to it.
 * <p>
 * Keeping track of whether the module should be loaded or not is done by
 * using a use count - it starts at zero, and whenever it is greater than
 * zero, the module is loaded. The use count is maintained internally by
 * the type system, but also can be explicitly controlled by
 * g_type_module_use() and g_type_module_unuse(). Typically, when loading
 * a module for the first type, g_type_module_use() will be used to load
 * it so that it can initialize its types. At some later point, when the
 * module no longer needs to be loaded except for the type
 * implementations it contains, g_type_module_unuse() is called.
 * <p>
 * {@link TypeModule} does not actually provide any implementation of module
 * loading and unloading. To create a particular module type you must
 * derive from {@link TypeModule} and implement the load and unload functions
 * in {@link TypeModuleClass}.
 */
public class TypeModule extends org.gtk.gobject.GObject implements org.gtk.gobject.TypePlugin {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTypeModule";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.C_INT.withName("use_count"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("type_infos"),
            Interop.valueLayout.ADDRESS.withName("interface_infos"),
            Interop.valueLayout.ADDRESS.withName("name")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a TypeModule proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TypeModule(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TypeModule> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TypeModule(input, ownership);
    
    /**
     * Registers an additional interface for a type, whose interface lives
     * in the given type plugin. If the interface was already registered
     * for the type in this plugin, nothing will be done.
     * <p>
     * As long as any instances of the type exist, the type plugin will
     * not be unloaded.
     * <p>
     * Since 2.56 if {@code module} is {@code null} this will call g_type_add_interface_static()
     * instead. This can be used when making a static build of the module.
     * @param instanceType type to which to add the interface.
     * @param interfaceType interface type to add
     * @param interfaceInfo type information structure
     */
    public void addInterface(org.gtk.glib.Type instanceType, org.gtk.glib.Type interfaceType, org.gtk.gobject.InterfaceInfo interfaceInfo) {
        try {
            DowncallHandles.g_type_module_add_interface.invokeExact(
                    handle(),
                    instanceType.getValue().longValue(),
                    interfaceType.getValue().longValue(),
                    interfaceInfo.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Looks up or registers an enumeration that is implemented with a particular
     * type plugin. If a type with name {@code type_name} was previously registered,
     * the {@link org.gtk.glib.Type} identifier for the type is returned, otherwise the type
     * is newly registered, and the resulting {@link org.gtk.glib.Type} identifier returned.
     * <p>
     * As long as any instances of the type exist, the type plugin will
     * not be unloaded.
     * <p>
     * Since 2.56 if {@code module} is {@code null} this will call g_type_register_static()
     * instead. This can be used when making a static build of the module.
     * @param name name for the type
     * @param constStaticValues an array of {@link EnumValue} structs for the
     *                       possible enumeration values. The array is
     *                       terminated by a struct with all members being
     *                       0.
     * @return the new or existing type ID
     */
    public org.gtk.glib.Type registerEnum(java.lang.String name, org.gtk.gobject.EnumValue constStaticValues) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_type_module_register_enum.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null),
                    constStaticValues.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Looks up or registers a flags type that is implemented with a particular
     * type plugin. If a type with name {@code type_name} was previously registered,
     * the {@link org.gtk.glib.Type} identifier for the type is returned, otherwise the type
     * is newly registered, and the resulting {@link org.gtk.glib.Type} identifier returned.
     * <p>
     * As long as any instances of the type exist, the type plugin will
     * not be unloaded.
     * <p>
     * Since 2.56 if {@code module} is {@code null} this will call g_type_register_static()
     * instead. This can be used when making a static build of the module.
     * @param name name for the type
     * @param constStaticValues an array of {@link FlagsValue} structs for the
     *                       possible flags values. The array is
     *                       terminated by a struct with all members being
     *                       0.
     * @return the new or existing type ID
     */
    public org.gtk.glib.Type registerFlags(java.lang.String name, org.gtk.gobject.FlagsValue constStaticValues) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_type_module_register_flags.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null),
                    constStaticValues.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Looks up or registers a type that is implemented with a particular
     * type plugin. If a type with name {@code type_name} was previously registered,
     * the {@link org.gtk.glib.Type} identifier for the type is returned, otherwise the type
     * is newly registered, and the resulting {@link org.gtk.glib.Type} identifier returned.
     * <p>
     * When reregistering a type (typically because a module is unloaded
     * then reloaded, and reinitialized), {@code module} and {@code parent_type} must
     * be the same as they were previously.
     * <p>
     * As long as any instances of the type exist, the type plugin will
     * not be unloaded.
     * <p>
     * Since 2.56 if {@code module} is {@code null} this will call g_type_register_static()
     * instead. This can be used when making a static build of the module.
     * @param parentType the type for the parent class
     * @param typeName name for the type
     * @param typeInfo type information structure
     * @param flags flags field providing details about the type
     * @return the new or existing type ID
     */
    public org.gtk.glib.Type registerType(org.gtk.glib.Type parentType, java.lang.String typeName, org.gtk.gobject.TypeInfo typeInfo, org.gtk.gobject.TypeFlags flags) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_type_module_register_type.invokeExact(
                    handle(),
                    parentType.getValue().longValue(),
                    Marshal.stringToAddress.marshal(typeName, null),
                    typeInfo.handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Sets the name for a {@link TypeModule}
     * @param name a human-readable name to use in error messages.
     */
    public void setName(java.lang.String name) {
        try {
            DowncallHandles.g_type_module_set_name.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Decreases the use count of a {@link TypeModule} by one. If the
     * result is zero, the module will be unloaded. (However, the
     * {@link TypeModule} will not be freed, and types associated with the
     * {@link TypeModule} are not unregistered. Once a {@link TypeModule} is
     * initialized, it must exist forever.)
     */
    public void unuse() {
        try {
            DowncallHandles.g_type_module_unuse.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Increases the use count of a {@link TypeModule} by one. If the
     * use count was zero before, the plugin will be loaded.
     * If loading the plugin fails, the use count is reset to
     * its prior value.
     * @return {@code false} if the plugin needed to be loaded and
     *  loading the plugin failed.
     */
    public boolean useTypeModule() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_type_module_use.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_type_module_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link TypeModule.Builder} object constructs a {@link TypeModule} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link TypeModule.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link TypeModule} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TypeModule}.
         * @return A new instance of {@code TypeModule} with the properties 
         *         that were set in the Builder object.
         */
        public TypeModule build() {
            return (TypeModule) org.gtk.gobject.GObject.newWithProperties(
                TypeModule.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_type_module_add_interface = Interop.downcallHandle(
            "g_type_module_add_interface",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_type_module_register_enum = Interop.downcallHandle(
            "g_type_module_register_enum",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_type_module_register_flags = Interop.downcallHandle(
            "g_type_module_register_flags",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_type_module_register_type = Interop.downcallHandle(
            "g_type_module_register_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_type_module_set_name = Interop.downcallHandle(
            "g_type_module_set_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_type_module_unuse = Interop.downcallHandle(
            "g_type_module_unuse",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_type_module_use = Interop.downcallHandle(
            "g_type_module_use",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_type_module_get_type = Interop.downcallHandle(
            "g_type_module_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
