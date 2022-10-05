package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A lines indicator for {@link Carousel}.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="carousel-indicator-dots-lines.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="carousel-indicator-lines.png" alt="carousel-indicator-lines"&gt;
 * &lt;/picture&gt;
 * <p>
 * The {@code AdwCarouselIndicatorLines} widget shows a set of lines for each page of
 * a given {@link Carousel}. The carousel's active page is shown as another line
 * that moves between them to match the carousel's position.
 * <p>
 * See also {@link CarouselIndicatorDots}.
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
 * {@code AdwCarouselIndicatorLines} has a single CSS node with name
 * {@code carouselindicatorlines}.
 */
public class CarouselIndicatorLines extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {

    public CarouselIndicatorLines(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CarouselIndicatorLines */
    public static CarouselIndicatorLines castFrom(org.gtk.gobject.Object gobject) {
        return new CarouselIndicatorLines(gobject.refcounted());
    }
    
    static final MethodHandle adw_carousel_indicator_lines_new = Interop.downcallHandle(
        "adw_carousel_indicator_lines_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_carousel_indicator_lines_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwCarouselIndicatorLines}.
     */
    public CarouselIndicatorLines() {
        super(constructNew());
    }
    
    static final MethodHandle adw_carousel_indicator_lines_get_carousel = Interop.downcallHandle(
        "adw_carousel_indicator_lines_get_carousel",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the displayed carousel.
     */
    public Carousel getCarousel() {
        try {
            var RESULT = (MemoryAddress) adw_carousel_indicator_lines_get_carousel.invokeExact(handle());
            return new Carousel(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle adw_carousel_indicator_lines_set_carousel = Interop.downcallHandle(
        "adw_carousel_indicator_lines_set_carousel",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the displayed carousel.
     */
    public void setCarousel(Carousel carousel) {
        try {
            adw_carousel_indicator_lines_set_carousel.invokeExact(handle(), carousel.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
