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
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.Widget.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gtk.Widget parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gtk.Widget(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a TextView proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TextView(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to TextView if its GType is a (or inherits from) "GtkTextView".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "TextView" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkTextView", a ClassCastException will be thrown.
     */
    public static TextView castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkTextView"))) {
            return new TextView(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkTextView");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
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
        super(constructNew(), Ownership.NONE);
    }
    
    private static Addressable constructNewWithBuffer(@NotNull org.gtk.gtk.TextBuffer buffer) {
        java.util.Objects.requireNonNull(buffer, "Parameter 'buffer' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_view_new_with_buffer.invokeExact(
                    buffer.handle());
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
    public static TextView newWithBuffer(@NotNull org.gtk.gtk.TextBuffer buffer) {
        return new TextView(constructNewWithBuffer(buffer), Ownership.NONE);
    }
    
    /**
     * Adds a child widget in the text buffer, at the given {@code anchor}.
     * @param child a {@code GtkWidget}
     * @param anchor a {@code GtkTextChildAnchor} in the {@code GtkTextBuffer} for {@code text_view}
     */
    public void addChildAtAnchor(@NotNull org.gtk.gtk.Widget child, @NotNull org.gtk.gtk.TextChildAnchor anchor) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
        java.util.Objects.requireNonNull(anchor, "Parameter 'anchor' must not be null");
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
    public void addOverlay(@NotNull org.gtk.gtk.Widget child, int xpos, int ypos) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
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
    public boolean backwardDisplayLine(@NotNull org.gtk.gtk.TextIter iter) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_backward_display_line.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public boolean backwardDisplayLineStart(@NotNull org.gtk.gtk.TextIter iter) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_backward_display_line_start.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Converts buffer coordinates to window coordinates.
     * @param win a {@code GtkTextWindowType}
     * @param bufferX buffer x coordinate
     * @param bufferY buffer y coordinate
     * @param windowX window x coordinate return location
     * @param windowY window y coordinate return location
     */
    public void bufferToWindowCoords(@NotNull org.gtk.gtk.TextWindowType win, int bufferX, int bufferY, Out<Integer> windowX, Out<Integer> windowY) {
        java.util.Objects.requireNonNull(win, "Parameter 'win' must not be null");
        java.util.Objects.requireNonNull(windowX, "Parameter 'windowX' must not be null");
        java.util.Objects.requireNonNull(windowY, "Parameter 'windowY' must not be null");
        MemorySegment windowXPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment windowYPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            DowncallHandles.gtk_text_view_buffer_to_window_coords.invokeExact(
                    handle(),
                    win.getValue(),
                    bufferX,
                    bufferY,
                    (Addressable) windowXPOINTER.address(),
                    (Addressable) windowYPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        windowX.set(windowXPOINTER.get(ValueLayout.JAVA_INT, 0));
        windowY.set(windowYPOINTER.get(ValueLayout.JAVA_INT, 0));
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
    public boolean forwardDisplayLine(@NotNull org.gtk.gtk.TextIter iter) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_forward_display_line.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public boolean forwardDisplayLineEnd(@NotNull org.gtk.gtk.TextIter iter) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_forward_display_line_end.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
            RESULT = (int) DowncallHandles.gtk_text_view_get_accepts_tab.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the bottom margin for text in the {@code text_view}.
     * @return bottom margin in pixels
     */
    public int getBottomMargin() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_get_bottom_margin.invokeExact(
                    handle());
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
    public @NotNull org.gtk.gtk.TextBuffer getBuffer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_view_get_buffer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.TextBuffer(RESULT, Ownership.NONE);
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
    public void getCursorLocations(@Nullable org.gtk.gtk.TextIter iter, @NotNull org.gtk.gdk.Rectangle strong, @NotNull org.gtk.gdk.Rectangle weak) {
        java.util.Objects.requireNonNull(strong, "Parameter 'strong' must not be null");
        java.util.Objects.requireNonNull(weak, "Parameter 'weak' must not be null");
        try {
            DowncallHandles.gtk_text_view_get_cursor_locations.invokeExact(
                    handle(),
                    (Addressable) (iter == null ? MemoryAddress.NULL : iter.handle()),
                    strong.handle(),
                    weak.handle());
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
            RESULT = (int) DowncallHandles.gtk_text_view_get_cursor_visible.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
            RESULT = (int) DowncallHandles.gtk_text_view_get_editable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets the menu model that gets added to the context menu
     * or {@code null} if none has been set.
     * @return the menu model
     */
    public @NotNull org.gtk.gio.MenuModel getExtraMenu() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_view_get_extra_menu.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.MenuModel(RESULT, Ownership.NONE);
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
    public @Nullable org.gtk.gtk.Widget getGutter(@NotNull org.gtk.gtk.TextWindowType win) {
        java.util.Objects.requireNonNull(win, "Parameter 'win' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_view_get_gutter.invokeExact(
                    handle(),
                    win.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Widget(RESULT, Ownership.NONE);
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
            RESULT = (int) DowncallHandles.gtk_text_view_get_indent.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the {@code input-hints} of the {@code GtkTextView}.
     */
    public @NotNull org.gtk.gtk.InputHints getInputHints() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_get_input_hints.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.InputHints(RESULT);
    }
    
    /**
     * Gets the {@code input-purpose} of the {@code GtkTextView}.
     */
    public @NotNull org.gtk.gtk.InputPurpose getInputPurpose() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_get_input_purpose.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.InputPurpose(RESULT);
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
    public boolean getIterAtLocation(@NotNull org.gtk.gtk.TextIter iter, int x, int y) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
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
        return RESULT != 0;
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
    public boolean getIterAtPosition(@NotNull org.gtk.gtk.TextIter iter, Out<Integer> trailing, int x, int y) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(trailing, "Parameter 'trailing' must not be null");
        MemorySegment trailingPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_get_iter_at_position.invokeExact(
                    handle(),
                    iter.handle(),
                    (Addressable) trailingPOINTER.address(),
                    x,
                    y);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        trailing.set(trailingPOINTER.get(ValueLayout.JAVA_INT, 0));
        return RESULT != 0;
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
    public void getIterLocation(@NotNull org.gtk.gtk.TextIter iter, @NotNull org.gtk.gdk.Rectangle location) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(location, "Parameter 'location' must not be null");
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
    public @NotNull org.gtk.gtk.Justification getJustification() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_get_justification.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.Justification(RESULT);
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
            RESULT = (int) DowncallHandles.gtk_text_view_get_left_margin.invokeExact(
                    handle());
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
    public void getLineAtY(@NotNull org.gtk.gtk.TextIter targetIter, int y, Out<Integer> lineTop) {
        java.util.Objects.requireNonNull(targetIter, "Parameter 'targetIter' must not be null");
        java.util.Objects.requireNonNull(lineTop, "Parameter 'lineTop' must not be null");
        MemorySegment lineTopPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            DowncallHandles.gtk_text_view_get_line_at_y.invokeExact(
                    handle(),
                    targetIter.handle(),
                    y,
                    (Addressable) lineTopPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        lineTop.set(lineTopPOINTER.get(ValueLayout.JAVA_INT, 0));
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
    public void getLineYrange(@NotNull org.gtk.gtk.TextIter iter, Out<Integer> y, Out<Integer> height) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(y, "Parameter 'y' must not be null");
        java.util.Objects.requireNonNull(height, "Parameter 'height' must not be null");
        MemorySegment yPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment heightPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            DowncallHandles.gtk_text_view_get_line_yrange.invokeExact(
                    handle(),
                    iter.handle(),
                    (Addressable) yPOINTER.address(),
                    (Addressable) heightPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        y.set(yPOINTER.get(ValueLayout.JAVA_INT, 0));
        height.set(heightPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    /**
     * Gets the {@code PangoContext} that is used for rendering LTR directed
     * text layouts.
     * <p>
     * The context may be replaced when CSS changes occur.
     * @return a {@code PangoContext}
     */
    public @NotNull org.pango.Context getLtrContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_view_get_ltr_context.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Context(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets whether the {@code GtkTextView} uses monospace styling.
     * @return {@code true} if monospace fonts are desired
     */
    public boolean getMonospace() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_get_monospace.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether the {@code GtkTextView} is in overwrite mode or not.
     * @return whether {@code text_view} is in overwrite mode or not.
     */
    public boolean getOverwrite() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_get_overwrite.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
            RESULT = (int) DowncallHandles.gtk_text_view_get_pixels_above_lines.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.gtk_text_view_get_pixels_below_lines.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.gtk_text_view_get_pixels_inside_wrap.invokeExact(
                    handle());
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
            RESULT = (int) DowncallHandles.gtk_text_view_get_right_margin.invokeExact(
                    handle());
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
    public @NotNull org.pango.Context getRtlContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_view_get_rtl_context.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Context(RESULT, Ownership.NONE);
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
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_view_get_tabs.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.TabArray(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the top margin for text in the {@code text_view}.
     * @return top margin in pixels
     */
    public int getTopMargin() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_get_top_margin.invokeExact(
                    handle());
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
    public void getVisibleRect(@NotNull org.gtk.gdk.Rectangle visibleRect) {
        java.util.Objects.requireNonNull(visibleRect, "Parameter 'visibleRect' must not be null");
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
    public @NotNull org.gtk.gtk.WrapMode getWrapMode() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_get_wrap_mode.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.WrapMode(RESULT);
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
    public boolean imContextFilterKeypress(@NotNull org.gtk.gdk.Event event) {
        java.util.Objects.requireNonNull(event, "Parameter 'event' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_im_context_filter_keypress.invokeExact(
                    handle(),
                    event.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves a mark within the buffer so that it's
     * located within the currently-visible text area.
     * @param mark a {@code GtkTextMark}
     * @return {@code true} if the mark moved (wasn’t already onscreen)
     */
    public boolean moveMarkOnscreen(@NotNull org.gtk.gtk.TextMark mark) {
        java.util.Objects.requireNonNull(mark, "Parameter 'mark' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_move_mark_onscreen.invokeExact(
                    handle(),
                    mark.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Updates the position of a child.
     * <p>
     * See {@link TextView#addOverlay}.
     * @param child a widget already added with {@link TextView#addOverlay}
     * @param xpos new X position in buffer coordinates
     * @param ypos new Y position in buffer coordinates
     */
    public void moveOverlay(@NotNull org.gtk.gtk.Widget child, int xpos, int ypos) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
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
    public boolean moveVisually(@NotNull org.gtk.gtk.TextIter iter, int count) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_move_visually.invokeExact(
                    handle(),
                    iter.handle(),
                    count);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves the cursor to the currently visible region of the
     * buffer.
     * @return {@code true} if the cursor had to be moved.
     */
    public boolean placeCursorOnscreen() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_place_cursor_onscreen.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Removes a child widget from {@code text_view}.
     * @param child the child to remove
     */
    public void remove(@NotNull org.gtk.gtk.Widget child) {
        java.util.Objects.requireNonNull(child, "Parameter 'child' must not be null");
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
            DowncallHandles.gtk_text_view_reset_cursor_blink.invokeExact(
                    handle());
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
            DowncallHandles.gtk_text_view_reset_im_context.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Scrolls {@code text_view} the minimum distance such that {@code mark} is contained
     * within the visible area of the widget.
     * @param mark a mark in the buffer for {@code text_view}
     */
    public void scrollMarkOnscreen(@NotNull org.gtk.gtk.TextMark mark) {
        java.util.Objects.requireNonNull(mark, "Parameter 'mark' must not be null");
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
    public boolean scrollToIter(@NotNull org.gtk.gtk.TextIter iter, double withinMargin, boolean useAlign, double xalign, double yalign) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_scroll_to_iter.invokeExact(
                    handle(),
                    iter.handle(),
                    withinMargin,
                    useAlign ? 1 : 0,
                    xalign,
                    yalign);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public void scrollToMark(@NotNull org.gtk.gtk.TextMark mark, double withinMargin, boolean useAlign, double xalign, double yalign) {
        java.util.Objects.requireNonNull(mark, "Parameter 'mark' must not be null");
        try {
            DowncallHandles.gtk_text_view_scroll_to_mark.invokeExact(
                    handle(),
                    mark.handle(),
                    withinMargin,
                    useAlign ? 1 : 0,
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
                    acceptsTab ? 1 : 0);
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
                    setting ? 1 : 0);
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
                    setting ? 1 : 0);
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
    public void setGutter(@NotNull org.gtk.gtk.TextWindowType win, @Nullable org.gtk.gtk.Widget widget) {
        java.util.Objects.requireNonNull(win, "Parameter 'win' must not be null");
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
    public void setInputHints(@NotNull org.gtk.gtk.InputHints hints) {
        java.util.Objects.requireNonNull(hints, "Parameter 'hints' must not be null");
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
    public void setInputPurpose(@NotNull org.gtk.gtk.InputPurpose purpose) {
        java.util.Objects.requireNonNull(purpose, "Parameter 'purpose' must not be null");
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
    public void setJustification(@NotNull org.gtk.gtk.Justification justification) {
        java.util.Objects.requireNonNull(justification, "Parameter 'justification' must not be null");
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
                    monospace ? 1 : 0);
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
                    overwrite ? 1 : 0);
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
    public void setTabs(@NotNull org.pango.TabArray tabs) {
        java.util.Objects.requireNonNull(tabs, "Parameter 'tabs' must not be null");
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
    public void setWrapMode(@NotNull org.gtk.gtk.WrapMode wrapMode) {
        java.util.Objects.requireNonNull(wrapMode, "Parameter 'wrapMode' must not be null");
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
    public boolean startsDisplayLine(@NotNull org.gtk.gtk.TextIter iter) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_view_starts_display_line.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    public void windowToBufferCoords(@NotNull org.gtk.gtk.TextWindowType win, int windowX, int windowY, Out<Integer> bufferX, Out<Integer> bufferY) {
        java.util.Objects.requireNonNull(win, "Parameter 'win' must not be null");
        java.util.Objects.requireNonNull(bufferX, "Parameter 'bufferX' must not be null");
        java.util.Objects.requireNonNull(bufferY, "Parameter 'bufferY' must not be null");
        MemorySegment bufferXPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment bufferYPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        try {
            DowncallHandles.gtk_text_view_window_to_buffer_coords.invokeExact(
                    handle(),
                    win.getValue(),
                    windowX,
                    windowY,
                    (Addressable) bufferXPOINTER.address(),
                    (Addressable) bufferYPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        bufferX.set(bufferXPOINTER.get(ValueLayout.JAVA_INT, 0));
        bufferY.set(bufferYPOINTER.get(ValueLayout.JAVA_INT, 0));
    }
    
    @FunctionalInterface
    public interface Backspace {
        void signalReceived(TextView source);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("backspace"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewBackspace",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextView.Backspace>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface CopyClipboard {
        void signalReceived(TextView source);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("copy-clipboard"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewCopyClipboard",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextView.CopyClipboard>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface CutClipboard {
        void signalReceived(TextView source);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("cut-clipboard"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewCutClipboard",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextView.CutClipboard>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DeleteFromCursor {
        void signalReceived(TextView source, @NotNull org.gtk.gtk.DeleteType type, int count);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("delete-from-cursor"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewDeleteFromCursor",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextView.DeleteFromCursor>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ExtendSelection {
        boolean signalReceived(TextView source, @NotNull org.gtk.gtk.TextExtendSelection granularity, @NotNull org.gtk.gtk.TextIter location, @NotNull org.gtk.gtk.TextIter start, @NotNull org.gtk.gtk.TextIter end);
    }
    
    /**
     * Emitted when the selection needs to be extended at {@code location}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextView.ExtendSelection> onExtendSelection(TextView.ExtendSelection handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("extend-selection"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewExtendSelection",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextView.ExtendSelection>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InsertAtCursor {
        void signalReceived(TextView source, @NotNull java.lang.String string);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("insert-at-cursor"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewInsertAtCursor",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextView.InsertAtCursor>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InsertEmoji {
        void signalReceived(TextView source);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("insert-emoji"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewInsertEmoji",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextView.InsertEmoji>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MoveCursor {
        void signalReceived(TextView source, @NotNull org.gtk.gtk.MovementStep step, int count, boolean extendSelection);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("move-cursor"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewMoveCursor",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextView.MoveCursor>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MoveViewport {
        void signalReceived(TextView source, @NotNull org.gtk.gtk.ScrollStep step, int count);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("move-viewport"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewMoveViewport",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextView.MoveViewport>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PasteClipboard {
        void signalReceived(TextView source);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("paste-clipboard"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewPasteClipboard",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextView.PasteClipboard>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PreeditChanged {
        void signalReceived(TextView source, @NotNull java.lang.String preedit);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("preedit-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewPreeditChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextView.PreeditChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SelectAll {
        void signalReceived(TextView source, boolean select);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("select-all"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewSelectAll",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextView.SelectAll>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface SetAnchor {
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextView.SetAnchor> onSetAnchor(TextView.SetAnchor handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("set-anchor"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewSetAnchor",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextView.SetAnchor>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ToggleCursorVisible {
        void signalReceived(TextView source);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("toggle-cursor-visible"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewToggleCursorVisible",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextView.ToggleCursorVisible>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ToggleOverwrite {
        void signalReceived(TextView source);
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
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("toggle-overwrite"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewToggleOverwrite",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextView.ToggleOverwrite>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_text_view_new = Interop.downcallHandle(
            "gtk_text_view_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_new_with_buffer = Interop.downcallHandle(
            "gtk_text_view_new_with_buffer",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_add_child_at_anchor = Interop.downcallHandle(
            "gtk_text_view_add_child_at_anchor",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_add_overlay = Interop.downcallHandle(
            "gtk_text_view_add_overlay",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_view_backward_display_line = Interop.downcallHandle(
            "gtk_text_view_backward_display_line",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_backward_display_line_start = Interop.downcallHandle(
            "gtk_text_view_backward_display_line_start",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_buffer_to_window_coords = Interop.downcallHandle(
            "gtk_text_view_buffer_to_window_coords",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_forward_display_line = Interop.downcallHandle(
            "gtk_text_view_forward_display_line",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_forward_display_line_end = Interop.downcallHandle(
            "gtk_text_view_forward_display_line_end",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_get_accepts_tab = Interop.downcallHandle(
            "gtk_text_view_get_accepts_tab",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_get_bottom_margin = Interop.downcallHandle(
            "gtk_text_view_get_bottom_margin",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_get_buffer = Interop.downcallHandle(
            "gtk_text_view_get_buffer",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_get_cursor_locations = Interop.downcallHandle(
            "gtk_text_view_get_cursor_locations",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_get_cursor_visible = Interop.downcallHandle(
            "gtk_text_view_get_cursor_visible",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_get_editable = Interop.downcallHandle(
            "gtk_text_view_get_editable",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_get_extra_menu = Interop.downcallHandle(
            "gtk_text_view_get_extra_menu",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_get_gutter = Interop.downcallHandle(
            "gtk_text_view_get_gutter",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_view_get_indent = Interop.downcallHandle(
            "gtk_text_view_get_indent",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_get_input_hints = Interop.downcallHandle(
            "gtk_text_view_get_input_hints",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_get_input_purpose = Interop.downcallHandle(
            "gtk_text_view_get_input_purpose",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_get_iter_at_location = Interop.downcallHandle(
            "gtk_text_view_get_iter_at_location",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_view_get_iter_at_position = Interop.downcallHandle(
            "gtk_text_view_get_iter_at_position",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_view_get_iter_location = Interop.downcallHandle(
            "gtk_text_view_get_iter_location",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_get_justification = Interop.downcallHandle(
            "gtk_text_view_get_justification",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_get_left_margin = Interop.downcallHandle(
            "gtk_text_view_get_left_margin",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_get_line_at_y = Interop.downcallHandle(
            "gtk_text_view_get_line_at_y",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_get_line_yrange = Interop.downcallHandle(
            "gtk_text_view_get_line_yrange",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_get_ltr_context = Interop.downcallHandle(
            "gtk_text_view_get_ltr_context",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_get_monospace = Interop.downcallHandle(
            "gtk_text_view_get_monospace",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_get_overwrite = Interop.downcallHandle(
            "gtk_text_view_get_overwrite",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_get_pixels_above_lines = Interop.downcallHandle(
            "gtk_text_view_get_pixels_above_lines",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_get_pixels_below_lines = Interop.downcallHandle(
            "gtk_text_view_get_pixels_below_lines",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_get_pixels_inside_wrap = Interop.downcallHandle(
            "gtk_text_view_get_pixels_inside_wrap",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_get_right_margin = Interop.downcallHandle(
            "gtk_text_view_get_right_margin",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_get_rtl_context = Interop.downcallHandle(
            "gtk_text_view_get_rtl_context",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_get_tabs = Interop.downcallHandle(
            "gtk_text_view_get_tabs",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_get_top_margin = Interop.downcallHandle(
            "gtk_text_view_get_top_margin",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_get_visible_rect = Interop.downcallHandle(
            "gtk_text_view_get_visible_rect",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_get_wrap_mode = Interop.downcallHandle(
            "gtk_text_view_get_wrap_mode",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_im_context_filter_keypress = Interop.downcallHandle(
            "gtk_text_view_im_context_filter_keypress",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_move_mark_onscreen = Interop.downcallHandle(
            "gtk_text_view_move_mark_onscreen",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_move_overlay = Interop.downcallHandle(
            "gtk_text_view_move_overlay",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_view_move_visually = Interop.downcallHandle(
            "gtk_text_view_move_visually",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_view_place_cursor_onscreen = Interop.downcallHandle(
            "gtk_text_view_place_cursor_onscreen",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_remove = Interop.downcallHandle(
            "gtk_text_view_remove",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_reset_cursor_blink = Interop.downcallHandle(
            "gtk_text_view_reset_cursor_blink",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_reset_im_context = Interop.downcallHandle(
            "gtk_text_view_reset_im_context",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_scroll_mark_onscreen = Interop.downcallHandle(
            "gtk_text_view_scroll_mark_onscreen",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_scroll_to_iter = Interop.downcallHandle(
            "gtk_text_view_scroll_to_iter",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_text_view_scroll_to_mark = Interop.downcallHandle(
            "gtk_text_view_scroll_to_mark",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE),
            false
        );
        
        private static final MethodHandle gtk_text_view_set_accepts_tab = Interop.downcallHandle(
            "gtk_text_view_set_accepts_tab",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_view_set_bottom_margin = Interop.downcallHandle(
            "gtk_text_view_set_bottom_margin",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_view_set_buffer = Interop.downcallHandle(
            "gtk_text_view_set_buffer",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_set_cursor_visible = Interop.downcallHandle(
            "gtk_text_view_set_cursor_visible",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_view_set_editable = Interop.downcallHandle(
            "gtk_text_view_set_editable",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_view_set_extra_menu = Interop.downcallHandle(
            "gtk_text_view_set_extra_menu",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_set_gutter = Interop.downcallHandle(
            "gtk_text_view_set_gutter",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_set_indent = Interop.downcallHandle(
            "gtk_text_view_set_indent",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_view_set_input_hints = Interop.downcallHandle(
            "gtk_text_view_set_input_hints",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_view_set_input_purpose = Interop.downcallHandle(
            "gtk_text_view_set_input_purpose",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_view_set_justification = Interop.downcallHandle(
            "gtk_text_view_set_justification",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_view_set_left_margin = Interop.downcallHandle(
            "gtk_text_view_set_left_margin",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_view_set_monospace = Interop.downcallHandle(
            "gtk_text_view_set_monospace",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_view_set_overwrite = Interop.downcallHandle(
            "gtk_text_view_set_overwrite",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_view_set_pixels_above_lines = Interop.downcallHandle(
            "gtk_text_view_set_pixels_above_lines",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_view_set_pixels_below_lines = Interop.downcallHandle(
            "gtk_text_view_set_pixels_below_lines",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_view_set_pixels_inside_wrap = Interop.downcallHandle(
            "gtk_text_view_set_pixels_inside_wrap",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_view_set_right_margin = Interop.downcallHandle(
            "gtk_text_view_set_right_margin",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_view_set_tabs = Interop.downcallHandle(
            "gtk_text_view_set_tabs",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_set_top_margin = Interop.downcallHandle(
            "gtk_text_view_set_top_margin",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_view_set_wrap_mode = Interop.downcallHandle(
            "gtk_text_view_set_wrap_mode",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_view_starts_display_line = Interop.downcallHandle(
            "gtk_text_view_starts_display_line",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_view_window_to_buffer_coords = Interop.downcallHandle(
            "gtk_text_view_window_to_buffer_coords",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalTextViewBackspace(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextView.Backspace) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextView(source, Ownership.UNKNOWN));
        }
        
        public static void signalTextViewCopyClipboard(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextView.CopyClipboard) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextView(source, Ownership.UNKNOWN));
        }
        
        public static void signalTextViewCutClipboard(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextView.CutClipboard) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextView(source, Ownership.UNKNOWN));
        }
        
        public static void signalTextViewDeleteFromCursor(MemoryAddress source, int type, int count, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextView.DeleteFromCursor) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextView(source, Ownership.UNKNOWN), new org.gtk.gtk.DeleteType(type), count);
        }
        
        public static boolean signalTextViewExtendSelection(MemoryAddress source, int granularity, MemoryAddress location, MemoryAddress start, MemoryAddress end, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextView.ExtendSelection) Interop.signalRegistry.get(HASH);
            return HANDLER.signalReceived(new TextView(source, Ownership.UNKNOWN), new org.gtk.gtk.TextExtendSelection(granularity), new org.gtk.gtk.TextIter(location, Ownership.NONE), new org.gtk.gtk.TextIter(start, Ownership.NONE), new org.gtk.gtk.TextIter(end, Ownership.NONE));
        }
        
        public static void signalTextViewInsertAtCursor(MemoryAddress source, MemoryAddress string, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextView.InsertAtCursor) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextView(source, Ownership.UNKNOWN), Interop.getStringFrom(string));
        }
        
        public static void signalTextViewInsertEmoji(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextView.InsertEmoji) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextView(source, Ownership.UNKNOWN));
        }
        
        public static void signalTextViewMoveCursor(MemoryAddress source, int step, int count, int extendSelection, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextView.MoveCursor) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextView(source, Ownership.UNKNOWN), new org.gtk.gtk.MovementStep(step), count, extendSelection != 0);
        }
        
        public static void signalTextViewMoveViewport(MemoryAddress source, int step, int count, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextView.MoveViewport) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextView(source, Ownership.UNKNOWN), new org.gtk.gtk.ScrollStep(step), count);
        }
        
        public static void signalTextViewPasteClipboard(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextView.PasteClipboard) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextView(source, Ownership.UNKNOWN));
        }
        
        public static void signalTextViewPreeditChanged(MemoryAddress source, MemoryAddress preedit, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextView.PreeditChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextView(source, Ownership.UNKNOWN), Interop.getStringFrom(preedit));
        }
        
        public static void signalTextViewSelectAll(MemoryAddress source, int select, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextView.SelectAll) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextView(source, Ownership.UNKNOWN), select != 0);
        }
        
        public static void signalTextViewSetAnchor(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextView.SetAnchor) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextView(source, Ownership.UNKNOWN));
        }
        
        public static void signalTextViewToggleCursorVisible(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextView.ToggleCursorVisible) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextView(source, Ownership.UNKNOWN));
        }
        
        public static void signalTextViewToggleOverwrite(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextView.ToggleOverwrite) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextView(source, Ownership.UNKNOWN));
        }
    }
}
