package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The possible accessible states of a {@code Accessible}.
 */
public class AccessibleState extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GtkAccessibleState";
    
    /**
     * A “busy” state. This state has boolean values
     */
    public static final AccessibleState BUSY = new AccessibleState(0);
    
    /**
     * A “checked” state; indicates the current
     *   state of a {@link CheckButton}
     */
    public static final AccessibleState CHECKED = new AccessibleState(1);
    
    /**
     * A “disabled” state; corresponds to the
     *   {@code Widget:sensitive} property. It indicates a UI element
     *   that is perceivable, but not editable or operable. Value type: boolean
     */
    public static final AccessibleState DISABLED = new AccessibleState(2);
    
    /**
     * An “expanded” state; corresponds to the
     *   {@code Expander:expanded} property. Value type: boolean
     *   or undefined
     */
    public static final AccessibleState EXPANDED = new AccessibleState(3);
    
    /**
     * A “hidden” state; corresponds to the
     *   {@code Widget:visible} property. You can use this state
     *   explicitly on UI elements that should not be exposed to an assistive
     *   technology. Value type: boolean
     *   See also: {@link AccessibleState#DISABLED}
     */
    public static final AccessibleState HIDDEN = new AccessibleState(4);
    
    /**
     * An “invalid” state; set when a widget
     *   is showing an error. Value type: {@code AccessibleInvalidState}
     */
    public static final AccessibleState INVALID = new AccessibleState(5);
    
    /**
     * A “pressed” state; indicates the current
     *   state of a {@link ToggleButton}
     *   enumeration
     */
    public static final AccessibleState PRESSED = new AccessibleState(6);
    
    /**
     * A “selected” state; set when a widget
     *   is selected. Value type: boolean or undefined
     */
    public static final AccessibleState SELECTED = new AccessibleState(7);
    
    public AccessibleState(int value) {
        super(value);
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
