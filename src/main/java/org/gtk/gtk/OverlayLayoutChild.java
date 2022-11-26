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
    @ApiStatus.Internal
    public OverlayLayoutChild(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to OverlayLayoutChild if its GType is a (or inherits from) "GtkOverlayLayoutChild".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code OverlayLayoutChild} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkOverlayLayoutChild", a ClassCastException will be thrown.
     */
    public static OverlayLayoutChild castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), OverlayLayoutChild.getType())) {
            return new OverlayLayoutChild(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkOverlayLayoutChild");
        }
    }
    
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
        return RESULT != 0;
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
        return RESULT != 0;
    }
    
    /**
     * Sets whether to clip this child.
     * @param clipOverlay whether to clip this child
     */
    public void setClipOverlay(boolean clipOverlay) {
        try {
            DowncallHandles.gtk_overlay_layout_child_set_clip_overlay.invokeExact(
                    handle(),
                    clipOverlay ? 1 : 0);
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
                    measure ? 1 : 0);
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
            RESULT = (long) DowncallHandles.gtk_overlay_layout_child_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.LayoutChild.Build {
        
         /**
         * A {@link OverlayLayoutChild.Build} object constructs a {@link OverlayLayoutChild} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link OverlayLayoutChild} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link OverlayLayoutChild} using {@link OverlayLayoutChild#castFrom}.
         * @return A new instance of {@code OverlayLayoutChild} with the properties 
         *         that were set in the Build object.
         */
        public OverlayLayoutChild construct() {
            return OverlayLayoutChild.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    OverlayLayoutChild.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * Whether the child should be clipped to fit the parent's size.
         * @param clipOverlay The value for the {@code clip-overlay} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setClipOverlay(boolean clipOverlay) {
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
        public Build setMeasure(boolean measure) {
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
