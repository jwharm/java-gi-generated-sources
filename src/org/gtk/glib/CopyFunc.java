package org.gtk.glib;

@FunctionalInterface
public interface CopyFunc {

    /**
     * A function of this signature is used to copy the node data
     * when doing a deep-copy of a tree.
     */
    public jdk.incubator.foreign.MemoryAddress onCopyFunc(jdk.incubator.foreign.MemoryAddress src, jdk.incubator.foreign.MemoryAddress data);
}
