package org.gtk.glib;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A {@link SequenceIterCompareFunc} is a function used to compare iterators.
 * It must return zero if the iterators compare equal, a negative value
 * if @a comes before @b, and a positive value if @b comes before @a.
 */
@FunctionalInterface
public interface SequenceIterCompareFunc {
        int onSequenceIterCompareFunc(@NotNull SequenceIter a, @NotNull SequenceIter b);
}
