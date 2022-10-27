package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code complete_type_info} function of {@link TypePluginClass}.
 */
@FunctionalInterface
public interface TypePluginCompleteTypeInfo {
        void onTypePluginCompleteTypeInfo(@NotNull org.gtk.gobject.TypePlugin plugin, @NotNull org.gtk.glib.Type gType, @NotNull org.gtk.gobject.TypeInfo info, @NotNull org.gtk.gobject.TypeValueTable valueTable);
}
