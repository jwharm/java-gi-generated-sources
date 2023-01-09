package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link CClosure} is a specialization of {@link Closure} for C function callbacks.
 */
public class CClosure extends Struct {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GCClosure";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.Closure.getMemoryLayout().withName("closure"),
            Interop.valueLayout.ADDRESS.withName("callback")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link CClosure}
     * @return A new, uninitialized @{link CClosure}
     */
    public static CClosure allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        CClosure newInstance = new CClosure(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code closure}
     * @return The value of the field {@code closure}
     */
    public org.gtk.gobject.Closure getClosure() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("closure"));
        return org.gtk.gobject.Closure.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code closure}
     * @param closure The new value of the field {@code closure}
     */
    public void setClosure(org.gtk.gobject.Closure closure) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("closure"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (closure == null ? MemoryAddress.NULL : closure.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code callback}
     * @return The value of the field {@code callback}
     */
    public java.lang.foreign.MemoryAddress getCallback() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("callback"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code callback}
     * @param callback The new value of the field {@code callback}
     */
    public void setCallback(java.lang.foreign.MemoryAddress callback) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("callback"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback));
        }
    }
    
    /**
     * Create a CClosure proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected CClosure(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, CClosure> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new CClosure(input);
    
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
     */
    public static void marshalBOOLEANBOXEDBOXED(org.gtk.gobject.Closure closure, org.gtk.gobject.Value returnValue, int nParamValues, org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint) {
        try {
            DowncallHandles.g_cclosure_marshal_BOOLEAN__BOXED_BOXED.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) MemoryAddress.NULL);
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
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link org.gtk.glib.Type} of each argument from
     *  {@code args}.
     */
    public static void marshalBOOLEANBOXEDBOXEDv(org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, org.gtk.gobject.TypeInstance instance, VaList args, int nParams, org.gtk.glib.Type[] paramTypes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_cclosure_marshal_BOOLEAN__BOXED_BOXEDv.invokeExact(
                        closure.handle(),
                        (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                        instance.handle(),
                        args,
                        (Addressable) MemoryAddress.NULL,
                        nParams,
                        Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
     */
    public static void marshalBOOLEANFLAGS(org.gtk.gobject.Closure closure, org.gtk.gobject.Value returnValue, int nParamValues, org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint) {
        try {
            DowncallHandles.g_cclosure_marshal_BOOLEAN__FLAGS.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) MemoryAddress.NULL);
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
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link org.gtk.glib.Type} of each argument from
     *  {@code args}.
     */
    public static void marshalBOOLEANFLAGSv(org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, org.gtk.gobject.TypeInstance instance, VaList args, int nParams, org.gtk.glib.Type[] paramTypes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_cclosure_marshal_BOOLEAN__FLAGSv.invokeExact(
                        closure.handle(),
                        (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                        instance.handle(),
                        args,
                        (Addressable) MemoryAddress.NULL,
                        nParams,
                        Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
     */
    public static void marshalSTRINGOBJECTPOINTER(org.gtk.gobject.Closure closure, org.gtk.gobject.Value returnValue, int nParamValues, org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint) {
        try {
            DowncallHandles.g_cclosure_marshal_STRING__OBJECT_POINTER.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) MemoryAddress.NULL);
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
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link org.gtk.glib.Type} of each argument from
     *  {@code args}.
     */
    public static void marshalSTRINGOBJECTPOINTERv(org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, org.gtk.gobject.TypeInstance instance, VaList args, int nParams, org.gtk.glib.Type[] paramTypes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_cclosure_marshal_STRING__OBJECT_POINTERv.invokeExact(
                        closure.handle(),
                        (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                        instance.handle(),
                        args,
                        (Addressable) MemoryAddress.NULL,
                        nParams,
                        Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
     */
    public static void marshalVOIDBOOLEAN(org.gtk.gobject.Closure closure, org.gtk.gobject.Value returnValue, int nParamValues, org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint) {
        try {
            DowncallHandles.g_cclosure_marshal_VOID__BOOLEAN.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) MemoryAddress.NULL);
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
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link org.gtk.glib.Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDBOOLEANv(org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, org.gtk.gobject.TypeInstance instance, VaList args, int nParams, org.gtk.glib.Type[] paramTypes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_cclosure_marshal_VOID__BOOLEANv.invokeExact(
                        closure.handle(),
                        (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                        instance.handle(),
                        args,
                        (Addressable) MemoryAddress.NULL,
                        nParams,
                        Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
     */
    public static void marshalVOIDBOXED(org.gtk.gobject.Closure closure, org.gtk.gobject.Value returnValue, int nParamValues, org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint) {
        try {
            DowncallHandles.g_cclosure_marshal_VOID__BOXED.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) MemoryAddress.NULL);
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
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link org.gtk.glib.Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDBOXEDv(org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, org.gtk.gobject.TypeInstance instance, VaList args, int nParams, org.gtk.glib.Type[] paramTypes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_cclosure_marshal_VOID__BOXEDv.invokeExact(
                        closure.handle(),
                        (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                        instance.handle(),
                        args,
                        (Addressable) MemoryAddress.NULL,
                        nParams,
                        Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
     */
    public static void marshalVOIDCHAR(org.gtk.gobject.Closure closure, org.gtk.gobject.Value returnValue, int nParamValues, org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint) {
        try {
            DowncallHandles.g_cclosure_marshal_VOID__CHAR.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) MemoryAddress.NULL);
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
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link org.gtk.glib.Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDCHARv(org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, org.gtk.gobject.TypeInstance instance, VaList args, int nParams, org.gtk.glib.Type[] paramTypes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_cclosure_marshal_VOID__CHARv.invokeExact(
                        closure.handle(),
                        (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                        instance.handle(),
                        args,
                        (Addressable) MemoryAddress.NULL,
                        nParams,
                        Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
     */
    public static void marshalVOIDDOUBLE(org.gtk.gobject.Closure closure, org.gtk.gobject.Value returnValue, int nParamValues, org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint) {
        try {
            DowncallHandles.g_cclosure_marshal_VOID__DOUBLE.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) MemoryAddress.NULL);
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
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link org.gtk.glib.Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDDOUBLEv(org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, org.gtk.gobject.TypeInstance instance, VaList args, int nParams, org.gtk.glib.Type[] paramTypes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_cclosure_marshal_VOID__DOUBLEv.invokeExact(
                        closure.handle(),
                        (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                        instance.handle(),
                        args,
                        (Addressable) MemoryAddress.NULL,
                        nParams,
                        Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
     */
    public static void marshalVOIDENUM(org.gtk.gobject.Closure closure, org.gtk.gobject.Value returnValue, int nParamValues, org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint) {
        try {
            DowncallHandles.g_cclosure_marshal_VOID__ENUM.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) MemoryAddress.NULL);
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
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link org.gtk.glib.Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDENUMv(org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, org.gtk.gobject.TypeInstance instance, VaList args, int nParams, org.gtk.glib.Type[] paramTypes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_cclosure_marshal_VOID__ENUMv.invokeExact(
                        closure.handle(),
                        (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                        instance.handle(),
                        args,
                        (Addressable) MemoryAddress.NULL,
                        nParams,
                        Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
     */
    public static void marshalVOIDFLAGS(org.gtk.gobject.Closure closure, org.gtk.gobject.Value returnValue, int nParamValues, org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint) {
        try {
            DowncallHandles.g_cclosure_marshal_VOID__FLAGS.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) MemoryAddress.NULL);
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
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link org.gtk.glib.Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDFLAGSv(org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, org.gtk.gobject.TypeInstance instance, VaList args, int nParams, org.gtk.glib.Type[] paramTypes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_cclosure_marshal_VOID__FLAGSv.invokeExact(
                        closure.handle(),
                        (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                        instance.handle(),
                        args,
                        (Addressable) MemoryAddress.NULL,
                        nParams,
                        Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
     */
    public static void marshalVOIDFLOAT(org.gtk.gobject.Closure closure, org.gtk.gobject.Value returnValue, int nParamValues, org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint) {
        try {
            DowncallHandles.g_cclosure_marshal_VOID__FLOAT.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) MemoryAddress.NULL);
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
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link org.gtk.glib.Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDFLOATv(org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, org.gtk.gobject.TypeInstance instance, VaList args, int nParams, org.gtk.glib.Type[] paramTypes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_cclosure_marshal_VOID__FLOATv.invokeExact(
                        closure.handle(),
                        (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                        instance.handle(),
                        args,
                        (Addressable) MemoryAddress.NULL,
                        nParams,
                        Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
     */
    public static void marshalVOIDINT(org.gtk.gobject.Closure closure, org.gtk.gobject.Value returnValue, int nParamValues, org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint) {
        try {
            DowncallHandles.g_cclosure_marshal_VOID__INT.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) MemoryAddress.NULL);
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
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link org.gtk.glib.Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDINTv(org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, org.gtk.gobject.TypeInstance instance, VaList args, int nParams, org.gtk.glib.Type[] paramTypes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_cclosure_marshal_VOID__INTv.invokeExact(
                        closure.handle(),
                        (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                        instance.handle(),
                        args,
                        (Addressable) MemoryAddress.NULL,
                        nParams,
                        Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
     */
    public static void marshalVOIDLONG(org.gtk.gobject.Closure closure, org.gtk.gobject.Value returnValue, int nParamValues, org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint) {
        try {
            DowncallHandles.g_cclosure_marshal_VOID__LONG.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) MemoryAddress.NULL);
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
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link org.gtk.glib.Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDLONGv(org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, org.gtk.gobject.TypeInstance instance, VaList args, int nParams, org.gtk.glib.Type[] paramTypes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_cclosure_marshal_VOID__LONGv.invokeExact(
                        closure.handle(),
                        (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                        instance.handle(),
                        args,
                        (Addressable) MemoryAddress.NULL,
                        nParams,
                        Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, GObject *arg1, gpointer user_data)}.
     * @param closure the {@link Closure} to which the marshaller belongs
     * @param returnValue ignored
     * @param nParamValues 2
     * @param paramValues a {@link Value} array holding the instance and the {@link GObject}* parameter
     * @param invocationHint the invocation hint given as the last argument
     *  to g_closure_invoke()
     */
    public static void marshalVOIDOBJECT(org.gtk.gobject.Closure closure, org.gtk.gobject.Value returnValue, int nParamValues, org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint) {
        try {
            DowncallHandles.g_cclosure_marshal_VOID__OBJECT.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) MemoryAddress.NULL);
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
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link org.gtk.glib.Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDOBJECTv(org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, org.gtk.gobject.TypeInstance instance, VaList args, int nParams, org.gtk.glib.Type[] paramTypes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_cclosure_marshal_VOID__OBJECTv.invokeExact(
                        closure.handle(),
                        (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                        instance.handle(),
                        args,
                        (Addressable) MemoryAddress.NULL,
                        nParams,
                        Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
     */
    public static void marshalVOIDPARAM(org.gtk.gobject.Closure closure, org.gtk.gobject.Value returnValue, int nParamValues, org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint) {
        try {
            DowncallHandles.g_cclosure_marshal_VOID__PARAM.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) MemoryAddress.NULL);
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
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link org.gtk.glib.Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDPARAMv(org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, org.gtk.gobject.TypeInstance instance, VaList args, int nParams, org.gtk.glib.Type[] paramTypes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_cclosure_marshal_VOID__PARAMv.invokeExact(
                        closure.handle(),
                        (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                        instance.handle(),
                        args,
                        (Addressable) MemoryAddress.NULL,
                        nParams,
                        Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
     */
    public static void marshalVOIDPOINTER(org.gtk.gobject.Closure closure, org.gtk.gobject.Value returnValue, int nParamValues, org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint) {
        try {
            DowncallHandles.g_cclosure_marshal_VOID__POINTER.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) MemoryAddress.NULL);
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
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link org.gtk.glib.Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDPOINTERv(org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, org.gtk.gobject.TypeInstance instance, VaList args, int nParams, org.gtk.glib.Type[] paramTypes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_cclosure_marshal_VOID__POINTERv.invokeExact(
                        closure.handle(),
                        (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                        instance.handle(),
                        args,
                        (Addressable) MemoryAddress.NULL,
                        nParams,
                        Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
     */
    public static void marshalVOIDSTRING(org.gtk.gobject.Closure closure, org.gtk.gobject.Value returnValue, int nParamValues, org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint) {
        try {
            DowncallHandles.g_cclosure_marshal_VOID__STRING.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) MemoryAddress.NULL);
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
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link org.gtk.glib.Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDSTRINGv(org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, org.gtk.gobject.TypeInstance instance, VaList args, int nParams, org.gtk.glib.Type[] paramTypes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_cclosure_marshal_VOID__STRINGv.invokeExact(
                        closure.handle(),
                        (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                        instance.handle(),
                        args,
                        (Addressable) MemoryAddress.NULL,
                        nParams,
                        Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
     */
    public static void marshalVOIDUCHAR(org.gtk.gobject.Closure closure, org.gtk.gobject.Value returnValue, int nParamValues, org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint) {
        try {
            DowncallHandles.g_cclosure_marshal_VOID__UCHAR.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) MemoryAddress.NULL);
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
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link org.gtk.glib.Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDUCHARv(org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, org.gtk.gobject.TypeInstance instance, VaList args, int nParams, org.gtk.glib.Type[] paramTypes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_cclosure_marshal_VOID__UCHARv.invokeExact(
                        closure.handle(),
                        (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                        instance.handle(),
                        args,
                        (Addressable) MemoryAddress.NULL,
                        nParams,
                        Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
     */
    public static void marshalVOIDUINT(org.gtk.gobject.Closure closure, org.gtk.gobject.Value returnValue, int nParamValues, org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint) {
        try {
            DowncallHandles.g_cclosure_marshal_VOID__UINT.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) MemoryAddress.NULL);
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
     */
    public static void marshalVOIDUINTPOINTER(org.gtk.gobject.Closure closure, org.gtk.gobject.Value returnValue, int nParamValues, org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint) {
        try {
            DowncallHandles.g_cclosure_marshal_VOID__UINT_POINTER.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) MemoryAddress.NULL);
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
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link org.gtk.glib.Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDUINTPOINTERv(org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, org.gtk.gobject.TypeInstance instance, VaList args, int nParams, org.gtk.glib.Type[] paramTypes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_cclosure_marshal_VOID__UINT_POINTERv.invokeExact(
                        closure.handle(),
                        (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                        instance.handle(),
                        args,
                        (Addressable) MemoryAddress.NULL,
                        nParams,
                        Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link org.gtk.glib.Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDUINTv(org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, org.gtk.gobject.TypeInstance instance, VaList args, int nParams, org.gtk.glib.Type[] paramTypes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_cclosure_marshal_VOID__UINTv.invokeExact(
                        closure.handle(),
                        (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                        instance.handle(),
                        args,
                        (Addressable) MemoryAddress.NULL,
                        nParams,
                        Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
     */
    public static void marshalVOIDULONG(org.gtk.gobject.Closure closure, org.gtk.gobject.Value returnValue, int nParamValues, org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint) {
        try {
            DowncallHandles.g_cclosure_marshal_VOID__ULONG.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) MemoryAddress.NULL);
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
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link org.gtk.glib.Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDULONGv(org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, org.gtk.gobject.TypeInstance instance, VaList args, int nParams, org.gtk.glib.Type[] paramTypes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_cclosure_marshal_VOID__ULONGv.invokeExact(
                        closure.handle(),
                        (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                        instance.handle(),
                        args,
                        (Addressable) MemoryAddress.NULL,
                        nParams,
                        Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
     */
    public static void marshalVOIDVARIANT(org.gtk.gobject.Closure closure, org.gtk.gobject.Value returnValue, int nParamValues, org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint) {
        try {
            DowncallHandles.g_cclosure_marshal_VOID__VARIANT.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) MemoryAddress.NULL);
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
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link org.gtk.glib.Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDVARIANTv(org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, org.gtk.gobject.TypeInstance instance, VaList args, int nParams, org.gtk.glib.Type[] paramTypes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_cclosure_marshal_VOID__VARIANTv.invokeExact(
                        closure.handle(),
                        (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                        instance.handle(),
                        args,
                        (Addressable) MemoryAddress.NULL,
                        nParams,
                        Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
     */
    public static void marshalVOIDVOID(org.gtk.gobject.Closure closure, org.gtk.gobject.Value returnValue, int nParamValues, org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint) {
        try {
            DowncallHandles.g_cclosure_marshal_VOID__VOID.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) MemoryAddress.NULL);
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
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link org.gtk.glib.Type} of each argument from
     *  {@code args}.
     */
    public static void marshalVOIDVOIDv(org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, org.gtk.gobject.TypeInstance instance, VaList args, int nParams, org.gtk.glib.Type[] paramTypes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_cclosure_marshal_VOID__VOIDv.invokeExact(
                        closure.handle(),
                        (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                        instance.handle(),
                        args,
                        (Addressable) MemoryAddress.NULL,
                        nParams,
                        Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
     */
    public static void marshalGeneric(org.gtk.gobject.Closure closure, org.gtk.gobject.Value returnGvalue, int nParamValues, org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint) {
        try {
            DowncallHandles.g_cclosure_marshal_generic.invokeExact(
                    closure.handle(),
                    returnGvalue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) MemoryAddress.NULL);
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
     * @param nParams the length of the {@code param_types} array
     * @param paramTypes the {@link org.gtk.glib.Type} of each argument from
     *  {@code args_list}.
     */
    public static void marshalGenericVa(org.gtk.gobject.Closure closure, @Nullable org.gtk.gobject.Value returnValue, org.gtk.gobject.TypeInstance instance, VaList argsList, int nParams, org.gtk.glib.Type[] paramTypes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.g_cclosure_marshal_generic_va.invokeExact(
                        closure.handle(),
                        (Addressable) (returnValue == null ? MemoryAddress.NULL : returnValue.handle()),
                        instance.handle(),
                        argsList,
                        (Addressable) MemoryAddress.NULL,
                        nParams,
                        Interop.allocateNativeArray(org.gtk.glib.Type.getLongValues(paramTypes), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
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
    public static org.gtk.gobject.Closure new_(@Nullable org.gtk.gobject.Callback callbackFunc, org.gtk.gobject.ClosureNotify destroyData) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_cclosure_new.invokeExact(
                    (Addressable) (callbackFunc == null ? MemoryAddress.NULL : (Addressable) callbackFunc.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) destroyData.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gobject.Closure.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * A variant of g_cclosure_new() which uses {@code object} as {@code user_data} and
     * calls g_object_watch_closure() on {@code object} and the created
     * closure. This function is useful when you have a callback closely
     * associated with a {@link GObject}, and want the callback to no longer run
     * after the object is is freed.
     * @param callbackFunc the function to invoke
     * @param object a {@link GObject} pointer to pass to {@code callback_func}
     * @return a new {@link CClosure}
     */
    public static org.gtk.gobject.Closure newObject(org.gtk.gobject.Callback callbackFunc, org.gtk.gobject.GObject object) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_cclosure_new_object.invokeExact(
                    (Addressable) callbackFunc.toCallback(),
                    object.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.gobject.Closure.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * A variant of g_cclosure_new_swap() which uses {@code object} as {@code user_data}
     * and calls g_object_watch_closure() on {@code object} and the created
     * closure. This function is useful when you have a callback closely
     * associated with a {@link GObject}, and want the callback to no longer run
     * after the object is is freed.
     * @param callbackFunc the function to invoke
     * @param object a {@link GObject} pointer to pass to {@code callback_func}
     * @return a new {@link CClosure}
     */
    public static org.gtk.gobject.Closure newObjectSwap(org.gtk.gobject.Callback callbackFunc, org.gtk.gobject.GObject object) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_cclosure_new_object_swap.invokeExact(
                    (Addressable) callbackFunc.toCallback(),
                    object.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.gobject.Closure.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
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
    public static org.gtk.gobject.Closure newSwap(@Nullable org.gtk.gobject.Callback callbackFunc, org.gtk.gobject.ClosureNotify destroyData) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_cclosure_new_swap.invokeExact(
                    (Addressable) (callbackFunc == null ? MemoryAddress.NULL : (Addressable) callbackFunc.toCallback()),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) destroyData.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.gobject.Closure.fromAddress.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_cclosure_marshal_BOOLEAN__BOXED_BOXED = Interop.downcallHandle(
                "g_cclosure_marshal_BOOLEAN__BOXED_BOXED",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_BOOLEAN__BOXED_BOXEDv = Interop.downcallHandle(
                "g_cclosure_marshal_BOOLEAN__BOXED_BOXEDv",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_BOOLEAN__FLAGS = Interop.downcallHandle(
                "g_cclosure_marshal_BOOLEAN__FLAGS",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_BOOLEAN__FLAGSv = Interop.downcallHandle(
                "g_cclosure_marshal_BOOLEAN__FLAGSv",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_STRING__OBJECT_POINTER = Interop.downcallHandle(
                "g_cclosure_marshal_STRING__OBJECT_POINTER",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_STRING__OBJECT_POINTERv = Interop.downcallHandle(
                "g_cclosure_marshal_STRING__OBJECT_POINTERv",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__BOOLEAN = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__BOOLEAN",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__BOOLEANv = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__BOOLEANv",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__BOXED = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__BOXED",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__BOXEDv = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__BOXEDv",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__CHAR = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__CHAR",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__CHARv = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__CHARv",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__DOUBLE = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__DOUBLE",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__DOUBLEv = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__DOUBLEv",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__ENUM = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__ENUM",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__ENUMv = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__ENUMv",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__FLAGS = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__FLAGS",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__FLAGSv = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__FLAGSv",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__FLOAT = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__FLOAT",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__FLOATv = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__FLOATv",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__INT = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__INT",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__INTv = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__INTv",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__LONG = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__LONG",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__LONGv = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__LONGv",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__OBJECT = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__OBJECT",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__OBJECTv = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__OBJECTv",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__PARAM = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__PARAM",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__PARAMv = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__PARAMv",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__POINTER = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__POINTER",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__POINTERv = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__POINTERv",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__STRING = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__STRING",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__STRINGv = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__STRINGv",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__UCHAR = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__UCHAR",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__UCHARv = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__UCHARv",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__UINT = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__UINT",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__UINT_POINTER = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__UINT_POINTER",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__UINT_POINTERv = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__UINT_POINTERv",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__UINTv = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__UINTv",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__ULONG = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__ULONG",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__ULONGv = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__ULONGv",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__VARIANT = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__VARIANT",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__VARIANTv = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__VARIANTv",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__VOID = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__VOID",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__VOIDv = Interop.downcallHandle(
                "g_cclosure_marshal_VOID__VOIDv",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_generic = Interop.downcallHandle(
                "g_cclosure_marshal_generic",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_marshal_generic_va = Interop.downcallHandle(
                "g_cclosure_marshal_generic_va",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_new = Interop.downcallHandle(
                "g_cclosure_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_new_object = Interop.downcallHandle(
                "g_cclosure_new_object",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_new_object_swap = Interop.downcallHandle(
                "g_cclosure_new_object_swap",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_cclosure_new_swap = Interop.downcallHandle(
                "g_cclosure_new_swap",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link CClosure.Builder} object constructs a {@link CClosure} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link CClosure.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final CClosure struct;
        
        private Builder() {
            struct = CClosure.allocate();
        }
        
        /**
         * Finish building the {@link CClosure} struct.
         * @return A new instance of {@code CClosure} with the fields 
         *         that were set in the Builder object.
         */
        public CClosure build() {
            return struct;
        }
        
        /**
         * the {@link Closure}
         * @param closure The value for the {@code closure} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setClosure(org.gtk.gobject.Closure closure) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("closure"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (closure == null ? MemoryAddress.NULL : closure.handle()));
                return this;
            }
        }
        
        /**
         * the callback function
         * @param callback The value for the {@code callback} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCallback(java.lang.foreign.MemoryAddress callback) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("callback"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (callback == null ? MemoryAddress.NULL : (Addressable) callback));
                return this;
            }
        }
    }
}
