package org.gtk.gobject;

import io.github.jwharm.javagi.*;

/**
 * The type of the {@code complete_type_info} function of {@link TypePluginClass}.
 */
@FunctionalInterface
public interface TypePluginCompleteTypeInfo {
        void onTypePluginCompleteTypeInfo(TypePlugin plugin, org.gtk.gobject.Type gType, TypeInfo info, TypeValueTable valueTable);
}
