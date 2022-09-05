package org.gtk.gdkpixbuf;

@FunctionalInterface
public interface PixbufModuleSaveCallbackFunc {

    /**
     * Saves a `GdkPixbuf` by calling the provided function.
     * 
     * The optional `option_keys` and `option_values` arrays contain the keys and
     * values (in the same order) for attributes to be saved alongside the image
     * data.
     */
    public boolean onPixbufModuleSaveCallbackFunc(PixbufSaveFunc saveFunc, jdk.incubator.foreign.MemoryAddress userData, Pixbuf pixbuf, java.lang.String[] optionKeys, java.lang.String[] optionValues);
}
