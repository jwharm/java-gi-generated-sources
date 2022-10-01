package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
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
    
    private static Refcounted constructNew() {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_text_view_new(), false);
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
    }
    
    private static Refcounted constructNewWithBuffer(TextBuffer buffer) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_text_view_new_with_buffer(buffer.handle()), false);
        return RESULT;
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
    
    /**
     * Adds a child widget in the text buffer, at the given {@code anchor}.
     */
    public void addChildAtAnchor(Widget child, TextChildAnchor anchor) {
        gtk_h.gtk_text_view_add_child_at_anchor(handle(), child.handle(), anchor.handle());
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
     */
    public void addOverlay(Widget child, int xpos, int ypos) {
        gtk_h.gtk_text_view_add_overlay(handle(), child.handle(), xpos, ypos);
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
     */
    public boolean backwardDisplayLine(TextIter iter) {
        var RESULT = gtk_h.gtk_text_view_backward_display_line(handle(), iter.handle());
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
     */
    public boolean backwardDisplayLineStart(TextIter iter) {
        var RESULT = gtk_h.gtk_text_view_backward_display_line_start(handle(), iter.handle());
        return RESULT != 0;
    }
    
    /**
     * Converts buffer coordinates to window coordinates.
     */
    public void bufferToWindowCoords(TextWindowType win, int bufferX, int bufferY, PointerInteger windowX, PointerInteger windowY) {
        gtk_h.gtk_text_view_buffer_to_window_coords(handle(), win.getValue(), bufferX, bufferY, windowX.handle(), windowY.handle());
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
     */
    public boolean forwardDisplayLine(TextIter iter) {
        var RESULT = gtk_h.gtk_text_view_forward_display_line(handle(), iter.handle());
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
     */
    public boolean forwardDisplayLineEnd(TextIter iter) {
        var RESULT = gtk_h.gtk_text_view_forward_display_line_end(handle(), iter.handle());
        return RESULT != 0;
    }
    
    /**
     * Returns whether pressing the &lt;kbd>Tab</kbd&gt; key inserts a tab characters.
     * <p>
     * See {@link TextView#setAcceptsTab}.
     */
    public boolean getAcceptsTab() {
        var RESULT = gtk_h.gtk_text_view_get_accepts_tab(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the bottom margin for text in the {@code text_view}.
     */
    public int getBottomMargin() {
        var RESULT = gtk_h.gtk_text_view_get_bottom_margin(handle());
        return RESULT;
    }
    
    /**
     * Returns the {@code GtkTextBuffer} being displayed by this text view.
     * <p>
     * The reference count on the buffer is not incremented; the caller
     * of this function won’t own a new reference.
     */
    public TextBuffer getBuffer() {
        var RESULT = gtk_h.gtk_text_view_get_buffer(handle());
        return new TextBuffer(Refcounted.get(RESULT, false));
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
     */
    public void getCursorLocations(TextIter iter, org.gtk.gdk.Rectangle strong, org.gtk.gdk.Rectangle weak) {
        gtk_h.gtk_text_view_get_cursor_locations(handle(), iter.handle(), strong.handle(), weak.handle());
    }
    
    /**
     * Find out whether the cursor should be displayed.
     */
    public boolean getCursorVisible() {
        var RESULT = gtk_h.gtk_text_view_get_cursor_visible(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns the default editability of the {@code GtkTextView}.
     * <p>
     * Tags in the buffer may override this setting for some ranges of text.
     */
    public boolean getEditable() {
        var RESULT = gtk_h.gtk_text_view_get_editable(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the menu model that gets added to the context menu
     * or {@code null} if none has been set.
     */
    public org.gtk.gio.MenuModel getExtraMenu() {
        var RESULT = gtk_h.gtk_text_view_get_extra_menu(handle());
        return new org.gtk.gio.MenuModel(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets a {@code GtkWidget} that has previously been set as gutter.
     * <p>
     * See {@link TextView#setGutter}.
     * <p>
     * {@code win} must be one of {@link TextWindowType#LEFT}, {@link TextWindowType#RIGHT},
     * {@link TextWindowType#TOP}, or {@link TextWindowType#BOTTOM}.
     */
    public Widget getGutter(TextWindowType win) {
        var RESULT = gtk_h.gtk_text_view_get_gutter(handle(), win.getValue());
        return new Widget(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the default indentation of paragraphs in {@code text_view}.
     * <p>
     * Tags in the view’s buffer may override the default.
     * The indentation may be negative.
     */
    public int getIndent() {
        var RESULT = gtk_h.gtk_text_view_get_indent(handle());
        return RESULT;
    }
    
    /**
     * Gets the {@code input-hints} of the {@code GtkTextView}.
     */
    public InputHints getInputHints() {
        var RESULT = gtk_h.gtk_text_view_get_input_hints(handle());
        return new InputHints(RESULT);
    }
    
    /**
     * Gets the {@code input-purpose} of the {@code GtkTextView}.
     */
    public InputPurpose getInputPurpose() {
        var RESULT = gtk_h.gtk_text_view_get_input_purpose(handle());
        return new InputPurpose(RESULT);
    }
    
    /**
     * Retrieves the iterator at buffer coordinates @x and @y.
     * <p>
     * Buffer coordinates are coordinates for the entire buffer, not just
     * the currently-displayed portion. If you have coordinates from an
     * event, you have to convert those to buffer coordinates with
     * {@link TextView#windowToBufferCoords}.
     */
    public boolean getIterAtLocation(TextIter iter, int x, int y) {
        var RESULT = gtk_h.gtk_text_view_get_iter_at_location(handle(), iter.handle(), x, y);
        return RESULT != 0;
    }
    
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
        var RESULT = gtk_h.gtk_text_view_get_iter_at_position(handle(), iter.handle(), trailing.handle(), x, y);
        return RESULT != 0;
    }
    
    /**
     * Gets a rectangle which roughly contains the character at {@code iter}.
     * <p>
     * The rectangle position is in buffer coordinates; use
     * {@link TextView#bufferToWindowCoords} to convert these
     * coordinates to coordinates for one of the windows in the text view.
     */
    public void getIterLocation(TextIter iter, org.gtk.gdk.Rectangle location) {
        gtk_h.gtk_text_view_get_iter_location(handle(), iter.handle(), location.handle());
    }
    
    /**
     * Gets the default justification of paragraphs in {@code text_view}.
     * <p>
     * Tags in the buffer may override the default.
     */
    public Justification getJustification() {
        var RESULT = gtk_h.gtk_text_view_get_justification(handle());
        return new Justification(RESULT);
    }
    
    /**
     * Gets the default left margin size of paragraphs in the {@code text_view}.
     * <p>
     * Tags in the buffer may override the default.
     */
    public int getLeftMargin() {
        var RESULT = gtk_h.gtk_text_view_get_left_margin(handle());
        return RESULT;
    }
    
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
        gtk_h.gtk_text_view_get_line_at_y(handle(), targetIter.handle(), y, lineTop.handle());
    }
    
    /**
     * Gets the y coordinate of the top of the line containing {@code iter},
     * and the height of the line.
     * <p>
     * The coordinate is a buffer coordinate; convert to window
     * coordinates with {@link TextView#bufferToWindowCoords}.
     */
    public void getLineYrange(TextIter iter, PointerInteger y, PointerInteger height) {
        gtk_h.gtk_text_view_get_line_yrange(handle(), iter.handle(), y.handle(), height.handle());
    }
    
    /**
     * Gets the {@code PangoContext} that is used for rendering LTR directed
     * text layouts.
     * <p>
     * The context may be replaced when CSS changes occur.
     */
    public org.pango.Context getLtrContext() {
        var RESULT = gtk_h.gtk_text_view_get_ltr_context(handle());
        return new org.pango.Context(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets whether the {@code GtkTextView} uses monospace styling.
     */
    public boolean getMonospace() {
        var RESULT = gtk_h.gtk_text_view_get_monospace(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns whether the {@code GtkTextView} is in overwrite mode or not.
     */
    public boolean getOverwrite() {
        var RESULT = gtk_h.gtk_text_view_get_overwrite(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the default number of pixels to put above paragraphs.
     * <p>
     * Adding this function with {@link TextView#getPixelsBelowLines}
     * is equal to the line space between each paragraph.
     */
    public int getPixelsAboveLines() {
        var RESULT = gtk_h.gtk_text_view_get_pixels_above_lines(handle());
        return RESULT;
    }
    
    /**
     * Gets the default number of pixels to put below paragraphs.
     * <p>
     * The line space is the sum of the value returned by this function and
     * the value returned by {@link TextView#getPixelsAboveLines}.
     */
    public int getPixelsBelowLines() {
        var RESULT = gtk_h.gtk_text_view_get_pixels_below_lines(handle());
        return RESULT;
    }
    
    /**
     * Gets the default number of pixels to put between wrapped lines
     * inside a paragraph.
     */
    public int getPixelsInsideWrap() {
        var RESULT = gtk_h.gtk_text_view_get_pixels_inside_wrap(handle());
        return RESULT;
    }
    
    /**
     * Gets the default right margin for text in {@code text_view}.
     * <p>
     * Tags in the buffer may override the default.
     */
    public int getRightMargin() {
        var RESULT = gtk_h.gtk_text_view_get_right_margin(handle());
        return RESULT;
    }
    
    /**
     * Gets the {@code PangoContext} that is used for rendering RTL directed
     * text layouts.
     * <p>
     * The context may be replaced when CSS changes occur.
     */
    public org.pango.Context getRtlContext() {
        var RESULT = gtk_h.gtk_text_view_get_rtl_context(handle());
        return new org.pango.Context(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the default tabs for {@code text_view}.
     * <p>
     * Tags in the buffer may override the defaults. The returned array
     * will be {@code null} if “standard” (8-space) tabs are used. Free the
     * return value with {@link org.pango.TabArray#free}.
     */
    public org.pango.TabArray getTabs() {
        var RESULT = gtk_h.gtk_text_view_get_tabs(handle());
        return new org.pango.TabArray(Refcounted.get(RESULT, true));
    }
    
    /**
     * Gets the top margin for text in the {@code text_view}.
     */
    public int getTopMargin() {
        var RESULT = gtk_h.gtk_text_view_get_top_margin(handle());
        return RESULT;
    }
    
    /**
     * Fills {@code visible_rect} with the currently-visible
     * region of the buffer, in buffer coordinates.
     * <p>
     * Convert to window coordinates with
     * {@link TextView#bufferToWindowCoords}.
     */
    public void getVisibleRect(org.gtk.gdk.Rectangle visibleRect) {
        gtk_h.gtk_text_view_get_visible_rect(handle(), visibleRect.handle());
    }
    
    /**
     * Gets the line wrapping for the view.
     */
    public WrapMode getWrapMode() {
        var RESULT = gtk_h.gtk_text_view_get_wrap_mode(handle());
        return new WrapMode(RESULT);
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
        var RESULT = gtk_h.gtk_text_view_im_context_filter_keypress(handle(), event.handle());
        return RESULT != 0;
    }
    
    /**
     * Moves a mark within the buffer so that it's
     * located within the currently-visible text area.
     */
    public boolean moveMarkOnscreen(TextMark mark) {
        var RESULT = gtk_h.gtk_text_view_move_mark_onscreen(handle(), mark.handle());
        return RESULT != 0;
    }
    
    /**
     * Updates the position of a child.
     * <p>
     * See {@link TextView#addOverlay}.
     */
    public void moveOverlay(Widget child, int xpos, int ypos) {
        gtk_h.gtk_text_view_move_overlay(handle(), child.handle(), xpos, ypos);
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
     */
    public boolean moveVisually(TextIter iter, int count) {
        var RESULT = gtk_h.gtk_text_view_move_visually(handle(), iter.handle(), count);
        return RESULT != 0;
    }
    
    /**
     * Moves the cursor to the currently visible region of the
     * buffer.
     */
    public boolean placeCursorOnscreen() {
        var RESULT = gtk_h.gtk_text_view_place_cursor_onscreen(handle());
        return RESULT != 0;
    }
    
    /**
     * Removes a child widget from {@code text_view}.
     */
    public void remove(Widget child) {
        gtk_h.gtk_text_view_remove(handle(), child.handle());
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
        gtk_h.gtk_text_view_reset_cursor_blink(handle());
    }
    
    /**
     * Reset the input method context of the text view if needed.
     * <p>
     * This can be necessary in the case where modifying the buffer
     * would confuse on-going input method behavior.
     */
    public void resetImContext() {
        gtk_h.gtk_text_view_reset_im_context(handle());
    }
    
    /**
     * Scrolls {@code text_view} the minimum distance such that {@code mark} is contained
     * within the visible area of the widget.
     */
    public void scrollMarkOnscreen(TextMark mark) {
        gtk_h.gtk_text_view_scroll_mark_onscreen(handle(), mark.handle());
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
     */
    public boolean scrollToIter(TextIter iter, double withinMargin, boolean useAlign, double xalign, double yalign) {
        var RESULT = gtk_h.gtk_text_view_scroll_to_iter(handle(), iter.handle(), withinMargin, useAlign ? 1 : 0, xalign, yalign);
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
     */
    public void scrollToMark(TextMark mark, double withinMargin, boolean useAlign, double xalign, double yalign) {
        gtk_h.gtk_text_view_scroll_to_mark(handle(), mark.handle(), withinMargin, useAlign ? 1 : 0, xalign, yalign);
    }
    
    /**
     * Sets the behavior of the text widget when the &lt;kbd>Tab</kbd&gt; key is pressed.
     * <p>
     * If {@code accepts_tab} is {@code true}, a tab character is inserted. If {@code accepts_tab}
     * is {@code false} the keyboard focus is moved to the next widget in the focus
     * chain.
     */
    public void setAcceptsTab(boolean acceptsTab) {
        gtk_h.gtk_text_view_set_accepts_tab(handle(), acceptsTab ? 1 : 0);
    }
    
    /**
     * Sets the bottom margin for text in {@code text_view}.
     * <p>
     * Note that this function is confusingly named.
     * In CSS terms, the value set here is padding.
     */
    public void setBottomMargin(int bottomMargin) {
        gtk_h.gtk_text_view_set_bottom_margin(handle(), bottomMargin);
    }
    
    /**
     * Sets {@code buffer} as the buffer being displayed by {@code text_view}.
     * <p>
     * The previous buffer displayed by the text view is unreferenced, and
     * a reference is added to {@code buffer}. If you owned a reference to {@code buffer}
     * before passing it to this function, you must remove that reference
     * yourself; {@code GtkTextView} will not “adopt” it.
     */
    public void setBuffer(TextBuffer buffer) {
        gtk_h.gtk_text_view_set_buffer(handle(), buffer.handle());
    }
    
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
        gtk_h.gtk_text_view_set_cursor_visible(handle(), setting ? 1 : 0);
    }
    
    /**
     * Sets the default editability of the {@code GtkTextView}.
     * <p>
     * You can override this default setting with tags in the buffer,
     * using the “editable” attribute of tags.
     */
    public void setEditable(boolean setting) {
        gtk_h.gtk_text_view_set_editable(handle(), setting ? 1 : 0);
    }
    
    /**
     * Sets a menu model to add when constructing the context
     * menu for {@code text_view}.
     * <p>
     * You can pass {@code null} to remove a previously set extra menu.
     */
    public void setExtraMenu(org.gtk.gio.MenuModel model) {
        gtk_h.gtk_text_view_set_extra_menu(handle(), model.handle());
    }
    
    /**
     * Places {@code widget} into the gutter specified by {@code win}.
     * <p>
     * {@code win} must be one of {@link TextWindowType#LEFT}, {@link TextWindowType#RIGHT},
     * {@link TextWindowType#TOP}, or {@link TextWindowType#BOTTOM}.
     */
    public void setGutter(TextWindowType win, Widget widget) {
        gtk_h.gtk_text_view_set_gutter(handle(), win.getValue(), widget.handle());
    }
    
    /**
     * Sets the default indentation for paragraphs in {@code text_view}.
     * <p>
     * Tags in the buffer may override the default.
     */
    public void setIndent(int indent) {
        gtk_h.gtk_text_view_set_indent(handle(), indent);
    }
    
    /**
     * Sets the {@code input-hints} of the {@code GtkTextView}.
     * <p>
     * The {@code input-hints} allow input methods to fine-tune
     * their behaviour.
     */
    public void setInputHints(InputHints hints) {
        gtk_h.gtk_text_view_set_input_hints(handle(), hints.getValue());
    }
    
    /**
     * Sets the {@code input-purpose} of the {@code GtkTextView}.
     * <p>
     * The {@code input-purpose} can be used by on-screen keyboards
     * and other input methods to adjust their behaviour.
     */
    public void setInputPurpose(InputPurpose purpose) {
        gtk_h.gtk_text_view_set_input_purpose(handle(), purpose.getValue());
    }
    
    /**
     * Sets the default justification of text in {@code text_view}.
     * <p>
     * Tags in the view’s buffer may override the default.
     */
    public void setJustification(Justification justification) {
        gtk_h.gtk_text_view_set_justification(handle(), justification.getValue());
    }
    
    /**
     * Sets the default left margin for text in {@code text_view}.
     * <p>
     * Tags in the buffer may override the default.
     * <p>
     * Note that this function is confusingly named.
     * In CSS terms, the value set here is padding.
     */
    public void setLeftMargin(int leftMargin) {
        gtk_h.gtk_text_view_set_left_margin(handle(), leftMargin);
    }
    
    /**
     * Sets whether the {@code GtkTextView} should display text in
     * monospace styling.
     */
    public void setMonospace(boolean monospace) {
        gtk_h.gtk_text_view_set_monospace(handle(), monospace ? 1 : 0);
    }
    
    /**
     * Changes the {@code GtkTextView} overwrite mode.
     */
    public void setOverwrite(boolean overwrite) {
        gtk_h.gtk_text_view_set_overwrite(handle(), overwrite ? 1 : 0);
    }
    
    /**
     * Sets the default number of blank pixels above paragraphs in {@code text_view}.
     * <p>
     * Tags in the buffer for {@code text_view} may override the defaults.
     */
    public void setPixelsAboveLines(int pixelsAboveLines) {
        gtk_h.gtk_text_view_set_pixels_above_lines(handle(), pixelsAboveLines);
    }
    
    /**
     * Sets the default number of pixels of blank space
     * to put below paragraphs in {@code text_view}.
     * <p>
     * May be overridden by tags applied to {@code text_view}’s buffer.
     */
    public void setPixelsBelowLines(int pixelsBelowLines) {
        gtk_h.gtk_text_view_set_pixels_below_lines(handle(), pixelsBelowLines);
    }
    
    /**
     * Sets the default number of pixels of blank space to leave between
     * display/wrapped lines within a paragraph.
     * <p>
     * May be overridden by tags in {@code text_view}’s buffer.
     */
    public void setPixelsInsideWrap(int pixelsInsideWrap) {
        gtk_h.gtk_text_view_set_pixels_inside_wrap(handle(), pixelsInsideWrap);
    }
    
    /**
     * Sets the default right margin for text in the text view.
     * <p>
     * Tags in the buffer may override the default.
     * <p>
     * Note that this function is confusingly named.
     * In CSS terms, the value set here is padding.
     */
    public void setRightMargin(int rightMargin) {
        gtk_h.gtk_text_view_set_right_margin(handle(), rightMargin);
    }
    
    /**
     * Sets the default tab stops for paragraphs in {@code text_view}.
     * <p>
     * Tags in the buffer may override the default.
     */
    public void setTabs(org.pango.TabArray tabs) {
        gtk_h.gtk_text_view_set_tabs(handle(), tabs.handle());
    }
    
    /**
     * Sets the top margin for text in {@code text_view}.
     * <p>
     * Note that this function is confusingly named.
     * In CSS terms, the value set here is padding.
     */
    public void setTopMargin(int topMargin) {
        gtk_h.gtk_text_view_set_top_margin(handle(), topMargin);
    }
    
    /**
     * Sets the line wrapping for the view.
     */
    public void setWrapMode(WrapMode wrapMode) {
        gtk_h.gtk_text_view_set_wrap_mode(handle(), wrapMode.getValue());
    }
    
    /**
     * Determines whether {@code iter} is at the start of a display line.
     * <p>
     * See {@link TextView#forwardDisplayLine} for an
     * explanation of display lines vs. paragraphs.
     */
    public boolean startsDisplayLine(TextIter iter) {
        var RESULT = gtk_h.gtk_text_view_starts_display_line(handle(), iter.handle());
        return RESULT != 0;
    }
    
    /**
     * Converts coordinates on the window identified by {@code win} to buffer
     * coordinates.
     */
    public void windowToBufferCoords(TextWindowType win, int windowX, int windowY, PointerInteger bufferX, PointerInteger bufferY) {
        gtk_h.gtk_text_view_window_to_buffer_coords(handle(), win.getValue(), windowX, windowY, bufferX.handle(), bufferY.handle());
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("backspace").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewBackspace",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("copy-clipboard").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewCopyClipboard",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("cut-clipboard").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewCutClipboard",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("delete-from-cursor").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewDeleteFromCursor",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("extend-selection").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewExtendSelection",
                        MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("insert-at-cursor").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewInsertAtCursor",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("insert-emoji").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewInsertEmoji",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("move-cursor").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewMoveCursor",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("move-viewport").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewMoveViewport",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("paste-clipboard").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewPasteClipboard",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("preedit-changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewPreeditChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("select-all").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewSelectAll",
                        MethodType.methodType(void.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("set-anchor").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewSetAnchor",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("toggle-cursor-visible").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewToggleCursorVisible",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("toggle-overwrite").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextView.Callbacks.class, "signalTextViewToggleOverwrite",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
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
