package org.pango;

import io.github.jwharm.javagi.*;

/**
 * Callback used when enumerating fonts in a fontset.
 * <p>
 * See {@link Fontset#foreach}.
 */
@FunctionalInterface
public interface FontsetForeachFunc {
        boolean onFontsetForeachFunc(Fontset fontset, Font font);
}
