package org.gtk.gtk;

/**
 * Callback called by gtk_expression_watch() when the
 * expression value changes.
 */
@FunctionalInterface
public interface ExpressionNotify {
        void onExpressionNotify();
}
