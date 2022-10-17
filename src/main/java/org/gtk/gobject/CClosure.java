package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link CClosure} is a specialization of {@link Closure} for C function callbacks.
 */
public class CClosure extends io.github.jwharm.javagi.ResourceBase {

    public CClosure(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_cclosure_marshal_BOOLEAN__BOXED_BOXED = Interop.downcallHandle(
        "g_cclosure_marshal_BOOLEAN__BOXED_BOXED",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A {@link ClosureMarshal} function for use with signals with handlers that
     * take two boxed pointers as arguments and return a boolean.  If you
     * have such a signal, you will probably also need to use an
     * accumulator, such as g_signal_accumulator_true_handled().
     */
    public static @NotNull void marshalBOOLEANBOXEDBOXED(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_BOOLEAN__BOXED_BOXED.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_BOOLEAN__BOXED_BOXEDv = Interop.downcallHandle(
        "g_cclosure_marshal_BOOLEAN__BOXED_BOXEDv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_BOOLEAN__BOXED_BOXED().
     */
    public static @NotNull void marshalBOOLEANBOXEDBOXEDv(@NotNull Closure closure, @Nullable Value returnValue, @NotNull TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, @NotNull int nParams, @NotNull org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_BOOLEAN__BOXED_BOXEDv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_BOOLEAN__FLAGS = Interop.downcallHandle(
        "g_cclosure_marshal_BOOLEAN__FLAGS",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code gboolean (*callback) (gpointer instance, gint arg1, gpointer user_data)} where the {@code gint} parameter
     * denotes a flags type.
     */
    public static @NotNull void marshalBOOLEANFLAGS(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_BOOLEAN__FLAGS.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_BOOLEAN__FLAGSv = Interop.downcallHandle(
        "g_cclosure_marshal_BOOLEAN__FLAGSv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_BOOLEAN__FLAGS().
     */
    public static @NotNull void marshalBOOLEANFLAGSv(@NotNull Closure closure, @Nullable Value returnValue, @NotNull TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, @NotNull int nParams, @NotNull org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_BOOLEAN__FLAGSv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_STRING__OBJECT_POINTER = Interop.downcallHandle(
        "g_cclosure_marshal_STRING__OBJECT_POINTER",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code gchar* (*callback) (gpointer instance, GObject *arg1, gpointer arg2, gpointer user_data)}.
     */
    public static @NotNull void marshalSTRINGOBJECTPOINTER(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_STRING__OBJECT_POINTER.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_STRING__OBJECT_POINTERv = Interop.downcallHandle(
        "g_cclosure_marshal_STRING__OBJECT_POINTERv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_STRING__OBJECT_POINTER().
     */
    public static @NotNull void marshalSTRINGOBJECTPOINTERv(@NotNull Closure closure, @Nullable Value returnValue, @NotNull TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, @NotNull int nParams, @NotNull org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_STRING__OBJECT_POINTERv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__BOOLEAN = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__BOOLEAN",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gboolean arg1, gpointer user_data)}.
     */
    public static @NotNull void marshalVOIDBOOLEAN(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__BOOLEAN.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__BOOLEANv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__BOOLEANv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__BOOLEAN().
     */
    public static @NotNull void marshalVOIDBOOLEANv(@NotNull Closure closure, @Nullable Value returnValue, @NotNull TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, @NotNull int nParams, @NotNull org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__BOOLEANv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__BOXED = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__BOXED",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, GBoxed *arg1, gpointer user_data)}.
     */
    public static @NotNull void marshalVOIDBOXED(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__BOXED.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__BOXEDv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__BOXEDv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__BOXED().
     */
    public static @NotNull void marshalVOIDBOXEDv(@NotNull Closure closure, @Nullable Value returnValue, @NotNull TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, @NotNull int nParams, @NotNull org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__BOXEDv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__CHAR = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__CHAR",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gchar arg1, gpointer user_data)}.
     */
    public static @NotNull void marshalVOIDCHAR(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__CHAR.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__CHARv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__CHARv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__CHAR().
     */
    public static @NotNull void marshalVOIDCHARv(@NotNull Closure closure, @Nullable Value returnValue, @NotNull TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, @NotNull int nParams, @NotNull org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__CHARv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__DOUBLE = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__DOUBLE",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gdouble arg1, gpointer user_data)}.
     */
    public static @NotNull void marshalVOIDDOUBLE(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__DOUBLE.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__DOUBLEv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__DOUBLEv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__DOUBLE().
     */
    public static @NotNull void marshalVOIDDOUBLEv(@NotNull Closure closure, @Nullable Value returnValue, @NotNull TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, @NotNull int nParams, @NotNull org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__DOUBLEv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__ENUM = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__ENUM",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gint arg1, gpointer user_data)} where the {@code gint} parameter denotes an enumeration type..
     */
    public static @NotNull void marshalVOIDENUM(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__ENUM.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__ENUMv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__ENUMv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__ENUM().
     */
    public static @NotNull void marshalVOIDENUMv(@NotNull Closure closure, @Nullable Value returnValue, @NotNull TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, @NotNull int nParams, @NotNull org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__ENUMv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__FLAGS = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__FLAGS",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gint arg1, gpointer user_data)} where the {@code gint} parameter denotes a flags type.
     */
    public static @NotNull void marshalVOIDFLAGS(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__FLAGS.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__FLAGSv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__FLAGSv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__FLAGS().
     */
    public static @NotNull void marshalVOIDFLAGSv(@NotNull Closure closure, @Nullable Value returnValue, @NotNull TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, @NotNull int nParams, @NotNull org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__FLAGSv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__FLOAT = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__FLOAT",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gfloat arg1, gpointer user_data)}.
     */
    public static @NotNull void marshalVOIDFLOAT(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__FLOAT.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__FLOATv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__FLOATv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__FLOAT().
     */
    public static @NotNull void marshalVOIDFLOATv(@NotNull Closure closure, @Nullable Value returnValue, @NotNull TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, @NotNull int nParams, @NotNull org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__FLOATv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__INT = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__INT",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gint arg1, gpointer user_data)}.
     */
    public static @NotNull void marshalVOIDINT(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__INT.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__INTv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__INTv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__INT().
     */
    public static @NotNull void marshalVOIDINTv(@NotNull Closure closure, @Nullable Value returnValue, @NotNull TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, @NotNull int nParams, @NotNull org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__INTv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__LONG = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__LONG",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, glong arg1, gpointer user_data)}.
     */
    public static @NotNull void marshalVOIDLONG(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__LONG.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__LONGv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__LONGv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__LONG().
     */
    public static @NotNull void marshalVOIDLONGv(@NotNull Closure closure, @Nullable Value returnValue, @NotNull TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, @NotNull int nParams, @NotNull org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__LONGv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__OBJECT = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__OBJECT",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, GObject *arg1, gpointer user_data)}.
     */
    public static @NotNull void marshalVOIDOBJECT(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__OBJECT.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__OBJECTv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__OBJECTv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__OBJECT().
     */
    public static @NotNull void marshalVOIDOBJECTv(@NotNull Closure closure, @Nullable Value returnValue, @NotNull TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, @NotNull int nParams, @NotNull org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__OBJECTv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__PARAM = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__PARAM",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, GParamSpec *arg1, gpointer user_data)}.
     */
    public static @NotNull void marshalVOIDPARAM(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__PARAM.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__PARAMv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__PARAMv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__PARAM().
     */
    public static @NotNull void marshalVOIDPARAMv(@NotNull Closure closure, @Nullable Value returnValue, @NotNull TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, @NotNull int nParams, @NotNull org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__PARAMv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__POINTER = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__POINTER",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gpointer arg1, gpointer user_data)}.
     */
    public static @NotNull void marshalVOIDPOINTER(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__POINTER.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__POINTERv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__POINTERv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__POINTER().
     */
    public static @NotNull void marshalVOIDPOINTERv(@NotNull Closure closure, @Nullable Value returnValue, @NotNull TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, @NotNull int nParams, @NotNull org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__POINTERv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__STRING = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__STRING",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, const gchar *arg1, gpointer user_data)}.
     */
    public static @NotNull void marshalVOIDSTRING(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__STRING.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__STRINGv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__STRINGv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__STRING().
     */
    public static @NotNull void marshalVOIDSTRINGv(@NotNull Closure closure, @Nullable Value returnValue, @NotNull TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, @NotNull int nParams, @NotNull org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__STRINGv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__UCHAR = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__UCHAR",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, guchar arg1, gpointer user_data)}.
     */
    public static @NotNull void marshalVOIDUCHAR(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__UCHAR.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__UCHARv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__UCHARv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__UCHAR().
     */
    public static @NotNull void marshalVOIDUCHARv(@NotNull Closure closure, @Nullable Value returnValue, @NotNull TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, @NotNull int nParams, @NotNull org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__UCHARv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__UINT = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__UINT",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, guint arg1, gpointer user_data)}.
     */
    public static @NotNull void marshalVOIDUINT(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__UINT.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__UINT_POINTER = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__UINT_POINTER",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, guint arg1, gpointer arg2, gpointer user_data)}.
     */
    public static @NotNull void marshalVOIDUINTPOINTER(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__UINT_POINTER.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__UINT_POINTERv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__UINT_POINTERv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__UINT_POINTER().
     */
    public static @NotNull void marshalVOIDUINTPOINTERv(@NotNull Closure closure, @Nullable Value returnValue, @NotNull TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, @NotNull int nParams, @NotNull org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__UINT_POINTERv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__UINTv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__UINTv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__UINT().
     */
    public static @NotNull void marshalVOIDUINTv(@NotNull Closure closure, @Nullable Value returnValue, @NotNull TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, @NotNull int nParams, @NotNull org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__UINTv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__ULONG = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__ULONG",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gulong arg1, gpointer user_data)}.
     */
    public static @NotNull void marshalVOIDULONG(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__ULONG.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__ULONGv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__ULONGv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__ULONG().
     */
    public static @NotNull void marshalVOIDULONGv(@NotNull Closure closure, @Nullable Value returnValue, @NotNull TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, @NotNull int nParams, @NotNull org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__ULONGv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__VARIANT = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__VARIANT",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, GVariant *arg1, gpointer user_data)}.
     */
    public static @NotNull void marshalVOIDVARIANT(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__VARIANT.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__VARIANTv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__VARIANTv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__VARIANT().
     */
    public static @NotNull void marshalVOIDVARIANTv(@NotNull Closure closure, @Nullable Value returnValue, @NotNull TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, @NotNull int nParams, @NotNull org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__VARIANTv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__VOID = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__VOID",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A marshaller for a {@link CClosure} with a callback of type
     * {@code void (*callback) (gpointer instance, gpointer user_data)}.
     */
    public static @NotNull void marshalVOIDVOID(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__VOID.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_VOID__VOIDv = Interop.downcallHandle(
        "g_cclosure_marshal_VOID__VOIDv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * The {@link VaClosureMarshal} equivalent to g_cclosure_marshal_VOID__VOID().
     */
    public static @NotNull void marshalVOIDVOIDv(@NotNull Closure closure, @Nullable Value returnValue, @NotNull TypeInstance instance, @NotNull VaList args, @Nullable java.lang.foreign.MemoryAddress marshalData, @NotNull int nParams, @NotNull org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_VOID__VOIDv.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), args, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_generic = Interop.downcallHandle(
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
    public static @NotNull void marshalGeneric(@NotNull Closure closure, @NotNull Value returnGvalue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_generic.invokeExact(closure.handle(), returnGvalue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_marshal_generic_va = Interop.downcallHandle(
        "g_cclosure_marshal_generic_va",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * A generic {@link VaClosureMarshal} function implemented via
     * <a href="http://sourceware.org/libffi/">libffi</a>.
     */
    public static @NotNull void marshalGenericVa(@NotNull Closure closure, @Nullable Value returnValue, @NotNull TypeInstance instance, @NotNull VaList argsList, @Nullable java.lang.foreign.MemoryAddress marshalData, @NotNull int nParams, @NotNull org.gtk.gobject.Type[] paramTypes) {
        try {
            g_cclosure_marshal_generic_va.invokeExact(closure.handle(), returnValue.handle(), instance.handle(), argsList, marshalData, nParams, Interop.allocateNativeArray(org.gtk.gobject.Type.getLongValues(paramTypes)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_cclosure_new = Interop.downcallHandle(
        "g_cclosure_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new closure which invokes {@code callback_func} with {@code user_data} as
     * the last parameter.
     * <p>
     * {@code destroy_data} will be called as a finalize notifier on the {@link Closure}.
     */
    public static @NotNull Closure new_(@Nullable Callback callbackFunc, @NotNull ClosureNotify destroyData) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_cclosure_new.invokeExact(
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbCallback",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callbackFunc)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbClosureNotify",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Closure(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_cclosure_new_swap = Interop.downcallHandle(
        "g_cclosure_new_swap",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new closure which invokes {@code callback_func} with {@code user_data} as
     * the first parameter.
     * <p>
     * {@code destroy_data} will be called as a finalize notifier on the {@link Closure}.
     */
    public static @NotNull Closure newSwap(@Nullable Callback callbackFunc, @NotNull ClosureNotify destroyData) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_cclosure_new_swap.invokeExact(
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbCallback",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callbackFunc)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbClosureNotify",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Closure(Refcounted.get(RESULT, false));
    }
    
}
