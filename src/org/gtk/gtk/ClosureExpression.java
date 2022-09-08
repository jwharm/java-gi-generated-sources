package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An expression using a custom `GClosure` to compute the value from
 * its parameters.
 */
public class ClosureExpression extends Expression {

    public ClosureExpression(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ClosureExpression */
    public static ClosureExpression castFrom(org.gtk.gobject.Object gobject) {
        return new ClosureExpression(gobject.getReference());
    }
    
    /**
     * Creates a `GtkExpression` that calls `closure` when it is evaluated.
     * 
     * `closure` is called with the `this` object and the results of evaluating
     * the `params` expressions.
     */
    public ClosureExpression(Type valueType, org.gtk.gobject.Closure closure, int nParams, Expression[] params) {
        super(References.get(gtk_h.gtk_closure_expression_new(valueType.getValue(), closure.handle(), nParams, Interop.allocateNativeArray(params).handle()), true));
    }
    
}
