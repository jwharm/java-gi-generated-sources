package org.gtk.gtk;

/**
 * Identifies how the user can interact with a particular cell.
 */
public enum CellRendererMode {

    /**
     * The cell is just for display
     *  and cannot be interacted with.  Note that this doesn&<code>#8217</code> t mean that eg. the
     *  row being drawn can&<code>#8217</code> t be selected -- just that a particular element of
     *  it cannot be individually modified.
     */
    INERT,
    
    /**
     * The cell can be clicked.
     */
    ACTIVATABLE,
    
    /**
     * The cell can be edited or otherwise modified.
     */
    EDITABLE;
    
    public static CellRendererMode fromValue(int value) {
        return switch(value) {
            case 0 -> INERT;
            case 1 -> ACTIVATABLE;
            case 2 -> EDITABLE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case INERT -> 0;
            case ACTIVATABLE -> 1;
            case EDITABLE -> 2;
        };
    }

}
