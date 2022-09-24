package org.harfbuzz;

import io.github.jwharm.javagi.*;

/**
 * A virtual method for the {@link unicode_funcs_t} structure.
 * <p>
 * This method should retrieve the General Category property for
 * a specified Unicode code point.
 */
@FunctionalInterface
public interface UnicodeGeneralCategoryFuncT {
        UnicodeGeneralCategoryT onUnicodeGeneralCategoryFuncT(UnicodeFuncsT ufuncs, CodepointT unicode, java.lang.foreign.MemoryAddress userData);
}
