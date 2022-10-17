package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkShortcutAction} that does nothing.
 */
public class NothingAction extends ShortcutAction {

    public NothingAction(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to NothingAction */
    public static NothingAction castFrom(org.gtk.gobject.Object gobject) {
        return new NothingAction(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_nothing_action_get = Interop.downcallHandle(
        "gtk_nothing_action_get",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the nothing action.
     * <p>
     * This is an action that does nothing and where
     * activating it always fails.
     */
    public static @NotNull NothingAction get() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_nothing_action_get.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new NothingAction(Refcounted.get(RESULT, false));
    }
    
}
