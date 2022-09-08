package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An iterator for the contents of a `GtkTextBuffer`.
 * 
 * You may wish to begin by reading the
 * [text widget conceptual overview](section-text-widget.html),
 * which gives an overview of all the objects and data types
 * related to the text widget and how they work together.
 */
public class TextIter extends io.github.jwharm.javagi.interop.ResourceBase {

    public TextIter(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Assigns the value of @other to @iter.
     * 
     * This function is not useful in applications, because
     * iterators can be assigned with `GtkTextIter i = j;`.
     * 
     * The function is used by language bindings.
     */
    public void assign(TextIter other) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_assign(HANDLE(), other.HANDLE());
    }
    
    /**
     * Moves backward by one character offset.
     * 
     * Returns %TRUE if movement was possible; if @iter was the first
     * in the buffer (character offset 0), this function returns %FALSE
     * for convenience when writing loops.
     */
    public boolean backwardChar() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_backward_char(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Moves @count characters backward, if possible.
     * 
     * If @count would move past the start or end of the buffer, moves
     * to the start or end of the buffer.
     * 
     * The return value indicates whether the iterator moved
     * onto a dereferenceable position; if the iterator didn’t move, or
     * moved onto the end iterator, then %FALSE is returned. If @count is 0,
     * the function does nothing and returns %FALSE.
     */
    public boolean backwardChars(int count) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_backward_chars(HANDLE(), count);
        return (RESULT != 0);
    }
    
    /**
     * Like gtk_text_iter_forward_cursor_position(), but moves backward.
     */
    public boolean backwardCursorPosition() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_backward_cursor_position(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Moves up to @count cursor positions.
     * 
     * See [method@Gtk.TextIter.forward_cursor_position] for details.
     */
    public boolean backwardCursorPositions(int count) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_backward_cursor_positions(HANDLE(), count);
        return (RESULT != 0);
    }
    
    /**
     * Moves @iter to the start of the previous line.
     * 
     * Returns %TRUE if @iter could be moved; i.e. if @iter was at
     * character offset 0, this function returns %FALSE. Therefore,
     * if @iter was already on line 0, but not at the start of the line,
     * @iter is snapped to the start of the line and the function returns
     * %TRUE. (Note that this implies that
     * in a loop calling this function, the line number may not change on
     * every iteration, if your first iteration is on line 0.)
     */
    public boolean backwardLine() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_backward_line(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Moves @count lines backward, if possible.
     * 
     * If @count would move past the start or end of the buffer, moves to
     * the start or end of the buffer.
     * 
     * The return value indicates whether the iterator moved
     * onto a dereferenceable position; if the iterator didn’t move, or
     * moved onto the end iterator, then %FALSE is returned. If @count is 0,
     * the function does nothing and returns %FALSE. If @count is negative,
     * moves forward by 0 - @count lines.
     */
    public boolean backwardLines(int count) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_backward_lines(HANDLE(), count);
        return (RESULT != 0);
    }
    
