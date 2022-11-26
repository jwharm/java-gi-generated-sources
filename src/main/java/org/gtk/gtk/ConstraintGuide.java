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
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), ConstraintGuide.getType())) {
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
        MemorySegment widthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(height, "Parameter 'height' must not be null");
        MemorySegment heightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_constraint_guide_get_max_size.invokeExact(
                    handle(),
                    (Addressable) widthPOINTER.address(),
                    (Addressable) heightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        width.set(widthPOINTER.get(Interop.valueLayout.C_INT, 0));
        height.set(heightPOINTER.get(Interop.valueLayout.C_INT, 0));
    }
    
    /**
     * Gets the minimum size of {@code guide}.
     * @param width return location for the minimum width
     * @param height return location for the minimum height
     */
    public void getMinSize(Out<Integer> width, Out<Integer> height) {
        java.util.Objects.requireNonNull(width, "Parameter 'width' must not be null");
        MemorySegment widthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(height, "Parameter 'height' must not be null");
        MemorySegment heightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_constraint_guide_get_min_size.invokeExact(
                    handle(),
                    (Addressable) widthPOINTER.address(),
                    (Addressable) heightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        width.set(widthPOINTER.get(Interop.valueLayout.C_INT, 0));
        height.set(heightPOINTER.get(Interop.valueLayout.C_INT, 0));
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
        MemorySegment widthPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(height, "Parameter 'height' must not be null");
        MemorySegment heightPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        try {
            DowncallHandles.gtk_constraint_guide_get_nat_size.invokeExact(
                    handle(),
                    (Addressable) widthPOINTER.address(),
                    (Addressable) heightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        width.set(widthPOINTER.get(Interop.valueLayout.C_INT, 0));
        height.set(heightPOINTER.get(Interop.valueLayout.C_INT, 0));
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_constraint_guide_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link ConstraintGuide.Build} object constructs a {@link ConstraintGuide} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ConstraintGuide} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ConstraintGuide} using {@link ConstraintGuide#castFrom}.
         * @return A new instance of {@code ConstraintGuide} with the properties 
         *         that were set in the Build object.
         */
        public ConstraintGuide construct() {
            return ConstraintGuide.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ConstraintGuide.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The maximum height of the guide.
         * @param maxHeight The value for the {@code max-height} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMaxHeight(int maxHeight) {
            names.add("max-height");
            values.add(org.gtk.gobject.Value.create(maxHeight));
            return this;
        }
        
        /**
         * The maximum width of the guide.
         * @param maxWidth The value for the {@code max-width} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMaxWidth(int maxWidth) {
            names.add("max-width");
            values.add(org.gtk.gobject.Value.create(maxWidth));
            return this;
        }
        
        /**
         * The minimum height of the guide.
         * @param minHeight The value for the {@code min-height} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMinHeight(int minHeight) {
            names.add("min-height");
            values.add(org.gtk.gobject.Value.create(minHeight));
            return this;
        }
        
        /**
         * The minimum width of the guide.
         * @param minWidth The value for the {@code min-width} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMinWidth(int minWidth) {
            names.add("min-width");
            values.add(org.gtk.gobject.Value.create(minWidth));
            return this;
        }
        
        /**
         * A name that identifies the {@code GtkConstraintGuide}, for debugging.
         * @param name The value for the {@code name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setName(java.lang.String name) {
            names.add("name");
            values.add(org.gtk.gobject.Value.create(name));
            return this;
        }
        
        /**
         * The preferred, or natural, height of the guide.
         * @param natHeight The value for the {@code nat-height} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNatHeight(int natHeight) {
            names.add("nat-height");
            values.add(org.gtk.gobject.Value.create(natHeight));
            return this;
        }
        
        /**
         * The preferred, or natural, width of the guide.
         * @param natWidth The value for the {@code nat-width} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNatWidth(int natWidth) {
            names.add("nat-width");
            values.add(org.gtk.gobject.Value.create(natWidth));
            return this;
        }
        
        /**
         * The {@code GtkConstraintStrength} to be used for the constraint on
         * the natural size of the guide.
         * @param strength The value for the {@code strength} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setStrength(org.gtk.gtk.ConstraintStrength strength) {
            names.add("strength");
            values.add(org.gtk.gobject.Value.create(strength));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_constraint_guide_new = Interop.downcallHandle(
            "gtk_constraint_guide_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_guide_get_max_size = Interop.downcallHandle(
            "gtk_constraint_guide_get_max_size",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_guide_get_min_size = Interop.downcallHandle(
            "gtk_constraint_guide_get_min_size",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_guide_get_name = Interop.downcallHandle(
            "gtk_constraint_guide_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_guide_get_nat_size = Interop.downcallHandle(
            "gtk_constraint_guide_get_nat_size",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_guide_get_strength = Interop.downcallHandle(
            "gtk_constraint_guide_get_strength",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_guide_set_max_size = Interop.downcallHandle(
            "gtk_constraint_guide_set_max_size",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_constraint_guide_set_min_size = Interop.downcallHandle(
            "gtk_constraint_guide_set_min_size",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_constraint_guide_set_name = Interop.downcallHandle(
            "gtk_constraint_guide_set_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_constraint_guide_set_nat_size = Interop.downcallHandle(
            "gtk_constraint_guide_set_nat_size",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_constraint_guide_set_strength = Interop.downcallHandle(
            "gtk_constraint_guide_set_strength",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_constraint_guide_get_type = Interop.downcallHandle(
            "gtk_constraint_guide_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
