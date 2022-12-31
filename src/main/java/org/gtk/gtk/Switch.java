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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Switch proxy instance for the provided memory address.
     * <p>
     * Because Switch is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Switch(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Switch> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Switch(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_switch_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkSwitch} widget.
     */
    public Switch() {
        super(constructNew(), Ownership.NONE);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Changes the state of {@code self} to the desired one.
     * @param isActive {@code true} if {@code self} should be active, and {@code false} otherwise
     */
    public void setActive(boolean isActive) {
        try {
            DowncallHandles.gtk_switch_set_active.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(isActive, null).intValue());
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
                    Marshal.booleanToInteger.marshal(state, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_switch_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Activate {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceSwitch) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Activate.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted to animate the switch.
     * <p>
     * Applications should never connect to this signal,
     * but use the {@code Gtk.Switch:active} property.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Switch.Activate> onActivate(Switch.Activate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("activate"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface StateSet {
        boolean run(boolean state);

        @ApiStatus.Internal default int upcall(MemoryAddress sourceSwitch, int state) {
            var RESULT = run(Marshal.integerToBoolean.marshal(state, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StateSet.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Switch.StateSet> onStateSet(Switch.StateSet handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("state-set"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Switch.Builder} object constructs a {@link Switch} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Switch.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Switch} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Switch}.
         * @return A new instance of {@code Switch} with the properties 
         *         that were set in the Builder object.
         */
        public Switch build() {
            return (Switch) org.gtk.gobject.GObject.newWithProperties(
                Switch.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether the {@code GtkSwitch} widget is in its on or off state.
         * @param active The value for the {@code active} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setActive(boolean active) {
            names.add("active");
            values.add(org.gtk.gobject.Value.create(active));
            return this;
        }
        
        /**
         * The backend state that is controlled by the switch.
         * <p>
         * See {@code GtkSwitch::state-set} for details.
         * @param state The value for the {@code state} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setState(boolean state) {
            names.add("state");
            values.add(org.gtk.gobject.Value.create(state));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_switch_new = Interop.downcallHandle(
            "gtk_switch_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_switch_get_active = Interop.downcallHandle(
            "gtk_switch_get_active",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_switch_get_state = Interop.downcallHandle(
            "gtk_switch_get_state",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_switch_set_active = Interop.downcallHandle(
            "gtk_switch_set_active",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_switch_set_state = Interop.downcallHandle(
            "gtk_switch_set_state",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_switch_get_type = Interop.downcallHandle(
            "gtk_switch_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
