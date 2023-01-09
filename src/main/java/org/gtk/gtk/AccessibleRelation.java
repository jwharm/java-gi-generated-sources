package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The possible accessible relations of a {@code Accessible}.
 * <p>
 * Accessible relations can be references to other widgets,
 * integers or strings.
 */
public enum AccessibleRelation implements io.github.jwharm.javagi.Enumeration {
    
    /**
     * Identifies the currently active
     *    element when focus is on a composite widget, combobox, textbox, group,
     *    or application. Value type: reference
     */
    ACTIVE_DESCENDANT(0),
    
    /**
     * Defines the total number of columns
     *    in a table, grid, or treegrid. Value type: integer
     */
    COL_COUNT(1),
    
    /**
     * Defines an element's column index or
     *    position with respect to the total number of columns within a table,
     *    grid, or treegrid. Value type: integer
     */
    COL_INDEX(2),
    
    /**
     * Defines a human readable text
     *   alternative of {@link AccessibleRelation#COL_INDEX}. Value type: string
     */
    COL_INDEX_TEXT(3),
    
    /**
     * Defines the number of columns spanned
     *   by a cell or gridcell within a table, grid, or treegrid. Value type: integer
     */
    COL_SPAN(4),
    
    /**
     * Identifies the element (or elements) whose
     *    contents or presence are controlled by the current element. Value type: reference
     */
    CONTROLS(5),
    
    /**
     * Identifies the element (or elements)
     *    that describes the object. Value type: reference
     */
    DESCRIBED_BY(6),
    
    /**
     * Identifies the element (or elements) that
     *    provide additional information related to the object. Value type: reference
     */
    DETAILS(7),
    
    /**
     * Identifies the element that provides
     *    an error message for an object. Value type: reference
     */
    ERROR_MESSAGE(8),
    
    /**
     * Identifies the next element (or elements)
     *    in an alternate reading order of content which, at the user's discretion,
     *    allows assistive technology to override the general default of reading in
     *    document source order. Value type: reference
     */
    FLOW_TO(9),
    
    /**
     * Identifies the element (or elements)
     *    that labels the current element. Value type: reference
     */
    LABELLED_BY(10),
    
    /**
     * Identifies an element (or elements) in order
     *    to define a visual, functional, or contextual parent/child relationship
     *    between elements where the widget hierarchy cannot be used to represent
     *    the relationship. Value type: reference
     */
    OWNS(11),
    
    /**
     * Defines an element's number or position
     *    in the current set of listitems or treeitems. Value type: integer
     */
    POS_IN_SET(12),
    
    /**
     * Defines the total number of rows in a table,
     *    grid, or treegrid. Value type: integer
     */
    ROW_COUNT(13),
    
    /**
     * Defines an element's row index or position
     *    with respect to the total number of rows within a table, grid, or treegrid.
     *    Value type: integer
     */
    ROW_INDEX(14),
    
    /**
     * Defines a human readable text
     *    alternative of aria-rowindex. Value type: string
     */
    ROW_INDEX_TEXT(15),
    
    /**
     * Defines the number of rows spanned by a
     *    cell or gridcell within a table, grid, or treegrid. Value type: integer
     */
    ROW_SPAN(16),
    
    /**
     * Defines the number of items in the current
     *    set of listitems or treeitems. Value type: integer
     */
    SET_SIZE(17);
    
    private static final java.lang.String C_TYPE_NAME = "GtkAccessibleRelation";
    
    private final int value;
    
    /**
     * Create a new AccessibleRelation for the provided value
     * @param numeric value the enum value
     */
    AccessibleRelation(int value) {
        this.value = value;
    }
    
    /**
     * Get the numeric value of this enum
     * @return the enum value
     */
    @Override
    public int getValue() {
        return value;
    }
    
    /**
     * Create a new AccessibleRelation for the provided value
     * @param value the enum value
     * @return the enum for the provided value
     */
    public static AccessibleRelation of(int value) {
        return switch (value) {
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
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static void initValue(org.gtk.gtk.AccessibleRelation relation, org.gtk.gobject.Value value) {
        try {
            DowncallHandles.gtk_accessible_relation_init_value.invokeExact(
                    relation.getValue(),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_accessible_relation_init_value = Interop.downcallHandle(
                "gtk_accessible_relation_init_value",
                FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
    }
}
