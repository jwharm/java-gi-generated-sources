package org.gtk.gtk;

@FunctionalInterface
public interface PrintJobCompleteFunc {

    /**
     * The type of callback that is passed to gtk_print_job_send().
     * 
     * It is called when the print job has been completely sent.
     */
    public void onPrintJobCompleteFunc(PrintJob printJob, jdk.incubator.foreign.MemoryAddress userData, org.gtk.glib.Error error);
}
