package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An iterator for the contents of a {@code GtkTextBuffer}.
 * <p>
 * You may wish to begin by reading the
 * <a href="section-text-widget.html">text widget conceptual overview</a>,
 * which gives an overview of all the objects and data types
 * related to the text widget and how they work together.
 */
public class TextIter extends io.github.jwharm.javagi.ResourceBase {

    public TextIter(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public TextIter() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GtkTextIter.allocate(Interop.getAllocator()).address()));
    }
    
    /**
     * Assigns the value of {@code other} to {@code iter}.
     * <p>
     * This function is not useful in applications, because
     * iterators can be assigned with {@code GtkTextIter i = j;}.
     * <p>
     * The function is used by language bindings.
     */
    public void assign(TextIter other) {
        gtk_h.gtk_text_iter_assign(handle(), other.handle());
    }
    
    /**
     * Moves backward by one character offset.
     * <p>
     * Returns {@code true} if movement was possible; if {@code iter} was the first
     * in the buffer (character offset 0), this function returns {@code false}
     * for convenience when writing loops.
     */
    public boolean backwardChar() {
        var RESULT = gtk_h.gtk_text_iter_backward_char(handle());
        return (RESULT != 0);
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
     */
    public boolean backwardChars(int count) {
        var RESULT = gtk_h.gtk_text_iter_backward_chars(handle(), count);
        return (RESULT != 0);
    }
    
    /**
     * Like gtk_text_iter_forward_cursor_position(), but moves backward.
     */
    public boolean backwardCursorPosition() {
        var RESULT = gtk_h.gtk_text_iter_backward_cursor_position(handle());
        return (RESULT != 0);
    }
    
    /**
     * Moves up to {@code count} cursor positions.
     * <p>
     * See {@link TextIter#forwardCursorPosition} for details.
     */
    public boolean backwardCursorPositions(int count) {
        var RESULT = gtk_h.gtk_text_iter_backward_cursor_positions(handle(), count);
        return (RESULT != 0);
    }
    
    /**
     * Same as gtk_text_iter_forward_find_char(),
     * but goes backward from {@code iter}.
     */
    public boolean backwardFindChar(TextCharPredicate pred, TextIter limit) {
        try {
            var RESULT = gtk_h.gtk_text_iter_backward_find_char(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTextCharPredicate",
                            MethodType.methodType(boolean.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(pred.hashCode(), pred)), limit.handle());
            return (RESULT != 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
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
     */
    public boolean backwardLine() {
        var RESULT = gtk_h.gtk_text_iter_backward_line(handle());
        return (RESULT != 0);
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
     */
    public boolean backwardLines(int count) {
        var RESULT = gtk_h.gtk_text_iter_backward_lines(handle(), count);
        return (RESULT != 0);
    }
    
    /**
     * Same as gtk_text_iter_forward_search(), but moves backward.
     * <p>
     * {@code match_end} will never be set to a {@code GtkTextIter} located after {@code iter},
     * even if there is a possible {@code match_start} before or at {@code iter}.
     */
    public boolean backwardSearch(java.lang.String str, int flags, TextIter matchStart, TextIter matchEnd, TextIter limit) {
        var RESULT = gtk_h.gtk_text_iter_backward_search(handle(), Interop.allocateNativeString(str).handle(), flags, matchStart.handle(), matchEnd.handle(), limit.handle());
        return (RESULT != 0);
    }
    
    /**
     * Moves backward to the previous sentence start.
     * <p>
     * If {@code iter} is already at the start of a sentence, moves backward
     * to the next one.
     * <p>
     * Sentence boundaries are determined by Pango and should
     * be correct for nearly any language.
     */
    public boolean backwardSentenceStart() {
        var RESULT = gtk_h.gtk_text_iter_backward_sentence_start(handle());
        return (RESULT != 0);
    }
    
    /**
     * Calls gtk_text_iter_backward_sentence_start() up to {@code count} times.
     * <p>
     * If {@code count} is negative, moves forward instead of backward.
     */
    public boolean backwardSentenceStarts(int count) {
        var RESULT = gtk_h.gtk_text_iter_backward_sentence_starts(handle(), count);
        return (RESULT != 0);
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
     */
    public boolean backwardToTagToggle(TextTag tag) {
        var RESULT = gtk_h.gtk_text_iter_backward_to_tag_toggle(handle(), tag.handle());
        return (RESULT != 0);
    }
    
    /**
     * Moves {@code iter} forward to the previous visible cursor position.
     * <p>
     * See {@link TextIter#backwardCursorPosition} for details.
     */
    public boolean backwardVisibleCursorPosition() {
        var RESULT = gtk_h.gtk_text_iter_backward_visible_cursor_position(handle());
        return (RESULT != 0);
    }
    
    /**
     * Moves up to {@code count} visible cursor positions.
     * <p>
     * See {@link TextIter#backwardCursorPosition} for details.
     */
    public boolean backwardVisibleCursorPositions(int count) {
        var RESULT = gtk_h.gtk_text_iter_backward_visible_cursor_positions(handle(), count);
        return (RESULT != 0);
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
     */
    public boolean backwardVisibleLine() {
        var RESULT = gtk_h.gtk_text_iter_backward_visible_line(handle());
        return (RESULT != 0);
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
     */
    public boolean backwardVisibleLines(int count) {
        var RESULT = gtk_h.gtk_text_iter_backward_visible_lines(handle(), count);
        return (RESULT != 0);
    }
    
    /**
     * Moves backward to the previous visible word start.
     * <p>
     * If {@code iter} is currently on a word start, moves backward to the
     * next one after that.
     * <p>
     * Word breaks are determined by Pango and should be correct
     * for nearly any language.
     */
    public boolean backwardVisibleWordStart() {
        var RESULT = gtk_h.gtk_text_iter_backward_visible_word_start(handle());
        return (RESULT != 0);
    }
    
    /**
     * Calls gtk_text_iter_backward_visible_word_start() up to {@code count} times.
     */
    public boolean backwardVisibleWordStarts(int count) {
        var RESULT = gtk_h.gtk_text_iter_backward_visible_word_starts(handle(), count);
        return (RESULT != 0);
    }
    
    /**
     * Moves backward to the previous word start.
     * <p>
     * If {@code iter} is currently on a word start, moves backward to the
     * next one after that.
     * <p>
     * Word breaks are determined by Pango and should be correct
     * for nearly any language
     */
    public boolean backwardWordStart() {
        var RESULT = gtk_h.gtk_text_iter_backward_word_start(handle());
        return (RESULT != 0);
    }
    
    /**
     * Calls gtk_text_iter_backward_word_start() up to {@code count} times.
     */
    public boolean backwardWordStarts(int count) {
        var RESULT = gtk_h.gtk_text_iter_backward_word_starts(handle(), count);
        return (RESULT != 0);
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
     */
    public boolean canInsert(boolean defaultEditability) {
        var RESULT = gtk_h.gtk_text_iter_can_insert(handle(), defaultEditability ? 1 : 0);
        return (RESULT != 0);
    }
    
    /**
     * A qsort()-style function that returns negative if {@code lhs} is less than
     * {@code rhs}, positive if {@code lhs} is greater than {@code rhs}, and 0 if they’re equal.
     * <p>
     * Ordering is in character offset order, i.e. the first character
     * in the buffer is less than the second character in the buffer.
     */
    public int compare(TextIter rhs) {
        var RESULT = gtk_h.gtk_text_iter_compare(handle(), rhs.handle());
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
     */
    public TextIter copy() {
        var RESULT = gtk_h.gtk_text_iter_copy(handle());
        return new TextIter(References.get(RESULT, true));
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
     */
    public boolean editable(boolean defaultSetting) {
        var RESULT = gtk_h.gtk_text_iter_editable(handle(), defaultSetting ? 1 : 0);
        return (RESULT != 0);
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
     */
    public boolean endsLine() {
        var RESULT = gtk_h.gtk_text_iter_ends_line(handle());
        return (RESULT != 0);
    }
    
    /**
     * Determines whether {@code iter} ends a sentence.
     * <p>
     * Sentence boundaries are determined by Pango and should
     * be correct for nearly any language.
     */
    public boolean endsSentence() {
        var RESULT = gtk_h.gtk_text_iter_ends_sentence(handle());
        return (RESULT != 0);
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
     */
    public boolean endsTag(TextTag tag) {
        var RESULT = gtk_h.gtk_text_iter_ends_tag(handle(), tag.handle());
        return (RESULT != 0);
    }
    
    /**
     * Determines whether {@code iter} ends a natural-language word.
     * <p>
     * Word breaks are determined by Pango and should be correct
     * for nearly any language.
     */
    public boolean endsWord() {
        var RESULT = gtk_h.gtk_text_iter_ends_word(handle());
        return (RESULT != 0);
    }
    
    /**
     * Tests whether two iterators are equal, using the fastest possible
     * mechanism.
     * <p>
     * This function is very fast; you can expect it to perform
     * better than e.g. getting the character offset for each
     * iterator and comparing the offsets yourself. Also, it’s a
     * bit faster than {@link TextIter#compare}.
     */
    public boolean equal(TextIter rhs) {
        var RESULT = gtk_h.gtk_text_iter_equal(handle(), rhs.handle());
        return (RESULT != 0);
    }
    
    /**
     * Moves {@code iter} forward by one character offset.
     * <p>
     * Note that images embedded in the buffer occupy 1 character slot, so
     * this function may actually move onto an image instead of a character,
     * if you have images in your buffer. If {@code iter} is the end iterator or
     * one character before it, {@code iter} will now point at the end iterator,
     * and this function returns {@code false} for convenience when writing loops.
     */
    public boolean forwardChar() {
        var RESULT = gtk_h.gtk_text_iter_forward_char(handle());
        return (RESULT != 0);
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
     */
    public boolean forwardChars(int count) {
        var RESULT = gtk_h.gtk_text_iter_forward_chars(handle(), count);
        return (RESULT != 0);
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
     * See also the {@code Pango.break}
     * function.
     */
    public boolean forwardCursorPosition() {
        var RESULT = gtk_h.gtk_text_iter_forward_cursor_position(handle());
        return (RESULT != 0);
    }
    
    /**
     * Moves up to {@code count} cursor positions.
     * <p>
     * See {@link TextIter#forwardCursorPosition} for details.
     */
    public boolean forwardCursorPositions(int count) {
        var RESULT = gtk_h.gtk_text_iter_forward_cursor_positions(handle(), count);
        return (RESULT != 0);
    }
    
    /**
     * Advances {@code iter}, calling {@code pred} on each character.
     * <p>
     * If {@code pred} returns {@code true}, returns {@code true} and stops scanning.
     * If {@code pred} never returns {@code true}, {@code iter} is set to {@code limit} if
     * {@code limit} is non-{@code null}, otherwise to the end iterator.
     */
    public boolean forwardFindChar(TextCharPredicate pred, TextIter limit) {
        try {
            var RESULT = gtk_h.gtk_text_iter_forward_find_char(handle(), 
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbTextCharPredicate",
                            MethodType.methodType(boolean.class, int.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_BOOLEAN, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(pred.hashCode(), pred)), limit.handle());
            return (RESULT != 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Moves {@code iter} to the start of the next line.
     * <p>
     * If the iter is already on the last line of the buffer,
     * moves the iter to the end of the current line. If after
     * the operation, the iter is at the end of the buffer and not
     * dereferenceable, returns {@code false}. Otherwise, returns {@code true}.
     */
    public boolean forwardLine() {
        var RESULT = gtk_h.gtk_text_iter_forward_line(handle());
        return (RESULT != 0);
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
     */
    public boolean forwardLines(int count) {
        var RESULT = gtk_h.gtk_text_iter_forward_lines(handle(), count);
        return (RESULT != 0);
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
     */
    public boolean forwardSearch(java.lang.String str, int flags, TextIter matchStart, TextIter matchEnd, TextIter limit) {
        var RESULT = gtk_h.gtk_text_iter_forward_search(handle(), Interop.allocateNativeString(str).handle(), flags, matchStart.handle(), matchEnd.handle(), limit.handle());
        return (RESULT != 0);
    }
    
    /**
     * Moves forward to the next sentence end.
     * <p>
     * If {@code iter} is at the end of a sentence, moves to the next
     * end of sentence.
     * <p>
     * Sentence boundaries are determined by Pango and should
     * be correct for nearly any language.
     */
    public boolean forwardSentenceEnd() {
        var RESULT = gtk_h.gtk_text_iter_forward_sentence_end(handle());
        return (RESULT != 0);
    }
    
    /**
     * Calls gtk_text_iter_forward_sentence_end() {@code count} times.
     * <p>
     * If {@code count} is negative, moves backward instead of forward.
     */
    public boolean forwardSentenceEnds(int count) {
        var RESULT = gtk_h.gtk_text_iter_forward_sentence_ends(handle(), count);
        return (RESULT != 0);
    }
    
    /**
     * Moves {@code iter} forward to the “end iterator”, which points
     * one past the last valid character in the buffer.
     * <p>
     * gtk_text_iter_get_char() called on the end iterator
     * returns 0, which is convenient for writing loops.
     */
    public void forwardToEnd() {
        gtk_h.gtk_text_iter_forward_to_end(handle());
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
     */
    public boolean forwardToLineEnd() {
        var RESULT = gtk_h.gtk_text_iter_forward_to_line_end(handle());
        return (RESULT != 0);
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
     */
    public boolean forwardToTagToggle(TextTag tag) {
        var RESULT = gtk_h.gtk_text_iter_forward_to_tag_toggle(handle(), tag.handle());
        return (RESULT != 0);
    }
    
    /**
     * Moves {@code iter} forward to the next visible cursor position.
     * <p>
     * See {@link TextIter#forwardCursorPosition} for details.
     */
    public boolean forwardVisibleCursorPosition() {
        var RESULT = gtk_h.gtk_text_iter_forward_visible_cursor_position(handle());
        return (RESULT != 0);
    }
    
    /**
     * Moves up to {@code count} visible cursor positions.
     * <p>
     * See {@link TextIter#forwardCursorPosition} for details.
     */
    public boolean forwardVisibleCursorPositions(int count) {
        var RESULT = gtk_h.gtk_text_iter_forward_visible_cursor_positions(handle(), count);
        return (RESULT != 0);
    }
    
    /**
     * Moves {@code iter} to the start of the next visible line.
     * <p>
     * Returns {@code true} if there
     * was a next line to move to, and {@code false} if {@code iter} was simply moved to
     * the end of the buffer and is now not dereferenceable, or if {@code iter} was
     * already at the end of the buffer.
     */
    public boolean forwardVisibleLine() {
        var RESULT = gtk_h.gtk_text_iter_forward_visible_line(handle());
        return (RESULT != 0);
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
     */
    public boolean forwardVisibleLines(int count) {
        var RESULT = gtk_h.gtk_text_iter_forward_visible_lines(handle(), count);
        return (RESULT != 0);
    }
    
    /**
     * Moves forward to the next visible word end.
     * <p>
     * If {@code iter} is currently on a word end, moves forward to the
     * next one after that.
     * <p>
     * Word breaks are determined by Pango and should be correct
     * for nearly any language
     */
    public boolean forwardVisibleWordEnd() {
        var RESULT = gtk_h.gtk_text_iter_forward_visible_word_end(handle());
        return (RESULT != 0);
    }
    
    /**
     * Calls gtk_text_iter_forward_visible_word_end() up to {@code count} times.
     */
    public boolean forwardVisibleWordEnds(int count) {
        var RESULT = gtk_h.gtk_text_iter_forward_visible_word_ends(handle(), count);
        return (RESULT != 0);
    }
    
    /**
     * Moves forward to the next word end.
     * <p>
     * If {@code iter} is currently on a word end, moves forward to the
     * next one after that.
     * <p>
     * Word breaks are determined by Pango and should be correct
     * for nearly any language.
     */
    public boolean forwardWordEnd() {
        var RESULT = gtk_h.gtk_text_iter_forward_word_end(handle());
        return (RESULT != 0);
    }
    
    /**
     * Calls gtk_text_iter_forward_word_end() up to {@code count} times.
     */
    public boolean forwardWordEnds(int count) {
        var RESULT = gtk_h.gtk_text_iter_forward_word_ends(handle(), count);
        return (RESULT != 0);
    }
    
    /**
     * Free an iterator allocated on the heap.
     * <p>
     * This function is intended for use in language bindings,
     * and is not especially useful for applications, because
     * iterators can simply be allocated on the stack.
     */
    public void free() {
        gtk_h.gtk_text_iter_free(handle());
    }
    
    /**
     * Returns the {@code GtkTextBuffer} this iterator is associated with.
     */
    public TextBuffer getBuffer() {
        var RESULT = gtk_h.gtk_text_iter_get_buffer(handle());
        return new TextBuffer(References.get(RESULT, false));
    }
    
    /**
     * Returns the number of bytes in the line containing {@code iter},
     * including the paragraph delimiters.
     */
    public int getBytesInLine() {
        var RESULT = gtk_h.gtk_text_iter_get_bytes_in_line(handle());
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
     */
    public int getChar() {
        var RESULT = gtk_h.gtk_text_iter_get_char(handle());
        return RESULT;
    }
    
    /**
     * Returns the number of characters in the line containing {@code iter},
     * including the paragraph delimiters.
     */
    public int getCharsInLine() {
        var RESULT = gtk_h.gtk_text_iter_get_chars_in_line(handle());
        return RESULT;
    }
    
    /**
     * If the location at {@code iter} contains a child anchor, the
     * anchor is returned.
     * <p>
     * Otherwise, {@code null} is returned.
     */
    public TextChildAnchor getChildAnchor() {
        var RESULT = gtk_h.gtk_text_iter_get_child_anchor(handle());
        return new TextChildAnchor(References.get(RESULT, false));
    }
    
    /**
     * Returns the language in effect at {@code iter}.
     * <p>
     * If no tags affecting language apply to {@code iter}, the return
     * value is identical to that of {@link Gtk#getDefaultLanguage}.
     */
    public org.pango.Language getLanguage() {
        var RESULT = gtk_h.gtk_text_iter_get_language(handle());
        return new org.pango.Language(References.get(RESULT, true));
    }
    
    /**
     * Returns the line number containing the iterator.
     * <p>
     * Lines in a {@code GtkTextBuffer} are numbered beginning
     * with 0 for the first line in the buffer.
     */
    public int getLine() {
        var RESULT = gtk_h.gtk_text_iter_get_line(handle());
        return RESULT;
    }
    
    /**
     * Returns the byte index of the iterator, counting
     * from the start of a newline-terminated line.
     * <p>
     * Remember that {@code GtkTextBuffer} encodes text in
     * UTF-8, and that characters can require a variable
     * number of bytes to represent.
     */
    public int getLineIndex() {
        var RESULT = gtk_h.gtk_text_iter_get_line_index(handle());
        return RESULT;
    }
    
    /**
     * Returns the character offset of the iterator,
     * counting from the start of a newline-terminated line.
     * <p>
     * The first character on the line has offset 0.
     */
    public int getLineOffset() {
        var RESULT = gtk_h.gtk_text_iter_get_line_offset(handle());
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
     */
    public org.gtk.glib.SList getMarks() {
        var RESULT = gtk_h.gtk_text_iter_get_marks(handle());
        return new org.gtk.glib.SList(References.get(RESULT, false));
    }
    
    /**
     * Returns the character offset of an iterator.
     * <p>
     * Each character in a {@code GtkTextBuffer} has an offset,
     * starting with 0 for the first character in the buffer.
     * Use {@link gtk,textbuffer.get_iter_at_offset#null} to convert
     * an offset back into an iterator.
     */
    public int getOffset() {
        var RESULT = gtk_h.gtk_text_iter_get_offset(handle());
        return RESULT;
    }
    
    /**
     * If the element at {@code iter} is a paintable, the paintable is returned.
     * <p>
     * Otherwise, {@code null} is returned.
     */
    public org.gtk.gdk.Paintable getPaintable() {
        var RESULT = gtk_h.gtk_text_iter_get_paintable(handle());
        return new org.gtk.gdk.Paintable.PaintableImpl(References.get(RESULT, false));
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
     */
    public java.lang.String getSlice(TextIter end) {
        var RESULT = gtk_h.gtk_text_iter_get_slice(handle(), end.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns a list of tags that apply to {@code iter}, in ascending order of
     * priority.
     * <p>
     * The highest-priority tags are last.
     * <p>
     * The {@code GtkTextTag}s in the list don’t have a reference added,
     * but you have to free the list itself.
     */
    public org.gtk.glib.SList getTags() {
        var RESULT = gtk_h.gtk_text_iter_get_tags(handle());
        return new org.gtk.glib.SList(References.get(RESULT, false));
    }
    
    /**
     * Returns text in the given range.
     * <p>
     * If the range
     * contains non-text elements such as images, the character and byte
     * offsets in the returned string will not correspond to character and
     * byte offsets in the buffer. If you want offsets to correspond, see
     * {@link TextIter#getSlice}.
     */
    public java.lang.String getText(TextIter end) {
        var RESULT = gtk_h.gtk_text_iter_get_text(handle(), end.handle());
        return RESULT.getUtf8String(0);
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
     */
    public org.gtk.glib.SList getToggledTags(boolean toggledOn) {
        var RESULT = gtk_h.gtk_text_iter_get_toggled_tags(handle(), toggledOn ? 1 : 0);
        return new org.gtk.glib.SList(References.get(RESULT, false));
    }
    
    /**
     * Returns the number of bytes from the start of the
     * line to the given {@code iter}, not counting bytes that
     * are invisible due to tags with the “invisible” flag
     * toggled on.
     */
    public int getVisibleLineIndex() {
        var RESULT = gtk_h.gtk_text_iter_get_visible_line_index(handle());
        return RESULT;
    }
    
    /**
     * Returns the offset in characters from the start of the
     * line to the given {@code iter}, not counting characters that
     * are invisible due to tags with the “invisible” flag
     * toggled on.
     */
    public int getVisibleLineOffset() {
        var RESULT = gtk_h.gtk_text_iter_get_visible_line_offset(handle());
        return RESULT;
    }
    
    /**
     * Returns visible text in the given range.
     * <p>
     * Like {@link TextIter#getSlice}, but invisible text
     * is not included. Invisible text is usually invisible because
     * a {@code GtkTextTag} with the “invisible” attribute turned on has
     * been applied to it.
     */
    public java.lang.String getVisibleSlice(TextIter end) {
        var RESULT = gtk_h.gtk_text_iter_get_visible_slice(handle(), end.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns visible text in the given range.
     * <p>
     * Like {@link TextIter#getText}, but invisible text
     * is not included. Invisible text is usually invisible because
     * a {@code GtkTextTag} with the “invisible” attribute turned on has
     * been applied to it.
     */
    public java.lang.String getVisibleText(TextIter end) {
        var RESULT = gtk_h.gtk_text_iter_get_visible_text(handle(), end.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns {@code true} if {@code iter} points to a character that is part
     * of a range tagged with {@code tag}.
     * <p>
     * See also {@link TextIter#startsTag} and
     * {@link TextIter#endsTag}.
     */
    public boolean hasTag(TextTag tag) {
        var RESULT = gtk_h.gtk_text_iter_has_tag(handle(), tag.handle());
        return (RESULT != 0);
    }
    
    /**
     * Checks whether {@code iter} falls in the range [{@code start}, {@code end}).
     * <p>
     * {@code start} and {@code end} must be in ascending order.
     */
    public boolean inRange(TextIter start, TextIter end) {
        var RESULT = gtk_h.gtk_text_iter_in_range(handle(), start.handle(), end.handle());
        return (RESULT != 0);
    }
    
    /**
     * Determines whether {@code iter} is inside a sentence (as opposed to in
     * between two sentences, e.g. after a period and before the first
     * letter of the next sentence).
     * <p>
     * Sentence boundaries are determined by Pango and should be correct
     * for nearly any language.
     */
    public boolean insideSentence() {
        var RESULT = gtk_h.gtk_text_iter_inside_sentence(handle());
        return (RESULT != 0);
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
     */
    public boolean insideWord() {
        var RESULT = gtk_h.gtk_text_iter_inside_word(handle());
        return (RESULT != 0);
    }
    
    /**
     * Determine if {@code iter} is at a cursor position.
     * <p>
     * See {@link TextIter#forwardCursorPosition} or
     * {@code Pango.break} for details
     * on what a cursor position is.
     */
    public boolean isCursorPosition() {
        var RESULT = gtk_h.gtk_text_iter_is_cursor_position(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns {@code true} if {@code iter} is the end iterator.
     * <p>
     * This means it is one past the last dereferenceable iterator
     * in the buffer. gtk_text_iter_is_end() is the most efficient
     * way to check whether an iterator is the end iterator.
     */
    public boolean isEnd() {
        var RESULT = gtk_h.gtk_text_iter_is_end(handle());
        return (RESULT != 0);
    }
    
    /**
     * Returns {@code true} if {@code iter} is the first iterator in the buffer.
     */
    public boolean isStart() {
        var RESULT = gtk_h.gtk_text_iter_is_start(handle());
        return (RESULT != 0);
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
     */
    public void order(TextIter second) {
        gtk_h.gtk_text_iter_order(handle(), second.handle());
    }
    
    /**
     * Moves iterator {@code iter} to the start of the line {@code line_number}.
     * <p>
     * If {@code line_number} is negative or larger than or equal to the number of lines
     * in the buffer, moves {@code iter} to the start of the last line in the buffer.
     */
    public void setLine(int lineNumber) {
        gtk_h.gtk_text_iter_set_line(handle(), lineNumber);
    }
    
    /**
     * Same as gtk_text_iter_set_line_offset(), but works with a
     * byte index. The given byte index must be at
     * the start of a character, it can’t be in the middle of a UTF-8
     * encoded character.
     */
    public void setLineIndex(int byteOnLine) {
        gtk_h.gtk_text_iter_set_line_index(handle(), byteOnLine);
    }
    
    /**
     * Moves {@code iter} within a line, to a new character (not byte) offset.
     * <p>
     * The given character offset must be less than or equal to the number
     * of characters in the line; if equal, {@code iter} moves to the start of the
     * next line. See {@link TextIter#setLineIndex} if you have a byte
     * index rather than a character offset.
     */
    public void setLineOffset(int charOnLine) {
        gtk_h.gtk_text_iter_set_line_offset(handle(), charOnLine);
    }
    
    /**
     * Sets {@code iter} to point to {@code char_offset}.
     * <p>
     * {@code char_offset} counts from the start
     * of the entire text buffer, starting with 0.
     */
    public void setOffset(int charOffset) {
        gtk_h.gtk_text_iter_set_offset(handle(), charOffset);
    }
    
    /**
     * Like gtk_text_iter_set_line_index(), but the index is in visible
     * bytes, i.e. text with a tag making it invisible is not counted
     * in the index.
     */
    public void setVisibleLineIndex(int byteOnLine) {
        gtk_h.gtk_text_iter_set_visible_line_index(handle(), byteOnLine);
    }
    
    /**
     * Like gtk_text_iter_set_line_offset(), but the offset is in visible
     * characters, i.e. text with a tag making it invisible is not
     * counted in the offset.
     */
    public void setVisibleLineOffset(int charOnLine) {
        gtk_h.gtk_text_iter_set_visible_line_offset(handle(), charOnLine);
    }
    
    /**
     * Returns {@code true} if {@code iter} begins a paragraph.
     * <p>
     * This is the case if {@link TextIter#getLineOffset}
     * would return 0. However this function is potentially more
     * efficient than {@link TextIter#getLineOffset}, because
     * it doesn’t have to compute the offset, it just has to see
     * whether it’s 0.
     */
    public boolean startsLine() {
        var RESULT = gtk_h.gtk_text_iter_starts_line(handle());
        return (RESULT != 0);
    }
    
    /**
     * Determines whether {@code iter} begins a sentence.
     * <p>
     * Sentence boundaries are determined by Pango and
     * should be correct for nearly any language.
     */
    public boolean startsSentence() {
        var RESULT = gtk_h.gtk_text_iter_starts_sentence(handle());
        return (RESULT != 0);
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
     */
    public boolean startsTag(TextTag tag) {
        var RESULT = gtk_h.gtk_text_iter_starts_tag(handle(), tag.handle());
        return (RESULT != 0);
    }
    
    /**
     * Determines whether {@code iter} begins a natural-language word.
     * <p>
     * Word breaks are determined by Pango and should be correct
     * for nearly any language.
     */
    public boolean startsWord() {
        var RESULT = gtk_h.gtk_text_iter_starts_word(handle());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether a range with {@code tag} applied to it begins
     * or ends at {@code iter}.
     * <p>
     * This is equivalent to (gtk_text_iter_starts_tag() ||
     * gtk_text_iter_ends_tag())
     */
    public boolean togglesTag(TextTag tag) {
        var RESULT = gtk_h.gtk_text_iter_toggles_tag(handle(), tag.handle());
        return (RESULT != 0);
    }
    
}
