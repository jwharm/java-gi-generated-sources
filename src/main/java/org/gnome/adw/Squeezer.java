package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>CSS nodes</strong><br/>
 * {@code AdwSqueezer} has a single CSS node with name {@code squeezer}.
 * @version 1.0
 */
public class Squeezer extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwSqueezer";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Squeezer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Squeezer(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Squeezer if its GType is a (or inherits from) "AdwSqueezer".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Squeezer} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwSqueezer", a ClassCastException will be thrown.
     */
    public static Squeezer castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("AdwSqueezer"))) {
            return new Squeezer(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwSqueezer");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_squeezer_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwSqueezer}.
     */
    public Squeezer() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Adds a child to {@code self}.
     * @param child the widget to add
     * @return the {@link SqueezerPage} for {@code child}
     */
    public @NotNull org.gnome.adw.SqueezerPage add(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_squeezer_add.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.SqueezerPage(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets whether to allow squeezing beyond the last child's minimum size.
     * @return whether {@code self} allows squeezing beyond the last child
     */
    public boolean getAllowNone() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_squeezer_get_allow_none.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether all children have the same size for the opposite orientation.
     * @return whether {@code self} is homogeneous
     */
    public boolean getHomogeneous() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_squeezer_get_homogeneous.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code self} interpolates its size when changing the visible child.
     * @return whether the size is interpolated
     */
    public boolean getInterpolateSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_squeezer_get_interpolate_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the {@link SqueezerPage} object for {@code child}.
     * @param child a child of {@code self}
     * @return the page object for {@code child}
     */
    public @NotNull org.gnome.adw.SqueezerPage getPage(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_squeezer_get_page.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.SqueezerPage(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns a {@code Gio.ListModel} that contains the pages of {@code self}.
     * <p>
     * This can be used to keep an up-to-date view. The model also implements
     * {@code Gtk.SelectionModel} and can be used to track the visible page.
     * @return a {@code GtkSelectionModel} for the squeezer's children
     */
    public @NotNull org.gtk.gtk.SelectionModel getPages() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_squeezer_get_pages.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.SelectionModel.SelectionModelImpl(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the switch threshold policy for {@code self}.
     */
    public @NotNull org.gnome.adw.FoldThresholdPolicy getSwitchThresholdPolicy() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_squeezer_get_switch_threshold_policy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.FoldThresholdPolicy(RESULT);
    }
    
    /**
     * Gets the transition animation duration for {@code self}.
     * @return the transition duration, in milliseconds
     */
    public int getTransitionDuration() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_squeezer_get_transition_duration.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets whether a transition is currently running for {@code self}.
     * <p>
     * If a transition is impossible, the property value will be set to {@code TRUE} and
     * then immediately to {@code FALSE}, so it's possible to rely on its notifications
     * to know that a transition has happened.
     * @return whether a transition is currently running
     */
    public boolean getTransitionRunning() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_squeezer_get_transition_running.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the type of animation used for transitions between children in {@code self}.
     * @return the current transition type of {@code self}
     */
    public @NotNull org.gnome.adw.SqueezerTransitionType getTransitionType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_squeezer_get_transition_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.SqueezerTransitionType(RESULT);
    }
    
    /**
     * Gets the currently visible child of {@code self}.
     * @return the visible child
     */
    public @Nullable org.gtk.gtk.Widget getVisibleChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_squeezer_get_visible_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the horizontal alignment, from 0 (start) to 1 (end).
     * @return the alignment value
     */
    public float getXalign() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.adw_squeezer_get_xalign.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the vertical alignment, from 0 (top) to 1 (bottom).
     * @return the alignment value
     */
    public float getYalign() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.adw_squeezer_get_yalign.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Removes a child widget from {@code self}.
     * @param child the child to remove
     */
    public void remove(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.adw_squeezer_remove.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether to allow squeezing beyond the last child's minimum size.
     * <p>
     * If set to {@code TRUE}, the squeezer can shrink to the point where no child can be
     * shown. This is functionally equivalent to appending a widget with 0×0 minimum
     * size.
     * @param allowNone whether {@code self} allows squeezing beyond the last child
     */
    public void setAllowNone(boolean allowNone) {
        try {
            DowncallHandles.adw_squeezer_set_allow_none.invokeExact(
                    handle(),
                    allowNone ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether all children have the same size for the opposite orientation.
     * <p>
     * For example, if a squeezer is horizontal and is homogeneous, it will request
     * the same height for all its children. If it isn't, the squeezer may change
     * size when a different child becomes visible.
     * @param homogeneous whether {@code self} is homogeneous
     */
    public void setHomogeneous(boolean homogeneous) {
        try {
            DowncallHandles.adw_squeezer_set_homogeneous.invokeExact(
                    handle(),
                    homogeneous ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code self} interpolates its size when changing the visible child.
     * <p>
     * If {@code TRUE}, the squeezer will interpolate its size between the one of the
     * previous visible child and the one of the new visible child, according to the
     * set transition duration and the orientation, e.g. if the squeezer is
     * horizontal, it will interpolate the its height.
     * @param interpolateSize whether to interpolate the size
     */
    public void setInterpolateSize(boolean interpolateSize) {
        try {
            DowncallHandles.adw_squeezer_set_interpolate_size.invokeExact(
                    handle(),
                    interpolateSize ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the switch threshold policy for {@code self}.
     * <p>
     * Determines when the squeezer will switch children.
     * <p>
     * If set to {@code ADW_FOLD_THRESHOLD_POLICY_MINIMUM}, it will only switch when the
     * visible child cannot fit anymore. With {@code ADW_FOLD_THRESHOLD_POLICY_NATURAL},
     * it will switch as soon as the visible child doesn't get their natural size.
     * <p>
     * This can be useful if you have a long ellipsizing label and want to let it
     * ellipsize instead of immediately switching.
     * @param policy the policy to use
     */
    public void setSwitchThresholdPolicy(@NotNull org.gnome.adw.FoldThresholdPolicy policy) {
        java.util.Objects.requireNonNull(policy, "Parameter 'policy' must not be null");
        try {
            DowncallHandles.adw_squeezer_set_switch_threshold_policy.invokeExact(
                    handle(),
                    policy.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the transition animation duration for {@code self}.
     * @param duration the new duration, in milliseconds
     */
    public void setTransitionDuration(int duration) {
        try {
            DowncallHandles.adw_squeezer_set_transition_duration.invokeExact(
                    handle(),
                    duration);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the type of animation used for transitions between children in {@code self}.
     * @param transition the new transition type
     */
    public void setTransitionType(@NotNull org.gnome.adw.SqueezerTransitionType transition) {
        java.util.Objects.requireNonNull(transition, "Parameter 'transition' must not be null");
        try {
            DowncallHandles.adw_squeezer_set_transition_type.invokeExact(
                    handle(),
                    transition.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the horizontal alignment, from 0 (start) to 1 (end).
     * <p>
     * This affects the children allocation during transitions, when they exceed the
     * size of the squeezer.
     * <p>
     * For example, 0.5 means the child will be centered, 0 means it will keep the
     * start side aligned and overflow the end side, and 1 means the opposite.
     * @param xalign the new alignment value
     */
    public void setXalign(float xalign) {
        try {
            DowncallHandles.adw_squeezer_set_xalign.invokeExact(
                    handle(),
                    xalign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the vertical alignment, from 0 (top) to 1 (bottom).
     * <p>
     * This affects the children allocation during transitions, when they exceed the
     * size of the squeezer.
     * <p>
     * For example, 0.5 means the child will be centered, 0 means it will keep the
     * top side aligned and overflow the bottom side, and 1 means the opposite.
     * @param yalign the new alignment value
     */
    public void setYalign(float yalign) {
        try {
            DowncallHandles.adw_squeezer_set_yalign.invokeExact(
                    handle(),
                    yalign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_squeezer_new = Interop.downcallHandle(
            "adw_squeezer_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_add = Interop.downcallHandle(
            "adw_squeezer_add",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_get_allow_none = Interop.downcallHandle(
            "adw_squeezer_get_allow_none",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_get_homogeneous = Interop.downcallHandle(
            "adw_squeezer_get_homogeneous",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_get_interpolate_size = Interop.downcallHandle(
            "adw_squeezer_get_interpolate_size",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_get_page = Interop.downcallHandle(
            "adw_squeezer_get_page",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_get_pages = Interop.downcallHandle(
            "adw_squeezer_get_pages",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_get_switch_threshold_policy = Interop.downcallHandle(
            "adw_squeezer_get_switch_threshold_policy",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_get_transition_duration = Interop.downcallHandle(
            "adw_squeezer_get_transition_duration",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_get_transition_running = Interop.downcallHandle(
            "adw_squeezer_get_transition_running",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_get_transition_type = Interop.downcallHandle(
            "adw_squeezer_get_transition_type",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_get_visible_child = Interop.downcallHandle(
            "adw_squeezer_get_visible_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_get_xalign = Interop.downcallHandle(
            "adw_squeezer_get_xalign",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_get_yalign = Interop.downcallHandle(
            "adw_squeezer_get_yalign",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_remove = Interop.downcallHandle(
            "adw_squeezer_remove",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_set_allow_none = Interop.downcallHandle(
            "adw_squeezer_set_allow_none",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle adw_squeezer_set_homogeneous = Interop.downcallHandle(
            "adw_squeezer_set_homogeneous",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle adw_squeezer_set_interpolate_size = Interop.downcallHandle(
            "adw_squeezer_set_interpolate_size",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle adw_squeezer_set_switch_threshold_policy = Interop.downcallHandle(
            "adw_squeezer_set_switch_threshold_policy",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle adw_squeezer_set_transition_duration = Interop.downcallHandle(
            "adw_squeezer_set_transition_duration",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle adw_squeezer_set_transition_type = Interop.downcallHandle(
            "adw_squeezer_set_transition_type",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle adw_squeezer_set_xalign = Interop.downcallHandle(
            "adw_squeezer_set_xalign",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT),
            false
        );
        
        private static final MethodHandle adw_squeezer_set_yalign = Interop.downcallHandle(
            "adw_squeezer_set_yalign",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT),
            false
        );
    }
}
