package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A widget that displays the contents of a {@link TextBuffer}.
 * <p>
 * <img src="./doc-files/multiline-text.png" alt="An example GtkTextview">
 * <p>
 * You may wish to begin by reading the <a href="section-text-widget.html">conceptual overview</a>,
 * which gives an overview of all the objects and data types related to the
 * text widget and how they work together.
 * <p>
 * <strong>CSS nodes</strong><br/>
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
 * <strong>Accessibility</strong><br/>
 * {@code GtkTextView} uses the {@link AccessibleRole#TEXT_BOX} role.
 */
public class TextView extends org.gtk.gtk.Widget implements org.gtk.gtk.Accessible, org.gtk.gtk.Buildable, org.gtk.gtk.ConstraintTarget, org.gtk.gtk.Scrollable {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTextView";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.Widget.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a TextView proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TextView(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TextView> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TextView(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_view_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
        this.refSink();
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewWithBuffer(org.gtk.gtk.TextBuffer buffer) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_view_new_with_buffer.invokeExact(buffer.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a new {@code GtkTextView} widget displaying the buffer {@code buffer}.
     * <p>
     * One buffer can be shared among many widgets. {@code buffer} may be {@code null}
     * to create a default buffer, in which case this function is equivalent
     * to {@link TextView#TextView}. The text view adds its own reference count
     * to the buffer; it does not take over an existing reference.
     * @param buffer a {@code GtkTextBuffer}
     * @return a new {@code GtkTextView}.
     */
    public static TextView newWithBuffer(org.gtk.gtk.TextBuffer buffer) {
        var RESULT = constructNewWithBuffer(buffer);
        var OBJECT = (org.gtk.gtk.TextView) Interop.register(RESULT, org.gtk.gtk.TextView.fromAddress).marshal(RESULT, null);
        OBJECT.refSink();
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Adds a child widget in the text buffer, at the given {@code anchor}.
     * @param child a {@code GtkWidget}
     * @param anchor a {@code GtkTextChildAnchor} in the {@code GtkTextBuffer} for {@code text_view}
     */
    public void addChildAtAnchor(org.gtk.gtk.Widget child, org.gtk.gtk.TextChildAnchor anchor) {
        try {
            DowncallHandles.gtk_text_view_add_child_at_anchor.invokeExact(
                    handle(),
                    child.handle(),
                    anchor.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param child a {@code GtkWidget}
     * @param xpos X position of child in window coordinates
     * @param ypos Y position of child in window coordinates
     */
    public void addOverlay(org.gtk.gtk.Widget child, int xpos, int ypos) {
        try {
            DowncallHandles.gtk_text_view_add_overlay.invokeExact(
                    handle(),
                    child.handle(),
                    xpos,
                    ypos);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param iter a {@code GtkTextIter}
     * @return {@code true} if {@code iter} was moved and is not on the end iterator
     */
    public boolean backwardDisplayLine(org.gtk.gtk.TextIter iter) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_backward_display_line.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
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
     * @param iter a {@code GtkTextIter}
     * @return {@code true} if {@code iter} was moved and is not on the end iterator
     */
    public boolean backwardDisplayLineStart(org.gtk.gtk.TextIter iter) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_backward_display_line_start.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Converts buffer coordinates to window coordinates.
     * @param win a {@code GtkTextWindowType}
     * @param bufferX buffer x coordinate
     * @param bufferY buffer y coordinate
     * @param windowX window x coordinate return location
     * @param windowY window y coordinate return location
     */
    public void bufferToWindowCoords(org.gtk.gtk.TextWindowType win, int bufferX, int bufferY, Out<Integer> windowX, Out<Integer> windowY) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment windowXPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment windowYPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gtk_text_view_buffer_to_window_coords.invokeExact(
                        handle(),
                        win.getValue(),
                        bufferX,
                        bufferY,
                        (Addressable) (windowX == null ? MemoryAddress.NULL : (Addressable) windowXPOINTER.address()),
                        (Addressable) (windowY == null ? MemoryAddress.NULL : (Addressable) windowYPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (windowX != null) windowX.set(windowXPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (windowY != null) windowY.set(windowYPOINTER.get(Interop.valueLayout.C_INT, 0));
        }
    }
    
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
     * @param iter a {@code GtkTextIter}
     * @return {@code true} if {@code iter} was moved and is not on the end iterator
     */
    public boolean forwardDisplayLine(org.gtk.gtk.TextIter iter) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_forward_display_line.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
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
     * @param iter a {@code GtkTextIter}
     * @return {@code true} if {@code iter} was moved and is not on the end iterator
     */
    public boolean forwardDisplayLineEnd(org.gtk.gtk.TextIter iter) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_forward_display_line_end.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns whether pressing the &lt;kbd&gt;Tab&lt;/kbd&gt; key inserts a tab characters.
     * <p>
     * See {@link TextView#setAcceptsTab}.
     * @return {@code true} if pressing the Tab key inserts a tab character,
     *   {@code false} if pressing the Tab key moves the keyboard focus.
     */
    public boolean getAcceptsTab() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_get_accepts_tab.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the bottom margin for text in the {@code text_view}.
     * @return bottom margin in pixels
     */
    public int getBottomMargin() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_get_bottom_margin.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the {@code GtkTextBuffer} being displayed by this text view.
     * <p>
     * The reference count on the buffer is not incremented; the caller
     * of this function won’t own a new reference.
     * @return a {@code GtkTextBuffer}
     */
    public org.gtk.gtk.TextBuffer getBuffer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_view_get_buffer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.TextBuffer) Interop.register(RESULT, org.gtk.gtk.TextBuffer.fromAddress).marshal(RESULT, null);
    }
    
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
     * @param iter a {@code GtkTextIter}
     * @param strong location to store the strong cursor position
     * @param weak location to store the weak cursor position
     */
    public void getCursorLocations(@Nullable org.gtk.gtk.TextIter iter, @Nullable org.gtk.gdk.Rectangle strong, @Nullable org.gtk.gdk.Rectangle weak) {
        try {
            DowncallHandles.gtk_text_view_get_cursor_locations.invokeExact(
                    handle(),
                    (Addressable) (iter == null ? MemoryAddress.NULL : iter.handle()),
                    (Addressable) (strong == null ? MemoryAddress.NULL : strong.handle()),
                    (Addressable) (weak == null ? MemoryAddress.NULL : weak.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Find out whether the cursor should be displayed.
     * @return whether the insertion mark is visible
     */
    public boolean getCursorVisible() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_get_cursor_visible.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns the default editability of the {@code GtkTextView}.
     * <p>
     * Tags in the buffer may override this setting for some ranges of text.
     * @return whether text is editable by default
     */
    public boolean getEditable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_get_editable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the menu model that gets added to the context menu
     * or {@code null} if none has been set.
     * @return the menu model
     */
    public org.gtk.gio.MenuModel getExtraMenu() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_view_get_extra_menu.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gio.MenuModel) Interop.register(RESULT, org.gtk.gio.MenuModel.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets a {@code GtkWidget} that has previously been set as gutter.
     * <p>
     * See {@link TextView#setGutter}.
     * <p>
     * {@code win} must be one of {@link TextWindowType#LEFT}, {@link TextWindowType#RIGHT},
     * {@link TextWindowType#TOP}, or {@link TextWindowType#BOTTOM}.
     * @param win a {@code GtkTextWindowType}
     * @return a {@code GtkWidget}
     */
    public @Nullable org.gtk.gtk.Widget getGutter(org.gtk.gtk.TextWindowType win) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_view_get_gutter.invokeExact(
                    handle(),
                    win.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gtk.Widget) Interop.register(RESULT, org.gtk.gtk.Widget.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the default indentation of paragraphs in {@code text_view}.
     * <p>
     * Tags in the view’s buffer may override the default.
     * The indentation may be negative.
     * @return number of pixels of indentation
     */
    public int getIndent() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_get_indent.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the {@code input-hints} of the {@code GtkTextView}.
     */
    public org.gtk.gtk.InputHints getInputHints() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_get_input_hints.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.InputHints(RESULT);
    }
    
    /**
     * Gets the {@code input-purpose} of the {@code GtkTextView}.
     */
    public org.gtk.gtk.InputPurpose getInputPurpose() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_get_input_purpose.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.InputPurpose.of(RESULT);
    }
    
    /**
     * Retrieves the iterator at buffer coordinates {@code x} and {@code y}.
     * <p>
     * Buffer coordinates are coordinates for the entire buffer, not just
     * the currently-displayed portion. If you have coordinates from an
     * event, you have to convert those to buffer coordinates with
     * {@link TextView#windowToBufferCoords}.
     * @param iter a {@code GtkTextIter}
     * @param x x position, in buffer coordinates
     * @param y y position, in buffer coordinates
     * @return {@code true} if the position is over text
     */
    public boolean getIterAtLocation(org.gtk.gtk.TextIter iter, int x, int y) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_get_iter_at_location.invokeExact(
                    handle(),
                    iter.handle(),
                    x,
                    y);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Retrieves the iterator pointing to the character at buffer
     * coordinates {@code x} and {@code y}.
     * <p>
     * Buffer coordinates are coordinates for the entire buffer, not just
     * the currently-displayed portion. If you have coordinates from an event,
     * you have to convert those to buffer coordinates with
     * {@link TextView#windowToBufferCoords}.
     * <p>
     * Note that this is different from {@link TextView#getIterAtLocation},
     * which returns cursor locations, i.e. positions between characters.
     * @param iter a {@code GtkTextIter}
     * @param trailing if non-{@code null}, location to store
     *    an integer indicating where in the grapheme the user clicked.
     *    It will either be zero, or the number of characters in the grapheme.
     *    0 represents the trailing edge of the grapheme.
     * @param x x position, in buffer coordinates
     * @param y y position, in buffer coordinates
     * @return {@code true} if the position is over text
     */
    public boolean getIterAtPosition(org.gtk.gtk.TextIter iter, Out<Integer> trailing, int x, int y) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment trailingPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gtk_text_view_get_iter_at_position.invokeExact(
                        handle(),
                        iter.handle(),
                        (Addressable) (trailing == null ? MemoryAddress.NULL : (Addressable) trailingPOINTER.address()),
                        x,
                        y);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (trailing != null) trailing.set(trailingPOINTER.get(Interop.valueLayout.C_INT, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Gets a rectangle which roughly contains the character at {@code iter}.
     * <p>
     * The rectangle position is in buffer coordinates; use
     * {@link TextView#bufferToWindowCoords} to convert these
     * coordinates to coordinates for one of the windows in the text view.
     * @param iter a {@code GtkTextIter}
     * @param location bounds of the character at {@code iter}
     */
    public void getIterLocation(org.gtk.gtk.TextIter iter, org.gtk.gdk.Rectangle location) {
        try {
            DowncallHandles.gtk_text_view_get_iter_location.invokeExact(
                    handle(),
                    iter.handle(),
                    location.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the default justification of paragraphs in {@code text_view}.
     * <p>
     * Tags in the buffer may override the default.
     * @return default justification
     */
    public org.gtk.gtk.Justification getJustification() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_get_justification.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.Justification.of(RESULT);
    }
    
    /**
     * Gets the default left margin size of paragraphs in the {@code text_view}.
     * <p>
     * Tags in the buffer may override the default.
     * @return left margin in pixels
     */
    public int getLeftMargin() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_get_left_margin.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the {@code GtkTextIter} at the start of the line containing
     * the coordinate {@code y}.
     * <p>
     * {@code y} is in buffer coordinates, convert from window coordinates with
     * {@link TextView#windowToBufferCoords}. If non-{@code null},
     * {@code line_top} will be filled with the coordinate of the top edge
     * of the line.
     * @param targetIter a {@code GtkTextIter}
     * @param y a y coordinate
     * @param lineTop return location for top coordinate of the line
     */
    public void getLineAtY(org.gtk.gtk.TextIter targetIter, int y, Out<Integer> lineTop) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment lineTopPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gtk_text_view_get_line_at_y.invokeExact(
                        handle(),
                        targetIter.handle(),
                        y,
                        (Addressable) lineTopPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    lineTop.set(lineTopPOINTER.get(Interop.valueLayout.C_INT, 0));
        }
    }
    
    /**
     * Gets the y coordinate of the top of the line containing {@code iter},
     * and the height of the line.
     * <p>
     * The coordinate is a buffer coordinate; convert to window
     * coordinates with {@link TextView#bufferToWindowCoords}.
     * @param iter a {@code GtkTextIter}
     * @param y return location for a y coordinate
     * @param height return location for a height
     */
    public void getLineYrange(org.gtk.gtk.TextIter iter, Out<Integer> y, Out<Integer> height) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment yPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment heightPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gtk_text_view_get_line_yrange.invokeExact(
                        handle(),
                        iter.handle(),
                        (Addressable) yPOINTER.address(),
                        (Addressable) heightPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    y.set(yPOINTER.get(Interop.valueLayout.C_INT, 0));
                    height.set(heightPOINTER.get(Interop.valueLayout.C_INT, 0));
        }
    }
    
    /**
     * Gets the {@code PangoContext} that is used for rendering LTR directed
     * text layouts.
     * <p>
     * The context may be replaced when CSS changes occur.
     * @return a {@code PangoContext}
     */
    public org.pango.Context getLtrContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_view_get_ltr_context.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.pango.Context) Interop.register(RESULT, org.pango.Context.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets whether the {@code GtkTextView} uses monospace styling.
     * @return {@code true} if monospace fonts are desired
     */
    public boolean getMonospace() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_get_monospace.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Returns whether the {@code GtkTextView} is in overwrite mode or not.
     * @return whether {@code text_view} is in overwrite mode or not.
     */
    public boolean getOverwrite() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_get_overwrite.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the default number of pixels to put above paragraphs.
     * <p>
     * Adding this function with {@link TextView#getPixelsBelowLines}
     * is equal to the line space between each paragraph.
     * @return default number of pixels above paragraphs
     */
    public int getPixelsAboveLines() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_get_pixels_above_lines.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the default number of pixels to put below paragraphs.
     * <p>
     * The line space is the sum of the value returned by this function and
     * the value returned by {@link TextView#getPixelsAboveLines}.
     * @return default number of blank pixels below paragraphs
     */
    public int getPixelsBelowLines() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_get_pixels_below_lines.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the default number of pixels to put between wrapped lines
     * inside a paragraph.
     * @return default number of pixels of blank space between wrapped lines
     */
    public int getPixelsInsideWrap() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_get_pixels_inside_wrap.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the default right margin for text in {@code text_view}.
     * <p>
     * Tags in the buffer may override the default.
     * @return right margin in pixels
     */
    public int getRightMargin() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_get_right_margin.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the {@code PangoContext} that is used for rendering RTL directed
     * text layouts.
     * <p>
     * The context may be replaced when CSS changes occur.
     * @return a {@code PangoContext}
     */
    public org.pango.Context getRtlContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_view_get_rtl_context.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.pango.Context) Interop.register(RESULT, org.pango.Context.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Gets the default tabs for {@code text_view}.
     * <p>
     * Tags in the buffer may override the defaults. The returned array
     * will be {@code null} if “standard” (8-space) tabs are used. Free the
     * return value with {@link org.pango.TabArray#free}.
     * @return copy of default tab array,
     *   or {@code null} if standard tabs are used; must be freed with
     *   {@link org.pango.TabArray#free}.
     */
    public @Nullable org.pango.TabArray getTabs() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_view_get_tabs.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.pango.TabArray.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets the top margin for text in the {@code text_view}.
     * @return top margin in pixels
     */
    public int getTopMargin() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_get_top_margin.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Fills {@code visible_rect} with the currently-visible
     * region of the buffer, in buffer coordinates.
     * <p>
     * Convert to window coordinates with
     * {@link TextView#bufferToWindowCoords}.
     * @param visibleRect rectangle to fill
     */
    public void getVisibleRect(org.gtk.gdk.Rectangle visibleRect) {
        try {
            DowncallHandles.gtk_text_view_get_visible_rect.invokeExact(
                    handle(),
                    visibleRect.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets the line wrapping for the view.
     * @return the line wrap setting
     */
    public org.gtk.gtk.WrapMode getWrapMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_get_wrap_mode.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gtk.WrapMode.of(RESULT);
    }
    
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
     * @param event the key event
     * @return {@code true} if the input method handled the key event.
     */
    public boolean imContextFilterKeypress(org.gtk.gdk.Event event) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_im_context_filter_keypress.invokeExact(
                    handle(),
                    event.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Moves a mark within the buffer so that it's
     * located within the currently-visible text area.
     * @param mark a {@code GtkTextMark}
     * @return {@code true} if the mark moved (wasn’t already onscreen)
     */
    public boolean moveMarkOnscreen(org.gtk.gtk.TextMark mark) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_move_mark_onscreen.invokeExact(
                    handle(),
                    mark.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Updates the position of a child.
     * <p>
     * See {@link TextView#addOverlay}.
     * @param child a widget already added with {@link TextView#addOverlay}
     * @param xpos new X position in buffer coordinates
     * @param ypos new Y position in buffer coordinates
     */
    public void moveOverlay(org.gtk.gtk.Widget child, int xpos, int ypos) {
        try {
            DowncallHandles.gtk_text_view_move_overlay.invokeExact(
                    handle(),
                    child.handle(),
                    xpos,
                    ypos);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param iter a {@code GtkTextIter}
     * @param count number of characters to move (negative moves left,
     *    positive moves right)
     * @return {@code true} if {@code iter} moved and is not on the end iterator
     */
    public boolean moveVisually(org.gtk.gtk.TextIter iter, int count) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_move_visually.invokeExact(
                    handle(),
                    iter.handle(),
                    count);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Moves the cursor to the currently visible region of the
     * buffer.
     * @return {@code true} if the cursor had to be moved.
     */
    public boolean placeCursorOnscreen() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_place_cursor_onscreen.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Removes a child widget from {@code text_view}.
     * @param child the child to remove
     */
    public void remove(org.gtk.gtk.Widget child) {
        try {
            DowncallHandles.gtk_text_view_remove.invokeExact(
                    handle(),
                    child.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
            DowncallHandles.gtk_text_view_reset_cursor_blink.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Reset the input method context of the text view if needed.
     * <p>
     * This can be necessary in the case where modifying the buffer
     * would confuse on-going input method behavior.
     */
    public void resetImContext() {
        try {
            DowncallHandles.gtk_text_view_reset_im_context.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Scrolls {@code text_view} the minimum distance such that {@code mark} is contained
     * within the visible area of the widget.
     * @param mark a mark in the buffer for {@code text_view}
     */
    public void scrollMarkOnscreen(org.gtk.gtk.TextMark mark) {
        try {
            DowncallHandles.gtk_text_view_scroll_mark_onscreen.invokeExact(
                    handle(),
                    mark.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param iter a {@code GtkTextIter}
     * @param withinMargin margin as a [0.0,0.5) fraction of screen size
     * @param useAlign whether to use alignment arguments (if {@code false},
     *    just get the mark onscreen)
     * @param xalign horizontal alignment of mark within visible area
     * @param yalign vertical alignment of mark within visible area
     * @return {@code true} if scrolling occurred
     */
    public boolean scrollToIter(org.gtk.gtk.TextIter iter, double withinMargin, boolean useAlign, double xalign, double yalign) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_scroll_to_iter.invokeExact(
                    handle(),
                    iter.handle(),
                    withinMargin,
                    Marshal.booleanToInteger.marshal(useAlign, null).intValue(),
                    xalign,
                    yalign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Scrolls {@code text_view} so that {@code mark} is on the screen in the position
     * indicated by {@code xalign} and {@code yalign}.
     * <p>
     * An alignment of 0.0 indicates left or top, 1.0 indicates right or
     * bottom, 0.5 means center. If {@code use_align} is {@code false}, the text scrolls
     * the minimal distance to get the mark onscreen, possibly not scrolling
     * at all. The effective screen for purposes of this function is reduced
     * by a margin of size {@code within_margin}.
     * @param mark a {@code GtkTextMark}
     * @param withinMargin margin as a [0.0,0.5) fraction of screen size
     * @param useAlign whether to use alignment arguments (if {@code false}, just
     *    get the mark onscreen)
     * @param xalign horizontal alignment of mark within visible area
     * @param yalign vertical alignment of mark within visible area
     */
    public void scrollToMark(org.gtk.gtk.TextMark mark, double withinMargin, boolean useAlign, double xalign, double yalign) {
        try {
            DowncallHandles.gtk_text_view_scroll_to_mark.invokeExact(
                    handle(),
                    mark.handle(),
                    withinMargin,
                    Marshal.booleanToInteger.marshal(useAlign, null).intValue(),
                    xalign,
                    yalign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the behavior of the text widget when the &lt;kbd&gt;Tab&lt;/kbd&gt; key is pressed.
     * <p>
     * If {@code accepts_tab} is {@code true}, a tab character is inserted. If {@code accepts_tab}
     * is {@code false} the keyboard focus is moved to the next widget in the focus
     * chain.
     * @param acceptsTab {@code true} if pressing the Tab key should insert a tab
     *    character, {@code false}, if pressing the Tab key should move the
     *    keyboard focus.
     */
    public void setAcceptsTab(boolean acceptsTab) {
        try {
            DowncallHandles.gtk_text_view_set_accepts_tab.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(acceptsTab, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the bottom margin for text in {@code text_view}.
     * <p>
     * Note that this function is confusingly named.
     * In CSS terms, the value set here is padding.
     * @param bottomMargin bottom margin in pixels
     */
    public void setBottomMargin(int bottomMargin) {
        try {
            DowncallHandles.gtk_text_view_set_bottom_margin.invokeExact(
                    handle(),
                    bottomMargin);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code buffer} as the buffer being displayed by {@code text_view}.
     * <p>
     * The previous buffer displayed by the text view is unreferenced, and
     * a reference is added to {@code buffer}. If you owned a reference to {@code buffer}
     * before passing it to this function, you must remove that reference
     * yourself; {@code GtkTextView} will not “adopt” it.
     * @param buffer a {@code GtkTextBuffer}
     */
    public void setBuffer(@Nullable org.gtk.gtk.TextBuffer buffer) {
        try {
            DowncallHandles.gtk_text_view_set_buffer.invokeExact(
                    handle(),
                    (Addressable) (buffer == null ? MemoryAddress.NULL : buffer.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Toggles whether the insertion point should be displayed.
     * <p>
     * A buffer with no editable text probably shouldn’t have a visible
     * cursor, so you may want to turn the cursor off.
     * <p>
     * Note that this property may be overridden by the
     * {@code GtkSettings:gtk-keynav-use-caret} setting.
     * @param setting whether to show the insertion cursor
     */
    public void setCursorVisible(boolean setting) {
        try {
            DowncallHandles.gtk_text_view_set_cursor_visible.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(setting, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the default editability of the {@code GtkTextView}.
     * <p>
     * You can override this default setting with tags in the buffer,
     * using the “editable” attribute of tags.
     * @param setting whether it’s editable
     */
    public void setEditable(boolean setting) {
        try {
            DowncallHandles.gtk_text_view_set_editable.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(setting, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a menu model to add when constructing the context
     * menu for {@code text_view}.
     * <p>
     * You can pass {@code null} to remove a previously set extra menu.
     * @param model a {@code GMenuModel}
     */
    public void setExtraMenu(@Nullable org.gtk.gio.MenuModel model) {
        try {
            DowncallHandles.gtk_text_view_set_extra_menu.invokeExact(
                    handle(),
                    (Addressable) (model == null ? MemoryAddress.NULL : model.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Places {@code widget} into the gutter specified by {@code win}.
     * <p>
     * {@code win} must be one of {@link TextWindowType#LEFT}, {@link TextWindowType#RIGHT},
     * {@link TextWindowType#TOP}, or {@link TextWindowType#BOTTOM}.
     * @param win a {@code GtkTextWindowType}
     * @param widget a {@code GtkWidget}
     */
    public void setGutter(org.gtk.gtk.TextWindowType win, @Nullable org.gtk.gtk.Widget widget) {
        try {
            DowncallHandles.gtk_text_view_set_gutter.invokeExact(
                    handle(),
                    win.getValue(),
                    (Addressable) (widget == null ? MemoryAddress.NULL : widget.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the default indentation for paragraphs in {@code text_view}.
     * <p>
     * Tags in the buffer may override the default.
     * @param indent indentation in pixels
     */
    public void setIndent(int indent) {
        try {
            DowncallHandles.gtk_text_view_set_indent.invokeExact(
                    handle(),
                    indent);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code input-hints} of the {@code GtkTextView}.
     * <p>
     * The {@code input-hints} allow input methods to fine-tune
     * their behaviour.
     * @param hints the hints
     */
    public void setInputHints(org.gtk.gtk.InputHints hints) {
        try {
            DowncallHandles.gtk_text_view_set_input_hints.invokeExact(
                    handle(),
                    hints.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the {@code input-purpose} of the {@code GtkTextView}.
     * <p>
     * The {@code input-purpose} can be used by on-screen keyboards
     * and other input methods to adjust their behaviour.
     * @param purpose the purpose
     */
    public void setInputPurpose(org.gtk.gtk.InputPurpose purpose) {
        try {
            DowncallHandles.gtk_text_view_set_input_purpose.invokeExact(
                    handle(),
                    purpose.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the default justification of text in {@code text_view}.
     * <p>
     * Tags in the view’s buffer may override the default.
     * @param justification justification
     */
    public void setJustification(org.gtk.gtk.Justification justification) {
        try {
            DowncallHandles.gtk_text_view_set_justification.invokeExact(
                    handle(),
                    justification.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the default left margin for text in {@code text_view}.
     * <p>
     * Tags in the buffer may override the default.
     * <p>
     * Note that this function is confusingly named.
     * In CSS terms, the value set here is padding.
     * @param leftMargin left margin in pixels
     */
    public void setLeftMargin(int leftMargin) {
        try {
            DowncallHandles.gtk_text_view_set_left_margin.invokeExact(
                    handle(),
                    leftMargin);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets whether the {@code GtkTextView} should display text in
     * monospace styling.
     * @param monospace {@code true} to request monospace styling
     */
    public void setMonospace(boolean monospace) {
        try {
            DowncallHandles.gtk_text_view_set_monospace.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(monospace, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Changes the {@code GtkTextView} overwrite mode.
     * @param overwrite {@code true} to turn on overwrite mode, {@code false} to turn it off
     */
    public void setOverwrite(boolean overwrite) {
        try {
            DowncallHandles.gtk_text_view_set_overwrite.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(overwrite, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the default number of blank pixels above paragraphs in {@code text_view}.
     * <p>
     * Tags in the buffer for {@code text_view} may override the defaults.
     * @param pixelsAboveLines pixels above paragraphs
     */
    public void setPixelsAboveLines(int pixelsAboveLines) {
        try {
            DowncallHandles.gtk_text_view_set_pixels_above_lines.invokeExact(
                    handle(),
                    pixelsAboveLines);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the default number of pixels of blank space
     * to put below paragraphs in {@code text_view}.
     * <p>
     * May be overridden by tags applied to {@code text_view}’s buffer.
     * @param pixelsBelowLines pixels below paragraphs
     */
    public void setPixelsBelowLines(int pixelsBelowLines) {
        try {
            DowncallHandles.gtk_text_view_set_pixels_below_lines.invokeExact(
                    handle(),
                    pixelsBelowLines);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the default number of pixels of blank space to leave between
     * display/wrapped lines within a paragraph.
     * <p>
     * May be overridden by tags in {@code text_view}’s buffer.
     * @param pixelsInsideWrap default number of pixels between wrapped lines
     */
    public void setPixelsInsideWrap(int pixelsInsideWrap) {
        try {
            DowncallHandles.gtk_text_view_set_pixels_inside_wrap.invokeExact(
                    handle(),
                    pixelsInsideWrap);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the default right margin for text in the text view.
     * <p>
     * Tags in the buffer may override the default.
     * <p>
     * Note that this function is confusingly named.
     * In CSS terms, the value set here is padding.
     * @param rightMargin right margin in pixels
     */
    public void setRightMargin(int rightMargin) {
        try {
            DowncallHandles.gtk_text_view_set_right_margin.invokeExact(
                    handle(),
                    rightMargin);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the default tab stops for paragraphs in {@code text_view}.
     * <p>
     * Tags in the buffer may override the default.
     * @param tabs tabs as a {@code PangoTabArray}
     */
    public void setTabs(org.pango.TabArray tabs) {
        try {
            DowncallHandles.gtk_text_view_set_tabs.invokeExact(
                    handle(),
                    tabs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the top margin for text in {@code text_view}.
     * <p>
     * Note that this function is confusingly named.
     * In CSS terms, the value set here is padding.
     * @param topMargin top margin in pixels
     */
    public void setTopMargin(int topMargin) {
        try {
            DowncallHandles.gtk_text_view_set_top_margin.invokeExact(
                    handle(),
                    topMargin);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the line wrapping for the view.
     * @param wrapMode a {@code GtkWrapMode}
     */
    public void setWrapMode(org.gtk.gtk.WrapMode wrapMode) {
        try {
            DowncallHandles.gtk_text_view_set_wrap_mode.invokeExact(
                    handle(),
                    wrapMode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Determines whether {@code iter} is at the start of a display line.
     * <p>
     * See {@link TextView#forwardDisplayLine} for an
     * explanation of display lines vs. paragraphs.
     * @param iter a {@code GtkTextIter}
     * @return {@code true} if {@code iter} begins a wrapped line
     */
    public boolean startsDisplayLine(org.gtk.gtk.TextIter iter) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_starts_display_line.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Converts coordinates on the window identified by {@code win} to buffer
     * coordinates.
     * @param win a {@code GtkTextWindowType}
     * @param windowX window x coordinate
     * @param windowY window y coordinate
     * @param bufferX buffer x coordinate return location
     * @param bufferY buffer y coordinate return location
     */
    public void windowToBufferCoords(org.gtk.gtk.TextWindowType win, int windowX, int windowY, Out<Integer> bufferX, Out<Integer> bufferY) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment bufferXPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment bufferYPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gtk_text_view_window_to_buffer_coords.invokeExact(
                        handle(),
                        win.getValue(),
                        windowX,
                        windowY,
                        (Addressable) (bufferX == null ? MemoryAddress.NULL : (Addressable) bufferXPOINTER.address()),
                        (Addressable) (bufferY == null ? MemoryAddress.NULL : (Addressable) bufferYPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (bufferX != null) bufferX.set(bufferXPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (bufferY != null) bufferY.set(bufferYPOINTER.get(Interop.valueLayout.C_INT, 0));
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_text_view_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Functional interface declaration of the {@code Backspace} callback.
     */
    @FunctionalInterface
    public interface Backspace {
    
        /**
         * Gets emitted when the user asks for it.
         * <p>
         * The ::backspace signal is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * The default bindings for this signal are
         * &lt;kbd&gt;Backspace&lt;/kbd&gt; and &lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;Backspace&lt;/kbd&gt;.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceTextView) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), Backspace.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Gets emitted when the user asks for it.
     * <p>
     * The ::backspace signal is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal are
     * &lt;kbd&gt;Backspace&lt;/kbd&gt; and &lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;Backspace&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextView.Backspace> onBackspace(TextView.Backspace handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("backspace", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code CopyClipboard} callback.
     */
    @FunctionalInterface
    public interface CopyClipboard {
    
        /**
         * Gets emitted to copy the selection to the clipboard.
         * <p>
         * The ::copy-clipboard signal is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * The default bindings for this signal are
         * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;c&lt;/kbd&gt; and
         * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;Insert&lt;/kbd&gt;.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceTextView) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CopyClipboard.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Gets emitted to copy the selection to the clipboard.
     * <p>
     * The ::copy-clipboard signal is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal are
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;c&lt;/kbd&gt; and
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;Insert&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextView.CopyClipboard> onCopyClipboard(TextView.CopyClipboard handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("copy-clipboard", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code CutClipboard} callback.
     */
    @FunctionalInterface
    public interface CutClipboard {
    
        /**
         * Gets emitted to cut the selection to the clipboard.
         * <p>
         * The ::cut-clipboard signal is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * The default bindings for this signal are
         * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;x&lt;/kbd&gt; and
         * &lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;Delete&lt;/kbd&gt;.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceTextView) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CutClipboard.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Gets emitted to cut the selection to the clipboard.
     * <p>
     * The ::cut-clipboard signal is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal are
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;x&lt;/kbd&gt; and
     * &lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;Delete&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextView.CutClipboard> onCutClipboard(TextView.CutClipboard handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("cut-clipboard", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code DeleteFromCursor} callback.
     */
    @FunctionalInterface
    public interface DeleteFromCursor {
    
        /**
         * Gets emitted when the user initiates a text deletion.
         * <p>
         * The ::delete-from-cursor signal is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * If the {@code type} is {@link DeleteType#CHARS}, GTK deletes the selection
         * if there is one, otherwise it deletes the requested number
         * of characters.
         * <p>
         * The default bindings for this signal are &lt;kbd&gt;Delete&lt;/kbd&gt; for
         * deleting a character, &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;Delete&lt;/kbd&gt; for
         * deleting a word and &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;Backspace&lt;/kbd&gt; for
         * deleting a word backwards.
         */
        void run(org.gtk.gtk.DeleteType type, int count);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceTextView, int type, int count) {
            run(org.gtk.gtk.DeleteType.of(type), count);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DeleteFromCursor.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
     * The default bindings for this signal are &lt;kbd&gt;Delete&lt;/kbd&gt; for
     * deleting a character, &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;Delete&lt;/kbd&gt; for
     * deleting a word and &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;Backspace&lt;/kbd&gt; for
     * deleting a word backwards.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextView.DeleteFromCursor> onDeleteFromCursor(TextView.DeleteFromCursor handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("delete-from-cursor", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code ExtendSelection} callback.
     */
    @FunctionalInterface
    public interface ExtendSelection {
    
        /**
         * Emitted when the selection needs to be extended at {@code location}.
         */
        boolean run(org.gtk.gtk.TextExtendSelection granularity, org.gtk.gtk.TextIter location, org.gtk.gtk.TextIter start, org.gtk.gtk.TextIter end);
        
        @ApiStatus.Internal default int upcall(MemoryAddress sourceTextView, int granularity, MemoryAddress location, MemoryAddress start, MemoryAddress end) {
            var RESULT = run(org.gtk.gtk.TextExtendSelection.of(granularity), org.gtk.gtk.TextIter.fromAddress.marshal(location, null), org.gtk.gtk.TextIter.fromAddress.marshal(start, null), org.gtk.gtk.TextIter.fromAddress.marshal(end, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ExtendSelection.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Emitted when the selection needs to be extended at {@code location}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextView.ExtendSelection> onExtendSelection(TextView.ExtendSelection handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("extend-selection", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code InsertAtCursor} callback.
     */
    @FunctionalInterface
    public interface InsertAtCursor {
    
        /**
         * Gets emitted when the user initiates the insertion of a
         * fixed string at the cursor.
         * <p>
         * The ::insert-at-cursor signal is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * This signal has no default bindings.
         */
        void run(java.lang.String string);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceTextView, MemoryAddress string) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(Marshal.addressToString.marshal(string, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), InsertAtCursor.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Gets emitted when the user initiates the insertion of a
     * fixed string at the cursor.
     * <p>
     * The ::insert-at-cursor signal is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * This signal has no default bindings.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextView.InsertAtCursor> onInsertAtCursor(TextView.InsertAtCursor handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("insert-at-cursor", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code InsertEmoji} callback.
     */
    @FunctionalInterface
    public interface InsertEmoji {
    
        /**
         * Gets emitted to present the Emoji chooser for the {@code text_view}.
         * <p>
         * The ::insert-emoji signal is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * The default bindings for this signal are
         * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;.&lt;/kbd&gt; and
         * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;;&lt;/kbd&gt;
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceTextView) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), InsertEmoji.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Gets emitted to present the Emoji chooser for the {@code text_view}.
     * <p>
     * The ::insert-emoji signal is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal are
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;.&lt;/kbd&gt; and
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;;&lt;/kbd&gt;
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextView.InsertEmoji> onInsertEmoji(TextView.InsertEmoji handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("insert-emoji", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code MoveCursor} callback.
     */
    @FunctionalInterface
    public interface MoveCursor {
    
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
         * The default bindings for this signal come in two variants,
         * the variant with the &lt;kbd&gt;Shift&lt;/kbd&gt; modifier extends the
         * selection, the variant without it does not.
         * There are too many key combinations to list them all here.
         * <ul>
         * <li>&lt;kbd&gt;←&lt;/kbd&gt;, &lt;kbd&gt;→&lt;/kbd&gt;, &lt;kbd&gt;↑&lt;/kbd&gt;, &lt;kbd&gt;↓&lt;/kbd&gt;
         *   move by individual characters/lines
         * <li>&lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;→&lt;/kbd&gt;, etc. move by words/paragraphs
         * <li>&lt;kbd&gt;Home&lt;/kbd&gt;, &lt;kbd&gt;End&lt;/kbd&gt; move to the ends of the buffer
         * <li>&lt;kbd&gt;PgUp&lt;/kbd&gt;, &lt;kbd&gt;PgDn&lt;/kbd&gt; move vertically by pages
         * <li>&lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;PgUp&lt;/kbd&gt;, &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;PgDn&lt;/kbd&gt;
         *   move horizontally by pages
         * </ul>
         */
        void run(org.gtk.gtk.MovementStep step, int count, boolean extendSelection);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceTextView, int step, int count, int extendSelection) {
            run(org.gtk.gtk.MovementStep.of(step), count, Marshal.integerToBoolean.marshal(extendSelection, null).booleanValue());
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MoveCursor.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
     * The default bindings for this signal come in two variants,
     * the variant with the &lt;kbd&gt;Shift&lt;/kbd&gt; modifier extends the
     * selection, the variant without it does not.
     * There are too many key combinations to list them all here.
     * <ul>
     * <li>&lt;kbd&gt;←&lt;/kbd&gt;, &lt;kbd&gt;→&lt;/kbd&gt;, &lt;kbd&gt;↑&lt;/kbd&gt;, &lt;kbd&gt;↓&lt;/kbd&gt;
     *   move by individual characters/lines
     * <li>&lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;→&lt;/kbd&gt;, etc. move by words/paragraphs
     * <li>&lt;kbd&gt;Home&lt;/kbd&gt;, &lt;kbd&gt;End&lt;/kbd&gt; move to the ends of the buffer
     * <li>&lt;kbd&gt;PgUp&lt;/kbd&gt;, &lt;kbd&gt;PgDn&lt;/kbd&gt; move vertically by pages
     * <li>&lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;PgUp&lt;/kbd&gt;, &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;PgDn&lt;/kbd&gt;
     *   move horizontally by pages
     * </ul>
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextView.MoveCursor> onMoveCursor(TextView.MoveCursor handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("move-cursor", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code MoveViewport} callback.
     */
    @FunctionalInterface
    public interface MoveViewport {
    
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
        void run(org.gtk.gtk.ScrollStep step, int count);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceTextView, int step, int count) {
            run(org.gtk.gtk.ScrollStep.of(step), count);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MoveViewport.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextView.MoveViewport> onMoveViewport(TextView.MoveViewport handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("move-viewport", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code PasteClipboard} callback.
     */
    @FunctionalInterface
    public interface PasteClipboard {
    
        /**
         * Gets emitted to paste the contents of the clipboard
         * into the text view.
         * <p>
         * The ::paste-clipboard signal is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * The default bindings for this signal are
         * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;v&lt;/kbd&gt; and
         * &lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;Insert&lt;/kbd&gt;.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceTextView) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PasteClipboard.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Gets emitted to paste the contents of the clipboard
     * into the text view.
     * <p>
     * The ::paste-clipboard signal is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal are
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;v&lt;/kbd&gt; and
     * &lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;Insert&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextView.PasteClipboard> onPasteClipboard(TextView.PasteClipboard handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("paste-clipboard", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code PreeditChanged} callback.
     */
    @FunctionalInterface
    public interface PreeditChanged {
    
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
        void run(java.lang.String preedit);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceTextView, MemoryAddress preedit) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run(Marshal.addressToString.marshal(preedit, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PreeditChanged.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextView.PreeditChanged> onPreeditChanged(TextView.PreeditChanged handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("preedit-changed", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code SelectAll} callback.
     */
    @FunctionalInterface
    public interface SelectAll {
    
        /**
         * Gets emitted to select or unselect the complete contents of the text view.
         * <p>
         * The ::select-all signal is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * The default bindings for this signal are
         * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;a&lt;/kbd&gt; and
         * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;/&lt;/kbd&gt; for selecting and
         * &lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;a&lt;/kbd&gt; and
         * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;\\&lt;/kbd&gt; for unselecting.
         */
        void run(boolean select);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceTextView, int select) {
            run(Marshal.integerToBoolean.marshal(select, null).booleanValue());
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SelectAll.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Gets emitted to select or unselect the complete contents of the text view.
     * <p>
     * The ::select-all signal is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default bindings for this signal are
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;a&lt;/kbd&gt; and
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;/&lt;/kbd&gt; for selecting and
     * &lt;kbd&gt;Shift&lt;/kbd&gt;-&lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;a&lt;/kbd&gt; and
     * &lt;kbd&gt;Ctrl&lt;/kbd&gt;-&lt;kbd&gt;\\&lt;/kbd&gt; for unselecting.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextView.SelectAll> onSelectAll(TextView.SelectAll handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("select-all", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetAnchor} callback.
     */
    @FunctionalInterface
    public interface SetAnchor {
    
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
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceTextView) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetAnchor.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextView.SetAnchor> onSetAnchor(TextView.SetAnchor handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("set-anchor", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code ToggleCursorVisible} callback.
     */
    @FunctionalInterface
    public interface ToggleCursorVisible {
    
        /**
         * Gets emitted to toggle the {@code cursor-visible} property.
         * <p>
         * The ::toggle-cursor-visible signal is a
         * <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * The default binding for this signal is &lt;kbd&gt;F7&lt;/kbd&gt;.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceTextView) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ToggleCursorVisible.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Gets emitted to toggle the {@code cursor-visible} property.
     * <p>
     * The ::toggle-cursor-visible signal is a
     * <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is &lt;kbd&gt;F7&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextView.ToggleCursorVisible> onToggleCursorVisible(TextView.ToggleCursorVisible handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("toggle-cursor-visible", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Functional interface declaration of the {@code ToggleOverwrite} callback.
     */
    @FunctionalInterface
    public interface ToggleOverwrite {
    
        /**
         * Gets emitted to toggle the overwrite mode of the text view.
         * <p>
         * The ::toggle-overwrite signal is a <a href="class.SignalAction.html">keybinding signal</a>.
         * <p>
         * The default binding for this signal is &lt;kbd&gt;Insert&lt;/kbd&gt;.
         */
        void run();
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceTextView) {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ToggleOverwrite.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Gets emitted to toggle the overwrite mode of the text view.
     * <p>
     * The ::toggle-overwrite signal is a <a href="class.SignalAction.html">keybinding signal</a>.
     * <p>
     * The default binding for this signal is &lt;kbd&gt;Insert&lt;/kbd&gt;.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextView.ToggleOverwrite> onToggleOverwrite(TextView.ToggleOverwrite handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("toggle-overwrite", SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link TextView.Builder} object constructs a {@link TextView} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link TextView.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gtk.Widget.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link TextView} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TextView}.
         * @return A new instance of {@code TextView} with the properties 
         *         that were set in the Builder object.
         */
        public TextView build() {
            return (TextView) org.gtk.gobject.GObject.newWithProperties(
                TextView.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * Whether Tab will result in a tab character being entered.
         * @param acceptsTab The value for the {@code accepts-tab} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAcceptsTab(boolean acceptsTab) {
            names.add("accepts-tab");
            values.add(org.gtk.gobject.Value.create(acceptsTab));
            return this;
        }
        
        /**
         * The bottom margin for text in the text view.
         * <p>
         * Note that this property is confusingly named. In CSS terms,
         * the value set here is padding, and it is applied in addition
         * to the padding from the theme.
         * <p>
         * Don't confuse this property with {@code Gtk.Widget:margin-bottom}.
         * @param bottomMargin The value for the {@code bottom-margin} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBottomMargin(int bottomMargin) {
            names.add("bottom-margin");
            values.add(org.gtk.gobject.Value.create(bottomMargin));
            return this;
        }
        
        /**
         * The buffer which is displayed.
         * @param buffer The value for the {@code buffer} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setBuffer(org.gtk.gtk.TextBuffer buffer) {
            names.add("buffer");
            values.add(org.gtk.gobject.Value.create(buffer));
            return this;
        }
        
        /**
         * If the insertion cursor is shown.
         * @param cursorVisible The value for the {@code cursor-visible} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCursorVisible(boolean cursorVisible) {
            names.add("cursor-visible");
            values.add(org.gtk.gobject.Value.create(cursorVisible));
            return this;
        }
        
        public Builder setEditable(boolean editable) {
            names.add("editable");
            values.add(org.gtk.gobject.Value.create(editable));
            return this;
        }
        
        /**
         * A menu model whose contents will be appended to the context menu.
         * @param extraMenu The value for the {@code extra-menu} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setExtraMenu(org.gtk.gio.MenuModel extraMenu) {
            names.add("extra-menu");
            values.add(org.gtk.gobject.Value.create(extraMenu));
            return this;
        }
        
        /**
         * Which IM (input method) module should be used for this text_view.
         * <p>
         * See {@link IMMulticontext}.
         * <p>
         * Setting this to a non-{@code null} value overrides the system-wide IM module
         * setting. See the GtkSettings {@code Gtk.Settings:gtk-im-module} property.
         * @param imModule The value for the {@code im-module} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setImModule(java.lang.String imModule) {
            names.add("im-module");
            values.add(org.gtk.gobject.Value.create(imModule));
            return this;
        }
        
        /**
         * Amount to indent the paragraph, in pixels.
         * @param indent The value for the {@code indent} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setIndent(int indent) {
            names.add("indent");
            values.add(org.gtk.gobject.Value.create(indent));
            return this;
        }
        
        /**
         * Additional hints (beyond {@code Gtk.TextView:input-purpose})
         * that allow input methods to fine-tune their behaviour.
         * @param inputHints The value for the {@code input-hints} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInputHints(org.gtk.gtk.InputHints inputHints) {
            names.add("input-hints");
            values.add(org.gtk.gobject.Value.create(inputHints));
            return this;
        }
        
        /**
         * The purpose of this text field.
         * <p>
         * This property can be used by on-screen keyboards and other input
         * methods to adjust their behaviour.
         * @param inputPurpose The value for the {@code input-purpose} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInputPurpose(org.gtk.gtk.InputPurpose inputPurpose) {
            names.add("input-purpose");
            values.add(org.gtk.gobject.Value.create(inputPurpose));
            return this;
        }
        
        public Builder setJustification(org.gtk.gtk.Justification justification) {
            names.add("justification");
            values.add(org.gtk.gobject.Value.create(justification));
            return this;
        }
        
        /**
         * The default left margin for text in the text view.
         * <p>
         * Tags in the buffer may override the default.
         * <p>
         * Note that this property is confusingly named. In CSS terms,
         * the value set here is padding, and it is applied in addition
         * to the padding from the theme.
         * @param leftMargin The value for the {@code left-margin} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLeftMargin(int leftMargin) {
            names.add("left-margin");
            values.add(org.gtk.gobject.Value.create(leftMargin));
            return this;
        }
        
        /**
         * Whether text should be displayed in a monospace font.
         * <p>
         * If {@code true}, set the .monospace style class on the
         * text view to indicate that a monospace font is desired.
         * @param monospace The value for the {@code monospace} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMonospace(boolean monospace) {
            names.add("monospace");
            values.add(org.gtk.gobject.Value.create(monospace));
            return this;
        }
        
        /**
         * Whether entered text overwrites existing contents.
         * @param overwrite The value for the {@code overwrite} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOverwrite(boolean overwrite) {
            names.add("overwrite");
            values.add(org.gtk.gobject.Value.create(overwrite));
            return this;
        }
        
        public Builder setPixelsAboveLines(int pixelsAboveLines) {
            names.add("pixels-above-lines");
            values.add(org.gtk.gobject.Value.create(pixelsAboveLines));
            return this;
        }
        
        public Builder setPixelsBelowLines(int pixelsBelowLines) {
            names.add("pixels-below-lines");
            values.add(org.gtk.gobject.Value.create(pixelsBelowLines));
            return this;
        }
        
        public Builder setPixelsInsideWrap(int pixelsInsideWrap) {
            names.add("pixels-inside-wrap");
            values.add(org.gtk.gobject.Value.create(pixelsInsideWrap));
            return this;
        }
        
        /**
         * The default right margin for text in the text view.
         * <p>
         * Tags in the buffer may override the default.
         * <p>
         * Note that this property is confusingly named. In CSS terms,
         * the value set here is padding, and it is applied in addition
         * to the padding from the theme.
         * @param rightMargin The value for the {@code right-margin} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRightMargin(int rightMargin) {
            names.add("right-margin");
            values.add(org.gtk.gobject.Value.create(rightMargin));
            return this;
        }
        
        public Builder setTabs(org.pango.TabArray tabs) {
            names.add("tabs");
            values.add(org.gtk.gobject.Value.create(tabs));
            return this;
        }
        
        /**
         * The top margin for text in the text view.
         * <p>
         * Note that this property is confusingly named. In CSS terms,
         * the value set here is padding, and it is applied in addition
         * to the padding from the theme.
         * <p>
         * Don't confuse this property with {@code Gtk.Widget:margin-top}.
         * @param topMargin The value for the {@code top-margin} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTopMargin(int topMargin) {
            names.add("top-margin");
            values.add(org.gtk.gobject.Value.create(topMargin));
            return this;
        }
        
        public Builder setWrapMode(org.gtk.gtk.WrapMode wrapMode) {
            names.add("wrap-mode");
            values.add(org.gtk.gobject.Value.create(wrapMode));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_text_view_new = Interop.downcallHandle(
                "gtk_text_view_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_new_with_buffer = Interop.downcallHandle(
                "gtk_text_view_new_with_buffer",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_add_child_at_anchor = Interop.downcallHandle(
                "gtk_text_view_add_child_at_anchor",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_add_overlay = Interop.downcallHandle(
                "gtk_text_view_add_overlay",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_view_backward_display_line = Interop.downcallHandle(
                "gtk_text_view_backward_display_line",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_backward_display_line_start = Interop.downcallHandle(
                "gtk_text_view_backward_display_line_start",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_buffer_to_window_coords = Interop.downcallHandle(
                "gtk_text_view_buffer_to_window_coords",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_forward_display_line = Interop.downcallHandle(
                "gtk_text_view_forward_display_line",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_forward_display_line_end = Interop.downcallHandle(
                "gtk_text_view_forward_display_line_end",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_accepts_tab = Interop.downcallHandle(
                "gtk_text_view_get_accepts_tab",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_bottom_margin = Interop.downcallHandle(
                "gtk_text_view_get_bottom_margin",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_buffer = Interop.downcallHandle(
                "gtk_text_view_get_buffer",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_cursor_locations = Interop.downcallHandle(
                "gtk_text_view_get_cursor_locations",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_cursor_visible = Interop.downcallHandle(
                "gtk_text_view_get_cursor_visible",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_editable = Interop.downcallHandle(
                "gtk_text_view_get_editable",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_extra_menu = Interop.downcallHandle(
                "gtk_text_view_get_extra_menu",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_gutter = Interop.downcallHandle(
                "gtk_text_view_get_gutter",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_indent = Interop.downcallHandle(
                "gtk_text_view_get_indent",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_input_hints = Interop.downcallHandle(
                "gtk_text_view_get_input_hints",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_input_purpose = Interop.downcallHandle(
                "gtk_text_view_get_input_purpose",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_iter_at_location = Interop.downcallHandle(
                "gtk_text_view_get_iter_at_location",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_iter_at_position = Interop.downcallHandle(
                "gtk_text_view_get_iter_at_position",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_iter_location = Interop.downcallHandle(
                "gtk_text_view_get_iter_location",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_justification = Interop.downcallHandle(
                "gtk_text_view_get_justification",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_left_margin = Interop.downcallHandle(
                "gtk_text_view_get_left_margin",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_line_at_y = Interop.downcallHandle(
                "gtk_text_view_get_line_at_y",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_line_yrange = Interop.downcallHandle(
                "gtk_text_view_get_line_yrange",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_ltr_context = Interop.downcallHandle(
                "gtk_text_view_get_ltr_context",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_monospace = Interop.downcallHandle(
                "gtk_text_view_get_monospace",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_overwrite = Interop.downcallHandle(
                "gtk_text_view_get_overwrite",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_pixels_above_lines = Interop.downcallHandle(
                "gtk_text_view_get_pixels_above_lines",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_pixels_below_lines = Interop.downcallHandle(
                "gtk_text_view_get_pixels_below_lines",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_pixels_inside_wrap = Interop.downcallHandle(
                "gtk_text_view_get_pixels_inside_wrap",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_right_margin = Interop.downcallHandle(
                "gtk_text_view_get_right_margin",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_rtl_context = Interop.downcallHandle(
                "gtk_text_view_get_rtl_context",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_tabs = Interop.downcallHandle(
                "gtk_text_view_get_tabs",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_top_margin = Interop.downcallHandle(
                "gtk_text_view_get_top_margin",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_visible_rect = Interop.downcallHandle(
                "gtk_text_view_get_visible_rect",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_wrap_mode = Interop.downcallHandle(
                "gtk_text_view_get_wrap_mode",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_im_context_filter_keypress = Interop.downcallHandle(
                "gtk_text_view_im_context_filter_keypress",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_move_mark_onscreen = Interop.downcallHandle(
                "gtk_text_view_move_mark_onscreen",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_move_overlay = Interop.downcallHandle(
                "gtk_text_view_move_overlay",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_view_move_visually = Interop.downcallHandle(
                "gtk_text_view_move_visually",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_view_place_cursor_onscreen = Interop.downcallHandle(
                "gtk_text_view_place_cursor_onscreen",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_remove = Interop.downcallHandle(
                "gtk_text_view_remove",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_reset_cursor_blink = Interop.downcallHandle(
                "gtk_text_view_reset_cursor_blink",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_reset_im_context = Interop.downcallHandle(
                "gtk_text_view_reset_im_context",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_scroll_mark_onscreen = Interop.downcallHandle(
                "gtk_text_view_scroll_mark_onscreen",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_scroll_to_iter = Interop.downcallHandle(
                "gtk_text_view_scroll_to_iter",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle gtk_text_view_scroll_to_mark = Interop.downcallHandle(
                "gtk_text_view_scroll_to_mark",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE),
                false
        );
        
        private static final MethodHandle gtk_text_view_set_accepts_tab = Interop.downcallHandle(
                "gtk_text_view_set_accepts_tab",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_view_set_bottom_margin = Interop.downcallHandle(
                "gtk_text_view_set_bottom_margin",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_view_set_buffer = Interop.downcallHandle(
                "gtk_text_view_set_buffer",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_set_cursor_visible = Interop.downcallHandle(
                "gtk_text_view_set_cursor_visible",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_view_set_editable = Interop.downcallHandle(
                "gtk_text_view_set_editable",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_view_set_extra_menu = Interop.downcallHandle(
                "gtk_text_view_set_extra_menu",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_set_gutter = Interop.downcallHandle(
                "gtk_text_view_set_gutter",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_set_indent = Interop.downcallHandle(
                "gtk_text_view_set_indent",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_view_set_input_hints = Interop.downcallHandle(
                "gtk_text_view_set_input_hints",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_view_set_input_purpose = Interop.downcallHandle(
                "gtk_text_view_set_input_purpose",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_view_set_justification = Interop.downcallHandle(
                "gtk_text_view_set_justification",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_view_set_left_margin = Interop.downcallHandle(
                "gtk_text_view_set_left_margin",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_view_set_monospace = Interop.downcallHandle(
                "gtk_text_view_set_monospace",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_view_set_overwrite = Interop.downcallHandle(
                "gtk_text_view_set_overwrite",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_view_set_pixels_above_lines = Interop.downcallHandle(
                "gtk_text_view_set_pixels_above_lines",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_view_set_pixels_below_lines = Interop.downcallHandle(
                "gtk_text_view_set_pixels_below_lines",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_view_set_pixels_inside_wrap = Interop.downcallHandle(
                "gtk_text_view_set_pixels_inside_wrap",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_view_set_right_margin = Interop.downcallHandle(
                "gtk_text_view_set_right_margin",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_view_set_tabs = Interop.downcallHandle(
                "gtk_text_view_set_tabs",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_set_top_margin = Interop.downcallHandle(
                "gtk_text_view_set_top_margin",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_view_set_wrap_mode = Interop.downcallHandle(
                "gtk_text_view_set_wrap_mode",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gtk_text_view_starts_display_line = Interop.downcallHandle(
                "gtk_text_view_starts_display_line",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_window_to_buffer_coords = Interop.downcallHandle(
                "gtk_text_view_window_to_buffer_coords",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_text_view_get_type = Interop.downcallHandle(
                "gtk_text_view_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_text_view_get_type != null;
    }
}
