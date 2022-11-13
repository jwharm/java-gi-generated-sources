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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CellAreaBox(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to CellAreaBox if its GType is a (or inherits from) "GtkCellAreaBox".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code CellAreaBox} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkCellAreaBox", a ClassCastException will be thrown.
     */
    public static CellAreaBox castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkCellAreaBox"))) {
            return new CellAreaBox(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkCellAreaBox");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Gets the spacing added between cell renderers.
     * @return the space added between cell renderers in {@code box}.
     */
    public int getSpacing() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_cell_area_box_get_spacing.invokeExact(
                    handle());
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
    public void packEnd(@NotNull org.gtk.gtk.CellRenderer renderer, boolean expand, boolean align, boolean fixed) {
        java.util.Objects.requireNonNull(renderer, "Parameter 'renderer' must not be null");
        try {
            DowncallHandles.gtk_cell_area_box_pack_end.invokeExact(
                    handle(),
                    renderer.handle(),
                    expand ? 1 : 0,
                    align ? 1 : 0,
                    fixed ? 1 : 0);
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
    public void packStart(@NotNull org.gtk.gtk.CellRenderer renderer, boolean expand, boolean align, boolean fixed) {
        java.util.Objects.requireNonNull(renderer, "Parameter 'renderer' must not be null");
        try {
            DowncallHandles.gtk_cell_area_box_pack_start.invokeExact(
                    handle(),
                    renderer.handle(),
                    expand ? 1 : 0,
                    align ? 1 : 0,
                    fixed ? 1 : 0);
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
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_cell_area_box_new = Interop.downcallHandle(
            "gtk_cell_area_box_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_box_get_spacing = Interop.downcallHandle(
            "gtk_cell_area_box_get_spacing",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cell_area_box_pack_end = Interop.downcallHandle(
            "gtk_cell_area_box_pack_end",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_cell_area_box_pack_start = Interop.downcallHandle(
            "gtk_cell_area_box_pack_start",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_cell_area_box_set_spacing = Interop.downcallHandle(
            "gtk_cell_area_box_set_spacing",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
}
