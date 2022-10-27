package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A virtual method for the {@link UnicodeFuncsT} structure.
 * <p>
 * This method should retrieve the General Category property for
 * a specified Unicode code point.
 */
@FunctionalInterface
public interface UnicodeGeneralCategoryFuncT {
        org.harfbuzz.UnicodeGeneralCategoryT onUnicodeGeneralCategoryFuncT(@NotNull org.harfbuzz.UnicodeFuncsT ufuncs, @NotNull org.harfbuzz.CodepointT unicode, @Nullable java.lang.foreign.MemoryAddress userData);
}
