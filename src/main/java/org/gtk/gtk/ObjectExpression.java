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
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public ObjectExpression(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to ObjectExpression if its GType is a (or inherits from) "GtkObjectExpression".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "ObjectExpression" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkObjectExpression", a ClassCastException will be thrown.
     */
    public static ObjectExpression castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GtkObjectExpression"))) {
            return new ObjectExpression(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkObjectExpression");
        }
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gobject.Object object) {
        java.util.Objects.requireNonNull(object, "Parameter 'object' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.gtk_object_expression_new.invokeExact(
                    object.handle()), true);
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
    public ObjectExpression(@NotNull org.gtk.gobject.Object object) {
        super(constructNew(object));
    }
    
    /**
     * Gets the object that the expression evaluates to.
     * @return the object, or {@code NULL}
     */
    public @Nullable org.gtk.gobject.Object getObject() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_object_expression_get_object.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Object(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_object_expression_new = Interop.downcallHandle(
            "gtk_object_expression_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle gtk_object_expression_get_object = Interop.downcallHandle(
            "gtk_object_expression_get_object",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
