package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A variant of `GtkClosureExpression` using a C closure.
 */
public class CClosureExpression extends Expression {

    public CClosureExpression(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CClosureExpression */
    public static CClosureExpression castFrom(org.gtk.gobject.Object gobject) {
        return new CClosureExpression(gobject.getReference());
    }
    
    private static Reference constructNew(Type valueType, org.gtk.gobject.ClosureMarshal marshal, int nParams, Expression[] params, org.gtk.gobject.Callback callbackFunc, org.gtk.gobject.ClosureNotify userDestroy) {
        try {
            Reference RESULT = References.get(gtk_h.gtk_cclosure_expression_new(valueType.getValue(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbClosureMarshal",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), nParams, Interop.allocateNativeArray(params).handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(marshal.hashCode(), marshal)), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbClosureNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope())), true);
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Creates a `GtkExpression` that calls `callback_func` when it is evaluated.
     * 
     * This function is a variant of [ctor@Gtk.ClosureExpression.new] that
     * creates a `GClosure` by calling g_cclosure_new() with the given
     * `callback_func`, `user_data` and `user_destroy`.
     */
    public CClosureExpression(Type valueType, org.gtk.gobject.ClosureMarshal marshal, int nParams, Expression[] params, org.gtk.gobject.Callback callbackFunc, org.gtk.gobject.ClosureNotify userDestroy) {
        super(constructNew(valueType, marshal, nParams, params, callbackFunc, userDestroy));
    }
    
}
