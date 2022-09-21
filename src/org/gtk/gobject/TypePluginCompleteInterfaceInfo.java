package org.gtk.gobject;

/**
 * The type of the {@code complete_interface_info} function of {@link TypePluginClass}.
 */
@FunctionalInterface
public interface TypePluginCompleteInterfaceInfo {
        void onTypePluginCompleteInterfaceInfo(TypePlugin plugin, Type instanceType, Type interfaceType, InterfaceInfo info);
}
