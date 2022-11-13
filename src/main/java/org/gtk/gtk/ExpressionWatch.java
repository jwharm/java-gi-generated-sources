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
public class ExpressionWatch extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkExpressionWatch";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static ExpressionWatch allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ExpressionWatch newInstance = new ExpressionWatch(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a ExpressionWatch proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ExpressionWatch(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Evaluates the watched expression and on success stores the result
     * in {@code value}.
     * <p>
     * This is equivalent to calling {@link Expression#evaluate} with the
     * expression and this pointer originally used to create {@code watch}.
     * @param value an empty {@code GValue} to be set
     * @return {@code TRUE} if the expression could be evaluated and {@code value} was set
     */
    public boolean evaluate(@NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gtk_expression_watch_evaluate.invokeExact(
                    handle(),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Acquires a reference on the given {@code GtkExpressionWatch}.
     * @return the {@code GtkExpressionWatch} with an additional reference
     */
    public @NotNull org.gtk.gtk.ExpressionWatch ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_expression_watch_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gtk.ExpressionWatch(RESULT, Ownership.FULL);
    }
    
    /**
     * Releases a reference on the given {@code GtkExpressionWatch}.
     * <p>
     * If the reference was the last, the resources associated to {@code self} are
     * freed.
     */
    public void unref() {
        try {
            DowncallHandles.gtk_expression_watch_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    /**
     * Stops watching an expression.
     * <p>
     * See {@link Expression#watch} for how the watch
     * was established.
     */
    public void unwatch() {
        try {
            DowncallHandles.gtk_expression_watch_unwatch.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_expression_watch_evaluate = Interop.downcallHandle(
            "gtk_expression_watch_evaluate",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_expression_watch_ref = Interop.downcallHandle(
            "gtk_expression_watch_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_expression_watch_unref = Interop.downcallHandle(
            "gtk_expression_watch_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_expression_watch_unwatch = Interop.downcallHandle(
            "gtk_expression_watch_unwatch",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
    }
}
