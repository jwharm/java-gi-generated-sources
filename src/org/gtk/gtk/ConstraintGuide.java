package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GtkConstraintGuide} is an invisible layout element in a
 * {@code GtkConstraintLayout}.
 * <p>
 * The {@code GtkConstraintLayout} treats guides like widgets. They
 * can be used as the source or target of a {@code GtkConstraint}.
 * <p>
 * Guides have a minimum, maximum and natural size. Depending
 * on the constraints that are applied, they can act like a
 * guideline that widgets can be aligned to, or like *flexible
 * space*.
 * <p>
 * Unlike a {@code GtkWidget}, a {@code GtkConstraintGuide} will not be drawn.
 */
public class ConstraintGuide extends org.gtk.gobject.Object implements ConstraintTarget {

    public ConstraintGuide(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ConstraintGuide */
    public static ConstraintGuide castFrom(org.gtk.gobject.Object gobject) {
        return new ConstraintGuide(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_constraint_guide_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkConstraintGuide} object.
     */
    public ConstraintGuide() {
        super(constructNew());
    }
    
    /**
     * Gets the maximum size of {@code guide}.
     */
    public void getMaxSize(PointerInteger width, PointerInteger height) {
        gtk_h.gtk_constraint_guide_get_max_size(handle(), width.handle(), height.handle());
    }
    
    /**
     * Gets the minimum size of {@code guide}.
     */
    public void getMinSize(PointerInteger width, PointerInteger height) {
        gtk_h.gtk_constraint_guide_get_min_size(handle(), width.handle(), height.handle());
    }
    
    /**
     * Retrieves the name set using gtk_constraint_guide_set_name().
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.gtk_constraint_guide_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Gets the natural size of {@code guide}.
     */
    public void getNatSize(PointerInteger width, PointerInteger height) {
        gtk_h.gtk_constraint_guide_get_nat_size(handle(), width.handle(), height.handle());
    }
    
    /**
     * Retrieves the strength set using gtk_constraint_guide_set_strength().
     */
    public ConstraintStrength getStrength() {
        var RESULT = gtk_h.gtk_constraint_guide_get_strength(handle());
        return new ConstraintStrength(RESULT);
    }
    
    /**
     * Sets the maximum size of {@code guide}.
     * <p>
     * If {@code guide} is attached to a {@code GtkConstraintLayout},
     * the constraints will be updated to reflect the new size.
     */
    public void setMaxSize(int width, int height) {
        gtk_h.gtk_constraint_guide_set_max_size(handle(), width, height);
    }
    
    /**
     * Sets the minimum size of {@code guide}.
     * <p>
     * If {@code guide} is attached to a {@code GtkConstraintLayout},
     * the constraints will be updated to reflect the new size.
     */
    public void setMinSize(int width, int height) {
        gtk_h.gtk_constraint_guide_set_min_size(handle(), width, height);
    }
    
    /**
     * Sets a name for the given {@code GtkConstraintGuide}.
     * <p>
     * The name is useful for debugging purposes.
     */
    public void setName(java.lang.String name) {
        gtk_h.gtk_constraint_guide_set_name(handle(), Interop.allocateNativeString(name).handle());
    }
    
    /**
     * Sets the natural size of {@code guide}.
     * <p>
     * If {@code guide} is attached to a {@code GtkConstraintLayout},
     * the constraints will be updated to reflect the new size.
     */
    public void setNatSize(int width, int height) {
        gtk_h.gtk_constraint_guide_set_nat_size(handle(), width, height);
    }
    
    /**
     * Sets the strength of the constraint on the natural size of the
     * given {@code GtkConstraintGuide}.
     */
    public void setStrength(ConstraintStrength strength) {
        gtk_h.gtk_constraint_guide_set_strength(handle(), strength.getValue());
    }
    
}
