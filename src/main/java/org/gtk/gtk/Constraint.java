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
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkConstraint";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Constraint proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Constraint(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Constraint if its GType is a (or inherits from) "GtkConstraint".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "Constraint" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkConstraint", a ClassCastException will be thrown.
     */
    public static Constraint castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkConstraint"))) {
            return new Constraint(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkConstraint");
        }
    }
    
    private static Addressable constructNew(@Nullable org.gtk.gtk.ConstraintTarget target, @NotNull org.gtk.gtk.ConstraintAttribute targetAttribute, @NotNull org.gtk.gtk.ConstraintRelation relation, @Nullable org.gtk.gtk.ConstraintTarget source, @NotNull org.gtk.gtk.ConstraintAttribute sourceAttribute, double multiplier, double constant, int strength) {
        java.util.Objects.requireNonNull(targetAttribute, "Parameter 'targetAttribute' must not be null");
        java.util.Objects.requireNonNull(relation, "Parameter 'relation' must not be null");
        java.util.Objects.requireNonNull(sourceAttribute, "Parameter 'sourceAttribute' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_constraint_new.invokeExact(
                    (Addressable) (target == null ? MemoryAddress.NULL : target.handle()),
                    targetAttribute.getValue(),
                    relation.getValue(),
                    (Addressable) (source == null ? MemoryAddress.NULL : source.handle()),
                    sourceAttribute.getValue(),
                    multiplier,
                    constant,
                    strength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new constraint representing a relation between a layout
     * attribute on a source and a layout attribute on a target.
     * @param target the target of the constraint
     * @param targetAttribute the attribute of {@code target} to be set
     * @param relation the relation equivalence between {@code target_attribute} and {@code source_attribute}
     * @param source the source of the constraint
     * @param sourceAttribute the attribute of {@code source} to be read
     * @param multiplier a multiplication factor to be applied to {@code source_attribute}
     * @param constant a constant factor to be added to {@code source_attribute}
     * @param strength the strength of the constraint
     */
    public Constraint(@Nullable org.gtk.gtk.ConstraintTarget target, @NotNull org.gtk.gtk.ConstraintAttribute targetAttribute, @NotNull org.gtk.gtk.ConstraintRelation relation, @Nullable org.gtk.gtk.ConstraintTarget source, @NotNull org.gtk.gtk.ConstraintAttribute sourceAttribute, double multiplier, double constant, int strength) {
        super(constructNew(target, targetAttribute, relation, source, sourceAttribute, multiplier, constant, strength), Ownership.FULL);
    }
    
    private static Addressable constructNewConstant(@Nullable org.gtk.gtk.ConstraintTarget target, @NotNull org.gtk.gtk.ConstraintAttribute targetAttribute, @NotNull org.gtk.gtk.ConstraintRelation relation, double constant, int strength) {
        java.util.Objects.requireNonNull(targetAttribute, "Parameter 'targetAttribute' must not be null");
        java.util.Objects.requireNonNull(relation, "Parameter 'relation' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_constraint_new_constant.invokeExact(
                    (Addressable) (target == null ? MemoryAddress.NULL : target.handle()),
                    targetAttribute.getValue(),
                    relation.getValue(),
                    constant,
                    strength);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new constraint representing a relation between a layout
     * attribute on a target and a constant value.
     * @param target a the target of the constraint
     * @param targetAttribute the attribute of {@code target} to be set
     * @param relation the relation equivalence between {@code target_attribute} and {@code constant}
     * @param constant a constant factor to be set on {@code target_attribute}
     * @param strength the strength of the constraint
     * @return the newly created constraint
     */
    public static Constraint newConstant(@Nullable org.gtk.gtk.ConstraintTarget target, @NotNull org.gtk.gtk.ConstraintAttribute targetAttribute, @NotNull org.gtk.gtk.ConstraintRelation relation, double constant, int strength) {
        return new Constraint(constructNewConstant(target, targetAttribute, relation, constant, strength), Ownership.FULL);
    }
    
    /**
     * Retrieves the constant factor added to the source attributes' value.
     * @return a constant factor
     */
    public double getConstant() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_constraint_get_constant.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the multiplication factor applied to the source
     * attribute's value.
     * @return a multiplication factor
     */
    public double getMultiplier() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_constraint_get_multiplier.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * The order relation between the terms of the constraint.
     * @return a relation type
     */
    public @NotNull org.gtk.gtk.ConstraintRelation getRelation() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_constraint_get_relation.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ConstraintRelation(RESULT);
    }
    
    /**
     * Retrieves the {@code Gtk.ConstraintTarget} used as the source for the
     * constraint.
     * <p>
     * If the source is set to {@code NULL} at creation, the constraint will use
     * the widget using the {@link ConstraintLayout} as the source.
     * @return the source of the constraint
     */
    public @Nullable org.gtk.gtk.ConstraintTarget getSource() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_constraint_get_source.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ConstraintTarget.ConstraintTargetImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the attribute of the source to be read by the constraint.
     * @return the source's attribute
     */
    public @NotNull org.gtk.gtk.ConstraintAttribute getSourceAttribute() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_constraint_get_source_attribute.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ConstraintAttribute(RESULT);
    }
    
    /**
     * Retrieves the strength of the constraint.
     * @return the strength value
     */
    public int getStrength() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_constraint_get_strength.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the {@code Gtk.ConstraintTarget} used as the target for
     * the constraint.
     * <p>
     * If the targe is set to {@code NULL} at creation, the constraint will use
     * the widget using the {@link ConstraintLayout} as the target.
     * @return a {@code GtkConstraintTarget}
     */
    public @Nullable org.gtk.gtk.ConstraintTarget getTarget() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_constraint_get_target.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ConstraintTarget.ConstraintTargetImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Retrieves the attribute of the target to be set by the constraint.
     * @return the target's attribute
     */
    public @NotNull org.gtk.gtk.ConstraintAttribute getTargetAttribute() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_constraint_get_target_attribute.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ConstraintAttribute(RESULT);
    }
    
    /**
     * Checks whether the constraint is attached to a {@link ConstraintLayout},
     * and it is contributing to the layout.
     * @return {@code TRUE} if the constraint is attached
     */
    public boolean isAttached() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_constraint_is_attached.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks whether the constraint describes a relation between an attribute
     * on the {@code Gtk.Constraint:target} and a constant value.
     * @return {@code TRUE} if the constraint is a constant relation
     */
    public boolean isConstant() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_constraint_is_constant.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks whether the constraint is a required relation for solving the
     * constraint layout.
     * @return {@code true} if the constraint is required
     */
    public boolean isRequired() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_constraint_is_required.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_constraint_new = Interop.downcallHandle(
            "gtk_constraint_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_constraint_new_constant = Interop.downcallHandle(
            "gtk_constraint_new_constant",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_constraint_get_constant = Interop.downcallHandle(
            "gtk_constraint_get_constant",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_get_multiplier = Interop.downcallHandle(
            "gtk_constraint_get_multiplier",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_get_relation = Interop.downcallHandle(
            "gtk_constraint_get_relation",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_get_source = Interop.downcallHandle(
            "gtk_constraint_get_source",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_get_source_attribute = Interop.downcallHandle(
            "gtk_constraint_get_source_attribute",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_get_strength = Interop.downcallHandle(
            "gtk_constraint_get_strength",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_get_target = Interop.downcallHandle(
            "gtk_constraint_get_target",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_get_target_attribute = Interop.downcallHandle(
            "gtk_constraint_get_target_attribute",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_is_attached = Interop.downcallHandle(
            "gtk_constraint_is_attached",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_is_constant = Interop.downcallHandle(
            "gtk_constraint_is_constant",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_is_required = Interop.downcallHandle(
            "gtk_constraint_is_required",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
    }
}
