package org.gtk.gdkpixbuf;

@FunctionalInterface
public interface PixbufModuleSaveFunc {

    /**
     * Saves a `GdkPixbuf` into a standard C file stream.
     * 
     * The optional `param_keys` and `param_values` arrays contain the keys and
     * values (in the same order) for attributes to be saved alongside the image
     * data.
     */
    public boolean onPixbufModuleSaveFunc(jdk.incubator.foreign.MemoryAddress f, Pixbuf pixbuf, java.lang.String[] paramKeys, java.lang.String[] paramValues);
}
