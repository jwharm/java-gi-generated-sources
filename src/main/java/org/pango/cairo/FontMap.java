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
     * Cast object to FontMap if its GType is a (or inherits from) "PangoCairoFontMap".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code FontMap} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "PangoCairoFontMap", a ClassCastException will be thrown.
     */
    public static FontMap castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), FontMap.getType())) {
            return new FontMapImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of PangoCairoFontMap");
        }
    }
    
    /**
     * Create a {@code PangoContext} for the given fontmap.
     * @return the newly created context; free with g_object_unref().
     * @deprecated Use pango_font_map_create_context() instead.
     */
    @Deprecated
    default @NotNull org.pango.Context createContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_cairo_font_map_create_context.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Context(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Gets the type of Cairo font backend that {@code fontmap} uses.
     * @return the {@code cairo_font_type_t} cairo font backend type
     */
    default @NotNull org.cairographics.FontType getFontType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_cairo_font_map_get_font_type.invokeExact(
                    handle());
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
            RESULT = (double) DowncallHandles.pango_cairo_font_map_get_resolution.invokeExact(
                    handle());
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
            DowncallHandles.pango_cairo_font_map_set_default.invokeExact(
                    handle());
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
    public static @NotNull org.gtk.glib.Type getType() {
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
    public static @NotNull org.pango.FontMap getDefault() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_cairo_font_map_get_default.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.FontMap(RESULT, Ownership.NONE);
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
    public static @NotNull org.pango.FontMap new_() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_cairo_font_map_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.FontMap(RESULT, Ownership.FULL);
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
    public static @Nullable org.pango.FontMap newForFontType(@NotNull org.cairographics.FontType fonttype) {
        java.util.Objects.requireNonNull(fonttype, "Parameter 'fonttype' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_cairo_font_map_new_for_font_type.invokeExact(
                    fonttype.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.FontMap(RESULT, Ownership.FULL);
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
    
    class FontMapImpl extends org.gtk.gobject.Object implements FontMap {
        
        static {
            PangoCairo.javagi$ensureInitialized();
        }
        
        public FontMapImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
