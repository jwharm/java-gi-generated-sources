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
     * Cast object to Font if its GType is a (or inherits from) "PangoCairoFont".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "Font" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "PangoCairoFont", a ClassCastException will be thrown.
     */
    public static Font castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("PangoCairoFont"))) {
            return new FontImpl(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of PangoCairoFont");
        }
    }
    
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
            RESULT = (MemoryAddress) DowncallHandles.pango_cairo_font_get_scaled_font.invokeExact(
                    handle());
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
