package org.gtk.gtk;

/**
 * The possible accessible relations of a {@link [iface@Accessible] (ref=iface)}.
 * 
 * Accessible relations can be references to other widgets,
 * integers or strings.
 */
public enum AccessibleRelation {

    /**
     * Identifies the currently active
     *    element when focus is on a composite widget, combobox, textbox, group,
     *    or application. Value type: reference
     */
    ACTIVE_DESCENDANT,
    
    /**
     * Defines the total number of columns
     *    in a table, grid, or treegrid. Value type: integer
     */
    COL_COUNT,
    
    /**
     * Defines an element&#39;s column index or
     *    position with respect to the total number of columns within a table,
     *    grid, or treegrid. Value type: integer
     */
    COL_INDEX,
    
    /**
     * Defines a human readable text
     *   alternative of <code>GTK_ACCESSIBLE_RELATION_COL_INDEX.</code> Value type: string
     */
    COL_INDEX_TEXT,
    
    /**
     * Defines the number of columns spanned
     *   by a cell or gridcell within a table, grid, or treegrid. Value type: integer
     */
    COL_SPAN,
    
    /**
     * Identifies the element (or elements) whose
     *    contents or presence are controlled by the current element. Value type: reference
     */
    CONTROLS,
    
    /**
     * Identifies the element (or elements)
     *    that describes the object. Value type: reference
     */
    DESCRIBED_BY,
    
    /**
     * Identifies the element (or elements) that
     *    provide additional information related to the object. Value type: reference
     */
    DETAILS,
    
    /**
     * Identifies the element that provides
     *    an error message for an object. Value type: reference
     */
    ERROR_MESSAGE,
    
    /**
     * Identifies the next element (or elements)
     *    in an alternate reading order of content which, at the user&#39;s discretion,
     *    allows assistive technology to override the general default of reading in
     *    document source order. Value type: reference
     */
    FLOW_TO,
    
    /**
     * Identifies the element (or elements)
     *    that labels the current element. Value type: reference
     */
    LABELLED_BY,
    
    /**
     * Identifies an element (or elements) in order
     *    to define a visual, functional, or contextual parent/child relationship
     *    between elements where the widget hierarchy cannot be used to represent
     *    the relationship. Value type: reference
     */
    OWNS,
    
    /**
     * Defines an element&#39;s number or position
     *    in the current set of listitems or treeitems. Value type: integer
     */
    POS_IN_SET,
    
    /**
     * Defines the total number of rows in a table,
     *    grid, or treegrid. Value type: integer
     */
    ROW_COUNT,
    
    /**
     * Defines an element&#39;s row index or position
     *    with respect to the total number of rows within a table, grid, or treegrid.
     *    Value type: integer
     */
    ROW_INDEX,
    
    /**
     * Defines a human readable text
     *    alternative of aria-rowindex. Value type: string
     */
    ROW_INDEX_TEXT,
    
    /**
     * Defines the number of rows spanned by a
     *    cell or gridcell within a table, grid, or treegrid. Value type: integer
     */
    ROW_SPAN,
    
    /**
     * Defines the number of items in the current
     *    set of listitems or treeitems. Value type: integer
     */
    SET_SIZE;
    
    public static AccessibleRelation fromValue(int value) {
        return switch(value) {
            case 0 -> ACTIVE_DESCENDANT;
            case 1 -> COL_COUNT;
            case 2 -> COL_INDEX;
            case 3 -> COL_INDEX_TEXT;
            case 4 -> COL_SPAN;
            case 5 -> CONTROLS;
            case 6 -> DESCRIBED_BY;
            case 7 -> DETAILS;
            case 8 -> ERROR_MESSAGE;
            case 9 -> FLOW_TO;
            case 10 -> LABELLED_BY;
            case 11 -> OWNS;
            case 12 -> POS_IN_SET;
            case 13 -> ROW_COUNT;
            case 14 -> ROW_INDEX;
            case 15 -> ROW_INDEX_TEXT;
            case 16 -> ROW_SPAN;
            case 17 -> SET_SIZE;
            default -> null;
        };
    }

    public int getValue() {
        return switch(this) {
            case ACTIVE_DESCENDANT -> 0;
            case COL_COUNT -> 1;
            case COL_INDEX -> 2;
            case COL_INDEX_TEXT -> 3;
            case COL_SPAN -> 4;
            case CONTROLS -> 5;
            case DESCRIBED_BY -> 6;
            case DETAILS -> 7;
            case ERROR_MESSAGE -> 8;
            case FLOW_TO -> 9;
            case LABELLED_BY -> 10;
            case OWNS -> 11;
            case POS_IN_SET -> 12;
            case ROW_COUNT -> 13;
            case ROW_INDEX -> 14;
            case ROW_INDEX_TEXT -> 15;
            case ROW_SPAN -> 16;
            case SET_SIZE -> 17;
        };
    }

}
