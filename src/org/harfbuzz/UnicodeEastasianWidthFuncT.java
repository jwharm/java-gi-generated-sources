package org.harfbuzz;

/**
 * A virtual method for the {@link unicode_funcs_t} structure.
 */
@FunctionalInterface
public interface UnicodeEastasianWidthFuncT {
        int onUnicodeEastasianWidthFuncT(UnicodeFuncsT ufuncs, CodepointT unicode, java.lang.foreign.MemoryAddress userData);
}
