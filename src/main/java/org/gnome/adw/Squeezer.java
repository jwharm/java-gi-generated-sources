package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A best fit container.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="squeezer-wide-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="squeezer-wide.png" alt="squeezer-wide"&gt;
 * &lt;/picture&gt;
 * &lt;picture&gt;
 *   &lt;source srcset="squeezer-narrow-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="squeezer-narrow.png" alt="squeezer-narrow"&gt;
 * &lt;/picture&gt;
 * <p>
 * The {@code AdwSqueezer} widget is a container which only shows the first of its
 * children that fits in the available size. It is convenient to offer different
 * widgets to represent the same data with different levels of detail, making
 * the widget seem to squeeze itself to fit in the available space.
 * <p>
 * Transitions between children can be animated as fades. This can be controlled
 * with {@code Squeezer:transition-type}.
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
 * {@code AdwSqueezer} has a single CSS node with name {@code squeezer}.
 */
public class Squeezer extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {

    public Squeezer(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Squeezer */
    public static Squeezer castFrom(org.gtk.gobject.Object gobject) {
        return new Squeezer(gobject.refcounted());
    }
    
    static final MethodHandle adw_squeezer_new = Interop.downcallHandle(
        "adw_squeezer_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_squeezer_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwSqueezer}.
     */
    public Squeezer() {
        super(constructNew());
    }
    
    static final MethodHandle adw_squeezer_add = Interop.downcallHandle(
        "adw_squeezer_add",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a child to {@code self}.
     */
    public SqueezerPage add(org.gtk.gtk.Widget child) {
        try {
            var RESULT = (MemoryAddress) adw_squeezer_add.invokeExact(handle(), child.handle());
            return new SqueezerPage(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_squeezer_get_allow_none = Interop.downcallHandle(
        "adw_squeezer_get_allow_none",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether to allow squeezing beyond the last child's minimum size.
     */
    public boolean getAllowNone() {
        try {
            var RESULT = (int) adw_squeezer_get_allow_none.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_squeezer_get_homogeneous = Interop.downcallHandle(
        "adw_squeezer_get_homogeneous",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether all children have the same size for the opposite orientation.
     */
    public boolean getHomogeneous() {
        try {
            var RESULT = (int) adw_squeezer_get_homogeneous.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_squeezer_get_interpolate_size = Interop.downcallHandle(
        "adw_squeezer_get_interpolate_size",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code self} interpolates its size when changing the visible child.
     */
    public boolean getInterpolateSize() {
        try {
            var RESULT = (int) adw_squeezer_get_interpolate_size.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_squeezer_get_page = Interop.downcallHandle(
        "adw_squeezer_get_page",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@link SqueezerPage} object for {@code child}.
     */
    public SqueezerPage getPage(org.gtk.gtk.Widget child) {
        try {
            var RESULT = (MemoryAddress) adw_squeezer_get_page.invokeExact(handle(), child.handle());
            return new SqueezerPage(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_squeezer_get_pages = Interop.downcallHandle(
        "adw_squeezer_get_pages",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a {@code Gio.ListModel} that contains the pages of {@code self}.
     * <p>
     * This can be used to keep an up-to-date view. The model also implements
     * {@code Gtk.SelectionModel} and can be used to track the visible page.
     */
    public org.gtk.gtk.SelectionModel getPages() {
        try {
            var RESULT = (MemoryAddress) adw_squeezer_get_pages.invokeExact(handle());
            return new org.gtk.gtk.SelectionModel.SelectionModelImpl(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_squeezer_get_switch_threshold_policy = Interop.downcallHandle(
        "adw_squeezer_get_switch_threshold_policy",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the fold threshold policy for {@code self}.
     */
    public FoldThresholdPolicy getSwitchThresholdPolicy() {
        try {
            var RESULT = (int) adw_squeezer_get_switch_threshold_policy.invokeExact(handle());
            return new FoldThresholdPolicy(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_squeezer_get_transition_duration = Interop.downcallHandle(
        "adw_squeezer_get_transition_duration",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the transition animation duration for {@code self}.
     */
    public int getTransitionDuration() {
        try {
            var RESULT = (int) adw_squeezer_get_transition_duration.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_squeezer_get_transition_running = Interop.downcallHandle(
        "adw_squeezer_get_transition_running",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether a transition is currently running for {@code self}.
     */
    public boolean getTransitionRunning() {
        try {
            var RESULT = (int) adw_squeezer_get_transition_running.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_squeezer_get_transition_type = Interop.downcallHandle(
        "adw_squeezer_get_transition_type",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the type of animation used for transitions between children in {@code self}.
     */
    public SqueezerTransitionType getTransitionType() {
        try {
            var RESULT = (int) adw_squeezer_get_transition_type.invokeExact(handle());
            return new SqueezerTransitionType(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_squeezer_get_visible_child = Interop.downcallHandle(
        "adw_squeezer_get_visible_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the currently visible child of {@code self}.
     */
    public org.gtk.gtk.Widget getVisibleChild() {
        try {
            var RESULT = (MemoryAddress) adw_squeezer_get_visible_child.invokeExact(handle());
            return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_squeezer_get_xalign = Interop.downcallHandle(
        "adw_squeezer_get_xalign",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the horizontal alignment, from 0 (start) to 1 (end).
     */
    public float getXalign() {
        try {
            var RESULT = (float) adw_squeezer_get_xalign.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_squeezer_get_yalign = Interop.downcallHandle(
        "adw_squeezer_get_yalign",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the vertical alignment, from 0 (top) to 1 (bottom).
     */
    public float getYalign() {
        try {
            var RESULT = (float) adw_squeezer_get_yalign.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_squeezer_remove = Interop.downcallHandle(
        "adw_squeezer_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a child widget from {@code self}.
     */
    public void remove(org.gtk.gtk.Widget child) {
        try {
            adw_squeezer_remove.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_squeezer_set_allow_none = Interop.downcallHandle(
        "adw_squeezer_set_allow_none",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether to allow squeezing beyond the last child's minimum size.
     */
    public void setAllowNone(boolean allowNone) {
        try {
            adw_squeezer_set_allow_none.invokeExact(handle(), allowNone ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_squeezer_set_homogeneous = Interop.downcallHandle(
        "adw_squeezer_set_homogeneous",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether all children have the same size for the opposite orientation.
     */
    public void setHomogeneous(boolean homogeneous) {
        try {
            adw_squeezer_set_homogeneous.invokeExact(handle(), homogeneous ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_squeezer_set_interpolate_size = Interop.downcallHandle(
        "adw_squeezer_set_interpolate_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code self} interpolates its size when changing the visible child.
     */
    public void setInterpolateSize(boolean interpolateSize) {
        try {
            adw_squeezer_set_interpolate_size.invokeExact(handle(), interpolateSize ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_squeezer_set_switch_threshold_policy = Interop.downcallHandle(
        "adw_squeezer_set_switch_threshold_policy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the fold threshold policy for {@code self}.
     */
    public void setSwitchThresholdPolicy(FoldThresholdPolicy policy) {
        try {
            adw_squeezer_set_switch_threshold_policy.invokeExact(handle(), policy.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_squeezer_set_transition_duration = Interop.downcallHandle(
        "adw_squeezer_set_transition_duration",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the transition animation duration for {@code self}.
     */
    public void setTransitionDuration(int duration) {
        try {
            adw_squeezer_set_transition_duration.invokeExact(handle(), duration);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_squeezer_set_transition_type = Interop.downcallHandle(
        "adw_squeezer_set_transition_type",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the type of animation used for transitions between children in {@code self}.
     */
    public void setTransitionType(SqueezerTransitionType transition) {
        try {
            adw_squeezer_set_transition_type.invokeExact(handle(), transition.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_squeezer_set_xalign = Interop.downcallHandle(
        "adw_squeezer_set_xalign",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Sets the horizontal alignment, from 0 (start) to 1 (end).
     */
    public void setXalign(float xalign) {
        try {
            adw_squeezer_set_xalign.invokeExact(handle(), xalign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_squeezer_set_yalign = Interop.downcallHandle(
        "adw_squeezer_set_yalign",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Sets the vertical alignment, from 0 (top) to 1 (bottom).
     */
    public void setYalign(float yalign) {
        try {
            adw_squeezer_set_yalign.invokeExact(handle(), yalign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
