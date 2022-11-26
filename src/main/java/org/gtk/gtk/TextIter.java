package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An iterator for the contents of a {@code GtkTextBuffer}.
 * <p>
 * You may wish to begin by reading the
 * <a href="section-text-widget.html">text widget conceptual overview</a>,
 * which gives an overview of all the objects and data types
 * related to the text widget and how they work together.
 */
public class TextIter extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTextIter";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("dummy1"),
        Interop.valueLayout.ADDRESS.withName("dummy2"),
        Interop.valueLayout.C_INT.withName("dummy3"),
        Interop.valueLayout.C_INT.withName("dummy4"),
        Interop.valueLayout.C_INT.withName("dummy5"),
        Interop.valueLayout.C_INT.withName("dummy6"),
        Interop.valueLayout.C_INT.withName("dummy7"),
        Interop.valueLayout.C_INT.withName("dummy8"),
        Interop.valueLayout.ADDRESS.withName("dummy9"),
        Interop.valueLayout.ADDRESS.withName("dummy10"),
        Interop.valueLayout.C_INT.withName("dummy11"),
        Interop.valueLayout.C_INT.withName("dummy12"),
        Interop.valueLayout.C_INT.withName("dummy13"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("dummy14")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TextIter}
     * @return A new, uninitialized @{link TextIter}
     */
    public static TextIter allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TextIter newInstance = new TextIter(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a TextIter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TextIter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Assigns the value of {@code other} to {@code iter}.
     * <p>
     * This function is not useful in applications, because
     * iterators can be assigned with {@code GtkTextIter i = j;}.
     * <p>
     * The function is used by language bindings.
     * @param other another {@code GtkTextIter}
     */
    public void assign(@NotNull org.gtk.gtk.TextIter other) {
        java.util.Objects.requireNonNull(other, "Parameter 'other' must not be null");
        try {
            DowncallHandles.gtk_text_iter_assign.invokeExact(
                    handle(),
                    other.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Moves backward by one character offset.
     * <p>
     * Returns {@code true} if movement was possible; if {@code iter} was the first
     * in the buffer (character offset 0), this function returns {@code false}
     * for convenience when writing loops.
     * @return whether movement was possible
     */
    public boolean backwardChar() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_backward_char.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves {@code count} characters backward, if possible.
     * <p>
     * If {@code count} would move past the start or end of the buffer, moves
     * to the start or end of the buffer.
     * <p>
     * The return value indicates whether the iterator moved
     * onto a dereferenceable position; if the iterator didn’t move, or
     * moved onto the end iterator, then {@code false} is returned. If {@code count} is 0,
     * the function does nothing and returns {@code false}.
     * @param count number of characters to move
     * @return whether {@code iter} moved and is dereferenceable
     */
    public boolean backwardChars(int count) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_backward_chars.invokeExact(
                    handle(),
                    count);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Like gtk_text_iter_forward_cursor_position(), but moves backward.
     * @return {@code true} if we moved
     */
    public boolean backwardCursorPosition() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_backward_cursor_position.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves up to {@code count} cursor positions.
     * <p>
     * See {@link TextIter#forwardCursorPosition} for details.
     * @param count number of positions to move
     * @return {@code true} if we moved and the new position is dereferenceable
     */
    public boolean backwardCursorPositions(int count) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_backward_cursor_positions.invokeExact(
                    handle(),
                    count);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Same as gtk_text_iter_forward_find_char(),
     * but goes backward from {@code iter}.
     * @param pred function to be called on each character
     * @param limit search limit
     * @return whether a match was found
     */
    public boolean backwardFindChar(@NotNull org.gtk.gtk.TextCharPredicate pred, @Nullable org.gtk.gtk.TextIter limit) {
        java.util.Objects.requireNonNull(pred, "Parameter 'pred' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_backward_find_char.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbTextCharPredicate",
                            MethodType.methodType(int.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(pred)),
                    (Addressable) (limit == null ? MemoryAddress.NULL : limit.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves {@code iter} to the start of the previous line.
     * <p>
     * Returns {@code true} if {@code iter} could be moved; i.e. if {@code iter} was at
     * character offset 0, this function returns {@code false}. Therefore,
     * if {@code iter} was already on line 0, but not at the start of the line,
     * {@code iter} is snapped to the start of the line and the function returns
     * {@code true}. (Note that this implies that
     * in a loop calling this function, the line number may not change on
     * every iteration, if your first iteration is on line 0.)
     * @return whether {@code iter} moved
     */
    public boolean backwardLine() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_backward_line.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves {@code count} lines backward, if possible.
     * <p>
     * If {@code count} would move past the start or end of the buffer, moves to
     * the start or end of the buffer.
     * <p>
     * The return value indicates whether the iterator moved
     * onto a dereferenceable position; if the iterator didn’t move, or
     * moved onto the end iterator, then {@code false} is returned. If {@code count} is 0,
     * the function does nothing and returns {@code false}. If {@code count} is negative,
     * moves forward by 0 - {@code count} lines.
     * @param count number of lines to move backward
     * @return whether {@code iter} moved and is dereferenceable
     */
    public boolean backwardLines(int count) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_backward_lines.invokeExact(
                    handle(),
                    count);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Same as gtk_text_iter_forward_search(), but moves backward.
     * <p>
     * {@code match_end} will never be set to a {@code GtkTextIter} located after {@code iter},
     * even if there is a possible {@code match_start} before or at {@code iter}.
     * @param str search string
     * @param flags bitmask of flags affecting the search
     * @param matchStart return location for start of match
     * @param matchEnd return location for end of match
     * @param limit location of last possible {@code match_start}, or {@code null} for start of buffer
     * @return whether a match was found
     */
    public boolean backwardSearch(@NotNull java.lang.String str, @NotNull org.gtk.gtk.TextSearchFlags flags, @NotNull org.gtk.gtk.TextIter matchStart, @NotNull org.gtk.gtk.TextIter matchEnd, @Nullable org.gtk.gtk.TextIter limit) {
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        java.util.Objects.requireNonNull(matchStart, "Parameter 'matchStart' must not be null");
        java.util.Objects.requireNonNull(matchEnd, "Parameter 'matchEnd' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_backward_search.invokeExact(
                    handle(),
                    Interop.allocateNativeString(str),
                    flags.getValue(),
                    matchStart.handle(),
                    matchEnd.handle(),
                    (Addressable) (limit == null ? MemoryAddress.NULL : limit.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves backward to the previous sentence start.
     * <p>
     * If {@code iter} is already at the start of a sentence, moves backward
     * to the next one.
     * <p>
     * Sentence boundaries are determined by Pango and should
     * be correct for nearly any language.
     * @return {@code true} if {@code iter} moved and is not the end iterator
     */
    public boolean backwardSentenceStart() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_backward_sentence_start.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Calls gtk_text_iter_backward_sentence_start() up to {@code count} times.
     * <p>
     * If {@code count} is negative, moves forward instead of backward.
     * @param count number of sentences to move
     * @return {@code true} if {@code iter} moved and is not the end iterator
     */
    public boolean backwardSentenceStarts(int count) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_backward_sentence_starts.invokeExact(
                    handle(),
                    count);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves backward to the next toggle (on or off) of the
     * {@code tag}, or to the next toggle of any tag if
     * {@code tag} is {@code null}.
     * <p>
     * If no matching tag toggles are found,
     * returns {@code false}, otherwise {@code true}. Does not return toggles
     * located at {@code iter}, only toggles before {@code iter}. Sets {@code iter}
     * to the location of the toggle, or the start of the buffer
     * if no toggle is found.
     * @param tag a {@code GtkTextTag}
     * @return whether we found a tag toggle before {@code iter}
     */
    public boolean backwardToTagToggle(@Nullable org.gtk.gtk.TextTag tag) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_backward_to_tag_toggle.invokeExact(
                    handle(),
                    (Addressable) (tag == null ? MemoryAddress.NULL : tag.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves {@code iter} forward to the previous visible cursor position.
     * <p>
     * See {@link TextIter#backwardCursorPosition} for details.
     * @return {@code true} if we moved and the new position is dereferenceable
     */
    public boolean backwardVisibleCursorPosition() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_backward_visible_cursor_position.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves up to {@code count} visible cursor positions.
     * <p>
     * See {@link TextIter#backwardCursorPosition} for details.
     * @param count number of positions to move
     * @return {@code true} if we moved and the new position is dereferenceable
     */
    public boolean backwardVisibleCursorPositions(int count) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_backward_visible_cursor_positions.invokeExact(
                    handle(),
                    count);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves {@code iter} to the start of the previous visible line.
     * <p>
     * Returns {@code true} if
     * {@code iter} could be moved; i.e. if {@code iter} was at character offset 0, this
     * function returns {@code false}. Therefore if {@code iter} was already on line 0,
     * but not at the start of the line, {@code iter} is snapped to the start of
     * the line and the function returns {@code true}. (Note that this implies that
     * in a loop calling this function, the line number may not change on
     * every iteration, if your first iteration is on line 0.)
     * @return whether {@code iter} moved
     */
    public boolean backwardVisibleLine() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_backward_visible_line.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves {@code count} visible lines backward, if possible.
     * <p>
     * If {@code count} would move past the start or end of the buffer, moves to
     * the start or end of the buffer.
     * <p>
     * The return value indicates whether the iterator moved
     * onto a dereferenceable position; if the iterator didn’t move, or
     * moved onto the end iterator, then {@code false} is returned. If {@code count} is 0,
     * the function does nothing and returns {@code false}. If {@code count} is negative,
     * moves forward by 0 - {@code count} lines.
     * @param count number of lines to move backward
     * @return whether {@code iter} moved and is dereferenceable
     */
    public boolean backwardVisibleLines(int count) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_backward_visible_lines.invokeExact(
                    handle(),
                    count);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves backward to the previous visible word start.
     * <p>
     * If {@code iter} is currently on a word start, moves backward to the
     * next one after that.
     * <p>
     * Word breaks are determined by Pango and should be correct
     * for nearly any language.
     * @return {@code true} if {@code iter} moved and is not the end iterator
     */
    public boolean backwardVisibleWordStart() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_backward_visible_word_start.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Calls gtk_text_iter_backward_visible_word_start() up to {@code count} times.
     * @param count number of times to move
     * @return {@code true} if {@code iter} moved and is not the end iterator
     */
    public boolean backwardVisibleWordStarts(int count) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_backward_visible_word_starts.invokeExact(
                    handle(),
                    count);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves backward to the previous word start.
     * <p>
     * If {@code iter} is currently on a word start, moves backward to the
     * next one after that.
     * <p>
     * Word breaks are determined by Pango and should be correct
     * for nearly any language
     * @return {@code true} if {@code iter} moved and is not the end iterator
     */
    public boolean backwardWordStart() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_backward_word_start.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Calls gtk_text_iter_backward_word_start() up to {@code count} times.
     * @param count number of times to move
     * @return {@code true} if {@code iter} moved and is not the end iterator
     */
    public boolean backwardWordStarts(int count) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_backward_word_starts.invokeExact(
                    handle(),
                    count);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Considering the default editability of the buffer, and tags that
     * affect editability, determines whether text inserted at {@code iter} would
     * be editable.
     * <p>
     * If text inserted at {@code iter} would be editable then the
     * user should be allowed to insert text at {@code iter}.
     * {@link TextBuffer#insertInteractive} uses this function
     * to decide whether insertions are allowed at a given position.
     * @param defaultEditability {@code true} if text is editable by default
     * @return whether text inserted at {@code iter} would be editable
     */
    public boolean canInsert(boolean defaultEditability) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_can_insert.invokeExact(
                    handle(),
                    defaultEditability ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * A qsort()-style function that returns negative if {@code lhs} is less than
     * {@code rhs}, positive if {@code lhs} is greater than {@code rhs}, and 0 if they’re equal.
     * <p>
     * Ordering is in character offset order, i.e. the first character
     * in the buffer is less than the second character in the buffer.
     * @param rhs another {@code GtkTextIter}
     * @return -1 if {@code lhs} is less than {@code rhs}, 1 if {@code lhs} is greater, 0 if they are equal
     */
    public int compare(@NotNull org.gtk.gtk.TextIter rhs) {
        java.util.Objects.requireNonNull(rhs, "Parameter 'rhs' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_compare.invokeExact(
                    handle(),
                    rhs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a dynamically-allocated copy of an iterator.
     * <p>
     * This function is not useful in applications, because
     * iterators can be copied with a simple assignment
     * ({@code GtkTextIter i = j;}).
     * <p>
     * The function is used by language bindings.
     * @return a copy of the {@code iter}, free with {@link TextIter#free}
     */
    public @NotNull org.gtk.gtk.TextIter copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_iter_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.TextIter(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns whether the character at {@code iter} is within an editable region
     * of text.
     * <p>
     * Non-editable text is “locked” and can’t be changed by the
     * user via {@code GtkTextView}. If no tags applied to this text affect
     * editability, {@code default_setting} will be returned.
     * <p>
     * You don’t want to use this function to decide whether text can be
     * inserted at {@code iter}, because for insertion you don’t want to know
     * whether the char at {@code iter} is inside an editable range, you want to
     * know whether a new character inserted at {@code iter} would be inside an
     * editable range. Use {@link TextIter#canInsert} to handle this
     * case.
     * @param defaultSetting {@code true} if text is editable by default
     * @return whether {@code iter} is inside an editable range
     */
    public boolean editable(boolean defaultSetting) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_editable.invokeExact(
                    handle(),
                    defaultSetting ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns {@code true} if {@code iter} points to the start of the paragraph
     * delimiter characters for a line.
     * <p>
     * Delimiters will be either a newline, a carriage return, a carriage
     * return followed by a newline, or a Unicode paragraph separator
     * character.
     * <p>
     * Note that an iterator pointing to the \\n of a \\r\\n pair will not be
     * counted as the end of a line, the line ends before the \\r. The end
     * iterator is considered to be at the end of a line, even though there
     * are no paragraph delimiter chars there.
     * @return whether {@code iter} is at the end of a line
     */
    public boolean endsLine() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_ends_line.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Determines whether {@code iter} ends a sentence.
     * <p>
     * Sentence boundaries are determined by Pango and should
     * be correct for nearly any language.
     * @return {@code true} if {@code iter} is at the end of a sentence.
     */
    public boolean endsSentence() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_ends_sentence.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns {@code true} if {@code tag} is toggled off at exactly this point.
     * <p>
     * If {@code tag} is {@code null}, returns {@code true} if any tag is toggled off at this point.
     * <p>
     * Note that if this function returns {@code true}, it means that
     * {@code iter} is at the end of the tagged range, but that the character
     * at {@code iter} is outside the tagged range. In other words,
     * unlike {@link TextIter#startsTag}, if this function
     * returns {@code true}, {@link TextIter#hasTag} will return
     * {@code false} for the same parameters.
     * @param tag a {@code GtkTextTag}
     * @return whether {@code iter} is the end of a range tagged with {@code tag}
     */
    public boolean endsTag(@Nullable org.gtk.gtk.TextTag tag) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_ends_tag.invokeExact(
                    handle(),
                    (Addressable) (tag == null ? MemoryAddress.NULL : tag.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Determines whether {@code iter} ends a natural-language word.
     * <p>
     * Word breaks are determined by Pango and should be correct
     * for nearly any language.
     * @return {@code true} if {@code iter} is at the end of a word
     */
    public boolean endsWord() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_ends_word.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Tests whether two iterators are equal, using the fastest possible
     * mechanism.
     * <p>
     * This function is very fast; you can expect it to perform
     * better than e.g. getting the character offset for each
     * iterator and comparing the offsets yourself. Also, it’s a
     * bit faster than {@link TextIter#compare}.
     * @param rhs another {@code GtkTextIter}
     * @return {@code true} if the iterators point to the same place in the buffer
     */
    public boolean equal(@NotNull org.gtk.gtk.TextIter rhs) {
        java.util.Objects.requireNonNull(rhs, "Parameter 'rhs' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_equal.invokeExact(
                    handle(),
                    rhs.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves {@code iter} forward by one character offset.
     * <p>
     * Note that images embedded in the buffer occupy 1 character slot, so
     * this function may actually move onto an image instead of a character,
     * if you have images in your buffer. If {@code iter} is the end iterator or
     * one character before it, {@code iter} will now point at the end iterator,
     * and this function returns {@code false} for convenience when writing loops.
     * @return whether {@code iter} moved and is dereferenceable
     */
    public boolean forwardChar() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_forward_char.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves {@code count} characters if possible.
     * <p>
     * If {@code count} would move past the start or end of the buffer,
     * moves to the start or end of the buffer.
     * <p>
     * The return value indicates whether the new position of
     * {@code iter} is different from its original position, and dereferenceable
     * (the last iterator in the buffer is not dereferenceable). If {@code count}
     * is 0, the function does nothing and returns {@code false}.
     * @param count number of characters to move, may be negative
     * @return whether {@code iter} moved and is dereferenceable
     */
    public boolean forwardChars(int count) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_forward_chars.invokeExact(
                    handle(),
                    count);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves {@code iter} forward by a single cursor position.
     * <p>
     * Cursor positions are (unsurprisingly) positions where the
     * cursor can appear. Perhaps surprisingly, there may not be
     * a cursor position between all characters. The most common
     * example for European languages would be a carriage return/newline
     * sequence.
     * <p>
     * For some Unicode characters, the equivalent of say the letter “a”
     * with an accent mark will be represented as two characters, first
     * the letter then a "combining mark" that causes the accent to be
     * rendered; so the cursor can’t go between those two characters.
     * <p>
     * See also the {@code Pango.LogAttr] struct and the [func@Pango.break}
     * function.
     * @return {@code true} if we moved and the new position is dereferenceable
     */
    public boolean forwardCursorPosition() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_forward_cursor_position.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves up to {@code count} cursor positions.
     * <p>
     * See {@link TextIter#forwardCursorPosition} for details.
     * @param count number of positions to move
     * @return {@code true} if we moved and the new position is dereferenceable
     */
    public boolean forwardCursorPositions(int count) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_forward_cursor_positions.invokeExact(
                    handle(),
                    count);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Advances {@code iter}, calling {@code pred} on each character.
     * <p>
     * If {@code pred} returns {@code true}, returns {@code true} and stops scanning.
     * If {@code pred} never returns {@code true}, {@code iter} is set to {@code limit} if
     * {@code limit} is non-{@code null}, otherwise to the end iterator.
     * @param pred a function to be called on each character
     * @param limit search limit
     * @return whether a match was found
     */
    public boolean forwardFindChar(@NotNull org.gtk.gtk.TextCharPredicate pred, @Nullable org.gtk.gtk.TextIter limit) {
        java.util.Objects.requireNonNull(pred, "Parameter 'pred' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_forward_find_char.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbTextCharPredicate",
                            MethodType.methodType(int.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(pred)),
                    (Addressable) (limit == null ? MemoryAddress.NULL : limit.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves {@code iter} to the start of the next line.
     * <p>
     * If the iter is already on the last line of the buffer,
     * moves the iter to the end of the current line. If after
     * the operation, the iter is at the end of the buffer and not
     * dereferenceable, returns {@code false}. Otherwise, returns {@code true}.
     * @return whether {@code iter} can be dereferenced
     */
    public boolean forwardLine() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_forward_line.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves {@code count} lines forward, if possible.
     * <p>
     * If {@code count} would move past the start or end of the buffer, moves to
     * the start or end of the buffer.
     * <p>
     * The return value indicates whether the iterator moved
     * onto a dereferenceable position; if the iterator didn’t move, or
     * moved onto the end iterator, then {@code false} is returned. If {@code count} is 0,
     * the function does nothing and returns {@code false}. If {@code count} is negative,
     * moves backward by 0 - {@code count} lines.
     * @param count number of lines to move forward
     * @return whether {@code iter} moved and is dereferenceable
     */
    public boolean forwardLines(int count) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_forward_lines.invokeExact(
                    handle(),
                    count);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Searches forward for {@code str}.
     * <p>
     * Any match is returned by setting {@code match_start} to the first character
     * of the match and {@code match_end} to the first character after the match.
     * The search will not continue past {@code limit}. Note that a search is a
     * linear or O(n) operation, so you may wish to use {@code limit} to avoid
     * locking up your UI on large buffers.
     * <p>
     * {@code match_start} will never be set to a {@code GtkTextIter} located before {@code iter},
     * even if there is a possible {@code match_end} after or at {@code iter}.
     * @param str a search string
     * @param flags flags affecting how the search is done
     * @param matchStart return location for start of match
     * @param matchEnd return location for end of match
     * @param limit location of last possible {@code match_end}, or {@code null} for the end of the buffer
     * @return whether a match was found
     */
    public boolean forwardSearch(@NotNull java.lang.String str, @NotNull org.gtk.gtk.TextSearchFlags flags, @NotNull org.gtk.gtk.TextIter matchStart, @NotNull org.gtk.gtk.TextIter matchEnd, @Nullable org.gtk.gtk.TextIter limit) {
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        java.util.Objects.requireNonNull(matchStart, "Parameter 'matchStart' must not be null");
        java.util.Objects.requireNonNull(matchEnd, "Parameter 'matchEnd' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_forward_search.invokeExact(
                    handle(),
                    Interop.allocateNativeString(str),
                    flags.getValue(),
                    matchStart.handle(),
                    matchEnd.handle(),
                    (Addressable) (limit == null ? MemoryAddress.NULL : limit.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves forward to the next sentence end.
     * <p>
     * If {@code iter} is at the end of a sentence, moves to the next
     * end of sentence.
     * <p>
     * Sentence boundaries are determined by Pango and should
     * be correct for nearly any language.
     * @return {@code true} if {@code iter} moved and is not the end iterator
     */
    public boolean forwardSentenceEnd() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_forward_sentence_end.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Calls gtk_text_iter_forward_sentence_end() {@code count} times.
     * <p>
     * If {@code count} is negative, moves backward instead of forward.
     * @param count number of sentences to move
     * @return {@code true} if {@code iter} moved and is not the end iterator
     */
    public boolean forwardSentenceEnds(int count) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_forward_sentence_ends.invokeExact(
                    handle(),
                    count);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves {@code iter} forward to the “end iterator”, which points
     * one past the last valid character in the buffer.
     * <p>
     * gtk_text_iter_get_char() called on the end iterator
     * returns 0, which is convenient for writing loops.
     */
    public void forwardToEnd() {
        try {
            DowncallHandles.gtk_text_iter_forward_to_end.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Moves the iterator to point to the paragraph delimiter characters.
     * <p>
     * The possible characters are either a newline, a carriage return,
     * a carriage return/newline in sequence, or the Unicode paragraph
     * separator character.
     * <p>
     * If the iterator is already at the paragraph delimiter
     * characters, moves to the paragraph delimiter characters for the
     * next line. If {@code iter} is on the last line in the buffer, which does
     * not end in paragraph delimiters, moves to the end iterator (end of
     * the last line), and returns {@code false}.
     * @return {@code true} if we moved and the new location is not the end iterator
     */
    public boolean forwardToLineEnd() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_forward_to_line_end.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves forward to the next toggle (on or off) of the
     * {@code tag}, or to the next toggle of any tag if
     * {@code tag} is {@code null}.
     * <p>
     * If no matching tag toggles are found,
     * returns {@code false}, otherwise {@code true}. Does not return toggles
     * located at {@code iter}, only toggles after {@code iter}. Sets {@code iter} to
     * the location of the toggle, or to the end of the buffer
     * if no toggle is found.
     * @param tag a {@code GtkTextTag}
     * @return whether we found a tag toggle after {@code iter}
     */
    public boolean forwardToTagToggle(@Nullable org.gtk.gtk.TextTag tag) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_forward_to_tag_toggle.invokeExact(
                    handle(),
                    (Addressable) (tag == null ? MemoryAddress.NULL : tag.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves {@code iter} forward to the next visible cursor position.
     * <p>
     * See {@link TextIter#forwardCursorPosition} for details.
     * @return {@code true} if we moved and the new position is dereferenceable
     */
    public boolean forwardVisibleCursorPosition() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_forward_visible_cursor_position.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves up to {@code count} visible cursor positions.
     * <p>
     * See {@link TextIter#forwardCursorPosition} for details.
     * @param count number of positions to move
     * @return {@code true} if we moved and the new position is dereferenceable
     */
    public boolean forwardVisibleCursorPositions(int count) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_forward_visible_cursor_positions.invokeExact(
                    handle(),
                    count);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves {@code iter} to the start of the next visible line.
     * <p>
     * Returns {@code true} if there
     * was a next line to move to, and {@code false} if {@code iter} was simply moved to
     * the end of the buffer and is now not dereferenceable, or if {@code iter} was
     * already at the end of the buffer.
     * @return whether {@code iter} can be dereferenced
     */
    public boolean forwardVisibleLine() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_forward_visible_line.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves {@code count} visible lines forward, if possible.
     * <p>
     * If {@code count} would move past the start or end of the buffer, moves to
     * the start or end of the buffer.
     * <p>
     * The return value indicates whether the iterator moved
     * onto a dereferenceable position; if the iterator didn’t move, or
     * moved onto the end iterator, then {@code false} is returned. If {@code count} is 0,
     * the function does nothing and returns {@code false}. If {@code count} is negative,
     * moves backward by 0 - {@code count} lines.
     * @param count number of lines to move forward
     * @return whether {@code iter} moved and is dereferenceable
     */
    public boolean forwardVisibleLines(int count) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_forward_visible_lines.invokeExact(
                    handle(),
                    count);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves forward to the next visible word end.
     * <p>
     * If {@code iter} is currently on a word end, moves forward to the
     * next one after that.
     * <p>
     * Word breaks are determined by Pango and should be correct
     * for nearly any language
     * @return {@code true} if {@code iter} moved and is not the end iterator
     */
    public boolean forwardVisibleWordEnd() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_forward_visible_word_end.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Calls gtk_text_iter_forward_visible_word_end() up to {@code count} times.
     * @param count number of times to move
     * @return {@code true} if {@code iter} moved and is not the end iterator
     */
    public boolean forwardVisibleWordEnds(int count) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_forward_visible_word_ends.invokeExact(
                    handle(),
                    count);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Moves forward to the next word end.
     * <p>
     * If {@code iter} is currently on a word end, moves forward to the
     * next one after that.
     * <p>
     * Word breaks are determined by Pango and should be correct
     * for nearly any language.
     * @return {@code true} if {@code iter} moved and is not the end iterator
     */
    public boolean forwardWordEnd() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_forward_word_end.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Calls gtk_text_iter_forward_word_end() up to {@code count} times.
     * @param count number of times to move
     * @return {@code true} if {@code iter} moved and is not the end iterator
     */
    public boolean forwardWordEnds(int count) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_forward_word_ends.invokeExact(
                    handle(),
                    count);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Free an iterator allocated on the heap.
     * <p>
     * This function is intended for use in language bindings,
     * and is not especially useful for applications, because
     * iterators can simply be allocated on the stack.
     */
    public void free() {
        try {
            DowncallHandles.gtk_text_iter_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the {@code GtkTextBuffer} this iterator is associated with.
     * @return the buffer
     */
    public @NotNull org.gtk.gtk.TextBuffer getBuffer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_iter_get_buffer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.TextBuffer(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the number of bytes in the line containing {@code iter},
     * including the paragraph delimiters.
     * @return number of bytes in the line
     */
    public int getBytesInLine() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_get_bytes_in_line.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * The Unicode character at this iterator is returned.
     * <p>
     * Equivalent to operator* on a C++ iterator. If the element at
     * this iterator is a non-character element, such as an image
     * embedded in the buffer, the Unicode “unknown” character 0xFFFC
     * is returned. If invoked on the end iterator, zero is returned;
     * zero is not a valid Unicode character.
     * <p>
     * So you can write a loop which ends when this function returns 0.
     * @return a Unicode character, or 0 if {@code iter} is not dereferenceable
     */
    public int getChar() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_get_char.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the number of characters in the line containing {@code iter},
     * including the paragraph delimiters.
     * @return number of characters in the line
     */
    public int getCharsInLine() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_get_chars_in_line.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * If the location at {@code iter} contains a child anchor, the
     * anchor is returned.
     * <p>
     * Otherwise, {@code null} is returned.
     * @return the anchor at {@code iter}
     */
    public @Nullable org.gtk.gtk.TextChildAnchor getChildAnchor() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_iter_get_child_anchor.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.TextChildAnchor(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the language in effect at {@code iter}.
     * <p>
     * If no tags affecting language apply to {@code iter}, the return
     * value is identical to that of {@link Gtk#getDefaultLanguage}.
     * @return language in effect at {@code iter}
     */
    public @NotNull org.pango.Language getLanguage() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_iter_get_language.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.pango.Language(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns the line number containing the iterator.
     * <p>
     * Lines in a {@code GtkTextBuffer} are numbered beginning
     * with 0 for the first line in the buffer.
     * @return a line number
     */
    public int getLine() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_get_line.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the byte index of the iterator, counting
     * from the start of a newline-terminated line.
     * <p>
     * Remember that {@code GtkTextBuffer} encodes text in
     * UTF-8, and that characters can require a variable
     * number of bytes to represent.
     * @return distance from start of line, in bytes
     */
    public int getLineIndex() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_get_line_index.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the character offset of the iterator,
     * counting from the start of a newline-terminated line.
     * <p>
     * The first character on the line has offset 0.
     * @return offset from start of line
     */
    public int getLineOffset() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_get_line_offset.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns a list of all {@code GtkTextMark} at this location.
     * <p>
     * Because marks are not iterable (they don’t take up any "space"
     * in the buffer, they are just marks in between iterable locations),
     * multiple marks can exist in the same place.
     * <p>
     * The returned list is not in any meaningful order.
     * @return list of {@code GtkTextMark}
     */
    public @NotNull org.gtk.glib.SList getMarks() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_iter_get_marks.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(RESULT, Ownership.CONTAINER);
    }
    
    /**
     * Returns the character offset of an iterator.
     * <p>
     * Each character in a {@code GtkTextBuffer} has an offset,
     * starting with 0 for the first character in the buffer.
     * Use {@code Gtk,TextBuffer#getIterAtOffset} to convert
     * an offset back into an iterator.
     * @return a character offset
     */
    public int getOffset() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_get_offset.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * If the element at {@code iter} is a paintable, the paintable is returned.
     * <p>
     * Otherwise, {@code null} is returned.
     * @return the paintable at {@code iter}
     */
    public @Nullable org.gtk.gdk.Paintable getPaintable() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_iter_get_paintable.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gdk.Paintable.PaintableImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the text in the given range.
     * <p>
     * A “slice” is an array of characters encoded in UTF-8 format,
     * including the Unicode “unknown” character 0xFFFC for iterable
     * non-character elements in the buffer, such as images.
     * Because images are encoded in the slice, byte and
     * character offsets in the returned array will correspond to byte
     * offsets in the text buffer. Note that 0xFFFC can occur in normal
     * text as well, so it is not a reliable indicator that a paintable or
     * widget is in the buffer.
     * @param end iterator at end of a range
     * @return slice of text from the buffer
     */
    public @NotNull java.lang.String getSlice(@NotNull org.gtk.gtk.TextIter end) {
        java.util.Objects.requireNonNull(end, "Parameter 'end' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_iter_get_slice.invokeExact(
                    handle(),
                    end.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns a list of tags that apply to {@code iter}, in ascending order of
     * priority.
     * <p>
     * The highest-priority tags are last.
     * <p>
     * The {@code GtkTextTag}s in the list don’t have a reference added,
     * but you have to free the list itself.
     * @return list of
     *   {@code GtkTextTag}
     */
    public @NotNull org.gtk.glib.SList getTags() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_iter_get_tags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(RESULT, Ownership.CONTAINER);
    }
    
    /**
     * Returns text in the given range.
     * <p>
     * If the range
     * contains non-text elements such as images, the character and byte
     * offsets in the returned string will not correspond to character and
     * byte offsets in the buffer. If you want offsets to correspond, see
     * {@link TextIter#getSlice}.
     * @param end iterator at end of a range
     * @return array of characters from the buffer
     */
    public @NotNull java.lang.String getText(@NotNull org.gtk.gtk.TextIter end) {
        java.util.Objects.requireNonNull(end, "Parameter 'end' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_iter_get_text.invokeExact(
                    handle(),
                    end.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns a list of {@code GtkTextTag} that are toggled on or off at this
     * point.
     * <p>
     * If {@code toggled_on} is {@code true}, the list contains tags that are
     * toggled on. If a tag is toggled on at {@code iter}, then some non-empty
     * range of characters following {@code iter} has that tag applied to it.  If
     * a tag is toggled off, then some non-empty range following {@code iter}
     * does not have the tag applied to it.
     * @param toggledOn {@code true} to get toggled-on tags
     * @return tags
     *   toggled at this point
     */
    public @NotNull org.gtk.glib.SList getToggledTags(boolean toggledOn) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_iter_get_toggled_tags.invokeExact(
                    handle(),
                    toggledOn ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SList(RESULT, Ownership.CONTAINER);
    }
    
    /**
     * Returns the number of bytes from the start of the
     * line to the given {@code iter}, not counting bytes that
     * are invisible due to tags with the “invisible” flag
     * toggled on.
     * @return byte index of {@code iter} with respect to the start of the line
     */
    public int getVisibleLineIndex() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_get_visible_line_index.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the offset in characters from the start of the
     * line to the given {@code iter}, not counting characters that
     * are invisible due to tags with the “invisible” flag
     * toggled on.
     * @return offset in visible characters from the start of the line
     */
    public int getVisibleLineOffset() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_get_visible_line_offset.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns visible text in the given range.
     * <p>
     * Like {@link TextIter#getSlice}, but invisible text
     * is not included. Invisible text is usually invisible because
     * a {@code GtkTextTag} with the “invisible” attribute turned on has
     * been applied to it.
     * @param end iterator at end of range
     * @return slice of text from the buffer
     */
    public @NotNull java.lang.String getVisibleSlice(@NotNull org.gtk.gtk.TextIter end) {
        java.util.Objects.requireNonNull(end, "Parameter 'end' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_iter_get_visible_slice.invokeExact(
                    handle(),
                    end.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns visible text in the given range.
     * <p>
     * Like {@link TextIter#getText}, but invisible text
     * is not included. Invisible text is usually invisible because
     * a {@code GtkTextTag} with the “invisible” attribute turned on has
     * been applied to it.
     * @param end iterator at end of range
     * @return string containing visible text in the
     * range
     */
    public @NotNull java.lang.String getVisibleText(@NotNull org.gtk.gtk.TextIter end) {
        java.util.Objects.requireNonNull(end, "Parameter 'end' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_text_iter_get_visible_text.invokeExact(
                    handle(),
                    end.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Returns {@code true} if {@code iter} points to a character that is part
     * of a range tagged with {@code tag}.
     * <p>
     * See also {@link TextIter#startsTag} and
     * {@link TextIter#endsTag}.
     * @param tag a {@code GtkTextTag}
     * @return whether {@code iter} is tagged with {@code tag}
     */
    public boolean hasTag(@NotNull org.gtk.gtk.TextTag tag) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_has_tag.invokeExact(
                    handle(),
                    tag.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks whether {@code iter} falls in the range [{@code start}, {@code end}).
     * <p>
     * {@code start} and {@code end} must be in ascending order.
     * @param start start of range
     * @param end end of range
     * @return {@code true} if {@code iter} is in the range
     */
    public boolean inRange(@NotNull org.gtk.gtk.TextIter start, @NotNull org.gtk.gtk.TextIter end) {
        java.util.Objects.requireNonNull(start, "Parameter 'start' must not be null");
        java.util.Objects.requireNonNull(end, "Parameter 'end' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_in_range.invokeExact(
                    handle(),
                    start.handle(),
                    end.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Determines whether {@code iter} is inside a sentence (as opposed to in
     * between two sentences, e.g. after a period and before the first
     * letter of the next sentence).
     * <p>
     * Sentence boundaries are determined by Pango and should be correct
     * for nearly any language.
     * @return {@code true} if {@code iter} is inside a sentence.
     */
    public boolean insideSentence() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_inside_sentence.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Determines whether the character pointed by {@code iter} is part of a
     * natural-language word (as opposed to say inside some whitespace).
     * <p>
     * Word breaks are determined by Pango and should be correct
     * for nearly any language.
     * <p>
     * Note that if {@link TextIter#startsWord} returns {@code true},
     * then this function returns {@code true} too, since {@code iter} points to
     * the first character of the word.
     * @return {@code true} if {@code iter} is inside a word
     */
    public boolean insideWord() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_inside_word.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Determine if {@code iter} is at a cursor position.
     * <p>
     * See {@link TextIter#forwardCursorPosition} or
     * {@code Pango.LogAttr] or [func@Pango.break} for details
     * on what a cursor position is.
     * @return {@code true} if the cursor can be placed at {@code iter}
     */
    public boolean isCursorPosition() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_is_cursor_position.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns {@code true} if {@code iter} is the end iterator.
     * <p>
     * This means it is one past the last dereferenceable iterator
     * in the buffer. gtk_text_iter_is_end() is the most efficient
     * way to check whether an iterator is the end iterator.
     * @return whether {@code iter} is the end iterator
     */
    public boolean isEnd() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_is_end.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns {@code true} if {@code iter} is the first iterator in the buffer.
     * @return whether {@code iter} is the first in the buffer
     */
    public boolean isStart() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_is_start.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Swaps the value of {@code first} and {@code second} if {@code second} comes before
     * {@code first} in the buffer.
     * <p>
     * That is, ensures that {@code first} and {@code second} are in sequence.
     * Most text buffer functions that take a range call this
     * automatically on your behalf, so there’s no real reason to
     * call it yourself in those cases. There are some exceptions,
     * such as {@link TextIter#inRange}, that expect a
     * pre-sorted range.
     * @param second another {@code GtkTextIter}
     */
    public void order(@NotNull org.gtk.gtk.TextIter second) {
        java.util.Objects.requireNonNull(second, "Parameter 'second' must not be null");
        try {
            DowncallHandles.gtk_text_iter_order.invokeExact(
                    handle(),
                    second.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Moves iterator {@code iter} to the start of the line {@code line_number}.
     * <p>
     * If {@code line_number} is negative or larger than or equal to the number of lines
     * in the buffer, moves {@code iter} to the start of the last line in the buffer.
     * @param lineNumber line number (counted from 0)
     */
    public void setLine(int lineNumber) {
        try {
            DowncallHandles.gtk_text_iter_set_line.invokeExact(
                    handle(),
                    lineNumber);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Same as gtk_text_iter_set_line_offset(), but works with a
     * byte index. The given byte index must be at
     * the start of a character, it can’t be in the middle of a UTF-8
     * encoded character.
     * @param byteOnLine a byte index relative to the start of {@code iter}’s current line
     */
    public void setLineIndex(int byteOnLine) {
        try {
            DowncallHandles.gtk_text_iter_set_line_index.invokeExact(
                    handle(),
                    byteOnLine);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Moves {@code iter} within a line, to a new character (not byte) offset.
     * <p>
     * The given character offset must be less than or equal to the number
     * of characters in the line; if equal, {@code iter} moves to the start of the
     * next line. See {@link TextIter#setLineIndex} if you have a byte
     * index rather than a character offset.
     * @param charOnLine a character offset relative to the start of {@code iter}’s current line
     */
    public void setLineOffset(int charOnLine) {
        try {
            DowncallHandles.gtk_text_iter_set_line_offset.invokeExact(
                    handle(),
                    charOnLine);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code iter} to point to {@code char_offset}.
     * <p>
     * {@code char_offset} counts from the start
     * of the entire text buffer, starting with 0.
     * @param charOffset a character number
     */
    public void setOffset(int charOffset) {
        try {
            DowncallHandles.gtk_text_iter_set_offset.invokeExact(
                    handle(),
                    charOffset);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Like gtk_text_iter_set_line_index(), but the index is in visible
     * bytes, i.e. text with a tag making it invisible is not counted
     * in the index.
     * @param byteOnLine a byte index
     */
    public void setVisibleLineIndex(int byteOnLine) {
        try {
            DowncallHandles.gtk_text_iter_set_visible_line_index.invokeExact(
                    handle(),
                    byteOnLine);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Like gtk_text_iter_set_line_offset(), but the offset is in visible
     * characters, i.e. text with a tag making it invisible is not
     * counted in the offset.
     * @param charOnLine a character offset
     */
    public void setVisibleLineOffset(int charOnLine) {
        try {
            DowncallHandles.gtk_text_iter_set_visible_line_offset.invokeExact(
                    handle(),
                    charOnLine);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns {@code true} if {@code iter} begins a paragraph.
     * <p>
     * This is the case if {@link TextIter#getLineOffset}
     * would return 0. However this function is potentially more
     * efficient than {@link TextIter#getLineOffset}, because
     * it doesn’t have to compute the offset, it just has to see
     * whether it’s 0.
     * @return whether {@code iter} begins a line
     */
    public boolean startsLine() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_starts_line.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Determines whether {@code iter} begins a sentence.
     * <p>
     * Sentence boundaries are determined by Pango and
     * should be correct for nearly any language.
     * @return {@code true} if {@code iter} is at the start of a sentence.
     */
    public boolean startsSentence() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_starts_sentence.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns {@code true} if {@code tag} is toggled on at exactly this point.
     * <p>
     * If {@code tag} is {@code null}, returns {@code true} if any tag is toggled on at this point.
     * <p>
     * Note that if this function returns {@code true}, it means that
     * {@code iter} is at the beginning of the tagged range, and that the
     * character at {@code iter} is inside the tagged range. In other
     * words, unlike {@link TextIter#endsTag}, if
     * this function returns {@code true}, [method{@code Gtk}.TextIter.has_tag
     * will also return {@code true} for the same parameters.
     * @param tag a {@code GtkTextTag}
     * @return whether {@code iter} is the start of a range tagged with {@code tag}
     */
    public boolean startsTag(@Nullable org.gtk.gtk.TextTag tag) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_starts_tag.invokeExact(
                    handle(),
                    (Addressable) (tag == null ? MemoryAddress.NULL : tag.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Determines whether {@code iter} begins a natural-language word.
     * <p>
     * Word breaks are determined by Pango and should be correct
     * for nearly any language.
     * @return {@code true} if {@code iter} is at the start of a word
     */
    public boolean startsWord() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_starts_word.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Gets whether a range with {@code tag} applied to it begins
     * or ends at {@code iter}.
     * <p>
     * This is equivalent to (gtk_text_iter_starts_tag() ||
     * gtk_text_iter_ends_tag())
     * @param tag a {@code GtkTextTag}
     * @return whether {@code tag} is toggled on or off at {@code iter}
     */
    public boolean togglesTag(@Nullable org.gtk.gtk.TextTag tag) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_text_iter_toggles_tag.invokeExact(
                    handle(),
                    (Addressable) (tag == null ? MemoryAddress.NULL : tag.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_text_iter_assign = Interop.downcallHandle(
            "gtk_text_iter_assign",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_backward_char = Interop.downcallHandle(
            "gtk_text_iter_backward_char",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_backward_chars = Interop.downcallHandle(
            "gtk_text_iter_backward_chars",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_text_iter_backward_cursor_position = Interop.downcallHandle(
            "gtk_text_iter_backward_cursor_position",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_backward_cursor_positions = Interop.downcallHandle(
            "gtk_text_iter_backward_cursor_positions",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_text_iter_backward_find_char = Interop.downcallHandle(
            "gtk_text_iter_backward_find_char",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_backward_line = Interop.downcallHandle(
            "gtk_text_iter_backward_line",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_backward_lines = Interop.downcallHandle(
            "gtk_text_iter_backward_lines",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_text_iter_backward_search = Interop.downcallHandle(
            "gtk_text_iter_backward_search",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_backward_sentence_start = Interop.downcallHandle(
            "gtk_text_iter_backward_sentence_start",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_backward_sentence_starts = Interop.downcallHandle(
            "gtk_text_iter_backward_sentence_starts",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_text_iter_backward_to_tag_toggle = Interop.downcallHandle(
            "gtk_text_iter_backward_to_tag_toggle",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_backward_visible_cursor_position = Interop.downcallHandle(
            "gtk_text_iter_backward_visible_cursor_position",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_backward_visible_cursor_positions = Interop.downcallHandle(
            "gtk_text_iter_backward_visible_cursor_positions",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_text_iter_backward_visible_line = Interop.downcallHandle(
            "gtk_text_iter_backward_visible_line",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_backward_visible_lines = Interop.downcallHandle(
            "gtk_text_iter_backward_visible_lines",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_text_iter_backward_visible_word_start = Interop.downcallHandle(
            "gtk_text_iter_backward_visible_word_start",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_backward_visible_word_starts = Interop.downcallHandle(
            "gtk_text_iter_backward_visible_word_starts",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_text_iter_backward_word_start = Interop.downcallHandle(
            "gtk_text_iter_backward_word_start",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_backward_word_starts = Interop.downcallHandle(
            "gtk_text_iter_backward_word_starts",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_text_iter_can_insert = Interop.downcallHandle(
            "gtk_text_iter_can_insert",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_text_iter_compare = Interop.downcallHandle(
            "gtk_text_iter_compare",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_copy = Interop.downcallHandle(
            "gtk_text_iter_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_editable = Interop.downcallHandle(
            "gtk_text_iter_editable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_text_iter_ends_line = Interop.downcallHandle(
            "gtk_text_iter_ends_line",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_ends_sentence = Interop.downcallHandle(
            "gtk_text_iter_ends_sentence",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_ends_tag = Interop.downcallHandle(
            "gtk_text_iter_ends_tag",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_ends_word = Interop.downcallHandle(
            "gtk_text_iter_ends_word",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_equal = Interop.downcallHandle(
            "gtk_text_iter_equal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_forward_char = Interop.downcallHandle(
            "gtk_text_iter_forward_char",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_forward_chars = Interop.downcallHandle(
            "gtk_text_iter_forward_chars",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_text_iter_forward_cursor_position = Interop.downcallHandle(
            "gtk_text_iter_forward_cursor_position",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_forward_cursor_positions = Interop.downcallHandle(
            "gtk_text_iter_forward_cursor_positions",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_text_iter_forward_find_char = Interop.downcallHandle(
            "gtk_text_iter_forward_find_char",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_forward_line = Interop.downcallHandle(
            "gtk_text_iter_forward_line",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_forward_lines = Interop.downcallHandle(
            "gtk_text_iter_forward_lines",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_text_iter_forward_search = Interop.downcallHandle(
            "gtk_text_iter_forward_search",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_forward_sentence_end = Interop.downcallHandle(
            "gtk_text_iter_forward_sentence_end",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_forward_sentence_ends = Interop.downcallHandle(
            "gtk_text_iter_forward_sentence_ends",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_text_iter_forward_to_end = Interop.downcallHandle(
            "gtk_text_iter_forward_to_end",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_forward_to_line_end = Interop.downcallHandle(
            "gtk_text_iter_forward_to_line_end",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_forward_to_tag_toggle = Interop.downcallHandle(
            "gtk_text_iter_forward_to_tag_toggle",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_forward_visible_cursor_position = Interop.downcallHandle(
            "gtk_text_iter_forward_visible_cursor_position",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_forward_visible_cursor_positions = Interop.downcallHandle(
            "gtk_text_iter_forward_visible_cursor_positions",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_text_iter_forward_visible_line = Interop.downcallHandle(
            "gtk_text_iter_forward_visible_line",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_forward_visible_lines = Interop.downcallHandle(
            "gtk_text_iter_forward_visible_lines",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_text_iter_forward_visible_word_end = Interop.downcallHandle(
            "gtk_text_iter_forward_visible_word_end",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_forward_visible_word_ends = Interop.downcallHandle(
            "gtk_text_iter_forward_visible_word_ends",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_text_iter_forward_word_end = Interop.downcallHandle(
            "gtk_text_iter_forward_word_end",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_forward_word_ends = Interop.downcallHandle(
            "gtk_text_iter_forward_word_ends",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_text_iter_free = Interop.downcallHandle(
            "gtk_text_iter_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_get_buffer = Interop.downcallHandle(
            "gtk_text_iter_get_buffer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_get_bytes_in_line = Interop.downcallHandle(
            "gtk_text_iter_get_bytes_in_line",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_get_char = Interop.downcallHandle(
            "gtk_text_iter_get_char",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_get_chars_in_line = Interop.downcallHandle(
            "gtk_text_iter_get_chars_in_line",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_get_child_anchor = Interop.downcallHandle(
            "gtk_text_iter_get_child_anchor",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_get_language = Interop.downcallHandle(
            "gtk_text_iter_get_language",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_get_line = Interop.downcallHandle(
            "gtk_text_iter_get_line",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_get_line_index = Interop.downcallHandle(
            "gtk_text_iter_get_line_index",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_get_line_offset = Interop.downcallHandle(
            "gtk_text_iter_get_line_offset",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_get_marks = Interop.downcallHandle(
            "gtk_text_iter_get_marks",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_get_offset = Interop.downcallHandle(
            "gtk_text_iter_get_offset",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_get_paintable = Interop.downcallHandle(
            "gtk_text_iter_get_paintable",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_get_slice = Interop.downcallHandle(
            "gtk_text_iter_get_slice",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_get_tags = Interop.downcallHandle(
            "gtk_text_iter_get_tags",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_get_text = Interop.downcallHandle(
            "gtk_text_iter_get_text",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_get_toggled_tags = Interop.downcallHandle(
            "gtk_text_iter_get_toggled_tags",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_text_iter_get_visible_line_index = Interop.downcallHandle(
            "gtk_text_iter_get_visible_line_index",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_get_visible_line_offset = Interop.downcallHandle(
            "gtk_text_iter_get_visible_line_offset",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_get_visible_slice = Interop.downcallHandle(
            "gtk_text_iter_get_visible_slice",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_get_visible_text = Interop.downcallHandle(
            "gtk_text_iter_get_visible_text",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_has_tag = Interop.downcallHandle(
            "gtk_text_iter_has_tag",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_in_range = Interop.downcallHandle(
            "gtk_text_iter_in_range",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_inside_sentence = Interop.downcallHandle(
            "gtk_text_iter_inside_sentence",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_inside_word = Interop.downcallHandle(
            "gtk_text_iter_inside_word",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_is_cursor_position = Interop.downcallHandle(
            "gtk_text_iter_is_cursor_position",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_is_end = Interop.downcallHandle(
            "gtk_text_iter_is_end",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_is_start = Interop.downcallHandle(
            "gtk_text_iter_is_start",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_order = Interop.downcallHandle(
            "gtk_text_iter_order",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_set_line = Interop.downcallHandle(
            "gtk_text_iter_set_line",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_text_iter_set_line_index = Interop.downcallHandle(
            "gtk_text_iter_set_line_index",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_text_iter_set_line_offset = Interop.downcallHandle(
            "gtk_text_iter_set_line_offset",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_text_iter_set_offset = Interop.downcallHandle(
            "gtk_text_iter_set_offset",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_text_iter_set_visible_line_index = Interop.downcallHandle(
            "gtk_text_iter_set_visible_line_index",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_text_iter_set_visible_line_offset = Interop.downcallHandle(
            "gtk_text_iter_set_visible_line_offset",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gtk_text_iter_starts_line = Interop.downcallHandle(
            "gtk_text_iter_starts_line",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_starts_sentence = Interop.downcallHandle(
            "gtk_text_iter_starts_sentence",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_starts_tag = Interop.downcallHandle(
            "gtk_text_iter_starts_tag",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_starts_word = Interop.downcallHandle(
            "gtk_text_iter_starts_word",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_text_iter_toggles_tag = Interop.downcallHandle(
            "gtk_text_iter_toggles_tag",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private TextIter struct;
        
         /**
         * A {@link TextIter.Build} object constructs a {@link TextIter} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = TextIter.allocate();
        }
        
         /**
         * Finish building the {@link TextIter} struct.
         * @return A new instance of {@code TextIter} with the fields 
         *         that were set in the Build object.
         */
        public TextIter construct() {
            return struct;
        }
        
        public Build setDummy1(java.lang.foreign.MemoryAddress dummy1) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dummy1"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dummy1 == null ? MemoryAddress.NULL : (Addressable) dummy1));
            return this;
        }
        
        public Build setDummy2(java.lang.foreign.MemoryAddress dummy2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dummy2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dummy2 == null ? MemoryAddress.NULL : (Addressable) dummy2));
            return this;
        }
        
        public Build setDummy3(int dummy3) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dummy3"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), dummy3);
            return this;
        }
        
        public Build setDummy4(int dummy4) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dummy4"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), dummy4);
            return this;
        }
        
        public Build setDummy5(int dummy5) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dummy5"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), dummy5);
            return this;
        }
        
        public Build setDummy6(int dummy6) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dummy6"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), dummy6);
            return this;
        }
        
        public Build setDummy7(int dummy7) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dummy7"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), dummy7);
            return this;
        }
        
        public Build setDummy8(int dummy8) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dummy8"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), dummy8);
            return this;
        }
        
        public Build setDummy9(java.lang.foreign.MemoryAddress dummy9) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dummy9"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dummy9 == null ? MemoryAddress.NULL : (Addressable) dummy9));
            return this;
        }
        
        public Build setDummy10(java.lang.foreign.MemoryAddress dummy10) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dummy10"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dummy10 == null ? MemoryAddress.NULL : (Addressable) dummy10));
            return this;
        }
        
        public Build setDummy11(int dummy11) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dummy11"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), dummy11);
            return this;
        }
        
        public Build setDummy12(int dummy12) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dummy12"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), dummy12);
            return this;
        }
        
        public Build setDummy13(int dummy13) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dummy13"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), dummy13);
            return this;
        }
        
        public Build setDummy14(java.lang.foreign.MemoryAddress dummy14) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dummy14"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dummy14 == null ? MemoryAddress.NULL : (Addressable) dummy14));
            return this;
        }
    }
}
