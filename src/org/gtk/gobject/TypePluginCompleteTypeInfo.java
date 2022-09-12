package org.gtk.gobject;

/**
 * The type of the @complete_type_info function of #GTypePluginClass.
 */
@FunctionalInterface
public interface TypePluginCompleteTypeInfo {
        void onTypePluginCompleteTypeInfo(TypePlugin plugin, Type gType, TypeInfo info, TypeValueTable valueTable);
}
