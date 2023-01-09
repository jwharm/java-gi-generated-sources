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
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ConstantExpression proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ConstantExpression(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ConstantExpression> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ConstantExpression(input);
    
    private static MemoryAddress constructNew(org.gtk.glib.Type valueType, java.lang.Object... varargs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_constant_expression_new.invokeExact(
                    valueType.getValue().longValue(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkExpression} that evaluates to the
     * object given by the arguments.
     * @param valueType The type of the object
     * @param varargs arguments to create the object from
     */
    public ConstantExpression(org.gtk.glib.Type valueType, java.lang.Object... varargs) {
        super(constructNew(valueType, varargs));
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewForValue(org.gtk.gobject.Value value) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_constant_expression_new_for_value.invokeExact(value.handle());
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
    public static ConstantExpression newForValue(org.gtk.gobject.Value value) {
        var RESULT = constructNewForValue(value);
        var OBJECT = (org.gtk.gtk.ConstantExpression) Interop.register(RESULT, org.gtk.gtk.ConstantExpression.fromAddress).marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets the value that a constant expression evaluates to.
     * @return the value
     */
    public org.gtk.gobject.Value getValue() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_constant_expression_get_value.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gobject.Value.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_constant_expression_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_constant_expression_new = Interop.downcallHandle(
                "gtk_constant_expression_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                true
        );
        
        private static final MethodHandle gtk_constant_expression_new_for_value = Interop.downcallHandle(
                "gtk_constant_expression_new_for_value",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_constant_expression_get_value = Interop.downcallHandle(
                "gtk_constant_expression_get_value",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_constant_expression_get_type = Interop.downcallHandle(
                "gtk_constant_expression_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_constant_expression_get_type != null;
    }
}
