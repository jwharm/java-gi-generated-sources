package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * {@code Flap:flap] and [property@Flap:separator}. Content is the primary
 * child, flap is displayed next to it when unfolded, or overlays it when
 * folded. Flap can be shown or hidden by changing the
 * {@code Flap:reveal-flap} value, as well as via swipe gestures if
 * {@code Flap:swipe-to-open] and/or [property@Flap:swipe-to-close} are set
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
 * <strong>AdwFlap as GtkBuildable</strong><br/>
 * The {@code AdwFlap} implementation of the {@code Gtk.Buildable} interface supports
 * setting the flap child by specifying “flap” as the “type” attribute of a
 * &lt;child&gt; element, and separator by specifying “separator”. Specifying
 * “content” child type or omitting it results in setting the content child.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code AdwFlap} has a single CSS node with name {@code flap}. The node will get the style
 * classes {@code .folded} when it is folded, and {@code .unfolded} when it's not.
 * @version 1.0
 */
public class Flap extends org.gtk.gtk.Widget implements org.gnome.adw.Swipeable, org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public Flap(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Flap */
    public static Flap castFrom(org.gtk.gobject.Object gobject) {
        return new Flap(gobject.refcounted());
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.adw_flap_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @return the content widget for {@code self}
     */
    public @Nullable org.gtk.gtk.Widget getContent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_flap_get_content.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the flap widget for {@code self}.
     * @return the flap widget for {@code self}
     */
    public @Nullable org.gtk.gtk.Widget getFlap() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_flap_get_flap.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the flap position for {@code self}.
     * @return the flap position for {@code self}
     */
    public @NotNull org.gtk.gtk.PackType getFlapPosition() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_flap_get_flap_position.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PackType(RESULT);
    }
    
    /**
     * Gets the duration that fold transitions in {@code self} will take.
     * @return the fold transition duration
     */
    public int getFoldDuration() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_flap_get_fold_duration.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the fold policy for {@code self}.
     * @return the fold policy for {@code self}
     */
    public @NotNull org.gnome.adw.FlapFoldPolicy getFoldPolicy() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_flap_get_fold_policy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.FlapFoldPolicy(RESULT);
    }
    
    /**
     * Gets the fold threshold policy for {@code self}.
     */
    public @NotNull org.gnome.adw.FoldThresholdPolicy getFoldThresholdPolicy() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_flap_get_fold_threshold_policy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.FoldThresholdPolicy(RESULT);
    }
    
    /**
     * Gets whether {@code self} is currently folded.
     * @return {@code TRUE} if {@code self} is currently folded
     */
    public boolean getFolded() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_flap_get_folded.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code self} is locked.
     * @return {@code TRUE} if {@code self} is locked
     */
    public boolean getLocked() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_flap_get_locked.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code self} is modal.
     * @return {@code TRUE} if {@code self} is modal
     */
    public boolean getModal() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_flap_get_modal.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether the flap widget is revealed for {@code self}.
     * @return {@code TRUE} if the flap widget is revealed
     */
    public boolean getRevealFlap() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_flap_get_reveal_flap.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the reveal animation spring parameters for {@code self}.
     * @return the reveal animation parameters
     */
    public @NotNull org.gnome.adw.SpringParams getRevealParams() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_flap_get_reveal_params.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.SpringParams(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets the current reveal progress for {@code self}.
     * @return the current reveal progress for {@code self}
     */
    public double getRevealProgress() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.adw_flap_get_reveal_progress.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the separator widget for {@code self}.
     * @return the separator widget for {@code self}
     */
    public @Nullable org.gtk.gtk.Widget getSeparator() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_flap_get_separator.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets whether {@code self} can be closed with a swipe gesture.
     * @return {@code TRUE} if {@code self} can be closed with a swipe gesture
     */
    public boolean getSwipeToClose() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_flap_get_swipe_to_close.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code self} can be opened with a swipe gesture.
     * @return {@code TRUE} if {@code self} can be opened with a swipe gesture
     */
    public boolean getSwipeToOpen() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_flap_get_swipe_to_open.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the type of animation used for reveal and fold transitions in {@code self}.
     * @return the current transition type of {@code self}
     */
    public @NotNull org.gnome.adw.FlapTransitionType getTransitionType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_flap_get_transition_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.FlapTransitionType(RESULT);
    }
    
    /**
     * Sets the content widget for {@code self}.
     * @param content the content widget
     */
    public void setContent(@Nullable org.gtk.gtk.Widget content) {
        java.util.Objects.requireNonNullElse(content, MemoryAddress.NULL);
        try {
            DowncallHandles.adw_flap_set_content.invokeExact(handle(), content.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the flap widget for {@code self}.
     * @param flap the flap widget
     */
    public void setFlap(@Nullable org.gtk.gtk.Widget flap) {
        java.util.Objects.requireNonNullElse(flap, MemoryAddress.NULL);
        try {
            DowncallHandles.adw_flap_set_flap.invokeExact(handle(), flap.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the flap position for {@code self}.
     * @param position the new value
     */
    public void setFlapPosition(@NotNull org.gtk.gtk.PackType position) {
        java.util.Objects.requireNonNull(position, "Parameter 'position' must not be null");
        try {
            DowncallHandles.adw_flap_set_flap_position.invokeExact(handle(), position.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the duration that fold transitions in {@code self} will take.
     * @param duration the new duration, in milliseconds
     */
    public void setFoldDuration(int duration) {
        try {
            DowncallHandles.adw_flap_set_fold_duration.invokeExact(handle(), duration);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the fold policy for {@code self}.
     * @param policy the fold policy
     */
    public void setFoldPolicy(@NotNull org.gnome.adw.FlapFoldPolicy policy) {
        java.util.Objects.requireNonNull(policy, "Parameter 'policy' must not be null");
        try {
            DowncallHandles.adw_flap_set_fold_policy.invokeExact(handle(), policy.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the fold threshold policy for {@code self}.
     * @param policy the policy to use
     */
    public void setFoldThresholdPolicy(@NotNull org.gnome.adw.FoldThresholdPolicy policy) {
        java.util.Objects.requireNonNull(policy, "Parameter 'policy' must not be null");
        try {
            DowncallHandles.adw_flap_set_fold_threshold_policy.invokeExact(handle(), policy.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code self} is locked.
     * @param locked the new value
     */
    public void setLocked(boolean locked) {
        try {
            DowncallHandles.adw_flap_set_locked.invokeExact(handle(), locked ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code self} is modal.
     * @param modal whether {@code self} is modal
     */
    public void setModal(boolean modal) {
        try {
            DowncallHandles.adw_flap_set_modal.invokeExact(handle(), modal ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the flap widget is revealed for {@code self}.
     * @param revealFlap whether to reveal the flap widget
     */
    public void setRevealFlap(boolean revealFlap) {
        try {
            DowncallHandles.adw_flap_set_reveal_flap.invokeExact(handle(), revealFlap ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the reveal animation spring parameters for {@code self}.
     * @param params the new parameters
     */
    public void setRevealParams(@NotNull org.gnome.adw.SpringParams params) {
        java.util.Objects.requireNonNull(params, "Parameter 'params' must not be null");
        try {
            DowncallHandles.adw_flap_set_reveal_params.invokeExact(handle(), params.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the separator widget for {@code self}.
     * @param separator the separator widget
     */
    public void setSeparator(@Nullable org.gtk.gtk.Widget separator) {
        java.util.Objects.requireNonNullElse(separator, MemoryAddress.NULL);
        try {
            DowncallHandles.adw_flap_set_separator.invokeExact(handle(), separator.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code self} can be closed with a swipe gesture.
     * @param swipeToClose whether {@code self} can be closed with a swipe gesture
     */
    public void setSwipeToClose(boolean swipeToClose) {
        try {
            DowncallHandles.adw_flap_set_swipe_to_close.invokeExact(handle(), swipeToClose ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code self} can be opened with a swipe gesture.
     * @param swipeToOpen whether {@code self} can be opened with a swipe gesture
     */
    public void setSwipeToOpen(boolean swipeToOpen) {
        try {
            DowncallHandles.adw_flap_set_swipe_to_open.invokeExact(handle(), swipeToOpen ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the type of animation used for reveal and fold transitions in {@code self}.
     * @param transitionType the new transition type
     */
    public void setTransitionType(@NotNull org.gnome.adw.FlapTransitionType transitionType) {
        java.util.Objects.requireNonNull(transitionType, "Parameter 'transitionType' must not be null");
        try {
            DowncallHandles.adw_flap_set_transition_type.invokeExact(handle(), transitionType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_flap_new = Interop.downcallHandle(
            "adw_flap_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_flap_get_content = Interop.downcallHandle(
            "adw_flap_get_content",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_flap_get_flap = Interop.downcallHandle(
            "adw_flap_get_flap",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_flap_get_flap_position = Interop.downcallHandle(
            "adw_flap_get_flap_position",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_flap_get_fold_duration = Interop.downcallHandle(
            "adw_flap_get_fold_duration",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_flap_get_fold_policy = Interop.downcallHandle(
            "adw_flap_get_fold_policy",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_flap_get_fold_threshold_policy = Interop.downcallHandle(
            "adw_flap_get_fold_threshold_policy",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_flap_get_folded = Interop.downcallHandle(
            "adw_flap_get_folded",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_flap_get_locked = Interop.downcallHandle(
            "adw_flap_get_locked",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_flap_get_modal = Interop.downcallHandle(
            "adw_flap_get_modal",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_flap_get_reveal_flap = Interop.downcallHandle(
            "adw_flap_get_reveal_flap",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_flap_get_reveal_params = Interop.downcallHandle(
            "adw_flap_get_reveal_params",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_flap_get_reveal_progress = Interop.downcallHandle(
            "adw_flap_get_reveal_progress",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_flap_get_separator = Interop.downcallHandle(
            "adw_flap_get_separator",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_flap_get_swipe_to_close = Interop.downcallHandle(
            "adw_flap_get_swipe_to_close",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_flap_get_swipe_to_open = Interop.downcallHandle(
            "adw_flap_get_swipe_to_open",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_flap_get_transition_type = Interop.downcallHandle(
            "adw_flap_get_transition_type",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_flap_set_content = Interop.downcallHandle(
            "adw_flap_set_content",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_flap_set_flap = Interop.downcallHandle(
            "adw_flap_set_flap",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_flap_set_flap_position = Interop.downcallHandle(
            "adw_flap_set_flap_position",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_flap_set_fold_duration = Interop.downcallHandle(
            "adw_flap_set_fold_duration",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_flap_set_fold_policy = Interop.downcallHandle(
            "adw_flap_set_fold_policy",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_flap_set_fold_threshold_policy = Interop.downcallHandle(
            "adw_flap_set_fold_threshold_policy",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_flap_set_locked = Interop.downcallHandle(
            "adw_flap_set_locked",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_flap_set_modal = Interop.downcallHandle(
            "adw_flap_set_modal",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_flap_set_reveal_flap = Interop.downcallHandle(
            "adw_flap_set_reveal_flap",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_flap_set_reveal_params = Interop.downcallHandle(
            "adw_flap_set_reveal_params",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_flap_set_separator = Interop.downcallHandle(
            "adw_flap_set_separator",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_flap_set_swipe_to_close = Interop.downcallHandle(
            "adw_flap_set_swipe_to_close",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_flap_set_swipe_to_open = Interop.downcallHandle(
            "adw_flap_set_swipe_to_open",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle adw_flap_set_transition_type = Interop.downcallHandle(
            "adw_flap_set_transition_type",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
    }
}
