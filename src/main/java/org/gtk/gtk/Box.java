package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@code GtkBox} widget arranges child widgets into a single row or column.
 * <p>
 * <img src="./doc-files/box.png" alt="An example GtkBox">
 * <p>
 * Whether it is a row or column depends on the value of its
 * {@code Gtk.Orientable:orientation} property. Within the other
 * dimension, all children are allocated the same size. Of course, the
 * {@code Gtk.Widget:valign} properties
 * can be used on the children to influence their allocation.
 * <p>
 * Use repeated calls to {@link Box#append} to pack widgets into a
 * {@code GtkBox} from start to end. Use {@link Box#remove} to remove widgets
 * from the {@code GtkBox}. {@link Box#insertChildAfter} can be used to add
 * a child at a particular position.
 * <p>
 * Use {@link Box#setHomogeneous} to specify whether or not all children
 * of the {@code GtkBox} are forced to get the same amount of space.
 * <p>
 * Use {@link Box#setSpacing} to determine how much space will be minimally
 * placed between all children in the {@code GtkBox}. Note that spacing is added
 * <strong>between</strong> the children.
 * <p>
 * Use {@link Box#reorderChildAfter} to move a child to a different
 * place in the box.
 * <p>
 * <h1>CSS nodes</h1>
 * <p>
 * {@code GtkBox} uses a single CSS node with name box.
 * <p>
 * <h1>Accessibility</h1>
 * <p>
 * {@code GtkBox} uses the {@link AccessibleRole#GROUP} role.
 */
public class Box extends Widget implements Accessible, Buildable, ConstraintTarget, Orientable {

    public Box(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Box */
    public static Box castFrom(org.gtk.gobject.Object gobject) {
        return new Box(gobject.refcounted());
    }
    
    static final MethodHandle gtk_box_new = Interop.downcallHandle(
        "gtk_box_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(Orientation orientation, int spacing) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_box_new.invokeExact(orientation.getValue(), spacing), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkBox}.
     */
    public Box(Orientation orientation, int spacing) {
        super(constructNew(orientation, spacing));
    }
    
    static final MethodHandle gtk_box_append = Interop.downcallHandle(
        "gtk_box_append",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds {@code child} as the last child to {@code box}.
     */
    public void append(Widget child) {
        try {
            gtk_box_append.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_box_get_baseline_position = Interop.downcallHandle(
        "gtk_box_get_baseline_position",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value set by gtk_box_set_baseline_position().
     */
    public BaselinePosition getBaselinePosition() {
        try {
            var RESULT = (int) gtk_box_get_baseline_position.invokeExact(handle());
            return new BaselinePosition(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_box_get_homogeneous = Interop.downcallHandle(
        "gtk_box_get_homogeneous",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the box is homogeneous (all children are the
     * same size).
     */
    public boolean getHomogeneous() {
        try {
            var RESULT = (int) gtk_box_get_homogeneous.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_box_get_spacing = Interop.downcallHandle(
        "gtk_box_get_spacing",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the value set by gtk_box_set_spacing().
     */
    public int getSpacing() {
        try {
            var RESULT = (int) gtk_box_get_spacing.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_box_insert_child_after = Interop.downcallHandle(
        "gtk_box_insert_child_after",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts {@code child} in the position after {@code sibling} in the list
     * of {@code box} children.
     * <p>
     * If {@code sibling} is {@code null}, insert {@code child} at the first position.
     */
    public void insertChildAfter(Widget child, Widget sibling) {
        try {
            gtk_box_insert_child_after.invokeExact(handle(), child.handle(), sibling.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_box_prepend = Interop.downcallHandle(
        "gtk_box_prepend",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds {@code child} as the first child to {@code box}.
     */
    public void prepend(Widget child) {
        try {
            gtk_box_prepend.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_box_remove = Interop.downcallHandle(
        "gtk_box_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a child widget from {@code box}.
     * <p>
     * The child must have been added before with
     * {@code Gtk.Box.prepend}, or
     * {@link Box#insertChildAfter}.
     */
    public void remove(Widget child) {
        try {
            gtk_box_remove.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_box_reorder_child_after = Interop.downcallHandle(
        "gtk_box_reorder_child_after",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Moves {@code child} to the position after {@code sibling} in the list
     * of {@code box} children.
     * <p>
     * If {@code sibling} is {@code null}, move {@code child} to the first position.
     */
    public void reorderChildAfter(Widget child, Widget sibling) {
        try {
            gtk_box_reorder_child_after.invokeExact(handle(), child.handle(), sibling.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_box_set_baseline_position = Interop.downcallHandle(
        "gtk_box_set_baseline_position",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the baseline position of a box.
     * <p>
     * This affects only horizontal boxes with at least one baseline
     * aligned child. If there is more vertical space available than
     * requested, and the baseline is not allocated by the parent then
     * {@code position} is used to allocate the baseline with respect to the
     * extra space available.
     */
    public void setBaselinePosition(BaselinePosition position) {
        try {
            gtk_box_set_baseline_position.invokeExact(handle(), position.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_box_set_homogeneous = Interop.downcallHandle(
        "gtk_box_set_homogeneous",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether or not all children of {@code box} are given equal space
     * in the box.
     */
    public void setHomogeneous(boolean homogeneous) {
        try {
            gtk_box_set_homogeneous.invokeExact(handle(), homogeneous ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_box_set_spacing = Interop.downcallHandle(
        "gtk_box_set_spacing",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the number of pixels to place between children of {@code box}.
     */
    public void setSpacing(int spacing) {
        try {
            gtk_box_set_spacing.invokeExact(handle(), spacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
