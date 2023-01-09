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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a CarouselIndicatorDots proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected CarouselIndicatorDots(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, CarouselIndicatorDots> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new CarouselIndicatorDots(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_carousel_indicator_dots_new.invokeExact();
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
        this.refSink();
        this.takeOwnership();
    }
    
    /**
     * Gets the displayed carousel.
     * @return the displayed carousel
     */
    public @Nullable org.gnome.adw.Carousel getCarousel() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_carousel_indicator_dots_get_carousel.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gnome.adw.Carousel) Interop.register(RESULT, org.gnome.adw.Carousel.fromAddress).marshal(RESULT, null);
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_carousel_indicator_dots_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link CarouselIndicatorDots.Builder} object constructs a {@link CarouselIndicatorDots} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link CarouselIndicatorDots.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link CarouselIndicatorDots} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CarouselIndicatorDots}.
         * @return A new instance of {@code CarouselIndicatorDots} with the properties 
         *         that were set in the Builder object.
         */
        public CarouselIndicatorDots build() {
            return (CarouselIndicatorDots) org.gtk.gobject.GObject.newWithProperties(
                CarouselIndicatorDots.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The displayed carousel.
         * @param carousel The value for the {@code carousel} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCarousel(org.gnome.adw.Carousel carousel) {
            names.add("carousel");
            values.add(org.gtk.gobject.Value.create(carousel));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_carousel_indicator_dots_new = Interop.downcallHandle(
                "adw_carousel_indicator_dots_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_carousel_indicator_dots_get_carousel = Interop.downcallHandle(
                "adw_carousel_indicator_dots_get_carousel",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_carousel_indicator_dots_set_carousel = Interop.downcallHandle(
                "adw_carousel_indicator_dots_set_carousel",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_carousel_indicator_dots_get_type = Interop.downcallHandle(
                "adw_carousel_indicator_dots_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.adw_carousel_indicator_dots_get_type != null;
    }
}
