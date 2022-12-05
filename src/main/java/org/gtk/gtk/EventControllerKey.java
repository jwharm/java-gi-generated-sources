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
    @ApiStatus.Internal
    public EventControllerKey(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to EventControllerKey if its GType is a (or inherits from) "GtkEventControllerKey".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code EventControllerKey} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkEventControllerKey", a ClassCastException will be thrown.
     */
    public static EventControllerKey castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), EventControllerKey.getType())) {
            return new EventControllerKey(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkEventControllerKey");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
    public boolean forward(@NotNull org.gtk.gtk.Widget widget) {
        java.util.Objects.requireNonNull(widget, "Parameter 'widget' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_event_controller_key_forward.invokeExact(
                    handle(),
                    widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
        return new org.gtk.gtk.IMContext(RESULT, Ownership.NONE);
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
    public static @NotNull org.gtk.glib.Type getType() {
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
        void signalReceived(EventControllerKey sourceEventControllerKey);
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
                handle(),
                Interop.allocateNativeString("im-update"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerKey.Callbacks.class, "signalEventControllerKeyImUpdate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<EventControllerKey.ImUpdate>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface KeyPressed {
        boolean signalReceived(EventControllerKey sourceEventControllerKey, int keyval, int keycode, @NotNull org.gtk.gdk.ModifierType state);
    }
    
    /**
     * Emitted whenever a key is pressed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EventControllerKey.KeyPressed> onKeyPressed(EventControllerKey.KeyPressed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("key-pressed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerKey.Callbacks.class, "signalEventControllerKeyKeyPressed",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<EventControllerKey.KeyPressed>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface KeyReleased {
        void signalReceived(EventControllerKey sourceEventControllerKey, int keyval, int keycode, @NotNull org.gtk.gdk.ModifierType state);
    }
    
    /**
     * Emitted whenever a key is released.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EventControllerKey.KeyReleased> onKeyReleased(EventControllerKey.KeyReleased handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("key-released"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerKey.Callbacks.class, "signalEventControllerKeyKeyReleased",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<EventControllerKey.KeyReleased>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Modifiers {
        boolean signalReceived(EventControllerKey sourceEventControllerKey, @NotNull org.gtk.gdk.ModifierType keyval);
    }
    
    /**
     * Emitted whenever the state of modifier keys and pointer buttons change.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<EventControllerKey.Modifiers> onModifiers(EventControllerKey.Modifiers handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("modifiers"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerKey.Callbacks.class, "signalEventControllerKeyModifiers",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(Interop.valueLayout.C_BOOLEAN, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<EventControllerKey.Modifiers>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.EventController.Build {
        
         /**
         * A {@link EventControllerKey.Build} object constructs a {@link EventControllerKey} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link EventControllerKey} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link EventControllerKey} using {@link EventControllerKey#castFrom}.
         * @return A new instance of {@code EventControllerKey} with the properties 
         *         that were set in the Build object.
         */
        public EventControllerKey construct() {
            return EventControllerKey.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    EventControllerKey.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
    
    private static class Callbacks {
        
        public static void signalEventControllerKeyImUpdate(MemoryAddress sourceEventControllerKey, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (EventControllerKey.ImUpdate) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new EventControllerKey(sourceEventControllerKey, Ownership.NONE));
        }
        
        public static boolean signalEventControllerKeyKeyPressed(MemoryAddress sourceEventControllerKey, int keyval, int keycode, int state, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (EventControllerKey.KeyPressed) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new EventControllerKey(sourceEventControllerKey, Ownership.NONE), keyval, keycode, new org.gtk.gdk.ModifierType(state));
        }
        
        public static void signalEventControllerKeyKeyReleased(MemoryAddress sourceEventControllerKey, int keyval, int keycode, int state, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (EventControllerKey.KeyReleased) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new EventControllerKey(sourceEventControllerKey, Ownership.NONE), keyval, keycode, new org.gtk.gdk.ModifierType(state));
        }
        
        public static boolean signalEventControllerKeyModifiers(MemoryAddress sourceEventControllerKey, int keyval, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (EventControllerKey.Modifiers) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new EventControllerKey(sourceEventControllerKey, Ownership.NONE), new org.gtk.gdk.ModifierType(keyval));
        }
    }
}
