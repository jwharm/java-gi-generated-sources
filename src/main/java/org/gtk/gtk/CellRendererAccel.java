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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a CellRendererAccel proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CellRendererAccel(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to CellRendererAccel if its GType is a (or inherits from) "GtkCellRendererAccel".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code CellRendererAccel} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkCellRendererAccel", a ClassCastException will be thrown.
     */
    public static CellRendererAccel castFrom(org.gtk.gobject.Object gobject) {
            return new CellRendererAccel(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_renderer_accel_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCellRendererAccel}.
     */
    public CellRendererAccel() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_cell_renderer_accel_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface AccelCleared {
        void signalReceived(CellRendererAccel source, @NotNull java.lang.String pathString);
    }
    
    /**
     * Gets emitted when the user has removed the accelerator.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<CellRendererAccel.AccelCleared> onAccelCleared(CellRendererAccel.AccelCleared handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("accel-cleared"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CellRendererAccel.Callbacks.class, "signalCellRendererAccelAccelCleared",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<CellRendererAccel.AccelEdited> onAccelEdited(CellRendererAccel.AccelEdited handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("accel-edited"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CellRendererAccel.Callbacks.class, "signalCellRendererAccelAccelEdited",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<CellRendererAccel.AccelEdited>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.CellRendererText.Build {
        
         /**
         * A {@link CellRendererAccel.Build} object constructs a {@link CellRendererAccel} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link CellRendererAccel} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CellRendererAccel} using {@link CellRendererAccel#castFrom}.
         * @return A new instance of {@code CellRendererAccel} with the properties 
         *         that were set in the Build object.
         */
        public CellRendererAccel construct() {
            return CellRendererAccel.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    CellRendererAccel.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The keyval of the accelerator.
         * @param accelKey The value for the {@code accel-key} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAccelKey(int accelKey) {
            names.add("accel-key");
            values.add(org.gtk.gobject.Value.create(accelKey));
            return this;
        }
        
        /**
         * Determines if the edited accelerators are GTK accelerators. If
         * they are, consumed modifiers are suppressed, only accelerators
         * accepted by GTK are allowed, and the accelerators are rendered
         * in the same way as they are in menus.
         * @param accelMode The value for the {@code accel-mode} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAccelMode(org.gtk.gtk.CellRendererAccelMode accelMode) {
            names.add("accel-mode");
            values.add(org.gtk.gobject.Value.create(accelMode));
            return this;
        }
        
        /**
         * The modifier mask of the accelerator.
         * @param accelMods The value for the {@code accel-mods} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAccelMods(org.gtk.gdk.ModifierType accelMods) {
            names.add("accel-mods");
            values.add(org.gtk.gobject.Value.create(accelMods));
            return this;
        }
        
        /**
         * The hardware keycode of the accelerator. Note that the hardware keycode is
         * only relevant if the key does not have a keyval. Normally, the keyboard
         * configuration should assign keyvals to all keys.
         * @param keycode The value for the {@code keycode} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setKeycode(int keycode) {
            names.add("keycode");
            values.add(org.gtk.gobject.Value.create(keycode));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_cell_renderer_accel_new = Interop.downcallHandle(
            "gtk_cell_renderer_accel_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_accel_get_type = Interop.downcallHandle(
            "gtk_cell_renderer_accel_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalCellRendererAccelAccelCleared(MemoryAddress source, MemoryAddress pathString, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (CellRendererAccel.AccelCleared) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new CellRendererAccel(source, Ownership.NONE), Interop.getStringFrom(pathString));
        }
        
        public static void signalCellRendererAccelAccelEdited(MemoryAddress source, MemoryAddress pathString, int accelKey, int accelMods, int hardwareKeycode, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (CellRendererAccel.AccelEdited) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new CellRendererAccel(source, Ownership.NONE), Interop.getStringFrom(pathString), accelKey, new org.gtk.gdk.ModifierType(accelMods), hardwareKeycode);
        }
    }
}
