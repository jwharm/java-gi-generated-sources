package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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

    public Squeezer(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Squeezer */
    public static Squeezer castFrom(org.gtk.gobject.Object gobject) {
        return new Squeezer(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.adw_squeezer_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwSqueezer}.
     */
    public Squeezer() {
        super(constructNew());
    }
    
    /**
     * Adds a child to {@code self}.
     */
    public SqueezerPage add(org.gtk.gtk.Widget child) {
        var RESULT = gtk_h.adw_squeezer_add(handle(), child.handle());
        return new SqueezerPage(References.get(RESULT, false));
    }
    
    /**
     * Gets whether to allow squeezing beyond the last child's minimum size.
     */
    public boolean getAllowNone() {
        var RESULT = gtk_h.adw_squeezer_get_allow_none(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets whether all children have the same size for the opposite orientation.
     */
    public boolean getHomogeneous() {
        var RESULT = gtk_h.adw_squeezer_get_homogeneous(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code self} interpolates its size when changing the visible child.
     */
    public boolean getInterpolateSize() {
        var RESULT = gtk_h.adw_squeezer_get_interpolate_size(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns the {@link SqueezerPage} object for {@code child}.
     */
    public SqueezerPage getPage(org.gtk.gtk.Widget child) {
        var RESULT = gtk_h.adw_squeezer_get_page(handle(), child.handle());
        return new SqueezerPage(References.get(RESULT, false));
    }
    
    /**
     * Returns a {@code Gio.ListModel} that contains the pages of {@code self}.
     * <p>
     * This can be used to keep an up-to-date view. The model also implements
     * {@code Gtk.SelectionModel} and can be used to track the visible page.
     */
    public org.gtk.gtk.SelectionModel getPages() {
        var RESULT = gtk_h.adw_squeezer_get_pages(handle());
        return new org.gtk.gtk.SelectionModel.SelectionModelImpl(References.get(RESULT, true));
    }
    
    /**
     * Gets the fold threshold policy for {@code self}.
     */
    public FoldThresholdPolicy getSwitchThresholdPolicy() {
        var RESULT = gtk_h.adw_squeezer_get_switch_threshold_policy(handle());
        return new FoldThresholdPolicy(RESULT);
    }
    
    /**
     * Gets the transition animation duration for {@code self}.
     */
    public int getTransitionDuration() {
        var RESULT = gtk_h.adw_squeezer_get_transition_duration(handle());
        return RESULT;
    }
    
    /**
     * Gets whether a transition is currently running for {@code self}.
     */
    public boolean getTransitionRunning() {
        var RESULT = gtk_h.adw_squeezer_get_transition_running(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the type of animation used for transitions between children in {@code self}.
     */
    public SqueezerTransitionType getTransitionType() {
        var RESULT = gtk_h.adw_squeezer_get_transition_type(handle());
        return new SqueezerTransitionType(RESULT);
    }
    
    /**
     * Gets the currently visible child of {@code self}.
     */
    public org.gtk.gtk.Widget getVisibleChild() {
        var RESULT = gtk_h.adw_squeezer_get_visible_child(handle());
        return new org.gtk.gtk.Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets the horizontal alignment, from 0 (start) to 1 (end).
     */
    public float getXalign() {
        var RESULT = gtk_h.adw_squeezer_get_xalign(handle());
        return RESULT;
    }
    
    /**
     * Gets the vertical alignment, from 0 (top) to 1 (bottom).
     */
    public float getYalign() {
        var RESULT = gtk_h.adw_squeezer_get_yalign(handle());
        return RESULT;
    }
    
    /**
     * Removes a child widget from {@code self}.
     */
    public void remove(org.gtk.gtk.Widget child) {
        gtk_h.adw_squeezer_remove(handle(), child.handle());
    }
    
    /**
     * Sets whether to allow squeezing beyond the last child's minimum size.
     */
    public void setAllowNone(boolean allowNone) {
        gtk_h.adw_squeezer_set_allow_none(handle(), allowNone ? 1 : 0);
    }
    
    /**
     * Sets whether all children have the same size for the opposite orientation.
     */
    public void setHomogeneous(boolean homogeneous) {
        gtk_h.adw_squeezer_set_homogeneous(handle(), homogeneous ? 1 : 0);
    }
    
    /**
     * Sets whether {@code self} interpolates its size when changing the visible child.
     */
    public void setInterpolateSize(boolean interpolateSize) {
        gtk_h.adw_squeezer_set_interpolate_size(handle(), interpolateSize ? 1 : 0);
    }
    
    /**
     * Sets the fold threshold policy for {@code self}.
     */
    public void setSwitchThresholdPolicy(FoldThresholdPolicy policy) {
        gtk_h.adw_squeezer_set_switch_threshold_policy(handle(), policy.getValue());
    }
    
    /**
     * Sets the transition animation duration for {@code self}.
     */
    public void setTransitionDuration(int duration) {
        gtk_h.adw_squeezer_set_transition_duration(handle(), duration);
    }
    
    /**
     * Sets the type of animation used for transitions between children in {@code self}.
     */
    public void setTransitionType(SqueezerTransitionType transition) {
        gtk_h.adw_squeezer_set_transition_type(handle(), transition.getValue());
    }
    
    /**
     * Sets the horizontal alignment, from 0 (start) to 1 (end).
     */
    public void setXalign(float xalign) {
        gtk_h.adw_squeezer_set_xalign(handle(), xalign);
    }
    
    /**
     * Sets the vertical alignment, from 0 (top) to 1 (bottom).
     */
    public void setYalign(float yalign) {
        gtk_h.adw_squeezer_set_yalign(handle(), yalign);
    }
    
}
