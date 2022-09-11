package org.pango;

/**
 * Callback used when enumerating fonts in a fontset.
 * 
 * See [method@Pango.Fontset.foreach].
 */
@FunctionalInterface
public interface FontsetForeachFunc {
        boolean onFontsetForeachFunc(Fontset fontset, Font font);
}
