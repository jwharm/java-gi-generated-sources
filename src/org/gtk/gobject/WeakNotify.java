package org.gtk.gobject;

@FunctionalInterface
public interface WeakNotify {

        void onWeakNotify(jdk.incubator.foreign.MemoryAddress data);
}
