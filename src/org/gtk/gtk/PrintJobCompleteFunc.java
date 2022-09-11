package org.gtk.gtk;

/**
 * The type of callback that is passed to gtk_print_job_send().
 * 
 * It is called when the print job has been completely sent.
 */
@FunctionalInterface
public interface PrintJobCompleteFunc {
        void onPrintJobCompleteFunc(PrintJob printJob, org.gtk.glib.Error error);
}
