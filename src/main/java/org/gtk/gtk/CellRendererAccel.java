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
     */
    protected CellRendererAccel(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, CellRendererAccel> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new CellRendererAccel(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_cell_renderer_accel_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code AccelCleared} callback.
     */
    @FunctionalInterface
    public interface AccelCleared {
    
        /**
         * Gets emitted when the user has removed the accelerator.
         */
        void run(java.lang.String pathString);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceCellRendererAccel, MemoryAddress pathString) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(Marshal.addressToString.marshal(pathString, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AccelCleared.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Gets emitted when the user has removed the accelerator.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<CellRendererAccel.AccelCleared> onAccelCleared(CellRendererAccel.AccelCleared handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("accel-cleared", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code AccelEdited} callback.
     */
    @FunctionalInterface
    public interface AccelEdited {
    
        /**
         * Gets emitted when the user has selected a new accelerator.
         */
        void run(java.lang.String pathString, int accelKey, org.gtk.gdk.ModifierType accelMods, int hardwareKeycode);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceCellRendererAccel, MemoryAddress pathString, int accelKey, int accelMods, int hardwareKeycode) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(Marshal.addressToString.marshal(pathString, null), accelKey, new org.gtk.gdk.ModifierType(accelMods), hardwareKeycode);
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AccelEdited.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Gets emitted when the user has selected a new accelerator.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<CellRendererAccel.AccelEdited> onAccelEdited(CellRendererAccel.AccelEdited handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("accel-edited", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link CellRendererAccel.Builder} object constructs a {@link CellRendererAccel} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link CellRendererAccel.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.CellRendererText.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link CellRendererAccel} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CellRendererAccel}.
         * @return A new instance of {@code CellRendererAccel} with the properties 
         *         that were set in the Builder object.
         */
        public CellRendererAccel build() {
            return (CellRendererAccel) org.gtk.gobject.GObject.newWithProperties(
                CellRendererAccel.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The keyval of the accelerator.
         * @param accelKey The value for the {@code accel-key} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAccelKey(int accelKey) {
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
        public Builder setAccelMode(org.gtk.gtk.CellRendererAccelMode accelMode) {
            names.add("accel-mode");
            values.add(org.gtk.gobject.Value.create(accelMode));
            return this;
        }
        
        /**
         * The modifier mask of the accelerator.
         * @param accelMods The value for the {@code accel-mods} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAccelMods(org.gtk.gdk.ModifierType accelMods) {
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
        public Builder setKeycode(int keycode) {
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_cell_renderer_accel_get_type != null;
    }
}
