package org.gtk.glib;

/**
 * A function of this signature is used to copy the node data
 * when doing a deep-copy of a tree.
 */
@FunctionalInterface
public interface CopyFunc {
        jdk.incubator.foreign.MemoryAddress onCopyFunc(jdk.incubator.foreign.MemoryAddress src);
}
