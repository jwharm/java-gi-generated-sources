package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A variant of {@code GtkClosureExpression} using a C closure.
 */
public class CClosureExpression extends org.gtk.gtk.Expression {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCClosureExpression";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a CClosureExpression proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CClosureExpression(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to CClosureExpression if its GType is a (or inherits from) "GtkCClosureExpression".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code CClosureExpression} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GtkCClosureExpression", a ClassCastException will be thrown.
     */
    public static CClosureExpression castFrom(org.gtk.gobject.Object gobject) {
            return new CClosureExpression(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew(@NotNull org.gtk.glib.Type valueType, @Nullable org.gtk.gobject.ClosureMarshal marshal, int nParams, @NotNull org.gtk.gtk.Expression[] params, @NotNull org.gtk.gobject.Callback callbackFunc, @Nullable org.gtk.gobject.ClosureNotify userDestroy) {
        java.util.Objects.requireNonNull(valueType, "Parameter 'valueType' must not be null");
        java.util.Objects.requireNonNull(params, "Parameter 'params' must not be null");
        java.util.Objects.requireNonNull(callbackFunc, "Parameter 'callbackFunc' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gtk_cclosure_expression_new.invokeExact(
                    valueType.getValue().longValue(),
                    (Addressable) (marshal == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbClosureMarshal",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())),
                    nParams,
                    Interop.allocateNativeArray(params, false),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbCallback",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (marshal == null ? MemoryAddress.NULL : Interop.registerCallback(marshal)),
                    (Addressable) (userDestroy == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gtk.Callbacks.class, "cbClosureNotify",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope())));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@code GtkExpression} that calls {@code callback_func} when it is evaluated.
     * <p>
     * This function is a variant of {@link ClosureExpression#ClosureExpression} that
     * creates a {@code GClosure} by calling g_cclosure_new() with the given
     * {@code callback_func}, {@code user_data} and {@code user_destroy}.
     * @param valueType the type of the value that this expression evaluates to
     * @param marshal marshaller used for creating a closure
     * @param nParams the number of params needed for evaluating {@code closure}
     * @param params expressions for each parameter
     * @param callbackFunc callback used for creating a closure
     * @param userDestroy destroy notify for {@code user_data}
     */
    public CClosureExpression(@NotNull org.gtk.glib.Type valueType, @Nullable org.gtk.gobject.ClosureMarshal marshal, int nParams, @NotNull org.gtk.gtk.Expression[] params, @NotNull org.gtk.gobject.Callback callbackFunc, @Nullable org.gtk.gobject.ClosureNotify userDestroy) {
        super(constructNew(valueType, marshal, nParams, params, callbackFunc, userDestroy), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gtk_cclosure_expression_get_type.invokeExact();
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
         * A {@link CClosureExpression.Build} object constructs a {@link CClosureExpression} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link CClosureExpression} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CClosureExpression} using {@link CClosureExpression#castFrom}.
         * @return A new instance of {@code CClosureExpression} with the properties 
         *         that were set in the Build object.
         */
        public CClosureExpression construct() {
            return CClosureExpression.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    CClosureExpression.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gtk_cclosure_expression_new = Interop.downcallHandle(
            "gtk_cclosure_expression_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gtk_cclosure_expression_get_type = Interop.downcallHandle(
            "gtk_cclosure_expression_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
