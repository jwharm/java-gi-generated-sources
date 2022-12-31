package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkEventControllerKey} is an event controller that provides access
 * to key events.
 */
public class EventControllerKey extends org.gtk.gtk.EventController {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkEventControllerKey";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a EventControllerKey proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected EventControllerKey(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, EventControllerKey> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new EventControllerKey(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_event_controller_key_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new event controller that will handle key events.
     */
    public EventControllerKey() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Forwards the current event of this {@code controller} to a {@code widget}.
     * <p>
     * This function can only be used in handlers for the
     * {@code Gtk.EventControllerKey::key-pressed},
     * {@code Gtk.EventControllerKey::key-released}
     * or {@code Gtk.EventControllerKey::modifiers} signals.
     * @param widget a {@code GtkWidget}
     * @return whether the {@code widget} handled the event
     */
    public boolean forward(org.gtk.gtk.Widget widget) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_event_controller_key_forward.invokeExact(
                    handle(),
                    widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the key group of the current event of this {@code controller}.
     * <p>
     * See {@link org.gtk.gdk.KeyEvent#getLayout}.
     * @return the key group
     */
    public int getGroup() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_event_controller_key_get_group.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the input method context of the key {@code controller}.
     * @return the {@code GtkIMContext}
     */
    public @Nullable org.gtk.gtk.IMContext getImContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_event_controller_key_get_im_context.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.IMContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.IMContext.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Sets the input method context of the key {@code controller}.
     * @param imContext a {@code GtkIMContext}
     */
    public void setImContext(@Nullable org.gtk.gtk.IMContext imContext) {
        try {
            DowncallHandles.gtk_event_controller_key_set_im_context.invokeExact(
                    handle(),
                    (Addressable) (imContext == null ? MemoryAddress.NULL : imContext.handle()));
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
            RESULT = (long) DowncallHandles.gtk_event_controller_key_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface ImUpdate {
        void run();

        @ApiStatus.Internal default void upcall(MemoryAddress sourceEventControllerKey) {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ImUpdate.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted whenever the input method context filters away
     * a keypress and prevents the {@code controller} receiving it.
     * <p>
     * See {@link EventControllerKey#setImContext} and
     * {@link IMContext#filterKeypress}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EventControllerKey.ImUpdate> onImUpdate(EventControllerKey.ImUpdate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("im-update"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface KeyPressed {
        boolean run(int keyval, int keycode, org.gtk.gdk.ModifierType state);

        @ApiStatus.Internal default int upcall(MemoryAddress sourceEventControllerKey, int keyval, int keycode, int state) {
            var RESULT = run(keyval, keycode, new org.gtk.gdk.ModifierType(state));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(KeyPressed.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted whenever a key is pressed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EventControllerKey.KeyPressed> onKeyPressed(EventControllerKey.KeyPressed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("key-pressed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface KeyReleased {
        void run(int keyval, int keycode, org.gtk.gdk.ModifierType state);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceEventControllerKey, int keyval, int keycode, int state) {
            run(keyval, keycode, new org.gtk.gdk.ModifierType(state));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(KeyReleased.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted whenever a key is released.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EventControllerKey.KeyReleased> onKeyReleased(EventControllerKey.KeyReleased handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("key-released"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Modifiers {
        boolean run(org.gtk.gdk.ModifierType keyval);

        @ApiStatus.Internal default int upcall(MemoryAddress sourceEventControllerKey, int keyval) {
            var RESULT = run(new org.gtk.gdk.ModifierType(keyval));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Modifiers.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted whenever the state of modifier keys and pointer buttons change.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EventControllerKey.Modifiers> onModifiers(EventControllerKey.Modifiers handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("modifiers"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link EventControllerKey.Builder} object constructs a {@link EventControllerKey} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link EventControllerKey.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.EventController.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link EventControllerKey} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link EventControllerKey}.
         * @return A new instance of {@code EventControllerKey} with the properties 
         *         that were set in the Builder object.
         */
        public EventControllerKey build() {
            return (EventControllerKey) org.gtk.gobject.GObject.newWithProperties(
                EventControllerKey.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_event_controller_key_new = Interop.downcallHandle(
            "gtk_event_controller_key_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_event_controller_key_forward = Interop.downcallHandle(
            "gtk_event_controller_key_forward",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_event_controller_key_get_group = Interop.downcallHandle(
            "gtk_event_controller_key_get_group",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_event_controller_key_get_im_context = Interop.downcallHandle(
            "gtk_event_controller_key_get_im_context",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_event_controller_key_set_im_context = Interop.downcallHandle(
            "gtk_event_controller_key_set_im_context",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_event_controller_key_get_type = Interop.downcallHandle(
            "gtk_event_controller_key_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
