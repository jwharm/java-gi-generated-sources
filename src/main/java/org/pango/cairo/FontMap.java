package org.pango.cairo;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@code PangoCairoFontMap} is an interface exported by font maps for
 * use with Cairo.
 * <p>
 * The actual type of the font map will depend on the particular
 * font technology Cairo was compiled to use.
 * @version 1.10
 */
public interface FontMap extends io.github.jwharm.javagi.Proxy {
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, FontMapImpl> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new FontMapImpl(input);
    
    /**
     * Create a {@code PangoContext} for the given fontmap.
     * @return the newly created context; free with g_object_unref().
     * @deprecated Use pango_font_map_create_context() instead.
     */
    @Deprecated
    default org.pango.Context createContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_cairo_font_map_create_context.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.pango.Context) Interop.register(RESULT, org.pango.Context.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the type of Cairo font backend that {@code fontmap} uses.
     * @return the {@code cairo_font_type_t} cairo font backend type
     */
    default org.cairographics.FontType getFontType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_cairo_font_map_get_font_type.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.cairographics.FontType.of(RESULT);
    }
    
    /**
     * Gets the resolution for the fontmap.
     * <p>
     * See {@link FontMap#setResolution}.
     * @return the resolution in "dots per inch"
     */
    default double getResolution() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.pango_cairo_font_map_get_resolution.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Sets a default {@code PangoCairoFontMap} to use with Cairo.
     * <p>
     * This can be used to change the Cairo font backend that the
     * default fontmap uses for example. The old default font map
     * is unreffed and the new font map referenced.
     * <p>
     * Note that since Pango 1.32.6, the default fontmap is per-thread.
     * This function only changes the default fontmap for
     * the current thread. Default fontmaps of existing threads
     * are not changed. Default fontmaps of any new threads will
     * still be created using {@link FontMap#new_}.
     * <p>
     * A value of {@code null} for {@code fontmap} will cause the current default
     * font map to be released and a new default font map to be created
     * on demand, using {@link FontMap#new_}.
     */
    default void setDefault() {
        try {
            DowncallHandles.pango_cairo_font_map_set_default.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the resolution for the fontmap.
     * <p>
     * This is a scale factor between
     * points specified in a {@code PangoFontDescription} and Cairo units. The
     * default value is 96, meaning that a 10 point font will be 13
     * units high. (10 * 96. / 72. = 13.3).
     * @param dpi the resolution in "dots per inch". (Physical inches aren't actually
     *   involved; the terminology is conventional.)
     */
    default void setResolution(double dpi) {
        try {
            DowncallHandles.pango_cairo_font_map_set_resolution.invokeExact(
                    handle(),
                    dpi);
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
            RESULT = (long) DowncallHandles.pango_cairo_font_map_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Gets a default {@code PangoCairoFontMap} to use with Cairo.
     * <p>
     * Note that the type of the returned object will depend on the
     * particular font backend Cairo was compiled to use; you generally
     * should only use the {@code PangoFontMap} and {@code PangoCairoFontMap}
     * interfaces on the returned object.
     * <p>
     * The default Cairo fontmap can be changed by using
     * {@link FontMap#setDefault}. This can be used to
     * change the Cairo font backend that the default fontmap uses
     * for example.
     * <p>
     * Note that since Pango 1.32.6, the default fontmap is per-thread.
     * Each thread gets its own default fontmap. In this way, PangoCairo
     * can be used safely from multiple threads.
     * @return the default PangoCairo fontmap
     *  for the current thread. This object is owned by Pango and must
     *  not be freed.
     */
    public static org.pango.FontMap getDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_cairo_font_map_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.pango.FontMap) Interop.register(RESULT, org.pango.FontMap.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Creates a new {@code PangoCairoFontMap} object.
     * <p>
     * A fontmap is used to cache information about available fonts,
     * and holds certain global parameters such as the resolution.
     * In most cases, you can use {@code func@PangoCairo.font_map_get_default]
     * instead.
     * 
     * Note that the type of the returned object will depend
     * on the particular font backend Cairo was compiled to use;
     * You generally should only use the }PangoFontMap{@code  and
     * }PangoCairoFontMap` interfaces on the returned object.
     * <p>
     * You can override the type of backend returned by using an
     * environment variable {@code PANGOCAIRO_BACKEND}. Supported types,
     * based on your build, are fc (fontconfig), win32, and coretext.
     * If requested type is not available, NULL is returned. Ie.
     * this is only useful for testing, when at least two backends
     * are compiled in.
     * @return the newly allocated {@code PangoFontMap},
     *   which should be freed with g_object_unref().
     */
    public static org.pango.FontMap new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_cairo_font_map_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.pango.FontMap) Interop.register(RESULT, org.pango.FontMap.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Creates a new {@code PangoCairoFontMap} object of the type suitable
     * to be used with cairo font backend of type {@code fonttype}.
     * <p>
     * In most cases one should simply use {@link FontMap#new_}, or
     * in fact in most of those cases, just use {@link FontMap#getDefault}.
     * @param fonttype desired {@link org.cairographics.FontType}
     * @return the newly allocated
     *   {@code PangoFontMap} of suitable type which should be freed with
     *   g_object_unref(), or {@code null} if the requested cairo font backend
     *   is not supported / compiled in.
     */
    public static @Nullable org.pango.FontMap newForFontType(org.cairographics.FontType fonttype) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_cairo_font_map_new_for_font_type.invokeExact(fonttype.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.pango.FontMap) Interop.register(RESULT, org.pango.FontMap.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle pango_cairo_font_map_create_context = Interop.downcallHandle(
                "pango_cairo_font_map_create_context",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle pango_cairo_font_map_get_font_type = Interop.downcallHandle(
                "pango_cairo_font_map_get_font_type",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle pango_cairo_font_map_get_resolution = Interop.downcallHandle(
                "pango_cairo_font_map_get_resolution",
                FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle pango_cairo_font_map_set_default = Interop.downcallHandle(
                "pango_cairo_font_map_set_default",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle pango_cairo_font_map_set_resolution = Interop.downcallHandle(
                "pango_cairo_font_map_set_resolution",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle pango_cairo_font_map_get_type = Interop.downcallHandle(
                "pango_cairo_font_map_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle pango_cairo_font_map_get_default = Interop.downcallHandle(
                "pango_cairo_font_map_get_default",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle pango_cairo_font_map_new = Interop.downcallHandle(
                "pango_cairo_font_map_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        @ApiStatus.Internal
        static final MethodHandle pango_cairo_font_map_new_for_font_type = Interop.downcallHandle(
                "pango_cairo_font_map_new_for_font_type",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
    }
    
    /**
     * The FontMapImpl type represents a native instance of the FontMap interface.
     */
    class FontMapImpl extends org.gtk.gobject.GObject implements FontMap {
        
        static {
            PangoCairo.javagi$ensureInitialized();
        }
        
        /**
         * Creates a new instance of FontMap for the provided memory address.
         * @param address the memory address of the instance
         */
        public FontMapImpl(Addressable address) {
            super(address);
        }
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.pango_cairo_font_map_get_type != null;
    }
}
