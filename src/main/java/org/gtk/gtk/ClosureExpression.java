package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An expression using a custom {@code GClosure} to compute the value from
 * its parameters.
 */
public class ClosureExpression extends org.gtk.gtk.Expression {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public ClosureExpression(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ClosureExpression */
    public static ClosureExpression castFrom(org.gtk.gobject.Object gobject) {
        return new ClosureExpression(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.glib.Type valueType, @NotNull org.gtk.gobject.Closure closure, int nParams, org.gtk.gtk.Expression[] params) {
        java.util.Objects.requireNonNull(valueType, "Parameter 'valueType' must not be null");
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNullElse(params, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_closure_expression_new.invokeExact(valueType.getValue(), closure.handle(), nParams, Interop.allocateNativeArray(params, false)), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkExpression} that calls {@code closure} when it is evaluated.
     * <p>
     * {@code closure} is called with the {@code this} object and the results of evaluating
     * the {@code params} expressions.
     * @param valueType the type of the value that this expression evaluates to
     * @param closure closure to call when evaluating this expression. If closure is floating, it is adopted
     * @param nParams the number of params needed for evaluating {@code closure}
     * @param params expressions for each parameter
     */
    public ClosureExpression(@NotNull org.gtk.glib.Type valueType, @NotNull org.gtk.gobject.Closure closure, int nParams, org.gtk.gtk.Expression[] params) {
        super(constructNew(valueType, closure, nParams, params));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_closure_expression_new = Interop.downcallHandle(
            "gtk_closure_expression_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
    }
}
