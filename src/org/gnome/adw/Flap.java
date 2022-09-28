package org.gnome.adw;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An adaptive container acting like a box or an overlay.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="flap-wide-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="flap-wide.png" alt="flap-wide"&gt;
 * &lt;/picture&gt;
 * &lt;picture&gt;
 *   &lt;source srcset="flap-narrow-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="flap-narrow.png" alt="flap-narrow"&gt;
 * &lt;/picture&gt;
 * <p>
 * The {@code AdwFlap} widget can display its children like a {@link org.gtk.gtk.Box} does or
 * like a {@link org.gtk.gtk.Overlay} does, according to the
 * {@code Flap:fold-policy} value.
 * <p>
 * {@code AdwFlap} has at most three children: {@code Flap:content},
 * {@code Flap:separator}. Content is the primary
 * child, flap is displayed next to it when unfolded, or overlays it when
 * folded. Flap can be shown or hidden by changing the
 * {@code Flap:reveal-flap} value, as well as via swipe gestures if
 * {@code Flap:swipe-to-close} are set
 * to {@code TRUE}.
 * <p>
 * Optionally, a separator can be provided, which would be displayed between
 * the content and the flap when there's no shadow to separate them, depending
 * on the transition type.
 * <p>
 * {@code Flap:flap} is transparent by default; add the
 * <a href="style-classes.html#background">`.background`</a> style class to it if this is
 * unwanted.
 * <p>
 * If {@code Flap:modal} is set to {@code TRUE}, content becomes completely
 * inaccessible when the flap is revealed while folded.
 * <p>
 * The position of the flap and separator children relative to the content is
 * determined by orientation, as well as the {@code Flap:flap-position}
 * value.
 * <p>
 * Folding the flap will automatically hide the flap widget, and unfolding it
 * will automatically reveal it. If this behavior is not desired, the
 * {@code Flap:locked} property can be used to override it.
 * <p>
 * Common use cases include sidebars, header bars that need to be able to
 * overlap the window content (for example, in fullscreen mode) and bottom
 * sheets.
 * <p>
 * <h2>AdwFlap as GtkBuildable</h2>
 * <p>
 * The {@code AdwFlap} implementation of the {@code Gtk.Buildable} interface supports
 * setting the flap child by specifying “flap” as the “type” attribute of a
 * &lt;child&gt; element, and separator by specifying “separator”. Specifying
 * “content” child type or omitting it results in setting the content child.
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
 * {@code AdwFlap} has a single CSS node with name {@code flap}. The node will get the style
 * classes {@code .folded} when it is folded, and {@code .unfolded} when it's not.
 */
public class Flap extends org.gtk.gtk.Widget implements Swipeable, org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {

