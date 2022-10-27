package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code GtkAspectFrame} preserves the aspect ratio of its child.
 * <p>
 * The frame can respect the aspect ratio of the child widget,
 * or use its own aspect ratio.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code GtkAspectFrame} uses a CSS node with name {@code frame}.
 */
public class AspectFrame extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public AspectFrame(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to AspectFrame */
    public static AspectFrame castFrom(org.gtk.gobject.Object gobject) {
        return new AspectFrame(gobject.refcounted());
    }
    
    private static Refcounted constructNew(float xalign, float yalign, float ratio, boolean obeyChild) {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_aspect_frame_new.invokeExact(xalign, yalign, ratio, obeyChild ? 1 : 0), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new {@code GtkAspectFrame}.
     * @param xalign Horizontal alignment of the child within the parent.
     *   Ranges from 0.0 (left aligned) to 1.0 (right aligned)
     * @param yalign Vertical alignment of the child within the parent.
     *   Ranges from 0.0 (top aligned) to 1.0 (bottom aligned)
     * @param ratio The desired aspect ratio.
     * @param obeyChild If {@code true}, {@code ratio} is ignored, and the aspect
     *   ratio is taken from the requistion of the child.
     */
    public AspectFrame(float xalign, float yalign, float ratio, boolean obeyChild) {
        super(constructNew(xalign, yalign, ratio, obeyChild));
    }
    
    /**
     * Gets the child widget of {@code self}.
     * @return the child widget of self@
     */
    public @Nullable org.gtk.gtk.Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_aspect_frame_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns whether the child's size request should override
     * the set aspect ratio of the {@code GtkAspectFrame}.
     * @return whether to obey the child's size request
     */
    public boolean getObeyChild() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_aspect_frame_get_obey_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the desired aspect ratio of the child.
     * @return the desired aspect ratio
     */
    public float getRatio() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gtk_aspect_frame_get_ratio.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the horizontal alignment of the child within the
     * allocation of the {@code GtkAspectFrame}.
     * @return the horizontal alignment
     */
    public float getXalign() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gtk_aspect_frame_get_xalign.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the vertical alignment of the child within the
     * allocation of the {@code GtkAspectFrame}.
     * @return the vertical alignment
     */
    public float getYalign() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.gtk_aspect_frame_get_yalign.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets the child widget of {@code self}.
     * @param child the child widget
     */
    public void setChild(@Nullable org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNullElse(child, MemoryAddress.NULL);
        try {
            DowncallHandles.gtk_aspect_frame_set_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the aspect ratio of the child's size
     * request should override the set aspect ratio of
     * the {@code GtkAspectFrame}.
     * @param obeyChild If {@code true}, {@code ratio} is ignored, and the aspect
     *    ratio is taken from the requistion of the child.
     */
    public void setObeyChild(boolean obeyChild) {
        try {
            DowncallHandles.gtk_aspect_frame_set_obey_child.invokeExact(handle(), obeyChild ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the desired aspect ratio of the child.
     * @param ratio aspect ratio of the child
     */
    public void setRatio(float ratio) {
        try {
            DowncallHandles.gtk_aspect_frame_set_ratio.invokeExact(handle(), ratio);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the horizontal alignment of the child within the allocation
     * of the {@code GtkAspectFrame}.
     * @param xalign horizontal alignment, from 0.0 (left aligned) to 1.0 (right aligned)
     */
    public void setXalign(float xalign) {
        try {
            DowncallHandles.gtk_aspect_frame_set_xalign.invokeExact(handle(), xalign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the vertical alignment of the child within the allocation
     * of the {@code GtkAspectFrame}.
     * @param yalign horizontal alignment, from 0.0 (top aligned) to 1.0 (bottom aligned)
     */
    public void setYalign(float yalign) {
        try {
            DowncallHandles.gtk_aspect_frame_set_yalign.invokeExact(handle(), yalign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_aspect_frame_new = Interop.downcallHandle(
            "gtk_aspect_frame_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_aspect_frame_get_child = Interop.downcallHandle(
            "gtk_aspect_frame_get_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_aspect_frame_get_obey_child = Interop.downcallHandle(
            "gtk_aspect_frame_get_obey_child",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_aspect_frame_get_ratio = Interop.downcallHandle(
            "gtk_aspect_frame_get_ratio",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_aspect_frame_get_xalign = Interop.downcallHandle(
            "gtk_aspect_frame_get_xalign",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_aspect_frame_get_yalign = Interop.downcallHandle(
            "gtk_aspect_frame_get_yalign",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_aspect_frame_set_child = Interop.downcallHandle(
            "gtk_aspect_frame_set_child",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_aspect_frame_set_obey_child = Interop.downcallHandle(
            "gtk_aspect_frame_set_obey_child",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle gtk_aspect_frame_set_ratio = Interop.downcallHandle(
            "gtk_aspect_frame_set_ratio",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
        );
        
        private static final MethodHandle gtk_aspect_frame_set_xalign = Interop.downcallHandle(
            "gtk_aspect_frame_set_xalign",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
        );
        
        private static final MethodHandle gtk_aspect_frame_set_yalign = Interop.downcallHandle(
            "gtk_aspect_frame_set_yalign",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
        );
    }
}
