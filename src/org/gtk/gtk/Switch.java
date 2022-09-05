package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkSwitch` is a "light switch" that has two states: on or off.
 * 
 * ![An example GtkSwitch](switch.png)
 * 
 * The user can control which state should be active by clicking the
 * empty area, or by dragging the handle.
 * 
 * `GtkSwitch` can also handle situations where the underlying state
 * changes with a delay. See [signal@GtkSwitch::state-set] for details.
 * 
 * # CSS nodes
 * 
 * ```
 * switch
 * ├── label
 * ├── label
 * ╰── slider
 * ```
 * 
 * `GtkSwitch` has four css nodes, the main node with the name switch and
 * subnodes for the slider and the on and off labels. Neither of them is
 * using any style classes.
 * 
 * # Accessibility
 * 
 * `GtkSwitch` uses the %GTK_ACCESSIBLE_ROLE_SWITCH role.
 */
public class Switch extends Widget implements Accessible, Actionable, Buildable, ConstraintTarget {

    public Switch(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to Switch */
    public static Switch castFrom(org.gtk.gobject.Object gobject) {
        return new Switch(gobject.getProxy());
    }
    
    /**
     * Creates a new `GtkSwitch` widget.
     */
    public Switch() {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_switch_new(), false));
    }
    
    /**
     * Gets whether the `GtkSwitch` is in its “on” or “off” state.
     */
    public boolean getActive() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_switch_get_active(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the underlying state of the `GtkSwitch`.
     */
    public boolean getState() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_switch_get_state(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Changes the state of @self to the desired one.
     */
    public void setActive(boolean isActive) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_switch_set_active(HANDLE(), isActive ? 1 : 0);
    }
    
    /**
     * Sets the underlying state of the `GtkSwitch`.
     * 
     * Normally, this is the same as [property@Gtk.Switch:active], unless
     * the switch is set up for delayed state changes. This function is
     * typically called from a [signal@Gtk.Switch::state-set] signal handler.
     * 
     * See [signal@Gtk.Switch::state-set] for details.
     */
    public void setState(boolean state) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_switch_set_state(HANDLE(), state ? 1 : 0);
    }
    
    @FunctionalInterface
    public interface ActivateHandler {
        void signalReceived(Switch source);
    }
    
    /**
     * Emitted to animate the switch.
     * 
     * Applications should never connect to this signal,
     * but use the [property@Gtk.Switch:active] property.
     */
    public void onActivate(ActivateHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSwitchActivate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("activate"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
     * [property@Gtk.Switch:active] property.
     * 
     * To implement delayed state change, applications can connect to this
     * signal, initiate the change of the underlying state, and call
     * [method@Gtk.Switch.set_state] when the underlying state change is
     * complete. The signal handler should return %TRUE to prevent the
     * default handler from running.
     * 
     * Visually, the underlying state is represented by the trough color of
     * the switch, while the [property@Gtk.Switch:active] property is
     * represented by the position of the switch.
     */
    public void onStateSet(StateSetHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalSwitchStateSet", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.getAllocator().allocateUtf8String("state-set"), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
