package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An expression using a custom {@code GClosure} to compute the value from
 * its parameters.
 */
public class ClosureExpression extends Expression {

    public ClosureExpression(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ClosureExpression */
    public static ClosureExpression castFrom(org.gtk.gobject.Object gobject) {
        return new ClosureExpression(gobject.refcounted());
    }
    
    private static Refcounted constructNew(org.gtk.gobject.Type valueType, org.gtk.gobject.Closure closure, int nParams, Expression[] params) {
        Refcounted RESULT = Refcounted.get(gtk_h.gtk_closure_expression_new(valueType.getValue(), closure.handle(), nParams, Interop.allocateNativeArray(params).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkExpression} that calls {@code closure} when it is evaluated.
     * <p>
     * {@code closure} is called with the {@code this} object and the results of evaluating
     * the {@code params} expressions.
     */
    public ClosureExpression(org.gtk.gobject.Type valueType, org.gtk.gobject.Closure closure, int nParams, Expression[] params) {
        super(constructNew(valueType, closure, nParams, params));
    }
    
}
