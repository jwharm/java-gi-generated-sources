package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A variant of {@code GtkClosureExpression} using a C closure.
 */
public class CClosureExpression extends Expression {

    public CClosureExpression(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CClosureExpression */
    public static CClosureExpression castFrom(org.gtk.gobject.Object gobject) {
        return new CClosureExpression(gobject.refcounted());
    }
    
    private static final MethodHandle gtk_cclosure_expression_new = Interop.downcallHandle(
        "gtk_cclosure_expression_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@NotNull org.gtk.gobject.Type valueType, @Nullable org.gtk.gobject.ClosureMarshal marshal, @NotNull int nParams, @NotNull Expression[] params, @NotNull org.gtk.gobject.Callback callbackFunc, @Nullable org.gtk.gobject.ClosureNotify userDestroy) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_cclosure_expression_new.invokeExact(valueType.getValue(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbClosureMarshal",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), nParams, Interop.allocateNativeArray(params), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(marshal)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.class, "__cbClosureNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a {@code GtkExpression} that calls {@code callback_func} when it is evaluated.
     * <p>
     * This function is a variant of {@link ClosureExpression#ClosureExpression} that
     * creates a {@code GClosure} by calling g_cclosure_new() with the given
     * {@code callback_func}, {@code user_data} and {@code user_destroy}.
     */
    public CClosureExpression(@NotNull org.gtk.gobject.Type valueType, @Nullable org.gtk.gobject.ClosureMarshal marshal, @NotNull int nParams, @NotNull Expression[] params, @NotNull org.gtk.gobject.Callback callbackFunc, @Nullable org.gtk.gobject.ClosureNotify userDestroy) {
        super(constructNew(valueType, marshal, nParams, params, callbackFunc, userDestroy));
    }
    
}
