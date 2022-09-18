package org.gtk.gobject;

/**
 * The type of the @unuse_plugin function of {@link org.gtk.gobject.TypePluginClass}
 */
@FunctionalInterface
public interface TypePluginUnuse {
        void onTypePluginUnuse(TypePlugin plugin);
}
