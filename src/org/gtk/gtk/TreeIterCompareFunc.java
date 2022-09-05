package org.gtk.gtk;

@FunctionalInterface
public interface TreeIterCompareFunc {

    /**
     * A GtkTreeIterCompareFunc should return a negative integer, zero, or a positive
     * integer if @a sorts before @b, @a sorts with @b, or @a sorts after @b
     * respectively.
     * 
     * If two iters compare as equal, their order in the sorted model
     * is undefined. In order to ensure that the `GtkTreeSortable` behaves as
     * expected, the GtkTreeIterCompareFunc must define a partial order on
     * the model, i.e. it must be reflexive, antisymmetric and transitive.
     * 
     * For example, if @model is a product catalogue, then a compare function
     * for the “price” column could be one which returns
     * `price_of(@a) - price_of(@b)`.
     */
    public int onTreeIterCompareFunc(TreeModel model, TreeIter a, TreeIter b, jdk.incubator.foreign.MemoryAddress userData);
}
