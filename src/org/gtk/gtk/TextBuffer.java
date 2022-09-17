package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Stores text and attributes for display in a <code>GtkTextView</code>.
 * 
 * You may wish to begin by reading the
 * {@link [text widget conceptual overview]}(section-text-widget.html),
 * which gives an overview of all the objects and data types
 * related to the text widget and how they work together.
 * 
 * GtkTextBuffer can support undoing changes to the buffer
 * content, see {@link org.gtk.gtk.TextBuffer#setEnableUndo}.
 */
public class TextBuffer extends org.gtk.gobject.Object {

    public TextBuffer(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to TextBuffer */
    public static TextBuffer castFrom(org.gtk.gobject.Object gobject) {
        return new TextBuffer(gobject.getReference());
    }
    
    private static Reference constructNew(TextTagTable table) {
        Reference RESULT = References.get(gtk_h.gtk_text_buffer_new(table.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new text buffer.
     */
    public TextBuffer(TextTagTable table) {
        super(constructNew(table));
    }
    
    /**
     * Adds the mark at position @where.
     * 
     * The mark must not be added to another buffer, and if its name
     * is not <code>null</code> then there must not be another mark in the buffer
     * with the same name.
     * 
     * Emits the {@link [signal@Gtk.TextBuffer::mark-set] (ref=signal)} signal as notification
     * of the mark&#39;s initial placement.
     */
    public void addMark(TextMark mark, TextIter where) {
        gtk_h.gtk_text_buffer_add_mark(handle(), mark.handle(), where.handle());
    }
    
    /**
     * Adds @clipboard to the list of clipboards in which the selection
     * contents of @buffer are available.
     * <p>
     * In most cases, @clipboard will be the <code>GdkClipboard</code> returned by
     * {@link org.gtk.gtk.Widget#getPrimaryClipboard} for a view of @buffer.
     */
    public void addSelectionClipboard(org.gtk.gdk.Clipboard clipboard) {
        gtk_h.gtk_text_buffer_add_selection_clipboard(handle(), clipboard.handle());
    }
    
    /**
     * Emits the &#8220;apply-tag&#8221; signal on @buffer.
     * 
     * The default handler for the signal applies
     * @tag to the given range. @start and @end do
     * not have to be in order.
     */
    public void applyTag(TextTag tag, TextIter start, TextIter end) {
        gtk_h.gtk_text_buffer_apply_tag(handle(), tag.handle(), start.handle(), end.handle());
    }
    
    /**
     * Emits the &#8220;apply-tag&#8221; signal on @buffer.
     * <p>
     * Calls {@link org.gtk.gtk.TextTagTable#lookup} on the buffer&#8217;s
     * tag table to get a <code>GtkTextTag</code>, then calls
     * {@link org.gtk.gtk.TextBuffer#applyTag}.
     */
    public void applyTagByName(java.lang.String name, TextIter start, TextIter end) {
        gtk_h.gtk_text_buffer_apply_tag_by_name(handle(), Interop.allocateNativeString(name).handle(), start.handle(), end.handle());
    }
    
    /**
     * Performs the appropriate action as if the user hit the delete
     * key with the cursor at the position specified by @iter.
     * 
     * In the normal case a single character will be deleted, but when
     * combining accents are involved, more than one character can
     * be deleted, and when precomposed character and accent combinations
     * are involved, less than one character will be deleted.
     * 
     * Because the buffer is modified, all outstanding iterators become
     * invalid after calling this function; however, the @iter will be
     * re-initialized to point to the location where text was deleted.
     */
    public boolean backspace(TextIter iter, boolean interactive, boolean defaultEditable) {
        var RESULT = gtk_h.gtk_text_buffer_backspace(handle(), iter.handle(), interactive ? 1 : 0, defaultEditable ? 1 : 0);
        return (RESULT != 0);
    }
    
    /**
     * Denotes the beginning of an action that may not be undone.
     * 
     * This will cause any previous operations in the undo/redo queue
     * to be cleared.
     * 
     * This should be paired with a call to
     * {@link org.gtk.gtk.TextBuffer#endIrreversibleAction} after the irreversible
     * action has completed.
     * 
     * You may nest calls to gtk_text_buffer_begin_irreversible_action()
     * and gtk_text_buffer_end_irreversible_action() pairs.
     */
    public void beginIrreversibleAction() {
        gtk_h.gtk_text_buffer_begin_irreversible_action(handle());
    }
    
    /**
     * Called to indicate that the buffer operations between here and a
     * call to gtk_text_buffer_end_user_action() are part of a single
     * user-visible operation.
     * <p>
     * The operations between gtk_text_buffer_begin_user_action() and
     * gtk_text_buffer_end_user_action() can then be grouped when creating
     * an undo stack. <code>GtkTextBuffer</code> maintains a count of calls to
     * gtk_text_buffer_begin_user_action() that have not been closed with
     * a call to gtk_text_buffer_end_user_action(), and emits the
     * &#8220;begin-user-action&#8221; and &#8220;end-user-action&#8221; signals only for the
     * outermost pair of calls. This allows you to build user actions
     * from other user actions.
     * 
     * The &#8220;interactive&#8221; buffer mutation functions, such as
     * {@link org.gtk.gtk.TextBuffer#insertInteractive}, automatically call
     * begin/end user action around the buffer operations they perform,
     * so there&#39;s no need to add extra calls if you user action consists
     * solely of a single call to one of those functions.
     */
    public void beginUserAction() {
        gtk_h.gtk_text_buffer_begin_user_action(handle());
    }
    
    /**
     * Copies the currently-selected text to a clipboard.
     */
    public void copyClipboard(org.gtk.gdk.Clipboard clipboard) {
        gtk_h.gtk_text_buffer_copy_clipboard(handle(), clipboard.handle());
    }
    
    /**
     * Creates and inserts a child anchor.
     * 
     * This is a convenience function which simply creates a child anchor
     * with {@link [ctor@Gtk.TextChildAnchor.new] (ref=ctor)} and inserts it into the buffer
     * with {@link org.gtk.gtk.TextBuffer#insertChildAnchor}.
     * 
     * The new anchor is owned by the buffer; no reference count is
     * returned to the caller of this function.
     */
    public TextChildAnchor createChildAnchor(TextIter iter) {
        var RESULT = gtk_h.gtk_text_buffer_create_child_anchor(handle(), iter.handle());
        return new TextChildAnchor(References.get(RESULT, false));
    }
    
    /**
     * Creates a mark at position @where.
     * <p>
     * If @mark_name is <code>NULL,</code> the mark is anonymous; otherwise, the mark
     * can be retrieved by name using {@link org.gtk.gtk.TextBuffer#getMark}.
     * If a mark has left gravity, and text is inserted at the mark&#8217;s
     * current location, the mark will be moved to the left of the
     * newly-inserted text. If the mark has right gravity
     * (@left_gravity = <code>FALSE),</code> the mark will end up on the right of
     * newly-inserted text. The standard left-to-right cursor is a mark
     * with right gravity (when you type, the cursor stays on the right
     * side of the text you&#8217;re typing).
     * <p>
     * The caller of this function does not own a
     * reference to the returned <code>GtkTextMark</code>, so you can ignore the
     * return value if you like. Marks are owned by the buffer and go
     * away when the buffer does.
     * 
     * Emits the {@link [signal@Gtk.TextBuffer::mark-set] (ref=signal)} signal as notification
     * of the mark&#39;s initial placement.
     */
    public TextMark createMark(java.lang.String markName, TextIter where, boolean leftGravity) {
        var RESULT = gtk_h.gtk_text_buffer_create_mark(handle(), Interop.allocateNativeString(markName).handle(), where.handle(), leftGravity ? 1 : 0);
        return new TextMark(References.get(RESULT, false));
    }
    
    /**
     * Copies the currently-selected text to a clipboard,
     * then deletes said text if it&#8217;s editable.
     */
    public void cutClipboard(org.gtk.gdk.Clipboard clipboard, boolean defaultEditable) {
        gtk_h.gtk_text_buffer_cut_clipboard(handle(), clipboard.handle(), defaultEditable ? 1 : 0);
    }
    
    /**
     * Deletes text between @start and @end.
     * 
     * The order of @start and @end is not actually relevant;
     * gtk_text_buffer_delete() will reorder them.
     * 
     * This function actually emits the &#8220;delete-range&#8221; signal, and
     * the default handler of that signal deletes the text. Because the
     * buffer is modified, all outstanding iterators become invalid after
     * calling this function; however, the @start and @end will be
     * re-initialized to point to the location where text was deleted.
     */
    public void delete(TextIter start, TextIter end) {
        gtk_h.gtk_text_buffer_delete(handle(), start.handle(), end.handle());
    }
    
    /**
     * Deletes all editable text in the given range.
     * 
     * Calls {@link org.gtk.gtk.TextBuffer#delete} for each editable
     * sub-range of  for each editable
     * sub-range of [@start,@end). @start and @end are revalidated
     * to point to the location of the last deleted range, or left
     * untouched if no text was deleted.
     */
    public boolean deleteInteractive(TextIter startIter, TextIter endIter, boolean defaultEditable) {
        var RESULT = gtk_h.gtk_text_buffer_delete_interactive(handle(), startIter.handle(), endIter.handle(), defaultEditable ? 1 : 0);
        return (RESULT != 0);
    }
    
    /**
     * Deletes @mark, so that it&#8217;s no longer located anywhere in the
     * buffer.
     * 
     * Removes the reference the buffer holds to the mark, so if
     * you haven&#8217;t called g_object_ref() on the mark, it will be freed.
     * Even if the mark isn&#8217;t freed, most operations on @mark become
     * invalid, until it gets added to a buffer again with
     * {@link org.gtk.gtk.TextBuffer#addMark}. Use {@link org.gtk.gtk.TextMark#getDeleted}
     * to find out if a mark has been removed from its buffer.
     * 
     * The {@link [signal@Gtk.TextBuffer::mark-deleted] (ref=signal)} signal will be emitted as
     * notification after the mark is deleted.
     */
    public void deleteMark(TextMark mark) {
        gtk_h.gtk_text_buffer_delete_mark(handle(), mark.handle());
    }
    
    /**
     * Deletes the mark named @name; the mark must exist.
     * 
     * See {@link org.gtk.gtk.TextBuffer#deleteMark} for details.
     */
    public void deleteMarkByName(java.lang.String name) {
        gtk_h.gtk_text_buffer_delete_mark_by_name(handle(), Interop.allocateNativeString(name).handle());
    }
    
    /**
     * Deletes the range between the &#8220;insert&#8221; and &#8220;selection_bound&#8221; marks,
     * that is, the currently-selected text.
     * 
     * If @interactive is <code>TRUE,</code> the editability of the selection will be
     * considered (users can&#8217;t delete uneditable text).
     */
    public boolean deleteSelection(boolean interactive, boolean defaultEditable) {
        var RESULT = gtk_h.gtk_text_buffer_delete_selection(handle(), interactive ? 1 : 0, defaultEditable ? 1 : 0);
        return (RESULT != 0);
    }
    
    /**
     * Denotes the end of an action that may not be undone.
     * 
     * This will cause any previous operations in the undo/redo
     * queue to be cleared.
     * 
     * This should be called after completing modifications to the
     * text buffer after {@link org.gtk.gtk.TextBuffer#beginIrreversibleAction}
     * was called.
     * 
     * You may nest calls to gtk_text_buffer_begin_irreversible_action()
     * and gtk_text_buffer_end_irreversible_action() pairs.
     */
    public void endIrreversibleAction() {
        gtk_h.gtk_text_buffer_end_irreversible_action(handle());
    }
    
    /**
     * Ends a user-visible operation.
     * 
     * Should be paired with a call to
     * {@link org.gtk.gtk.TextBuffer#beginUserAction}.
     * See that function for a full explanation.
     */
    public void endUserAction() {
        gtk_h.gtk_text_buffer_end_user_action(handle());
    }
    
    /**
     * Retrieves the first and last iterators in the buffer, i.e. the
     * entire buffer lies within the range 
     *             
     *           
     *         
     *       
     *       
     *         Retrieves the first and last iterators in the buffer, i.e. the
     * entire buffer lies within the range [@start,@end).
     */
    public void getBounds(TextIter start, TextIter end) {
        gtk_h.gtk_text_buffer_get_bounds(handle(), start.handle(), end.handle());
    }
    
    /**
     * Gets whether there is a redoable action in the history.
     */
    public boolean getCanRedo() {
        var RESULT = gtk_h.gtk_text_buffer_get_can_redo(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether there is an undoable action in the history.
     */
    public boolean getCanUndo() {
        var RESULT = gtk_h.gtk_text_buffer_get_can_undo(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets the number of characters in the buffer.
     * 
     * Note that characters and bytes are not the same, you can&#8217;t e.g.
     * expect the contents of the buffer in string form to be this
     * many bytes long.
     * 
     * The character count is cached, so this function is very fast.
     */
    public int getCharCount() {
        var RESULT = gtk_h.gtk_text_buffer_get_char_count(handle());
        return RESULT;
    }
    
    /**
     * Gets whether the buffer is saving modifications to the buffer
     * to allow for undo and redo actions.
     * 
     * See {@link org.gtk.gtk.TextBuffer#beginIrreversibleAction} and
     * {@link org.gtk.gtk.TextBuffer#endIrreversibleAction} to create
     * changes to the buffer that cannot be undone.
     */
    public boolean getEnableUndo() {
        var RESULT = gtk_h.gtk_text_buffer_get_enable_undo(handle());
        return (RESULT != 0);
    }
    
    /**
     * Initializes @iter with the &#8220;end iterator,&#8221; one past the last valid
     * character in the text buffer.
     * 
     * If dereferenced with {@link org.gtk.gtk.TextIter#getChar}, the end
     * iterator has a character value of 0.
     * The entire buffer lies in the range from the first position in
     * the buffer (call {@link org.gtk.gtk.TextBuffer#getStartIter} to get
     * character position 0) to the end iterator.
     */
    public void getEndIter(TextIter iter) {
        gtk_h.gtk_text_buffer_get_end_iter(handle(), iter.handle());
    }
    
    /**
     * Indicates whether the buffer has some text currently selected.
     */
    public boolean getHasSelection() {
        var RESULT = gtk_h.gtk_text_buffer_get_has_selection(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the mark that represents the cursor (insertion point).
     * 
     * Equivalent to calling {@link org.gtk.gtk.TextBuffer#getMark}
     * to get the mark named &#8220;insert&#8221;, but very slightly more
     * efficient, and involves less typing.
     */
    public TextMark getInsert() {
        var RESULT = gtk_h.gtk_text_buffer_get_insert(handle());
        return new TextMark(References.get(RESULT, false));
    }
    
    /**
     * Obtains the location of @anchor within @buffer.
     */
    public void getIterAtChildAnchor(TextIter iter, TextChildAnchor anchor) {
        gtk_h.gtk_text_buffer_get_iter_at_child_anchor(handle(), iter.handle(), anchor.handle());
    }
    
    /**
     * Initializes @iter to the start of the given line.
     * 
     * If @line_number is greater than or equal to the number of lines
     * in the @buffer, the end iterator is returned.
     */
    public boolean getIterAtLine(TextIter iter, int lineNumber) {
        var RESULT = gtk_h.gtk_text_buffer_get_iter_at_line(handle(), iter.handle(), lineNumber);
        return (RESULT != 0);
    }
    
    /**
     * Obtains an iterator pointing to @byte_index within the given line.
     * 
     * @byte_index must be the start of a UTF-8 character. Note bytes, not
     * characters; UTF-8 may encode one character as multiple bytes.
     * 
     * If @line_number is greater than or equal to the number of lines in the @buffer,
     * the end iterator is returned. And if @byte_index is off the
     * end of the line, the iterator at the end of the line is returned.
     */
    public boolean getIterAtLineIndex(TextIter iter, int lineNumber, int byteIndex) {
        var RESULT = gtk_h.gtk_text_buffer_get_iter_at_line_index(handle(), iter.handle(), lineNumber, byteIndex);
        return (RESULT != 0);
    }
    
    /**
     * Obtains an iterator pointing to @char_offset within the given line.
     * 
     * Note characters, not bytes; UTF-8 may encode one character as multiple
     * bytes.
     * 
     * If @line_number is greater than or equal to the number of lines in the @buffer,
     * the end iterator is returned. And if @char_offset is off the
     * end of the line, the iterator at the end of the line is returned.
     */
    public boolean getIterAtLineOffset(TextIter iter, int lineNumber, int charOffset) {
        var RESULT = gtk_h.gtk_text_buffer_get_iter_at_line_offset(handle(), iter.handle(), lineNumber, charOffset);
        return (RESULT != 0);
    }
    
    /**
     * Initializes @iter with the current position of @mark.
     */
    public void getIterAtMark(TextIter iter, TextMark mark) {
        gtk_h.gtk_text_buffer_get_iter_at_mark(handle(), iter.handle(), mark.handle());
    }
    
    /**
     * Initializes @iter to a position @char_offset chars from the start
     * of the entire buffer.
     * 
     * If @char_offset is -1 or greater than the number
     * of characters in the buffer, @iter is initialized to the end iterator,
     * the iterator one past the last valid character in the buffer.
     */
    public void getIterAtOffset(TextIter iter, int charOffset) {
        gtk_h.gtk_text_buffer_get_iter_at_offset(handle(), iter.handle(), charOffset);
    }
    
    /**
     * Obtains the number of lines in the buffer.
     * 
     * This value is cached, so the function is very fast.
     */
    public int getLineCount() {
        var RESULT = gtk_h.gtk_text_buffer_get_line_count(handle());
        return RESULT;
    }
    
    /**
     * Returns the mark named @name in buffer @buffer, or <code>null</code> if no such
     * mark exists in the buffer.
     */
    public TextMark getMark(java.lang.String name) {
        var RESULT = gtk_h.gtk_text_buffer_get_mark(handle(), Interop.allocateNativeString(name).handle());
        return new TextMark(References.get(RESULT, false));
    }
    
    /**
     * Gets the maximum number of undo levels to perform.
     * 
     * If 0, unlimited undo actions may be performed. Note that this may
     * have a memory usage impact as it requires storing an additional
     * copy of the inserted or removed text within the text buffer.
     */
    public int getMaxUndoLevels() {
        var RESULT = gtk_h.gtk_text_buffer_get_max_undo_levels(handle());
        return RESULT;
    }
    
    /**
     * Indicates whether the buffer has been modified since the last call
     * to {@link org.gtk.gtk.TextBuffer#setModified} set the modification flag to
     * <code>FALSE.
     * 
     * Used</code> for example to enable a &#8220;save&#8221; function in a text editor.
     */
    public boolean getModified() {
        var RESULT = gtk_h.gtk_text_buffer_get_modified(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns the mark that represents the selection bound.
     * 
     * Equivalent to calling {@link org.gtk.gtk.TextBuffer#getMark}
     * to get the mark named &#8220;selection_bound&#8221;, but very slightly
     * more efficient, and involves less typing.
     * 
     * The currently-selected text in @buffer is the region between the
     * &#8220;selection_bound&#8221; and &#8220;insert&#8221; marks. If &#8220;selection_bound&#8221; and
     * &#8220;insert&#8221; are in the same place, then there is no current selection.
     * {@link org.gtk.gtk.TextBuffer#getSelectionBounds} is another convenient
     * function for handling the selection, if you just want to know whether
     * there&#8217;s a selection and what its bounds are.
     */
    public TextMark getSelectionBound() {
        var RESULT = gtk_h.gtk_text_buffer_get_selection_bound(handle());
        return new TextMark(References.get(RESULT, false));
    }
    
    /**
     * Returns <code>true</code> if some text is selected; places the bounds
     * of the selection in @start and @end.
     * 
     * If the selection has length 0, then @start and @end are filled
     * in with the same value. @start and @end will be in ascending order.
     * If @start and @end are <code>NULL,</code> then they are not filled in, but the
     * return value still indicates whether text is selected.
     */
    public boolean getSelectionBounds(TextIter start, TextIter end) {
        var RESULT = gtk_h.gtk_text_buffer_get_selection_bounds(handle(), start.handle(), end.handle());
        return (RESULT != 0);
    }
    
    /**
     * Get a content provider for this buffer.
     * <p>
     * It can be used to make the content of @buffer available
     * in a <code>GdkClipboard</code>, see {@link org.gtk.gdk.Clipboard#setContent}.
     */
    public org.gtk.gdk.ContentProvider getSelectionContent() {
        var RESULT = gtk_h.gtk_text_buffer_get_selection_content(handle());
        return new org.gtk.gdk.ContentProvider(References.get(RESULT, true));
    }
    
    /**
     * Returns the text in the range {@link [@start,@end).
     * 
     * Excludes undisplayed text (text marked with tags that set the
     * invisibility attribute) if @include_hidden_chars is <code>FALSE.
     * The</code> returned string includes a 0xFFFC character whenever the
     * buffer contains embedded images, so byte and character indexes
     * into the returned string do correspond to byte and character
     * indexes into the buffer. Contrast with [method@Gtk.TextBuffer.get_text] (ref=)}.
     * Note that 0xFFFC can occur in normal text as well, so it is not a
     * reliable indicator that a paintable or widget is in the buffer.
     */
    public java.lang.String getSlice(TextIter start, TextIter end, boolean includeHiddenChars) {
        var RESULT = gtk_h.gtk_text_buffer_get_slice(handle(), start.handle(), end.handle(), includeHiddenChars ? 1 : 0);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Initialized @iter with the first position in the text buffer.
     * 
     * This is the same as using {@link org.gtk.gtk.TextBuffer#getIterAtOffset}
     * to get the iter at character offset 0.
     */
    public void getStartIter(TextIter iter) {
        gtk_h.gtk_text_buffer_get_start_iter(handle(), iter.handle());
    }
    
    /**
     * Get the <code>GtkTextTagTable</code> associated with this buffer.
     */
    public TextTagTable getTagTable() {
        var RESULT = gtk_h.gtk_text_buffer_get_tag_table(handle());
        return new TextTagTable(References.get(RESULT, false));
    }
    
    /**
     * Returns the text in the range {@link [@start,@end).
     * 
     * Excludes undisplayed text (text marked with tags that set the
     * invisibility attribute) if @include_hidden_chars is <code>FALSE.
     * Does</code> not include characters representing embedded images, so
     * byte and character indexes into the returned string do not
     * correspond to byte and character indexes into the buffer.
     * Contrast with [method@Gtk.TextBuffer.get_slice] (ref=)}.
     */
    public java.lang.String getText(TextIter start, TextIter end, boolean includeHiddenChars) {
        var RESULT = gtk_h.gtk_text_buffer_get_text(handle(), start.handle(), end.handle(), includeHiddenChars ? 1 : 0);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Inserts @len bytes of @text at position @iter.
     * 
     * If @len is -1, @text must be nul-terminated and will be inserted in its
     * entirety. Emits the &#8220;insert-text&#8221; signal; insertion actually occurs
     * in the default handler for the signal. @iter is invalidated when
     * insertion occurs (because the buffer contents change), but the
     * default signal handler revalidates it to point to the end of the
     * inserted text.
     */
    public void insert(TextIter iter, java.lang.String text, int len) {
        gtk_h.gtk_text_buffer_insert(handle(), iter.handle(), Interop.allocateNativeString(text).handle(), len);
    }
    
    /**
     * Inserts @text in @buffer.
     * 
     * Simply calls {@link org.gtk.gtk.TextBuffer#insert},
     * using the current cursor position as the insertion point.
     */
    public void insertAtCursor(java.lang.String text, int len) {
        gtk_h.gtk_text_buffer_insert_at_cursor(handle(), Interop.allocateNativeString(text).handle(), len);
    }
    
    /**
     * Inserts a child widget anchor into the text buffer at @iter.
     * 
     * The anchor will be counted as one character in character counts, and
     * when obtaining the buffer contents as a string, will be represented
     * by the Unicode &#8220;object replacement character&#8221; 0xFFFC. Note that the
     * &#8220;slice&#8221; variants for obtaining portions of the buffer as a string
     * include this character for child anchors, but the &#8220;text&#8221; variants do
     * not. E.g. see {@link org.gtk.gtk.TextBuffer#getSlice} and
     * {@link org.gtk.gtk.TextBuffer#getText}.
     * 
     * Consider {@link org.gtk.gtk.TextBuffer#createChildAnchor} as a more
     * convenient alternative to this function. The buffer will add a
     * reference to the anchor, so you can unref it after insertion.
     */
    public void insertChildAnchor(TextIter iter, TextChildAnchor anchor) {
        gtk_h.gtk_text_buffer_insert_child_anchor(handle(), iter.handle(), anchor.handle());
    }
    
    /**
     * Inserts @text in @buffer.
     * 
     * Like {@link org.gtk.gtk.TextBuffer#insert}, but the insertion will not occur
     * if @iter is at a non-editable location in the buffer. Usually you
     * want to prevent insertions at ineditable locations if the insertion
     * results from a user action (is interactive).
     * 
     * @default_editable indicates the editability of text that doesn&#39;t
     * have a tag affecting editability applied to it. Typically the
     * result of {@link org.gtk.gtk.TextView#getEditable} is appropriate here.
     */
    public boolean insertInteractive(TextIter iter, java.lang.String text, int len, boolean defaultEditable) {
        var RESULT = gtk_h.gtk_text_buffer_insert_interactive(handle(), iter.handle(), Interop.allocateNativeString(text).handle(), len, defaultEditable ? 1 : 0);
        return (RESULT != 0);
    }
    
    /**
     * Inserts @text in @buffer.
     * 
     * Calls {@link org.gtk.gtk.TextBuffer#insertInteractive}
     * at the cursor position.
     * 
     * @default_editable indicates the editability of text that doesn&#39;t
     * have a tag affecting editability applied to it. Typically the
     * result of {@link org.gtk.gtk.TextView#getEditable} is appropriate here.
     */
    public boolean insertInteractiveAtCursor(java.lang.String text, int len, boolean defaultEditable) {
        var RESULT = gtk_h.gtk_text_buffer_insert_interactive_at_cursor(handle(), Interop.allocateNativeString(text).handle(), len, defaultEditable ? 1 : 0);
        return (RESULT != 0);
    }
    
    /**
     * Inserts the text in @markup at position @iter.
     * 
     * @markup will be inserted in its entirety and must be nul-terminated
     * and valid UTF-8. Emits the {@link [signal@Gtk.TextBuffer::insert-text] (ref=signal)} signal,
     * possibly multiple times; insertion actually occurs in the default handler
     * for the signal. @iter will point to the end of the inserted text on return.
     */
    public void insertMarkup(TextIter iter, java.lang.String markup, int len) {
        gtk_h.gtk_text_buffer_insert_markup(handle(), iter.handle(), Interop.allocateNativeString(markup).handle(), len);
    }
    
    /**
     * Inserts an image into the text buffer at @iter.
     * 
     * The image will be counted as one character in character counts,
     * and when obtaining the buffer contents as a string, will be
     * represented by the Unicode &#8220;object replacement character&#8221; 0xFFFC.
     * Note that the &#8220;slice&#8221; variants for obtaining portions of the buffer
     * as a string include this character for paintable, but the &#8220;text&#8221;
     * variants do not. e.g. see {@link org.gtk.gtk.TextBuffer#getSlice} and
     * {@link org.gtk.gtk.TextBuffer#getText}.
     */
    public void insertPaintable(TextIter iter, org.gtk.gdk.Paintable paintable) {
        gtk_h.gtk_text_buffer_insert_paintable(handle(), iter.handle(), paintable.handle());
    }
    
    /**
     * Copies text, tags, and paintables between @start and @end
     * and inserts the copy at @iter.
     * 
     * The order of @start and @end doesn&#8217;t matter.
     * 
     * Used instead of simply getting/inserting text because it preserves
     * images and tags. If @start and @end are in a different buffer from
     * @buffer, the two buffers must share the same tag table.
     * 
     * Implemented via emissions of the ::insert-text and ::apply-tag signals,
     * so expect those.
     */
    public void insertRange(TextIter iter, TextIter start, TextIter end) {
        gtk_h.gtk_text_buffer_insert_range(handle(), iter.handle(), start.handle(), end.handle());
    }
    
    /**
     * Copies text, tags, and paintables between @start and @end
     * and inserts the copy at @iter.
     * 
     * Same as {@link org.gtk.gtk.TextBuffer#insertRange}, but does nothing
     * if the insertion point isn&#8217;t editable. The @default_editable
     * parameter indicates whether the text is editable at @iter if
     * no tags enclosing @iter affect editability. Typically the result
     * of {@link org.gtk.gtk.TextView#getEditable} is appropriate here.
     */
    public boolean insertRangeInteractive(TextIter iter, TextIter start, TextIter end, boolean defaultEditable) {
        var RESULT = gtk_h.gtk_text_buffer_insert_range_interactive(handle(), iter.handle(), start.handle(), end.handle(), defaultEditable ? 1 : 0);
        return (RESULT != 0);
    }
    
    /**
     * Moves @mark to the new location @where.
     * 
     * Emits the {@link [signal@Gtk.TextBuffer::mark-set] (ref=signal)} signal
     * as notification of the move.
     */
    public void moveMark(TextMark mark, TextIter where) {
        gtk_h.gtk_text_buffer_move_mark(handle(), mark.handle(), where.handle());
    }
    
    /**
     * Moves the mark named @name (which must exist) to location @where.
     * 
     * See {@link org.gtk.gtk.TextBuffer#moveMark} for details.
     */
    public void moveMarkByName(java.lang.String name, TextIter where) {
        gtk_h.gtk_text_buffer_move_mark_by_name(handle(), Interop.allocateNativeString(name).handle(), where.handle());
    }
    
    /**
     * Pastes the contents of a clipboard.
     * 
     * If @override_location is <code>NULL,</code> the pasted text will be inserted
     * at the cursor position, or the buffer selection will be replaced
     * if the selection is non-empty.
     * 
     * Note: pasting is asynchronous, that is, we&#8217;ll ask for the paste data
     * and return, and at some point later after the main loop runs, the paste
     * data will be inserted.
     */
    public void pasteClipboard(org.gtk.gdk.Clipboard clipboard, TextIter overrideLocation, boolean defaultEditable) {
        gtk_h.gtk_text_buffer_paste_clipboard(handle(), clipboard.handle(), overrideLocation.handle(), defaultEditable ? 1 : 0);
    }
    
    /**
     * This function moves the &#8220;insert&#8221; and &#8220;selection_bound&#8221; marks
     * simultaneously.
     * 
     * If you move them to the same place in two steps with
     * {@link org.gtk.gtk.TextBuffer#moveMark}, you will temporarily select a
     * region in between their old and new locations, which can be pretty
     * inefficient since the temporarily-selected region will force stuff
     * to be recalculated. This function moves them as a unit, which can
     * be optimized.
     */
    public void placeCursor(TextIter where) {
        gtk_h.gtk_text_buffer_place_cursor(handle(), where.handle());
    }
    
    /**
     * Redoes the next redoable action on the buffer, if there is one.
     */
    public void redo() {
        gtk_h.gtk_text_buffer_redo(handle());
    }
    
    /**
     * Removes all tags in the range between @start and @end.
     * 
     * Be careful with this function; it could remove tags added in code
     * unrelated to the code you&#8217;re currently writing. That is, using this
     * function is probably a bad idea if you have two or more unrelated
     * code sections that add tags.
     */
    public void removeAllTags(TextIter start, TextIter end) {
        gtk_h.gtk_text_buffer_remove_all_tags(handle(), start.handle(), end.handle());
    }
    
    /**
     * Removes a <code>GdkClipboard</code> added with
     * gtk_text_buffer_add_selection_clipboard().
     */
    public void removeSelectionClipboard(org.gtk.gdk.Clipboard clipboard) {
        gtk_h.gtk_text_buffer_remove_selection_clipboard(handle(), clipboard.handle());
    }
    
    /**
     * Emits the &#8220;remove-tag&#8221; signal.
     * 
     * The default handler for the signal removes all occurrences
     * of @tag from the given range. @start and @end don&#8217;t have
     * to be in order.
     */
    public void removeTag(TextTag tag, TextIter start, TextIter end) {
        gtk_h.gtk_text_buffer_remove_tag(handle(), tag.handle(), start.handle(), end.handle());
    }
    
    /**
     * Emits the &#8220;remove-tag&#8221; signal.
     * <p>
     * Calls {@link org.gtk.gtk.TextTagTable#lookup} on the buffer&#8217;s
     * tag table to get a <code>GtkTextTag</code>, then calls
     * {@link org.gtk.gtk.TextBuffer#removeTag}.
     */
    public void removeTagByName(java.lang.String name, TextIter start, TextIter end) {
        gtk_h.gtk_text_buffer_remove_tag_by_name(handle(), Interop.allocateNativeString(name).handle(), start.handle(), end.handle());
    }
    
    /**
     * This function moves the &#8220;insert&#8221; and &#8220;selection_bound&#8221; marks
     * simultaneously.
     * 
     * If you move them in two steps with
     * {@link org.gtk.gtk.TextBuffer#moveMark}, you will temporarily select a
     * region in between their old and new locations, which can be pretty
     * inefficient since the temporarily-selected region will force stuff
     * to be recalculated. This function moves them as a unit, which can
     * be optimized.
     */
    public void selectRange(TextIter ins, TextIter bound) {
        gtk_h.gtk_text_buffer_select_range(handle(), ins.handle(), bound.handle());
    }
    
    /**
     * Sets whether or not to enable undoable actions in the text buffer.
     * 
     * Undoable actions in this context are changes to the text content of
     * the buffer. Changes to tags and marks are not tracked.
     * 
     * If enabled, the user will be able to undo the last number of actions
     * up to {@link org.gtk.gtk.TextBuffer#getMaxUndoLevels}.
     * 
     * See {@link org.gtk.gtk.TextBuffer#beginIrreversibleAction} and
     * {@link org.gtk.gtk.TextBuffer#endIrreversibleAction} to create
     * changes to the buffer that cannot be undone.
     */
    public void setEnableUndo(boolean enableUndo) {
        gtk_h.gtk_text_buffer_set_enable_undo(handle(), enableUndo ? 1 : 0);
    }
    
    /**
     * Sets the maximum number of undo levels to perform.
     * 
     * If 0, unlimited undo actions may be performed. Note that this may
     * have a memory usage impact as it requires storing an additional
     * copy of the inserted or removed text within the text buffer.
     */
    public void setMaxUndoLevels(int maxUndoLevels) {
        gtk_h.gtk_text_buffer_set_max_undo_levels(handle(), maxUndoLevels);
    }
    
    /**
     * Used to keep track of whether the buffer has been
     * modified since the last time it was saved.
     * <p>
     * Whenever the buffer is saved to disk, call<code>gtk_text_buffer_set_modified (@buffer, FALSE)</code>.
     * When the buffer is modified, it will automatically
     * toggled on the modified bit again. When the modified
     * bit flips, the buffer emits the
     * {@link [signal@Gtk.TextBuffer::modified-changed] (ref=signal)} signal.
     */
    public void setModified(boolean setting) {
        gtk_h.gtk_text_buffer_set_modified(handle(), setting ? 1 : 0);
    }
    
    /**
     * Deletes current contents of @buffer, and inserts @text instead.
     * 
     * If @len is -1, @text must be nul-terminated.
     * @text must be valid UTF-8.
     */
    public void setText(java.lang.String text, int len) {
        gtk_h.gtk_text_buffer_set_text(handle(), Interop.allocateNativeString(text).handle(), len);
    }
    
    /**
     * Undoes the last undoable action on the buffer, if there is one.
     */
    public void undo() {
        gtk_h.gtk_text_buffer_undo(handle());
    }
    
    @FunctionalInterface
    public interface ApplyTagHandler {
        void signalReceived(TextBuffer source, TextTag tag, TextIter start, TextIter end);
    }
    
    /**
     * Emitted to apply a tag to a range of text in a <code>GtkTextBuffer</code>.
     * 
     * Applying actually occurs in the default handler.
     * 
     * Note that if your handler runs before the default handler
     * it must not invalidate the @start and @end iters (or has to
     * revalidate them).
     * 
     * See also:
     * {@link org.gtk.gtk.TextBuffer#applyTag},
     * {@link org.gtk.gtk.TextBuffer#insertWithTags},
     * {@link org.gtk.gtk.TextBuffer#insertRange}.
     */
    public SignalHandle onApplyTag(ApplyTagHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBufferApplyTag", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("apply-tag").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface BeginUserActionHandler {
        void signalReceived(TextBuffer source);
    }
    
    /**
     * Emitted at the beginning of a single user-visible
     * operation on a <code>GtkTextBuffer</code>.
     * 
     * See also:
     * {@link org.gtk.gtk.TextBuffer#beginUserAction},
     * {@link org.gtk.gtk.TextBuffer#insertInteractive},
     * {@link org.gtk.gtk.TextBuffer#insertRangeInteractive},
     * {@link org.gtk.gtk.TextBuffer#deleteInteractive},
     * {@link org.gtk.gtk.TextBuffer#backspace},
     * {@link org.gtk.gtk.TextBuffer#deleteSelection}.
     */
    public SignalHandle onBeginUserAction(BeginUserActionHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBufferBeginUserAction", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("begin-user-action").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(TextBuffer source);
    }
    
    /**
     * Emitted when the content of a <code>GtkTextBuffer</code> has changed.
     */
    public SignalHandle onChanged(ChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBufferChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface DeleteRangeHandler {
        void signalReceived(TextBuffer source, TextIter start, TextIter end);
    }
    
    /**
     * Emitted to delete a range from a <code>GtkTextBuffer</code>.
     * 
     * Note that if your handler runs before the default handler
     * it must not invalidate the @start and @end iters (or has
     * to revalidate them). The default signal handler revalidates
     * the @start and @end iters to both point to the location
     * where text was deleted. Handlers which run after the default
     * handler (see g_signal_connect_after()) do not have access to
     * the deleted text.
     * 
     * See also: {@link org.gtk.gtk.TextBuffer#delete}.
     */
    public SignalHandle onDeleteRange(DeleteRangeHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBufferDeleteRange", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("delete-range").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface EndUserActionHandler {
        void signalReceived(TextBuffer source);
    }
    
    /**
     * Emitted at the end of a single user-visible
     * operation on the <code>GtkTextBuffer</code>.
     * 
     * See also:
     * {@link org.gtk.gtk.TextBuffer#endUserAction},
     * {@link org.gtk.gtk.TextBuffer#insertInteractive},
     * {@link org.gtk.gtk.TextBuffer#insertRangeInteractive},
     * {@link org.gtk.gtk.TextBuffer#deleteInteractive},
     * {@link org.gtk.gtk.TextBuffer#backspace},
     * {@link org.gtk.gtk.TextBuffer#deleteSelection},
     * {@link org.gtk.gtk.TextBuffer#backspace}.
     */
    public SignalHandle onEndUserAction(EndUserActionHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBufferEndUserAction", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("end-user-action").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface InsertChildAnchorHandler {
        void signalReceived(TextBuffer source, TextIter location, TextChildAnchor anchor);
    }
    
    /**
     * Emitted to insert a <code>GtkTextChildAnchor</code> in a <code>GtkTextBuffer</code>.
     * 
     * Insertion actually occurs in the default handler.
     * 
     * Note that if your handler runs before the default handler
     * it must not invalidate the @location iter (or has to
     * revalidate it). The default signal handler revalidates
     * it to be placed after the inserted @anchor.
     * 
     * See also: {@link org.gtk.gtk.TextBuffer#insertChildAnchor}.
     */
    public SignalHandle onInsertChildAnchor(InsertChildAnchorHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBufferInsertChildAnchor", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("insert-child-anchor").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface InsertPaintableHandler {
        void signalReceived(TextBuffer source, TextIter location, org.gtk.gdk.Paintable paintable);
    }
    
    /**
     * Emitted to insert a <code>GdkPaintable</code> in a <code>GtkTextBuffer</code>.
     * 
     * Insertion actually occurs in the default handler.
     * 
     * Note that if your handler runs before the default handler
     * it must not invalidate the @location iter (or has to
     * revalidate it). The default signal handler revalidates
     * it to be placed after the inserted @paintable.
     * 
     * See also: {@link org.gtk.gtk.TextBuffer#insertPaintable}.
     */
    public SignalHandle onInsertPaintable(InsertPaintableHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBufferInsertPaintable", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("insert-paintable").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface InsertTextHandler {
        void signalReceived(TextBuffer source, TextIter location, java.lang.String text, int len);
    }
    
    /**
     * Emitted to insert text in a <code>GtkTextBuffer</code>.
     * 
     * Insertion actually occurs in the default handler.
     * 
     * Note that if your handler runs before the default handler
     * it must not invalidate the @location iter (or has to
     * revalidate it). The default signal handler revalidates
     * it to point to the end of the inserted text.
     * 
     * See also: {@link org.gtk.gtk.TextBuffer#insert},
     * {@link org.gtk.gtk.TextBuffer#insertRange}.
     */
    public SignalHandle onInsertText(InsertTextHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBufferInsertText", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("insert-text").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MarkDeletedHandler {
        void signalReceived(TextBuffer source, TextMark mark);
    }
    
    /**
     * Emitted as notification after a <code>GtkTextMark</code> is deleted.
     * 
     * See also: {@link org.gtk.gtk.TextBuffer#deleteMark}.
     */
    public SignalHandle onMarkDeleted(MarkDeletedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBufferMarkDeleted", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("mark-deleted").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MarkSetHandler {
        void signalReceived(TextBuffer source, TextIter location, TextMark mark);
    }
    
    /**
     * Emitted as notification after a <code>GtkTextMark</code> is set.
     * 
     * See also:
     * {@link org.gtk.gtk.TextBuffer#createMark},
     * {@link org.gtk.gtk.TextBuffer#moveMark}.
     */
    public SignalHandle onMarkSet(MarkSetHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBufferMarkSet", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("mark-set").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ModifiedChangedHandler {
        void signalReceived(TextBuffer source);
    }
    
    /**
     * Emitted when the modified bit of a <code>GtkTextBuffer</code> flips.
     * 
     * See also: {@link org.gtk.gtk.TextBuffer#setModified}.
     */
    public SignalHandle onModifiedChanged(ModifiedChangedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBufferModifiedChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("modified-changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface PasteDoneHandler {
        void signalReceived(TextBuffer source, org.gtk.gdk.Clipboard clipboard);
    }
    
    /**
     * Emitted after paste operation has been completed.
     * 
     * This is useful to properly scroll the view to the end
     * of the pasted text. See {@link org.gtk.gtk.TextBuffer#pasteClipboard}
     * for more details.
     */
    public SignalHandle onPasteDone(PasteDoneHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBufferPasteDone", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("paste-done").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface RedoHandler {
        void signalReceived(TextBuffer source);
    }
    
    /**
     * Emitted when a request has been made to redo the
     * previously undone operation.
     */
    public SignalHandle onRedo(RedoHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBufferRedo", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("redo").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface RemoveTagHandler {
        void signalReceived(TextBuffer source, TextTag tag, TextIter start, TextIter end);
    }
    
    /**
     * Emitted to remove all occurrences of @tag from a range
     * of text in a <code>GtkTextBuffer</code>.
     * 
     * Removal actually occurs in the default handler.
     * 
     * Note that if your handler runs before the default handler
     * it must not invalidate the @start and @end iters (or has
     * to revalidate them).
     * 
     * See also: {@link org.gtk.gtk.TextBuffer#removeTag}.
     */
    public SignalHandle onRemoveTag(RemoveTagHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBufferRemoveTag", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("remove-tag").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface UndoHandler {
        void signalReceived(TextBuffer source);
    }
    
    /**
     * Emitted when a request has been made to undo the
     * previous operation or set of operations that have
     * been grouped together.
     */
    public SignalHandle onUndo(UndoHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBufferUndo", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("undo").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
