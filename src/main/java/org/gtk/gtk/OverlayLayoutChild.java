package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkLayoutChild} subclass for children in a {@code GtkOverlayLayout}.
 */
public class OverlayLayoutChild extends LayoutChild {

    public OverlayLayoutChild(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to OverlayLayoutChild */
    public static OverlayLayoutChild castFrom(org.gtk.gobject.Object gobject) {
        return new OverlayLayoutChild(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_overlay_layout_child_get_clip_overlay = Interop.downcallHandle(
        "gtk_overlay_layout_child_get_clip_overlay",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves whether the child is clipped.
     */
    public boolean getClipOverlay() {
        int RESULT;
        try {
            RESULT = (int) gtk_overlay_layout_child_get_clip_overlay.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_overlay_layout_child_get_measure = Interop.downcallHandle(
        "gtk_overlay_layout_child_get_measure",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves whether the child is measured.
     */
    public boolean getMeasure() {
        int RESULT;
        try {
            RESULT = (int) gtk_overlay_layout_child_get_measure.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_overlay_layout_child_set_clip_overlay = Interop.downcallHandle(
        "gtk_overlay_layout_child_set_clip_overlay",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether to clip this child.
     */
    public @NotNull void setClipOverlay(@NotNull boolean clipOverlay) {
        try {
            gtk_overlay_layout_child_set_clip_overlay.invokeExact(handle(), clipOverlay ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_overlay_layout_child_set_measure = Interop.downcallHandle(
        "gtk_overlay_layout_child_set_measure",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether to measure this child.
     */
    public @NotNull void setMeasure(@NotNull boolean measure) {
        try {
            gtk_overlay_layout_child_set_measure.invokeExact(handle(), measure ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
