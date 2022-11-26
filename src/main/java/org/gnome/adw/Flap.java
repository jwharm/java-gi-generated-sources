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
 * {@code <child>} element, and separator by specifying “separator”. Specifying
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
    
    private static final java.lang.String C_TYPE_NAME = "AdwFlap";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Flap proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Flap(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to Flap if its GType is a (or inherits from) "AdwFlap".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code Flap} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwFlap", a ClassCastException will be thrown.
     */
    public static Flap castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), Flap.getType())) {
            return new Flap(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwFlap");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_flap_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwFlap}.
     */
    public Flap() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Gets the content widget for {@code self}.
     * @return the content widget for {@code self}
     */
    public @Nullable org.gtk.gtk.Widget getContent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_flap_get_content.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the flap widget for {@code self}.
     * @return the flap widget for {@code self}
     */
    public @Nullable org.gtk.gtk.Widget getFlap() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_flap_get_flap.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the flap position for {@code self}.
     * @return the flap position for {@code self}
     */
    public @NotNull org.gtk.gtk.PackType getFlapPosition() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_flap_get_flap_position.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.PackType(RESULT);
    }
    
    /**
     * Gets the fold transition animation duration for {@code self}, in milliseconds.
     * @return the fold transition duration
     */
    public int getFoldDuration() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_flap_get_fold_duration.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.adw_flap_get_fold_policy.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.adw_flap_get_fold_threshold_policy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.FoldThresholdPolicy(RESULT);
    }
    
    /**
     * Gets whether {@code self} is currently folded.
     * <p>
     * See {@code Flap:fold-policy}.
     * @return {@code TRUE} if {@code self} is currently folded
     */
    public boolean getFolded() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_flap_get_folded.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.adw_flap_get_locked.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.adw_flap_get_modal.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.adw_flap_get_reveal_flap.invokeExact(
                    handle());
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
            RESULT = (MemoryAddress) DowncallHandles.adw_flap_get_reveal_params.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.SpringParams(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the current reveal progress for {@code self}.
     * <p>
     * 0 means fully hidden, 1 means fully revealed.
     * <p>
     * See {@code Flap:reveal-flap}.
     * @return the current reveal progress for {@code self}
     */
    public double getRevealProgress() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.adw_flap_get_reveal_progress.invokeExact(
                    handle());
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
            RESULT = (MemoryAddress) DowncallHandles.adw_flap_get_separator.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets whether {@code self} can be closed with a swipe gesture.
     * @return {@code TRUE} if {@code self} can be closed with a swipe gesture
     */
    public boolean getSwipeToClose() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_flap_get_swipe_to_close.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.adw_flap_get_swipe_to_open.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.adw_flap_get_transition_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.FlapTransitionType(RESULT);
    }
    
    /**
     * Sets the content widget for {@code self}.
     * <p>
     * It's always displayed when unfolded, and partially visible when folded.
     * @param content the content widget
     */
    public void setContent(@Nullable org.gtk.gtk.Widget content) {
        try {
            DowncallHandles.adw_flap_set_content.invokeExact(
                    handle(),
                    (Addressable) (content == null ? MemoryAddress.NULL : content.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the flap widget for {@code self}.
     * <p>
     * It's only visible when {@code Flap:reveal-progress} is greater than 0.
     * @param flap the flap widget
     */
    public void setFlap(@Nullable org.gtk.gtk.Widget flap) {
        try {
            DowncallHandles.adw_flap_set_flap.invokeExact(
                    handle(),
                    (Addressable) (flap == null ? MemoryAddress.NULL : flap.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the flap position for {@code self}.
     * <p>
     * If it's set to {@code GTK_PACK_START}, the flap is displayed before the content,
     * if {@code GTK_PACK_END}, it's displayed after the content.
     * @param position the new value
     */
    public void setFlapPosition(@NotNull org.gtk.gtk.PackType position) {
        java.util.Objects.requireNonNull(position, "Parameter 'position' must not be null");
        try {
            DowncallHandles.adw_flap_set_flap_position.invokeExact(
                    handle(),
                    position.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the fold transition animation duration for {@code self}, in milliseconds.
     * @param duration the new duration, in milliseconds
     */
    public void setFoldDuration(int duration) {
        try {
            DowncallHandles.adw_flap_set_fold_duration.invokeExact(
                    handle(),
                    duration);
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
            DowncallHandles.adw_flap_set_fold_policy.invokeExact(
                    handle(),
                    policy.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the fold threshold policy for {@code self}.
     * <p>
     * If set to {@code ADW_FOLD_THRESHOLD_POLICY_MINIMUM}, flap will only fold when the
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
            DowncallHandles.adw_flap_set_fold_threshold_policy.invokeExact(
                    handle(),
                    policy.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code self} is locked.
     * <p>
     * If {@code FALSE}, folding when the flap is revealed automatically closes it, and
     * unfolding it when the flap is not revealed opens it. If {@code TRUE},
     * {@code Flap:reveal-flap} value never changes on its own.
     * @param locked the new value
     */
    public void setLocked(boolean locked) {
        try {
            DowncallHandles.adw_flap_set_locked.invokeExact(
                    handle(),
                    locked ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code self} is modal.
     * <p>
     * If {@code TRUE}, clicking the content widget while flap is revealed, as well as
     * pressing the &lt;kbd&gt;Esc&lt;/kbd&gt; key, will close the flap. If {@code FALSE}, clicks are
     * passed through to the content widget.
     * @param modal whether {@code self} is modal
     */
    public void setModal(boolean modal) {
        try {
            DowncallHandles.adw_flap_set_modal.invokeExact(
                    handle(),
                    modal ? 1 : 0);
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
            DowncallHandles.adw_flap_set_reveal_flap.invokeExact(
                    handle(),
                    revealFlap ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the reveal animation spring parameters for {@code self}.
     * <p>
     * The default value is equivalent to:
     * <pre>{@code c
     * adw_spring_params_new (1, 0.5, 500)
     * }</pre>
     * @param params the new parameters
     */
    public void setRevealParams(@NotNull org.gnome.adw.SpringParams params) {
        java.util.Objects.requireNonNull(params, "Parameter 'params' must not be null");
        try {
            DowncallHandles.adw_flap_set_reveal_params.invokeExact(
                    handle(),
                    params.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the separator widget for {@code self}.
     * <p>
     * It's displayed between content and flap when there's no shadow to display.
     * When exactly it's visible depends on the {@code Flap:transition-type}
     * value.
     * @param separator the separator widget
     */
    public void setSeparator(@Nullable org.gtk.gtk.Widget separator) {
        try {
            DowncallHandles.adw_flap_set_separator.invokeExact(
                    handle(),
                    (Addressable) (separator == null ? MemoryAddress.NULL : separator.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code self} can be closed with a swipe gesture.
     * <p>
     * The area that can be swiped depends on the {@code Flap:transition-type}
     * value.
     * @param swipeToClose whether {@code self} can be closed with a swipe gesture
     */
    public void setSwipeToClose(boolean swipeToClose) {
        try {
            DowncallHandles.adw_flap_set_swipe_to_close.invokeExact(
                    handle(),
                    swipeToClose ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code self} can be opened with a swipe gesture.
     * <p>
     * The area that can be swiped depends on the {@code Flap:transition-type}
     * value.
     * @param swipeToOpen whether {@code self} can be opened with a swipe gesture
     */
    public void setSwipeToOpen(boolean swipeToOpen) {
        try {
            DowncallHandles.adw_flap_set_swipe_to_open.invokeExact(
                    handle(),
                    swipeToOpen ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the type of animation used for reveal and fold transitions in {@code self}.
     * <p>
     * {@code Flap:flap} is transparent by default, which means the content will
     * be seen through it with {@code ADW_FLAP_TRANSITION_TYPE_OVER} transitions; add the
     * <a href="style-classes.html#background">`.background`</a> style class to it if this is
     * unwanted.
     * @param transitionType the new transition type
     */
    public void setTransitionType(@NotNull org.gnome.adw.FlapTransitionType transitionType) {
        java.util.Objects.requireNonNull(transitionType, "Parameter 'transitionType' must not be null");
        try {
            DowncallHandles.adw_flap_set_transition_type.invokeExact(
                    handle(),
                    transitionType.getValue());
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
            RESULT = (long) DowncallHandles.adw_flap_get_type.invokeExact();
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
         * A {@link Flap.Build} object constructs a {@link Flap} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link Flap} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Flap} using {@link Flap#castFrom}.
         * @return A new instance of {@code Flap} with the properties 
         *         that were set in the Build object.
         */
        public Flap construct() {
            return Flap.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    Flap.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The content widget.
         * <p>
         * It's always displayed when unfolded, and partially visible when folded.
         * @param content The value for the {@code content} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setContent(org.gtk.gtk.Widget content) {
            names.add("content");
            values.add(org.gtk.gobject.Value.create(content));
            return this;
        }
        
        /**
         * The flap widget.
         * <p>
         * It's only visible when {@code Flap:reveal-progress} is greater than 0.
         * @param flap The value for the {@code flap} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFlap(org.gtk.gtk.Widget flap) {
            names.add("flap");
            values.add(org.gtk.gobject.Value.create(flap));
            return this;
        }
        
        /**
         * The flap position.
         * <p>
         * If it's set to {@code GTK_PACK_START}, the flap is displayed before the content,
         * if {@code GTK_PACK_END}, it's displayed after the content.
         * @param flapPosition The value for the {@code flap-position} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFlapPosition(org.gtk.gtk.PackType flapPosition) {
            names.add("flap-position");
            values.add(org.gtk.gobject.Value.create(flapPosition));
            return this;
        }
        
        /**
         * The fold transition animation duration, in milliseconds.
         * @param foldDuration The value for the {@code fold-duration} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFoldDuration(int foldDuration) {
            names.add("fold-duration");
            values.add(org.gtk.gobject.Value.create(foldDuration));
            return this;
        }
        
        /**
         * The fold policy for the flap.
         * @param foldPolicy The value for the {@code fold-policy} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFoldPolicy(org.gnome.adw.FlapFoldPolicy foldPolicy) {
            names.add("fold-policy");
            values.add(org.gtk.gobject.Value.create(foldPolicy));
            return this;
        }
        
        /**
         * Determines when the flap will fold.
         * <p>
         * If set to {@code ADW_FOLD_THRESHOLD_POLICY_MINIMUM}, flap will only fold when
         * the children cannot fit anymore. With {@code ADW_FOLD_THRESHOLD_POLICY_NATURAL},
         * it will fold as soon as children don't get their natural size.
         * <p>
         * This can be useful if you have a long ellipsizing label and want to let it
         * ellipsize instead of immediately folding.
         * @param foldThresholdPolicy The value for the {@code fold-threshold-policy} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFoldThresholdPolicy(org.gnome.adw.FoldThresholdPolicy foldThresholdPolicy) {
            names.add("fold-threshold-policy");
            values.add(org.gtk.gobject.Value.create(foldThresholdPolicy));
            return this;
        }
        
        /**
         * Whether the flap is currently folded.
         * <p>
         * See {@code Flap:fold-policy}.
         * @param folded The value for the {@code folded} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setFolded(boolean folded) {
            names.add("folded");
            values.add(org.gtk.gobject.Value.create(folded));
            return this;
        }
        
        /**
         * Whether the flap is locked.
         * <p>
         * If {@code FALSE}, folding when the flap is revealed automatically closes it, and
         * unfolding it when the flap is not revealed opens it. If {@code TRUE},
         * {@code Flap:reveal-flap} value never changes on its own.
         * @param locked The value for the {@code locked} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setLocked(boolean locked) {
            names.add("locked");
            values.add(org.gtk.gobject.Value.create(locked));
            return this;
        }
        
        /**
         * Whether the flap is modal.
         * <p>
         * If {@code TRUE}, clicking the content widget while flap is revealed, as well as
         * pressing the &lt;kbd&gt;Esc&lt;/kbd&gt; key, will close the flap. If {@code FALSE}, clicks
         * are passed through to the content widget.
         * @param modal The value for the {@code modal} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setModal(boolean modal) {
            names.add("modal");
            values.add(org.gtk.gobject.Value.create(modal));
            return this;
        }
        
        /**
         * Whether the flap widget is revealed.
         * @param revealFlap The value for the {@code reveal-flap} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setRevealFlap(boolean revealFlap) {
            names.add("reveal-flap");
            values.add(org.gtk.gobject.Value.create(revealFlap));
            return this;
        }
        
        /**
         * The reveal animation spring parameters.
         * <p>
         * The default value is equivalent to:
         * <pre>{@code c
         * adw_spring_params_new (1, 0.5, 500)
         * }</pre>
         * @param revealParams The value for the {@code reveal-params} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setRevealParams(org.gnome.adw.SpringParams revealParams) {
            names.add("reveal-params");
            values.add(org.gtk.gobject.Value.create(revealParams));
            return this;
        }
        
        /**
         * The current reveal transition progress.
         * <p>
         * 0 means fully hidden, 1 means fully revealed.
         * <p>
         * See {@code Flap:reveal-flap}.
         * @param revealProgress The value for the {@code reveal-progress} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setRevealProgress(double revealProgress) {
            names.add("reveal-progress");
            values.add(org.gtk.gobject.Value.create(revealProgress));
            return this;
        }
        
        /**
         * The separator widget.
         * <p>
         * It's displayed between content and flap when there's no shadow to display.
         * When exactly it's visible depends on the {@code Flap:transition-type}
         * value.
         * @param separator The value for the {@code separator} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSeparator(org.gtk.gtk.Widget separator) {
            names.add("separator");
            values.add(org.gtk.gobject.Value.create(separator));
            return this;
        }
        
        /**
         * Whether the flap can be closed with a swipe gesture.
         * <p>
         * The area that can be swiped depends on the {@code Flap:transition-type}
         * value.
         * @param swipeToClose The value for the {@code swipe-to-close} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSwipeToClose(boolean swipeToClose) {
            names.add("swipe-to-close");
            values.add(org.gtk.gobject.Value.create(swipeToClose));
            return this;
        }
        
        /**
         * Whether the flap can be opened with a swipe gesture.
         * <p>
         * The area that can be swiped depends on the {@code Flap:transition-type}
         * value.
         * @param swipeToOpen The value for the {@code swipe-to-open} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSwipeToOpen(boolean swipeToOpen) {
            names.add("swipe-to-open");
            values.add(org.gtk.gobject.Value.create(swipeToOpen));
            return this;
        }
        
        /**
         * the type of animation used for reveal and fold transitions.
         * <p>
         * {@code Flap:flap} is transparent by default, which means the content
         * will be seen through it with {@code ADW_FLAP_TRANSITION_TYPE_OVER} transitions;
         * add the <a href="style-classes.html#background">`.background`</a> style class to it if
         * this is unwanted.
         * @param transitionType The value for the {@code transition-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTransitionType(org.gnome.adw.FlapTransitionType transitionType) {
            names.add("transition-type");
            values.add(org.gtk.gobject.Value.create(transitionType));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_flap_new = Interop.downcallHandle(
            "adw_flap_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_flap_get_content = Interop.downcallHandle(
            "adw_flap_get_content",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_flap_get_flap = Interop.downcallHandle(
            "adw_flap_get_flap",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_flap_get_flap_position = Interop.downcallHandle(
            "adw_flap_get_flap_position",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_flap_get_fold_duration = Interop.downcallHandle(
            "adw_flap_get_fold_duration",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_flap_get_fold_policy = Interop.downcallHandle(
            "adw_flap_get_fold_policy",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_flap_get_fold_threshold_policy = Interop.downcallHandle(
            "adw_flap_get_fold_threshold_policy",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_flap_get_folded = Interop.downcallHandle(
            "adw_flap_get_folded",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_flap_get_locked = Interop.downcallHandle(
            "adw_flap_get_locked",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_flap_get_modal = Interop.downcallHandle(
            "adw_flap_get_modal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_flap_get_reveal_flap = Interop.downcallHandle(
            "adw_flap_get_reveal_flap",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_flap_get_reveal_params = Interop.downcallHandle(
            "adw_flap_get_reveal_params",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_flap_get_reveal_progress = Interop.downcallHandle(
            "adw_flap_get_reveal_progress",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_flap_get_separator = Interop.downcallHandle(
            "adw_flap_get_separator",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_flap_get_swipe_to_close = Interop.downcallHandle(
            "adw_flap_get_swipe_to_close",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_flap_get_swipe_to_open = Interop.downcallHandle(
            "adw_flap_get_swipe_to_open",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_flap_get_transition_type = Interop.downcallHandle(
            "adw_flap_get_transition_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_flap_set_content = Interop.downcallHandle(
            "adw_flap_set_content",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_flap_set_flap = Interop.downcallHandle(
            "adw_flap_set_flap",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_flap_set_flap_position = Interop.downcallHandle(
            "adw_flap_set_flap_position",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_flap_set_fold_duration = Interop.downcallHandle(
            "adw_flap_set_fold_duration",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_flap_set_fold_policy = Interop.downcallHandle(
            "adw_flap_set_fold_policy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_flap_set_fold_threshold_policy = Interop.downcallHandle(
            "adw_flap_set_fold_threshold_policy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_flap_set_locked = Interop.downcallHandle(
            "adw_flap_set_locked",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_flap_set_modal = Interop.downcallHandle(
            "adw_flap_set_modal",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_flap_set_reveal_flap = Interop.downcallHandle(
            "adw_flap_set_reveal_flap",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_flap_set_reveal_params = Interop.downcallHandle(
            "adw_flap_set_reveal_params",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_flap_set_separator = Interop.downcallHandle(
            "adw_flap_set_separator",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_flap_set_swipe_to_close = Interop.downcallHandle(
            "adw_flap_set_swipe_to_close",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_flap_set_swipe_to_open = Interop.downcallHandle(
            "adw_flap_set_swipe_to_open",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_flap_set_transition_type = Interop.downcallHandle(
            "adw_flap_set_transition_type",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_flap_get_type = Interop.downcallHandle(
            "adw_flap_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
