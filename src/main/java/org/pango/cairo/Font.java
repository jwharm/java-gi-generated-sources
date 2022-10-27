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
        return new org.cairographics.ScaledFont(Refcounted.get(RESULT, false));
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle pango_cairo_font_get_scaled_font = Interop.downcallHandle(
            "pango_cairo_font_get_scaled_font",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
    
    class FontImpl extends org.gtk.gobject.Object implements Font {
        
        static {
            PangoCairo.javagi$ensureInitialized();
        }
        
        public FontImpl(io.github.jwharm.javagi.Refcounted ref) {
            super(ref);
        }
    }
}
