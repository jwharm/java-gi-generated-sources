package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The `GtkBox` widget arranges child widgets into a single row or column.
 * 
 * ![An example GtkBox](box.png)
 * 
 * Whether it is a row or column depends on the value of its
 * [property@Gtk.Orientable:orientation] property. Within the other
 * dimension, all children are allocated the same size. Of course, the
 * [property@Gtk.Widget:halign] and [property@Gtk.Widget:valign] properties
 * can be used on the children to influence their allocation.
 * 
 * Use repeated calls to [method@Gtk.Box.append] to pack widgets into a
 * `GtkBox` from start to end. Use [method@Gtk.Box.remove] to remove widgets
 * from the `GtkBox`. [method@Gtk.Box.insert_child_after] can be used to add
 * a child at a particular position.
 * 
 * Use [method@Gtk.Box.set_homogeneous] to specify whether or not all children
 * of the `GtkBox` are forced to get the same amount of space.
 * 
 * Use [method@Gtk.Box.set_spacing] to determine how much space will be minimally
 * placed between all children in the `GtkBox`. Note that spacing is added
 * *between* the children.
 * 
 * Use [method@Gtk.Box.reorder_child_after] to move a child to a different
 * place in the box.
 * 
 * # CSS nodes
 * 
 * `GtkBox` uses a single CSS node with name box.
 * 
 * # Accessibility
 * 
 * `GtkBox` uses the %GTK_ACCESSIBLE_ROLE_GROUP role.
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
     * Creates a new `GtkBox`.
     */
    public Box(Orientation orientation, int spacing) {
        super(constructNew(orientation, spacing));
    }
    
    /**
     * Adds @child as the last child to @box.
     */
    public void append(Widget child) {
        gtk_h.gtk_box_append(handle(), child.handle());
    }
    
    /**
     * Gets the value set by gtk_box_set_baseline_position().
     */
    public BaselinePosition getBaselinePosition() {
        var RESULT = gtk_h.gtk_box_get_baseline_position(handle());
        return BaselinePosition.fromValue(RESULT);
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
     * Inserts @child in the position after @sibling in the list
     * of @box children.
     * 
     * If @sibling is %NULL, insert @child at the first position.
     */
    public void insertChildAfter(Widget child, Widget sibling) {
        gtk_h.gtk_box_insert_child_after(handle(), child.handle(), sibling.handle());
    }
    
    /**
     * Adds @child as the first child to @box.
     */
    public void prepend(Widget child) {
        gtk_h.gtk_box_prepend(handle(), child.handle());
    }
    
    /**
     * Removes a child widget from @box.
     * 
     * The child must have been added before with
     * [method@Gtk.Box.append], [method@Gtk.Box.prepend], or
     * [method@Gtk.Box.insert_child_after].
     */
    public void remove(Widget child) {
        gtk_h.gtk_box_remove(handle(), child.handle());
    }
    
    /**
     * Moves @child to the position after @sibling in the list
     * of @box children.
     * 
     * If @sibling is %NULL, move @child to the first position.
     */
    public void reorderChildAfter(Widget child, Widget sibling) {
        gtk_h.gtk_box_reorder_child_after(handle(), child.handle(), sibling.handle());
    }
    
    /**
     * Sets the baseline position of a box.
     * 
     * This affects only horizontal boxes with at least one baseline
     * aligned child. If there is more vertical space available than
     * requested, and the baseline is not allocated by the parent then
     * @position is used to allocate the baseline with respect to the
     * extra space available.
     */
    public void setBaselinePosition(BaselinePosition position) {
        gtk_h.gtk_box_set_baseline_position(handle(), position.getValue());
    }
    
    /**
     * Sets whether or not all children of @box are given equal space
     * in the box.
     */
    public void setHomogeneous(boolean homogeneous) {
        gtk_h.gtk_box_set_homogeneous(handle(), homogeneous ? 1 : 0);
    }
    
    /**
     * Sets the number of pixels to place between children of @box.
     */
    public void setSpacing(int spacing) {
        gtk_h.gtk_box_set_spacing(handle(), spacing);
    }
    
}
