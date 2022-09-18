package org.gtk.gobject;

/**
 * The type of the @complete_interface_info function of {@link org.gtk.gobject.TypePluginClass}
 */
@FunctionalInterface
public interface TypePluginCompleteInterfaceInfo {
        void onTypePluginCompleteInterfaceInfo(TypePlugin plugin, Type instanceType, Type interfaceType, InterfaceInfo info);
}
