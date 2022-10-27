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
public class TypeModule extends org.gtk.gobject.Object implements org.gtk.gobject.TypePlugin {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        ValueLayout.JAVA_INT.withName("use_count"),
        org.gtk.glib.SList.getMemoryLayout().withName("type_infos"),
        org.gtk.glib.SList.getMemoryLayout().withName("interface_infos"),
        Interop.valueLayout.ADDRESS.withName("name")
    ).withName("GTypeModule");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public TypeModule(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TypeModule */
    public static TypeModule castFrom(org.gtk.gobject.Object gobject) {
        return new TypeModule(gobject.refcounted());
    }
    
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
    public void addInterface(@NotNull org.gtk.glib.Type instanceType, @NotNull org.gtk.glib.Type interfaceType, @NotNull org.gtk.gobject.InterfaceInfo interfaceInfo) {
        java.util.Objects.requireNonNull(instanceType, "Parameter 'instanceType' must not be null");
        java.util.Objects.requireNonNull(interfaceType, "Parameter 'interfaceType' must not be null");
        java.util.Objects.requireNonNull(interfaceInfo, "Parameter 'interfaceInfo' must not be null");
        try {
            DowncallHandles.g_type_module_add_interface.invokeExact(handle(), instanceType.getValue(), interfaceType.getValue(), interfaceInfo.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Looks up or registers an enumeration that is implemented with a particular
     * type plugin. If a type with name {@code type_name} was previously registered,
     * the {@link Type} identifier for the type is returned, otherwise the type
     * is newly registered, and the resulting {@link Type} identifier returned.
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
    public @NotNull org.gtk.glib.Type registerEnum(@NotNull java.lang.String name, @NotNull org.gtk.gobject.EnumValue constStaticValues) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(constStaticValues, "Parameter 'constStaticValues' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_type_module_register_enum.invokeExact(handle(), Interop.allocateNativeString(name), constStaticValues.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Looks up or registers a flags type that is implemented with a particular
     * type plugin. If a type with name {@code type_name} was previously registered,
     * the {@link Type} identifier for the type is returned, otherwise the type
     * is newly registered, and the resulting {@link Type} identifier returned.
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
    public @NotNull org.gtk.glib.Type registerFlags(@NotNull java.lang.String name, @NotNull org.gtk.gobject.FlagsValue constStaticValues) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(constStaticValues, "Parameter 'constStaticValues' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_type_module_register_flags.invokeExact(handle(), Interop.allocateNativeString(name), constStaticValues.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Looks up or registers a type that is implemented with a particular
     * type plugin. If a type with name {@code type_name} was previously registered,
     * the {@link Type} identifier for the type is returned, otherwise the type
     * is newly registered, and the resulting {@link Type} identifier returned.
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
    public @NotNull org.gtk.glib.Type registerType(@NotNull org.gtk.glib.Type parentType, @NotNull java.lang.String typeName, @NotNull org.gtk.gobject.TypeInfo typeInfo, @NotNull org.gtk.gobject.TypeFlags flags) {
        java.util.Objects.requireNonNull(parentType, "Parameter 'parentType' must not be null");
        java.util.Objects.requireNonNull(typeName, "Parameter 'typeName' must not be null");
        java.util.Objects.requireNonNull(typeInfo, "Parameter 'typeInfo' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_type_module_register_type.invokeExact(handle(), parentType.getValue(), Interop.allocateNativeString(typeName), typeInfo.handle(), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Sets the name for a {@link TypeModule}
     * @param name a human-readable name to use in error messages.
     */
    public void setName(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        try {
            DowncallHandles.g_type_module_set_name.invokeExact(handle(), Interop.allocateNativeString(name));
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
            DowncallHandles.g_type_module_unuse.invokeExact(handle());
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
            RESULT = (int) DowncallHandles.g_type_module_use.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_type_module_add_interface = Interop.downcallHandle(
            "g_type_module_add_interface",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_type_module_register_enum = Interop.downcallHandle(
            "g_type_module_register_enum",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_type_module_register_flags = Interop.downcallHandle(
            "g_type_module_register_flags",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_type_module_register_type = Interop.downcallHandle(
            "g_type_module_register_type",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_type_module_set_name = Interop.downcallHandle(
            "g_type_module_set_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_type_module_unuse = Interop.downcallHandle(
            "g_type_module_unuse",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_type_module_use = Interop.downcallHandle(
            "g_type_module_use",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
    }
}
