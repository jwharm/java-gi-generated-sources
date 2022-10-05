package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkSwitch} is a "light switch" that has two states: on or off.
 * <p>
 * <img src="./doc-files/switch.png" alt="An example GtkSwitch">
 * <p>
 * The user can control which state should be active by clicking the
 * empty area, or by dragging the handle.
 * <p>
 * {@code GtkSwitch} can also handle situations where the underlying state
 * changes with a delay. See {@code GtkSwitch::state-set} for details.
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * <pre>{@code 
 * switch
 * ├── label
 * ├── label
 * ╰── slider
 * }</pre>
 * <p>
 * {@code GtkSwitch} has four css nodes, the main node with the name switch and
 * subnodes for the slider and the on and off labels. Neither of them is
 * using any style classes.
 * <p>
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkSwitch} uses the {@link AccessibleRole#SWITCH} role.
 */
public class Switch extends Widget implements Accessible, Actionable, Buildable, ConstraintTarget {

    public Switch(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Switch */
    public static Switch castFrom(org.gtk.gobject.Object gobject) {
        return new Switch(gobject.refcounted());
    }
    
    static final MethodHandle gtk_switch_new = Interop.downcallHandle(
        "gtk_switch_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_switch_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkSwitch} widget.
     */
    public Switch() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_switch_get_active = Interop.downcallHandle(
        "gtk_switch_get_active",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the {@code GtkSwitch} is in its “on” or “off” state.
     */
    public boolean getActive() {
        try {
            var RESULT = (int) gtk_switch_get_active.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_switch_get_state = Interop.downcallHandle(
        "gtk_switch_get_state",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the underlying state of the {@code GtkSwitch}.
     */
    public boolean getState() {
        try {
            var RESULT = (int) gtk_switch_get_state.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_switch_set_active = Interop.downcallHandle(
        "gtk_switch_set_active",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Changes the state of {@code self} to the desired one.
     */
    public void setActive(boolean isActive) {
        try {
            gtk_switch_set_active.invokeExact(handle(), isActive ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_switch_set_state = Interop.downcallHandle(
        "gtk_switch_set_state",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the underlying state of the {@code GtkSwitch}.
     * <p>
     * Normally, this is the same as {@code Gtk.Switch:active}, unless
     * the switch is set up for delayed state changes. This function is
     * typically called from a {@code Gtk.Switch::state-set} signal handler.
     * <p>
     * See {@code Gtk.Switch::state-set} for details.
     */
    public void setState(boolean state) {
        try {
            gtk_switch_set_state.invokeExact(handle(), state ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(Switch source);
    }
    
    /**
     * Emitted to animate the switch.
     * <p>
     * Applications should never connect to this signal,
     * but use the {@code Gtk.Switch:active} property.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Switch.Callbacks.class, "signalSwitchActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface StateSetHandler {
        boolean signalReceived(Switch source, boolean state);
    }
    
    /**
     * Emitted to change the underlying state.
     * <p>
     * The ::state-set signal is emitted when the user changes the switch
     * position. The default handler keeps the state in sync with the
     * {@code Gtk.Switch:active} property.
     * <p>
     * To implement delayed state change, applications can connect to this
     * signal, initiate the change of the underlying state, and call
     * {@link Switch#setState} when the underlying state change is
     * complete. The signal handler should return {@code true} to prevent the
     * default handler from running.
     * <p>
     * Visually, the underlying state is represented by the trough color of
     * the switch, while the {@code Gtk.Switch:active} property is
     * represented by the position of the switch.
     */
    public SignalHandle onStateSet(StateSetHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("state-set").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Switch.Callbacks.class, "signalSwitchStateSet",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalSwitchActivate(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Switch.ActivateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Switch(Refcounted.get(source)));
        }
        
        public static boolean signalSwitchStateSet(MemoryAddress source, int state, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Switch.StateSetHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new Switch(Refcounted.get(source)), state != 0);
        }
        
    }
}
