package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link CClosure} is a specialization of {@link Closure} for C function callbacks.
 */
public class CClosure extends io.github.jwharm.javagi.ResourceBase {

    public CClosure(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    static final MethodHandle g_cclosure_marshal_BOOLEAN__BOXED_BOXED = Interop.downcallHandle(
        "g_cclosure_marshal_BOOLEAN__BOXED_BOXED",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A {@link ClosureMarshal} function for use with signals with handlers that
     * take two boxed pointers as arguments and return a boolean.  If you
     * have such a signal, you will probably also need to use an
     * accumulator, such as g_signal_accumulator_true_handled().
     */
    public static void marshalBOOLEANBOXEDBOXED(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_BOOLEAN__BOXED_BOXED.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_BOOLEAN__BOXED_BOXEDv = Interop.downcallHandle(
        "g_cclosure_marshal_BOOLEAN__BOXED_BOXEDv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_BOOLEAN__BOXED_BOXED().
     */
    public static void marshalBOOLEANBOXEDBOXEDv(Closure closure, Value returnValue, TypeInstance instance, VaList args, java.lang.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_BOOLEAN__BOXED_BOXEDv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_BOOLEAN__FLAGS = Interop.downcallHandle(
        "g_cclosure_marshal_BOOLEAN__FLAGS",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code gboolean (*callback) (gpointer instance, gint arg1, gpointer user_data)} where the {@code gint} parameter
     * denotes a flags type.
     */
    public static void marshalBOOLEANFLAGS(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_BOOLEAN__FLAGS.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_BOOLEAN__FLAGSv = Interop.downcallHandle(
        "g_cclosure_marshal_BOOLEAN__FLAGSv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_BOOLEAN__FLAGS().
     */
    public static void marshalBOOLEANFLAGSv(Closure closure, Value returnValue, TypeInstance instance, VaList args, java.lang.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_BOOLEAN__FLAGSv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_STRING__OBJECT_POINTER = Interop.downcallHandle(
        "g_cclosure_marshal_STRING__OBJECT_POINTER",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code gchar* (*callback) (gpointer instance, GObject *arg1, gpointer arg2, gpointer user_data)}.
     */
    public static void marshalSTRINGOBJECTPOINTER(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_STRING__OBJECT_POINTER.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_STRING__OBJECT_POINTERv = Interop.downcallHandle(
        "g_cclosure_marshal_STRING__OBJECT_POINTERv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_STRING__OBJECT_POINTER().
     */
    public static void marshalSTRINGOBJECTPOINTERv(Closure closure, Value returnValue, TypeInstance instance, VaList args, java.lang.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_STRING__OBJECT_POINTERv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__BOOLEAN = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__BOOLEAN",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gboolean arg1, gpointer user_data)}.
     */
    public static void marshalVOIDBOOLEAN(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__BOOLEAN.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__BOOLEANv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__BOOLEANv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__BOOLEAN().
     */
    public static void marshalVOIDBOOLEANv(Closure closure, Value returnValue, TypeInstance instance, VaList args, java.lang.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__BOOLEANv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__BOXED = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__BOXED",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, GBoxed *arg1, gpointer user_data)}.
     */
    public static void marshalVOIDBOXED(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__BOXED.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__BOXEDv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__BOXEDv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__BOXED().
     */
    public static void marshalVOIDBOXEDv(Closure closure, Value returnValue, TypeInstance instance, VaList args, java.lang.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__BOXEDv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__CHAR = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__CHAR",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gchar arg1, gpointer user_data)}.
     */
    public static void marshalVOIDCHAR(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__CHAR.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__CHARv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__CHARv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__CHAR().
     */
    public static void marshalVOIDCHARv(Closure closure, Value returnValue, TypeInstance instance, VaList args, java.lang.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__CHARv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__DOUBLE = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__DOUBLE",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gdouble arg1, gpointer user_data)}.
     */
    public static void marshalVOIDDOUBLE(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__DOUBLE.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__DOUBLEv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__DOUBLEv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__DOUBLE().
     */
    public static void marshalVOIDDOUBLEv(Closure closure, Value returnValue, TypeInstance instance, VaList args, java.lang.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__DOUBLEv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__ENUM = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__ENUM",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gint arg1, gpointer user_data)} where the {@code gint} parameter denotes an enumeration type..
     */
    public static void marshalVOIDENUM(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__ENUM.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__ENUMv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__ENUMv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__ENUM().
     */
    public static void marshalVOIDENUMv(Closure closure, Value returnValue, TypeInstance instance, VaList args, java.lang.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__ENUMv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__FLAGS = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__FLAGS",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gint arg1, gpointer user_data)} where the {@code gint} parameter denotes a flags type.
     */
    public static void marshalVOIDFLAGS(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__FLAGS.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__FLAGSv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__FLAGSv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__FLAGS().
     */
    public static void marshalVOIDFLAGSv(Closure closure, Value returnValue, TypeInstance instance, VaList args, java.lang.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__FLAGSv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__FLOAT = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__FLOAT",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gfloat arg1, gpointer user_data)}.
     */
    public static void marshalVOIDFLOAT(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__FLOAT.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__FLOATv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__FLOATv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__FLOAT().
     */
    public static void marshalVOIDFLOATv(Closure closure, Value returnValue, TypeInstance instance, VaList args, java.lang.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__FLOATv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__INT = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__INT",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gint arg1, gpointer user_data)}.
     */
    public static void marshalVOIDINT(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__INT.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__INTv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__INTv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__INT().
     */
    public static void marshalVOIDINTv(Closure closure, Value returnValue, TypeInstance instance, VaList args, java.lang.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__INTv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__LONG = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__LONG",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, glong arg1, gpointer user_data)}.
     */
    public static void marshalVOIDLONG(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__LONG.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__LONGv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__LONGv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__LONG().
     */
    public static void marshalVOIDLONGv(Closure closure, Value returnValue, TypeInstance instance, VaList args, java.lang.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__LONGv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__OBJECT = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__OBJECT",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, GObject *arg1, gpointer user_data)}.
     */
    public static void marshalVOIDOBJECT(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__OBJECT.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__OBJECTv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__OBJECTv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__OBJECT().
     */
    public static void marshalVOIDOBJECTv(Closure closure, Value returnValue, TypeInstance instance, VaList args, java.lang.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__OBJECTv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__PARAM = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__PARAM",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, GParamSpec *arg1, gpointer user_data)}.
     */
    public static void marshalVOIDPARAM(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__PARAM.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__PARAMv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__PARAMv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__PARAM().
     */
    public static void marshalVOIDPARAMv(Closure closure, Value returnValue, TypeInstance instance, VaList args, java.lang.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__PARAMv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__POINTER = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__POINTER",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gpointer arg1, gpointer user_data)}.
     */
    public static void marshalVOIDPOINTER(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__POINTER.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__POINTERv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__POINTERv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__POINTER().
     */
    public static void marshalVOIDPOINTERv(Closure closure, Value returnValue, TypeInstance instance, VaList args, java.lang.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__POINTERv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__STRING = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__STRING",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, const gchar *arg1, gpointer user_data)}.
     */
    public static void marshalVOIDSTRING(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__STRING.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__STRINGv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__STRINGv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__STRING().
     */
    public static void marshalVOIDSTRINGv(Closure closure, Value returnValue, TypeInstance instance, VaList args, java.lang.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__STRINGv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__UCHAR = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__UCHAR",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, guchar arg1, gpointer user_data)}.
     */
    public static void marshalVOIDUCHAR(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__UCHAR.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__UCHARv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__UCHARv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__UCHAR().
     */
    public static void marshalVOIDUCHARv(Closure closure, Value returnValue, TypeInstance instance, VaList args, java.lang.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__UCHARv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__UINT = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__UINT",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, guint arg1, gpointer user_data)}.
     */
    public static void marshalVOIDUINT(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__UINT.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__UINT_POINTER = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__UINT_POINTER",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, guint arg1, gpointer arg2, gpointer user_data)}.
     */
    public static void marshalVOIDUINTPOINTER(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__UINT_POINTER.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__UINT_POINTERv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__UINT_POINTERv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__UINT_POINTER().
     */
    public static void marshalVOIDUINTPOINTERv(Closure closure, Value returnValue, TypeInstance instance, VaList args, java.lang.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__UINT_POINTERv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__UINTv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__UINTv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__UINT().
     */
    public static void marshalVOIDUINTv(Closure closure, Value returnValue, TypeInstance instance, VaList args, java.lang.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__UINTv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__ULONG = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__ULONG",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gulong arg1, gpointer user_data)}.
     */
    public static void marshalVOIDULONG(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__ULONG.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__ULONGv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__ULONGv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__ULONG().
     */
    public static void marshalVOIDULONGv(Closure closure, Value returnValue, TypeInstance instance, VaList args, java.lang.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__ULONGv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__VARIANT = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__VARIANT",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, GVariant *arg1, gpointer user_data)}.
     */
    public static void marshalVOIDVARIANT(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__VARIANT.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__VARIANTv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__VARIANTv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__VARIANT().
     */
    public static void marshalVOIDVARIANTv(Closure closure, Value returnValue, TypeInstance instance, VaList args, java.lang.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__VARIANTv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__VOID = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__VOID",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gpointer user_data)}.
     */
    public static void marshalVOIDVOID(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__VOID.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_VOID__VOIDv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__VOIDv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__VOID().
     */
    public static void marshalVOIDVOIDv(Closure closure, Value returnValue, TypeInstance instance, VaList args, java.lang.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__VOIDv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_generic = Interop.downcallHandle(
        "g_cclosure_marshal_generic",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A generic marshaller function implemented via
     * <a href="http://sourceware.org/libffi/">libffi</a>.
     * <p>
     * Normally this function is not passed explicitly to g_signal_new(),
     * but used automatically by GLib when specifying a {@code null} marshaller.
     */
    public static void marshalGeneric(Closure closure, Value returnGvalue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_generic.invokeExact(closure.handle(), returnGvalue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_marshal_generic_va = Interop.downcallHandle(
        "g_cclosure_marshal_generic_va",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * A generic {@link VaClosureMarshal} function implemented via
     * <a href="http://sourceware.org/libffi/">libffi</a>.
     */
    public static void marshalGenericVa(Closure closure, Value returnValue, TypeInstance instance, VaList argsList, java.lang.foreign.MemoryAddress marshalData, int nParams, org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_generic_va.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), argsList, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_new = Interop.downcallHandle(
        "g_cclosure_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new closure which invokes {@code callback_func} with {@code user_data} as
     * the last parameter.
     * <p>
     * {@code destroy_data} will be called as a finalize notifier on the {@link Closure}.
     */
    public static Closure new_(Callback callbackFunc, ClosureNotify destroyData) {
        try {
            var RESULT = (MemoryAddress) g_cclosure_new.invokeExact(
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbCallback",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callbackFunc.hashCode(), callbackFunc)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbClosureNotify",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()));
            return new Closure(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_cclosure_new_swap = Interop.downcallHandle(
        "g_cclosure_new_swap",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new closure which invokes {@code callback_func} with {@code user_data} as
     * the first parameter.
     * <p>
     * {@code destroy_data} will be called as a finalize notifier on the {@link Closure}.
     */
    public static Closure newSwap(Callback callbackFunc, ClosureNotify destroyData) {
        try {
            var RESULT = (MemoryAddress) g_cclosure_new_swap.invokeExact(
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbCallback",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callbackFunc.hashCode(), callbackFunc)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbClosureNotify",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()));
            return new Closure(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
