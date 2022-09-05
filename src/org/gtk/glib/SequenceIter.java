package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The #GSequenceIter struct is an opaque data type representing an
 * iterator pointing into a #GSequence.
 */
public class SequenceIter extends io.github.jwharm.javagi.interop.ResourceBase {

    public SequenceIter(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /**
     * Returns a negative number if @a comes before @b, 0 if they are equal,
     * and a positive number if @a comes after @b.
     * 
     * The @a and @b iterators must point into the same sequence.
     */
    public int compare(SequenceIter b) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_sequence_iter_compare(HANDLE(), b.HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the position of @iter
     */
    public int getPosition() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_sequence_iter_get_position(HANDLE());
        return RESULT;
    }
    
    /**
     * Returns the #GSequence that @iter points into.
     */
    public Sequence getSequence() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_sequence_iter_get_sequence(HANDLE());
        return new Sequence(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns whether @iter is the begin iterator
     */
    public boolean isBegin() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_sequence_iter_is_begin(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns whether @iter is the end iterator
     */
    public boolean isEnd() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_sequence_iter_is_end(HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Returns the #GSequenceIter which is @delta positions away from @iter.
     * If @iter is closer than -@delta positions to the beginning of the sequence,
     * the begin iterator is returned. If @iter is closer than @delta positions
     * to the end of the sequence, the end iterator is returned.
     */
    public SequenceIter move(int delta) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_sequence_iter_move(HANDLE(), delta);
        return new SequenceIter(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns an iterator pointing to the next position after @iter.
     * If @iter is the end iterator, the end iterator is returned.
     */
    public SequenceIter next() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_sequence_iter_next(HANDLE());
        return new SequenceIter(ProxyFactory.get(RESULT, false));
    }
    
    /**
     * Returns an iterator pointing to the previous position before @iter.
     * If @iter is the begin iterator, the begin iterator is returned.
     */
    public SequenceIter prev() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.g_sequence_iter_prev(HANDLE());
        return new SequenceIter(ProxyFactory.get(RESULT, false));
    }
    
}
