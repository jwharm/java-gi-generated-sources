package org.gtk.glib;

import org.gtk.gobject.*;
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_sequence_append(HANDLE(), data);
        return new SequenceIter(References.get(RESULT, false));
    }
    
    /**
     * Frees the memory allocated for @seq. If @seq has a data destroy
     * function associated with it, that function is called on all items
     * in @seq.
     */
    public void free() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.g_sequence_free(HANDLE());
    }
    
    /**
     * Returns the begin iterator for @seq.
     */
    public SequenceIter getBeginIter() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_sequence_get_begin_iter(HANDLE());
        return new SequenceIter(References.get(RESULT, false));
    }
    
    /**
     * Returns the end iterator for @seg
     */
    public SequenceIter getEndIter() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_sequence_get_end_iter(HANDLE());
        return new SequenceIter(References.get(RESULT, false));
    }
    
    /**
     * Returns the iterator at position @pos. If @pos is negative or larger
     * than the number of items in @seq, the end iterator is returned.
     */
    public SequenceIter getIterAtPos(int pos) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_sequence_get_iter_at_pos(HANDLE(), pos);
        return new SequenceIter(References.get(RESULT, false));
    }
    
    /**
     * Returns the positive length (>= 0) of @seq. Note that this method is
     * O(h) where `h' is the height of the tree. It is thus more efficient
     * to use g_sequence_is_empty() when comparing the length to zero.
     */
    public int getLength() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_sequence_get_length(HANDLE());
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
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_sequence_is_empty(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Adds a new item to the front of @seq
     */
    public SequenceIter prepend(jdk.incubator.foreign.MemoryAddress data) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_sequence_prepend(HANDLE(), data);
        return new SequenceIter(References.get(RESULT, false));
    }
    
}
