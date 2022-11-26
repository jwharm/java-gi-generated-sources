package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GtkBox} widget arranges child widgets into a single row or column.
 * <p>
 * <img src="./doc-files/box.png" alt="An example GtkBox">
 * <p>
 * Whether it is a row or column depends on the value of its
 * {@code Gtk.Orientable:orientation} property. Within the other
 * dimension, all children are allocated the same size. Of course, the
 * {@code Gtk.Widget:halign} and {@code Gtk.Widget:valign} properties
 * can be used on the children to influence their allocation.
 * <p>
 * Use repeated calls to {@link Box#append} to pack widgets into a
 * {@code GtkBox} from start to end. Use {@link Box#remove} to remove widgets
 * from the {@code GtkBox}. {@link Box#insertChildAfter} can be used to add
 * a child at a particular position.
 * <p>
 * Use {@link Box#setHomogeneous} to specify whether or not all children
 * of the {@code GtkBox} are forced to get the same amount of space.
 * <p>
 * Use {@link Box#setSpacing} to determine how much space will be minimally
 * placed between all children in the {@code GtkBox}. Note that spacing is added
 * <em>between</em> the children.
 * <p>
 * Use {@link Box#reorderChildAfter} to move a child to a different
 * place in the box.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code GtkBox} uses a single CSS node with name box.
 * <p>
 * <strong>Accessibility</strong><br/>
 * {@code GtkBox} uses the {@link AccessibleRole#GROUP} role.
 */
public class Box extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkBox";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.Widget.getMemoryLayout().withName("parent_instance")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gtk.Widget parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gtk.Widget(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a Box proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Box(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Box if its GType is a (or inherits from) "GtkBox".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Box} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkBox", a ClassCastException will be thrown.
     */
    public static Box castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), Box.getType())) {
            return new Box(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkBox");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gtk.Orientation orientation, int spacing) {
        java.util.Objects.requireNonNull(orientation, "Parameter 'orientation' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_box_new.invokeExact(
                    orientation.getValue(),
                    spacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkBox}.
     * @param orientation the box’s orientation
     * @param spacing the number of pixels to place by default between children
     */
    public Box(@NotNull org.gtk.gtk.Orientation orientation, int spacing) {
        super(constructNew(orientation, spacing), Ownership.NONE);
    }
    
    /**
     * Adds {@code child} as the last child to {@code box}.
     * @param child the {@code GtkWidget} to append
     */
    public void append(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.gtk_box_append.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the value set by gtk_box_set_baseline_position().
     * @return the baseline position
     */
    public @NotNull org.gtk.gtk.BaselinePosition getBaselinePosition() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_box_get_baseline_position.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.BaselinePosition(RESULT);
    }
    
    /**
     * Returns whether the box is homogeneous (all children are the
     * same size).
     * @return {@code true} if the box is homogeneous.
     */
    public boolean getHomogeneous() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_box_get_homogeneous.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the value set by gtk_box_set_spacing().
     * @return spacing between children
     */
    public int getSpacing() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_box_get_spacing.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Inserts {@code child} in the position after {@code sibling} in the list
     * of {@code box} children.
     * <p>
     * If {@code sibling} is {@code null}, insert {@code child} at the first position.
     * @param child the {@code GtkWidget} to insert
     * @param sibling the sibling after which to insert {@code child}
     */
    public void insertChildAfter(@NotNull org.gtk.gtk.Widget child, @Nullable org.gtk.gtk.Widget sibling) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.gtk_box_insert_child_after.invokeExact(
                    handle(),
                    child.handle(),
                    (Addressable) (sibling == null ? MemoryAddress.NULL : sibling.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds {@code child} as the first child to {@code box}.
     * @param child the {@code GtkWidget} to prepend
     */
    public void prepend(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.gtk_box_prepend.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes a child widget from {@code box}.
     * <p>
     * The child must have been added before with
     * {@link Box#append}, {@link Box#prepend}, or
     * {@link Box#insertChildAfter}.
     * @param child the child to remove
     */
    public void remove(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.gtk_box_remove.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Moves {@code child} to the position after {@code sibling} in the list
     * of {@code box} children.
     * <p>
     * If {@code sibling} is {@code null}, move {@code child} to the first position.
     * @param child the {@code GtkWidget} to move, must be a child of {@code box}
     * @param sibling the sibling to move {@code child} after
     */
    public void reorderChildAfter(@NotNull org.gtk.gtk.Widget child, @Nullable org.gtk.gtk.Widget sibling) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.gtk_box_reorder_child_after.invokeExact(
                    handle(),
                    child.handle(),
                    (Addressable) (sibling == null ? MemoryAddress.NULL : sibling.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the baseline position of a box.
     * <p>
     * This affects only horizontal boxes with at least one baseline
     * aligned child. If there is more vertical space available than
     * requested, and the baseline is not allocated by the parent then
     * {@code position} is used to allocate the baseline with respect to the
     * extra space available.
     * @param position a {@code GtkBaselinePosition}
     */
    public void setBaselinePosition(@NotNull org.gtk.gtk.BaselinePosition position) {
        java.util.Objects.requireNonNull(position, "Parameter 'position' must not be null");
        try {
            DowncallHandles.gtk_box_set_baseline_position.invokeExact(
                    handle(),
                    position.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether or not all children of {@code box} are given equal space
     * in the box.
     * @param homogeneous a boolean value, {@code true} to create equal allotments,
     *   {@code false} for variable allotments
     */
    public void setHomogeneous(boolean homogeneous) {
        try {
            DowncallHandles.gtk_box_set_homogeneous.invokeExact(
                    handle(),
                    homogeneous ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the number of pixels to place between children of {@code box}.
     * @param spacing the number of pixels to put between children
     */
    public void setSpacing(int spacing) {
        try {
            DowncallHandles.gtk_box_set_spacing.invokeExact(
                    handle(),
                    spacing);
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
            RESULT = (long) DowncallHandles.gtk_box_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link Box.Build} object constructs a {@link Box} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Box} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Box} using {@link Box#castFrom}.
         * @return A new instance of {@code Box} with the properties 
         *         that were set in the Build object.
         */
        public Box construct() {
            return Box.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Box.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The position of the baseline aligned widgets if extra space is available.
         * @param baselinePosition The value for the {@code baseline-position} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setBaselinePosition(org.gtk.gtk.BaselinePosition baselinePosition) {
            names.add("baseline-position");
            values.add(org.gtk.gobject.Value.create(baselinePosition));
            return this;
        }
        
        /**
         * Whether the children should all be the same size.
         * @param homogeneous The value for the {@code homogeneous} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHomogeneous(boolean homogeneous) {
            names.add("homogeneous");
            values.add(org.gtk.gobject.Value.create(homogeneous));
            return this;
        }
        
        /**
         * The amount of space between children.
         * @param spacing The value for the {@code spacing} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSpacing(int spacing) {
            names.add("spacing");
            values.add(org.gtk.gobject.Value.create(spacing));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_box_new = Interop.downcallHandle(
            "gtk_box_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_box_append = Interop.downcallHandle(
            "gtk_box_append",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_box_get_baseline_position = Interop.downcallHandle(
            "gtk_box_get_baseline_position",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_box_get_homogeneous = Interop.downcallHandle(
            "gtk_box_get_homogeneous",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_box_get_spacing = Interop.downcallHandle(
            "gtk_box_get_spacing",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_box_insert_child_after = Interop.downcallHandle(
            "gtk_box_insert_child_after",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_box_prepend = Interop.downcallHandle(
            "gtk_box_prepend",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_box_remove = Interop.downcallHandle(
            "gtk_box_remove",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_box_reorder_child_after = Interop.downcallHandle(
            "gtk_box_reorder_child_after",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_box_set_baseline_position = Interop.downcallHandle(
            "gtk_box_set_baseline_position",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_box_set_homogeneous = Interop.downcallHandle(
            "gtk_box_set_homogeneous",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_box_set_spacing = Interop.downcallHandle(
            "gtk_box_set_spacing",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_box_get_type = Interop.downcallHandle(
            "gtk_box_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
