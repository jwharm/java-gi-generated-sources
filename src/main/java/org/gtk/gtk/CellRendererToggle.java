package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Renders a toggle button in a cell
 * <p>
 * {@code GtkCellRendererToggle} renders a toggle button in a cell. The
 * button is drawn as a radio or a checkbutton, depending on the
 * {@code GtkCellRendererToggle:radio} property.
 * When activated, it emits the {@code GtkCellRendererToggle::toggled} signal.
 */
public class CellRendererToggle extends org.gtk.gtk.CellRenderer {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellRendererToggle";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a CellRendererToggle proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected CellRendererToggle(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, CellRendererToggle> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new CellRendererToggle(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_renderer_toggle_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCellRendererToggle}. Adjust rendering
     * parameters using object properties. Object properties can be set
     * globally (with g_object_set()). Also, with {@code GtkTreeViewColumn}, you
     * can bind a property to a value in a {@code GtkTreeModel}. For example, you
     * can bind the “active” property on the cell renderer to a boolean value
     * in the model, thus causing the check button to reflect the state of
     * the model.
     */
    public CellRendererToggle() {
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Returns whether the cell renderer is activatable. See
     * gtk_cell_renderer_toggle_set_activatable().
     * @return {@code true} if the cell renderer is activatable.
     */
    public boolean getActivatable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_cell_renderer_toggle_get_activatable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns whether the cell renderer is active. See
     * gtk_cell_renderer_toggle_set_active().
     * @return {@code true} if the cell renderer is active.
     */
    public boolean getActive() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_cell_renderer_toggle_get_active.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns whether we’re rendering radio toggles rather than checkboxes.
     * @return {@code true} if we’re rendering radio toggles rather than checkboxes
     */
    public boolean getRadio() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_cell_renderer_toggle_get_radio.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Makes the cell renderer activatable.
     * @param setting the value to set.
     */
    public void setActivatable(boolean setting) {
        try {
            DowncallHandles.gtk_cell_renderer_toggle_set_activatable.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(setting, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Activates or deactivates a cell renderer.
     * @param setting the value to set.
     */
    public void setActive(boolean setting) {
        try {
            DowncallHandles.gtk_cell_renderer_toggle_set_active.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(setting, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If {@code radio} is {@code true}, the cell renderer renders a radio toggle
     * (i.e. a toggle in a group of mutually-exclusive toggles).
     * If {@code false}, it renders a check toggle (a standalone boolean option).
     * This can be set globally for the cell renderer, or changed just
     * before rendering each cell in the model (for {@code GtkTreeView}, you set
     * up a per-row setting using {@code GtkTreeViewColumn} to associate model
     * columns with cell renderer properties).
     * @param radio {@code true} to make the toggle look like a radio button
     */
    public void setRadio(boolean radio) {
        try {
            DowncallHandles.gtk_cell_renderer_toggle_set_radio.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(radio, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_cell_renderer_toggle_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Toggled} callback.
     */
    @FunctionalInterface
    public interface Toggled {
    
        /**
         * The ::toggled signal is emitted when the cell is toggled.
         * <p>
         * It is the responsibility of the application to update the model
         * with the correct value to store at {@code path}.  Often this is simply the
         * opposite of the value currently stored at {@code path}.
         */
        void run(java.lang.String path);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceCellRendererToggle, MemoryAddress path) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(Marshal.addressToString.marshal(path, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Toggled.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * The ::toggled signal is emitted when the cell is toggled.
     * <p>
     * It is the responsibility of the application to update the model
     * with the correct value to store at {@code path}.  Often this is simply the
     * opposite of the value currently stored at {@code path}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<CellRendererToggle.Toggled> onToggled(CellRendererToggle.Toggled handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("toggled", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link CellRendererToggle.Builder} object constructs a {@link CellRendererToggle} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link CellRendererToggle.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.CellRenderer.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link CellRendererToggle} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CellRendererToggle}.
         * @return A new instance of {@code CellRendererToggle} with the properties 
         *         that were set in the Builder object.
         */
        public CellRendererToggle build() {
            return (CellRendererToggle) org.gtk.gobject.GObject.newWithProperties(
                CellRendererToggle.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setActivatable(boolean activatable) {
            names.add("activatable");
            values.add(org.gtk.gobject.Value.create(activatable));
            return this;
        }
        
        public Builder setActive(boolean active) {
            names.add("active");
            values.add(org.gtk.gobject.Value.create(active));
            return this;
        }
        
        public Builder setInconsistent(boolean inconsistent) {
            names.add("inconsistent");
            values.add(org.gtk.gobject.Value.create(inconsistent));
            return this;
        }
        
        public Builder setRadio(boolean radio) {
            names.add("radio");
            values.add(org.gtk.gobject.Value.create(radio));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_cell_renderer_toggle_new = Interop.downcallHandle(
                "gtk_cell_renderer_toggle_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_cell_renderer_toggle_get_activatable = Interop.downcallHandle(
                "gtk_cell_renderer_toggle_get_activatable",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_cell_renderer_toggle_get_active = Interop.downcallHandle(
                "gtk_cell_renderer_toggle_get_active",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_cell_renderer_toggle_get_radio = Interop.downcallHandle(
                "gtk_cell_renderer_toggle_get_radio",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_cell_renderer_toggle_set_activatable = Interop.downcallHandle(
                "gtk_cell_renderer_toggle_set_activatable",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_cell_renderer_toggle_set_active = Interop.downcallHandle(
                "gtk_cell_renderer_toggle_set_active",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_cell_renderer_toggle_set_radio = Interop.downcallHandle(
                "gtk_cell_renderer_toggle_set_radio",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_cell_renderer_toggle_get_type = Interop.downcallHandle(
                "gtk_cell_renderer_toggle_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_cell_renderer_toggle_get_type != null;
    }
}
