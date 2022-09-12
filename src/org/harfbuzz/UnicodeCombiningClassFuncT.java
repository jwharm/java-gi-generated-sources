package org.harfbuzz;

/**
 * A virtual method for the #hb_unicode_funcs_t structure.
 * 
 * This method should retrieve the Canonical Combining Class (ccc)
 * property for a specified Unicode code point.
 */
@FunctionalInterface
public interface UnicodeCombiningClassFuncT {
        UnicodeCombiningClassT onUnicodeCombiningClassFuncT(UnicodeFuncsT ufuncs, CodepointT unicode, jdk.incubator.foreign.MemoryAddress userData);
}
