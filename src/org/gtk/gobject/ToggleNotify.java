package org.gtk.gobject;

@FunctionalInterface
public interface ToggleNotify {

        void onToggleNotify(jdk.incubator.foreign.MemoryAddress data, Object object);
}
