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
     * <p>
     * Because Squeezer is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Squeezer(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
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
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), Squeezer.getType())) {
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
        return org.gnome.adw.FoldThresholdPolicy.of(RESULT);
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
        return org.gnome.adw.SqueezerTransitionType.of(RESULT);
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_squeezer_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link Squeezer.Build} object constructs a {@link Squeezer} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Squeezer} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Squeezer} using {@link Squeezer#castFrom}.
         * @return A new instance of {@code Squeezer} with the properties 
         *         that were set in the Build object.
         */
        public Squeezer construct() {
            return Squeezer.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Squeezer.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * Whether to allow squeezing beyond the last child's minimum size.
         * <p>
         * If set to {@code TRUE}, the squeezer can shrink to the point where no child can
         * be shown. This is functionally equivalent to appending a widget with 0×0
         * minimum size.
         * @param allowNone The value for the {@code allow-none} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAllowNone(boolean allowNone) {
            names.add("allow-none");
            values.add(org.gtk.gobject.Value.create(allowNone));
            return this;
        }
        
        /**
         * Whether all children have the same size for the opposite orientation.
         * <p>
         * For example, if a squeezer is horizontal and is homogeneous, it will
         * request the same height for all its children. If it isn't, the squeezer may
         * change size when a different child becomes visible.
         * @param homogeneous The value for the {@code homogeneous} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setHomogeneous(boolean homogeneous) {
            names.add("homogeneous");
            values.add(org.gtk.gobject.Value.create(homogeneous));
            return this;
        }
        
        /**
         * Whether the squeezer interpolates its size when changing the visible child.
         * <p>
         * If {@code TRUE}, the squeezer will interpolate its size between the one of the
         * previous visible child and the one of the new visible child, according to
         * the set transition duration and the orientation, e.g. if the squeezer is
         * horizontal, it will interpolate the its height.
         * @param interpolateSize The value for the {@code interpolate-size} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInterpolateSize(boolean interpolateSize) {
            names.add("interpolate-size");
            values.add(org.gtk.gobject.Value.create(interpolateSize));
            return this;
        }
        
        /**
         * A selection model with the squeezer's pages.
         * <p>
         * This can be used to keep an up-to-date view. The model also implements
         * {@code Gtk.SelectionModel} and can be used to track the visible page.
         * @param pages The value for the {@code pages} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPages(org.gtk.gtk.SelectionModel pages) {
            names.add("pages");
            values.add(org.gtk.gobject.Value.create(pages));
            return this;
        }
        
        /**
         * The switch threshold policy.
         * <p>
         * Determines when the squeezer will switch children.
         * <p>
         * If set to {@code ADW_FOLD_THRESHOLD_POLICY_MINIMUM}, it will only switch when the
         * visible child cannot fit anymore. With {@code ADW_FOLD_THRESHOLD_POLICY_NATURAL},
         * it will switch as soon as the visible child doesn't get their natural size.
         * <p>
         * This can be useful if you have a long ellipsizing label and want to let it
         * ellipsize instead of immediately switching.
         * @param switchThresholdPolicy The value for the {@code switch-threshold-policy} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSwitchThresholdPolicy(org.gnome.adw.FoldThresholdPolicy switchThresholdPolicy) {
            names.add("switch-threshold-policy");
            values.add(org.gtk.gobject.Value.create(switchThresholdPolicy));
            return this;
        }
        
        /**
         * The transition animation duration, in milliseconds.
         * @param transitionDuration The value for the {@code transition-duration} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTransitionDuration(int transitionDuration) {
            names.add("transition-duration");
            values.add(org.gtk.gobject.Value.create(transitionDuration));
            return this;
        }
        
        /**
         * Whether a transition is currently running.
         * <p>
         * If a transition is impossible, the property value will be set to {@code TRUE} and
         * then immediately to {@code FALSE}, so it's possible to rely on its notifications
         * to know that a transition has happened.
         * @param transitionRunning The value for the {@code transition-running} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTransitionRunning(boolean transitionRunning) {
            names.add("transition-running");
            values.add(org.gtk.gobject.Value.create(transitionRunning));
            return this;
        }
        
        /**
         * The type of animation used for transitions between children.
         * @param transitionType The value for the {@code transition-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTransitionType(org.gnome.adw.SqueezerTransitionType transitionType) {
            names.add("transition-type");
            values.add(org.gtk.gobject.Value.create(transitionType));
            return this;
        }
        
        /**
         * The currently visible child.
         * @param visibleChild The value for the {@code visible-child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setVisibleChild(org.gtk.gtk.Widget visibleChild) {
            names.add("visible-child");
            values.add(org.gtk.gobject.Value.create(visibleChild));
            return this;
        }
        
        /**
         * The horizontal alignment, from 0 (start) to 1 (end).
         * <p>
         * This affects the children allocation during transitions, when they exceed
         * the size of the squeezer.
         * <p>
         * For example, 0.5 means the child will be centered, 0 means it will keep the
         * start side aligned and overflow the end side, and 1 means the opposite.
         * @param xalign The value for the {@code xalign} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setXalign(float xalign) {
            names.add("xalign");
            values.add(org.gtk.gobject.Value.create(xalign));
            return this;
        }
        
        /**
         * The vertical alignment, from 0 (top) to 1 (bottom).
         * <p>
         * This affects the children allocation during transitions, when they exceed
         * the size of the squeezer.
         * <p>
         * For example, 0.5 means the child will be centered, 0 means it will keep the
         * top side aligned and overflow the bottom side, and 1 means the opposite.
         * @param yalign The value for the {@code yalign} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setYalign(float yalign) {
            names.add("yalign");
            values.add(org.gtk.gobject.Value.create(yalign));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_squeezer_new = Interop.downcallHandle(
            "adw_squeezer_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_add = Interop.downcallHandle(
            "adw_squeezer_add",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_get_allow_none = Interop.downcallHandle(
            "adw_squeezer_get_allow_none",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_get_homogeneous = Interop.downcallHandle(
            "adw_squeezer_get_homogeneous",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_get_interpolate_size = Interop.downcallHandle(
            "adw_squeezer_get_interpolate_size",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_get_page = Interop.downcallHandle(
            "adw_squeezer_get_page",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_get_pages = Interop.downcallHandle(
            "adw_squeezer_get_pages",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_get_switch_threshold_policy = Interop.downcallHandle(
            "adw_squeezer_get_switch_threshold_policy",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_get_transition_duration = Interop.downcallHandle(
            "adw_squeezer_get_transition_duration",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_get_transition_running = Interop.downcallHandle(
            "adw_squeezer_get_transition_running",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_get_transition_type = Interop.downcallHandle(
            "adw_squeezer_get_transition_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_get_visible_child = Interop.downcallHandle(
            "adw_squeezer_get_visible_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_get_xalign = Interop.downcallHandle(
            "adw_squeezer_get_xalign",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_get_yalign = Interop.downcallHandle(
            "adw_squeezer_get_yalign",
            FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_remove = Interop.downcallHandle(
            "adw_squeezer_remove",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_squeezer_set_allow_none = Interop.downcallHandle(
            "adw_squeezer_set_allow_none",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_squeezer_set_homogeneous = Interop.downcallHandle(
            "adw_squeezer_set_homogeneous",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_squeezer_set_interpolate_size = Interop.downcallHandle(
            "adw_squeezer_set_interpolate_size",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_squeezer_set_switch_threshold_policy = Interop.downcallHandle(
            "adw_squeezer_set_switch_threshold_policy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_squeezer_set_transition_duration = Interop.downcallHandle(
            "adw_squeezer_set_transition_duration",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_squeezer_set_transition_type = Interop.downcallHandle(
            "adw_squeezer_set_transition_type",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_squeezer_set_xalign = Interop.downcallHandle(
            "adw_squeezer_set_xalign",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle adw_squeezer_set_yalign = Interop.downcallHandle(
            "adw_squeezer_set_yalign",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
            false
        );
        
        private static final MethodHandle adw_squeezer_get_type = Interop.downcallHandle(
            "adw_squeezer_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
