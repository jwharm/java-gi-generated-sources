package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkShortcutAction} that calls gtk_widget_activate().
 */
public class ActivateAction extends ShortcutAction {

    public ActivateAction(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ActivateAction */
    public static ActivateAction castFrom(org.gtk.gobject.Object gobject) {
        return new ActivateAction(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_activate_action_get = Interop.downcallHandle(
        "gtk_activate_action_get",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the activate action.
     * <p>
     * This is an action that calls gtk_widget_activate()
     * on the given widget upon activation.
     */
    public static @NotNull ActivateAction get() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_activate_action_get.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ActivateAction(Refcounted.get(RESULT, false));
    }
    
}
