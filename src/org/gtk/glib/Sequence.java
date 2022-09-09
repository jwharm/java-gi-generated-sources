package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GSequence struct is an opaque data type representing a
 * [sequence][glib-Sequences] data type.
 */
public class Sequence extends io.github.jwharm.javagi.interop.ResourceBase {

    public Sequence(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Adds a new item to the end of @seq.
     */
    public SequenceIter append(jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_sequence_append(handle(), data);
        return new SequenceIter(References.get(RESULT, false));
    }
    
    /**
     * Frees the memory allocated for @seq. If @seq has a data destroy
     * function associated with it, that function is called on all items
     * in @seq.
     */
    public void free() {
        gtk_h.g_sequence_free(handle());
    }
    
    /**
     * Returns the begin iterator for @seq.
     */
    public SequenceIter getBeginIter() {
        var RESULT = gtk_h.g_sequence_get_begin_iter(handle());
        return new SequenceIter(References.get(RESULT, false));
    }
    
    /**
     * Returns the end iterator for @seg
     */
    public SequenceIter getEndIter() {
        var RESULT = gtk_h.g_sequence_get_end_iter(handle());
        return new SequenceIter(References.get(RESULT, false));
    }
    
    /**
     * Returns the iterator at position @pos. If @pos is negative or larger
     * than the number of items in @seq, the end iterator is returned.
     */
    public SequenceIter getIterAtPos(int pos) {
        var RESULT = gtk_h.g_sequence_get_iter_at_pos(handle(), pos);
        return new SequenceIter(References.get(RESULT, false));
    }
    
    /**
     * Returns the positive length (>= 0) of @seq. Note that this method is
     * O(h) where `h' is the height of the tree. It is thus more efficient
     * to use g_sequence_is_empty() when comparing the length to zero.
     */
    public int getLength() {
        var RESULT = gtk_h.g_sequence_get_length(handle());
        return RESULT;
    }
    
    /**
     * Returns %TRUE if the sequence contains zero items.
     * 
     * This function is functionally identical to checking the result of
     * g_sequence_get_length() being equal to zero. However this function is
     * implemented in O(1) running time.
     */
    public boolean isEmpty() {
        var RESULT = gtk_h.g_sequence_is_empty(handle());
        return (RESULT != 0);
    }
    
    /**
     * Adds a new item to the front of @seq
     */
    public SequenceIter prepend(jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_sequence_prepend(handle(), data);
        return new SequenceIter(References.get(RESULT, false));
    }
    
    /**
     * Returns the data that @iter points to.
     */
    public static jdk.incubator.foreign.MemoryAddress get(SequenceIter iter) {
        var RESULT = gtk_h.g_sequence_get(iter.handle());
        return RESULT;
    }
    
    /**
     * Inserts a new item just before the item pointed to by @iter.
     */
    public static SequenceIter insertBefore(SequenceIter iter, jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = gtk_h.g_sequence_insert_before(iter.handle(), data);
        return new SequenceIter(References.get(RESULT, false));
    }
    
    /**
     * Moves the item pointed to by @src to the position indicated by @dest.
     * After calling this function @dest will point to the position immediately
     * after @src. It is allowed for @src and @dest to point into different
     * sequences.
     */
    public static void move(SequenceIter src, SequenceIter dest) {
        gtk_h.g_sequence_move(src.handle(), dest.handle());
    }
    
    /**
     * Inserts the (@begin, @end) range at the destination pointed to by @dest.
     * The @begin and @end iters must point into the same sequence. It is
     * allowed for @dest to point to a different sequence than the one pointed
     * into by @begin and @end.
     * 
     * If @dest is %NULL, the range indicated by @begin and @end is
     * removed from the sequence. If @dest points to a place within
     * the (@begin, @end) range, the range does not move.
     */
    public static void moveRange(SequenceIter dest, SequenceIter begin, SequenceIter end) {
        gtk_h.g_sequence_move_range(dest.handle(), begin.handle(), end.handle());
    }
    
    /**
     * Finds an iterator somewhere in the range (@begin, @end). This
     * iterator will be close to the middle of the range, but is not
     * guaranteed to be exactly in the middle.
     * 
     * The @begin and @end iterators must both point to the same sequence
     * and @begin must come before or be equal to @end in the sequence.
     */
    public static SequenceIter rangeGetMidpoint(SequenceIter begin, SequenceIter end) {
        var RESULT = gtk_h.g_sequence_range_get_midpoint(begin.handle(), end.handle());
        return new SequenceIter(References.get(RESULT, false));
    }
    
    /**
     * Removes the item pointed to by @iter. It is an error to pass the
     * end iterator to this function.
     * 
     * If the sequence has a data destroy function associated with it, this
     * function is called on the data for the removed item.
     */
    public static void remove(SequenceIter iter) {
        gtk_h.g_sequence_remove(iter.handle());
    }
    
    /**
     * Removes all items in the (@begin, @end) range.
     * 
     * If the sequence has a data destroy function associated with it, this
     * function is called on the data for the removed items.
     */
    public static void removeRange(SequenceIter begin, SequenceIter end) {
        gtk_h.g_sequence_remove_range(begin.handle(), end.handle());
    }
    
    /**
     * Changes the data for the item pointed to by @iter to be @data. If
     * the sequence has a data destroy function associated with it, that
     * function is called on the existing data that @iter pointed to.
     */
    public static void set(SequenceIter iter, jdk.incubator.foreign.MemoryAddress data) {
        gtk_h.g_sequence_set(iter.handle(), data);
    }
    
    /**
     * Swaps the items pointed to by @a and @b. It is allowed for @a and @b
     * to point into difference sequences.
     */
    public static void swap(SequenceIter a, SequenceIter b) {
        gtk_h.g_sequence_swap(a.handle(), b.handle());
    }
    
}
