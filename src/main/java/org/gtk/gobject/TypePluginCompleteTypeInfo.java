package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code complete_type_info} function of {@link TypePluginClass}.
 */
@FunctionalInterface
public interface TypePluginCompleteTypeInfo {
        void onTypePluginCompleteTypeInfo(@NotNull TypePlugin plugin, @NotNull org.gtk.gobject.Type gType, @NotNull TypeInfo info, @NotNull TypeValueTable valueTable);
}
