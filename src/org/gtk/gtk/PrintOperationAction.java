package org.gtk.gtk;

/**
 * Determines what action the print operation should perform.
 * 
 * A parameter of this typs is passed to {@link org.gtk.gtk.PrintOperation#run}.
 */
public enum PrintOperationAction {

    /**
     * Show the print dialog.
     */
    PRINT_DIALOG,
    
    /**
     * Start to print without showing
     *   the print dialog, based on the current print settings.
     */
    PRINT,
    
    /**
     * Show the print preview.
     */
    PREVIEW,
    
    /**
     * Export to a file. This requires
     *   the export-filename property to be set.
     */
    EXPORT;
    
    public static PrintOperationAction fromValue(int value) {
        return switch(value) {
            case 0 -> PRINT_DIALOG;
            case 1 -> PRINT;
            case 2 -> PREVIEW;
            case 3 -> EXPORT;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case PRINT_DIALOG -> 0;
            case PRINT -> 1;
            case PREVIEW -> 2;
            case EXPORT -> 3;
        };
    }

}
