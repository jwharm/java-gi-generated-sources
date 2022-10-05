package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkDropControllerMotion} is an event controller tracking
 * the pointer during Drag-and-Drop operations.
 * <p>
 * It is modeled after {@link EventControllerMotion} so if you
 * have used that, this should feel really familiar.
 * <p>
 * This controller is not able to accept drops, use {@link DropTarget}
 * for that purpose.
 */
public class DropControllerMotion extends EventController {

    public DropControllerMotion(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to DropControllerMotion */
    public static DropControllerMotion castFrom(org.gtk.gobject.Object gobject) {
        return new DropControllerMotion(gobject.refcounted());
    }
    
    static final MethodHandle gtk_drop_controller_motion_new = Interop.downcallHandle(
        "gtk_drop_controller_motion_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_drop_controller_motion_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new event controller that will handle pointer motion
     * events during drag and drop.
     */
    public DropControllerMotion() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_drop_controller_motion_contains_pointer = Interop.downcallHandle(
        "gtk_drop_controller_motion_contains_pointer",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns if a Drag-and-Drop operation is within the widget
     * {@code self} or one of its children.
     */
    public boolean containsPointer() {
        try {
            var RESULT = (int) gtk_drop_controller_motion_contains_pointer.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_drop_controller_motion_get_drop = Interop.downcallHandle(
        "gtk_drop_controller_motion_get_drop",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@code GdkDrop} of a current Drag-and-Drop operation
     * over the widget of {@code self}.
     */
    public org.gtk.gdk.Drop getDrop() {
        try {
            var RESULT = (MemoryAddress) gtk_drop_controller_motion_get_drop.invokeExact(handle());
            return new org.gtk.gdk.Drop(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_drop_controller_motion_is_pointer = Interop.downcallHandle(
        "gtk_drop_controller_motion_is_pointer",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns if a Drag-and-Drop operation is within the widget
     * {@code self}, not one of its children.
     */
    public boolean isPointer() {
        try {
            var RESULT = (int) gtk_drop_controller_motion_is_pointer.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface EnterHandler {
        void signalReceived(DropControllerMotion source, double x, double y);
    }
    
    /**
     * Signals that the pointer has entered the widget.
     */
    public SignalHandle onEnter(EnterHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("enter").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropControllerMotion.Callbacks.class, "signalDropControllerMotionEnter",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface LeaveHandler {
        void signalReceived(DropControllerMotion source);
    }
    
    /**
     * Signals that the pointer has left the widget.
     */
    public SignalHandle onLeave(LeaveHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("leave").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropControllerMotion.Callbacks.class, "signalDropControllerMotionLeave",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MotionHandler {
        void signalReceived(DropControllerMotion source, double x, double y);
    }
    
    /**
     * Emitted when the pointer moves inside the widget.
     */
    public SignalHandle onMotion(MotionHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("motion").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(DropControllerMotion.Callbacks.class, "signalDropControllerMotionMotion",
                        MethodType.methodType(void.class, MemoryAddress.class, double.class, double.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalDropControllerMotionEnter(MemoryAddress source, double x, double y, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DropControllerMotion.EnterHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new DropControllerMotion(Refcounted.get(source)), x, y);
        }
        
        public static void signalDropControllerMotionLeave(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DropControllerMotion.LeaveHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new DropControllerMotion(Refcounted.get(source)));
        }
        
        public static void signalDropControllerMotionMotion(MemoryAddress source, double x, double y, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (DropControllerMotion.MotionHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new DropControllerMotion(Refcounted.get(source)), x, y);
        }
        
    }
}
