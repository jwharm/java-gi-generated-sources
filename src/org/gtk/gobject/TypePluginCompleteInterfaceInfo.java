package org.gtk.gobject;

@FunctionalInterface
public interface TypePluginCompleteInterfaceInfo {

    /**
     * The type of the @complete_interface_info function of #GTypePluginClass.
     */
    public void onTypePluginCompleteInterfaceInfo(TypePlugin plugin, Type instanceType, Type interfaceType, InterfaceInfo info);
}
