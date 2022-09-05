package org.harfbuzz;

@FunctionalInterface
public interface UnicodeScriptFuncT {

    /**
     * A virtual method for the #hb_unicode_funcs_t structure.
     * 
     * This method should retrieve the Script property for a
     * specified Unicode code point.
     */
    public ScriptT onUnicodeScriptFuncT(UnicodeFuncsT ufuncs, CodepointT unicode, jdk.incubator.foreign.MemoryAddress userData);
}
