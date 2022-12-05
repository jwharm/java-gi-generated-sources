package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The possible accessible states of a {@code Accessible}.
 */
public enum AccessibleState implements io.github.jwharm.javagi.Enumeration {
    /**
     * A “busy” state. This state has boolean values
     */
    BUSY(0),
    /**
     * A “checked” state; indicates the current
     *   state of a {@link CheckButton}
     */
    CHECKED(1),
    /**
     * A “disabled” state; corresponds to the
     *   {@code Widget:sensitive} property. It indicates a UI element
     *   that is perceivable, but not editable or operable. Value type: boolean
     */
    DISABLED(2),
    /**
     * An “expanded” state; corresponds to the
     *   {@code Expander:expanded} property. Value type: boolean
     *   or undefined
     */
    EXPANDED(3),
    /**
     * A “hidden” state; corresponds to the
     *   {@code Widget:visible} property. You can use this state
     *   explicitly on UI elements that should not be exposed to an assistive
     *   technology. Value type: boolean
     *   See also: {@link AccessibleState#DISABLED}
     */
    HIDDEN(4),
    /**
     * An “invalid” state; set when a widget
     *   is showing an error. Value type: {@code AccessibleInvalidState}
     */
    INVALID(5),
    /**
     * A “pressed” state; indicates the current
     *   state of a {@link ToggleButton}
     *   enumeration
     */
    PRESSED(6),
    /**
     * A “selected” state; set when a widget
     *   is selected. Value type: boolean or undefined
     */
    SELECTED(7);
    
    private static final java.lang.String C_TYPE_NAME = "GtkAccessibleState";
    
    private final int value;
    AccessibleState(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static AccessibleState of(int value) {
        return switch (value) {
            case 0 -> BUSY;
            case 1 -> CHECKED;
            case 2 -> DISABLED;
            case 3 -> EXPANDED;
            case 4 -> HIDDEN;
            case 5 -> INVALID;
            case 6 -> PRESSED;
            case 7 -> SELECTED;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
    }
    
    public static void initValue(@NotNull org.gtk.gtk.AccessibleState state, @NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(state, "Parameter 'state' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gtk_accessible_state_init_value.invokeExact(
                    state.getValue(),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_accessible_state_init_value = Interop.downcallHandle(
            "gtk_accessible_state_init_value",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
    }
}
