package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
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

    public Box(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Box */
    public static Box castFrom(org.gtk.gobject.Object gobject) {
        return new Box(gobject.getReference());
    }
    
    private static Reference constructNew(Orientation orientation, int spacing) {
        Reference RESULT = References.get(gtk_h.gtk_box_new(orientation.getValue(), spacing), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkBox}.
     */
    public Box(Orientation orientation, int spacing) {
        super(constructNew(orientation, spacing));
    }
    
    /**
     * Adds {@code child} as the last child to {@code box}.
     */
    public void append(Widget child) {
        gtk_h.gtk_box_append(handle(), child.handle());
    }
    
    /**
     * Gets the value set by gtk_box_set_baseline_position().
     */
    public BaselinePosition getBaselinePosition() {
        var RESULT = gtk_h.gtk_box_get_baseline_position(handle());
        return new BaselinePosition(RESULT);
    }
    
    /**
     * Returns whether the box is homogeneous (all children are the
     * same size).
     */
    public boolean getHomogeneous() {
        var RESULT = gtk_h.gtk_box_get_homogeneous(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the value set by gtk_box_set_spacing().
     */
    public int getSpacing() {
        var RESULT = gtk_h.gtk_box_get_spacing(handle());
        return RESULT;
    }
    
    /**
     * Inserts {@code child} in the position after {@code sibling} in the list
     * of {@code box} children.
     * <p>
     * If {@code sibling} is {@code null}, insert {@code child} at the first position.
     */
    public void insertChildAfter(Widget child, Widget sibling) {
        gtk_h.gtk_box_insert_child_after(handle(), child.handle(), sibling.handle());
    }
    
    /**
     * Adds {@code child} as the first child to {@code box}.
     */
    public void prepend(Widget child) {
        gtk_h.gtk_box_prepend(handle(), child.handle());
    }
    
    /**
     * Removes a child widget from {@code box}.
     * <p>
     * The child must have been added before with
     * {@code Gtk.Box.prepend}, or
     * {@link Box#insertChildAfter}.
     */
    public void remove(Widget child) {
        gtk_h.gtk_box_remove(handle(), child.handle());
    }
    
    /**
     * Moves {@code child} to the position after {@code sibling} in the list
     * of {@code box} children.
     * <p>
     * If {@code sibling} is {@code null}, move {@code child} to the first position.
     */
    public void reorderChildAfter(Widget child, Widget sibling) {
        gtk_h.gtk_box_reorder_child_after(handle(), child.handle(), sibling.handle());
    }
    
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
        gtk_h.gtk_box_set_baseline_position(handle(), position.getValue());
    }
    
    /**
     * Sets whether or not all children of {@code box} are given equal space
     * in the box.
     */
    public void setHomogeneous(boolean homogeneous) {
        gtk_h.gtk_box_set_homogeneous(handle(), homogeneous ? 1 : 0);
    }
    
    /**
     * Sets the number of pixels to place between children of {@code box}.
     */
    public void setSpacing(int spacing) {
        gtk_h.gtk_box_set_spacing(handle(), spacing);
    }
    
}
