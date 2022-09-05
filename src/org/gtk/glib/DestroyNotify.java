package org.gtk.glib;

@FunctionalInterface
public interface DestroyNotify {

    /**
     * Specifies the type of function which is called when a data element
     * is destroyed. It is passed the pointer to the data element and
     * should free any memory and resources allocated for it.
     */
    public void onDestroyNotify(jdk.incubator.foreign.MemoryAddress data);
}
