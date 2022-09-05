package org.harfbuzz;

@FunctionalInterface
public interface UnicodeEastasianWidthFuncT {

    /**
     * A virtual method for the #hb_unicode_funcs_t structure.
     */
    public int onUnicodeEastasianWidthFuncT(UnicodeFuncsT ufuncs, CodepointT unicode, jdk.incubator.foreign.MemoryAddress userData);
}
