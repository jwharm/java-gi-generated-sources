package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GObject` value in a `GtkExpression`.
 */
public class ObjectExpression extends Expression {

    public ObjectExpression(io.github.jwharm.javagi.interop.Proxy proxy) {
        super(proxy);
    }
    
    /** Cast object to ObjectExpression */
    public static ObjectExpression castFrom(org.gtk.gobject.Object gobject) {
        return new ObjectExpression(gobject.getProxy());
    }
    
    /**
     * Creates an expression evaluating to the given `object` with a weak reference.
     * 
     * Once the `object` is disposed, it will fail to evaluate.
     * 
     * This expression is meant to break reference cycles.
     * 
     * If you want to keep a reference to `object`, use [ctor@Gtk.ConstantExpression.new].
     */
    public ObjectExpression(org.gtk.gobject.Object object) {
        super(ProxyFactory.getProxy(io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_object_expression_new(object.HANDLE()), true));
    }
    
    /**
     * Gets the object that the expression evaluates to.
     */
    public org.gtk.gobject.Object getObject() {
        var RESULT = io.github.jwharm.javagi.interop.jextract.gtk_h.gtk_object_expression_get_object(HANDLE());
        return new org.gtk.gobject.Object(ProxyFactory.getProxy(RESULT, false));
    }
    
}
