package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle gtk_text_buffer_new = Interop.downcallHandle(
        "gtk_text_buffer_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@Nullable TextTagTable table) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_text_buffer_new.invokeExact(table.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new text buffer.
     */
    public TextBuffer(@Nullable TextTagTable table) {
        super(constructNew(table));
    }
    
    private static final MethodHandle gtk_text_buffer_add_mark = Interop.downcallHandle(
        "gtk_text_buffer_add_mark",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void addMark(@NotNull TextMark mark, @NotNull TextIter where) {
        try {
            gtk_text_buffer_add_mark.invokeExact(handle(), mark.handle(), where.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_add_selection_clipboard = Interop.downcallHandle(
        "gtk_text_buffer_add_selection_clipboard",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds {@code clipboard} to the list of clipboards in which the selection
     * contents of {@code buffer} are available.
     * <p>
     * In most cases, {@code clipboard} will be the {@code GdkClipboard} returned by
     * {@link Widget#getPrimaryClipboard} for a view of {@code buffer}.
     */
    public @NotNull void addSelectionClipboard(@NotNull org.gtk.gdk.Clipboard clipboard) {
        try {
            gtk_text_buffer_add_selection_clipboard.invokeExact(handle(), clipboard.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_apply_tag = Interop.downcallHandle(
        "gtk_text_buffer_apply_tag",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Emits the “apply-tag” signal on {@code buffer}.
     * <p>
     * The default handler for the signal applies
     * {@code tag} to the given range. {@code start} and {@code end} do
     * not have to be in order.
     */
    public @NotNull void applyTag(@NotNull TextTag tag, @NotNull TextIter start, @NotNull TextIter end) {
        try {
            gtk_text_buffer_apply_tag.invokeExact(handle(), tag.handle(), start.handle(), end.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_apply_tag_by_name = Interop.downcallHandle(
        "gtk_text_buffer_apply_tag_by_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Emits the “apply-tag” signal on {@code buffer}.
     * <p>
     * Calls {@link TextTagTable#lookup} on the buffer’s
     * tag table to get a {@code GtkTextTag}, then calls
     * {@link TextBuffer#applyTag}.
     */
    public @NotNull void applyTagByName(@NotNull java.lang.String name, @NotNull TextIter start, @NotNull TextIter end) {
        try {
            gtk_text_buffer_apply_tag_by_name.invokeExact(handle(), Interop.allocateNativeString(name), start.handle(), end.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_backspace = Interop.downcallHandle(
        "gtk_text_buffer_backspace",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
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
    public boolean backspace(@NotNull TextIter iter, @NotNull boolean interactive, @NotNull boolean defaultEditable) {
        int RESULT;
        try {
            RESULT = (int) gtk_text_buffer_backspace.invokeExact(handle(), iter.handle(), interactive ? 1 : 0, defaultEditable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_text_buffer_begin_irreversible_action = Interop.downcallHandle(
        "gtk_text_buffer_begin_irreversible_action",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void beginIrreversibleAction() {
        try {
            gtk_text_buffer_begin_irreversible_action.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_begin_user_action = Interop.downcallHandle(
        "gtk_text_buffer_begin_user_action",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void beginUserAction() {
        try {
            gtk_text_buffer_begin_user_action.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_copy_clipboard = Interop.downcallHandle(
        "gtk_text_buffer_copy_clipboard",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies the currently-selected text to a clipboard.
     */
    public @NotNull void copyClipboard(@NotNull org.gtk.gdk.Clipboard clipboard) {
        try {
            gtk_text_buffer_copy_clipboard.invokeExact(handle(), clipboard.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_create_child_anchor = Interop.downcallHandle(
        "gtk_text_buffer_create_child_anchor",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull TextChildAnchor createChildAnchor(@NotNull TextIter iter) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_text_buffer_create_child_anchor.invokeExact(handle(), iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TextChildAnchor(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_text_buffer_create_mark = Interop.downcallHandle(
        "gtk_text_buffer_create_mark",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
    public @NotNull TextMark createMark(@Nullable java.lang.String markName, @NotNull TextIter where, @NotNull boolean leftGravity) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_text_buffer_create_mark.invokeExact(handle(), Interop.allocateNativeString(markName), where.handle(), leftGravity ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TextMark(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_text_buffer_cut_clipboard = Interop.downcallHandle(
        "gtk_text_buffer_cut_clipboard",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Copies the currently-selected text to a clipboard,
     * then deletes said text if it’s editable.
     */
    public @NotNull void cutClipboard(@NotNull org.gtk.gdk.Clipboard clipboard, @NotNull boolean defaultEditable) {
        try {
            gtk_text_buffer_cut_clipboard.invokeExact(handle(), clipboard.handle(), defaultEditable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_delete = Interop.downcallHandle(
        "gtk_text_buffer_delete",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void delete(@NotNull TextIter start, @NotNull TextIter end) {
        try {
            gtk_text_buffer_delete.invokeExact(handle(), start.handle(), end.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_delete_interactive = Interop.downcallHandle(
        "gtk_text_buffer_delete_interactive",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Deletes all editable text in the given range.
     * <p>
     * Calls {@link TextBuffer#delete} for each editable
     * sub-range of [{@code start},{@code end}). {@code start} and {@code end} are revalidated
     * to point to the location of the last deleted range, or left
     * untouched if no text was deleted.
     */
    public boolean deleteInteractive(@NotNull TextIter startIter, @NotNull TextIter endIter, @NotNull boolean defaultEditable) {
        int RESULT;
        try {
            RESULT = (int) gtk_text_buffer_delete_interactive.invokeExact(handle(), startIter.handle(), endIter.handle(), defaultEditable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_text_buffer_delete_mark = Interop.downcallHandle(
        "gtk_text_buffer_delete_mark",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void deleteMark(@NotNull TextMark mark) {
        try {
            gtk_text_buffer_delete_mark.invokeExact(handle(), mark.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_delete_mark_by_name = Interop.downcallHandle(
        "gtk_text_buffer_delete_mark_by_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Deletes the mark named {@code name}; the mark must exist.
     * <p>
     * See {@link TextBuffer#deleteMark} for details.
     */
    public @NotNull void deleteMarkByName(@NotNull java.lang.String name) {
        try {
            gtk_text_buffer_delete_mark_by_name.invokeExact(handle(), Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_delete_selection = Interop.downcallHandle(
        "gtk_text_buffer_delete_selection",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Deletes the range between the “insert” and “selection_bound” marks,
     * that is, the currently-selected text.
     * <p>
     * If {@code interactive} is {@code true}, the editability of the selection will be
     * considered (users can’t delete uneditable text).
     */
    public boolean deleteSelection(@NotNull boolean interactive, @NotNull boolean defaultEditable) {
        int RESULT;
        try {
            RESULT = (int) gtk_text_buffer_delete_selection.invokeExact(handle(), interactive ? 1 : 0, defaultEditable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_text_buffer_end_irreversible_action = Interop.downcallHandle(
        "gtk_text_buffer_end_irreversible_action",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void endIrreversibleAction() {
        try {
            gtk_text_buffer_end_irreversible_action.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_end_user_action = Interop.downcallHandle(
        "gtk_text_buffer_end_user_action",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Ends a user-visible operation.
     * <p>
     * Should be paired with a call to
     * {@link TextBuffer#beginUserAction}.
     * See that function for a full explanation.
     */
    public @NotNull void endUserAction() {
        try {
            gtk_text_buffer_end_user_action.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_get_bounds = Interop.downcallHandle(
        "gtk_text_buffer_get_bounds",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Retrieves the first and last iterators in the buffer, i.e. the
     * entire buffer lies within the range [{@code start},{@code end}).
     */
    public @NotNull void getBounds(@NotNull Out<TextIter> start, @NotNull Out<TextIter> end) {
        MemorySegment startPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment endPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            gtk_text_buffer_get_bounds.invokeExact(handle(), (Addressable) startPOINTER.address(), (Addressable) endPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        start.set(new TextIter(Refcounted.get(startPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        end.set(new TextIter(Refcounted.get(endPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle gtk_text_buffer_get_can_redo = Interop.downcallHandle(
        "gtk_text_buffer_get_can_redo",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether there is a redoable action in the history.
     */
    public boolean getCanRedo() {
        int RESULT;
        try {
            RESULT = (int) gtk_text_buffer_get_can_redo.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_text_buffer_get_can_undo = Interop.downcallHandle(
        "gtk_text_buffer_get_can_undo",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether there is an undoable action in the history.
     */
    public boolean getCanUndo() {
        int RESULT;
        try {
            RESULT = (int) gtk_text_buffer_get_can_undo.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_text_buffer_get_char_count = Interop.downcallHandle(
        "gtk_text_buffer_get_char_count",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
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
        int RESULT;
        try {
            RESULT = (int) gtk_text_buffer_get_char_count.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_text_buffer_get_enable_undo = Interop.downcallHandle(
        "gtk_text_buffer_get_enable_undo",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets whether the buffer is saving modifications to the buffer
     * to allow for undo and redo actions.
     * <p>
     * See {@link TextBuffer#beginIrreversibleAction} and
     * {@link TextBuffer#endIrreversibleAction} to create
     * changes to the buffer that cannot be undone.
     */
    public boolean getEnableUndo() {
        int RESULT;
        try {
            RESULT = (int) gtk_text_buffer_get_enable_undo.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_text_buffer_get_end_iter = Interop.downcallHandle(
        "gtk_text_buffer_get_end_iter",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void getEndIter(@NotNull Out<TextIter> iter) {
        MemorySegment iterPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            gtk_text_buffer_get_end_iter.invokeExact(handle(), (Addressable) iterPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        iter.set(new TextIter(Refcounted.get(iterPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle gtk_text_buffer_get_has_selection = Interop.downcallHandle(
        "gtk_text_buffer_get_has_selection",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Indicates whether the buffer has some text currently selected.
     */
    public boolean getHasSelection() {
        int RESULT;
        try {
            RESULT = (int) gtk_text_buffer_get_has_selection.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_text_buffer_get_insert = Interop.downcallHandle(
        "gtk_text_buffer_get_insert",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the mark that represents the cursor (insertion point).
     * <p>
     * Equivalent to calling {@link TextBuffer#getMark}
     * to get the mark named “insert”, but very slightly more
     * efficient, and involves less typing.
     */
    public @NotNull TextMark getInsert() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_text_buffer_get_insert.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TextMark(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_text_buffer_get_iter_at_child_anchor = Interop.downcallHandle(
        "gtk_text_buffer_get_iter_at_child_anchor",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains the location of {@code anchor} within {@code buffer}.
     */
    public @NotNull void getIterAtChildAnchor(@NotNull Out<TextIter> iter, @NotNull TextChildAnchor anchor) {
        MemorySegment iterPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            gtk_text_buffer_get_iter_at_child_anchor.invokeExact(handle(), (Addressable) iterPOINTER.address(), anchor.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        iter.set(new TextIter(Refcounted.get(iterPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle gtk_text_buffer_get_iter_at_line = Interop.downcallHandle(
        "gtk_text_buffer_get_iter_at_line",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Initializes {@code iter} to the start of the given line.
     * <p>
     * If {@code line_number} is greater than or equal to the number of lines
     * in the {@code buffer}, the end iterator is returned.
     */
    public boolean getIterAtLine(@NotNull Out<TextIter> iter, @NotNull int lineNumber) {
        MemorySegment iterPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) gtk_text_buffer_get_iter_at_line.invokeExact(handle(), (Addressable) iterPOINTER.address(), lineNumber);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        iter.set(new TextIter(Refcounted.get(iterPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_text_buffer_get_iter_at_line_index = Interop.downcallHandle(
        "gtk_text_buffer_get_iter_at_line_index",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
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
    public boolean getIterAtLineIndex(@NotNull Out<TextIter> iter, @NotNull int lineNumber, @NotNull int byteIndex) {
        MemorySegment iterPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) gtk_text_buffer_get_iter_at_line_index.invokeExact(handle(), (Addressable) iterPOINTER.address(), lineNumber, byteIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        iter.set(new TextIter(Refcounted.get(iterPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_text_buffer_get_iter_at_line_offset = Interop.downcallHandle(
        "gtk_text_buffer_get_iter_at_line_offset",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
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
    public boolean getIterAtLineOffset(@NotNull Out<TextIter> iter, @NotNull int lineNumber, @NotNull int charOffset) {
        MemorySegment iterPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) gtk_text_buffer_get_iter_at_line_offset.invokeExact(handle(), (Addressable) iterPOINTER.address(), lineNumber, charOffset);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        iter.set(new TextIter(Refcounted.get(iterPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_text_buffer_get_iter_at_mark = Interop.downcallHandle(
        "gtk_text_buffer_get_iter_at_mark",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes {@code iter} with the current position of {@code mark}.
     */
    public @NotNull void getIterAtMark(@NotNull Out<TextIter> iter, @NotNull TextMark mark) {
        MemorySegment iterPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            gtk_text_buffer_get_iter_at_mark.invokeExact(handle(), (Addressable) iterPOINTER.address(), mark.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        iter.set(new TextIter(Refcounted.get(iterPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle gtk_text_buffer_get_iter_at_offset = Interop.downcallHandle(
        "gtk_text_buffer_get_iter_at_offset",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Initializes {@code iter} to a position {@code char_offset} chars from the start
     * of the entire buffer.
     * <p>
     * If {@code char_offset} is -1 or greater than the number
     * of characters in the buffer, {@code iter} is initialized to the end iterator,
     * the iterator one past the last valid character in the buffer.
     */
    public @NotNull void getIterAtOffset(@NotNull Out<TextIter> iter, @NotNull int charOffset) {
        MemorySegment iterPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            gtk_text_buffer_get_iter_at_offset.invokeExact(handle(), (Addressable) iterPOINTER.address(), charOffset);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        iter.set(new TextIter(Refcounted.get(iterPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle gtk_text_buffer_get_line_count = Interop.downcallHandle(
        "gtk_text_buffer_get_line_count",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Obtains the number of lines in the buffer.
     * <p>
     * This value is cached, so the function is very fast.
     */
    public int getLineCount() {
        int RESULT;
        try {
            RESULT = (int) gtk_text_buffer_get_line_count.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_text_buffer_get_mark = Interop.downcallHandle(
        "gtk_text_buffer_get_mark",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the mark named {@code name} in buffer {@code buffer}, or {@code null} if no such
     * mark exists in the buffer.
     */
    public @Nullable TextMark getMark(@NotNull java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_text_buffer_get_mark.invokeExact(handle(), Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TextMark(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_text_buffer_get_max_undo_levels = Interop.downcallHandle(
        "gtk_text_buffer_get_max_undo_levels",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the maximum number of undo levels to perform.
     * <p>
     * If 0, unlimited undo actions may be performed. Note that this may
     * have a memory usage impact as it requires storing an additional
     * copy of the inserted or removed text within the text buffer.
     */
    public int getMaxUndoLevels() {
        int RESULT;
        try {
            RESULT = (int) gtk_text_buffer_get_max_undo_levels.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle gtk_text_buffer_get_modified = Interop.downcallHandle(
        "gtk_text_buffer_get_modified",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Indicates whether the buffer has been modified since the last call
     * to {@link TextBuffer#setModified} set the modification flag to
     * {@code false}.
     * <p>
     * Used for example to enable a “save” function in a text editor.
     */
    public boolean getModified() {
        int RESULT;
        try {
            RESULT = (int) gtk_text_buffer_get_modified.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_text_buffer_get_selection_bound = Interop.downcallHandle(
        "gtk_text_buffer_get_selection_bound",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull TextMark getSelectionBound() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_text_buffer_get_selection_bound.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TextMark(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_text_buffer_get_selection_bounds = Interop.downcallHandle(
        "gtk_text_buffer_get_selection_bounds",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns {@code true} if some text is selected; places the bounds
     * of the selection in {@code start} and {@code end}.
     * <p>
     * If the selection has length 0, then {@code start} and {@code end} are filled
     * in with the same value. {@code start} and {@code end} will be in ascending order.
     * If {@code start} and {@code end} are {@code null}, then they are not filled in, but the
     * return value still indicates whether text is selected.
     */
    public boolean getSelectionBounds(@NotNull Out<TextIter> start, @NotNull Out<TextIter> end) {
        MemorySegment startPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        MemorySegment endPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) gtk_text_buffer_get_selection_bounds.invokeExact(handle(), (Addressable) startPOINTER.address(), (Addressable) endPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        start.set(new TextIter(Refcounted.get(startPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        end.set(new TextIter(Refcounted.get(endPOINTER.get(ValueLayout.ADDRESS, 0), false)));
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_text_buffer_get_selection_content = Interop.downcallHandle(
        "gtk_text_buffer_get_selection_content",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get a content provider for this buffer.
     * <p>
     * It can be used to make the content of {@code buffer} available
     * in a {@code GdkClipboard}, see {@link org.gtk.gdk.Clipboard#setContent}.
     */
    public @NotNull org.gtk.gdk.ContentProvider getSelectionContent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_text_buffer_get_selection_content.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ContentProvider(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gtk_text_buffer_get_slice = Interop.downcallHandle(
        "gtk_text_buffer_get_slice",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
    public @NotNull java.lang.String getSlice(@NotNull TextIter start, @NotNull TextIter end, @NotNull boolean includeHiddenChars) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_text_buffer_get_slice.invokeExact(handle(), start.handle(), end.handle(), includeHiddenChars ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_text_buffer_get_start_iter = Interop.downcallHandle(
        "gtk_text_buffer_get_start_iter",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initialized {@code iter} with the first position in the text buffer.
     * <p>
     * This is the same as using {@link TextBuffer#getIterAtOffset}
     * to get the iter at character offset 0.
     */
    public @NotNull void getStartIter(@NotNull Out<TextIter> iter) {
        MemorySegment iterPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            gtk_text_buffer_get_start_iter.invokeExact(handle(), (Addressable) iterPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        iter.set(new TextIter(Refcounted.get(iterPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle gtk_text_buffer_get_tag_table = Interop.downcallHandle(
        "gtk_text_buffer_get_tag_table",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the {@code GtkTextTagTable} associated with this buffer.
     */
    public @NotNull TextTagTable getTagTable() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_text_buffer_get_tag_table.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TextTagTable(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle gtk_text_buffer_get_text = Interop.downcallHandle(
        "gtk_text_buffer_get_text",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
    public @NotNull java.lang.String getText(@NotNull TextIter start, @NotNull TextIter end, @NotNull boolean includeHiddenChars) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_text_buffer_get_text.invokeExact(handle(), start.handle(), end.handle(), includeHiddenChars ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle gtk_text_buffer_insert = Interop.downcallHandle(
        "gtk_text_buffer_insert",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
    public @NotNull void insert(@NotNull TextIter iter, @NotNull java.lang.String text, @NotNull int len) {
        try {
            gtk_text_buffer_insert.invokeExact(handle(), iter.handle(), Interop.allocateNativeString(text), len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_insert_at_cursor = Interop.downcallHandle(
        "gtk_text_buffer_insert_at_cursor",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Inserts {@code text} in {@code buffer}.
     * <p>
     * Simply calls {@link TextBuffer#insert},
     * using the current cursor position as the insertion point.
     */
    public @NotNull void insertAtCursor(@NotNull java.lang.String text, @NotNull int len) {
        try {
            gtk_text_buffer_insert_at_cursor.invokeExact(handle(), Interop.allocateNativeString(text), len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_insert_child_anchor = Interop.downcallHandle(
        "gtk_text_buffer_insert_child_anchor",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void insertChildAnchor(@NotNull TextIter iter, @NotNull TextChildAnchor anchor) {
        try {
            gtk_text_buffer_insert_child_anchor.invokeExact(handle(), iter.handle(), anchor.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_insert_interactive = Interop.downcallHandle(
        "gtk_text_buffer_insert_interactive",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
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
    public boolean insertInteractive(@NotNull TextIter iter, @NotNull java.lang.String text, @NotNull int len, @NotNull boolean defaultEditable) {
        int RESULT;
        try {
            RESULT = (int) gtk_text_buffer_insert_interactive.invokeExact(handle(), iter.handle(), Interop.allocateNativeString(text), len, defaultEditable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_text_buffer_insert_interactive_at_cursor = Interop.downcallHandle(
        "gtk_text_buffer_insert_interactive_at_cursor",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
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
    public boolean insertInteractiveAtCursor(@NotNull java.lang.String text, @NotNull int len, @NotNull boolean defaultEditable) {
        int RESULT;
        try {
            RESULT = (int) gtk_text_buffer_insert_interactive_at_cursor.invokeExact(handle(), Interop.allocateNativeString(text), len, defaultEditable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_text_buffer_insert_markup = Interop.downcallHandle(
        "gtk_text_buffer_insert_markup",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Inserts the text in {@code markup} at position {@code iter}.
     * <p>
     * {@code markup} will be inserted in its entirety and must be nul-terminated
     * and valid UTF-8. Emits the {@code Gtk.TextBuffer::insert-text} signal,
     * possibly multiple times; insertion actually occurs in the default handler
     * for the signal. {@code iter} will point to the end of the inserted text on return.
     */
    public @NotNull void insertMarkup(@NotNull TextIter iter, @NotNull java.lang.String markup, @NotNull int len) {
        try {
            gtk_text_buffer_insert_markup.invokeExact(handle(), iter.handle(), Interop.allocateNativeString(markup), len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_insert_paintable = Interop.downcallHandle(
        "gtk_text_buffer_insert_paintable",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void insertPaintable(@NotNull TextIter iter, @NotNull org.gtk.gdk.Paintable paintable) {
        try {
            gtk_text_buffer_insert_paintable.invokeExact(handle(), iter.handle(), paintable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_insert_range = Interop.downcallHandle(
        "gtk_text_buffer_insert_range",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void insertRange(@NotNull TextIter iter, @NotNull TextIter start, @NotNull TextIter end) {
        try {
            gtk_text_buffer_insert_range.invokeExact(handle(), iter.handle(), start.handle(), end.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_insert_range_interactive = Interop.downcallHandle(
        "gtk_text_buffer_insert_range_interactive",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
    public boolean insertRangeInteractive(@NotNull TextIter iter, @NotNull TextIter start, @NotNull TextIter end, @NotNull boolean defaultEditable) {
        int RESULT;
        try {
            RESULT = (int) gtk_text_buffer_insert_range_interactive.invokeExact(handle(), iter.handle(), start.handle(), end.handle(), defaultEditable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_text_buffer_move_mark = Interop.downcallHandle(
        "gtk_text_buffer_move_mark",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Moves {@code mark} to the new location {@code where}.
     * <p>
     * Emits the {@code Gtk.TextBuffer::mark-set} signal
     * as notification of the move.
     */
    public @NotNull void moveMark(@NotNull TextMark mark, @NotNull TextIter where) {
        try {
            gtk_text_buffer_move_mark.invokeExact(handle(), mark.handle(), where.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_move_mark_by_name = Interop.downcallHandle(
        "gtk_text_buffer_move_mark_by_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Moves the mark named {@code name} (which must exist) to location {@code where}.
     * <p>
     * See {@link TextBuffer#moveMark} for details.
     */
    public @NotNull void moveMarkByName(@NotNull java.lang.String name, @NotNull TextIter where) {
        try {
            gtk_text_buffer_move_mark_by_name.invokeExact(handle(), Interop.allocateNativeString(name), where.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_paste_clipboard = Interop.downcallHandle(
        "gtk_text_buffer_paste_clipboard",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
    public @NotNull void pasteClipboard(@NotNull org.gtk.gdk.Clipboard clipboard, @Nullable TextIter overrideLocation, @NotNull boolean defaultEditable) {
        try {
            gtk_text_buffer_paste_clipboard.invokeExact(handle(), clipboard.handle(), overrideLocation.handle(), defaultEditable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_place_cursor = Interop.downcallHandle(
        "gtk_text_buffer_place_cursor",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void placeCursor(@NotNull TextIter where) {
        try {
            gtk_text_buffer_place_cursor.invokeExact(handle(), where.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_redo = Interop.downcallHandle(
        "gtk_text_buffer_redo",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Redoes the next redoable action on the buffer, if there is one.
     */
    public @NotNull void redo() {
        try {
            gtk_text_buffer_redo.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_remove_all_tags = Interop.downcallHandle(
        "gtk_text_buffer_remove_all_tags",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes all tags in the range between {@code start} and {@code end}.
     * <p>
     * Be careful with this function; it could remove tags added in code
     * unrelated to the code you’re currently writing. That is, using this
     * function is probably a bad idea if you have two or more unrelated
     * code sections that add tags.
     */
    public @NotNull void removeAllTags(@NotNull TextIter start, @NotNull TextIter end) {
        try {
            gtk_text_buffer_remove_all_tags.invokeExact(handle(), start.handle(), end.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_remove_selection_clipboard = Interop.downcallHandle(
        "gtk_text_buffer_remove_selection_clipboard",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a {@code GdkClipboard} added with
     * gtk_text_buffer_add_selection_clipboard().
     */
    public @NotNull void removeSelectionClipboard(@NotNull org.gtk.gdk.Clipboard clipboard) {
        try {
            gtk_text_buffer_remove_selection_clipboard.invokeExact(handle(), clipboard.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_remove_tag = Interop.downcallHandle(
        "gtk_text_buffer_remove_tag",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Emits the “remove-tag” signal.
     * <p>
     * The default handler for the signal removes all occurrences
     * of {@code tag} from the given range. {@code start} and {@code end} don’t have
     * to be in order.
     */
    public @NotNull void removeTag(@NotNull TextTag tag, @NotNull TextIter start, @NotNull TextIter end) {
        try {
            gtk_text_buffer_remove_tag.invokeExact(handle(), tag.handle(), start.handle(), end.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_remove_tag_by_name = Interop.downcallHandle(
        "gtk_text_buffer_remove_tag_by_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Emits the “remove-tag” signal.
     * <p>
     * Calls {@link TextTagTable#lookup} on the buffer’s
     * tag table to get a {@code GtkTextTag}, then calls
     * {@link TextBuffer#removeTag}.
     */
    public @NotNull void removeTagByName(@NotNull java.lang.String name, @NotNull TextIter start, @NotNull TextIter end) {
        try {
            gtk_text_buffer_remove_tag_by_name.invokeExact(handle(), Interop.allocateNativeString(name), start.handle(), end.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_select_range = Interop.downcallHandle(
        "gtk_text_buffer_select_range",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void selectRange(@NotNull TextIter ins, @NotNull TextIter bound) {
        try {
            gtk_text_buffer_select_range.invokeExact(handle(), ins.handle(), bound.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_set_enable_undo = Interop.downcallHandle(
        "gtk_text_buffer_set_enable_undo",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
    public @NotNull void setEnableUndo(@NotNull boolean enableUndo) {
        try {
            gtk_text_buffer_set_enable_undo.invokeExact(handle(), enableUndo ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_set_max_undo_levels = Interop.downcallHandle(
        "gtk_text_buffer_set_max_undo_levels",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Sets the maximum number of undo levels to perform.
     * <p>
     * If 0, unlimited undo actions may be performed. Note that this may
     * have a memory usage impact as it requires storing an additional
     * copy of the inserted or removed text within the text buffer.
     */
    public @NotNull void setMaxUndoLevels(@NotNull int maxUndoLevels) {
        try {
            gtk_text_buffer_set_max_undo_levels.invokeExact(handle(), maxUndoLevels);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_set_modified = Interop.downcallHandle(
        "gtk_text_buffer_set_modified",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
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
    public @NotNull void setModified(@NotNull boolean setting) {
        try {
            gtk_text_buffer_set_modified.invokeExact(handle(), setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_set_text = Interop.downcallHandle(
        "gtk_text_buffer_set_text",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Deletes current contents of {@code buffer}, and inserts {@code text} instead.
     * <p>
     * If {@code len} is -1, {@code text} must be nul-terminated.
     * {@code text} must be valid UTF-8.
     */
    public @NotNull void setText(@NotNull java.lang.String text, @NotNull int len) {
        try {
            gtk_text_buffer_set_text.invokeExact(handle(), Interop.allocateNativeString(text), len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_text_buffer_undo = Interop.downcallHandle(
        "gtk_text_buffer_undo",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Undoes the last undoable action on the buffer, if there is one.
     */
    public @NotNull void undo() {
        try {
            gtk_text_buffer_undo.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ApplyTagHandler {
        void signalReceived(TextBuffer source, @NotNull TextTag tag, @NotNull TextIter start, @NotNull TextIter end);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("apply-tag"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferApplyTag",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("begin-user-action"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferBeginUserAction",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DeleteRangeHandler {
        void signalReceived(TextBuffer source, @NotNull TextIter start, @NotNull TextIter end);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("delete-range"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferDeleteRange",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("end-user-action"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferEndUserAction",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InsertChildAnchorHandler {
        void signalReceived(TextBuffer source, @NotNull TextIter location, @NotNull TextChildAnchor anchor);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("insert-child-anchor"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferInsertChildAnchor",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InsertPaintableHandler {
        void signalReceived(TextBuffer source, @NotNull TextIter location, @NotNull org.gtk.gdk.Paintable paintable);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("insert-paintable"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferInsertPaintable",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InsertTextHandler {
        void signalReceived(TextBuffer source, @NotNull TextIter location, @NotNull java.lang.String text, @NotNull int len);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("insert-text"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferInsertText",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MarkDeletedHandler {
        void signalReceived(TextBuffer source, @NotNull TextMark mark);
    }
    
    /**
     * Emitted as notification after a {@code GtkTextMark} is deleted.
     * <p>
     * See also: {@link TextBuffer#deleteMark}.
     */
    public SignalHandle onMarkDeleted(MarkDeletedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("mark-deleted"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferMarkDeleted",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MarkSetHandler {
        void signalReceived(TextBuffer source, @NotNull TextIter location, @NotNull TextMark mark);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("mark-set"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferMarkSet",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("modified-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferModifiedChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PasteDoneHandler {
        void signalReceived(TextBuffer source, @NotNull org.gtk.gdk.Clipboard clipboard);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("paste-done"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferPasteDone",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("redo"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferRedo",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RemoveTagHandler {
        void signalReceived(TextBuffer source, @NotNull TextTag tag, @NotNull TextIter start, @NotNull TextIter end);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("remove-tag"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferRemoveTag",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("undo"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferUndo",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
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
