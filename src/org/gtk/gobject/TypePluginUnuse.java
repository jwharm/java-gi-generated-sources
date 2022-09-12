package org.gtk.gobject;

/**
 * The type of the @unuse_plugin function of #GTypePluginClass.
 */
@FunctionalInterface
public interface TypePluginUnuse {
        void onTypePluginUnuse(TypePlugin plugin);
}
