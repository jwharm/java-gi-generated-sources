package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The status gives a rough indication of the completion of a running
 * print operation.
 */
public enum PrintStatus implements io.github.jwharm.javagi.Enumeration {
    /**
     * The printing has not started yet; this
     *   status is set initially, and while the print dialog is shown.
     */
    INITIAL(0),
    /**
     * This status is set while the begin-print
     *   signal is emitted and during pagination.
     */
    PREPARING(1),
    /**
     * This status is set while the
     *   pages are being rendered.
     */
    GENERATING_DATA(2),
    /**
     * The print job is being sent off to the
     *   printer.
     */
    SENDING_DATA(3),
    /**
     * The print job has been sent to the printer,
     *   but is not printed for some reason, e.g. the printer may be stopped.
     */
    PENDING(4),
    /**
     * Some problem has occurred during
     *   printing, e.g. a paper jam.
     */
    PENDING_ISSUE(5),
    /**
     * The printer is processing the print job.
     */
    PRINTING(6),
    /**
     * The printing has been completed successfully.
     */
    FINISHED(7),
    /**
     * The printing has been aborted.
     */
    FINISHED_ABORTED(8);
    
    private static final java.lang.String C_TYPE_NAME = "GtkPrintStatus";
    
    private final int value;
    PrintStatus(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static PrintStatus of(int value) {
        return switch (value) {
            case 0 -> INITIAL;
            case 1 -> PREPARING;
            case 2 -> GENERATING_DATA;
            case 3 -> SENDING_DATA;
            case 4 -> PENDING;
            case 5 -> PENDING_ISSUE;
            case 6 -> PRINTING;
            case 7 -> FINISHED;
            case 8 -> FINISHED_ABORTED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
}
