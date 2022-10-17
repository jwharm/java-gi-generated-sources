package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkConstraint} describes a constraint between attributes of two widgets,
 *  expressed as a linear equation.
 * <p>
 * The typical equation for a constraint is:
 * 
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

    public Constraint(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Constraint */
    public static Constraint castFrom(org.gtk.gobject.Object gobject) {
        return new Constraint(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_constraint_new = Interop.downcallHandle(
        "gtk_constraint_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(@Nullable ConstraintTarget target, @NotNull ConstraintAttribute targetAttribute, @NotNull ConstraintRelation relation, @Nullable ConstraintTarget source, @NotNull ConstraintAttribute sourceAttribute, @NotNull double multiplier, @NotNull double constant, @NotNull int strength) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_constraint_new.invokeExact(target.handle(), targetAttribute.getValue(), relation.getValue(), source.handle(), sourceAttribute.getValue(), multiplier, constant, strength), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new constraint representing a relation between a layout
     * attribute on a source and a layout attribute on a target.
     */
    public Constraint(@Nullable ConstraintTarget target, @NotNull ConstraintAttribute targetAttribute, @NotNull ConstraintRelation relation, @Nullable ConstraintTarget source, @NotNull ConstraintAttribute sourceAttribute, @NotNull double multiplier, @NotNull double constant, @NotNull int strength) {
        super(constructNew(target, targetAttribute, relation, source, sourceAttribute, multiplier, constant, strength));
    }
    
    private static final MethodHandle gtk_constraint_new_constant = Interop.downcallHandle(
        "gtk_constraint_new_constant",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNewConstant(@Nullable ConstraintTarget target, @NotNull ConstraintAttribute targetAttribute, @NotNull ConstraintRelation relation, @NotNull double constant, @NotNull int strength) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_constraint_new_constant.invokeExact(target.handle(), targetAttribute.getValue(), relation.getValue(), constant, strength), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new constraint representing a relation between a layout
     * attribute on a target and a constant value.
     */
    public static Constraint newConstant(@Nullable ConstraintTarget target, @NotNull ConstraintAttribute targetAttribute, @NotNull ConstraintRelation relation, @NotNull double constant, @NotNull int strength) {
        return new Constraint(constructNewConstant(target, targetAttribute, relation, constant, strength));
    }
    
    private static final MethodHandle gtk_constraint_get_constant = Interop.downcallHandle(
        "gtk_constraint_get_constant",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the constant factor added to the source attributes' value.
     */
    public double getConstant() {
        double RESULT;
        try {
            RESULT = (double) gtk_constraint_get_constant.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_constraint_get_multiplier = Interop.downcallHandle(
        "gtk_constraint_get_multiplier",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the multiplication factor applied to the source
     * attribute's value.
     */
    public double getMultiplier() {
        double RESULT;
        try {
            RESULT = (double) gtk_constraint_get_multiplier.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_constraint_get_relation = Interop.downcallHandle(
        "gtk_constraint_get_relation",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The order relation between the terms of the constraint.
     */
    public @NotNull ConstraintRelation getRelation() {
        int RESULT;
        try {
            RESULT = (int) gtk_constraint_get_relation.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ConstraintRelation(RESULT);
    }
    
    private static final MethodHandle gtk_constraint_get_source = Interop.downcallHandle(
        "gtk_constraint_get_source",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the {@code Gtk.ConstraintTarget} used as the source for the
     * constraint.
     * <p>
     * If the source is set to {@code NULL} at creation, the constraint will use
     * the widget using the {@link ConstraintLayout} as the source.
     */
    public @Nullable ConstraintTarget getSource() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_constraint_get_source.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ConstraintTarget.ConstraintTargetImpl(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_constraint_get_source_attribute = Interop.downcallHandle(
        "gtk_constraint_get_source_attribute",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the attribute of the source to be read by the constraint.
     */
    public @NotNull ConstraintAttribute getSourceAttribute() {
        int RESULT;
        try {
            RESULT = (int) gtk_constraint_get_source_attribute.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ConstraintAttribute(RESULT);
    }
    
    private static final MethodHandle gtk_constraint_get_strength = Interop.downcallHandle(
        "gtk_constraint_get_strength",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the strength of the constraint.
     */
    public int getStrength() {
        int RESULT;
        try {
            RESULT = (int) gtk_constraint_get_strength.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_constraint_get_target = Interop.downcallHandle(
        "gtk_constraint_get_target",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the {@code Gtk.ConstraintTarget} used as the target for
     * the constraint.
     * <p>
     * If the targe is set to {@code NULL} at creation, the constraint will use
     * the widget using the {@link ConstraintLayout} as the target.
     */
    public @Nullable ConstraintTarget getTarget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_constraint_get_target.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ConstraintTarget.ConstraintTargetImpl(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_constraint_get_target_attribute = Interop.downcallHandle(
        "gtk_constraint_get_target_attribute",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the attribute of the target to be set by the constraint.
     */
    public @NotNull ConstraintAttribute getTargetAttribute() {
        int RESULT;
        try {
            RESULT = (int) gtk_constraint_get_target_attribute.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ConstraintAttribute(RESULT);
    }
    
    private static final MethodHandle gtk_constraint_is_attached = Interop.downcallHandle(
        "gtk_constraint_is_attached",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the constraint is attached to a {@link ConstraintLayout},
     * and it is contributing to the layout.
     */
    public boolean isAttached() {
        int RESULT;
        try {
            RESULT = (int) gtk_constraint_is_attached.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_constraint_is_constant = Interop.downcallHandle(
        "gtk_constraint_is_constant",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the constraint describes a relation between an attribute
     * on the {@code Gtk.Constraint:target} and a constant value.
     */
    public boolean isConstant() {
        int RESULT;
        try {
            RESULT = (int) gtk_constraint_is_constant.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_constraint_is_required = Interop.downcallHandle(
        "gtk_constraint_is_required",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether the constraint is a required relation for solving the
     * constraint layout.
     */
    public boolean isRequired() {
        int RESULT;
        try {
            RESULT = (int) gtk_constraint_is_required.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
}
