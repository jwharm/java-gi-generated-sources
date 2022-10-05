package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A widget constraining its child to a given size.
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
 * The {@code AdwClamp} widget constrains the size of the widget it contains to a
 * given maximum size. It will constrain the width if it is horizontal, or the
 * height if it is vertical. The expansion of the child from its minimum to its
 * maximum size is eased out for a smooth transition.
 * <p>
 * If the child requires more than the requested maximum size, it will be
 * allocated the minimum size it can fit in instead.
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
 * {@code AdwClamp} has a single CSS node with name {@code clamp}.
 * <p>
 * Its children will receive the style classes {@code .large} when the child reached
 * its maximum size, {@code .small} when the clamp allocates its full size to the
 * child, {@code .medium} in-between, or none if it hasn't computed its size yet.
 */
public class Clamp extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {

    public Clamp(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Clamp */
    public static Clamp castFrom(org.gtk.gobject.Object gobject) {
        return new Clamp(gobject.refcounted());
    }
    
    static final MethodHandle adw_clamp_new = Interop.downcallHandle(
        "adw_clamp_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_clamp_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwClamp}.
     */
    public Clamp() {
        super(constructNew());
    }
    
    static final MethodHandle adw_clamp_get_child = Interop.downcallHandle(
        "adw_clamp_get_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child widget of {@code self}.
     */
    public org.gtk.gtk.Widget getChild() {
        try {
            var RESULT = (MemoryAddress) adw_clamp_get_child.invokeExact(handle());
            return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_clamp_get_maximum_size = Interop.downcallHandle(
        "adw_clamp_get_maximum_size",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the maximum size allocated to the child.
     */
    public int getMaximumSize() {
        try {
            var RESULT = (int) adw_clamp_get_maximum_size.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_clamp_get_tightening_threshold = Interop.downcallHandle(
        "adw_clamp_get_tightening_threshold",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the size above which the child is clamped.
     */
    public int getTighteningThreshold() {
        try {
            var RESULT = (int) adw_clamp_get_tightening_threshold.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_clamp_set_child = Interop.downcallHandle(
        "adw_clamp_set_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the child widget of {@code self}.
     */
    public void setChild(org.gtk.gtk.Widget child) {
        try {
            adw_clamp_set_child.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_clamp_set_maximum_size = Interop.downcallHandle(
        "adw_clamp_set_maximum_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the maximum size allocated to the child.
     */
    public void setMaximumSize(int maximumSize) {
        try {
            adw_clamp_set_maximum_size.invokeExact(handle(), maximumSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_clamp_set_tightening_threshold = Interop.downcallHandle(
        "adw_clamp_set_tightening_threshold",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the size above which the child is clamped.
     */
    public void setTighteningThreshold(int tighteningThreshold) {
        try {
            adw_clamp_set_tightening_threshold.invokeExact(handle(), tighteningThreshold);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
