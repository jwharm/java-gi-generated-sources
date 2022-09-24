package org.gtk.gtk;

import io.github.jwharm.javagi.*;

/**
 * A function used for checking whether a row in {@code model} matches
 * a search key string entered by the user. Note the return value
 * is reversed from what you would normally expect, though it
 * has some similarity to strcmp() returning 0 for equal strings.
 */
@FunctionalInterface
public interface TreeViewSearchEqualFunc {
        boolean onTreeViewSearchEqualFunc(TreeModel model, int column, java.lang.String key, TreeIter iter);
}
