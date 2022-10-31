package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * <strong>CSS nodes</strong><br/>
 * {@code AdwCarouselIndicatorLines} has a single CSS node with name
 * {@code carouselindicatorlines}.
 * @version 1.0
 */
public class CarouselIndicatorLines extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwCarouselIndicatorLines";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public CarouselIndicatorLines(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to CarouselIndicatorLines if its GType is a (or inherits from) "AdwCarouselIndicatorLines".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "CarouselIndicatorLines" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwCarouselIndicatorLines", a ClassCastException will be thrown.
     */
    public static CarouselIndicatorLines castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("AdwCarouselIndicatorLines"))) {
            return new CarouselIndicatorLines(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwCarouselIndicatorLines");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.adw_carousel_indicator_lines_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @return the displayed carousel
     */
    public @Nullable org.gnome.adw.Carousel getCarousel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_carousel_indicator_lines_get_carousel.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gnome.adw.Carousel(Refcounted.get(RESULT, false));
    }
    
    /**
     * Sets the displayed carousel.
     * @param carousel a carousel
     */
    public void setCarousel(@Nullable org.gnome.adw.Carousel carousel) {
        try {
            DowncallHandles.adw_carousel_indicator_lines_set_carousel.invokeExact(
                    handle(),
                    (Addressable) (carousel == null ? MemoryAddress.NULL : carousel.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_carousel_indicator_lines_new = Interop.downcallHandle(
            "adw_carousel_indicator_lines_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_carousel_indicator_lines_get_carousel = Interop.downcallHandle(
            "adw_carousel_indicator_lines_get_carousel",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_carousel_indicator_lines_set_carousel = Interop.downcallHandle(
            "adw_carousel_indicator_lines_set_carousel",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
