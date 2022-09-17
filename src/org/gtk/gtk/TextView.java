package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A widget that displays the contents of a {@link org.gtk.gtk.TextBuffer}.
 * <p>
 * !{@link [An example GtkTextview]}(multiline-text.png)
 * <p>
 * You may wish to begin by reading the {@link [conceptual overview]}(section-text-widget.html),
 * which gives an overview of all the objects and data types related to the
 * text widget and how they work together.
 * <p>
 * <h2>CSS nodes</h2>
 * <p><pre>
 * textview.view
 * &#9500;&#9472;&#9472; border.top
 * &#9500;&#9472;&#9472; border.left
 * &#9500;&#9472;&#9472; text
 * &#9474;   &#9584;&#9472;&#9472; {@link [selection]}
 * &#9500;&#9472;&#9472; border.right
 * &#9500;&#9472;&#9472; border.bottom
 * &#9584;&#9472;&#9472; {@link [window.popup]}
 * </pre>
 * <p><code>GtkTextView</code> has a main css node with name textview and style class .view,
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
 * <p><code>GtkTextView</code> uses the {@link org.gtk.gtk.AccessibleRole#TEXT_BOX} role.
 */
public class TextView extends Widget implements Accessible, Buildable, ConstraintTarget, Scrollable {

    public TextView(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TextView */
    public static TextView castFrom(org.gtk.gobject.Object gobject) {
        return new TextView(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.gtk_text_view_new(), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkTextView</code>.
     * 
     * If you don&#8217;t call {@link org.gtk.gtk.TextView#setBuffer} before using the
     * text view, an empty default buffer will be created for you. Get the
     * buffer with {@link org.gtk.gtk.TextView#getBuffer}. If you want to specify
     * your own buffer, consider {@link [ctor@Gtk.TextView.new_with_buffer] (ref=ctor)}.
     */
    public TextView() {
        super(constructNew());
    }
    
    private static Reference constructNewWithBuffer(TextBuffer buffer) {
        Reference RESULT = References.get(gtk_h.gtk_text_view_new_with_buffer(buffer.handle()), false);
        return RESULT;
    }
    
    /**
     * Creates a new <code>GtkTextView</code> widget displaying the buffer @buffer.
     * 
     * One buffer can be shared among many widgets. @buffer may be <code>NULL
     * to</code> create a default buffer, in which case this function is equivalent
     * to {@link [ctor@Gtk.TextView.new] (ref=ctor)}. The text view adds its own reference count
     * to the buffer; it does not take over an existing reference.
     */
    public static TextView newWithBuffer(TextBuffer buffer) {
        return new TextView(constructNewWithBuffer(buffer));
    }
    
    /**
     * Adds a child widget in the text buffer, at the given @anchor.
     */
    public void addChildAtAnchor(Widget child, TextChildAnchor anchor) {
        gtk_h.gtk_text_view_add_child_at_anchor(handle(), child.handle(), anchor.handle());
    }
    
    /**
     * Adds @child at a fixed coordinate in the <code>GtkTextView</code>&#39;s text window.
     * <p>
     * The @xpos and @ypos must be in buffer coordinates (see
     * {@link org.gtk.gtk.TextView#getIterLocation} to convert to
     * buffer coordinates).
     * <p>
     * @child will scroll with the text view.
     * <p>
     * If instead you want a widget that will not move with the<code>GtkTextView</code> contents see <code>GtkOverlay</code>.
     */
    public void addOverlay(Widget child, int xpos, int ypos) {
        gtk_h.gtk_text_view_add_overlay(handle(), child.handle(), xpos, ypos);
    }
    
    /**
     * Moves the given @iter backward by one display (wrapped) line.
     * <p>
     * A display line is different from a paragraph. Paragraphs are
     * separated by newlines or other paragraph separator characters.
     * Display lines are created by line-wrapping a paragraph. If
     * wrapping is turned off, display lines and paragraphs will be the
     * same. Display lines are divided differently for each view, since
     * they depend on the view&#8217;s width; paragraphs are the same in all
     * views, since they depend on the contents of the <code>GtkTextBuffer</code>.
     */
    public boolean backwardDisplayLine(TextIter iter) {
        var RESULT = gtk_h.gtk_text_view_backward_display_line(handle(), iter.handle());
        return (RESULT != 0);
    }
    
    /**
     * Moves the given @iter backward to the next display line start.
     * <p>
     * A display line is different from a paragraph. Paragraphs are
     * separated by newlines or other paragraph separator characters.
     * Display lines are created by line-wrapping a paragraph. If
     * wrapping is turned off, display lines and paragraphs will be the
     * same. Display lines are divided differently for each view, since
     * they depend on the view&#8217;s width; paragraphs are the same in all
     * views, since they depend on the contents of the <code>GtkTextBuffer</code>.
     */
    public boolean backwardDisplayLineStart(TextIter iter) {
        var RESULT = gtk_h.gtk_text_view_backward_display_line_start(handle(), iter.handle());
        return (RESULT != 0);
    }
    
    /**
     * Moves the given @iter forward by one display (wrapped) line.
     * <p>
     * A display line is different from a paragraph. Paragraphs are
     * separated by newlines or other paragraph separator characters.
     * Display lines are created by line-wrapping a paragraph. If
     * wrapping is turned off, display lines and paragraphs will be the
     * same. Display lines are divided differently for each view, since
     * they depend on the view&#8217;s width; paragraphs are the same in all
     * views, since they depend on the contents of the <code>GtkTextBuffer</code>.
     */
    public boolean forwardDisplayLine(TextIter iter) {
        var RESULT = gtk_h.gtk_text_view_forward_display_line(handle(), iter.handle());
        return (RESULT != 0);
    }
    
    /**
     * Moves the given @iter forward to the next display line end.
     * <p>
     * A display line is different from a paragraph. Paragraphs are
     * separated by newlines or other paragraph separator characters.
     * Display lines are created by line-wrapping a paragraph. If
     * wrapping is turned off, display lines and paragraphs will be the
     * same. Display lines are divided differently for each view, since
     * they depend on the view&#8217;s width; paragraphs are the same in all
     * views, since they depend on the contents of the <code>GtkTextBuffer</code>.
     */
    public boolean forwardDisplayLineEnd(TextIter iter) {
        var RESULT = gtk_h.gtk_text_view_forward_display_line_end(handle(), iter.handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether pressing the &#60;kbd&#62;Tab&#60;/kbd&#62; key inserts a tab characters.
     * 
     * See {@link org.gtk.gtk.TextView#setAcceptsTab}.
     */
    public boolean getAcceptsTab() {
        var RESULT = gtk_h.gtk_text_view_get_accepts_tab(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the bottom margin for text in the @text_view.
     */
    public int getBottomMargin() {
        var RESULT = gtk_h.gtk_text_view_get_bottom_margin(handle());
        return RESULT;
    }
    
    /**
     * Returns the <code>GtkTextBuffer</code> being displayed by this text view.
     * 
     * The reference count on the buffer is not incremented; the caller
     * of this function won&#8217;t own a new reference.
     */
    public TextBuffer getBuffer() {
        var RESULT = gtk_h.gtk_text_view_get_buffer(handle());
        return new TextBuffer(References.get(RESULT, false));
    }
    
    /**
     * Determine the positions of the strong and weak cursors if the
     * insertion point is at @iter.
     * 
     * The position of each cursor is stored as a zero-width rectangle.
     * The strong cursor location is the location where characters of
     * the directionality equal to the base direction of the paragraph
     * are inserted. The weak cursor location is the location where
     * characters of the directionality opposite to the base direction
     * of the paragraph are inserted.
     * 
     * If @iter is <code>NULL,</code> the actual cursor position is used.
     * 
     * Note that if @iter happens to be the actual cursor position, and
     * there is currently an IM preedit sequence being entered, the
     * returned locations will be adjusted to account for the preedit
     * cursor&#8217;s offset within the preedit sequence.
     * 
     * The rectangle position is in buffer coordinates; use
     * {@link org.gtk.gtk.TextView#bufferToWindowCoords} to convert these
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
        return (RESULT != 0);
    }
    
    /**
     * Returns the default editability of the <code>GtkTextView</code>.
     * 
     * Tags in the buffer may override this setting for some ranges of text.
     */
    public boolean getEditable() {
        var RESULT = gtk_h.gtk_text_view_get_editable(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the menu model that gets added to the context menu
     * or <code>null</code> if none has been set.
     */
    public org.gtk.gio.MenuModel getExtraMenu() {
        var RESULT = gtk_h.gtk_text_view_get_extra_menu(handle());
        return new org.gtk.gio.MenuModel(References.get(RESULT, false));
    }
    
    /**
     * Gets a <code>GtkWidget</code> that has previously been set as gutter.
     * 
     * See {@link org.gtk.gtk.TextView#setGutter}.
     * 
     * @win must be one of <code>GTK_TEXT_WINDOW_LEFT,</code> <code>GTK_TEXT_WINDOW_RIGHT,
     * %GTK_TEXT_WINDOW_TOP,</code> or or %GTK_TEXT_WINDOW_BOTTOM.
     */
    public Widget getGutter(TextWindowType win) {
        var RESULT = gtk_h.gtk_text_view_get_gutter(handle(), win.getValue());
        return new Widget(References.get(RESULT, false));
    }
    
    /**
     * Gets the default indentation of paragraphs in @text_view.
     * 
     * Tags in the view&#8217;s buffer may override the default.
     * The indentation may be negative.
     */
    public int getIndent() {
        var RESULT = gtk_h.gtk_text_view_get_indent(handle());
        return RESULT;
    }
    
    /**
     * Gets the <code>input-hints</code> of the <code>GtkTextView</code>.
     */
    public int getInputHints() {
        var RESULT = gtk_h.gtk_text_view_get_input_hints(handle());
        return RESULT;
    }
    
    /**
     * Gets the <code>input-purpose</code> of the <code>GtkTextView</code>.
     */
    public InputPurpose getInputPurpose() {
        var RESULT = gtk_h.gtk_text_view_get_input_purpose(handle());
        return InputPurpose.fromValue(RESULT);
    }
    
    /**
     * Retrieves the iterator at buffer coordinates @x and @y.
     * 
     * Buffer coordinates are coordinates for the entire buffer, not just
     * the currently-displayed portion. If you have coordinates from an
     * event, you have to convert those to buffer coordinates with
     * {@link org.gtk.gtk.TextView#windowToBufferCoords}.
     */
    public boolean getIterAtLocation(TextIter iter, int x, int y) {
        var RESULT = gtk_h.gtk_text_view_get_iter_at_location(handle(), iter.handle(), x, y);
        return (RESULT != 0);
    }
    
    /**
     * Gets a rectangle which roughly contains the character at @iter.
     * 
     * The rectangle position is in buffer coordinates; use
     * {@link org.gtk.gtk.TextView#bufferToWindowCoords} to convert these
     * coordinates to coordinates for one of the windows in the text view.
     */
    public void getIterLocation(TextIter iter, org.gtk.gdk.Rectangle location) {
        gtk_h.gtk_text_view_get_iter_location(handle(), iter.handle(), location.handle());
    }
    
    /**
     * Gets the default justification of paragraphs in @text_view.
     * 
     * Tags in the buffer may override the default.
     */
    public Justification getJustification() {
        var RESULT = gtk_h.gtk_text_view_get_justification(handle());
        return Justification.fromValue(RESULT);
    }
    
    /**
     * Gets the default left margin size of paragraphs in the @text_view.
     * 
     * Tags in the buffer may override the default.
     */
    public int getLeftMargin() {
        var RESULT = gtk_h.gtk_text_view_get_left_margin(handle());
        return RESULT;
    }
    
    /**
     * Gets the <code>PangoContext</code> that is used for rendering LTR directed
     * text layouts.
     * 
     * The context may be replaced when CSS changes occur.
     */
    public org.pango.Context getLtrContext() {
        var RESULT = gtk_h.gtk_text_view_get_ltr_context(handle());
        return new org.pango.Context(References.get(RESULT, false));
    }
    
    /**
     * Gets whether the <code>GtkTextView</code> uses monospace styling.
     */
    public boolean getMonospace() {
        var RESULT = gtk_h.gtk_text_view_get_monospace(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether the <code>GtkTextView</code> is in overwrite mode or not.
     */
    public boolean getOverwrite() {
        var RESULT = gtk_h.gtk_text_view_get_overwrite(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the default number of pixels to put above paragraphs.
     * 
     * Adding this function with {@link org.gtk.gtk.TextView#getPixelsBelowLines}
     * is equal to the line space between each paragraph.
     */
    public int getPixelsAboveLines() {
        var RESULT = gtk_h.gtk_text_view_get_pixels_above_lines(handle());
        return RESULT;
    }
    
    /**
     * Gets the default number of pixels to put below paragraphs.
     * 
     * The line space is the sum of the value returned by this function and
     * the value returned by {@link org.gtk.gtk.TextView#getPixelsAboveLines}.
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
     * Gets the default right margin for text in @text_view.
     * 
     * Tags in the buffer may override the default.
     */
    public int getRightMargin() {
        var RESULT = gtk_h.gtk_text_view_get_right_margin(handle());
        return RESULT;
    }
    
    /**
     * Gets the <code>PangoContext</code> that is used for rendering RTL directed
     * text layouts.
     * 
     * The context may be replaced when CSS changes occur.
     */
    public org.pango.Context getRtlContext() {
        var RESULT = gtk_h.gtk_text_view_get_rtl_context(handle());
        return new org.pango.Context(References.get(RESULT, false));
    }
    
    /**
     * Gets the default tabs for @text_view.
     * 
     * Tags in the buffer may override the defaults. The returned array
     * will be <code>null</code> if &#8220;standard&#8221; (8-space) tabs are used. Free the
     * return value with {@link org.pango.TabArray#free}.
     */
    public org.pango.TabArray getTabs() {
        var RESULT = gtk_h.gtk_text_view_get_tabs(handle());
        return new org.pango.TabArray(References.get(RESULT, true));
    }
    
    /**
     * Gets the top margin for text in the @text_view.
     */
    public int getTopMargin() {
        var RESULT = gtk_h.gtk_text_view_get_top_margin(handle());
        return RESULT;
    }
    
    /**
     * Fills @visible_rect with the currently-visible
     * region of the buffer, in buffer coordinates.
     * 
     * Convert to window coordinates with
     * {@link org.gtk.gtk.TextView#bufferToWindowCoords}.
     */
    public void getVisibleRect(org.gtk.gdk.Rectangle visibleRect) {
        gtk_h.gtk_text_view_get_visible_rect(handle(), visibleRect.handle());
    }
    
    /**
     * Gets the line wrapping for the view.
     */
    public WrapMode getWrapMode() {
        var RESULT = gtk_h.gtk_text_view_get_wrap_mode(handle());
        return WrapMode.fromValue(RESULT);
    }
    
    /**
     * Allow the <code>GtkTextView</code> input method to internally handle key press
     * and release events.
     * <p>
     * If this function returns <code>TRUE,</code> then no further processing should be
     * done for this key event. See {@link org.gtk.gtk.IMContext#filterKeypress}.
     * <p>
     * Note that you are expected to call this function from your handler
     * when overriding key event handling. This is needed in the case when
     * you need to insert your own key handling between the input method
     * and the default key event handling of the <code>GtkTextView</code>.
     * <p><pre>c
     * static gboolean
     * gtk_foo_bar_key_press_event (GtkWidget *widget,
     *                              GdkEvent  *event)
     * {
     *   guint keyval;
     * 
     *   gdk_event_get_keyval ((GdkEvent*)event, &#38;keyval);
     * 
     *   if (keyval == GDK_KEY_Return || keyval == GDK_KEY_KP_Enter)
     *     {
     *       if (gtk_text_view_im_context_filter_keypress (GTK_TEXT_VIEW (widget), event))
     *         return TRUE;
     *     }
     * 
     *   // Do some stuff
     * 
     *   return GTK_WIDGET_CLASS (gtk_foo_bar_parent_class)-&#62;key_press_event (widget, event);
     * }
     * </pre>
     */
    public boolean imContextFilterKeypress(org.gtk.gdk.Event event) {
        var RESULT = gtk_h.gtk_text_view_im_context_filter_keypress(handle(), event.handle());
        return (RESULT != 0);
    }
    
    /**
     * Moves a mark within the buffer so that it&#39;s
     * located within the currently-visible text area.
     */
    public boolean moveMarkOnscreen(TextMark mark) {
        var RESULT = gtk_h.gtk_text_view_move_mark_onscreen(handle(), mark.handle());
        return (RESULT != 0);
    }
    
    /**
     * Updates the position of a child.
     * 
     * See {@link org.gtk.gtk.TextView#addOverlay}.
     */
    public void moveOverlay(Widget child, int xpos, int ypos) {
        gtk_h.gtk_text_view_move_overlay(handle(), child.handle(), xpos, ypos);
    }
    
    /**
     * Move the iterator a given number of characters visually, treating
     * it as the strong cursor position.
     * 
     * If @count is positive, then the new strong cursor position will
     * be @count positions to the right of the old cursor position.
     * If @count is negative then the new strong cursor position will
     * be @count positions to the left of the old cursor position.
     * 
     * In the presence of bi-directional text, the correspondence
     * between logical and visual order will depend on the direction
     * of the current run, and there may be jumps when the cursor
     * is moved off of the end of a run.
     */
    public boolean moveVisually(TextIter iter, int count) {
        var RESULT = gtk_h.gtk_text_view_move_visually(handle(), iter.handle(), count);
        return (RESULT != 0);
    }
    
    /**
     * Moves the cursor to the currently visible region of the
     * buffer.
     */
    public boolean placeCursorOnscreen() {
        var RESULT = gtk_h.gtk_text_view_place_cursor_onscreen(handle());
        return (RESULT != 0);
    }
    
    /**
     * Removes a child widget from @text_view.
     */
    public void remove(Widget child) {
        gtk_h.gtk_text_view_remove(handle(), child.handle());
    }
    
    /**
     * Ensures that the cursor is shown.
     * 
     * This also resets the time that it will stay blinking (or
     * visible, in case blinking is disabled).
     * 
     * This function should be called in response to user input
     * (e.g. from derived classes that override the textview&#39;s
     * event handlers).
     */
    public void resetCursorBlink() {
        gtk_h.gtk_text_view_reset_cursor_blink(handle());
    }
    
    /**
     * Reset the input method context of the text view if needed.
     * 
     * This can be necessary in the case where modifying the buffer
     * would confuse on-going input method behavior.
     */
    public void resetImContext() {
        gtk_h.gtk_text_view_reset_im_context(handle());
    }
    
    /**
     * Scrolls @text_view the minimum distance such that @mark is contained
     * within the visible area of the widget.
     */
    public void scrollMarkOnscreen(TextMark mark) {
        gtk_h.gtk_text_view_scroll_mark_onscreen(handle(), mark.handle());
    }
    
    /**
     * Scrolls @text_view so that @iter is on the screen in the position
     * indicated by @xalign and @yalign.
     * 
     * An alignment of 0.0 indicates left or top, 1.0 indicates right or
     * bottom, 0.5 means center. If @use_align is <code>FALSE,</code> the text scrolls
     * the minimal distance to get the mark onscreen, possibly not scrolling
     * at all. The effective screen for purposes of this function is reduced
     * by a margin of size @within_margin.
     * 
     * Note that this function uses the currently-computed height of the
     * lines in the text buffer. Line heights are computed in an idle
     * handler; so this function may not have the desired effect if it&#8217;s
     * called before the height computations. To avoid oddness, consider
     * using {@link org.gtk.gtk.TextView#scrollToMark} which saves a point to be
     * scrolled to after line validation.
     */
    public boolean scrollToIter(TextIter iter, double withinMargin, boolean useAlign, double xalign, double yalign) {
        var RESULT = gtk_h.gtk_text_view_scroll_to_iter(handle(), iter.handle(), withinMargin, useAlign ? 1 : 0, xalign, yalign);
        return (RESULT != 0);
    }
    
    /**
     * Scrolls @text_view so that @mark is on the screen in the position
     * indicated by @xalign and @yalign.
     * 
     * An alignment of 0.0 indicates left or top, 1.0 indicates right or
     * bottom, 0.5 means center. If @use_align is <code>FALSE,</code> the text scrolls
     * the minimal distance to get the mark onscreen, possibly not scrolling
     * at all. The effective screen for purposes of this function is reduced
     * by a margin of size @within_margin.
     */
    public void scrollToMark(TextMark mark, double withinMargin, boolean useAlign, double xalign, double yalign) {
        gtk_h.gtk_text_view_scroll_to_mark(handle(), mark.handle(), withinMargin, useAlign ? 1 : 0, xalign, yalign);
    }
    
    /**
     * Sets the behavior of the text widget when the &#60;kbd&#62;Tab&#60;/kbd&#62; key is pressed.
     * 
     * If @accepts_tab is <code>TRUE,</code> a tab character is inserted. If @accepts_tab
     * is <code>false</code> the keyboard focus is moved to the next widget in the focus
     * chain.
     */
    public void setAcceptsTab(boolean acceptsTab) {
        gtk_h.gtk_text_view_set_accepts_tab(handle(), acceptsTab ? 1 : 0);
    }
    
    /**
     * Sets the bottom margin for text in @text_view.
     * 
     * Note that this function is confusingly named.
     * In CSS terms, the value set here is padding.
     */
    public void setBottomMargin(int bottomMargin) {
        gtk_h.gtk_text_view_set_bottom_margin(handle(), bottomMargin);
    }
    
    /**
     * Sets @buffer as the buffer being displayed by @text_view.
     * <p>
     * The previous buffer displayed by the text view is unreferenced, and
     * a reference is added to @buffer. If you owned a reference to @buffer
     * before passing it to this function, you must remove that reference
     * yourself; <code>GtkTextView</code> will not &#8220;adopt&#8221; it.
     */
    public void setBuffer(TextBuffer buffer) {
        gtk_h.gtk_text_view_set_buffer(handle(), buffer.handle());
    }
    
    /**
     * Toggles whether the insertion point should be displayed.
     * 
     * A buffer with no editable text probably shouldn&#8217;t have a visible
     * cursor, so you may want to turn the cursor off.
     * 
     * Note that this property may be overridden by the
     * {@link [property@GtkSettings:gtk-keynav-use-caret] (ref=property)} setting.
     */
    public void setCursorVisible(boolean setting) {
        gtk_h.gtk_text_view_set_cursor_visible(handle(), setting ? 1 : 0);
    }
    
    /**
     * Sets the default editability of the <code>GtkTextView</code>.
     * 
     * You can override this default setting with tags in the buffer,
     * using the &#8220;editable&#8221; attribute of tags.
     */
    public void setEditable(boolean setting) {
        gtk_h.gtk_text_view_set_editable(handle(), setting ? 1 : 0);
    }
    
    /**
     * Sets a menu model to add when constructing the context
     * menu for @text_view.
     * 
     * You can pass <code>null</code> to remove a previously set extra menu.
     */
    public void setExtraMenu(org.gtk.gio.MenuModel model) {
        gtk_h.gtk_text_view_set_extra_menu(handle(), model.handle());
    }
    
    /**
     * Places @widget into the gutter specified by @win.
     * 
     * @win must be one of <code>GTK_TEXT_WINDOW_LEFT,</code> <code>GTK_TEXT_WINDOW_RIGHT,
     * %GTK_TEXT_WINDOW_TOP,</code> or or %GTK_TEXT_WINDOW_BOTTOM.
     */
    public void setGutter(TextWindowType win, Widget widget) {
        gtk_h.gtk_text_view_set_gutter(handle(), win.getValue(), widget.handle());
    }
    
    /**
     * Sets the default indentation for paragraphs in @text_view.
     * 
     * Tags in the buffer may override the default.
     */
    public void setIndent(int indent) {
        gtk_h.gtk_text_view_set_indent(handle(), indent);
    }
    
    /**
     * Sets the <code>input-hints</code> of the <code>GtkTextView</code>.
     * <p>
     * The <code>input-hints</code> allow input methods to fine-tune
     * their behaviour.
     */
    public void setInputHints(int hints) {
        gtk_h.gtk_text_view_set_input_hints(handle(), hints);
    }
    
    /**
     * Sets the <code>input-purpose</code> of the <code>GtkTextView</code>.
     * <p>
     * The <code>input-purpose</code> can be used by on-screen keyboards
     * and other input methods to adjust their behaviour.
     */
    public void setInputPurpose(InputPurpose purpose) {
        gtk_h.gtk_text_view_set_input_purpose(handle(), purpose.getValue());
    }
    
    /**
     * Sets the default justification of text in @text_view.
     * 
     * Tags in the view&#8217;s buffer may override the default.
     */
    public void setJustification(Justification justification) {
        gtk_h.gtk_text_view_set_justification(handle(), justification.getValue());
    }
    
    /**
     * Sets the default left margin for text in @text_view.
     * 
     * Tags in the buffer may override the default.
     * 
     * Note that this function is confusingly named.
     * In CSS terms, the value set here is padding.
     */
    public void setLeftMargin(int leftMargin) {
        gtk_h.gtk_text_view_set_left_margin(handle(), leftMargin);
    }
    
    /**
     * Sets whether the <code>GtkTextView</code> should display text in
     * monospace styling.
     */
    public void setMonospace(boolean monospace) {
        gtk_h.gtk_text_view_set_monospace(handle(), monospace ? 1 : 0);
    }
    
    /**
     * Changes the <code>GtkTextView</code> overwrite mode.
     */
    public void setOverwrite(boolean overwrite) {
        gtk_h.gtk_text_view_set_overwrite(handle(), overwrite ? 1 : 0);
    }
    
    /**
     * Sets the default number of blank pixels above paragraphs in @text_view.
     * 
     * Tags in the buffer for @text_view may override the defaults.
     */
    public void setPixelsAboveLines(int pixelsAboveLines) {
        gtk_h.gtk_text_view_set_pixels_above_lines(handle(), pixelsAboveLines);
    }
    
    /**
     * Sets the default number of pixels of blank space
     * to put below paragraphs in @text_view.
     * 
     * May be overridden by tags applied to @text_view&#8217;s buffer.
     */
    public void setPixelsBelowLines(int pixelsBelowLines) {
        gtk_h.gtk_text_view_set_pixels_below_lines(handle(), pixelsBelowLines);
    }
    
    /**
     * Sets the default number of pixels of blank space to leave between
     * display/wrapped lines within a paragraph.
     * 
     * May be overridden by tags in @text_view&#8217;s buffer.
     */
    public void setPixelsInsideWrap(int pixelsInsideWrap) {
        gtk_h.gtk_text_view_set_pixels_inside_wrap(handle(), pixelsInsideWrap);
    }
    
    /**
     * Sets the default right margin for text in the text view.
     * 
     * Tags in the buffer may override the default.
     * 
     * Note that this function is confusingly named.
     * In CSS terms, the value set here is padding.
     */
    public void setRightMargin(int rightMargin) {
        gtk_h.gtk_text_view_set_right_margin(handle(), rightMargin);
    }
    
    /**
     * Sets the default tab stops for paragraphs in @text_view.
     * 
     * Tags in the buffer may override the default.
     */
    public void setTabs(org.pango.TabArray tabs) {
        gtk_h.gtk_text_view_set_tabs(handle(), tabs.handle());
    }
    
    /**
     * Sets the top margin for text in @text_view.
     * 
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
     * Determines whether @iter is at the start of a display line.
     * 
     * See {@link org.gtk.gtk.TextView#forwardDisplayLine} for an
     * explanation of display lines vs. paragraphs.
     */
    public boolean startsDisplayLine(TextIter iter) {
        var RESULT = gtk_h.gtk_text_view_starts_display_line(handle(), iter.handle());
        return (RESULT != 0);
    }
    
    @FunctionalInterface
    public interface BackspaceHandler {
        void signalReceived(TextView source);
    }
    
    /**
     * Gets emitted when the user asks for it.
     * 
     * The ::backspace signal is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * The default bindings for this signal are
     * &#60;kbd&#62;Backspace&#60;/kbd&#62; and &#60;kbd&#62;Shift&#60;/kbd&#62;-&#60;kbd&#62;Backspace&#60;/kbd&#62;.
     */
    public SignalHandle onBackspace(BackspaceHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextViewBackspace", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("backspace").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface CopyClipboardHandler {
        void signalReceived(TextView source);
    }
    
    /**
     * Gets emitted to copy the selection to the clipboard.
     * 
     * The ::copy-clipboard signal is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * The default bindings for this signal are
     * &#60;kbd&#62;Ctrl&#60;/kbd&#62;-&#60;kbd&#62;c&#60;/kbd&#62; and
     * &#60;kbd&#62;Ctrl&#60;/kbd&#62;-&#60;kbd&#62;Insert&#60;/kbd&#62;.
     */
    public SignalHandle onCopyClipboard(CopyClipboardHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextViewCopyClipboard", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("copy-clipboard").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface CutClipboardHandler {
        void signalReceived(TextView source);
    }
    
    /**
     * Gets emitted to cut the selection to the clipboard.
     * 
     * The ::cut-clipboard signal is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * The default bindings for this signal are
     * &#60;kbd&#62;Ctrl&#60;/kbd&#62;-&#60;kbd&#62;x&#60;/kbd&#62; and
     * &#60;kbd&#62;Shift&#60;/kbd&#62;-&#60;kbd&#62;Delete&#60;/kbd&#62;.
     */
    public SignalHandle onCutClipboard(CutClipboardHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextViewCutClipboard", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("cut-clipboard").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface DeleteFromCursorHandler {
        void signalReceived(TextView source, DeleteType type, int count);
    }
    
    /**
     * Gets emitted when the user initiates a text deletion.
     * 
     * The ::delete-from-cursor signal is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * If the @type is <code>GTK_DELETE_CHARS,</code> GTK deletes the selection
     * if there is one, otherwise it deletes the requested number
     * of characters.
     * 
     * The default bindings for this signal are &#60;kbd&#62;Delete&#60;/kbd&#62; for
     * deleting a character, &#60;kbd&#62;Ctrl&#60;/kbd&#62;-&#60;kbd&#62;Delete&#60;/kbd&#62; for
     * deleting a word and &#60;kbd&#62;Ctrl&#60;/kbd&#62;-&#60;kbd&#62;Backspace&#60;/kbd&#62; for
     * deleting a word backwards.
     */
    public SignalHandle onDeleteFromCursor(DeleteFromCursorHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextViewDeleteFromCursor", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("delete-from-cursor").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ExtendSelectionHandler {
        boolean signalReceived(TextView source, TextExtendSelection granularity, TextIter location, TextIter start, TextIter end);
    }
    
    /**
     * Emitted when the selection needs to be extended at @location.
     */
    public SignalHandle onExtendSelection(ExtendSelectionHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(boolean.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextViewExtendSelection", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("extend-selection").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
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
     * 
     * The ::insert-at-cursor signal is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * This signal has no default bindings.
     */
    public SignalHandle onInsertAtCursor(InsertAtCursorHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextViewInsertAtCursor", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("insert-at-cursor").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface InsertEmojiHandler {
        void signalReceived(TextView source);
    }
    
    /**
     * Gets emitted to present the Emoji chooser for the @text_view.
     * 
     * The ::insert-emoji signal is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * The default bindings for this signal are
     * &#60;kbd&#62;Ctrl&#60;/kbd&#62;-&#60;kbd&#62;.&#60;/kbd&#62; and
     * &#60;kbd&#62;Ctrl&#60;/kbd&#62;-&#60;kbd&#62;;&#60;/kbd&#62;
     */
    public SignalHandle onInsertEmoji(InsertEmojiHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextViewInsertEmoji", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("insert-emoji").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MoveCursorHandler {
        void signalReceived(TextView source, MovementStep step, int count, boolean extendSelection);
    }
    
    /**
     * Gets emitted when the user initiates a cursor movement.
     * 
     * The ::move-cursor signal is a {@link [keybinding signal]}(class.SignalAction.html).
     * If the cursor is not visible in @text_view, this signal causes
     * the viewport to be moved instead.
     * 
     * Applications should not connect to it, but may emit it with
     * g_signal_emit_by_name() if they need to control the cursor
     * programmatically.
     * 
     * 
     * The default bindings for this signal come in two variants,
     * the variant with the &#60;kbd&#62;Shift&#60;/kbd&#62; modifier extends the
     * selection, the variant without it does not.
     * There are too many key combinations to list them all here.
     * 
     * - &#60;kbd&#62;&#8592;&#60;/kbd&#62;, &#60;kbd&#62;&#8594;&#60;/kbd&#62;, &#60;kbd&#62;&#8593;&#60;/kbd&#62;, &#60;kbd&#62;&#8595;&#60;/kbd&#62;
     *   move by individual characters/lines
     * - &#60;kbd&#62;Ctrl&#60;/kbd&#62;-&#60;kbd&#62;&#8594;&#60;/kbd&#62;, etc. move by words/paragraphs
     * - &#60;kbd&#62;Home&#60;/kbd&#62;, &#60;kbd&#62;End&#60;/kbd&#62; move to the ends of the buffer
     * - &#60;kbd&#62;PgUp&#60;/kbd&#62;, &#60;kbd&#62;PgDn&#60;/kbd&#62; move vertically by pages
     * - &#60;kbd&#62;Ctrl&#60;/kbd&#62;-&#60;kbd&#62;PgUp&#60;/kbd&#62;, &#60;kbd&#62;Ctrl&#60;/kbd&#62;-&#60;kbd&#62;PgDn&#60;/kbd&#62;
     *   move horizontally by pages
     */
    public SignalHandle onMoveCursor(MoveCursorHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextViewMoveCursor", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("move-cursor").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MoveViewportHandler {
        void signalReceived(TextView source, ScrollStep step, int count);
    }
    
    /**
     * Gets emitted to move the viewport.
     * 
     * The ::move-viewport signal is a {@link [keybinding signal]}(class.SignalAction.html),
     * which can be bound to key combinations to allow the user to move the viewport,
     * i.e. change what part of the text view is visible in a containing scrolled
     * window.
     * 
     * There are no default bindings for this signal.
     */
    public SignalHandle onMoveViewport(MoveViewportHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, int.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextViewMoveViewport", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("move-viewport").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
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
     * 
     * The ::paste-clipboard signal is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * The default bindings for this signal are
     * &#60;kbd&#62;Ctrl&#60;/kbd&#62;-&#60;kbd&#62;v&#60;/kbd&#62; and
     * &#60;kbd&#62;Shift&#60;/kbd&#62;-&#60;kbd&#62;Insert&#60;/kbd&#62;.
     */
    public SignalHandle onPasteClipboard(PasteClipboardHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextViewPasteClipboard", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("paste-clipboard").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface PreeditChangedHandler {
        void signalReceived(TextView source, java.lang.String preedit);
    }
    
    /**
     * Emitted when preedit text of the active IM changes.
     * 
     * If an input method is used, the typed text will not immediately
     * be committed to the buffer. So if you are interested in the text,
     * connect to this signal.
     * 
     * This signal is only emitted if the text at the given position
     * is actually editable.
     */
    public SignalHandle onPreeditChanged(PreeditChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextViewPreeditChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("preedit-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface SelectAllHandler {
        void signalReceived(TextView source, boolean select);
    }
    
    /**
     * Gets emitted to select or unselect the complete contents of the text view.
     * 
     * The ::select-all signal is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * The default bindings for this signal are
     * &#60;kbd&#62;Ctrl&#60;/kbd&#62;-&#60;kbd&#62;a&#60;/kbd&#62; and
     * &#60;kbd&#62;Ctrl&#60;/kbd&#62;-&#60;kbd&#62;/&#60;/kbd&#62; for selecting and
     * &#60;kbd&#62;Shift&#60;/kbd&#62;-&#60;kbd&#62;Ctrl&#60;/kbd&#62;-&#60;kbd&#62;a&#60;/kbd&#62; and
     * &#60;kbd&#62;Ctrl&#60;/kbd&#62;-&#60;kbd&#62;\\&#60;/kbd&#62; for unselecting.
     */
    public SignalHandle onSelectAll(SelectAllHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, boolean.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextViewSelectAll", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BOOLEAN, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("select-all").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface SetAnchorHandler {
        void signalReceived(TextView source);
    }
    
    /**
     * Gets emitted when the user initiates settings the &#34;anchor&#34; mark.
     * 
     * The ::set-anchor signal is a {@link [keybinding signal]}(class.SignalAction.html)
     * which gets emitted when the user initiates setting the &#34;anchor&#34;
     * mark. The &#34;anchor&#34; mark gets placed at the same position as the
     * &#34;insert&#34; mark.
     * 
     * This signal has no default bindings.
     */
    public SignalHandle onSetAnchor(SetAnchorHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextViewSetAnchor", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("set-anchor").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ToggleCursorVisibleHandler {
        void signalReceived(TextView source);
    }
    
    /**
     * Gets emitted to toggle the <code>cursor-visible</code> property.
     * 
     * The ::toggle-cursor-visible signal is a
     * {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * The default binding for this signal is &#60;kbd&#62;F7&#60;/kbd&#62;.
     */
    public SignalHandle onToggleCursorVisible(ToggleCursorVisibleHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextViewToggleCursorVisible", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("toggle-cursor-visible").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ToggleOverwriteHandler {
        void signalReceived(TextView source);
    }
    
    /**
     * Gets emitted to toggle the overwrite mode of the text view.
     * 
     * The ::toggle-overwrite signal is a {@link [keybinding signal]}(class.SignalAction.html).
     * 
     * The default binding for this signal is &#60;kbd&#62;Insert&#60;/kbd&#62;.
     */
    public SignalHandle onToggleOverwrite(ToggleOverwriteHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextViewToggleOverwrite", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("toggle-overwrite").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
