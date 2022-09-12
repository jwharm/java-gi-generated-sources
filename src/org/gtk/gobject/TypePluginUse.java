package org.gtk.gobject;

/**
 * The type of the @use_plugin function of #GTypePluginClass, which gets called
 * to increase the use count of @plugin.
 */
@FunctionalInterface
public interface TypePluginUse {
        void onTypePluginUse(TypePlugin plugin);
}
