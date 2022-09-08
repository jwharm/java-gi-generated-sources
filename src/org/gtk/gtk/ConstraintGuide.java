package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GtkConstraintGuide` is an invisible layout element in a
 * `GtkConstraintLayout`.
 * 
 * The `GtkConstraintLayout` treats guides like widgets. They
 * can be used as the source or target of a `GtkConstraint`.
 * 
 * Guides have a minimum, maximum and natural size. Depending
 * on the constraints that are applied, they can act like a
 * guideline that widgets can be aligned to, or like *flexible
 * space*.
 * 
 * Unlike a `GtkWidget`, a `GtkConstraintGuide` will not be drawn.
 */
public class ConstraintGuide extends org.gtk.gobject.Object implements ConstraintTarget {

    public ConstraintGuide(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ConstraintGuide */
    public static ConstraintGuide castFrom(org.gtk.gobject.Object gobject) {
        return new ConstraintGuide(gobject.getReference());
    }
    
    /**
     * Creates a new `GtkConstraintGuide` object.
     */
    public ConstraintGuide() {
        super(References.get(gtk_h.gtk_constraint_guide_new(), true));
    }
    
    /**
     * Retrieves the name set using gtk_constraint_guide_set_name().
     */
    public java.lang.String getName() {
        var RESULT = gtk_h.gtk_constraint_guide_get_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Retrieves the strength set using gtk_constraint_guide_set_strength().
     */
    public ConstraintStrength getStrength() {
        var RESULT = gtk_h.gtk_constraint_guide_get_strength(handle());
        return ConstraintStrength.fromValue(RESULT);
    }
    
    /**
     * Sets the maximum size of @guide.
     * 
     * If @guide is attached to a `GtkConstraintLayout`,
     * the constraints will be updated to reflect the new size.
     */
    public void setMaxSize(int width, int height) {
        gtk_h.gtk_constraint_guide_set_max_size(handle(), width, height);
    }
    
    /**
     * Sets the minimum size of @guide.
     * 
     * If @guide is attached to a `GtkConstraintLayout`,
     * the constraints will be updated to reflect the new size.
     */
    public void setMinSize(int width, int height) {
        gtk_h.gtk_constraint_guide_set_min_size(handle(), width, height);
    }
    
    /**
     * Sets a name for the given `GtkConstraintGuide`.
     * 
     * The name is useful for debugging purposes.
     */
    public void setName(java.lang.String name) {
        gtk_h.gtk_constraint_guide_set_name(handle(), Interop.allocateNativeString(name).handle());
    }
    
    /**
     * Sets the natural size of @guide.
     * 
     * If @guide is attached to a `GtkConstraintLayout`,
     * the constraints will be updated to reflect the new size.
     */
    public void setNatSize(int width, int height) {
        gtk_h.gtk_constraint_guide_set_nat_size(handle(), width, height);
    }
    
    /**
     * Sets the strength of the constraint on the natural size of the
     * given `GtkConstraintGuide`.
     */
    public void setStrength(ConstraintStrength strength) {
        gtk_h.gtk_constraint_guide_set_strength(handle(), strength.getValue());
    }
    
}
