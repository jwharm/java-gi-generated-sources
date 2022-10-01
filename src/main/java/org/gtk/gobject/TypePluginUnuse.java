package org.gtk.gobject;

import io.github.jwharm.javagi.*;

/**
 * The type of the {@code unuse_plugin} function of {@link TypePluginClass}.
 */
@FunctionalInterface
public interface TypePluginUnuse {
        void onTypePluginUnuse(TypePlugin plugin);
}
