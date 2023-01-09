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
     */
    protected GestureStylus(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, GestureStylus> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new GestureStylus(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
        super(constructNew());
        this.takeOwnership();
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
    public boolean getAxes(org.gtk.gdk.AxisUse[] axes, double[] values) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gtk_gesture_stylus_get_axes.invokeExact(
                        handle(),
                        Interop.allocateNativeArray(Enumeration.getValues(axes), false, SCOPE),
                        Interop.allocateNativeArray(values, false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
    public boolean getAxis(org.gtk.gdk.AxisUse axis, Out<Double> value) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment valuePOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
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
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
    public boolean getBacklog(Out<org.gtk.gdk.TimeCoord[]> backlog, Out<Integer> nElems) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment backlogPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment nElemsPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
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
                backlogARRAY[I] = org.gtk.gdk.TimeCoord.fromAddress.marshal(OBJ, null);
                }
            backlog.set(backlogARRAY);
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_gesture_stylus_get_device_tool.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gdk.DeviceTool) Interop.register(RESULT, org.gtk.gdk.DeviceTool.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_gesture_stylus_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Down} callback.
     */
    @FunctionalInterface
    public interface Down {
    
        /**
         * Emitted when the stylus touches the device.
         */
        void run(double x, double y);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceGestureStylus, double x, double y) {
            run(x, y);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Down.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the stylus touches the device.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GestureStylus.Down> onDown(GestureStylus.Down handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("down", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Motion} callback.
     */
    @FunctionalInterface
    public interface Motion {
    
        /**
         * Emitted when the stylus moves while touching the device.
         */
        void run(double x, double y);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceGestureStylus, double x, double y) {
            run(x, y);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Motion.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the stylus moves while touching the device.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GestureStylus.Motion> onMotion(GestureStylus.Motion handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("motion", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Proximity} callback.
     */
    @FunctionalInterface
    public interface Proximity {
    
        /**
         * Emitted when the stylus is in proximity of the device.
         */
        void run(double x, double y);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceGestureStylus, double x, double y) {
            run(x, y);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Proximity.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the stylus is in proximity of the device.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GestureStylus.Proximity> onProximity(GestureStylus.Proximity handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("proximity", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code Up} callback.
     */
    @FunctionalInterface
    public interface Up {
    
        /**
         * Emitted when the stylus no longer touches the device.
         */
        void run(double x, double y);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceGestureStylus, double x, double y) {
            run(x, y);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Up.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the stylus no longer touches the device.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GestureStylus.Up> onUp(GestureStylus.Up handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("up", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link GestureStylus.Builder} object constructs a {@link GestureStylus} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link GestureStylus.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.GestureSingle.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link GestureStylus} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GestureStylus}.
         * @return A new instance of {@code GestureStylus} with the properties 
         *         that were set in the Builder object.
         */
        public GestureStylus build() {
            return (GestureStylus) org.gtk.gobject.GObject.newWithProperties(
                GestureStylus.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_gesture_stylus_get_type != null;
    }
}
