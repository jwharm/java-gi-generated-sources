package org.gtk.gdkpixbuf;

/**
 * Saves a <code>GdkPixbuf</code> by calling the provided function.
 * <p>
 * The optional <code>option_keys</code> and <code>option_values</code> arrays contain the keys and
 * values (in the same order) for attributes to be saved alongside the image
 * data.
 */
@FunctionalInterface
public interface PixbufModuleSaveCallbackFunc {
        boolean onPixbufModuleSaveCallbackFunc(PixbufSaveFunc saveFunc, Pixbuf pixbuf, java.lang.String[] optionKeys, java.lang.String[] optionValues);
}
