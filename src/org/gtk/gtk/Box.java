package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The <code>GtkBox</code> widget arranges child widgets into a single row or column.
 * <p>
 * !{@link [An example GtkBox]}(box.png)
 * <p>
 * Whether it is a row or column depends on the value of its
 * {@link [property@Gtk.Orientable:orientation] (ref=property)} property. Within the other
 * dimension, all children are allocated the same size. Of course, the
 * {@link [property@Gtk.Widget:halign] (ref=property)} and {@link [property@Gtk.Widget:valign] (ref=property)} properties
 * can be used on the children to influence their allocation.
 * <p>
 * Use repeated calls to {@link org.gtk.gtk.Box#append} to pack widgets into a<code>GtkBox</code> from start to end. Use {@link org.gtk.gtk.Box#remove} to remove widgets
 * from the <code>GtkBox</code>. {@link org.gtk.gtk.Box#insertChildAfter} can be used to add
 * a child at a particular position.
 * <p>
 * Use {@link org.gtk.gtk.Box#setHomogeneous} to specify whether or not all children
 * of the <code>GtkBox</code> are forced to get the same amount of space.
 * <p>
 * Use {@link org.gtk.gtk.Box#setSpacing} to determine how much space will be minimally
 * placed between all children in the <code>GtkBox</code>. Note that spacing is added
 * *between* the children.
 * <p>
 * Use {@link org.gtk.gtk.Box#reorderChildAfter} to move a child to a different
 * place in the box.
 * <p>
 * <h1>SS nodes</h1>
 * <p><code>GtkBox</code> uses a single CSS node with name box.
 * <p>
 * <h1>ccessibility</h1>
 * <p><code>GtkBox</code> uses the {@link org.gtk.gtk.AccessibleRole#GROUP} role.
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
     * Creates a new <code>GtkBox</code>.
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
     * If @sibling is <code>NULL,</code> insert @child at the first position.
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
     * {@link org.gtk.gtk.Box#append}, {@link org.gtk.gtk.Box#prepend}, or
     * {@link org.gtk.gtk.Box#insertChildAfter}.
     */
    public void remove(Widget child) {
        gtk_h.gtk_box_remove(handle(), child.handle());
    }
    
    /**
     * Moves @child to the position after @sibling in the list
     * of @box children.
     * 
     * If @sibling is <code>NULL,</code> move @child to the first position.
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
