package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The possible accessible properties of a {@code Accessible}.
 */
public enum AccessibleProperty implements io.github.jwharm.javagi.Enumeration {
    /**
     * Indicates whether inputting text
     *    could trigger display of one or more predictions of the user's intended
     *    value for a combobox, searchbox, or textbox and specifies how predictions
     *    would be presented if they were made. Value type: {@code AccessibleAutocomplete}
     */
    AUTOCOMPLETE(0),
    /**
     * Defines a string value that describes
     *    or annotates the current element. Value type: string
     */
    DESCRIPTION(1),
    /**
     * Indicates the availability and type of
     *    interactive popup element, such as menu or dialog, that can be triggered
     *    by an element.
     */
    HAS_POPUP(2),
    /**
     * Indicates keyboard shortcuts that an
     *    author has implemented to activate or give focus to an element. Value type:
     *    string
     */
    KEY_SHORTCUTS(3),
    /**
     * Defines a string value that labels the current
     *    element. Value type: string
     */
    LABEL(4),
    /**
     * Defines the hierarchical level of an element
     *    within a structure. Value type: integer
     */
    LEVEL(5),
    /**
     * Indicates whether an element is modal when
     *    displayed. Value type: boolean
     */
    MODAL(6),
    /**
     * Indicates whether a text box accepts
     *    multiple lines of input or only a single line. Value type: boolean
     */
    MULTI_LINE(7),
    /**
     * Indicates that the user may select
     *    more than one item from the current selectable descendants. Value type:
     *    boolean
     */
    MULTI_SELECTABLE(8),
    /**
     * Indicates whether the element's
     *    orientation is horizontal, vertical, or unknown/ambiguous. Value type:
     *    {@code Orientation}
     */
    ORIENTATION(9),
    /**
     * Defines a short hint (a word or short
     *    phrase) intended to aid the user with data entry when the control has no
     *    value. A hint could be a sample value or a brief description of the expected
     *    format. Value type: string
     */
    PLACEHOLDER(10),
    /**
     * Indicates that the element is not editable,
     *    but is otherwise operable. Value type: boolean
     */
    READ_ONLY(11),
    /**
     * Indicates that user input is required on
     *    the element before a form may be submitted. Value type: boolean
     */
    REQUIRED(12),
    /**
     * Defines a human-readable,
     *    author-localized description for the role of an element. Value type: string
     */
    ROLE_DESCRIPTION(13),
    /**
     * Indicates if items in a table or grid are
     *    sorted in ascending or descending order. Value type: {@code AccessibleSort}
     */
    SORT(14),
    /**
     * Defines the maximum allowed value for a
     *    range widget. Value type: double
     */
    VALUE_MAX(15),
    /**
     * Defines the minimum allowed value for a
     *    range widget. Value type: double
     */
    VALUE_MIN(16),
    /**
     * Defines the current value for a range widget.
     *    Value type: double
     */
    VALUE_NOW(17),
    /**
     * Defines the human readable text alternative
     *    of aria-valuenow for a range widget. Value type: string
     */
    VALUE_TEXT(18);
    
    private static final java.lang.String C_TYPE_NAME = "GtkAccessibleProperty";
    
    private final int value;
    AccessibleProperty(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static AccessibleProperty of(int value) {
        return switch (value) {
            case 0 -> AUTOCOMPLETE;
            case 1 -> DESCRIPTION;
            case 2 -> HAS_POPUP;
            case 3 -> KEY_SHORTCUTS;
            case 4 -> LABEL;
            case 5 -> LEVEL;
            case 6 -> MODAL;
            case 7 -> MULTI_LINE;
            case 8 -> MULTI_SELECTABLE;
            case 9 -> ORIENTATION;
            case 10 -> PLACEHOLDER;
            case 11 -> READ_ONLY;
            case 12 -> REQUIRED;
            case 13 -> ROLE_DESCRIPTION;
            case 14 -> SORT;
            case 15 -> VALUE_MAX;
            case 16 -> VALUE_MIN;
            case 17 -> VALUE_NOW;
            case 18 -> VALUE_TEXT;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static void initValue(org.gtk.gtk.AccessibleProperty property, org.gtk.gobject.Value value) {
        try {
            DowncallHandles.gtk_accessible_property_init_value.invokeExact(
                    property.getValue(),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_accessible_property_init_value = Interop.downcallHandle(
            "gtk_accessible_property_init_value",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