    /**
     * Same as gtk_text_iter_forward_search(), but moves backward.
     * 
     * @match_end will never be set to a `GtkTextIter` located after @iter,
     * even if there is a possible @match_start before or at @iter.
     */
    public boolean backwardSearch(java.lang.String str, int flags, TextIter matchStart, TextIter matchEnd, TextIter limit) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_backward_search(HANDLE(), Interop.allocateNativeString(str).HANDLE(), flags, matchStart.HANDLE(), matchEnd.HANDLE(), limit.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Moves backward to the previous sentence start.
     * 
     * If @iter is already at the start of a sentence, moves backward
     * to the next one.
     * 
     * Sentence boundaries are determined by Pango and should
     * be correct for nearly any language.
     */
    public boolean backwardSentenceStart() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_backward_sentence_start(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Calls gtk_text_iter_backward_sentence_start() up to @count times.
     * 
     * If @count is negative, moves forward instead of backward.
     */
    public boolean backwardSentenceStarts(int count) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_backward_sentence_starts(HANDLE(), count);
        return (RESULT != 0);
    }
    
    /**
     * Moves backward to the next toggle (on or off) of the
     * @tag, or to the next toggle of any tag if
     * @tag is %NULL.
     * 
     * If no matching tag toggles are found,
     * returns %FALSE, otherwise %TRUE. Does not return toggles
     * located at @iter, only toggles before @iter. Sets @iter
     * to the location of the toggle, or the start of the buffer
     * if no toggle is found.
     */
    public boolean backwardToTagToggle(TextTag tag) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_backward_to_tag_toggle(HANDLE(), tag.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Moves @iter forward to the previous visible cursor position.
     * 
     * See [method@Gtk.TextIter.backward_cursor_position] for details.
     */
    public boolean backwardVisibleCursorPosition() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_backward_visible_cursor_position(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Moves up to @count visible cursor positions.
     * 
     * See [method@Gtk.TextIter.backward_cursor_position] for details.
     */
    public boolean backwardVisibleCursorPositions(int count) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_backward_visible_cursor_positions(HANDLE(), count);
        return (RESULT != 0);
    }
    
    /**
     * Moves @iter to the start of the previous visible line.
     * 
     * Returns %TRUE if
     * @iter could be moved; i.e. if @iter was at character offset 0, this
     * function returns %FALSE. Therefore if @iter was already on line 0,
     * but not at the start of the line, @iter is snapped to the start of
     * the line and the function returns %TRUE. (Note that this implies that
     * in a loop calling this function, the line number may not change on
     * every iteration, if your first iteration is on line 0.)
     */
    public boolean backwardVisibleLine() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_backward_visible_line(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Moves @count visible lines backward, if possible.
     * 
     * If @count would move past the start or end of the buffer, moves to
     * the start or end of the buffer.
     * 
     * The return value indicates whether the iterator moved
     * onto a dereferenceable position; if the iterator didn’t move, or
     * moved onto the end iterator, then %FALSE is returned. If @count is 0,
     * the function does nothing and returns %FALSE. If @count is negative,
     * moves forward by 0 - @count lines.
     */
    public boolean backwardVisibleLines(int count) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_backward_visible_lines(HANDLE(), count);
        return (RESULT != 0);
    }
    
    /**
     * Moves backward to the previous visible word start.
     * 
     * If @iter is currently on a word start, moves backward to the
     * next one after that.
     * 
     * Word breaks are determined by Pango and should be correct
     * for nearly any language.
     */
    public boolean backwardVisibleWordStart() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_backward_visible_word_start(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Calls gtk_text_iter_backward_visible_word_start() up to @count times.
     */
    public boolean backwardVisibleWordStarts(int count) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_backward_visible_word_starts(HANDLE(), count);
        return (RESULT != 0);
    }
    
    /**
     * Moves backward to the previous word start.
     * 
     * If @iter is currently on a word start, moves backward to the
     * next one after that.
     * 
     * Word breaks are determined by Pango and should be correct
     * for nearly any language
     */
    public boolean backwardWordStart() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_backward_word_start(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Calls gtk_text_iter_backward_word_start() up to @count times.
     */
    public boolean backwardWordStarts(int count) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_backward_word_starts(HANDLE(), count);
        return (RESULT != 0);
    }
    
    /**
     * Considering the default editability of the buffer, and tags that
     * affect editability, determines whether text inserted at @iter would
     * be editable.
     * 
     * If text inserted at @iter would be editable then the
     * user should be allowed to insert text at @iter.
     * [method@Gtk.TextBuffer.insert_interactive] uses this function
     * to decide whether insertions are allowed at a given position.
     */
    public boolean canInsert(boolean defaultEditability) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_can_insert(HANDLE(), defaultEditability ? 1 : 0);
        return (RESULT != 0);
    }
    
    /**
     * A qsort()-style function that returns negative if @lhs is less than
     * @rhs, positive if @lhs is greater than @rhs, and 0 if they’re equal.
     * 
     * Ordering is in character offset order, i.e. the first character
     * in the buffer is less than the second character in the buffer.
     */
    public int compare(TextIter rhs) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_compare(HANDLE(), rhs.HANDLE());
        return RESULT;
    }
    
