package org.gtk.gobject;

@FunctionalInterface
public interface TypePluginCompleteTypeInfo {

    /**
     * The type of the @complete_type_info function of #GTypePluginClass.
     */
    public void onTypePluginCompleteTypeInfo(TypePlugin plugin, Type gType, TypeInfo info, TypeValueTable valueTable);
}
