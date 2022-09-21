package org.gtk.gobject;

/**
 * The type of the {@code complete_type_info} function of {@link TypePluginClass}.
 */
@FunctionalInterface
public interface TypePluginCompleteTypeInfo {
        void onTypePluginCompleteTypeInfo(TypePlugin plugin, Type gType, TypeInfo info, TypeValueTable valueTable);
}
