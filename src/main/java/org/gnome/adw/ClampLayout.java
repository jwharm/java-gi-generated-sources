package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A layout manager constraining its children to a given size.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="clamp-wide-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="clamp-wide.png" alt="clamp-wide"&gt;
 * &lt;/picture&gt;
 * &lt;picture&gt;
 *   &lt;source srcset="clamp-narrow-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="clamp-narrow.png" alt="clamp-narrow"&gt;
 * &lt;/picture&gt;
 * <p>
 * {@code AdwClampLayout} constraints the size of the widgets it contains to a given
 * maximum size. It will constrain the width if it is horizontal, or the height
 * if it is vertical. The expansion of the children from their minimum to their
 * maximum size is eased out for a smooth transition.
 * <p>
 * If a child requires more than the requested maximum size, it will be
 * allocated the minimum size it can fit in instead.
 * <p>
 * Each child will get the style  classes .large when it reached its maximum
 * size, .small when it's allocated the full size, .medium in-between, or none
 * if it hasn't been allocated yet.
 */
public class ClampLayout extends org.gtk.gtk.LayoutManager implements org.gtk.gtk.Orientable {

    public ClampLayout(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ClampLayout */
    public static ClampLayout castFrom(org.gtk.gobject.Object gobject) {
        return new ClampLayout(gobject.refcounted());
    }
    
    static final MethodHandle adw_clamp_layout_new = Interop.downcallHandle(
        "adw_clamp_layout_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_clamp_layout_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwClampLayout}.
     */
    public ClampLayout() {
        super(constructNew());
    }
    
    static final MethodHandle adw_clamp_layout_get_maximum_size = Interop.downcallHandle(
        "adw_clamp_layout_get_maximum_size",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the maximum size allocated to the children.
     */
    public int getMaximumSize() {
        try {
            var RESULT = (int) adw_clamp_layout_get_maximum_size.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_clamp_layout_get_tightening_threshold = Interop.downcallHandle(
        "adw_clamp_layout_get_tightening_threshold",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the size above which the children are clamped.
     */
    public int getTighteningThreshold() {
        try {
            var RESULT = (int) adw_clamp_layout_get_tightening_threshold.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_clamp_layout_set_maximum_size = Interop.downcallHandle(
        "adw_clamp_layout_set_maximum_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the maximum size allocated to the children.
     */
    public void setMaximumSize(int maximumSize) {
        try {
            adw_clamp_layout_set_maximum_size.invokeExact(handle(), maximumSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_clamp_layout_set_tightening_threshold = Interop.downcallHandle(
        "adw_clamp_layout_set_tightening_threshold",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the size above which the children are clamped.
     */
    public void setTighteningThreshold(int tighteningThreshold) {
        try {
            adw_clamp_layout_set_tightening_threshold.invokeExact(handle(), tighteningThreshold);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
