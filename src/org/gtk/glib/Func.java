package org.gtk.glib;

@FunctionalInterface
public interface Func {

    /**
     * Specifies the type of functions passed to g_list_foreach() and
     * g_slist_foreach().
     */
    public void onFunc(jdk.incubator.foreign.MemoryAddress data, jdk.incubator.foreign.MemoryAddress userData);
}
