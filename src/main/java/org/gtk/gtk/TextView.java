package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A widget that displays the contents of a {@link TextBuffer}.
 * <p>
 * <img src="./doc-files/multiline-text.png" alt="An example GtkTextview">
 * <p>
 * You may wish to begin by reading the <a href="section-text-widget.html">conceptual overview</a>,
 * which gives an overview of all the objects and data types related to the
 * text widget and how they work together.
 * <p>
 * <h2>CSS nodes</h2>
 * <p>
 * <pre>{@code 
 * textview.view
 * ├── border.top
 * ├── border.left
 * ├── text
 * │   ╰── [selection]
 * ├── border.right
 * ├── border.bottom
 * ╰── [window.popup]
 * }</pre>
 * <p>
 * {@code GtkTextView} has a main css node with name textview and style class .view,
 * and subnodes for each of the border windows, and the main text area,
 * with names border and text, respectively. The border nodes each get
 * one of the style classes .left, .right, .top or .bottom.
 * <p>
 * A node representing the selection will appear below the text node.
 * <p>
 * If a context menu is opened, the window node will appear as a subnode
 * of the main node.
 * <p>
 * <h2>Accessibility</h2>
 * <p>
 * {@code GtkTextView} uses the {@link AccessibleRole#TEXT_BOX} role.
 */
public class TextView extends Widget implements Accessible, Buildable, ConstraintTarget, Scrollable {

    public TextView(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TextView */
    public static TextView castFrom(org.gtk.gobject.Object gobject) {
        return new TextView(gobject.refcounted());
    }
    
    static final MethodHandle gtk_text_view_new = Interop.downcallHandle(
        "gtk_text_view_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_text_view_new.invokeExact(), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkTextView}.
     * <p>
     * If you don’t call {@link TextView#setBuffer} before using the
     * text view, an empty default buffer will be created for you. Get the
     * buffer with {@link TextView#getBuffer}. If you want to specify
     * your own buffer, consider {@link TextView#newWithBuffer}.
     */
    public TextView() {
        super(constructNew());
    }
    
    static final MethodHandle gtk_text_view_new_with_buffer = Interop.downcallHandle(
        "gtk_text_view_new_with_buffer",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewWithBuffer(TextBuffer buffer) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_text_view_new_with_buffer.invokeExact(buffer.handle()), false);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code GtkTextView} widget displaying the buffer {@code buffer}.
     * <p>
     * One buffer can be shared among many widgets. {@code buffer} may be {@code null}
     * to create a default buffer, in which case this function is equivalent
     * to {@link TextView#TextView}. The text view adds its own reference count
     * to the buffer; it does not take over an existing reference.
     */
    public static TextView newWithBuffer(TextBuffer buffer) {
        return new TextView(constructNewWithBuffer(buffer));
    }
    
    static final MethodHandle gtk_text_view_add_child_at_anchor = Interop.downcallHandle(
        "gtk_text_view_add_child_at_anchor",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a child widget in the text buffer, at the given {@code anchor}.
     */
    public void addChildAtAnchor(Widget child, TextChildAnchor anchor) {
        try {
            gtk_text_view_add_child_at_anchor.invokeExact(handle(), child.handle(), anchor.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_add_overlay = Interop.downcallHandle(
        "gtk_text_view_add_overlay",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Adds {@code child} at a fixed coordinate in the {@code GtkTextView}'s text window.
     * <p>
     * The {@code xpos} and {@code ypos} must be in buffer coordinates (see
     * {@link TextView#getIterLocation} to convert to
     * buffer coordinates).
     * <p>
     * {@code child} will scroll with the text view.
     * <p>
     * If instead you want a widget that will not move with the
     * {@code GtkTextView} contents see {@code GtkOverlay}.
     */
    public void addOverlay(Widget child, int xpos, int ypos) {
        try {
            gtk_text_view_add_overlay.invokeExact(handle(), child.handle(), xpos, ypos);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_backward_display_line = Interop.downcallHandle(
        "gtk_text_view_backward_display_line",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Moves the given {@code iter} backward by one display (wrapped) line.
     * <p>
     * A display line is different from a paragraph. Paragraphs are
     * separated by newlines or other paragraph separator characters.
     * Display lines are created by line-wrapping a paragraph. If
     * wrapping is turned off, display lines and paragraphs will be the
     * same. Display lines are divided differently for each view, since
     * they depend on the view’s width; paragraphs are the same in all
     * views, since they depend on the contents of the {@code GtkTextBuffer}.
     */
    public boolean backwardDisplayLine(TextIter iter) {
        try {
            var RESULT = (int) gtk_text_view_backward_display_line.invokeExact(handle(), iter.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_backward_display_line_start = Interop.downcallHandle(
        "gtk_text_view_backward_display_line_start",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Moves the given {@code iter} backward to the next display line start.
     * <p>
     * A display line is different from a paragraph. Paragraphs are
     * separated by newlines or other paragraph separator characters.
     * Display lines are created by line-wrapping a paragraph. If
     * wrapping is turned off, display lines and paragraphs will be the
     * same. Display lines are divided differently for each view, since
     * they depend on the view’s width; paragraphs are the same in all
     * views, since they depend on the contents of the {@code GtkTextBuffer}.
     */
    public boolean backwardDisplayLineStart(TextIter iter) {
        try {
            var RESULT = (int) gtk_text_view_backward_display_line_start.invokeExact(handle(), iter.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_buffer_to_window_coords = Interop.downcallHandle(
        "gtk_text_view_buffer_to_window_coords",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts buffer coordinates to window coordinates.
     */
    public void bufferToWindowCoords(TextWindowType win, int bufferX, int bufferY, PointerInteger windowX, PointerInteger windowY) {
        try {
            gtk_text_view_buffer_to_window_coords.invokeExact(handle(), win.getValue(), bufferX, bufferY, windowX.handle(), windowY.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_forward_display_line = Interop.downcallHandle(
        "gtk_text_view_forward_display_line",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Moves the given {@code iter} forward by one display (wrapped) line.
     * <p>
     * A display line is different from a paragraph. Paragraphs are
     * separated by newlines or other paragraph separator characters.
     * Display lines are created by line-wrapping a paragraph. If
     * wrapping is turned off, display lines and paragraphs will be the
     * same. Display lines are divided differently for each view, since
     * they depend on the view’s width; paragraphs are the same in all
     * views, since they depend on the contents of the {@code GtkTextBuffer}.
     */
    public boolean forwardDisplayLine(TextIter iter) {
        try {
            var RESULT = (int) gtk_text_view_forward_display_line.invokeExact(handle(), iter.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_forward_display_line_end = Interop.downcallHandle(
        "gtk_text_view_forward_display_line_end",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Moves the given {@code iter} forward to the next display line end.
     * <p>
     * A display line is different from a paragraph. Paragraphs are
     * separated by newlines or other paragraph separator characters.
     * Display lines are created by line-wrapping a paragraph. If
     * wrapping is turned off, display lines and paragraphs will be the
     * same. Display lines are divided differently for each view, since
     * they depend on the view’s width; paragraphs are the same in all
     * views, since they depend on the contents of the {@code GtkTextBuffer}.
     */
    public boolean forwardDisplayLineEnd(TextIter iter) {
        try {
            var RESULT = (int) gtk_text_view_forward_display_line_end.invokeExact(handle(), iter.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_get_accepts_tab = Interop.downcallHandle(
        "gtk_text_view_get_accepts_tab",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether pressing the &lt;kbd>Tab</kbd&gt; key inserts a tab characters.
     * <p>
     * See {@link TextView#setAcceptsTab}.
     */
    public boolean getAcceptsTab() {
        try {
            var RESULT = (int) gtk_text_view_get_accepts_tab.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_get_bottom_margin = Interop.downcallHandle(
        "gtk_text_view_get_bottom_margin",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the bottom margin for text in the {@code text_view}.
     */
    public int getBottomMargin() {
        try {
            var RESULT = (int) gtk_text_view_get_bottom_margin.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_get_buffer = Interop.downcallHandle(
        "gtk_text_view_get_buffer",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@code GtkTextBuffer} being displayed by this text view.
     * <p>
     * The reference count on the buffer is not incremented; the caller
     * of this function won’t own a new reference.
     */
    public TextBuffer getBuffer() {
        try {
            var RESULT = (MemoryAddress) gtk_text_view_get_buffer.invokeExact(handle());
            return new TextBuffer(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_get_cursor_locations = Interop.downcallHandle(
        "gtk_text_view_get_cursor_locations",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Determine the positions of the strong and weak cursors if the
     * insertion point is at {@code iter}.
     * <p>
     * The position of each cursor is stored as a zero-width rectangle.
     * The strong cursor location is the location where characters of
     * the directionality equal to the base direction of the paragraph
     * are inserted. The weak cursor location is the location where
     * characters of the directionality opposite to the base direction
     * of the paragraph are inserted.
     * <p>
     * If {@code iter} is {@code null}, the actual cursor position is used.
     * <p>
     * Note that if {@code iter} happens to be the actual cursor position, and
     * there is currently an IM preedit sequence being entered, the
     * returned locations will be adjusted to account for the preedit
     * cursor’s offset within the preedit sequence.
     * <p>
     * The rectangle position is in buffer coordinates; use
     * {@link TextView#bufferToWindowCoords} to convert these
     * coordinates to coordinates for one of the windows in the text view.
     */
    public void getCursorLocations(TextIter iter, org.gtk.gdk.Rectangle strong, org.gtk.gdk.Rectangle weak) {
        try {
            gtk_text_view_get_cursor_locations.invokeExact(handle(), iter.handle(), strong.handle(), weak.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_get_cursor_visible = Interop.downcallHandle(
        "gtk_text_view_get_cursor_visible",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Find out whether the cursor should be displayed.
     */
    public boolean getCursorVisible() {
        try {
            var RESULT = (int) gtk_text_view_get_cursor_visible.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_get_editable = Interop.downcallHandle(
        "gtk_text_view_get_editable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the default editability of the {@code GtkTextView}.
     * <p>
     * Tags in the buffer may override this setting for some ranges of text.
     */
    public boolean getEditable() {
        try {
            var RESULT = (int) gtk_text_view_get_editable.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_get_extra_menu = Interop.downcallHandle(
        "gtk_text_view_get_extra_menu",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the menu model that gets added to the context menu
     * or {@code null} if none has been set.
     */
    public org.gtk.gio.MenuModel getExtraMenu() {
        try {
            var RESULT = (MemoryAddress) gtk_text_view_get_extra_menu.invokeExact(handle());
            return new org.gtk.gio.MenuModel(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_get_gutter = Interop.downcallHandle(
        "gtk_text_view_get_gutter",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Gets a {@code GtkWidget} that has previously been set as gutter.
     * <p>
     * See {@link TextView#setGutter}.
     * <p>
     * {@code win} must be one of {@link TextWindowType#LEFT}, {@link TextWindowType#RIGHT},
     * {@link TextWindowType#TOP}, or {@link TextWindowType#BOTTOM}.
     */
    public Widget getGutter(TextWindowType win) {
        try {
            var RESULT = (MemoryAddress) gtk_text_view_get_gutter.invokeExact(handle(), win.getValue());
            return new Widget(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_get_indent = Interop.downcallHandle(
        "gtk_text_view_get_indent",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the default indentation of paragraphs in {@code text_view}.
     * <p>
     * Tags in the view’s buffer may override the default.
     * The indentation may be negative.
     */
    public int getIndent() {
        try {
            var RESULT = (int) gtk_text_view_get_indent.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_get_input_hints = Interop.downcallHandle(
        "gtk_text_view_get_input_hints",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code input-hints} of the {@code GtkTextView}.
     */
    public InputHints getInputHints() {
        try {
            var RESULT = (int) gtk_text_view_get_input_hints.invokeExact(handle());
            return new InputHints(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_get_input_purpose = Interop.downcallHandle(
        "gtk_text_view_get_input_purpose",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code input-purpose} of the {@code GtkTextView}.
     */
    public InputPurpose getInputPurpose() {
        try {
            var RESULT = (int) gtk_text_view_get_input_purpose.invokeExact(handle());
            return new InputPurpose(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_get_iter_at_location = Interop.downcallHandle(
        "gtk_text_view_get_iter_at_location",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Retrieves the iterator at buffer coordinates @x and @y.
     * <p>
     * Buffer coordinates are coordinates for the entire buffer, not just
     * the currently-displayed portion. If you have coordinates from an
     * event, you have to convert those to buffer coordinates with
     * {@link TextView#windowToBufferCoords}.
     */
    public boolean getIterAtLocation(TextIter iter, int x, int y) {
        try {
            var RESULT = (int) gtk_text_view_get_iter_at_location.invokeExact(handle(), iter.handle(), x, y);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_get_iter_at_position = Interop.downcallHandle(
        "gtk_text_view_get_iter_at_position",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Retrieves the iterator pointing to the character at buffer
     * coordinates @x and @y.
     * <p>
     * Buffer coordinates are coordinates for the entire buffer, not just
     * the currently-displayed portion. If you have coordinates from an event,
     * you have to convert those to buffer coordinates with
     * {@link TextView#windowToBufferCoords}.
     * <p>
     * Note that this is different from {@link TextView#getIterAtLocation},
     * which returns cursor locations, i.e. positions between characters.
     */
    public boolean getIterAtPosition(TextIter iter, PointerInteger trailing, int x, int y) {
        try {
            var RESULT = (int) gtk_text_view_get_iter_at_position.invokeExact(handle(), iter.handle(), trailing.handle(), x, y);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_get_iter_location = Interop.downcallHandle(
        "gtk_text_view_get_iter_location",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets a rectangle which roughly contains the character at {@code iter}.
     * <p>
     * The rectangle position is in buffer coordinates; use
     * {@link TextView#bufferToWindowCoords} to convert these
     * coordinates to coordinates for one of the windows in the text view.
     */
    public void getIterLocation(TextIter iter, org.gtk.gdk.Rectangle location) {
        try {
            gtk_text_view_get_iter_location.invokeExact(handle(), iter.handle(), location.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_get_justification = Interop.downcallHandle(
        "gtk_text_view_get_justification",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the default justification of paragraphs in {@code text_view}.
     * <p>
     * Tags in the buffer may override the default.
     */
    public Justification getJustification() {
        try {
            var RESULT = (int) gtk_text_view_get_justification.invokeExact(handle());
            return new Justification(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_get_left_margin = Interop.downcallHandle(
        "gtk_text_view_get_left_margin",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the default left margin size of paragraphs in the {@code text_view}.
     * <p>
     * Tags in the buffer may override the default.
     */
    public int getLeftMargin() {
        try {
            var RESULT = (int) gtk_text_view_get_left_margin.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_get_line_at_y = Interop.downcallHandle(
        "gtk_text_view_get_line_at_y",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code GtkTextIter} at the start of the line containing
     * the coordinate @y.
     * <p>
     * @y is in buffer coordinates, convert from window coordinates with
     * {@link TextView#windowToBufferCoords}. If non-{@code null},
     * {@code line_top} will be filled with the coordinate of the top edge
     * of the line.
     */
    public void getLineAtY(TextIter targetIter, int y, PointerInteger lineTop) {
        try {
            gtk_text_view_get_line_at_y.invokeExact(handle(), targetIter.handle(), y, lineTop.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_get_line_yrange = Interop.downcallHandle(
        "gtk_text_view_get_line_yrange",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the y coordinate of the top of the line containing {@code iter},
     * and the height of the line.
     * <p>
     * The coordinate is a buffer coordinate; convert to window
     * coordinates with {@link TextView#bufferToWindowCoords}.
     */
    public void getLineYrange(TextIter iter, PointerInteger y, PointerInteger height) {
        try {
            gtk_text_view_get_line_yrange.invokeExact(handle(), iter.handle(), y.handle(), height.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_get_ltr_context = Interop.downcallHandle(
        "gtk_text_view_get_ltr_context",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code PangoContext} that is used for rendering LTR directed
     * text layouts.
     * <p>
     * The context may be replaced when CSS changes occur.
     */
    public org.pango.Context getLtrContext() {
        try {
            var RESULT = (MemoryAddress) gtk_text_view_get_ltr_context.invokeExact(handle());
            return new org.pango.Context(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_get_monospace = Interop.downcallHandle(
        "gtk_text_view_get_monospace",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the {@code GtkTextView} uses monospace styling.
     */
    public boolean getMonospace() {
        try {
            var RESULT = (int) gtk_text_view_get_monospace.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_get_overwrite = Interop.downcallHandle(
        "gtk_text_view_get_overwrite",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether the {@code GtkTextView} is in overwrite mode or not.
     */
    public boolean getOverwrite() {
        try {
            var RESULT = (int) gtk_text_view_get_overwrite.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_get_pixels_above_lines = Interop.downcallHandle(
        "gtk_text_view_get_pixels_above_lines",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the default number of pixels to put above paragraphs.
     * <p>
     * Adding this function with {@link TextView#getPixelsBelowLines}
     * is equal to the line space between each paragraph.
     */
    public int getPixelsAboveLines() {
        try {
            var RESULT = (int) gtk_text_view_get_pixels_above_lines.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_get_pixels_below_lines = Interop.downcallHandle(
        "gtk_text_view_get_pixels_below_lines",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the default number of pixels to put below paragraphs.
     * <p>
     * The line space is the sum of the value returned by this function and
     * the value returned by {@link TextView#getPixelsAboveLines}.
     */
    public int getPixelsBelowLines() {
        try {
            var RESULT = (int) gtk_text_view_get_pixels_below_lines.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_get_pixels_inside_wrap = Interop.downcallHandle(
        "gtk_text_view_get_pixels_inside_wrap",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the default number of pixels to put between wrapped lines
     * inside a paragraph.
     */
    public int getPixelsInsideWrap() {
        try {
            var RESULT = (int) gtk_text_view_get_pixels_inside_wrap.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_get_right_margin = Interop.downcallHandle(
        "gtk_text_view_get_right_margin",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the default right margin for text in {@code text_view}.
     * <p>
     * Tags in the buffer may override the default.
     */
    public int getRightMargin() {
        try {
            var RESULT = (int) gtk_text_view_get_right_margin.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_get_rtl_context = Interop.downcallHandle(
        "gtk_text_view_get_rtl_context",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the {@code PangoContext} that is used for rendering RTL directed
     * text layouts.
     * <p>
     * The context may be replaced when CSS changes occur.
     */
    public org.pango.Context getRtlContext() {
        try {
            var RESULT = (MemoryAddress) gtk_text_view_get_rtl_context.invokeExact(handle());
            return new org.pango.Context(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_get_tabs = Interop.downcallHandle(
        "gtk_text_view_get_tabs",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the default tabs for {@code text_view}.
     * <p>
     * Tags in the buffer may override the defaults. The returned array
     * will be {@code null} if “standard” (8-space) tabs are used. Free the
     * return value with {@link org.pango.TabArray#free}.
     */
    public org.pango.TabArray getTabs() {
        try {
            var RESULT = (MemoryAddress) gtk_text_view_get_tabs.invokeExact(handle());
            return new org.pango.TabArray(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_get_top_margin = Interop.downcallHandle(
        "gtk_text_view_get_top_margin",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the top margin for text in the {@code text_view}.
     */
    public int getTopMargin() {
        try {
            var RESULT = (int) gtk_text_view_get_top_margin.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_get_visible_rect = Interop.downcallHandle(
        "gtk_text_view_get_visible_rect",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Fills {@code visible_rect} with the currently-visible
     * region of the buffer, in buffer coordinates.
     * <p>
     * Convert to window coordinates with
     * {@link TextView#bufferToWindowCoords}.
     */
    public void getVisibleRect(org.gtk.gdk.Rectangle visibleRect) {
        try {
            gtk_text_view_get_visible_rect.invokeExact(handle(), visibleRect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_get_wrap_mode = Interop.downcallHandle(
        "gtk_text_view_get_wrap_mode",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the line wrapping for the view.
     */
    public WrapMode getWrapMode() {
        try {
            var RESULT = (int) gtk_text_view_get_wrap_mode.invokeExact(handle());
            return new WrapMode(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_im_context_filter_keypress = Interop.downcallHandle(
        "gtk_text_view_im_context_filter_keypress",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Allow the {@code GtkTextView} input method to internally handle key press
     * and release events.
     * <p>
     * If this function returns {@code true}, then no further processing should be
     * done for this key event. See {@link IMContext#filterKeypress}.
     * <p>
     * Note that you are expected to call this function from your handler
     * when overriding key event handling. This is needed in the case when
     * you need to insert your own key handling between the input method
     * and the default key event handling of the {@code GtkTextView}.
     * <p>
     * <pre>{@code c
     * static gboolean
     * gtk_foo_bar_key_press_event (GtkWidget *widget,
     *                              GdkEvent  *event)
     * {
     *   guint keyval;
     * 
     *   gdk_event_get_keyval ((GdkEvent*)event, &keyval);
     * 
     *   if (keyval == GDK_KEY_Return || keyval == GDK_KEY_KP_Enter)
     *     {
     *       if (gtk_text_view_im_context_filter_keypress (GTK_TEXT_VIEW (widget), event))
     *         return TRUE;
     *     }
     * 
     *   // Do some stuff
     * 
     *   return GTK_WIDGET_CLASS (gtk_foo_bar_parent_class)->key_press_event (widget, event);
     * }
     * }</pre>
     */
    public boolean imContextFilterKeypress(org.gtk.gdk.Event event) {
        try {
            var RESULT = (int) gtk_text_view_im_context_filter_keypress.invokeExact(handle(), event.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_move_mark_onscreen = Interop.downcallHandle(
        "gtk_text_view_move_mark_onscreen",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Moves a mark within the buffer so that it's
     * located within the currently-visible text area.
     */
    public boolean moveMarkOnscreen(TextMark mark) {
        try {
            var RESULT = (int) gtk_text_view_move_mark_onscreen.invokeExact(handle(), mark.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_move_overlay = Interop.downcallHandle(
        "gtk_text_view_move_overlay",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Updates the position of a child.
     * <p>
     * See {@link TextView#addOverlay}.
     */
    public void moveOverlay(Widget child, int xpos, int ypos) {
        try {
            gtk_text_view_move_overlay.invokeExact(handle(), child.handle(), xpos, ypos);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_move_visually = Interop.downcallHandle(
        "gtk_text_view_move_visually",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Move the iterator a given number of characters visually, treating
     * it as the strong cursor position.
     * <p>
     * If {@code count} is positive, then the new strong cursor position will
     * be {@code count} positions to the right of the old cursor position.
     * If {@code count} is negative then the new strong cursor position will
     * be {@code count} positions to the left of the old cursor position.
     * <p>
     * In the presence of bi-directional text, the correspondence
     * between logical and visual order will depend on the direction
     * of the current run, and there may be jumps when the cursor
     * is moved off of the end of a run.
     */
    public boolean moveVisually(TextIter iter, int count) {
        try {
            var RESULT = (int) gtk_text_view_move_visually.invokeExact(handle(), iter.handle(), count);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_place_cursor_onscreen = Interop.downcallHandle(
        "gtk_text_view_place_cursor_onscreen",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Moves the cursor to the currently visible region of the
     * buffer.
     */
    public boolean placeCursorOnscreen() {
        try {
            var RESULT = (int) gtk_text_view_place_cursor_onscreen.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_remove = Interop.downcallHandle(
        "gtk_text_view_remove",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a child widget from {@code text_view}.
     */
    public void remove(Widget child) {
        try {
            gtk_text_view_remove.invokeExact(handle(), child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_reset_cursor_blink = Interop.downcallHandle(
        "gtk_text_view_reset_cursor_blink",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Ensures that the cursor is shown.
     * <p>
     * This also resets the time that it will stay blinking (or
     * visible, in case blinking is disabled).
     * <p>
     * This function should be called in response to user input
     * (e.g. from derived classes that override the textview's
     * event handlers).
     */
    public void resetCursorBlink() {
        try {
            gtk_text_view_reset_cursor_blink.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_reset_im_context = Interop.downcallHandle(
        "gtk_text_view_reset_im_context",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Reset the input method context of the text view if needed.
     * <p>
     * This can be necessary in the case where modifying the buffer
     * would confuse on-going input method behavior.
     */
    public void resetImContext() {
        try {
            gtk_text_view_reset_im_context.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_scroll_mark_onscreen = Interop.downcallHandle(
        "gtk_text_view_scroll_mark_onscreen",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Scrolls {@code text_view} the minimum distance such that {@code mark} is contained
     * within the visible area of the widget.
     */
    public void scrollMarkOnscreen(TextMark mark) {
        try {
            gtk_text_view_scroll_mark_onscreen.invokeExact(handle(), mark.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_scroll_to_iter = Interop.downcallHandle(
        "gtk_text_view_scroll_to_iter",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Scrolls {@code text_view} so that {@code iter} is on the screen in the position
     * indicated by {@code xalign} and {@code yalign}.
     * <p>
     * An alignment of 0.0 indicates left or top, 1.0 indicates right or
     * bottom, 0.5 means center. If {@code use_align} is {@code false}, the text scrolls
     * the minimal distance to get the mark onscreen, possibly not scrolling
     * at all. The effective screen for purposes of this function is reduced
     * by a margin of size {@code within_margin}.
     * <p>
     * Note that this function uses the currently-computed height of the
     * lines in the text buffer. Line heights are computed in an idle
     * handler; so this function may not have the desired effect if it’s
     * called before the height computations. To avoid oddness, consider
     * using {@link TextView#scrollToMark} which saves a point to be
     * scrolled to after line validation.
     */
    public boolean scrollToIter(TextIter iter, double withinMargin, boolean useAlign, double xalign, double yalign) {
        try {
            var RESULT = (int) gtk_text_view_scroll_to_iter.invokeExact(handle(), iter.handle(), withinMargin, useAlign ? 1 : 0, xalign, yalign);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_scroll_to_mark = Interop.downcallHandle(
        "gtk_text_view_scroll_to_mark",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Scrolls {@code text_view} so that {@code mark} is on the screen in the position
     * indicated by {@code xalign} and {@code yalign}.
     * <p>
     * An alignment of 0.0 indicates left or top, 1.0 indicates right or
     * bottom, 0.5 means center. If {@code use_align} is {@code false}, the text scrolls
     * the minimal distance to get the mark onscreen, possibly not scrolling
     * at all. The effective screen for purposes of this function is reduced
     * by a margin of size {@code within_margin}.
     */
    public void scrollToMark(TextMark mark, double withinMargin, boolean useAlign, double xalign, double yalign) {
        try {
            gtk_text_view_scroll_to_mark.invokeExact(handle(), mark.handle(), withinMargin, useAlign ? 1 : 0, xalign, yalign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_set_accepts_tab = Interop.downcallHandle(
        "gtk_text_view_set_accepts_tab",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the behavior of the text widget when the &lt;kbd>Tab</kbd&gt; key is pressed.
     * <p>
     * If {@code accepts_tab} is {@code true}, a tab character is inserted. If {@code accepts_tab}
     * is {@code false} the keyboard focus is moved to the next widget in the focus
     * chain.
     */
    public void setAcceptsTab(boolean acceptsTab) {
        try {
            gtk_text_view_set_accepts_tab.invokeExact(handle(), acceptsTab ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_set_bottom_margin = Interop.downcallHandle(
        "gtk_text_view_set_bottom_margin",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the bottom margin for text in {@code text_view}.
     * <p>
     * Note that this function is confusingly named.
     * In CSS terms, the value set here is padding.
     */
    public void setBottomMargin(int bottomMargin) {
        try {
            gtk_text_view_set_bottom_margin.invokeExact(handle(), bottomMargin);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_set_buffer = Interop.downcallHandle(
        "gtk_text_view_set_buffer",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code buffer} as the buffer being displayed by {@code text_view}.
     * <p>
     * The previous buffer displayed by the text view is unreferenced, and
     * a reference is added to {@code buffer}. If you owned a reference to {@code buffer}
     * before passing it to this function, you must remove that reference
     * yourself; {@code GtkTextView} will not “adopt” it.
     */
    public void setBuffer(TextBuffer buffer) {
        try {
            gtk_text_view_set_buffer.invokeExact(handle(), buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_set_cursor_visible = Interop.downcallHandle(
        "gtk_text_view_set_cursor_visible",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Toggles whether the insertion point should be displayed.
     * <p>
     * A buffer with no editable text probably shouldn’t have a visible
     * cursor, so you may want to turn the cursor off.
     * <p>
     * Note that this property may be overridden by the
     * {@code GtkSettings:gtk-keynav-use-caret} setting.
     */
    public void setCursorVisible(boolean setting) {
        try {
            gtk_text_view_set_cursor_visible.invokeExact(handle(), setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_set_editable = Interop.downcallHandle(
        "gtk_text_view_set_editable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the default editability of the {@code GtkTextView}.
     * <p>
     * You can override this default setting with tags in the buffer,
     * using the “editable” attribute of tags.
     */
    public void setEditable(boolean setting) {
        try {
            gtk_text_view_set_editable.invokeExact(handle(), setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_set_extra_menu = Interop.downcallHandle(
        "gtk_text_view_set_extra_menu",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a menu model to add when constructing the context
     * menu for {@code text_view}.
     * <p>
     * You can pass {@code null} to remove a previously set extra menu.
     */
    public void setExtraMenu(org.gtk.gio.MenuModel model) {
        try {
            gtk_text_view_set_extra_menu.invokeExact(handle(), model.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_set_gutter = Interop.downcallHandle(
        "gtk_text_view_set_gutter",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Places {@code widget} into the gutter specified by {@code win}.
     * <p>
     * {@code win} must be one of {@link TextWindowType#LEFT}, {@link TextWindowType#RIGHT},
     * {@link TextWindowType#TOP}, or {@link TextWindowType#BOTTOM}.
     */
    public void setGutter(TextWindowType win, Widget widget) {
        try {
            gtk_text_view_set_gutter.invokeExact(handle(), win.getValue(), widget.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_set_indent = Interop.downcallHandle(
        "gtk_text_view_set_indent",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the default indentation for paragraphs in {@code text_view}.
     * <p>
     * Tags in the buffer may override the default.
     */
    public void setIndent(int indent) {
        try {
            gtk_text_view_set_indent.invokeExact(handle(), indent);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_set_input_hints = Interop.downcallHandle(
        "gtk_text_view_set_input_hints",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the {@code input-hints} of the {@code GtkTextView}.
     * <p>
     * The {@code input-hints} allow input methods to fine-tune
     * their behaviour.
     */
    public void setInputHints(InputHints hints) {
        try {
            gtk_text_view_set_input_hints.invokeExact(handle(), hints.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_set_input_purpose = Interop.downcallHandle(
        "gtk_text_view_set_input_purpose",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the {@code input-purpose} of the {@code GtkTextView}.
     * <p>
     * The {@code input-purpose} can be used by on-screen keyboards
     * and other input methods to adjust their behaviour.
     */
    public void setInputPurpose(InputPurpose purpose) {
        try {
            gtk_text_view_set_input_purpose.invokeExact(handle(), purpose.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_set_justification = Interop.downcallHandle(
        "gtk_text_view_set_justification",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the default justification of text in {@code text_view}.
     * <p>
     * Tags in the view’s buffer may override the default.
     */
    public void setJustification(Justification justification) {
        try {
            gtk_text_view_set_justification.invokeExact(handle(), justification.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_set_left_margin = Interop.downcallHandle(
        "gtk_text_view_set_left_margin",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the default left margin for text in {@code text_view}.
     * <p>
     * Tags in the buffer may override the default.
     * <p>
     * Note that this function is confusingly named.
     * In CSS terms, the value set here is padding.
     */
    public void setLeftMargin(int leftMargin) {
        try {
            gtk_text_view_set_left_margin.invokeExact(handle(), leftMargin);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_set_monospace = Interop.downcallHandle(
        "gtk_text_view_set_monospace",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets whether the {@code GtkTextView} should display text in
     * monospace styling.
     */
    public void setMonospace(boolean monospace) {
        try {
            gtk_text_view_set_monospace.invokeExact(handle(), monospace ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_set_overwrite = Interop.downcallHandle(
        "gtk_text_view_set_overwrite",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Changes the {@code GtkTextView} overwrite mode.
     */
    public void setOverwrite(boolean overwrite) {
        try {
            gtk_text_view_set_overwrite.invokeExact(handle(), overwrite ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_set_pixels_above_lines = Interop.downcallHandle(
        "gtk_text_view_set_pixels_above_lines",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the default number of blank pixels above paragraphs in {@code text_view}.
     * <p>
     * Tags in the buffer for {@code text_view} may override the defaults.
     */
    public void setPixelsAboveLines(int pixelsAboveLines) {
        try {
            gtk_text_view_set_pixels_above_lines.invokeExact(handle(), pixelsAboveLines);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_set_pixels_below_lines = Interop.downcallHandle(
        "gtk_text_view_set_pixels_below_lines",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the default number of pixels of blank space
     * to put below paragraphs in {@code text_view}.
     * <p>
     * May be overridden by tags applied to {@code text_view}’s buffer.
     */
    public void setPixelsBelowLines(int pixelsBelowLines) {
        try {
            gtk_text_view_set_pixels_below_lines.invokeExact(handle(), pixelsBelowLines);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_set_pixels_inside_wrap = Interop.downcallHandle(
        "gtk_text_view_set_pixels_inside_wrap",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the default number of pixels of blank space to leave between
     * display/wrapped lines within a paragraph.
     * <p>
     * May be overridden by tags in {@code text_view}’s buffer.
     */
    public void setPixelsInsideWrap(int pixelsInsideWrap) {
        try {
            gtk_text_view_set_pixels_inside_wrap.invokeExact(handle(), pixelsInsideWrap);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_set_right_margin = Interop.downcallHandle(
        "gtk_text_view_set_right_margin",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the default right margin for text in the text view.
     * <p>
     * Tags in the buffer may override the default.
     * <p>
     * Note that this function is confusingly named.
     * In CSS terms, the value set here is padding.
     */
    public void setRightMargin(int rightMargin) {
        try {
            gtk_text_view_set_right_margin.invokeExact(handle(), rightMargin);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_set_tabs = Interop.downcallHandle(
        "gtk_text_view_set_tabs",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the default tab stops for paragraphs in {@code text_view}.
     * <p>
     * Tags in the buffer may override the default.
     */
    public void setTabs(org.pango.TabArray tabs) {
        try {
            gtk_text_view_set_tabs.invokeExact(handle(), tabs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_set_top_margin = Interop.downcallHandle(
        "gtk_text_view_set_top_margin",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the top margin for text in {@code text_view}.
     * <p>
     * Note that this function is confusingly named.
     * In CSS terms, the value set here is padding.
     */
    public void setTopMargin(int topMargin) {
        try {
            gtk_text_view_set_top_margin.invokeExact(handle(), topMargin);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_set_wrap_mode = Interop.downcallHandle(
        "gtk_text_view_set_wrap_mode",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the line wrapping for the view.
     */
    public void setWrapMode(WrapMode wrapMode) {
        try {
            gtk_text_view_set_wrap_mode.invokeExact(handle(), wrapMode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_starts_display_line = Interop.downcallHandle(
        "gtk_text_view_starts_display_line",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Determines whether {@code iter} is at the start of a display line.
     * <p>
     * See {@link TextView#forwardDisplayLine} for an
     * explanation of display lines vs. paragraphs.
     */
    public boolean startsDisplayLine(TextIter iter) {
        try {
            var RESULT = (int) gtk_text_view_starts_display_line.invokeExact(handle(), iter.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_text_view_window_to_buffer_coords = Interop.downcallHandle(
        "gtk_text_view_window_to_buffer_coords",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Converts coordinates on the window identified by {@code win} to buffer
     * coordinates.
     */
    public void windowToBufferCoords(TextWindowType win, int windowX, int windowY, PointerInteger bufferX, PointerInteger bufferY) {
        try {
            gtk_text_view_window_to_buffer_coords.invokeExact(handle(), win.getValue(), windowX, windowY, bufferX.handle(), bufferY.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface BackspaceHandler {
        void signalReceived(TextView source);
    }
    
    /**
     * Gets emitted when the user asks for it.
     * <p>
     * The ::backspace signal is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal are
     * &lt;kbd>Backspace</kbd> and <kbd>Shift</kbd>-<kbd>Backspace</kbd&gt;.
     */
    public SignalHandle onBackspace(BackspaceHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("backspace").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewBackspace",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface CopyClipboardHandler {
        void signalReceived(TextView source);
    }
    
    /**
     * Gets emitted to copy the selection to the clipboard.
     * <p>
     * The ::copy-clipboard signal is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal are
     * &lt;kbd>Ctrl</kbd>-<kbd>c</kbd&gt; and
     * &lt;kbd>Ctrl</kbd>-<kbd>Insert</kbd&gt;.
     */
    public SignalHandle onCopyClipboard(CopyClipboardHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("copy-clipboard").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewCopyClipboard",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface CutClipboardHandler {
        void signalReceived(TextView source);
    }
    
    /**
     * Gets emitted to cut the selection to the clipboard.
     * <p>
     * The ::cut-clipboard signal is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal are
     * &lt;kbd>Ctrl</kbd>-<kbd>x</kbd&gt; and
     * &lt;kbd>Shift</kbd>-<kbd>Delete</kbd&gt;.
     */
    public SignalHandle onCutClipboard(CutClipboardHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("cut-clipboard").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewCutClipboard",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DeleteFromCursorHandler {
        void signalReceived(TextView source, DeleteType type, int count);
    }
    
    /**
     * Gets emitted when the user initiates a text deletion.
     * <p>
     * The ::delete-from-cursor signal is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * If the {@code type} is {@link DeleteType#CHARS}, GTK deletes the selection
     * if there is one, otherwise it deletes the requested number
     * of characters.
     * <p>
     * The default bindings for this signal are &lt;kbd>Delete</kbd&gt; for
     * deleting a character, &lt;kbd>Ctrl</kbd>-<kbd>Delete</kbd&gt; for
     * deleting a word and &lt;kbd>Ctrl</kbd>-<kbd>Backspace</kbd&gt; for
     * deleting a word backwards.
     */
    public SignalHandle onDeleteFromCursor(DeleteFromCursorHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("delete-from-cursor").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewDeleteFromCursor",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ExtendSelectionHandler {
        boolean signalReceived(TextView source, TextExtendSelection granularity, TextIter location, TextIter start, TextIter end);
    }
    
    /**
     * Emitted when the selection needs to be extended at {@code location}.
     */
    public SignalHandle onExtendSelection(ExtendSelectionHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("extend-selection").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewExtendSelection",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InsertAtCursorHandler {
        void signalReceived(TextView source, java.lang.String string);
    }
    
    /**
     * Gets emitted when the user initiates the insertion of a
     * fixed string at the cursor.
     * <p>
     * The ::insert-at-cursor signal is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * This signal has no default bindings.
     */
    public SignalHandle onInsertAtCursor(InsertAtCursorHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("insert-at-cursor").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewInsertAtCursor",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InsertEmojiHandler {
        void signalReceived(TextView source);
    }
    
    /**
     * Gets emitted to present the Emoji chooser for the {@code text_view}.
     * <p>
     * The ::insert-emoji signal is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal are
     * &lt;kbd>Ctrl</kbd>-<kbd>.</kbd&gt; and
     * &lt;kbd>Ctrl</kbd>-<kbd>;</kbd&gt;
     */
    public SignalHandle onInsertEmoji(InsertEmojiHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("insert-emoji").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewInsertEmoji",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MoveCursorHandler {
        void signalReceived(TextView source, MovementStep step, int count, boolean extendSelection);
    }
    
    /**
     * Gets emitted when the user initiates a cursor movement.
     * <p>
     * The ::move-cursor signal is a <a href="class.SignalAction.html">keybinding signal</a>.
     * If the cursor is not visible in {@code text_view}, this signal causes
     * the viewport to be moved instead.
     * <p>
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control the cursor
     * programmatically.
     * <p>
     * 
     * The default bindings for this signal come in two variants,
     * the variant with the &lt;kbd>Shift</kbd&gt; modifier extends the
     * selection, the variant without it does not.
     * There are too many key combinations to list them all here.
     * <p>
     * <ul>
     * <li>&lt;kbd>←</kbd>, <kbd>→</kbd>, <kbd>↑</kbd>, <kbd>↓</kbd&gt;
     *   move by individual characters/lines
     * <li>&lt;kbd>Ctrl</kbd>-<kbd>→</kbd&gt;, etc. move by words/paragraphs
     * <li>&lt;kbd>Home</kbd>, <kbd>End</kbd&gt; move to the ends of the buffer
     * <li>&lt;kbd>PgUp</kbd>, <kbd>PgDn</kbd&gt; move vertically by pages
     * <li>&lt;kbd>Ctrl</kbd>-<kbd>PgUp</kbd>, <kbd>Ctrl</kbd>-<kbd>PgDn</kbd&gt;
     *   move horizontally by pages
     */
    public SignalHandle onMoveCursor(MoveCursorHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("move-cursor").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewMoveCursor",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MoveViewportHandler {
        void signalReceived(TextView source, ScrollStep step, int count);
    }
    
    /**
     * Gets emitted to move the viewport.
     * <p>
     * The ::move-viewport signal is a <a href="class.SignalAction.html">keybinding signal</a>,
     * which can be bound to key combinations to allow the user to move the viewport,
     * i.e. change what part of the text view is visible in a containing scrolled
     * window.
     * <p>
     * There are no default bindings for this signal.
     */
    public SignalHandle onMoveViewport(MoveViewportHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("move-viewport").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewMoveViewport",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PasteClipboardHandler {
        void signalReceived(TextView source);
    }
    
    /**
     * Gets emitted to paste the contents of the clipboard
     * into the text view.
     * <p>
     * The ::paste-clipboard signal is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal are
     * &lt;kbd>Ctrl</kbd>-<kbd>v</kbd&gt; and
     * &lt;kbd>Shift</kbd>-<kbd>Insert</kbd&gt;.
     */
    public SignalHandle onPasteClipboard(PasteClipboardHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("paste-clipboard").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewPasteClipboard",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PreeditChangedHandler {
        void signalReceived(TextView source, java.lang.String preedit);
    }
    
    /**
     * Emitted when preedit text of the active IM changes.
     * <p>
     * If an input method is used, the typed text will not immediately
     * be committed to the buffer. So if you are interested in the text,
     * connect to this signal.
     * <p>
     * This signal is only emitted if the text at the given position
     * is actually editable.
     */
    public SignalHandle onPreeditChanged(PreeditChangedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("preedit-changed").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewPreeditChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SelectAllHandler {
        void signalReceived(TextView source, boolean select);
    }
    
    /**
     * Gets emitted to select or unselect the complete contents of the text view.
     * <p>
     * The ::select-all signal is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal are
     * &lt;kbd>Ctrl</kbd>-<kbd>a</kbd&gt; and
     * &lt;kbd>Ctrl</kbd>-<kbd>/</kbd&gt; for selecting and
     * &lt;kbd>Shift</kbd>-<kbd>Ctrl</kbd>-<kbd>a</kbd&gt; and
     * &lt;kbd>Ctrl</kbd>-<kbd>\\</kbd&gt; for unselecting.
     */
    public SignalHandle onSelectAll(SelectAllHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("select-all").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewSelectAll",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SetAnchorHandler {
        void signalReceived(TextView source);
    }
    
    /**
     * Gets emitted when the user initiates settings the "anchor" mark.
     * <p>
     * The ::set-anchor signal is a <a href="class.SignalAction.html">keybinding signal</a>
     * which gets emitted when the user initiates setting the "anchor"
     * mark. The "anchor" mark gets placed at the same position as the
     * "insert" mark.
     * <p>
     * This signal has no default bindings.
     */
    public SignalHandle onSetAnchor(SetAnchorHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("set-anchor").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewSetAnchor",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ToggleCursorVisibleHandler {
        void signalReceived(TextView source);
    }
    
    /**
     * Gets emitted to toggle the {@code cursor-visible} property.
     * <p>
     * The ::toggle-cursor-visible signal is a
     * <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is &lt;kbd>F7</kbd&gt;.
     */
    public SignalHandle onToggleCursorVisible(ToggleCursorVisibleHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("toggle-cursor-visible").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewToggleCursorVisible",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ToggleOverwriteHandler {
        void signalReceived(TextView source);
    }
    
    /**
     * Gets emitted to toggle the overwrite mode of the text view.
     * <p>
     * The ::toggle-overwrite signal is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is &lt;kbd>Insert</kbd&gt;.
     */
    public SignalHandle onToggleOverwrite(ToggleOverwriteHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("toggle-overwrite").handle(),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewToggleOverwrite",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalTextViewBackspace(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextView.BackspaceHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextView(Refcounted.get(source)));
        }
        
        public static void signalTextViewCopyClipboard(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextView.CopyClipboardHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextView(Refcounted.get(source)));
        }
        
        public static void signalTextViewCutClipboard(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextView.CutClipboardHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextView(Refcounted.get(source)));
        }
        
        public static void signalTextViewDeleteFromCursor(MemoryAddress source, int type, int count, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextView.DeleteFromCursorHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextView(Refcounted.get(source)), new DeleteType(type), count);
        }
        
        public static boolean signalTextViewExtendSelection(MemoryAddress source, int granularity, MemoryAddress location, MemoryAddress start, MemoryAddress end, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextView.ExtendSelectionHandler) Interop.signalRegistry.get(hash);
            return handler.signalReceived(new TextView(Refcounted.get(source)), new TextExtendSelection(granularity), new TextIter(Refcounted.get(location, false)), new TextIter(Refcounted.get(start, false)), new TextIter(Refcounted.get(end, false)));
        }
        
        public static void signalTextViewInsertAtCursor(MemoryAddress source, MemoryAddress string, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextView.InsertAtCursorHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextView(Refcounted.get(source)), string.getUtf8String(0));
        }
        
        public static void signalTextViewInsertEmoji(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextView.InsertEmojiHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextView(Refcounted.get(source)));
        }
        
        public static void signalTextViewMoveCursor(MemoryAddress source, int step, int count, int extendSelection, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextView.MoveCursorHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextView(Refcounted.get(source)), new MovementStep(step), count, extendSelection != 0);
        }
        
        public static void signalTextViewMoveViewport(MemoryAddress source, int step, int count, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextView.MoveViewportHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextView(Refcounted.get(source)), new ScrollStep(step), count);
        }
        
        public static void signalTextViewPasteClipboard(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextView.PasteClipboardHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextView(Refcounted.get(source)));
        }
        
        public static void signalTextViewPreeditChanged(MemoryAddress source, MemoryAddress preedit, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextView.PreeditChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextView(Refcounted.get(source)), preedit.getUtf8String(0));
        }
        
        public static void signalTextViewSelectAll(MemoryAddress source, int select, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextView.SelectAllHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextView(Refcounted.get(source)), select != 0);
        }
        
        public static void signalTextViewSetAnchor(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextView.SetAnchorHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextView(Refcounted.get(source)));
        }
        
        public static void signalTextViewToggleCursorVisible(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextView.ToggleCursorVisibleHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextView(Refcounted.get(source)));
        }
        
        public static void signalTextViewToggleOverwrite(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextView.ToggleOverwriteHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextView(Refcounted.get(source)));
        }
        
    }
}
