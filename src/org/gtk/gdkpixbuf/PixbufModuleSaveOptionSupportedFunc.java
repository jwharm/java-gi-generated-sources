package org.gtk.gdkpixbuf;

/**
 * Checks whether the given {@code option_key} is supported when saving.
 */
@FunctionalInterface
public interface PixbufModuleSaveOptionSupportedFunc {
        boolean onPixbufModuleSaveOptionSupportedFunc(java.lang.String optionKey);
}
