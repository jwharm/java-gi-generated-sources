package org.gtk.glib;

@FunctionalInterface
public interface TraverseFunc {

        void onTraverseFunc(jdk.incubator.foreign.MemoryAddress key, jdk.incubator.foreign.MemoryAddress value);
}
