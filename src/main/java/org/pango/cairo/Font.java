package org.pango.cairo;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code PangoCairoFont} is an interface exported by fonts for
 * use with Cairo.
 * <p>
 * The actual type of the font will depend on the particular
 * font technology Cairo was compiled to use.
 * @version 1.18
 */
public interface Font extends io.github.jwharm.javagi.Proxy {
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FontImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FontImpl(input);
    
    /**
     * Gets the {@code cairo_scaled_font_t} used by {@code font}.
     * The scaled font can be referenced and kept using
     * cairo_scaled_font_reference().
     * @return the {@code cairo_scaled_font_t}
     *   used by {@code font}
     */
    default @Nullable org.cairographics.ScaledFont getScaledFont() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_cairo_font_get_scaled_font.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.cairographics.ScaledFont.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.pango_cairo_font_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle pango_cairo_font_get_scaled_font = Interop.downcallHandle(
                "pango_cairo_font_get_scaled_font",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle pango_cairo_font_get_type = Interop.downcallHandle(
                "pango_cairo_font_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * The FontImpl type represents a native instance of the Font interface.
     */
    class FontImpl extends org.gtk.gobject.GObject implements Font {
        
        static {
            PangoCairo.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of Font for the provided memory address.
         * @param address the memory address of the instance
         */
        public FontImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.pango_cairo_font_get_type != null;
    }
}
