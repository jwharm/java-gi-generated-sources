package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkEventControllerKey} is an event controller that provides access
 * to key events.
 */
public class EventControllerKey extends EventController {

    public EventControllerKey(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to EventControllerKey */
    public static EventControllerKey castFrom(org.gtk.gobject.Object gobject) {
        return new EventControllerKey(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_event_controller_key_new = Interop.downcallHandle(
        "gtk_event_controller_key_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_event_controller_key_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new event controller that will handle key events.
     */
    public EventControllerKey() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_event_controller_key_forward = Interop.downcallHandle(
        "gtk_event_controller_key_forward",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Forwards the current event of this {@code controller} to a {@code widget}.
     * <p>
     * This function can only be used in handlers for the
     * {@code Gtk.EventControllerKey::key-pressed},
     * {@code Gtk.EventControllerKey::key-released}
     * or {@code Gtk.EventControllerKey::modifiers} signals.
     */
    public boolean forward(@NotNull Widget widget) {
        int RESULT;
        try {
            RESULT = (int) gtk_event_controller_key_forward.invokeExact(handle(), widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_event_controller_key_get_group = Interop.downcallHandle(
        "gtk_event_controller_key_get_group",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the key group of the current event of this {@code controller}.
     * <p>
     * See {@link org.gtk.gdk.KeyEvent#getLayout}.
     */
    public int getGroup() {
        int RESULT;
        try {
            RESULT = (int) gtk_event_controller_key_get_group.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_event_controller_key_get_im_context = Interop.downcallHandle(
        "gtk_event_controller_key_get_im_context",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the input method context of the key {@code controller}.
     */
    public @Nullable IMContext getImContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_event_controller_key_get_im_context.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new IMContext(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_event_controller_key_set_im_context = Interop.downcallHandle(
        "gtk_event_controller_key_set_im_context",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the input method context of the key {@code controller}.
     */
    public @NotNull void setImContext(@Nullable IMContext imContext) {
        try {
            gtk_event_controller_key_set_im_context.invokeExact(handle(), imContext.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ImUpdateHandler {
        void signalReceived(EventControllerKey source);
    }
    
    /**
     * Emitted whenever the input method context filters away
     * a keypress and prevents the {@code controller} receiving it.
     * <p>
     * See {@link EventControllerKey#setImContext} and
     * {@link IMContext#filterKeypress}.
     */
    public SignalHandle onImUpdate(ImUpdateHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("im-update"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerKey.Callbacks.class, "signalEventControllerKeyImUpdate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface KeyPressedHandler {
        boolean signalReceived(EventControllerKey source, @NotNull int keyval, @NotNull int keycode, @NotNull org.gtk.gdk.ModifierType state);
    }
    
    /**
     * Emitted whenever a key is pressed.
     */
    public SignalHandle onKeyPressed(KeyPressedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("key-pressed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerKey.Callbacks.class, "signalEventControllerKeyKeyPressed",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface KeyReleasedHandler {
        void signalReceived(EventControllerKey source, @NotNull int keyval, @NotNull int keycode, @NotNull org.gtk.gdk.ModifierType state);
    }
    
    /**
     * Emitted whenever a key is released.
     */
    public SignalHandle onKeyReleased(KeyReleasedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("key-released"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerKey.Callbacks.class, "signalEventControllerKeyKeyReleased",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ModifiersHandler {
        boolean signalReceived(EventControllerKey source, @NotNull org.gtk.gdk.ModifierType keyval);
    }
    
    /**
     * Emitted whenever the state of modifier keys and pointer buttons change.
     */
    public SignalHandle onModifiers(ModifiersHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("modifiers"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerKey.Callbacks.class, "signalEventControllerKeyModifiers",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalEventControllerKeyImUpdate(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (EventControllerKey.ImUpdateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new EventControllerKey(Refcounted.get(source)));
        }
        
        public static boolean signalEventControllerKeyKeyPressed(MemoryAddress source, int keyval, int keycode, int state, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (EventControllerKey.KeyPressedHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new EventControllerKey(Refcounted.get(source)), keyval, keycode, new org.gtk.gdk.ModifierType(state));
        }
        
        public static void signalEventControllerKeyKeyReleased(MemoryAddress source, int keyval, int keycode, int state, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (EventControllerKey.KeyReleasedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new EventControllerKey(Refcounted.get(source)), keyval, keycode, new org.gtk.gdk.ModifierType(state));
        }
        
        public static boolean signalEventControllerKeyModifiers(MemoryAddress source, int keyval, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (EventControllerKey.ModifiersHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new EventControllerKey(Refcounted.get(source)), new org.gtk.gdk.ModifierType(keyval));
        }
        
    }
}
