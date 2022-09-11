package org.gtk.gio;

@FunctionalInterface
public interface ReallocFunc {

        void onReallocFunc(jdk.incubator.foreign.MemoryAddress data);
}
