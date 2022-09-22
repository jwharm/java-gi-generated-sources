package org.harfbuzz;

/**
 * A virtual method for the {@link unicode_funcs_t} structure.
 * <p>
 * This method should retrieve the Canonical Combining Class (ccc)
 * property for a specified Unicode code point.
 */
@FunctionalInterface
public interface UnicodeCombiningClassFuncT {
        UnicodeCombiningClassT onUnicodeCombiningClassFuncT(UnicodeFuncsT ufuncs, CodepointT unicode, java.lang.foreign.MemoryAddress userData);
}
