package org.gtk.gobject;

@FunctionalInterface
public interface TypePluginUse {

    /**
     * The type of the @use_plugin function of #GTypePluginClass, which gets called
     * to increase the use count of @plugin.
     */
    public void onTypePluginUse(TypePlugin plugin);
}
