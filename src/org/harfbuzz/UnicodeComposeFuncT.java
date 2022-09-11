package org.harfbuzz;

@FunctionalInterface
public interface UnicodeComposeFuncT {

        void onUnicodeComposeFuncT(UnicodeFuncsT ufuncs, CodepointT a, CodepointT b, CodepointT ab);
}
