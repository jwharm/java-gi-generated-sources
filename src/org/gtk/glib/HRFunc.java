package org.gtk.glib;

@FunctionalInterface
public interface HRFunc {

        void onHRFunc(jdk.incubator.foreign.MemoryAddress key, jdk.incubator.foreign.MemoryAddress value);
}
