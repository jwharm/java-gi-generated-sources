package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GTypeModule provides a simple implementation of the #GTypePlugin
 * interface.
 * 
 * The model of #GTypeModule is a dynamically loaded module which
 * implements some number of types and interface implementations.
 * 
 * When the module is loaded, it registers its types and interfaces
 * using g_type_module_register_type() and g_type_module_add_interface().
 * As long as any instances of these types and interface implementations
 * are in use, the module is kept loaded. When the types and interfaces
 * are gone, the module may be unloaded. If the types and interfaces
 * become used again, the module will be reloaded. Note that the last
 * reference cannot be released from within the module code, since that
 * would lead to the caller's code being unloaded before g_object_unref()
 * returns to it.
 * 
 * Keeping track of whether the module should be loaded or not is done by
 * using a use count - it starts at zero, and whenever it is greater than
 * zero, the module is loaded. The use count is maintained internally by
 * the type system, but also can be explicitly controlled by
 * g_type_module_use() and g_type_module_unuse(). Typically, when loading
 * a module for the first type, g_type_module_use() will be used to load
 * it so that it can initialize its types. At some later point, when the
 * module no longer needs to be loaded except for the type
 * implementations it contains, g_type_module_unuse() is called.
 * 
 * #GTypeModule does not actually provide any implementation of module
 * loading and unloading. To create a particular module type you must
 * derive from #GTypeModule and implement the load and unload functions
 * in #GTypeModuleClass.
 */
public class TypeModule extends Object implements TypePlugin {

    public TypeModule(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TypeModule */
    public static TypeModule castFrom(org.gtk.gobject.Object gobject) {
        return new TypeModule(gobject.getReference());
    }
    
    /**
     * Registers an additional interface for a type, whose interface lives
     * in the given type plugin. If the interface was already registered
     * for the type in this plugin, nothing will be done.
     * 
     * As long as any instances of the type exist, the type plugin will
     * not be unloaded.
     * 
     * Since 2.56 if @module is %NULL this will call g_type_add_interface_static()
     * instead. This can be used when making a static build of the module.
     */
    public void addInterface(Type instanceType, Type interfaceType, InterfaceInfo interfaceInfo) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_type_module_add_interface(HANDLE(), instanceType.getValue(), interfaceType.getValue(), interfaceInfo.HANDLE());
    }
    
    /**
     * Looks up or registers an enumeration that is implemented with a particular
     * type plugin. If a type with name @type_name was previously registered,
     * the #GType identifier for the type is returned, otherwise the type
     * is newly registered, and the resulting #GType identifier returned.
     * 
     * As long as any instances of the type exist, the type plugin will
     * not be unloaded.
     * 
     * Since 2.56 if @module is %NULL this will call g_type_register_static()
     * instead. This can be used when making a static build of the module.
     */
    public org.gtk.gobject.Type registerEnum(java.lang.String name, EnumValue constStaticValues) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_type_module_register_enum(HANDLE(), Interop.allocateNativeString(name).HANDLE(), constStaticValues.HANDLE());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Looks up or registers a flags type that is implemented with a particular
     * type plugin. If a type with name @type_name was previously registered,
     * the #GType identifier for the type is returned, otherwise the type
     * is newly registered, and the resulting #GType identifier returned.
     * 
     * As long as any instances of the type exist, the type plugin will
     * not be unloaded.
     * 
     * Since 2.56 if @module is %NULL this will call g_type_register_static()
     * instead. This can be used when making a static build of the module.
     */
    public org.gtk.gobject.Type registerFlags(java.lang.String name, FlagsValue constStaticValues) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_type_module_register_flags(HANDLE(), Interop.allocateNativeString(name).HANDLE(), constStaticValues.HANDLE());
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Looks up or registers a type that is implemented with a particular
     * type plugin. If a type with name @type_name was previously registered,
     * the #GType identifier for the type is returned, otherwise the type
     * is newly registered, and the resulting #GType identifier returned.
     * 
     * When reregistering a type (typically because a module is unloaded
     * then reloaded, and reinitialized), @module and @parent_type must
     * be the same as they were previously.
     * 
     * As long as any instances of the type exist, the type plugin will
     * not be unloaded.
     * 
     * Since 2.56 if @module is %NULL this will call g_type_register_static()
     * instead. This can be used when making a static build of the module.
     */
    public org.gtk.gobject.Type registerType(Type parentType, java.lang.String typeName, TypeInfo typeInfo, int flags) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_type_module_register_type(HANDLE(), parentType.getValue(), Interop.allocateNativeString(typeName).HANDLE(), typeInfo.HANDLE(), flags);
        return new org.gtk.gobject.Type(RESULT);
    }
    
    /**
     * Sets the name for a #GTypeModule
     */
    public void setName(java.lang.String name) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_type_module_set_name(HANDLE(), Interop.allocateNativeString(name).HANDLE());
    }
    
    /**
     * Decreases the use count of a #GTypeModule by one. If the
     * result is zero, the module will be unloaded. (However, the
     * #GTypeModule will not be freed, and types associated with the
     * #GTypeModule are not unregistered. Once a #GTypeModule is
     * initialized, it must exist forever.)
     */
    public void unuse() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_type_module_unuse(HANDLE());
    }
    
    /**
     * Increases the use count of a #GTypeModule by one. If the
     * use count was zero before, the plugin will be loaded.
     * If loading the plugin fails, the use count is reset to
     * its prior value.
     */
    public boolean useTypeModule() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_type_module_use(HANDLE());
        return (RESULT != 0);
    }
    
}
