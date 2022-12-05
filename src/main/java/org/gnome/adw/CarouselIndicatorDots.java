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
     * <p>
     * Because CarouselIndicatorDots is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CarouselIndicatorDots(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to CarouselIndicatorDots if its GType is a (or inherits from) "AdwCarouselIndicatorDots".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code CarouselIndicatorDots} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwCarouselIndicatorDots", a ClassCastException will be thrown.
     */
    public static CarouselIndicatorDots castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), CarouselIndicatorDots.getType())) {
            return new CarouselIndicatorDots(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwCarouselIndicatorDots");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
        super(constructNew(), Ownership.NONE);
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
        return new org.gnome.adw.Carousel(RESULT, Ownership.NONE);
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
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_carousel_indicator_dots_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Widget.Build {
        
         /**
         * A {@link CarouselIndicatorDots.Build} object constructs a {@link CarouselIndicatorDots} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link CarouselIndicatorDots} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CarouselIndicatorDots} using {@link CarouselIndicatorDots#castFrom}.
         * @return A new instance of {@code CarouselIndicatorDots} with the properties 
         *         that were set in the Build object.
         */
        public CarouselIndicatorDots construct() {
            return CarouselIndicatorDots.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    CarouselIndicatorDots.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The displayed carousel.
         * @param carousel The value for the {@code carousel} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setCarousel(org.gnome.adw.Carousel carousel) {
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
}
