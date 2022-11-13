package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An adaptive container acting like a box or a stack.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="leaflet-wide-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="leaflet-wide.png" alt="leaflet-wide"&gt;
 * &lt;/picture&gt;
 * &lt;picture&gt;
 *   &lt;source srcset="leaflet-narrow-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="leaflet-narrow.png" alt="leaflet-narrow"&gt;
 * &lt;/picture&gt;
 * <p>
 * The {@code AdwLeaflet} widget can display its children like a {@link org.gtk.gtk.Box} does
 * or like a {@link org.gtk.gtk.Stack} does, adapting to size changes by switching
 * between the two modes.
 * <p>
 * When there is enough space the children are displayed side by side, otherwise
 * only one is displayed and the leaflet is said to be “folded”.
 * The threshold is dictated by the preferred minimum sizes of the children.
 * When a leaflet is folded, the children can be navigated using swipe gestures.
 * <p>
 * The “over” and “under” transition types stack the children one on top of the
 * other, while the “slide” transition puts the children side by side. While
 * navigating to a child on the side or below can be performed by swiping the
 * current child away, navigating to an upper child requires dragging it from
 * the edge where it resides. This doesn't affect non-dragging swipes.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code AdwLeaflet} has a single CSS node with name {@code leaflet}. The node will get the
 * style classes {@code .folded} when it is folded, {@code .unfolded} when it's not, or none
 * if it hasn't computed its fold yet.
 * @version 1.0
 */
