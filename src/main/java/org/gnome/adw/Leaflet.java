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
     * <p>
     * Because Leaflet is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Leaflet(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Leaflet> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Leaflet(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
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
    public org.gnome.adw.LeafletPage append(org.gtk.gtk.Widget child) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_leaflet_append.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gnome.adw.LeafletPage) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gnome.adw.LeafletPage.fromAddress).marshal(RESULT, Ownership.NONE);
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
    public @Nullable org.gtk.gtk.Widget getAdjacentChild(org.gnome.adw.NavigationDirection direction) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_leaflet_get_adjacent_child.invokeExact(
                    handle(),
                    direction.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public @Nullable org.gtk.gtk.Widget getChildByName(java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_leaflet_get_child_by_name.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the child transition spring parameters for {@code self}.
     * @return the child transition parameters
     */
    public org.gnome.adw.SpringParams getChildTransitionParams() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_leaflet_get_child_transition_params.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gnome.adw.SpringParams.fromAddress.marshal(RESULT, Ownership.FULL);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the fold threshold policy for {@code self}.
     */
    public org.gnome.adw.FoldThresholdPolicy getFoldThresholdPolicy() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_leaflet_get_fold_threshold_policy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gnome.adw.FoldThresholdPolicy.of(RESULT);
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
    public org.gnome.adw.LeafletPage getPage(org.gtk.gtk.Widget child) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_leaflet_get_page.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gnome.adw.LeafletPage) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gnome.adw.LeafletPage.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns a {@code Gio.ListModel} that contains the pages of the leaflet.
     * <p>
     * This can be used to keep an up-to-date view. The model also implements
     * {@code Gtk.SelectionModel} and can be used to track and change the visible
     * page.
     * @return a {@code GtkSelectionModel} for the leaflet's children
     */
    public org.gtk.gtk.SelectionModel getPages() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_leaflet_get_pages.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.SelectionModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.SelectionModel.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the type of animation used for transitions between modes and children.
     * @return the current transition type of {@code self}
     */
    public org.gnome.adw.LeafletTransitionType getTransitionType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_leaflet_get_transition_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gnome.adw.LeafletTransitionType.of(RESULT);
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
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
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
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Inserts {@code child} in the position after {@code sibling} in the list of children.
     * <p>
     * If {@code sibling} is {@code NULL}, inserts {@code child} at the first position.
     * @param child the widget to insert
     * @param sibling the sibling after which to insert {@code child}
     * @return the {@link LeafletPage} for {@code child}
     */
    public org.gnome.adw.LeafletPage insertChildAfter(org.gtk.gtk.Widget child, @Nullable org.gtk.gtk.Widget sibling) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_leaflet_insert_child_after.invokeExact(
                    handle(),
                    child.handle(),
                    (Addressable) (sibling == null ? MemoryAddress.NULL : sibling.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gnome.adw.LeafletPage) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gnome.adw.LeafletPage.fromAddress).marshal(RESULT, Ownership.NONE);
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
    public boolean navigate(org.gnome.adw.NavigationDirection direction) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_leaflet_navigate.invokeExact(
                    handle(),
                    direction.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Inserts {@code child} at the first position in {@code self}.
     * @param child the widget to prepend
     * @return the {@link LeafletPage} for {@code child}
     */
    public org.gnome.adw.LeafletPage prepend(org.gtk.gtk.Widget child) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_leaflet_prepend.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gnome.adw.LeafletPage) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gnome.adw.LeafletPage.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Removes a child widget from {@code self}.
     * @param child the child to remove
     */
    public void remove(org.gtk.gtk.Widget child) {
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
    public void reorderChildAfter(org.gtk.gtk.Widget child, @Nullable org.gtk.gtk.Widget sibling) {
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
                    Marshal.booleanToInteger.marshal(canNavigateBack, null).intValue());
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
                    Marshal.booleanToInteger.marshal(canNavigateForward, null).intValue());
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
                    Marshal.booleanToInteger.marshal(canUnfold, null).intValue());
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
    public void setChildTransitionParams(org.gnome.adw.SpringParams params) {
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
    public void setFoldThresholdPolicy(org.gnome.adw.FoldThresholdPolicy policy) {
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
                    Marshal.booleanToInteger.marshal(homogeneous, null).intValue());
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
    public void setTransitionType(org.gnome.adw.LeafletTransitionType transition) {
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
    public void setVisibleChild(org.gtk.gtk.Widget visibleChild) {
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
    public void setVisibleChildName(java.lang.String name) {
        try {
            DowncallHandles.adw_leaflet_set_visible_child_name.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(name, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_leaflet_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Leaflet.Builder} object constructs a {@link Leaflet} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Leaflet.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Leaflet} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Leaflet}.
         * @return A new instance of {@code Leaflet} with the properties 
         *         that were set in the Builder object.
         */
        public Leaflet build() {
            return (Leaflet) org.gtk.gobject.GObject.newWithProperties(
                Leaflet.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether gestures and shortcuts for navigating backward are enabled.
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
         * Only children that have {@code LeafletPage:navigatable} set to {@code TRUE}
         * can be navigated to.
         * @param canNavigateBack The value for the {@code can-navigate-back} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCanNavigateBack(boolean canNavigateBack) {
            names.add("can-navigate-back");
            values.add(org.gtk.gobject.Value.create(canNavigateBack));
            return this;
        }
        
        /**
         * Whether gestures and shortcuts for navigating forward are enabled.
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
         * Only children that have {@code LeafletPage:navigatable} set to {@code TRUE}
         * can be navigated to.
         * @param canNavigateForward The value for the {@code can-navigate-forward} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCanNavigateForward(boolean canNavigateForward) {
            names.add("can-navigate-forward");
            values.add(org.gtk.gobject.Value.create(canNavigateForward));
            return this;
        }
        
        /**
         * Whether or not the leaflet can unfold.
         * @param canUnfold The value for the {@code can-unfold} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCanUnfold(boolean canUnfold) {
            names.add("can-unfold");
            values.add(org.gtk.gobject.Value.create(canUnfold));
            return this;
        }
        
        /**
         * The child transition spring parameters.
         * <p>
         * The default value is equivalent to:
         * <pre>{@code c
         * adw_spring_params_new (1, 0.5, 500)
         * }</pre>
         * @param childTransitionParams The value for the {@code child-transition-params} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setChildTransitionParams(org.gnome.adw.SpringParams childTransitionParams) {
            names.add("child-transition-params");
            values.add(org.gtk.gobject.Value.create(childTransitionParams));
            return this;
        }
        
        /**
         * Whether a child transition is currently running.
         * @param childTransitionRunning The value for the {@code child-transition-running} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setChildTransitionRunning(boolean childTransitionRunning) {
            names.add("child-transition-running");
            values.add(org.gtk.gobject.Value.create(childTransitionRunning));
            return this;
        }
        
        /**
         * Determines when the leaflet will fold.
         * <p>
         * If set to {@code ADW_FOLD_THRESHOLD_POLICY_MINIMUM}, it will only fold when the
         * children cannot fit anymore. With {@code ADW_FOLD_THRESHOLD_POLICY_NATURAL}, it
         * will fold as soon as children don't get their natural size.
         * <p>
         * This can be useful if you have a long ellipsizing label and want to let it
         * ellipsize instead of immediately folding.
         * @param foldThresholdPolicy The value for the {@code fold-threshold-policy} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFoldThresholdPolicy(org.gnome.adw.FoldThresholdPolicy foldThresholdPolicy) {
            names.add("fold-threshold-policy");
            values.add(org.gtk.gobject.Value.create(foldThresholdPolicy));
            return this;
        }
        
        /**
         * Whether the leaflet is folded.
         * <p>
         * The leaflet will be folded if the size allocated to it is smaller than the
         * sum of the minimum or natural sizes of the children (see
         * {@code Leaflet:fold-threshold-policy}), it will be unfolded otherwise.
         * @param folded The value for the {@code folded} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setFolded(boolean folded) {
            names.add("folded");
            values.add(org.gtk.gobject.Value.create(folded));
            return this;
        }
        
        /**
         * Whether the leaflet allocates the same size for all children when folded.
         * <p>
         * If set to {@code FALSE}, different children can have different size along the
         * opposite orientation.
         * @param homogeneous The value for the {@code homogeneous} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setHomogeneous(boolean homogeneous) {
            names.add("homogeneous");
            values.add(org.gtk.gobject.Value.create(homogeneous));
            return this;
        }
        
        /**
         * The mode transition animation duration, in milliseconds.
         * @param modeTransitionDuration The value for the {@code mode-transition-duration} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setModeTransitionDuration(int modeTransitionDuration) {
            names.add("mode-transition-duration");
            values.add(org.gtk.gobject.Value.create(modeTransitionDuration));
            return this;
        }
        
        /**
         * A selection model with the leaflet's pages.
         * <p>
         * This can be used to keep an up-to-date view. The model also implements
         * {@code Gtk.SelectionModel} and can be used to track and change the visible
         * page.
         * @param pages The value for the {@code pages} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPages(org.gtk.gtk.SelectionModel pages) {
            names.add("pages");
            values.add(org.gtk.gobject.Value.create(pages));
            return this;
        }
        
        /**
         * The type of animation used for transitions between modes and children.
         * <p>
         * The transition type can be changed without problems at runtime, so it is
         * possible to change the animation based on the mode or child that is about
         * to become current.
         * @param transitionType The value for the {@code transition-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTransitionType(org.gnome.adw.LeafletTransitionType transitionType) {
            names.add("transition-type");
            values.add(org.gtk.gobject.Value.create(transitionType));
            return this;
        }
        
        /**
         * The widget currently visible when the leaflet is folded.
         * <p>
         * The transition is determined by {@code Leaflet:transition-type} and
         * {@code Leaflet:child-transition-params}. The transition can be cancelled
         * by the user, in which case visible child will change back to the previously
         * visible child.
         * @param visibleChild The value for the {@code visible-child} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setVisibleChild(org.gtk.gtk.Widget visibleChild) {
            names.add("visible-child");
            values.add(org.gtk.gobject.Value.create(visibleChild));
            return this;
        }
        
        /**
         * The name of the widget currently visible when the leaflet is folded.
         * <p>
         * See {@code Leaflet:visible-child}.
         * @param visibleChildName The value for the {@code visible-child-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setVisibleChildName(java.lang.String visibleChildName) {
            names.add("visible-child-name");
            values.add(org.gtk.gobject.Value.create(visibleChildName));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_leaflet_new = Interop.downcallHandle(
            "adw_leaflet_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_append = Interop.downcallHandle(
            "adw_leaflet_append",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_adjacent_child = Interop.downcallHandle(
            "adw_leaflet_get_adjacent_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_can_navigate_back = Interop.downcallHandle(
            "adw_leaflet_get_can_navigate_back",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_can_navigate_forward = Interop.downcallHandle(
            "adw_leaflet_get_can_navigate_forward",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_can_unfold = Interop.downcallHandle(
            "adw_leaflet_get_can_unfold",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_child_by_name = Interop.downcallHandle(
            "adw_leaflet_get_child_by_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_child_transition_params = Interop.downcallHandle(
            "adw_leaflet_get_child_transition_params",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_child_transition_running = Interop.downcallHandle(
            "adw_leaflet_get_child_transition_running",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_fold_threshold_policy = Interop.downcallHandle(
            "adw_leaflet_get_fold_threshold_policy",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_folded = Interop.downcallHandle(
            "adw_leaflet_get_folded",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_homogeneous = Interop.downcallHandle(
            "adw_leaflet_get_homogeneous",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_mode_transition_duration = Interop.downcallHandle(
            "adw_leaflet_get_mode_transition_duration",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_page = Interop.downcallHandle(
            "adw_leaflet_get_page",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_pages = Interop.downcallHandle(
            "adw_leaflet_get_pages",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_transition_type = Interop.downcallHandle(
            "adw_leaflet_get_transition_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_visible_child = Interop.downcallHandle(
            "adw_leaflet_get_visible_child",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_visible_child_name = Interop.downcallHandle(
            "adw_leaflet_get_visible_child_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_insert_child_after = Interop.downcallHandle(
            "adw_leaflet_insert_child_after",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_navigate = Interop.downcallHandle(
            "adw_leaflet_navigate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_leaflet_prepend = Interop.downcallHandle(
            "adw_leaflet_prepend",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_remove = Interop.downcallHandle(
            "adw_leaflet_remove",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_reorder_child_after = Interop.downcallHandle(
            "adw_leaflet_reorder_child_after",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_set_can_navigate_back = Interop.downcallHandle(
            "adw_leaflet_set_can_navigate_back",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_leaflet_set_can_navigate_forward = Interop.downcallHandle(
            "adw_leaflet_set_can_navigate_forward",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_leaflet_set_can_unfold = Interop.downcallHandle(
            "adw_leaflet_set_can_unfold",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_leaflet_set_child_transition_params = Interop.downcallHandle(
            "adw_leaflet_set_child_transition_params",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_set_fold_threshold_policy = Interop.downcallHandle(
            "adw_leaflet_set_fold_threshold_policy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_leaflet_set_homogeneous = Interop.downcallHandle(
            "adw_leaflet_set_homogeneous",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_leaflet_set_mode_transition_duration = Interop.downcallHandle(
            "adw_leaflet_set_mode_transition_duration",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_leaflet_set_transition_type = Interop.downcallHandle(
            "adw_leaflet_set_transition_type",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_leaflet_set_visible_child = Interop.downcallHandle(
            "adw_leaflet_set_visible_child",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_set_visible_child_name = Interop.downcallHandle(
            "adw_leaflet_set_visible_child_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_leaflet_get_type = Interop.downcallHandle(
            "adw_leaflet_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
