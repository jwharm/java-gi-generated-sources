package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Renders a keyboard accelerator in a cell
 * <p>
 * {@code GtkCellRendererAccel} displays a keyboard accelerator (i.e. a key
 * combination like {@code Control + a}). If the cell renderer is editable,
 * the accelerator can be changed by simply typing the new combination.
 */
public class CellRendererAccel extends org.gtk.gtk.CellRendererText {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellRendererAccel";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public CellRendererAccel(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to CellRendererAccel if its GType is a (or inherits from) "GtkCellRendererAccel".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "CellRendererAccel" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkCellRendererAccel", a ClassCastException will be thrown.
     */
    public static CellRendererAccel castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkCellRendererAccel"))) {
            return new CellRendererAccel(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkCellRendererAccel");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_cell_renderer_accel_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCellRendererAccel}.
     */
    public CellRendererAccel() {
        super(constructNew());
    }
    
    @FunctionalInterface
    public interface AccelCleared {
        void signalReceived(CellRendererAccel source, @NotNull java.lang.String pathString);
    }
    
    /**
     * Gets emitted when the user has removed the accelerator.
     */
    public Signal<CellRendererAccel.AccelCleared> onAccelCleared(CellRendererAccel.AccelCleared handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("accel-cleared"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CellRendererAccel.Callbacks.class, "signalCellRendererAccelAccelCleared",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<CellRendererAccel.AccelCleared>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface AccelEdited {
        void signalReceived(CellRendererAccel source, @NotNull java.lang.String pathString, int accelKey, @NotNull org.gtk.gdk.ModifierType accelMods, int hardwareKeycode);
    }
    
    /**
     * Gets emitted when the user has selected a new accelerator.
     */
    public Signal<CellRendererAccel.AccelEdited> onAccelEdited(CellRendererAccel.AccelEdited handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("accel-edited"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CellRendererAccel.Callbacks.class, "signalCellRendererAccelAccelEdited",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<CellRendererAccel.AccelEdited>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_cell_renderer_accel_new = Interop.downcallHandle(
            "gtk_cell_renderer_accel_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
    }
    
    private static class Callbacks {
        
        public static void signalCellRendererAccelAccelCleared(MemoryAddress source, MemoryAddress pathString, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (CellRendererAccel.AccelCleared) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new CellRendererAccel(Refcounted.get(source)), Interop.getStringFrom(pathString));
        }
        
        public static void signalCellRendererAccelAccelEdited(MemoryAddress source, MemoryAddress pathString, int accelKey, int accelMods, int hardwareKeycode, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (CellRendererAccel.AccelEdited) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new CellRendererAccel(Refcounted.get(source)), Interop.getStringFrom(pathString), accelKey, new org.gtk.gdk.ModifierType(accelMods), hardwareKeycode);
        }
    }
}
