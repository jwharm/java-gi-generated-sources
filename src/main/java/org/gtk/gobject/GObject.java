package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

public final class GObject {
    
    public static final int PARAM_MASK = 255;

    public static final int PARAM_STATIC_STRINGS = 224;

    public static final int PARAM_USER_SHIFT = 8;

    public static final int SIGNAL_FLAGS_MASK = 511;

    public static final int SIGNAL_MATCH_MASK = 63;

    public static final org.gtk.glib.Type TYPE_FLAG_RESERVED_ID_BIT = new org.gtk.glib.Type(1L);

    public static final int TYPE_FUNDAMENTAL_MAX = 255;

    public static final int TYPE_FUNDAMENTAL_SHIFT = 2;

    public static final int TYPE_RESERVED_BSE_FIRST = 32;

    public static final int TYPE_RESERVED_BSE_LAST = 48;

    public static final int TYPE_RESERVED_GLIB_FIRST = 22;

    public static final int TYPE_RESERVED_GLIB_LAST = 31;

    public static final int TYPE_RESERVED_USER_FIRST = 49;

    public static final int VALUE_INTERNED_STRING = 268435456;

    public static final int VALUE_NOCOPY_CONTENTS = 134217728;

    static final MethodHandle g_boxed_copy = Interop.downcallHandle(
        "g_boxed_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Provide a copy of a boxed structure {@code src_boxed} which is of type {@code boxed_type}.
     */
    public static java.lang.foreign.MemoryAddress boxedCopy(org.gtk.gobject.Type boxedType, java.lang.foreign.MemoryAddress srcBoxed) {
        try {
            var RESULT = (MemoryAddress) g_boxed_copy.invokeExact(boxedType.getValue(), srcBoxed);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_boxed_free = Interop.downcallHandle(
        "g_boxed_free",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Free the boxed structure {@code boxed} which is of type {@code boxed_type}.
     */
    public static void boxedFree(org.gtk.gobject.Type boxedType, java.lang.foreign.MemoryAddress boxed) {
        try {
            g_boxed_free.invokeExact(boxedType.getValue(), boxed);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    public static void cclosureMarshalBOOLEANBOXEDBOXED(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_BOOLEAN__BOXED_BOXED.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static void cclosureMarshalBOOLEANFLAGS(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_BOOLEAN__FLAGS.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static void cclosureMarshalSTRINGOBJECTPOINTER(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_STRING__OBJECT_POINTER.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static void cclosureMarshalVOIDBOOLEAN(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__BOOLEAN.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static void cclosureMarshalVOIDBOXED(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__BOXED.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static void cclosureMarshalVOIDCHAR(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__CHAR.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static void cclosureMarshalVOIDDOUBLE(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__DOUBLE.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static void cclosureMarshalVOIDENUM(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__ENUM.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static void cclosureMarshalVOIDFLAGS(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__FLAGS.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static void cclosureMarshalVOIDFLOAT(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__FLOAT.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static void cclosureMarshalVOIDINT(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__INT.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static void cclosureMarshalVOIDLONG(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__LONG.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static void cclosureMarshalVOIDOBJECT(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__OBJECT.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static void cclosureMarshalVOIDPARAM(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__PARAM.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static void cclosureMarshalVOIDPOINTER(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__POINTER.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static void cclosureMarshalVOIDSTRING(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__STRING.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static void cclosureMarshalVOIDUCHAR(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__UCHAR.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static void cclosureMarshalVOIDUINT(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
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
    public static void cclosureMarshalVOIDUINTPOINTER(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__UINT_POINTER.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static void cclosureMarshalVOIDULONG(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__ULONG.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static void cclosureMarshalVOIDVARIANT(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__VARIANT.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static void cclosureMarshalVOIDVOID(Closure closure, Value returnValue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__VOID.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static void cclosureMarshalGeneric(Closure closure, Value returnGvalue, int nParamValues, Value paramValues, java.lang.foreign.MemoryAddress invocationHint, java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_generic.invokeExact(closure.handle(), returnGvalue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static Closure cclosureNew(Callback callbackFunc, ClosureNotify destroyData) {
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
    public static Closure cclosureNewSwap(Callback callbackFunc, ClosureNotify destroyData) {
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
    
    static final MethodHandle g_clear_object = Interop.downcallHandle(
        "g_clear_object",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Clears a reference to a {@link Object}.
     * <p>
     * {@code object_ptr} must not be {@code null}.
     * <p>
     * If the reference is {@code null} then this function does nothing.
     * Otherwise, the reference count of the object is decreased and the
     * pointer is set to {@code null}.
     * <p>
     * A macro is also included that allows this function to be used without
     * pointer casts.
     */
    public static void clearObject(Object[] objectPtr) {
        try {
            g_clear_object.invokeExact(Interop.allocateNativeArray(objectPtr).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_clear_signal_handler = Interop.downcallHandle(
        "g_clear_signal_handler",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Disconnects a handler from {@code instance} so it will not be called during
     * any future or currently ongoing emissions of the signal it has been
     * connected to. The {@code handler_id_ptr} is then set to zero, which is never a valid handler ID value (see g_signal_connect()).
     * <p>
     * If the handler ID is 0 then this function does nothing.
     * <p>
     * There is also a macro version of this function so that the code
     * will be inlined.
     */
    public static void clearSignalHandler(PointerLong handlerIdPtr, Object instance) {
        try {
            g_clear_signal_handler.invokeExact(handlerIdPtr.handle(), instance.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_enum_complete_type_info = Interop.downcallHandle(
        "g_enum_complete_type_info",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This function is meant to be called from the {@code complete_type_info}
     * function of a {@link TypePlugin} implementation, as in the following
     * example:
     * <p>
     * <pre>{@code <!-- language="C" -->
     * static void
     * my_enum_complete_type_info (GTypePlugin     *plugin,
     *                             GType            g_type,
     *                             GTypeInfo       *info,
     *                             GTypeValueTable *value_table)
     * {
     *   static const GEnumValue values[] = {
     *     { MY_ENUM_FOO, "MY_ENUM_FOO", "foo" },
     *     { MY_ENUM_BAR, "MY_ENUM_BAR", "bar" },
     *     { 0, NULL, NULL }
     *   };
     * 
     *   g_enum_complete_type_info (type, info, values);
     * }
     * }</pre>
     */
    public static void enumCompleteTypeInfo(org.gtk.gobject.Type gEnumType, TypeInfo info, EnumValue constValues) {
        try {
            g_enum_complete_type_info.invokeExact(gEnumType.getValue(), info.refcounted().unowned().handle(), constValues.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_enum_get_value = Interop.downcallHandle(
        "g_enum_get_value",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the {@link EnumValue} for a value.
     */
    public static EnumValue enumGetValue(EnumClass enumClass, int value) {
        try {
            var RESULT = (MemoryAddress) g_enum_get_value.invokeExact(enumClass.handle(), value);
            return new EnumValue(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_enum_get_value_by_name = Interop.downcallHandle(
        "g_enum_get_value_by_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up a {@link EnumValue} by name.
     */
    public static EnumValue enumGetValueByName(EnumClass enumClass, java.lang.String name) {
        try {
            var RESULT = (MemoryAddress) g_enum_get_value_by_name.invokeExact(enumClass.handle(), Interop.allocateNativeString(name).handle());
            return new EnumValue(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_enum_get_value_by_nick = Interop.downcallHandle(
        "g_enum_get_value_by_nick",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up a {@link EnumValue} by nickname.
     */
    public static EnumValue enumGetValueByNick(EnumClass enumClass, java.lang.String nick) {
        try {
            var RESULT = (MemoryAddress) g_enum_get_value_by_nick.invokeExact(enumClass.handle(), Interop.allocateNativeString(nick).handle());
            return new EnumValue(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_enum_register_static = Interop.downcallHandle(
        "g_enum_register_static",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Registers a new static enumeration type with the name {@code name}.
     * <p>
     * It is normally more convenient to let [glib-mkenums][glib-mkenums],
     * generate a my_enum_get_type() function from a usual C enumeration
     * definition  than to write one yourself using g_enum_register_static().
     */
    public static org.gtk.gobject.Type enumRegisterStatic(java.lang.String name, EnumValue constStaticValues) {
        try {
            var RESULT = (long) g_enum_register_static.invokeExact(Interop.allocateNativeString(name).handle(), constStaticValues.handle());
            return new org.gtk.gobject.Type(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_enum_to_string = Interop.downcallHandle(
        "g_enum_to_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Pretty-prints {@code value} in the form of the enum’s name.
     * <p>
     * This is intended to be used for debugging purposes. The format of the output
     * may change in the future.
     */
    public static java.lang.String enumToString(org.gtk.gobject.Type gEnumType, int value) {
        try {
            var RESULT = (MemoryAddress) g_enum_to_string.invokeExact(gEnumType.getValue(), value);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_flags_complete_type_info = Interop.downcallHandle(
        "g_flags_complete_type_info",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This function is meant to be called from the complete_type_info()
     * function of a {@link TypePlugin} implementation, see the example for
     * g_enum_complete_type_info() above.
     */
    public static void flagsCompleteTypeInfo(org.gtk.gobject.Type gFlagsType, TypeInfo info, FlagsValue constValues) {
        try {
            g_flags_complete_type_info.invokeExact(gFlagsType.getValue(), info.refcounted().unowned().handle(), constValues.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_flags_get_first_value = Interop.downcallHandle(
        "g_flags_get_first_value",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the first {@link FlagsValue} which is set in {@code value}.
     */
    public static FlagsValue flagsGetFirstValue(FlagsClass flagsClass, int value) {
        try {
            var RESULT = (MemoryAddress) g_flags_get_first_value.invokeExact(flagsClass.handle(), value);
            return new FlagsValue(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_flags_get_value_by_name = Interop.downcallHandle(
        "g_flags_get_value_by_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up a {@link FlagsValue} by name.
     */
    public static FlagsValue flagsGetValueByName(FlagsClass flagsClass, java.lang.String name) {
        try {
            var RESULT = (MemoryAddress) g_flags_get_value_by_name.invokeExact(flagsClass.handle(), Interop.allocateNativeString(name).handle());
            return new FlagsValue(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_flags_get_value_by_nick = Interop.downcallHandle(
        "g_flags_get_value_by_nick",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up a {@link FlagsValue} by nickname.
     */
    public static FlagsValue flagsGetValueByNick(FlagsClass flagsClass, java.lang.String nick) {
        try {
            var RESULT = (MemoryAddress) g_flags_get_value_by_nick.invokeExact(flagsClass.handle(), Interop.allocateNativeString(nick).handle());
            return new FlagsValue(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_flags_register_static = Interop.downcallHandle(
        "g_flags_register_static",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Registers a new static flags type with the name {@code name}.
     * <p>
     * It is normally more convenient to let [glib-mkenums][glib-mkenums]
     * generate a my_flags_get_type() function from a usual C enumeration
     * definition than to write one yourself using g_flags_register_static().
     */
    public static org.gtk.gobject.Type flagsRegisterStatic(java.lang.String name, FlagsValue constStaticValues) {
        try {
            var RESULT = (long) g_flags_register_static.invokeExact(Interop.allocateNativeString(name).handle(), constStaticValues.handle());
            return new org.gtk.gobject.Type(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_flags_to_string = Interop.downcallHandle(
        "g_flags_to_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Pretty-prints {@code value} in the form of the flag names separated by {@code  | } and
     * sorted. Any extra bits will be shown at the end as a hexadecimal number.
     * <p>
     * This is intended to be used for debugging purposes. The format of the output
     * may change in the future.
     */
    public static java.lang.String flagsToString(org.gtk.gobject.Type flagsType, int value) {
        try {
            var RESULT = (MemoryAddress) g_flags_to_string.invokeExact(flagsType.getValue(), value);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_gtype_get_type = Interop.downcallHandle(
        "g_gtype_get_type",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG)
    );
    
    public static org.gtk.gobject.Type gtypeGetType() {
        try {
            var RESULT = (long) g_gtype_get_type.invokeExact();
            return new org.gtk.gobject.Type(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_boolean = Interop.downcallHandle(
        "g_param_spec_boolean",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecBoolean} instance specifying a {@code G_TYPE_BOOLEAN}
     * property. In many cases, it may be more appropriate to use an enum with
     * g_param_spec_enum(), both to improve code clarity by using explicitly named
     * values, and to allow for more values to be added in future without breaking
     * API.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecBoolean(java.lang.String name, java.lang.String nick, java.lang.String blurb, boolean defaultValue, ParamFlags flags) {
        try {
            var RESULT = (MemoryAddress) g_param_spec_boolean.invokeExact(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), defaultValue ? 1 : 0, flags.getValue());
            return new ParamSpec(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_boxed = Interop.downcallHandle(
        "g_param_spec_boxed",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecBoxed} instance specifying a {@code G_TYPE_BOXED}
     * derived property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecBoxed(java.lang.String name, java.lang.String nick, java.lang.String blurb, org.gtk.gobject.Type boxedType, ParamFlags flags) {
        try {
            var RESULT = (MemoryAddress) g_param_spec_boxed.invokeExact(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), boxedType.getValue(), flags.getValue());
            return new ParamSpec(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_char = Interop.downcallHandle(
        "g_param_spec_char",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecChar} instance specifying a {@code G_TYPE_CHAR} property.
     */
    public static ParamSpec paramSpecChar(java.lang.String name, java.lang.String nick, java.lang.String blurb, byte minimum, byte maximum, byte defaultValue, ParamFlags flags) {
        try {
            var RESULT = (MemoryAddress) g_param_spec_char.invokeExact(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), minimum, maximum, defaultValue, flags.getValue());
            return new ParamSpec(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_double = Interop.downcallHandle(
        "g_param_spec_double",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecDouble} instance specifying a {@code G_TYPE_DOUBLE}
     * property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecDouble(java.lang.String name, java.lang.String nick, java.lang.String blurb, double minimum, double maximum, double defaultValue, ParamFlags flags) {
        try {
            var RESULT = (MemoryAddress) g_param_spec_double.invokeExact(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), minimum, maximum, defaultValue, flags.getValue());
            return new ParamSpec(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_enum = Interop.downcallHandle(
        "g_param_spec_enum",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecEnum} instance specifying a {@code G_TYPE_ENUM}
     * property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecEnum(java.lang.String name, java.lang.String nick, java.lang.String blurb, org.gtk.gobject.Type enumType, int defaultValue, ParamFlags flags) {
        try {
            var RESULT = (MemoryAddress) g_param_spec_enum.invokeExact(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), enumType.getValue(), defaultValue, flags.getValue());
            return new ParamSpec(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_flags = Interop.downcallHandle(
        "g_param_spec_flags",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecFlags} instance specifying a {@code G_TYPE_FLAGS}
     * property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecFlags(java.lang.String name, java.lang.String nick, java.lang.String blurb, org.gtk.gobject.Type flagsType, int defaultValue, ParamFlags flags) {
        try {
            var RESULT = (MemoryAddress) g_param_spec_flags.invokeExact(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), flagsType.getValue(), defaultValue, flags.getValue());
            return new ParamSpec(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_float = Interop.downcallHandle(
        "g_param_spec_float",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecFloat} instance specifying a {@code G_TYPE_FLOAT} property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecFloat(java.lang.String name, java.lang.String nick, java.lang.String blurb, float minimum, float maximum, float defaultValue, ParamFlags flags) {
        try {
            var RESULT = (MemoryAddress) g_param_spec_float.invokeExact(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), minimum, maximum, defaultValue, flags.getValue());
            return new ParamSpec(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_gtype = Interop.downcallHandle(
        "g_param_spec_gtype",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecGType} instance specifying a
     * {@code G_TYPE_GTYPE} property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecGtype(java.lang.String name, java.lang.String nick, java.lang.String blurb, org.gtk.gobject.Type isAType, ParamFlags flags) {
        try {
            var RESULT = (MemoryAddress) g_param_spec_gtype.invokeExact(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), isAType.getValue(), flags.getValue());
            return new ParamSpec(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_int = Interop.downcallHandle(
        "g_param_spec_int",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecInt} instance specifying a {@code G_TYPE_INT} property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecInt(java.lang.String name, java.lang.String nick, java.lang.String blurb, int minimum, int maximum, int defaultValue, ParamFlags flags) {
        try {
            var RESULT = (MemoryAddress) g_param_spec_int.invokeExact(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), minimum, maximum, defaultValue, flags.getValue());
            return new ParamSpec(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_int64 = Interop.downcallHandle(
        "g_param_spec_int64",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecInt64} instance specifying a {@code G_TYPE_INT64} property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecInt64(java.lang.String name, java.lang.String nick, java.lang.String blurb, long minimum, long maximum, long defaultValue, ParamFlags flags) {
        try {
            var RESULT = (MemoryAddress) g_param_spec_int64.invokeExact(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), minimum, maximum, defaultValue, flags.getValue());
            return new ParamSpec(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_long = Interop.downcallHandle(
        "g_param_spec_long",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecLong} instance specifying a {@code G_TYPE_LONG} property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecLong(java.lang.String name, java.lang.String nick, java.lang.String blurb, long minimum, long maximum, long defaultValue, ParamFlags flags) {
        try {
            var RESULT = (MemoryAddress) g_param_spec_long.invokeExact(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), minimum, maximum, defaultValue, flags.getValue());
            return new ParamSpec(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_object = Interop.downcallHandle(
        "g_param_spec_object",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecBoxed} instance specifying a {@code G_TYPE_OBJECT}
     * derived property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecObject(java.lang.String name, java.lang.String nick, java.lang.String blurb, org.gtk.gobject.Type objectType, ParamFlags flags) {
        try {
            var RESULT = (MemoryAddress) g_param_spec_object.invokeExact(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), objectType.getValue(), flags.getValue());
            return new ParamSpec(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_override = Interop.downcallHandle(
        "g_param_spec_override",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new property of type {@link ParamSpecOverride}. This is used
     * to direct operations to another paramspec, and will not be directly
     * useful unless you are implementing a new base type similar to GObject.
     */
    public static ParamSpec paramSpecOverride(java.lang.String name, ParamSpec overridden) {
        try {
            var RESULT = (MemoryAddress) g_param_spec_override.invokeExact(Interop.allocateNativeString(name).handle(), overridden.handle());
            return new ParamSpec(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_param = Interop.downcallHandle(
        "g_param_spec_param",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecParam} instance specifying a {@code G_TYPE_PARAM}
     * property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecParam(java.lang.String name, java.lang.String nick, java.lang.String blurb, org.gtk.gobject.Type paramType, ParamFlags flags) {
        try {
            var RESULT = (MemoryAddress) g_param_spec_param.invokeExact(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), paramType.getValue(), flags.getValue());
            return new ParamSpec(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_pointer = Interop.downcallHandle(
        "g_param_spec_pointer",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecPointer} instance specifying a pointer property.
     * Where possible, it is better to use g_param_spec_object() or
     * g_param_spec_boxed() to expose memory management information.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecPointer(java.lang.String name, java.lang.String nick, java.lang.String blurb, ParamFlags flags) {
        try {
            var RESULT = (MemoryAddress) g_param_spec_pointer.invokeExact(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), flags.getValue());
            return new ParamSpec(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_string = Interop.downcallHandle(
        "g_param_spec_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecString} instance.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecString(java.lang.String name, java.lang.String nick, java.lang.String blurb, java.lang.String defaultValue, ParamFlags flags) {
        try {
            var RESULT = (MemoryAddress) g_param_spec_string.invokeExact(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), Interop.allocateNativeString(defaultValue).handle(), flags.getValue());
            return new ParamSpec(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_uchar = Interop.downcallHandle(
        "g_param_spec_uchar",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecUChar} instance specifying a {@code G_TYPE_UCHAR} property.
     */
    public static ParamSpec paramSpecUchar(java.lang.String name, java.lang.String nick, java.lang.String blurb, byte minimum, byte maximum, byte defaultValue, ParamFlags flags) {
        try {
            var RESULT = (MemoryAddress) g_param_spec_uchar.invokeExact(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), minimum, maximum, defaultValue, flags.getValue());
            return new ParamSpec(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_uint = Interop.downcallHandle(
        "g_param_spec_uint",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecUInt} instance specifying a {@code G_TYPE_UINT} property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecUint(java.lang.String name, java.lang.String nick, java.lang.String blurb, int minimum, int maximum, int defaultValue, ParamFlags flags) {
        try {
            var RESULT = (MemoryAddress) g_param_spec_uint.invokeExact(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), minimum, maximum, defaultValue, flags.getValue());
            return new ParamSpec(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_uint64 = Interop.downcallHandle(
        "g_param_spec_uint64",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecUInt64} instance specifying a {@code G_TYPE_UINT64}
     * property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecUint64(java.lang.String name, java.lang.String nick, java.lang.String blurb, long minimum, long maximum, long defaultValue, ParamFlags flags) {
        try {
            var RESULT = (MemoryAddress) g_param_spec_uint64.invokeExact(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), minimum, maximum, defaultValue, flags.getValue());
            return new ParamSpec(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_ulong = Interop.downcallHandle(
        "g_param_spec_ulong",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecULong} instance specifying a {@code G_TYPE_ULONG}
     * property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecUlong(java.lang.String name, java.lang.String nick, java.lang.String blurb, long minimum, long maximum, long defaultValue, ParamFlags flags) {
        try {
            var RESULT = (MemoryAddress) g_param_spec_ulong.invokeExact(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), minimum, maximum, defaultValue, flags.getValue());
            return new ParamSpec(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_unichar = Interop.downcallHandle(
        "g_param_spec_unichar",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecUnichar} instance specifying a {@code G_TYPE_UINT}
     * property. {@link Value} structures for this property can be accessed with
     * g_value_set_uint() and g_value_get_uint().
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecUnichar(java.lang.String name, java.lang.String nick, java.lang.String blurb, int defaultValue, ParamFlags flags) {
        try {
            var RESULT = (MemoryAddress) g_param_spec_unichar.invokeExact(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), defaultValue, flags.getValue());
            return new ParamSpec(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_value_array = Interop.downcallHandle(
        "g_param_spec_value_array",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecValueArray} instance specifying a
     * {@code G_TYPE_VALUE_ARRAY} property. {@code G_TYPE_VALUE_ARRAY} is a
     * {@code G_TYPE_BOXED} type, as such, {@link Value} structures for this property
     * can be accessed with g_value_set_boxed() and g_value_get_boxed().
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecValueArray(java.lang.String name, java.lang.String nick, java.lang.String blurb, ParamSpec elementSpec, ParamFlags flags) {
        try {
            var RESULT = (MemoryAddress) g_param_spec_value_array.invokeExact(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), elementSpec.handle(), flags.getValue());
            return new ParamSpec(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_spec_variant = Interop.downcallHandle(
        "g_param_spec_variant",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecVariant} instance specifying a {@link org.gtk.glib.Variant}
     * property.
     * <p>
     * If {@code default_value} is floating, it is consumed.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static ParamSpec paramSpecVariant(java.lang.String name, java.lang.String nick, java.lang.String blurb, org.gtk.glib.VariantType type, org.gtk.glib.Variant defaultValue, ParamFlags flags) {
        try {
            var RESULT = (MemoryAddress) g_param_spec_variant.invokeExact(Interop.allocateNativeString(name).handle(), Interop.allocateNativeString(nick).handle(), Interop.allocateNativeString(blurb).handle(), type.handle(), defaultValue.refcounted().unowned().handle(), flags.getValue());
            return new ParamSpec(Refcounted.get(RESULT, true));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_type_register_static = Interop.downcallHandle(
        "g_param_type_register_static",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Registers {@code name} as the name of a new static type derived
     * from {@code G_TYPE_PARAM}.
     * <p>
     * The type system uses the information contained in the {@link ParamSpecTypeInfo}
     * structure pointed to by {@code info} to manage the {@link ParamSpec} type and its
     * instances.
     */
    public static org.gtk.gobject.Type paramTypeRegisterStatic(java.lang.String name, ParamSpecTypeInfo pspecInfo) {
        try {
            var RESULT = (long) g_param_type_register_static.invokeExact(Interop.allocateNativeString(name).handle(), pspecInfo.handle());
            return new org.gtk.gobject.Type(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_value_convert = Interop.downcallHandle(
        "g_param_value_convert",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Transforms {@code src_value} into {@code dest_value} if possible, and then
     * validates {@code dest_value}, in order for it to conform to {@code pspec}.  If
     * {@code strict_validation} is {@code true} this function will only succeed if the
     * transformed {@code dest_value} complied to {@code pspec} without modifications.
     * <p>
     * See also g_value_type_transformable(), g_value_transform() and
     * g_param_value_validate().
     */
    public static boolean paramValueConvert(ParamSpec pspec, Value srcValue, Value destValue, boolean strictValidation) {
        try {
            var RESULT = (int) g_param_value_convert.invokeExact(pspec.handle(), srcValue.handle(), destValue.handle(), strictValidation ? 1 : 0);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_value_defaults = Interop.downcallHandle(
        "g_param_value_defaults",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether {@code value} contains the default value as specified in {@code pspec}.
     */
    public static boolean paramValueDefaults(ParamSpec pspec, Value value) {
        try {
            var RESULT = (int) g_param_value_defaults.invokeExact(pspec.handle(), value.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_value_set_default = Interop.downcallHandle(
        "g_param_value_set_default",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code value} to its default value as specified in {@code pspec}.
     */
    public static void paramValueSetDefault(ParamSpec pspec, Value value) {
        try {
            g_param_value_set_default.invokeExact(pspec.handle(), value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_value_validate = Interop.downcallHandle(
        "g_param_value_validate",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Ensures that the contents of {@code value} comply with the specifications
     * set out by {@code pspec}. For example, a {@link ParamSpecInt} might require
     * that integers stored in {@code value} may not be smaller than -42 and not be
     * greater than +42. If {@code value} contains an integer outside of this range,
     * it is modified accordingly, so the resulting value will fit into the
     * range -42 .. +42.
     */
    public static boolean paramValueValidate(ParamSpec pspec, Value value) {
        try {
            var RESULT = (int) g_param_value_validate.invokeExact(pspec.handle(), value.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_param_values_cmp = Interop.downcallHandle(
        "g_param_values_cmp",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares {@code value1} with {@code value2} according to {@code pspec}, and return -1, 0 or +1,
     * if {@code value1} is found to be less than, equal to or greater than {@code value2},
     * respectively.
     */
    public static int paramValuesCmp(ParamSpec pspec, Value value1, Value value2) {
        try {
            var RESULT = (int) g_param_values_cmp.invokeExact(pspec.handle(), value1.handle(), value2.handle());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_pointer_type_register_static = Interop.downcallHandle(
        "g_pointer_type_register_static",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@code G_TYPE_POINTER} derived type id for a new
     * pointer type with name {@code name}.
     */
    public static org.gtk.gobject.Type pointerTypeRegisterStatic(java.lang.String name) {
        try {
            var RESULT = (long) g_pointer_type_register_static.invokeExact(Interop.allocateNativeString(name).handle());
            return new org.gtk.gobject.Type(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_accumulator_first_wins = Interop.downcallHandle(
        "g_signal_accumulator_first_wins",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A predefined {@link SignalAccumulator} for signals intended to be used as a
     * hook for application code to provide a particular value.  Usually
     * only one such value is desired and multiple handlers for the same
     * signal don't make much sense (except for the case of the default
     * handler defined in the class structure, in which case you will
     * usually want the signal connection to override the class handler).
     * <p>
     * This accumulator will use the return value from the first signal
     * handler that is run as the return value for the signal and not run
     * any further handlers (ie: the first handler "wins").
     */
    public static boolean signalAccumulatorFirstWins(SignalInvocationHint ihint, Value returnAccu, Value handlerReturn, java.lang.foreign.MemoryAddress dummy) {
        try {
            var RESULT = (int) g_signal_accumulator_first_wins.invokeExact(ihint.handle(), returnAccu.handle(), handlerReturn.handle(), dummy);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_accumulator_true_handled = Interop.downcallHandle(
        "g_signal_accumulator_true_handled",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * A predefined {@link SignalAccumulator} for signals that return a
     * boolean values. The behavior that this accumulator gives is
     * that a return of {@code true} stops the signal emission: no further
     * callbacks will be invoked, while a return of {@code false} allows
     * the emission to continue. The idea here is that a {@code true} return
     * indicates that the callback handled the signal, and no further
     * handling is needed.
     */
    public static boolean signalAccumulatorTrueHandled(SignalInvocationHint ihint, Value returnAccu, Value handlerReturn, java.lang.foreign.MemoryAddress dummy) {
        try {
            var RESULT = (int) g_signal_accumulator_true_handled.invokeExact(ihint.handle(), returnAccu.handle(), handlerReturn.handle(), dummy);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_add_emission_hook = Interop.downcallHandle(
        "g_signal_add_emission_hook",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds an emission hook for a signal, which will get called for any emission
     * of that signal, independent of the instance. This is possible only
     * for signals which don't have {@link SignalFlags#NO_HOOKS} flag set.
     */
    public static long signalAddEmissionHook(int signalId, org.gtk.glib.Quark detail, SignalEmissionHook hookFunc) {
        try {
            var RESULT = (long) g_signal_add_emission_hook.invokeExact(signalId, detail.getValue(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbSignalEmissionHook",
                            MethodType.methodType(int.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(hookFunc.hashCode(), hookFunc)), 
                    Interop.cbDestroyNotifySymbol());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_chain_from_overridden = Interop.downcallHandle(
        "g_signal_chain_from_overridden",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls the original class closure of a signal. This function should only
     * be called from an overridden class closure; see
     * g_signal_override_class_closure() and
     * g_signal_override_class_handler().
     */
    public static void signalChainFromOverridden(Value[] instanceAndParams, Value returnValue) {
        try {
            g_signal_chain_from_overridden.invokeExact(Interop.allocateNativeArray(instanceAndParams).handle(), returnValue.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_connect_closure = Interop.downcallHandle(
        "g_signal_connect_closure",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Connects a closure to a signal for a particular object.
     */
    public static long signalConnectClosure(Object instance, java.lang.String detailedSignal, Closure closure, boolean after) {
        try {
            var RESULT = (long) g_signal_connect_closure.invokeExact(instance.handle(), Interop.allocateNativeString(detailedSignal).handle(), closure.handle(), after ? 1 : 0);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_connect_closure_by_id = Interop.downcallHandle(
        "g_signal_connect_closure_by_id",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Connects a closure to a signal for a particular object.
     */
    public static long signalConnectClosureById(Object instance, int signalId, org.gtk.glib.Quark detail, Closure closure, boolean after) {
        try {
            var RESULT = (long) g_signal_connect_closure_by_id.invokeExact(instance.handle(), signalId, detail.getValue(), closure.handle(), after ? 1 : 0);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_connect_data = Interop.downcallHandle(
        "g_signal_connect_data",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Connects a {@link Callback} function to a signal for a particular object. Similar
     * to g_signal_connect(), but allows to provide a {@link ClosureNotify} for the data
     * which will be called when the signal handler is disconnected and no longer
     * used. Specify {@code connect_flags} if you need {@code ..._after()} or
     * {@code ..._swapped()} variants of this function.
     */
    public static long signalConnectData(Object instance, java.lang.String detailedSignal, Callback cHandler, ClosureNotify destroyData, ConnectFlags connectFlags) {
        try {
            var RESULT = (long) g_signal_connect_data.invokeExact(instance.handle(), Interop.allocateNativeString(detailedSignal).handle(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbCallback",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(cHandler.hashCode(), cHandler)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbClosureNotify",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()), connectFlags.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_emit_valist = Interop.downcallHandle(
        "g_signal_emit_valist",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Emits a signal. Signal emission is done synchronously.
     * The method will only return control after all handlers are called or signal emission was stopped.
     * <p>
     * Note that g_signal_emit_valist() resets the return value to the default
     * if no handlers are connected, in contrast to g_signal_emitv().
     */
    public static void signalEmitValist(TypeInstance instance, int signalId, org.gtk.glib.Quark detail, VaList varArgs) {
        try {
            g_signal_emit_valist.invokeExact(instance.handle(), signalId, detail.getValue(), varArgs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_emitv = Interop.downcallHandle(
        "g_signal_emitv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Emits a signal. Signal emission is done synchronously.
     * The method will only return control after all handlers are called or signal emission was stopped.
     * <p>
     * Note that g_signal_emitv() doesn't change {@code return_value} if no handlers are
     * connected, in contrast to g_signal_emit() and g_signal_emit_valist().
     */
    public static void signalEmitv(Value[] instanceAndParams, int signalId, org.gtk.glib.Quark detail, Value returnValue) {
        try {
            g_signal_emitv.invokeExact(Interop.allocateNativeArray(instanceAndParams).handle(), signalId, detail.getValue(), returnValue.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_get_invocation_hint = Interop.downcallHandle(
        "g_signal_get_invocation_hint",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the invocation hint of the innermost signal emission of instance.
     */
    public static SignalInvocationHint signalGetInvocationHint(Object instance) {
        try {
            var RESULT = (MemoryAddress) g_signal_get_invocation_hint.invokeExact(instance.handle());
            return new SignalInvocationHint(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_handler_block = Interop.downcallHandle(
        "g_signal_handler_block",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Blocks a handler of an instance so it will not be called during any
     * signal emissions unless it is unblocked again. Thus "blocking" a
     * signal handler means to temporarily deactivate it, a signal handler
     * has to be unblocked exactly the same amount of times it has been
     * blocked before to become active again.
     * <p>
     * The {@code handler_id} has to be a valid signal handler id, connected to a
     * signal of {@code instance}.
     */
    public static void signalHandlerBlock(Object instance, long handlerId) {
        try {
            g_signal_handler_block.invokeExact(instance.handle(), handlerId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_handler_disconnect = Interop.downcallHandle(
        "g_signal_handler_disconnect",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Disconnects a handler from an instance so it will not be called during
     * any future or currently ongoing emissions of the signal it has been
     * connected to. The {@code handler_id} becomes invalid and may be reused.
     * <p>
     * The {@code handler_id} has to be a valid signal handler id, connected to a
     * signal of {@code instance}.
     */
    public static void signalHandlerDisconnect(Object instance, long handlerId) {
        try {
            g_signal_handler_disconnect.invokeExact(instance.handle(), handlerId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_handler_find = Interop.downcallHandle(
        "g_signal_handler_find",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Finds the first signal handler that matches certain selection criteria.
     * The criteria mask is passed as an OR-ed combination of {@link SignalMatchType}
     * flags, and the criteria values are passed as arguments.
     * The match {@code mask} has to be non-0 for successful matches.
     * If no handler was found, 0 is returned.
     */
    public static long signalHandlerFind(Object instance, SignalMatchType mask, int signalId, org.gtk.glib.Quark detail, Closure closure, java.lang.foreign.MemoryAddress func, java.lang.foreign.MemoryAddress data) {
        try {
            var RESULT = (long) g_signal_handler_find.invokeExact(instance.handle(), mask.getValue(), signalId, detail.getValue(), closure.handle(), func, data);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_handler_is_connected = Interop.downcallHandle(
        "g_signal_handler_is_connected",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Returns whether {@code handler_id} is the ID of a handler connected to {@code instance}.
     */
    public static boolean signalHandlerIsConnected(Object instance, long handlerId) {
        try {
            var RESULT = (int) g_signal_handler_is_connected.invokeExact(instance.handle(), handlerId);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_handler_unblock = Interop.downcallHandle(
        "g_signal_handler_unblock",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Undoes the effect of a previous g_signal_handler_block() call.  A
     * blocked handler is skipped during signal emissions and will not be
     * invoked, unblocking it (for exactly the amount of times it has been
     * blocked before) reverts its "blocked" state, so the handler will be
     * recognized by the signal system and is called upon future or
     * currently ongoing signal emissions (since the order in which
     * handlers are called during signal emissions is deterministic,
     * whether the unblocked handler in question is called as part of a
     * currently ongoing emission depends on how far that emission has
     * proceeded yet).
     * <p>
     * The {@code handler_id} has to be a valid id of a signal handler that is
     * connected to a signal of {@code instance} and is currently blocked.
     */
    public static void signalHandlerUnblock(Object instance, long handlerId) {
        try {
            g_signal_handler_unblock.invokeExact(instance.handle(), handlerId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_handlers_block_matched = Interop.downcallHandle(
        "g_signal_handlers_block_matched",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Blocks all handlers on an instance that match a certain selection criteria.
     * The criteria mask is passed as an OR-ed combination of {@link SignalMatchType}
     * flags, and the criteria values are passed as arguments.
     * Passing at least one of the {@link SignalMatchType#CLOSURE}, {@link SignalMatchType#FUNC}
     * or {@link SignalMatchType#DATA} match flags is required for successful matches.
     * If no handlers were found, 0 is returned, the number of blocked handlers
     * otherwise.
     */
    public static int signalHandlersBlockMatched(Object instance, SignalMatchType mask, int signalId, org.gtk.glib.Quark detail, Closure closure, java.lang.foreign.MemoryAddress func, java.lang.foreign.MemoryAddress data) {
        try {
            var RESULT = (int) g_signal_handlers_block_matched.invokeExact(instance.handle(), mask.getValue(), signalId, detail.getValue(), closure.handle(), func, data);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_handlers_destroy = Interop.downcallHandle(
        "g_signal_handlers_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Destroy all signal handlers of a type instance. This function is
     * an implementation detail of the {@link Object} dispose implementation,
     * and should not be used outside of the type system.
     */
    public static void signalHandlersDestroy(Object instance) {
        try {
            g_signal_handlers_destroy.invokeExact(instance.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_handlers_disconnect_matched = Interop.downcallHandle(
        "g_signal_handlers_disconnect_matched",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Disconnects all handlers on an instance that match a certain
     * selection criteria. The criteria mask is passed as an OR-ed
     * combination of {@link SignalMatchType} flags, and the criteria values are
     * passed as arguments.  Passing at least one of the
     * {@link SignalMatchType#CLOSURE}, {@link SignalMatchType#FUNC} or
     * {@link SignalMatchType#DATA} match flags is required for successful
     * matches.  If no handlers were found, 0 is returned, the number of
     * disconnected handlers otherwise.
     */
    public static int signalHandlersDisconnectMatched(Object instance, SignalMatchType mask, int signalId, org.gtk.glib.Quark detail, Closure closure, java.lang.foreign.MemoryAddress func, java.lang.foreign.MemoryAddress data) {
        try {
            var RESULT = (int) g_signal_handlers_disconnect_matched.invokeExact(instance.handle(), mask.getValue(), signalId, detail.getValue(), closure.handle(), func, data);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_handlers_unblock_matched = Interop.downcallHandle(
        "g_signal_handlers_unblock_matched",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Unblocks all handlers on an instance that match a certain selection
     * criteria. The criteria mask is passed as an OR-ed combination of
     * {@link SignalMatchType} flags, and the criteria values are passed as arguments.
     * Passing at least one of the {@link SignalMatchType#CLOSURE}, {@link SignalMatchType#FUNC}
     * or {@link SignalMatchType#DATA} match flags is required for successful matches.
     * If no handlers were found, 0 is returned, the number of unblocked handlers
     * otherwise. The match criteria should not apply to any handlers that are
     * not currently blocked.
     */
    public static int signalHandlersUnblockMatched(Object instance, SignalMatchType mask, int signalId, org.gtk.glib.Quark detail, Closure closure, java.lang.foreign.MemoryAddress func, java.lang.foreign.MemoryAddress data) {
        try {
            var RESULT = (int) g_signal_handlers_unblock_matched.invokeExact(instance.handle(), mask.getValue(), signalId, detail.getValue(), closure.handle(), func, data);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_has_handler_pending = Interop.downcallHandle(
        "g_signal_has_handler_pending",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns whether there are any handlers connected to {@code instance} for the
     * given signal id and detail.
     * <p>
     * If {@code detail} is 0 then it will only match handlers that were connected
     * without detail.  If {@code detail} is non-zero then it will match handlers
     * connected both without detail and with the given detail.  This is
     * consistent with how a signal emitted with {@code detail} would be delivered
     * to those handlers.
     * <p>
     * Since 2.46 this also checks for a non-default class closure being
     * installed, as this is basically always what you want.
     * <p>
     * One example of when you might use this is when the arguments to the
     * signal are difficult to compute. A class implementor may opt to not
     * emit the signal if no one is attached anyway, thus saving the cost
     * of building the arguments.
     */
    public static boolean signalHasHandlerPending(Object instance, int signalId, org.gtk.glib.Quark detail, boolean mayBeBlocked) {
        try {
            var RESULT = (int) g_signal_has_handler_pending.invokeExact(instance.handle(), signalId, detail.getValue(), mayBeBlocked ? 1 : 0);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_is_valid_name = Interop.downcallHandle(
        "g_signal_is_valid_name",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Validate a signal name. This can be useful for dynamically-generated signals
     * which need to be validated at run-time before actually trying to create them.
     * <p>
     * See [canonical parameter names][canonical-parameter-names] for details of
     * the rules for valid names. The rules for signal names are the same as those
     * for property names.
     */
    public static boolean signalIsValidName(java.lang.String name) {
        try {
            var RESULT = (int) g_signal_is_valid_name.invokeExact(Interop.allocateNativeString(name).handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_list_ids = Interop.downcallHandle(
        "g_signal_list_ids",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Lists the signals by id that a certain instance or interface type
     * created. Further information about the signals can be acquired through
     * g_signal_query().
     */
    public static PointerInteger signalListIds(org.gtk.gobject.Type itype, PointerInteger nIds) {
        try {
            var RESULT = (MemoryAddress) g_signal_list_ids.invokeExact(itype.getValue(), nIds.handle());
            return new PointerInteger(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_lookup = Interop.downcallHandle(
        "g_signal_lookup",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Given the name of the signal and the type of object it connects to, gets
     * the signal's identifying integer. Emitting the signal by number is
     * somewhat faster than using the name each time.
     * <p>
     * Also tries the ancestors of the given type.
     * <p>
     * The type class passed as {@code itype} must already have been instantiated (for
     * example, using g_type_class_ref()) for this function to work, as signals are
     * always installed during class initialization.
     * <p>
     * See g_signal_new() for details on allowed signal names.
     */
    public static int signalLookup(java.lang.String name, org.gtk.gobject.Type itype) {
        try {
            var RESULT = (int) g_signal_lookup.invokeExact(Interop.allocateNativeString(name).handle(), itype.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_name = Interop.downcallHandle(
        "g_signal_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Given the signal's identifier, finds its name.
     * <p>
     * Two different signals may have the same name, if they have differing types.
     */
    public static java.lang.String signalName(int signalId) {
        try {
            var RESULT = (MemoryAddress) g_signal_name.invokeExact(signalId);
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_override_class_closure = Interop.downcallHandle(
        "g_signal_override_class_closure",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Overrides the class closure (i.e. the default handler) for the given signal
     * for emissions on instances of {@code instance_type}. {@code instance_type} must be derived
     * from the type to which the signal belongs.
     * <p>
     * See g_signal_chain_from_overridden() and
     * g_signal_chain_from_overridden_handler() for how to chain up to the
     * parent class closure from inside the overridden one.
     */
    public static void signalOverrideClassClosure(int signalId, org.gtk.gobject.Type instanceType, Closure classClosure) {
        try {
            g_signal_override_class_closure.invokeExact(signalId, instanceType.getValue(), classClosure.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_parse_name = Interop.downcallHandle(
        "g_signal_parse_name",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Internal function to parse a signal name into its {@code signal_id}
     * and {@code detail} quark.
     */
    public static boolean signalParseName(java.lang.String detailedSignal, org.gtk.gobject.Type itype, PointerInteger signalIdP, org.gtk.glib.Quark detailP, boolean forceDetailQuark) {
        PointerInteger detailPPOINTER = new PointerInteger(detailP.getValue());
        try {
            var RESULT = (int) g_signal_parse_name.invokeExact(Interop.allocateNativeString(detailedSignal).handle(), itype.getValue(), signalIdP.handle(), new PointerInteger(detailP.getValue()).handle(), forceDetailQuark ? 1 : 0);
            detailP.setValue(detailPPOINTER.get());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_query = Interop.downcallHandle(
        "g_signal_query",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Queries the signal system for in-depth information about a
     * specific signal. This function will fill in a user-provided
     * structure to hold signal-specific information. If an invalid
     * signal id is passed in, the {@code signal_id} member of the {@link SignalQuery}
     * is 0. All members filled into the {@link SignalQuery} structure should
     * be considered constant and have to be left untouched.
     */
    public static void signalQuery(int signalId, SignalQuery query) {
        try {
            g_signal_query.invokeExact(signalId, query.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_remove_emission_hook = Interop.downcallHandle(
        "g_signal_remove_emission_hook",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Deletes an emission hook.
     */
    public static void signalRemoveEmissionHook(int signalId, long hookId) {
        try {
            g_signal_remove_emission_hook.invokeExact(signalId, hookId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_stop_emission = Interop.downcallHandle(
        "g_signal_stop_emission",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Stops a signal's current emission.
     * <p>
     * This will prevent the default method from running, if the signal was
     * {@link SignalFlags#RUN_LAST} and you connected normally (i.e. without the "after"
     * flag).
     * <p>
     * Prints a warning if used on a signal which isn't being emitted.
     */
    public static void signalStopEmission(Object instance, int signalId, org.gtk.glib.Quark detail) {
        try {
            g_signal_stop_emission.invokeExact(instance.handle(), signalId, detail.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_stop_emission_by_name = Interop.downcallHandle(
        "g_signal_stop_emission_by_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Stops a signal's current emission.
     * <p>
     * This is just like g_signal_stop_emission() except it will look up the
     * signal id for you.
     */
    public static void signalStopEmissionByName(Object instance, java.lang.String detailedSignal) {
        try {
            g_signal_stop_emission_by_name.invokeExact(instance.handle(), Interop.allocateNativeString(detailedSignal).handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_signal_type_cclosure_new = Interop.downcallHandle(
        "g_signal_type_cclosure_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new closure which invokes the function found at the offset
     * {@code struct_offset} in the class structure of the interface or classed type
     * identified by {@code itype}.
     */
    public static Closure signalTypeCclosureNew(org.gtk.gobject.Type itype, int structOffset) {
        try {
            var RESULT = (MemoryAddress) g_signal_type_cclosure_new.invokeExact(itype.getValue(), structOffset);
            return new Closure(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_source_set_closure = Interop.downcallHandle(
        "g_source_set_closure",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Set the callback for a source as a {@link Closure}.
     * <p>
     * If the source is not one of the standard GLib types, the {@code closure_callback}
     * and {@code closure_marshal} fields of the {@link org.gtk.glib.SourceFuncs} structure must have been
     * filled in with pointers to appropriate functions.
     */
    public static void sourceSetClosure(org.gtk.glib.Source source, Closure closure) {
        try {
            g_source_set_closure.invokeExact(source.handle(), closure.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_source_set_dummy_callback = Interop.downcallHandle(
        "g_source_set_dummy_callback",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Sets a dummy callback for {@code source}. The callback will do nothing, and
     * if the source expects a {@code gboolean} return value, it will return {@code true}.
     * (If the source expects any other type of return value, it will return
     * a 0/{@code null} value; whatever g_value_init() initializes a {@link Value} to for
     * that type.)
     * <p>
     * If the source is not one of the standard GLib types, the
     * {@code closure_callback} and {@code closure_marshal} fields of the {@link org.gtk.glib.SourceFuncs}
     * structure must have been filled in with pointers to appropriate
     * functions.
     */
    public static void sourceSetDummyCallback(org.gtk.glib.Source source) {
        try {
            g_source_set_dummy_callback.invokeExact(source.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_strdup_value_contents = Interop.downcallHandle(
        "g_strdup_value_contents",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Return a newly allocated string, which describes the contents of a
     * {@link Value}.  The main purpose of this function is to describe {@link Value}
     * contents for debugging output, the way in which the contents are
     * described may change between different GLib versions.
     */
    public static java.lang.String strdupValueContents(Value value) {
        try {
            var RESULT = (MemoryAddress) g_strdup_value_contents.invokeExact(value.handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_add_class_cache_func = Interop.downcallHandle(
        "g_type_add_class_cache_func",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a {@link TypeClassCacheFunc} to be called before the reference count of a
     * class goes from one to zero. This can be used to prevent premature class
     * destruction. All installed {@link TypeClassCacheFunc} functions will be chained
     * until one of them returns {@code true}. The functions have to check the class id
     * passed in to figure whether they actually want to cache the class of this
     * type, since all classes are routed through the same {@link TypeClassCacheFunc}
     * chain.
     */
    public static void typeAddClassCacheFunc(TypeClassCacheFunc cacheFunc) {
        try {
            g_type_add_class_cache_func.invokeExact(
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(cacheFunc.hashCode(), cacheFunc)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbTypeClassCacheFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_add_class_private = Interop.downcallHandle(
        "g_type_add_class_private",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Registers a private class structure for a classed type;
     * when the class is allocated, the private structures for
     * the class and all of its parent types are allocated
     * sequentially in the same memory block as the public
     * structures, and are zero-filled.
     * <p>
     * This function should be called in the
     * type's get_type() function after the type is registered.
     * The private structure can be retrieved using the
     * G_TYPE_CLASS_GET_PRIVATE() macro.
     */
    public static void typeAddClassPrivate(org.gtk.gobject.Type classType, long privateSize) {
        try {
            g_type_add_class_private.invokeExact(classType.getValue(), privateSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_add_instance_private = Interop.downcallHandle(
        "g_type_add_instance_private",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    public static int typeAddInstancePrivate(org.gtk.gobject.Type classType, long privateSize) {
        try {
            var RESULT = (int) g_type_add_instance_private.invokeExact(classType.getValue(), privateSize);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_add_interface_check = Interop.downcallHandle(
        "g_type_add_interface_check",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds a function to be called after an interface vtable is
     * initialized for any class (i.e. after the {@code interface_init}
     * member of {@link InterfaceInfo} has been called).
     * <p>
     * This function is useful when you want to check an invariant
     * that depends on the interfaces of a class. For instance, the
     * implementation of {@link Object} uses this facility to check that an
     * object implements all of the properties that are defined on its
     * interfaces.
     */
    public static void typeAddInterfaceCheck(TypeInterfaceCheckFunc checkFunc) {
        try {
            g_type_add_interface_check.invokeExact(
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(checkFunc.hashCode(), checkFunc)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbTypeInterfaceCheckFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_add_interface_dynamic = Interop.downcallHandle(
        "g_type_add_interface_dynamic",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds {@code interface_type} to the dynamic {@code instance_type}. The information
     * contained in the {@link TypePlugin} structure pointed to by {@code plugin}
     * is used to manage the relationship.
     */
    public static void typeAddInterfaceDynamic(org.gtk.gobject.Type instanceType, org.gtk.gobject.Type interfaceType, TypePlugin plugin) {
        try {
            g_type_add_interface_dynamic.invokeExact(instanceType.getValue(), interfaceType.getValue(), plugin.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_add_interface_static = Interop.downcallHandle(
        "g_type_add_interface_static",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds {@code interface_type} to the static {@code instance_type}.
     * The information contained in the {@link InterfaceInfo} structure
     * pointed to by {@code info} is used to manage the relationship.
     */
    public static void typeAddInterfaceStatic(org.gtk.gobject.Type instanceType, org.gtk.gobject.Type interfaceType, InterfaceInfo info) {
        try {
            g_type_add_interface_static.invokeExact(instanceType.getValue(), interfaceType.getValue(), info.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_check_class_cast = Interop.downcallHandle(
        "g_type_check_class_cast",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    public static TypeClass typeCheckClassCast(TypeClass gClass, org.gtk.gobject.Type isAType) {
        try {
            var RESULT = (MemoryAddress) g_type_check_class_cast.invokeExact(gClass.handle(), isAType.getValue());
            return new TypeClass(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_check_class_is_a = Interop.downcallHandle(
        "g_type_check_class_is_a",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    public static boolean typeCheckClassIsA(TypeClass gClass, org.gtk.gobject.Type isAType) {
        try {
            var RESULT = (int) g_type_check_class_is_a.invokeExact(gClass.handle(), isAType.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_check_instance = Interop.downcallHandle(
        "g_type_check_instance",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Private helper function to aid implementation of the
     * G_TYPE_CHECK_INSTANCE() macro.
     */
    public static boolean typeCheckInstance(TypeInstance instance) {
        try {
            var RESULT = (int) g_type_check_instance.invokeExact(instance.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_check_instance_cast = Interop.downcallHandle(
        "g_type_check_instance_cast",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    public static TypeInstance typeCheckInstanceCast(TypeInstance instance, org.gtk.gobject.Type ifaceType) {
        try {
            var RESULT = (MemoryAddress) g_type_check_instance_cast.invokeExact(instance.handle(), ifaceType.getValue());
            return new TypeInstance(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_check_instance_is_a = Interop.downcallHandle(
        "g_type_check_instance_is_a",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    public static boolean typeCheckInstanceIsA(TypeInstance instance, org.gtk.gobject.Type ifaceType) {
        try {
            var RESULT = (int) g_type_check_instance_is_a.invokeExact(instance.handle(), ifaceType.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_check_instance_is_fundamentally_a = Interop.downcallHandle(
        "g_type_check_instance_is_fundamentally_a",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    public static boolean typeCheckInstanceIsFundamentallyA(TypeInstance instance, org.gtk.gobject.Type fundamentalType) {
        try {
            var RESULT = (int) g_type_check_instance_is_fundamentally_a.invokeExact(instance.handle(), fundamentalType.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_check_is_value_type = Interop.downcallHandle(
        "g_type_check_is_value_type",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)
    );
    
    public static boolean typeCheckIsValueType(org.gtk.gobject.Type type) {
        try {
            var RESULT = (int) g_type_check_is_value_type.invokeExact(type.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_check_value = Interop.downcallHandle(
        "g_type_check_value",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    public static boolean typeCheckValue(Value value) {
        try {
            var RESULT = (int) g_type_check_value.invokeExact(value.handle());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_check_value_holds = Interop.downcallHandle(
        "g_type_check_value_holds",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    public static boolean typeCheckValueHolds(Value value, org.gtk.gobject.Type type) {
        try {
            var RESULT = (int) g_type_check_value_holds.invokeExact(value.handle(), type.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_children = Interop.downcallHandle(
        "g_type_children",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Return a newly allocated and 0-terminated array of type IDs, listing
     * the child types of {@code type}.
     */
    public static PointerLong typeChildren(org.gtk.gobject.Type type, PointerInteger nChildren) {
        try {
            var RESULT = (MemoryAddress) g_type_children.invokeExact(type.getValue(), nChildren.handle());
            return new PointerLong(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_class_adjust_private_offset = Interop.downcallHandle(
        "g_type_class_adjust_private_offset",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    public static void typeClassAdjustPrivateOffset(java.lang.foreign.MemoryAddress gClass, PointerInteger privateSizeOrOffset) {
        try {
            g_type_class_adjust_private_offset.invokeExact(gClass, privateSizeOrOffset.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_class_peek = Interop.downcallHandle(
        "g_type_class_peek",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * This function is essentially the same as g_type_class_ref(),
     * except that the classes reference count isn't incremented.
     * As a consequence, this function may return {@code null} if the class
     * of the type passed in does not currently exist (hasn't been
     * referenced before).
     */
    public static TypeClass typeClassPeek(org.gtk.gobject.Type type) {
        try {
            var RESULT = (MemoryAddress) g_type_class_peek.invokeExact(type.getValue());
            return new TypeClass(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_class_peek_static = Interop.downcallHandle(
        "g_type_class_peek_static",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * A more efficient version of g_type_class_peek() which works only for
     * static types.
     */
    public static TypeClass typeClassPeekStatic(org.gtk.gobject.Type type) {
        try {
            var RESULT = (MemoryAddress) g_type_class_peek_static.invokeExact(type.getValue());
            return new TypeClass(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_class_ref = Interop.downcallHandle(
        "g_type_class_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Increments the reference count of the class structure belonging to
     * {@code type}. This function will demand-create the class if it doesn't
     * exist already.
     */
    public static TypeClass typeClassRef(org.gtk.gobject.Type type) {
        try {
            var RESULT = (MemoryAddress) g_type_class_ref.invokeExact(type.getValue());
            return new TypeClass(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_create_instance = Interop.downcallHandle(
        "g_type_create_instance",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Creates and initializes an instance of {@code type} if {@code type} is valid and
     * can be instantiated. The type system only performs basic allocation
     * and structure setups for instances: actual instance creation should
     * happen through functions supplied by the type's fundamental type
     * implementation.  So use of g_type_create_instance() is reserved for
     * implementers of fundamental types only. E.g. instances of the
     * {@link Object} hierarchy should be created via g_object_new() and never
     * directly through g_type_create_instance() which doesn't handle things
     * like singleton objects or object construction.
     * <p>
     * The extended members of the returned instance are guaranteed to be filled
     * with zeros.
     * <p>
     * Note: Do not use this function, unless you're implementing a
     * fundamental type. Also language bindings should not use this
     * function, but g_object_new() instead.
     */
    public static TypeInstance typeCreateInstance(org.gtk.gobject.Type type) {
        try {
            var RESULT = (MemoryAddress) g_type_create_instance.invokeExact(type.getValue());
            return new TypeInstance(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_default_interface_peek = Interop.downcallHandle(
        "g_type_default_interface_peek",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * If the interface type {@code g_type} is currently in use, returns its
     * default interface vtable.
     */
    public static TypeInterface typeDefaultInterfacePeek(org.gtk.gobject.Type gType) {
        try {
            var RESULT = (MemoryAddress) g_type_default_interface_peek.invokeExact(gType.getValue());
            return new TypeInterface(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_default_interface_ref = Interop.downcallHandle(
        "g_type_default_interface_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Increments the reference count for the interface type {@code g_type},
     * and returns the default interface vtable for the type.
     * <p>
     * If the type is not currently in use, then the default vtable
     * for the type will be created and initialized by calling
     * the base interface init and default vtable init functions for
     * the type (the {@code base_init} and {@code class_init} members of {@link TypeInfo}).
     * Calling g_type_default_interface_ref() is useful when you
     * want to make sure that signals and properties for an interface
     * have been installed.
     */
    public static TypeInterface typeDefaultInterfaceRef(org.gtk.gobject.Type gType) {
        try {
            var RESULT = (MemoryAddress) g_type_default_interface_ref.invokeExact(gType.getValue());
            return new TypeInterface(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_default_interface_unref = Interop.downcallHandle(
        "g_type_default_interface_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decrements the reference count for the type corresponding to the
     * interface default vtable {@code g_iface}. If the type is dynamic, then
     * when no one is using the interface and all references have
     * been released, the finalize function for the interface's default
     * vtable (the {@code class_finalize} member of {@link TypeInfo}) will be called.
     */
    public static void typeDefaultInterfaceUnref(TypeInterface gIface) {
        try {
            g_type_default_interface_unref.invokeExact(gIface.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_depth = Interop.downcallHandle(
        "g_type_depth",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Returns the length of the ancestry of the passed in type. This
     * includes the type itself, so that e.g. a fundamental type has depth 1.
     */
    public static int typeDepth(org.gtk.gobject.Type type) {
        try {
            var RESULT = (int) g_type_depth.invokeExact(type.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_ensure = Interop.downcallHandle(
        "g_type_ensure",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG)
    );
    
    /**
     * Ensures that the indicated {@code type} has been registered with the
     * type system, and its _class_init() method has been run.
     * <p>
     * In theory, simply calling the type's _get_type() method (or using
     * the corresponding macro) is supposed take care of this. However,
     * _get_type() methods are often marked {@code G_GNUC_CONST} for performance
     * reasons, even though this is technically incorrect (since
     * {@code G_GNUC_CONST} requires that the function not have side effects,
     * which _get_type() methods do on the first call). As a result, if
     * you write a bare call to a _get_type() macro, it may get optimized
     * out by the compiler. Using g_type_ensure() guarantees that the
     * type's _get_type() method is called.
     */
    public static void typeEnsure(org.gtk.gobject.Type type) {
        try {
            g_type_ensure.invokeExact(type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_free_instance = Interop.downcallHandle(
        "g_type_free_instance",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Frees an instance of a type, returning it to the instance pool for
     * the type, if there is one.
     * <p>
     * Like g_type_create_instance(), this function is reserved for
     * implementors of fundamental types.
     */
    public static void typeFreeInstance(TypeInstance instance) {
        try {
            g_type_free_instance.invokeExact(instance.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_from_name = Interop.downcallHandle(
        "g_type_from_name",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Look up the type ID from a given type name, returning 0 if no type
     * has been registered under this name (this is the preferred method
     * to find out by name whether a specific type has been registered
     * yet).
     */
    public static org.gtk.gobject.Type typeFromName(java.lang.String name) {
        try {
            var RESULT = (long) g_type_from_name.invokeExact(Interop.allocateNativeString(name).handle());
            return new org.gtk.gobject.Type(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_fundamental = Interop.downcallHandle(
        "g_type_fundamental",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Internal function, used to extract the fundamental type ID portion.
     * Use G_TYPE_FUNDAMENTAL() instead.
     */
    public static org.gtk.gobject.Type typeFundamental(org.gtk.gobject.Type typeId) {
        try {
            var RESULT = (long) g_type_fundamental.invokeExact(typeId.getValue());
            return new org.gtk.gobject.Type(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_fundamental_next = Interop.downcallHandle(
        "g_type_fundamental_next",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG)
    );
    
    /**
     * Returns the next free fundamental type id which can be used to
     * register a new fundamental type with g_type_register_fundamental().
     * The returned type ID represents the highest currently registered
     * fundamental type identifier.
     */
    public static org.gtk.gobject.Type typeFundamentalNext() {
        try {
            var RESULT = (long) g_type_fundamental_next.invokeExact();
            return new org.gtk.gobject.Type(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_get_instance_count = Interop.downcallHandle(
        "g_type_get_instance_count",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Returns the number of instances allocated of the particular type;
     * this is only available if GLib is built with debugging support and
     * the instance_count debug flag is set (by setting the GOBJECT_DEBUG
     * variable to include instance-count).
     */
    public static int typeGetInstanceCount(org.gtk.gobject.Type type) {
        try {
            var RESULT = (int) g_type_get_instance_count.invokeExact(type.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_get_plugin = Interop.downcallHandle(
        "g_type_get_plugin",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Returns the {@link TypePlugin} structure for {@code type}.
     */
    public static TypePlugin typeGetPlugin(org.gtk.gobject.Type type) {
        try {
            var RESULT = (MemoryAddress) g_type_get_plugin.invokeExact(type.getValue());
            return new TypePlugin.TypePluginImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_get_qdata = Interop.downcallHandle(
        "g_type_get_qdata",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Obtains data which has previously been attached to {@code type}
     * with g_type_set_qdata().
     * <p>
     * Note that this does not take subtyping into account; data
     * attached to one type with g_type_set_qdata() cannot
     * be retrieved from a subtype using g_type_get_qdata().
     */
    public static java.lang.foreign.MemoryAddress typeGetQdata(org.gtk.gobject.Type type, org.gtk.glib.Quark quark) {
        try {
            var RESULT = (MemoryAddress) g_type_get_qdata.invokeExact(type.getValue(), quark.getValue());
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_get_type_registration_serial = Interop.downcallHandle(
        "g_type_get_type_registration_serial",
        FunctionDescriptor.of(ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns an opaque serial number that represents the state of the set
     * of registered types. Any time a type is registered this serial changes,
     * which means you can cache information based on type lookups (such as
     * g_type_from_name()) and know if the cache is still valid at a later
     * time by comparing the current serial with the one at the type lookup.
     */
    public static int typeGetTypeRegistrationSerial() {
        try {
            var RESULT = (int) g_type_get_type_registration_serial.invokeExact();
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_interface_add_prerequisite = Interop.downcallHandle(
        "g_type_interface_add_prerequisite",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Adds {@code prerequisite_type} to the list of prerequisites of {@code interface_type}.
     * This means that any type implementing {@code interface_type} must also implement
     * {@code prerequisite_type}. Prerequisites can be thought of as an alternative to
     * interface derivation (which GType doesn't support). An interface can have
     * at most one instantiatable prerequisite type.
     */
    public static void typeInterfaceAddPrerequisite(org.gtk.gobject.Type interfaceType, org.gtk.gobject.Type prerequisiteType) {
        try {
            g_type_interface_add_prerequisite.invokeExact(interfaceType.getValue(), prerequisiteType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_interface_get_plugin = Interop.downcallHandle(
        "g_type_interface_get_plugin",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Returns the {@link TypePlugin} structure for the dynamic interface
     * {@code interface_type} which has been added to {@code instance_type}, or {@code null}
     * if {@code interface_type} has not been added to {@code instance_type} or does
     * not have a {@link TypePlugin} structure. See g_type_add_interface_dynamic().
     */
    public static TypePlugin typeInterfaceGetPlugin(org.gtk.gobject.Type instanceType, org.gtk.gobject.Type interfaceType) {
        try {
            var RESULT = (MemoryAddress) g_type_interface_get_plugin.invokeExact(instanceType.getValue(), interfaceType.getValue());
            return new TypePlugin.TypePluginImpl(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_interface_instantiatable_prerequisite = Interop.downcallHandle(
        "g_type_interface_instantiatable_prerequisite",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Returns the most specific instantiatable prerequisite of an
     * interface type. If the interface type has no instantiatable
     * prerequisite, {@code G_TYPE_INVALID} is returned.
     * <p>
     * See g_type_interface_add_prerequisite() for more information
     * about prerequisites.
     */
    public static org.gtk.gobject.Type typeInterfaceInstantiatablePrerequisite(org.gtk.gobject.Type interfaceType) {
        try {
            var RESULT = (long) g_type_interface_instantiatable_prerequisite.invokeExact(interfaceType.getValue());
            return new org.gtk.gobject.Type(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_interface_peek = Interop.downcallHandle(
        "g_type_interface_peek",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Returns the {@link TypeInterface} structure of an interface to which the
     * passed in class conforms.
     */
    public static TypeInterface typeInterfacePeek(TypeClass instanceClass, org.gtk.gobject.Type ifaceType) {
        try {
            var RESULT = (MemoryAddress) g_type_interface_peek.invokeExact(instanceClass.handle(), ifaceType.getValue());
            return new TypeInterface(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_interface_prerequisites = Interop.downcallHandle(
        "g_type_interface_prerequisites",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the prerequisites of an interfaces type.
     */
    public static PointerLong typeInterfacePrerequisites(org.gtk.gobject.Type interfaceType, PointerInteger nPrerequisites) {
        try {
            var RESULT = (MemoryAddress) g_type_interface_prerequisites.invokeExact(interfaceType.getValue(), nPrerequisites.handle());
            return new PointerLong(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_interfaces = Interop.downcallHandle(
        "g_type_interfaces",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Return a newly allocated and 0-terminated array of type IDs, listing
     * the interface types that {@code type} conforms to.
     */
    public static PointerLong typeInterfaces(org.gtk.gobject.Type type, PointerInteger nInterfaces) {
        try {
            var RESULT = (MemoryAddress) g_type_interfaces.invokeExact(type.getValue(), nInterfaces.handle());
            return new PointerLong(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_is_a = Interop.downcallHandle(
        "g_type_is_a",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * If {@code is_a_type} is a derivable type, check whether {@code type} is a
     * descendant of {@code is_a_type}. If {@code is_a_type} is an interface, check
     * whether {@code type} conforms to it.
     */
    public static boolean typeIsA(org.gtk.gobject.Type type, org.gtk.gobject.Type isAType) {
        try {
            var RESULT = (int) g_type_is_a.invokeExact(type.getValue(), isAType.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_name = Interop.downcallHandle(
        "g_type_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Get the unique name that is assigned to a type ID.  Note that this
     * function (like all other GType API) cannot cope with invalid type
     * IDs. {@code G_TYPE_INVALID} may be passed to this function, as may be any
     * other validly registered type ID, but randomized type IDs should
     * not be passed in and will most likely lead to a crash.
     */
    public static java.lang.String typeName(org.gtk.gobject.Type type) {
        try {
            var RESULT = (MemoryAddress) g_type_name.invokeExact(type.getValue());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_name_from_class = Interop.downcallHandle(
        "g_type_name_from_class",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    public static java.lang.String typeNameFromClass(TypeClass gClass) {
        try {
            var RESULT = (MemoryAddress) g_type_name_from_class.invokeExact(gClass.handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_name_from_instance = Interop.downcallHandle(
        "g_type_name_from_instance",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    public static java.lang.String typeNameFromInstance(TypeInstance instance) {
        try {
            var RESULT = (MemoryAddress) g_type_name_from_instance.invokeExact(instance.handle());
            return RESULT.getUtf8String(0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_next_base = Interop.downcallHandle(
        "g_type_next_base",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Given a {@code leaf_type} and a {@code root_type} which is contained in its
     * ancestry, return the type that {@code root_type} is the immediate parent
     * of. In other words, this function determines the type that is
     * derived directly from {@code root_type} which is also a base class of
     * {@code leaf_type}.  Given a root type and a leaf type, this function can
     * be used to determine the types and order in which the leaf type is
     * descended from the root type.
     */
    public static org.gtk.gobject.Type typeNextBase(org.gtk.gobject.Type leafType, org.gtk.gobject.Type rootType) {
        try {
            var RESULT = (long) g_type_next_base.invokeExact(leafType.getValue(), rootType.getValue());
            return new org.gtk.gobject.Type(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_parent = Interop.downcallHandle(
        "g_type_parent",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Return the direct parent type of the passed in type. If the passed
     * in type has no parent, i.e. is a fundamental type, 0 is returned.
     */
    public static org.gtk.gobject.Type typeParent(org.gtk.gobject.Type type) {
        try {
            var RESULT = (long) g_type_parent.invokeExact(type.getValue());
            return new org.gtk.gobject.Type(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_qname = Interop.downcallHandle(
        "g_type_qname",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Get the corresponding quark of the type IDs name.
     */
    public static org.gtk.glib.Quark typeQname(org.gtk.gobject.Type type) {
        try {
            var RESULT = (int) g_type_qname.invokeExact(type.getValue());
            return new org.gtk.glib.Quark(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_query = Interop.downcallHandle(
        "g_type_query",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Queries the type system for information about a specific type.
     * This function will fill in a user-provided structure to hold
     * type-specific information. If an invalid {@link org.gtk.glib.Type} is passed in, the
     * {@code type} member of the {@link TypeQuery} is 0. All members filled into the
     * {@link TypeQuery} structure should be considered constant and have to be
     * left untouched.
     */
    public static void typeQuery(org.gtk.gobject.Type type, TypeQuery query) {
        try {
            g_type_query.invokeExact(type.getValue(), query.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_register_dynamic = Interop.downcallHandle(
        "g_type_register_dynamic",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Registers {@code type_name} as the name of a new dynamic type derived from
     * {@code parent_type}.  The type system uses the information contained in the
     * {@link TypePlugin} structure pointed to by {@code plugin} to manage the type and its
     * instances (if not abstract).  The value of {@code flags} determines the nature
     * (e.g. abstract or not) of the type.
     */
    public static org.gtk.gobject.Type typeRegisterDynamic(org.gtk.gobject.Type parentType, java.lang.String typeName, TypePlugin plugin, TypeFlags flags) {
        try {
            var RESULT = (long) g_type_register_dynamic.invokeExact(parentType.getValue(), Interop.allocateNativeString(typeName).handle(), plugin.handle(), flags.getValue());
            return new org.gtk.gobject.Type(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_register_fundamental = Interop.downcallHandle(
        "g_type_register_fundamental",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Registers {@code type_id} as the predefined identifier and {@code type_name} as the
     * name of a fundamental type. If {@code type_id} is already registered, or a
     * type named {@code type_name} is already registered, the behaviour is undefined.
     * The type system uses the information contained in the {@link TypeInfo} structure
     * pointed to by {@code info} and the {@link TypeFundamentalInfo} structure pointed to by
     * {@code finfo} to manage the type and its instances. The value of {@code flags} determines
     * additional characteristics of the fundamental type.
     */
    public static org.gtk.gobject.Type typeRegisterFundamental(org.gtk.gobject.Type typeId, java.lang.String typeName, TypeInfo info, TypeFundamentalInfo finfo, TypeFlags flags) {
        try {
            var RESULT = (long) g_type_register_fundamental.invokeExact(typeId.getValue(), Interop.allocateNativeString(typeName).handle(), info.handle(), finfo.handle(), flags.getValue());
            return new org.gtk.gobject.Type(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_register_static = Interop.downcallHandle(
        "g_type_register_static",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Registers {@code type_name} as the name of a new static type derived from
     * {@code parent_type}. The type system uses the information contained in the
     * {@link TypeInfo} structure pointed to by {@code info} to manage the type and its
     * instances (if not abstract). The value of {@code flags} determines the nature
     * (e.g. abstract or not) of the type.
     */
    public static org.gtk.gobject.Type typeRegisterStatic(org.gtk.gobject.Type parentType, java.lang.String typeName, TypeInfo info, TypeFlags flags) {
        try {
            var RESULT = (long) g_type_register_static.invokeExact(parentType.getValue(), Interop.allocateNativeString(typeName).handle(), info.handle(), flags.getValue());
            return new org.gtk.gobject.Type(RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_remove_class_cache_func = Interop.downcallHandle(
        "g_type_remove_class_cache_func",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a previously installed {@link TypeClassCacheFunc}. The cache
     * maintained by {@code cache_func} has to be empty when calling
     * g_type_remove_class_cache_func() to avoid leaks.
     */
    public static void typeRemoveClassCacheFunc(TypeClassCacheFunc cacheFunc) {
        try {
            g_type_remove_class_cache_func.invokeExact(
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(cacheFunc.hashCode(), cacheFunc)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbTypeClassCacheFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_remove_interface_check = Interop.downcallHandle(
        "g_type_remove_interface_check",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes an interface check function added with
     * g_type_add_interface_check().
     */
    public static void typeRemoveInterfaceCheck(TypeInterfaceCheckFunc checkFunc) {
        try {
            g_type_remove_interface_check.invokeExact(
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(checkFunc.hashCode(), checkFunc)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbTypeInterfaceCheckFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_set_qdata = Interop.downcallHandle(
        "g_type_set_qdata",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Attaches arbitrary data to a type.
     */
    public static void typeSetQdata(org.gtk.gobject.Type type, org.gtk.glib.Quark quark, java.lang.foreign.MemoryAddress data) {
        try {
            g_type_set_qdata.invokeExact(type.getValue(), quark.getValue(), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_test_flags = Interop.downcallHandle(
        "g_type_test_flags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    public static boolean typeTestFlags(org.gtk.gobject.Type type, int flags) {
        try {
            var RESULT = (int) g_type_test_flags.invokeExact(type.getValue(), flags);
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_type_value_table_peek = Interop.downcallHandle(
        "g_type_value_table_peek",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Returns the location of the {@link TypeValueTable} associated with {@code type}.
     * <p>
     * Note that this function should only be used from source code
     * that implements or has internal knowledge of the implementation of
     * {@code type}.
     */
    public static TypeValueTable typeValueTablePeek(org.gtk.gobject.Type type) {
        try {
            var RESULT = (MemoryAddress) g_type_value_table_peek.invokeExact(type.getValue());
            return new TypeValueTable(Refcounted.get(RESULT, false));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_value_type_compatible = Interop.downcallHandle(
        "g_value_type_compatible",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Returns whether a {@link Value} of type {@code src_type} can be copied into
     * a {@link Value} of type {@code dest_type}.
     */
    public static boolean valueTypeCompatible(org.gtk.gobject.Type srcType, org.gtk.gobject.Type destType) {
        try {
            var RESULT = (int) g_value_type_compatible.invokeExact(srcType.getValue(), destType.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    static final MethodHandle g_value_type_transformable = Interop.downcallHandle(
        "g_value_type_transformable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Check whether g_value_transform() is able to transform values
     * of type {@code src_type} into values of type {@code dest_type}. Note that for
     * the types to be transformable, they must be compatible or a
     * transformation function must be registered.
     */
    public static boolean valueTypeTransformable(org.gtk.gobject.Type srcType, org.gtk.gobject.Type destType) {
        try {
            var RESULT = (int) g_value_type_transformable.invokeExact(srcType.getValue(), destType.getValue());
            return RESULT != 0;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static void __cbToggleNotify(MemoryAddress data, MemoryAddress object, int isLastRef) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (ToggleNotify) Interop.signalRegistry.get(hash);
        handler.onToggleNotify(new Object(Refcounted.get(object, false)), isLastRef != 0);
    }
    
    public static void __cbClassInitFunc(MemoryAddress gClass, MemoryAddress classData) {
        int hash = classData.get(ValueLayout.JAVA_INT, 0);
        var handler = (ClassInitFunc) Interop.signalRegistry.get(hash);
        handler.onClassInitFunc(new TypeClass(Refcounted.get(gClass, false)));
    }
    
    public static void __cbInterfaceInitFunc(MemoryAddress gIface, MemoryAddress ifaceData) {
        int hash = ifaceData.get(ValueLayout.JAVA_INT, 0);
        var handler = (InterfaceInitFunc) Interop.signalRegistry.get(hash);
        handler.onInterfaceInitFunc(new TypeInterface(Refcounted.get(gIface, false)));
    }
    
    public static boolean __cbSignalAccumulator(MemoryAddress ihint, MemoryAddress returnAccu, MemoryAddress handlerReturn, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (SignalAccumulator) Interop.signalRegistry.get(hash);
        return handler.onSignalAccumulator(new SignalInvocationHint(Refcounted.get(ihint, false)), new Value(Refcounted.get(returnAccu, false)), new Value(Refcounted.get(handlerReturn, false)));
    }
    
    public static void __cbClosureMarshal(MemoryAddress closure, MemoryAddress returnValue, int nParamValues, MemoryAddress paramValues, MemoryAddress invocationHint, MemoryAddress marshalData) {
        int hash = marshalData.get(ValueLayout.JAVA_INT, 0);
        var handler = (ClosureMarshal) Interop.signalRegistry.get(hash);
        handler.onClosureMarshal(new Closure(Refcounted.get(closure, false)), new Value(Refcounted.get(returnValue, false)), nParamValues, new PointerProxy<Value>(paramValues, Value.class), invocationHint);
    }
    
    public static void __cbClosureNotify(MemoryAddress data, MemoryAddress closure) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (ClosureNotify) Interop.signalRegistry.get(hash);
        handler.onClosureNotify(new Closure(Refcounted.get(closure, false)));
    }
    
    public static boolean __cbTypeClassCacheFunc(MemoryAddress cacheData, MemoryAddress gClass) {
        int hash = cacheData.get(ValueLayout.JAVA_INT, 0);
        var handler = (TypeClassCacheFunc) Interop.signalRegistry.get(hash);
        return handler.onTypeClassCacheFunc(new TypeClass(Refcounted.get(gClass, false)));
    }
    
    public static boolean __cbBindingTransformFunc(MemoryAddress binding, MemoryAddress fromValue, MemoryAddress toValue, MemoryAddress userData) {
        int hash = userData.get(ValueLayout.JAVA_INT, 0);
        var handler = (BindingTransformFunc) Interop.signalRegistry.get(hash);
        return handler.onBindingTransformFunc(new Binding(Refcounted.get(binding, false)), new Value(Refcounted.get(fromValue, false)), new Value(Refcounted.get(toValue, false)));
    }
    
    public static void __cbClassFinalizeFunc(MemoryAddress gClass, MemoryAddress classData) {
        int hash = classData.get(ValueLayout.JAVA_INT, 0);
        var handler = (ClassFinalizeFunc) Interop.signalRegistry.get(hash);
        handler.onClassFinalizeFunc(new TypeClass(Refcounted.get(gClass, false)));
    }
    
    public static boolean __cbSignalEmissionHook(MemoryAddress ihint, int nParamValues, MemoryAddress paramValues, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (SignalEmissionHook) Interop.signalRegistry.get(hash);
        return handler.onSignalEmissionHook(new SignalInvocationHint(Refcounted.get(ihint, false)), nParamValues, new PointerProxy<Value>(paramValues, Value.class));
    }
    
    public static void __cbInterfaceFinalizeFunc(MemoryAddress gIface, MemoryAddress ifaceData) {
        int hash = ifaceData.get(ValueLayout.JAVA_INT, 0);
        var handler = (InterfaceFinalizeFunc) Interop.signalRegistry.get(hash);
        handler.onInterfaceFinalizeFunc(new TypeInterface(Refcounted.get(gIface, false)));
    }
    
    public static void __cbWeakNotify(MemoryAddress data, MemoryAddress whereTheObjectWas) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (WeakNotify) Interop.signalRegistry.get(hash);
        handler.onWeakNotify(new Object(Refcounted.get(whereTheObjectWas, false)));
    }
    
    public static void __cbTypeInterfaceCheckFunc(MemoryAddress checkData, MemoryAddress gIface) {
        int hash = checkData.get(ValueLayout.JAVA_INT, 0);
        var handler = (TypeInterfaceCheckFunc) Interop.signalRegistry.get(hash);
        handler.onTypeInterfaceCheckFunc(new TypeInterface(Refcounted.get(gIface, false)));
    }
    
}
