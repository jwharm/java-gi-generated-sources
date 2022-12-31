package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A paginated scrolling widget.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="carousel-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="carousel.png" alt="carousel"&gt;
 * &lt;/picture&gt;
 * <p>
 * The {@code AdwCarousel} widget can be used to display a set of pages with
 * swipe-based navigation between them.
 * <p>
 * {@link CarouselIndicatorDots} can be used
 * to provide page indicators for {@code AdwCarousel}.
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code AdwCarousel} has a single CSS node with name {@code carousel}.
 * @version 1.0
 */
public class Carousel extends org.gtk.gtk.Widget implements org.gnome.adw.Swipeable, org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwCarousel";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Carousel proxy instance for the provided memory address.
     * <p>
     * Because Carousel is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Carousel(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, Carousel> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Carousel(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_carousel_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwCarousel}.
     */
    public Carousel() {
        super(constructNew(), Ownership.NONE);
    }
    
    /**
     * Appends {@code child} to {@code self}.
     * @param child a widget to add
     */
    public void append(org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.adw_carousel_append.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets whether to allow swiping for more than one page at a time.
     * @return {@code TRUE} if long swipes are allowed
     */
    public boolean getAllowLongSwipes() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_carousel_get_allow_long_swipes.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets whether {@code self} can be dragged with mouse pointer.
     * @return whether {@code self} can be dragged with mouse pointer
     */
    public boolean getAllowMouseDrag() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_carousel_get_allow_mouse_drag.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets whether {@code self} will respond to scroll wheel events.
     * @return {@code TRUE} if {@code self} will respond to scroll wheel events
     */
    public boolean getAllowScrollWheel() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_carousel_get_allow_scroll_wheel.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets whether {@code self} can be navigated.
     * @return whether {@code self} can be navigated
     */
    public boolean getInteractive() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_carousel_get_interactive.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the number of pages in {@code self}.
     * @return the number of pages in {@code self}
     */
    public int getNPages() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_carousel_get_n_pages.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the page at position {@code n}.
     * @param n index of the page
     * @return the page
     */
    public org.gtk.gtk.Widget getNthPage(int n) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_carousel_get_nth_page.invokeExact(
                    handle(),
                    n);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gtk.Widget.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets current scroll position in {@code self}, unitless.
     * <p>
     * 1 matches 1 page. Use {@code Carousel#scrollTo} for changing it.
     * @return the scroll position
     */
    public double getPosition() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.adw_carousel_get_position.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the page reveal duration, in milliseconds.
     * @return the duration
     */
    public int getRevealDuration() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_carousel_get_reveal_duration.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the scroll animation spring parameters for {@code self}.
     * @return the animation parameters
     */
    public org.gnome.adw.SpringParams getScrollParams() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_carousel_get_scroll_params.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gnome.adw.SpringParams.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets spacing between pages in pixels.
     * @return spacing between pages
     */
    public int getSpacing() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.adw_carousel_get_spacing.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Inserts {@code child} into {@code self} at position {@code position}.
     * <p>
     * If position is -1, or larger than the number of pages,
     * {@code child} will be appended to the end.
     * @param child a widget to add
     * @param position the position to insert {@code child} at
     */
    public void insert(org.gtk.gtk.Widget child, int position) {
        try {
            DowncallHandles.adw_carousel_insert.invokeExact(
                    handle(),
                    child.handle(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Prepends {@code child} to {@code self}.
     * @param child a widget to add
     */
    public void prepend(org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.adw_carousel_prepend.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes {@code child} from {@code self}.
     * @param child a widget to remove
     */
    public void remove(org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.adw_carousel_remove.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Moves {@code child} into position {@code position}.
     * <p>
     * If position is -1, or larger than the number of pages, {@code child} will be moved
     * at the end.
     * @param child a widget to add
     * @param position the position to move {@code child} to
     */
    public void reorder(org.gtk.gtk.Widget child, int position) {
        try {
            DowncallHandles.adw_carousel_reorder.invokeExact(
                    handle(),
                    child.handle(),
                    position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Scrolls to {@code widget}.
     * <p>
     * If {@code animate} is {@code TRUE}, the transition will be animated.
     * @param widget a child of {@code self}
     * @param animate whether to animate the transition
     */
    public void scrollTo(org.gtk.gtk.Widget widget, boolean animate) {
        try {
            DowncallHandles.adw_carousel_scroll_to.invokeExact(
                    handle(),
                    widget.handle(),
                    Marshal.booleanToInteger.marshal(animate, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether to allow swiping for more than one page at a time.
     * <p>
     * If {@code allow_long_swipes} is {@code FALSE}, each swipe can only move to the adjacent
     * pages.
     * @param allowLongSwipes whether to allow long swipes
     */
    public void setAllowLongSwipes(boolean allowLongSwipes) {
        try {
            DowncallHandles.adw_carousel_set_allow_long_swipes.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(allowLongSwipes, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code self} can be dragged with mouse pointer.
     * <p>
     * If {@code allow_mouse_drag} is {@code FALSE}, dragging is only available on touch.
     * @param allowMouseDrag whether {@code self} can be dragged with mouse pointer
     */
    public void setAllowMouseDrag(boolean allowMouseDrag) {
        try {
            DowncallHandles.adw_carousel_set_allow_mouse_drag.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(allowMouseDrag, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code self} will respond to scroll wheel events.
     * <p>
     * If {@code allow_scroll_wheel} is {@code FALSE}, wheel events will be ignored.
     * @param allowScrollWheel whether {@code self} will respond to scroll wheel events
     */
    public void setAllowScrollWheel(boolean allowScrollWheel) {
        try {
            DowncallHandles.adw_carousel_set_allow_scroll_wheel.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(allowScrollWheel, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether {@code self} can be navigated.
     * <p>
     * This can be used to temporarily disable the carousel to only allow navigating
     * it in a certain state.
     * @param interactive whether {@code self} can be navigated
     */
    public void setInteractive(boolean interactive) {
        try {
            DowncallHandles.adw_carousel_set_interactive.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(interactive, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the page reveal duration, in milliseconds.
     * <p>
     * Reveal duration is used when animating adding or removing pages.
     * @param revealDuration the new reveal duration value
     */
    public void setRevealDuration(int revealDuration) {
        try {
            DowncallHandles.adw_carousel_set_reveal_duration.invokeExact(
                    handle(),
                    revealDuration);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the scroll animation spring parameters for {@code self}.
     * <p>
     * The default value is equivalent to:
     * <pre>{@code c
     * adw_spring_params_new (1, 0.5, 500)
     * }</pre>
     * @param params the new parameters
     */
    public void setScrollParams(org.gnome.adw.SpringParams params) {
        try {
            DowncallHandles.adw_carousel_set_scroll_params.invokeExact(
                    handle(),
                    params.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets spacing between pages in pixels.
     * @param spacing the new spacing value
     */
    public void setSpacing(int spacing) {
        try {
            DowncallHandles.adw_carousel_set_spacing.invokeExact(
                    handle(),
                    spacing);
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
            RESULT = (long) DowncallHandles.adw_carousel_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface PageChanged {
        void run(int index);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceCarousel, int index) {
            run(index);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PageChanged.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * This signal is emitted after a page has been changed.
     * <p>
     * It can be used to implement "infinite scrolling" by amending the pages
     * after every scroll.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<Carousel.PageChanged> onPageChanged(Carousel.PageChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("page-changed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link Carousel.Builder} object constructs a {@link Carousel} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Carousel.Builder#build()}. 
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
         * Finish building the {@link Carousel} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Carousel}.
         * @return A new instance of {@code Carousel} with the properties 
         *         that were set in the Builder object.
         */
        public Carousel build() {
            return (Carousel) org.gtk.gobject.GObject.newWithProperties(
                Carousel.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether to allow swiping for more than one page at a time.
         * <p>
         * If the value is {@code FALSE}, each swipe can only move to the adjacent pages.
         * @param allowLongSwipes The value for the {@code allow-long-swipes} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAllowLongSwipes(boolean allowLongSwipes) {
            names.add("allow-long-swipes");
            values.add(org.gtk.gobject.Value.create(allowLongSwipes));
            return this;
        }
        
        /**
         * Sets whether the {@code AdwCarousel} can be dragged with mouse pointer.
         * <p>
         * If the value is {@code FALSE}, dragging is only available on touch.
         * @param allowMouseDrag The value for the {@code allow-mouse-drag} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAllowMouseDrag(boolean allowMouseDrag) {
            names.add("allow-mouse-drag");
            values.add(org.gtk.gobject.Value.create(allowMouseDrag));
            return this;
        }
        
        /**
         * Whether the widget will respond to scroll wheel events.
         * <p>
         * If the value is {@code FALSE}, wheel events will be ignored.
         * @param allowScrollWheel The value for the {@code allow-scroll-wheel} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAllowScrollWheel(boolean allowScrollWheel) {
            names.add("allow-scroll-wheel");
            values.add(org.gtk.gobject.Value.create(allowScrollWheel));
            return this;
        }
        
        /**
         * Whether the carousel can be navigated.
         * <p>
         * This can be used to temporarily disable the carousel to only allow
         * navigating it in a certain state.
         * @param interactive The value for the {@code interactive} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInteractive(boolean interactive) {
            names.add("interactive");
            values.add(org.gtk.gobject.Value.create(interactive));
            return this;
        }
        
        /**
         * The number of pages in a {@code AdwCarousel}.
         * @param nPages The value for the {@code n-pages} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNPages(int nPages) {
            names.add("n-pages");
            values.add(org.gtk.gobject.Value.create(nPages));
            return this;
        }
        
        /**
         * Current scrolling position, unitless.
         * <p>
         * 1 matches 1 page. Use {@code Carousel#scrollTo} for changing it.
         * @param position The value for the {@code position} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPosition(double position) {
            names.add("position");
            values.add(org.gtk.gobject.Value.create(position));
            return this;
        }
        
        /**
         * Page reveal duration, in milliseconds.
         * <p>
         * Reveal duration is used when animating adding or removing pages.
         * @param revealDuration The value for the {@code reveal-duration} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRevealDuration(int revealDuration) {
            names.add("reveal-duration");
            values.add(org.gtk.gobject.Value.create(revealDuration));
            return this;
        }
        
        /**
         * Scroll animation spring parameters.
         * <p>
         * The default value is equivalent to:
         * <pre>{@code c
         * adw_spring_params_new (1, 0.5, 500)
         * }</pre>
         * @param scrollParams The value for the {@code scroll-params} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setScrollParams(org.gnome.adw.SpringParams scrollParams) {
            names.add("scroll-params");
            values.add(org.gtk.gobject.Value.create(scrollParams));
            return this;
        }
        
        /**
         * Spacing between pages in pixels.
         * @param spacing The value for the {@code spacing} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSpacing(int spacing) {
            names.add("spacing");
            values.add(org.gtk.gobject.Value.create(spacing));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_carousel_new = Interop.downcallHandle(
            "adw_carousel_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_carousel_append = Interop.downcallHandle(
            "adw_carousel_append",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_carousel_get_allow_long_swipes = Interop.downcallHandle(
            "adw_carousel_get_allow_long_swipes",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_carousel_get_allow_mouse_drag = Interop.downcallHandle(
            "adw_carousel_get_allow_mouse_drag",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_carousel_get_allow_scroll_wheel = Interop.downcallHandle(
            "adw_carousel_get_allow_scroll_wheel",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_carousel_get_interactive = Interop.downcallHandle(
            "adw_carousel_get_interactive",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_carousel_get_n_pages = Interop.downcallHandle(
            "adw_carousel_get_n_pages",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_carousel_get_nth_page = Interop.downcallHandle(
            "adw_carousel_get_nth_page",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_carousel_get_position = Interop.downcallHandle(
            "adw_carousel_get_position",
            FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_carousel_get_reveal_duration = Interop.downcallHandle(
            "adw_carousel_get_reveal_duration",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_carousel_get_scroll_params = Interop.downcallHandle(
            "adw_carousel_get_scroll_params",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_carousel_get_spacing = Interop.downcallHandle(
            "adw_carousel_get_spacing",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_carousel_insert = Interop.downcallHandle(
            "adw_carousel_insert",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_carousel_prepend = Interop.downcallHandle(
            "adw_carousel_prepend",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_carousel_remove = Interop.downcallHandle(
            "adw_carousel_remove",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_carousel_reorder = Interop.downcallHandle(
            "adw_carousel_reorder",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_carousel_scroll_to = Interop.downcallHandle(
            "adw_carousel_scroll_to",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_carousel_set_allow_long_swipes = Interop.downcallHandle(
            "adw_carousel_set_allow_long_swipes",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_carousel_set_allow_mouse_drag = Interop.downcallHandle(
            "adw_carousel_set_allow_mouse_drag",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_carousel_set_allow_scroll_wheel = Interop.downcallHandle(
            "adw_carousel_set_allow_scroll_wheel",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_carousel_set_interactive = Interop.downcallHandle(
            "adw_carousel_set_interactive",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_carousel_set_reveal_duration = Interop.downcallHandle(
            "adw_carousel_set_reveal_duration",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_carousel_set_scroll_params = Interop.downcallHandle(
            "adw_carousel_set_scroll_params",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_carousel_set_spacing = Interop.downcallHandle(
            "adw_carousel_set_spacing",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle adw_carousel_get_type = Interop.downcallHandle(
            "adw_carousel_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
