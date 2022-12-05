package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An expression using a custom {@code GClosure} to compute the value from
 * its parameters.
 */
public class ClosureExpression extends org.gtk.gtk.Expression {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkClosureExpression";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a ClosureExpression proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ClosureExpression(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to ClosureExpression if its GType is a (or inherits from) "GtkClosureExpression".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code ClosureExpression} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkClosureExpression", a ClassCastException will be thrown.
     */
    public static ClosureExpression castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), ClosureExpression.getType())) {
            return new ClosureExpression(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GtkClosureExpression");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.glib.Type valueType, @NotNull org.gtk.gobject.Closure closure, int nParams, @Nullable org.gtk.gtk.Expression[] params) {
        java.util.Objects.requireNonNull(valueType, "Parameter 'valueType' must not be null");
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_closure_expression_new.invokeExact(
                    valueType.getValue().longValue(),
                    closure.handle(),
                    nParams,
                    (Addressable) (params == null ? MemoryAddress.NULL : Interop.allocateNativeArray(params, false)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkExpression} that calls {@code closure} when it is evaluated.
     * <p>
     * {@code closure} is called with the {@code this} object and the results of evaluating
     * the {@code params} expressions.
     * @param valueType the type of the value that this expression evaluates to
     * @param closure closure to call when evaluating this expression. If closure is floating, it is adopted
     * @param nParams the number of params needed for evaluating {@code closure}
     * @param params expressions for each parameter
     */
    public ClosureExpression(@NotNull org.gtk.glib.Type valueType, @NotNull org.gtk.gobject.Closure closure, int nParams, @Nullable org.gtk.gtk.Expression[] params) {
        super(constructNew(valueType, closure, nParams, params), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_closure_expression_get_type.invokeExact();
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
         * A {@link ClosureExpression.Build} object constructs a {@link ClosureExpression} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link ClosureExpression} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link ClosureExpression} using {@link ClosureExpression#castFrom}.
         * @return A new instance of {@code ClosureExpression} with the properties 
         *         that were set in the Build object.
         */
        public ClosureExpression construct() {
            return ClosureExpression.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    ClosureExpression.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_closure_expression_new = Interop.downcallHandle(
            "gtk_closure_expression_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_closure_expression_get_type = Interop.downcallHandle(
            "gtk_closure_expression_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
