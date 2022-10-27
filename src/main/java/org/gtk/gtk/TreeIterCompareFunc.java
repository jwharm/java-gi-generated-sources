package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A GtkTreeIterCompareFunc should return a negative integer, zero, or a positive
 * integer if {@code a} sorts before {@code b}, {@code a} sorts with {@code b}, or {@code a} sorts after {@code b}
 * respectively.
 * <p>
 * If two iters compare as equal, their order in the sorted model
 * is undefined. In order to ensure that the {@code GtkTreeSortable} behaves as
 * expected, the GtkTreeIterCompareFunc must define a partial order on
 * the model, i.e. it must be reflexive, antisymmetric and transitive.
 * <p>
 * For example, if {@code model} is a product catalogue, then a compare function
 * for the “price” column could be one which returns
 * {@code price_of(@a) - price_of(@b)}.
 */
@FunctionalInterface
public interface TreeIterCompareFunc {
        int onTreeIterCompareFunc(@NotNull org.gtk.gtk.TreeModel model, @NotNull org.gtk.gtk.TreeIter a, @NotNull org.gtk.gtk.TreeIter b);
}
