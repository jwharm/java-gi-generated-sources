package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
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

    public Box(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Box */
    public static Box castFrom(org.gtk.gobject.Object gobject) {
        return new Box(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkBox`.
     */
    public Box(Orientation orientation, int spacing) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_box_new(orientation.getValue(), spacing), false));
    }
    
    /**
     * Adds @child as the last child to @box.
     */
    public void append(Widget child) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_box_append(HANDLE(), child.HANDLE());
    }
    
    /**
     * Gets the value set by gtk_box_set_baseline_position().
     */
    public BaselinePosition getBaselinePosition() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_box_get_baseline_position(HANDLE());
        return BaselinePosition.fromValue(RESULT);
    }
    
    /**
     * Returns whether the box is homogeneous (all children are the
     * same size).
     */
    public boolean getHomogeneous() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_box_get_homogeneous(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the value set by gtk_box_set_spacing().
     */
    public int getSpacing() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_box_get_spacing(HANDLE());
        return RESULT;
    }
    
    /**
     * Inserts @child in the position after @sibling in the list
     * of @box children.
     * 
     * If @sibling is %NULL, insert @child at the first position.
     */
    public void insertChildAfter(Widget child, Widget sibling) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_box_insert_child_after(HANDLE(), child.HANDLE(), sibling.HANDLE());
    }
    
    /**
     * Adds @child as the first child to @box.
     */
    public void prepend(Widget child) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_box_prepend(HANDLE(), child.HANDLE());
    }
    
    /**
     * Removes a child widget from @box.
     * 
     * The child must have been added before with
     * [method@Gtk.Box.append], [method@Gtk.Box.prepend], or
     * [method@Gtk.Box.insert_child_after].
     */
    public void remove(Widget child) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_box_remove(HANDLE(), child.HANDLE());
    }
    
    /**
     * Moves @child to the position after @sibling in the list
     * of @box children.
     * 
     * If @sibling is %NULL, move @child to the first position.
     */
    public void reorderChildAfter(Widget child, Widget sibling) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_box_reorder_child_after(HANDLE(), child.HANDLE(), sibling.HANDLE());
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_box_set_baseline_position(HANDLE(), position.getValue());
    }
    
    /**
     * Sets whether or not all children of @box are given equal space
     * in the box.
     */
    public void setHomogeneous(boolean homogeneous) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_box_set_homogeneous(HANDLE(), homogeneous ? 1 : 0);
    }
    
    /**
     * Sets the number of pixels to place between children of @box.
     */
    public void setSpacing(int spacing) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_box_set_spacing(HANDLE(), spacing);
    }
    
}
