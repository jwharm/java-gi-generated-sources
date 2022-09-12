package org.gtk.gobject;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An interface that handles the lifecycle of dynamically loaded types.
 * 
 * The GObject type system supports dynamic loading of types.
 * It goes as follows:
 * 
 * 1. The type is initially introduced (usually upon loading the module
 *    the first time, or by your main application that knows what modules
 *    introduces what types), like this:
 *    |[<!-- language="C" -->
 *    new_type_id = g_type_register_dynamic (parent_type_id,
 *                                           "TypeName",
 *                                           new_type_plugin,
 *                                           type_flags);
 *    ]|
 *    where @new_type_plugin is an implementation of the
 *    #GTypePlugin interface.
 * 
 * 2. The type's implementation is referenced, e.g. through
 *    g_type_class_ref() or through g_type_create_instance() (this is
 *    being called by g_object_new()) or through one of the above done on
 *    a type derived from @new_type_id.
 * 
 * 3. This causes the type system to load the type's implementation by
 *    calling g_type_plugin_use() and g_type_plugin_complete_type_info()
 *    on @new_type_plugin.
 * 
 * 4. At some point the type's implementation isn't required anymore,
 *    e.g. after g_type_class_unref() or g_type_free_instance() (called
 *    when the reference count of an instance drops to zero).
 * 
 * 5. This causes the type system to throw away the information retrieved
 *    from g_type_plugin_complete_type_info() and then it calls
 *    g_type_plugin_unuse() on @new_type_plugin.
 * 
 * 6. Things may repeat from the second step.
 * 
 * So basically, you need to implement a #GTypePlugin type that
 * carries a use_count, once use_count goes from zero to one, you need
 * to load the implementation to successfully handle the upcoming
 * g_type_plugin_complete_type_info() call. Later, maybe after
 * succeeding use/unuse calls, once use_count drops to zero, you can
 * unload the implementation again. The type system makes sure to call
 * g_type_plugin_use() and g_type_plugin_complete_type_info() again
 * when the type is needed again.
 * 
 * #GTypeModule is an implementation of #GTypePlugin that already
 * implements most of this except for the actual module loading and
 * unloading. It even handles multiple registered types per module.
 */
public interface TypePlugin extends io.github.jwharm.javagi.NativeAddress {

    /**
     * Calls the @complete_interface_info function from the
     * #GTypePluginClass of @plugin. There should be no need to use this
     * function outside of the GObject type system itself.
     */
    public default void completeInterfaceInfo(Type instanceType, Type interfaceType, InterfaceInfo info) {
        gtk_h.g_type_plugin_complete_interface_info(handle(), instanceType.getValue(), interfaceType.getValue(), info.handle());
    }
    
    /**
     * Calls the @complete_type_info function from the #GTypePluginClass of @plugin.
     * There should be no need to use this function outside of the GObject
     * type system itself.
     */
    public default void completeTypeInfo(Type gType, TypeInfo info, TypeValueTable valueTable) {
        gtk_h.g_type_plugin_complete_type_info(handle(), gType.getValue(), info.handle(), valueTable.handle());
    }
    
    /**
     * Calls the @unuse_plugin function from the #GTypePluginClass of
     * @plugin.  There should be no need to use this function outside of
     * the GObject type system itself.
     */
    public default void unuse() {
        gtk_h.g_type_plugin_unuse(handle());
    }
    
    /**
     * Calls the @use_plugin function from the #GTypePluginClass of
     * @plugin.  There should be no need to use this function outside of
     * the GObject type system itself.
     */
    public default void use() {
        gtk_h.g_type_plugin_use(handle());
    }
    
    class TypePluginImpl extends org.gtk.gobject.Object implements TypePlugin {
        public TypePluginImpl(io.github.jwharm.javagi.Reference reference) {
            super(reference);
        }
    }
}
