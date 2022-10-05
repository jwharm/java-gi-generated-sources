package org.gtk.gtk;

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
    
    static final MethodHandle gtk_closure_expression_new = Interop.downcallHandle(
        "gtk_closure_expression_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(org.gtk.gobject.Type valueType, org.gtk.gobject.Closure closure, int nParams, Expression[] params) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_closure_expression_new.invokeExact(valueType.getValue(), closure.handle(), nParams, Interop.allocateNativeArray(params).handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
