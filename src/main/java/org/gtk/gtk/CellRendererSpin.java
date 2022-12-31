package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Renders a spin button in a cell
 * <p>
 * {@code GtkCellRendererSpin} renders text in a cell like {@code GtkCellRendererText} from
 * which it is derived. But while {@code GtkCellRendererText} offers a simple entry to
 * edit the text, {@code GtkCellRendererSpin} offers a {@code GtkSpinButton} widget. Of course,
 * that means that the text has to be parseable as a floating point number.
 * <p>
 * The range of the spinbutton is taken from the adjustment property of the
 * cell renderer, which can be set explicitly or mapped to a column in the
 * tree model, like all properties of cell renders. {@code GtkCellRendererSpin}
 * also has properties for the {@code GtkCellRendererSpin:climb-rate} and the number
 * of {@code GtkCellRendererSpin:digits} to display. Other {@code GtkSpinButton} properties
 * can be set in a handler for the {@code GtkCellRenderer::editing-started} signal.
 * <p>
 * The {@code GtkCellRendererSpin} cell renderer was added in GTK 2.10.
 */
public class CellRendererSpin extends org.gtk.gtk.CellRendererText {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellRendererSpin";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a CellRendererSpin proxy instance for the provided memory address.
     * <p>
     * Because CellRendererSpin is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected CellRendererSpin(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, CellRendererSpin> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new CellRendererSpin(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_renderer_spin_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCellRendererSpin}.
     */
    public CellRendererSpin() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_cell_renderer_spin_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link CellRendererSpin.Builder} object constructs a {@link CellRendererSpin} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link CellRendererSpin.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.CellRendererText.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link CellRendererSpin} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CellRendererSpin}.
         * @return A new instance of {@code CellRendererSpin} with the properties 
         *         that were set in the Builder object.
         */
        public CellRendererSpin build() {
            return (CellRendererSpin) org.gtk.gobject.GObject.newWithProperties(
                CellRendererSpin.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The adjustment that holds the value of the spinbutton.
         * This must be non-{@code null} for the cell renderer to be editable.
         * @param adjustment The value for the {@code adjustment} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAdjustment(org.gtk.gtk.Adjustment adjustment) {
            names.add("adjustment");
            values.add(org.gtk.gobject.Value.create(adjustment));
            return this;
        }
        
        /**
         * The acceleration rate when you hold down a button.
         * @param climbRate The value for the {@code climb-rate} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setClimbRate(double climbRate) {
            names.add("climb-rate");
            values.add(org.gtk.gobject.Value.create(climbRate));
            return this;
        }
        
        /**
         * The number of decimal places to display.
         * @param digits The value for the {@code digits} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDigits(int digits) {
            names.add("digits");
            values.add(org.gtk.gobject.Value.create(digits));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_cell_renderer_spin_new = Interop.downcallHandle(
            "gtk_cell_renderer_spin_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_renderer_spin_get_type = Interop.downcallHandle(
            "gtk_cell_renderer_spin_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
