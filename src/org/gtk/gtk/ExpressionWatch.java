package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure representing a watched `GtkExpression`.
 * 
 * The contents of `GtkExpressionWatch` should only be accessed through the
 * provided API.
 */
public class ExpressionWatch extends io.github.jwharm.javagi.interop.ResourceBase {

    public ExpressionWatch(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /**
     * Evaluates the watched expression and on success stores the result
     * in `value`.
     * 
     * This is equivalent to calling [method@Gtk.Expression.evaluate] with the
     * expression and this pointer originally used to create `watch`.
     */
    public boolean evaluate(org.gtk.gobject.Value value) {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_expression_watch_evaluate(HANDLE(), value.HANDLE());
        return (RESULT != 0);
    }
    
    /**
     * Acquires a reference on the given `GtkExpressionWatch`.
     */
    public ExpressionWatch ref() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_expression_watch_ref(HANDLE());
        return new ExpressionWatch(References.get(RESULT, true));
    }
    
    /**
     * Releases a reference on the given `GtkExpressionWatch`.
     * 
     * If the reference was the last, the resources associated to `self` are
     * freed.
     */
    public void unref() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_expression_watch_unref(HANDLE());
    }
    
    /**
     * Stops watching an expression.
     * 
     * See [method@Gtk.Expression.watch] for how the watch
     * was established.
     */
    public void unwatch() {
        io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_expression_watch_unwatch(HANDLE());
    }
    
}