public class Leaflet extends org.gtk.gtk.Widget implements org.gnome.adw.Swipeable, org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwLeaflet";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Leaflet proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Leaflet(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Leaflet if its GType is a (or inherits from) "AdwLeaflet".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Leaflet} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwLeaflet", a ClassCastException will be thrown.
     */
    public static Leaflet castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("AdwLeaflet"))) {
            return new Leaflet(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwLeaflet");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_leaflet_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwLeaflet}.
     */
    public Leaflet() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Adds a child to {@code self}.
     * @param child the widget to add
     * @return the {@link LeafletPage} for {@code child}
     */
    public @NotNull org.gnome.adw.LeafletPage append(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_leaflet_append.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.LeafletPage(RESULT, Ownership.NONE);
    }
    
    /**
     * Finds the previous or next navigatable child.
     * <p>
     * This will be the same child {@code Leaflet#navigate} or swipe gestures will
     * navigate to.
     * <p>
     * If there's no child to navigate to, {@code NULL} will be returned instead.
     * <p>
     * See {@code LeafletPage:navigatable}.
     * @param direction the direction
     * @return the previous or next child
     */
    public @Nullable org.gtk.gtk.Widget getAdjacentChild(@NotNull org.gnome.adw.NavigationDirection direction) {
        java.util.Objects.requireNonNull(direction, "Parameter 'direction' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_leaflet_get_adjacent_child.invokeExact(
                    handle(),
                    direction.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets whether gestures and shortcuts for navigating backward are enabled.
     * @return Whether gestures and shortcuts are enabled.
     */
    public boolean getCanNavigateBack() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_leaflet_get_can_navigate_back.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether gestures and shortcuts for navigating forward are enabled.
     * @return Whether gestures and shortcuts are enabled.
     */
    public boolean getCanNavigateForward() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_leaflet_get_can_navigate_forward.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code self} can unfold.
     * @return whether {@code self} can unfold
     */
    public boolean getCanUnfold() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_leaflet_get_can_unfold.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Finds the child of {@code self} with {@code name}.
     * <p>
     * Returns {@code NULL} if there is no child with this name.
     * <p>
     * See {@code LeafletPage:name}.
     * @param name the name of the child to find
     * @return the requested child of {@code self}
     */
    public @Nullable org.gtk.gtk.Widget getChildByName(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_leaflet_get_child_by_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the child transition spring parameters for {@code self}.
     * @return the child transition parameters
     */
    public @NotNull org.gnome.adw.SpringParams getChildTransitionParams() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_leaflet_get_child_transition_params.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.SpringParams(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets whether a child transition is currently running for {@code self}.
     * @return whether a transition is currently running
     */
    public boolean getChildTransitionRunning() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_leaflet_get_child_transition_running.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the fold threshold policy for {@code self}.
     */
    public @NotNull org.gnome.adw.FoldThresholdPolicy getFoldThresholdPolicy() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_leaflet_get_fold_threshold_policy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.FoldThresholdPolicy(RESULT);
    }
    
    /**
     * Gets whether {@code self} is folded.
     * <p>
     * The leaflet will be folded if the size allocated to it is smaller than the
     * sum of the minimum or natural sizes of the children (see
     * {@code Leaflet:fold-threshold-policy}), it will be unfolded otherwise.
     * @return whether {@code self} is folded.
     */
    public boolean getFolded() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_leaflet_get_folded.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code self} is homogeneous.
     * @return whether {@code self} is homogeneous
     */
    public boolean getHomogeneous() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_leaflet_get_homogeneous.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the mode transition animation duration for {@code self}.
     * @return the mode transition duration, in milliseconds.
     */
    public int getModeTransitionDuration() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_leaflet_get_mode_transition_duration.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the {@link LeafletPage} object for {@code child}.
     * @param child a child of {@code self}
     * @return the page object for {@code child}
     */
    public @NotNull org.gnome.adw.LeafletPage getPage(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_leaflet_get_page.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.LeafletPage(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns a {@code Gio.ListModel} that contains the pages of the leaflet.
     * <p>
     * This can be used to keep an up-to-date view. The model also implements
     * {@code Gtk.SelectionModel} and can be used to track and change the visible
     * page.
     * @return a {@code GtkSelectionModel} for the leaflet's children
     */
    public @NotNull org.gtk.gtk.SelectionModel getPages() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_leaflet_get_pages.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.SelectionModel.SelectionModelImpl(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the type of animation used for transitions between modes and children.
     * @return the current transition type of {@code self}
     */
    public @NotNull org.gnome.adw.LeafletTransitionType getTransitionType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_leaflet_get_transition_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.LeafletTransitionType(RESULT);
    }
    
    /**
     * Gets the widget currently visible when the leaflet is folded.
     * @return the visible child
     */
    public @Nullable org.gtk.gtk.Widget getVisibleChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_leaflet_get_visible_child.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the name of the currently visible child widget.
     * @return the name of the visible child
     */
    public @Nullable java.lang.String getVisibleChildName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_leaflet_get_visible_child_name.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Inserts {@code child} in the position after {@code sibling} in the list of children.
     * <p>
     * If {@code sibling} is {@code NULL}, inserts {@code child} at the first position.
     * @param child the widget to insert
     * @param sibling the sibling after which to insert {@code child}
     * @return the {@link LeafletPage} for {@code child}
     */
    public @NotNull org.gnome.adw.LeafletPage insertChildAfter(@NotNull org.gtk.gtk.Widget child, @Nullable org.gtk.gtk.Widget sibling) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_leaflet_insert_child_after.invokeExact(
                    handle(),
                    child.handle(),
                    (Addressable) (sibling == null ? MemoryAddress.NULL : sibling.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.LeafletPage(RESULT, Ownership.NONE);
    }
    
    /**
     * Navigates to the previous or next child.
     * <p>
     * The child must have the {@code LeafletPage:navigatable} property set to
     * {@code TRUE}, otherwise it will be skipped.
     * <p>
     * This will be the same child as returned by
     * {@code Leaflet#getAdjacentChild} or navigated to via swipe gestures.
     * @param direction the direction
     * @return whether the visible child was changed
     */
    public boolean navigate(@NotNull org.gnome.adw.NavigationDirection direction) {
        java.util.Objects.requireNonNull(direction, "Parameter 'direction' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_leaflet_navigate.invokeExact(
                    handle(),
                    direction.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Inserts {@code child} at the first position in {@code self}.
     * @param child the widget to prepend
     * @return the {@link LeafletPage} for {@code child}
     */
    public @NotNull org.gnome.adw.LeafletPage prepend(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_leaflet_prepend.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.LeafletPage(RESULT, Ownership.NONE);
    }
    
    /**
     * Removes a child widget from {@code self}.
     * @param child the child to remove
     */
    public void remove(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.adw_leaflet_remove.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Moves {@code child} to the position after {@code sibling} in the list of children.
     * <p>
     * If {@code sibling} is {@code NULL}, moves {@code child} to the first position.
     * @param child the widget to move, must be a child of {@code self}
     * @param sibling the sibling to move {@code child} after
     */
    public void reorderChildAfter(@NotNull org.gtk.gtk.Widget child, @Nullable org.gtk.gtk.Widget sibling) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        try {
            DowncallHandles.adw_leaflet_reorder_child_after.invokeExact(
                    handle(),
                    child.handle(),
                    (Addressable) (sibling == null ? MemoryAddress.NULL : sibling.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether gestures and shortcuts for navigating backward are enabled.
     * <p>
     * The supported gestures are:
     * <ul>
     * <li>One-finger swipe on touchscreens
     * <li>Horizontal scrolling on touchpads (usually two-finger swipe)
     * <li>Back/forward mouse buttons
     * </ul>
     * <p>
     * The keyboard back/forward keys are also supported, as well as the
     * &lt;kbd&gt;Alt&lt;/kbd&gt;+&lt;kbd&gt;←&lt;/kbd&gt; shortcut for horizontal orientation, or
     * &lt;kbd&gt;Alt&lt;/kbd&gt;+&lt;kbd&gt;↑&lt;/kbd&gt; for vertical orientation.
     * <p>
     * If the orientation is horizontal, for right-to-left locales, gestures and
     * shortcuts are reversed.
     * <p>
     * Only children that have {@code LeafletPage:navigatable} set to {@code TRUE} can
     * be navigated to.
     * @param canNavigateBack the new value
     */
    public void setCanNavigateBack(boolean canNavigateBack) {
        try {
            DowncallHandles.adw_leaflet_set_can_navigate_back.invokeExact(
                    handle(),
                    canNavigateBack ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether gestures and shortcuts for navigating forward are enabled.
     * <p>
     * The supported gestures are:
     * <ul>
     * <li>One-finger swipe on touchscreens
     * <li>Horizontal scrolling on touchpads (usually two-finger swipe)
     * <li>Back/forward mouse buttons
     * </ul>
     * <p>
     * The keyboard back/forward keys are also supported, as well as the
     * &lt;kbd&gt;Alt&lt;/kbd&gt;+&lt;kbd&gt;→&lt;/kbd&gt; shortcut for horizontal orientation, or
     * &lt;kbd&gt;Alt&lt;/kbd&gt;+&lt;kbd&gt;↓&lt;/kbd&gt; for vertical orientation.
     * <p>
     * If the orientation is horizontal, for right-to-left locales, gestures and
     * shortcuts are reversed.
     * <p>
     * Only children that have {@code LeafletPage:navigatable} set to {@code TRUE} can
     * be navigated to.
     * @param canNavigateForward the new value
     */
    public void setCanNavigateForward(boolean canNavigateForward) {
        try {
            DowncallHandles.adw_leaflet_set_can_navigate_forward.invokeExact(
                    handle(),
                    canNavigateForward ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code self} can unfold.
     * @param canUnfold whether {@code self} can unfold
     */
    public void setCanUnfold(boolean canUnfold) {
        try {
            DowncallHandles.adw_leaflet_set_can_unfold.invokeExact(
                    handle(),
                    canUnfold ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the child transition spring parameters for {@code self}.
     * <p>
     * The default value is equivalent to:
     * <pre>{@code c
     * adw_spring_params_new (1, 0.5, 500)
     * }</pre>
     * @param params the new parameters
     */
    public void setChildTransitionParams(@NotNull org.gnome.adw.SpringParams params) {
        java.util.Objects.requireNonNull(params, "Parameter 'params' must not be null");
        try {
            DowncallHandles.adw_leaflet_set_child_transition_params.invokeExact(
                    handle(),
                    params.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the fold threshold policy for {@code self}.
     * <p>
     * If set to {@code ADW_FOLD_THRESHOLD_POLICY_MINIMUM}, it will only fold when the
     * children cannot fit anymore. With {@code ADW_FOLD_THRESHOLD_POLICY_NATURAL}, it
     * will fold as soon as children don't get their natural size.
     * <p>
     * This can be useful if you have a long ellipsizing label and want to let it
     * ellipsize instead of immediately folding.
     * @param policy the policy to use
     */
    public void setFoldThresholdPolicy(@NotNull org.gnome.adw.FoldThresholdPolicy policy) {
        java.util.Objects.requireNonNull(policy, "Parameter 'policy' must not be null");
        try {
            DowncallHandles.adw_leaflet_set_fold_threshold_policy.invokeExact(
                    handle(),
                    policy.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code self} to be homogeneous or not.
     * <p>
     * If set to {@code FALSE}, different children can have different size along the
     * opposite orientation.
     * @param homogeneous whether to make {@code self} homogeneous
     */
    public void setHomogeneous(boolean homogeneous) {
        try {
            DowncallHandles.adw_leaflet_set_homogeneous.invokeExact(
                    handle(),
                    homogeneous ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the mode transition animation duration for {@code self}.
     * @param duration the new duration, in milliseconds
     */
    public void setModeTransitionDuration(int duration) {
        try {
            DowncallHandles.adw_leaflet_set_mode_transition_duration.invokeExact(
                    handle(),
                    duration);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the type of animation used for transitions between modes and children.
     * <p>
     * The transition type can be changed without problems at runtime, so it is
     * possible to change the animation based on the mode or child that is about to
     * become current.
     * @param transition the new transition type
     */
    public void setTransitionType(@NotNull org.gnome.adw.LeafletTransitionType transition) {
        java.util.Objects.requireNonNull(transition, "Parameter 'transition' must not be null");
        try {
            DowncallHandles.adw_leaflet_set_transition_type.invokeExact(
                    handle(),
                    transition.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the widget currently visible when the leaflet is folded.
     * <p>
     * The transition is determined by {@code Leaflet:transition-type} and
     * {@code Leaflet:child-transition-params}. The transition can be cancelled
     * by the user, in which case visible child will change back to the previously
     * visible child.
     * @param visibleChild the new child
     */
    public void setVisibleChild(@NotNull org.gtk.gtk.Widget visibleChild) {
        java.util.Objects.requireNonNull(visibleChild, "Parameter 'visibleChild' must not be null");
        try {
            DowncallHandles.adw_leaflet_set_visible_child.invokeExact(
                    handle(),
                    visibleChild.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Makes the child with the name {@code name} visible.
     * <p>
     * See {@code Leaflet:visible-child}.
     * @param name the name of a child
     */
    public void setVisibleChildName(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        try {
            DowncallHandles.adw_leaflet_set_visible_child_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_leaflet_new = Interop.downcallHandle(
            "adw_leaflet_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_append = Interop.downcallHandle(
            "adw_leaflet_append",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_adjacent_child = Interop.downcallHandle(
            "adw_leaflet_get_adjacent_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_can_navigate_back = Interop.downcallHandle(
            "adw_leaflet_get_can_navigate_back",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_can_navigate_forward = Interop.downcallHandle(
            "adw_leaflet_get_can_navigate_forward",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_can_unfold = Interop.downcallHandle(
            "adw_leaflet_get_can_unfold",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_child_by_name = Interop.downcallHandle(
            "adw_leaflet_get_child_by_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_child_transition_params = Interop.downcallHandle(
            "adw_leaflet_get_child_transition_params",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_child_transition_running = Interop.downcallHandle(
            "adw_leaflet_get_child_transition_running",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_fold_threshold_policy = Interop.downcallHandle(
            "adw_leaflet_get_fold_threshold_policy",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_folded = Interop.downcallHandle(
            "adw_leaflet_get_folded",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_homogeneous = Interop.downcallHandle(
            "adw_leaflet_get_homogeneous",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_mode_transition_duration = Interop.downcallHandle(
            "adw_leaflet_get_mode_transition_duration",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_page = Interop.downcallHandle(
            "adw_leaflet_get_page",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_pages = Interop.downcallHandle(
            "adw_leaflet_get_pages",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_transition_type = Interop.downcallHandle(
            "adw_leaflet_get_transition_type",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_visible_child = Interop.downcallHandle(
            "adw_leaflet_get_visible_child",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_visible_child_name = Interop.downcallHandle(
            "adw_leaflet_get_visible_child_name",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_insert_child_after = Interop.downcallHandle(
            "adw_leaflet_insert_child_after",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_navigate = Interop.downcallHandle(
            "adw_leaflet_navigate",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle adw_leaflet_prepend = Interop.downcallHandle(
            "adw_leaflet_prepend",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_remove = Interop.downcallHandle(
            "adw_leaflet_remove",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_reorder_child_after = Interop.downcallHandle(
            "adw_leaflet_reorder_child_after",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_set_can_navigate_back = Interop.downcallHandle(
            "adw_leaflet_set_can_navigate_back",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle adw_leaflet_set_can_navigate_forward = Interop.downcallHandle(
            "adw_leaflet_set_can_navigate_forward",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle adw_leaflet_set_can_unfold = Interop.downcallHandle(
            "adw_leaflet_set_can_unfold",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle adw_leaflet_set_child_transition_params = Interop.downcallHandle(
            "adw_leaflet_set_child_transition_params",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_set_fold_threshold_policy = Interop.downcallHandle(
            "adw_leaflet_set_fold_threshold_policy",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle adw_leaflet_set_homogeneous = Interop.downcallHandle(
            "adw_leaflet_set_homogeneous",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle adw_leaflet_set_mode_transition_duration = Interop.downcallHandle(
            "adw_leaflet_set_mode_transition_duration",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle adw_leaflet_set_transition_type = Interop.downcallHandle(
            "adw_leaflet_set_transition_type",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle adw_leaflet_set_visible_child = Interop.downcallHandle(
            "adw_leaflet_set_visible_child",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_set_visible_child_name = Interop.downcallHandle(
            "adw_leaflet_set_visible_child_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
