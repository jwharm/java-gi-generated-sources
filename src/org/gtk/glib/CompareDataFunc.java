package org.gtk.glib;

@FunctionalInterface
public interface CompareDataFunc {

        void onCompareDataFunc(jdk.incubator.foreign.MemoryAddress a, jdk.incubator.foreign.MemoryAddress b);
}
