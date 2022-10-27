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
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public SequenceIter(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Returns a negative number if {@code a} comes before {@code b}, 0 if they are equal,
     * and a positive number if {@code a} comes after {@code b}.
     * <p>
     * The {@code a} and {@code b} iterators must point into the same sequence.
     * @param b a {@link SequenceIter}
     * @return a negative number if {@code a} comes before {@code b}, 0 if they are
     *     equal, and a positive number if {@code a} comes after {@code b}
     */
    public int compare(@NotNull org.gtk.glib.SequenceIter b) {
        java.util.Objects.requireNonNull(b, "Parameter 'b' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_sequence_iter_compare.invokeExact(handle(), b.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the position of {@code iter}
     * @return the position of {@code iter}
     */
    public int getPosition() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_sequence_iter_get_position.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the {@link Sequence} that {@code iter} points into.
     * @return the {@link Sequence} that {@code iter} points into
     */
    public @NotNull org.gtk.glib.Sequence getSequence() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_sequence_iter_get_sequence.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Sequence(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns whether {@code iter} is the begin iterator
     * @return whether {@code iter} is the begin iterator
     */
    public boolean isBegin() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_sequence_iter_is_begin.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns whether {@code iter} is the end iterator
     * @return Whether {@code iter} is the end iterator
     */
    public boolean isEnd() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_sequence_iter_is_end.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the {@link SequenceIter} which is {@code delta} positions away from {@code iter}.
     * If {@code iter} is closer than -{@code delta} positions to the beginning of the sequence,
     * the begin iterator is returned. If {@code iter} is closer than {@code delta} positions
     * to the end of the sequence, the end iterator is returned.
     * @param delta A positive or negative number indicating how many positions away
     *    from {@code iter} the returned {@link SequenceIter} will be
     * @return a {@link SequenceIter} which is {@code delta} positions away from {@code iter}
     */
    public @NotNull org.gtk.glib.SequenceIter move(int delta) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_sequence_iter_move.invokeExact(handle(), delta);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SequenceIter(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns an iterator pointing to the next position after {@code iter}.
     * If {@code iter} is the end iterator, the end iterator is returned.
     * @return a {@link SequenceIter} pointing to the next position after {@code iter}
     */
    public @NotNull org.gtk.glib.SequenceIter next() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_sequence_iter_next.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SequenceIter(Refcounted.get(RESULT, false));
    }
    
    /**
     * Returns an iterator pointing to the previous position before {@code iter}.
     * If {@code iter} is the begin iterator, the begin iterator is returned.
     * @return a {@link SequenceIter} pointing to the previous position
     *     before {@code iter}
     */
    public @NotNull org.gtk.glib.SequenceIter prev() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_sequence_iter_prev.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.SequenceIter(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_sequence_iter_compare = Interop.downcallHandle(
            "g_sequence_iter_compare",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_sequence_iter_get_position = Interop.downcallHandle(
            "g_sequence_iter_get_position",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_sequence_iter_get_sequence = Interop.downcallHandle(
            "g_sequence_iter_get_sequence",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_sequence_iter_is_begin = Interop.downcallHandle(
            "g_sequence_iter_is_begin",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_sequence_iter_is_end = Interop.downcallHandle(
            "g_sequence_iter_is_end",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_sequence_iter_move = Interop.downcallHandle(
            "g_sequence_iter_move",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
        );
        
        private static final MethodHandle g_sequence_iter_next = Interop.downcallHandle(
            "g_sequence_iter_next",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_sequence_iter_prev = Interop.downcallHandle(
            "g_sequence_iter_prev",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
