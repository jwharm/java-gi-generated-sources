package org.gtk.gdkpixbuf;

@FunctionalInterface
public interface PixbufModuleLoadFunc {

    /**
     * Loads a file from a standard C file stream into a new `GdkPixbuf`.
     * 
     * In case of error, this function should return `NULL` and set the `error` argument.
     */
    public Pixbuf onPixbufModuleLoadFunc(jdk.incubator.foreign.MemoryAddress f);
}
