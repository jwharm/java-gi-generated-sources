package org.gtk.glib;

@FunctionalInterface
public interface HFunc {

        void onHFunc(jdk.incubator.foreign.MemoryAddress key, jdk.incubator.foreign.MemoryAddress value);
}
