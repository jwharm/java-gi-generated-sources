package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Stores text and attributes for display in a {@code GtkTextView}.
 * <p>
 * You may wish to begin by reading the
 * <a href="section-text-widget.html">text widget conceptual overview</a>,
 * which gives an overview of all the objects and data types
 * related to the text widget and how they work together.
 * <p>
 * GtkTextBuffer can support undoing changes to the buffer
 * content, see {@link TextBuffer#setEnableUndo}.
 */
public class TextBuffer extends org.gtk.gobject.Object {

    public TextBuffer(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to TextBuffer */
    public static TextBuffer castFrom(org.gtk.gobject.Object gobject) {
        return new TextBuffer(gobject.refcounted());
    }
    
    private static Refcounted constructNew(TextTagTable table) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_text_buffer_new(table.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a new text buffer.
     */
    public TextBuffer(TextTagTable table) {
        super(constructNew(table));
    }
    
    /**
     * Adds the mark at position {@code where}.
     * <p>
     * The mark must not be added to another buffer, and if its name
     * is not {@code null} then there must not be another mark in the buffer
     * with the same name.
     * <p>
     * Emits the {@code Gtk.TextBuffer::mark-set} signal as notification
     * of the mark's initial placement.
     */
    public void addMark(TextMark mark, TextIter where) {
        gtk_h.gtk_text_buffer_add_mark(handle(), mark.handle(), where.handle());
    }
    
    /**
     * Adds {@code clipboard} to the list of clipboards in which the selection
     * contents of {@code buffer} are available.
     * <p>
     * In most cases, {@code clipboard} will be the {@code GdkClipboard} returned by
     * {@link Widget#getPrimaryClipboard} for a view of {@code buffer}.
     */
    public void addSelectionClipboard(org.gtk.gdk.Clipboard clipboard) {
        gtk_h.gtk_text_buffer_add_selection_clipboard(handle(), clipboard.handle());
    }
    
    /**
     * Emits the “apply-tag” signal on {@code buffer}.
     * <p>
     * The default handler for the signal applies
     * {@code tag} to the given range. {@code start} and {@code end} do
     * not have to be in order.
     */
    public void applyTag(TextTag tag, TextIter start, TextIter end) {
        gtk_h.gtk_text_buffer_apply_tag(handle(), tag.handle(), start.handle(), end.handle());
    }
    
    /**
     * Emits the “apply-tag” signal on {@code buffer}.
     * <p>
     * Calls {@link TextTagTable#lookup} on the buffer’s
     * tag table to get a {@code GtkTextTag}, then calls
     * {@link TextBuffer#applyTag}.
     */
    public void applyTagByName(java.lang.String name, TextIter start, TextIter end) {
        gtk_h.gtk_text_buffer_apply_tag_by_name(handle(), Interop.allocateNativeString(name).handle(), start.handle(), end.handle());
    }
    
    /**
     * Performs the appropriate action as if the user hit the delete
     * key with the cursor at the position specified by {@code iter}.
     * <p>
     * In the normal case a single character will be deleted, but when
     * combining accents are involved, more than one character can
     * be deleted, and when precomposed character and accent combinations
     * are involved, less than one character will be deleted.
     * <p>
     * Because the buffer is modified, all outstanding iterators become
     * invalid after calling this function; however, the {@code iter} will be
     * re-initialized to point to the location where text was deleted.
     */
    public boolean backspace(TextIter iter, boolean interactive, boolean defaultEditable) {
        var RESULT = gtk_h.gtk_text_buffer_backspace(handle(), iter.handle(), interactive ? 1 : 0, defaultEditable ? 1 : 0);
        return RESULT != 0;
    }
    
    /**
     * Denotes the beginning of an action that may not be undone.
     * <p>
     * This will cause any previous operations in the undo/redo queue
     * to be cleared.
     * <p>
     * This should be paired with a call to
     * {@link TextBuffer#endIrreversibleAction} after the irreversible
     * action has completed.
     * <p>
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
     * an undo stack. {@code GtkTextBuffer} maintains a count of calls to
     * gtk_text_buffer_begin_user_action() that have not been closed with
     * a call to gtk_text_buffer_end_user_action(), and emits the
     * “begin-user-action” and “end-user-action” signals only for the
     * outermost pair of calls. This allows you to build user actions
     * from other user actions.
     * <p>
     * The “interactive” buffer mutation functions, such as
     * {@link TextBuffer#insertInteractive}, automatically call
     * begin/end user action around the buffer operations they perform,
     * so there's no need to add extra calls if you user action consists
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
     * <p>
     * This is a convenience function which simply creates a child anchor
     * with {@link TextChildAnchor#TextChildAnchor} and inserts it into the buffer
     * with {@link TextBuffer#insertChildAnchor}.
     * <p>
     * The new anchor is owned by the buffer; no reference count is
     * returned to the caller of this function.
     */
    public TextChildAnchor createChildAnchor(TextIter iter) {
        var RESULT = gtk_h.gtk_text_buffer_create_child_anchor(handle(), iter.handle());
        return new TextChildAnchor(Refcounted.get(RESULT, false));
    }
    
    /**
     * Creates a mark at position {@code where}.
     * <p>
     * If {@code mark_name} is {@code null}, the mark is anonymous; otherwise, the mark
     * can be retrieved by name using {@link TextBuffer#getMark}.
     * If a mark has left gravity, and text is inserted at the mark’s
     * current location, the mark will be moved to the left of the
     * newly-inserted text. If the mark has right gravity
     * ({@code left_gravity} = {@code false}), the mark will end up on the right of
     * newly-inserted text. The standard left-to-right cursor is a mark
     * with right gravity (when you type, the cursor stays on the right
     * side of the text you’re typing).
     * <p>
     * The caller of this function does not own a
     * reference to the returned {@code GtkTextMark}, so you can ignore the
     * return value if you like. Marks are owned by the buffer and go
     * away when the buffer does.
     * <p>
     * Emits the {@code Gtk.TextBuffer::mark-set} signal as notification
     * of the mark's initial placement.
     */
    public TextMark createMark(java.lang.String markName, TextIter where, boolean leftGravity) {
        var RESULT = gtk_h.gtk_text_buffer_create_mark(handle(), Interop.allocateNativeString(markName).handle(), where.handle(), leftGravity ? 1 : 0);
        return new TextMark(Refcounted.get(RESULT, false));
    }
    
    /**
     * Copies the currently-selected text to a clipboard,
     * then deletes said text if it’s editable.
     */
    public void cutClipboard(org.gtk.gdk.Clipboard clipboard, boolean defaultEditable) {
        gtk_h.gtk_text_buffer_cut_clipboard(handle(), clipboard.handle(), defaultEditable ? 1 : 0);
    }
    
    /**
     * Deletes text between {@code start} and {@code end}.
     * <p>
     * The order of {@code start} and {@code end} is not actually relevant;
     * gtk_text_buffer_delete() will reorder them.
     * <p>
     * This function actually emits the “delete-range” signal, and
     * the default handler of that signal deletes the text. Because the
     * buffer is modified, all outstanding iterators become invalid after
     * calling this function; however, the {@code start} and {@code end} will be
     * re-initialized to point to the location where text was deleted.
     */
    public void delete(TextIter start, TextIter end) {
        gtk_h.gtk_text_buffer_delete(handle(), start.handle(), end.handle());
    }
    
    /**
     * Deletes all editable text in the given range.
     * <p>
     * Calls {@link TextBuffer#delete} for each editable
     * sub-range of [{@code start},{@code end}). {@code start} and {@code end} are revalidated
     * to point to the location of the last deleted range, or left
     * untouched if no text was deleted.
     */
    public boolean deleteInteractive(TextIter startIter, TextIter endIter, boolean defaultEditable) {
        var RESULT = gtk_h.gtk_text_buffer_delete_interactive(handle(), startIter.handle(), endIter.handle(), defaultEditable ? 1 : 0);
        return RESULT != 0;
    }
    
    /**
     * Deletes {@code mark}, so that it’s no longer located anywhere in the
     * buffer.
     * <p>
     * Removes the reference the buffer holds to the mark, so if
     * you haven’t called g_object_ref() on the mark, it will be freed.
     * Even if the mark isn’t freed, most operations on {@code mark} become
     * invalid, until it gets added to a buffer again with
     * {@code Gtk.TextMark.get_deleted}
     * to find out if a mark has been removed from its buffer.
     * <p>
     * The {@code Gtk.TextBuffer::mark-deleted} signal will be emitted as
     * notification after the mark is deleted.
     */
    public void deleteMark(TextMark mark) {
        gtk_h.gtk_text_buffer_delete_mark(handle(), mark.handle());
    }
    
    /**
     * Deletes the mark named {@code name}; the mark must exist.
     * <p>
     * See {@link TextBuffer#deleteMark} for details.
     */
    public void deleteMarkByName(java.lang.String name) {
        gtk_h.gtk_text_buffer_delete_mark_by_name(handle(), Interop.allocateNativeString(name).handle());
    }
    
    /**
     * Deletes the range between the “insert” and “selection_bound” marks,
     * that is, the currently-selected text.
     * <p>
     * If {@code interactive} is {@code true}, the editability of the selection will be
     * considered (users can’t delete uneditable text).
     */
    public boolean deleteSelection(boolean interactive, boolean defaultEditable) {
        var RESULT = gtk_h.gtk_text_buffer_delete_selection(handle(), interactive ? 1 : 0, defaultEditable ? 1 : 0);
        return RESULT != 0;
    }
    
    /**
     * Denotes the end of an action that may not be undone.
     * <p>
     * This will cause any previous operations in the undo/redo
     * queue to be cleared.
     * <p>
     * This should be called after completing modifications to the
     * text buffer after {@link TextBuffer#beginIrreversibleAction}
     * was called.
     * <p>
     * You may nest calls to gtk_text_buffer_begin_irreversible_action()
     * and gtk_text_buffer_end_irreversible_action() pairs.
     */
    public void endIrreversibleAction() {
        gtk_h.gtk_text_buffer_end_irreversible_action(handle());
    }
    
    /**
     * Ends a user-visible operation.
     * <p>
     * Should be paired with a call to
     * {@link TextBuffer#beginUserAction}.
     * See that function for a full explanation.
     */
    public void endUserAction() {
        gtk_h.gtk_text_buffer_end_user_action(handle());
    }
    
    /**
     * Retrieves the first and last iterators in the buffer, i.e. the
     * entire buffer lies within the range [{@code start},{@code end}).
     */
    public void getBounds(TextIter start, TextIter end) {
        gtk_h.gtk_text_buffer_get_bounds(handle(), start.handle(), end.handle());
    }
    
    /**
     * Gets whether there is a redoable action in the history.
     */
    public boolean getCanRedo() {
        var RESULT = gtk_h.gtk_text_buffer_get_can_redo(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets whether there is an undoable action in the history.
     */
    public boolean getCanUndo() {
        var RESULT = gtk_h.gtk_text_buffer_get_can_undo(handle());
        return RESULT != 0;
    }
    
    /**
     * Gets the number of characters in the buffer.
     * <p>
     * Note that characters and bytes are not the same, you can’t e.g.
     * expect the contents of the buffer in string form to be this
     * many bytes long.
     * <p>
     * The character count is cached, so this function is very fast.
     */
    public int getCharCount() {
        var RESULT = gtk_h.gtk_text_buffer_get_char_count(handle());
        return RESULT;
    }
    
    /**
     * Gets whether the buffer is saving modifications to the buffer
     * to allow for undo and redo actions.
     * <p>
     * See {@link TextBuffer#beginIrreversibleAction} and
     * {@link TextBuffer#endIrreversibleAction} to create
     * changes to the buffer that cannot be undone.
     */
    public boolean getEnableUndo() {
        var RESULT = gtk_h.gtk_text_buffer_get_enable_undo(handle());
        return RESULT != 0;
    }
    
    /**
     * Initializes {@code iter} with the “end iterator,” one past the last valid
     * character in the text buffer.
     * <p>
     * If dereferenced with {@link TextIter#getChar}, the end
     * iterator has a character value of 0.
     * The entire buffer lies in the range from the first position in
     * the buffer (call {@link TextBuffer#getStartIter} to get
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
        return RESULT != 0;
    }
    
    /**
     * Returns the mark that represents the cursor (insertion point).
     * <p>
     * Equivalent to calling {@link TextBuffer#getMark}
     * to get the mark named “insert”, but very slightly more
     * efficient, and involves less typing.
     */
    public TextMark getInsert() {
        var RESULT = gtk_h.gtk_text_buffer_get_insert(handle());
        return new TextMark(Refcounted.get(RESULT, false));
    }
    
    /**
     * Obtains the location of {@code anchor} within {@code buffer}.
     */
    public void getIterAtChildAnchor(TextIter iter, TextChildAnchor anchor) {
        gtk_h.gtk_text_buffer_get_iter_at_child_anchor(handle(), iter.handle(), anchor.handle());
    }
    
    /**
     * Initializes {@code iter} to the start of the given line.
     * <p>
     * If {@code line_number} is greater than or equal to the number of lines
     * in the {@code buffer}, the end iterator is returned.
     */
    public boolean getIterAtLine(TextIter iter, int lineNumber) {
        var RESULT = gtk_h.gtk_text_buffer_get_iter_at_line(handle(), iter.handle(), lineNumber);
        return RESULT != 0;
    }
    
    /**
     * Obtains an iterator pointing to {@code byte_index} within the given line.
     * <p>
     * {@code byte_index} must be the start of a UTF-8 character. Note bytes, not
     * characters; UTF-8 may encode one character as multiple bytes.
     * <p>
     * If {@code line_number} is greater than or equal to the number of lines in the {@code buffer},
     * the end iterator is returned. And if {@code byte_index} is off the
     * end of the line, the iterator at the end of the line is returned.
     */
    public boolean getIterAtLineIndex(TextIter iter, int lineNumber, int byteIndex) {
        var RESULT = gtk_h.gtk_text_buffer_get_iter_at_line_index(handle(), iter.handle(), lineNumber, byteIndex);
        return RESULT != 0;
    }
    
    /**
     * Obtains an iterator pointing to {@code char_offset} within the given line.
     * <p>
     * Note characters, not bytes; UTF-8 may encode one character as multiple
     * bytes.
     * <p>
     * If {@code line_number} is greater than or equal to the number of lines in the {@code buffer},
     * the end iterator is returned. And if {@code char_offset} is off the
     * end of the line, the iterator at the end of the line is returned.
     */
    public boolean getIterAtLineOffset(TextIter iter, int lineNumber, int charOffset) {
        var RESULT = gtk_h.gtk_text_buffer_get_iter_at_line_offset(handle(), iter.handle(), lineNumber, charOffset);
        return RESULT != 0;
    }
    
    /**
     * Initializes {@code iter} with the current position of {@code mark}.
     */
    public void getIterAtMark(TextIter iter, TextMark mark) {
        gtk_h.gtk_text_buffer_get_iter_at_mark(handle(), iter.handle(), mark.handle());
    }
    
    /**
     * Initializes {@code iter} to a position {@code char_offset} chars from the start
     * of the entire buffer.
     * <p>
     * If {@code char_offset} is -1 or greater than the number
     * of characters in the buffer, {@code iter} is initialized to the end iterator,
     * the iterator one past the last valid character in the buffer.
     */
    public void getIterAtOffset(TextIter iter, int charOffset) {
        gtk_h.gtk_text_buffer_get_iter_at_offset(handle(), iter.handle(), charOffset);
    }
    
    /**
     * Obtains the number of lines in the buffer.
     * <p>
     * This value is cached, so the function is very fast.
     */
    public int getLineCount() {
        var RESULT = gtk_h.gtk_text_buffer_get_line_count(handle());
        return RESULT;
    }
    
    /**
     * Returns the mark named {@code name} in buffer {@code buffer}, or {@code null} if no such
     * mark exists in the buffer.
     */
    public TextMark getMark(java.lang.String name) {
        var RESULT = gtk_h.gtk_text_buffer_get_mark(handle(), Interop.allocateNativeString(name).handle());
        return new TextMark(Refcounted.get(RESULT, false));
    }
    
    /**
     * Gets the maximum number of undo levels to perform.
     * <p>
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
     * to {@link TextBuffer#setModified} set the modification flag to
     * {@code false}.
     * <p>
     * Used for example to enable a “save” function in a text editor.
     */
    public boolean getModified() {
        var RESULT = gtk_h.gtk_text_buffer_get_modified(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns the mark that represents the selection bound.
     * <p>
     * Equivalent to calling {@link TextBuffer#getMark}
     * to get the mark named “selection_bound”, but very slightly
     * more efficient, and involves less typing.
     * <p>
     * The currently-selected text in {@code buffer} is the region between the
     * “selection_bound” and “insert” marks. If “selection_bound” and
     * “insert” are in the same place, then there is no current selection.
     * {@link TextBuffer#getSelectionBounds} is another convenient
     * function for handling the selection, if you just want to know whether
     * there’s a selection and what its bounds are.
     */
    public TextMark getSelectionBound() {
        var RESULT = gtk_h.gtk_text_buffer_get_selection_bound(handle());
        return new TextMark(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns {@code true} if some text is selected; places the bounds
     * of the selection in {@code start} and {@code end}.
     * <p>
     * If the selection has length 0, then {@code start} and {@code end} are filled
     * in with the same value. {@code start} and {@code end} will be in ascending order.
     * If {@code start} and {@code end} are {@code null}, then they are not filled in, but the
     * return value still indicates whether text is selected.
     */
    public boolean getSelectionBounds(TextIter start, TextIter end) {
        var RESULT = gtk_h.gtk_text_buffer_get_selection_bounds(handle(), start.handle(), end.handle());
        return RESULT != 0;
    }
    
    /**
     * Get a content provider for this buffer.
     * <p>
     * It can be used to make the content of {@code buffer} available
     * in a {@code GdkClipboard}, see {@link org.gtk.gdk.Clipboard#setContent}.
     */
    public org.gtk.gdk.ContentProvider getSelectionContent() {
        var RESULT = gtk_h.gtk_text_buffer_get_selection_content(handle());
        return new org.gtk.gdk.ContentProvider(Refcounted.get(RESULT, true));
    }
    
    /**
     * Returns the text in the range [{@code start},{@code end}).
     * <p>
     * Excludes undisplayed text (text marked with tags that set the
     * invisibility attribute) if {@code include_hidden_chars} is {@code false}.
     * The returned string includes a 0xFFFC character whenever the
     * buffer contains embedded images, so byte and character indexes
     * into the returned string do correspond to byte and character
     * indexes into the buffer. Contrast with {@link TextBuffer#getText}.
     * Note that 0xFFFC can occur in normal text as well, so it is not a
     * reliable indicator that a paintable or widget is in the buffer.
     */
    public java.lang.String getSlice(TextIter start, TextIter end, boolean includeHiddenChars) {
        var RESULT = gtk_h.gtk_text_buffer_get_slice(handle(), start.handle(), end.handle(), includeHiddenChars ? 1 : 0);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Initialized {@code iter} with the first position in the text buffer.
     * <p>
     * This is the same as using {@link TextBuffer#getIterAtOffset}
     * to get the iter at character offset 0.
     */
    public void getStartIter(TextIter iter) {
        gtk_h.gtk_text_buffer_get_start_iter(handle(), iter.handle());
    }
    
    /**
     * Get the {@code GtkTextTagTable} associated with this buffer.
     */
    public TextTagTable getTagTable() {
        var RESULT = gtk_h.gtk_text_buffer_get_tag_table(handle());
        return new TextTagTable(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns the text in the range [{@code start},{@code end}).
     * <p>
     * Excludes undisplayed text (text marked with tags that set the
     * invisibility attribute) if {@code include_hidden_chars} is {@code false}.
     * Does not include characters representing embedded images, so
     * byte and character indexes into the returned string do not
     * correspond to byte and character indexes into the buffer.
     * Contrast with {@link TextBuffer#getSlice}.
     */
    public java.lang.String getText(TextIter start, TextIter end, boolean includeHiddenChars) {
        var RESULT = gtk_h.gtk_text_buffer_get_text(handle(), start.handle(), end.handle(), includeHiddenChars ? 1 : 0);
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Inserts {@code len} bytes of {@code text} at position {@code iter}.
     * <p>
     * If {@code len} is -1, {@code text} must be nul-terminated and will be inserted in its
     * entirety. Emits the “insert-text” signal; insertion actually occurs
     * in the default handler for the signal. {@code iter} is invalidated when
     * insertion occurs (because the buffer contents change), but the
     * default signal handler revalidates it to point to the end of the
     * inserted text.
     */
    public void insert(TextIter iter, java.lang.String text, int len) {
        gtk_h.gtk_text_buffer_insert(handle(), iter.handle(), Interop.allocateNativeString(text).handle(), len);
    }
    
    /**
     * Inserts {@code text} in {@code buffer}.
     * <p>
     * Simply calls {@link TextBuffer#insert},
     * using the current cursor position as the insertion point.
     */
    public void insertAtCursor(java.lang.String text, int len) {
        gtk_h.gtk_text_buffer_insert_at_cursor(handle(), Interop.allocateNativeString(text).handle(), len);
    }
    
    /**
     * Inserts a child widget anchor into the text buffer at {@code iter}.
     * <p>
     * The anchor will be counted as one character in character counts, and
     * when obtaining the buffer contents as a string, will be represented
     * by the Unicode “object replacement character” 0xFFFC. Note that the
     * “slice” variants for obtaining portions of the buffer as a string
     * include this character for child anchors, but the “text” variants do
     * not. E.g. see {@link TextBuffer#getSlice} and
     * {@link TextBuffer#getText}.
     * <p>
     * Consider {@link TextBuffer#createChildAnchor} as a more
     * convenient alternative to this function. The buffer will add a
     * reference to the anchor, so you can unref it after insertion.
     */
    public void insertChildAnchor(TextIter iter, TextChildAnchor anchor) {
        gtk_h.gtk_text_buffer_insert_child_anchor(handle(), iter.handle(), anchor.handle());
    }
    
    /**
     * Inserts {@code text} in {@code buffer}.
     * <p>
     * Like {@link TextBuffer#insert}, but the insertion will not occur
     * if {@code iter} is at a non-editable location in the buffer. Usually you
     * want to prevent insertions at ineditable locations if the insertion
     * results from a user action (is interactive).
     * <p>
     * {@code default_editable} indicates the editability of text that doesn't
     * have a tag affecting editability applied to it. Typically the
     * result of {@link TextView#getEditable} is appropriate here.
     */
    public boolean insertInteractive(TextIter iter, java.lang.String text, int len, boolean defaultEditable) {
        var RESULT = gtk_h.gtk_text_buffer_insert_interactive(handle(), iter.handle(), Interop.allocateNativeString(text).handle(), len, defaultEditable ? 1 : 0);
        return RESULT != 0;
    }
    
    /**
     * Inserts {@code text} in {@code buffer}.
     * <p>
     * Calls {@link TextBuffer#insertInteractive}
     * at the cursor position.
     * <p>
     * {@code default_editable} indicates the editability of text that doesn't
     * have a tag affecting editability applied to it. Typically the
     * result of {@link TextView#getEditable} is appropriate here.
     */
    public boolean insertInteractiveAtCursor(java.lang.String text, int len, boolean defaultEditable) {
        var RESULT = gtk_h.gtk_text_buffer_insert_interactive_at_cursor(handle(), Interop.allocateNativeString(text).handle(), len, defaultEditable ? 1 : 0);
        return RESULT != 0;
    }
    
    /**
     * Inserts the text in {@code markup} at position {@code iter}.
     * <p>
     * {@code markup} will be inserted in its entirety and must be nul-terminated
     * and valid UTF-8. Emits the {@code Gtk.TextBuffer::insert-text} signal,
     * possibly multiple times; insertion actually occurs in the default handler
     * for the signal. {@code iter} will point to the end of the inserted text on return.
     */
    public void insertMarkup(TextIter iter, java.lang.String markup, int len) {
        gtk_h.gtk_text_buffer_insert_markup(handle(), iter.handle(), Interop.allocateNativeString(markup).handle(), len);
    }
    
    /**
     * Inserts an image into the text buffer at {@code iter}.
     * <p>
     * The image will be counted as one character in character counts,
     * and when obtaining the buffer contents as a string, will be
     * represented by the Unicode “object replacement character” 0xFFFC.
     * Note that the “slice” variants for obtaining portions of the buffer
     * as a string include this character for paintable, but the “text”
     * variants do not. e.g. see {@link TextBuffer#getSlice} and
     * {@link TextBuffer#getText}.
     */
    public void insertPaintable(TextIter iter, org.gtk.gdk.Paintable paintable) {
        gtk_h.gtk_text_buffer_insert_paintable(handle(), iter.handle(), paintable.handle());
    }
    
    /**
     * Copies text, tags, and paintables between {@code start} and {@code end}
     * and inserts the copy at {@code iter}.
     * <p>
     * The order of {@code start} and {@code end} doesn’t matter.
     * <p>
     * Used instead of simply getting/inserting text because it preserves
     * images and tags. If {@code start} and {@code end} are in a different buffer from
     * {@code buffer}, the two buffers must share the same tag table.
     * <p>
     * Implemented via emissions of the ::insert-text and ::apply-tag signals,
     * so expect those.
     */
    public void insertRange(TextIter iter, TextIter start, TextIter end) {
        gtk_h.gtk_text_buffer_insert_range(handle(), iter.handle(), start.handle(), end.handle());
    }
    
    /**
     * Copies text, tags, and paintables between {@code start} and {@code end}
     * and inserts the copy at {@code iter}.
     * <p>
     * Same as {@link TextBuffer#insertRange}, but does nothing
     * if the insertion point isn’t editable. The {@code default_editable}
     * parameter indicates whether the text is editable at {@code iter} if
     * no tags enclosing {@code iter} affect editability. Typically the result
     * of {@link TextView#getEditable} is appropriate here.
     */
    public boolean insertRangeInteractive(TextIter iter, TextIter start, TextIter end, boolean defaultEditable) {
        var RESULT = gtk_h.gtk_text_buffer_insert_range_interactive(handle(), iter.handle(), start.handle(), end.handle(), defaultEditable ? 1 : 0);
        return RESULT != 0;
    }
    
    /**
     * Moves {@code mark} to the new location {@code where}.
     * <p>
     * Emits the {@code Gtk.TextBuffer::mark-set} signal
     * as notification of the move.
     */
    public void moveMark(TextMark mark, TextIter where) {
        gtk_h.gtk_text_buffer_move_mark(handle(), mark.handle(), where.handle());
    }
    
    /**
     * Moves the mark named {@code name} (which must exist) to location {@code where}.
     * <p>
     * See {@link TextBuffer#moveMark} for details.
     */
    public void moveMarkByName(java.lang.String name, TextIter where) {
        gtk_h.gtk_text_buffer_move_mark_by_name(handle(), Interop.allocateNativeString(name).handle(), where.handle());
    }
    
    /**
     * Pastes the contents of a clipboard.
     * <p>
     * If {@code override_location} is {@code null}, the pasted text will be inserted
     * at the cursor position, or the buffer selection will be replaced
     * if the selection is non-empty.
     * <p>
     * Note: pasting is asynchronous, that is, we’ll ask for the paste data
     * and return, and at some point later after the main loop runs, the paste
     * data will be inserted.
     */
    public void pasteClipboard(org.gtk.gdk.Clipboard clipboard, TextIter overrideLocation, boolean defaultEditable) {
        gtk_h.gtk_text_buffer_paste_clipboard(handle(), clipboard.handle(), overrideLocation.handle(), defaultEditable ? 1 : 0);
    }
    
    /**
     * This function moves the “insert” and “selection_bound” marks
     * simultaneously.
     * <p>
     * If you move them to the same place in two steps with
     * {@link TextBuffer#moveMark}, you will temporarily select a
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
     * Removes all tags in the range between {@code start} and {@code end}.
     * <p>
     * Be careful with this function; it could remove tags added in code
     * unrelated to the code you’re currently writing. That is, using this
     * function is probably a bad idea if you have two or more unrelated
     * code sections that add tags.
     */
    public void removeAllTags(TextIter start, TextIter end) {
        gtk_h.gtk_text_buffer_remove_all_tags(handle(), start.handle(), end.handle());
    }
    
    /**
     * Removes a {@code GdkClipboard} added with
     * gtk_text_buffer_add_selection_clipboard().
     */
    public void removeSelectionClipboard(org.gtk.gdk.Clipboard clipboard) {
        gtk_h.gtk_text_buffer_remove_selection_clipboard(handle(), clipboard.handle());
    }
    
    /**
     * Emits the “remove-tag” signal.
     * <p>
     * The default handler for the signal removes all occurrences
     * of {@code tag} from the given range. {@code start} and {@code end} don’t have
     * to be in order.
     */
    public void removeTag(TextTag tag, TextIter start, TextIter end) {
        gtk_h.gtk_text_buffer_remove_tag(handle(), tag.handle(), start.handle(), end.handle());
    }
    
    /**
     * Emits the “remove-tag” signal.
     * <p>
     * Calls {@link TextTagTable#lookup} on the buffer’s
     * tag table to get a {@code GtkTextTag}, then calls
     * {@link TextBuffer#removeTag}.
     */
    public void removeTagByName(java.lang.String name, TextIter start, TextIter end) {
        gtk_h.gtk_text_buffer_remove_tag_by_name(handle(), Interop.allocateNativeString(name).handle(), start.handle(), end.handle());
    }
    
    /**
     * This function moves the “insert” and “selection_bound” marks
     * simultaneously.
     * <p>
     * If you move them in two steps with
     * {@link TextBuffer#moveMark}, you will temporarily select a
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
     * <p>
     * Undoable actions in this context are changes to the text content of
     * the buffer. Changes to tags and marks are not tracked.
     * <p>
     * If enabled, the user will be able to undo the last number of actions
     * up to {@link TextBuffer#getMaxUndoLevels}.
     * <p>
     * See {@link TextBuffer#beginIrreversibleAction} and
     * {@link TextBuffer#endIrreversibleAction} to create
     * changes to the buffer that cannot be undone.
     */
    public void setEnableUndo(boolean enableUndo) {
        gtk_h.gtk_text_buffer_set_enable_undo(handle(), enableUndo ? 1 : 0);
    }
    
    /**
     * Sets the maximum number of undo levels to perform.
     * <p>
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
     * Whenever the buffer is saved to disk, call
     * {@code gtk_text_buffer_set_modified (@buffer, FALSE)}.
     * When the buffer is modified, it will automatically
     * toggled on the modified bit again. When the modified
     * bit flips, the buffer emits the
     * {@code Gtk.TextBuffer::modified-changed} signal.
     */
    public void setModified(boolean setting) {
        gtk_h.gtk_text_buffer_set_modified(handle(), setting ? 1 : 0);
    }
    
    /**
     * Deletes current contents of {@code buffer}, and inserts {@code text} instead.
     * <p>
     * If {@code len} is -1, {@code text} must be nul-terminated.
     * {@code text} must be valid UTF-8.
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
     * Emitted to apply a tag to a range of text in a {@code GtkTextBuffer}.
     * <p>
     * Applying actually occurs in the default handler.
     * <p>
     * Note that if your handler runs before the default handler
     * it must not invalidate the {@code start} and {@code end} iters (or has to
     * revalidate them).
     * <p>
     * See also:
     * {@link TextBuffer#applyTag},
     * {@link TextBuffer#insertWithTags},
     * {@link TextBuffer#insertRange}.
     */
    public SignalHandle onApplyTag(ApplyTagHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("apply-tag").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferApplyTag",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface BeginUserActionHandler {
        void signalReceived(TextBuffer source);
    }
    
    /**
     * Emitted at the beginning of a single user-visible
     * operation on a {@code GtkTextBuffer}.
     * <p>
     * See also:
     * {@link TextBuffer#beginUserAction},
     * {@link TextBuffer#insertInteractive},
     * {@link TextBuffer#insertRangeInteractive},
     * {@link TextBuffer#deleteInteractive},
     * {@link TextBuffer#backspace},
     * {@link TextBuffer#deleteSelection}.
     */
    public SignalHandle onBeginUserAction(BeginUserActionHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("begin-user-action").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferBeginUserAction",
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
    public interface ChangedHandler {
        void signalReceived(TextBuffer source);
    }
    
    /**
     * Emitted when the content of a {@code GtkTextBuffer} has changed.
     */
    public SignalHandle onChanged(ChangedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferChanged",
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
    public interface DeleteRangeHandler {
        void signalReceived(TextBuffer source, TextIter start, TextIter end);
    }
    
    /**
     * Emitted to delete a range from a {@code GtkTextBuffer}.
     * <p>
     * Note that if your handler runs before the default handler
     * it must not invalidate the {@code start} and {@code end} iters (or has
     * to revalidate them). The default signal handler revalidates
     * the {@code start} and {@code end} iters to both point to the location
     * where text was deleted. Handlers which run after the default
     * handler (see g_signal_connect_after()) do not have access to
     * the deleted text.
     * <p>
     * See also: {@link TextBuffer#delete}.
     */
    public SignalHandle onDeleteRange(DeleteRangeHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("delete-range").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferDeleteRange",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface EndUserActionHandler {
        void signalReceived(TextBuffer source);
    }
    
    /**
     * Emitted at the end of a single user-visible
     * operation on the {@code GtkTextBuffer}.
     * <p>
     * See also:
     * {@link TextBuffer#endUserAction},
     * {@link TextBuffer#insertInteractive},
     * {@link TextBuffer#insertRangeInteractive},
     * {@link TextBuffer#deleteInteractive},
     * {@link TextBuffer#backspace},
     * {@link TextBuffer#deleteSelection},
     * {@link TextBuffer#backspace}.
     */
    public SignalHandle onEndUserAction(EndUserActionHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("end-user-action").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferEndUserAction",
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
    public interface InsertChildAnchorHandler {
        void signalReceived(TextBuffer source, TextIter location, TextChildAnchor anchor);
    }
    
    /**
     * Emitted to insert a {@code GtkTextChildAnchor} in a {@code GtkTextBuffer}.
     * <p>
     * Insertion actually occurs in the default handler.
     * <p>
     * Note that if your handler runs before the default handler
     * it must not invalidate the {@code location} iter (or has to
     * revalidate it). The default signal handler revalidates
     * it to be placed after the inserted {@code anchor}.
     * <p>
     * See also: {@link TextBuffer#insertChildAnchor}.
     */
    public SignalHandle onInsertChildAnchor(InsertChildAnchorHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("insert-child-anchor").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferInsertChildAnchor",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface InsertPaintableHandler {
        void signalReceived(TextBuffer source, TextIter location, org.gtk.gdk.Paintable paintable);
    }
    
    /**
     * Emitted to insert a {@code GdkPaintable} in a {@code GtkTextBuffer}.
     * <p>
     * Insertion actually occurs in the default handler.
     * <p>
     * Note that if your handler runs before the default handler
     * it must not invalidate the {@code location} iter (or has to
     * revalidate it). The default signal handler revalidates
     * it to be placed after the inserted {@code paintable}.
     * <p>
     * See also: {@link TextBuffer#insertPaintable}.
     */
    public SignalHandle onInsertPaintable(InsertPaintableHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("insert-paintable").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferInsertPaintable",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface InsertTextHandler {
        void signalReceived(TextBuffer source, TextIter location, java.lang.String text, int len);
    }
    
    /**
     * Emitted to insert text in a {@code GtkTextBuffer}.
     * <p>
     * Insertion actually occurs in the default handler.
     * <p>
     * Note that if your handler runs before the default handler
     * it must not invalidate the {@code location} iter (or has to
     * revalidate it). The default signal handler revalidates
     * it to point to the end of the inserted text.
     * <p>
     * See also: {@link TextBuffer#insert},
     * {@link TextBuffer#insertRange}.
     */
    public SignalHandle onInsertText(InsertTextHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("insert-text").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferInsertText",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface MarkDeletedHandler {
        void signalReceived(TextBuffer source, TextMark mark);
    }
    
    /**
     * Emitted as notification after a {@code GtkTextMark} is deleted.
     * <p>
     * See also: {@link TextBuffer#deleteMark}.
     */
    public SignalHandle onMarkDeleted(MarkDeletedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("mark-deleted").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferMarkDeleted",
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
    public interface MarkSetHandler {
        void signalReceived(TextBuffer source, TextIter location, TextMark mark);
    }
    
    /**
     * Emitted as notification after a {@code GtkTextMark} is set.
     * <p>
     * See also:
     * {@link TextBuffer#createMark},
     * {@link TextBuffer#moveMark}.
     */
    public SignalHandle onMarkSet(MarkSetHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("mark-set").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferMarkSet",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface ModifiedChangedHandler {
        void signalReceived(TextBuffer source);
    }
    
    /**
     * Emitted when the modified bit of a {@code GtkTextBuffer} flips.
     * <p>
     * See also: {@link TextBuffer#setModified}.
     */
    public SignalHandle onModifiedChanged(ModifiedChangedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("modified-changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferModifiedChanged",
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
    public interface PasteDoneHandler {
        void signalReceived(TextBuffer source, org.gtk.gdk.Clipboard clipboard);
    }
    
    /**
     * Emitted after paste operation has been completed.
     * <p>
     * This is useful to properly scroll the view to the end
     * of the pasted text. See {@link TextBuffer#pasteClipboard}
     * for more details.
     */
    public SignalHandle onPasteDone(PasteDoneHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("paste-done").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferPasteDone",
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
    public interface RedoHandler {
        void signalReceived(TextBuffer source);
    }
    
    /**
     * Emitted when a request has been made to redo the
     * previously undone operation.
     */
    public SignalHandle onRedo(RedoHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("redo").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferRedo",
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
    public interface RemoveTagHandler {
        void signalReceived(TextBuffer source, TextTag tag, TextIter start, TextIter end);
    }
    
    /**
     * Emitted to remove all occurrences of {@code tag} from a range
     * of text in a {@code GtkTextBuffer}.
     * <p>
     * Removal actually occurs in the default handler.
     * <p>
     * Note that if your handler runs before the default handler
     * it must not invalidate the {@code start} and {@code end} iters (or has
     * to revalidate them).
     * <p>
     * See also: {@link TextBuffer#removeTag}.
     */
    public SignalHandle onRemoveTag(RemoveTagHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("remove-tag").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferRemoveTag",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
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
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("undo").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferUndo",
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
    
        public static void signalTextBufferApplyTag(MemoryAddress source, MemoryAddress tag, MemoryAddress start, MemoryAddress end, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextBuffer.ApplyTagHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextBuffer(Refcounted.get(source)), new TextTag(Refcounted.get(tag, false)), new TextIter(Refcounted.get(start, false)), new TextIter(Refcounted.get(end, false)));
        }
        
        public static void signalTextBufferBeginUserAction(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextBuffer.BeginUserActionHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextBuffer(Refcounted.get(source)));
        }
        
        public static void signalTextBufferChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextBuffer.ChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextBuffer(Refcounted.get(source)));
        }
        
        public static void signalTextBufferDeleteRange(MemoryAddress source, MemoryAddress start, MemoryAddress end, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextBuffer.DeleteRangeHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextBuffer(Refcounted.get(source)), new TextIter(Refcounted.get(start, false)), new TextIter(Refcounted.get(end, false)));
        }
        
        public static void signalTextBufferEndUserAction(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextBuffer.EndUserActionHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextBuffer(Refcounted.get(source)));
        }
        
        public static void signalTextBufferInsertChildAnchor(MemoryAddress source, MemoryAddress location, MemoryAddress anchor, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextBuffer.InsertChildAnchorHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextBuffer(Refcounted.get(source)), new TextIter(Refcounted.get(location, false)), new TextChildAnchor(Refcounted.get(anchor, false)));
        }
        
        public static void signalTextBufferInsertPaintable(MemoryAddress source, MemoryAddress location, MemoryAddress paintable, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextBuffer.InsertPaintableHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextBuffer(Refcounted.get(source)), new TextIter(Refcounted.get(location, false)), new org.gtk.gdk.Paintable.PaintableImpl(Refcounted.get(paintable, false)));
        }
        
        public static void signalTextBufferInsertText(MemoryAddress source, MemoryAddress location, MemoryAddress text, int len, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextBuffer.InsertTextHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextBuffer(Refcounted.get(source)), new TextIter(Refcounted.get(location, false)), text.getUtf8String(0), len);
        }
        
        public static void signalTextBufferMarkDeleted(MemoryAddress source, MemoryAddress mark, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextBuffer.MarkDeletedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextBuffer(Refcounted.get(source)), new TextMark(Refcounted.get(mark, false)));
        }
        
        public static void signalTextBufferMarkSet(MemoryAddress source, MemoryAddress location, MemoryAddress mark, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextBuffer.MarkSetHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextBuffer(Refcounted.get(source)), new TextIter(Refcounted.get(location, false)), new TextMark(Refcounted.get(mark, false)));
        }
        
        public static void signalTextBufferModifiedChanged(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextBuffer.ModifiedChangedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextBuffer(Refcounted.get(source)));
        }
        
        public static void signalTextBufferPasteDone(MemoryAddress source, MemoryAddress clipboard, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextBuffer.PasteDoneHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextBuffer(Refcounted.get(source)), new org.gtk.gdk.Clipboard(Refcounted.get(clipboard, false)));
        }
        
        public static void signalTextBufferRedo(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextBuffer.RedoHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextBuffer(Refcounted.get(source)));
        }
        
        public static void signalTextBufferRemoveTag(MemoryAddress source, MemoryAddress tag, MemoryAddress start, MemoryAddress end, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextBuffer.RemoveTagHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextBuffer(Refcounted.get(source)), new TextTag(Refcounted.get(tag, false)), new TextIter(Refcounted.get(start, false)), new TextIter(Refcounted.get(end, false)));
        }
        
        public static void signalTextBufferUndo(MemoryAddress source, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (TextBuffer.UndoHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new TextBuffer(Refcounted.get(source)));
        }
        
    }
}
