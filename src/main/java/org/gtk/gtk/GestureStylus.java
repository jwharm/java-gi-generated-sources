package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkGestureStylus} is a {@code GtkGesture} specific to stylus input.
 * <p>
 * The provided signals just relay the basic information of the
 * stylus events.
 */
public class GestureStylus extends org.gtk.gtk.GestureSingle {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkGestureStylus";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a GestureStylus proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GestureStylus(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to GestureStylus if its GType is a (or inherits from) "GtkGestureStylus".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code GestureStylus} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkGestureStylus", a ClassCastException will be thrown.
     */
    public static GestureStylus castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), GestureStylus.getType())) {
            return new GestureStylus(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkGestureStylus");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_gesture_stylus_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkGestureStylus}.
     */
    public GestureStylus() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Returns the current values for the requested {@code axes}.
     * <p>
     * This function must be called from the handler of one of the
     * {@code Gtk.GestureStylus::down}, {@code Gtk.GestureStylus::motion},
     * {@code Gtk.GestureStylus::up} or {@code Gtk.GestureStylus::proximity}
     * signals.
     * @param axes array of requested axes, terminated with {@link org.gtk.gdk.AxisUse#IGNORE}
     * @param values return location for the axis values
     * @return {@code true} if there is a current value for the axes
     */
    public boolean getAxes(@NotNull org.gtk.gdk.AxisUse[] axes, @NotNull Out<double[]> values) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Returns the current value for the requested {@code axis}.
     * <p>
     * This function must be called from the handler of one of the
     * {@code Gtk.GestureStylus::down}, {@code Gtk.GestureStylus::motion},
     * {@code Gtk.GestureStylus::up} or {@code Gtk.GestureStylus::proximity}
     * signals.
     * @param axis requested device axis
     * @param value return location for the axis value
     * @return {@code true} if there is a current value for the axis
     */
    public boolean getAxis(@NotNull org.gtk.gdk.AxisUse axis, Out<Double> value) {
        java.util.Objects.requireNonNull(axis, "Parameter 'axis' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_gesture_stylus_get_axis.invokeExact(
                    handle(),
                    axis.getValue(),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return RESULT != 0;
    }
    
    /**
     * Returns the accumulated backlog of tracking information.
     * <p>
     * By default, GTK will limit rate of input events. On stylus input
     * where accuracy of strokes is paramount, this function returns the
     * accumulated coordinate/timing state before the emission of the
     * current [Gtk.GestureStylus::motion] signal.
     * <p>
     * This function may only be called within a {@code Gtk.GestureStylus::motion}
     * signal handler, the state given in this signal and obtainable through
     * {@link GestureStylus#getAxis} express the latest (most up-to-date)
     * state in motion history.
     * <p>
     * The {@code backlog} is provided in chronological order.
     * @param backlog coordinates and times for the backlog events
     * @param nElems return location for the number of elements
     * @return {@code true} if there is a backlog to unfold in the current state.
     */
    public boolean getBacklog(@NotNull Out<org.gtk.gdk.TimeCoord[]> backlog, Out<Integer> nElems) {
        java.util.Objects.requireNonNull(backlog, "Parameter 'backlog' must not be null");
        MemorySegment backlogPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(nElems, "Parameter 'nElems' must not be null");
        MemorySegment nElemsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_gesture_stylus_get_backlog.invokeExact(
                    handle(),
                    (Addressable) backlogPOINTER.address(),
                    (Addressable) nElemsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nElems.set(nElemsPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.gtk.gdk.TimeCoord[] backlogARRAY = new org.gtk.gdk.TimeCoord[nElems.get().intValue()];
        for (int I = 0; I < nElems.get().intValue(); I++) {
            var OBJ = backlogPOINTER.get(Interop.valueLayout.ADDRESS, I);
            backlogARRAY[I] = new org.gtk.gdk.TimeCoord(OBJ, Ownership.FULL);
        }
        backlog.set(backlogARRAY);
        return RESULT != 0;
    }
    
    /**
     * Returns the {@code GdkDeviceTool} currently driving input through this gesture.
     * <p>
     * This function must be called from the handler of one of the
     * {@code Gtk.GestureStylus::down}, {@code Gtk.GestureStylus::motion},
     * {@code Gtk.GestureStylus::up} or {@code Gtk.GestureStylus::proximity}
     * signals.
     * @return The current stylus tool
     */
    public @Nullable org.gtk.gdk.DeviceTool getDeviceTool() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_gesture_stylus_get_device_tool.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.DeviceTool(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_gesture_stylus_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Down {
        void signalReceived(GestureStylus source, double x, double y);
    }
    
    /**
     * Emitted when the stylus touches the device.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GestureStylus.Down> onDown(GestureStylus.Down handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("down"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureStylus.Callbacks.class, "signalGestureStylusDown",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<GestureStylus.Down>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Motion {
        void signalReceived(GestureStylus source, double x, double y);
    }
    
    /**
     * Emitted when the stylus moves while touching the device.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GestureStylus.Motion> onMotion(GestureStylus.Motion handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("motion"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureStylus.Callbacks.class, "signalGestureStylusMotion",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<GestureStylus.Motion>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Proximity {
        void signalReceived(GestureStylus source, double x, double y);
    }
    
    /**
     * Emitted when the stylus is in proximity of the device.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GestureStylus.Proximity> onProximity(GestureStylus.Proximity handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("proximity"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureStylus.Callbacks.class, "signalGestureStylusProximity",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<GestureStylus.Proximity>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Up {
        void signalReceived(GestureStylus source, double x, double y);
    }
    
    /**
     * Emitted when the stylus no longer touches the device.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GestureStylus.Up> onUp(GestureStylus.Up handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("up"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureStylus.Callbacks.class, "signalGestureStylusUp",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<GestureStylus.Up>(handle(), RESULT);
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
         * A {@link GestureStylus.Build} object constructs a {@link GestureStylus} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link GestureStylus} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GestureStylus} using {@link GestureStylus#castFrom}.
         * @return A new instance of {@code GestureStylus} with the properties 
         *         that were set in the Build object.
         */
        public GestureStylus construct() {
            return GestureStylus.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    GestureStylus.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_gesture_stylus_new = Interop.downcallHandle(
            "gtk_gesture_stylus_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gesture_stylus_get_axes = Interop.downcallHandle(
            "gtk_gesture_stylus_get_axes",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gesture_stylus_get_axis = Interop.downcallHandle(
            "gtk_gesture_stylus_get_axis",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gesture_stylus_get_backlog = Interop.downcallHandle(
            "gtk_gesture_stylus_get_backlog",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gesture_stylus_get_device_tool = Interop.downcallHandle(
            "gtk_gesture_stylus_get_device_tool",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gesture_stylus_get_type = Interop.downcallHandle(
            "gtk_gesture_stylus_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalGestureStylusDown(MemoryAddress source, double x, double y, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (GestureStylus.Down) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new GestureStylus(source, Ownership.NONE), x, y);
        }
        
        public static void signalGestureStylusMotion(MemoryAddress source, double x, double y, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (GestureStylus.Motion) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new GestureStylus(source, Ownership.NONE), x, y);
        }
        
        public static void signalGestureStylusProximity(MemoryAddress source, double x, double y, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (GestureStylus.Proximity) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new GestureStylus(source, Ownership.NONE), x, y);
        }
        
        public static void signalGestureStylusUp(MemoryAddress source, double x, double y, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (GestureStylus.Up) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new GestureStylus(source, Ownership.NONE), x, y);
        }
    }
}
