package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

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
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
 * {@code AdwCarouselIndicatorDots} has a single CSS node with name
 * {@code carouselindicatordots}.
 */
public class CarouselIndicatorDots extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {

    public CarouselIndicatorDots(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CarouselIndicatorDots */
    public static CarouselIndicatorDots castFrom(org.gtk.gobject.Object gobject) {
        return new CarouselIndicatorDots(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.adw_carousel_indicator_dots_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwCarouselIndicatorDots}.
     */
    public CarouselIndicatorDots() {
        super(constructNew());
    }
    
    /**
     * Gets the displayed carousel.
     */
    public Carousel getCarousel() {
        var RESULT = gtk_h.adw_carousel_indicator_dots_get_carousel(handle());
        return new Carousel(References.get(RESULT, false));
    }
    
    /**
     * Sets the displayed carousel.
     */
    public void setCarousel(Carousel carousel) {
        gtk_h.adw_carousel_indicator_dots_set_carousel(handle(), carousel.handle());
    }
    
}
