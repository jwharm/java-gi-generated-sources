package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A variant of {@code GtkClosureExpression} using a C closure.
 */
public class CClosureExpression extends org.gtk.gtk.Expression {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCClosureExpression";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a CClosureExpression proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected CClosureExpression(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, CClosureExpression> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new CClosureExpression(input);
    
    private static MemoryAddress constructNew(org.gtk.glib.Type valueType, @Nullable org.gtk.gobject.ClosureMarshal marshal, int nParams, org.gtk.gtk.Expression[] params, org.gtk.gobject.Callback callbackFunc, @Nullable org.gtk.gobject.ClosureNotify userDestroy) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gtk_cclosure_expression_new.invokeExact(
                        valueType.getValue().longValue(),
                        (Addressable) (marshal == null ? MemoryAddress.NULL : (Addressable) marshal.toCallback()),
                        nParams,
                        Interop.allocateNativeArray(params, false, SCOPE),
                        (Addressable) callbackFunc.toCallback(),
                        (Addressable) MemoryAddress.NULL,
                        (Addressable) (userDestroy == null ? MemoryAddress.NULL : (Addressable) userDestroy.toCallback()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Creates a {@code GtkExpression} that calls {@code callback_func} when it is evaluated.
     * <p>
     * This function is a variant of {@link ClosureExpression#ClosureExpression} that
     * creates a {@code GClosure} by calling g_cclosure_new() with the given
     * {@code callback_func}, {@code user_data} and {@code user_destroy}.
     * @param valueType the type of the value that this expression evaluates to
     * @param marshal marshaller used for creating a closure
     * @param nParams the number of params needed for evaluating {@code closure}
     * @param params expressions for each parameter
     * @param callbackFunc callback used for creating a closure
     * @param userDestroy destroy notify for {@code user_data}
     */
    public CClosureExpression(org.gtk.glib.Type valueType, @Nullable org.gtk.gobject.ClosureMarshal marshal, int nParams, org.gtk.gtk.Expression[] params, org.gtk.gobject.Callback callbackFunc, @Nullable org.gtk.gobject.ClosureNotify userDestroy) {
        super(constructNew(valueType, marshal, nParams, params, callbackFunc, userDestroy));
        this.takeOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_cclosure_expression_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_cclosure_expression_new = Interop.downcallHandle(
                "gtk_cclosure_expression_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_cclosure_expression_get_type = Interop.downcallHandle(
                "gtk_cclosure_expression_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_cclosure_expression_get_type != null;
    }
}
