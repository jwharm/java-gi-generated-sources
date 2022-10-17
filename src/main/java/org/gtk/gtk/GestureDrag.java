package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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

    public GestureDrag(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to GestureDrag */
    public static GestureDrag castFrom(org.gtk.gobject.Object gobject) {
        return new GestureDrag(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_gesture_drag_new = Interop.downcallHandle(
        "gtk_gesture_drag_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_gesture_drag_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns a newly created {@code GtkGesture} that recognizes drags.
     */
    public GestureDrag() {
        super(constructNew());
    }
    
    private static final MethodHandle gtk_gesture_drag_get_offset = Interop.downcallHandle(
        "gtk_gesture_drag_get_offset",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the offset from the start point.
     * <p>
     * If the {@code gesture} is active, this function returns {@code true} and
     * fills in @x and @y with the coordinates of the current point,
     * as an offset to the starting drag point.
     */
    public boolean getOffset(@Nullable Out<Double> x, @Nullable Out<Double> y) {
        MemorySegment xPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) gtk_gesture_drag_get_offset.invokeExact(handle(), (Addressable) xPOINTER.address(), (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.set(xPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        y.set(yPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_gesture_drag_get_start_point = Interop.downcallHandle(
        "gtk_gesture_drag_get_start_point",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the point where the drag started.
     * <p>
     * If the {@code gesture} is active, this function returns {@code true}
     * and fills in @x and @y with the drag start coordinates,
     * in surface-relative coordinates.
     */
    public boolean getStartPoint(@Nullable Out<Double> x, @Nullable Out<Double> y) {
        MemorySegment xPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) gtk_gesture_drag_get_start_point.invokeExact(handle(), (Addressable) xPOINTER.address(), (Addressable) yPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        x.set(xPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        y.set(yPOINTER.get(ValueLayout.JAVA_DOUBLE, 0));
        return RESULT != 0;
    }
    
    @FunctionalInterface
    public interface DragBeginHandler {
        void signalReceived(GestureDrag source, @NotNull double startX, @NotNull double startY);
    }
    
    /**
     * Emitted whenever dragging starts.
     */
    public SignalHandle onDragBegin(DragBeginHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("drag-begin"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureDrag.Callbacks.class, "signalGestureDragDragBegin",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DragEndHandler {
        void signalReceived(GestureDrag source, @NotNull double offsetX, @NotNull double offsetY);
    }
    
    /**
     * Emitted whenever the dragging is finished.
     */
    public SignalHandle onDragEnd(DragEndHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("drag-end"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureDrag.Callbacks.class, "signalGestureDragDragEnd",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DragUpdateHandler {
        void signalReceived(GestureDrag source, @NotNull double offsetX, @NotNull double offsetY);
    }
    
    /**
     * Emitted whenever the dragging point moves.
     */
    public SignalHandle onDragUpdate(DragUpdateHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("drag-update"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureDrag.Callbacks.class, "signalGestureDragDragUpdate",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalGestureDragDragBegin(MemoryAddress source, double startX, double startY, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (GestureDrag.DragBeginHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new GestureDrag(Refcounted.get(source)), startX, startY);
        }
        
        public static void signalGestureDragDragEnd(MemoryAddress source, double offsetX, double offsetY, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (GestureDrag.DragEndHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new GestureDrag(Refcounted.get(source)), offsetX, offsetY);
        }
        
        public static void signalGestureDragDragUpdate(MemoryAddress source, double offsetX, double offsetY, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (GestureDrag.DragUpdateHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new GestureDrag(Refcounted.get(source)), offsetX, offsetY);
        }
        
    }
}
