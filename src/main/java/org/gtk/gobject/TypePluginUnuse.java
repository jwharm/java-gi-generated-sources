package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code unuse_plugin} function of {@link TypePluginClass}.
 */
@FunctionalInterface
public interface TypePluginUnuse {
        void onTypePluginUnuse(@NotNull org.gtk.gobject.TypePlugin plugin);
}
