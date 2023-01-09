package org.pango.cairo;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global PangoCairo namespace.
 */
public final class PangoCairo {
    
    static {
        LibLoad.loadLibrary("pangocairo-1.0");
        registerTypes();
    }
    
    @ApiStatus.Internal public static void javagi$ensureInitialized() {}

/**
 * Retrieves any font rendering options previously set with
 * {@link PangoCairo#contextSetFontOptions}.
 * <p>
 * This function does not report options that are derived from
 * the target surface by {@link PangoCairo#updateContext}.
 * @param context a {@code PangoContext}, from a pangocairo font map
 * @return the font options previously set on the
 *   context, or {@code null} if no options have been set. This value is
 *   owned by the context and must not be modified or freed.
 */
public static @Nullable org.cairographics.FontOptions contextGetFontOptions(org.pango.Context context) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.pango_cairo_context_get_font_options.invokeExact(context.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return org.cairographics.FontOptions.fromAddress.marshal(RESULT, null);
}

/**
 * Gets the resolution for the context.
 * <p>
 * See {@link PangoCairo#contextSetResolution}
 * @param context a {@code PangoContext}, from a pangocairo font map
 * @return the resolution in "dots per inch". A negative value will
 *   be returned if no resolution has previously been set.
 */
public static double contextGetResolution(org.pango.Context context) {
    double RESULT;
    try {
        RESULT = (double) DowncallHandles.pango_cairo_context_get_resolution.invokeExact(context.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return RESULT;
}

/**
 * Sets callback function for context to use for rendering attributes
 * of type {@link org.pango.AttrType#SHAPE}.
 * <p>
 * See {@code PangoCairoShapeRendererFunc} for details.
 * <p>
 * Retrieves callback function and associated user data for rendering
 * attributes of type {@link org.pango.AttrType#SHAPE} as set by
 * {@link PangoCairo#contextSetShapeRenderer}, if any.
 * @param context a {@code PangoContext}, from a pangocairo font map
 * @param data Pointer to {@code gpointer} to return user data
 * @return the shape rendering callback
 *   previously set on the context, or {@code null} if no shape rendering callback
 *   have been set.
 */
public static @Nullable org.pango.cairo.ShapeRendererFunc contextGetShapeRenderer(org.pango.Context context, @Nullable java.lang.foreign.MemoryAddress data) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.pango_cairo_context_get_shape_renderer.invokeExact(
                context.handle(),
                (Addressable) (data == null ? MemoryAddress.NULL : (Addressable) data));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    return null /* Unsupported parameter type */;
}

/**
 * Sets the font options used when rendering text with this context.
 * <p>
 * These options override any options that {@link PangoCairo#updateContext}
 * derives from the target surface.
 * @param context a {@code PangoContext}, from a pangocairo font map
 * @param options a {@code cairo_font_options_t}, or {@code null} to unset
 *   any previously set options. A copy is made.
 */
public static void contextSetFontOptions(org.pango.Context context, @Nullable org.cairographics.FontOptions options) {
    try {
        DowncallHandles.pango_cairo_context_set_font_options.invokeExact(
                context.handle(),
                (Addressable) (options == null ? MemoryAddress.NULL : options.handle()));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Sets the resolution for the context.
 * <p>
 * This is a scale factor between points specified in a {@code PangoFontDescription}
 * and Cairo units. The default value is 96, meaning that a 10 point font will
 * be 13 units high. (10 * 96. / 72. = 13.3).
 * @param context a {@code PangoContext}, from a pangocairo font map
 * @param dpi the resolution in "dots per inch". (Physical inches aren't actually
 *   involved; the terminology is conventional.) A 0 or negative value
 *   means to use the resolution from the font map.
 */
public static void contextSetResolution(org.pango.Context context, double dpi) {
    try {
        DowncallHandles.pango_cairo_context_set_resolution.invokeExact(
                context.handle(),
                dpi);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Sets callback function for context to use for rendering attributes
 * of type {@link org.pango.AttrType#SHAPE}.
 * <p>
 * See {@code PangoCairoShapeRendererFunc} for details.
 * @param context a {@code PangoContext}, from a pangocairo font map
 * @param func Callback function for rendering attributes of
 *   type {@link org.pango.AttrType#SHAPE}, or {@code null} to disable shape rendering.
 * @param dnotify Callback that will be called when the
 *   context is freed to release {@code data}
 */
public static void contextSetShapeRenderer(org.pango.Context context, @Nullable org.pango.cairo.ShapeRendererFunc func, @Nullable org.gtk.glib.DestroyNotify dnotify) {
    try {
        DowncallHandles.pango_cairo_context_set_shape_renderer.invokeExact(
                context.handle(),
                (Addressable) (func == null ? MemoryAddress.NULL : (Addressable) func.toCallback()),
                (Addressable) MemoryAddress.NULL,
                (Addressable) (dnotify == null ? MemoryAddress.NULL : (Addressable) dnotify.toCallback()));
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Creates a context object set up to match the current transformation
 * and target surface of the Cairo context.
 * <p>
 * This context can then be
 * used to create a layout using {@link org.pango.Layout#Layout}.
 * <p>
 * This function is a convenience function that creates a context using
 * the default font map, then updates it to {@code cr}. If you just need to
 * create a layout for use with {@code cr} and do not need to access {@code PangoContext}
 * directly, you can use {@link PangoCairo#createLayout} instead.
 * @param cr a Cairo context
 * @return the newly created {@code PangoContext}
 */
public static org.pango.Context createContext(org.cairographics.Context cr) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.pango_cairo_create_context.invokeExact(cr.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = (org.pango.Context) Interop.register(RESULT, org.pango.Context.fromAddress).marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Creates a layout object set up to match the current transformation
 * and target surface of the Cairo context.
 * <p>
 * This layout can then be used for text measurement with functions
 * like {@link org.pango.Layout#getSize} or drawing with functions like
 * {@link PangoCairo#showLayout}. If you change the transformation or target
 * surface for {@code cr}, you need to call {@link PangoCairo#updateLayout}.
 * <p>
 * This function is the most convenient way to use Cairo with Pango,
 * however it is slightly inefficient since it creates a separate
 * {@code PangoContext} object for each layout. This might matter in an
 * application that was laying out large amounts of text.
 * @param cr a Cairo context
 * @return the newly created {@code PangoLayout}
 */
public static org.pango.Layout createLayout(org.cairographics.Context cr) {
    MemoryAddress RESULT;
    try {
        RESULT = (MemoryAddress) DowncallHandles.pango_cairo_create_layout.invokeExact(cr.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
    var OBJECT = (org.pango.Layout) Interop.register(RESULT, org.pango.Layout.fromAddress).marshal(RESULT, null);
    OBJECT.takeOwnership();
    return OBJECT;
}

/**
 * Add a squiggly line to the current path in the specified cairo context that
 * approximately covers the given rectangle in the style of an underline used
 * to indicate a spelling error.
 * <p>
 * The width of the underline is rounded to an integer number of up/down
 * segments and the resulting rectangle is centered in the original rectangle.
 * @param cr a Cairo context
 * @param x The X coordinate of one corner of the rectangle
 * @param y The Y coordinate of one corner of the rectangle
 * @param width Non-negative width of the rectangle
 * @param height Non-negative height of the rectangle
 */
public static void errorUnderlinePath(org.cairographics.Context cr, double x, double y, double width, double height) {
    try {
        DowncallHandles.pango_cairo_error_underline_path.invokeExact(
                cr.handle(),
                x,
                y,
                width,
                height);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
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
public static org.pango.FontMap fontMapGetDefault() {
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
public static org.pango.FontMap fontMapNew() {
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
public static @Nullable org.pango.FontMap fontMapNewForFontType(org.cairographics.FontType fonttype) {
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

/**
 * Adds the glyphs in {@code glyphs} to the current path in the specified
 * cairo context.
 * <p>
 * The origin of the glyphs (the left edge of the baseline)
 * will be at the current point of the cairo context.
 * @param cr a Cairo context
 * @param font a {@code PangoFont} from a {@code PangoCairoFontMap}
 * @param glyphs a {@code PangoGlyphString}
 */
public static void glyphStringPath(org.cairographics.Context cr, org.pango.Font font, org.pango.GlyphString glyphs) {
    try {
        DowncallHandles.pango_cairo_glyph_string_path.invokeExact(
                cr.handle(),
                font.handle(),
                glyphs.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Adds the text in {@code PangoLayoutLine} to the current path in the
 * specified cairo context.
 * <p>
 * The origin of the glyphs (the left edge of the line) will be
 * at the current point of the cairo context.
 * @param cr a Cairo context
 * @param line a {@code PangoLayoutLine}
 */
public static void layoutLinePath(org.cairographics.Context cr, org.pango.LayoutLine line) {
    try {
        DowncallHandles.pango_cairo_layout_line_path.invokeExact(
                cr.handle(),
                line.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Adds the text in a {@code PangoLayout} to the current path in the
 * specified cairo context.
 * <p>
 * The top-left corner of the {@code PangoLayout} will be at the
 * current point of the cairo context.
 * @param cr a Cairo context
 * @param layout a Pango layout
 */
public static void layoutPath(org.cairographics.Context cr, org.pango.Layout layout) {
    try {
        DowncallHandles.pango_cairo_layout_path.invokeExact(
                cr.handle(),
                layout.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Draw a squiggly line in the specified cairo context that approximately
 * covers the given rectangle in the style of an underline used to indicate a
 * spelling error.
 * <p>
 * The width of the underline is rounded to an integer
 * number of up/down segments and the resulting rectangle is centered in the
 * original rectangle.
 * @param cr a Cairo context
 * @param x The X coordinate of one corner of the rectangle
 * @param y The Y coordinate of one corner of the rectangle
 * @param width Non-negative width of the rectangle
 * @param height Non-negative height of the rectangle
 */
public static void showErrorUnderline(org.cairographics.Context cr, double x, double y, double width, double height) {
    try {
        DowncallHandles.pango_cairo_show_error_underline.invokeExact(
                cr.handle(),
                x,
                y,
                width,
                height);
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Draws the glyphs in {@code glyph_item} in the specified cairo context,
 * <p>
 * embedding the text associated with the glyphs in the output if the
 * output format supports it (PDF for example), otherwise it acts
 * similar to {@link PangoCairo#showGlyphString}.
 * <p>
 * The origin of the glyphs (the left edge of the baseline) will
 * be drawn at the current point of the cairo context.
 * <p>
 * Note that {@code text} is the start of the text for layout, which is then
 * indexed by {@code glyph_item->item->offset}.
 * @param cr a Cairo context
 * @param text the UTF-8 text that {@code glyph_item} refers to
 * @param glyphItem a {@code PangoGlyphItem}
 */
public static void showGlyphItem(org.cairographics.Context cr, java.lang.String text, org.pango.GlyphItem glyphItem) {
    try (MemorySession SCOPE = MemorySession.openConfined()) {
        try {
            DowncallHandles.pango_cairo_show_glyph_item.invokeExact(
                    cr.handle(),
                    Marshal.stringToAddress.marshal(text, SCOPE),
                    glyphItem.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
}

/**
 * Draws the glyphs in {@code glyphs} in the specified cairo context.
 * <p>
 * The origin of the glyphs (the left edge of the baseline) will
 * be drawn at the current point of the cairo context.
 * @param cr a Cairo context
 * @param font a {@code PangoFont} from a {@code PangoCairoFontMap}
 * @param glyphs a {@code PangoGlyphString}
 */
public static void showGlyphString(org.cairographics.Context cr, org.pango.Font font, org.pango.GlyphString glyphs) {
    try {
        DowncallHandles.pango_cairo_show_glyph_string.invokeExact(
                cr.handle(),
                font.handle(),
                glyphs.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Draws a {@code PangoLayout} in the specified cairo context.
 * <p>
 * The top-left corner of the {@code PangoLayout} will be drawn
 * at the current point of the cairo context.
 * @param cr a Cairo context
 * @param layout a Pango layout
 */
public static void showLayout(org.cairographics.Context cr, org.pango.Layout layout) {
    try {
        DowncallHandles.pango_cairo_show_layout.invokeExact(
                cr.handle(),
                layout.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Draws a {@code PangoLayoutLine} in the specified cairo context.
 * <p>
 * The origin of the glyphs (the left edge of the line) will
 * be drawn at the current point of the cairo context.
 * @param cr a Cairo context
 * @param line a {@code PangoLayoutLine}
 */
public static void showLayoutLine(org.cairographics.Context cr, org.pango.LayoutLine line) {
    try {
        DowncallHandles.pango_cairo_show_layout_line.invokeExact(
                cr.handle(),
                line.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Updates a {@code PangoContext} previously created for use with Cairo to
 * match the current transformation and target surface of a Cairo
 * context.
 * <p>
 * If any layouts have been created for the context, it's necessary
 * to call {@link org.pango.Layout#contextChanged} on those layouts.
 * @param cr a Cairo context
 * @param context a {@code PangoContext}, from a pangocairo font map
 */
public static void updateContext(org.cairographics.Context cr, org.pango.Context context) {
    try {
        DowncallHandles.pango_cairo_update_context.invokeExact(
                cr.handle(),
                context.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}

/**
 * Updates the private {@code PangoContext} of a {@code PangoLayout} created with
 * {@link PangoCairo#createLayout} to match the current transformation and target
 * surface of a Cairo context.
 * @param cr a Cairo context
 * @param layout a {@code PangoLayout}, from {@link PangoCairo#createLayout}
 */
public static void updateLayout(org.cairographics.Context cr, org.pango.Layout layout) {
    try {
        DowncallHandles.pango_cairo_update_layout.invokeExact(
                cr.handle(),
                layout.handle());
    } catch (Throwable ERR) {
        throw new AssertionError("Unexpected exception occured: ", ERR);
    }
}
    
    private static class DowncallHandles {

private static final MethodHandle pango_cairo_context_get_font_options = Interop.downcallHandle(
        "pango_cairo_context_get_font_options",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle pango_cairo_context_get_resolution = Interop.downcallHandle(
        "pango_cairo_context_get_resolution",
        FunctionDescriptor.of(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle pango_cairo_context_get_shape_renderer = Interop.downcallHandle(
        "pango_cairo_context_get_shape_renderer",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle pango_cairo_context_set_font_options = Interop.downcallHandle(
        "pango_cairo_context_set_font_options",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle pango_cairo_context_set_resolution = Interop.downcallHandle(
        "pango_cairo_context_set_resolution",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE),
        false
);

private static final MethodHandle pango_cairo_context_set_shape_renderer = Interop.downcallHandle(
        "pango_cairo_context_set_shape_renderer",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle pango_cairo_create_context = Interop.downcallHandle(
        "pango_cairo_create_context",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle pango_cairo_create_layout = Interop.downcallHandle(
        "pango_cairo_create_layout",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle pango_cairo_error_underline_path = Interop.downcallHandle(
        "pango_cairo_error_underline_path",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
        false
);

private static final MethodHandle pango_cairo_font_map_get_default = Interop.downcallHandle(
        "pango_cairo_font_map_get_default",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle pango_cairo_font_map_new = Interop.downcallHandle(
        "pango_cairo_font_map_new",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle pango_cairo_font_map_new_for_font_type = Interop.downcallHandle(
        "pango_cairo_font_map_new_for_font_type",
        FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
        false
);

private static final MethodHandle pango_cairo_glyph_string_path = Interop.downcallHandle(
        "pango_cairo_glyph_string_path",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle pango_cairo_layout_line_path = Interop.downcallHandle(
        "pango_cairo_layout_line_path",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle pango_cairo_layout_path = Interop.downcallHandle(
        "pango_cairo_layout_path",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle pango_cairo_show_error_underline = Interop.downcallHandle(
        "pango_cairo_show_error_underline",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
        false
);

private static final MethodHandle pango_cairo_show_glyph_item = Interop.downcallHandle(
        "pango_cairo_show_glyph_item",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle pango_cairo_show_glyph_string = Interop.downcallHandle(
        "pango_cairo_show_glyph_string",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle pango_cairo_show_layout = Interop.downcallHandle(
        "pango_cairo_show_layout",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle pango_cairo_show_layout_line = Interop.downcallHandle(
        "pango_cairo_show_layout_line",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle pango_cairo_update_context = Interop.downcallHandle(
        "pango_cairo_update_context",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);

private static final MethodHandle pango_cairo_update_layout = Interop.downcallHandle(
        "pango_cairo_update_layout",
        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
        false
);
    }
    
    @ApiStatus.Internal
    public static class Callbacks {
    }
    
    private static void registerTypes() {
        if (Font.isAvailable()) Interop.register(Font.getType(), Font.fromAddress);
        if (FontMap.isAvailable()) Interop.register(FontMap.getType(), FontMap.fromAddress);
    }
}
