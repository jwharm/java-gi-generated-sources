package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>PangoContext</code> stores global information used to control the
 * itemization process.
 * <p>
 * The information stored by <code>PangoContext</code> includes the fontmap used
 * to look up fonts, and default values such as the default language,
 * default gravity, or default font.
 * <p>
 * To obtain a <code>PangoContext</code>, use {@link org.pango.FontMap#createContext}.
 */
public class Context extends org.gtk.gobject.Object {

    public Context(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Context */
    public static Context castFrom(org.gtk.gobject.Object gobject) {
        return new Context(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.pango_context_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new <code>PangoContext</code> initialized to default values.
     * <p>
     * This function is not particularly useful as it should always
     * be followed by a {@link org.pango.Context#setFontMap} call, and the
     * function {@link org.pango.FontMap#createContext} does these two steps
     * together and hence users are recommended to use that.
     * <p>
     * If you are using Pango as part of a higher-level system,
     * that system may have it&#39;s own way of create a <code>PangoContext</code>.
     * For instance, the GTK toolkit has, among others,<code>gtk_widget_get_pango_context()</code>. Use those instead.
     */
    public Context() {
        super(constructNew());
    }
    
    /**
     * Forces a change in the context, which will cause any <code>PangoLayout</code>
     * using this context to re-layout.
     * 
     * This function is only useful when implementing a new backend
     * for Pango, something applications won&#39;t do. Backends should
     * call this function if they have attached extra data to the context
     * and such data is changed.
     */
    public void changed() {
        gtk_h.pango_context_changed(handle());
    }
    
    /**
     * Retrieves the base direction for the context.
     * 
     * See {@link org.pango.Context#setBaseDir}.
     */
    public Direction getBaseDir() {
        var RESULT = gtk_h.pango_context_get_base_dir(handle());
        return Direction.fromValue(RESULT);
    }
    
    /**
     * Retrieves the base gravity for the context.
     * 
     * See {@link org.pango.Context#setBaseGravity}.
     */
    public Gravity getBaseGravity() {
        var RESULT = gtk_h.pango_context_get_base_gravity(handle());
        return Gravity.fromValue(RESULT);
    }
    
    /**
     * Retrieve the default font description for the context.
     */
    public FontDescription getFontDescription() {
        var RESULT = gtk_h.pango_context_get_font_description(handle());
        return new FontDescription(References.get(RESULT, false));
    }
    
    /**
     * Gets the <code>PangoFontMap</code> used to look up fonts for this context.
     */
    public FontMap getFontMap() {
        var RESULT = gtk_h.pango_context_get_font_map(handle());
        return new FontMap(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the gravity for the context.
     * 
     * This is similar to {@link org.pango.Context#getBaseGravity},
     * except for when the base gravity is {@link org.pango.Gravity#AUTO} for
     * which {@link Pango#Gravity} is used to return the
     * gravity from the current context matrix.
     */
    public Gravity getGravity() {
        var RESULT = gtk_h.pango_context_get_gravity(handle());
        return Gravity.fromValue(RESULT);
    }
    
    /**
     * Retrieves the gravity hint for the context.
     * 
     * See {@link org.pango.Context#setGravityHint} for details.
     */
    public GravityHint getGravityHint() {
        var RESULT = gtk_h.pango_context_get_gravity_hint(handle());
        return GravityHint.fromValue(RESULT);
    }
    
    /**
     * Retrieves the global language tag for the context.
     */
    public Language getLanguage() {
        var RESULT = gtk_h.pango_context_get_language(handle());
        return new Language(References.get(RESULT, true));
    }
    
    /**
     * Gets the transformation matrix that will be applied when
     * rendering with this context.
     * 
     * See {@link org.pango.Context#setMatrix}.
     */
    public Matrix getMatrix() {
        var RESULT = gtk_h.pango_context_get_matrix(handle());
        return new Matrix(References.get(RESULT, false));
    }
    
    /**
     * Get overall metric information for a particular font description.
     * <p>
     * Since the metrics may be substantially different for different scripts,
     * a language tag can be provided to indicate that the metrics should be
     * retrieved that correspond to the script(s) used by that language.
     * <p>
     * The <code>PangoFontDescription</code> is interpreted in the same way as by {@link [func@itemize]},
     * and the family name may be a comma separated list of names. If characters
     * from multiple of these families would be used to render the string, then
     * the returned fonts would be a composite of the metrics for the fonts loaded
     * for the individual families.
     */
    public FontMetrics getMetrics(FontDescription desc, Language language) {
        var RESULT = gtk_h.pango_context_get_metrics(handle(), desc.handle(), language.handle());
        return new FontMetrics(References.get(RESULT, true));
    }
    
    /**
     * Returns whether font rendering with this context should
     * round glyph positions and widths.
     */
    public boolean getRoundGlyphPositions() {
        var RESULT = gtk_h.pango_context_get_round_glyph_positions(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the current serial number of @context.
     * <p>
     * The serial number is initialized to an small number larger than zero
     * when a new context is created and is increased whenever the context
     * is changed using any of the setter functions, or the <code>PangoFontMap</code> it
     * uses to find fonts has changed. The serial may wrap, but will never
     * have the value 0. Since it can wrap, never compare it with &#34;less than&#34;,
     * always use &#34;not equals&#34;.
     * <p>
     * This can be used to automatically detect changes to a <code>PangoContext</code>,
     * and is only useful when implementing objects that need update when their<code>PangoContext</code> changes, like <code>PangoLayout</code>.
     */
    public int getSerial() {
        var RESULT = gtk_h.pango_context_get_serial(handle());
        return RESULT;
    }
    
    /**
     * Loads the font in one of the fontmaps in the context
     * that is the closest match for @desc.
     */
    public Font loadFont(FontDescription desc) {
        var RESULT = gtk_h.pango_context_load_font(handle(), desc.handle());
        return new Font(References.get(RESULT, true));
    }
    
    /**
     * Load a set of fonts in the context that can be used to render
     * a font matching @desc.
     */
    public Fontset loadFontset(FontDescription desc, Language language) {
        var RESULT = gtk_h.pango_context_load_fontset(handle(), desc.handle(), language.handle());
        return new Fontset(References.get(RESULT, true));
    }
    
    /**
     * Sets the base direction for the context.
     * 
     * The base direction is used in applying the Unicode bidirectional
     * algorithm; if the @direction is {@link org.pango.Direction#LTR} or
     * <code>PANGO_DIRECTION_RTL,</code> then the value will be used as the paragraph
     * direction in the Unicode bidirectional algorithm. A value of
     * {@link org.pango.Direction#WEAK_LTR} or {@link org.pango.Direction#WEAK_RTL} is used only
     * for paragraphs that do not contain any strong characters themselves.
     */
    public void setBaseDir(Direction direction) {
        gtk_h.pango_context_set_base_dir(handle(), direction.getValue());
    }
    
    /**
     * Sets the base gravity for the context.
     * 
     * The base gravity is used in laying vertical text out.
     */
    public void setBaseGravity(Gravity gravity) {
        gtk_h.pango_context_set_base_gravity(handle(), gravity.getValue());
    }
    
    /**
     * Set the default font description for the context
     */
    public void setFontDescription(FontDescription desc) {
        gtk_h.pango_context_set_font_description(handle(), desc.handle());
    }
    
    /**
     * Sets the font map to be searched when fonts are looked-up
     * in this context.
     * <p>
     * This is only for internal use by Pango backends, a <code>PangoContext</code>
     * obtained via one of the recommended methods should already have a
     * suitable font map.
     */
    public void setFontMap(FontMap fontMap) {
        gtk_h.pango_context_set_font_map(handle(), fontMap.handle());
    }
    
    /**
     * Sets the gravity hint for the context.
     * 
     * The gravity hint is used in laying vertical text out, and
     * is only relevant if gravity of the context as returned by
     * {@link org.pango.Context#getGravity} is set to <code>PANGO_GRAVITY_EAST
     * or</code> %PANGO_GRAVITY_WEST.
     */
    public void setGravityHint(GravityHint hint) {
        gtk_h.pango_context_set_gravity_hint(handle(), hint.getValue());
    }
    
    /**
     * Sets the global language tag for the context.
     * 
     * The default language for the locale of the running process
     * can be found using {@link Pango#Language}.
     */
    public void setLanguage(Language language) {
        gtk_h.pango_context_set_language(handle(), language.handle());
    }
    
    /**
     * Sets the transformation matrix that will be applied when rendering
     * with this context.
     * 
     * Note that reported metrics are in the user space coordinates before
     * the application of the matrix, not device-space coordinates after the
     * application of the matrix. So, they don&#39;t scale with the matrix, though
     * they may change slightly for different matrices, depending on how the
     * text is fit to the pixel grid.
     */
    public void setMatrix(Matrix matrix) {
        gtk_h.pango_context_set_matrix(handle(), matrix.handle());
    }
    
    /**
     * Sets whether font rendering with this context should
     * round glyph positions and widths to integral positions,
     * in device units.
     * 
     * This is useful when the renderer can&#39;t handle subpixel
     * positioning of glyphs.
     * 
     * The default value is to round glyph positions, to remain
     * compatible with previous Pango behavior.
     */
    public void setRoundGlyphPositions(boolean roundPositions) {
        gtk_h.pango_context_set_round_glyph_positions(handle(), roundPositions ? 1 : 0);
    }
    
}
