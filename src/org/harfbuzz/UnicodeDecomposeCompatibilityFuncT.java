package org.harfbuzz;

@FunctionalInterface
public interface UnicodeDecomposeCompatibilityFuncT {

        void onUnicodeDecomposeCompatibilityFuncT(UnicodeFuncsT ufuncs, CodepointT u, CodepointT decomposed);
}
