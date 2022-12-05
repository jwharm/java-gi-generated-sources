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
     * <p>
     * Because CellRendererToggle is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CellRendererToggle(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to CellRendererToggle if its GType is a (or inherits from) "GtkCellRendererToggle".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code CellRendererToggle} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkCellRendererToggle", a ClassCastException will be thrown.
     */
    public static CellRendererToggle castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), CellRendererToggle.getType())) {
            return new CellRendererToggle(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkCellRendererToggle");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Returns whether the cell renderer is activatable. See
     * gtk_cell_renderer_toggle_set_activatable().
     * @return {@code true} if the cell renderer is activatable.
     */
    public boolean getActivatable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_cell_renderer_toggle_get_activatable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the cell renderer is active. See
     * gtk_cell_renderer_toggle_set_active().
     * @return {@code true} if the cell renderer is active.
     */
    public boolean getActive() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_cell_renderer_toggle_get_active.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether we’re rendering radio toggles rather than checkboxes.
     * @return {@code true} if we’re rendering radio toggles rather than checkboxes
     */
    public boolean getRadio() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_cell_renderer_toggle_get_radio.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Makes the cell renderer activatable.
     * @param setting the value to set.
     */
    public void setActivatable(boolean setting) {
        try {
            DowncallHandles.gtk_cell_renderer_toggle_set_activatable.invokeExact(
                    handle(),
                    setting ? 1 : 0);
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
                    setting ? 1 : 0);
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
                    radio ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_cell_renderer_toggle_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface Toggled {
        void signalReceived(CellRendererToggle sourceCellRendererToggle, @NotNull java.lang.String path);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("toggled"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(CellRendererToggle.Callbacks.class, "signalCellRendererToggleToggled",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<CellRendererToggle.Toggled>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.CellRenderer.Build {
        
         /**
         * A {@link CellRendererToggle.Build} object constructs a {@link CellRendererToggle} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link CellRendererToggle} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CellRendererToggle} using {@link CellRendererToggle#castFrom}.
         * @return A new instance of {@code CellRendererToggle} with the properties 
         *         that were set in the Build object.
         */
        public CellRendererToggle construct() {
            return CellRendererToggle.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    CellRendererToggle.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setActivatable(boolean activatable) {
            names.add("activatable");
            values.add(org.gtk.gobject.Value.create(activatable));
            return this;
        }
        
        public Build setActive(boolean active) {
            names.add("active");
            values.add(org.gtk.gobject.Value.create(active));
            return this;
        }
        
        public Build setInconsistent(boolean inconsistent) {
            names.add("inconsistent");
            values.add(org.gtk.gobject.Value.create(inconsistent));
            return this;
        }
        
        public Build setRadio(boolean radio) {
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
    
    private static class Callbacks {
        
        public static void signalCellRendererToggleToggled(MemoryAddress sourceCellRendererToggle, MemoryAddress path, MemoryAddress DATA) {
            int HASH = DATA.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (CellRendererToggle.Toggled) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new CellRendererToggle(sourceCellRendererToggle, Ownership.NONE), Interop.getStringFrom(path));
        }
    }
}
