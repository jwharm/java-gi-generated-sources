package org.gtk.glib;

@FunctionalInterface
public interface DataForeachFunc {

        void onDataForeachFunc(Quark keyId, jdk.incubator.foreign.MemoryAddress data);
}
