package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The possible accessible properties of a {@code Accessible}.
 */
public class AccessibleProperty extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Indicates whether inputting text
     *    could trigger display of one or more predictions of the user's intended
     *    value for a combobox, searchbox, or textbox and specifies how predictions
     *    would be presented if they were made. Value type: {@code AccessibleAutocomplete}
     */
    public static final AccessibleProperty AUTOCOMPLETE = new AccessibleProperty(0);
    
    /**
     * Defines a string value that describes
     *    or annotates the current element. Value type: string
     */
    public static final AccessibleProperty DESCRIPTION = new AccessibleProperty(1);
    
    /**
     * Indicates the availability and type of
     *    interactive popup element, such as menu or dialog, that can be triggered
     *    by an element.
     */
    public static final AccessibleProperty HAS_POPUP = new AccessibleProperty(2);
    
    /**
     * Indicates keyboard shortcuts that an
     *    author has implemented to activate or give focus to an element. Value type:
     *    string
     */
    public static final AccessibleProperty KEY_SHORTCUTS = new AccessibleProperty(3);
    
    /**
     * Defines a string value that labels the current
     *    element. Value type: string
     */
    public static final AccessibleProperty LABEL = new AccessibleProperty(4);
    
    /**
     * Defines the hierarchical level of an element
     *    within a structure. Value type: integer
     */
    public static final AccessibleProperty LEVEL = new AccessibleProperty(5);
    
    /**
     * Indicates whether an element is modal when
     *    displayed. Value type: boolean
     */
    public static final AccessibleProperty MODAL = new AccessibleProperty(6);
    
    /**
     * Indicates whether a text box accepts
     *    multiple lines of input or only a single line. Value type: boolean
     */
    public static final AccessibleProperty MULTI_LINE = new AccessibleProperty(7);
    
    /**
     * Indicates that the user may select
     *    more than one item from the current selectable descendants. Value type:
     *    boolean
     */
    public static final AccessibleProperty MULTI_SELECTABLE = new AccessibleProperty(8);
    
    /**
     * Indicates whether the element's
     *    orientation is horizontal, vertical, or unknown/ambiguous. Value type:
     *    {@code Orientation}
     */
    public static final AccessibleProperty ORIENTATION = new AccessibleProperty(9);
    
    /**
     * Defines a short hint (a word or short
     *    phrase) intended to aid the user with data entry when the control has no
     *    value. A hint could be a sample value or a brief description of the expected
     *    format. Value type: string
     */
    public static final AccessibleProperty PLACEHOLDER = new AccessibleProperty(10);
    
    /**
     * Indicates that the element is not editable,
     *    but is otherwise operable. Value type: boolean
     */
    public static final AccessibleProperty READ_ONLY = new AccessibleProperty(11);
    
    /**
     * Indicates that user input is required on
     *    the element before a form may be submitted. Value type: boolean
     */
    public static final AccessibleProperty REQUIRED = new AccessibleProperty(12);
    
    /**
     * Defines a human-readable,
     *    author-localized description for the role of an element. Value type: string
     */
    public static final AccessibleProperty ROLE_DESCRIPTION = new AccessibleProperty(13);
    
    /**
     * Indicates if items in a table or grid are
     *    sorted in ascending or descending order. Value type: {@code AccessibleSort}
     */
    public static final AccessibleProperty SORT = new AccessibleProperty(14);
    
    /**
     * Defines the maximum allowed value for a
     *    range widget. Value type: double
     */
    public static final AccessibleProperty VALUE_MAX = new AccessibleProperty(15);
    
    /**
     * Defines the minimum allowed value for a
     *    range widget. Value type: double
     */
    public static final AccessibleProperty VALUE_MIN = new AccessibleProperty(16);
    
    /**
     * Defines the current value for a range widget.
     *    Value type: double
     */
    public static final AccessibleProperty VALUE_NOW = new AccessibleProperty(17);
    
    /**
     * Defines the human readable text alternative
     *    of aria-valuenow for a range widget. Value type: string
     */
    public static final AccessibleProperty VALUE_TEXT = new AccessibleProperty(18);
    
    public AccessibleProperty(int value) {
        super(value);
    }
    
    public static void initValue(@NotNull org.gtk.gtk.AccessibleProperty property, @NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(property, "Parameter 'property' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gtk_accessible_property_init_value.invokeExact(property.getValue(), value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_accessible_property_init_value = Interop.downcallHandle(
            "gtk_accessible_property_init_value",
            FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
    }
}
