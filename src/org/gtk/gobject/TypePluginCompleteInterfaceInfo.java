package org.gtk.gobject;

/**
 * The type of the @complete_interface_info function of #GTypePluginClass.
 */
@FunctionalInterface
public interface TypePluginCompleteInterfaceInfo {
        void onTypePluginCompleteInterfaceInfo(TypePlugin plugin, Type instanceType, Type interfaceType, InterfaceInfo info);
}
