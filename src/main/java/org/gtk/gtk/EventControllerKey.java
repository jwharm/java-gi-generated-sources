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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public EventControllerKey(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to EventControllerKey */
    public static EventControllerKey castFrom(org.gtk.gobject.Object gobject) {
        return new EventControllerKey(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_event_controller_key_new.invokeExact(), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new event controller that will handle key events.
     */
    public EventControllerKey() {
        super(constructNew());
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
            RESULT = (int) DowncallHandles.gtk_event_controller_key_forward.invokeExact(handle(), widget.handle());
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
            RESULT = (int) DowncallHandles.gtk_event_controller_key_get_group.invokeExact(handle());
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_event_controller_key_get_im_context.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.IMContext(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets the input method context of the key {@code controller}.
     * @param imContext a {@code GtkIMContext}
     */
    public void setImContext(@Nullable org.gtk.gtk.IMContext imContext) {
        java.util.Objects.requireNonNullElse(imContext, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_event_controller_key_set_im_context.invokeExact(handle(), imContext.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ImUpdate {
        void signalReceived(EventControllerKey source);
    }
    
    /**
     * Emitted whenever the input method context filters away
     * a keypress and prevents the {@code controller} receiving it.
     * <p>
     * See {@link EventControllerKey#setImContext} and
     * {@link IMContext#filterKeypress}.
     */
    public Signal<EventControllerKey.ImUpdate> onImUpdate(EventControllerKey.ImUpdate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("im-update"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerKey.Callbacks.class, "signalEventControllerKeyImUpdate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
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
        boolean signalReceived(EventControllerKey source, int keyval, int keycode, @NotNull org.gtk.gdk.ModifierType state);
    }
    
    /**
     * Emitted whenever a key is pressed.
     */
    public Signal<EventControllerKey.KeyPressed> onKeyPressed(EventControllerKey.KeyPressed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("key-pressed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerKey.Callbacks.class, "signalEventControllerKeyKeyPressed",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
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
        void signalReceived(EventControllerKey source, int keyval, int keycode, @NotNull org.gtk.gdk.ModifierType state);
    }
    
    /**
     * Emitted whenever a key is released.
     */
    public Signal<EventControllerKey.KeyReleased> onKeyReleased(EventControllerKey.KeyReleased handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("key-released"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerKey.Callbacks.class, "signalEventControllerKeyKeyReleased",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
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
        boolean signalReceived(EventControllerKey source, @NotNull org.gtk.gdk.ModifierType keyval);
    }
    
    /**
     * Emitted whenever the state of modifier keys and pointer buttons change.
     */
    public Signal<EventControllerKey.Modifiers> onModifiers(EventControllerKey.Modifiers handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("modifiers"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerKey.Callbacks.class, "signalEventControllerKeyModifiers",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<EventControllerKey.Modifiers>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_event_controller_key_new = Interop.downcallHandle(
            "gtk_event_controller_key_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_event_controller_key_forward = Interop.downcallHandle(
            "gtk_event_controller_key_forward",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_event_controller_key_get_group = Interop.downcallHandle(
            "gtk_event_controller_key_get_group",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_event_controller_key_get_im_context = Interop.downcallHandle(
            "gtk_event_controller_key_get_im_context",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_event_controller_key_set_im_context = Interop.downcallHandle(
            "gtk_event_controller_key_set_im_context",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
    
    private static class Callbacks {
        
        public static void signalEventControllerKeyImUpdate(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (EventControllerKey.ImUpdate) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new EventControllerKey(Refcounted.get(source)));
        }
        
        public static boolean signalEventControllerKeyKeyPressed(MemoryAddress source, int keyval, int keycode, int state, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (EventControllerKey.KeyPressed) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new EventControllerKey(Refcounted.get(source)), keyval, keycode, new org.gtk.gdk.ModifierType(state));
        }
        
        public static void signalEventControllerKeyKeyReleased(MemoryAddress source, int keyval, int keycode, int state, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (EventControllerKey.KeyReleased) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new EventControllerKey(Refcounted.get(source)), keyval, keycode, new org.gtk.gdk.ModifierType(state));
        }
        
        public static boolean signalEventControllerKeyModifiers(MemoryAddress source, int keyval, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (EventControllerKey.Modifiers) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new EventControllerKey(Refcounted.get(source)), new org.gtk.gdk.ModifierType(keyval));
        }
    }
}
