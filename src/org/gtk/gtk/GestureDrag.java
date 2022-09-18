package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * <code>GtkGestureDrag</code> is a <code>GtkGesture</code> implementation for drags.
 * 
 * The drag operation itself can be tracked throughout the
 * {@link [signal@Gtk.GestureDrag::drag-begin] (ref=signal)},
 * {@link [signal@Gtk.GestureDrag::drag-update] (ref=signal)} and
 * {@link [signal@Gtk.GestureDrag::drag-end] (ref=signal)} signals, and the relevant
 * coordinates can be extracted through
 * {@link org.gtk.gtk.GestureDrag<code>#getOffset</code>  and
 * {@link org.gtk.gtk.GestureDrag<code>#getStartPoint</code> .
 */
public class GestureDrag extends GestureSingle {

    public GestureDrag(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to GestureDrag */
    public static GestureDrag castFrom(org.gtk.gobject.Object gobject) {
        return new GestureDrag(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_gesture_drag_new(), true);
        return RESULT;
    }
    
    /**
     * Returns a newly created <code>GtkGesture</code> that recognizes drags.
     */
    public GestureDrag() {
        super(constructNew());
    }
    
    @FunctionalInterface
    public interface DragBeginHandler {
        void signalReceived(GestureDrag source, double startX, double startY);
    }
    
    /**
     * Emitted whenever dragging starts.
     */
    public SignalHandle onDragBegin(DragBeginHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGestureDragDragBegin", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("drag-begin").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface DragEndHandler {
        void signalReceived(GestureDrag source, double offsetX, double offsetY);
    }
    
    /**
     * Emitted whenever the dragging is finished.
     */
    public SignalHandle onDragEnd(DragEndHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGestureDragDragEnd", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("drag-end").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface DragUpdateHandler {
        void signalReceived(GestureDrag source, double offsetX, double offsetY);
    }
    
    /**
     * Emitted whenever the dragging point moves.
     */
    public SignalHandle onDragUpdate(DragUpdateHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalGestureDragDragUpdate", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("drag-update").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
