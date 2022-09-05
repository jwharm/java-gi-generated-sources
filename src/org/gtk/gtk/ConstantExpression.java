package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A constant value in a `GtkExpression`.
 */
public class ConstantExpression extends Expression {

    public ConstantExpression(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ConstantExpression */
    public static ConstantExpression castFrom(org.gtk.gobject.Object gobject) {
        return new ConstantExpression(gobject.getProxy());
    }
    
    /**
     * Creates an expression that always evaluates to the given `value`.
     */
    public ConstantExpression(org.gtk.gobject.Value value) {
        super(ProxyFactory.get(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_constant_expression_new_for_value(value.HANDLE()), true));
    }
    
    /**
     * Gets the value that a constant expression evaluates to.
     */
    public org.gtk.gobject.Value getValue() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_constant_expression_get_value(HANDLE());
        return new org.gtk.gobject.Value(ProxyFactory.get(RESULT, false));
    }
    
}
