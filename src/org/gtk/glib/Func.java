package org.gtk.glib;

@FunctionalInterface
public interface Func {

        void onFunc(jdk.incubator.foreign.MemoryAddress data);
}
