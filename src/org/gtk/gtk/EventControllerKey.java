package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkEventControllerKey` is an event controller that provides access
 * to key events.
 */
public class EventControllerKey extends EventController {

    public EventControllerKey(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to EventControllerKey */
    public static EventControllerKey castFrom(org.gtk.gobject.Object gobject) {
        return new EventControllerKey(gobject.getReference());
    }
    
    /**
     * Creates a new event controller that will handle key events.
     */
    public EventControllerKey() {
        super(References.get(gtk_h.gtk_event_controller_key_new(), true));
    }
    
    /**
     * Forwards the current event of this @controller to a @widget.
     * 
     * This function can only be used in handlers for the
     * [signal@Gtk.EventControllerKey::key-pressed],
     * [signal@Gtk.EventControllerKey::key-released]
     * or [signal@Gtk.EventControllerKey::modifiers] signals.
     */
    public boolean forward(Widget widget) {
        var RESULT = gtk_h.gtk_event_controller_key_forward(handle(), widget.handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the key group of the current event of this @controller.
     * 
     * See [method@Gdk.KeyEvent.get_layout].
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
     * See [method@Gtk.EventControllerKey.set_im_context] and
     * [method@Gtk.IMContext.filter_keypress].
     */
    public void onImUpdate(ImUpdateHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEventControllerKeyImUpdate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("im-update").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
    public void onKeyPressed(KeyPressedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, int.class, int.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEventControllerKeyKeyPressed", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("key-pressed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
    public void onKeyReleased(KeyReleasedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEventControllerKeyKeyReleased", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("key-released").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
    public void onModifiers(ModifiersHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalEventControllerKeyModifiers", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("modifiers").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
