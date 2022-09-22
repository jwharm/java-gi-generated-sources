package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An expression using a custom {@code GClosure} to compute the value from
 * its parameters.
 */
public class ClosureExpression extends Expression {

    public ClosureExpression(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ClosureExpression */
    public static ClosureExpression castFrom(org.gtk.gobject.Object gobject) {
        return new ClosureExpression(gobject.getReference());
    }
    
    private static Reference constructNew(Type valueType, org.gtk.gobject.Closure closure, int nParams, Expression[] params) {
        Reference RESULT = References.get(gtk_h.gtk_closure_expression_new(valueType.getValue(), closure.handle(), nParams, Interop.allocateNativeArray(params).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkExpression} that calls {@code closure} when it is evaluated.
     * <p>
     * {@code closure} is called with the {@code this} object and the results of evaluating
     * the {@code params} expressions.
     */
    public ClosureExpression(Type valueType, org.gtk.gobject.Closure closure, int nParams, Expression[] params) {
        super(constructNew(valueType, closure, nParams, params));
    }
    
}
