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
     * <p>
     * Because CellRendererSpinner is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected CellRendererSpinner(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, CellRendererSpinner> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new CellRendererSpinner(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_cell_renderer_spinner_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link CellRendererSpinner.Builder} object constructs a {@link CellRendererSpinner} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link CellRendererSpinner.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.CellRenderer.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link CellRendererSpinner} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CellRendererSpinner}.
         * @return A new instance of {@code CellRendererSpinner} with the properties 
         *         that were set in the Builder object.
         */
        public CellRendererSpinner build() {
            return (CellRendererSpinner) org.gtk.gobject.GObject.newWithProperties(
                CellRendererSpinner.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setActive(boolean active) {
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
        public Builder setPulse(int pulse) {
            names.add("pulse");
            values.add(org.gtk.gobject.Value.create(pulse));
            return this;
        }
        
        /**
         * The {@code GtkIconSize} value that specifies the size of the rendered spinner.
         * @param size The value for the {@code size} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSize(org.gtk.gtk.IconSize size) {
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
