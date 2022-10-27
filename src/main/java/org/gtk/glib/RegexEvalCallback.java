package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of the function passed to g_regex_replace_eval().
 * It is called for each occurrence of the pattern in the string passed
 * to g_regex_replace_eval(), and it should append the replacement to
 * {@code result}.
 * @version 2.14
 */
@FunctionalInterface
public interface RegexEvalCallback {
        boolean onRegexEvalCallback(@NotNull org.gtk.glib.MatchInfo matchInfo, @NotNull org.gtk.glib.String result);
}
