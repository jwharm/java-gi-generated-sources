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
public class SignalAction extends org.gtk.gtk.ShortcutAction {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkSignalAction";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public SignalAction(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to SignalAction if its GType is a (or inherits from) "GtkSignalAction".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "SignalAction" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkSignalAction", a ClassCastException will be thrown.
     */
    public static SignalAction castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkSignalAction"))) {
            return new SignalAction(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkSignalAction");
        }
    }
    
    private static Refcounted constructNew(@NotNull java.lang.String signalName) {
        java.util.Objects.requireNonNull(signalName, "Parameter 'signalName' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_signal_action_new.invokeExact(
                    Interop.allocateNativeString(signalName)), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates an action that when activated, emits the given action signal
     * on the provided widget.
     * <p>
     * It will also unpack the args into arguments passed to the signal.
     * @param signalName name of the signal to emit
     */
    public SignalAction(@NotNull java.lang.String signalName) {
        super(constructNew(signalName));
    }
    
    /**
     * Returns the name of the signal that will be emitted.
     * @return the name of the signal to emit
     */
    public @NotNull java.lang.String getSignalName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_signal_action_get_signal_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_signal_action_new = Interop.downcallHandle(
            "gtk_signal_action_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_signal_action_get_signal_name = Interop.downcallHandle(
            "gtk_signal_action_get_signal_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
