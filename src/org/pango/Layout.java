package org.pango;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `PangoLayout` structure represents an entire paragraph of text.
 * 
 * While complete access to the layout capabilities of Pango is provided
 * using the detailed interfaces for itemization and shaping, using
 * that functionality directly involves writing a fairly large amount
 * of code. `PangoLayout` provides a high-level driver for formatting
 * entire paragraphs of text at once. This includes paragraph-level
 * functionality such as line breaking, justification, alignment and
 * ellipsization.
 * 
 * A `PangoLayout` is initialized with a `PangoContext`, UTF-8 string
 * and set of attributes for that string. Once that is done, the set of
 * formatted lines can be extracted from the object, the layout can be
 * rendered, and conversion between logical character positions within
 * the layout's text, and the physical position of the resulting glyphs
 * can be made.
 * 
 * There are a number of parameters to adjust the formatting of a
 * `PangoLayout`. The following image shows adjustable parameters
 * (on the left) and font metrics (on the right):
 * 
 * <picture>
 *   <source srcset="layout-dark.png" media="(prefers-color-scheme: dark)">
 *   <img alt="Pango Layout Parameters" src="layout-light.png">
 * </picture>
 * 
 * The following images demonstrate the effect of alignment and
 * justification on the layout of text:
 * 
 * | | |
 * | --- | --- |
 * | ![align=left](align-left.png) | ![align=left, justify](align-left-justify.png) |
 * | ![align=center](align-center.png) | ![align=center, justify](align-center-justify.png) |
 * | ![align=right](align-right.png) | ![align=right, justify](align-right-justify.png) |
 * 
 * 
 * It is possible, as well, to ignore the 2-D setup,
 * and simply treat the results of a `PangoLayout` as a list of lines.
 */
public class Layout extends org.gtk.gobject.Object {

    public Layout(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to Layout */
    public static Layout castFrom(org.gtk.gobject.Object gobject) {
        return new Layout(gobject.getReference());
    }
    
    /**
     * Create a new `PangoLayout` object with attributes initialized to
     * default values for a particular `PangoContext`.
     */
    public Layout(Context context) {
        super(References.get(io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_new(context.HANDLE()), true));
    }
    
    /**
     * Forces recomputation of any state in the `PangoLayout` that
     * might depend on the layout's context.
     * 
     * This function should be called if you make changes to the context
     * subsequent to creating the layout.
     */
    public void contextChanged() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_context_changed(HANDLE());
    }
    
