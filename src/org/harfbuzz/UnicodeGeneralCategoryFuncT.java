package org.harfbuzz;

@FunctionalInterface
public interface UnicodeGeneralCategoryFuncT {

    /**
     * A virtual method for the #hb_unicode_funcs_t structure.
     * 
     * This method should retrieve the General Category property for
     * a specified Unicode code point.
     */
    public UnicodeGeneralCategoryT onUnicodeGeneralCategoryFuncT(UnicodeFuncsT ufuncs, CodepointT unicode, jdk.incubator.foreign.MemoryAddress userData);
}
