package org.harfbuzz;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link unicode_funcs_t} structure.
 * <p>
 * This method should retrieve the Script property for a
 * specified Unicode code point.
 */
@FunctionalInterface
public interface UnicodeScriptFuncT {
        ScriptT onUnicodeScriptFuncT(@NotNull UnicodeFuncsT ufuncs, @NotNull CodepointT unicode, @Nullable java.lang.foreign.MemoryAddress userData);
}
