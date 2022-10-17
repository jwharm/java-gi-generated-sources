package org.harfbuzz;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link unicode_funcs_t} structure.
 * <p>
 * This method should compose a sequence of two input Unicode code
 * points by canonical equivalence, returning the composed code
 * point in a {@link codepoint_t} output parameter (if successful).
 * The method must return an {@link bool_t} indicating the success
 * of the composition.
 */
@FunctionalInterface
public interface UnicodeComposeFuncT {
        BoolT onUnicodeComposeFuncT(@NotNull UnicodeFuncsT ufuncs, @NotNull CodepointT a, @NotNull CodepointT b, @NotNull Out<CodepointT> ab, @Nullable java.lang.foreign.MemoryAddress userData);
}
