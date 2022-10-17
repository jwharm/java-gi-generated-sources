package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GtkShortcut}Action that emits a signal.
 * <p>
 * Signals that are used in this way are referred to as keybinding signals,
 * and they are expected to be defined with the {@link org.gtk.gobject.SignalFlags#ACTION} flag.
 */
public class SignalAction extends ShortcutAction {

    public SignalAction(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to SignalAction */
    public static SignalAction castFrom(org.gtk.gobject.Object gobject) {
        return new SignalAction(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_signal_action_new = Interop.downcallHandle(
        "gtk_signal_action_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull java.lang.String signalName) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_signal_action_new.invokeExact(Interop.allocateNativeString(signalName)), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates an action that when activated, emits the given action signal
     * on the provided widget.
     * <p>
     * It will also unpack the args into arguments passed to the signal.
     */
    public SignalAction(@NotNull java.lang.String signalName) {
        super(constructNew(signalName));
    }
    
    private static final MethodHandle gtk_signal_action_get_signal_name = Interop.downcallHandle(
        "gtk_signal_action_get_signal_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the name of the signal that will be emitted.
     */
    public @NotNull java.lang.String getSignalName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_signal_action_get_signal_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
}
