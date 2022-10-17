package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle gtk_expression_watch_evaluate = Interop.downcallHandle(
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
    public boolean evaluate(@NotNull org.gtk.gobject.Value value) {
        int RESULT;
        try {
            RESULT = (int) gtk_expression_watch_evaluate.invokeExact(handle(), value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle gtk_expression_watch_ref = Interop.downcallHandle(
        "gtk_expression_watch_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Acquires a reference on the given {@code GtkExpressionWatch}.
     */
    public @NotNull ExpressionWatch ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) gtk_expression_watch_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ExpressionWatch(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle gtk_expression_watch_unref = Interop.downcallHandle(
        "gtk_expression_watch_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Releases a reference on the given {@code GtkExpressionWatch}.
     * <p>
     * If the reference was the last, the resources associated to {@code self} are
     * freed.
     */
    public @NotNull void unref() {
        try {
            gtk_expression_watch_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle gtk_expression_watch_unwatch = Interop.downcallHandle(
        "gtk_expression_watch_unwatch",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Stops watching an expression.
     * <p>
     * See {@link Expression#watch} for how the watch
     * was established.
     */
    public @NotNull void unwatch() {
        try {
            gtk_expression_watch_unwatch.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
