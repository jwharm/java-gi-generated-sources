package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>CSS nodes</strong><br/>
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
 * <strong>Accessibility</strong><br/>
 * {@code GtkSwitch} uses the {@link AccessibleRole#SWITCH} role.
 */
public class Switch extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Actionable, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkSwitch";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public Switch(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to Switch if its GType is a (or inherits from) "GtkSwitch".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "Switch" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkSwitch", a ClassCastException will be thrown.
     */
    public static Switch castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkSwitch"))) {
            return new Switch(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkSwitch");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_switch_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @return {@code true} if the {@code GtkSwitch} is active, and {@code false} otherwise
     */
    public boolean getActive() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_switch_get_active.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the underlying state of the {@code GtkSwitch}.
     * @return the underlying state
     */
    public boolean getState() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_switch_get_state.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Changes the state of {@code self} to the desired one.
     * @param isActive {@code true} if {@code self} should be active, and {@code false} otherwise
     */
    public void setActive(boolean isActive) {
        try {
            DowncallHandles.gtk_switch_set_active.invokeExact(
                    handle(),
                    isActive ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the underlying state of the {@code GtkSwitch}.
     * <p>
     * Normally, this is the same as {@code Gtk.Switch:active}, unless
     * the switch is set up for delayed state changes. This function is
     * typically called from a {@code Gtk.Switch::state-set} signal handler.
     * <p>
     * See {@code Gtk.Switch::state-set} for details.
     * @param state the new state
     */
    public void setState(boolean state) {
        try {
            DowncallHandles.gtk_switch_set_state.invokeExact(
                    handle(),
                    state ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Activate {
        void signalReceived(Switch source);
    }
    
    /**
     * Emitted to animate the switch.
     * <p>
     * Applications should never connect to this signal,
     * but use the {@code Gtk.Switch:active} property.
     */
    public Signal<Switch.Activate> onActivate(Switch.Activate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("activate"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Switch.Callbacks.class, "signalSwitchActivate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Switch.Activate>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface StateSet {
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
    public Signal<Switch.StateSet> onStateSet(Switch.StateSet handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("state-set"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Switch.Callbacks.class, "signalSwitchStateSet",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<Switch.StateSet>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_switch_new = Interop.downcallHandle(
            "gtk_switch_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_switch_get_active = Interop.downcallHandle(
            "gtk_switch_get_active",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_switch_get_state = Interop.downcallHandle(
            "gtk_switch_get_state",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_switch_set_active = Interop.downcallHandle(
            "gtk_switch_set_active",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_switch_set_state = Interop.downcallHandle(
            "gtk_switch_set_state",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
    
    private static class Callbacks {
        
        public static void signalSwitchActivate(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Switch.Activate) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new Switch(Refcounted.get(source)));
        }
        
        public static boolean signalSwitchStateSet(MemoryAddress source, int state, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (Switch.StateSet) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new Switch(Refcounted.get(source)), state != 0);
        }
    }
}
