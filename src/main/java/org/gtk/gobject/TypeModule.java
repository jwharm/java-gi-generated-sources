package org.gtk.gobject;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
public class TypeModule extends Object implements TypePlugin {

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
     */
    public void addInterface(org.gtk.gobject.Type instanceType, org.gtk.gobject.Type interfaceType, InterfaceInfo interfaceInfo) {
        gtk_h.g_type_module_add_interface(handle(), instanceType.getValue(), interfaceType.getValue(), interfaceInfo.handle());
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
     */
    public org.gtk.gobject.Type registerEnum(java.lang.String name, EnumValue constStaticValues) {
        var RESULT = gtk_h.g_type_module_register_enum(handle(), Interop.allocateNativeString(name).handle(), constStaticValues.handle());
        return new org.gtk.gobject.Type(RESULT);
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
     */
    public org.gtk.gobject.Type registerFlags(java.lang.String name, FlagsValue constStaticValues) {
        var RESULT = gtk_h.g_type_module_register_flags(handle(), Interop.allocateNativeString(name).handle(), constStaticValues.handle());
        return new org.gtk.gobject.Type(RESULT);
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
     */
    public org.gtk.gobject.Type registerType(org.gtk.gobject.Type parentType, java.lang.String typeName, TypeInfo typeInfo, TypeFlags flags) {
        var RESULT = gtk_h.g_type_module_register_type(handle(), parentType.getValue(), Interop.allocateNativeString(typeName).handle(), typeInfo.handle(), flags.getValue());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Sets the name for a {@link TypeModule}
     */
    public void setName(java.lang.String name) {
        gtk_h.g_type_module_set_name(handle(), Interop.allocateNativeString(name).handle());
    }
    
    /**
     * Decreases the use count of a {@link TypeModule} by one. If the
     * result is zero, the module will be unloaded. (However, the
     * {@link TypeModule} will not be freed, and types associated with the
     * {@link TypeModule} are not unregistered. Once a {@link TypeModule} is
     * initialized, it must exist forever.)
     */
    public void unuse() {
        gtk_h.g_type_module_unuse(handle());
    }
    
    /**
     * Increases the use count of a {@link TypeModule} by one. If the
     * use count was zero before, the plugin will be loaded.
     * If loading the plugin fails, the use count is reset to
     * its prior value.
     */
    public boolean useTypeModule() {
        var RESULT = gtk_h.g_type_module_use(handle());
        return RESULT != 0;
    }
    
}
