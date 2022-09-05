package org.gtk.gtk;

@FunctionalInterface
public interface PrinterFunc {

    /**
     * The type of function passed to gtk_enumerate_printers().
     * 
     * Note that you need to ref @printer, if you want to keep
     * a reference to it after the function has returned.
     */
    public boolean onPrinterFunc(Printer printer, jdk.incubator.foreign.MemoryAddress data);
}
