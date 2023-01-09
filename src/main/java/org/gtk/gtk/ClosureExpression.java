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
    
    private static final java.lang.String C_TYPE_NAME = "GtkClosureExpression";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ClosureExpression proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ClosureExpression(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ClosureExpression> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ClosureExpression(input);
    
    private static MemoryAddress constructNew(org.gtk.glib.Type valueType, org.gtk.gobject.Closure closure, int nParams, @Nullable org.gtk.gtk.Expression[] params) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_closure_expression_new.invokeExact(
                        valueType.getValue().longValue(),
                        closure.handle(),
                        nParams,
                        (Addressable) (params == null ? MemoryAddress.NULL : Interop.allocateNativeArray(params, false, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
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
    public ClosureExpression(org.gtk.glib.Type valueType, org.gtk.gobject.Closure closure, int nParams, @Nullable org.gtk.gtk.Expression[] params) {
        super(constructNew(valueType, closure, nParams, params));
        this.takeOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_closure_expression_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_closure_expression_new = Interop.downcallHandle(
                "gtk_closure_expression_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_closure_expression_get_type = Interop.downcallHandle(
                "gtk_closure_expression_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_closure_expression_get_type != null;
    }
}
