package org.gtk.glib;

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
    
    static final MethodHandle g_sequence_iter_compare = Interop.downcallHandle(
        "g_sequence_iter_compare",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a negative number if @a comes before @b, 0 if they are equal,
     * and a positive number if @a comes after @b.
     * <p>
     * The @a and @b iterators must point into the same sequence.
     */
    public int compare(SequenceIter b) {
        try {
            var RESULT = (int) g_sequence_iter_compare.invokeExact(handle(), b.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_sequence_iter_get_position = Interop.downcallHandle(
        "g_sequence_iter_get_position",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the position of {@code iter}
     */
    public int getPosition() {
        try {
            var RESULT = (int) g_sequence_iter_get_position.invokeExact(handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_sequence_iter_get_sequence = Interop.downcallHandle(
        "g_sequence_iter_get_sequence",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@link Sequence} that {@code iter} points into.
     */
    public Sequence getSequence() {
        try {
            var RESULT = (MemoryAddress) g_sequence_iter_get_sequence.invokeExact(handle());
            return new Sequence(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_sequence_iter_is_begin = Interop.downcallHandle(
        "g_sequence_iter_is_begin",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether {@code iter} is the begin iterator
     */
    public boolean isBegin() {
        try {
            var RESULT = (int) g_sequence_iter_is_begin.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_sequence_iter_is_end = Interop.downcallHandle(
        "g_sequence_iter_is_end",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether {@code iter} is the end iterator
     */
    public boolean isEnd() {
        try {
            var RESULT = (int) g_sequence_iter_is_end.invokeExact(handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_sequence_iter_move = Interop.downcallHandle(
        "g_sequence_iter_move",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the {@link SequenceIter} which is {@code delta} positions away from {@code iter}.
     * If {@code iter} is closer than -{@code delta} positions to the beginning of the sequence,
     * the begin iterator is returned. If {@code iter} is closer than {@code delta} positions
     * to the end of the sequence, the end iterator is returned.
     */
    public SequenceIter move(int delta) {
        try {
            var RESULT = (MemoryAddress) g_sequence_iter_move.invokeExact(handle(), delta);
            return new SequenceIter(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_sequence_iter_next = Interop.downcallHandle(
        "g_sequence_iter_next",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns an iterator pointing to the next position after {@code iter}.
     * If {@code iter} is the end iterator, the end iterator is returned.
     */
    public SequenceIter next() {
        try {
            var RESULT = (MemoryAddress) g_sequence_iter_next.invokeExact(handle());
            return new SequenceIter(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_sequence_iter_prev = Interop.downcallHandle(
        "g_sequence_iter_prev",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns an iterator pointing to the previous position before {@code iter}.
     * If {@code iter} is the begin iterator, the begin iterator is returned.
     */
    public SequenceIter prev() {
        try {
            var RESULT = (MemoryAddress) g_sequence_iter_prev.invokeExact(handle());
            return new SequenceIter(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
