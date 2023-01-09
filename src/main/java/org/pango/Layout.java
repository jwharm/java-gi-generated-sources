package org.pango;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * | <img src="./doc-files/align-left.png" alt="align=left"> | <img src="./doc-files/align-left-justify.png" alt="align=left, justify"> |
 * | <img src="./doc-files/align-center.png" alt="align=center"> | <img src="./doc-files/align-center-justify.png" alt="align=center, justify"> |
 * | <img src="./doc-files/align-right.png" alt="align=right"> | <img src="./doc-files/align-right-justify.png" alt="align=right, justify"> |
 * <p>
 * It is possible, as well, to ignore the 2-D setup,
 * and simply treat the results of a {@code PangoLayout} as a list of lines.
 */
public class Layout extends org.gtk.gobject.GObject {
    
    static {
        Pango.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "PangoLayout";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Layout proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Layout(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Layout> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Layout(input);
    
    private static MemoryAddress constructNew(org.pango.Context context) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_layout_new.invokeExact(context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new {@code PangoLayout} object with attributes initialized to
     * default values for a particular {@code PangoContext}.
     * @param context a {@code PangoContext}
     */
    public Layout(org.pango.Context context) {
        super(constructNew(context));
        this.takeOwnership();
    }
    
    /**
     * Forces recomputation of any state in the {@code PangoLayout} that
     * might depend on the layout's context.
     * <p>
     * This function should be called if you make changes to the context
     * subsequent to creating the layout.
     */
    public void contextChanged() {
        try {
            DowncallHandles.pango_layout_context_changed.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a deep copy-by-value of the layout.
     * <p>
     * The attribute list, tab array, and text from the original layout
     * are all copied by value.
     * @return the newly allocated {@code PangoLayout}
     */
    public org.pango.Layout copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_layout_copy.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = (org.pango.Layout) Interop.register(RESULT, org.pango.Layout.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets the alignment for the layout: how partial lines are
     * positioned within the horizontal space available.
     * @return the alignment
     */
    public org.pango.Alignment getAlignment() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_get_alignment.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.Alignment.of(RESULT);
    }
    
    /**
     * Gets the attribute list for the layout, if any.
     * @return a {@code PangoAttrList}
     */
    public @Nullable org.pango.AttrList getAttributes() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_layout_get_attributes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.AttrList.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Gets whether to calculate the base direction for the layout
     * according to its contents.
     * <p>
     * See {@link Layout#setAutoDir}.
     * @return {@code true} if the bidirectional base direction
     *   is computed from the layout's contents, {@code false} otherwise
     */
    public boolean getAutoDir() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_get_auto_dir.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the Y position of baseline of the first line in {@code layout}.
     * @return baseline of first line, from top of {@code layout}
     */
    public int getBaseline() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_get_baseline.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
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
     * @param index the byte index of the cursor
     * @param strongPos location to store the strong cursor position
     * @param weakPos location to store the weak cursor position
     */
    public void getCaretPos(int index, @Nullable org.pango.Rectangle strongPos, @Nullable org.pango.Rectangle weakPos) {
        try {
            DowncallHandles.pango_layout_get_caret_pos.invokeExact(
                    handle(),
                    index,
                    (Addressable) (strongPos == null ? MemoryAddress.NULL : strongPos.handle()),
                    (Addressable) (weakPos == null ? MemoryAddress.NULL : weakPos.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the number of Unicode characters in the
     * the text of {@code layout}.
     * @return the number of Unicode characters
     *   in the text of {@code layout}
     */
    public int getCharacterCount() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_get_character_count.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves the {@code PangoContext} used for this layout.
     * @return the {@code PangoContext} for the layout
     */
    public org.pango.Context getContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_layout_get_context.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.pango.Context) Interop.register(RESULT, org.pango.Context.fromAddress).marshal(RESULT, null);
    }
    
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
     * @param index the byte index of the cursor
     * @param strongPos location to store the strong cursor position
     * @param weakPos location to store the weak cursor position
     */
    public void getCursorPos(int index, @Nullable org.pango.Rectangle strongPos, @Nullable org.pango.Rectangle weakPos) {
        try {
            DowncallHandles.pango_layout_get_cursor_pos.invokeExact(
                    handle(),
                    index,
                    (Addressable) (strongPos == null ? MemoryAddress.NULL : strongPos.handle()),
                    (Addressable) (weakPos == null ? MemoryAddress.NULL : weakPos.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the text direction at the given character position in {@code layout}.
     * @param index the byte index of the char
     * @return the text direction at {@code index}
     */
    public org.pango.Direction getDirection(int index) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_get_direction.invokeExact(
                    handle(),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.Direction.of(RESULT);
    }
    
    /**
     * Gets the type of ellipsization being performed for {@code layout}.
     * <p>
     * See {@link Layout#setEllipsize}.
     * <p>
     * Use {@link Layout#isEllipsized} to query whether any
     * paragraphs were actually ellipsized.
     * @return the current ellipsization mode for {@code layout}
     */
    public org.pango.EllipsizeMode getEllipsize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_get_ellipsize.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.EllipsizeMode.of(RESULT);
    }
    
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
     * @param inkRect rectangle used to store the extents of the
     *   layout as drawn
     * @param logicalRect rectangle used to store the logical
     *   extents of the layout
     */
    public void getExtents(@Nullable org.pango.Rectangle inkRect, @Nullable org.pango.Rectangle logicalRect) {
        try {
            DowncallHandles.pango_layout_get_extents.invokeExact(
                    handle(),
                    (Addressable) (inkRect == null ? MemoryAddress.NULL : inkRect.handle()),
                    (Addressable) (logicalRect == null ? MemoryAddress.NULL : logicalRect.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the font description for the layout, if any.
     * @return a pointer to the
     *   layout's font description, or {@code null} if the font description
     *   from the layout's context is inherited.
     */
    public @Nullable org.pango.FontDescription getFontDescription() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_layout_get_font_description.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.FontDescription.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Gets the height of layout used for ellipsization.
     * <p>
     * See {@link Layout#setHeight} for details.
     * @return the height, in Pango units if positive,
     *   or number of lines if negative.
     */
    public int getHeight() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_get_height.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the paragraph indent width in Pango units.
     * <p>
     * A negative value indicates a hanging indentation.
     * @return the indent in Pango units
     */
    public int getIndent() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_get_indent.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns an iterator to iterate over the visual extents of the layout.
     * @return the new {@code PangoLayoutIter}
     */
    public org.pango.LayoutIter getIter() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_layout_get_iter.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.pango.LayoutIter.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets whether each complete line should be stretched to fill the entire
     * width of the layout.
     * @return the justify value
     */
    public boolean getJustify() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_get_justify.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets whether the last line should be stretched
     * to fill the entire width of the layout.
     * @return the justify value
     */
    public boolean getJustifyLastLine() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_get_justify_last_line.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Retrieves a particular line from a {@code PangoLayout}.
     * <p>
     * Use the faster {@link Layout#getLineReadonly} if you do not
     * plan to modify the contents of the line (glyphs, glyph widths, etc.).
     * @param line the index of a line, which must be between 0 and
     *   {@code pango_layout_get_line_count(layout) - 1}, inclusive.
     * @return the requested {@code PangoLayoutLine},
     *   or {@code null} if the index is out of range. This layout line can be ref'ed
     *   and retained, but will become invalid if changes are made to the
     *   {@code PangoLayout}.
     */
    public @Nullable org.pango.LayoutLine getLine(int line) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_layout_get_line.invokeExact(
                    handle(),
                    line);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.LayoutLine.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Retrieves the count of lines for the {@code layout}.
     * @return the line count
     */
    public int getLineCount() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_get_line_count.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieves a particular line from a {@code PangoLayout}.
     * <p>
     * This is a faster alternative to {@link Layout#getLine},
     * but the user is not expected to modify the contents of the line
     * (glyphs, glyph widths, etc.).
     * @param line the index of a line, which must be between 0 and
     *   {@code pango_layout_get_line_count(layout) - 1}, inclusive.
     * @return the requested {@code PangoLayoutLine},
     *   or {@code null} if the index is out of range. This layout line can be ref'ed
     *   and retained, but will become invalid if changes are made to the
     *   {@code PangoLayout}. No changes should be made to the line.
     */
    public @Nullable org.pango.LayoutLine getLineReadonly(int line) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_layout_get_line_readonly.invokeExact(
                    handle(),
                    line);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.LayoutLine.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Gets the line spacing factor of {@code layout}.
     * <p>
     * See {@link Layout#setLineSpacing}.
     */
    public float getLineSpacing() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.pango_layout_get_line_spacing.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the lines of the {@code layout} as a list.
     * <p>
     * Use the faster {@link Layout#getLinesReadonly} if you do not
     * plan to modify the contents of the lines (glyphs, glyph widths, etc.).
     * @return a {@code GSList}
     *   containing the lines in the layout. This points to internal data of the
     *   {@code PangoLayout} and must be used with care. It will become invalid on any
     *   change to the layout's text or properties.
     */
    public org.gtk.glib.SList getLines() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_layout_get_lines.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SList.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Returns the lines of the {@code layout} as a list.
     * <p>
     * This is a faster alternative to {@link Layout#getLines},
     * but the user is not expected to modify the contents of the lines
     * (glyphs, glyph widths, etc.).
     * @return a {@code GSList}
     *   containing the lines in the layout. This points to internal data of the
     *   {@code PangoLayout} and must be used with care. It will become invalid on any
     *   change to the layout's text or properties. No changes should be made to
     *   the lines.
     */
    public org.gtk.glib.SList getLinesReadonly() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_layout_get_lines_readonly.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.SList.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Retrieves an array of logical attributes for each character in
     * the {@code layout}.
     * @param attrs location to store a pointer to an array of logical attributes.
     *   This value must be freed with g_free().
     * @param nAttrs location to store the number of the attributes in the
     *   array. (The stored value will be one more than the total number
     *   of characters in the layout, since there need to be attributes
     *   corresponding to both the position before the first character
     *   and the position after the last character.)
     */
    public void getLogAttrs(Out<org.pango.LogAttr[]> attrs, Out<Integer> nAttrs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment attrsPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment nAttrsPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.pango_layout_get_log_attrs.invokeExact(
                        handle(),
                        (Addressable) attrsPOINTER.address(),
                        (Addressable) nAttrsPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    nAttrs.set(nAttrsPOINTER.get(Interop.valueLayout.C_INT, 0));
            org.pango.LogAttr[] attrsARRAY = new org.pango.LogAttr[nAttrs.get().intValue()];
            for (int I = 0; I < nAttrs.get().intValue(); I++) {
                var OBJ = attrsPOINTER.get(Interop.valueLayout.ADDRESS, I);
                attrsARRAY[I] = org.pango.LogAttr.fromAddress.marshal(OBJ, null);
                }
            attrs.set(attrsARRAY);
        }
    }
    
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
     * @param nAttrs location to store the number of the attributes in
     *   the array
     * @return an array of logical attributes
     */
    public org.pango.LogAttr[] getLogAttrsReadonly(Out<Integer> nAttrs) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment nAttrsPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.pango_layout_get_log_attrs_readonly.invokeExact(
                        handle(),
                        (Addressable) nAttrsPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    nAttrs.set(nAttrsPOINTER.get(Interop.valueLayout.C_INT, 0));
            org.pango.LogAttr[] resultARRAY = new org.pango.LogAttr[nAttrs.get().intValue()];
            for (int I = 0; I < nAttrs.get().intValue(); I++) {
                var OBJ = RESULT.get(Interop.valueLayout.ADDRESS, I);
                resultARRAY[I] = org.pango.LogAttr.fromAddress.marshal(OBJ, null);
            }
            return resultARRAY;
        }
    }
    
    /**
     * Computes the logical and ink extents of {@code layout} in device units.
     * <p>
     * This function just calls {@link Layout#getExtents} followed by
     * two {@link Pango#extentsToPixels} calls, rounding {@code ink_rect} and {@code logical_rect}
     * such that the rounded rectangles fully contain the unrounded one (that is,
     * passes them as first argument to {@link Pango#extentsToPixels}).
     * @param inkRect rectangle used to store the extents of the
     *   layout as drawn
     * @param logicalRect rectangle used to store the logical
     *   extents of the layout
     */
    public void getPixelExtents(@Nullable org.pango.Rectangle inkRect, @Nullable org.pango.Rectangle logicalRect) {
        try {
            DowncallHandles.pango_layout_get_pixel_extents.invokeExact(
                    handle(),
                    (Addressable) (inkRect == null ? MemoryAddress.NULL : inkRect.handle()),
                    (Addressable) (logicalRect == null ? MemoryAddress.NULL : logicalRect.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Determines the logical width and height of a {@code PangoLayout} in device
     * units.
     * <p>
     * {@link Layout#getSize} returns the width and height
     * scaled by {@code PANGO_SCALE}. This is simply a convenience function
     * around {@link Layout#getPixelExtents}.
     * @param width location to store the logical width
     * @param height location to store the logical height
     */
    public void getPixelSize(Out<Integer> width, Out<Integer> height) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment widthPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment heightPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.pango_layout_get_pixel_size.invokeExact(
                        handle(),
                        (Addressable) (width == null ? MemoryAddress.NULL : (Addressable) widthPOINTER.address()),
                        (Addressable) (height == null ? MemoryAddress.NULL : (Addressable) heightPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (width != null) width.set(widthPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (height != null) height.set(heightPOINTER.get(Interop.valueLayout.C_INT, 0));
        }
    }
    
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
     * @return The current serial number of {@code layout}.
     */
    public int getSerial() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_get_serial.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Obtains whether {@code layout} is in single paragraph mode.
     * <p>
     * See {@link Layout#setSingleParagraphMode}.
     * @return {@code true} if the layout does not break paragraphs
     *   at paragraph separator characters, {@code false} otherwise
     */
    public boolean getSingleParagraphMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_get_single_paragraph_mode.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Determines the logical width and height of a {@code PangoLayout} in Pango
     * units.
     * <p>
     * This is simply a convenience function around {@link Layout#getExtents}.
     * @param width location to store the logical width
     * @param height location to store the logical height
     */
    public void getSize(Out<Integer> width, Out<Integer> height) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment widthPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment heightPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.pango_layout_get_size.invokeExact(
                        handle(),
                        (Addressable) (width == null ? MemoryAddress.NULL : (Addressable) widthPOINTER.address()),
                        (Addressable) (height == null ? MemoryAddress.NULL : (Addressable) heightPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (width != null) width.set(widthPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (height != null) height.set(heightPOINTER.get(Interop.valueLayout.C_INT, 0));
        }
    }
    
    /**
     * Gets the amount of spacing between the lines of the layout.
     * @return the spacing in Pango units
     */
    public int getSpacing() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_get_spacing.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the current {@code PangoTabArray} used by this layout.
     * <p>
     * If no {@code PangoTabArray} has been set, then the default tabs are
     * in use and {@code null} is returned. Default tabs are every 8 spaces.
     * <p>
     * The return value should be freed with {@link TabArray#free}.
     * @return a copy of the tabs for this layout
     */
    public @Nullable org.pango.TabArray getTabs() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_layout_get_tabs.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.pango.TabArray.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets the text in the layout.
     * <p>
     * The returned text should not be freed or modified.
     * @return the text in the {@code layout}
     */
    public java.lang.String getText() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_layout_get_text.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Counts the number of unknown glyphs in {@code layout}.
     * <p>
     * This function can be used to determine if there are any fonts
     * available to render all characters in a certain string, or when
     * used in combination with {@link AttrType#FALLBACK}, to check if a
     * certain font supports all the characters in the string.
     * @return The number of unknown glyphs in {@code layout}
     */
    public int getUnknownGlyphsCount() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_get_unknown_glyphs_count.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the width to which the lines of the {@code PangoLayout} should wrap.
     * @return the width in Pango units, or -1 if no width set.
     */
    public int getWidth() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_get_width.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the wrap mode for the layout.
     * <p>
     * Use {@link Layout#isWrapped} to query whether
     * any paragraphs were actually wrapped.
     * @return active wrap mode.
     */
    public org.pango.WrapMode getWrap() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_get_wrap.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.pango.WrapMode.of(RESULT);
    }
    
    /**
     * Converts from byte {@code index_} within the {@code layout} to line and X position.
     * <p>
     * The X position is measured from the left edge of the line.
     * @param index the byte index of a grapheme within the layout
     * @param trailing an integer indicating the edge of the grapheme to retrieve the
     *   position of. If &gt; 0, the trailing edge of the grapheme, if 0,
     *   the leading of the grapheme
     * @param line location to store resulting line index. (which will
     *   between 0 and pango_layout_get_line_count(layout) - 1)
     * @param xPos location to store resulting position within line
     *   ({@code PANGO_SCALE} units per device unit)
     */
    public void indexToLineX(int index, boolean trailing, Out<Integer> line, Out<Integer> xPos) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment linePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment xPosPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.pango_layout_index_to_line_x.invokeExact(
                        handle(),
                        index,
                        Marshal.booleanToInteger.marshal(trailing, null).intValue(),
                        (Addressable) (line == null ? MemoryAddress.NULL : (Addressable) linePOINTER.address()),
                        (Addressable) (xPos == null ? MemoryAddress.NULL : (Addressable) xPosPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (line != null) line.set(linePOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (xPos != null) xPos.set(xPosPOINTER.get(Interop.valueLayout.C_INT, 0));
        }
    }
    
    /**
     * Converts from an index within a {@code PangoLayout} to the onscreen position
     * corresponding to the grapheme at that index.
     * <p>
     * The returns is represented as rectangle. Note that {@code pos->x} is
     * always the leading edge of the grapheme and {@code pos->x + pos->width} the
     * trailing edge of the grapheme. If the directionality of the grapheme
     * is right-to-left, then {@code pos->width} will be negative.
     * @param index byte index within {@code layout}
     * @param pos rectangle in which to store the position of the grapheme
     */
    public void indexToPos(int index, org.pango.Rectangle pos) {
        try {
            DowncallHandles.pango_layout_index_to_pos.invokeExact(
                    handle(),
                    index,
                    pos.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Queries whether the layout had to ellipsize any paragraphs.
     * <p>
     * This returns {@code true} if the ellipsization mode for {@code layout}
     * is not {@link EllipsizeMode#NONE}, a positive width is set on {@code layout},
     * and there are paragraphs exceeding that width that have to be
     * ellipsized.
     * @return {@code true} if any paragraphs had to be ellipsized,
     *   {@code false} otherwise
     */
    public boolean isEllipsized() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_is_ellipsized.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Queries whether the layout had to wrap any paragraphs.
     * <p>
     * This returns {@code true} if a positive width is set on {@code layout},
     * ellipsization mode of {@code layout} is set to {@link EllipsizeMode#NONE},
     * and there are paragraphs exceeding the layout width that have
     * to be wrapped.
     * @return {@code true} if any paragraphs had to be wrapped, {@code false}
     *   otherwise
     */
    public boolean isWrapped() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.pango_layout_is_wrapped.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
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
     * @param strong whether the moving cursor is the strong cursor or the
     *   weak cursor. The strong cursor is the cursor corresponding
     *   to text insertion in the base direction for the layout.
     * @param oldIndex the byte index of the current cursor position
     * @param oldTrailing if 0, the cursor was at the leading edge of the
     *   grapheme indicated by {@code old_index}, if &gt; 0, the cursor
     *   was at the trailing edge.
     * @param direction direction to move cursor. A negative
     *   value indicates motion to the left
     * @param newIndex location to store the new cursor byte index.
     *   A value of -1 indicates that the cursor has been moved off the
     *   beginning of the layout. A value of {@code G_MAXINT} indicates that
     *   the cursor has been moved off the end of the layout.
     * @param newTrailing number of characters to move forward from
     *   the location returned for {@code new_index} to get the position where
     *   the cursor should be displayed. This allows distinguishing the
     *   position at the beginning of one line from the position at the
     *   end of the preceding line. {@code new_index} is always on the line where
     *   the cursor should be displayed.
     */
    public void moveCursorVisually(boolean strong, int oldIndex, int oldTrailing, int direction, Out<Integer> newIndex, Out<Integer> newTrailing) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment newIndexPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment newTrailingPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.pango_layout_move_cursor_visually.invokeExact(
                        handle(),
                        Marshal.booleanToInteger.marshal(strong, null).intValue(),
                        oldIndex,
                        oldTrailing,
                        direction,
                        (Addressable) newIndexPOINTER.address(),
                        (Addressable) newTrailingPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    newIndex.set(newIndexPOINTER.get(Interop.valueLayout.C_INT, 0));
                    newTrailing.set(newTrailingPOINTER.get(Interop.valueLayout.C_INT, 0));
        }
    }
    
    /**
     * Serializes the {@code layout} for later deserialization via {@link Layout#deserialize}.
     * <p>
     * There are no guarantees about the format of the output across different
     * versions of Pango and {@link Layout#deserialize} will reject data
     * that it cannot parse.
     * <p>
     * The intended use of this function is testing, benchmarking and debugging.
     * The format is not meant as a permanent storage format.
     * @param flags {@code PangoLayoutSerializeFlags}
     * @return a {@code GBytes} containing the serialized form of {@code layout}
     */
    public org.gtk.glib.Bytes serialize(org.pango.LayoutSerializeFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.pango_layout_serialize.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.Bytes.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Sets the alignment for the layout: how partial lines are
     * positioned within the horizontal space available.
     * <p>
     * The default alignment is {@link Alignment#LEFT}.
     * @param alignment the alignment
     */
    public void setAlignment(org.pango.Alignment alignment) {
        try {
            DowncallHandles.pango_layout_set_alignment.invokeExact(
                    handle(),
                    alignment.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the text attributes for a layout object.
     * <p>
     * References {@code attrs}, so the caller can unref its reference.
     * @param attrs a {@code PangoAttrList}
     */
    public void setAttributes(@Nullable org.pango.AttrList attrs) {
        try {
            DowncallHandles.pango_layout_set_attributes.invokeExact(
                    handle(),
                    (Addressable) (attrs == null ? MemoryAddress.NULL : attrs.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param autoDir if {@code true}, compute the bidirectional base direction
     *   from the layout's contents
     */
    public void setAutoDir(boolean autoDir) {
        try {
            DowncallHandles.pango_layout_set_auto_dir.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(autoDir, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the type of ellipsization being performed for {@code layout}.
     * <p>
     * Depending on the ellipsization mode {@code ellipsize} text is
     * removed from the start, middle, or end of text so they
     * fit within the width and height of layout set with
     * {@link Layout#setWidth} and {@link Layout#setHeight}.
     * <p>
     * If the layout contains characters such as newlines that
     * force it to be layed out in multiple paragraphs, then whether
     * each paragraph is ellipsized separately or the entire layout
     * is ellipsized as a whole depends on the set height of the layout.
     * <p>
     * The default value is {@link EllipsizeMode#NONE}.
     * <p>
     * See {@link Layout#setHeight} for details.
     * @param ellipsize the new ellipsization mode for {@code layout}
     */
    public void setEllipsize(org.pango.EllipsizeMode ellipsize) {
        try {
            DowncallHandles.pango_layout_set_ellipsize.invokeExact(
                    handle(),
                    ellipsize.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the default font description for the layout.
     * <p>
     * If no font description is set on the layout, the
     * font description from the layout's context is used.
     * @param desc the new {@code PangoFontDescription}
     *   to unset the current font description
     */
    public void setFontDescription(@Nullable org.pango.FontDescription desc) {
        try {
            DowncallHandles.pango_layout_set_font_description.invokeExact(
                    handle(),
                    (Addressable) (desc == null ? MemoryAddress.NULL : desc.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param height the desired height of the layout in Pango units if positive,
     *   or desired number of lines if negative.
     */
    public void setHeight(int height) {
        try {
            DowncallHandles.pango_layout_set_height.invokeExact(
                    handle(),
                    height);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param indent the amount by which to indent
     */
    public void setIndent(int indent) {
        try {
            DowncallHandles.pango_layout_set_indent.invokeExact(
                    handle(),
                    indent);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param justify whether the lines in the layout should be justified
     */
    public void setJustify(boolean justify) {
        try {
            DowncallHandles.pango_layout_set_justify.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(justify, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the last line should be stretched to fill the
     * entire width of the layout.
     * <p>
     * This only has an effect if {@link Layout#setJustify} has
     * been called as well.
     * <p>
     * The default value is {@code false}.
     * @param justify whether the last line in the layout should be justified
     */
    public void setJustifyLastLine(boolean justify) {
        try {
            DowncallHandles.pango_layout_set_justify_last_line.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(justify, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param factor the new line spacing factor
     */
    public void setLineSpacing(float factor) {
        try {
            DowncallHandles.pango_layout_set_line_spacing.invokeExact(
                    handle(),
                    factor);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the layout text and attribute list from marked-up text.
     * <p>
     * See <a href="pango_markup.html">Pango Markup</a>).
     * <p>
     * Replaces the current text and attribute list.
     * <p>
     * This is the same as {@link Layout#setMarkupWithAccel},
     * but the markup text isn't scanned for accelerators.
     * @param markup marked-up text
     * @param length length of marked-up text in bytes, or -1 if {@code markup} is
     *   {@code NUL}-terminated
     */
    public void setMarkup(java.lang.String markup, int length) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.pango_layout_set_markup.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(markup, SCOPE),
                        length);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the layout text and attribute list from marked-up text.
     * <p>
     * See <a href="pango_markup.html">Pango Markup</a>).
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
     * @param markup marked-up text (see <a href="pango_markup.html">Pango Markup</a>)
     * @param length length of marked-up text in bytes, or -1 if {@code markup} is
     *   {@code NUL}-terminated
     * @param accelMarker marker for accelerators in the text
     * @param accelChar return location
     *   for first located accelerator
     */
    public void setMarkupWithAccel(java.lang.String markup, int length, int accelMarker, Out<Integer> accelChar) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment accelCharPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.pango_layout_set_markup_with_accel.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(markup, SCOPE),
                        length,
                        accelMarker,
                        (Addressable) (accelChar == null ? MemoryAddress.NULL : (Addressable) accelCharPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (accelChar != null) accelChar.set(accelCharPOINTER.get(Interop.valueLayout.C_INT, 0));
        }
    }
    
    /**
     * Sets the single paragraph mode of {@code layout}.
     * <p>
     * If {@code setting} is {@code true}, do not treat newlines and similar characters
     * as paragraph separators; instead, keep all text in a single paragraph,
     * and display a glyph for paragraph separator characters. Used when
     * you want to allow editing of newlines on a single text line.
     * <p>
     * The default value is {@code false}.
     * @param setting new setting
     */
    public void setSingleParagraphMode(boolean setting) {
        try {
            DowncallHandles.pango_layout_set_single_paragraph_mode.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(setting, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param spacing the amount of spacing
     */
    public void setSpacing(int spacing) {
        try {
            DowncallHandles.pango_layout_set_spacing.invokeExact(
                    handle(),
                    spacing);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param tabs a {@code PangoTabArray}
     */
    public void setTabs(@Nullable org.pango.TabArray tabs) {
        try {
            DowncallHandles.pango_layout_set_tabs.invokeExact(
                    handle(),
                    (Addressable) (tabs == null ? MemoryAddress.NULL : tabs.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the text of the layout.
     * <p>
     * This function validates {@code text} and renders invalid UTF-8
     * with a placeholder glyph.
     * <p>
     * Note that if you have used {@link Layout#setMarkup} or
     * {@link Layout#setMarkupWithAccel} on {@code layout} before, you
     * may want to call {@link Layout#setAttributes} to clear the
     * attributes set on the layout from the markup as this function does
     * not clear attributes.
     * @param text the text
     * @param length maximum length of {@code text}, in bytes. -1 indicates that
     *   the string is nul-terminated and the length should be calculated.
     *   The text will also be truncated on encountering a nul-termination
     *   even when {@code length} is positive.
     */
    public void setText(java.lang.String text, int length) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.pango_layout_set_text.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(text, SCOPE),
                        length);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Sets the width to which the lines of the {@code PangoLayout} should wrap or
     * ellipsized.
     * <p>
     * The default value is -1: no width set.
     * @param width the desired width in Pango units, or -1 to indicate that no
     *   wrapping or ellipsization should be performed.
     */
    public void setWidth(int width) {
        try {
            DowncallHandles.pango_layout_set_width.invokeExact(
                    handle(),
                    width);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the wrap mode.
     * <p>
     * The wrap mode only has effect if a width is set on the layout
     * with {@link Layout#setWidth}. To turn off wrapping,
     * set the width to -1.
     * <p>
     * The default value is {@link WrapMode#WORD}.
     * @param wrap the wrap mode
     */
    public void setWrap(org.pango.WrapMode wrap) {
        try {
            DowncallHandles.pango_layout_set_wrap.invokeExact(
                    handle(),
                    wrap.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A convenience method to serialize a layout to a file.
     * <p>
     * It is equivalent to calling {@link Layout#serialize}
     * followed by {@link org.gtk.glib.GLib#fileSetContents}.
     * <p>
     * See those two functions for details on the arguments.
     * <p>
     * It is mostly intended for use inside a debugger to quickly dump
     * a layout to a file for later inspection.
     * @param flags {@code PangoLayoutSerializeFlags}
     * @param filename the file to save it to
     * @return {@code true} if saving was successful
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public boolean writeToFile(org.pango.LayoutSerializeFlags flags, java.lang.String filename) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.pango_layout_write_to_file.invokeExact(
                        handle(),
                        flags.getValue(),
                        Marshal.stringToAddress.marshal(filename, SCOPE),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
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
     * @param x the X offset (in Pango units) from the left edge of the layout
     * @param y the Y offset (in Pango units) from the top edge of the layout
     * @param index location to store calculated byte index
     * @param trailing location to store a integer indicating where
     *   in the grapheme the user clicked. It will either be zero, or the
     *   number of characters in the grapheme. 0 represents the leading edge
     *   of the grapheme.
     * @return {@code true} if the coordinates were inside text, {@code false} otherwise
     */
    public boolean xyToIndex(int x, int y, Out<Integer> index, Out<Integer> trailing) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment indexPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment trailingPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.pango_layout_xy_to_index.invokeExact(
                        handle(),
                        x,
                        y,
                        (Addressable) indexPOINTER.address(),
                        (Addressable) trailingPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    index.set(indexPOINTER.get(Interop.valueLayout.C_INT, 0));
                    trailing.set(trailingPOINTER.get(Interop.valueLayout.C_INT, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.pango_layout_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Loads data previously created via {@link Layout#serialize}.
     * <p>
     * For a discussion of the supported format, see that function.
     * <p>
     * Note: to verify that the returned layout is identical to
     * the one that was serialized, you can compare {@code bytes} to the
     * result of serializing the layout again.
     * @param context a {@code PangoContext}
     * @param bytes the bytes containing the data
     * @param flags {@code PangoLayoutDeserializeFlags}
     * @return a new {@code PangoLayout}
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static @Nullable org.pango.Layout deserialize(org.pango.Context context, org.gtk.glib.Bytes bytes, org.pango.LayoutDeserializeFlags flags) throws io.github.jwharm.javagi.GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.pango_layout_deserialize.invokeExact(
                        context.handle(),
                        bytes.handle(),
                        flags.getValue(),
                        (Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            var OBJECT = (org.pango.Layout) Interop.register(RESULT, org.pango.Layout.fromAddress).marshal(RESULT, null);
            OBJECT.takeOwnership();
            return OBJECT;
        }
    }
    
    /**
     * A {@link Layout.Builder} object constructs a {@link Layout} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Layout.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Layout} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Layout}.
         * @return A new instance of {@code Layout} with the properties 
         *         that were set in the Builder object.
         */
        public Layout build() {
            return (Layout) org.gtk.gobject.GObject.newWithProperties(
                Layout.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle pango_layout_new = Interop.downcallHandle(
                "pango_layout_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_context_changed = Interop.downcallHandle(
                "pango_layout_context_changed",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_copy = Interop.downcallHandle(
                "pango_layout_copy",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_alignment = Interop.downcallHandle(
                "pango_layout_get_alignment",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_attributes = Interop.downcallHandle(
                "pango_layout_get_attributes",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_auto_dir = Interop.downcallHandle(
                "pango_layout_get_auto_dir",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_baseline = Interop.downcallHandle(
                "pango_layout_get_baseline",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_caret_pos = Interop.downcallHandle(
                "pango_layout_get_caret_pos",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_character_count = Interop.downcallHandle(
                "pango_layout_get_character_count",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_context = Interop.downcallHandle(
                "pango_layout_get_context",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_cursor_pos = Interop.downcallHandle(
                "pango_layout_get_cursor_pos",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_direction = Interop.downcallHandle(
                "pango_layout_get_direction",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_layout_get_ellipsize = Interop.downcallHandle(
                "pango_layout_get_ellipsize",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_extents = Interop.downcallHandle(
                "pango_layout_get_extents",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_font_description = Interop.downcallHandle(
                "pango_layout_get_font_description",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_height = Interop.downcallHandle(
                "pango_layout_get_height",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_indent = Interop.downcallHandle(
                "pango_layout_get_indent",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_iter = Interop.downcallHandle(
                "pango_layout_get_iter",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_justify = Interop.downcallHandle(
                "pango_layout_get_justify",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_justify_last_line = Interop.downcallHandle(
                "pango_layout_get_justify_last_line",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_line = Interop.downcallHandle(
                "pango_layout_get_line",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_layout_get_line_count = Interop.downcallHandle(
                "pango_layout_get_line_count",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_line_readonly = Interop.downcallHandle(
                "pango_layout_get_line_readonly",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_layout_get_line_spacing = Interop.downcallHandle(
                "pango_layout_get_line_spacing",
                FunctionDescriptor.of(Interop.valueLayout.C_FLOAT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_lines = Interop.downcallHandle(
                "pango_layout_get_lines",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_lines_readonly = Interop.downcallHandle(
                "pango_layout_get_lines_readonly",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_log_attrs = Interop.downcallHandle(
                "pango_layout_get_log_attrs",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_log_attrs_readonly = Interop.downcallHandle(
                "pango_layout_get_log_attrs_readonly",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_pixel_extents = Interop.downcallHandle(
                "pango_layout_get_pixel_extents",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_pixel_size = Interop.downcallHandle(
                "pango_layout_get_pixel_size",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_serial = Interop.downcallHandle(
                "pango_layout_get_serial",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_single_paragraph_mode = Interop.downcallHandle(
                "pango_layout_get_single_paragraph_mode",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_size = Interop.downcallHandle(
                "pango_layout_get_size",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_spacing = Interop.downcallHandle(
                "pango_layout_get_spacing",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_tabs = Interop.downcallHandle(
                "pango_layout_get_tabs",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_text = Interop.downcallHandle(
                "pango_layout_get_text",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_unknown_glyphs_count = Interop.downcallHandle(
                "pango_layout_get_unknown_glyphs_count",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_width = Interop.downcallHandle(
                "pango_layout_get_width",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_wrap = Interop.downcallHandle(
                "pango_layout_get_wrap",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_index_to_line_x = Interop.downcallHandle(
                "pango_layout_index_to_line_x",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_index_to_pos = Interop.downcallHandle(
                "pango_layout_index_to_pos",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_is_ellipsized = Interop.downcallHandle(
                "pango_layout_is_ellipsized",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_is_wrapped = Interop.downcallHandle(
                "pango_layout_is_wrapped",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_move_cursor_visually = Interop.downcallHandle(
                "pango_layout_move_cursor_visually",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_serialize = Interop.downcallHandle(
                "pango_layout_serialize",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_layout_set_alignment = Interop.downcallHandle(
                "pango_layout_set_alignment",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_layout_set_attributes = Interop.downcallHandle(
                "pango_layout_set_attributes",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_set_auto_dir = Interop.downcallHandle(
                "pango_layout_set_auto_dir",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_layout_set_ellipsize = Interop.downcallHandle(
                "pango_layout_set_ellipsize",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_layout_set_font_description = Interop.downcallHandle(
                "pango_layout_set_font_description",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_set_height = Interop.downcallHandle(
                "pango_layout_set_height",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_layout_set_indent = Interop.downcallHandle(
                "pango_layout_set_indent",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_layout_set_justify = Interop.downcallHandle(
                "pango_layout_set_justify",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_layout_set_justify_last_line = Interop.downcallHandle(
                "pango_layout_set_justify_last_line",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_layout_set_line_spacing = Interop.downcallHandle(
                "pango_layout_set_line_spacing",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT),
                false
        );
        
        private static final MethodHandle pango_layout_set_markup = Interop.downcallHandle(
                "pango_layout_set_markup",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_layout_set_markup_with_accel = Interop.downcallHandle(
                "pango_layout_set_markup_with_accel",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_set_single_paragraph_mode = Interop.downcallHandle(
                "pango_layout_set_single_paragraph_mode",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_layout_set_spacing = Interop.downcallHandle(
                "pango_layout_set_spacing",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_layout_set_tabs = Interop.downcallHandle(
                "pango_layout_set_tabs",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_set_text = Interop.downcallHandle(
                "pango_layout_set_text",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_layout_set_width = Interop.downcallHandle(
                "pango_layout_set_width",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_layout_set_wrap = Interop.downcallHandle(
                "pango_layout_set_wrap",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle pango_layout_write_to_file = Interop.downcallHandle(
                "pango_layout_write_to_file",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_xy_to_index = Interop.downcallHandle(
                "pango_layout_xy_to_index",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle pango_layout_get_type = Interop.downcallHandle(
                "pango_layout_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle pango_layout_deserialize = Interop.downcallHandle(
                "pango_layout_deserialize",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.pango_layout_get_type != null;
    }
}
