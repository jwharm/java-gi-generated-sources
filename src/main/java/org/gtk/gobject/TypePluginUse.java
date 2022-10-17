package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code use_plugin} function of {@link TypePluginClass}, which gets called
 * to increase the use count of {@code plugin}.
 */
@FunctionalInterface
public interface TypePluginUse {
        void onTypePluginUse(@NotNull TypePlugin plugin);
}
