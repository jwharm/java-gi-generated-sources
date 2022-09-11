package org.gtk.gobject;

@FunctionalInterface
public interface TypePluginCompleteTypeInfo {

        void onTypePluginCompleteTypeInfo(TypePlugin plugin, Type gType, TypeInfo info);
}
