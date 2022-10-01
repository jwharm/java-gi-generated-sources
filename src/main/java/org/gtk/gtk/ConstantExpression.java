package org.gtk.gtk;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A constant value in a {@code GtkExpression}.
 */
public class ConstantExpression extends Expression {

    public ConstantExpression(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to ConstantExpression */
    public static ConstantExpression castFrom(org.gtk.gobject.Object gobject) {
        return new ConstantExpression(gobject.getReference());
    }
    
    private static Reference constructNewForValue(org.gtk.gobject.Value value) {
        Reference RESULT = References.get(gtk_h.gtk_constant_expression_new_for_value(value.handle()), true);
        return RESULT;
    }
    
    /**
     * Creates an expression that always evaluates to the given {@code value}.
     */
    public static ConstantExpression newForValue(org.gtk.gobject.Value value) {
        return new ConstantExpression(constructNewForValue(value));
    }
    
    /**
     * Gets the value that a constant expression evaluates to.
     */
    public org.gtk.gobject.Value getValue() {
        var RESULT = gtk_h.gtk_constant_expression_get_value(handle());
        return new org.gtk.gobject.Value(References.get(RESULT, false));
    }
    
}
