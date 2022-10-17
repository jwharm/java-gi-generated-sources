package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * The type of callback that is passed to gtk_print_job_send().
 * <p>
 * It is called when the print job has been completely sent.
 */
@FunctionalInterface
public interface PrintJobCompleteFunc {
        void onPrintJobCompleteFunc(@NotNull PrintJob printJob, @NotNull org.gtk.glib.Error error);
}