    public Flap(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Flap */
    public static Flap castFrom(org.gtk.gobject.Object gobject) {
        return new Flap(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.adw_flap_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwFlap}.
     */
    public Flap() {
        super(constructNew());
    }
    
    /**
     * Gets the content widget for {@code self}.
     */
    public org.gtk.gtk.Widget getContent() {
        var RESULT = gtk_h.adw_flap_get_content(handle());
        return new org.gtk.gtk.Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets the flap widget for {@code self}.
     */
    public org.gtk.gtk.Widget getFlap() {
        var RESULT = gtk_h.adw_flap_get_flap(handle());
        return new org.gtk.gtk.Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets the flap position for {@code self}.
     */
    public org.gtk.gtk.PackType getFlapPosition() {
        var RESULT = gtk_h.adw_flap_get_flap_position(handle());
        return new org.gtk.gtk.PackType(RESULT);
    }
    
    /**
     * Gets the duration that fold transitions in {@code self} will take.
     */
    public int getFoldDuration() {
        var RESULT = gtk_h.adw_flap_get_fold_duration(handle());
        return RESULT;
    }
    
    /**
     * Gets the fold policy for {@code self}.
     */
    public FlapFoldPolicy getFoldPolicy() {
        var RESULT = gtk_h.adw_flap_get_fold_policy(handle());
        return new FlapFoldPolicy(RESULT);
    }
    
    /**
     * Gets the fold threshold policy for {@code self}.
     */
    public FoldThresholdPolicy getFoldThresholdPolicy() {
        var RESULT = gtk_h.adw_flap_get_fold_threshold_policy(handle());
        return new FoldThresholdPolicy(RESULT);
    }
    
    /**
     * Gets whether {@code self} is currently folded.
     */
    public boolean getFolded() {
        var RESULT = gtk_h.adw_flap_get_folded(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether {@code self} is locked.
     */
    public boolean getLocked() {
        var RESULT = gtk_h.adw_flap_get_locked(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether {@code self} is modal.
     */
    public boolean getModal() {
        var RESULT = gtk_h.adw_flap_get_modal(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether the flap widget is revealed for {@code self}.
     */
    public boolean getRevealFlap() {
        var RESULT = gtk_h.adw_flap_get_reveal_flap(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the reveal animation spring parameters for {@code self}.
     */
    public SpringParams getRevealParams() {
        var RESULT = gtk_h.adw_flap_get_reveal_params(handle());
        return new SpringParams(References.get(RESULT, true));
    }
    
    /**
     * Gets the current reveal progress for {@code self}.
     */
    public double getRevealProgress() {
        var RESULT = gtk_h.adw_flap_get_reveal_progress(handle());
        return RESULT;
    }
    
    /**
     * Gets the separator widget for {@code self}.
     */
    public org.gtk.gtk.Widget getSeparator() {
        var RESULT = gtk_h.adw_flap_get_separator(handle());
        return new org.gtk.gtk.Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets whether {@code self} can be closed with a swipe gesture.
     */
    public boolean getSwipeToClose() {
        var RESULT = gtk_h.adw_flap_get_swipe_to_close(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether {@code self} can be opened with a swipe gesture.
     */
    public boolean getSwipeToOpen() {
        var RESULT = gtk_h.adw_flap_get_swipe_to_open(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the type of animation used for reveal and fold transitions in {@code self}.
     */
    public FlapTransitionType getTransitionType() {
        var RESULT = gtk_h.adw_flap_get_transition_type(handle());
        return new FlapTransitionType(RESULT);
    }
    
    /**
     * Sets the content widget for {@code self}.
     */
    public void setContent(org.gtk.gtk.Widget content) {
        gtk_h.adw_flap_set_content(handle(), content.handle());
    }
    
    /**
     * Sets the flap widget for {@code self}.
     */
    public void setFlap(org.gtk.gtk.Widget flap) {
        gtk_h.adw_flap_set_flap(handle(), flap.handle());
    }
    
    /**
     * Sets the flap position for {@code self}.
     */
    public void setFlapPosition(org.gtk.gtk.PackType position) {
        gtk_h.adw_flap_set_flap_position(handle(), position.getValue());
    }
    
    /**
     * Sets the duration that fold transitions in {@code self} will take.
     */
    public void setFoldDuration(int duration) {
        gtk_h.adw_flap_set_fold_duration(handle(), duration);
    }
    
    /**
     * Sets the fold policy for {@code self}.
     */
    public void setFoldPolicy(FlapFoldPolicy policy) {
        gtk_h.adw_flap_set_fold_policy(handle(), policy.getValue());
    }
    
    /**
     * Sets the fold threshold policy for {@code self}.
     */
    public void setFoldThresholdPolicy(FoldThresholdPolicy policy) {
        gtk_h.adw_flap_set_fold_threshold_policy(handle(), policy.getValue());
    }
    
    /**
     * Sets whether {@code self} is locked.
     */
    public void setLocked(boolean locked) {
        gtk_h.adw_flap_set_locked(handle(), locked ? 1 : 0);
    }
    
    /**
     * Sets whether {@code self} is modal.
     */
    public void setModal(boolean modal) {
        gtk_h.adw_flap_set_modal(handle(), modal ? 1 : 0);
    }
    
    /**
     * Sets whether the flap widget is revealed for {@code self}.
     */
    public void setRevealFlap(boolean revealFlap) {
        gtk_h.adw_flap_set_reveal_flap(handle(), revealFlap ? 1 : 0);
    }
    
    /**
     * Sets the reveal animation spring parameters for {@code self}.
     */
    public void setRevealParams(SpringParams params) {
        gtk_h.adw_flap_set_reveal_params(handle(), params.handle());
    }
    
    /**
     * Sets the separator widget for {@code self}.
     */
    public void setSeparator(org.gtk.gtk.Widget separator) {
        gtk_h.adw_flap_set_separator(handle(), separator.handle());
    }
    
    /**
     * Sets whether {@code self} can be closed with a swipe gesture.
     */
    public void setSwipeToClose(boolean swipeToClose) {
        gtk_h.adw_flap_set_swipe_to_close(handle(), swipeToClose ? 1 : 0);
    }
    
    /**
     * Sets whether {@code self} can be opened with a swipe gesture.
     */
    public void setSwipeToOpen(boolean swipeToOpen) {
        gtk_h.adw_flap_set_swipe_to_open(handle(), swipeToOpen ? 1 : 0);
    }
    
    /**
     * Sets the type of animation used for reveal and fold transitions in {@code self}.
     */
    public void setTransitionType(FlapTransitionType transitionType) {
        gtk_h.adw_flap_set_transition_type(handle(), transitionType.getValue());
    }
    
}
