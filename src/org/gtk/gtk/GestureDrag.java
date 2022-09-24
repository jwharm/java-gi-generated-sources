package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkGestureDrag} is a {@code GtkGesture} implementation for drags.
 * <p>
 * The drag operation itself can be tracked throughout the
 * {@code Gtk.GestureDrag::drag-begin},
 * {@code Gtk.GestureDrag::drag-update} and
 * {@code Gtk.GestureDrag::drag-end} signals, and the relevant
 * coordinates can be extracted through
 * {@link GestureDrag#getOffset} and
 * {@link GestureDrag#getStartPoint}.
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
     * Returns a newly created {@code GtkGesture} that recognizes drags.
     */
    public GestureDrag() {
        super(constructNew());
    }
    
    /**
     * Gets the offset from the start point.
     * <p>
     * If the {@code gesture} is active, this function returns {@code true} and
     * fills in @x and @y with the coordinates of the current point,
     * as an offset to the starting drag point.
     */
    public boolean getOffset(PointerDouble x, PointerDouble y) {
        var RESULT = gtk_h.gtk_gesture_drag_get_offset(handle(), x.handle(), y.handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the point where the drag started.
     * <p>
     * If the {@code gesture} is active, this function returns {@code true}
     * and fills in @x and @y with the drag start coordinates,
     * in surface-relative coordinates.
     */
    public boolean getStartPoint(PointerDouble x, PointerDouble y) {
        var RESULT = gtk_h.gtk_gesture_drag_get_start_point(handle(), x.handle(), y.handle());
        return (RESULT != 0);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("drag-begin").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureDrag.class, "__signalGestureDragDragBegin",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalGestureDragDragBegin(MemoryAddress source, double startX, double startY, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureDrag.DragBeginHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new GestureDrag(References.get(source)), startX, startY);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("drag-end").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureDrag.class, "__signalGestureDragDragEnd",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalGestureDragDragEnd(MemoryAddress source, double offsetX, double offsetY, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureDrag.DragEndHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new GestureDrag(References.get(source)), offsetX, offsetY);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("drag-update").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureDrag.class, "__signalGestureDragDragUpdate",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(C_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalGestureDragDragUpdate(MemoryAddress source, double offsetX, double offsetY, MemoryAddress data) {
        int hash = data.get(C_INT, 0);
        var handler = (GestureDrag.DragUpdateHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new GestureDrag(References.get(source)), offsetX, offsetY);
    }
    
}
