package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkBoxLayout} is a layout manager that arranges children in a single
 * row or column.
 * <p>
 * Whether it is a row or column depends on the value of its
 * {@code Gtk.Orientable:orientation} property. Within the other dimension
 * all children all allocated the same size. The {@code GtkBoxLayout} will respect
 * the {@code Gtk.Widget:valign}
 * properties of each child widget.
 * <p>
 * If you want all children to be assigned the same size, you can use
 * the {@code Gtk.BoxLayout:homogeneous} property.
 * <p>
 * If you want to specify the amount of space placed between each child,
 * you can use the {@code Gtk.BoxLayout:spacing} property.
 */
public class BoxLayout extends LayoutManager implements Orientable {

    public BoxLayout(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to BoxLayout */
    public static BoxLayout castFrom(org.gtk.gobject.Object gobject) {
        return new BoxLayout(gobject.refcounted());
    }
    
    static final MethodHandle gtk_box_layout_new = Interop.downcallHandle(
        "gtk_box_layout_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(Orientation orientation) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_box_layout_new.invokeExact(orientation.getValue()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkBoxLayout}.
     */
    public BoxLayout(Orientation orientation) {
        super(constructNew(orientation));
    }
    
    static final MethodHandle gtk_box_layout_get_baseline_position = Interop.downcallHandle(
        "gtk_box_layout_get_baseline_position",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value set by gtk_box_layout_set_baseline_position().
     */
    public BaselinePosition getBaselinePosition() {
        try {
            var RESULT = (int) gtk_box_layout_get_baseline_position.invokeExact(handle());
            return new BaselinePosition(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_box_layout_get_homogeneous = Interop.downcallHandle(
        "gtk_box_layout_get_homogeneous",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the layout is set to be homogeneous.
     */
    public boolean getHomogeneous() {
        try {
            var RESULT = (int) gtk_box_layout_get_homogeneous.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_box_layout_get_spacing = Interop.downcallHandle(
        "gtk_box_layout_get_spacing",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the space that {@code box_layout} puts between children.
     */
    public int getSpacing() {
        try {
            var RESULT = (int) gtk_box_layout_get_spacing.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_box_layout_set_baseline_position = Interop.downcallHandle(
        "gtk_box_layout_set_baseline_position",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the baseline position of a box layout.
     * <p>
     * The baseline position affects only horizontal boxes with at least one
     * baseline aligned child. If there is more vertical space available than
     * requested, and the baseline is not allocated by the parent then the
     * given {@code position} is used to allocate the baseline within the extra
     * space available.
     */
    public void setBaselinePosition(BaselinePosition position) {
        try {
            gtk_box_layout_set_baseline_position.invokeExact(handle(), position.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_box_layout_set_homogeneous = Interop.downcallHandle(
        "gtk_box_layout_set_homogeneous",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the box layout will allocate the same
     * size to all children.
     */
    public void setHomogeneous(boolean homogeneous) {
        try {
            gtk_box_layout_set_homogeneous.invokeExact(handle(), homogeneous ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_box_layout_set_spacing = Interop.downcallHandle(
        "gtk_box_layout_set_spacing",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets how much spacing to put between children.
     */
    public void setSpacing(int spacing) {
        try {
            gtk_box_layout_set_spacing.invokeExact(handle(), spacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
