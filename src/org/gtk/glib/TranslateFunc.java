package org.gtk.glib;

/**
 * The type of functions which are used to translate user-visible
 * strings, for &#60;option&#62;--help&#60;/option&#62; output.
 */
@FunctionalInterface
public interface TranslateFunc {
        java.lang.String onTranslateFunc(java.lang.String str);
}
