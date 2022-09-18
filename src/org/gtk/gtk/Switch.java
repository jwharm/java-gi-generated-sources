package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkSwitch</code> is a &<code>#34</code> light switch&<code>#34</code>  that has two states: on or off.
 * <p>
 * !{@link [An example GtkSwitch]}(switch.png)
 * <p>
 * The user can control which state should be active by clicking the
 * empty area, or by dragging the handle.
 * <p><code>GtkSwitch</code> can also handle situations where the underlying state
 * changes with a delay. See {@link [signal@GtkSwitch::state-set] (ref=signal)} for details.
 * <p>
 * <h1>CSS nodes</h1>
 * <p><pre>
 * switch
 * &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  label
 * &<code>#9500</code> &<code>#9472</code> &<code>#9472</code>  label
 * &<code>#9584</code> &<code>#9472</code> &<code>#9472</code>  slider
 * </pre>
 * <p><code>GtkSwitch</code> has four css nodes, the main node with the name switch and
 * subnodes for the slider and the on and off labels. Neither of them is
 * using any style classes.
 * <p>
 * <h1>Accessibility</h1>
 * <p><code>GtkSwitch</code> uses the {@link org.gtk.gtk.AccessibleRole<code>#SWITCH</code>  role.
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
     * Creates a new <code>GtkSwitch</code> widget.
     */
    public Switch() {
        super(constructNew());
    }
    
    /**
     * Gets whether the <code>GtkSwitch</code> is in its &<code>#8220</code> on&<code>#8221</code>  or &<code>#8220</code> off&<code>#8221</code>  state.
     */
    public boolean getActive() {
        var RESULT = gtk_h.gtk_switch_get_active(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the underlying state of the <code>GtkSwitch</code>.
     */
    public boolean getState() {
        var RESULT = gtk_h.gtk_switch_get_state(handle());
        return (RESULT != 0);
    }
    
    /**
     * Changes the state of @self to the desired one.
     */
    public void setActive(boolean isActive) {
        gtk_h.gtk_switch_set_active(handle(), isActive ? 1 : 0);
    }
    
    /**
     * Sets the underlying state of the <code>GtkSwitch</code>.
     * 
     * Normally, this is the same as {@link [property@Gtk.Switch:active] (ref=property)}, unless
     * the switch is set up for delayed state changes. This function is
     * typically called from a {@link [signal@Gtk.Switch::state-set] (ref=signal)} signal handler.
     * 
     * See {@link [signal@Gtk.Switch::state-set] (ref=signal)} for details.
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
     * 
     * Applications should never connect to this signal,
     * but use the {@link [property@Gtk.Switch:active] (ref=property)} property.
     */
    public SignalHandle onActivate(ActivateHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSwitchActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("activate").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface StateSetHandler {
        boolean signalReceived(Switch source, boolean state);
    }
    
    /**
     * Emitted to change the underlying state.
     * 
     * The ::state-set signal is emitted when the user changes the switch
     * position. The default handler keeps the state in sync with the
     * {@link [property@Gtk.Switch:active] (ref=property)} property.
     * 
     * To implement delayed state change, applications can connect to this
     * signal, initiate the change of the underlying state, and call
     * {@link org.gtk.gtk.Switch<code>#setState</code>  when the underlying state change is
     * complete. The signal handler should return <code>true</code> to prevent the
     * default handler from running.
     * 
     * Visually, the underlying state is represented by the trough color of
     * the switch, while the {@link [property@Gtk.Switch:active] (ref=property)} property is
     * represented by the position of the switch.
     */
    public SignalHandle onStateSet(StateSetHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSwitchStateSet", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("state-set").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
