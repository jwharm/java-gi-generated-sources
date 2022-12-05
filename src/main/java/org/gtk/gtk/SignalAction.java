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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a SignalAction proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SignalAction(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to SignalAction if its GType is a (or inherits from) "GtkSignalAction".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code SignalAction} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkSignalAction", a ClassCastException will be thrown.
     */
    public static SignalAction castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), SignalAction.getType())) {
            return new SignalAction(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkSignalAction");
        }
    }
    
    private static Addressable constructNew(@NotNull java.lang.String signalName) {
        java.util.Objects.requireNonNull(signalName, "Parameter 'signalName' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_signal_action_new.invokeExact(
                    Interop.allocateNativeString(signalName));
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
        super(constructNew(signalName), Ownership.FULL);
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_signal_action_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.ShortcutAction.Build {
        
         /**
         * A {@link SignalAction.Build} object constructs a {@link SignalAction} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link SignalAction} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SignalAction} using {@link SignalAction#castFrom}.
         * @return A new instance of {@code SignalAction} with the properties 
         *         that were set in the Build object.
         */
        public SignalAction construct() {
            return SignalAction.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    SignalAction.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The name of the signal to emit.
         * @param signalName The value for the {@code signal-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSignalName(java.lang.String signalName) {
            names.add("signal-name");
            values.add(org.gtk.gobject.Value.create(signalName));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_signal_action_new = Interop.downcallHandle(
            "gtk_signal_action_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_signal_action_get_signal_name = Interop.downcallHandle(
            "gtk_signal_action_get_signal_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_signal_action_get_type = Interop.downcallHandle(
            "gtk_signal_action_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
