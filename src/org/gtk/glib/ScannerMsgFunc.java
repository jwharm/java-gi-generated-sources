package org.gtk.glib;

/**
 * Specifies the type of the message handler function.
 */
@FunctionalInterface
public interface ScannerMsgFunc {
        void onScannerMsgFunc(Scanner scanner, java.lang.String message, boolean error);
}
