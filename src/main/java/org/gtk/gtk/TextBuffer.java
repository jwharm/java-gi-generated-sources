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
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTextBuffer";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
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
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a TextBuffer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TextBuffer(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to TextBuffer if its GType is a (or inherits from) "GtkTextBuffer".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TextBuffer} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkTextBuffer", a ClassCastException will be thrown.
     */
    public static TextBuffer castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkTextBuffer"))) {
            return new TextBuffer(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkTextBuffer");
        }
    }
    
    private static Addressable constructNew(@Nullable org.gtk.gtk.TextTagTable table) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_buffer_new.invokeExact(
                    (Addressable) (table == null ? MemoryAddress.NULL : table.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new text buffer.
     * @param table a tag table, or {@code null} to create a new one
     */
    public TextBuffer(@Nullable org.gtk.gtk.TextTagTable table) {
        super(constructNew(table), Ownership.FULL);
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
     * @param mark the mark to add
     * @param where location to place mark
     */
    public void addMark(@NotNull org.gtk.gtk.TextMark mark, @NotNull org.gtk.gtk.TextIter where) {
        java.util.Objects.requireNonNull(mark, "Parameter 'mark' must not be null");
        java.util.Objects.requireNonNull(where, "Parameter 'where' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_add_mark.invokeExact(
                    handle(),
                    mark.handle(),
                    where.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds {@code clipboard} to the list of clipboards in which the selection
     * contents of {@code buffer} are available.
     * <p>
     * In most cases, {@code clipboard} will be the {@code GdkClipboard} returned by
     * {@link Widget#getPrimaryClipboard} for a view of {@code buffer}.
     * @param clipboard a {@code GdkClipboard}
     */
    public void addSelectionClipboard(@NotNull org.gtk.gdk.Clipboard clipboard) {
        java.util.Objects.requireNonNull(clipboard, "Parameter 'clipboard' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_add_selection_clipboard.invokeExact(
                    handle(),
                    clipboard.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Emits the “apply-tag” signal on {@code buffer}.
     * <p>
     * The default handler for the signal applies
     * {@code tag} to the given range. {@code start} and {@code end} do
     * not have to be in order.
     * @param tag a {@code GtkTextTag}
     * @param start one bound of range to be tagged
     * @param end other bound of range to be tagged
     */
    public void applyTag(@NotNull org.gtk.gtk.TextTag tag, @NotNull org.gtk.gtk.TextIter start, @NotNull org.gtk.gtk.TextIter end) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        java.util.Objects.requireNonNull(start, "Parameter 'start' must not be null");
        java.util.Objects.requireNonNull(end, "Parameter 'end' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_apply_tag.invokeExact(
                    handle(),
                    tag.handle(),
                    start.handle(),
                    end.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Emits the “apply-tag” signal on {@code buffer}.
     * <p>
     * Calls {@link TextTagTable#lookup} on the buffer’s
     * tag table to get a {@code GtkTextTag}, then calls
     * {@link TextBuffer#applyTag}.
     * @param name name of a named {@code GtkTextTag}
     * @param start one bound of range to be tagged
     * @param end other bound of range to be tagged
     */
    public void applyTagByName(@NotNull java.lang.String name, @NotNull org.gtk.gtk.TextIter start, @NotNull org.gtk.gtk.TextIter end) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(start, "Parameter 'start' must not be null");
        java.util.Objects.requireNonNull(end, "Parameter 'end' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_apply_tag_by_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    start.handle(),
                    end.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param iter a position in {@code buffer}
     * @param interactive whether the deletion is caused by user interaction
     * @param defaultEditable whether the buffer is editable by default
     * @return {@code true} if the buffer was modified
     */
    public boolean backspace(@NotNull org.gtk.gtk.TextIter iter, boolean interactive, boolean defaultEditable) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_buffer_backspace.invokeExact(
                    handle(),
                    iter.handle(),
                    interactive ? 1 : 0,
                    defaultEditable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
        try {
            DowncallHandles.gtk_text_buffer_begin_irreversible_action.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
        try {
            DowncallHandles.gtk_text_buffer_begin_user_action.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Copies the currently-selected text to a clipboard.
     * @param clipboard the {@code GdkClipboard} object to copy to
     */
    public void copyClipboard(@NotNull org.gtk.gdk.Clipboard clipboard) {
        java.util.Objects.requireNonNull(clipboard, "Parameter 'clipboard' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_copy_clipboard.invokeExact(
                    handle(),
                    clipboard.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param iter location in the buffer
     * @return the created child anchor
     */
    public @NotNull org.gtk.gtk.TextChildAnchor createChildAnchor(@NotNull org.gtk.gtk.TextIter iter) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_buffer_create_child_anchor.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.TextChildAnchor(RESULT, Ownership.NONE);
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
     * @param markName name for mark
     * @param where location to place mark
     * @param leftGravity whether the mark has left gravity
     * @return the new {@code GtkTextMark} object
     */
    public @NotNull org.gtk.gtk.TextMark createMark(@Nullable java.lang.String markName, @NotNull org.gtk.gtk.TextIter where, boolean leftGravity) {
        java.util.Objects.requireNonNull(where, "Parameter 'where' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_buffer_create_mark.invokeExact(
                    handle(),
                    (Addressable) (markName == null ? MemoryAddress.NULL : Interop.allocateNativeString(markName)),
                    where.handle(),
                    leftGravity ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.TextMark(RESULT, Ownership.NONE);
    }
    
    /**
     * Creates a tag and adds it to the tag table for {@code buffer}.
     * <p>
     * Equivalent to calling {@link TextTag#TextTag} and then adding the
     * tag to the buffer’s tag table. The returned tag is owned by
     * the buffer’s tag table, so the ref count will be equal to one.
     * <p>
     * If {@code tag_name} is {@code null}, the tag is anonymous.
     * <p>
     * If {@code tag_name} is non-{@code null}, a tag called {@code tag_name} must not already
     * exist in the tag table for this buffer.
     * <p>
     * The {@code first_property_name} argument and subsequent arguments are a list
     * of properties to set on the tag, as with g_object_set().
     * @param tagName name of the new tag
     * @param firstPropertyName name of first property to set
     * @param varargs {@code null}-terminated list of property names and values
     * @return a new tag
     */
    public @NotNull org.gtk.gtk.TextTag createTag(@Nullable java.lang.String tagName, @Nullable java.lang.String firstPropertyName, java.lang.Object... varargs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_buffer_create_tag.invokeExact(
                    handle(),
                    (Addressable) (tagName == null ? MemoryAddress.NULL : Interop.allocateNativeString(tagName)),
                    (Addressable) (firstPropertyName == null ? MemoryAddress.NULL : Interop.allocateNativeString(firstPropertyName)),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.TextTag(RESULT, Ownership.NONE);
    }
    
    /**
     * Copies the currently-selected text to a clipboard,
     * then deletes said text if it’s editable.
     * @param clipboard the {@code GdkClipboard} object to cut to
     * @param defaultEditable default editability of the buffer
     */
    public void cutClipboard(@NotNull org.gtk.gdk.Clipboard clipboard, boolean defaultEditable) {
        java.util.Objects.requireNonNull(clipboard, "Parameter 'clipboard' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_cut_clipboard.invokeExact(
                    handle(),
                    clipboard.handle(),
                    defaultEditable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param start a position in {@code buffer}
     * @param end another position in {@code buffer}
     */
    public void delete(@NotNull org.gtk.gtk.TextIter start, @NotNull org.gtk.gtk.TextIter end) {
        java.util.Objects.requireNonNull(start, "Parameter 'start' must not be null");
        java.util.Objects.requireNonNull(end, "Parameter 'end' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_delete.invokeExact(
                    handle(),
                    start.handle(),
                    end.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Deletes all editable text in the given range.
     * <p>
     * Calls {@link TextBuffer#delete} for each editable
     * sub-range of [{@code start},{@code end}). {@code start} and {@code end} are revalidated
     * to point to the location of the last deleted range, or left
     * untouched if no text was deleted.
     * @param startIter start of range to delete
     * @param endIter end of range
     * @param defaultEditable whether the buffer is editable by default
     * @return whether some text was actually deleted
     */
    public boolean deleteInteractive(@NotNull org.gtk.gtk.TextIter startIter, @NotNull org.gtk.gtk.TextIter endIter, boolean defaultEditable) {
        java.util.Objects.requireNonNull(startIter, "Parameter 'startIter' must not be null");
        java.util.Objects.requireNonNull(endIter, "Parameter 'endIter' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_buffer_delete_interactive.invokeExact(
                    handle(),
                    startIter.handle(),
                    endIter.handle(),
                    defaultEditable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * {@link TextBuffer#addMark}. Use {@link TextMark#getDeleted}
     * to find out if a mark has been removed from its buffer.
     * <p>
     * The {@code Gtk.TextBuffer::mark-deleted} signal will be emitted as
     * notification after the mark is deleted.
     * @param mark a {@code GtkTextMark} in {@code buffer}
     */
    public void deleteMark(@NotNull org.gtk.gtk.TextMark mark) {
        java.util.Objects.requireNonNull(mark, "Parameter 'mark' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_delete_mark.invokeExact(
                    handle(),
                    mark.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Deletes the mark named {@code name}; the mark must exist.
     * <p>
     * See {@link TextBuffer#deleteMark} for details.
     * @param name name of a mark in {@code buffer}
     */
    public void deleteMarkByName(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_delete_mark_by_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Deletes the range between the “insert” and “selection_bound” marks,
     * that is, the currently-selected text.
     * <p>
     * If {@code interactive} is {@code true}, the editability of the selection will be
     * considered (users can’t delete uneditable text).
     * @param interactive whether the deletion is caused by user interaction
     * @param defaultEditable whether the buffer is editable by default
     * @return whether there was a non-empty selection to delete
     */
    public boolean deleteSelection(boolean interactive, boolean defaultEditable) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_buffer_delete_selection.invokeExact(
                    handle(),
                    interactive ? 1 : 0,
                    defaultEditable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
        try {
            DowncallHandles.gtk_text_buffer_end_irreversible_action.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Ends a user-visible operation.
     * <p>
     * Should be paired with a call to
     * {@link TextBuffer#beginUserAction}.
     * See that function for a full explanation.
     */
    public void endUserAction() {
        try {
            DowncallHandles.gtk_text_buffer_end_user_action.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Retrieves the first and last iterators in the buffer, i.e. the
     * entire buffer lies within the range [{@code start},{@code end}).
     * @param start iterator to initialize with first position in the buffer
     * @param end iterator to initialize with the end iterator
     */
    public void getBounds(@NotNull org.gtk.gtk.TextIter start, @NotNull org.gtk.gtk.TextIter end) {
        java.util.Objects.requireNonNull(start, "Parameter 'start' must not be null");
        java.util.Objects.requireNonNull(end, "Parameter 'end' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_get_bounds.invokeExact(
                    handle(),
                    start.handle(),
                    end.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Gets whether there is a redoable action in the history.
     * @return {@code true} if there is an redoable action
     */
    public boolean getCanRedo() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_buffer_get_can_redo.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether there is an undoable action in the history.
     * @return {@code true} if there is an undoable action
     */
    public boolean getCanUndo() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_buffer_get_can_undo.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @return number of characters in the buffer
     */
    public int getCharCount() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_buffer_get_char_count.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_buffer_get_enable_undo.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param iter iterator to initialize
     */
    public void getEndIter(@NotNull org.gtk.gtk.TextIter iter) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_get_end_iter.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Indicates whether the buffer has some text currently selected.
     * @return {@code true} if the there is text selected
     */
    public boolean getHasSelection() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_buffer_get_has_selection.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the mark that represents the cursor (insertion point).
     * <p>
     * Equivalent to calling {@link TextBuffer#getMark}
     * to get the mark named “insert”, but very slightly more
     * efficient, and involves less typing.
     * @return insertion point mark
     */
    public @NotNull org.gtk.gtk.TextMark getInsert() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_buffer_get_insert.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.TextMark(RESULT, Ownership.NONE);
    }
    
    /**
     * Obtains the location of {@code anchor} within {@code buffer}.
     * @param iter an iterator to be initialized
     * @param anchor a child anchor that appears in {@code buffer}
     */
    public void getIterAtChildAnchor(@NotNull org.gtk.gtk.TextIter iter, @NotNull org.gtk.gtk.TextChildAnchor anchor) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(anchor, "Parameter 'anchor' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_get_iter_at_child_anchor.invokeExact(
                    handle(),
                    iter.handle(),
                    anchor.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initializes {@code iter} to the start of the given line.
     * <p>
     * If {@code line_number} is greater than or equal to the number of lines
     * in the {@code buffer}, the end iterator is returned.
     * @param iter iterator to initialize
     * @param lineNumber line number counting from 0
     * @return whether the exact position has been found
     */
    public boolean getIterAtLine(@NotNull org.gtk.gtk.TextIter iter, int lineNumber) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_buffer_get_iter_at_line.invokeExact(
                    handle(),
                    iter.handle(),
                    lineNumber);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param iter iterator to initialize
     * @param lineNumber line number counting from 0
     * @param byteIndex byte index from start of line
     * @return whether the exact position has been found
     */
    public boolean getIterAtLineIndex(@NotNull org.gtk.gtk.TextIter iter, int lineNumber, int byteIndex) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_buffer_get_iter_at_line_index.invokeExact(
                    handle(),
                    iter.handle(),
                    lineNumber,
                    byteIndex);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param iter iterator to initialize
     * @param lineNumber line number counting from 0
     * @param charOffset char offset from start of line
     * @return whether the exact position has been found
     */
    public boolean getIterAtLineOffset(@NotNull org.gtk.gtk.TextIter iter, int lineNumber, int charOffset) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_buffer_get_iter_at_line_offset.invokeExact(
                    handle(),
                    iter.handle(),
                    lineNumber,
                    charOffset);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Initializes {@code iter} with the current position of {@code mark}.
     * @param iter iterator to initialize
     * @param mark a {@code GtkTextMark} in {@code buffer}
     */
    public void getIterAtMark(@NotNull org.gtk.gtk.TextIter iter, @NotNull org.gtk.gtk.TextMark mark) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(mark, "Parameter 'mark' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_get_iter_at_mark.invokeExact(
                    handle(),
                    iter.handle(),
                    mark.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Initializes {@code iter} to a position {@code char_offset} chars from the start
     * of the entire buffer.
     * <p>
     * If {@code char_offset} is -1 or greater than the number
     * of characters in the buffer, {@code iter} is initialized to the end iterator,
     * the iterator one past the last valid character in the buffer.
     * @param iter iterator to initialize
     * @param charOffset char offset from start of buffer, counting from 0, or -1
     */
    public void getIterAtOffset(@NotNull org.gtk.gtk.TextIter iter, int charOffset) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_get_iter_at_offset.invokeExact(
                    handle(),
                    iter.handle(),
                    charOffset);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Obtains the number of lines in the buffer.
     * <p>
     * This value is cached, so the function is very fast.
     * @return number of lines in the buffer
     */
    public int getLineCount() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_buffer_get_line_count.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the mark named {@code name} in buffer {@code buffer}, or {@code null} if no such
     * mark exists in the buffer.
     * @param name a mark name
     * @return a {@code GtkTextMark}
     */
    public @Nullable org.gtk.gtk.TextMark getMark(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_buffer_get_mark.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.TextMark(RESULT, Ownership.NONE);
    }
    
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
            RESULT = (int) DowncallHandles.gtk_text_buffer_get_max_undo_levels.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Indicates whether the buffer has been modified since the last call
     * to {@link TextBuffer#setModified} set the modification flag to
     * {@code false}.
     * <p>
     * Used for example to enable a “save” function in a text editor.
     * @return {@code true} if the buffer has been modified
     */
    public boolean getModified() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_buffer_get_modified.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @return selection bound mark
     */
    public @NotNull org.gtk.gtk.TextMark getSelectionBound() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_buffer_get_selection_bound.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.TextMark(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns {@code true} if some text is selected; places the bounds
     * of the selection in {@code start} and {@code end}.
     * <p>
     * If the selection has length 0, then {@code start} and {@code end} are filled
     * in with the same value. {@code start} and {@code end} will be in ascending order.
     * If {@code start} and {@code end} are {@code null}, then they are not filled in, but the
     * return value still indicates whether text is selected.
     * @param start iterator to initialize with selection start
     * @param end iterator to initialize with selection end
     * @return whether the selection has nonzero length
     */
    public boolean getSelectionBounds(@NotNull org.gtk.gtk.TextIter start, @NotNull org.gtk.gtk.TextIter end) {
        java.util.Objects.requireNonNull(start, "Parameter 'start' must not be null");
        java.util.Objects.requireNonNull(end, "Parameter 'end' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_buffer_get_selection_bounds.invokeExact(
                    handle(),
                    start.handle(),
                    end.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get a content provider for this buffer.
     * <p>
     * It can be used to make the content of {@code buffer} available
     * in a {@code GdkClipboard}, see {@link org.gtk.gdk.Clipboard#setContent}.
     * @return a new {@code GdkContentProvider}.
     */
    public @NotNull org.gtk.gdk.ContentProvider getSelectionContent() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_buffer_get_selection_content.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.ContentProvider(RESULT, Ownership.FULL);
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
     * @param start start of a range
     * @param end end of a range
     * @param includeHiddenChars whether to include invisible text
     * @return an allocated UTF-8 string
     */
    public @NotNull java.lang.String getSlice(@NotNull org.gtk.gtk.TextIter start, @NotNull org.gtk.gtk.TextIter end, boolean includeHiddenChars) {
        java.util.Objects.requireNonNull(start, "Parameter 'start' must not be null");
        java.util.Objects.requireNonNull(end, "Parameter 'end' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_buffer_get_slice.invokeExact(
                    handle(),
                    start.handle(),
                    end.handle(),
                    includeHiddenChars ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Initialized {@code iter} with the first position in the text buffer.
     * <p>
     * This is the same as using {@link TextBuffer#getIterAtOffset}
     * to get the iter at character offset 0.
     * @param iter iterator to initialize
     */
    public void getStartIter(@NotNull org.gtk.gtk.TextIter iter) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_get_start_iter.invokeExact(
                    handle(),
                    iter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the {@code GtkTextTagTable} associated with this buffer.
     * @return the buffer’s tag table
     */
    public @NotNull org.gtk.gtk.TextTagTable getTagTable() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_buffer_get_tag_table.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.TextTagTable(RESULT, Ownership.NONE);
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
     * @param start start of a range
     * @param end end of a range
     * @param includeHiddenChars whether to include invisible text
     * @return an allocated UTF-8 string
     */
    public @NotNull java.lang.String getText(@NotNull org.gtk.gtk.TextIter start, @NotNull org.gtk.gtk.TextIter end, boolean includeHiddenChars) {
        java.util.Objects.requireNonNull(start, "Parameter 'start' must not be null");
        java.util.Objects.requireNonNull(end, "Parameter 'end' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_buffer_get_text.invokeExact(
                    handle(),
                    start.handle(),
                    end.handle(),
                    includeHiddenChars ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
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
     * @param iter a position in the buffer
     * @param text text in UTF-8 format
     * @param len length of text in bytes, or -1
     */
    public void insert(@NotNull org.gtk.gtk.TextIter iter, @NotNull java.lang.String text, int len) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_insert.invokeExact(
                    handle(),
                    iter.handle(),
                    Interop.allocateNativeString(text),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Inserts {@code text} in {@code buffer}.
     * <p>
     * Simply calls {@link TextBuffer#insert},
     * using the current cursor position as the insertion point.
     * @param text text in UTF-8 format
     * @param len length of text, in bytes
     */
    public void insertAtCursor(@NotNull java.lang.String text, int len) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_insert_at_cursor.invokeExact(
                    handle(),
                    Interop.allocateNativeString(text),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param iter location to insert the anchor
     * @param anchor a {@code GtkTextChildAnchor}
     */
    public void insertChildAnchor(@NotNull org.gtk.gtk.TextIter iter, @NotNull org.gtk.gtk.TextChildAnchor anchor) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(anchor, "Parameter 'anchor' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_insert_child_anchor.invokeExact(
                    handle(),
                    iter.handle(),
                    anchor.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param iter a position in {@code buffer}
     * @param text some UTF-8 text
     * @param len length of text in bytes, or -1
     * @param defaultEditable default editability of buffer
     * @return whether text was actually inserted
     */
    public boolean insertInteractive(@NotNull org.gtk.gtk.TextIter iter, @NotNull java.lang.String text, int len, boolean defaultEditable) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_buffer_insert_interactive.invokeExact(
                    handle(),
                    iter.handle(),
                    Interop.allocateNativeString(text),
                    len,
                    defaultEditable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param text text in UTF-8 format
     * @param len length of text in bytes, or -1
     * @param defaultEditable default editability of buffer
     * @return whether text was actually inserted
     */
    public boolean insertInteractiveAtCursor(@NotNull java.lang.String text, int len, boolean defaultEditable) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_buffer_insert_interactive_at_cursor.invokeExact(
                    handle(),
                    Interop.allocateNativeString(text),
                    len,
                    defaultEditable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Inserts the text in {@code markup} at position {@code iter}.
     * <p>
     * {@code markup} will be inserted in its entirety and must be nul-terminated
     * and valid UTF-8. Emits the {@code Gtk.TextBuffer::insert-text} signal,
     * possibly multiple times; insertion actually occurs in the default handler
     * for the signal. {@code iter} will point to the end of the inserted text on return.
     * @param iter location to insert the markup
     * @param markup a nul-terminated UTF-8 string containing Pango markup
     * @param len length of {@code markup} in bytes, or -1
     */
    public void insertMarkup(@NotNull org.gtk.gtk.TextIter iter, @NotNull java.lang.String markup, int len) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(markup, "Parameter 'markup' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_insert_markup.invokeExact(
                    handle(),
                    iter.handle(),
                    Interop.allocateNativeString(markup),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param iter location to insert the paintable
     * @param paintable a {@code GdkPaintable}
     */
    public void insertPaintable(@NotNull org.gtk.gtk.TextIter iter, @NotNull org.gtk.gdk.Paintable paintable) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(paintable, "Parameter 'paintable' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_insert_paintable.invokeExact(
                    handle(),
                    iter.handle(),
                    paintable.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param iter a position in {@code buffer}
     * @param start a position in a {@code GtkTextBuffer}
     * @param end another position in the same buffer as {@code start}
     */
    public void insertRange(@NotNull org.gtk.gtk.TextIter iter, @NotNull org.gtk.gtk.TextIter start, @NotNull org.gtk.gtk.TextIter end) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(start, "Parameter 'start' must not be null");
        java.util.Objects.requireNonNull(end, "Parameter 'end' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_insert_range.invokeExact(
                    handle(),
                    iter.handle(),
                    start.handle(),
                    end.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param iter a position in {@code buffer}
     * @param start a position in a {@code GtkTextBuffer}
     * @param end another position in the same buffer as {@code start}
     * @param defaultEditable default editability of the buffer
     * @return whether an insertion was possible at {@code iter}
     */
    public boolean insertRangeInteractive(@NotNull org.gtk.gtk.TextIter iter, @NotNull org.gtk.gtk.TextIter start, @NotNull org.gtk.gtk.TextIter end, boolean defaultEditable) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(start, "Parameter 'start' must not be null");
        java.util.Objects.requireNonNull(end, "Parameter 'end' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_buffer_insert_range_interactive.invokeExact(
                    handle(),
                    iter.handle(),
                    start.handle(),
                    end.handle(),
                    defaultEditable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Inserts {@code text} into {@code buffer} at {@code iter}, applying the list of tags to
     * the newly-inserted text.
     * <p>
     * The last tag specified must be {@code null} to terminate the list.
     * Equivalent to calling {@link TextBuffer#insert},
     * then {@link TextBuffer#applyTag} on the inserted text;
     * this is just a convenience function.
     * @param iter an iterator in {@code buffer}
     * @param text UTF-8 text
     * @param len length of {@code text}, or -1
     * @param firstTag first tag to apply to {@code text}
     * @param varargs {@code null}-terminated list of tags to apply
     */
    public void insertWithTags(@NotNull org.gtk.gtk.TextIter iter, @NotNull java.lang.String text, int len, @NotNull org.gtk.gtk.TextTag firstTag, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        java.util.Objects.requireNonNull(firstTag, "Parameter 'firstTag' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_insert_with_tags.invokeExact(
                    handle(),
                    iter.handle(),
                    Interop.allocateNativeString(text),
                    len,
                    firstTag.handle(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Inserts {@code text} into {@code buffer} at {@code iter}, applying the list of tags to
     * the newly-inserted text.
     * <p>
     * Same as {@link TextBuffer#insertWithTags}, but allows you
     * to pass in tag names instead of tag objects.
     * @param iter position in {@code buffer}
     * @param text UTF-8 text
     * @param len length of {@code text}, or -1
     * @param firstTagName name of a tag to apply to {@code text}
     * @param varargs more tag names
     */
    public void insertWithTagsByName(@NotNull org.gtk.gtk.TextIter iter, @NotNull java.lang.String text, int len, @NotNull java.lang.String firstTagName, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(iter, "Parameter 'iter' must not be null");
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        java.util.Objects.requireNonNull(firstTagName, "Parameter 'firstTagName' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_insert_with_tags_by_name.invokeExact(
                    handle(),
                    iter.handle(),
                    Interop.allocateNativeString(text),
                    len,
                    Interop.allocateNativeString(firstTagName),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Moves {@code mark} to the new location {@code where}.
     * <p>
     * Emits the {@code Gtk.TextBuffer::mark-set} signal
     * as notification of the move.
     * @param mark a {@code GtkTextMark}
     * @param where new location for {@code mark} in {@code buffer}
     */
    public void moveMark(@NotNull org.gtk.gtk.TextMark mark, @NotNull org.gtk.gtk.TextIter where) {
        java.util.Objects.requireNonNull(mark, "Parameter 'mark' must not be null");
        java.util.Objects.requireNonNull(where, "Parameter 'where' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_move_mark.invokeExact(
                    handle(),
                    mark.handle(),
                    where.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Moves the mark named {@code name} (which must exist) to location {@code where}.
     * <p>
     * See {@link TextBuffer#moveMark} for details.
     * @param name name of a mark
     * @param where new location for mark
     */
    public void moveMarkByName(@NotNull java.lang.String name, @NotNull org.gtk.gtk.TextIter where) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(where, "Parameter 'where' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_move_mark_by_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    where.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param clipboard the {@code GdkClipboard} to paste from
     * @param overrideLocation location to insert pasted text
     * @param defaultEditable whether the buffer is editable by default
     */
    public void pasteClipboard(@NotNull org.gtk.gdk.Clipboard clipboard, @Nullable org.gtk.gtk.TextIter overrideLocation, boolean defaultEditable) {
        java.util.Objects.requireNonNull(clipboard, "Parameter 'clipboard' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_paste_clipboard.invokeExact(
                    handle(),
                    clipboard.handle(),
                    (Addressable) (overrideLocation == null ? MemoryAddress.NULL : overrideLocation.handle()),
                    defaultEditable ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param where where to put the cursor
     */
    public void placeCursor(@NotNull org.gtk.gtk.TextIter where) {
        java.util.Objects.requireNonNull(where, "Parameter 'where' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_place_cursor.invokeExact(
                    handle(),
                    where.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Redoes the next redoable action on the buffer, if there is one.
     */
    public void redo() {
        try {
            DowncallHandles.gtk_text_buffer_redo.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes all tags in the range between {@code start} and {@code end}.
     * <p>
     * Be careful with this function; it could remove tags added in code
     * unrelated to the code you’re currently writing. That is, using this
     * function is probably a bad idea if you have two or more unrelated
     * code sections that add tags.
     * @param start one bound of range to be untagged
     * @param end other bound of range to be untagged
     */
    public void removeAllTags(@NotNull org.gtk.gtk.TextIter start, @NotNull org.gtk.gtk.TextIter end) {
        java.util.Objects.requireNonNull(start, "Parameter 'start' must not be null");
        java.util.Objects.requireNonNull(end, "Parameter 'end' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_remove_all_tags.invokeExact(
                    handle(),
                    start.handle(),
                    end.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes a {@code GdkClipboard} added with
     * gtk_text_buffer_add_selection_clipboard().
     * @param clipboard a {@code GdkClipboard} added to {@code buffer} by
     *   {@link TextBuffer#addSelectionClipboard}
     */
    public void removeSelectionClipboard(@NotNull org.gtk.gdk.Clipboard clipboard) {
        java.util.Objects.requireNonNull(clipboard, "Parameter 'clipboard' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_remove_selection_clipboard.invokeExact(
                    handle(),
                    clipboard.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Emits the “remove-tag” signal.
     * <p>
     * The default handler for the signal removes all occurrences
     * of {@code tag} from the given range. {@code start} and {@code end} don’t have
     * to be in order.
     * @param tag a {@code GtkTextTag}
     * @param start one bound of range to be untagged
     * @param end other bound of range to be untagged
     */
    public void removeTag(@NotNull org.gtk.gtk.TextTag tag, @NotNull org.gtk.gtk.TextIter start, @NotNull org.gtk.gtk.TextIter end) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        java.util.Objects.requireNonNull(start, "Parameter 'start' must not be null");
        java.util.Objects.requireNonNull(end, "Parameter 'end' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_remove_tag.invokeExact(
                    handle(),
                    tag.handle(),
                    start.handle(),
                    end.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Emits the “remove-tag” signal.
     * <p>
     * Calls {@link TextTagTable#lookup} on the buffer’s
     * tag table to get a {@code GtkTextTag}, then calls
     * {@link TextBuffer#removeTag}.
     * @param name name of a {@code GtkTextTag}
     * @param start one bound of range to be untagged
     * @param end other bound of range to be untagged
     */
    public void removeTagByName(@NotNull java.lang.String name, @NotNull org.gtk.gtk.TextIter start, @NotNull org.gtk.gtk.TextIter end) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(start, "Parameter 'start' must not be null");
        java.util.Objects.requireNonNull(end, "Parameter 'end' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_remove_tag_by_name.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name),
                    start.handle(),
                    end.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param ins where to put the “insert” mark
     * @param bound where to put the “selection_bound” mark
     */
    public void selectRange(@NotNull org.gtk.gtk.TextIter ins, @NotNull org.gtk.gtk.TextIter bound) {
        java.util.Objects.requireNonNull(ins, "Parameter 'ins' must not be null");
        java.util.Objects.requireNonNull(bound, "Parameter 'bound' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_select_range.invokeExact(
                    handle(),
                    ins.handle(),
                    bound.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param enableUndo {@code true} to enable undo
     */
    public void setEnableUndo(boolean enableUndo) {
        try {
            DowncallHandles.gtk_text_buffer_set_enable_undo.invokeExact(
                    handle(),
                    enableUndo ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the maximum number of undo levels to perform.
     * <p>
     * If 0, unlimited undo actions may be performed. Note that this may
     * have a memory usage impact as it requires storing an additional
     * copy of the inserted or removed text within the text buffer.
     * @param maxUndoLevels the maximum number of undo actions to perform
     */
    public void setMaxUndoLevels(int maxUndoLevels) {
        try {
            DowncallHandles.gtk_text_buffer_set_max_undo_levels.invokeExact(
                    handle(),
                    maxUndoLevels);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param setting modification flag setting
     */
    public void setModified(boolean setting) {
        try {
            DowncallHandles.gtk_text_buffer_set_modified.invokeExact(
                    handle(),
                    setting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Deletes current contents of {@code buffer}, and inserts {@code text} instead.
     * <p>
     * If {@code len} is -1, {@code text} must be nul-terminated.
     * {@code text} must be valid UTF-8.
     * @param text UTF-8 text to insert
     * @param len length of {@code text} in bytes
     */
    public void setText(@NotNull java.lang.String text, int len) {
        java.util.Objects.requireNonNull(text, "Parameter 'text' must not be null");
        try {
            DowncallHandles.gtk_text_buffer_set_text.invokeExact(
                    handle(),
                    Interop.allocateNativeString(text),
                    len);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Undoes the last undoable action on the buffer, if there is one.
     */
    public void undo() {
        try {
            DowncallHandles.gtk_text_buffer_undo.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ApplyTag {
        void signalReceived(TextBuffer source, @NotNull org.gtk.gtk.TextTag tag, @NotNull org.gtk.gtk.TextIter start, @NotNull org.gtk.gtk.TextIter end);
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextBuffer.ApplyTag> onApplyTag(TextBuffer.ApplyTag handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("apply-tag"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferApplyTag",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextBuffer.ApplyTag>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface BeginUserAction {
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextBuffer.BeginUserAction> onBeginUserAction(TextBuffer.BeginUserAction handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("begin-user-action"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferBeginUserAction",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextBuffer.BeginUserAction>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Changed {
        void signalReceived(TextBuffer source);
    }
    
    /**
     * Emitted when the content of a {@code GtkTextBuffer} has changed.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextBuffer.Changed> onChanged(TextBuffer.Changed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextBuffer.Changed>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface DeleteRange {
        void signalReceived(TextBuffer source, @NotNull org.gtk.gtk.TextIter start, @NotNull org.gtk.gtk.TextIter end);
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextBuffer.DeleteRange> onDeleteRange(TextBuffer.DeleteRange handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("delete-range"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferDeleteRange",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextBuffer.DeleteRange>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface EndUserAction {
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextBuffer.EndUserAction> onEndUserAction(TextBuffer.EndUserAction handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("end-user-action"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferEndUserAction",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextBuffer.EndUserAction>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InsertChildAnchor {
        void signalReceived(TextBuffer source, @NotNull org.gtk.gtk.TextIter location, @NotNull org.gtk.gtk.TextChildAnchor anchor);
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextBuffer.InsertChildAnchor> onInsertChildAnchor(TextBuffer.InsertChildAnchor handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("insert-child-anchor"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferInsertChildAnchor",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextBuffer.InsertChildAnchor>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InsertPaintable {
        void signalReceived(TextBuffer source, @NotNull org.gtk.gtk.TextIter location, @NotNull org.gtk.gdk.Paintable paintable);
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextBuffer.InsertPaintable> onInsertPaintable(TextBuffer.InsertPaintable handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("insert-paintable"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferInsertPaintable",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextBuffer.InsertPaintable>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface InsertText {
        void signalReceived(TextBuffer source, @NotNull org.gtk.gtk.TextIter location, @NotNull java.lang.String text, int len);
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextBuffer.InsertText> onInsertText(TextBuffer.InsertText handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("insert-text"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferInsertText",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextBuffer.InsertText>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MarkDeleted {
        void signalReceived(TextBuffer source, @NotNull org.gtk.gtk.TextMark mark);
    }
    
    /**
     * Emitted as notification after a {@code GtkTextMark} is deleted.
     * <p>
     * See also: {@link TextBuffer#deleteMark}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextBuffer.MarkDeleted> onMarkDeleted(TextBuffer.MarkDeleted handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("mark-deleted"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferMarkDeleted",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextBuffer.MarkDeleted>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface MarkSet {
        void signalReceived(TextBuffer source, @NotNull org.gtk.gtk.TextIter location, @NotNull org.gtk.gtk.TextMark mark);
    }
    
    /**
     * Emitted as notification after a {@code GtkTextMark} is set.
     * <p>
     * See also:
     * {@link TextBuffer#createMark},
     * {@link TextBuffer#moveMark}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextBuffer.MarkSet> onMarkSet(TextBuffer.MarkSet handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("mark-set"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferMarkSet",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextBuffer.MarkSet>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface ModifiedChanged {
        void signalReceived(TextBuffer source);
    }
    
    /**
     * Emitted when the modified bit of a {@code GtkTextBuffer} flips.
     * <p>
     * See also: {@link TextBuffer#setModified}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextBuffer.ModifiedChanged> onModifiedChanged(TextBuffer.ModifiedChanged handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("modified-changed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferModifiedChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextBuffer.ModifiedChanged>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface PasteDone {
        void signalReceived(TextBuffer source, @NotNull org.gtk.gdk.Clipboard clipboard);
    }
    
    /**
     * Emitted after paste operation has been completed.
     * <p>
     * This is useful to properly scroll the view to the end
     * of the pasted text. See {@link TextBuffer#pasteClipboard}
     * for more details.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextBuffer.PasteDone> onPasteDone(TextBuffer.PasteDone handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("paste-done"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferPasteDone",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextBuffer.PasteDone>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Redo {
        void signalReceived(TextBuffer source);
    }
    
    /**
     * Emitted when a request has been made to redo the
     * previously undone operation.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextBuffer.Redo> onRedo(TextBuffer.Redo handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("redo"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferRedo",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextBuffer.Redo>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface RemoveTag {
        void signalReceived(TextBuffer source, @NotNull org.gtk.gtk.TextTag tag, @NotNull org.gtk.gtk.TextIter start, @NotNull org.gtk.gtk.TextIter end);
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextBuffer.RemoveTag> onRemoveTag(TextBuffer.RemoveTag handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("remove-tag"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferRemoveTag",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextBuffer.RemoveTag>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Undo {
        void signalReceived(TextBuffer source);
    }
    
    /**
     * Emitted when a request has been made to undo the
     * previous operation or set of operations that have
     * been grouped together.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<TextBuffer.Undo> onUndo(TextBuffer.Undo handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("undo"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(TextBuffer.Callbacks.class, "signalTextBufferUndo",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<TextBuffer.Undo>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_text_buffer_new = Interop.downcallHandle(
            "gtk_text_buffer_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_add_mark = Interop.downcallHandle(
            "gtk_text_buffer_add_mark",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_add_selection_clipboard = Interop.downcallHandle(
            "gtk_text_buffer_add_selection_clipboard",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_apply_tag = Interop.downcallHandle(
            "gtk_text_buffer_apply_tag",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_apply_tag_by_name = Interop.downcallHandle(
            "gtk_text_buffer_apply_tag_by_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_backspace = Interop.downcallHandle(
            "gtk_text_buffer_backspace",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_begin_irreversible_action = Interop.downcallHandle(
            "gtk_text_buffer_begin_irreversible_action",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_begin_user_action = Interop.downcallHandle(
            "gtk_text_buffer_begin_user_action",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_copy_clipboard = Interop.downcallHandle(
            "gtk_text_buffer_copy_clipboard",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_create_child_anchor = Interop.downcallHandle(
            "gtk_text_buffer_create_child_anchor",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_create_mark = Interop.downcallHandle(
            "gtk_text_buffer_create_mark",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_create_tag = Interop.downcallHandle(
            "gtk_text_buffer_create_tag",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gtk_text_buffer_cut_clipboard = Interop.downcallHandle(
            "gtk_text_buffer_cut_clipboard",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_delete = Interop.downcallHandle(
            "gtk_text_buffer_delete",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_delete_interactive = Interop.downcallHandle(
            "gtk_text_buffer_delete_interactive",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_delete_mark = Interop.downcallHandle(
            "gtk_text_buffer_delete_mark",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_delete_mark_by_name = Interop.downcallHandle(
            "gtk_text_buffer_delete_mark_by_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_delete_selection = Interop.downcallHandle(
            "gtk_text_buffer_delete_selection",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_end_irreversible_action = Interop.downcallHandle(
            "gtk_text_buffer_end_irreversible_action",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_end_user_action = Interop.downcallHandle(
            "gtk_text_buffer_end_user_action",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_get_bounds = Interop.downcallHandle(
            "gtk_text_buffer_get_bounds",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_get_can_redo = Interop.downcallHandle(
            "gtk_text_buffer_get_can_redo",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_get_can_undo = Interop.downcallHandle(
            "gtk_text_buffer_get_can_undo",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_get_char_count = Interop.downcallHandle(
            "gtk_text_buffer_get_char_count",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_get_enable_undo = Interop.downcallHandle(
            "gtk_text_buffer_get_enable_undo",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_get_end_iter = Interop.downcallHandle(
            "gtk_text_buffer_get_end_iter",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_get_has_selection = Interop.downcallHandle(
            "gtk_text_buffer_get_has_selection",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_get_insert = Interop.downcallHandle(
            "gtk_text_buffer_get_insert",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_get_iter_at_child_anchor = Interop.downcallHandle(
            "gtk_text_buffer_get_iter_at_child_anchor",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_get_iter_at_line = Interop.downcallHandle(
            "gtk_text_buffer_get_iter_at_line",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_get_iter_at_line_index = Interop.downcallHandle(
            "gtk_text_buffer_get_iter_at_line_index",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_get_iter_at_line_offset = Interop.downcallHandle(
            "gtk_text_buffer_get_iter_at_line_offset",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_get_iter_at_mark = Interop.downcallHandle(
            "gtk_text_buffer_get_iter_at_mark",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_get_iter_at_offset = Interop.downcallHandle(
            "gtk_text_buffer_get_iter_at_offset",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_get_line_count = Interop.downcallHandle(
            "gtk_text_buffer_get_line_count",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_get_mark = Interop.downcallHandle(
            "gtk_text_buffer_get_mark",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_get_max_undo_levels = Interop.downcallHandle(
            "gtk_text_buffer_get_max_undo_levels",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_get_modified = Interop.downcallHandle(
            "gtk_text_buffer_get_modified",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_get_selection_bound = Interop.downcallHandle(
            "gtk_text_buffer_get_selection_bound",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_get_selection_bounds = Interop.downcallHandle(
            "gtk_text_buffer_get_selection_bounds",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_get_selection_content = Interop.downcallHandle(
            "gtk_text_buffer_get_selection_content",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_get_slice = Interop.downcallHandle(
            "gtk_text_buffer_get_slice",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_get_start_iter = Interop.downcallHandle(
            "gtk_text_buffer_get_start_iter",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_get_tag_table = Interop.downcallHandle(
            "gtk_text_buffer_get_tag_table",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_get_text = Interop.downcallHandle(
            "gtk_text_buffer_get_text",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_insert = Interop.downcallHandle(
            "gtk_text_buffer_insert",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_insert_at_cursor = Interop.downcallHandle(
            "gtk_text_buffer_insert_at_cursor",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_insert_child_anchor = Interop.downcallHandle(
            "gtk_text_buffer_insert_child_anchor",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_insert_interactive = Interop.downcallHandle(
            "gtk_text_buffer_insert_interactive",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_insert_interactive_at_cursor = Interop.downcallHandle(
            "gtk_text_buffer_insert_interactive_at_cursor",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_insert_markup = Interop.downcallHandle(
            "gtk_text_buffer_insert_markup",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_insert_paintable = Interop.downcallHandle(
            "gtk_text_buffer_insert_paintable",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_insert_range = Interop.downcallHandle(
            "gtk_text_buffer_insert_range",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_insert_range_interactive = Interop.downcallHandle(
            "gtk_text_buffer_insert_range_interactive",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_insert_with_tags = Interop.downcallHandle(
            "gtk_text_buffer_insert_with_tags",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gtk_text_buffer_insert_with_tags_by_name = Interop.downcallHandle(
            "gtk_text_buffer_insert_with_tags_by_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gtk_text_buffer_move_mark = Interop.downcallHandle(
            "gtk_text_buffer_move_mark",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_move_mark_by_name = Interop.downcallHandle(
            "gtk_text_buffer_move_mark_by_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_paste_clipboard = Interop.downcallHandle(
            "gtk_text_buffer_paste_clipboard",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_place_cursor = Interop.downcallHandle(
            "gtk_text_buffer_place_cursor",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_redo = Interop.downcallHandle(
            "gtk_text_buffer_redo",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_remove_all_tags = Interop.downcallHandle(
            "gtk_text_buffer_remove_all_tags",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_remove_selection_clipboard = Interop.downcallHandle(
            "gtk_text_buffer_remove_selection_clipboard",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_remove_tag = Interop.downcallHandle(
            "gtk_text_buffer_remove_tag",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_remove_tag_by_name = Interop.downcallHandle(
            "gtk_text_buffer_remove_tag_by_name",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_select_range = Interop.downcallHandle(
            "gtk_text_buffer_select_range",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_set_enable_undo = Interop.downcallHandle(
            "gtk_text_buffer_set_enable_undo",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_set_max_undo_levels = Interop.downcallHandle(
            "gtk_text_buffer_set_max_undo_levels",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_set_modified = Interop.downcallHandle(
            "gtk_text_buffer_set_modified",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_set_text = Interop.downcallHandle(
            "gtk_text_buffer_set_text",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle gtk_text_buffer_undo = Interop.downcallHandle(
            "gtk_text_buffer_undo",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalTextBufferApplyTag(MemoryAddress source, MemoryAddress tag, MemoryAddress start, MemoryAddress end, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextBuffer.ApplyTag) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextBuffer(source, Ownership.UNKNOWN), new org.gtk.gtk.TextTag(tag, Ownership.NONE), new org.gtk.gtk.TextIter(start, Ownership.NONE), new org.gtk.gtk.TextIter(end, Ownership.NONE));
        }
        
        public static void signalTextBufferBeginUserAction(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextBuffer.BeginUserAction) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextBuffer(source, Ownership.UNKNOWN));
        }
        
        public static void signalTextBufferChanged(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextBuffer.Changed) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextBuffer(source, Ownership.UNKNOWN));
        }
        
        public static void signalTextBufferDeleteRange(MemoryAddress source, MemoryAddress start, MemoryAddress end, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextBuffer.DeleteRange) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextBuffer(source, Ownership.UNKNOWN), new org.gtk.gtk.TextIter(start, Ownership.NONE), new org.gtk.gtk.TextIter(end, Ownership.NONE));
        }
        
        public static void signalTextBufferEndUserAction(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextBuffer.EndUserAction) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextBuffer(source, Ownership.UNKNOWN));
        }
        
        public static void signalTextBufferInsertChildAnchor(MemoryAddress source, MemoryAddress location, MemoryAddress anchor, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextBuffer.InsertChildAnchor) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextBuffer(source, Ownership.UNKNOWN), new org.gtk.gtk.TextIter(location, Ownership.NONE), new org.gtk.gtk.TextChildAnchor(anchor, Ownership.NONE));
        }
        
        public static void signalTextBufferInsertPaintable(MemoryAddress source, MemoryAddress location, MemoryAddress paintable, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextBuffer.InsertPaintable) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextBuffer(source, Ownership.UNKNOWN), new org.gtk.gtk.TextIter(location, Ownership.NONE), new org.gtk.gdk.Paintable.PaintableImpl(paintable, Ownership.NONE));
        }
        
        public static void signalTextBufferInsertText(MemoryAddress source, MemoryAddress location, MemoryAddress text, int len, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextBuffer.InsertText) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextBuffer(source, Ownership.UNKNOWN), new org.gtk.gtk.TextIter(location, Ownership.NONE), Interop.getStringFrom(text), len);
        }
        
        public static void signalTextBufferMarkDeleted(MemoryAddress source, MemoryAddress mark, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextBuffer.MarkDeleted) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextBuffer(source, Ownership.UNKNOWN), new org.gtk.gtk.TextMark(mark, Ownership.NONE));
        }
        
        public static void signalTextBufferMarkSet(MemoryAddress source, MemoryAddress location, MemoryAddress mark, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextBuffer.MarkSet) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextBuffer(source, Ownership.UNKNOWN), new org.gtk.gtk.TextIter(location, Ownership.NONE), new org.gtk.gtk.TextMark(mark, Ownership.NONE));
        }
        
        public static void signalTextBufferModifiedChanged(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextBuffer.ModifiedChanged) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextBuffer(source, Ownership.UNKNOWN));
        }
        
        public static void signalTextBufferPasteDone(MemoryAddress source, MemoryAddress clipboard, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextBuffer.PasteDone) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextBuffer(source, Ownership.UNKNOWN), new org.gtk.gdk.Clipboard(clipboard, Ownership.NONE));
        }
        
        public static void signalTextBufferRedo(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextBuffer.Redo) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextBuffer(source, Ownership.UNKNOWN));
        }
        
        public static void signalTextBufferRemoveTag(MemoryAddress source, MemoryAddress tag, MemoryAddress start, MemoryAddress end, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextBuffer.RemoveTag) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextBuffer(source, Ownership.UNKNOWN), new org.gtk.gtk.TextTag(tag, Ownership.NONE), new org.gtk.gtk.TextIter(start, Ownership.NONE), new org.gtk.gtk.TextIter(end, Ownership.NONE));
        }
        
        public static void signalTextBufferUndo(MemoryAddress source, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (TextBuffer.Undo) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new TextBuffer(source, Ownership.UNKNOWN));
        }
    }
}
