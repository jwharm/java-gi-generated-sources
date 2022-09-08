package org.gtk.gtk;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A constant value in a `GtkExpression`.
 */
public class ConstantExpression extends Expression {

    public ConstantExpression(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ConstantExpression */
    public static ConstantExpression castFrom(org.gtk.gobject.Object gobject) {
        return new ConstantExpression(gobject.getReference());
    }
    
    /**
     * Creates an expression that always evaluates to the given `value`.
     */
    public ConstantExpression(org.gtk.gobject.Value value) {
        super(References.get(gtk_h.gtk_constant_expression_new_for_value(value.handle()), true));
    }
    
    /**
     * Gets the value that a constant expression evaluates to.
     */
    public org.gtk.gobject.Value getValue() {
        var RESULT = gtk_h.gtk_constant_expression_get_value(handle());
        return new org.gtk.gobject.Value(References.get(RESULT, false));
    }
    
}
