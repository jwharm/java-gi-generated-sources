package org.harfbuzz;

@FunctionalInterface
public interface UnicodeDecomposeFuncT {

        void onUnicodeDecomposeFuncT(UnicodeFuncsT ufuncs, CodepointT ab, CodepointT a, CodepointT b);
}
