package org.gnome.adw;

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

    public Flap(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Flap */
    public static Flap castFrom(org.gtk.gobject.Object gobject) {
        return new Flap(gobject.refcounted());
    }
    
    static final MethodHandle adw_flap_new = Interop.downcallHandle(
        "adw_flap_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_flap_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwFlap}.
     */
    public Flap() {
        super(constructNew());
    }
    
    static final MethodHandle adw_flap_get_content = Interop.downcallHandle(
        "adw_flap_get_content",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the content widget for {@code self}.
     */
    public org.gtk.gtk.Widget getContent() {
        try {
            var RESULT = (MemoryAddress) adw_flap_get_content.invokeExact(handle());
            return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_flap_get_flap = Interop.downcallHandle(
        "adw_flap_get_flap",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the flap widget for {@code self}.
     */
    public org.gtk.gtk.Widget getFlap() {
        try {
            var RESULT = (MemoryAddress) adw_flap_get_flap.invokeExact(handle());
            return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_flap_get_flap_position = Interop.downcallHandle(
        "adw_flap_get_flap_position",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the flap position for {@code self}.
     */
    public org.gtk.gtk.PackType getFlapPosition() {
        try {
            var RESULT = (int) adw_flap_get_flap_position.invokeExact(handle());
            return new org.gtk.gtk.PackType(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_flap_get_fold_duration = Interop.downcallHandle(
        "adw_flap_get_fold_duration",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the duration that fold transitions in {@code self} will take.
     */
    public int getFoldDuration() {
        try {
            var RESULT = (int) adw_flap_get_fold_duration.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_flap_get_fold_policy = Interop.downcallHandle(
        "adw_flap_get_fold_policy",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the fold policy for {@code self}.
     */
    public FlapFoldPolicy getFoldPolicy() {
        try {
            var RESULT = (int) adw_flap_get_fold_policy.invokeExact(handle());
            return new FlapFoldPolicy(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_flap_get_fold_threshold_policy = Interop.downcallHandle(
        "adw_flap_get_fold_threshold_policy",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the fold threshold policy for {@code self}.
     */
    public FoldThresholdPolicy getFoldThresholdPolicy() {
        try {
            var RESULT = (int) adw_flap_get_fold_threshold_policy.invokeExact(handle());
            return new FoldThresholdPolicy(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_flap_get_folded = Interop.downcallHandle(
        "adw_flap_get_folded",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code self} is currently folded.
     */
    public boolean getFolded() {
        try {
            var RESULT = (int) adw_flap_get_folded.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_flap_get_locked = Interop.downcallHandle(
        "adw_flap_get_locked",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code self} is locked.
     */
    public boolean getLocked() {
        try {
            var RESULT = (int) adw_flap_get_locked.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_flap_get_modal = Interop.downcallHandle(
        "adw_flap_get_modal",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code self} is modal.
     */
    public boolean getModal() {
        try {
            var RESULT = (int) adw_flap_get_modal.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_flap_get_reveal_flap = Interop.downcallHandle(
        "adw_flap_get_reveal_flap",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the flap widget is revealed for {@code self}.
     */
    public boolean getRevealFlap() {
        try {
            var RESULT = (int) adw_flap_get_reveal_flap.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_flap_get_reveal_params = Interop.downcallHandle(
        "adw_flap_get_reveal_params",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the reveal animation spring parameters for {@code self}.
     */
    public SpringParams getRevealParams() {
        try {
            var RESULT = (MemoryAddress) adw_flap_get_reveal_params.invokeExact(handle());
            return new SpringParams(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_flap_get_reveal_progress = Interop.downcallHandle(
        "adw_flap_get_reveal_progress",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current reveal progress for {@code self}.
     */
    public double getRevealProgress() {
        try {
            var RESULT = (double) adw_flap_get_reveal_progress.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_flap_get_separator = Interop.downcallHandle(
        "adw_flap_get_separator",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the separator widget for {@code self}.
     */
    public org.gtk.gtk.Widget getSeparator() {
        try {
            var RESULT = (MemoryAddress) adw_flap_get_separator.invokeExact(handle());
            return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_flap_get_swipe_to_close = Interop.downcallHandle(
        "adw_flap_get_swipe_to_close",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code self} can be closed with a swipe gesture.
     */
    public boolean getSwipeToClose() {
        try {
            var RESULT = (int) adw_flap_get_swipe_to_close.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_flap_get_swipe_to_open = Interop.downcallHandle(
        "adw_flap_get_swipe_to_open",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code self} can be opened with a swipe gesture.
     */
    public boolean getSwipeToOpen() {
        try {
            var RESULT = (int) adw_flap_get_swipe_to_open.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_flap_get_transition_type = Interop.downcallHandle(
        "adw_flap_get_transition_type",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the type of animation used for reveal and fold transitions in {@code self}.
     */
    public FlapTransitionType getTransitionType() {
        try {
            var RESULT = (int) adw_flap_get_transition_type.invokeExact(handle());
            return new FlapTransitionType(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_flap_set_content = Interop.downcallHandle(
        "adw_flap_set_content",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the content widget for {@code self}.
     */
    public void setContent(org.gtk.gtk.Widget content) {
        try {
            adw_flap_set_content.invokeExact(handle(), content.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_flap_set_flap = Interop.downcallHandle(
        "adw_flap_set_flap",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the flap widget for {@code self}.
     */
    public void setFlap(org.gtk.gtk.Widget flap) {
        try {
            adw_flap_set_flap.invokeExact(handle(), flap.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_flap_set_flap_position = Interop.downcallHandle(
        "adw_flap_set_flap_position",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the flap position for {@code self}.
     */
    public void setFlapPosition(org.gtk.gtk.PackType position) {
        try {
            adw_flap_set_flap_position.invokeExact(handle(), position.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_flap_set_fold_duration = Interop.downcallHandle(
        "adw_flap_set_fold_duration",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the duration that fold transitions in {@code self} will take.
     */
    public void setFoldDuration(int duration) {
        try {
            adw_flap_set_fold_duration.invokeExact(handle(), duration);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_flap_set_fold_policy = Interop.downcallHandle(
        "adw_flap_set_fold_policy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the fold policy for {@code self}.
     */
    public void setFoldPolicy(FlapFoldPolicy policy) {
        try {
            adw_flap_set_fold_policy.invokeExact(handle(), policy.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_flap_set_fold_threshold_policy = Interop.downcallHandle(
        "adw_flap_set_fold_threshold_policy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the fold threshold policy for {@code self}.
     */
    public void setFoldThresholdPolicy(FoldThresholdPolicy policy) {
        try {
            adw_flap_set_fold_threshold_policy.invokeExact(handle(), policy.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_flap_set_locked = Interop.downcallHandle(
        "adw_flap_set_locked",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code self} is locked.
     */
    public void setLocked(boolean locked) {
        try {
            adw_flap_set_locked.invokeExact(handle(), locked ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_flap_set_modal = Interop.downcallHandle(
        "adw_flap_set_modal",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code self} is modal.
     */
    public void setModal(boolean modal) {
        try {
            adw_flap_set_modal.invokeExact(handle(), modal ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_flap_set_reveal_flap = Interop.downcallHandle(
        "adw_flap_set_reveal_flap",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the flap widget is revealed for {@code self}.
     */
    public void setRevealFlap(boolean revealFlap) {
        try {
            adw_flap_set_reveal_flap.invokeExact(handle(), revealFlap ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_flap_set_reveal_params = Interop.downcallHandle(
        "adw_flap_set_reveal_params",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the reveal animation spring parameters for {@code self}.
     */
    public void setRevealParams(SpringParams params) {
        try {
            adw_flap_set_reveal_params.invokeExact(handle(), params.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_flap_set_separator = Interop.downcallHandle(
        "adw_flap_set_separator",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the separator widget for {@code self}.
     */
    public void setSeparator(org.gtk.gtk.Widget separator) {
        try {
            adw_flap_set_separator.invokeExact(handle(), separator.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_flap_set_swipe_to_close = Interop.downcallHandle(
        "adw_flap_set_swipe_to_close",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code self} can be closed with a swipe gesture.
     */
    public void setSwipeToClose(boolean swipeToClose) {
        try {
            adw_flap_set_swipe_to_close.invokeExact(handle(), swipeToClose ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_flap_set_swipe_to_open = Interop.downcallHandle(
        "adw_flap_set_swipe_to_open",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code self} can be opened with a swipe gesture.
     */
    public void setSwipeToOpen(boolean swipeToOpen) {
        try {
            adw_flap_set_swipe_to_open.invokeExact(handle(), swipeToOpen ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_flap_set_transition_type = Interop.downcallHandle(
        "adw_flap_set_transition_type",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the type of animation used for reveal and fold transitions in {@code self}.
     */
    public void setTransitionType(FlapTransitionType transitionType) {
        try {
            adw_flap_set_transition_type.invokeExact(handle(), transitionType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
