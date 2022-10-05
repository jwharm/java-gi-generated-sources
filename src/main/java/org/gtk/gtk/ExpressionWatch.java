package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An opaque structure representing a watched {@code GtkExpression}.
 * <p>
 * The contents of {@code GtkExpressionWatch} should only be accessed through the
 * provided API.
 */
public class ExpressionWatch extends io.github.jwharm.javagi.ResourceBase {

    public ExpressionWatch(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle gtk_expression_watch_evaluate = Interop.downcallHandle(
        "gtk_expression_watch_evaluate",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Evaluates the watched expression and on success stores the result
     * in {@code value}.
     * <p>
     * This is equivalent to calling {@link Expression#evaluate} with the
     * expression and this pointer originally used to create {@code watch}.
     */
    public boolean evaluate(org.gtk.gobject.Value value) {
        try {
            var RESULT = (int) gtk_expression_watch_evaluate.invokeExact(handle(), value.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_expression_watch_ref = Interop.downcallHandle(
        "gtk_expression_watch_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Acquires a reference on the given {@code GtkExpressionWatch}.
     */
    public ExpressionWatch ref() {
        try {
            var RESULT = (MemoryAddress) gtk_expression_watch_ref.invokeExact(handle());
            return new ExpressionWatch(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_expression_watch_unref = Interop.downcallHandle(
        "gtk_expression_watch_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Releases a reference on the given {@code GtkExpressionWatch}.
     * <p>
     * If the reference was the last, the resources associated to {@code self} are
     * freed.
     */
    public void unref() {
        try {
            gtk_expression_watch_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle gtk_expression_watch_unwatch = Interop.downcallHandle(
        "gtk_expression_watch_unwatch",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Stops watching an expression.
     * <p>
     * See {@link Expression#watch} for how the watch
     * was established.
     */
    public void unwatch() {
        try {
            gtk_expression_watch_unwatch.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
