package org.harfbuzz;

@FunctionalInterface
public interface UnicodeCombiningClassFuncT {

    /**
     * A virtual method for the #hb_unicode_funcs_t structure.
     * 
     * This method should retrieve the Canonical Combining Class (ccc)
     * property for a specified Unicode code point.
     */
    public UnicodeCombiningClassT onUnicodeCombiningClassFuncT(UnicodeFuncsT ufuncs, CodepointT unicode, jdk.incubator.foreign.MemoryAddress userData);
}
