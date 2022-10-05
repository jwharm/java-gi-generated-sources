package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * {@code CarouselIndicatorLines} can be used
 * to provide page indicators for {@code AdwCarousel}.
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
 * {@code AdwCarousel} has a single CSS node with name {@code carousel}.
 */
public class Carousel extends org.gtk.gtk.Widget implements Swipeable, org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {

    public Carousel(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Carousel */
    public static Carousel castFrom(org.gtk.gobject.Object gobject) {
        return new Carousel(gobject.refcounted());
    }
    
    static final MethodHandle adw_carousel_new = Interop.downcallHandle(
        "adw_carousel_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_carousel_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwCarousel}.
     */
    public Carousel() {
        super(constructNew());
    }
    
    static final MethodHandle adw_carousel_append = Interop.downcallHandle(
        "adw_carousel_append",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Appends {@code child} to {@code self}.
     */
    public void append(org.gtk.gtk.Widget child) {
        try {
            adw_carousel_append.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_carousel_get_allow_long_swipes = Interop.downcallHandle(
        "adw_carousel_get_allow_long_swipes",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether to allow swiping for more than one page at a time.
     */
    public boolean getAllowLongSwipes() {
        try {
            var RESULT = (int) adw_carousel_get_allow_long_swipes.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_carousel_get_allow_mouse_drag = Interop.downcallHandle(
        "adw_carousel_get_allow_mouse_drag",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets whether {@code self} can be dragged with mouse pointer.
     */
    public boolean getAllowMouseDrag() {
        try {
            var RESULT = (int) adw_carousel_get_allow_mouse_drag.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_carousel_get_allow_scroll_wheel = Interop.downcallHandle(
        "adw_carousel_get_allow_scroll_wheel",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code self} will respond to scroll wheel events.
     */
    public boolean getAllowScrollWheel() {
        try {
            var RESULT = (int) adw_carousel_get_allow_scroll_wheel.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_carousel_get_interactive = Interop.downcallHandle(
        "adw_carousel_get_interactive",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether {@code self} can be navigated.
     */
    public boolean getInteractive() {
        try {
            var RESULT = (int) adw_carousel_get_interactive.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_carousel_get_n_pages = Interop.downcallHandle(
        "adw_carousel_get_n_pages",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the number of pages in {@code self}.
     */
    public int getNPages() {
        try {
            var RESULT = (int) adw_carousel_get_n_pages.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_carousel_get_nth_page = Interop.downcallHandle(
        "adw_carousel_get_nth_page",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the page at position @n.
     */
    public org.gtk.gtk.Widget getNthPage(int n) {
        try {
            var RESULT = (MemoryAddress) adw_carousel_get_nth_page.invokeExact(handle(), n);
            return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_carousel_get_position = Interop.downcallHandle(
        "adw_carousel_get_position",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets current scroll position in {@code self}.
     * <p>
     * It's unitless, 1 matches 1 page.
     */
    public double getPosition() {
        try {
            var RESULT = (double) adw_carousel_get_position.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_carousel_get_reveal_duration = Interop.downcallHandle(
        "adw_carousel_get_reveal_duration",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets duration of the animation used when adding or removing pages.
     */
    public int getRevealDuration() {
        try {
            var RESULT = (int) adw_carousel_get_reveal_duration.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_carousel_get_scroll_params = Interop.downcallHandle(
        "adw_carousel_get_scroll_params",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the scroll animation spring parameters for {@code self}.
     */
    public SpringParams getScrollParams() {
        try {
            var RESULT = (MemoryAddress) adw_carousel_get_scroll_params.invokeExact(handle());
            return new SpringParams(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_carousel_get_spacing = Interop.downcallHandle(
        "adw_carousel_get_spacing",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets spacing between pages in pixels.
     */
    public int getSpacing() {
        try {
            var RESULT = (int) adw_carousel_get_spacing.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_carousel_insert = Interop.downcallHandle(
        "adw_carousel_insert",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Inserts {@code child} into {@code self} at position {@code position}.
     * <p>
     * If position is -1, or larger than the number of pages,
     * {@code child} will be appended to the end.
     */
    public void insert(org.gtk.gtk.Widget child, int position) {
        try {
            adw_carousel_insert.invokeExact(handle(), child.handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_carousel_prepend = Interop.downcallHandle(
        "adw_carousel_prepend",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Prepends {@code child} to {@code self}.
     */
    public void prepend(org.gtk.gtk.Widget child) {
        try {
            adw_carousel_prepend.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_carousel_remove = Interop.downcallHandle(
        "adw_carousel_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes {@code child} from {@code self}.
     */
    public void remove(org.gtk.gtk.Widget child) {
        try {
            adw_carousel_remove.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_carousel_reorder = Interop.downcallHandle(
        "adw_carousel_reorder",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Moves {@code child} into position {@code position}.
     * <p>
     * If position is -1, or larger than the number of pages, {@code child} will be moved
     * at the end.
     */
    public void reorder(org.gtk.gtk.Widget child, int position) {
        try {
            adw_carousel_reorder.invokeExact(handle(), child.handle(), position);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_carousel_scroll_to = Interop.downcallHandle(
        "adw_carousel_scroll_to",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Scrolls to {@code widget}.
     * <p>
     * If {@code animate} is {@code TRUE}, the transition will be animated.
     */
    public void scrollTo(org.gtk.gtk.Widget widget, boolean animate) {
        try {
            adw_carousel_scroll_to.invokeExact(handle(), widget.handle(), animate ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_carousel_set_allow_long_swipes = Interop.downcallHandle(
        "adw_carousel_set_allow_long_swipes",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether to allow swiping for more than one page at a time.
     */
    public void setAllowLongSwipes(boolean allowLongSwipes) {
        try {
            adw_carousel_set_allow_long_swipes.invokeExact(handle(), allowLongSwipes ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_carousel_set_allow_mouse_drag = Interop.downcallHandle(
        "adw_carousel_set_allow_mouse_drag",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code self} can be dragged with mouse pointer.
     */
    public void setAllowMouseDrag(boolean allowMouseDrag) {
        try {
            adw_carousel_set_allow_mouse_drag.invokeExact(handle(), allowMouseDrag ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_carousel_set_allow_scroll_wheel = Interop.downcallHandle(
        "adw_carousel_set_allow_scroll_wheel",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code self} will respond to scroll wheel events.
     */
    public void setAllowScrollWheel(boolean allowScrollWheel) {
        try {
            adw_carousel_set_allow_scroll_wheel.invokeExact(handle(), allowScrollWheel ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_carousel_set_interactive = Interop.downcallHandle(
        "adw_carousel_set_interactive",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether {@code self} can be navigated.
     */
    public void setInteractive(boolean interactive) {
        try {
            adw_carousel_set_interactive.invokeExact(handle(), interactive ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_carousel_set_reveal_duration = Interop.downcallHandle(
        "adw_carousel_set_reveal_duration",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets duration of the animation used when adding or removing pages.
     */
    public void setRevealDuration(int revealDuration) {
        try {
            adw_carousel_set_reveal_duration.invokeExact(handle(), revealDuration);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_carousel_set_scroll_params = Interop.downcallHandle(
        "adw_carousel_set_scroll_params",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the scroll animation spring parameters for {@code self}.
     */
    public void setScrollParams(SpringParams params) {
        try {
            adw_carousel_set_scroll_params.invokeExact(handle(), params.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_carousel_set_spacing = Interop.downcallHandle(
        "adw_carousel_set_spacing",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets spacing between pages in pixels.
     */
    public void setSpacing(int spacing) {
        try {
            adw_carousel_set_spacing.invokeExact(handle(), spacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PageChangedHandler {
        void signalReceived(Carousel source, int index);
    }
    
    /**
     * This signal is emitted after a page has been changed.
     * <p>
     * It can be used to implement "infinite scrolling" by amending the pages
     * after every scroll.
     */
    public SignalHandle onPageChanged(PageChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("page-changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Carousel.Callbacks.class, "signalCarouselPageChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalCarouselPageChanged(MemoryAddress source, int index, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (Carousel.PageChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new Carousel(Refcounted.get(source)), index);
        }
        
    }
}