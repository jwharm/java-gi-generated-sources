package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code use_plugin} function of {@link TypePluginClass}, which gets called
 * to increase the use count of {@code plugin}.
 */
@FunctionalInterface
public interface TypePluginUse {
        void onTypePluginUse(@NotNull org.gtk.gobject.TypePlugin plugin);
}
