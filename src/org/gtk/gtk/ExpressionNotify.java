package org.gtk.gtk;

@FunctionalInterface
public interface ExpressionNotify {

    /**
     * Callback called by gtk_expression_watch() when the
     * expression value changes.
     */
    public void onExpressionNotify(jdk.incubator.foreign.MemoryAddress userData);
}
