package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Callback called by gtk_expression_watch() when the
 * expression value changes.
 */
@FunctionalInterface
public interface ExpressionNotify {
        void onExpressionNotify();
}
