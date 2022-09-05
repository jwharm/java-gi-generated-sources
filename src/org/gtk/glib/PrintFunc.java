package org.gtk.glib;

@FunctionalInterface
public interface PrintFunc {

    /**
     * Specifies the type of the print handler functions.
     * These are called with the complete formatted string to output.
     */
    public void onPrintFunc(java.lang.String string);
}
