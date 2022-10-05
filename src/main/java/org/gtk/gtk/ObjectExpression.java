package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@code GObject} value in a {@code GtkExpression}.
 */
public class ObjectExpression extends Expression {

    public ObjectExpression(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to ObjectExpression */
    public static ObjectExpression castFrom(org.gtk.gobject.Object gobject) {
        return new ObjectExpression(gobject.refcounted());
    }
    
    static final MethodHandle gtk_object_expression_new = Interop.downcallHandle(
        "gtk_object_expression_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(org.gtk.gobject.Object object) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) gtk_object_expression_new.invokeExact(object.handle()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    
    static final MethodHandle gtk_object_expression_get_object = Interop.downcallHandle(
        "gtk_object_expression_get_object",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the object that the expression evaluates to.
     */
    public org.gtk.gobject.Object getObject() {
        try {
            var RESULT = (MemoryAddress) gtk_object_expression_get_object.invokeExact(handle());
            return new org.gtk.gobject.Object(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}