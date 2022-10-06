package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code PangoLayout} structure represents an entire paragraph of text.
 * <p>
 * While complete access to the layout capabilities of Pango is provided
 * using the detailed interfaces for itemization and shaping, using
 * that functionality directly involves writing a fairly large amount
 * of code. {@code PangoLayout} provides a high-level driver for formatting
 * entire paragraphs of text at once. This includes paragraph-level
 * functionality such as line breaking, justification, alignment and
 * ellipsization.
 * <p>
 * A {@code PangoLayout} is initialized with a {@code PangoContext}, UTF-8 string
 * and set of attributes for that string. Once that is done, the set of
 * formatted lines can be extracted from the object, the layout can be
 * rendered, and conversion between logical character positions within
 * the layout's text, and the physical position of the resulting glyphs
 * can be made.
 * <p>
 * There are a number of parameters to adjust the formatting of a
 * {@code PangoLayout}. The following image shows adjustable parameters
 * (on the left) and font metrics (on the right):
 * <p>
 * &lt;picture&gt;
 *   &lt;source srcset="layout-dark.png" media="(prefers-color-scheme: dark)"&gt;
 *   &lt;img alt="Pango Layout Parameters" src="layout-light.png"&gt;
 * &lt;/picture&gt;
 * <p>
 * The following images demonstrate the effect of alignment and
 * justification on the layout of text:
 * <p>
 * | | |
 * | --- | --- |
 * | <img src="./doc-files/align-left-justify.png" alt="align=left](align-left.png) | ![align=left, justify"> |
 * | <img src="./doc-files/align-center-justify.png" alt="align=center](align-center.png) | ![align=center, justify"> |
 * | <img src="./doc-files/align-right-justify.png" alt="align=right](align-right.png) | ![align=right, justify"> |
 * <p>
 * 
 * It is possible, as well, to ignore the 2-D setup,
 * and simply treat the results of a {@code PangoLayout} as a list of lines.
 */
public class Layout extends org.gtk.gobject.Object {

