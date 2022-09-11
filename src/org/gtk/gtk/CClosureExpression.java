package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A variant of `GtkClosureExpression` using a C closure.
 */
public class CClosureExpression extends Expression {

    public CClosureExpression(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to CClosureExpression */
    public static CClosureExpression castFrom(org.gtk.gobject.Object gobject) {
        return new CClosureExpression(gobject.getReference());
    }
    
    /**
     * Creates a `GtkExpression` that calls `callback_func` when it is evaluated.
     * 
     * This function is a variant of [ctor@Gtk.ClosureExpression.new] that
     * creates a `GClosure` by calling g_cclosure_new() with the given
     * `callback_func`, `user_data` and `user_destroy`.
     */
    public CClosureExpression(Type valueType, org.gtk.gobject.ClosureMarshal marshal, int nParams, Expression[] params, org.gtk.gobject.Callback callbackFunc, jdk.incubator.foreign.MemoryAddress userData, org.gtk.gobject.ClosureNotify userDestroy) {
        super(References.get(gtk_h.gtk_cclosure_expression_new(valueType.getValue(), marshal.handle(), nParams, Interop.allocateNativeArray(params).handle(), callbackFunc.handle(), userData, userDestroy.handle()), true));
    }
    
}
