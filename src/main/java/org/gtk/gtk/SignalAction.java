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
    protected SignalAction(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SignalAction> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SignalAction(input, ownership);
    
    private static MemoryAddress constructNew(java.lang.String signalName) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_signal_action_new.invokeExact(
                    Marshal.stringToAddress.marshal(signalName, null));
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
    public SignalAction(java.lang.String signalName) {
        super(constructNew(signalName), Ownership.FULL);
    }
    
    /**
     * Returns the name of the signal that will be emitted.
     * @return the name of the signal to emit
     */
    public java.lang.String getSignalName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_signal_action_get_signal_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_signal_action_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link SignalAction.Builder} object constructs a {@link SignalAction} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link SignalAction.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.ShortcutAction.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link SignalAction} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link SignalAction}.
         * @return A new instance of {@code SignalAction} with the properties 
         *         that were set in the Builder object.
         */
        public SignalAction build() {
            return (SignalAction) org.gtk.gobject.GObject.newWithProperties(
                SignalAction.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The name of the signal to emit.
         * @param signalName The value for the {@code signal-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSignalName(java.lang.String signalName) {
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
