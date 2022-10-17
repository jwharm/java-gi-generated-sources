package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code complete_interface_info} function of {@link TypePluginClass}.
 */
@FunctionalInterface
public interface TypePluginCompleteInterfaceInfo {
        void onTypePluginCompleteInterfaceInfo(@NotNull TypePlugin plugin, @NotNull org.gtk.gobject.Type instanceType, @NotNull org.gtk.gobject.Type interfaceType, @NotNull InterfaceInfo info);
}
