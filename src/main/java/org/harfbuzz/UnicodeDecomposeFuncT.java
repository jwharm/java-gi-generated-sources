package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link UnicodeFuncsT} structure.
 * <p>
 * This method should decompose an input Unicode code point,
 * returning the two decomposed code points in {@link CodepointT}
 * output parameters (if successful). The method must return an
 * {@link BoolT} indicating the success of the composition.
 */
@FunctionalInterface
public interface UnicodeDecomposeFuncT {
        org.harfbuzz.BoolT onUnicodeDecomposeFuncT(@NotNull org.harfbuzz.UnicodeFuncsT ufuncs, @NotNull org.harfbuzz.CodepointT ab, @NotNull Out<org.harfbuzz.CodepointT> a, @NotNull Out<org.harfbuzz.CodepointT> b, @Nullable java.lang.foreign.MemoryAddress userData);
}
