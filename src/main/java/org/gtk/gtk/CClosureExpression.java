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
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public CClosureExpression(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CClosureExpression */
    public static CClosureExpression castFrom(org.gtk.gobject.Object gobject) {
        return new CClosureExpression(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.glib.Type valueType, @Nullable org.gtk.gobject.ClosureMarshal marshal, int nParams, org.gtk.gtk.Expression[] params, @NotNull org.gtk.gobject.Callback callbackFunc, @Nullable org.gtk.gobject.ClosureNotify userDestroy) {
        java.util.Objects.requireNonNull(valueType, "Parameter 'valueType' must not be null");
        java.util.Objects.requireNonNullElse(marshal, MemoryAddress.NULL);
        java.util.Objects.requireNonNull(params, "Parameter 'params' must not be null");
        java.util.Objects.requireNonNull(callbackFunc, "Parameter 'callbackFunc' must not be null");
        java.util.Objects.requireNonNullElse(userDestroy, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_cclosure_expression_new.invokeExact(valueType.getValue(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbClosureMarshal",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), nParams, Interop.allocateNativeArray(params, false), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                   (Addressable) (marshal == null ? MemoryAddress.NULL : Interop.registerCallback(marshal)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbClosureNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
    public CClosureExpression(@NotNull org.gtk.glib.Type valueType, @Nullable org.gtk.gobject.ClosureMarshal marshal, int nParams, org.gtk.gtk.Expression[] params, @NotNull org.gtk.gobject.Callback callbackFunc, @Nullable org.gtk.gobject.ClosureNotify userDestroy) {
        super(constructNew(valueType, marshal, nParams, params, callbackFunc, userDestroy));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_cclosure_expression_new = Interop.downcallHandle(
            "gtk_cclosure_expression_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
