package org.gtk.gobject;

@FunctionalInterface
public interface TypePluginUnuse {

    /**
     * The type of the @unuse_plugin function of #GTypePluginClass.
     */
    public void onTypePluginUnuse(TypePlugin plugin);
}
