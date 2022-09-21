package org.harfbuzz;

/**
 * A virtual method for the {@link unicode_funcs_t} structure.
 * <p>
 * This method should retrieve the Script property for a
 * specified Unicode code point.
 */
@FunctionalInterface
public interface UnicodeScriptFuncT {
        ScriptT onUnicodeScriptFuncT(UnicodeFuncsT ufuncs, CodepointT unicode, jdk.incubator.foreign.MemoryAddress userData);
}
