package org.pango;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Callback used when enumerating fonts in a fontset.
 * <p>
 * See {@link Fontset#foreach}.
 */
@FunctionalInterface
public interface FontsetForeachFunc {
        boolean onFontsetForeachFunc(@NotNull Fontset fontset, @NotNull Font font);
}
