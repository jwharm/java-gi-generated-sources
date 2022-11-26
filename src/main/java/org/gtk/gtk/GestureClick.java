package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkGestureClick} is a {@code GtkGesture} implementation for clicks.
 * <p>
 * It is able to recognize multiple clicks on a nearby zone, which
 * can be listened for through the {@code Gtk.GestureClick::pressed}
 * signal. Whenever time or distance between clicks exceed the GTK
 * defaults, {@code Gtk.GestureClick::stopped} is emitted, and the
 * click counter is reset.
 */
public class GestureClick extends org.gtk.gtk.GestureSingle {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkGestureClick";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a GestureClick proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public GestureClick(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to GestureClick if its GType is a (or inherits from) "GtkGestureClick".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code GestureClick} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkGestureClick", a ClassCastException will be thrown.
     */
    public static GestureClick castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), GestureClick.getType())) {
            return new GestureClick(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkGestureClick");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_gesture_click_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns a newly created {@code GtkGesture} that recognizes
     * single and multiple presses.
     */
    public GestureClick() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_gesture_click_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Pressed {
        void signalReceived(GestureClick source, int nPress, double x, double y);
    }
    
    /**
     * Emitted whenever a button or touch press happens.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GestureClick.Pressed> onPressed(GestureClick.Pressed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("pressed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureClick.Callbacks.class, "signalGestureClickPressed",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<GestureClick.Pressed>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Released {
        void signalReceived(GestureClick source, int nPress, double x, double y);
    }
    
    /**
     * Emitted when a button or touch is released.
     * <p>
     * {@code n_press} will report the number of press that is paired to
     * this event, note that {@code Gtk.GestureClick::stopped} may
     * have been emitted between the press and its release, {@code n_press}
     * will only start over at the next press.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GestureClick.Released> onReleased(GestureClick.Released handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("released"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureClick.Callbacks.class, "signalGestureClickReleased",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<GestureClick.Released>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Stopped {
        void signalReceived(GestureClick source);
    }
    
    /**
     * Emitted whenever any time/distance threshold has been exceeded.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GestureClick.Stopped> onStopped(GestureClick.Stopped handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("stopped"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureClick.Callbacks.class, "signalGestureClickStopped",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<GestureClick.Stopped>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface UnpairedRelease {
        void signalReceived(GestureClick source, double x, double y, int button, @Nullable org.gtk.gdk.EventSequence sequence);
    }
    
    /**
     * Emitted whenever the gesture receives a release
     * event that had no previous corresponding press.
     * <p>
     * Due to implicit grabs, this can only happen on situations
     * where input is grabbed elsewhere mid-press or the pressed
     * widget voluntarily relinquishes its implicit grab.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<GestureClick.UnpairedRelease> onUnpairedRelease(GestureClick.UnpairedRelease handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("unpaired-release"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(GestureClick.Callbacks.class, "signalGestureClickUnpairedRelease",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, int.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<GestureClick.UnpairedRelease>(handle(), RESULT);
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
         * A {@link GestureClick.Build} object constructs a {@link GestureClick} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link GestureClick} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link GestureClick} using {@link GestureClick#castFrom}.
         * @return A new instance of {@code GestureClick} with the properties 
         *         that were set in the Build object.
         */
        public GestureClick construct() {
            return GestureClick.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    GestureClick.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_gesture_click_new = Interop.downcallHandle(
            "gtk_gesture_click_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_gesture_click_get_type = Interop.downcallHandle(
            "gtk_gesture_click_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalGestureClickPressed(MemoryAddress source, int nPress, double x, double y, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (GestureClick.Pressed) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new GestureClick(source, Ownership.NONE), nPress, x, y);
        }
        
        public static void signalGestureClickReleased(MemoryAddress source, int nPress, double x, double y, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (GestureClick.Released) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new GestureClick(source, Ownership.NONE), nPress, x, y);
        }
        
        public static void signalGestureClickStopped(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (GestureClick.Stopped) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new GestureClick(source, Ownership.NONE));
        }
        
        public static void signalGestureClickUnpairedRelease(MemoryAddress source, double x, double y, int button, MemoryAddress sequence, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (GestureClick.UnpairedRelease) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new GestureClick(source, Ownership.NONE), x, y, button, new org.gtk.gdk.EventSequence(sequence, Ownership.NONE));
        }
    }
}
