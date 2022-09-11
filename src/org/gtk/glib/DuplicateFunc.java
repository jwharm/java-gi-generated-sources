package org.gtk.glib;

@FunctionalInterface
public interface DuplicateFunc {

        void onDuplicateFunc(jdk.incubator.foreign.MemoryAddress data);
}
