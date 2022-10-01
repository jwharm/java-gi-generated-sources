package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
    
    private static Refcounted constructNew() {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_event_controller_key_new(), true);
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
     */
    public boolean forward(Widget widget) {
        var RESULT = gtk_h.gtk_event_controller_key_forward(handle(), widget.handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the key group of the current event of this {@code controller}.
     * <p>
     * See {@link org.gtk.gdk.KeyEvent#getLayout}.
     */
    public int getGroup() {
        var RESULT = gtk_h.gtk_event_controller_key_get_group(handle());
        return RESULT;
    }
    
    /**
     * Gets the input method context of the key {@code controller}.
     */
    public IMContext getImContext() {
        var RESULT = gtk_h.gtk_event_controller_key_get_im_context(handle());
        return new IMContext(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets the input method context of the key {@code controller}.
     */
    public void setImContext(IMContext imContext) {
        gtk_h.gtk_event_controller_key_set_im_context(handle(), imContext.handle());
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("im-update").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerKey.Callbacks.class, "signalEventControllerKeyImUpdate",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface KeyPressedHandler {
        boolean signalReceived(EventControllerKey source, int keyval, int keycode, org.gtk.gdk.ModifierType state);
    }
    
    /**
     * Emitted whenever a key is pressed.
     */
    public SignalHandle onKeyPressed(KeyPressedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("key-pressed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerKey.Callbacks.class, "signalEventControllerKeyKeyPressed",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface KeyReleasedHandler {
        void signalReceived(EventControllerKey source, int keyval, int keycode, org.gtk.gdk.ModifierType state);
    }
    
    /**
     * Emitted whenever a key is released.
     */
    public SignalHandle onKeyReleased(KeyReleasedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("key-released").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerKey.Callbacks.class, "signalEventControllerKeyKeyReleased",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ModifiersHandler {
        boolean signalReceived(EventControllerKey source, org.gtk.gdk.ModifierType keyval);
    }
    
    /**
     * Emitted whenever the state of modifier keys and pointer buttons change.
     */
    public SignalHandle onModifiers(ModifiersHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("modifiers").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(EventControllerKey.Callbacks.class, "signalEventControllerKeyModifiers",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
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
