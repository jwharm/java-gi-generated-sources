package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkLayoutChild} subclass for children in a {@code GtkOverlayLayout}.
 */
public class OverlayLayoutChild extends org.gtk.gtk.LayoutChild {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkOverlayLayoutChild";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a OverlayLayoutChild proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected OverlayLayoutChild(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, OverlayLayoutChild> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new OverlayLayoutChild(input, ownership);
    
    /**
     * Retrieves whether the child is clipped.
     * @return whether the child is clipped
     */
    public boolean getClipOverlay() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_overlay_layout_child_get_clip_overlay.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Retrieves whether the child is measured.
     * @return whether the child is measured
     */
    public boolean getMeasure() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_overlay_layout_child_get_measure.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets whether to clip this child.
     * @param clipOverlay whether to clip this child
     */
    public void setClipOverlay(boolean clipOverlay) {
        try {
            DowncallHandles.gtk_overlay_layout_child_set_clip_overlay.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(clipOverlay, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether to measure this child.
     * @param measure whether to measure this child
     */
    public void setMeasure(boolean measure) {
        try {
            DowncallHandles.gtk_overlay_layout_child_set_measure.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(measure, null).intValue());
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
            RESULT = (long) DowncallHandles.gtk_overlay_layout_child_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link OverlayLayoutChild.Builder} object constructs a {@link OverlayLayoutChild} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link OverlayLayoutChild.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.LayoutChild.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link OverlayLayoutChild} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link OverlayLayoutChild}.
         * @return A new instance of {@code OverlayLayoutChild} with the properties 
         *         that were set in the Builder object.
         */
        public OverlayLayoutChild build() {
            return (OverlayLayoutChild) org.gtk.gobject.GObject.newWithProperties(
                OverlayLayoutChild.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether the child should be clipped to fit the parent's size.
         * @param clipOverlay The value for the {@code clip-overlay} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setClipOverlay(boolean clipOverlay) {
            names.add("clip-overlay");
            values.add(org.gtk.gobject.Value.create(clipOverlay));
            return this;
        }
        
        /**
         * Whether the child size should contribute to the {@code GtkOverlayLayout}'s
         * measurement.
         * @param measure The value for the {@code measure} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMeasure(boolean measure) {
            names.add("measure");
            values.add(org.gtk.gobject.Value.create(measure));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_overlay_layout_child_get_clip_overlay = Interop.downcallHandle(
            "gtk_overlay_layout_child_get_clip_overlay",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_overlay_layout_child_get_measure = Interop.downcallHandle(
            "gtk_overlay_layout_child_get_measure",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_overlay_layout_child_set_clip_overlay = Interop.downcallHandle(
            "gtk_overlay_layout_child_set_clip_overlay",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_overlay_layout_child_set_measure = Interop.downcallHandle(
            "gtk_overlay_layout_child_set_measure",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_overlay_layout_child_get_type = Interop.downcallHandle(
            "gtk_overlay_layout_child_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
