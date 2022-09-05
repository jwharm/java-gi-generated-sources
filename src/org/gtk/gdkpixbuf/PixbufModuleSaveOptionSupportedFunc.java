package org.gtk.gdkpixbuf;

@FunctionalInterface
public interface PixbufModuleSaveOptionSupportedFunc {

    /**
     * Checks whether the given `option_key` is supported when saving.
     */
    public boolean onPixbufModuleSaveOptionSupportedFunc(java.lang.String optionKey);
}
