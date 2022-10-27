package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link UnicodeFuncsT} structure.
 */
@FunctionalInterface
public interface UnicodeEastasianWidthFuncT {
        int onUnicodeEastasianWidthFuncT(@NotNull org.harfbuzz.UnicodeFuncsT ufuncs, @NotNull org.harfbuzz.CodepointT unicode, @Nullable java.lang.foreign.MemoryAddress userData);
}
