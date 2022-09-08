package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * `GtkConstraint` describes a constraint between attributes of two widgets,
 *  expressed as a linear equation.
 * 
 * The typical equation for a constraint is:
 * 
 * ```
 *   target.target_attr = source.source_attr × multiplier + constant
 * ```
 * 
 * Each `GtkConstraint` is part of a system that will be solved by a
 * [class@Gtk.ConstraintLayout] in order to allocate and position each
 * child widget or guide.
 * 
 * The source and target, as well as their attributes, of a `GtkConstraint`
 * instance are immutable after creation.
 */
public class Constraint extends org.gtk.gobject.Object {

    public Constraint(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Constraint */
    public static Constraint castFrom(org.gtk.gobject.Object gobject) {
        return new Constraint(gobject.getReference());
    }
    
    /**
     * Creates a new constraint representing a relation between a layout
     * attribute on a source and a layout attribute on a target.
     */
    public Constraint(ConstraintTarget target, ConstraintAttribute targetAttribute, ConstraintRelation relation, ConstraintTarget source, ConstraintAttribute sourceAttribute, double multiplier, double constant, int strength) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_constraint_new(target.HANDLE(), targetAttribute.getValue(), relation.getValue(), source.HANDLE(), sourceAttribute.getValue(), multiplier, constant, strength), true));
    }
    
    /**
     * Creates a new constraint representing a relation between a layout
     * attribute on a target and a constant value.
     */
    public Constraint(ConstraintTarget target, ConstraintAttribute targetAttribute, ConstraintRelation relation, double constant, int strength) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_constraint_new_constant(target.HANDLE(), targetAttribute.getValue(), relation.getValue(), constant, strength), true));
    }
    
    /**
     * Retrieves the constant factor added to the source attributes' value.
     */
    public double getConstant() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_constraint_get_constant(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the multiplication factor applied to the source
     * attribute's value.
     */
    public double getMultiplier() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_constraint_get_multiplier(HANDLE());
        return RESULT;
    }
    
    /**
     * The order relation between the terms of the constraint.
     */
    public ConstraintRelation getRelation() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_constraint_get_relation(HANDLE());
        return ConstraintRelation.fromValue(RESULT);
    }
    
    /**
     * Retrieves the [iface@Gtk.ConstraintTarget] used as the source for the
     * constraint.
     * 
     * If the source is set to `NULL` at creation, the constraint will use
     * the widget using the [class@Gtk.ConstraintLayout] as the source.
     */
    public ConstraintTarget getSource() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_constraint_get_source(HANDLE());
        return new ConstraintTarget.ConstraintTargetImpl(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the attribute of the source to be read by the constraint.
     */
    public ConstraintAttribute getSourceAttribute() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_constraint_get_source_attribute(HANDLE());
        return ConstraintAttribute.fromValue(RESULT);
    }
    
    /**
     * Retrieves the strength of the constraint.
     */
    public int getStrength() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_constraint_get_strength(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the [iface@Gtk.ConstraintTarget] used as the target for
     * the constraint.
     * 
     * If the targe is set to `NULL` at creation, the constraint will use
     * the widget using the [class@Gtk.ConstraintLayout] as the target.
     */
    public ConstraintTarget getTarget() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_constraint_get_target(HANDLE());
        return new ConstraintTarget.ConstraintTargetImpl(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the attribute of the target to be set by the constraint.
     */
    public ConstraintAttribute getTargetAttribute() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_constraint_get_target_attribute(HANDLE());
        return ConstraintAttribute.fromValue(RESULT);
    }
    
    /**
     * Checks whether the constraint is attached to a [class@Gtk.ConstraintLayout],
     * and it is contributing to the layout.
     */
    public boolean isAttached() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_constraint_is_attached(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks whether the constraint describes a relation between an attribute
     * on the [property@Gtk.Constraint:target] and a constant value.
     */
    public boolean isConstant() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_constraint_is_constant(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks whether the constraint is a required relation for solving the
     * constraint layout.
     */
    public boolean isRequired() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_constraint_is_required(HANDLE());
        return (RESULT != 0);
    }
    
}
