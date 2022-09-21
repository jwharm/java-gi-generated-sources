package org.gtk.glib;

/**
 * The type of functions which are used to translate user-visible
 * strings, for &lt;option>--help</option&gt; output.
 */
@FunctionalInterface
public interface TranslateFunc {
        java.lang.String onTranslateFunc(java.lang.String str);
}
