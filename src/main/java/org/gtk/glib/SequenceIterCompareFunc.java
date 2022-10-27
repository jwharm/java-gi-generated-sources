package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link SequenceIterCompareFunc} is a function used to compare iterators.
 * It must return zero if the iterators compare equal, a negative value
 * if {@code a} comes before {@code b}, and a positive value if {@code b} comes before {@code a}.
 */
@FunctionalInterface
public interface SequenceIterCompareFunc {
        int onSequenceIterCompareFunc(@NotNull org.gtk.glib.SequenceIter a, @NotNull org.gtk.glib.SequenceIter b);
}
