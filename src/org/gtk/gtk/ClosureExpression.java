package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * An expression using a custom `GClosure` to compute the value from
 * its parameters.
 */
public class ClosureExpression extends Expression {

    public ClosureExpression(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ClosureExpression */
    public static ClosureExpression castFrom(org.gtk.gobject.Object gobject) {
        return new ClosureExpression(gobject.getProxy());
    }
    
    /**
     * Creates a `GtkExpression` that calls `closure` when it is evaluated.
     * 
     * `closure` is called with the `this` object and the results of evaluating
     * the `params` expressions.
     */
    public ClosureExpression(Type valueType, org.gtk.gobject.Closure closure, int nParams, Expression[] params) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_closure_expression_new(valueType.getValue(), closure.HANDLE(), nParams, Interop.allocateNativeArray(params)), true));
    }
    
}
