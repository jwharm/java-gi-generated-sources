package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A scrollable {@link Clamp}.
 * <p>
 * {@code AdwClampScrollable} is a variant of {@link Clamp} that implements the
 * {@code Gtk.Scrollable} interface.
 * <p>
 * The primary use case for {@code AdwClampScrollable} is clamping
 * {@link org.gtk.gtk.ListView}.
 */
public class ClampScrollable extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable, org.gtk.gtk.Scrollable {

    public ClampScrollable(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ClampScrollable */
    public static ClampScrollable castFrom(org.gtk.gobject.Object gobject) {
        return new ClampScrollable(gobject.refcounted());
    }
    
    static final MethodHandle adw_clamp_scrollable_new = Interop.downcallHandle(
        "adw_clamp_scrollable_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_clamp_scrollable_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwClampScrollable}.
     */
    public ClampScrollable() {
        super(constructNew());
    }
    
    static final MethodHandle adw_clamp_scrollable_get_child = Interop.downcallHandle(
        "adw_clamp_scrollable_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child widget of {@code self}.
     */
    public org.gtk.gtk.Widget getChild() {
        try {
            var RESULT = (MemoryAddress) adw_clamp_scrollable_get_child.invokeExact(handle());
            return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_clamp_scrollable_get_maximum_size = Interop.downcallHandle(
        "adw_clamp_scrollable_get_maximum_size",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the maximum size allocated to the child.
     */
    public int getMaximumSize() {
        try {
            var RESULT = (int) adw_clamp_scrollable_get_maximum_size.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_clamp_scrollable_get_tightening_threshold = Interop.downcallHandle(
        "adw_clamp_scrollable_get_tightening_threshold",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the size above which the child is clamped.
     */
    public int getTighteningThreshold() {
        try {
            var RESULT = (int) adw_clamp_scrollable_get_tightening_threshold.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_clamp_scrollable_set_child = Interop.downcallHandle(
        "adw_clamp_scrollable_set_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the child widget of {@code self}.
     */
    public void setChild(org.gtk.gtk.Widget child) {
        try {
            adw_clamp_scrollable_set_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_clamp_scrollable_set_maximum_size = Interop.downcallHandle(
        "adw_clamp_scrollable_set_maximum_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the maximum size allocated to the child.
     */
    public void setMaximumSize(int maximumSize) {
        try {
            adw_clamp_scrollable_set_maximum_size.invokeExact(handle(), maximumSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_clamp_scrollable_set_tightening_threshold = Interop.downcallHandle(
        "adw_clamp_scrollable_set_tightening_threshold",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the size above which the child is clamped.
     */
    public void setTighteningThreshold(int tighteningThreshold) {
        try {
            adw_clamp_scrollable_set_tightening_threshold.invokeExact(handle(), tighteningThreshold);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
