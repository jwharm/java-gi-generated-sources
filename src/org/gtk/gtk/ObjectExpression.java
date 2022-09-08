package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A `GObject` value in a `GtkExpression`.
 */
public class ObjectExpression extends Expression {

    public ObjectExpression(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ObjectExpression */
    public static ObjectExpression castFrom(org.gtk.gobject.Object gobject) {
        return new ObjectExpression(gobject.getReference());
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
        super(References.get(gtk_h.gtk_object_expression_new(object.handle()), true));
    }
    
    /**
     * Gets the object that the expression evaluates to.
     */
    public org.gtk.gobject.Object getObject() {
        var RESULT = gtk_h.gtk_object_expression_get_object(handle());
        return new org.gtk.gobject.Object(References.get(RESULT, false));
    }
    
}
