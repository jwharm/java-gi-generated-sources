package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@code GObject} value in a {@code GtkExpression}.
 */
public class ObjectExpression extends org.gtk.gtk.Expression {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkObjectExpression";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ObjectExpression proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ObjectExpression(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ObjectExpression> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ObjectExpression(input);
    
    private static MemoryAddress constructNew(org.gtk.gobject.GObject object) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_object_expression_new.invokeExact(object.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @param object object to watch
     */
    public ObjectExpression(org.gtk.gobject.GObject object) {
        super(constructNew(object));
        this.takeOwnership();
    }
    
    /**
     * Gets the object that the expression evaluates to.
     * @return the object, or {@code NULL}
     */
    public @Nullable org.gtk.gobject.GObject getObject() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_object_expression_get_object.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gobject.GObject) Interop.register(RESULT, org.gtk.gobject.GObject.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_object_expression_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_object_expression_new = Interop.downcallHandle(
                "gtk_object_expression_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_object_expression_get_object = Interop.downcallHandle(
                "gtk_object_expression_get_object",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gtk_object_expression_get_type = Interop.downcallHandle(
                "gtk_object_expression_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gtk_object_expression_get_type != null;
    }
}
