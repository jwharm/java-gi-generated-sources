package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkBoxLayout} is a layout manager that arranges children in a single
 * row or column.
 * <p>
 * Whether it is a row or column depends on the value of its
 * {@code Gtk.Orientable:orientation} property. Within the other dimension
 * all children all allocated the same size. The {@code GtkBoxLayout} will respect
 * the {@code Gtk.Widget:halign} and {@code Gtk.Widget:valign}
 * properties of each child widget.
 * <p>
 * If you want all children to be assigned the same size, you can use
 * the {@code Gtk.BoxLayout:homogeneous} property.
 * <p>
 * If you want to specify the amount of space placed between each child,
 * you can use the {@code Gtk.BoxLayout:spacing} property.
 */
public class BoxLayout extends org.gtk.gtk.LayoutManager implements org.gtk.gtk.Orientable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkBoxLayout";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a BoxLayout proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public BoxLayout(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to BoxLayout if its GType is a (or inherits from) "GtkBoxLayout".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code BoxLayout} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkBoxLayout", a ClassCastException will be thrown.
     */
    public static BoxLayout castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkBoxLayout"))) {
            return new BoxLayout(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkBoxLayout");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gtk.Orientation orientation) {
        java.util.Objects.requireNonNull(orientation, "Parameter 'orientation' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_box_layout_new.invokeExact(
                    orientation.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkBoxLayout}.
     * @param orientation the orientation for the new layout
     */
    public BoxLayout(@NotNull org.gtk.gtk.Orientation orientation) {
        super(constructNew(orientation), Ownership.FULL);
    }
    
    /**
     * Gets the value set by gtk_box_layout_set_baseline_position().
     * @return the baseline position
     */
    public @NotNull org.gtk.gtk.BaselinePosition getBaselinePosition() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_box_layout_get_baseline_position.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.BaselinePosition(RESULT);
    }
    
    /**
     * Returns whether the layout is set to be homogeneous.
     * @return {@code true} if the layout is homogeneous
     */
    public boolean getHomogeneous() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_box_layout_get_homogeneous.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the space that {@code box_layout} puts between children.
     * @return the spacing of the layout
     */
    public int getSpacing() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_box_layout_get_spacing.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets the baseline position of a box layout.
     * <p>
     * The baseline position affects only horizontal boxes with at least one
     * baseline aligned child. If there is more vertical space available than
     * requested, and the baseline is not allocated by the parent then the
     * given {@code position} is used to allocate the baseline within the extra
     * space available.
     * @param position a {@code GtkBaselinePosition}
     */
    public void setBaselinePosition(@NotNull org.gtk.gtk.BaselinePosition position) {
        java.util.Objects.requireNonNull(position, "Parameter 'position' must not be null");
        try {
            DowncallHandles.gtk_box_layout_set_baseline_position.invokeExact(
                    handle(),
                    position.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the box layout will allocate the same
     * size to all children.
     * @param homogeneous {@code true} to set the box layout as homogeneous
     */
    public void setHomogeneous(boolean homogeneous) {
        try {
            DowncallHandles.gtk_box_layout_set_homogeneous.invokeExact(
                    handle(),
                    homogeneous ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets how much spacing to put between children.
     * @param spacing the spacing to apply between children
     */
    public void setSpacing(int spacing) {
        try {
            DowncallHandles.gtk_box_layout_set_spacing.invokeExact(
                    handle(),
                    spacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_box_layout_new = Interop.downcallHandle(
            "gtk_box_layout_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_box_layout_get_baseline_position = Interop.downcallHandle(
            "gtk_box_layout_get_baseline_position",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_box_layout_get_homogeneous = Interop.downcallHandle(
            "gtk_box_layout_get_homogeneous",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_box_layout_get_spacing = Interop.downcallHandle(
            "gtk_box_layout_get_spacing",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_box_layout_set_baseline_position = Interop.downcallHandle(
            "gtk_box_layout_set_baseline_position",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_box_layout_set_homogeneous = Interop.downcallHandle(
            "gtk_box_layout_set_homogeneous",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_box_layout_set_spacing = Interop.downcallHandle(
            "gtk_box_layout_set_spacing",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
}
