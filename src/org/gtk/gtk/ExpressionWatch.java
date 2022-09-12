package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure representing a watched `GtkExpression`.
 * 
 * The contents of `GtkExpressionWatch` should only be accessed through the
 * provided API.
 */
public class ExpressionWatch extends io.github.jwharm.javagi.ResourceBase {

    public ExpressionWatch(io.github.jwharm.javagi.Reference reference) {
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
        var RESULT = gtk_h.gtk_expression_watch_evaluate(handle(), value.handle());
        return (RESULT != 0);
    }
    
    /**
     * Acquires a reference on the given `GtkExpressionWatch`.
     */
    public ExpressionWatch ref() {
        var RESULT = gtk_h.gtk_expression_watch_ref(handle());
        return new ExpressionWatch(References.get(RESULT, true));
    }
    
    /**
     * Releases a reference on the given `GtkExpressionWatch`.
     * 
     * If the reference was the last, the resources associated to `self` are
     * freed.
     */
    public void unref() {
        gtk_h.gtk_expression_watch_unref(handle());
    }
    
    /**
     * Stops watching an expression.
     * 
     * See [method@Gtk.Expression.watch] for how the watch
     * was established.
     */
    public void unwatch() {
        gtk_h.gtk_expression_watch_unwatch(handle());
    }
    
}
