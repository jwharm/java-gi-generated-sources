package org.gtk.gobject;

/**
 * The type of the {@code use_plugin} function of {@link TypePluginClass}, which gets called
 * to increase the use count of {@code plugin}.
 */
@FunctionalInterface
public interface TypePluginUse {
        void onTypePluginUse(TypePlugin plugin);
}
