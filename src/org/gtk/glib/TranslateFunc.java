package org.gtk.glib;

@FunctionalInterface
public interface TranslateFunc {

    /**
     * The type of functions which are used to translate user-visible
     * strings, for <option>--help</option> output.
     */
    public java.lang.String onTranslateFunc(java.lang.String str, jdk.incubator.foreign.MemoryAddress data);
}
