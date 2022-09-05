package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Stores text and attributes for display in a `GtkTextView`.
 * 
 * You may wish to begin by reading the
 * [text widget conceptual overview](section-text-widget.html),
 * which gives an overview of all the objects and data types
 * related to the text widget and how they work together.
 * 
 * GtkTextBuffer can support undoing changes to the buffer
 * content, see [method@Gtk.TextBuffer.set_enable_undo].
 */
public class TextBuffer extends org.gtk.gobject.Object {

    public TextBuffer(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to TextBuffer */
    public static TextBuffer castFrom(org.gtk.gobject.Object gobject) {
        return new TextBuffer(gobject.getProxy());
    }
    
    /**
     * Creates a new text buffer.
     */
    public TextBuffer(TextTagTable table) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_new(table.HANDLE()), true));
    }
    
    /**
     * Adds the mark at position @where.
     * 
     * The mark must not be added to another buffer, and if its name
     * is not %NULL then there must not be another mark in the buffer
     * with the same name.
     * 
     * Emits the [signal@Gtk.TextBuffer::mark-set] signal as notification
     * of the mark's initial placement.
     */
    public void addMark(TextMark mark, TextIter where) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_add_mark(HANDLE(), mark.HANDLE(), where.HANDLE());
    }
    
    /**
     * Adds @clipboard to the list of clipboards in which the selection
     * contents of @buffer are available.
     * 
     * In most cases, @clipboard will be the `GdkClipboard` returned by
     * [method@Gtk.Widget.get_primary_clipboard] for a view of @buffer.
     */
    public void addSelectionClipboard(org.gtk.gdk.Clipboard clipboard) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_add_selection_clipboard(HANDLE(), clipboard.HANDLE());
    }
    
    /**
     * Emits the “apply-tag” signal on @buffer.
     * 
     * The default handler for the signal applies
     * @tag to the given range. @start and @end do
     * not have to be in order.
     */
    public void applyTag(TextTag tag, TextIter start, TextIter end) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_apply_tag(HANDLE(), tag.HANDLE(), start.HANDLE(), end.HANDLE());
    }
    
    /**
     * Emits the “apply-tag” signal on @buffer.
     * 
     * Calls [method@Gtk.TextTagTable.lookup] on the buffer’s
     * tag table to get a `GtkTextTag`, then calls
     * [method@Gtk.TextBuffer.apply_tag].
     */
    public void applyTagByName(java.lang.String name, TextIter start, TextIter end) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_apply_tag_by_name(HANDLE(), Interop.allocateNativeString(name).HANDLE(), start.HANDLE(), end.HANDLE());
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_backspace(HANDLE(), iter.HANDLE(), interactive ? 1 : 0, defaultEditable ? 1 : 0);
        return (RESULT != 0);
    }
    
    /**
     * Denotes the beginning of an action that may not be undone.
     * 
     * This will cause any previous operations in the undo/redo queue
     * to be cleared.
     * 
     * This should be paired with a call to
     * [method@Gtk.TextBuffer.end_irreversible_action] after the irreversible
     * action has completed.
     * 
     * You may nest calls to gtk_text_buffer_begin_irreversible_action()
     * and gtk_text_buffer_end_irreversible_action() pairs.
     */
    public void beginIrreversibleAction() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_begin_irreversible_action(HANDLE());
    }
    
    /**
     * Called to indicate that the buffer operations between here and a
     * call to gtk_text_buffer_end_user_action() are part of a single
     * user-visible operation.
     * 
     * The operations between gtk_text_buffer_begin_user_action() and
     * gtk_text_buffer_end_user_action() can then be grouped when creating
     * an undo stack. `GtkTextBuffer` maintains a count of calls to
     * gtk_text_buffer_begin_user_action() that have not been closed with
     * a call to gtk_text_buffer_end_user_action(), and emits the
     * “begin-user-action” and “end-user-action” signals only for the
     * outermost pair of calls. This allows you to build user actions
     * from other user actions.
     * 
     * The “interactive” buffer mutation functions, such as
     * [method@Gtk.TextBuffer.insert_interactive], automatically call
     * begin/end user action around the buffer operations they perform,
     * so there's no need to add extra calls if you user action consists
     * solely of a single call to one of those functions.
     */
    public void beginUserAction() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_begin_user_action(HANDLE());
    }
    
    /**
     * Copies the currently-selected text to a clipboard.
     */
    public void copyClipboard(org.gtk.gdk.Clipboard clipboard) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_copy_clipboard(HANDLE(), clipboard.HANDLE());
    }
    
    /**
     * Creates and inserts a child anchor.
     * 
     * This is a convenience function which simply creates a child anchor
     * with [ctor@Gtk.TextChildAnchor.new] and inserts it into the buffer
     * with [method@Gtk.TextBuffer.insert_child_anchor].
     * 
     * The new anchor is owned by the buffer; no reference count is
     * returned to the caller of this function.
     */
    public TextChildAnchor createChildAnchor(TextIter iter) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_create_child_anchor(HANDLE(), iter.HANDLE());
        return new TextChildAnchor(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Creates a mark at position @where.
     * 
     * If @mark_name is %NULL, the mark is anonymous; otherwise, the mark
     * can be retrieved by name using [method@Gtk.TextBuffer.get_mark].
     * If a mark has left gravity, and text is inserted at the mark’s
     * current location, the mark will be moved to the left of the
     * newly-inserted text. If the mark has right gravity
     * (@left_gravity = %FALSE), the mark will end up on the right of
     * newly-inserted text. The standard left-to-right cursor is a mark
     * with right gravity (when you type, the cursor stays on the right
     * side of the text you’re typing).
     * 
     * The caller of this function does not own a
     * reference to the returned `GtkTextMark`, so you can ignore the
     * return value if you like. Marks are owned by the buffer and go
     * away when the buffer does.
     * 
     * Emits the [signal@Gtk.TextBuffer::mark-set] signal as notification
     * of the mark's initial placement.
     */
    public TextMark createMark(java.lang.String markName, TextIter where, boolean leftGravity) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_create_mark(HANDLE(), Interop.allocateNativeString(markName).HANDLE(), where.HANDLE(), leftGravity ? 1 : 0);
        return new TextMark(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Copies the currently-selected text to a clipboard,
     * then deletes said text if it’s editable.
     */
    public void cutClipboard(org.gtk.gdk.Clipboard clipboard, boolean defaultEditable) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_cut_clipboard(HANDLE(), clipboard.HANDLE(), defaultEditable ? 1 : 0);
    }
    
    /**
     * Deletes text between @start and @end.
     * 
     * The order of @start and @end is not actually relevant;
     * gtk_text_buffer_delete() will reorder them.
     * 
     * This function actually emits the “delete-range” signal, and
     * the default handler of that signal deletes the text. Because the
     * buffer is modified, all outstanding iterators become invalid after
     * calling this function; however, the @start and @end will be
     * re-initialized to point to the location where text was deleted.
     */
    public void delete(TextIter start, TextIter end) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_delete(HANDLE(), start.HANDLE(), end.HANDLE());
    }
    
    /**
     * Deletes all editable text in the given range.
     * 
     * Calls [method@Gtk.TextBuffer.delete] for each editable
     * sub-range of [@start,@end). @start and @end are revalidated
     * to point to the location of the last deleted range, or left
     * untouched if no text was deleted.
     */
    public boolean deleteInteractive(TextIter startIter, TextIter endIter, boolean defaultEditable) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_delete_interactive(HANDLE(), startIter.HANDLE(), endIter.HANDLE(), defaultEditable ? 1 : 0);
        return (RESULT != 0);
    }
    
    /**
     * Deletes @mark, so that it’s no longer located anywhere in the
     * buffer.
     * 
     * Removes the reference the buffer holds to the mark, so if
     * you haven’t called g_object_ref() on the mark, it will be freed.
     * Even if the mark isn’t freed, most operations on @mark become
     * invalid, until it gets added to a buffer again with
     * [method@Gtk.TextBuffer.add_mark]. Use [method@Gtk.TextMark.get_deleted]
     * to find out if a mark has been removed from its buffer.
     * 
     * The [signal@Gtk.TextBuffer::mark-deleted] signal will be emitted as
     * notification after the mark is deleted.
     */
    public void deleteMark(TextMark mark) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_delete_mark(HANDLE(), mark.HANDLE());
    }
    
    /**
     * Deletes the mark named @name; the mark must exist.
     * 
     * See [method@Gtk.TextBuffer.delete_mark] for details.
     */
    public void deleteMarkByName(java.lang.String name) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_delete_mark_by_name(HANDLE(), Interop.allocateNativeString(name).HANDLE());
    }
    
    /**
     * Deletes the range between the “insert” and “selection_bound” marks,
     * that is, the currently-selected text.
     * 
     * If @interactive is %TRUE, the editability of the selection will be
     * considered (users can’t delete uneditable text).
     */
    public boolean deleteSelection(boolean interactive, boolean defaultEditable) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_delete_selection(HANDLE(), interactive ? 1 : 0, defaultEditable ? 1 : 0);
        return (RESULT != 0);
    }
    
    /**
     * Denotes the end of an action that may not be undone.
     * 
     * This will cause any previous operations in the undo/redo
     * queue to be cleared.
     * 
     * This should be called after completing modifications to the
     * text buffer after [method@Gtk.TextBuffer.begin_irreversible_action]
     * was called.
     * 
     * You may nest calls to gtk_text_buffer_begin_irreversible_action()
     * and gtk_text_buffer_end_irreversible_action() pairs.
     */
    public void endIrreversibleAction() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_end_irreversible_action(HANDLE());
    }
    
    /**
     * Ends a user-visible operation.
     * 
     * Should be paired with a call to
     * [method@Gtk.TextBuffer.begin_user_action].
     * See that function for a full explanation.
     */
    public void endUserAction() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_end_user_action(HANDLE());
    }
    
    /**
     * Retrieves the first and last iterators in the buffer, i.e. the
     * entire buffer lies within the range [@start,@end).
     */
    public void getBounds(TextIter start, TextIter end) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_get_bounds(HANDLE(), start.HANDLE(), end.HANDLE());
    }
    
    /**
     * Gets whether there is a redoable action in the history.
     */
    public boolean getCanRedo() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_get_can_redo(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether there is an undoable action in the history.
     */
    public boolean getCanUndo() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_get_can_undo(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets the number of characters in the buffer.
     * 
     * Note that characters and bytes are not the same, you can’t e.g.
     * expect the contents of the buffer in string form to be this
     * many bytes long.
     * 
     * The character count is cached, so this function is very fast.
     */
    public int getCharCount() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_get_char_count(HANDLE());
        return RESULT;
    }
    
    /**
     * Gets whether the buffer is saving modifications to the buffer
     * to allow for undo and redo actions.
     * 
     * See [method@Gtk.TextBuffer.begin_irreversible_action] and
     * [method@Gtk.TextBuffer.end_irreversible_action] to create
     * changes to the buffer that cannot be undone.
     */
    public boolean getEnableUndo() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_get_enable_undo(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Initializes @iter with the “end iterator,” one past the last valid
     * character in the text buffer.
     * 
     * If dereferenced with [method@Gtk.TextIter.get_char], the end
     * iterator has a character value of 0.
     * The entire buffer lies in the range from the first position in
     * the buffer (call [method@Gtk.TextBuffer.get_start_iter] to get
     * character position 0) to the end iterator.
     */
    public void getEndIter(TextIter iter) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_get_end_iter(HANDLE(), iter.HANDLE());
    }
    
    /**
     * Indicates whether the buffer has some text currently selected.
     */
    public boolean getHasSelection() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_get_has_selection(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the mark that represents the cursor (insertion point).
     * 
     * Equivalent to calling [method@Gtk.TextBuffer.get_mark]
     * to get the mark named “insert”, but very slightly more
     * efficient, and involves less typing.
     */
    public TextMark getInsert() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_get_insert(HANDLE());
        return new TextMark(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Obtains the location of @anchor within @buffer.
     */
    public void getIterAtChildAnchor(TextIter iter, TextChildAnchor anchor) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_get_iter_at_child_anchor(HANDLE(), iter.HANDLE(), anchor.HANDLE());
    }
    
    /**
     * Initializes @iter to the start of the given line.
     * 
     * If @line_number is greater than or equal to the number of lines
     * in the @buffer, the end iterator is returned.
     */
    public boolean getIterAtLine(TextIter iter, int lineNumber) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_get_iter_at_line(HANDLE(), iter.HANDLE(), lineNumber);
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_get_iter_at_line_index(HANDLE(), iter.HANDLE(), lineNumber, byteIndex);
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_get_iter_at_line_offset(HANDLE(), iter.HANDLE(), lineNumber, charOffset);
        return (RESULT != 0);
    }
    
    /**
     * Initializes @iter with the current position of @mark.
     */
    public void getIterAtMark(TextIter iter, TextMark mark) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_get_iter_at_mark(HANDLE(), iter.HANDLE(), mark.HANDLE());
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
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_get_iter_at_offset(HANDLE(), iter.HANDLE(), charOffset);
    }
    
    /**
     * Obtains the number of lines in the buffer.
     * 
     * This value is cached, so the function is very fast.
     */
    public int getLineCount() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_get_line_count(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the mark named @name in buffer @buffer, or %NULL if no such
     * mark exists in the buffer.
     */
    public TextMark getMark(java.lang.String name) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_get_mark(HANDLE(), Interop.allocateNativeString(name).HANDLE());
        return new TextMark(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Gets the maximum number of undo levels to perform.
     * 
     * If 0, unlimited undo actions may be performed. Note that this may
     * have a memory usage impact as it requires storing an additional
     * copy of the inserted or removed text within the text buffer.
     */
    public int getMaxUndoLevels() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_get_max_undo_levels(HANDLE());
        return RESULT;
    }
    
    /**
     * Indicates whether the buffer has been modified since the last call
     * to [method@Gtk.TextBuffer.set_modified] set the modification flag to
     * %FALSE.
     * 
     * Used for example to enable a “save” function in a text editor.
     */
    public boolean getModified() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_get_modified(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the mark that represents the selection bound.
     * 
     * Equivalent to calling [method@Gtk.TextBuffer.get_mark]
     * to get the mark named “selection_bound”, but very slightly
     * more efficient, and involves less typing.
     * 
     * The currently-selected text in @buffer is the region between the
     * “selection_bound” and “insert” marks. If “selection_bound” and
     * “insert” are in the same place, then there is no current selection.
     * [method@Gtk.TextBuffer.get_selection_bounds] is another convenient
     * function for handling the selection, if you just want to know whether
     * there’s a selection and what its bounds are.
     */
    public TextMark getSelectionBound() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_get_selection_bound(HANDLE());
        return new TextMark(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns %TRUE if some text is selected; places the bounds
     * of the selection in @start and @end.
     * 
     * If the selection has length 0, then @start and @end are filled
     * in with the same value. @start and @end will be in ascending order.
     * If @start and @end are %NULL, then they are not filled in, but the
     * return value still indicates whether text is selected.
     */
    public boolean getSelectionBounds(TextIter start, TextIter end) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_get_selection_bounds(HANDLE(), start.HANDLE(), end.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Get a content provider for this buffer.
     * 
     * It can be used to make the content of @buffer available
     * in a `GdkClipboard`, see [method@Gdk.Clipboard.set_content].
     */
    public org.gtk.gdk.ContentProvider getSelectionContent() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_get_selection_content(HANDLE());
        return new org.gtk.gdk.ContentProvider(ProxyFactory.get(RESULT, true));
    }
    
    /**
     * Returns the text in the range [@start,@end).
     * 
     * Excludes undisplayed text (text marked with tags that set the
     * invisibility attribute) if @include_hidden_chars is %FALSE.
     * The returned string includes a 0xFFFC character whenever the
     * buffer contains embedded images, so byte and character indexes
     * into the returned string do correspond to byte and character
     * indexes into the buffer. Contrast with [method@Gtk.TextBuffer.get_text].
     * Note that 0xFFFC can occur in normal text as well, so it is not a
     * reliable indicator that a paintable or widget is in the buffer.
     */
    public java.lang.String getSlice(TextIter start, TextIter end, boolean includeHiddenChars) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_get_slice(HANDLE(), start.HANDLE(), end.HANDLE(), includeHiddenChars ? 1 : 0);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Initialized @iter with the first position in the text buffer.
     * 
     * This is the same as using [method@Gtk.TextBuffer.get_iter_at_offset]
     * to get the iter at character offset 0.
     */
    public void getStartIter(TextIter iter) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_get_start_iter(HANDLE(), iter.HANDLE());
    }
    
    /**
     * Get the `GtkTextTagTable` associated with this buffer.
     */
    public TextTagTable getTagTable() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_get_tag_table(HANDLE());
        return new TextTagTable(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns the text in the range [@start,@end).
     * 
     * Excludes undisplayed text (text marked with tags that set the
     * invisibility attribute) if @include_hidden_chars is %FALSE.
     * Does not include characters representing embedded images, so
     * byte and character indexes into the returned string do not
     * correspond to byte and character indexes into the buffer.
     * Contrast with [method@Gtk.TextBuffer.get_slice].
     */
    public java.lang.String getText(TextIter start, TextIter end, boolean includeHiddenChars) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_get_text(HANDLE(), start.HANDLE(), end.HANDLE(), includeHiddenChars ? 1 : 0);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Inserts @len bytes of @text at position @iter.
     * 
     * If @len is -1, @text must be nul-terminated and will be inserted in its
     * entirety. Emits the “insert-text” signal; insertion actually occurs
     * in the default handler for the signal. @iter is invalidated when
     * insertion occurs (because the buffer contents change), but the
     * default signal handler revalidates it to point to the end of the
     * inserted text.
     */
    public void insert(TextIter iter, java.lang.String text, int len) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_insert(HANDLE(), iter.HANDLE(), Interop.allocateNativeString(text).HANDLE(), len);
    }
    
    /**
     * Inserts @text in @buffer.
     * 
     * Simply calls [method@Gtk.TextBuffer.insert],
     * using the current cursor position as the insertion point.
     */
    public void insertAtCursor(java.lang.String text, int len) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_insert_at_cursor(HANDLE(), Interop.allocateNativeString(text).HANDLE(), len);
    }
    
    /**
     * Inserts a child widget anchor into the text buffer at @iter.
     * 
     * The anchor will be counted as one character in character counts, and
     * when obtaining the buffer contents as a string, will be represented
     * by the Unicode “object replacement character” 0xFFFC. Note that the
     * “slice” variants for obtaining portions of the buffer as a string
     * include this character for child anchors, but the “text” variants do
     * not. E.g. see [method@Gtk.TextBuffer.get_slice] and
     * [method@Gtk.TextBuffer.get_text].
     * 
     * Consider [method@Gtk.TextBuffer.create_child_anchor] as a more
     * convenient alternative to this function. The buffer will add a
     * reference to the anchor, so you can unref it after insertion.
     */
    public void insertChildAnchor(TextIter iter, TextChildAnchor anchor) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_insert_child_anchor(HANDLE(), iter.HANDLE(), anchor.HANDLE());
    }
    
    /**
     * Inserts @text in @buffer.
     * 
     * Like [method@Gtk.TextBuffer.insert], but the insertion will not occur
     * if @iter is at a non-editable location in the buffer. Usually you
     * want to prevent insertions at ineditable locations if the insertion
     * results from a user action (is interactive).
     * 
     * @default_editable indicates the editability of text that doesn't
     * have a tag affecting editability applied to it. Typically the
     * result of [method@Gtk.TextView.get_editable] is appropriate here.
     */
    public boolean insertInteractive(TextIter iter, java.lang.String text, int len, boolean defaultEditable) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_insert_interactive(HANDLE(), iter.HANDLE(), Interop.allocateNativeString(text).HANDLE(), len, defaultEditable ? 1 : 0);
        return (RESULT != 0);
    }
    
    /**
     * Inserts @text in @buffer.
     * 
     * Calls [method@Gtk.TextBuffer.insert_interactive]
     * at the cursor position.
     * 
     * @default_editable indicates the editability of text that doesn't
     * have a tag affecting editability applied to it. Typically the
     * result of [method@Gtk.TextView.get_editable] is appropriate here.
     */
    public boolean insertInteractiveAtCursor(java.lang.String text, int len, boolean defaultEditable) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_insert_interactive_at_cursor(HANDLE(), Interop.allocateNativeString(text).HANDLE(), len, defaultEditable ? 1 : 0);
        return (RESULT != 0);
    }
    
    /**
     * Inserts the text in @markup at position @iter.
     * 
     * @markup will be inserted in its entirety and must be nul-terminated
     * and valid UTF-8. Emits the [signal@Gtk.TextBuffer::insert-text] signal,
     * possibly multiple times; insertion actually occurs in the default handler
     * for the signal. @iter will point to the end of the inserted text on return.
     */
    public void insertMarkup(TextIter iter, java.lang.String markup, int len) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_insert_markup(HANDLE(), iter.HANDLE(), Interop.allocateNativeString(markup).HANDLE(), len);
    }
    
    /**
     * Inserts an image into the text buffer at @iter.
     * 
     * The image will be counted as one character in character counts,
     * and when obtaining the buffer contents as a string, will be
     * represented by the Unicode “object replacement character” 0xFFFC.
     * Note that the “slice” variants for obtaining portions of the buffer
     * as a string include this character for paintable, but the “text”
     * variants do not. e.g. see [method@Gtk.TextBuffer.get_slice] and
     * [method@Gtk.TextBuffer.get_text].
     */
    public void insertPaintable(TextIter iter, org.gtk.gdk.Paintable paintable) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_insert_paintable(HANDLE(), iter.HANDLE(), paintable.HANDLE());
    }
    
    /**
     * Copies text, tags, and paintables between @start and @end
     * and inserts the copy at @iter.
     * 
     * The order of @start and @end doesn’t matter.
     * 
     * Used instead of simply getting/inserting text because it preserves
     * images and tags. If @start and @end are in a different buffer from
     * @buffer, the two buffers must share the same tag table.
     * 
     * Implemented via emissions of the ::insert-text and ::apply-tag signals,
     * so expect those.
     */
    public void insertRange(TextIter iter, TextIter start, TextIter end) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_insert_range(HANDLE(), iter.HANDLE(), start.HANDLE(), end.HANDLE());
    }
    
    /**
     * Copies text, tags, and paintables between @start and @end
     * and inserts the copy at @iter.
     * 
     * Same as [method@Gtk.TextBuffer.insert_range], but does nothing
     * if the insertion point isn’t editable. The @default_editable
     * parameter indicates whether the text is editable at @iter if
     * no tags enclosing @iter affect editability. Typically the result
     * of [method@Gtk.TextView.get_editable] is appropriate here.
     */
    public boolean insertRangeInteractive(TextIter iter, TextIter start, TextIter end, boolean defaultEditable) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_insert_range_interactive(HANDLE(), iter.HANDLE(), start.HANDLE(), end.HANDLE(), defaultEditable ? 1 : 0);
        return (RESULT != 0);
    }
    
    /**
     * Moves @mark to the new location @where.
     * 
     * Emits the [signal@Gtk.TextBuffer::mark-set] signal
     * as notification of the move.
     */
    public void moveMark(TextMark mark, TextIter where) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_move_mark(HANDLE(), mark.HANDLE(), where.HANDLE());
    }
    
    /**
     * Moves the mark named @name (which must exist) to location @where.
     * 
     * See [method@Gtk.TextBuffer.move_mark] for details.
     */
    public void moveMarkByName(java.lang.String name, TextIter where) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_move_mark_by_name(HANDLE(), Interop.allocateNativeString(name).HANDLE(), where.HANDLE());
    }
    
    /**
     * Pastes the contents of a clipboard.
     * 
     * If @override_location is %NULL, the pasted text will be inserted
     * at the cursor position, or the buffer selection will be replaced
     * if the selection is non-empty.
     * 
     * Note: pasting is asynchronous, that is, we’ll ask for the paste data
     * and return, and at some point later after the main loop runs, the paste
     * data will be inserted.
     */
    public void pasteClipboard(org.gtk.gdk.Clipboard clipboard, TextIter overrideLocation, boolean defaultEditable) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_paste_clipboard(HANDLE(), clipboard.HANDLE(), overrideLocation.HANDLE(), defaultEditable ? 1 : 0);
    }
    
    /**
     * This function moves the “insert” and “selection_bound” marks
     * simultaneously.
     * 
     * If you move them to the same place in two steps with
     * [method@Gtk.TextBuffer.move_mark], you will temporarily select a
     * region in between their old and new locations, which can be pretty
     * inefficient since the temporarily-selected region will force stuff
     * to be recalculated. This function moves them as a unit, which can
     * be optimized.
     */
    public void placeCursor(TextIter where) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_place_cursor(HANDLE(), where.HANDLE());
    }
    
    /**
     * Redoes the next redoable action on the buffer, if there is one.
     */
    public void redo() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_redo(HANDLE());
    }
    
    /**
     * Removes all tags in the range between @start and @end.
     * 
     * Be careful with this function; it could remove tags added in code
     * unrelated to the code you’re currently writing. That is, using this
     * function is probably a bad idea if you have two or more unrelated
     * code sections that add tags.
     */
    public void removeAllTags(TextIter start, TextIter end) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_remove_all_tags(HANDLE(), start.HANDLE(), end.HANDLE());
    }
    
    /**
     * Removes a `GdkClipboard` added with
     * gtk_text_buffer_add_selection_clipboard().
     */
    public void removeSelectionClipboard(org.gtk.gdk.Clipboard clipboard) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_remove_selection_clipboard(HANDLE(), clipboard.HANDLE());
    }
    
    /**
     * Emits the “remove-tag” signal.
     * 
     * The default handler for the signal removes all occurrences
     * of @tag from the given range. @start and @end don’t have
     * to be in order.
     */
    public void removeTag(TextTag tag, TextIter start, TextIter end) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_remove_tag(HANDLE(), tag.HANDLE(), start.HANDLE(), end.HANDLE());
    }
    
    /**
     * Emits the “remove-tag” signal.
     * 
     * Calls [method@Gtk.TextTagTable.lookup] on the buffer’s
     * tag table to get a `GtkTextTag`, then calls
     * [method@Gtk.TextBuffer.remove_tag].
     */
    public void removeTagByName(java.lang.String name, TextIter start, TextIter end) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_remove_tag_by_name(HANDLE(), Interop.allocateNativeString(name).HANDLE(), start.HANDLE(), end.HANDLE());
    }
    
    /**
     * This function moves the “insert” and “selection_bound” marks
     * simultaneously.
     * 
     * If you move them in two steps with
     * [method@Gtk.TextBuffer.move_mark], you will temporarily select a
     * region in between their old and new locations, which can be pretty
     * inefficient since the temporarily-selected region will force stuff
     * to be recalculated. This function moves them as a unit, which can
     * be optimized.
     */
    public void selectRange(TextIter ins, TextIter bound) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_select_range(HANDLE(), ins.HANDLE(), bound.HANDLE());
    }
    
    /**
     * Sets whether or not to enable undoable actions in the text buffer.
     * 
     * Undoable actions in this context are changes to the text content of
     * the buffer. Changes to tags and marks are not tracked.
     * 
     * If enabled, the user will be able to undo the last number of actions
     * up to [method@Gtk.TextBuffer.get_max_undo_levels].
     * 
     * See [method@Gtk.TextBuffer.begin_irreversible_action] and
     * [method@Gtk.TextBuffer.end_irreversible_action] to create
     * changes to the buffer that cannot be undone.
     */
    public void setEnableUndo(boolean enableUndo) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_set_enable_undo(HANDLE(), enableUndo ? 1 : 0);
    }
    
    /**
     * Sets the maximum number of undo levels to perform.
     * 
     * If 0, unlimited undo actions may be performed. Note that this may
     * have a memory usage impact as it requires storing an additional
     * copy of the inserted or removed text within the text buffer.
     */
    public void setMaxUndoLevels(int maxUndoLevels) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_set_max_undo_levels(HANDLE(), maxUndoLevels);
    }
    
    /**
     * Used to keep track of whether the buffer has been
     * modified since the last time it was saved.
     * 
     * Whenever the buffer is saved to disk, call
     * `gtk_text_buffer_set_modified (@buffer, FALSE)`.
     * When the buffer is modified, it will automatically
     * toggled on the modified bit again. When the modified
     * bit flips, the buffer emits the
     * [signal@Gtk.TextBuffer::modified-changed] signal.
     */
    public void setModified(boolean setting) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_set_modified(HANDLE(), setting ? 1 : 0);
    }
    
    /**
     * Deletes current contents of @buffer, and inserts @text instead.
     * 
     * If @len is -1, @text must be nul-terminated.
     * @text must be valid UTF-8.
     */
    public void setText(java.lang.String text, int len) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_set_text(HANDLE(), Interop.allocateNativeString(text).HANDLE(), len);
    }
    
    /**
     * Undoes the last undoable action on the buffer, if there is one.
     */
    public void undo() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_buffer_undo(HANDLE());
    }
    
    @FunctionalInterface
    public interface ApplyTagHandler {
        void signalReceived(TextBuffer source, TextTag tag, TextIter start, TextIter end);
    }
    
    /**
     * Emitted to apply a tag to a range of text in a `GtkTextBuffer`.
     * 
     * Applying actually occurs in the default handler.
     * 
     * Note that if your handler runs before the default handler
     * it must not invalidate the @start and @end iters (or has to
     * revalidate them).
     * 
     * See also:
     * [method@Gtk.TextBuffer.apply_tag],
     * [method@Gtk.TextBuffer.insert_with_tags],
     * [method@Gtk.TextBuffer.insert_range].
     */
    public void onApplyTag(ApplyTagHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBufferApplyTag", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("apply-tag").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
     * operation on a `GtkTextBuffer`.
     * 
     * See also:
     * [method@Gtk.TextBuffer.begin_user_action],
     * [method@Gtk.TextBuffer.insert_interactive],
     * [method@Gtk.TextBuffer.insert_range_interactive],
     * [method@Gtk.TextBuffer.delete_interactive],
     * [method@Gtk.TextBuffer.backspace],
     * [method@Gtk.TextBuffer.delete_selection].
     */
    public void onBeginUserAction(BeginUserActionHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBufferBeginUserAction", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("begin-user-action").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(TextBuffer source);
    }
    
    /**
     * Emitted when the content of a `GtkTextBuffer` has changed.
     */
    public void onChanged(ChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBufferChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("changed").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface DeleteRangeHandler {
        void signalReceived(TextBuffer source, TextIter start, TextIter end);
    }
    
    /**
     * Emitted to delete a range from a `GtkTextBuffer`.
     * 
     * Note that if your handler runs before the default handler
     * it must not invalidate the @start and @end iters (or has
     * to revalidate them). The default signal handler revalidates
     * the @start and @end iters to both point to the location
     * where text was deleted. Handlers which run after the default
     * handler (see g_signal_connect_after()) do not have access to
     * the deleted text.
     * 
     * See also: [method@Gtk.TextBuffer.delete].
     */
    public void onDeleteRange(DeleteRangeHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBufferDeleteRange", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("delete-range").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
     * operation on the `GtkTextBuffer`.
     * 
     * See also:
     * [method@Gtk.TextBuffer.end_user_action],
     * [method@Gtk.TextBuffer.insert_interactive],
     * [method@Gtk.TextBuffer.insert_range_interactive],
     * [method@Gtk.TextBuffer.delete_interactive],
     * [method@Gtk.TextBuffer.backspace],
     * [method@Gtk.TextBuffer.delete_selection],
     * [method@Gtk.TextBuffer.backspace].
     */
    public void onEndUserAction(EndUserActionHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBufferEndUserAction", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("end-user-action").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface InsertChildAnchorHandler {
        void signalReceived(TextBuffer source, TextIter location, TextChildAnchor anchor);
    }
    
    /**
     * Emitted to insert a `GtkTextChildAnchor` in a `GtkTextBuffer`.
     * 
     * Insertion actually occurs in the default handler.
     * 
     * Note that if your handler runs before the default handler
     * it must not invalidate the @location iter (or has to
     * revalidate it). The default signal handler revalidates
     * it to be placed after the inserted @anchor.
     * 
     * See also: [method@Gtk.TextBuffer.insert_child_anchor].
     */
    public void onInsertChildAnchor(InsertChildAnchorHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBufferInsertChildAnchor", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("insert-child-anchor").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface InsertPaintableHandler {
        void signalReceived(TextBuffer source, TextIter location, org.gtk.gdk.Paintable paintable);
    }
    
    /**
     * Emitted to insert a `GdkPaintable` in a `GtkTextBuffer`.
     * 
     * Insertion actually occurs in the default handler.
     * 
     * Note that if your handler runs before the default handler
     * it must not invalidate the @location iter (or has to
     * revalidate it). The default signal handler revalidates
     * it to be placed after the inserted @paintable.
     * 
     * See also: [method@Gtk.TextBuffer.insert_paintable].
     */
    public void onInsertPaintable(InsertPaintableHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBufferInsertPaintable", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("insert-paintable").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface InsertTextHandler {
        void signalReceived(TextBuffer source, TextIter location, java.lang.String text, int len);
    }
    
    /**
     * Emitted to insert text in a `GtkTextBuffer`.
     * 
     * Insertion actually occurs in the default handler.
     * 
     * Note that if your handler runs before the default handler
     * it must not invalidate the @location iter (or has to
     * revalidate it). The default signal handler revalidates
     * it to point to the end of the inserted text.
     * 
     * See also: [method@Gtk.TextBuffer.insert],
     * [method@Gtk.TextBuffer.insert_range].
     */
    public void onInsertText(InsertTextHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBufferInsertText", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("insert-text").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MarkDeletedHandler {
        void signalReceived(TextBuffer source, TextMark mark);
    }
    
    /**
     * Emitted as notification after a `GtkTextMark` is deleted.
     * 
     * See also: [method@Gtk.TextBuffer.delete_mark].
     */
    public void onMarkDeleted(MarkDeletedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBufferMarkDeleted", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("mark-deleted").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MarkSetHandler {
        void signalReceived(TextBuffer source, TextIter location, TextMark mark);
    }
    
    /**
     * Emitted as notification after a `GtkTextMark` is set.
     * 
     * See also:
     * [method@Gtk.TextBuffer.create_mark],
     * [method@Gtk.TextBuffer.move_mark].
     */
    public void onMarkSet(MarkSetHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBufferMarkSet", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("mark-set").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ModifiedChangedHandler {
        void signalReceived(TextBuffer source);
    }
    
    /**
     * Emitted when the modified bit of a `GtkTextBuffer` flips.
     * 
     * See also: [method@Gtk.TextBuffer.set_modified].
     */
    public void onModifiedChanged(ModifiedChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBufferModifiedChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("modified-changed").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
     * of the pasted text. See [method@Gtk.TextBuffer.paste_clipboard]
     * for more details.
     */
    public void onPasteDone(PasteDoneHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBufferPasteDone", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("paste-done").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
    public void onRedo(RedoHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBufferRedo", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("redo").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
     * of text in a `GtkTextBuffer`.
     * 
     * Removal actually occurs in the default handler.
     * 
     * Note that if your handler runs before the default handler
     * it must not invalidate the @start and @end iters (or has
     * to revalidate them).
     * 
     * See also: [method@Gtk.TextBuffer.remove_tag].
     */
    public void onRemoveTag(RemoveTagHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBufferRemoveTag", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("remove-tag").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
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
    public void onUndo(UndoHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalTextBufferUndo", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            io.github.jwharm.javagi.interop.jextract.gtk_h.g_signal_connect_data(this.HANDLE(), Interop.allocateNativeString("undo").HANDLE(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
