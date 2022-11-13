package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
public class ConstraintGuide extends org.gtk.gobject.Object implements org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkConstraintGuide";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ConstraintGuide proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ConstraintGuide(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ConstraintGuide if its GType is a (or inherits from) "GtkConstraintGuide".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ConstraintGuide} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkConstraintGuide", a ClassCastException will be thrown.
     */
    public static ConstraintGuide castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkConstraintGuide"))) {
            return new ConstraintGuide(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkConstraintGuide");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_constraint_guide_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkConstraintGuide} object.
     */
    public ConstraintGuide() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Gets the maximum size of {@code guide}.
     * @param width return location for the maximum width
     * @param height return location for the maximum height
     */
    public void getMaxSize(Out<Integer> width, Out<Integer> height) {
        java.util.Objects.requireNonNull(width, "Parameter 'width' must not be null");
        java.util.Objects.requireNonNull(height, "Parameter 'height' must not be null");
        MemorySegment widthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment heightPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            DowncallHandles.gtk_constraint_guide_get_max_size.invokeExact(
                    handle(),
                    (Addressable) widthPOINTER.address(),
                    (Addressable) heightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        width.set(widthPOINTER.get(ValueLayout.JAVA_INT, 0));
        height.set(heightPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    /**
     * Gets the minimum size of {@code guide}.
     * @param width return location for the minimum width
     * @param height return location for the minimum height
     */
    public void getMinSize(Out<Integer> width, Out<Integer> height) {
        java.util.Objects.requireNonNull(width, "Parameter 'width' must not be null");
        java.util.Objects.requireNonNull(height, "Parameter 'height' must not be null");
        MemorySegment widthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment heightPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            DowncallHandles.gtk_constraint_guide_get_min_size.invokeExact(
                    handle(),
                    (Addressable) widthPOINTER.address(),
                    (Addressable) heightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        width.set(widthPOINTER.get(ValueLayout.JAVA_INT, 0));
        height.set(heightPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    /**
     * Retrieves the name set using gtk_constraint_guide_set_name().
     * @return the name of the guide
     */
    public @Nullable java.lang.String getName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_constraint_guide_get_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the natural size of {@code guide}.
     * @param width return location for the natural width
     * @param height return location for the natural height
     */
    public void getNatSize(Out<Integer> width, Out<Integer> height) {
        java.util.Objects.requireNonNull(width, "Parameter 'width' must not be null");
        java.util.Objects.requireNonNull(height, "Parameter 'height' must not be null");
        MemorySegment widthPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment heightPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            DowncallHandles.gtk_constraint_guide_get_nat_size.invokeExact(
                    handle(),
                    (Addressable) widthPOINTER.address(),
                    (Addressable) heightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        width.set(widthPOINTER.get(ValueLayout.JAVA_INT, 0));
        height.set(heightPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    /**
     * Retrieves the strength set using gtk_constraint_guide_set_strength().
     * @return the strength of the constraint on the natural size
     */
    public @NotNull org.gtk.gtk.ConstraintStrength getStrength() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_constraint_guide_get_strength.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ConstraintStrength(RESULT);
    }
    
    /**
     * Sets the maximum size of {@code guide}.
     * <p>
     * If {@code guide} is attached to a {@code GtkConstraintLayout},
     * the constraints will be updated to reflect the new size.
     * @param width the new maximum width, or -1 to not change it
     * @param height the new maximum height, or -1 to not change it
     */
    public void setMaxSize(int width, int height) {
        try {
            DowncallHandles.gtk_constraint_guide_set_max_size.invokeExact(
                    handle(),
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the minimum size of {@code guide}.
     * <p>
     * If {@code guide} is attached to a {@code GtkConstraintLayout},
     * the constraints will be updated to reflect the new size.
     * @param width the new minimum width, or -1 to not change it
     * @param height the new minimum height, or -1 to not change it
     */
    public void setMinSize(int width, int height) {
        try {
            DowncallHandles.gtk_constraint_guide_set_min_size.invokeExact(
                    handle(),
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a name for the given {@code GtkConstraintGuide}.
     * <p>
     * The name is useful for debugging purposes.
     * @param name a name for the {@code guide}
     */
    public void setName(@Nullable java.lang.String name) {
        try {
            DowncallHandles.gtk_constraint_guide_set_name.invokeExact(
                    handle(),
                    (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the natural size of {@code guide}.
     * <p>
     * If {@code guide} is attached to a {@code GtkConstraintLayout},
     * the constraints will be updated to reflect the new size.
     * @param width the new natural width, or -1 to not change it
     * @param height the new natural height, or -1 to not change it
     */
    public void setNatSize(int width, int height) {
        try {
            DowncallHandles.gtk_constraint_guide_set_nat_size.invokeExact(
                    handle(),
                    width,
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the strength of the constraint on the natural size of the
     * given {@code GtkConstraintGuide}.
     * @param strength the strength of the constraint
     */
    public void setStrength(@NotNull org.gtk.gtk.ConstraintStrength strength) {
        java.util.Objects.requireNonNull(strength, "Parameter 'strength' must not be null");
        try {
            DowncallHandles.gtk_constraint_guide_set_strength.invokeExact(
                    handle(),
                    strength.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_constraint_guide_new = Interop.downcallHandle(
            "gtk_constraint_guide_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_guide_get_max_size = Interop.downcallHandle(
            "gtk_constraint_guide_get_max_size",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_guide_get_min_size = Interop.downcallHandle(
            "gtk_constraint_guide_get_min_size",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_guide_get_name = Interop.downcallHandle(
            "gtk_constraint_guide_get_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_guide_get_nat_size = Interop.downcallHandle(
            "gtk_constraint_guide_get_nat_size",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_guide_get_strength = Interop.downcallHandle(
            "gtk_constraint_guide_get_strength",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_guide_set_max_size = Interop.downcallHandle(
            "gtk_constraint_guide_set_max_size",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_constraint_guide_set_min_size = Interop.downcallHandle(
            "gtk_constraint_guide_set_min_size",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_constraint_guide_set_name = Interop.downcallHandle(
            "gtk_constraint_guide_set_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_guide_set_nat_size = Interop.downcallHandle(
            "gtk_constraint_guide_set_nat_size",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_constraint_guide_set_strength = Interop.downcallHandle(
            "gtk_constraint_guide_set_strength",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
    }
}
