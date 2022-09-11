package org.gtk.gobject;

@FunctionalInterface
public interface ClosureNotify {

        void onClosureNotify(jdk.incubator.foreign.MemoryAddress data);
}
