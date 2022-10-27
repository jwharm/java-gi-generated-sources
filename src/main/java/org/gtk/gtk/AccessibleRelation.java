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
public class AccessibleRelation extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Identifies the currently active
     *    element when focus is on a composite widget, combobox, textbox, group,
     *    or application. Value type: reference
     */
    public static final AccessibleRelation ACTIVE_DESCENDANT = new AccessibleRelation(0);
    
    /**
     * Defines the total number of columns
     *    in a table, grid, or treegrid. Value type: integer
     */
    public static final AccessibleRelation COL_COUNT = new AccessibleRelation(1);
    
    /**
     * Defines an element's column index or
     *    position with respect to the total number of columns within a table,
     *    grid, or treegrid. Value type: integer
     */
    public static final AccessibleRelation COL_INDEX = new AccessibleRelation(2);
    
    /**
     * Defines a human readable text
     *   alternative of {@link AccessibleRelation#COL_INDEX}. Value type: string
     */
    public static final AccessibleRelation COL_INDEX_TEXT = new AccessibleRelation(3);
    
    /**
     * Defines the number of columns spanned
     *   by a cell or gridcell within a table, grid, or treegrid. Value type: integer
     */
    public static final AccessibleRelation COL_SPAN = new AccessibleRelation(4);
    
    /**
     * Identifies the element (or elements) whose
     *    contents or presence are controlled by the current element. Value type: reference
     */
    public static final AccessibleRelation CONTROLS = new AccessibleRelation(5);
    
    /**
     * Identifies the element (or elements)
     *    that describes the object. Value type: reference
     */
    public static final AccessibleRelation DESCRIBED_BY = new AccessibleRelation(6);
    
    /**
     * Identifies the element (or elements) that
     *    provide additional information related to the object. Value type: reference
     */
    public static final AccessibleRelation DETAILS = new AccessibleRelation(7);
    
    /**
     * Identifies the element that provides
     *    an error message for an object. Value type: reference
     */
    public static final AccessibleRelation ERROR_MESSAGE = new AccessibleRelation(8);
    
    /**
     * Identifies the next element (or elements)
     *    in an alternate reading order of content which, at the user's discretion,
     *    allows assistive technology to override the general default of reading in
     *    document source order. Value type: reference
     */
    public static final AccessibleRelation FLOW_TO = new AccessibleRelation(9);
    
    /**
     * Identifies the element (or elements)
     *    that labels the current element. Value type: reference
     */
    public static final AccessibleRelation LABELLED_BY = new AccessibleRelation(10);
    
    /**
     * Identifies an element (or elements) in order
     *    to define a visual, functional, or contextual parent/child relationship
     *    between elements where the widget hierarchy cannot be used to represent
     *    the relationship. Value type: reference
     */
    public static final AccessibleRelation OWNS = new AccessibleRelation(11);
    
    /**
     * Defines an element's number or position
     *    in the current set of listitems or treeitems. Value type: integer
     */
    public static final AccessibleRelation POS_IN_SET = new AccessibleRelation(12);
    
    /**
     * Defines the total number of rows in a table,
     *    grid, or treegrid. Value type: integer
     */
    public static final AccessibleRelation ROW_COUNT = new AccessibleRelation(13);
    
    /**
     * Defines an element's row index or position
     *    with respect to the total number of rows within a table, grid, or treegrid.
     *    Value type: integer
     */
    public static final AccessibleRelation ROW_INDEX = new AccessibleRelation(14);
    
    /**
     * Defines a human readable text
     *    alternative of aria-rowindex. Value type: string
     */
    public static final AccessibleRelation ROW_INDEX_TEXT = new AccessibleRelation(15);
    
    /**
     * Defines the number of rows spanned by a
     *    cell or gridcell within a table, grid, or treegrid. Value type: integer
     */
    public static final AccessibleRelation ROW_SPAN = new AccessibleRelation(16);
    
    /**
     * Defines the number of items in the current
     *    set of listitems or treeitems. Value type: integer
     */
    public static final AccessibleRelation SET_SIZE = new AccessibleRelation(17);
    
    public AccessibleRelation(int value) {
        super(value);
    }
    
    public static void initValue(@NotNull org.gtk.gtk.AccessibleRelation relation, @NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(relation, "Parameter 'relation' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gtk_accessible_relation_init_value.invokeExact(relation.getValue(), value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_accessible_relation_init_value = Interop.downcallHandle(
            "gtk_accessible_relation_init_value",
            FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
    }
}
