package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Renders a keyboard accelerator in a cell
 * <p>
 * {@code GtkCellRendererAccel} displays a keyboard accelerator (i.e. a key
 * combination like {@code Control + a}). If the cell renderer is editable,
 * the accelerator can be changed by simply typing the new combination.
 */
public class CellRendererAccel extends CellRendererText {

    public CellRendererAccel(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CellRendererAccel */
    public static CellRendererAccel castFrom(org.gtk.gobject.Object gobject) {
        return new CellRendererAccel(gobject.refcounted());
    }
    
    static final MethodHandle gtk_cell_renderer_accel_new = Interop.downcallHandle(
        "gtk_cell_renderer_accel_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_cell_renderer_accel_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkCellRendererAccel}.
     */
    public CellRendererAccel() {
        super(constructNew());
    }
    
    @FunctionalInterface
    public interface AccelClearedHandler {
        void signalReceived(CellRendererAccel source, java.lang.String pathString);
    }
    
    /**
     * Gets emitted when the user has removed the accelerator.
     */
    public SignalHandle onAccelCleared(AccelClearedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("accel-cleared").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CellRendererAccel.Callbacks.class, "signalCellRendererAccelAccelCleared",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface AccelEditedHandler {
        void signalReceived(CellRendererAccel source, java.lang.String pathString, int accelKey, org.gtk.gdk.ModifierType accelMods, int hardwareKeycode);
    }
    
    /**
     * Gets emitted when the user has selected a new accelerator.
     */
    public SignalHandle onAccelEdited(AccelEditedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("accel-edited").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CellRendererAccel.Callbacks.class, "signalCellRendererAccelAccelEdited",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalCellRendererAccelAccelCleared(MemoryAddress source, MemoryAddress pathString, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (CellRendererAccel.AccelClearedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new CellRendererAccel(Refcounted.get(source)), pathString.getUtf8String(0));
        }
        
        public static void signalCellRendererAccelAccelEdited(MemoryAddress source, MemoryAddress pathString, int accelKey, int accelMods, int hardwareKeycode, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (CellRendererAccel.AccelEditedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new CellRendererAccel(Refcounted.get(source)), pathString.getUtf8String(0), accelKey, new org.gtk.gdk.ModifierType(accelMods), hardwareKeycode);
        }
        
    }
}
