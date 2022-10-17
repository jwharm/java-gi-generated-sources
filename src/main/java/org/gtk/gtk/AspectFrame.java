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
 * 
 * <h1>CSS nodes</h1>
 * {@code GtkAspectFrame} uses a CSS node with name {@code frame}.
 */
public class AspectFrame extends Widget implements Accessible, Buildable, ConstraintTarget {

    public AspectFrame(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to AspectFrame */
    public static AspectFrame castFrom(org.gtk.gobject.Object gobject) {
        return new AspectFrame(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_aspect_frame_new = Interop.downcallHandle(
        "gtk_aspect_frame_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(@NotNull float xalign, @NotNull float yalign, @NotNull float ratio, @NotNull boolean obeyChild) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_aspect_frame_new.invokeExact(xalign, yalign, ratio, obeyChild ? 1 : 0), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Create a new {@code GtkAspectFrame}.
     */
    public AspectFrame(@NotNull float xalign, @NotNull float yalign, @NotNull float ratio, @NotNull boolean obeyChild) {
        super(constructNew(xalign, yalign, ratio, obeyChild));
    }
    
    private static final MethodHandle gtk_aspect_frame_get_child = Interop.downcallHandle(
        "gtk_aspect_frame_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child widget of {@code self}.
     */
    public @Nullable Widget getChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_aspect_frame_get_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_aspect_frame_get_obey_child = Interop.downcallHandle(
        "gtk_aspect_frame_get_obey_child",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the child's size request should override
     * the set aspect ratio of the {@code GtkAspectFrame}.
     */
    public boolean getObeyChild() {
        int RESULT;
        try {
            RESULT = (int) gtk_aspect_frame_get_obey_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_aspect_frame_get_ratio = Interop.downcallHandle(
        "gtk_aspect_frame_get_ratio",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the desired aspect ratio of the child.
     */
    public float getRatio() {
        float RESULT;
        try {
            RESULT = (float) gtk_aspect_frame_get_ratio.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_aspect_frame_get_xalign = Interop.downcallHandle(
        "gtk_aspect_frame_get_xalign",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the horizontal alignment of the child within the
     * allocation of the {@code GtkAspectFrame}.
     */
    public float getXalign() {
        float RESULT;
        try {
            RESULT = (float) gtk_aspect_frame_get_xalign.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_aspect_frame_get_yalign = Interop.downcallHandle(
        "gtk_aspect_frame_get_yalign",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the vertical alignment of the child within the
     * allocation of the {@code GtkAspectFrame}.
     */
    public float getYalign() {
        float RESULT;
        try {
            RESULT = (float) gtk_aspect_frame_get_yalign.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_aspect_frame_set_child = Interop.downcallHandle(
        "gtk_aspect_frame_set_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the child widget of {@code self}.
     */
    public @NotNull void setChild(@Nullable Widget child) {
        try {
            gtk_aspect_frame_set_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_aspect_frame_set_obey_child = Interop.downcallHandle(
        "gtk_aspect_frame_set_obey_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the aspect ratio of the child's size
     * request should override the set aspect ratio of
     * the {@code GtkAspectFrame}.
     */
    public @NotNull void setObeyChild(@NotNull boolean obeyChild) {
        try {
            gtk_aspect_frame_set_obey_child.invokeExact(handle(), obeyChild ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_aspect_frame_set_ratio = Interop.downcallHandle(
        "gtk_aspect_frame_set_ratio",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Sets the desired aspect ratio of the child.
     */
    public @NotNull void setRatio(@NotNull float ratio) {
        try {
            gtk_aspect_frame_set_ratio.invokeExact(handle(), ratio);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_aspect_frame_set_xalign = Interop.downcallHandle(
        "gtk_aspect_frame_set_xalign",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Sets the horizontal alignment of the child within the allocation
     * of the {@code GtkAspectFrame}.
     */
    public @NotNull void setXalign(@NotNull float xalign) {
        try {
            gtk_aspect_frame_set_xalign.invokeExact(handle(), xalign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_aspect_frame_set_yalign = Interop.downcallHandle(
        "gtk_aspect_frame_set_yalign",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Sets the vertical alignment of the child within the allocation
     * of the {@code GtkAspectFrame}.
     */
    public @NotNull void setYalign(@NotNull float yalign) {
        try {
            gtk_aspect_frame_set_yalign.invokeExact(handle(), yalign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
