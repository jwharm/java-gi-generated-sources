package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkBoxLayout} is a layout manager that arranges children in a single
 * row or column.
 * <p>
 * Whether it is a row or column depends on the value of its
 * {@code Gtk.Orientable:orientation} property. Within the other dimension
 * all children all allocated the same size. The {@code GtkBoxLayout} will respect
 * the {@code Gtk.Widget:halign} and {@code Gtk.Widget:valign}
 * properties of each child widget.
 * <p>
 * If you want all children to be assigned the same size, you can use
 * the {@code Gtk.BoxLayout:homogeneous} property.
 * <p>
 * If you want to specify the amount of space placed between each child,
 * you can use the {@code Gtk.BoxLayout:spacing} property.
 */
public class BoxLayout extends org.gtk.gtk.LayoutManager implements org.gtk.gtk.Orientable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkBoxLayout";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a BoxLayout proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected BoxLayout(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, BoxLayout> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new BoxLayout(input, ownership);
    
    private static MemoryAddress constructNew(org.gtk.gtk.Orientation orientation) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_box_layout_new.invokeExact(
                    orientation.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code GtkBoxLayout}.
     * @param orientation the orientation for the new layout
     */
    public BoxLayout(org.gtk.gtk.Orientation orientation) {
        super(constructNew(orientation), Ownership.FULL);
    }
    
    /**
     * Gets the value set by gtk_box_layout_set_baseline_position().
     * @return the baseline position
     */
    public org.gtk.gtk.BaselinePosition getBaselinePosition() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_box_layout_get_baseline_position.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.BaselinePosition.of(RESULT);
    }
    
    /**
     * Returns whether the layout is set to be homogeneous.
     * @return {@code true} if the layout is homogeneous
     */
    public boolean getHomogeneous() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_box_layout_get_homogeneous.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the space that {@code box_layout} puts between children.
     * @return the spacing of the layout
     */
    public int getSpacing() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_box_layout_get_spacing.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets the baseline position of a box layout.
     * <p>
     * The baseline position affects only horizontal boxes with at least one
     * baseline aligned child. If there is more vertical space available than
     * requested, and the baseline is not allocated by the parent then the
     * given {@code position} is used to allocate the baseline within the extra
     * space available.
     * @param position a {@code GtkBaselinePosition}
     */
    public void setBaselinePosition(org.gtk.gtk.BaselinePosition position) {
        try {
            DowncallHandles.gtk_box_layout_set_baseline_position.invokeExact(
                    handle(),
                    position.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the box layout will allocate the same
     * size to all children.
     * @param homogeneous {@code true} to set the box layout as homogeneous
     */
    public void setHomogeneous(boolean homogeneous) {
        try {
            DowncallHandles.gtk_box_layout_set_homogeneous.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(homogeneous, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets how much spacing to put between children.
     * @param spacing the spacing to apply between children
     */
    public void setSpacing(int spacing) {
        try {
            DowncallHandles.gtk_box_layout_set_spacing.invokeExact(
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
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_box_layout_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link BoxLayout.Builder} object constructs a {@link BoxLayout} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link BoxLayout.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.LayoutManager.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link BoxLayout} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link BoxLayout}.
         * @return A new instance of {@code BoxLayout} with the properties 
         *         that were set in the Builder object.
         */
        public BoxLayout build() {
            return (BoxLayout) org.gtk.gobject.GObject.newWithProperties(
                BoxLayout.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The position of the allocated baseline within the extra space
         * allocated to each child.
         * <p>
         * This property is only relevant for horizontal layouts containing
         * at least one child with a baseline alignment.
         * @param baselinePosition The value for the {@code baseline-position} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBaselinePosition(org.gtk.gtk.BaselinePosition baselinePosition) {
            names.add("baseline-position");
            values.add(org.gtk.gobject.Value.create(baselinePosition));
            return this;
        }
        
        /**
         * Whether the box layout should distribute the available space
         * equally among the children.
         * @param homogeneous The value for the {@code homogeneous} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHomogeneous(boolean homogeneous) {
            names.add("homogeneous");
            values.add(org.gtk.gobject.Value.create(homogeneous));
            return this;
        }
        
        /**
         * The space to put between the children.
         * @param spacing The value for the {@code spacing} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSpacing(int spacing) {
            names.add("spacing");
            values.add(org.gtk.gobject.Value.create(spacing));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_box_layout_new = Interop.downcallHandle(
            "gtk_box_layout_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_box_layout_get_baseline_position = Interop.downcallHandle(
            "gtk_box_layout_get_baseline_position",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_box_layout_get_homogeneous = Interop.downcallHandle(
            "gtk_box_layout_get_homogeneous",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_box_layout_get_spacing = Interop.downcallHandle(
            "gtk_box_layout_get_spacing",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_box_layout_set_baseline_position = Interop.downcallHandle(
            "gtk_box_layout_set_baseline_position",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_box_layout_set_homogeneous = Interop.downcallHandle(
            "gtk_box_layout_set_homogeneous",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_box_layout_set_spacing = Interop.downcallHandle(
            "gtk_box_layout_set_spacing",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_box_layout_get_type = Interop.downcallHandle(
            "gtk_box_layout_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
