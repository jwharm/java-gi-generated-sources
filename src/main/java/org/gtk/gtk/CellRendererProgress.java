package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Renders numbers as progress bars
 * <p>
 * {@code GtkCellRendererProgress} renders a numeric value as a progress par in a cell.
 * Additionally, it can display a text on top of the progress bar.
 */
public class CellRendererProgress extends org.gtk.gtk.CellRenderer implements org.gtk.gtk.Orientable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellRendererProgress";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a CellRendererProgress proxy instance for the provided memory address.
     * <p>
     * Because CellRendererProgress is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected CellRendererProgress(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, CellRendererProgress> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new CellRendererProgress(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_renderer_progress_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCellRendererProgress}.
     */
    public CellRendererProgress() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_cell_renderer_progress_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link CellRendererProgress.Builder} object constructs a {@link CellRendererProgress} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link CellRendererProgress.Builder#build()}. 
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
         * Finish building the {@link CellRendererProgress} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CellRendererProgress}.
         * @return A new instance of {@code CellRendererProgress} with the properties 
         *         that were set in the Builder object.
         */
        public CellRendererProgress build() {
            return (CellRendererProgress) org.gtk.gobject.GObject.newWithProperties(
                CellRendererProgress.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setInverted(boolean inverted) {
            names.add("inverted");
            values.add(org.gtk.gobject.Value.create(inverted));
            return this;
        }
        
        /**
         * Setting this to a non-negative value causes the cell renderer to
         * enter "activity mode", where a block bounces back and forth to
         * indicate that some progress is made, without specifying exactly how
         * much.
         * <p>
         * Each increment of the property causes the block to move by a little
         * bit.
         * <p>
         * To indicate that the activity has not started yet, set the property
         * to zero. To indicate completion, set the property to {@code G_MAXINT}.
         * @param pulse The value for the {@code pulse} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPulse(int pulse) {
            names.add("pulse");
            values.add(org.gtk.gobject.Value.create(pulse));
            return this;
        }
        
        /**
         * The "text" property determines the label which will be drawn
         * over the progress bar. Setting this property to {@code null} causes the default
         * label to be displayed. Setting this property to an empty string causes
         * no label to be displayed.
         * @param text The value for the {@code text} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setText(java.lang.String text) {
            names.add("text");
            values.add(org.gtk.gobject.Value.create(text));
            return this;
        }
        
        /**
         * The "text-xalign" property controls the horizontal alignment of the
         * text in the progress bar.  Valid values range from 0 (left) to 1
         * (right).  Reserved for RTL layouts.
         * @param textXalign The value for the {@code text-xalign} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTextXalign(float textXalign) {
            names.add("text-xalign");
            values.add(org.gtk.gobject.Value.create(textXalign));
            return this;
        }
        
        /**
         * The "text-yalign" property controls the vertical alignment of the
         * text in the progress bar.  Valid values range from 0 (top) to 1
         * (bottom).
         * @param textYalign The value for the {@code text-yalign} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTextYalign(float textYalign) {
            names.add("text-yalign");
            values.add(org.gtk.gobject.Value.create(textYalign));
            return this;
        }
        
        /**
         * The "value" property determines the percentage to which the
         * progress bar will be "filled in".
         * @param value The value for the {@code value} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValue(int value) {
            names.add("value");
            values.add(org.gtk.gobject.Value.create(value));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_cell_renderer_progress_new = Interop.downcallHandle(
            "gtk_cell_renderer_progress_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_progress_get_type = Interop.downcallHandle(
            "gtk_cell_renderer_progress_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
