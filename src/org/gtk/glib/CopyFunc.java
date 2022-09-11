package org.gtk.glib;

@FunctionalInterface
public interface CopyFunc {

        void onCopyFunc(jdk.incubator.foreign.MemoryAddress src);
}
