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
    @ApiStatus.Internal
    public GestureDrag(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to GestureDrag if its GType is a (or inherits from) "GtkGestureDrag".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code GestureDrag} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkGestureDrag", a ClassCastException will be thrown.
     */
    public static GestureDrag castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), GestureDrag.getType())) {
            return new GestureDrag(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkGestureDrag");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
        return RESULT != 0;
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
        return RESULT != 0;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
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
        void signalReceived(GestureDrag sourceGestureDrag, double startX, double startY);
    }
    
    /**
     * Emitted whenever dragging starts.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GestureDrag.DragBegin> onDragBegin(GestureDrag.DragBegin handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("drag-begin"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureDrag.Callbacks.class, "signalGestureDragDragBegin",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<GestureDrag.DragBegin>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DragEnd {
        void signalReceived(GestureDrag sourceGestureDrag, double offsetX, double offsetY);
    }
    
    /**
     * Emitted whenever the dragging is finished.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GestureDrag.DragEnd> onDragEnd(GestureDrag.DragEnd handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("drag-end"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureDrag.Callbacks.class, "signalGestureDragDragEnd",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<GestureDrag.DragEnd>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DragUpdate {
        void signalReceived(GestureDrag sourceGestureDrag, double offsetX, double offsetY);
    }
    
    /**
     * Emitted whenever the dragging point moves.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GestureDrag.DragUpdate> onDragUpdate(GestureDrag.DragUpdate handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("drag-update"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureDrag.Callbacks.class, "signalGestureDragDragUpdate",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<GestureDrag.DragUpdate>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.GestureSingle.Build {
        
         /**
         * A {@link GestureDrag.Build} object constructs a {@link GestureDrag} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link GestureDrag} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GestureDrag} using {@link GestureDrag#castFrom}.
         * @return A new instance of {@code GestureDrag} with the properties 
         *         that were set in the Build object.
         */
        public GestureDrag construct() {
            return GestureDrag.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    GestureDrag.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
    
    private static class Callbacks {
        
        public static void signalGestureDragDragBegin(MemoryAddress sourceGestureDrag, double startX, double startY, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (GestureDrag.DragBegin) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new GestureDrag(sourceGestureDrag, Ownership.NONE), startX, startY);
        }
        
        public static void signalGestureDragDragEnd(MemoryAddress sourceGestureDrag, double offsetX, double offsetY, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (GestureDrag.DragEnd) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new GestureDrag(sourceGestureDrag, Ownership.NONE), offsetX, offsetY);
        }
        
        public static void signalGestureDragDragUpdate(MemoryAddress sourceGestureDrag, double offsetX, double offsetY, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (GestureDrag.DragUpdate) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new GestureDrag(sourceGestureDrag, Ownership.NONE), offsetX, offsetY);
        }
    }
}
