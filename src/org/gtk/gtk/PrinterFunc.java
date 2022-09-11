package org.gtk.gtk;

/**
 * The type of function passed to gtk_enumerate_printers().
 * 
 * Note that you need to ref @printer, if you want to keep
 * a reference to it after the function has returned.
 */
@FunctionalInterface
public interface PrinterFunc {
        boolean onPrinterFunc(Printer printer);
}
