package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A <code>PangoLayout</code> structure represents an entire paragraph of text.
 * <p>
 * While complete access to the layout capabilities of Pango is provided
 * using the detailed interfaces for itemization and shaping, using
 * that functionality directly involves writing a fairly large amount
 * of code. <code>PangoLayout</code> provides a high-level driver for formatting
 * entire paragraphs of text at once. This includes paragraph-level
 * functionality such as line breaking, justification, alignment and
 * ellipsization.
 * <p>
 * A <code>PangoLayout</code> is initialized with a <code>PangoContext</code>, UTF-8 string
 * and set of attributes for that string. Once that is done, the set of
 * formatted lines can be extracted from the object, the layout can be
 * rendered, and conversion between logical character positions within
 * the layout&<code>#39</code> s text, and the physical position of the resulting glyphs
 * can be made.
 * <p>
 * There are a number of parameters to adjust the formatting of a<code>PangoLayout</code>. The following image shows adjustable parameters
 * (on the left) and font metrics (on the right):
 * <p>
 * &<code>#60</code> picture&<code>#62</code> 
 *   &<code>#60</code> source srcset=&<code>#34</code> layout-dark.png&<code>#34</code>  media=&<code>#34</code> (prefers-color-scheme: dark)&<code>#34</code> &<code>#62</code> 
 *   &<code>#60</code> img alt=&<code>#34</code> Pango Layout Parameters&<code>#34</code>  src=&<code>#34</code> layout-light.png&<code>#34</code> &<code>#62</code> 
 * &<code>#60</code> /picture&<code>#62</code> 
 * <p>
 * The following images demonstrate the effect of alignment and
 * justification on the layout of text:
 * <p>
 * | | |
 * | --- | --- |
 * | !{@link [align=left]}(align-left.png) | !{@link [align=left, justify]}(align-left-justify.png) |
 * | !{@link [align=center]}(align-center.png) | !{@link [align=center, justify]}(align-center-justify.png) |
 * | !{@link [align=right]}(align-right.png) | !{@link [align=right, justify]}(align-right-justify.png) |
 * <p>
 * 
 * It is possible, as well, to ignore the 2-D setup,
 * and simply treat the results of a <code>PangoLayout</code> as a list of lines.
 */
public class Layout extends org.gtk.gobject.Object {

