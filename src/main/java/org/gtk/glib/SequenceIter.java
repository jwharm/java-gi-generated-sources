package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@link SequenceIter} struct is an opaque data type representing an
 * iterator pointing into a {@link Sequence}.
 */
public class SequenceIter extends io.github.jwharm.javagi.ResourceBase {

    public SequenceIter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_sequence_iter_compare = Interop.downcallHandle(
        "g_sequence_iter_compare",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns a negative number if @a comes before @b, 0 if they are equal,
     * and a positive number if @a comes after @b.
     * <p>
     * The @a and @b iterators must point into the same sequence.
     */
    public int compare(@NotNull SequenceIter b) {
        int RESULT;
        try {
            RESULT = (int) g_sequence_iter_compare.invokeExact(handle(), b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_sequence_iter_get_position = Interop.downcallHandle(
        "g_sequence_iter_get_position",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the position of {@code iter}
     */
    public int getPosition() {
        int RESULT;
        try {
            RESULT = (int) g_sequence_iter_get_position.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_sequence_iter_get_sequence = Interop.downcallHandle(
        "g_sequence_iter_get_sequence",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@link Sequence} that {@code iter} points into.
     */
    public @NotNull Sequence getSequence() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_sequence_iter_get_sequence.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Sequence(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_sequence_iter_is_begin = Interop.downcallHandle(
        "g_sequence_iter_is_begin",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether {@code iter} is the begin iterator
     */
    public boolean isBegin() {
        int RESULT;
        try {
            RESULT = (int) g_sequence_iter_is_begin.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_sequence_iter_is_end = Interop.downcallHandle(
        "g_sequence_iter_is_end",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns whether {@code iter} is the end iterator
     */
    public boolean isEnd() {
        int RESULT;
        try {
            RESULT = (int) g_sequence_iter_is_end.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_sequence_iter_move = Interop.downcallHandle(
        "g_sequence_iter_move",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the {@link SequenceIter} which is {@code delta} positions away from {@code iter}.
     * If {@code iter} is closer than -{@code delta} positions to the beginning of the sequence,
     * the begin iterator is returned. If {@code iter} is closer than {@code delta} positions
     * to the end of the sequence, the end iterator is returned.
     */
    public @NotNull SequenceIter move(@NotNull int delta) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_sequence_iter_move.invokeExact(handle(), delta);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SequenceIter(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_sequence_iter_next = Interop.downcallHandle(
        "g_sequence_iter_next",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns an iterator pointing to the next position after {@code iter}.
     * If {@code iter} is the end iterator, the end iterator is returned.
     */
    public @NotNull SequenceIter next() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_sequence_iter_next.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SequenceIter(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_sequence_iter_prev = Interop.downcallHandle(
        "g_sequence_iter_prev",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns an iterator pointing to the previous position before {@code iter}.
     * If {@code iter} is the begin iterator, the begin iterator is returned.
     */
    public @NotNull SequenceIter prev() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_sequence_iter_prev.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SequenceIter(Refcounted.get(RESULT, false));
    }
    
}
