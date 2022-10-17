package org.gtk.glib;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of the function passed to g_regex_replace_eval().
 * It is called for each occurrence of the pattern in the string passed
 * to g_regex_replace_eval(), and it should append the replacement to
 * {@code result}.
 */
@FunctionalInterface
public interface RegexEvalCallback {
        boolean onRegexEvalCallback(@NotNull MatchInfo matchInfo, @NotNull String result);
}
