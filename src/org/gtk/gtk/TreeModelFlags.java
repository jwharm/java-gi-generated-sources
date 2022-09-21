package org.gtk.gtk;

/**
 * These flags indicate various properties of a {@code GtkTreeModel}.
 * <p>
 * They are returned by {@link TreeModel#getFlags}, and must be
 * static for the lifetime of the object. A more complete description
 * of {@link TreeModelFlags#ITERS_PERSIST} can be found in the overview of
 * this section.
 */
public class TreeModelFlags {

    /**
     * iterators survive all signals
     *   emitted by the tree
     */
    public static final int ITERS_PERSIST = 1;
    
    /**
     * the model is a list only, and never
     *   has children
     */
    public static final int LIST_ONLY = 2;
    
}
