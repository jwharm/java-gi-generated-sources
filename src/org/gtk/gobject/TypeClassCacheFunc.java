package org.gtk.gobject;

@FunctionalInterface
public interface TypeClassCacheFunc {

        void onTypeClassCacheFunc(jdk.incubator.foreign.MemoryAddress cacheData);
}
