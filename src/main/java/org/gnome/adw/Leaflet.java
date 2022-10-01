package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * <h2>CSS nodes</h2>
 * <p>
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
    
    private static Refcounted constructNew() {
        Refcounted RESULT = Refcounted.get(gtk_h.adw_leaflet_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwLeaflet}.
     */
    public Leaflet() {
        super(constructNew());
    }
    
    /**
     * Adds a child to {@code self}.
     */
    public LeafletPage append(org.gtk.gtk.Widget child) {
        var RESULT = gtk_h.adw_leaflet_append(handle(), child.handle());
        return new LeafletPage(Refcounted.get(RESULT, false));
    }
    
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
    public org.gtk.gtk.Widget getAdjacentChild(NavigationDirection direction) {
        var RESULT = gtk_h.adw_leaflet_get_adjacent_child(handle(), direction.getValue());
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets whether gestures and shortcuts for navigating backward are enabled.
     */
    public boolean getCanNavigateBack() {
        var RESULT = gtk_h.adw_leaflet_get_can_navigate_back(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets whether gestures and shortcuts for navigating forward are enabled.
     */
    public boolean getCanNavigateForward() {
        var RESULT = gtk_h.adw_leaflet_get_can_navigate_forward(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code self} can unfold.
     */
    public boolean getCanUnfold() {
        var RESULT = gtk_h.adw_leaflet_get_can_unfold(handle());
        return RESULT != 0;
    }
    
    /**
     * Finds the child of {@code self} with {@code name}.
     * <p>
     * Returns {@code NULL} if there is no child with this name.
     * <p>
     * See {@code LeafletPage:name}.
     */
    public org.gtk.gtk.Widget getChildByName(java.lang.String name) {
        var RESULT = gtk_h.adw_leaflet_get_child_by_name(handle(), Interop.allocateNativeString(name).handle());
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the child transition spring parameters for {@code self}.
     */
    public SpringParams getChildTransitionParams() {
        var RESULT = gtk_h.adw_leaflet_get_child_transition_params(handle());
        return new SpringParams(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets whether a child transition is currently running for {@code self}.
     */
    public boolean getChildTransitionRunning() {
        var RESULT = gtk_h.adw_leaflet_get_child_transition_running(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the fold threshold policy for {@code self}.
     */
    public FoldThresholdPolicy getFoldThresholdPolicy() {
        var RESULT = gtk_h.adw_leaflet_get_fold_threshold_policy(handle());
        return new FoldThresholdPolicy(RESULT);
    }
    
    /**
     * Gets whether {@code self} is folded.
     */
    public boolean getFolded() {
        var RESULT = gtk_h.adw_leaflet_get_folded(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code self} is homogeneous.
     */
    public boolean getHomogeneous() {
        var RESULT = gtk_h.adw_leaflet_get_homogeneous(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the mode transition animation duration for {@code self}.
     */
    public int getModeTransitionDuration() {
        var RESULT = gtk_h.adw_leaflet_get_mode_transition_duration(handle());
        return RESULT;
    }
    
    /**
     * Returns the {@link LeafletPage} object for {@code child}.
     */
    public LeafletPage getPage(org.gtk.gtk.Widget child) {
        var RESULT = gtk_h.adw_leaflet_get_page(handle(), child.handle());
        return new LeafletPage(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns a {@code Gio.ListModel} that contains the pages of the leaflet.
     * <p>
     * This can be used to keep an up-to-date view. The model also implements
     * {@code Gtk.SelectionModel} and can be used to track and change the visible
     * page.
     */
    public org.gtk.gtk.SelectionModel getPages() {
        var RESULT = gtk_h.adw_leaflet_get_pages(handle());
        return new org.gtk.gtk.SelectionModel.SelectionModelImpl(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets the type of animation used for transitions between modes and children.
     */
    public LeafletTransitionType getTransitionType() {
        var RESULT = gtk_h.adw_leaflet_get_transition_type(handle());
        return new LeafletTransitionType(RESULT);
    }
    
    /**
     * Gets the widget currently visible when the leaflet is folded.
     */
    public org.gtk.gtk.Widget getVisibleChild() {
        var RESULT = gtk_h.adw_leaflet_get_visible_child(handle());
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the name of the currently visible child widget.
     */
    public java.lang.String getVisibleChildName() {
        var RESULT = gtk_h.adw_leaflet_get_visible_child_name(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Inserts {@code child} in the position after {@code sibling} in the list of children.
     * <p>
     * If {@code sibling} is {@code NULL}, inserts {@code child} at the first position.
     */
    public LeafletPage insertChildAfter(org.gtk.gtk.Widget child, org.gtk.gtk.Widget sibling) {
        var RESULT = gtk_h.adw_leaflet_insert_child_after(handle(), child.handle(), sibling.handle());
        return new LeafletPage(Refcounted.get(RESULT, false));
    }
    
    /**
     * Navigates to the previous or next child.
     * <p>
     * The child must have the {@code LeafletPage:navigatable} property set to
     * {@code TRUE}, otherwise it will be skipped.
     * <p>
     * This will be the same child as returned by
     * {@link Leaflet#getAdjacentChild} or navigated to via swipe gestures.
     */
    public boolean navigate(NavigationDirection direction) {
        var RESULT = gtk_h.adw_leaflet_navigate(handle(), direction.getValue());
        return RESULT != 0;
    }
    
    /**
     * Inserts {@code child} at the first position in {@code self}.
     */
    public LeafletPage prepend(org.gtk.gtk.Widget child) {
        var RESULT = gtk_h.adw_leaflet_prepend(handle(), child.handle());
        return new LeafletPage(Refcounted.get(RESULT, false));
    }
    
    /**
     * Removes a child widget from {@code self}.
     */
    public void remove(org.gtk.gtk.Widget child) {
        gtk_h.adw_leaflet_remove(handle(), child.handle());
    }
    
    /**
     * Moves {@code child} to the position after {@code sibling} in the list of children.
     * <p>
     * If {@code sibling} is {@code NULL}, moves {@code child} to the first position.
     */
    public void reorderChildAfter(org.gtk.gtk.Widget child, org.gtk.gtk.Widget sibling) {
        gtk_h.adw_leaflet_reorder_child_after(handle(), child.handle(), sibling.handle());
    }
    
    /**
     * Sets whether gestures and shortcuts for navigating backward are enabled.
     */
    public void setCanNavigateBack(boolean canNavigateBack) {
        gtk_h.adw_leaflet_set_can_navigate_back(handle(), canNavigateBack ? 1 : 0);
    }
    
    /**
     * Sets whether gestures and shortcuts for navigating forward are enabled.
     */
    public void setCanNavigateForward(boolean canNavigateForward) {
        gtk_h.adw_leaflet_set_can_navigate_forward(handle(), canNavigateForward ? 1 : 0);
    }
    
    /**
     * Sets whether {@code self} can unfold.
     */
    public void setCanUnfold(boolean canUnfold) {
        gtk_h.adw_leaflet_set_can_unfold(handle(), canUnfold ? 1 : 0);
    }
    
    /**
     * Sets the child transition spring parameters for {@code self}.
     */
    public void setChildTransitionParams(SpringParams params) {
        gtk_h.adw_leaflet_set_child_transition_params(handle(), params.handle());
    }
    
    /**
     * Sets the fold threshold policy for {@code self}.
     */
    public void setFoldThresholdPolicy(FoldThresholdPolicy policy) {
        gtk_h.adw_leaflet_set_fold_threshold_policy(handle(), policy.getValue());
    }
    
    /**
     * Sets {@code self} to be homogeneous or not.
     * <p>
     * If set to {@code FALSE}, different children can have different size along the
     * opposite orientation.
     */
    public void setHomogeneous(boolean homogeneous) {
        gtk_h.adw_leaflet_set_homogeneous(handle(), homogeneous ? 1 : 0);
    }
    
    /**
     * Sets the mode transition animation duration for {@code self}.
     */
    public void setModeTransitionDuration(int duration) {
        gtk_h.adw_leaflet_set_mode_transition_duration(handle(), duration);
    }
    
    /**
     * Sets the type of animation used for transitions between modes and children.
     */
    public void setTransitionType(LeafletTransitionType transition) {
        gtk_h.adw_leaflet_set_transition_type(handle(), transition.getValue());
    }
    
    /**
     * Sets the widget currently visible when the leaflet is folded.
     */
    public void setVisibleChild(org.gtk.gtk.Widget visibleChild) {
        gtk_h.adw_leaflet_set_visible_child(handle(), visibleChild.handle());
    }
    
    /**
     * Makes the child with the name {@code name} visible.
     * <p>
     * See adw_leaflet_set_visible_child() for more details.
     */
    public void setVisibleChildName(java.lang.String name) {
        gtk_h.adw_leaflet_set_visible_child_name(handle(), Interop.allocateNativeString(name).handle());
    }
    
}
