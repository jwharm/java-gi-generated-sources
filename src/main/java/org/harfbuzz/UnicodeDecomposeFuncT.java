package org.harfbuzz;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link unicode_funcs_t} structure.
 * <p>
 * This method should decompose an input Unicode code point,
 * returning the two decomposed code points in {@link codepoint_t}
 * output parameters (if successful). The method must return an
 * {@link bool_t} indicating the success of the composition.
 */
@FunctionalInterface
public interface UnicodeDecomposeFuncT {
        BoolT onUnicodeDecomposeFuncT(@NotNull UnicodeFuncsT ufuncs, @NotNull CodepointT ab, @NotNull Out<CodepointT> a, @NotNull Out<CodepointT> b, @Nullable java.lang.foreign.MemoryAddress userData);
}
