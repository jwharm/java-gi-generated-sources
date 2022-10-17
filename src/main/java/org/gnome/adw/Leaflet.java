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
 * 
 * <h2>CSS nodes</h2>
 * {@code AdwLeaflet} has a single CSS node with name {@code leaflet}. The node will get the
 * style classes {@code .folded} when it is folded, {@code .unfolded} when it's not, or none
 * if it hasn't computed its fold yet.
 */
public class Leaflet extends org.gtk.gtk.Widget implements Swipeable, org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {

    public Leaflet(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Leaflet */
    public static Leaflet castFrom(org.gtk.gobject.Object gobject) {
        return new Leaflet(gobject.refcounted());
    }
    
    private static final MethodHandle adw_leaflet_new = Interop.downcallHandle(
        "adw_leaflet_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_leaflet_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwLeaflet}.
     */
    public Leaflet() {
        super(constructNew());
    }
    
    private static final MethodHandle adw_leaflet_append = Interop.downcallHandle(
        "adw_leaflet_append",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a child to {@code self}.
     */
    public @NotNull LeafletPage append(@NotNull org.gtk.gtk.Widget child) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_leaflet_append.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new LeafletPage(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle adw_leaflet_get_adjacent_child = Interop.downcallHandle(
        "adw_leaflet_get_adjacent_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Finds the previous or next navigatable child.
     * <p>
     * This will be the same child {@link Leaflet#navigate} or swipe gestures will
     * navigate to.
     * <p>
     * If there's no child to navigate to, {@code NULL} will be returned instead.
     * <p>
     * See {@code LeafletPage:navigatable}.
     */
    public @Nullable org.gtk.gtk.Widget getAdjacentChild(@NotNull NavigationDirection direction) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_leaflet_get_adjacent_child.invokeExact(handle(), direction.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle adw_leaflet_get_can_navigate_back = Interop.downcallHandle(
        "adw_leaflet_get_can_navigate_back",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether gestures and shortcuts for navigating backward are enabled.
     */
    public boolean getCanNavigateBack() {
        int RESULT;
        try {
            RESULT = (int) adw_leaflet_get_can_navigate_back.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle adw_leaflet_get_can_navigate_forward = Interop.downcallHandle(
        "adw_leaflet_get_can_navigate_forward",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether gestures and shortcuts for navigating forward are enabled.
     */
    public boolean getCanNavigateForward() {
        int RESULT;
        try {
            RESULT = (int) adw_leaflet_get_can_navigate_forward.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle adw_leaflet_get_can_unfold = Interop.downcallHandle(
        "adw_leaflet_get_can_unfold",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code self} can unfold.
     */
    public boolean getCanUnfold() {
        int RESULT;
        try {
            RESULT = (int) adw_leaflet_get_can_unfold.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle adw_leaflet_get_child_by_name = Interop.downcallHandle(
        "adw_leaflet_get_child_by_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds the child of {@code self} with {@code name}.
     * <p>
     * Returns {@code NULL} if there is no child with this name.
     * <p>
     * See {@code LeafletPage:name}.
     */
    public @Nullable org.gtk.gtk.Widget getChildByName(@NotNull java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_leaflet_get_child_by_name.invokeExact(handle(), Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle adw_leaflet_get_child_transition_params = Interop.downcallHandle(
        "adw_leaflet_get_child_transition_params",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the child transition spring parameters for {@code self}.
     */
    public @NotNull SpringParams getChildTransitionParams() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_leaflet_get_child_transition_params.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SpringParams(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle adw_leaflet_get_child_transition_running = Interop.downcallHandle(
        "adw_leaflet_get_child_transition_running",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether a child transition is currently running for {@code self}.
     */
    public boolean getChildTransitionRunning() {
        int RESULT;
        try {
            RESULT = (int) adw_leaflet_get_child_transition_running.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle adw_leaflet_get_fold_threshold_policy = Interop.downcallHandle(
        "adw_leaflet_get_fold_threshold_policy",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the fold threshold policy for {@code self}.
     */
    public @NotNull FoldThresholdPolicy getFoldThresholdPolicy() {
        int RESULT;
        try {
            RESULT = (int) adw_leaflet_get_fold_threshold_policy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FoldThresholdPolicy(RESULT);
    }
    
    private static final MethodHandle adw_leaflet_get_folded = Interop.downcallHandle(
        "adw_leaflet_get_folded",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code self} is folded.
     */
    public boolean getFolded() {
        int RESULT;
        try {
            RESULT = (int) adw_leaflet_get_folded.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle adw_leaflet_get_homogeneous = Interop.downcallHandle(
        "adw_leaflet_get_homogeneous",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code self} is homogeneous.
     */
    public boolean getHomogeneous() {
        int RESULT;
        try {
            RESULT = (int) adw_leaflet_get_homogeneous.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle adw_leaflet_get_mode_transition_duration = Interop.downcallHandle(
        "adw_leaflet_get_mode_transition_duration",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the mode transition animation duration for {@code self}.
     */
    public int getModeTransitionDuration() {
        int RESULT;
        try {
            RESULT = (int) adw_leaflet_get_mode_transition_duration.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle adw_leaflet_get_page = Interop.downcallHandle(
        "adw_leaflet_get_page",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@link LeafletPage} object for {@code child}.
     */
    public @NotNull LeafletPage getPage(@NotNull org.gtk.gtk.Widget child) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_leaflet_get_page.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new LeafletPage(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle adw_leaflet_get_pages = Interop.downcallHandle(
        "adw_leaflet_get_pages",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a {@code Gio.ListModel} that contains the pages of the leaflet.
     * <p>
     * This can be used to keep an up-to-date view. The model also implements
     * {@code Gtk.SelectionModel} and can be used to track and change the visible
     * page.
     */
    public @NotNull org.gtk.gtk.SelectionModel getPages() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_leaflet_get_pages.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.SelectionModel.SelectionModelImpl(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle adw_leaflet_get_transition_type = Interop.downcallHandle(
        "adw_leaflet_get_transition_type",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the type of animation used for transitions between modes and children.
     */
    public @NotNull LeafletTransitionType getTransitionType() {
        int RESULT;
        try {
            RESULT = (int) adw_leaflet_get_transition_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new LeafletTransitionType(RESULT);
    }
    
    private static final MethodHandle adw_leaflet_get_visible_child = Interop.downcallHandle(
        "adw_leaflet_get_visible_child",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the widget currently visible when the leaflet is folded.
     */
    public @Nullable org.gtk.gtk.Widget getVisibleChild() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_leaflet_get_visible_child.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle adw_leaflet_get_visible_child_name = Interop.downcallHandle(
        "adw_leaflet_get_visible_child_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the name of the currently visible child widget.
     */
    public @Nullable java.lang.String getVisibleChildName() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_leaflet_get_visible_child_name.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle adw_leaflet_insert_child_after = Interop.downcallHandle(
        "adw_leaflet_insert_child_after",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts {@code child} in the position after {@code sibling} in the list of children.
     * <p>
     * If {@code sibling} is {@code NULL}, inserts {@code child} at the first position.
     */
    public @NotNull LeafletPage insertChildAfter(@NotNull org.gtk.gtk.Widget child, @Nullable org.gtk.gtk.Widget sibling) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_leaflet_insert_child_after.invokeExact(handle(), child.handle(), sibling.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new LeafletPage(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle adw_leaflet_navigate = Interop.downcallHandle(
        "adw_leaflet_navigate",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Navigates to the previous or next child.
     * <p>
     * The child must have the {@code LeafletPage:navigatable} property set to
     * {@code TRUE}, otherwise it will be skipped.
     * <p>
     * This will be the same child as returned by
     * {@link Leaflet#getAdjacentChild} or navigated to via swipe gestures.
     */
    public boolean navigate(@NotNull NavigationDirection direction) {
        int RESULT;
        try {
            RESULT = (int) adw_leaflet_navigate.invokeExact(handle(), direction.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle adw_leaflet_prepend = Interop.downcallHandle(
        "adw_leaflet_prepend",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Inserts {@code child} at the first position in {@code self}.
     */
    public @NotNull LeafletPage prepend(@NotNull org.gtk.gtk.Widget child) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_leaflet_prepend.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new LeafletPage(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle adw_leaflet_remove = Interop.downcallHandle(
        "adw_leaflet_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a child widget from {@code self}.
     */
    public @NotNull void remove(@NotNull org.gtk.gtk.Widget child) {
        try {
            adw_leaflet_remove.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_leaflet_reorder_child_after = Interop.downcallHandle(
        "adw_leaflet_reorder_child_after",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Moves {@code child} to the position after {@code sibling} in the list of children.
     * <p>
     * If {@code sibling} is {@code NULL}, moves {@code child} to the first position.
     */
    public @NotNull void reorderChildAfter(@NotNull org.gtk.gtk.Widget child, @Nullable org.gtk.gtk.Widget sibling) {
        try {
            adw_leaflet_reorder_child_after.invokeExact(handle(), child.handle(), sibling.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_leaflet_set_can_navigate_back = Interop.downcallHandle(
        "adw_leaflet_set_can_navigate_back",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether gestures and shortcuts for navigating backward are enabled.
     */
    public @NotNull void setCanNavigateBack(@NotNull boolean canNavigateBack) {
        try {
            adw_leaflet_set_can_navigate_back.invokeExact(handle(), canNavigateBack ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_leaflet_set_can_navigate_forward = Interop.downcallHandle(
        "adw_leaflet_set_can_navigate_forward",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether gestures and shortcuts for navigating forward are enabled.
     */
    public @NotNull void setCanNavigateForward(@NotNull boolean canNavigateForward) {
        try {
            adw_leaflet_set_can_navigate_forward.invokeExact(handle(), canNavigateForward ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_leaflet_set_can_unfold = Interop.downcallHandle(
        "adw_leaflet_set_can_unfold",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code self} can unfold.
     */
    public @NotNull void setCanUnfold(@NotNull boolean canUnfold) {
        try {
            adw_leaflet_set_can_unfold.invokeExact(handle(), canUnfold ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_leaflet_set_child_transition_params = Interop.downcallHandle(
        "adw_leaflet_set_child_transition_params",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the child transition spring parameters for {@code self}.
     */
    public @NotNull void setChildTransitionParams(@NotNull SpringParams params) {
        try {
            adw_leaflet_set_child_transition_params.invokeExact(handle(), params.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_leaflet_set_fold_threshold_policy = Interop.downcallHandle(
        "adw_leaflet_set_fold_threshold_policy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the fold threshold policy for {@code self}.
     */
    public @NotNull void setFoldThresholdPolicy(@NotNull FoldThresholdPolicy policy) {
        try {
            adw_leaflet_set_fold_threshold_policy.invokeExact(handle(), policy.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_leaflet_set_homogeneous = Interop.downcallHandle(
        "adw_leaflet_set_homogeneous",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets {@code self} to be homogeneous or not.
     * <p>
     * If set to {@code FALSE}, different children can have different size along the
     * opposite orientation.
     */
    public @NotNull void setHomogeneous(@NotNull boolean homogeneous) {
        try {
            adw_leaflet_set_homogeneous.invokeExact(handle(), homogeneous ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_leaflet_set_mode_transition_duration = Interop.downcallHandle(
        "adw_leaflet_set_mode_transition_duration",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the mode transition animation duration for {@code self}.
     */
    public @NotNull void setModeTransitionDuration(@NotNull int duration) {
        try {
            adw_leaflet_set_mode_transition_duration.invokeExact(handle(), duration);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_leaflet_set_transition_type = Interop.downcallHandle(
        "adw_leaflet_set_transition_type",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the type of animation used for transitions between modes and children.
     */
    public @NotNull void setTransitionType(@NotNull LeafletTransitionType transition) {
        try {
            adw_leaflet_set_transition_type.invokeExact(handle(), transition.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_leaflet_set_visible_child = Interop.downcallHandle(
        "adw_leaflet_set_visible_child",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the widget currently visible when the leaflet is folded.
     */
    public @NotNull void setVisibleChild(@NotNull org.gtk.gtk.Widget visibleChild) {
        try {
            adw_leaflet_set_visible_child.invokeExact(handle(), visibleChild.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle adw_leaflet_set_visible_child_name = Interop.downcallHandle(
        "adw_leaflet_set_visible_child_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Makes the child with the name {@code name} visible.
     * <p>
     * See adw_leaflet_set_visible_child() for more details.
     */
    public @NotNull void setVisibleChildName(@NotNull java.lang.String name) {
        try {
            adw_leaflet_set_visible_child_name.invokeExact(handle(), Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
