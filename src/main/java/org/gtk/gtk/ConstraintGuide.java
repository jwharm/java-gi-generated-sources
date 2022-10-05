package org.gtk.gtk;

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

    public ConstraintGuide(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ConstraintGuide */
    public static ConstraintGuide castFrom(org.gtk.gobject.Object gobject) {
        return new ConstraintGuide(gobject.refcounted());
    }
    
    static final MethodHandle gtk_constraint_guide_new = Interop.downcallHandle(
        "gtk_constraint_guide_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_constraint_guide_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkConstraintGuide} object.
     */
    public ConstraintGuide() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_constraint_guide_get_max_size = Interop.downcallHandle(
        "gtk_constraint_guide_get_max_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the maximum size of {@code guide}.
     */
    public void getMaxSize(PointerInteger width, PointerInteger height) {
        try {
            gtk_constraint_guide_get_max_size.invokeExact(handle(), width.handle(), height.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_constraint_guide_get_min_size = Interop.downcallHandle(
        "gtk_constraint_guide_get_min_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the minimum size of {@code guide}.
     */
    public void getMinSize(PointerInteger width, PointerInteger height) {
        try {
            gtk_constraint_guide_get_min_size.invokeExact(handle(), width.handle(), height.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_constraint_guide_get_name = Interop.downcallHandle(
        "gtk_constraint_guide_get_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the name set using gtk_constraint_guide_set_name().
     */
    public java.lang.String getName() {
        try {
            var RESULT = (MemoryAddress) gtk_constraint_guide_get_name.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_constraint_guide_get_nat_size = Interop.downcallHandle(
        "gtk_constraint_guide_get_nat_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the natural size of {@code guide}.
     */
    public void getNatSize(PointerInteger width, PointerInteger height) {
        try {
            gtk_constraint_guide_get_nat_size.invokeExact(handle(), width.handle(), height.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_constraint_guide_get_strength = Interop.downcallHandle(
        "gtk_constraint_guide_get_strength",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the strength set using gtk_constraint_guide_set_strength().
     */
    public ConstraintStrength getStrength() {
        try {
            var RESULT = (int) gtk_constraint_guide_get_strength.invokeExact(handle());
            return new ConstraintStrength(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_constraint_guide_set_max_size = Interop.downcallHandle(
        "gtk_constraint_guide_set_max_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the maximum size of {@code guide}.
     * <p>
     * If {@code guide} is attached to a {@code GtkConstraintLayout},
     * the constraints will be updated to reflect the new size.
     */
    public void setMaxSize(int width, int height) {
        try {
            gtk_constraint_guide_set_max_size.invokeExact(handle(), width, height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_constraint_guide_set_min_size = Interop.downcallHandle(
        "gtk_constraint_guide_set_min_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the minimum size of {@code guide}.
     * <p>
     * If {@code guide} is attached to a {@code GtkConstraintLayout},
     * the constraints will be updated to reflect the new size.
     */
    public void setMinSize(int width, int height) {
        try {
            gtk_constraint_guide_set_min_size.invokeExact(handle(), width, height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_constraint_guide_set_name = Interop.downcallHandle(
        "gtk_constraint_guide_set_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a name for the given {@code GtkConstraintGuide}.
     * <p>
     * The name is useful for debugging purposes.
     */
    public void setName(java.lang.String name) {
        try {
            gtk_constraint_guide_set_name.invokeExact(handle(), Interop.allocateNativeString(name).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_constraint_guide_set_nat_size = Interop.downcallHandle(
        "gtk_constraint_guide_set_nat_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the natural size of {@code guide}.
     * <p>
     * If {@code guide} is attached to a {@code GtkConstraintLayout},
     * the constraints will be updated to reflect the new size.
     */
    public void setNatSize(int width, int height) {
        try {
            gtk_constraint_guide_set_nat_size.invokeExact(handle(), width, height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_constraint_guide_set_strength = Interop.downcallHandle(
        "gtk_constraint_guide_set_strength",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the strength of the constraint on the natural size of the
     * given {@code GtkConstraintGuide}.
     */
    public void setStrength(ConstraintStrength strength) {
        try {
            gtk_constraint_guide_set_strength.invokeExact(handle(), strength.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
