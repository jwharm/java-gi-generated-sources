package org.gtk.gobject;

import io.github.jwharm.javagi.*;

/**
 * The type of the {@code complete_interface_info} function of {@link TypePluginClass}.
 */
@FunctionalInterface
public interface TypePluginCompleteInterfaceInfo {
        void onTypePluginCompleteInterfaceInfo(TypePlugin plugin, Type instanceType, Type interfaceType, InterfaceInfo info);
}
