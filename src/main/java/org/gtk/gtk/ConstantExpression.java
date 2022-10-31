package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A constant value in a {@code GtkExpression}.
 */
public class ConstantExpression extends org.gtk.gtk.Expression {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkConstantExpression";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public ConstantExpression(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to ConstantExpression if its GType is a (or inherits from) "GtkConstantExpression".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ConstantExpression" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkConstantExpression", a ClassCastException will be thrown.
     */
    public static ConstantExpression castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkConstantExpression"))) {
            return new ConstantExpression(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkConstantExpression");
        }
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.glib.Type valueType) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Creates a {@code GtkExpression} that evaluates to the
     * object given by the arguments.
     * @param valueType The type of the object
     */
    public ConstantExpression(@NotNull org.gtk.glib.Type valueType) {
        this(Refcounted.get(null)); // avoid compiler error
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    private static Refcounted constructNewForValue(@NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_constant_expression_new_for_value.invokeExact(
                    value.handle()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates an expression that always evaluates to the given {@code value}.
     * @param value a {@code GValue}
     * @return a new {@code GtkExpression}
     */
    public static ConstantExpression newForValue(@NotNull org.gtk.gobject.Value value) {
        return new ConstantExpression(constructNewForValue(value));
    }
    
    /**
     * Gets the value that a constant expression evaluates to.
     * @return the value
     */
    public @NotNull org.gtk.gobject.Value getValue() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_constant_expression_get_value.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Value(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_constant_expression_new = Interop.downcallHandle(
            "gtk_constant_expression_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_constant_expression_new_for_value = Interop.downcallHandle(
            "gtk_constant_expression_new_for_value",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_constant_expression_get_value = Interop.downcallHandle(
            "gtk_constant_expression_get_value",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
