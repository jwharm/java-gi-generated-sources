package org.gtk.gtk;

/**
 * A GtkTreeIterCompareFunc should return a negative integer, zero, or a positive
 * integer if @a sorts before @b, @a sorts with @b, or @a sorts after @b
 * respectively.
 * <p>
 * If two iters compare as equal, their order in the sorted model
 * is undefined. In order to ensure that the <code>GtkTreeSortable</code> behaves as
 * expected, the GtkTreeIterCompareFunc must define a partial order on
 * the model, i.e. it must be reflexive, antisymmetric and transitive.
 * <p>
 * For example, if @model is a product catalogue, then a compare function
 * for the &<code>#8220</code> price&<code>#8221</code>  column could be one which returns<code>price_of(@a) - price_of(@b)</code>.
 */
@FunctionalInterface
public interface TreeIterCompareFunc {
        int onTreeIterCompareFunc(TreeModel model, TreeIter a, TreeIter b);
}
