package org.gtk.glib;

/**
 * The type of functions which are used to translate user-visible
 * strings, for &<code>#60</code> option&<code>#62</code> --help&<code>#60</code> /option&<code>#62</code>  output.
 */
@FunctionalInterface
public interface TranslateFunc {
        java.lang.String onTranslateFunc(java.lang.String str);
}
