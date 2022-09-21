package org.pango;

/**
 * Callback used when enumerating fonts in a fontset.
 * <p>
 * See {@link Fontset#foreach}.
 */
@FunctionalInterface
public interface FontsetForeachFunc {
        boolean onFontsetForeachFunc(Fontset fontset, Font font);
}
