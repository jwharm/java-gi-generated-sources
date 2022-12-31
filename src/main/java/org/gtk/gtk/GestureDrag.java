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
public class GestureDrag extends org.gtk.gtk.GestureSingle {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkGestureDrag";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a GestureDrag proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected GestureDrag(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, GestureDrag> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new GestureDrag(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_gesture_drag_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns a newly created {@code GtkGesture} that recognizes drags.
     */
    public GestureDrag() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Gets the offset from the start point.
     * <p>
     * If the {@code gesture} is active, this function returns {@code true} and
     * fills in {@code x} and {@code y} with the coordinates of the current point,
     * as an offset to the starting drag point.
     * @param x X offset for the current point
     * @param y Y offset for the current point
     * @return {@code true} if the gesture is active
     */
    public boolean getOffset(Out<Double> x, Out<Double> y) {
        MemorySegment xPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_gesture_drag_get_offset.invokeExact(
                    handle(),
                    (Addressable) (x == null ? MemoryAddress.NULL : (Addressable) xPOINTER.address()),
                    (Addressable) (y == null ? MemoryAddress.NULL : (Addressable) yPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (x != null) x.set(xPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        if (y != null) y.set(yPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the point where the drag started.
     * <p>
     * If the {@code gesture} is active, this function returns {@code true}
     * and fills in {@code x} and {@code y} with the drag start coordinates,
     * in widget-relative coordinates.
     * @param x X coordinate for the drag start point
     * @param y Y coordinate for the drag start point
     * @return {@code true} if the gesture is active
     */
    public boolean getStartPoint(Out<Double> x, Out<Double> y) {
        MemorySegment xPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        MemorySegment yPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_gesture_drag_get_start_point.invokeExact(
                    handle(),
                    (Addressable) (x == null ? MemoryAddress.NULL : (Addressable) xPOINTER.address()),
                    (Addressable) (y == null ? MemoryAddress.NULL : (Addressable) yPOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (x != null) x.set(xPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        if (y != null) y.set(yPOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_gesture_drag_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface DragBegin {
        void run(double startX, double startY);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceGestureDrag, double startX, double startY) {
            run(startX, startY);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DragBegin.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted whenever dragging starts.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GestureDrag.DragBegin> onDragBegin(GestureDrag.DragBegin handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("drag-begin"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DragEnd {
        void run(double offsetX, double offsetY);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceGestureDrag, double offsetX, double offsetY) {
            run(offsetX, offsetY);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DragEnd.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted whenever the dragging is finished.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GestureDrag.DragEnd> onDragEnd(GestureDrag.DragEnd handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("drag-end"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DragUpdate {
        void run(double offsetX, double offsetY);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceGestureDrag, double offsetX, double offsetY) {
            run(offsetX, offsetY);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DragUpdate.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Emitted whenever the dragging point moves.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GestureDrag.DragUpdate> onDragUpdate(GestureDrag.DragUpdate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("drag-update"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link GestureDrag.Builder} object constructs a {@link GestureDrag} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GestureDrag.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.GestureSingle.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link GestureDrag} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GestureDrag}.
         * @return A new instance of {@code GestureDrag} with the properties 
         *         that were set in the Builder object.
         */
        public GestureDrag build() {
            return (GestureDrag) org.gtk.gobject.GObject.newWithProperties(
                GestureDrag.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_gesture_drag_new = Interop.downcallHandle(
            "gtk_gesture_drag_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gesture_drag_get_offset = Interop.downcallHandle(
            "gtk_gesture_drag_get_offset",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gesture_drag_get_start_point = Interop.downcallHandle(
            "gtk_gesture_drag_get_start_point",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gesture_drag_get_type = Interop.downcallHandle(
            "gtk_gesture_drag_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
