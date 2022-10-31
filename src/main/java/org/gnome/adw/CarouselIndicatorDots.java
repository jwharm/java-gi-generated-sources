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
 * <p>
 * <strong>CSS nodes</strong><br/>
 * {@code AdwCarouselIndicatorDots} has a single CSS node with name
 * {@code carouselindicatordots}.
 * @version 1.0
 */
public class CarouselIndicatorDots extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Orientable {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwCarouselIndicatorDots";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public CarouselIndicatorDots(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to CarouselIndicatorDots if its GType is a (or inherits from) "AdwCarouselIndicatorDots".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "CarouselIndicatorDots" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwCarouselIndicatorDots", a ClassCastException will be thrown.
     */
    public static CarouselIndicatorDots castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("AdwCarouselIndicatorDots"))) {
            return new CarouselIndicatorDots(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwCarouselIndicatorDots");
        }
    }
    
    private static Refcounted constructNew() {
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.adw_carousel_indicator_dots_new.invokeExact(), false);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @return the displayed carousel
     */
    public @Nullable org.gnome.adw.Carousel getCarousel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_carousel_indicator_dots_get_carousel.invokeExact(
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
            DowncallHandles.adw_carousel_indicator_dots_set_carousel.invokeExact(
                    handle(),
                    (Addressable) (carousel == null ? MemoryAddress.NULL : carousel.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_carousel_indicator_dots_new = Interop.downcallHandle(
            "adw_carousel_indicator_dots_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_carousel_indicator_dots_get_carousel = Interop.downcallHandle(
            "adw_carousel_indicator_dots_get_carousel",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_carousel_indicator_dots_set_carousel = Interop.downcallHandle(
            "adw_carousel_indicator_dots_set_carousel",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
