package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
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

    public Switch(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Switch */
    public static Switch castFrom(org.gtk.gobject.Object gobject) {
        return new Switch(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_switch_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkSwitch} widget.
     */
    public Switch() {
        super(constructNew());
    }
    
    /**
     * Gets whether the {@code GtkSwitch} is in its “on” or “off” state.
     */
    public boolean getActive() {
        var RESULT = gtk_h.gtk_switch_get_active(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the underlying state of the {@code GtkSwitch}.
     */
    public boolean getState() {
        var RESULT = gtk_h.gtk_switch_get_state(handle());
        return (RESULT != 0);
    }
    
    /**
     * Changes the state of {@code self} to the desired one.
     */
    public void setActive(boolean isActive) {
        gtk_h.gtk_switch_set_active(handle(), isActive ? 1 : 0);
    }
    
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
        gtk_h.gtk_switch_set_state(handle(), state ? 1 : 0);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("activate").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Switch.class, "__signalSwitchActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalSwitchActivate(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Switch.ActivateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new Switch(References.get(source)));
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("state-set").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Switch.class, "__signalSwitchStateSet",
                        MethodType.methodType(boolean.class, MemoryAddress.class, boolean.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static boolean __signalSwitchStateSet(MemoryAddress source, boolean state, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (Switch.StateSetHandler) Interop.signalRegistry.get(hash);
        return handler.signalReceived(new Switch(References.get(source)), state);
    }
    
}
