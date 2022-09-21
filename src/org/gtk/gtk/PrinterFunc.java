package org.gtk.gtk;

/**
 * The type of function passed to gtk_enumerate_printers().
 * <p>
 * Note that you need to ref {@code printer}, if you want to keep
 * a reference to it after the function has returned.
 */
@FunctionalInterface
public interface PrinterFunc {
        boolean onPrinterFunc(Printer printer);
}
