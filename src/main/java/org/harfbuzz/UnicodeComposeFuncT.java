package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link UnicodeFuncsT} structure.
 * <p>
 * This method should compose a sequence of two input Unicode code
 * points by canonical equivalence, returning the composed code
 * point in a {@link CodepointT} output parameter (if successful).
 * The method must return an {@link BoolT} indicating the success
 * of the composition.
 */
@FunctionalInterface
public interface UnicodeComposeFuncT {
        org.harfbuzz.BoolT onUnicodeComposeFuncT(@NotNull org.harfbuzz.UnicodeFuncsT ufuncs, @NotNull org.harfbuzz.CodepointT a, @NotNull org.harfbuzz.CodepointT b, @NotNull Out<org.harfbuzz.CodepointT> ab, @Nullable java.lang.foreign.MemoryAddress userData);
}