    public Layout(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Layout */
    public static Layout castFrom(org.gtk.gobject.Object gobject) {
        return new Layout(gobject.getReference());
    }
    
    private static Reference constructNew(Context context) {
        Reference RESULT = References.get(gtk_h.pango_layout_new(context.handle()), true);
        return RESULT;
    }
    
    /**
     * Create a new <code>PangoLayout</code> object with attributes initialized to
     * default values for a particular <code>PangoContext</code>.
     */
    public Layout(Context context) {
        super(constructNew(context));
    }
    
    /**
     * Forces recomputation of any state in the <code>PangoLayout</code> that
     * might depend on the layout&<code>#39</code> s context.
     * 
     * This function should be called if you make changes to the context
     * subsequent to creating the layout.
     */
    public void contextChanged() {
        gtk_h.pango_layout_context_changed(handle());
    }
    
    /**
     * Creates a deep copy-by-value of the layout.
     * 
     * The attribute list, tab array, and text from the original layout
     * are all copied by value.
     */
    public Layout copy() {
        var RESULT = gtk_h.pango_layout_copy(handle());
        return new Layout(References.get(RESULT, true));
    }
    
    /**
     * Gets the alignment for the layout: how partial lines are
     * positioned within the horizontal space available.
     */
    public Alignment getAlignment() {
        var RESULT = gtk_h.pango_layout_get_alignment(handle());
        return Alignment.fromValue(RESULT);
    }
    
    /**
     * Gets the attribute list for the layout, if any.
     */
    public AttrList getAttributes() {
        var RESULT = gtk_h.pango_layout_get_attributes(handle());
        return new AttrList(References.get(RESULT, false));
    }
    
    /**
     * Gets whether to calculate the base direction for the layout
     * according to its contents.
     * 
     * See {@link org.pango.Layout<code>#setAutoDir</code> .
     */
    public boolean getAutoDir() {
        var RESULT = gtk_h.pango_layout_get_auto_dir(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the Y position of baseline of the first line in @layout.
     */
    public int getBaseline() {
        var RESULT = gtk_h.pango_layout_get_baseline(handle());
        return RESULT;
    }
    
    /**
     * Given an index within a layout, determines the positions that of the
     * strong and weak cursors if the insertion point is at that index.
     * 
     * This is a variant of {@link org.pango.Layout<code>#getCursorPos</code>  that applies
     * font metric information about caret slope and offset to the positions
     * it returns.
     * 
     * &<code>#60</code> picture&<code>#62</code> 
     *   &<code>#60</code> source srcset=&<code>#34</code> caret-metrics-dark.png&<code>#34</code>  media=&<code>#34</code> (prefers-color-scheme: dark)&<code>#34</code> &<code>#62</code> 
     *   &<code>#60</code> img alt=&<code>#34</code> Caret metrics&<code>#34</code>  src=&<code>#34</code> caret-metrics-light.png&<code>#34</code> &<code>#62</code> 
     * &<code>#60</code> /picture&<code>#62</code>
     */
    public void getCaretPos(int index, Rectangle strongPos, Rectangle weakPos) {
        gtk_h.pango_layout_get_caret_pos(handle(), index, strongPos.handle(), weakPos.handle());
    }
    
    /**
     * Returns the number of Unicode characters in the
     * the text of @layout.
     */
    public int getCharacterCount() {
        var RESULT = gtk_h.pango_layout_get_character_count(handle());
        return RESULT;
    }
    
    /**
     * Retrieves the <code>PangoContext</code> used for this layout.
     */
    public Context getContext() {
        var RESULT = gtk_h.pango_layout_get_context(handle());
        return new Context(References.get(RESULT, false));
    }
    
    /**
     * Given an index within a layout, determines the positions that of the
     * strong and weak cursors if the insertion point is at that index.
     * 
     * The position of each cursor is stored as a zero-width rectangle
     * with the height of the run extents.
     * 
     * &<code>#60</code> picture&<code>#62</code> 
     *   &<code>#60</code> source srcset=&<code>#34</code> cursor-positions-dark.png&<code>#34</code>  media=&<code>#34</code> (prefers-color-scheme: dark)&<code>#34</code> &<code>#62</code> 
     *   &<code>#60</code> img alt=&<code>#34</code> Cursor positions&<code>#34</code>  src=&<code>#34</code> cursor-positions-light.png&<code>#34</code> &<code>#62</code> 
     * &<code>#60</code> /picture&<code>#62</code> 
     * 
     * The strong cursor location is the location where characters of the
     * directionality equal to the base direction of the layout are inserted.
     * The weak cursor location is the location where characters of the
     * directionality opposite to the base direction of the layout are inserted.
     * 
     * The following example shows text with both a strong and a weak cursor.
     * 
     * &<code>#60</code> picture&<code>#62</code> 
     *   &<code>#60</code> source srcset=&<code>#34</code> split-cursor-dark.png&<code>#34</code>  media=&<code>#34</code> (prefers-color-scheme: dark)&<code>#34</code> &<code>#62</code> 
     *   &<code>#60</code> img alt=&<code>#34</code> Strong and weak cursors&<code>#34</code>  src=&<code>#34</code> split-cursor-light.png&<code>#34</code> &<code>#62</code> 
     * &<code>#60</code> /picture&<code>#62</code> 
     * 
     * The strong cursor has a little arrow pointing to the right, the weak
     * cursor to the left. Typing a &<code>#39</code> c&<code>#39</code>  in this situation will insert the
     * character after the &<code>#39</code> b&<code>#39</code> , and typing another Hebrew character, like &<code>#39</code> &<code>#1490</code> &<code>#39</code> ,
     * will insert it at the end.
     */
    public void getCursorPos(int index, Rectangle strongPos, Rectangle weakPos) {
        gtk_h.pango_layout_get_cursor_pos(handle(), index, strongPos.handle(), weakPos.handle());
    }
    
    /**
     * Gets the text direction at the given character position in @layout.
     */
    public Direction getDirection(int index) {
        var RESULT = gtk_h.pango_layout_get_direction(handle(), index);
        return Direction.fromValue(RESULT);
    }
    
    /**
     * Gets the type of ellipsization being performed for @layout.
     * 
     * See {@link org.pango.Layout<code>#setEllipsize</code> .
     * 
     * Use {@link org.pango.Layout<code>#isEllipsized</code>  to query whether any
     * paragraphs were actually ellipsized.
     */
    public EllipsizeMode getEllipsize() {
        var RESULT = gtk_h.pango_layout_get_ellipsize(handle());
        return EllipsizeMode.fromValue(RESULT);
    }
    
    /**
     * Computes the logical and ink extents of @layout.
     * 
     * Logical extents are usually what you want for positioning things. Note
     * that both extents may have non-zero x and y. You may want to use those
     * to offset where you render the layout. Not doing that is a very typical
     * bug that shows up as right-to-left layouts not being correctly positioned
     * in a layout with a set width.
     * 
     * The extents are given in layout coordinates and in Pango units; layout
     * coordinates begin at the top left corner of the layout.
     */
    public void getExtents(Rectangle inkRect, Rectangle logicalRect) {
        gtk_h.pango_layout_get_extents(handle(), inkRect.handle(), logicalRect.handle());
    }
    
    /**
     * Gets the font description for the layout, if any.
     */
    public FontDescription getFontDescription() {
        var RESULT = gtk_h.pango_layout_get_font_description(handle());
        return new FontDescription(References.get(RESULT, false));
    }
    
    /**
     * Gets the height of layout used for ellipsization.
     * 
     * See {@link org.pango.Layout<code>#setHeight</code>  for details.
     */
    public int getHeight() {
        var RESULT = gtk_h.pango_layout_get_height(handle());
        return RESULT;
    }
    
    /**
     * Gets the paragraph indent width in Pango units.
     * 
     * A negative value indicates a hanging indentation.
     */
    public int getIndent() {
        var RESULT = gtk_h.pango_layout_get_indent(handle());
        return RESULT;
    }
    
    /**
     * Returns an iterator to iterate over the visual extents of the layout.
     */
    public LayoutIter getIter() {
        var RESULT = gtk_h.pango_layout_get_iter(handle());
        return new LayoutIter(References.get(RESULT, true));
    }
    
    /**
     * Gets whether each complete line should be stretched to fill the entire
     * width of the layout.
     */
    public boolean getJustify() {
        var RESULT = gtk_h.pango_layout_get_justify(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether the last line should be stretched
     * to fill the entire width of the layout.
     */
    public boolean getJustifyLastLine() {
        var RESULT = gtk_h.pango_layout_get_justify_last_line(handle());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves a particular line from a <code>PangoLayout</code>.
     * 
     * Use the faster {@link org.pango.Layout<code>#getLineReadonly</code>  if you do not
     * plan to modify the contents of the line (glyphs, glyph widths, etc.).
     */
    public LayoutLine getLine(int line) {
        var RESULT = gtk_h.pango_layout_get_line(handle(), line);
        return new LayoutLine(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the count of lines for the @layout.
     */
    public int getLineCount() {
        var RESULT = gtk_h.pango_layout_get_line_count(handle());
        return RESULT;
    }
    
    /**
     * Retrieves a particular line from a <code>PangoLayout</code>.
     * 
     * This is a faster alternative to {@link org.pango.Layout<code>#getLine</code> ,
     * but the user is not expected to modify the contents of the line
     * (glyphs, glyph widths, etc.).
     */
    public LayoutLine getLineReadonly(int line) {
        var RESULT = gtk_h.pango_layout_get_line_readonly(handle(), line);
        return new LayoutLine(References.get(RESULT, false));
    }
    
    /**
     * Gets the line spacing factor of @layout.
     * 
     * See {@link org.pango.Layout<code>#setLineSpacing</code> .
     */
    public float getLineSpacing() {
        var RESULT = gtk_h.pango_layout_get_line_spacing(handle());
        return RESULT;
    }
    
    /**
     * Returns the lines of the @layout as a list.
     * 
     * Use the faster {@link org.pango.Layout<code>#getLinesReadonly</code>  if you do not
     * plan to modify the contents of the lines (glyphs, glyph widths, etc.).
     */
    public org.gtk.glib.SList getLines() {
        var RESULT = gtk_h.pango_layout_get_lines(handle());
        return new org.gtk.glib.SList(References.get(RESULT, false));
    }
    
    /**
     * Returns the lines of the @layout as a list.
     * 
     * This is a faster alternative to {@link org.pango.Layout<code>#getLines</code> ,
     * but the user is not expected to modify the contents of the lines
     * (glyphs, glyph widths, etc.).
     */
    public org.gtk.glib.SList getLinesReadonly() {
        var RESULT = gtk_h.pango_layout_get_lines_readonly(handle());
        return new org.gtk.glib.SList(References.get(RESULT, false));
    }
    
    /**
     * Computes the logical and ink extents of @layout in device units.
     * 
     * This function just calls {@link org.pango.Layout<code>#getExtents</code>  followed by
     * two {@link [func@extents_to_pixels]} calls, rounding @ink_rect and @logical_rect
     * such that the rounded rectangles fully contain the unrounded one (that is,
     * passes them as first argument to {@link Pango<code>#extentsToPixels</code> ).
     */
    public void getPixelExtents(Rectangle inkRect, Rectangle logicalRect) {
        gtk_h.pango_layout_get_pixel_extents(handle(), inkRect.handle(), logicalRect.handle());
    }
    
    /**
     * Returns the current serial number of @layout.
     * <p>
     * The serial number is initialized to an small number larger than zero
     * when a new layout is created and is increased whenever the layout is
     * changed using any of the setter functions, or the <code>PangoContext</code> it
     * uses has changed. The serial may wrap, but will never have the value 0.
     * Since it can wrap, never compare it with &<code>#34</code> less than&<code>#34</code> , always use &<code>#34</code> not equals&<code>#34</code> .
     * <p>
     * This can be used to automatically detect changes to a <code>PangoLayout</code>,
     * and is useful for example to decide whether a layout needs redrawing.
     * To force the serial to be increased, use
     * {@link org.pango.Layout<code>#contextChanged</code> .
     */
    public int getSerial() {
        var RESULT = gtk_h.pango_layout_get_serial(handle());
        return RESULT;
    }
    
    /**
     * Obtains whether @layout is in single paragraph mode.
     * 
     * See {@link org.pango.Layout<code>#setSingleParagraphMode</code> .
     */
    public boolean getSingleParagraphMode() {
        var RESULT = gtk_h.pango_layout_get_single_paragraph_mode(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the amount of spacing between the lines of the layout.
     */
    public int getSpacing() {
        var RESULT = gtk_h.pango_layout_get_spacing(handle());
        return RESULT;
    }
    
    /**
     * Gets the current <code>PangoTabArray</code> used by this layout.
     * <p>
     * If no <code>PangoTabArray</code> has been set, then the default tabs are
     * in use and <code>null</code> is returned. Default tabs are every 8 spaces.
     * 
     * The return value should be freed with {@link org.pango.TabArray<code>#free</code> .
     */
    public TabArray getTabs() {
        var RESULT = gtk_h.pango_layout_get_tabs(handle());
        return new TabArray(References.get(RESULT, true));
    }
    
    /**
     * Gets the text in the layout.
     * 
     * The returned text should not be freed or modified.
     */
    public java.lang.String getText() {
        var RESULT = gtk_h.pango_layout_get_text(handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Counts the number of unknown glyphs in @layout.
     * 
     * This function can be used to determine if there are any fonts
     * available to render all characters in a certain string, or when
     * used in combination with {@link org.pango.AttrType<code>#FALLBACK</code>   to check if a
     * certain font supports all the characters in the string.
     */
    public int getUnknownGlyphsCount() {
        var RESULT = gtk_h.pango_layout_get_unknown_glyphs_count(handle());
        return RESULT;
    }
    
    /**
     * Gets the width to which the lines of the <code>PangoLayout</code> should wrap.
     */
    public int getWidth() {
        var RESULT = gtk_h.pango_layout_get_width(handle());
        return RESULT;
    }
    
    /**
     * Gets the wrap mode for the layout.
     * 
     * Use {@link org.pango.Layout<code>#isWrapped</code>  to query whether
     * any paragraphs were actually wrapped.
     */
    public WrapMode getWrap() {
        var RESULT = gtk_h.pango_layout_get_wrap(handle());
        return WrapMode.fromValue(RESULT);
    }
    
    /**
     * Converts from an index within a <code>PangoLayout</code> to the onscreen position
     * corresponding to the grapheme at that index.
     * <p>
     * The return value is represented as rectangle. Note that <code>pos-&<code>#62</code> x</code> is
     * always the leading edge of the grapheme and <code>pos-&<code>#62</code> x + pos-&<code>#62</code> width</code> the
     * trailing edge of the grapheme. If the directionality of the grapheme
     * is right-to-left, then <code>pos-&<code>#62</code> width</code> will be negative.
     */
    public void indexToPos(int index, Rectangle pos) {
        gtk_h.pango_layout_index_to_pos(handle(), index, pos.handle());
    }
    
    /**
     * Queries whether the layout had to ellipsize any paragraphs.
     * 
     * This returns <code>true</code> if the ellipsization mode for @layout
     * is not {@link org.pango.EllipsizeMode<code>#NONE</code>   a positive width is set on @layout,
     * and there are paragraphs exceeding that width that have to be
     * ellipsized.
     */
    public boolean isEllipsized() {
        var RESULT = gtk_h.pango_layout_is_ellipsized(handle());
        return (RESULT != 0);
    }
    
    /**
     * Queries whether the layout had to wrap any paragraphs.
     * 
     * This returns <code>true</code> if a positive width is set on @layout,
     * ellipsization mode of @layout is set to {@link org.pango.EllipsizeMode<code>#NONE</code>  
     * and there are paragraphs exceeding the layout width that have
     * to be wrapped.
     */
    public boolean isWrapped() {
        var RESULT = gtk_h.pango_layout_is_wrapped(handle());
        return (RESULT != 0);
    }
    
    /**
     * Serializes the @layout for later deserialization via {@link Pango<code>#Layout</code> .
     * 
     * There are no guarantees about the format of the output across different
     * versions of Pango and {@link Pango<code>#Layout</code>  will reject data
     * that it cannot parse.
     * 
     * The intended use of this function is testing, benchmarking and debugging.
     * The format is not meant as a permanent storage format.
     */
    public org.gtk.glib.Bytes serialize(int flags) {
        var RESULT = gtk_h.pango_layout_serialize(handle(), flags);
        return new org.gtk.glib.Bytes(References.get(RESULT, true));
    }
    
    /**
     * Sets the alignment for the layout: how partial lines are
     * positioned within the horizontal space available.
     * 
     * The default alignment is {@link org.pango.Alignment<code>#LEFT</code>
     */
    public void setAlignment(Alignment alignment) {
        gtk_h.pango_layout_set_alignment(handle(), alignment.getValue());
    }
    
    /**
     * Sets the text attributes for a layout object.
     * 
     * References @attrs, so the caller can unref its reference.
     */
    public void setAttributes(AttrList attrs) {
        gtk_h.pango_layout_set_attributes(handle(), attrs.handle());
    }
    
    /**
     * Sets whether to calculate the base direction
     * for the layout according to its contents.
     * <p>
     * When this flag is on (the default), then paragraphs in @layout that
     * begin with strong right-to-left characters (Arabic and Hebrew principally),
     * will have right-to-left layout, paragraphs with letters from other scripts
     * will have left-to-right layout. Paragraphs with only neutral characters
     * get their direction from the surrounding paragraphs.
     * <p>
     * When <code>false</code>  the choice between left-to-right and right-to-left
     * layout is done according to the base direction of the layout&<code>#39</code> s<code>PangoContext</code>. (See {@link org.pango.Context<code>#setBaseDir</code> ).
     * 
     * When the auto-computed direction of a paragraph differs from the
     * base direction of the context, the interpretation of
     * {@link org.pango.Alignment<code>#LEFT</code>  and {@link org.pango.Alignment<code>#RIGHT</code>  are swapped.
     */
    public void setAutoDir(boolean autoDir) {
        gtk_h.pango_layout_set_auto_dir(handle(), autoDir ? 1 : 0);
    }
    
    /**
     * Sets the type of ellipsization being performed for @layout.
     * 
     * Depending on the ellipsization mode @ellipsize text is
     * removed from the start, middle, or end of text so they
     * fit within the width and height of layout set with
     * {@link org.pango.Layout<code>#setWidth</code>  and {@link org.pango.Layout<code>#setHeight</code> .
     * 
     * If the layout contains characters such as newlines that
     * force it to be layed out in multiple paragraphs, then whether
     * each paragraph is ellipsized separately or the entire layout
     * is ellipsized as a whole depends on the set height of the layout.
     * 
     * The default value is {@link org.pango.EllipsizeMode<code>#NONE</code>  
     * 
     * See {@link org.pango.Layout<code>#setHeight</code>  for details.
     */
    public void setEllipsize(EllipsizeMode ellipsize) {
        gtk_h.pango_layout_set_ellipsize(handle(), ellipsize.getValue());
    }
    
    /**
     * Sets the default font description for the layout.
     * 
     * If no font description is set on the layout, the
     * font description from the layout&<code>#39</code> s context is used.
     */
    public void setFontDescription(FontDescription desc) {
        gtk_h.pango_layout_set_font_description(handle(), desc.handle());
    }
    
    /**
     * Sets the height to which the <code>PangoLayout</code> should be ellipsized at.
     * 
     * There are two different behaviors, based on whether @height is positive
     * or negative.
     * 
     * If @height is positive, it will be the maximum height of the layout. Only
     * lines would be shown that would fit, and if there is any text omitted,
     * an ellipsis added. At least one line is included in each paragraph regardless
     * of how small the height value is. A value of zero will render exactly one
     * line for the entire layout.
     * 
     * If @height is negative, it will be the (negative of) maximum number of lines
     * per paragraph. That is, the total number of lines shown may well be more than
     * this value if the layout contains multiple paragraphs of text.
     * The default value of -1 means that the first line of each paragraph is ellipsized.
     * This behavior may be changed in the future to act per layout instead of per
     * paragraph. File a bug against pango at
     * {@link [https://gitlab.gnome.org/gnome/pango]}(https://gitlab.gnome.org/gnome/pango)
     * if your code relies on this behavior.
     * 
     * Height setting only has effect if a positive width is set on
     * @layout and ellipsization mode of @layout is not {@link org.pango.EllipsizeMode<code>#NONE</code>  
     * The behavior is undefined if a height other than -1 is set and
     * ellipsization mode is set to {@link org.pango.EllipsizeMode<code>#NONE</code>   and may change in the
     * future.
     */
    public void setHeight(int height) {
        gtk_h.pango_layout_set_height(handle(), height);
    }
    
    /**
     * Sets the width in Pango units to indent each paragraph.
     * 
     * A negative value of @indent will produce a hanging indentation.
     * That is, the first line will have the full width, and subsequent
     * lines will be indented by the absolute value of @indent.
     * 
     * The indent setting is ignored if layout alignment is set to
     * {@link org.pango.Alignment<code>#CENTER</code>  
     * 
     * The default value is 0.
     */
    public void setIndent(int indent) {
        gtk_h.pango_layout_set_indent(handle(), indent);
    }
    
    /**
     * Sets whether each complete line should be stretched to fill the
     * entire width of the layout.
     * 
     * Stretching is typically done by adding whitespace, but for some scripts
     * (such as Arabic), the justification may be done in more complex ways,
     * like extending the characters.
     * 
     * Note that this setting is not implemented and so is ignored in
     * Pango older than 1.18.
     * 
     * Note that tabs and justification conflict with each other:
     * Justification will move content away from its tab-aligned
     * positions.
     * 
     * The default value is <code>false</code> 
     * 
     * Also see {@link org.pango.Layout<code>#setJustifyLastLine</code> .
     */
    public void setJustify(boolean justify) {
        gtk_h.pango_layout_set_justify(handle(), justify ? 1 : 0);
    }
    
    /**
     * Sets whether the last line should be stretched to fill the
     * entire width of the layout.
     * 
     * This only has an effect if {@link org.pango.Layout<code>#setJustify</code>  has
     * been called as well.
     * 
     * The default value is <code>false</code>
     */
    public void setJustifyLastLine(boolean justify) {
        gtk_h.pango_layout_set_justify_last_line(handle(), justify ? 1 : 0);
    }
    
    /**
     * Sets a factor for line spacing.
     * 
     * Typical values are: 0, 1, 1.5, 2. The default values is 0.
     * 
     * If @factor is non-zero, lines are placed so that
     * 
     *     baseline2 = baseline1 + factor * height2
     * 
     * where height2 is the line height of the second line
     * (as determined by the font(s)). In this case, the spacing
     * set with {@link org.pango.Layout<code>#setSpacing</code>  is ignored.
     * 
     * If @factor is zero (the default), spacing is applied as before.
     * 
     * Note: for semantics that are closer to the CSS line-height
     * property, see {@link Pango<code>#attrLineHeightNew</code> .
     */
    public void setLineSpacing(float factor) {
        gtk_h.pango_layout_set_line_spacing(handle(), factor);
    }
    
    /**
     * Sets the layout text and attribute list from marked-up text.
     * 
     * See {@link [Pango Markup]}(pango_markup.html)).
     * 
     * Replaces the current text and attribute list.
     * 
     * This is the same as {@link org.pango.Layout<code>#setMarkupWithAccel</code> ,
     * but the markup text isn&<code>#39</code> t scanned for accelerators.
     */
    public void setMarkup(java.lang.String markup, int length) {
        gtk_h.pango_layout_set_markup(handle(), Interop.allocateNativeString(markup).handle(), length);
    }
    
    /**
     * Sets the single paragraph mode of @layout.
     * 
     * If @setting is <code>true</code>  do not treat newlines and similar characters
     * as paragraph separators; instead, keep all text in a single paragraph,
     * and display a glyph for paragraph separator characters. Used when
     * you want to allow editing of newlines on a single text line.
     * 
     * The default value is <code>false</code>
     */
    public void setSingleParagraphMode(boolean setting) {
        gtk_h.pango_layout_set_single_paragraph_mode(handle(), setting ? 1 : 0);
    }
    
    /**
     * Sets the amount of spacing in Pango units between
     * the lines of the layout.
     * 
     * When placing lines with spacing, Pango arranges things so that
     * 
     *     line2.top = line1.bottom + spacing
     * 
     * The default value is 0.
     * 
     * Note: Since 1.44, Pango is using the line height (as determined
     * by the font) for placing lines when the line spacing factor is set
     * to a non-zero value with {@link org.pango.Layout<code>#setLineSpacing</code> .
     * In that case, the @spacing set with this function is ignored.
     * 
     * Note: for semantics that are closer to the CSS line-height
     * property, see {@link Pango<code>#attrLineHeightNew</code> .
     */
    public void setSpacing(int spacing) {
        gtk_h.pango_layout_set_spacing(handle(), spacing);
    }
    
    /**
     * Sets the tabs to use for @layout, overriding the default tabs.
     * <p><code>PangoLayout</code> will place content at the next tab position
     * whenever it meets a Tab character (U+0009).
     * 
     * By default, tabs are every 8 spaces. If @tabs is <code>null</code>  the
     * default tabs are reinstated. @tabs is copied into the layout;
     * you must free your copy of @tabs yourself.
     * 
     * Note that tabs and justification conflict with each other:
     * Justification will move content away from its tab-aligned
     * positions. The same is true for alignments other than
     * {@link org.pango.Alignment<code>#LEFT</code>
     */
    public void setTabs(TabArray tabs) {
        gtk_h.pango_layout_set_tabs(handle(), tabs.handle());
    }
    
    /**
     * Sets the text of the layout.
     * 
     * This function validates @text and renders invalid UTF-8
     * with a placeholder glyph.
     * 
     * Note that if you have used {@link org.pango.Layout<code>#setMarkup</code>  or
     * {@link org.pango.Layout<code>#setMarkupWithAccel</code>  on @layout before, you
     * may want to call {@link org.pango.Layout<code>#setAttributes</code>  to clear the
     * attributes set on the layout from the markup as this function does
     * not clear attributes.
     */
    public void setText(java.lang.String text, int length) {
        gtk_h.pango_layout_set_text(handle(), Interop.allocateNativeString(text).handle(), length);
    }
    
    /**
     * Sets the width to which the lines of the <code>PangoLayout</code> should wrap or
     * ellipsized.
     * 
     * The default value is -1: no width set.
     */
    public void setWidth(int width) {
        gtk_h.pango_layout_set_width(handle(), width);
    }
    
    /**
     * Sets the wrap mode.
     * 
     * The wrap mode only has effect if a width is set on the layout
     * with {@link org.pango.Layout<code>#setWidth</code> . To turn off wrapping,
     * set the width to -1.
     * 
     * The default value is {@link org.pango.WrapMode<code>#WORD</code>
     */
    public void setWrap(WrapMode wrap) {
        gtk_h.pango_layout_set_wrap(handle(), wrap.getValue());
    }
    
    /**
     * A convenience method to serialize a layout to a file.
     * 
     * It is equivalent to calling {@link org.pango.Layout<code>#serialize</code> 
     * followed by {@link GLib<code>#fileSetContents</code> .
     * 
     * See those two functions for details on the arguments.
     * 
     * It is mostly intended for use inside a debugger to quickly dump
     * a layout to a file for later inspection.
     */
    public boolean writeToFile(int flags, java.lang.String filename) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.pango_layout_write_to_file(handle(), flags, Interop.allocateNativeString(filename).handle(), GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
    /**
     * Loads data previously created via {@link org.pango.Layout<code>#serialize</code> .
     * 
     * For a discussion of the supported format, see that function.
     * 
     * Note: to verify that the returned layout is identical to
     * the one that was serialized, you can compare @bytes to the
     * result of serializing the layout again.
     */
    public static Layout deserialize(Context context, org.gtk.glib.Bytes bytes, int flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        var RESULT = gtk_h.pango_layout_deserialize(context.handle(), bytes.handle(), flags, GERROR);
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return new Layout(References.get(RESULT, true));
    }
    
}
