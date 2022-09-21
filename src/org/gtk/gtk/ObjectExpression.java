package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GObject} value in a {@code GtkExpression}.
 */
public class ObjectExpression extends Expression {

    public ObjectExpression(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ObjectExpression */
    public static ObjectExpression castFrom(org.gtk.gobject.Object gobject) {
        return new ObjectExpression(gobject.getReference());
    }
    
    private static Reference constructNew(org.gtk.gobject.Object object) {
        Reference RESULT = References.get(gtk_h.gtk_object_expression_new(object.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates an expression evaluating to the given {@code object} with a weak reference.
     * <p>
     * Once the {@code object} is disposed, it will fail to evaluate.
     * <p>
     * This expression is meant to break reference cycles.
     * <p>
     * If you want to keep a reference to {@code object}, use {@link ConstantExpression#ConstantExpression}.
     */
    public ObjectExpression(org.gtk.gobject.Object object) {
        super(constructNew(object));
    }
    
    /**
     * Gets the object that the expression evaluates to.
     */
    public org.gtk.gobject.Object getObject() {
        var RESULT = gtk_h.gtk_object_expression_get_object(handle());
        return new org.gtk.gobject.Object(References.get(RESULT, false));
    }
    
}