    public Layout(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to Layout */
    public static Layout castFrom(org.gtk.gobject.Object gobject) {
        return new Layout(gobject.refcounted());
    }
    
    static final MethodHandle pango_layout_new = Interop.downcallHandle(
        "pango_layout_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(Context context) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) pango_layout_new.invokeExact(context.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Create a new {@code PangoLayout} object with attributes initialized to
     * default values for a particular {@code PangoContext}.
     */
    public Layout(Context context) {
        super(constructNew(context));
    }
    
    static final MethodHandle pango_layout_context_changed = Interop.downcallHandle(
        "pango_layout_context_changed",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Forces recomputation of any state in the {@code PangoLayout} that
     * might depend on the layout's context.
     * <p>
     * This function should be called if you make changes to the context
     * subsequent to creating the layout.
     */
    public void contextChanged() {
        try {
            pango_layout_context_changed.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_copy = Interop.downcallHandle(
        "pango_layout_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a deep copy-by-value of the layout.
     * <p>
     * The attribute list, tab array, and text from the original layout
     * are all copied by value.
     */
    public Layout copy() {
        try {
            var RESULT = (MemoryAddress) pango_layout_copy.invokeExact(handle());
            return new Layout(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_alignment = Interop.downcallHandle(
        "pango_layout_get_alignment",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the alignment for the layout: how partial lines are
     * positioned within the horizontal space available.
     */
    public Alignment getAlignment() {
        try {
            var RESULT = (int) pango_layout_get_alignment.invokeExact(handle());
            return new Alignment(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_attributes = Interop.downcallHandle(
        "pango_layout_get_attributes",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the attribute list for the layout, if any.
     */
    public AttrList getAttributes() {
        try {
            var RESULT = (MemoryAddress) pango_layout_get_attributes.invokeExact(handle());
            return new AttrList(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_auto_dir = Interop.downcallHandle(
        "pango_layout_get_auto_dir",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether to calculate the base direction for the layout
     * according to its contents.
     * <p>
     * See {@link Layout#setAutoDir}.
     */
    public boolean getAutoDir() {
        try {
            var RESULT = (int) pango_layout_get_auto_dir.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_baseline = Interop.downcallHandle(
        "pango_layout_get_baseline",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the Y position of baseline of the first line in {@code layout}.
     */
    public int getBaseline() {
        try {
            var RESULT = (int) pango_layout_get_baseline.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_caret_pos = Interop.downcallHandle(
        "pango_layout_get_caret_pos",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Given an index within a layout, determines the positions that of the
     * strong and weak cursors if the insertion point is at that index.
     * <p>
     * This is a variant of {@link Layout#getCursorPos} that applies
     * font metric information about caret slope and offset to the positions
     * it returns.
     * <p>
     * &lt;picture&gt;
     *   &lt;source srcset="caret-metrics-dark.png" media="(prefers-color-scheme: dark)"&gt;
     *   &lt;img alt="Caret metrics" src="caret-metrics-light.png"&gt;
     * &lt;/picture&gt;
     */
    public void getCaretPos(int index, Rectangle strongPos, Rectangle weakPos) {
        try {
            pango_layout_get_caret_pos.invokeExact(handle(), index, strongPos.handle(), weakPos.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_character_count = Interop.downcallHandle(
        "pango_layout_get_character_count",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the number of Unicode characters in the
     * the text of {@code layout}.
     */
    public int getCharacterCount() {
        try {
            var RESULT = (int) pango_layout_get_character_count.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_context = Interop.downcallHandle(
        "pango_layout_get_context",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the {@code PangoContext} used for this layout.
     */
    public Context getContext() {
        try {
            var RESULT = (MemoryAddress) pango_layout_get_context.invokeExact(handle());
            return new Context(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_cursor_pos = Interop.downcallHandle(
        "pango_layout_get_cursor_pos",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Given an index within a layout, determines the positions that of the
     * strong and weak cursors if the insertion point is at that index.
     * <p>
     * The position of each cursor is stored as a zero-width rectangle
     * with the height of the run extents.
     * <p>
     * &lt;picture&gt;
     *   &lt;source srcset="cursor-positions-dark.png" media="(prefers-color-scheme: dark)"&gt;
     *   &lt;img alt="Cursor positions" src="cursor-positions-light.png"&gt;
     * &lt;/picture&gt;
     * <p>
     * The strong cursor location is the location where characters of the
     * directionality equal to the base direction of the layout are inserted.
     * The weak cursor location is the location where characters of the
     * directionality opposite to the base direction of the layout are inserted.
     * <p>
     * The following example shows text with both a strong and a weak cursor.
     * <p>
     * &lt;picture&gt;
     *   &lt;source srcset="split-cursor-dark.png" media="(prefers-color-scheme: dark)"&gt;
     *   &lt;img alt="Strong and weak cursors" src="split-cursor-light.png"&gt;
     * &lt;/picture&gt;
     * <p>
     * The strong cursor has a little arrow pointing to the right, the weak
     * cursor to the left. Typing a 'c' in this situation will insert the
     * character after the 'b', and typing another Hebrew character, like 'ג',
     * will insert it at the end.
     */
    public void getCursorPos(int index, Rectangle strongPos, Rectangle weakPos) {
        try {
            pango_layout_get_cursor_pos.invokeExact(handle(), index, strongPos.handle(), weakPos.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_direction = Interop.downcallHandle(
        "pango_layout_get_direction",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets the text direction at the given character position in {@code layout}.
     */
    public Direction getDirection(int index) {
        try {
            var RESULT = (int) pango_layout_get_direction.invokeExact(handle(), index);
            return new Direction(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_ellipsize = Interop.downcallHandle(
        "pango_layout_get_ellipsize",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the type of ellipsization being performed for {@code layout}.
     * <p>
     * See {@link Layout#setEllipsize}.
     * <p>
     * Use {@link Layout#isEllipsized} to query whether any
     * paragraphs were actually ellipsized.
     */
    public EllipsizeMode getEllipsize() {
        try {
            var RESULT = (int) pango_layout_get_ellipsize.invokeExact(handle());
            return new EllipsizeMode(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_extents = Interop.downcallHandle(
        "pango_layout_get_extents",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the logical and ink extents of {@code layout}.
     * <p>
     * Logical extents are usually what you want for positioning things. Note
     * that both extents may have non-zero x and y. You may want to use those
     * to offset where you render the layout. Not doing that is a very typical
     * bug that shows up as right-to-left layouts not being correctly positioned
     * in a layout with a set width.
     * <p>
     * The extents are given in layout coordinates and in Pango units; layout
     * coordinates begin at the top left corner of the layout.
     */
    public void getExtents(Rectangle inkRect, Rectangle logicalRect) {
        try {
            pango_layout_get_extents.invokeExact(handle(), inkRect.handle(), logicalRect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_font_description = Interop.downcallHandle(
        "pango_layout_get_font_description",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the font description for the layout, if any.
     */
    public FontDescription getFontDescription() {
        try {
            var RESULT = (MemoryAddress) pango_layout_get_font_description.invokeExact(handle());
            return new FontDescription(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_height = Interop.downcallHandle(
        "pango_layout_get_height",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the height of layout used for ellipsization.
     * <p>
     * See {@link Layout#setHeight} for details.
     */
    public int getHeight() {
        try {
            var RESULT = (int) pango_layout_get_height.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_indent = Interop.downcallHandle(
        "pango_layout_get_indent",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the paragraph indent width in Pango units.
     * <p>
     * A negative value indicates a hanging indentation.
     */
    public int getIndent() {
        try {
            var RESULT = (int) pango_layout_get_indent.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_iter = Interop.downcallHandle(
        "pango_layout_get_iter",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns an iterator to iterate over the visual extents of the layout.
     */
    public LayoutIter getIter() {
        try {
            var RESULT = (MemoryAddress) pango_layout_get_iter.invokeExact(handle());
            return new LayoutIter(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_justify = Interop.downcallHandle(
        "pango_layout_get_justify",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether each complete line should be stretched to fill the entire
     * width of the layout.
     */
    public boolean getJustify() {
        try {
            var RESULT = (int) pango_layout_get_justify.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_justify_last_line = Interop.downcallHandle(
        "pango_layout_get_justify_last_line",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the last line should be stretched
     * to fill the entire width of the layout.
     */
    public boolean getJustifyLastLine() {
        try {
            var RESULT = (int) pango_layout_get_justify_last_line.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_line = Interop.downcallHandle(
        "pango_layout_get_line",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Retrieves a particular line from a {@code PangoLayout}.
     * <p>
     * Use the faster {@link Layout#getLineReadonly} if you do not
     * plan to modify the contents of the line (glyphs, glyph widths, etc.).
     */
    public LayoutLine getLine(int line) {
        try {
            var RESULT = (MemoryAddress) pango_layout_get_line.invokeExact(handle(), line);
            return new LayoutLine(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_line_count = Interop.downcallHandle(
        "pango_layout_get_line_count",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the count of lines for the {@code layout}.
     */
    public int getLineCount() {
        try {
            var RESULT = (int) pango_layout_get_line_count.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_line_readonly = Interop.downcallHandle(
        "pango_layout_get_line_readonly",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Retrieves a particular line from a {@code PangoLayout}.
     * <p>
     * This is a faster alternative to {@link Layout#getLine},
     * but the user is not expected to modify the contents of the line
     * (glyphs, glyph widths, etc.).
     */
    public LayoutLine getLineReadonly(int line) {
        try {
            var RESULT = (MemoryAddress) pango_layout_get_line_readonly.invokeExact(handle(), line);
            return new LayoutLine(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_line_spacing = Interop.downcallHandle(
        "pango_layout_get_line_spacing",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the line spacing factor of {@code layout}.
     * <p>
     * See {@link Layout#setLineSpacing}.
     */
    public float getLineSpacing() {
        try {
            var RESULT = (float) pango_layout_get_line_spacing.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_lines = Interop.downcallHandle(
        "pango_layout_get_lines",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the lines of the {@code layout} as a list.
     * <p>
     * Use the faster {@link Layout#getLinesReadonly} if you do not
     * plan to modify the contents of the lines (glyphs, glyph widths, etc.).
     */
    public org.gtk.glib.SList getLines() {
        try {
            var RESULT = (MemoryAddress) pango_layout_get_lines.invokeExact(handle());
            return new org.gtk.glib.SList(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_lines_readonly = Interop.downcallHandle(
        "pango_layout_get_lines_readonly",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the lines of the {@code layout} as a list.
     * <p>
     * This is a faster alternative to {@link Layout#getLines},
     * but the user is not expected to modify the contents of the lines
     * (glyphs, glyph widths, etc.).
     */
    public org.gtk.glib.SList getLinesReadonly() {
        try {
            var RESULT = (MemoryAddress) pango_layout_get_lines_readonly.invokeExact(handle());
            return new org.gtk.glib.SList(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_log_attrs = Interop.downcallHandle(
        "pango_layout_get_log_attrs",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves an array of logical attributes for each character in
     * the {@code layout}.
     */
    public void getLogAttrs(PointerProxy<LogAttr> attrs, PointerInteger nAttrs) {
        try {
            pango_layout_get_log_attrs.invokeExact(handle(), attrs.handle(), nAttrs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_log_attrs_readonly = Interop.downcallHandle(
        "pango_layout_get_log_attrs_readonly",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves an array of logical attributes for each character in
     * the {@code layout}.
     * <p>
     * This is a faster alternative to {@link Layout#getLogAttrs}.
     * The returned array is part of {@code layout} and must not be modified.
     * Modifying the layout will invalidate the returned array.
     * <p>
     * The number of attributes returned in {@code n_attrs} will be one more
     * than the total number of characters in the layout, since there
     * need to be attributes corresponding to both the position before
     * the first character and the position after the last character.
     */
    public PointerProxy<LogAttr> getLogAttrsReadonly(PointerInteger nAttrs) {
        try {
            var RESULT = (MemoryAddress) pango_layout_get_log_attrs_readonly.invokeExact(handle(), nAttrs.handle());
            return new PointerProxy<LogAttr>(RESULT, LogAttr.class);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_pixel_extents = Interop.downcallHandle(
        "pango_layout_get_pixel_extents",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes the logical and ink extents of {@code layout} in device units.
     * <p>
     * This function just calls {@link Layout#getExtents} followed by
     * two {@code logical_rect
     * such that the rounded rectangles fully contain the unrounded one (that is,
     * passes them as first argument to [func@Pango.extents_to_pixels}).
     */
    public void getPixelExtents(Rectangle inkRect, Rectangle logicalRect) {
        try {
            pango_layout_get_pixel_extents.invokeExact(handle(), inkRect.handle(), logicalRect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_pixel_size = Interop.downcallHandle(
        "pango_layout_get_pixel_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Determines the logical width and height of a {@code PangoLayout} in device
     * units.
     * <p>
     * {@link Layout#getSize} returns the width and height
     * scaled by {@code PANGO_SCALE}. This is simply a convenience function
     * around {@link Layout#getPixelExtents}.
     */
    public void getPixelSize(PointerInteger width, PointerInteger height) {
        try {
            pango_layout_get_pixel_size.invokeExact(handle(), width.handle(), height.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_serial = Interop.downcallHandle(
        "pango_layout_get_serial",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the current serial number of {@code layout}.
     * <p>
     * The serial number is initialized to an small number larger than zero
     * when a new layout is created and is increased whenever the layout is
     * changed using any of the setter functions, or the {@code PangoContext} it
     * uses has changed. The serial may wrap, but will never have the value 0.
     * Since it can wrap, never compare it with "less than", always use "not equals".
     * <p>
     * This can be used to automatically detect changes to a {@code PangoLayout},
     * and is useful for example to decide whether a layout needs redrawing.
     * To force the serial to be increased, use
     * {@link Layout#contextChanged}.
     */
    public int getSerial() {
        try {
            var RESULT = (int) pango_layout_get_serial.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_single_paragraph_mode = Interop.downcallHandle(
        "pango_layout_get_single_paragraph_mode",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains whether {@code layout} is in single paragraph mode.
     * <p>
     * See {@link Layout#setSingleParagraphMode}.
     */
    public boolean getSingleParagraphMode() {
        try {
            var RESULT = (int) pango_layout_get_single_paragraph_mode.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_size = Interop.downcallHandle(
        "pango_layout_get_size",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Determines the logical width and height of a {@code PangoLayout} in Pango
     * units.
     * <p>
     * This is simply a convenience function around {@link Layout#getExtents}.
     */
    public void getSize(PointerInteger width, PointerInteger height) {
        try {
            pango_layout_get_size.invokeExact(handle(), width.handle(), height.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_spacing = Interop.downcallHandle(
        "pango_layout_get_spacing",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the amount of spacing between the lines of the layout.
     */
    public int getSpacing() {
        try {
            var RESULT = (int) pango_layout_get_spacing.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_tabs = Interop.downcallHandle(
        "pango_layout_get_tabs",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the current {@code PangoTabArray} used by this layout.
     * <p>
     * If no {@code PangoTabArray} has been set, then the default tabs are
     * in use and {@code null} is returned. Default tabs are every 8 spaces.
     * <p>
     * The return value should be freed with {@link TabArray#free}.
     */
    public TabArray getTabs() {
        try {
            var RESULT = (MemoryAddress) pango_layout_get_tabs.invokeExact(handle());
            return new TabArray(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_text = Interop.downcallHandle(
        "pango_layout_get_text",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the text in the layout.
     * <p>
     * The returned text should not be freed or modified.
     */
    public java.lang.String getText() {
        try {
            var RESULT = (MemoryAddress) pango_layout_get_text.invokeExact(handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_unknown_glyphs_count = Interop.downcallHandle(
        "pango_layout_get_unknown_glyphs_count",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Counts the number of unknown glyphs in {@code layout}.
     * <p>
     * This function can be used to determine if there are any fonts
     * available to render all characters in a certain string, or when
     * used in combination with {@link AttrType#FALLBACK}, to check if a
     * certain font supports all the characters in the string.
     */
    public int getUnknownGlyphsCount() {
        try {
            var RESULT = (int) pango_layout_get_unknown_glyphs_count.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_width = Interop.downcallHandle(
        "pango_layout_get_width",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the width to which the lines of the {@code PangoLayout} should wrap.
     */
    public int getWidth() {
        try {
            var RESULT = (int) pango_layout_get_width.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_get_wrap = Interop.downcallHandle(
        "pango_layout_get_wrap",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the wrap mode for the layout.
     * <p>
     * Use {@link Layout#isWrapped} to query whether
     * any paragraphs were actually wrapped.
     */
    public WrapMode getWrap() {
        try {
            var RESULT = (int) pango_layout_get_wrap.invokeExact(handle());
            return new WrapMode(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_index_to_line_x = Interop.downcallHandle(
        "pango_layout_index_to_line_x",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts from byte {@code index_} within the {@code layout} to line and X position.
     * <p>
     * The X position is measured from the left edge of the line.
     */
    public void indexToLineX(int index, boolean trailing, PointerInteger line, PointerInteger xPos) {
        try {
            pango_layout_index_to_line_x.invokeExact(handle(), index, trailing ? 1 : 0, line.handle(), xPos.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_index_to_pos = Interop.downcallHandle(
        "pango_layout_index_to_pos",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts from an index within a {@code PangoLayout} to the onscreen position
     * corresponding to the grapheme at that index.
     * <p>
     * The return value is represented as rectangle. Note that {@code pos->x} is
     * always the leading edge of the grapheme and {@code pos->x + pos->width} the
     * trailing edge of the grapheme. If the directionality of the grapheme
     * is right-to-left, then {@code pos->width} will be negative.
     */
    public void indexToPos(int index, Rectangle pos) {
        try {
            pango_layout_index_to_pos.invokeExact(handle(), index, pos.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_is_ellipsized = Interop.downcallHandle(
        "pango_layout_is_ellipsized",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Queries whether the layout had to ellipsize any paragraphs.
     * <p>
     * This returns {@code true} if the ellipsization mode for {@code layout}
     * is not {@link EllipsizeMode#NONE}, a positive width is set on {@code layout},
     * and there are paragraphs exceeding that width that have to be
     * ellipsized.
     */
    public boolean isEllipsized() {
        try {
            var RESULT = (int) pango_layout_is_ellipsized.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_is_wrapped = Interop.downcallHandle(
        "pango_layout_is_wrapped",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Queries whether the layout had to wrap any paragraphs.
     * <p>
     * This returns {@code true} if a positive width is set on {@code layout},
     * ellipsization mode of {@code layout} is set to {@link EllipsizeMode#NONE},
     * and there are paragraphs exceeding the layout width that have
     * to be wrapped.
     */
    public boolean isWrapped() {
        try {
            var RESULT = (int) pango_layout_is_wrapped.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_move_cursor_visually = Interop.downcallHandle(
        "pango_layout_move_cursor_visually",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Computes a new cursor position from an old position and a direction.
     * <p>
     * If {@code direction} is positive, then the new position will cause the strong
     * or weak cursor to be displayed one position to right of where it was
     * with the old cursor position. If {@code direction} is negative, it will be
     * moved to the left.
     * <p>
     * In the presence of bidirectional text, the correspondence between
     * logical and visual order will depend on the direction of the current
     * run, and there may be jumps when the cursor is moved off of the end
     * of a run.
     * <p>
     * Motion here is in cursor positions, not in characters, so a single
     * call to this function may move the cursor over multiple characters
     * when multiple characters combine to form a single grapheme.
     */
    public void moveCursorVisually(boolean strong, int oldIndex, int oldTrailing, int direction, PointerInteger newIndex, PointerInteger newTrailing) {
        try {
            pango_layout_move_cursor_visually.invokeExact(handle(), strong ? 1 : 0, oldIndex, oldTrailing, direction, newIndex.handle(), newTrailing.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_serialize = Interop.downcallHandle(
        "pango_layout_serialize",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Serializes the {@code layout} for later deserialization via {@link Pango#Layout}.
     * <p>
     * There are no guarantees about the format of the output across different
     * versions of Pango and {@link Pango#Layout} will reject data
     * that it cannot parse.
     * <p>
     * The intended use of this function is testing, benchmarking and debugging.
     * The format is not meant as a permanent storage format.
     */
    public org.gtk.glib.Bytes serialize(LayoutSerializeFlags flags) {
        try {
            var RESULT = (MemoryAddress) pango_layout_serialize.invokeExact(handle(), flags.getValue());
            return new org.gtk.glib.Bytes(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_set_alignment = Interop.downcallHandle(
        "pango_layout_set_alignment",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the alignment for the layout: how partial lines are
     * positioned within the horizontal space available.
     * <p>
     * The default alignment is {@link Alignment#LEFT}.
     */
    public void setAlignment(Alignment alignment) {
        try {
            pango_layout_set_alignment.invokeExact(handle(), alignment.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_set_attributes = Interop.downcallHandle(
        "pango_layout_set_attributes",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the text attributes for a layout object.
     * <p>
     * References {@code attrs}, so the caller can unref its reference.
     */
    public void setAttributes(AttrList attrs) {
        try {
            pango_layout_set_attributes.invokeExact(handle(), attrs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_set_auto_dir = Interop.downcallHandle(
        "pango_layout_set_auto_dir",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether to calculate the base direction
     * for the layout according to its contents.
     * <p>
     * When this flag is on (the default), then paragraphs in {@code layout} that
     * begin with strong right-to-left characters (Arabic and Hebrew principally),
     * will have right-to-left layout, paragraphs with letters from other scripts
     * will have left-to-right layout. Paragraphs with only neutral characters
     * get their direction from the surrounding paragraphs.
     * <p>
     * When {@code false}, the choice between left-to-right and right-to-left
     * layout is done according to the base direction of the layout's
     * {@code PangoContext}. (See {@link Context#setBaseDir}).
     * <p>
     * When the auto-computed direction of a paragraph differs from the
     * base direction of the context, the interpretation of
     * {@link Alignment#LEFT} and {@link Alignment#RIGHT} are swapped.
     */
    public void setAutoDir(boolean autoDir) {
        try {
            pango_layout_set_auto_dir.invokeExact(handle(), autoDir ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_set_ellipsize = Interop.downcallHandle(
        "pango_layout_set_ellipsize",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the type of ellipsization being performed for {@code layout}.
     * <p>
     * Depending on the ellipsization mode {@code ellipsize} text is
     * removed from the start, middle, or end of text so they
     * fit within the width and height of layout set with
     * {@code Pango.Layout.set_height}.
     * <p>
     * If the layout contains characters such as newlines that
     * force it to be layed out in multiple paragraphs, then whether
     * each paragraph is ellipsized separately or the entire layout
     * is ellipsized as a whole depends on the set height of the layout.
     * <p>
     * The default value is {@link EllipsizeMode#NONE}.
     * <p>
     * See {@link Layout#setHeight} for details.
     */
    public void setEllipsize(EllipsizeMode ellipsize) {
        try {
            pango_layout_set_ellipsize.invokeExact(handle(), ellipsize.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_set_font_description = Interop.downcallHandle(
        "pango_layout_set_font_description",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the default font description for the layout.
     * <p>
     * If no font description is set on the layout, the
     * font description from the layout's context is used.
     */
    public void setFontDescription(FontDescription desc) {
        try {
            pango_layout_set_font_description.invokeExact(handle(), desc.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_set_height = Interop.downcallHandle(
        "pango_layout_set_height",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the height to which the {@code PangoLayout} should be ellipsized at.
     * <p>
     * There are two different behaviors, based on whether {@code height} is positive
     * or negative.
     * <p>
     * If {@code height} is positive, it will be the maximum height of the layout. Only
     * lines would be shown that would fit, and if there is any text omitted,
     * an ellipsis added. At least one line is included in each paragraph regardless
     * of how small the height value is. A value of zero will render exactly one
     * line for the entire layout.
     * <p>
     * If {@code height} is negative, it will be the (negative of) maximum number of lines
     * per paragraph. That is, the total number of lines shown may well be more than
     * this value if the layout contains multiple paragraphs of text.
     * The default value of -1 means that the first line of each paragraph is ellipsized.
     * This behavior may be changed in the future to act per layout instead of per
     * paragraph. File a bug against pango at
     * <a href="https://gitlab.gnome.org/gnome/pango">https://gitlab.gnome.org/gnome/pango</a>
     * if your code relies on this behavior.
     * <p>
     * Height setting only has effect if a positive width is set on
     * {@code layout} and ellipsization mode of {@code layout} is not {@link EllipsizeMode#NONE}.
     * The behavior is undefined if a height other than -1 is set and
     * ellipsization mode is set to {@link EllipsizeMode#NONE}, and may change in the
     * future.
     */
    public void setHeight(int height) {
        try {
            pango_layout_set_height.invokeExact(handle(), height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_set_indent = Interop.downcallHandle(
        "pango_layout_set_indent",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the width in Pango units to indent each paragraph.
     * <p>
     * A negative value of {@code indent} will produce a hanging indentation.
     * That is, the first line will have the full width, and subsequent
     * lines will be indented by the absolute value of {@code indent}.
     * <p>
     * The indent setting is ignored if layout alignment is set to
     * {@link Alignment#CENTER}.
     * <p>
     * The default value is 0.
     */
    public void setIndent(int indent) {
        try {
            pango_layout_set_indent.invokeExact(handle(), indent);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_set_justify = Interop.downcallHandle(
        "pango_layout_set_justify",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether each complete line should be stretched to fill the
     * entire width of the layout.
     * <p>
     * Stretching is typically done by adding whitespace, but for some scripts
     * (such as Arabic), the justification may be done in more complex ways,
     * like extending the characters.
     * <p>
     * Note that this setting is not implemented and so is ignored in
     * Pango older than 1.18.
     * <p>
     * Note that tabs and justification conflict with each other:
     * Justification will move content away from its tab-aligned
     * positions.
     * <p>
     * The default value is {@code false}.
     * <p>
     * Also see {@link Layout#setJustifyLastLine}.
     */
    public void setJustify(boolean justify) {
        try {
            pango_layout_set_justify.invokeExact(handle(), justify ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_set_justify_last_line = Interop.downcallHandle(
        "pango_layout_set_justify_last_line",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the last line should be stretched to fill the
     * entire width of the layout.
     * <p>
     * This only has an effect if {@link Layout#setJustify} has
     * been called as well.
     * <p>
     * The default value is {@code false}.
     */
    public void setJustifyLastLine(boolean justify) {
        try {
            pango_layout_set_justify_last_line.invokeExact(handle(), justify ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_set_line_spacing = Interop.downcallHandle(
        "pango_layout_set_line_spacing",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Sets a factor for line spacing.
     * <p>
     * Typical values are: 0, 1, 1.5, 2. The default values is 0.
     * <p>
     * If {@code factor} is non-zero, lines are placed so that
     * <p>
     *     baseline2 = baseline1 + factor * height2
     * <p>
     * where height2 is the line height of the second line
     * (as determined by the font(s)). In this case, the spacing
     * set with {@link Layout#setSpacing} is ignored.
     * <p>
     * If {@code factor} is zero (the default), spacing is applied as before.
     * <p>
     * Note: for semantics that are closer to the CSS line-height
     * property, see {@link Pango#attrLineHeightNew}.
     */
    public void setLineSpacing(float factor) {
        try {
            pango_layout_set_line_spacing.invokeExact(handle(), factor);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_set_markup = Interop.downcallHandle(
        "pango_layout_set_markup",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the layout text and attribute list from marked-up text.
     * <p>
     * See <a href="pango_markup.html)">Pango Markup</a>.
     * <p>
     * Replaces the current text and attribute list.
     * <p>
     * This is the same as {@link Layout#setMarkupWithAccel},
     * but the markup text isn't scanned for accelerators.
     */
    public void setMarkup(java.lang.String markup, int length) {
        try {
            pango_layout_set_markup.invokeExact(handle(), Interop.allocateNativeString(markup).handle(), length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_set_markup_with_accel = Interop.downcallHandle(
        "pango_layout_set_markup_with_accel",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the layout text and attribute list from marked-up text.
     * <p>
     * See <a href="pango_markup.html)">Pango Markup</a>.
     * <p>
     * Replaces the current text and attribute list.
     * <p>
     * If {@code accel_marker} is nonzero, the given character will mark the
     * character following it as an accelerator. For example, {@code accel_marker}
     * might be an ampersand or underscore. All characters marked
     * as an accelerator will receive a {@link Underline#LOW} attribute,
     * and the first character so marked will be returned in {@code accel_char}.
     * Two {@code accel_marker} characters following each other produce a single
     * literal {@code accel_marker} character.
     */
    public void setMarkupWithAccel(java.lang.String markup, int length, int accelMarker, PointerInteger accelChar) {
        try {
            pango_layout_set_markup_with_accel.invokeExact(handle(), Interop.allocateNativeString(markup).handle(), length, accelMarker, accelChar.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_set_single_paragraph_mode = Interop.downcallHandle(
        "pango_layout_set_single_paragraph_mode",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the single paragraph mode of {@code layout}.
     * <p>
     * If {@code setting} is {@code true}, do not treat newlines and similar characters
     * as paragraph separators; instead, keep all text in a single paragraph,
     * and display a glyph for paragraph separator characters. Used when
     * you want to allow editing of newlines on a single text line.
     * <p>
     * The default value is {@code false}.
     */
    public void setSingleParagraphMode(boolean setting) {
        try {
            pango_layout_set_single_paragraph_mode.invokeExact(handle(), setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_set_spacing = Interop.downcallHandle(
        "pango_layout_set_spacing",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the amount of spacing in Pango units between
     * the lines of the layout.
     * <p>
     * When placing lines with spacing, Pango arranges things so that
     * <p>
     *     line2.top = line1.bottom + spacing
     * <p>
     * The default value is 0.
     * <p>
     * Note: Since 1.44, Pango is using the line height (as determined
     * by the font) for placing lines when the line spacing factor is set
     * to a non-zero value with {@link Layout#setLineSpacing}.
     * In that case, the {@code spacing} set with this function is ignored.
     * <p>
     * Note: for semantics that are closer to the CSS line-height
     * property, see {@link Pango#attrLineHeightNew}.
     */
    public void setSpacing(int spacing) {
        try {
            pango_layout_set_spacing.invokeExact(handle(), spacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_set_tabs = Interop.downcallHandle(
        "pango_layout_set_tabs",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the tabs to use for {@code layout}, overriding the default tabs.
     * <p>
     * {@code PangoLayout} will place content at the next tab position
     * whenever it meets a Tab character (U+0009).
     * <p>
     * By default, tabs are every 8 spaces. If {@code tabs} is {@code null}, the
     * default tabs are reinstated. {@code tabs} is copied into the layout;
     * you must free your copy of {@code tabs} yourself.
     * <p>
     * Note that tabs and justification conflict with each other:
     * Justification will move content away from its tab-aligned
     * positions. The same is true for alignments other than
     * {@link Alignment#LEFT}.
     */
    public void setTabs(TabArray tabs) {
        try {
            pango_layout_set_tabs.invokeExact(handle(), tabs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_set_text = Interop.downcallHandle(
        "pango_layout_set_text",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the text of the layout.
     * <p>
     * This function validates {@code text} and renders invalid UTF-8
     * with a placeholder glyph.
     * <p>
     * Note that if you have used {@link Layout#setMarkup} or
     * {@code layout before, you
     * may want to call [method@Pango.Layout.set_attributes} to clear the
     * attributes set on the layout from the markup as this function does
     * not clear attributes.
     */
    public void setText(java.lang.String text, int length) {
        try {
            pango_layout_set_text.invokeExact(handle(), Interop.allocateNativeString(text).handle(), length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_set_width = Interop.downcallHandle(
        "pango_layout_set_width",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the width to which the lines of the {@code PangoLayout} should wrap or
     * ellipsized.
     * <p>
     * The default value is -1: no width set.
     */
    public void setWidth(int width) {
        try {
            pango_layout_set_width.invokeExact(handle(), width);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_set_wrap = Interop.downcallHandle(
        "pango_layout_set_wrap",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the wrap mode.
     * <p>
     * The wrap mode only has effect if a width is set on the layout
     * with {@link Layout#setWidth}. To turn off wrapping,
     * set the width to -1.
     * <p>
     * The default value is {@link WrapMode#WORD}.
     */
    public void setWrap(WrapMode wrap) {
        try {
            pango_layout_set_wrap.invokeExact(handle(), wrap.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_write_to_file = Interop.downcallHandle(
        "pango_layout_write_to_file",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * A convenience method to serialize a layout to a file.
     * <p>
     * It is equivalent to calling {@link Layout#serialize}
     * followed by {@link GLib#fileSetContents}.
     * <p>
     * See those two functions for details on the arguments.
     * <p>
     * It is mostly intended for use inside a debugger to quickly dump
     * a layout to a file for later inspection.
     */
    public boolean writeToFile(LayoutSerializeFlags flags, java.lang.String filename) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (int) pango_layout_write_to_file.invokeExact(handle(), flags.getValue(), Interop.allocateNativeString(filename).handle(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_xy_to_index = Interop.downcallHandle(
        "pango_layout_xy_to_index",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts from X and Y position within a layout to the byte index to the
     * character at that logical position.
     * <p>
     * If the Y position is not inside the layout, the closest position is
     * chosen (the position will be clamped inside the layout). If the X position
     * is not within the layout, then the start or the end of the line is
     * chosen as described for {@link LayoutLine#xToIndex}. If either
     * the X or Y positions were not inside the layout, then the function returns
     * {@code false}; on an exact hit, it returns {@code true}.
     */
    public boolean xyToIndex(int x, int y, PointerInteger index, PointerInteger trailing) {
        try {
            var RESULT = (int) pango_layout_xy_to_index.invokeExact(handle(), x, y, index.handle(), trailing.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle pango_layout_deserialize = Interop.downcallHandle(
        "pango_layout_deserialize",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Loads data previously created via {@link Layout#serialize}.
     * <p>
     * For a discussion of the supported format, see that function.
     * <p>
     * Note: to verify that the returned layout is identical to
     * the one that was serialized, you can compare {@code bytes} to the
     * result of serializing the layout again.
     */
    public static Layout deserialize(Context context, org.gtk.glib.Bytes bytes, LayoutDeserializeFlags flags) throws io.github.jwharm.javagi.GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            var RESULT = (MemoryAddress) pango_layout_deserialize.invokeExact(context.handle(), bytes.handle(), flags.getValue(), GERROR);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return new Layout(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
