package org.gtk.gdkpixbuf;

/**
 * Saves a `GdkPixbuf` by calling the provided function.
 * 
 * The optional `option_keys` and `option_values` arrays contain the keys and
 * values (in the same order) for attributes to be saved alongside the image
 * data.
 */
@FunctionalInterface
public interface PixbufModuleSaveCallbackFunc {
        boolean onPixbufModuleSaveCallbackFunc(PixbufSaveFunc saveFunc, Pixbuf pixbuf, java.lang.String[] optionKeys, java.lang.String[] optionValues);
}
