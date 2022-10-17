package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code PangoContext} stores global information used to control the
 * itemization process.
 * <p>
 * The information stored by {@code PangoContext} includes the fontmap used
 * to look up fonts, and default values such as the default language,
 * default gravity, or default font.
 * <p>
 * To obtain a {@code PangoContext}, use {@link FontMap#createContext}.
 */
public class Context extends org.gtk.gobject.Object {

    public Context(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Context */
    public static Context castFrom(org.gtk.gobject.Object gobject) {
        return new Context(gobject.refcounted());
    }
    
    private static final MethodHandle pango_context_new = Interop.downcallHandle(
        "pango_context_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) pango_context_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code PangoContext} initialized to default values.
     * <p>
     * This function is not particularly useful as it should always
     * be followed by a {@link Context#setFontMap} call, and the
     * function {@link FontMap#createContext} does these two steps
     * together and hence users are recommended to use that.
     * <p>
     * If you are using Pango as part of a higher-level system,
     * that system may have it's own way of create a {@code PangoContext}.
     * For instance, the GTK toolkit has, among others,
     * {@code gtk_widget_get_pango_context()}. Use those instead.
     */
    public Context() {
        super(constructNew());
    }
    
    private static final MethodHandle pango_context_changed = Interop.downcallHandle(
        "pango_context_changed",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Forces a change in the context, which will cause any {@code PangoLayout}
     * using this context to re-layout.
     * <p>
     * This function is only useful when implementing a new backend
     * for Pango, something applications won't do. Backends should
     * call this function if they have attached extra data to the context
     * and such data is changed.
     */
    public @NotNull void changed() {
        try {
            pango_context_changed.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_context_get_base_dir = Interop.downcallHandle(
        "pango_context_get_base_dir",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the base direction for the context.
     * <p>
     * See {@link Context#setBaseDir}.
     */
    public @NotNull Direction getBaseDir() {
        int RESULT;
        try {
            RESULT = (int) pango_context_get_base_dir.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Direction(RESULT);
    }
    
    private static final MethodHandle pango_context_get_base_gravity = Interop.downcallHandle(
        "pango_context_get_base_gravity",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the base gravity for the context.
     * <p>
     * See {@link Context#setBaseGravity}.
     */
    public @NotNull Gravity getBaseGravity() {
        int RESULT;
        try {
            RESULT = (int) pango_context_get_base_gravity.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Gravity(RESULT);
    }
    
    private static final MethodHandle pango_context_get_font_description = Interop.downcallHandle(
        "pango_context_get_font_description",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieve the default font description for the context.
     */
    public @NotNull FontDescription getFontDescription() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_context_get_font_description.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FontDescription(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle pango_context_get_font_map = Interop.downcallHandle(
        "pango_context_get_font_map",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code PangoFontMap} used to look up fonts for this context.
     */
    public @NotNull FontMap getFontMap() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_context_get_font_map.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FontMap(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle pango_context_get_gravity = Interop.downcallHandle(
        "pango_context_get_gravity",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the gravity for the context.
     * <p>
     * This is similar to {@link Context#getBaseGravity},
     * except for when the base gravity is {@link Gravity#AUTO} for
     * which {@link Pango#Gravity} is used to return the
     * gravity from the current context matrix.
     */
    public @NotNull Gravity getGravity() {
        int RESULT;
        try {
            RESULT = (int) pango_context_get_gravity.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Gravity(RESULT);
    }
    
    private static final MethodHandle pango_context_get_gravity_hint = Interop.downcallHandle(
        "pango_context_get_gravity_hint",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the gravity hint for the context.
     * <p>
     * See {@link Context#setGravityHint} for details.
     */
    public @NotNull GravityHint getGravityHint() {
        int RESULT;
        try {
            RESULT = (int) pango_context_get_gravity_hint.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new GravityHint(RESULT);
    }
    
    private static final MethodHandle pango_context_get_language = Interop.downcallHandle(
        "pango_context_get_language",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the global language tag for the context.
     */
    public @NotNull Language getLanguage() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_context_get_language.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Language(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle pango_context_get_matrix = Interop.downcallHandle(
        "pango_context_get_matrix",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the transformation matrix that will be applied when
     * rendering with this context.
     * <p>
     * See {@link Context#setMatrix}.
     */
    public @Nullable Matrix getMatrix() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_context_get_matrix.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Matrix(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle pango_context_get_metrics = Interop.downcallHandle(
        "pango_context_get_metrics",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get overall metric information for a particular font description.
     * <p>
     * Since the metrics may be substantially different for different scripts,
     * a language tag can be provided to indicate that the metrics should be
     * retrieved that correspond to the script(s) used by that language.
     * <p>
     * The {@code PangoFontDescription} is interpreted in the same way as by {@link itemize#null},
     * and the family name may be a comma separated list of names. If characters
     * from multiple of these families would be used to render the string, then
     * the returned fonts would be a composite of the metrics for the fonts loaded
     * for the individual families.
     */
    public @NotNull FontMetrics getMetrics(@Nullable FontDescription desc, @Nullable Language language) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_context_get_metrics.invokeExact(handle(), desc.handle(), language.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FontMetrics(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle pango_context_get_round_glyph_positions = Interop.downcallHandle(
        "pango_context_get_round_glyph_positions",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether font rendering with this context should
     * round glyph positions and widths.
     */
    public boolean getRoundGlyphPositions() {
        int RESULT;
        try {
            RESULT = (int) pango_context_get_round_glyph_positions.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle pango_context_get_serial = Interop.downcallHandle(
        "pango_context_get_serial",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the current serial number of {@code context}.
     * <p>
     * The serial number is initialized to an small number larger than zero
     * when a new context is created and is increased whenever the context
     * is changed using any of the setter functions, or the {@code PangoFontMap} it
     * uses to find fonts has changed. The serial may wrap, but will never
     * have the value 0. Since it can wrap, never compare it with "less than",
     * always use "not equals".
     * <p>
     * This can be used to automatically detect changes to a {@code PangoContext},
     * and is only useful when implementing objects that need update when their
     * {@code PangoContext} changes, like {@code PangoLayout}.
     */
    public int getSerial() {
        int RESULT;
        try {
            RESULT = (int) pango_context_get_serial.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle pango_context_list_families = Interop.downcallHandle(
        "pango_context_list_families",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * List all families for a context.
     */
    public @NotNull void listFamilies(@NotNull Out<FontFamily[]> families, @NotNull Out<Integer> nFamilies) {
        MemorySegment familiesPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment nFamiliesPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            pango_context_list_families.invokeExact(handle(), (Addressable) familiesPOINTER.address(), (Addressable) nFamiliesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nFamilies.set(nFamiliesPOINTER.get(ValueLayout.JAVA_INT, 0));
        FontFamily[] familiesARRAY = new FontFamily[nFamilies.get().intValue()];
        for (int I = 0; I < nFamilies.get().intValue(); I++) {
            var OBJ = familiesPOINTER.get(ValueLayout.ADDRESS, I);
            familiesARRAY[I] = new FontFamily(Refcounted.get(OBJ, false));
        }
        families.set(familiesARRAY);
    }
    
    private static final MethodHandle pango_context_load_font = Interop.downcallHandle(
        "pango_context_load_font",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Loads the font in one of the fontmaps in the context
     * that is the closest match for {@code desc}.
     */
    public @Nullable Font loadFont(@NotNull FontDescription desc) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_context_load_font.invokeExact(handle(), desc.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Font(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle pango_context_load_fontset = Interop.downcallHandle(
        "pango_context_load_fontset",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Load a set of fonts in the context that can be used to render
     * a font matching {@code desc}.
     */
    public @Nullable Fontset loadFontset(@NotNull FontDescription desc, @NotNull Language language) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) pango_context_load_fontset.invokeExact(handle(), desc.handle(), language.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Fontset(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle pango_context_set_base_dir = Interop.downcallHandle(
        "pango_context_set_base_dir",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the base direction for the context.
     * <p>
     * The base direction is used in applying the Unicode bidirectional
     * algorithm; if the {@code direction} is {@link Direction#LTR} or
     * {@link Direction#RTL}, then the value will be used as the paragraph
     * direction in the Unicode bidirectional algorithm. A value of
     * {@link Direction#WEAK_LTR} or {@link Direction#WEAK_RTL} is used only
     * for paragraphs that do not contain any strong characters themselves.
     */
    public @NotNull void setBaseDir(@NotNull Direction direction) {
        try {
            pango_context_set_base_dir.invokeExact(handle(), direction.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_context_set_base_gravity = Interop.downcallHandle(
        "pango_context_set_base_gravity",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the base gravity for the context.
     * <p>
     * The base gravity is used in laying vertical text out.
     */
    public @NotNull void setBaseGravity(@NotNull Gravity gravity) {
        try {
            pango_context_set_base_gravity.invokeExact(handle(), gravity.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_context_set_font_description = Interop.downcallHandle(
        "pango_context_set_font_description",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Set the default font description for the context
     */
    public @NotNull void setFontDescription(@NotNull FontDescription desc) {
        try {
            pango_context_set_font_description.invokeExact(handle(), desc.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_context_set_font_map = Interop.downcallHandle(
        "pango_context_set_font_map",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the font map to be searched when fonts are looked-up
     * in this context.
     * <p>
     * This is only for internal use by Pango backends, a {@code PangoContext}
     * obtained via one of the recommended methods should already have a
     * suitable font map.
     */
    public @NotNull void setFontMap(@NotNull FontMap fontMap) {
        try {
            pango_context_set_font_map.invokeExact(handle(), fontMap.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_context_set_gravity_hint = Interop.downcallHandle(
        "pango_context_set_gravity_hint",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the gravity hint for the context.
     * <p>
     * The gravity hint is used in laying vertical text out, and
     * is only relevant if gravity of the context as returned by
     * {@link Context#getGravity} is set to {@link Gravity#EAST}
     * or {@link Gravity#WEST}.
     */
    public @NotNull void setGravityHint(@NotNull GravityHint hint) {
        try {
            pango_context_set_gravity_hint.invokeExact(handle(), hint.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_context_set_language = Interop.downcallHandle(
        "pango_context_set_language",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the global language tag for the context.
     * <p>
     * The default language for the locale of the running process
     * can be found using {@link Pango#Language}.
     */
    public @NotNull void setLanguage(@NotNull Language language) {
        try {
            pango_context_set_language.invokeExact(handle(), language.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_context_set_matrix = Interop.downcallHandle(
        "pango_context_set_matrix",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the transformation matrix that will be applied when rendering
     * with this context.
     * <p>
     * Note that reported metrics are in the user space coordinates before
     * the application of the matrix, not device-space coordinates after the
     * application of the matrix. So, they don't scale with the matrix, though
     * they may change slightly for different matrices, depending on how the
     * text is fit to the pixel grid.
     */
    public @NotNull void setMatrix(@Nullable Matrix matrix) {
        try {
            pango_context_set_matrix.invokeExact(handle(), matrix.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle pango_context_set_round_glyph_positions = Interop.downcallHandle(
        "pango_context_set_round_glyph_positions",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether font rendering with this context should
     * round glyph positions and widths to integral positions,
     * in device units.
     * <p>
     * This is useful when the renderer can't handle subpixel
     * positioning of glyphs.
     * <p>
     * The default value is to round glyph positions, to remain
     * compatible with previous Pango behavior.
     */
    public @NotNull void setRoundGlyphPositions(@NotNull boolean roundPositions) {
        try {
            pango_context_set_round_glyph_positions.invokeExact(handle(), roundPositions ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
