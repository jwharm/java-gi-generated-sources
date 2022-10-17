package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A function used for checking whether a row in {@code model} matches
 * a search key string entered by the user. Note the return value
 * is reversed from what you would normally expect, though it
 * has some similarity to strcmp() returning 0 for equal strings.
 */
@FunctionalInterface
public interface TreeViewSearchEqualFunc {
        boolean onTreeViewSearchEqualFunc(@NotNull TreeModel model, @NotNull int column, @NotNull java.lang.String key, @NotNull TreeIter iter);
}
