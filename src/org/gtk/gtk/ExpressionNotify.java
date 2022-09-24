package org.gtk.gtk;

import io.github.jwharm.javagi.*;

/**
 * Callback called by gtk_expression_watch() when the
 * expression value changes.
 */
@FunctionalInterface
public interface ExpressionNotify {
        void onExpressionNotify();
}
