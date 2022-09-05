package org.gtk.glib;

@FunctionalInterface
public interface ScannerMsgFunc {

    /**
     * Specifies the type of the message handler function.
     */
    public void onScannerMsgFunc(Scanner scanner, java.lang.String message, boolean error);
}
