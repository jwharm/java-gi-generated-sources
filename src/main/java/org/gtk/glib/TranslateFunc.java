package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of functions which are used to translate user-visible
 * strings, for &lt;option&gt;--help&lt;/option&gt; output.
 */
@FunctionalInterface
public interface TranslateFunc {
        java.lang.String onTranslateFunc(@NotNull java.lang.String str);
}
