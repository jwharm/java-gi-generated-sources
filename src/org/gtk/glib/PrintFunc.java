package org.gtk.glib;

import io.github.jwharm.javagi.*;

/**
 * Specifies the type of the print handler functions.
 * These are called with the complete formatted string to output.
 */
@FunctionalInterface
public interface PrintFunc {
        void onPrintFunc(java.lang.String string);
}
