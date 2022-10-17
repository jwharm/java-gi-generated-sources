package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A dots indicator for {@link Carousel}.
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="carousel-indicator-dots-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img src="carousel-indicator-dots.png" alt="carousel-indicator-dots"&gt;
 * &lt;/picture&gt;
 * <p>
 * The {@code AdwCarouselIndicatorDots} widget shows a set of dots for each page of a
 * given {@link Carousel}. The dot representing the carousel's active page is
 * larger and more opaque than the others, the transition to the active and
 * inactive state is gradual to match the carousel's position.
 * <p>
 * See also {@link CarouselIndicatorLines}.
 * 
 * <h2>CSS nodes</h2>
 * {@code AdwCarouselIndicatorDots} has a single CSS node with name
 * {@code carouselindicatordots}.
 */
public class CarouselIndicatorDots extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {

    public CarouselIndicatorDots(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CarouselIndicatorDots */
    public static CarouselIndicatorDots castFrom(org.gtk.gobject.Object gobject) {
        return new CarouselIndicatorDots(gobject.refcounted());
    }
    
    private static final MethodHandle adw_carousel_indicator_dots_new = Interop.downcallHandle(
        "adw_carousel_indicator_dots_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_carousel_indicator_dots_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwCarouselIndicatorDots}.
     */
    public CarouselIndicatorDots() {
        super(constructNew());
    }
    
    private static final MethodHandle adw_carousel_indicator_dots_get_carousel = Interop.downcallHandle(
        "adw_carousel_indicator_dots_get_carousel",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the displayed carousel.
     */
    public @Nullable Carousel getCarousel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) adw_carousel_indicator_dots_get_carousel.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Carousel(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle adw_carousel_indicator_dots_set_carousel = Interop.downcallHandle(
        "adw_carousel_indicator_dots_set_carousel",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the displayed carousel.
     */
    public @NotNull void setCarousel(@Nullable Carousel carousel) {
        try {
            adw_carousel_indicator_dots_set_carousel.invokeExact(handle(), carousel.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
