package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `PangoContext` stores global information used to control the
 * itemization process.
 * 
 * The information stored by `PangoContext` includes the fontmap used
 * to look up fonts, and default values such as the default language,
 * default gravity, or default font.
 * 
 * To obtain a `PangoContext`, use [method@Pango.FontMap.create_context].
 */
public class Context extends org.gtk.gobject.Object {

    public Context(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Context */
    public static Context castFrom(org.gtk.gobject.Object gobject) {
        return new Context(gobject.getReference());
    }
    
    /**
     * Creates a new `PangoContext` initialized to default values.
     * 
     * This function is not particularly useful as it should always
     * be followed by a [method@Pango.Context.set_font_map] call, and the
     * function [method@Pango.FontMap.create_context] does these two steps
     * together and hence users are recommended to use that.
     * 
     * If you are using Pango as part of a higher-level system,
     * that system may have it's own way of create a `PangoContext`.
     * For instance, the GTK toolkit has, among others,
     * `gtk_widget_get_pango_context()`. Use those instead.
     */
    public Context() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.pango_context_new(), true));
    }
    
    /**
     * Forces a change in the context, which will cause any `PangoLayout`
     * using this context to re-layout.
     * 
     * This function is only useful when implementing a new backend
     * for Pango, something applications won't do. Backends should
     * call this function if they have attached extra data to the context
     * and such data is changed.
     */
    public void changed() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_context_changed(HANDLE());
    }
    
    /**
     * Retrieves the base direction for the context.
     * 
     * See [method@Pango.Context.set_base_dir].
     */
    public Direction getBaseDir() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_context_get_base_dir(HANDLE());
        return Direction.fromValue(RESULT);
    }
    
    /**
     * Retrieves the base gravity for the context.
     * 
     * See [method@Pango.Context.set_base_gravity].
     */
    public Gravity getBaseGravity() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_context_get_base_gravity(HANDLE());
        return Gravity.fromValue(RESULT);
    }
    
    /**
     * Retrieve the default font description for the context.
     */
    public FontDescription getFontDescription() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_context_get_font_description(HANDLE());
        return new FontDescription(References.get(RESULT, false));
    }
    
    /**
     * Gets the `PangoFontMap` used to look up fonts for this context.
     */
    public FontMap getFontMap() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_context_get_font_map(HANDLE());
        return new FontMap(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the gravity for the context.
     * 
     * This is similar to [method@Pango.Context.get_base_gravity],
     * except for when the base gravity is %PANGO_GRAVITY_AUTO for
     * which [func@Pango.Gravity.get_for_matrix] is used to return the
     * gravity from the current context matrix.
     */
    public Gravity getGravity() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_context_get_gravity(HANDLE());
        return Gravity.fromValue(RESULT);
    }
    
    /**
     * Retrieves the gravity hint for the context.
     * 
     * See [method@Pango.Context.set_gravity_hint] for details.
     */
    public GravityHint getGravityHint() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_context_get_gravity_hint(HANDLE());
        return GravityHint.fromValue(RESULT);
    }
    
    /**
     * Retrieves the global language tag for the context.
     */
    public Language getLanguage() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_context_get_language(HANDLE());
        return new Language(References.get(RESULT, true));
    }
    
    /**
     * Gets the transformation matrix that will be applied when
     * rendering with this context.
     * 
     * See [method@Pango.Context.set_matrix].
     */
    public Matrix getMatrix() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_context_get_matrix(HANDLE());
        return new Matrix(References.get(RESULT, false));
    }
    
    /**
     * Get overall metric information for a particular font description.
     * 
     * Since the metrics may be substantially different for different scripts,
     * a language tag can be provided to indicate that the metrics should be
     * retrieved that correspond to the script(s) used by that language.
     * 
     * The `PangoFontDescription` is interpreted in the same way as by [func@itemize],
     * and the family name may be a comma separated list of names. If characters
     * from multiple of these families would be used to render the string, then
     * the returned fonts would be a composite of the metrics for the fonts loaded
     * for the individual families.
     */
    public FontMetrics getMetrics(FontDescription desc, Language language) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_context_get_metrics(HANDLE(), desc.HANDLE(), language.HANDLE());
        return new FontMetrics(References.get(RESULT, true));
    }
    
    /**
     * Returns whether font rendering with this context should
     * round glyph positions and widths.
     */
    public boolean getRoundGlyphPositions() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_context_get_round_glyph_positions(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the current serial number of @context.
     * 
     * The serial number is initialized to an small number larger than zero
     * when a new context is created and is increased whenever the context
     * is changed using any of the setter functions, or the `PangoFontMap` it
     * uses to find fonts has changed. The serial may wrap, but will never
     * have the value 0. Since it can wrap, never compare it with "less than",
     * always use "not equals".
     * 
     * This can be used to automatically detect changes to a `PangoContext`,
     * and is only useful when implementing objects that need update when their
     * `PangoContext` changes, like `PangoLayout`.
     */
    public int getSerial() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_context_get_serial(HANDLE());
        return RESULT;
    }
    
    /**
     * Loads the font in one of the fontmaps in the context
     * that is the closest match for @desc.
     */
    public Font loadFont(FontDescription desc) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_context_load_font(HANDLE(), desc.HANDLE());
        return new Font(References.get(RESULT, true));
    }
    
    /**
     * Load a set of fonts in the context that can be used to render
     * a font matching @desc.
     */
    public Fontset loadFontset(FontDescription desc, Language language) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_context_load_fontset(HANDLE(), desc.HANDLE(), language.HANDLE());
        return new Fontset(References.get(RESULT, true));
    }
    
    /**
     * Sets the base direction for the context.
     * 
     * The base direction is used in applying the Unicode bidirectional
     * algorithm; if the @direction is %PANGO_DIRECTION_LTR or
     * %PANGO_DIRECTION_RTL, then the value will be used as the paragraph
     * direction in the Unicode bidirectional algorithm. A value of
     * %PANGO_DIRECTION_WEAK_LTR or %PANGO_DIRECTION_WEAK_RTL is used only
     * for paragraphs that do not contain any strong characters themselves.
     */
    public void setBaseDir(Direction direction) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_context_set_base_dir(HANDLE(), direction.getValue());
    }
    
    /**
     * Sets the base gravity for the context.
     * 
     * The base gravity is used in laying vertical text out.
     */
    public void setBaseGravity(Gravity gravity) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_context_set_base_gravity(HANDLE(), gravity.getValue());
    }
    
    /**
     * Set the default font description for the context
     */
    public void setFontDescription(FontDescription desc) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_context_set_font_description(HANDLE(), desc.HANDLE());
    }
    
    /**
     * Sets the font map to be searched when fonts are looked-up
     * in this context.
     * 
     * This is only for internal use by Pango backends, a `PangoContext`
     * obtained via one of the recommended methods should already have a
     * suitable font map.
     */
    public void setFontMap(FontMap fontMap) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_context_set_font_map(HANDLE(), fontMap.HANDLE());
    }
    
    /**
     * Sets the gravity hint for the context.
     * 
     * The gravity hint is used in laying vertical text out, and
     * is only relevant if gravity of the context as returned by
     * [method@Pango.Context.get_gravity] is set to %PANGO_GRAVITY_EAST
     * or %PANGO_GRAVITY_WEST.
     */
    public void setGravityHint(GravityHint hint) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_context_set_gravity_hint(HANDLE(), hint.getValue());
    }
    
    /**
     * Sets the global language tag for the context.
     * 
     * The default language for the locale of the running process
     * can be found using [func@Pango.Language.get_default].
     */
    public void setLanguage(Language language) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_context_set_language(HANDLE(), language.HANDLE());
    }
    
    /**
     * Sets the transformation matrix that will be applied when rendering
     * with this context.
     * 
     * Note that reported metrics are in the user space coordinates before
     * the application of the matrix, not device-space coordinates after the
     * application of the matrix. So, they don't scale with the matrix, though
     * they may change slightly for different matrices, depending on how the
     * text is fit to the pixel grid.
     */
    public void setMatrix(Matrix matrix) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_context_set_matrix(HANDLE(), matrix.HANDLE());
    }
    
    /**
     * Sets whether font rendering with this context should
     * round glyph positions and widths to integral positions,
     * in device units.
     * 
     * This is useful when the renderer can't handle subpixel
     * positioning of glyphs.
     * 
     * The default value is to round glyph positions, to remain
     * compatible with previous Pango behavior.
     */
    public void setRoundGlyphPositions(boolean roundPositions) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_context_set_round_glyph_positions(HANDLE(), roundPositions ? 1 : 0);
    }
    
}
