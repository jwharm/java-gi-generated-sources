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
public class Constraint extends org.gtk.gobject.GObject {
    
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
     */
    protected Constraint(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Constraint> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Constraint(input);
    
    private static MemoryAddress constructNew(@Nullable org.gtk.gtk.ConstraintTarget target, org.gtk.gtk.ConstraintAttribute targetAttribute, org.gtk.gtk.ConstraintRelation relation, @Nullable org.gtk.gtk.ConstraintTarget source, org.gtk.gtk.ConstraintAttribute sourceAttribute, double multiplier, double constant, int strength) {
        MemoryAddress RESULT;
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
    public Constraint(@Nullable org.gtk.gtk.ConstraintTarget target, org.gtk.gtk.ConstraintAttribute targetAttribute, org.gtk.gtk.ConstraintRelation relation, @Nullable org.gtk.gtk.ConstraintTarget source, org.gtk.gtk.ConstraintAttribute sourceAttribute, double multiplier, double constant, int strength) {
        super(constructNew(target, targetAttribute, relation, source, sourceAttribute, multiplier, constant, strength));
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewConstant(@Nullable org.gtk.gtk.ConstraintTarget target, org.gtk.gtk.ConstraintAttribute targetAttribute, org.gtk.gtk.ConstraintRelation relation, double constant, int strength) {
        MemoryAddress RESULT;
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
    public static Constraint newConstant(@Nullable org.gtk.gtk.ConstraintTarget target, org.gtk.gtk.ConstraintAttribute targetAttribute, org.gtk.gtk.ConstraintRelation relation, double constant, int strength) {
        var RESULT = constructNewConstant(target, targetAttribute, relation, constant, strength);
        var OBJECT = (org.gtk.gtk.Constraint) Interop.register(RESULT, org.gtk.gtk.Constraint.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Retrieves the constant factor added to the source attributes' value.
     * @return a constant factor
     */
    public double getConstant() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.gtk_constraint_get_constant.invokeExact(handle());
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
            RESULT = (double) DowncallHandles.gtk_constraint_get_multiplier.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * The order relation between the terms of the constraint.
     * @return a relation type
     */
    public org.gtk.gtk.ConstraintRelation getRelation() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_constraint_get_relation.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.ConstraintRelation.of(RESULT);
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_constraint_get_source.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.ConstraintTarget) Interop.register(RESULT, org.gtk.gtk.ConstraintTarget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Retrieves the attribute of the source to be read by the constraint.
     * @return the source's attribute
     */
    public org.gtk.gtk.ConstraintAttribute getSourceAttribute() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_constraint_get_source_attribute.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.ConstraintAttribute.of(RESULT);
    }
    
    /**
     * Retrieves the strength of the constraint.
     * @return the strength value
     */
    public int getStrength() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_constraint_get_strength.invokeExact(handle());
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_constraint_get_target.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.ConstraintTarget) Interop.register(RESULT, org.gtk.gtk.ConstraintTarget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Retrieves the attribute of the target to be set by the constraint.
     * @return the target's attribute
     */
    public org.gtk.gtk.ConstraintAttribute getTargetAttribute() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_constraint_get_target_attribute.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.ConstraintAttribute.of(RESULT);
    }
    
    /**
     * Checks whether the constraint is attached to a {@link ConstraintLayout},
     * and it is contributing to the layout.
     * @return {@code TRUE} if the constraint is attached
     */
    public boolean isAttached() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_constraint_is_attached.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks whether the constraint describes a relation between an attribute
     * on the {@code Gtk.Constraint:target} and a constant value.
     * @return {@code TRUE} if the constraint is a constant relation
     */
    public boolean isConstant() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_constraint_is_constant.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks whether the constraint is a required relation for solving the
     * constraint layout.
     * @return {@code true} if the constraint is required
     */
    public boolean isRequired() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_constraint_is_required.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_constraint_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Constraint.Builder} object constructs a {@link Constraint} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Constraint.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Constraint} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Constraint}.
         * @return A new instance of {@code Constraint} with the properties 
         *         that were set in the Builder object.
         */
        public Constraint build() {
            return (Constraint) org.gtk.gobject.GObject.newWithProperties(
                Constraint.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The constant value to be added to the {@code Gtk.Constraint:source-attribute}.
         * @param constant The value for the {@code constant} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setConstant(double constant) {
            names.add("constant");
            values.add(org.gtk.gobject.Value.create(constant));
            return this;
        }
        
        /**
         * The multiplication factor to be applied to
         * the {@code Gtk.Constraint:source-attribute}.
         * @param multiplier The value for the {@code multiplier} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMultiplier(double multiplier) {
            names.add("multiplier");
            values.add(org.gtk.gobject.Value.create(multiplier));
            return this;
        }
        
        /**
         * The order relation between the terms of the constraint.
         * @param relation The value for the {@code relation} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRelation(org.gtk.gtk.ConstraintRelation relation) {
            names.add("relation");
            values.add(org.gtk.gobject.Value.create(relation));
            return this;
        }
        
        /**
         * The source of the constraint.
         * <p>
         * The constraint will set the {@code Gtk.Constraint:target-attribute}
         * property of the target using the {@code Gtk.Constraint:source-attribute}
         * property of the source.
         * @param source The value for the {@code source} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSource(org.gtk.gtk.ConstraintTarget source) {
            names.add("source");
            values.add(org.gtk.gobject.Value.create(source));
            return this;
        }
        
        /**
         * The attribute of the {@code Gtk.Constraint:source} read by the
         * constraint.
         * @param sourceAttribute The value for the {@code source-attribute} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSourceAttribute(org.gtk.gtk.ConstraintAttribute sourceAttribute) {
            names.add("source-attribute");
            values.add(org.gtk.gobject.Value.create(sourceAttribute));
            return this;
        }
        
        /**
         * The strength of the constraint.
         * <p>
         * The strength can be expressed either using one of the symbolic values
         * of the {@code Gtk.ConstraintStrength} enumeration, or any positive integer
         * value.
         * @param strength The value for the {@code strength} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStrength(int strength) {
            names.add("strength");
            values.add(org.gtk.gobject.Value.create(strength));
            return this;
        }
        
        /**
         * The target of the constraint.
         * <p>
         * The constraint will set the {@code Gtk.Constraint:target-attribute}
         * property of the target using the {@code Gtk.Constraint:source-attribute}
         * property of the source widget.
         * @param target The value for the {@code target} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTarget(org.gtk.gtk.ConstraintTarget target) {
            names.add("target");
            values.add(org.gtk.gobject.Value.create(target));
            return this;
        }
        
        /**
         * The attribute of the {@code Gtk.Constraint:target} set by the constraint.
         * @param targetAttribute The value for the {@code target-attribute} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTargetAttribute(org.gtk.gtk.ConstraintAttribute targetAttribute) {
            names.add("target-attribute");
            values.add(org.gtk.gobject.Value.create(targetAttribute));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_constraint_new = Interop.downcallHandle(
                "gtk_constraint_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_constraint_new_constant = Interop.downcallHandle(
                "gtk_constraint_new_constant",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_constraint_get_constant = Interop.downcallHandle(
                "gtk_constraint_get_constant",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_constraint_get_multiplier = Interop.downcallHandle(
                "gtk_constraint_get_multiplier",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_constraint_get_relation = Interop.downcallHandle(
                "gtk_constraint_get_relation",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_constraint_get_source = Interop.downcallHandle(
                "gtk_constraint_get_source",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_constraint_get_source_attribute = Interop.downcallHandle(
                "gtk_constraint_get_source_attribute",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_constraint_get_strength = Interop.downcallHandle(
                "gtk_constraint_get_strength",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_constraint_get_target = Interop.downcallHandle(
                "gtk_constraint_get_target",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_constraint_get_target_attribute = Interop.downcallHandle(
                "gtk_constraint_get_target_attribute",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_constraint_is_attached = Interop.downcallHandle(
                "gtk_constraint_is_attached",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_constraint_is_constant = Interop.downcallHandle(
                "gtk_constraint_is_constant",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_constraint_is_required = Interop.downcallHandle(
                "gtk_constraint_is_required",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_constraint_get_type = Interop.downcallHandle(
                "gtk_constraint_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_constraint_get_type != null;
    }
}
