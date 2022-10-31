package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Tells how a cell is to be rendered.
 */
public class CellRendererState extends io.github.jwharm.javagi.Bitfield {
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellRendererState";
    
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
    
    public CellRendererState(int value) {
        super(value);
    }
}
