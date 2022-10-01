package org.gtk.glib;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link SequenceIter} struct is an opaque data type representing an
 * iterator pointing into a {@link Sequence}.
 */
public class SequenceIter extends io.github.jwharm.javagi.ResourceBase {

    public SequenceIter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Returns a negative number if @a comes before @b, 0 if they are equal,
     * and a positive number if @a comes after @b.
     * <p>
     * The @a and @b iterators must point into the same sequence.
     */
    public int compare(SequenceIter b) {
        var RESULT = gtk_h.g_sequence_iter_compare(handle(), b.handle());
        return RESULT;
    }
    
    /**
     * Returns the position of {@code iter}
     */
    public int getPosition() {
        var RESULT = gtk_h.g_sequence_iter_get_position(handle());
        return RESULT;
    }
    
    /**
     * Returns the {@link Sequence} that {@code iter} points into.
     */
    public Sequence getSequence() {
        var RESULT = gtk_h.g_sequence_iter_get_sequence(handle());
        return new Sequence(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns whether {@code iter} is the begin iterator
     */
    public boolean isBegin() {
        var RESULT = gtk_h.g_sequence_iter_is_begin(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns whether {@code iter} is the end iterator
     */
    public boolean isEnd() {
        var RESULT = gtk_h.g_sequence_iter_is_end(handle());
        return RESULT != 0;
    }
    
    /**
     * Returns the {@link SequenceIter} which is {@code delta} positions away from {@code iter}.
     * If {@code iter} is closer than -{@code delta} positions to the beginning of the sequence,
     * the begin iterator is returned. If {@code iter} is closer than {@code delta} positions
     * to the end of the sequence, the end iterator is returned.
     */
    public SequenceIter move(int delta) {
        var RESULT = gtk_h.g_sequence_iter_move(handle(), delta);
        return new SequenceIter(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns an iterator pointing to the next position after {@code iter}.
     * If {@code iter} is the end iterator, the end iterator is returned.
     */
    public SequenceIter next() {
        var RESULT = gtk_h.g_sequence_iter_next(handle());
        return new SequenceIter(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns an iterator pointing to the previous position before {@code iter}.
     * If {@code iter} is the begin iterator, the begin iterator is returned.
     */
    public SequenceIter prev() {
        var RESULT = gtk_h.g_sequence_iter_prev(handle());
        return new SequenceIter(Refcounted.get(RESULT, false));
    }
    
}
