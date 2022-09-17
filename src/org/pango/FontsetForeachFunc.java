package org.pango;

/**
 * Callback used when enumerating fonts in a fontset.
 * 
 * See {@link org.pango.Fontset#foreach}.
 */
@FunctionalInterface
public interface FontsetForeachFunc {
        boolean onFontsetForeachFunc(Fontset fontset, Font font);
}
