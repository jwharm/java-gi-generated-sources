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
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public OverlayLayoutChild(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to OverlayLayoutChild if its GType is a (or inherits from) "GtkOverlayLayoutChild".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "OverlayLayoutChild" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkOverlayLayoutChild", a ClassCastException will be thrown.
     */
    public static OverlayLayoutChild castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkOverlayLayoutChild"))) {
            return new OverlayLayoutChild(gobject.refcounted());
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
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_overlay_layout_child_get_clip_overlay = Interop.downcallHandle(
            "gtk_overlay_layout_child_get_clip_overlay",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_overlay_layout_child_get_measure = Interop.downcallHandle(
            "gtk_overlay_layout_child_get_measure",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_overlay_layout_child_set_clip_overlay = Interop.downcallHandle(
            "gtk_overlay_layout_child_set_clip_overlay",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_overlay_layout_child_set_measure = Interop.downcallHandle(
            "gtk_overlay_layout_child_set_measure",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