    /**
     * Creates a deep copy-by-value of the layout.
     * 
     * The attribute list, tab array, and text from the original layout
     * are all copied by value.
     */
    public Layout copy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_copy(HANDLE());
        return new Layout(References.get(RESULT, true));
    }
    
    /**
     * Gets the alignment for the layout: how partial lines are
     * positioned within the horizontal space available.
     */
    public Alignment getAlignment() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_alignment(HANDLE());
        return Alignment.fromValue(RESULT);
    }
    
    /**
     * Gets the attribute list for the layout, if any.
     */
    public AttrList getAttributes() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_attributes(HANDLE());
        return new AttrList(References.get(RESULT, false));
    }
    
    /**
     * Gets whether to calculate the base direction for the layout
     * according to its contents.
     * 
     * See [method@Pango.Layout.set_auto_dir].
     */
    public boolean getAutoDir() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_auto_dir(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the Y position of baseline of the first line in @layout.
     */
    public int getBaseline() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_baseline(HANDLE());
        return RESULT;
    }
    
    /**
     * Given an index within a layout, determines the positions that of the
     * strong and weak cursors if the insertion point is at that index.
     * 
     * This is a variant of [method@Pango.Layout.get_cursor_pos] that applies
     * font metric information about caret slope and offset to the positions
     * it returns.
     * 
     * <picture>
     *   <source srcset="caret-metrics-dark.png" media="(prefers-color-scheme: dark)">
     *   <img alt="Caret metrics" src="caret-metrics-light.png">
     * </picture>
     */
    public void getCaretPos(int index, Rectangle strongPos, Rectangle weakPos) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_caret_pos(HANDLE(), index, strongPos.HANDLE(), weakPos.HANDLE());
    }
    
    /**
     * Returns the number of Unicode characters in the
     * the text of @layout.
     */
    public int getCharacterCount() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_character_count(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves the `PangoContext` used for this layout.
     */
    public Context getContext() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_context(HANDLE());
        return new Context(References.get(RESULT, false));
    }
    
    /**
     * Given an index within a layout, determines the positions that of the
     * strong and weak cursors if the insertion point is at that index.
     * 
     * The position of each cursor is stored as a zero-width rectangle
     * with the height of the run extents.
     * 
     * <picture>
     *   <source srcset="cursor-positions-dark.png" media="(prefers-color-scheme: dark)">
     *   <img alt="Cursor positions" src="cursor-positions-light.png">
     * </picture>
     * 
     * The strong cursor location is the location where characters of the
     * directionality equal to the base direction of the layout are inserted.
     * The weak cursor location is the location where characters of the
     * directionality opposite to the base direction of the layout are inserted.
     * 
     * The following example shows text with both a strong and a weak cursor.
     * 
     * <picture>
     *   <source srcset="split-cursor-dark.png" media="(prefers-color-scheme: dark)">
     *   <img alt="Strong and weak cursors" src="split-cursor-light.png">
     * </picture>
     * 
     * The strong cursor has a little arrow pointing to the right, the weak
     * cursor to the left. Typing a 'c' in this situation will insert the
     * character after the 'b', and typing another Hebrew character, like 'ג',
     * will insert it at the end.
     */
    public void getCursorPos(int index, Rectangle strongPos, Rectangle weakPos) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_cursor_pos(HANDLE(), index, strongPos.HANDLE(), weakPos.HANDLE());
    }
    
    /**
     * Gets the text direction at the given character position in @layout.
     */
    public Direction getDirection(int index) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_direction(HANDLE(), index);
        return Direction.fromValue(RESULT);
    }
    
    /**
     * Gets the type of ellipsization being performed for @layout.
     * 
     * See [method@Pango.Layout.set_ellipsize].
     * 
     * Use [method@Pango.Layout.is_ellipsized] to query whether any
     * paragraphs were actually ellipsized.
     */
    public EllipsizeMode getEllipsize() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_ellipsize(HANDLE());
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_extents(HANDLE(), inkRect.HANDLE(), logicalRect.HANDLE());
    }
    
    /**
     * Gets the font description for the layout, if any.
     */
    public FontDescription getFontDescription() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_font_description(HANDLE());
        return new FontDescription(References.get(RESULT, false));
    }
    
    /**
     * Gets the height of layout used for ellipsization.
     * 
     * See [method@Pango.Layout.set_height] for details.
     */
    public int getHeight() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_height(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the paragraph indent width in Pango units.
     * 
     * A negative value indicates a hanging indentation.
     */
    public int getIndent() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_indent(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns an iterator to iterate over the visual extents of the layout.
     */
    public LayoutIter getIter() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_iter(HANDLE());
        return new LayoutIter(References.get(RESULT, true));
    }
    
    /**
     * Gets whether each complete line should be stretched to fill the entire
     * width of the layout.
     */
    public boolean getJustify() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_justify(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether the last line should be stretched
     * to fill the entire width of the layout.
     */
    public boolean getJustifyLastLine() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_justify_last_line(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Retrieves a particular line from a `PangoLayout`.
     * 
     * Use the faster [method@Pango.Layout.get_line_readonly] if you do not
     * plan to modify the contents of the line (glyphs, glyph widths, etc.).
     */
    public LayoutLine getLine(int line) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_line(HANDLE(), line);
        return new LayoutLine(References.get(RESULT, false));
    }
    
    /**
     * Retrieves the count of lines for the @layout.
     */
    public int getLineCount() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_line_count(HANDLE());
        return RESULT;
    }
    
    /**
     * Retrieves a particular line from a `PangoLayout`.
     * 
     * This is a faster alternative to [method@Pango.Layout.get_line],
     * but the user is not expected to modify the contents of the line
     * (glyphs, glyph widths, etc.).
     */
    public LayoutLine getLineReadonly(int line) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_line_readonly(HANDLE(), line);
        return new LayoutLine(References.get(RESULT, false));
    }
    
    /**
     * Gets the line spacing factor of @layout.
     * 
     * See [method@Pango.Layout.set_line_spacing].
     */
    public float getLineSpacing() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_line_spacing(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the lines of the @layout as a list.
     * 
     * Use the faster [method@Pango.Layout.get_lines_readonly] if you do not
     * plan to modify the contents of the lines (glyphs, glyph widths, etc.).
     */
    public org.gtk.glib.SList getLines() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_lines(HANDLE());
        return new org.gtk.glib.SList(References.get(RESULT, false));
    }
    
    /**
     * Returns the lines of the @layout as a list.
     * 
     * This is a faster alternative to [method@Pango.Layout.get_lines],
     * but the user is not expected to modify the contents of the lines
     * (glyphs, glyph widths, etc.).
     */
    public org.gtk.glib.SList getLinesReadonly() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_lines_readonly(HANDLE());
        return new org.gtk.glib.SList(References.get(RESULT, false));
    }
    
    /**
     * Computes the logical and ink extents of @layout in device units.
     * 
     * This function just calls [method@Pango.Layout.get_extents] followed by
     * two [func@extents_to_pixels] calls, rounding @ink_rect and @logical_rect
     * such that the rounded rectangles fully contain the unrounded one (that is,
     * passes them as first argument to [func@Pango.extents_to_pixels]).
     */
    public void getPixelExtents(Rectangle inkRect, Rectangle logicalRect) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_pixel_extents(HANDLE(), inkRect.HANDLE(), logicalRect.HANDLE());
    }
    
    /**
     * Returns the current serial number of @layout.
     * 
     * The serial number is initialized to an small number larger than zero
     * when a new layout is created and is increased whenever the layout is
     * changed using any of the setter functions, or the `PangoContext` it
     * uses has changed. The serial may wrap, but will never have the value 0.
     * Since it can wrap, never compare it with "less than", always use "not equals".
     * 
     * This can be used to automatically detect changes to a `PangoLayout`,
     * and is useful for example to decide whether a layout needs redrawing.
     * To force the serial to be increased, use
     * [method@Pango.Layout.context_changed].
     */
    public int getSerial() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_serial(HANDLE());
        return RESULT;
    }
    
    /**
     * Obtains whether @layout is in single paragraph mode.
     * 
     * See [method@Pango.Layout.set_single_paragraph_mode].
     */
    public boolean getSingleParagraphMode() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_single_paragraph_mode(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the amount of spacing between the lines of the layout.
     */
    public int getSpacing() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_spacing(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the current `PangoTabArray` used by this layout.
     * 
     * If no `PangoTabArray` has been set, then the default tabs are
     * in use and %NULL is returned. Default tabs are every 8 spaces.
     * 
     * The return value should be freed with [method@Pango.TabArray.free].
     */
    public TabArray getTabs() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_tabs(HANDLE());
        return new TabArray(References.get(RESULT, true));
    }
    
    /**
     * Gets the text in the layout.
     * 
     * The returned text should not be freed or modified.
     */
    public java.lang.String getText() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_text(HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Counts the number of unknown glyphs in @layout.
     * 
     * This function can be used to determine if there are any fonts
     * available to render all characters in a certain string, or when
     * used in combination with %PANGO_ATTR_FALLBACK, to check if a
     * certain font supports all the characters in the string.
     */
    public int getUnknownGlyphsCount() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_unknown_glyphs_count(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the width to which the lines of the `PangoLayout` should wrap.
     */
    public int getWidth() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_width(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets the wrap mode for the layout.
     * 
     * Use [method@Pango.Layout.is_wrapped] to query whether
     * any paragraphs were actually wrapped.
     */
    public WrapMode getWrap() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_get_wrap(HANDLE());
        return WrapMode.fromValue(RESULT);
    }
    
    /**
     * Converts from an index within a `PangoLayout` to the onscreen position
     * corresponding to the grapheme at that index.
     * 
     * The return value is represented as rectangle. Note that `pos->x` is
     * always the leading edge of the grapheme and `pos->x + pos->width` the
     * trailing edge of the grapheme. If the directionality of the grapheme
     * is right-to-left, then `pos->width` will be negative.
     */
    public void indexToPos(int index, Rectangle pos) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_index_to_pos(HANDLE(), index, pos.HANDLE());
    }
    
    /**
     * Queries whether the layout had to ellipsize any paragraphs.
     * 
     * This returns %TRUE if the ellipsization mode for @layout
     * is not %PANGO_ELLIPSIZE_NONE, a positive width is set on @layout,
     * and there are paragraphs exceeding that width that have to be
     * ellipsized.
     */
    public boolean isEllipsized() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_is_ellipsized(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Queries whether the layout had to wrap any paragraphs.
     * 
     * This returns %TRUE if a positive width is set on @layout,
     * ellipsization mode of @layout is set to %PANGO_ELLIPSIZE_NONE,
     * and there are paragraphs exceeding the layout width that have
     * to be wrapped.
     */
    public boolean isWrapped() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_is_wrapped(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Serializes the @layout for later deserialization via [func@Pango.Layout.deserialize].
     * 
     * There are no guarantees about the format of the output across different
     * versions of Pango and [func@Pango.Layout.deserialize] will reject data
     * that it cannot parse.
     * 
     * The intended use of this function is testing, benchmarking and debugging.
     * The format is not meant as a permanent storage format.
     */
    public org.gtk.glib.Bytes serialize(int flags) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_serialize(HANDLE(), flags);
        return new org.gtk.glib.Bytes(References.get(RESULT, true));
    }
    
    /**
     * Sets the alignment for the layout: how partial lines are
     * positioned within the horizontal space available.
     * 
     * The default alignment is %PANGO_ALIGN_LEFT.
     */
    public void setAlignment(Alignment alignment) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_set_alignment(HANDLE(), alignment.getValue());
    }
    
    /**
     * Sets the text attributes for a layout object.
     * 
     * References @attrs, so the caller can unref its reference.
     */
    public void setAttributes(AttrList attrs) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_set_attributes(HANDLE(), attrs.HANDLE());
    }
    
    /**
     * Sets whether to calculate the base direction
     * for the layout according to its contents.
     * 
     * When this flag is on (the default), then paragraphs in @layout that
     * begin with strong right-to-left characters (Arabic and Hebrew principally),
     * will have right-to-left layout, paragraphs with letters from other scripts
     * will have left-to-right layout. Paragraphs with only neutral characters
     * get their direction from the surrounding paragraphs.
     * 
     * When %FALSE, the choice between left-to-right and right-to-left
     * layout is done according to the base direction of the layout's
     * `PangoContext`. (See [method@Pango.Context.set_base_dir]).
     * 
     * When the auto-computed direction of a paragraph differs from the
     * base direction of the context, the interpretation of
     * %PANGO_ALIGN_LEFT and %PANGO_ALIGN_RIGHT are swapped.
     */
    public void setAutoDir(boolean autoDir) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_set_auto_dir(HANDLE(), autoDir ? 1 : 0);
    }
    
    /**
     * Sets the type of ellipsization being performed for @layout.
     * 
     * Depending on the ellipsization mode @ellipsize text is
     * removed from the start, middle, or end of text so they
     * fit within the width and height of layout set with
     * [method@Pango.Layout.set_width] and [method@Pango.Layout.set_height].
     * 
     * If the layout contains characters such as newlines that
     * force it to be layed out in multiple paragraphs, then whether
     * each paragraph is ellipsized separately or the entire layout
     * is ellipsized as a whole depends on the set height of the layout.
     * 
     * The default value is %PANGO_ELLIPSIZE_NONE.
     * 
     * See [method@Pango.Layout.set_height] for details.
     */
    public void setEllipsize(EllipsizeMode ellipsize) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_set_ellipsize(HANDLE(), ellipsize.getValue());
    }
    
    /**
     * Sets the default font description for the layout.
     * 
     * If no font description is set on the layout, the
     * font description from the layout's context is used.
     */
    public void setFontDescription(FontDescription desc) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_set_font_description(HANDLE(), desc.HANDLE());
    }
    
    /**
     * Sets the height to which the `PangoLayout` should be ellipsized at.
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
     * [https://gitlab.gnome.org/gnome/pango](https://gitlab.gnome.org/gnome/pango)
     * if your code relies on this behavior.
     * 
     * Height setting only has effect if a positive width is set on
     * @layout and ellipsization mode of @layout is not %PANGO_ELLIPSIZE_NONE.
     * The behavior is undefined if a height other than -1 is set and
     * ellipsization mode is set to %PANGO_ELLIPSIZE_NONE, and may change in the
     * future.
     */
    public void setHeight(int height) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_set_height(HANDLE(), height);
    }
    
    /**
     * Sets the width in Pango units to indent each paragraph.
     * 
     * A negative value of @indent will produce a hanging indentation.
     * That is, the first line will have the full width, and subsequent
     * lines will be indented by the absolute value of @indent.
     * 
     * The indent setting is ignored if layout alignment is set to
     * %PANGO_ALIGN_CENTER.
     * 
     * The default value is 0.
     */
    public void setIndent(int indent) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_set_indent(HANDLE(), indent);
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
     * The default value is %FALSE.
     * 
     * Also see [method@Pango.Layout.set_justify_last_line].
     */
    public void setJustify(boolean justify) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_set_justify(HANDLE(), justify ? 1 : 0);
    }
    
    /**
     * Sets whether the last line should be stretched to fill the
     * entire width of the layout.
     * 
     * This only has an effect if [method@Pango.Layout.set_justify] has
     * been called as well.
     * 
     * The default value is %FALSE.
     */
    public void setJustifyLastLine(boolean justify) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_set_justify_last_line(HANDLE(), justify ? 1 : 0);
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
     * set with [method@Pango.Layout.set_spacing] is ignored.
     * 
     * If @factor is zero (the default), spacing is applied as before.
     * 
     * Note: for semantics that are closer to the CSS line-height
     * property, see [func@Pango.attr_line_height_new].
     */
    public void setLineSpacing(float factor) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_set_line_spacing(HANDLE(), factor);
    }
    
    /**
     * Sets the layout text and attribute list from marked-up text.
     * 
     * See [Pango Markup](pango_markup.html)).
     * 
     * Replaces the current text and attribute list.
     * 
     * This is the same as [method@Pango.Layout.set_markup_with_accel],
     * but the markup text isn't scanned for accelerators.
     */
    public void setMarkup(java.lang.String markup, int length) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_set_markup(HANDLE(), Interop.allocateNativeString(markup).HANDLE(), length);
    }
    
    /**
     * Sets the single paragraph mode of @layout.
     * 
     * If @setting is %TRUE, do not treat newlines and similar characters
     * as paragraph separators; instead, keep all text in a single paragraph,
     * and display a glyph for paragraph separator characters. Used when
     * you want to allow editing of newlines on a single text line.
     * 
     * The default value is %FALSE.
     */
    public void setSingleParagraphMode(boolean setting) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_set_single_paragraph_mode(HANDLE(), setting ? 1 : 0);
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
     * to a non-zero value with [method@Pango.Layout.set_line_spacing].
     * In that case, the @spacing set with this function is ignored.
     * 
     * Note: for semantics that are closer to the CSS line-height
     * property, see [func@Pango.attr_line_height_new].
     */
    public void setSpacing(int spacing) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_set_spacing(HANDLE(), spacing);
    }
    
    /**
     * Sets the tabs to use for @layout, overriding the default tabs.
     * 
     * `PangoLayout` will place content at the next tab position
     * whenever it meets a Tab character (U+0009).
     * 
     * By default, tabs are every 8 spaces. If @tabs is %NULL, the
     * default tabs are reinstated. @tabs is copied into the layout;
     * you must free your copy of @tabs yourself.
     * 
     * Note that tabs and justification conflict with each other:
     * Justification will move content away from its tab-aligned
     * positions. The same is true for alignments other than
     * %PANGO_ALIGN_LEFT.
     */
    public void setTabs(TabArray tabs) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_set_tabs(HANDLE(), tabs.HANDLE());
    }
    
    /**
     * Sets the text of the layout.
     * 
     * This function validates @text and renders invalid UTF-8
     * with a placeholder glyph.
     * 
     * Note that if you have used [method@Pango.Layout.set_markup] or
     * [method@Pango.Layout.set_markup_with_accel] on @layout before, you
     * may want to call [method@Pango.Layout.set_attributes] to clear the
     * attributes set on the layout from the markup as this function does
     * not clear attributes.
     */
    public void setText(java.lang.String text, int length) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_set_text(HANDLE(), Interop.allocateNativeString(text).HANDLE(), length);
    }
    
    /**
     * Sets the width to which the lines of the `PangoLayout` should wrap or
     * ellipsized.
     * 
     * The default value is -1: no width set.
     */
    public void setWidth(int width) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_set_width(HANDLE(), width);
    }
    
    /**
     * Sets the wrap mode.
     * 
     * The wrap mode only has effect if a width is set on the layout
     * with [method@Pango.Layout.set_width]. To turn off wrapping,
     * set the width to -1.
     * 
     * The default value is %PANGO_WRAP_WORD.
     */
    public void setWrap(WrapMode wrap) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_set_wrap(HANDLE(), wrap.getValue());
    }
    
    /**
     * A convenience method to serialize a layout to a file.
     * 
     * It is equivalent to calling [method@Pango.Layout.serialize]
     * followed by [func@GLib.file_set_contents].
     * 
     * See those two functions for details on the arguments.
     * 
     * It is mostly intended for use inside a debugger to quickly dump
     * a layout to a file for later inspection.
     */
    public boolean writeToFile(int flags, java.lang.String filename) throws io.github.jwharm.javagi.interop.GErrorException {
        MemorySegment GERROR = io.github.jwharm.javagi.interop.jextract.GError.allocate(Interop.getScope());
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.pango_layout_write_to_file(HANDLE(), flags, Interop.allocateNativeString(filename).HANDLE(), GERROR);
        if (! java.util.Objects.equals(MemoryAddress.NULL, GERROR)) {
            throw new io.github.jwharm.javagi.interop.GErrorException(GERROR);
        }
        return (RESULT != 0);
    }
    
}
