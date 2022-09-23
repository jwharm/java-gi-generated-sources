package org.gnome.adw;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
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

    public CarouselIndicatorLines(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CarouselIndicatorLines */
    public static CarouselIndicatorLines castFrom(org.gtk.gobject.Object gobject) {
        return new CarouselIndicatorLines(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.adw_carousel_indicator_lines_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwCarouselIndicatorLines}.
     */
    public CarouselIndicatorLines() {
        super(constructNew());
    }
    
    /**
     * Gets the displayed carousel.
     */
    public Carousel getCarousel() {
        var RESULT = gtk_h.adw_carousel_indicator_lines_get_carousel(handle());
        return new Carousel(References.get(RESULT, false));
    }
    
    /**
     * Sets the displayed carousel.
     */
    public void setCarousel(Carousel carousel) {
        gtk_h.adw_carousel_indicator_lines_set_carousel(handle(), carousel.handle());
    }
    
}
