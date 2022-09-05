package org.gtk.gtk;

@FunctionalInterface
public interface TreeViewSearchEqualFunc {

    /**
     * A function used for checking whether a row in @model matches
     * a search key string entered by the user. Note the return value
     * is reversed from what you would normally expect, though it
     * has some similarity to strcmp() returning 0 for equal strings.
     */
    public boolean onTreeViewSearchEqualFunc(TreeModel model, int column, java.lang.String key, TreeIter iter, jdk.incubator.foreign.MemoryAddress searchData);
}