    /**
     * Creates a dynamically-allocated copy of an iterator.
     * 
     * This function is not useful in applications, because
     * iterators can be copied with a simple assignment
     * (`GtkTextIter i = j;`).
     * 
     * The function is used by language bindings.
     */
    public TextIter copy() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_copy(HANDLE());
        return new TextIter(References.get(RESULT, true));
    }
    
    /**
     * Returns whether the character at @iter is within an editable region
     * of text.
     * 
     * Non-editable text is “locked” and can’t be changed by the
     * user via `GtkTextView`. If no tags applied to this text affect
     * editability, @default_setting will be returned.
     * 
     * You don’t want to use this function to decide whether text can be
     * inserted at @iter, because for insertion you don’t want to know
     * whether the char at @iter is inside an editable range, you want to
     * know whether a new character inserted at @iter would be inside an
     * editable range. Use [method@Gtk.TextIter.can_insert] to handle this
     * case.
     */
    public boolean editable(boolean defaultSetting) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_editable(HANDLE(), defaultSetting ? 1 : 0);
        return (RESULT != 0);
    }
    
    /**
     * Returns %TRUE if @iter points to the start of the paragraph
     * delimiter characters for a line.
     * 
     * Delimiters will be either a newline, a carriage return, a carriage
     * return followed by a newline, or a Unicode paragraph separator
     * character.
     * 
     * Note that an iterator pointing to the \\n of a \\r\\n pair will not be
     * counted as the end of a line, the line ends before the \\r. The end
     * iterator is considered to be at the end of a line, even though there
     * are no paragraph delimiter chars there.
     */
    public boolean endsLine() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_ends_line(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Determines whether @iter ends a sentence.
     * 
     * Sentence boundaries are determined by Pango and should
     * be correct for nearly any language.
     */
    public boolean endsSentence() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_ends_sentence(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns %TRUE if @tag is toggled off at exactly this point.
     * 
     * If @tag is %NULL, returns %TRUE if any tag is toggled off at this point.
     * 
     * Note that if this function returns %TRUE, it means that
     * @iter is at the end of the tagged range, but that the character
     * at @iter is outside the tagged range. In other words,
     * unlike [method@Gtk.TextIter.starts_tag], if this function
     * returns %TRUE, [method@Gtk.TextIter.has_tag] will return
     * %FALSE for the same parameters.
     */
    public boolean endsTag(TextTag tag) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_ends_tag(HANDLE(), tag.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Determines whether @iter ends a natural-language word.
     * 
     * Word breaks are determined by Pango and should be correct
     * for nearly any language.
     */
    public boolean endsWord() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_ends_word(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Tests whether two iterators are equal, using the fastest possible
     * mechanism.
     * 
     * This function is very fast; you can expect it to perform
     * better than e.g. getting the character offset for each
     * iterator and comparing the offsets yourself. Also, it’s a
     * bit faster than [method@Gtk.TextIter.compare].
     */
    public boolean equal(TextIter rhs) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_equal(HANDLE(), rhs.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Moves @iter forward by one character offset.
     * 
     * Note that images embedded in the buffer occupy 1 character slot, so
     * this function may actually move onto an image instead of a character,
     * if you have images in your buffer. If @iter is the end iterator or
     * one character before it, @iter will now point at the end iterator,
     * and this function returns %FALSE for convenience when writing loops.
     */
    public boolean forwardChar() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_forward_char(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Moves @count characters if possible.
     * 
     * If @count would move past the start or end of the buffer,
     * moves to the start or end of the buffer.
     * 
     * The return value indicates whether the new position of
     * @iter is different from its original position, and dereferenceable
     * (the last iterator in the buffer is not dereferenceable). If @count
     * is 0, the function does nothing and returns %FALSE.
     */
    public boolean forwardChars(int count) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_forward_chars(HANDLE(), count);
        return (RESULT != 0);
    }
    
    /**
     * Moves @iter forward by a single cursor position.
     * 
     * Cursor positions are (unsurprisingly) positions where the
     * cursor can appear. Perhaps surprisingly, there may not be
     * a cursor position between all characters. The most common
     * example for European languages would be a carriage return/newline
     * sequence.
     * 
     * For some Unicode characters, the equivalent of say the letter “a”
     * with an accent mark will be represented as two characters, first
     * the letter then a "combining mark" that causes the accent to be
     * rendered; so the cursor can’t go between those two characters.
     * 
     * See also the [struct@Pango.LogAttr] struct and the [func@Pango.break]
     * function.
     */
    public boolean forwardCursorPosition() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_forward_cursor_position(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Moves up to @count cursor positions.
     * 
     * See [method@Gtk.TextIter.forward_cursor_position] for details.
     */
    public boolean forwardCursorPositions(int count) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_forward_cursor_positions(HANDLE(), count);
        return (RESULT != 0);
    }
    
    /**
     * Moves @iter to the start of the next line.
     * 
     * If the iter is already on the last line of the buffer,
     * moves the iter to the end of the current line. If after
     * the operation, the iter is at the end of the buffer and not
     * dereferenceable, returns %FALSE. Otherwise, returns %TRUE.
     */
    public boolean forwardLine() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_forward_line(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Moves @count lines forward, if possible.
     * 
     * If @count would move past the start or end of the buffer, moves to
     * the start or end of the buffer.
     * 
     * The return value indicates whether the iterator moved
     * onto a dereferenceable position; if the iterator didn’t move, or
     * moved onto the end iterator, then %FALSE is returned. If @count is 0,
     * the function does nothing and returns %FALSE. If @count is negative,
     * moves backward by 0 - @count lines.
     */
    public boolean forwardLines(int count) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_forward_lines(HANDLE(), count);
        return (RESULT != 0);
    }
    
    /**
     * Searches forward for @str.
     * 
     * Any match is returned by setting @match_start to the first character
     * of the match and @match_end to the first character after the match.
     * The search will not continue past @limit. Note that a search is a
     * linear or O(n) operation, so you may wish to use @limit to avoid
     * locking up your UI on large buffers.
     * 
     * @match_start will never be set to a `GtkTextIter` located before @iter,
     * even if there is a possible @match_end after or at @iter.
     */
    public boolean forwardSearch(java.lang.String str, int flags, TextIter matchStart, TextIter matchEnd, TextIter limit) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_forward_search(HANDLE(), Interop.allocateNativeString(str).HANDLE(), flags, matchStart.HANDLE(), matchEnd.HANDLE(), limit.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Moves forward to the next sentence end.
     * 
     * If @iter is at the end of a sentence, moves to the next
     * end of sentence.
     * 
     * Sentence boundaries are determined by Pango and should
     * be correct for nearly any language.
     */
    public boolean forwardSentenceEnd() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_forward_sentence_end(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Calls gtk_text_iter_forward_sentence_end() @count times.
     * 
     * If @count is negative, moves backward instead of forward.
     */
    public boolean forwardSentenceEnds(int count) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_forward_sentence_ends(HANDLE(), count);
        return (RESULT != 0);
    }
    
    /**
     * Moves @iter forward to the “end iterator”, which points
     * one past the last valid character in the buffer.
     * 
     * gtk_text_iter_get_char() called on the end iterator
     * returns 0, which is convenient for writing loops.
     */
    public void forwardToEnd() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_forward_to_end(HANDLE());
    }
    
    /**
     * Moves the iterator to point to the paragraph delimiter characters.
     * 
     * The possible characters are either a newline, a carriage return,
     * a carriage return/newline in sequence, or the Unicode paragraph
     * separator character.
     * 
     * If the iterator is already at the paragraph delimiter
     * characters, moves to the paragraph delimiter characters for the
     * next line. If @iter is on the last line in the buffer, which does
     * not end in paragraph delimiters, moves to the end iterator (end of
     * the last line), and returns %FALSE.
     */
    public boolean forwardToLineEnd() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_forward_to_line_end(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Moves forward to the next toggle (on or off) of the
     * @tag, or to the next toggle of any tag if
     * @tag is %NULL.
     * 
     * If no matching tag toggles are found,
     * returns %FALSE, otherwise %TRUE. Does not return toggles
     * located at @iter, only toggles after @iter. Sets @iter to
     * the location of the toggle, or to the end of the buffer
     * if no toggle is found.
     */
    public boolean forwardToTagToggle(TextTag tag) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_forward_to_tag_toggle(HANDLE(), tag.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Moves @iter forward to the next visible cursor position.
     * 
     * See [method@Gtk.TextIter.forward_cursor_position] for details.
     */
    public boolean forwardVisibleCursorPosition() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_forward_visible_cursor_position(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Moves up to @count visible cursor positions.
     * 
     * See [method@Gtk.TextIter.forward_cursor_position] for details.
     */
    public boolean forwardVisibleCursorPositions(int count) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_forward_visible_cursor_positions(HANDLE(), count);
        return (RESULT != 0);
    }
    
    /**
     * Moves @iter to the start of the next visible line.
     * 
     * Returns %TRUE if there
     * was a next line to move to, and %FALSE if @iter was simply moved to
     * the end of the buffer and is now not dereferenceable, or if @iter was
     * already at the end of the buffer.
     */
    public boolean forwardVisibleLine() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_forward_visible_line(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Moves @count visible lines forward, if possible.
     * 
     * If @count would move past the start or end of the buffer, moves to
     * the start or end of the buffer.
     * 
     * The return value indicates whether the iterator moved
     * onto a dereferenceable position; if the iterator didn’t move, or
     * moved onto the end iterator, then %FALSE is returned. If @count is 0,
     * the function does nothing and returns %FALSE. If @count is negative,
     * moves backward by 0 - @count lines.
     */
    public boolean forwardVisibleLines(int count) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_forward_visible_lines(HANDLE(), count);
        return (RESULT != 0);
    }
    
    /**
     * Moves forward to the next visible word end.
     * 
     * If @iter is currently on a word end, moves forward to the
     * next one after that.
     * 
     * Word breaks are determined by Pango and should be correct
     * for nearly any language
     */
    public boolean forwardVisibleWordEnd() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_forward_visible_word_end(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Calls gtk_text_iter_forward_visible_word_end() up to @count times.
     */
    public boolean forwardVisibleWordEnds(int count) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_forward_visible_word_ends(HANDLE(), count);
        return (RESULT != 0);
    }
    
    /**
     * Moves forward to the next word end.
     * 
     * If @iter is currently on a word end, moves forward to the
     * next one after that.
     * 
     * Word breaks are determined by Pango and should be correct
     * for nearly any language.
     */
    public boolean forwardWordEnd() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_forward_word_end(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Calls gtk_text_iter_forward_word_end() up to @count times.
     */
    public boolean forwardWordEnds(int count) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_forward_word_ends(HANDLE(), count);
        return (RESULT != 0);
    }
    
    /**
     * Free an iterator allocated on the heap.
     * 
     * This function is intended for use in language bindings,
     * and is not especially useful for applications, because
     * iterators can simply be allocated on the stack.
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_free(HANDLE());
    }
    
    /**
     * Returns the `GtkTextBuffer` this iterator is associated with.
     */
    public TextBuffer getBuffer() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_get_buffer(HANDLE());
        return new TextBuffer(References.get(RESULT, false));
    }
    
    /**
     * Returns the number of bytes in the line containing @iter,
     * including the paragraph delimiters.
     */
    public int getBytesInLine() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_get_bytes_in_line(HANDLE());
        return RESULT;
    }
    
    /**
     * The Unicode character at this iterator is returned.
     * 
     * Equivalent to operator* on a C++ iterator. If the element at
     * this iterator is a non-character element, such as an image
     * embedded in the buffer, the Unicode “unknown” character 0xFFFC
     * is returned. If invoked on the end iterator, zero is returned;
     * zero is not a valid Unicode character.
     * 
     * So you can write a loop which ends when this function returns 0.
     */
    public int getChar() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_get_char(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the number of characters in the line containing @iter,
     * including the paragraph delimiters.
     */
    public int getCharsInLine() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_get_chars_in_line(HANDLE());
        return RESULT;
    }
    
    /**
     * If the location at @iter contains a child anchor, the
     * anchor is returned.
     * 
     * Otherwise, %NULL is returned.
     */
    public TextChildAnchor getChildAnchor() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_get_child_anchor(HANDLE());
        return new TextChildAnchor(References.get(RESULT, false));
    }
    
    /**
     * Returns the language in effect at @iter.
     * 
     * If no tags affecting language apply to @iter, the return
     * value is identical to that of [func@Gtk.get_default_language].
     */
    public org.pango.Language getLanguage() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_get_language(HANDLE());
        return new org.pango.Language(References.get(RESULT, true));
    }
    
    /**
     * Returns the line number containing the iterator.
     * 
     * Lines in a `GtkTextBuffer` are numbered beginning
     * with 0 for the first line in the buffer.
     */
    public int getLine() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_get_line(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the byte index of the iterator, counting
     * from the start of a newline-terminated line.
     * 
     * Remember that `GtkTextBuffer` encodes text in
     * UTF-8, and that characters can require a variable
     * number of bytes to represent.
     */
    public int getLineIndex() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_get_line_index(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the character offset of the iterator,
     * counting from the start of a newline-terminated line.
     * 
     * The first character on the line has offset 0.
     */
    public int getLineOffset() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_get_line_offset(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns a list of all `GtkTextMark` at this location.
     * 
     * Because marks are not iterable (they don’t take up any "space"
     * in the buffer, they are just marks in between iterable locations),
     * multiple marks can exist in the same place.
     * 
     * The returned list is not in any meaningful order.
     */
    public org.gtk.glib.SList getMarks() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_get_marks(HANDLE());
        return new org.gtk.glib.SList(References.get(RESULT, false));
    }
    
    /**
     * Returns the character offset of an iterator.
     * 
     * Each character in a `GtkTextBuffer` has an offset,
     * starting with 0 for the first character in the buffer.
     * Use [method@Gtk,TextBuffer.get_iter_at_offset] to convert
     * an offset back into an iterator.
     */
    public int getOffset() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_get_offset(HANDLE());
        return RESULT;
    }
    
    /**
     * If the element at @iter is a paintable, the paintable is returned.
     * 
     * Otherwise, %NULL is returned.
     */
    public org.gtk.gdk.Paintable getPaintable() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_get_paintable(HANDLE());
        return new org.gtk.gdk.Paintable.PaintableImpl(References.get(RESULT, false));
    }
    
    /**
     * Returns the text in the given range.
     * 
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_get_slice(HANDLE(), end.HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns a list of tags that apply to @iter, in ascending order of
     * priority.
     * 
     * The highest-priority tags are last.
     * 
     * The `GtkTextTag`s in the list don’t have a reference added,
     * but you have to free the list itself.
     */
    public org.gtk.glib.SList getTags() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_get_tags(HANDLE());
        return new org.gtk.glib.SList(References.get(RESULT, false));
    }
    
    /**
     * Returns text in the given range.
     * 
     * If the range
     * contains non-text elements such as images, the character and byte
     * offsets in the returned string will not correspond to character and
     * byte offsets in the buffer. If you want offsets to correspond, see
     * [method@Gtk.TextIter.get_slice].
     */
    public java.lang.String getText(TextIter end) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_get_text(HANDLE(), end.HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns a list of `GtkTextTag` that are toggled on or off at this
     * point.
     * 
     * If @toggled_on is %TRUE, the list contains tags that are
     * toggled on. If a tag is toggled on at @iter, then some non-empty
     * range of characters following @iter has that tag applied to it.  If
     * a tag is toggled off, then some non-empty range following @iter
     * does not have the tag applied to it.
     */
    public org.gtk.glib.SList getToggledTags(boolean toggledOn) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_get_toggled_tags(HANDLE(), toggledOn ? 1 : 0);
        return new org.gtk.glib.SList(References.get(RESULT, false));
    }
    
    /**
     * Returns the number of bytes from the start of the
     * line to the given @iter, not counting bytes that
     * are invisible due to tags with the “invisible” flag
     * toggled on.
     */
    public int getVisibleLineIndex() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_get_visible_line_index(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the offset in characters from the start of the
     * line to the given @iter, not counting characters that
     * are invisible due to tags with the “invisible” flag
     * toggled on.
     */
    public int getVisibleLineOffset() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_get_visible_line_offset(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns visible text in the given range.
     * 
     * Like [method@Gtk.TextIter.get_slice], but invisible text
     * is not included. Invisible text is usually invisible because
     * a `GtkTextTag` with the “invisible” attribute turned on has
     * been applied to it.
     */
    public java.lang.String getVisibleSlice(TextIter end) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_get_visible_slice(HANDLE(), end.HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns visible text in the given range.
     * 
     * Like [method@Gtk.TextIter.get_text], but invisible text
     * is not included. Invisible text is usually invisible because
     * a `GtkTextTag` with the “invisible” attribute turned on has
     * been applied to it.
     */
    public java.lang.String getVisibleText(TextIter end) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_get_visible_text(HANDLE(), end.HANDLE());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Returns %TRUE if @iter points to a character that is part
     * of a range tagged with @tag.
     * 
     * See also [method@Gtk.TextIter.starts_tag] and
     * [method@Gtk.TextIter.ends_tag].
     */
    public boolean hasTag(TextTag tag) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_has_tag(HANDLE(), tag.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Checks whether @iter falls in the range [@start, @end).
     * 
     * @start and @end must be in ascending order.
     */
    public boolean inRange(TextIter start, TextIter end) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_in_range(HANDLE(), start.HANDLE(), end.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Determines whether @iter is inside a sentence (as opposed to in
     * between two sentences, e.g. after a period and before the first
     * letter of the next sentence).
     * 
     * Sentence boundaries are determined by Pango and should be correct
     * for nearly any language.
     */
    public boolean insideSentence() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_inside_sentence(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Determines whether the character pointed by @iter is part of a
     * natural-language word (as opposed to say inside some whitespace).
     * 
     * Word breaks are determined by Pango and should be correct
     * for nearly any language.
     * 
     * Note that if [method@Gtk.TextIter.starts_word] returns %TRUE,
     * then this function returns %TRUE too, since @iter points to
     * the first character of the word.
     */
    public boolean insideWord() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_inside_word(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Determine if @iter is at a cursor position.
     * 
     * See [method@Gtk.TextIter.forward_cursor_position] or
     * [struct@Pango.LogAttr] or [func@Pango.break] for details
     * on what a cursor position is.
     */
    public boolean isCursorPosition() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_is_cursor_position(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns %TRUE if @iter is the end iterator.
     * 
     * This means it is one past the last dereferenceable iterator
     * in the buffer. gtk_text_iter_is_end() is the most efficient
     * way to check whether an iterator is the end iterator.
     */
    public boolean isEnd() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_is_end(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns %TRUE if @iter is the first iterator in the buffer.
     */
    public boolean isStart() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_is_start(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Swaps the value of @first and @second if @second comes before
     * @first in the buffer.
     * 
     * That is, ensures that @first and @second are in sequence.
     * Most text buffer functions that take a range call this
     * automatically on your behalf, so there’s no real reason to
     * call it yourself in those cases. There are some exceptions,
     * such as [method@Gtk.TextIter.in_range], that expect a
     * pre-sorted range.
     */
    public void order(TextIter second) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_order(HANDLE(), second.HANDLE());
    }
    
    /**
     * Moves iterator @iter to the start of the line @line_number.
     * 
     * If @line_number is negative or larger than or equal to the number of lines
     * in the buffer, moves @iter to the start of the last line in the buffer.
     */
    public void setLine(int lineNumber) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_set_line(HANDLE(), lineNumber);
    }
    
    /**
     * Same as gtk_text_iter_set_line_offset(), but works with a
     * byte index. The given byte index must be at
     * the start of a character, it can’t be in the middle of a UTF-8
     * encoded character.
     */
    public void setLineIndex(int byteOnLine) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_set_line_index(HANDLE(), byteOnLine);
    }
    
    /**
     * Moves @iter within a line, to a new character (not byte) offset.
     * 
     * The given character offset must be less than or equal to the number
     * of characters in the line; if equal, @iter moves to the start of the
     * next line. See [method@Gtk.TextIter.set_line_index] if you have a byte
     * index rather than a character offset.
     */
    public void setLineOffset(int charOnLine) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_set_line_offset(HANDLE(), charOnLine);
    }
    
    /**
     * Sets @iter to point to @char_offset.
     * 
     * @char_offset counts from the start
     * of the entire text buffer, starting with 0.
     */
    public void setOffset(int charOffset) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_set_offset(HANDLE(), charOffset);
    }
    
    /**
     * Like gtk_text_iter_set_line_index(), but the index is in visible
     * bytes, i.e. text with a tag making it invisible is not counted
     * in the index.
     */
    public void setVisibleLineIndex(int byteOnLine) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_set_visible_line_index(HANDLE(), byteOnLine);
    }
    
    /**
     * Like gtk_text_iter_set_line_offset(), but the offset is in visible
     * characters, i.e. text with a tag making it invisible is not
     * counted in the offset.
     */
    public void setVisibleLineOffset(int charOnLine) {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_set_visible_line_offset(HANDLE(), charOnLine);
    }
    
    /**
     * Returns %TRUE if @iter begins a paragraph.
     * 
     * This is the case if [method@Gtk.TextIter.get_line_offset]
     * would return 0. However this function is potentially more
     * efficient than [method@Gtk.TextIter.get_line_offset], because
     * it doesn’t have to compute the offset, it just has to see
     * whether it’s 0.
     */
    public boolean startsLine() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_starts_line(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Determines whether @iter begins a sentence.
     * 
     * Sentence boundaries are determined by Pango and
     * should be correct for nearly any language.
     */
    public boolean startsSentence() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_starts_sentence(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns %TRUE if @tag is toggled on at exactly this point.
     * 
     * If @tag is %NULL, returns %TRUE if any tag is toggled on at this point.
     * 
     * Note that if this function returns %TRUE, it means that
     * @iter is at the beginning of the tagged range, and that the
     * character at @iter is inside the tagged range. In other
     * words, unlike [method@Gtk.TextIter.ends_tag], if
     * this function returns %TRUE, [method@Gtk.TextIter.has_tag
     * will also return %TRUE for the same parameters.
     */
    public boolean startsTag(TextTag tag) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_starts_tag(HANDLE(), tag.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Determines whether @iter begins a natural-language word.
     * 
     * Word breaks are determined by Pango and should be correct
     * for nearly any language.
     */
    public boolean startsWord() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_starts_word(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Gets whether a range with @tag applied to it begins
     * or ends at @iter.
     * 
     * This is equivalent to (gtk_text_iter_starts_tag() ||
     * gtk_text_iter_ends_tag())
     */
    public boolean togglesTag(TextTag tag) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_text_iter_toggles_tag(HANDLE(), tag.HANDLE());
        return (RESULT != 0);
    }
    
}
