package org.gtk.gtk;

/**
 * The status gives a rough indication of the completion of a running
 * print operation.
 */
public enum PrintStatus {

    /**
     * The printing has not started yet; this
     *   status is set initially, and while the print dialog is shown.
     */
    INITIAL,
    
    /**
     * This status is set while the begin-print
     *   signal is emitted and during pagination.
     */
    PREPARING,
    
    /**
     * This status is set while the
     *   pages are being rendered.
     */
    GENERATING_DATA,
    
    /**
     * The print job is being sent off to the
     *   printer.
     */
    SENDING_DATA,
    
    /**
     * The print job has been sent to the printer,
     *   but is not printed for some reason, e.g. the printer may be stopped.
     */
    PENDING,
    
    /**
     * Some problem has occurred during
     *   printing, e.g. a paper jam.
     */
    PENDING_ISSUE,
    
    /**
     * The printer is processing the print job.
     */
    PRINTING,
    
    /**
     * The printing has been completed successfully.
     */
    FINISHED,
    
    /**
     * The printing has been aborted.
     */
    FINISHED_ABORTED;
    
    public static PrintStatus fromValue(int value) {
        return switch(value) {
            case 0 -> INITIAL;
            case 1 -> PREPARING;
            case 2 -> GENERATING_DATA;
            case 3 -> SENDING_DATA;
            case 4 -> PENDING;
            case 5 -> PENDING_ISSUE;
            case 6 -> PRINTING;
            case 7 -> FINISHED;
            case 8 -> FINISHED_ABORTED;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case INITIAL -> 0;
            case PREPARING -> 1;
            case GENERATING_DATA -> 2;
            case SENDING_DATA -> 3;
            case PENDING -> 4;
            case PENDING_ISSUE -> 5;
            case PRINTING -> 6;
            case FINISHED -> 7;
            case FINISHED_ABORTED -> 8;
        };
    }

}
