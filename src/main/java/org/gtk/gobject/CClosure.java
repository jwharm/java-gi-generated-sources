package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link CClosure} is a specialization of {@link Closure} for C function callbacks.
 */
public class CClosure extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GCClosure";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Closure.getMemoryLayout().withName("closure"),
        Interop.valueLayout.ADDRESS.withName("callback")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static CClosure allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        CClosure newInstance = new CClosure(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code closure}
     * @return The value of the field {@code closure}
     */
    public org.gtk.gobject.Closure closure$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("closure"));
        return new org.gtk.gobject.Closure(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code callback}
     * @return The value of the field {@code callback}
     */
    public java.lang.foreign.MemoryAddress callback$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("callback"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code callback}
     * @param callback The new value of the field {@code callback}
     */
    public void callback$set(java.lang.foreign.MemoryAddress callback) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("callback"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), callback);
    }
    
    /**
     * Create a CClosure proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CClosure(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * A {@link ClosureMarshal} function for use with signals with handlers that
     * take two boxed pointers as arguments and return a boolean.  If you
     * have such a signal, you will probably also need to use an
     * accumulator, such as g_signal_accumulator_true_handled().
     * @param closure A {@link Closure}.
     * @param returnValue A {@link Value} to store the return value. May be {@code null}
     *   if the callback of closure doesn't return a value.
     * @param nParamValues The length of the {@code param_values} array.
     * @param paramValues An array of {@code GValues} holding the arguments
     *   on which to invoke the callback of closure.
     * @param invocationHint The invocation hint given as the last argument to
     *   g_closure_invoke().
     * @param marshalData Additional data specified when registering the
     *   marshaller, see g_closure_set_marshal() and
     *   g_closure_set_meta_marshal()
     */
    public static void marshalBOOLEANBOXEDBOXED(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_BOOLEAN__BOXED_BOXED.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : invocationHint),
                    marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * The {@code GVaClosureMarshal} equivalent to g_cclosure_marshal_BOOLEAN__BOXED_BOXED().
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue a {@link Value} to store the return
     *  value. May be {@code null} if the callback of {@code closure} doesn't return a
     *  value.
     * @param instance the instance on which the closure is invoked.
     * @param args va_list of arguments to be passed to the closure.
     * @param marshalData additional data specified when
     *  registering the marshaller, see g_closure_set_marshal() and
     *  g_closure_set_meta_marshal()
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link Type} of each argument from
     *  {@code args}.
     */
    public static void marshalBOOLEANBOXEDBOXEDv(@NotNull org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, @NotNull org.gtk.gobject.TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, int nParams, @NotNull org.gtk.glib.Type[] paramTypes) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        java.util.Objects.requireNonNull(paramTypes, "Parameter 'paramTypes' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_BOOLEAN__BOXED_BOXEDv.invokeExact(
                    closure.handle(),
                    (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                    instance.handle(),
                    args,
                    marshalData,
                    nParams,
                    Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code gboolean (*callback) (gpointer instance, gint arg1, gpointer user_data)} where the {@code gint} parameter
     * denotes a flags type.
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue a {@link Value} which can store the returned {@code gboolean}
     * @param nParamValues 2
     * @param paramValues a {@link Value} array holding instance and arg1
     * @param invocationHint the invocation hint given as the last argument
     *  to g_closure_invoke()
     * @param marshalData additional data specified when registering the marshaller
     */
    public static void marshalBOOLEANFLAGS(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_BOOLEAN__FLAGS.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : invocationHint),
                    marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * The {@code GVaClosureMarshal} equivalent to g_cclosure_marshal_BOOLEAN__FLAGS().
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue a {@link Value} to store the return
     *  value. May be {@code null} if the callback of {@code closure} doesn't return a
     *  value.
     * @param instance the instance on which the closure is invoked.
     * @param args va_list of arguments to be passed to the closure.
     * @param marshalData additional data specified when
     *  registering the marshaller, see g_closure_set_marshal() and
     *  g_closure_set_meta_marshal()
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link Type} of each argument from
     *  {@code args}.
     */
    public static void marshalBOOLEANFLAGSv(@NotNull org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, @NotNull org.gtk.gobject.TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, int nParams, @NotNull org.gtk.glib.Type[] paramTypes) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        java.util.Objects.requireNonNull(paramTypes, "Parameter 'paramTypes' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_BOOLEAN__FLAGSv.invokeExact(
                    closure.handle(),
                    (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                    instance.handle(),
                    args,
                    marshalData,
                    nParams,
                    Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code gchar* (*callback) (gpointer instance, GObject *arg1, gpointer arg2, gpointer user_data)}.
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue a {@link Value}, which can store the returned string
     * @param nParamValues 3
     * @param paramValues a {@link Value} array holding instance, arg1 and arg2
     * @param invocationHint the invocation hint given as the last argument
     *  to g_closure_invoke()
     * @param marshalData additional data specified when registering the marshaller
     */
    public static void marshalSTRINGOBJECTPOINTER(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_STRING__OBJECT_POINTER.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : invocationHint),
                    marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * The {@code GVaClosureMarshal} equivalent to g_cclosure_marshal_STRING__OBJECT_POINTER().
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue a {@link Value} to store the return
     *  value. May be {@code null} if the callback of {@code closure} doesn't return a
     *  value.
     * @param instance the instance on which the closure is invoked.
     * @param args va_list of arguments to be passed to the closure.
     * @param marshalData additional data specified when
     *  registering the marshaller, see g_closure_set_marshal() and
     *  g_closure_set_meta_marshal()
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link Type} of each argument from
     *  {@code args}.
     */
    public static void marshalSTRINGOBJECTPOINTERv(@NotNull org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, @NotNull org.gtk.gobject.TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, int nParams, @NotNull org.gtk.glib.Type[] paramTypes) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        java.util.Objects.requireNonNull(paramTypes, "Parameter 'paramTypes' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_STRING__OBJECT_POINTERv.invokeExact(
                    closure.handle(),
                    (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                    instance.handle(),
                    args,
                    marshalData,
                    nParams,
                    Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gboolean arg1, gpointer user_data)}.
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue ignored
     * @param nParamValues 2
     * @param paramValues a {@link Value} array holding the instance and the {@code gboolean} parameter
     * @param invocationHint the invocation hint given as the last argument
     *  to g_closure_invoke()
     * @param marshalData additional data specified when registering the marshaller
     */
    public static void marshalVOIDBOOLEAN(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__BOOLEAN.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : invocationHint),
                    marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * The {@code GVaClosureMarshal} equivalent to g_cclosure_marshal_VOID__BOOLEAN().
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue a {@link Value} to store the return
     *  value. May be {@code null} if the callback of {@code closure} doesn't return a
     *  value.
     * @param instance the instance on which the closure is invoked.
     * @param args va_list of arguments to be passed to the closure.
     * @param marshalData additional data specified when
     *  registering the marshaller, see g_closure_set_marshal() and
     *  g_closure_set_meta_marshal()
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDBOOLEANv(@NotNull org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, @NotNull org.gtk.gobject.TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, int nParams, @NotNull org.gtk.glib.Type[] paramTypes) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        java.util.Objects.requireNonNull(paramTypes, "Parameter 'paramTypes' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__BOOLEANv.invokeExact(
                    closure.handle(),
                    (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                    instance.handle(),
                    args,
                    marshalData,
                    nParams,
                    Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, GBoxed *arg1, gpointer user_data)}.
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue ignored
     * @param nParamValues 2
     * @param paramValues a {@link Value} array holding the instance and the {@code GBoxed}* parameter
     * @param invocationHint the invocation hint given as the last argument
     *  to g_closure_invoke()
     * @param marshalData additional data specified when registering the marshaller
     */
    public static void marshalVOIDBOXED(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__BOXED.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : invocationHint),
                    marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * The {@code GVaClosureMarshal} equivalent to g_cclosure_marshal_VOID__BOXED().
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue a {@link Value} to store the return
     *  value. May be {@code null} if the callback of {@code closure} doesn't return a
     *  value.
     * @param instance the instance on which the closure is invoked.
     * @param args va_list of arguments to be passed to the closure.
     * @param marshalData additional data specified when
     *  registering the marshaller, see g_closure_set_marshal() and
     *  g_closure_set_meta_marshal()
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDBOXEDv(@NotNull org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, @NotNull org.gtk.gobject.TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, int nParams, @NotNull org.gtk.glib.Type[] paramTypes) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        java.util.Objects.requireNonNull(paramTypes, "Parameter 'paramTypes' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__BOXEDv.invokeExact(
                    closure.handle(),
                    (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                    instance.handle(),
                    args,
                    marshalData,
                    nParams,
                    Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gchar arg1, gpointer user_data)}.
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue ignored
     * @param nParamValues 2
     * @param paramValues a {@link Value} array holding the instance and the {@code gchar} parameter
     * @param invocationHint the invocation hint given as the last argument
     *  to g_closure_invoke()
     * @param marshalData additional data specified when registering the marshaller
     */
    public static void marshalVOIDCHAR(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__CHAR.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : invocationHint),
                    marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * The {@code GVaClosureMarshal} equivalent to g_cclosure_marshal_VOID__CHAR().
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue a {@link Value} to store the return
     *  value. May be {@code null} if the callback of {@code closure} doesn't return a
     *  value.
     * @param instance the instance on which the closure is invoked.
     * @param args va_list of arguments to be passed to the closure.
     * @param marshalData additional data specified when
     *  registering the marshaller, see g_closure_set_marshal() and
     *  g_closure_set_meta_marshal()
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDCHARv(@NotNull org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, @NotNull org.gtk.gobject.TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, int nParams, @NotNull org.gtk.glib.Type[] paramTypes) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        java.util.Objects.requireNonNull(paramTypes, "Parameter 'paramTypes' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__CHARv.invokeExact(
                    closure.handle(),
                    (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                    instance.handle(),
                    args,
                    marshalData,
                    nParams,
                    Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gdouble arg1, gpointer user_data)}.
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue ignored
     * @param nParamValues 2
     * @param paramValues a {@link Value} array holding the instance and the {@code gdouble} parameter
     * @param invocationHint the invocation hint given as the last argument
     *  to g_closure_invoke()
     * @param marshalData additional data specified when registering the marshaller
     */
    public static void marshalVOIDDOUBLE(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__DOUBLE.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : invocationHint),
                    marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * The {@code GVaClosureMarshal} equivalent to g_cclosure_marshal_VOID__DOUBLE().
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue a {@link Value} to store the return
     *  value. May be {@code null} if the callback of {@code closure} doesn't return a
     *  value.
     * @param instance the instance on which the closure is invoked.
     * @param args va_list of arguments to be passed to the closure.
     * @param marshalData additional data specified when
     *  registering the marshaller, see g_closure_set_marshal() and
     *  g_closure_set_meta_marshal()
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDDOUBLEv(@NotNull org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, @NotNull org.gtk.gobject.TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, int nParams, @NotNull org.gtk.glib.Type[] paramTypes) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        java.util.Objects.requireNonNull(paramTypes, "Parameter 'paramTypes' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__DOUBLEv.invokeExact(
                    closure.handle(),
                    (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                    instance.handle(),
                    args,
                    marshalData,
                    nParams,
                    Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gint arg1, gpointer user_data)} where the {@code gint} parameter denotes an enumeration type..
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue ignored
     * @param nParamValues 2
     * @param paramValues a {@link Value} array holding the instance and the enumeration parameter
     * @param invocationHint the invocation hint given as the last argument
     *  to g_closure_invoke()
     * @param marshalData additional data specified when registering the marshaller
     */
    public static void marshalVOIDENUM(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__ENUM.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : invocationHint),
                    marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * The {@code GVaClosureMarshal} equivalent to g_cclosure_marshal_VOID__ENUM().
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue a {@link Value} to store the return
     *  value. May be {@code null} if the callback of {@code closure} doesn't return a
     *  value.
     * @param instance the instance on which the closure is invoked.
     * @param args va_list of arguments to be passed to the closure.
     * @param marshalData additional data specified when
     *  registering the marshaller, see g_closure_set_marshal() and
     *  g_closure_set_meta_marshal()
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDENUMv(@NotNull org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, @NotNull org.gtk.gobject.TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, int nParams, @NotNull org.gtk.glib.Type[] paramTypes) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        java.util.Objects.requireNonNull(paramTypes, "Parameter 'paramTypes' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__ENUMv.invokeExact(
                    closure.handle(),
                    (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                    instance.handle(),
                    args,
                    marshalData,
                    nParams,
                    Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gint arg1, gpointer user_data)} where the {@code gint} parameter denotes a flags type.
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue ignored
     * @param nParamValues 2
     * @param paramValues a {@link Value} array holding the instance and the flags parameter
     * @param invocationHint the invocation hint given as the last argument
     *  to g_closure_invoke()
     * @param marshalData additional data specified when registering the marshaller
     */
    public static void marshalVOIDFLAGS(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__FLAGS.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : invocationHint),
                    marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * The {@code GVaClosureMarshal} equivalent to g_cclosure_marshal_VOID__FLAGS().
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue a {@link Value} to store the return
     *  value. May be {@code null} if the callback of {@code closure} doesn't return a
     *  value.
     * @param instance the instance on which the closure is invoked.
     * @param args va_list of arguments to be passed to the closure.
     * @param marshalData additional data specified when
     *  registering the marshaller, see g_closure_set_marshal() and
     *  g_closure_set_meta_marshal()
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDFLAGSv(@NotNull org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, @NotNull org.gtk.gobject.TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, int nParams, @NotNull org.gtk.glib.Type[] paramTypes) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        java.util.Objects.requireNonNull(paramTypes, "Parameter 'paramTypes' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__FLAGSv.invokeExact(
                    closure.handle(),
                    (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                    instance.handle(),
                    args,
                    marshalData,
                    nParams,
                    Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gfloat arg1, gpointer user_data)}.
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue ignored
     * @param nParamValues 2
     * @param paramValues a {@link Value} array holding the instance and the {@code gfloat} parameter
     * @param invocationHint the invocation hint given as the last argument
     *  to g_closure_invoke()
     * @param marshalData additional data specified when registering the marshaller
     */
    public static void marshalVOIDFLOAT(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__FLOAT.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : invocationHint),
                    marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * The {@code GVaClosureMarshal} equivalent to g_cclosure_marshal_VOID__FLOAT().
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue a {@link Value} to store the return
     *  value. May be {@code null} if the callback of {@code closure} doesn't return a
     *  value.
     * @param instance the instance on which the closure is invoked.
     * @param args va_list of arguments to be passed to the closure.
     * @param marshalData additional data specified when
     *  registering the marshaller, see g_closure_set_marshal() and
     *  g_closure_set_meta_marshal()
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDFLOATv(@NotNull org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, @NotNull org.gtk.gobject.TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, int nParams, @NotNull org.gtk.glib.Type[] paramTypes) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        java.util.Objects.requireNonNull(paramTypes, "Parameter 'paramTypes' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__FLOATv.invokeExact(
                    closure.handle(),
                    (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                    instance.handle(),
                    args,
                    marshalData,
                    nParams,
                    Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gint arg1, gpointer user_data)}.
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue ignored
     * @param nParamValues 2
     * @param paramValues a {@link Value} array holding the instance and the {@code gint} parameter
     * @param invocationHint the invocation hint given as the last argument
     *  to g_closure_invoke()
     * @param marshalData additional data specified when registering the marshaller
     */
    public static void marshalVOIDINT(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__INT.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : invocationHint),
                    marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * The {@code GVaClosureMarshal} equivalent to g_cclosure_marshal_VOID__INT().
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue a {@link Value} to store the return
     *  value. May be {@code null} if the callback of {@code closure} doesn't return a
     *  value.
     * @param instance the instance on which the closure is invoked.
     * @param args va_list of arguments to be passed to the closure.
     * @param marshalData additional data specified when
     *  registering the marshaller, see g_closure_set_marshal() and
     *  g_closure_set_meta_marshal()
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDINTv(@NotNull org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, @NotNull org.gtk.gobject.TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, int nParams, @NotNull org.gtk.glib.Type[] paramTypes) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        java.util.Objects.requireNonNull(paramTypes, "Parameter 'paramTypes' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__INTv.invokeExact(
                    closure.handle(),
                    (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                    instance.handle(),
                    args,
                    marshalData,
                    nParams,
                    Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, glong arg1, gpointer user_data)}.
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue ignored
     * @param nParamValues 2
     * @param paramValues a {@link Value} array holding the instance and the {@code glong} parameter
     * @param invocationHint the invocation hint given as the last argument
     *  to g_closure_invoke()
     * @param marshalData additional data specified when registering the marshaller
     */
    public static void marshalVOIDLONG(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__LONG.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : invocationHint),
                    marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * The {@code GVaClosureMarshal} equivalent to g_cclosure_marshal_VOID__LONG().
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue a {@link Value} to store the return
     *  value. May be {@code null} if the callback of {@code closure} doesn't return a
     *  value.
     * @param instance the instance on which the closure is invoked.
     * @param args va_list of arguments to be passed to the closure.
     * @param marshalData additional data specified when
     *  registering the marshaller, see g_closure_set_marshal() and
     *  g_closure_set_meta_marshal()
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDLONGv(@NotNull org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, @NotNull org.gtk.gobject.TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, int nParams, @NotNull org.gtk.glib.Type[] paramTypes) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        java.util.Objects.requireNonNull(paramTypes, "Parameter 'paramTypes' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__LONGv.invokeExact(
                    closure.handle(),
                    (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                    instance.handle(),
                    args,
                    marshalData,
                    nParams,
                    Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, GObject *arg1, gpointer user_data)}.
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue ignored
     * @param nParamValues 2
     * @param paramValues a {@link Value} array holding the instance and the {@link Object}* parameter
     * @param invocationHint the invocation hint given as the last argument
     *  to g_closure_invoke()
     * @param marshalData additional data specified when registering the marshaller
     */
    public static void marshalVOIDOBJECT(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__OBJECT.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : invocationHint),
                    marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * The {@code GVaClosureMarshal} equivalent to g_cclosure_marshal_VOID__OBJECT().
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue a {@link Value} to store the return
     *  value. May be {@code null} if the callback of {@code closure} doesn't return a
     *  value.
     * @param instance the instance on which the closure is invoked.
     * @param args va_list of arguments to be passed to the closure.
     * @param marshalData additional data specified when
     *  registering the marshaller, see g_closure_set_marshal() and
     *  g_closure_set_meta_marshal()
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDOBJECTv(@NotNull org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, @NotNull org.gtk.gobject.TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, int nParams, @NotNull org.gtk.glib.Type[] paramTypes) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        java.util.Objects.requireNonNull(paramTypes, "Parameter 'paramTypes' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__OBJECTv.invokeExact(
                    closure.handle(),
                    (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                    instance.handle(),
                    args,
                    marshalData,
                    nParams,
                    Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, GParamSpec *arg1, gpointer user_data)}.
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue ignored
     * @param nParamValues 2
     * @param paramValues a {@link Value} array holding the instance and the {@link ParamSpec}* parameter
     * @param invocationHint the invocation hint given as the last argument
     *  to g_closure_invoke()
     * @param marshalData additional data specified when registering the marshaller
     */
    public static void marshalVOIDPARAM(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__PARAM.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : invocationHint),
                    marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * The {@code GVaClosureMarshal} equivalent to g_cclosure_marshal_VOID__PARAM().
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue a {@link Value} to store the return
     *  value. May be {@code null} if the callback of {@code closure} doesn't return a
     *  value.
     * @param instance the instance on which the closure is invoked.
     * @param args va_list of arguments to be passed to the closure.
     * @param marshalData additional data specified when
     *  registering the marshaller, see g_closure_set_marshal() and
     *  g_closure_set_meta_marshal()
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDPARAMv(@NotNull org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, @NotNull org.gtk.gobject.TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, int nParams, @NotNull org.gtk.glib.Type[] paramTypes) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        java.util.Objects.requireNonNull(paramTypes, "Parameter 'paramTypes' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__PARAMv.invokeExact(
                    closure.handle(),
                    (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                    instance.handle(),
                    args,
                    marshalData,
                    nParams,
                    Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gpointer arg1, gpointer user_data)}.
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue ignored
     * @param nParamValues 2
     * @param paramValues a {@link Value} array holding the instance and the {@code gpointer} parameter
     * @param invocationHint the invocation hint given as the last argument
     *  to g_closure_invoke()
     * @param marshalData additional data specified when registering the marshaller
     */
    public static void marshalVOIDPOINTER(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__POINTER.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : invocationHint),
                    marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * The {@code GVaClosureMarshal} equivalent to g_cclosure_marshal_VOID__POINTER().
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue a {@link Value} to store the return
     *  value. May be {@code null} if the callback of {@code closure} doesn't return a
     *  value.
     * @param instance the instance on which the closure is invoked.
     * @param args va_list of arguments to be passed to the closure.
     * @param marshalData additional data specified when
     *  registering the marshaller, see g_closure_set_marshal() and
     *  g_closure_set_meta_marshal()
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDPOINTERv(@NotNull org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, @NotNull org.gtk.gobject.TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, int nParams, @NotNull org.gtk.glib.Type[] paramTypes) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        java.util.Objects.requireNonNull(paramTypes, "Parameter 'paramTypes' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__POINTERv.invokeExact(
                    closure.handle(),
                    (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                    instance.handle(),
                    args,
                    marshalData,
                    nParams,
                    Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, const gchar *arg1, gpointer user_data)}.
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue ignored
     * @param nParamValues 2
     * @param paramValues a {@link Value} array holding the instance and the {@code gchar}* parameter
     * @param invocationHint the invocation hint given as the last argument
     *  to g_closure_invoke()
     * @param marshalData additional data specified when registering the marshaller
     */
    public static void marshalVOIDSTRING(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__STRING.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : invocationHint),
                    marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * The {@code GVaClosureMarshal} equivalent to g_cclosure_marshal_VOID__STRING().
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue a {@link Value} to store the return
     *  value. May be {@code null} if the callback of {@code closure} doesn't return a
     *  value.
     * @param instance the instance on which the closure is invoked.
     * @param args va_list of arguments to be passed to the closure.
     * @param marshalData additional data specified when
     *  registering the marshaller, see g_closure_set_marshal() and
     *  g_closure_set_meta_marshal()
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDSTRINGv(@NotNull org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, @NotNull org.gtk.gobject.TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, int nParams, @NotNull org.gtk.glib.Type[] paramTypes) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        java.util.Objects.requireNonNull(paramTypes, "Parameter 'paramTypes' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__STRINGv.invokeExact(
                    closure.handle(),
                    (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                    instance.handle(),
                    args,
                    marshalData,
                    nParams,
                    Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, guchar arg1, gpointer user_data)}.
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue ignored
     * @param nParamValues 2
     * @param paramValues a {@link Value} array holding the instance and the {@code guchar} parameter
     * @param invocationHint the invocation hint given as the last argument
     *  to g_closure_invoke()
     * @param marshalData additional data specified when registering the marshaller
     */
    public static void marshalVOIDUCHAR(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__UCHAR.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : invocationHint),
                    marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * The {@code GVaClosureMarshal} equivalent to g_cclosure_marshal_VOID__UCHAR().
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue a {@link Value} to store the return
     *  value. May be {@code null} if the callback of {@code closure} doesn't return a
     *  value.
     * @param instance the instance on which the closure is invoked.
     * @param args va_list of arguments to be passed to the closure.
     * @param marshalData additional data specified when
     *  registering the marshaller, see g_closure_set_marshal() and
     *  g_closure_set_meta_marshal()
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDUCHARv(@NotNull org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, @NotNull org.gtk.gobject.TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, int nParams, @NotNull org.gtk.glib.Type[] paramTypes) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        java.util.Objects.requireNonNull(paramTypes, "Parameter 'paramTypes' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__UCHARv.invokeExact(
                    closure.handle(),
                    (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                    instance.handle(),
                    args,
                    marshalData,
                    nParams,
                    Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, guint arg1, gpointer user_data)}.
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue ignored
     * @param nParamValues 2
     * @param paramValues a {@link Value} array holding the instance and the {@code guint} parameter
     * @param invocationHint the invocation hint given as the last argument
     *  to g_closure_invoke()
     * @param marshalData additional data specified when registering the marshaller
     */
    public static void marshalVOIDUINT(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__UINT.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : invocationHint),
                    marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, guint arg1, gpointer arg2, gpointer user_data)}.
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue ignored
     * @param nParamValues 3
     * @param paramValues a {@link Value} array holding instance, arg1 and arg2
     * @param invocationHint the invocation hint given as the last argument
     *  to g_closure_invoke()
     * @param marshalData additional data specified when registering the marshaller
     */
    public static void marshalVOIDUINTPOINTER(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__UINT_POINTER.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : invocationHint),
                    marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * The {@code GVaClosureMarshal} equivalent to g_cclosure_marshal_VOID__UINT_POINTER().
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue a {@link Value} to store the return
     *  value. May be {@code null} if the callback of {@code closure} doesn't return a
     *  value.
     * @param instance the instance on which the closure is invoked.
     * @param args va_list of arguments to be passed to the closure.
     * @param marshalData additional data specified when
     *  registering the marshaller, see g_closure_set_marshal() and
     *  g_closure_set_meta_marshal()
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDUINTPOINTERv(@NotNull org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, @NotNull org.gtk.gobject.TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, int nParams, @NotNull org.gtk.glib.Type[] paramTypes) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        java.util.Objects.requireNonNull(paramTypes, "Parameter 'paramTypes' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__UINT_POINTERv.invokeExact(
                    closure.handle(),
                    (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                    instance.handle(),
                    args,
                    marshalData,
                    nParams,
                    Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * The {@code GVaClosureMarshal} equivalent to g_cclosure_marshal_VOID__UINT().
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue a {@link Value} to store the return
     *  value. May be {@code null} if the callback of {@code closure} doesn't return a
     *  value.
     * @param instance the instance on which the closure is invoked.
     * @param args va_list of arguments to be passed to the closure.
     * @param marshalData additional data specified when
     *  registering the marshaller, see g_closure_set_marshal() and
     *  g_closure_set_meta_marshal()
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDUINTv(@NotNull org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, @NotNull org.gtk.gobject.TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, int nParams, @NotNull org.gtk.glib.Type[] paramTypes) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        java.util.Objects.requireNonNull(paramTypes, "Parameter 'paramTypes' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__UINTv.invokeExact(
                    closure.handle(),
                    (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                    instance.handle(),
                    args,
                    marshalData,
                    nParams,
                    Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gulong arg1, gpointer user_data)}.
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue ignored
     * @param nParamValues 2
     * @param paramValues a {@link Value} array holding the instance and the {@code gulong} parameter
     * @param invocationHint the invocation hint given as the last argument
     *  to g_closure_invoke()
     * @param marshalData additional data specified when registering the marshaller
     */
    public static void marshalVOIDULONG(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__ULONG.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : invocationHint),
                    marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * The {@code GVaClosureMarshal} equivalent to g_cclosure_marshal_VOID__ULONG().
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue a {@link Value} to store the return
     *  value. May be {@code null} if the callback of {@code closure} doesn't return a
     *  value.
     * @param instance the instance on which the closure is invoked.
     * @param args va_list of arguments to be passed to the closure.
     * @param marshalData additional data specified when
     *  registering the marshaller, see g_closure_set_marshal() and
     *  g_closure_set_meta_marshal()
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDULONGv(@NotNull org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, @NotNull org.gtk.gobject.TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, int nParams, @NotNull org.gtk.glib.Type[] paramTypes) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        java.util.Objects.requireNonNull(paramTypes, "Parameter 'paramTypes' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__ULONGv.invokeExact(
                    closure.handle(),
                    (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                    instance.handle(),
                    args,
                    marshalData,
                    nParams,
                    Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, GVariant *arg1, gpointer user_data)}.
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue ignored
     * @param nParamValues 2
     * @param paramValues a {@link Value} array holding the instance and the {@link org.gtk.glib.Variant}* parameter
     * @param invocationHint the invocation hint given as the last argument
     *  to g_closure_invoke()
     * @param marshalData additional data specified when registering the marshaller
     */
    public static void marshalVOIDVARIANT(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__VARIANT.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : invocationHint),
                    marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * The {@code GVaClosureMarshal} equivalent to g_cclosure_marshal_VOID__VARIANT().
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue a {@link Value} to store the return
     *  value. May be {@code null} if the callback of {@code closure} doesn't return a
     *  value.
     * @param instance the instance on which the closure is invoked.
     * @param args va_list of arguments to be passed to the closure.
     * @param marshalData additional data specified when
     *  registering the marshaller, see g_closure_set_marshal() and
     *  g_closure_set_meta_marshal()
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDVARIANTv(@NotNull org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, @NotNull org.gtk.gobject.TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, int nParams, @NotNull org.gtk.glib.Type[] paramTypes) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        java.util.Objects.requireNonNull(paramTypes, "Parameter 'paramTypes' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__VARIANTv.invokeExact(
                    closure.handle(),
                    (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                    instance.handle(),
                    args,
                    marshalData,
                    nParams,
                    Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gpointer user_data)}.
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue ignored
     * @param nParamValues 1
     * @param paramValues a {@link Value} array holding only the instance
     * @param invocationHint the invocation hint given as the last argument
     *  to g_closure_invoke()
     * @param marshalData additional data specified when registering the marshaller
     */
    public static void marshalVOIDVOID(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__VOID.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : invocationHint),
                    marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * The {@code GVaClosureMarshal} equivalent to g_cclosure_marshal_VOID__VOID().
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue a {@link Value} to store the return
     *  value. May be {@code null} if the callback of {@code closure} doesn't return a
     *  value.
     * @param instance the instance on which the closure is invoked.
     * @param args va_list of arguments to be passed to the closure.
     * @param marshalData additional data specified when
     *  registering the marshaller, see g_closure_set_marshal() and
     *  g_closure_set_meta_marshal()
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDVOIDv(@NotNull org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, @NotNull org.gtk.gobject.TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, int nParams, @NotNull org.gtk.glib.Type[] paramTypes) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(args, "Parameter 'args' must not be null");
        java.util.Objects.requireNonNull(paramTypes, "Parameter 'paramTypes' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__VOIDv.invokeExact(
                    closure.handle(),
                    (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                    instance.handle(),
                    args,
                    marshalData,
                    nParams,
                    Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A generic marshaller function implemented via
     * <a href="http://sourceware.org/libffi/">libffi</a>.
     * <p>
     * Normally this function is not passed explicitly to g_signal_new(),
     * but used automatically by GLib when specifying a {@code null} marshaller.
     * @param closure A {@link Closure}.
     * @param returnGvalue A {@link Value} to store the return value. May be {@code null}
     *   if the callback of closure doesn't return a value.
     * @param nParamValues The length of the {@code param_values} array.
     * @param paramValues An array of {@code GValues} holding the arguments
     *   on which to invoke the callback of closure.
     * @param invocationHint The invocation hint given as the last argument to
     *   g_closure_invoke().
     * @param marshalData Additional data specified when registering the
     *   marshaller, see g_closure_set_marshal() and
     *   g_closure_set_meta_marshal()
     */
    public static void marshalGeneric(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnGvalue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnGvalue, "Parameter 'returnGvalue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_generic.invokeExact(
                    closure.handle(),
                    returnGvalue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : invocationHint),
                    marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A generic {@code GVaClosureMarshal} function implemented via
     * <a href="http://sourceware.org/libffi/">libffi</a>.
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue a {@link Value} to store the return
     *  value. May be {@code null} if the callback of {@code closure} doesn't return a
     *  value.
     * @param instance the instance on which the closure is
     *  invoked.
     * @param argsList va_list of arguments to be passed to the closure.
     * @param marshalData additional data specified when
     *  registering the marshaller, see g_closure_set_marshal() and
     *  g_closure_set_meta_marshal()
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link Type} of each argument from
     *  {@code args_list}.
     */
    public static void marshalGenericVa(@NotNull org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, @NotNull org.gtk.gobject.TypeInstance instance, @NotNull VaList argsList, @Nullable java.lang.foreign.MemoryAddress marshalData, int nParams, @NotNull org.gtk.glib.Type[] paramTypes) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(argsList, "Parameter 'argsList' must not be null");
        java.util.Objects.requireNonNull(paramTypes, "Parameter 'paramTypes' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_generic_va.invokeExact(
                    closure.handle(),
                    (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                    instance.handle(),
                    argsList,
                    marshalData,
                    nParams,
                    Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new closure which invokes {@code callback_func} with {@code user_data} as
     * the last parameter.
     * <p>
     * {@code destroy_data} will be called as a finalize notifier on the {@link Closure}.
     * @param callbackFunc the function to invoke
     * @param destroyData destroy notify to be called when {@code user_data} is no longer used
     * @return a floating reference to a new {@link CClosure}
     */
    public static @NotNull org.gtk.gobject.Closure new_(@Nullable org.gtk.gobject.Callback callbackFunc, @NotNull org.gtk.gobject.ClosureNotify destroyData) {
        java.util.Objects.requireNonNull(destroyData, "Parameter 'destroyData' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_cclosure_new.invokeExact(
                    (Addressable) (callbackFunc == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbCallback",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope())),
                    (Addressable) (callbackFunc == null ? MemoryAddress.NULL : Interop.registerCallback(callbackFunc)),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbClosureNotify",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Closure(RESULT, Ownership.NONE);
    }
    
    /**
     * A variant of g_cclosure_new() which uses {@code object} as {@code user_data} and
     * calls g_object_watch_closure() on {@code object} and the created
     * closure. This function is useful when you have a callback closely
     * associated with a {@link Object}, and want the callback to no longer run
     * after the object is is freed.
     * @param callbackFunc the function to invoke
     * @param object a {@link Object} pointer to pass to {@code callback_func}
     * @return a new {@link CClosure}
     */
    public static @NotNull org.gtk.gobject.Closure newObject(@NotNull org.gtk.gobject.Callback callbackFunc, @NotNull org.gtk.gobject.Object object) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * A variant of g_cclosure_new_swap() which uses {@code object} as {@code user_data}
     * and calls g_object_watch_closure() on {@code object} and the created
     * closure. This function is useful when you have a callback closely
     * associated with a {@link Object}, and want the callback to no longer run
     * after the object is is freed.
     * @param callbackFunc the function to invoke
     * @param object a {@link Object} pointer to pass to {@code callback_func}
     * @return a new {@link CClosure}
     */
    public static @NotNull org.gtk.gobject.Closure newObjectSwap(@NotNull org.gtk.gobject.Callback callbackFunc, @NotNull org.gtk.gobject.Object object) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Creates a new closure which invokes {@code callback_func} with {@code user_data} as
     * the first parameter.
     * <p>
     * {@code destroy_data} will be called as a finalize notifier on the {@link Closure}.
     * @param callbackFunc the function to invoke
     * @param destroyData destroy notify to be called when {@code user_data} is no longer used
     * @return a floating reference to a new {@link CClosure}
     */
    public static @NotNull org.gtk.gobject.Closure newSwap(@Nullable org.gtk.gobject.Callback callbackFunc, @NotNull org.gtk.gobject.ClosureNotify destroyData) {
        java.util.Objects.requireNonNull(destroyData, "Parameter 'destroyData' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_cclosure_new_swap.invokeExact(
                    (Addressable) (callbackFunc == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbCallback",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope())),
                    (Addressable) (callbackFunc == null ? MemoryAddress.NULL : Interop.registerCallback(callbackFunc)),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbClosureNotify",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Closure(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_cclosure_marshal_BOOLEAN__BOXED_BOXED = Interop.downcallHandle(
            "g_cclosure_marshal_BOOLEAN__BOXED_BOXED",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_BOOLEAN__BOXED_BOXEDv = Interop.downcallHandle(
            "g_cclosure_marshal_BOOLEAN__BOXED_BOXEDv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_BOOLEAN__FLAGS = Interop.downcallHandle(
            "g_cclosure_marshal_BOOLEAN__FLAGS",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_BOOLEAN__FLAGSv = Interop.downcallHandle(
            "g_cclosure_marshal_BOOLEAN__FLAGSv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_STRING__OBJECT_POINTER = Interop.downcallHandle(
            "g_cclosure_marshal_STRING__OBJECT_POINTER",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_STRING__OBJECT_POINTERv = Interop.downcallHandle(
            "g_cclosure_marshal_STRING__OBJECT_POINTERv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__BOOLEAN = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__BOOLEAN",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__BOOLEANv = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__BOOLEANv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__BOXED = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__BOXED",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__BOXEDv = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__BOXEDv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__CHAR = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__CHAR",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__CHARv = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__CHARv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__DOUBLE = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__DOUBLE",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__DOUBLEv = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__DOUBLEv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__ENUM = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__ENUM",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__ENUMv = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__ENUMv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__FLAGS = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__FLAGS",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__FLAGSv = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__FLAGSv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__FLOAT = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__FLOAT",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__FLOATv = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__FLOATv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__INT = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__INT",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__INTv = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__INTv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__LONG = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__LONG",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__LONGv = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__LONGv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__OBJECT = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__OBJECT",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__OBJECTv = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__OBJECTv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__PARAM = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__PARAM",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__PARAMv = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__PARAMv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__POINTER = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__POINTER",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__POINTERv = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__POINTERv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__STRING = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__STRING",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__STRINGv = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__STRINGv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__UCHAR = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__UCHAR",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__UCHARv = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__UCHARv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__UINT = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__UINT",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__UINT_POINTER = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__UINT_POINTER",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__UINT_POINTERv = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__UINT_POINTERv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__UINTv = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__UINTv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__ULONG = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__ULONG",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__ULONGv = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__ULONGv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__VARIANT = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__VARIANT",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__VARIANTv = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__VARIANTv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__VOID = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__VOID",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__VOIDv = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__VOIDv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_generic = Interop.downcallHandle(
            "g_cclosure_marshal_generic",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_generic_va = Interop.downcallHandle(
            "g_cclosure_marshal_generic_va",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_new = Interop.downcallHandle(
            "g_cclosure_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_new_object = Interop.downcallHandle(
            "g_cclosure_new_object",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_new_object_swap = Interop.downcallHandle(
            "g_cclosure_new_object_swap",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_new_swap = Interop.downcallHandle(
            "g_cclosure_new_swap",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
