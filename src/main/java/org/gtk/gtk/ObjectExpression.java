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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ObjectExpression(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ObjectExpression if its GType is a (or inherits from) "GtkObjectExpression".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ObjectExpression} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkObjectExpression", a ClassCastException will be thrown.
     */
    public static ObjectExpression castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), ObjectExpression.getType())) {
            return new ObjectExpression(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkObjectExpression");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gobject.Object object) {
        java.util.Objects.requireNonNull(object, "Parameter 'object' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_object_expression_new.invokeExact(
                    object.handle());
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
        super(constructNew(object), Ownership.FULL);
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
        return new org.gtk.gobject.Object(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_object_expression_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gtk.Expression.Build {
        
         /**
         * A {@link ObjectExpression.Build} object constructs a {@link ObjectExpression} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ObjectExpression} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ObjectExpression} using {@link ObjectExpression#castFrom}.
         * @return A new instance of {@code ObjectExpression} with the properties 
         *         that were set in the Build object.
         */
        public ObjectExpression construct() {
            return ObjectExpression.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ObjectExpression.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
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
}
