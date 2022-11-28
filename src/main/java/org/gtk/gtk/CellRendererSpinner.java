package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Renders a spinning animation in a cell
 * <p>
 * {@code GtkCellRendererSpinner} renders a spinning animation in a cell, very
 * similar to {@code GtkSpinner}. It can often be used as an alternative
 * to a {@code GtkCellRendererProgress} for displaying indefinite activity,
 * instead of actual progress.
 * <p>
 * To start the animation in a cell, set the {@code GtkCellRendererSpinner:active}
 * property to {@code true} and increment the {@code GtkCellRendererSpinner:pulse} property
 * at regular intervals. The usual way to set the cell renderer properties
 * for each cell is to bind them to columns in your tree model using e.g.
 * gtk_tree_view_column_add_attribute().
 */
public class CellRendererSpinner extends org.gtk.gtk.CellRenderer {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellRendererSpinner";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a CellRendererSpinner proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CellRendererSpinner(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to CellRendererSpinner if its GType is a (or inherits from) "GtkCellRendererSpinner".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code CellRendererSpinner} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkCellRendererSpinner", a ClassCastException will be thrown.
     */
    public static CellRendererSpinner castFrom(org.gtk.gobject.Object gobject) {
            return new CellRendererSpinner(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_renderer_spinner_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns a new cell renderer which will show a spinner to indicate
     * activity.
     */
    public CellRendererSpinner() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_cell_renderer_spinner_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.CellRenderer.Build {
        
         /**
         * A {@link CellRendererSpinner.Build} object constructs a {@link CellRendererSpinner} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link CellRendererSpinner} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CellRendererSpinner} using {@link CellRendererSpinner#castFrom}.
         * @return A new instance of {@code CellRendererSpinner} with the properties 
         *         that were set in the Build object.
         */
        public CellRendererSpinner construct() {
            return CellRendererSpinner.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    CellRendererSpinner.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setActive(boolean active) {
            names.add("active");
            values.add(org.gtk.gobject.Value.create(active));
            return this;
        }
        
        /**
         * Pulse of the spinner. Increment this value to draw the next frame of the
         * spinner animation. Usually, you would update this value in a timeout.
         * <p>
         * By default, the {@code GtkSpinner} widget draws one full cycle of the animation,
         * consisting of 12 frames, in 750 milliseconds.
         * @param pulse The value for the {@code pulse} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPulse(int pulse) {
            names.add("pulse");
            values.add(org.gtk.gobject.Value.create(pulse));
            return this;
        }
        
        /**
         * The {@code GtkIconSize} value that specifies the size of the rendered spinner.
         * @param size The value for the {@code size} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSize(org.gtk.gtk.IconSize size) {
            names.add("size");
            values.add(org.gtk.gobject.Value.create(size));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_cell_renderer_spinner_new = Interop.downcallHandle(
            "gtk_cell_renderer_spinner_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_spinner_get_type = Interop.downcallHandle(
            "gtk_cell_renderer_spinner_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
