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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a CarouselIndicatorLines proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected CarouselIndicatorLines(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, CarouselIndicatorLines> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new CarouselIndicatorLines(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_carousel_indicator_lines_new.invokeExact();
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
            RESULT = (MemoryAddress) DowncallHandles.adw_carousel_indicator_lines_get_carousel.invokeExact(handle());
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
            DowncallHandles.adw_carousel_indicator_lines_set_carousel.invokeExact(
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
            RESULT = (long) DowncallHandles.adw_carousel_indicator_lines_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link CarouselIndicatorLines.Builder} object constructs a {@link CarouselIndicatorLines} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link CarouselIndicatorLines.Builder#build()}. 
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
         * Finish building the {@link CarouselIndicatorLines} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CarouselIndicatorLines}.
         * @return A new instance of {@code CarouselIndicatorLines} with the properties 
         *         that were set in the Builder object.
         */
        public CarouselIndicatorLines build() {
            return (CarouselIndicatorLines) org.gtk.gobject.GObject.newWithProperties(
                CarouselIndicatorLines.getType(),
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
        
        private static final MethodHandle adw_carousel_indicator_lines_new = Interop.downcallHandle(
                "adw_carousel_indicator_lines_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_carousel_indicator_lines_get_carousel = Interop.downcallHandle(
                "adw_carousel_indicator_lines_get_carousel",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_carousel_indicator_lines_set_carousel = Interop.downcallHandle(
                "adw_carousel_indicator_lines_set_carousel",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_carousel_indicator_lines_get_type = Interop.downcallHandle(
                "adw_carousel_indicator_lines_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.adw_carousel_indicator_lines_get_type != null;
    }
}
