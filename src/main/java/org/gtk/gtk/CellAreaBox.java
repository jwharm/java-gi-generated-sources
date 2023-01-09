package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A cell area that renders GtkCellRenderers into a row or a column
 * <p>
 * The {@code GtkCellAreaBox} renders cell renderers into a row or a column
 * depending on its {@code GtkOrientation}.
 * <p>
 * GtkCellAreaBox uses a notion of packing. Packing
 * refers to adding cell renderers with reference to a particular position
 * in a {@code GtkCellAreaBox}. There are two reference positions: the
 * start and the end of the box.
 * When the {@code GtkCellAreaBox} is oriented in the {@link Orientation#VERTICAL}
 * orientation, the start is defined as the top of the box and the end is
 * defined as the bottom. In the {@link Orientation#HORIZONTAL} orientation
 * start is defined as the left side and the end is defined as the right
 * side.
 * <p>
 * Alignments of {@code GtkCellRenderer}s rendered in adjacent rows can be
 * configured by configuring the {@code GtkCellAreaBox} align child cell property
 * with gtk_cell_area_cell_set_property() or by specifying the "align"
 * argument to gtk_cell_area_box_pack_start() and gtk_cell_area_box_pack_end().
 */
public class CellAreaBox extends org.gtk.gtk.CellArea implements org.gtk.gtk.Buildable, org.gtk.gtk.CellLayout, org.gtk.gtk.Orientable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellAreaBox";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a CellAreaBox proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected CellAreaBox(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, CellAreaBox> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new CellAreaBox(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cell_area_box_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkCellAreaBox}.
     */
    public CellAreaBox() {
        super(constructNew());
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Gets the spacing added between cell renderers.
     * @return the space added between cell renderers in {@code box}.
     */
    public int getSpacing() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_cell_area_box_get_spacing.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Adds {@code renderer} to {@code box}, packed with reference to the end of {@code box}.
     * <p>
     * The {@code renderer} is packed after (away from end of) any other
     * {@code GtkCellRenderer} packed with reference to the end of {@code box}.
     * @param renderer the {@code GtkCellRenderer} to add
     * @param expand whether {@code renderer} should receive extra space when the area receives
     * more than its natural size
     * @param align whether {@code renderer} should be aligned in adjacent rows
     * @param fixed whether {@code renderer} should have the same size in all rows
     */
    public void packEnd(org.gtk.gtk.CellRenderer renderer, boolean expand, boolean align, boolean fixed) {
        try {
            DowncallHandles.gtk_cell_area_box_pack_end.invokeExact(
                    handle(),
                    renderer.handle(),
                    Marshal.booleanToInteger.marshal(expand, null).intValue(),
                    Marshal.booleanToInteger.marshal(align, null).intValue(),
                    Marshal.booleanToInteger.marshal(fixed, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds {@code renderer} to {@code box}, packed with reference to the start of {@code box}.
     * <p>
     * The {@code renderer} is packed after any other {@code GtkCellRenderer} packed
     * with reference to the start of {@code box}.
     * @param renderer the {@code GtkCellRenderer} to add
     * @param expand whether {@code renderer} should receive extra space when the area receives
     * more than its natural size
     * @param align whether {@code renderer} should be aligned in adjacent rows
     * @param fixed whether {@code renderer} should have the same size in all rows
     */
    public void packStart(org.gtk.gtk.CellRenderer renderer, boolean expand, boolean align, boolean fixed) {
        try {
            DowncallHandles.gtk_cell_area_box_pack_start.invokeExact(
                    handle(),
                    renderer.handle(),
                    Marshal.booleanToInteger.marshal(expand, null).intValue(),
                    Marshal.booleanToInteger.marshal(align, null).intValue(),
                    Marshal.booleanToInteger.marshal(fixed, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the spacing to add between cell renderers in {@code box}.
     * @param spacing the space to add between {@code GtkCellRenderer}s
     */
    public void setSpacing(int spacing) {
        try {
            DowncallHandles.gtk_cell_area_box_set_spacing.invokeExact(
                    handle(),
                    spacing);
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
            RESULT = (long) DowncallHandles.gtk_cell_area_box_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link CellAreaBox.Builder} object constructs a {@link CellAreaBox} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link CellAreaBox.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.CellArea.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link CellAreaBox} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CellAreaBox}.
         * @return A new instance of {@code CellAreaBox} with the properties 
         *         that were set in the Builder object.
         */
        public CellAreaBox build() {
            return (CellAreaBox) org.gtk.gobject.GObject.newWithProperties(
                CellAreaBox.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The amount of space to reserve between cells.
         * @param spacing The value for the {@code spacing} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSpacing(int spacing) {
            names.add("spacing");
            values.add(org.gtk.gobject.Value.create(spacing));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_cell_area_box_new = Interop.downcallHandle(
                "gtk_cell_area_box_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_cell_area_box_get_spacing = Interop.downcallHandle(
                "gtk_cell_area_box_get_spacing",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_cell_area_box_pack_end = Interop.downcallHandle(
                "gtk_cell_area_box_pack_end",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_cell_area_box_pack_start = Interop.downcallHandle(
                "gtk_cell_area_box_pack_start",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_cell_area_box_set_spacing = Interop.downcallHandle(
                "gtk_cell_area_box_set_spacing",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_cell_area_box_get_type = Interop.downcallHandle(
                "gtk_cell_area_box_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_cell_area_box_get_type != null;
    }
}
