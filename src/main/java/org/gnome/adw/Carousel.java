package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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
    
    private static Refcounted constructNew() {
        Refcounted RESULT = Refcounted.get(gtk_h.adw_carousel_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwCarousel}.
     */
    public Carousel() {
        super(constructNew());
    }
    
    /**
     * Appends {@code child} to {@code self}.
     */
    public void append(org.gtk.gtk.Widget child) {
        gtk_h.adw_carousel_append(handle(), child.handle());
    }
    
    /**
     * Gets whether to allow swiping for more than one page at a time.
     */
    public boolean getAllowLongSwipes() {
        var RESULT = gtk_h.adw_carousel_get_allow_long_swipes(handle());
        return RESULT != 0;
    }
    
    /**
     * Sets whether {@code self} can be dragged with mouse pointer.
     */
    public boolean getAllowMouseDrag() {
        var RESULT = gtk_h.adw_carousel_get_allow_mouse_drag(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code self} will respond to scroll wheel events.
     */
    public boolean getAllowScrollWheel() {
        var RESULT = gtk_h.adw_carousel_get_allow_scroll_wheel(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets whether {@code self} can be navigated.
     */
    public boolean getInteractive() {
        var RESULT = gtk_h.adw_carousel_get_interactive(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the number of pages in {@code self}.
     */
    public int getNPages() {
        var RESULT = gtk_h.adw_carousel_get_n_pages(handle());
        return RESULT;
    }
    
    /**
     * Gets the page at position @n.
     */
    public org.gtk.gtk.Widget getNthPage(int n) {
        var RESULT = gtk_h.adw_carousel_get_nth_page(handle(), n);
        return new org.gtk.gtk.Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets current scroll position in {@code self}.
     * <p>
     * It's unitless, 1 matches 1 page.
     */
    public double getPosition() {
        var RESULT = gtk_h.adw_carousel_get_position(handle());
        return RESULT;
    }
    
    /**
     * Gets duration of the animation used when adding or removing pages.
     */
    public int getRevealDuration() {
        var RESULT = gtk_h.adw_carousel_get_reveal_duration(handle());
        return RESULT;
    }
    
    /**
     * Gets the scroll animation spring parameters for {@code self}.
     */
    public SpringParams getScrollParams() {
        var RESULT = gtk_h.adw_carousel_get_scroll_params(handle());
        return new SpringParams(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets spacing between pages in pixels.
     */
    public int getSpacing() {
        var RESULT = gtk_h.adw_carousel_get_spacing(handle());
        return RESULT;
    }
    
    /**
     * Inserts {@code child} into {@code self} at position {@code position}.
     * <p>
     * If position is -1, or larger than the number of pages,
     * {@code child} will be appended to the end.
     */
    public void insert(org.gtk.gtk.Widget child, int position) {
        gtk_h.adw_carousel_insert(handle(), child.handle(), position);
    }
    
    /**
     * Prepends {@code child} to {@code self}.
     */
    public void prepend(org.gtk.gtk.Widget child) {
        gtk_h.adw_carousel_prepend(handle(), child.handle());
    }
    
    /**
     * Removes {@code child} from {@code self}.
     */
    public void remove(org.gtk.gtk.Widget child) {
        gtk_h.adw_carousel_remove(handle(), child.handle());
    }
    
    /**
     * Moves {@code child} into position {@code position}.
     * <p>
     * If position is -1, or larger than the number of pages, {@code child} will be moved
     * at the end.
     */
    public void reorder(org.gtk.gtk.Widget child, int position) {
        gtk_h.adw_carousel_reorder(handle(), child.handle(), position);
    }
    
    /**
     * Scrolls to {@code widget}.
     * <p>
     * If {@code animate} is {@code TRUE}, the transition will be animated.
     */
    public void scrollTo(org.gtk.gtk.Widget widget, boolean animate) {
        gtk_h.adw_carousel_scroll_to(handle(), widget.handle(), animate ? 1 : 0);
    }
    
    /**
     * Sets whether to allow swiping for more than one page at a time.
     */
    public void setAllowLongSwipes(boolean allowLongSwipes) {
        gtk_h.adw_carousel_set_allow_long_swipes(handle(), allowLongSwipes ? 1 : 0);
    }
    
    /**
     * Sets whether {@code self} can be dragged with mouse pointer.
     */
    public void setAllowMouseDrag(boolean allowMouseDrag) {
        gtk_h.adw_carousel_set_allow_mouse_drag(handle(), allowMouseDrag ? 1 : 0);
    }
    
    /**
     * Sets whether {@code self} will respond to scroll wheel events.
     */
    public void setAllowScrollWheel(boolean allowScrollWheel) {
        gtk_h.adw_carousel_set_allow_scroll_wheel(handle(), allowScrollWheel ? 1 : 0);
    }
    
    /**
     * Sets whether {@code self} can be navigated.
     */
    public void setInteractive(boolean interactive) {
        gtk_h.adw_carousel_set_interactive(handle(), interactive ? 1 : 0);
    }
    
    /**
     * Sets duration of the animation used when adding or removing pages.
     */
    public void setRevealDuration(int revealDuration) {
        gtk_h.adw_carousel_set_reveal_duration(handle(), revealDuration);
    }
    
    /**
     * Sets the scroll animation spring parameters for {@code self}.
     */
    public void setScrollParams(SpringParams params) {
        gtk_h.adw_carousel_set_scroll_params(handle(), params.handle());
    }
    
    /**
     * Sets spacing between pages in pixels.
     */
    public void setSpacing(int spacing) {
        gtk_h.adw_carousel_set_spacing(handle(), spacing);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("page-changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(Carousel.Callbacks.class, "signalCarouselPageChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
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
