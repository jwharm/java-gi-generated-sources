package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function used for checking whether a row in {@code model} matches
 * a search key string entered by the user. Note the return value
 * is reversed from what you would normally expect, though it
 * has some similarity to strcmp() returning 0 for equal strings.
 */
@FunctionalInterface
public interface TreeViewSearchEqualFunc {
        boolean onTreeViewSearchEqualFunc(@NotNull org.gtk.gtk.TreeModel model, int column, @NotNull java.lang.String key, @NotNull org.gtk.gtk.TreeIter iter);
}
