package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkShortcutAction} that activates an action by name.
 */
public class NamedAction extends ShortcutAction {

    public NamedAction(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to NamedAction */
    public static NamedAction castFrom(org.gtk.gobject.Object gobject) {
        return new NamedAction(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_named_action_new = Interop.downcallHandle(
        "gtk_named_action_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull java.lang.String name) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_named_action_new.invokeExact(Interop.allocateNativeString(name)), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates an action that when activated, activates
     * the named action on the widget.
     * <p>
     * It also passes the given arguments to it.
     * <p>
     * See {@link Widget#insertActionGroup} for
     * how to add actions to widgets.
     */
    public NamedAction(@NotNull java.lang.String name) {
        super(constructNew(name));
    }
    
    private static final MethodHandle gtk_named_action_get_action_name = Interop.downcallHandle(
        "gtk_named_action_get_action_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the name of the action that will be activated.
     */
    public @NotNull java.lang.String getActionName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_named_action_get_action_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
}
