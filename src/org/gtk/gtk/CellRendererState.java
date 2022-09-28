package org.gtk.gtk;

/**
 * Tells how a cell is to be rendered.
 */
public class CellRendererState {

    /**
     * The cell is currently selected, and
     *  probably has a selection colored background to render to.
     */
    public static final CellRendererState SELECTED = new CellRendererState(1);
    
    /**
     * The mouse is hovering over the cell.
     */
    public static final CellRendererState PRELIT = new CellRendererState(2);
    
    /**
     * The cell is drawn in an insensitive manner
     */
    public static final CellRendererState INSENSITIVE = new CellRendererState(4);
    
    /**
     * The cell is in a sorted row
     */
    public static final CellRendererState SORTED = new CellRendererState(8);
    
    /**
     * The cell is in the focus row.
     */
    public static final CellRendererState FOCUSED = new CellRendererState(16);
    
    /**
     * The cell is in a row that can be expanded
     */
    public static final CellRendererState EXPANDABLE = new CellRendererState(32);
    
    /**
     * The cell is in a row that is expanded
     */
    public static final CellRendererState EXPANDED = new CellRendererState(64);
    
    private int value;
    
    public CellRendererState(int value) {
        this.value = value;
    }
    
    public int getValue() {
        return this.value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public static int[] getValues(CellRendererState[] array) {
        int[] values = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            values[i] = array[i].getValue();
        }
        return values;
    }
    
    public CellRendererState combined(CellRendererState mask) {
        return new CellRendererState(this.getValue() | mask.getValue());
    }
    
    public static CellRendererState combined(CellRendererState mask, CellRendererState... masks) {
        int value = mask.getValue();
        for (CellRendererState arg : masks) {
            value |= arg.getValue();
        }
        return new CellRendererState(value);
    }
    
}
