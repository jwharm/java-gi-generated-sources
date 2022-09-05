package org.gtk.gtk;

/**
 * Tells how a cell is to be rendered.
 */
public class CellRendererState {

    /**
     * The cell is currently selected, and
     *  probably has a selection colored background to render to.
     */
    public static final int SELECTED = 1;
    
    /**
     * The mouse is hovering over the cell.
     */
    public static final int PRELIT = 2;
    
    /**
     * The cell is drawn in an insensitive manner
     */
    public static final int INSENSITIVE = 4;
    
    /**
     * The cell is in a sorted row
     */
    public static final int SORTED = 8;
    
    /**
     * The cell is in the focus row.
     */
    public static final int FOCUSED = 16;
    
    /**
     * The cell is in a row that can be expanded
     */
    public static final int EXPANDABLE = 32;
    
    /**
     * The cell is in a row that is expanded
     */
    public static final int EXPANDED = 64;
    
}
