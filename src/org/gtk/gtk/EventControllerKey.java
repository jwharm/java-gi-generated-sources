package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkEventControllerKey</code> is an event controller that provides access
 * to key events.
 */
public class EventControllerKey extends EventController {

    public EventControllerKey(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to EventControllerKey */
    public static EventControllerKey castFrom(org.gtk.gobject.Object gobject) {
        return new EventControllerKey(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_event_controller_key_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new event controller that will handle key events.
     */
    public EventControllerKey() {
        super(constructNew());
    }
    
    /**
     * Forwards the current event of this @controller to a @widget.
     * 
     * This function can only be used in handlers for the
     * {@link [signal@Gtk.EventControllerKey::key-pressed] (ref=signal)},
     * {@link [signal@Gtk.EventControllerKey::key-released] (ref=signal)}
     * or {@link [signal@Gtk.EventControllerKey::modifiers] (ref=signal)} signals.
     */
    public boolean forward(Widget widget) {
        var RESULT = gtk_h.gtk_event_controller_key_forward(handle(), widget.handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the key group of the current event of this @controller.
     * 
     * See {@link org.gtk.gdk.KeyEvent#getLayout}.
     */
    public int getGroup() {
        var RESULT = gtk_h.gtk_event_controller_key_get_group(handle());
        return RESULT;
    }
    
    /**
     * Gets the input method context of the key @controller.
     */
    public IMContext getImContext() {
        var RESULT = gtk_h.gtk_event_controller_key_get_im_context(handle());
        return new IMContext(References.get(RESULT, false));
    }
    
    /**
     * Sets the input method context of the key @controller.
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
     * a keypress and prevents the @controller receiving it.
     * 
     * See {@link org.gtk.gtk.EventControllerKey#setImContext} and
     * {@link org.gtk.gtk.IMContext#filterKeypress}.
     */
    public SignalHandle onImUpdate(ImUpdateHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEventControllerKeyImUpdate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("im-update").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface KeyPressedHandler {
        boolean signalReceived(EventControllerKey source, int keyval, int keycode, int state);
    }
    
    /**
     * Emitted whenever a key is pressed.
     */
    public SignalHandle onKeyPressed(KeyPressedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, int.class, int.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEventControllerKeyKeyPressed", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("key-pressed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface KeyReleasedHandler {
        void signalReceived(EventControllerKey source, int keyval, int keycode, int state);
    }
    
    /**
     * Emitted whenever a key is released.
     */
    public SignalHandle onKeyReleased(KeyReleasedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEventControllerKeyKeyReleased", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("key-released").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ModifiersHandler {
        boolean signalReceived(EventControllerKey source, int keyval);
    }
    
    /**
     * Emitted whenever the state of modifier keys and pointer buttons change.
     */
    public SignalHandle onModifiers(ModifiersHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEventControllerKeyModifiers", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("modifiers").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
