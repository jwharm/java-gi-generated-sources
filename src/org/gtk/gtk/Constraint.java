package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@code GtkConstraint} describes a constraint between attributes of two widgets,
 *  expressed as a linear equation.
 * <p>
 * The typical equation for a constraint is:
 * <p>
 * <pre>{@code 
 *   target.target_attr = source.source_attr × multiplier + constant
 * }</pre>
 * <p>
 * Each {@code GtkConstraint} is part of a system that will be solved by a
 * {@link ConstraintLayout} in order to allocate and position each
 * child widget or guide.
 * <p>
 * The source and target, as well as their attributes, of a {@code GtkConstraint}
 * instance are immutable after creation.
 */
public class Constraint extends org.gtk.gobject.Object {

    public Constraint(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Constraint */
    public static Constraint castFrom(org.gtk.gobject.Object gobject) {
        return new Constraint(gobject.getReference());
    }
    
    private static Reference constructNew(ConstraintTarget target, ConstraintAttribute targetAttribute, ConstraintRelation relation, ConstraintTarget source, ConstraintAttribute sourceAttribute, double multiplier, double constant, int strength) {
        Reference RESULT = References.get(gtk_h.gtk_constraint_new(target.handle(), targetAttribute.getValue(), relation.getValue(), source.handle(), sourceAttribute.getValue(), multiplier, constant, strength), true);
        return RESULT;
    }
    
    /**
     * Creates a new constraint representing a relation between a layout
     * attribute on a source and a layout attribute on a target.
     */
    public Constraint(ConstraintTarget target, ConstraintAttribute targetAttribute, ConstraintRelation relation, ConstraintTarget source, ConstraintAttribute sourceAttribute, double multiplier, double constant, int strength) {
        super(constructNew(target, targetAttribute, relation, source, sourceAttribute, multiplier, constant, strength));
    }
    
    private static Reference constructNewConstant(ConstraintTarget target, ConstraintAttribute targetAttribute, ConstraintRelation relation, double constant, int strength) {
        Reference RESULT = References.get(gtk_h.gtk_constraint_new_constant(target.handle(), targetAttribute.getValue(), relation.getValue(), constant, strength), true);
        return RESULT;
    }
    
    /**
     * Creates a new constraint representing a relation between a layout
     * attribute on a target and a constant value.
     */
    public static Constraint newConstant(ConstraintTarget target, ConstraintAttribute targetAttribute, ConstraintRelation relation, double constant, int strength) {
        return new Constraint(constructNewConstant(target, targetAttribute, relation, constant, strength));
    }
    
    /**
     * Retrieves the constant factor added to the source attributes' value.
     */
    public double getConstant() {
        var RESULT = gtk_h.gtk_constraint_get_constant(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the multiplication factor applied to the source
     * attribute's value.
     */
    public double getMultiplier() {
        var RESULT = gtk_h.gtk_constraint_get_multiplier(handle());
        return RESULT;
    }
    
    /**
     * The order relation between the terms of the constraint.
     */
    public ConstraintRelation getRelation() {
        var RESULT = gtk_h.gtk_constraint_get_relation(handle());
        return new ConstraintRelation(RESULT);
    }
    
    /**
     * Retrieves the {@code Gtk.ConstraintTarget} used as the source for the
     * constraint.
     * <p>
     * If the source is set to {@code NULL} at creation, the constraint will use
     * the widget using the {@link ConstraintLayout} as the source.
     */
    public ConstraintTarget getSource() {
        var RESULT = gtk_h.gtk_constraint_get_source(handle());
        return new ConstraintTarget.ConstraintTargetImpl(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the attribute of the source to be read by the constraint.
     */
    public ConstraintAttribute getSourceAttribute() {
        var RESULT = gtk_h.gtk_constraint_get_source_attribute(handle());
        return new ConstraintAttribute(RESULT);
    }
    
    /**
     * Retrieves the strength of the constraint.
     */
    public int getStrength() {
        var RESULT = gtk_h.gtk_constraint_get_strength(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the {@code Gtk.ConstraintTarget} used as the target for
     * the constraint.
     * <p>
     * If the targe is set to {@code NULL} at creation, the constraint will use
     * the widget using the {@link ConstraintLayout} as the target.
     */
    public ConstraintTarget getTarget() {
        var RESULT = gtk_h.gtk_constraint_get_target(handle());
        return new ConstraintTarget.ConstraintTargetImpl(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the attribute of the target to be set by the constraint.
     */
    public ConstraintAttribute getTargetAttribute() {
        var RESULT = gtk_h.gtk_constraint_get_target_attribute(handle());
        return new ConstraintAttribute(RESULT);
    }
    
    /**
     * Checks whether the constraint is attached to a {@link ConstraintLayout},
     * and it is contributing to the layout.
     */
    public boolean isAttached() {
        var RESULT = gtk_h.gtk_constraint_is_attached(handle());
        return RESULT != 0;
    }
    
    /**
     * Checks whether the constraint describes a relation between an attribute
     * on the {@code Gtk.Constraint:target} and a constant value.
     */
    public boolean isConstant() {
        var RESULT = gtk_h.gtk_constraint_is_constant(handle());
        return RESULT != 0;
    }
    
    /**
     * Checks whether the constraint is a required relation for solving the
     * constraint layout.
     */
    public boolean isRequired() {
        var RESULT = gtk_h.gtk_constraint_is_required(handle());
        return RESULT != 0;
    }
    
}
