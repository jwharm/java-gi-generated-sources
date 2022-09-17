package org.gtk.glib;

/**
 * The type of functions that are used to &#39;duplicate&#39; an object.
 * What this means depends on the context, it could just be
 * incrementing the reference count, if @data is a ref-counted
 * object.
 */
@FunctionalInterface
public interface DuplicateFunc {
        jdk.incubator.foreign.MemoryAddress onDuplicateFunc();
}
