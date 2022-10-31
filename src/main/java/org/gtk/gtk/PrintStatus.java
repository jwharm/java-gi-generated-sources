package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The status gives a rough indication of the completion of a running
 * print operation.
 */
public class PrintStatus extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkPrintStatus";
    
    /**
     * The printing has not started yet; this
     *   status is set initially, and while the print dialog is shown.
     */
    public static final PrintStatus INITIAL = new PrintStatus(0);
    
    /**
     * This status is set while the begin-print
     *   signal is emitted and during pagination.
     */
    public static final PrintStatus PREPARING = new PrintStatus(1);
    
    /**
     * This status is set while the
     *   pages are being rendered.
     */
    public static final PrintStatus GENERATING_DATA = new PrintStatus(2);
    
    /**
     * The print job is being sent off to the
     *   printer.
     */
    public static final PrintStatus SENDING_DATA = new PrintStatus(3);
    
    /**
     * The print job has been sent to the printer,
     *   but is not printed for some reason, e.g. the printer may be stopped.
     */
    public static final PrintStatus PENDING = new PrintStatus(4);
    
    /**
     * Some problem has occurred during
     *   printing, e.g. a paper jam.
     */
    public static final PrintStatus PENDING_ISSUE = new PrintStatus(5);
    
    /**
     * The printer is processing the print job.
     */
    public static final PrintStatus PRINTING = new PrintStatus(6);
    
    /**
     * The printing has been completed successfully.
     */
    public static final PrintStatus FINISHED = new PrintStatus(7);
    
    /**
     * The printing has been aborted.
     */
    public static final PrintStatus FINISHED_ABORTED = new PrintStatus(8);
    
    public PrintStatus(int value) {
        super(value);
    }
}
