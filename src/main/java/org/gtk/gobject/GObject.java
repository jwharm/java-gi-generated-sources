package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public final class GObject {
    
    /**
     * Mask containing the bits of {@link ParamSpec}.flags which are reserved for GLib.
     */
    public static final int PARAM_MASK = 255;

    /**
     * {@link ParamFlags} value alias for {@link ParamFlags#STATIC_NAME} | {@link ParamFlags#STATIC_NICK} | {@link ParamFlags#STATIC_BLURB}.
     * <p>
     * Since 2.13.0
     */
    public static final int PARAM_STATIC_STRINGS = 224;

    /**
     * Minimum shift count to be used for user defined flags, to be stored in
     * {@link ParamSpec}.flags. The maximum allowed is 10.
     */
    public static final int PARAM_USER_SHIFT = 8;

    /**
     * A mask for all {@link SignalFlags} bits.
     */
    public static final int SIGNAL_FLAGS_MASK = 511;

    /**
     * A mask for all {@link SignalMatchType} bits.
     */
    public static final int SIGNAL_MATCH_MASK = 63;

    /**
     * A bit in the type number that's supposed to be left untouched.
     */
    public static final org.gtk.glib.Type TYPE_FLAG_RESERVED_ID_BIT = new org.gtk.glib.Type(1L);

    /**
     * An integer constant that represents the number of identifiers reserved
     * for types that are assigned at compile-time.
     */
    public static final int TYPE_FUNDAMENTAL_MAX = 255;

    /**
     * Shift value used in converting numbers to type IDs.
     */
    public static final int TYPE_FUNDAMENTAL_SHIFT = 2;

    /**
     * First fundamental type number to create a new fundamental type id with
     * G_TYPE_MAKE_FUNDAMENTAL() reserved for BSE.
     */
    public static final int TYPE_RESERVED_BSE_FIRST = 32;

    /**
     * Last fundamental type number reserved for BSE.
     */
    public static final int TYPE_RESERVED_BSE_LAST = 48;

    /**
     * First fundamental type number to create a new fundamental type id with
     * G_TYPE_MAKE_FUNDAMENTAL() reserved for GLib.
     */
    public static final int TYPE_RESERVED_GLIB_FIRST = 22;

    /**
     * Last fundamental type number reserved for GLib.
     */
    public static final int TYPE_RESERVED_GLIB_LAST = 31;

    /**
     * First available fundamental type number to create new fundamental
     * type id with G_TYPE_MAKE_FUNDAMENTAL().
     */
    public static final int TYPE_RESERVED_USER_FIRST = 49;

    /**
     * For string values, indicates that the string contained is canonical and will
     * exist for the duration of the process. See g_value_set_interned_string().
     */
    public static final int VALUE_INTERNED_STRING = 268435456;

    /**
     * If passed to G_VALUE_COLLECT(), allocated data won't be copied
     * but used verbatim. This does not affect ref-counted types like
     * objects. This does not affect usage of g_value_copy(), the data will
     * be copied if it is not ref-counted.
     */
    public static final int VALUE_NOCOPY_CONTENTS = 134217728;

    private static final MethodHandle g_boxed_copy = Interop.downcallHandle(
        "g_boxed_copy",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Provide a copy of a boxed structure {@code src_boxed} which is of type {@code boxed_type}.
     */
    public static @NotNull java.lang.foreign.MemoryAddress boxedCopy(@NotNull org.gtk.gobject.Type boxedType, @NotNull java.lang.foreign.MemoryAddress srcBoxed) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_boxed_copy.invokeExact(boxedType.getValue(), srcBoxed);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_boxed_free = Interop.downcallHandle(
        "g_boxed_free",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Free the boxed structure {@code boxed} which is of type {@code boxed_type}.
     */
    public static @NotNull void boxedFree(@NotNull org.gtk.gobject.Type boxedType, @NotNull java.lang.foreign.MemoryAddress boxed) {
        try {
            g_boxed_free.invokeExact(boxedType.getValue(), boxed);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    public static @NotNull void cclosureMarshalBOOLEANBOXEDBOXED(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_BOOLEAN__BOXED_BOXED.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static @NotNull void cclosureMarshalBOOLEANFLAGS(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_BOOLEAN__FLAGS.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static @NotNull void cclosureMarshalSTRINGOBJECTPOINTER(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_STRING__OBJECT_POINTER.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static @NotNull void cclosureMarshalVOIDBOOLEAN(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__BOOLEAN.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static @NotNull void cclosureMarshalVOIDBOXED(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__BOXED.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static @NotNull void cclosureMarshalVOIDCHAR(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__CHAR.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static @NotNull void cclosureMarshalVOIDDOUBLE(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__DOUBLE.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static @NotNull void cclosureMarshalVOIDENUM(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__ENUM.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static @NotNull void cclosureMarshalVOIDFLAGS(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__FLAGS.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static @NotNull void cclosureMarshalVOIDFLOAT(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__FLOAT.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static @NotNull void cclosureMarshalVOIDINT(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__INT.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static @NotNull void cclosureMarshalVOIDLONG(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__LONG.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static @NotNull void cclosureMarshalVOIDOBJECT(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__OBJECT.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static @NotNull void cclosureMarshalVOIDPARAM(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__PARAM.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static @NotNull void cclosureMarshalVOIDPOINTER(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__POINTER.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static @NotNull void cclosureMarshalVOIDSTRING(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__STRING.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static @NotNull void cclosureMarshalVOIDUCHAR(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__UCHAR.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static @NotNull void cclosureMarshalVOIDUINT(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
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
    public static @NotNull void cclosureMarshalVOIDUINTPOINTER(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__UINT_POINTER.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static @NotNull void cclosureMarshalVOIDULONG(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__ULONG.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static @NotNull void cclosureMarshalVOIDVARIANT(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__VARIANT.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static @NotNull void cclosureMarshalVOIDVOID(@NotNull Closure closure, @NotNull Value returnValue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_VOID__VOID.invokeExact(closure.handle(), returnValue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static @NotNull void cclosureMarshalGeneric(@NotNull Closure closure, @NotNull Value returnGvalue, @NotNull int nParamValues, @NotNull Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        try {
            g_cclosure_marshal_generic.invokeExact(closure.handle(), returnGvalue.handle(), nParamValues, paramValues.handle(), invocationHint, marshalData);
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
    public static @NotNull Closure cclosureNew(@Nullable Callback callbackFunc, @NotNull ClosureNotify destroyData) {
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
    public static @NotNull Closure cclosureNewSwap(@Nullable Callback callbackFunc, @NotNull ClosureNotify destroyData) {
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
    
    private static final MethodHandle g_clear_object = Interop.downcallHandle(
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
    public static @NotNull void clearObject(@NotNull PointerProxy<Object> objectPtr) {
        try {
            g_clear_object.invokeExact(objectPtr.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_clear_signal_handler = Interop.downcallHandle(
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
    public static @NotNull void clearSignalHandler(@NotNull PointerLong handlerIdPtr, @NotNull Object instance) {
        try {
            g_clear_signal_handler.invokeExact(handlerIdPtr.handle(), instance.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_enum_complete_type_info = Interop.downcallHandle(
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
    public static @NotNull void enumCompleteTypeInfo(@NotNull org.gtk.gobject.Type gEnumType, @NotNull Out<TypeInfo> info, @NotNull EnumValue constValues) {
        MemorySegment infoPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            g_enum_complete_type_info.invokeExact(gEnumType.getValue(), (Addressable) infoPOINTER.address(), constValues.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        info.set(new TypeInfo(Refcounted.get(infoPOINTER.get(ValueLayout.ADDRESS, 0), true)));
    }
    
    private static final MethodHandle g_enum_get_value = Interop.downcallHandle(
        "g_enum_get_value",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the {@link EnumValue} for a value.
     */
    public static @Nullable EnumValue enumGetValue(@NotNull EnumClass enumClass, @NotNull int value) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_enum_get_value.invokeExact(enumClass.handle(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new EnumValue(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_enum_get_value_by_name = Interop.downcallHandle(
        "g_enum_get_value_by_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up a {@link EnumValue} by name.
     */
    public static @Nullable EnumValue enumGetValueByName(@NotNull EnumClass enumClass, @NotNull java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_enum_get_value_by_name.invokeExact(enumClass.handle(), Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new EnumValue(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_enum_get_value_by_nick = Interop.downcallHandle(
        "g_enum_get_value_by_nick",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up a {@link EnumValue} by nickname.
     */
    public static @Nullable EnumValue enumGetValueByNick(@NotNull EnumClass enumClass, @NotNull java.lang.String nick) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_enum_get_value_by_nick.invokeExact(enumClass.handle(), Interop.allocateNativeString(nick));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new EnumValue(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_enum_register_static = Interop.downcallHandle(
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
    public static @NotNull org.gtk.gobject.Type enumRegisterStatic(@NotNull java.lang.String name, @NotNull EnumValue constStaticValues) {
        long RESULT;
        try {
            RESULT = (long) g_enum_register_static.invokeExact(Interop.allocateNativeString(name), constStaticValues.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Type(RESULT);
    }
    
    private static final MethodHandle g_enum_to_string = Interop.downcallHandle(
        "g_enum_to_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Pretty-prints {@code value} in the form of the enum’s name.
     * <p>
     * This is intended to be used for debugging purposes. The format of the output
     * may change in the future.
     */
    public static @NotNull java.lang.String enumToString(@NotNull org.gtk.gobject.Type gEnumType, @NotNull int value) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_enum_to_string.invokeExact(gEnumType.getValue(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_flags_complete_type_info = Interop.downcallHandle(
        "g_flags_complete_type_info",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * This function is meant to be called from the complete_type_info()
     * function of a {@link TypePlugin} implementation, see the example for
     * g_enum_complete_type_info() above.
     */
    public static @NotNull void flagsCompleteTypeInfo(@NotNull org.gtk.gobject.Type gFlagsType, @NotNull Out<TypeInfo> info, @NotNull FlagsValue constValues) {
        MemorySegment infoPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            g_flags_complete_type_info.invokeExact(gFlagsType.getValue(), (Addressable) infoPOINTER.address(), constValues.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        info.set(new TypeInfo(Refcounted.get(infoPOINTER.get(ValueLayout.ADDRESS, 0), true)));
    }
    
    private static final MethodHandle g_flags_get_first_value = Interop.downcallHandle(
        "g_flags_get_first_value",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Returns the first {@link FlagsValue} which is set in {@code value}.
     */
    public static @Nullable FlagsValue flagsGetFirstValue(@NotNull FlagsClass flagsClass, @NotNull int value) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_flags_get_first_value.invokeExact(flagsClass.handle(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FlagsValue(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_flags_get_value_by_name = Interop.downcallHandle(
        "g_flags_get_value_by_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up a {@link FlagsValue} by name.
     */
    public static @Nullable FlagsValue flagsGetValueByName(@NotNull FlagsClass flagsClass, @NotNull java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_flags_get_value_by_name.invokeExact(flagsClass.handle(), Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FlagsValue(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_flags_get_value_by_nick = Interop.downcallHandle(
        "g_flags_get_value_by_nick",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up a {@link FlagsValue} by nickname.
     */
    public static @Nullable FlagsValue flagsGetValueByNick(@NotNull FlagsClass flagsClass, @NotNull java.lang.String nick) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_flags_get_value_by_nick.invokeExact(flagsClass.handle(), Interop.allocateNativeString(nick));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new FlagsValue(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_flags_register_static = Interop.downcallHandle(
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
    public static @NotNull org.gtk.gobject.Type flagsRegisterStatic(@NotNull java.lang.String name, @NotNull FlagsValue constStaticValues) {
        long RESULT;
        try {
            RESULT = (long) g_flags_register_static.invokeExact(Interop.allocateNativeString(name), constStaticValues.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Type(RESULT);
    }
    
    private static final MethodHandle g_flags_to_string = Interop.downcallHandle(
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
    public static @NotNull java.lang.String flagsToString(@NotNull org.gtk.gobject.Type flagsType, @NotNull int value) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_flags_to_string.invokeExact(flagsType.getValue(), value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_gtype_get_type = Interop.downcallHandle(
        "g_gtype_get_type",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG)
    );
    
    public static @NotNull org.gtk.gobject.Type gtypeGetType() {
        long RESULT;
        try {
            RESULT = (long) g_gtype_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Type(RESULT);
    }
    
    private static final MethodHandle g_param_spec_boolean = Interop.downcallHandle(
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
    public static @NotNull ParamSpec paramSpecBoolean(@NotNull java.lang.String name, @NotNull java.lang.String nick, @NotNull java.lang.String blurb, @NotNull boolean defaultValue, @NotNull ParamFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_boolean.invokeExact(Interop.allocateNativeString(name), Interop.allocateNativeString(nick), Interop.allocateNativeString(blurb), defaultValue ? 1 : 0, flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_param_spec_boxed = Interop.downcallHandle(
        "g_param_spec_boxed",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecBoxed} instance specifying a {@code G_TYPE_BOXED}
     * derived property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static @NotNull ParamSpec paramSpecBoxed(@NotNull java.lang.String name, @NotNull java.lang.String nick, @NotNull java.lang.String blurb, @NotNull org.gtk.gobject.Type boxedType, @NotNull ParamFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_boxed.invokeExact(Interop.allocateNativeString(name), Interop.allocateNativeString(nick), Interop.allocateNativeString(blurb), boxedType.getValue(), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_param_spec_char = Interop.downcallHandle(
        "g_param_spec_char",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecChar} instance specifying a {@code G_TYPE_CHAR} property.
     */
    public static @NotNull ParamSpec paramSpecChar(@NotNull java.lang.String name, @NotNull java.lang.String nick, @NotNull java.lang.String blurb, @NotNull byte minimum, @NotNull byte maximum, @NotNull byte defaultValue, @NotNull ParamFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_char.invokeExact(Interop.allocateNativeString(name), Interop.allocateNativeString(nick), Interop.allocateNativeString(blurb), minimum, maximum, defaultValue, flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_param_spec_double = Interop.downcallHandle(
        "g_param_spec_double",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_DOUBLE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecDouble} instance specifying a {@code G_TYPE_DOUBLE}
     * property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static @NotNull ParamSpec paramSpecDouble(@NotNull java.lang.String name, @NotNull java.lang.String nick, @NotNull java.lang.String blurb, @NotNull double minimum, @NotNull double maximum, @NotNull double defaultValue, @NotNull ParamFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_double.invokeExact(Interop.allocateNativeString(name), Interop.allocateNativeString(nick), Interop.allocateNativeString(blurb), minimum, maximum, defaultValue, flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_param_spec_enum = Interop.downcallHandle(
        "g_param_spec_enum",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecEnum} instance specifying a {@code G_TYPE_ENUM}
     * property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static @NotNull ParamSpec paramSpecEnum(@NotNull java.lang.String name, @NotNull java.lang.String nick, @NotNull java.lang.String blurb, @NotNull org.gtk.gobject.Type enumType, @NotNull int defaultValue, @NotNull ParamFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_enum.invokeExact(Interop.allocateNativeString(name), Interop.allocateNativeString(nick), Interop.allocateNativeString(blurb), enumType.getValue(), defaultValue, flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_param_spec_flags = Interop.downcallHandle(
        "g_param_spec_flags",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecFlags} instance specifying a {@code G_TYPE_FLAGS}
     * property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static @NotNull ParamSpec paramSpecFlags(@NotNull java.lang.String name, @NotNull java.lang.String nick, @NotNull java.lang.String blurb, @NotNull org.gtk.gobject.Type flagsType, @NotNull int defaultValue, @NotNull ParamFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_flags.invokeExact(Interop.allocateNativeString(name), Interop.allocateNativeString(nick), Interop.allocateNativeString(blurb), flagsType.getValue(), defaultValue, flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_param_spec_float = Interop.downcallHandle(
        "g_param_spec_float",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_FLOAT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecFloat} instance specifying a {@code G_TYPE_FLOAT} property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static @NotNull ParamSpec paramSpecFloat(@NotNull java.lang.String name, @NotNull java.lang.String nick, @NotNull java.lang.String blurb, @NotNull float minimum, @NotNull float maximum, @NotNull float defaultValue, @NotNull ParamFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_float.invokeExact(Interop.allocateNativeString(name), Interop.allocateNativeString(nick), Interop.allocateNativeString(blurb), minimum, maximum, defaultValue, flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_param_spec_gtype = Interop.downcallHandle(
        "g_param_spec_gtype",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecGType} instance specifying a
     * {@code G_TYPE_GTYPE} property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static @NotNull ParamSpec paramSpecGtype(@NotNull java.lang.String name, @NotNull java.lang.String nick, @NotNull java.lang.String blurb, @NotNull org.gtk.gobject.Type isAType, @NotNull ParamFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_gtype.invokeExact(Interop.allocateNativeString(name), Interop.allocateNativeString(nick), Interop.allocateNativeString(blurb), isAType.getValue(), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_param_spec_int = Interop.downcallHandle(
        "g_param_spec_int",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecInt} instance specifying a {@code G_TYPE_INT} property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static @NotNull ParamSpec paramSpecInt(@NotNull java.lang.String name, @NotNull java.lang.String nick, @NotNull java.lang.String blurb, @NotNull int minimum, @NotNull int maximum, @NotNull int defaultValue, @NotNull ParamFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_int.invokeExact(Interop.allocateNativeString(name), Interop.allocateNativeString(nick), Interop.allocateNativeString(blurb), minimum, maximum, defaultValue, flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_param_spec_int64 = Interop.downcallHandle(
        "g_param_spec_int64",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecInt64} instance specifying a {@code G_TYPE_INT64} property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static @NotNull ParamSpec paramSpecInt64(@NotNull java.lang.String name, @NotNull java.lang.String nick, @NotNull java.lang.String blurb, @NotNull long minimum, @NotNull long maximum, @NotNull long defaultValue, @NotNull ParamFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_int64.invokeExact(Interop.allocateNativeString(name), Interop.allocateNativeString(nick), Interop.allocateNativeString(blurb), minimum, maximum, defaultValue, flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_param_spec_long = Interop.downcallHandle(
        "g_param_spec_long",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecLong} instance specifying a {@code G_TYPE_LONG} property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static @NotNull ParamSpec paramSpecLong(@NotNull java.lang.String name, @NotNull java.lang.String nick, @NotNull java.lang.String blurb, @NotNull long minimum, @NotNull long maximum, @NotNull long defaultValue, @NotNull ParamFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_long.invokeExact(Interop.allocateNativeString(name), Interop.allocateNativeString(nick), Interop.allocateNativeString(blurb), minimum, maximum, defaultValue, flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_param_spec_object = Interop.downcallHandle(
        "g_param_spec_object",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecBoxed} instance specifying a {@code G_TYPE_OBJECT}
     * derived property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static @NotNull ParamSpec paramSpecObject(@NotNull java.lang.String name, @NotNull java.lang.String nick, @NotNull java.lang.String blurb, @NotNull org.gtk.gobject.Type objectType, @NotNull ParamFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_object.invokeExact(Interop.allocateNativeString(name), Interop.allocateNativeString(nick), Interop.allocateNativeString(blurb), objectType.getValue(), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_param_spec_override = Interop.downcallHandle(
        "g_param_spec_override",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new property of type {@link ParamSpecOverride}. This is used
     * to direct operations to another paramspec, and will not be directly
     * useful unless you are implementing a new base type similar to GObject.
     */
    public static @NotNull ParamSpec paramSpecOverride(@NotNull java.lang.String name, @NotNull ParamSpec overridden) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_override.invokeExact(Interop.allocateNativeString(name), overridden.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_param_spec_param = Interop.downcallHandle(
        "g_param_spec_param",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecParam} instance specifying a {@code G_TYPE_PARAM}
     * property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static @NotNull ParamSpec paramSpecParam(@NotNull java.lang.String name, @NotNull java.lang.String nick, @NotNull java.lang.String blurb, @NotNull org.gtk.gobject.Type paramType, @NotNull ParamFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_param.invokeExact(Interop.allocateNativeString(name), Interop.allocateNativeString(nick), Interop.allocateNativeString(blurb), paramType.getValue(), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_param_spec_pointer = Interop.downcallHandle(
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
    public static @NotNull ParamSpec paramSpecPointer(@NotNull java.lang.String name, @NotNull java.lang.String nick, @NotNull java.lang.String blurb, @NotNull ParamFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_pointer.invokeExact(Interop.allocateNativeString(name), Interop.allocateNativeString(nick), Interop.allocateNativeString(blurb), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_param_spec_string = Interop.downcallHandle(
        "g_param_spec_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecString} instance.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static @NotNull ParamSpec paramSpecString(@NotNull java.lang.String name, @NotNull java.lang.String nick, @NotNull java.lang.String blurb, @Nullable java.lang.String defaultValue, @NotNull ParamFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_string.invokeExact(Interop.allocateNativeString(name), Interop.allocateNativeString(nick), Interop.allocateNativeString(blurb), Interop.allocateNativeString(defaultValue), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_param_spec_uchar = Interop.downcallHandle(
        "g_param_spec_uchar",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_BYTE, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecUChar} instance specifying a {@code G_TYPE_UCHAR} property.
     */
    public static @NotNull ParamSpec paramSpecUchar(@NotNull java.lang.String name, @NotNull java.lang.String nick, @NotNull java.lang.String blurb, @NotNull byte minimum, @NotNull byte maximum, @NotNull byte defaultValue, @NotNull ParamFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_uchar.invokeExact(Interop.allocateNativeString(name), Interop.allocateNativeString(nick), Interop.allocateNativeString(blurb), minimum, maximum, defaultValue, flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_param_spec_uint = Interop.downcallHandle(
        "g_param_spec_uint",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecUInt} instance specifying a {@code G_TYPE_UINT} property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static @NotNull ParamSpec paramSpecUint(@NotNull java.lang.String name, @NotNull java.lang.String nick, @NotNull java.lang.String blurb, @NotNull int minimum, @NotNull int maximum, @NotNull int defaultValue, @NotNull ParamFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_uint.invokeExact(Interop.allocateNativeString(name), Interop.allocateNativeString(nick), Interop.allocateNativeString(blurb), minimum, maximum, defaultValue, flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_param_spec_uint64 = Interop.downcallHandle(
        "g_param_spec_uint64",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecUInt64} instance specifying a {@code G_TYPE_UINT64}
     * property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static @NotNull ParamSpec paramSpecUint64(@NotNull java.lang.String name, @NotNull java.lang.String nick, @NotNull java.lang.String blurb, @NotNull long minimum, @NotNull long maximum, @NotNull long defaultValue, @NotNull ParamFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_uint64.invokeExact(Interop.allocateNativeString(name), Interop.allocateNativeString(nick), Interop.allocateNativeString(blurb), minimum, maximum, defaultValue, flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_param_spec_ulong = Interop.downcallHandle(
        "g_param_spec_ulong",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new {@link ParamSpecULong} instance specifying a {@code G_TYPE_ULONG}
     * property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     */
    public static @NotNull ParamSpec paramSpecUlong(@NotNull java.lang.String name, @NotNull java.lang.String nick, @NotNull java.lang.String blurb, @NotNull long minimum, @NotNull long maximum, @NotNull long defaultValue, @NotNull ParamFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_ulong.invokeExact(Interop.allocateNativeString(name), Interop.allocateNativeString(nick), Interop.allocateNativeString(blurb), minimum, maximum, defaultValue, flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_param_spec_unichar = Interop.downcallHandle(
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
    public static @NotNull ParamSpec paramSpecUnichar(@NotNull java.lang.String name, @NotNull java.lang.String nick, @NotNull java.lang.String blurb, @NotNull int defaultValue, @NotNull ParamFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_unichar.invokeExact(Interop.allocateNativeString(name), Interop.allocateNativeString(nick), Interop.allocateNativeString(blurb), defaultValue, flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_param_spec_value_array = Interop.downcallHandle(
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
    public static @NotNull ParamSpec paramSpecValueArray(@NotNull java.lang.String name, @NotNull java.lang.String nick, @NotNull java.lang.String blurb, @NotNull ParamSpec elementSpec, @NotNull ParamFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_value_array.invokeExact(Interop.allocateNativeString(name), Interop.allocateNativeString(nick), Interop.allocateNativeString(blurb), elementSpec.handle(), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_param_spec_variant = Interop.downcallHandle(
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
    public static @NotNull ParamSpec paramSpecVariant(@NotNull java.lang.String name, @NotNull java.lang.String nick, @NotNull java.lang.String blurb, @NotNull org.gtk.glib.VariantType type, @Nullable org.gtk.glib.Variant defaultValue, @NotNull ParamFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_param_spec_variant.invokeExact(Interop.allocateNativeString(name), Interop.allocateNativeString(nick), Interop.allocateNativeString(blurb), type.handle(), defaultValue.refcounted().unowned().handle(), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_param_type_register_static = Interop.downcallHandle(
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
    public static @NotNull org.gtk.gobject.Type paramTypeRegisterStatic(@NotNull java.lang.String name, @NotNull ParamSpecTypeInfo pspecInfo) {
        long RESULT;
        try {
            RESULT = (long) g_param_type_register_static.invokeExact(Interop.allocateNativeString(name), pspecInfo.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Type(RESULT);
    }
    
    private static final MethodHandle g_param_value_convert = Interop.downcallHandle(
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
    public static boolean paramValueConvert(@NotNull ParamSpec pspec, @NotNull Value srcValue, @NotNull Value destValue, @NotNull boolean strictValidation) {
        int RESULT;
        try {
            RESULT = (int) g_param_value_convert.invokeExact(pspec.handle(), srcValue.handle(), destValue.handle(), strictValidation ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_param_value_defaults = Interop.downcallHandle(
        "g_param_value_defaults",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks whether {@code value} contains the default value as specified in {@code pspec}.
     */
    public static boolean paramValueDefaults(@NotNull ParamSpec pspec, @NotNull Value value) {
        int RESULT;
        try {
            RESULT = (int) g_param_value_defaults.invokeExact(pspec.handle(), value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_param_value_set_default = Interop.downcallHandle(
        "g_param_value_set_default",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code value} to its default value as specified in {@code pspec}.
     */
    public static @NotNull void paramValueSetDefault(@NotNull ParamSpec pspec, @NotNull Value value) {
        try {
            g_param_value_set_default.invokeExact(pspec.handle(), value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_param_value_validate = Interop.downcallHandle(
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
    public static boolean paramValueValidate(@NotNull ParamSpec pspec, @NotNull Value value) {
        int RESULT;
        try {
            RESULT = (int) g_param_value_validate.invokeExact(pspec.handle(), value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_param_values_cmp = Interop.downcallHandle(
        "g_param_values_cmp",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Compares {@code value1} with {@code value2} according to {@code pspec}, and return -1, 0 or +1,
     * if {@code value1} is found to be less than, equal to or greater than {@code value2},
     * respectively.
     */
    public static int paramValuesCmp(@NotNull ParamSpec pspec, @NotNull Value value1, @NotNull Value value2) {
        int RESULT;
        try {
            RESULT = (int) g_param_values_cmp.invokeExact(pspec.handle(), value1.handle(), value2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_pointer_type_register_static = Interop.downcallHandle(
        "g_pointer_type_register_static",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Creates a new {@code G_TYPE_POINTER} derived type id for a new
     * pointer type with name {@code name}.
     */
    public static @NotNull org.gtk.gobject.Type pointerTypeRegisterStatic(@NotNull java.lang.String name) {
        long RESULT;
        try {
            RESULT = (long) g_pointer_type_register_static.invokeExact(Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Type(RESULT);
    }
    
    private static final MethodHandle g_signal_accumulator_first_wins = Interop.downcallHandle(
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
    public static boolean signalAccumulatorFirstWins(@NotNull SignalInvocationHint ihint, @NotNull Value returnAccu, @NotNull Value handlerReturn, @Nullable java.lang.foreign.MemoryAddress dummy) {
        int RESULT;
        try {
            RESULT = (int) g_signal_accumulator_first_wins.invokeExact(ihint.handle(), returnAccu.handle(), handlerReturn.handle(), dummy);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_signal_accumulator_true_handled = Interop.downcallHandle(
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
    public static boolean signalAccumulatorTrueHandled(@NotNull SignalInvocationHint ihint, @NotNull Value returnAccu, @NotNull Value handlerReturn, @Nullable java.lang.foreign.MemoryAddress dummy) {
        int RESULT;
        try {
            RESULT = (int) g_signal_accumulator_true_handled.invokeExact(ihint.handle(), returnAccu.handle(), handlerReturn.handle(), dummy);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_signal_add_emission_hook = Interop.downcallHandle(
        "g_signal_add_emission_hook",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds an emission hook for a signal, which will get called for any emission
     * of that signal, independent of the instance. This is possible only
     * for signals which don't have {@link SignalFlags#NO_HOOKS} flag set.
     */
    public static long signalAddEmissionHook(@NotNull int signalId, @NotNull org.gtk.glib.Quark detail, @NotNull SignalEmissionHook hookFunc) {
        long RESULT;
        try {
            RESULT = (long) g_signal_add_emission_hook.invokeExact(signalId, detail.getValue(), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbSignalEmissionHook",
                            MethodType.methodType(int.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(hookFunc)), 
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_signal_chain_from_overridden = Interop.downcallHandle(
        "g_signal_chain_from_overridden",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Calls the original class closure of a signal. This function should only
     * be called from an overridden class closure; see
     * g_signal_override_class_closure() and
     * g_signal_override_class_handler().
     */
    public static @NotNull void signalChainFromOverridden(@NotNull Value[] instanceAndParams, @NotNull Value returnValue) {
        try {
            g_signal_chain_from_overridden.invokeExact(Interop.allocateNativeArray(instanceAndParams), returnValue.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_signal_connect_closure = Interop.downcallHandle(
        "g_signal_connect_closure",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Connects a closure to a signal for a particular object.
     */
    public static long signalConnectClosure(@NotNull Object instance, @NotNull java.lang.String detailedSignal, @NotNull Closure closure, @NotNull boolean after) {
        long RESULT;
        try {
            RESULT = (long) g_signal_connect_closure.invokeExact(instance.handle(), Interop.allocateNativeString(detailedSignal), closure.handle(), after ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_signal_connect_closure_by_id = Interop.downcallHandle(
        "g_signal_connect_closure_by_id",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Connects a closure to a signal for a particular object.
     */
    public static long signalConnectClosureById(@NotNull Object instance, @NotNull int signalId, @NotNull org.gtk.glib.Quark detail, @NotNull Closure closure, @NotNull boolean after) {
        long RESULT;
        try {
            RESULT = (long) g_signal_connect_closure_by_id.invokeExact(instance.handle(), signalId, detail.getValue(), closure.handle(), after ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_signal_connect_data = Interop.downcallHandle(
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
    public static long signalConnectData(@NotNull Object instance, @NotNull java.lang.String detailedSignal, @NotNull Callback cHandler, @Nullable ClosureNotify destroyData, @NotNull ConnectFlags connectFlags) {
        long RESULT;
        try {
            RESULT = (long) g_signal_connect_data.invokeExact(instance.handle(), Interop.allocateNativeString(detailedSignal), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbCallback",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(cHandler)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbClosureNotify",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()), connectFlags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_signal_emit_valist = Interop.downcallHandle(
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
    public static @NotNull void signalEmitValist(@NotNull TypeInstance instance, @NotNull int signalId, @NotNull org.gtk.glib.Quark detail, @NotNull VaList varArgs) {
        try {
            g_signal_emit_valist.invokeExact(instance.handle(), signalId, detail.getValue(), varArgs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_signal_emitv = Interop.downcallHandle(
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
    public static @NotNull void signalEmitv(@NotNull Value[] instanceAndParams, @NotNull int signalId, @NotNull org.gtk.glib.Quark detail, @NotNull Out<Value> returnValue) {
        MemorySegment returnValuePOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            g_signal_emitv.invokeExact(Interop.allocateNativeArray(instanceAndParams), signalId, detail.getValue(), (Addressable) returnValuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        returnValue.set(new Value(Refcounted.get(returnValuePOINTER.get(ValueLayout.ADDRESS, 0), true)));
    }
    
    private static final MethodHandle g_signal_get_invocation_hint = Interop.downcallHandle(
        "g_signal_get_invocation_hint",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the invocation hint of the innermost signal emission of instance.
     */
    public static @Nullable SignalInvocationHint signalGetInvocationHint(@NotNull Object instance) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_signal_get_invocation_hint.invokeExact(instance.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new SignalInvocationHint(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_signal_handler_block = Interop.downcallHandle(
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
    public static @NotNull void signalHandlerBlock(@NotNull Object instance, @NotNull long handlerId) {
        try {
            g_signal_handler_block.invokeExact(instance.handle(), handlerId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_signal_handler_disconnect = Interop.downcallHandle(
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
    public static @NotNull void signalHandlerDisconnect(@NotNull Object instance, @NotNull long handlerId) {
        try {
            g_signal_handler_disconnect.invokeExact(instance.handle(), handlerId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_signal_handler_find = Interop.downcallHandle(
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
    public static long signalHandlerFind(@NotNull Object instance, @NotNull SignalMatchType mask, @NotNull int signalId, @NotNull org.gtk.glib.Quark detail, @Nullable Closure closure, @Nullable java.lang.foreign.MemoryAddress func, @Nullable java.lang.foreign.MemoryAddress data) {
        long RESULT;
        try {
            RESULT = (long) g_signal_handler_find.invokeExact(instance.handle(), mask.getValue(), signalId, detail.getValue(), closure.handle(), func, data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_signal_handler_is_connected = Interop.downcallHandle(
        "g_signal_handler_is_connected",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Returns whether {@code handler_id} is the ID of a handler connected to {@code instance}.
     */
    public static boolean signalHandlerIsConnected(@NotNull Object instance, @NotNull long handlerId) {
        int RESULT;
        try {
            RESULT = (int) g_signal_handler_is_connected.invokeExact(instance.handle(), handlerId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_signal_handler_unblock = Interop.downcallHandle(
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
    public static @NotNull void signalHandlerUnblock(@NotNull Object instance, @NotNull long handlerId) {
        try {
            g_signal_handler_unblock.invokeExact(instance.handle(), handlerId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_signal_handlers_block_matched = Interop.downcallHandle(
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
    public static int signalHandlersBlockMatched(@NotNull Object instance, @NotNull SignalMatchType mask, @NotNull int signalId, @NotNull org.gtk.glib.Quark detail, @Nullable Closure closure, @Nullable java.lang.foreign.MemoryAddress func, @Nullable java.lang.foreign.MemoryAddress data) {
        int RESULT;
        try {
            RESULT = (int) g_signal_handlers_block_matched.invokeExact(instance.handle(), mask.getValue(), signalId, detail.getValue(), closure.handle(), func, data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_signal_handlers_destroy = Interop.downcallHandle(
        "g_signal_handlers_destroy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Destroy all signal handlers of a type instance. This function is
     * an implementation detail of the {@link Object} dispose implementation,
     * and should not be used outside of the type system.
     */
    public static @NotNull void signalHandlersDestroy(@NotNull Object instance) {
        try {
            g_signal_handlers_destroy.invokeExact(instance.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_signal_handlers_disconnect_matched = Interop.downcallHandle(
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
    public static int signalHandlersDisconnectMatched(@NotNull Object instance, @NotNull SignalMatchType mask, @NotNull int signalId, @NotNull org.gtk.glib.Quark detail, @Nullable Closure closure, @Nullable java.lang.foreign.MemoryAddress func, @Nullable java.lang.foreign.MemoryAddress data) {
        int RESULT;
        try {
            RESULT = (int) g_signal_handlers_disconnect_matched.invokeExact(instance.handle(), mask.getValue(), signalId, detail.getValue(), closure.handle(), func, data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_signal_handlers_unblock_matched = Interop.downcallHandle(
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
    public static int signalHandlersUnblockMatched(@NotNull Object instance, @NotNull SignalMatchType mask, @NotNull int signalId, @NotNull org.gtk.glib.Quark detail, @Nullable Closure closure, @Nullable java.lang.foreign.MemoryAddress func, @Nullable java.lang.foreign.MemoryAddress data) {
        int RESULT;
        try {
            RESULT = (int) g_signal_handlers_unblock_matched.invokeExact(instance.handle(), mask.getValue(), signalId, detail.getValue(), closure.handle(), func, data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_signal_has_handler_pending = Interop.downcallHandle(
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
    public static boolean signalHasHandlerPending(@NotNull Object instance, @NotNull int signalId, @NotNull org.gtk.glib.Quark detail, @NotNull boolean mayBeBlocked) {
        int RESULT;
        try {
            RESULT = (int) g_signal_has_handler_pending.invokeExact(instance.handle(), signalId, detail.getValue(), mayBeBlocked ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_signal_is_valid_name = Interop.downcallHandle(
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
    public static boolean signalIsValidName(@NotNull java.lang.String name) {
        int RESULT;
        try {
            RESULT = (int) g_signal_is_valid_name.invokeExact(Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_signal_list_ids = Interop.downcallHandle(
        "g_signal_list_ids",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Lists the signals by id that a certain instance or interface type
     * created. Further information about the signals can be acquired through
     * g_signal_query().
     */
    public static int[] signalListIds(@NotNull org.gtk.gobject.Type itype, @NotNull Out<Integer> nIds) {
        MemorySegment nIdsPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_signal_list_ids.invokeExact(itype.getValue(), (Addressable) nIdsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nIds.set(nIdsPOINTER.get(ValueLayout.JAVA_INT, 0));
        return MemorySegment.ofAddress(RESULT.get(ValueLayout.ADDRESS, 0), nIds.get().intValue() * ValueLayout.JAVA_INT.byteSize(), Interop.getScope()).toArray(ValueLayout.JAVA_INT);
    }
    
    private static final MethodHandle g_signal_lookup = Interop.downcallHandle(
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
    public static int signalLookup(@NotNull java.lang.String name, @NotNull org.gtk.gobject.Type itype) {
        int RESULT;
        try {
            RESULT = (int) g_signal_lookup.invokeExact(Interop.allocateNativeString(name), itype.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_signal_name = Interop.downcallHandle(
        "g_signal_name",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Given the signal's identifier, finds its name.
     * <p>
     * Two different signals may have the same name, if they have differing types.
     */
    public static @Nullable java.lang.String signalName(@NotNull int signalId) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_signal_name.invokeExact(signalId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_signal_override_class_closure = Interop.downcallHandle(
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
    public static @NotNull void signalOverrideClassClosure(@NotNull int signalId, @NotNull org.gtk.gobject.Type instanceType, @NotNull Closure classClosure) {
        try {
            g_signal_override_class_closure.invokeExact(signalId, instanceType.getValue(), classClosure.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_signal_parse_name = Interop.downcallHandle(
        "g_signal_parse_name",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Internal function to parse a signal name into its {@code signal_id}
     * and {@code detail} quark.
     */
    public static boolean signalParseName(@NotNull java.lang.String detailedSignal, @NotNull org.gtk.gobject.Type itype, @NotNull Out<Integer> signalIdP, @NotNull Out<org.gtk.glib.Quark> detailP, @NotNull boolean forceDetailQuark) {
        MemorySegment signalIdPPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemorySegment detailPPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        int RESULT;
        try {
            RESULT = (int) g_signal_parse_name.invokeExact(Interop.allocateNativeString(detailedSignal), itype.getValue(), (Addressable) signalIdPPOINTER.address(), (Addressable) detailPPOINTER.address(), forceDetailQuark ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        signalIdP.set(signalIdPPOINTER.get(ValueLayout.JAVA_INT, 0));
        detailP.set(new org.gtk.glib.Quark(detailPPOINTER.get(ValueLayout.JAVA_INT, 0)));
        return RESULT != 0;
    }
    
    private static final MethodHandle g_signal_query = Interop.downcallHandle(
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
    public static @NotNull void signalQuery(@NotNull int signalId, @NotNull Out<SignalQuery> query) {
        MemorySegment queryPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            g_signal_query.invokeExact(signalId, (Addressable) queryPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        query.set(new SignalQuery(Refcounted.get(queryPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle g_signal_remove_emission_hook = Interop.downcallHandle(
        "g_signal_remove_emission_hook",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Deletes an emission hook.
     */
    public static @NotNull void signalRemoveEmissionHook(@NotNull int signalId, @NotNull long hookId) {
        try {
            g_signal_remove_emission_hook.invokeExact(signalId, hookId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_signal_stop_emission = Interop.downcallHandle(
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
    public static @NotNull void signalStopEmission(@NotNull Object instance, @NotNull int signalId, @NotNull org.gtk.glib.Quark detail) {
        try {
            g_signal_stop_emission.invokeExact(instance.handle(), signalId, detail.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_signal_stop_emission_by_name = Interop.downcallHandle(
        "g_signal_stop_emission_by_name",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Stops a signal's current emission.
     * <p>
     * This is just like g_signal_stop_emission() except it will look up the
     * signal id for you.
     */
    public static @NotNull void signalStopEmissionByName(@NotNull Object instance, @NotNull java.lang.String detailedSignal) {
        try {
            g_signal_stop_emission_by_name.invokeExact(instance.handle(), Interop.allocateNativeString(detailedSignal));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_signal_type_cclosure_new = Interop.downcallHandle(
        "g_signal_type_cclosure_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    /**
     * Creates a new closure which invokes the function found at the offset
     * {@code struct_offset} in the class structure of the interface or classed type
     * identified by {@code itype}.
     */
    public static @NotNull Closure signalTypeCclosureNew(@NotNull org.gtk.gobject.Type itype, @NotNull int structOffset) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_signal_type_cclosure_new.invokeExact(itype.getValue(), structOffset);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Closure(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_source_set_closure = Interop.downcallHandle(
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
    public static @NotNull void sourceSetClosure(@NotNull org.gtk.glib.Source source, @NotNull Closure closure) {
        try {
            g_source_set_closure.invokeExact(source.handle(), closure.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_source_set_dummy_callback = Interop.downcallHandle(
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
    public static @NotNull void sourceSetDummyCallback(@NotNull org.gtk.glib.Source source) {
        try {
            g_source_set_dummy_callback.invokeExact(source.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_strdup_value_contents = Interop.downcallHandle(
        "g_strdup_value_contents",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Return a newly allocated string, which describes the contents of a
     * {@link Value}.  The main purpose of this function is to describe {@link Value}
     * contents for debugging output, the way in which the contents are
     * described may change between different GLib versions.
     */
    public static @NotNull java.lang.String strdupValueContents(@NotNull Value value) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_strdup_value_contents.invokeExact(value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_type_add_class_cache_func = Interop.downcallHandle(
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
    public static @NotNull void typeAddClassCacheFunc(@NotNull TypeClassCacheFunc cacheFunc) {
        try {
            g_type_add_class_cache_func.invokeExact(
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(cacheFunc)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbTypeClassCacheFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_type_add_class_private = Interop.downcallHandle(
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
    public static @NotNull void typeAddClassPrivate(@NotNull org.gtk.gobject.Type classType, @NotNull long privateSize) {
        try {
            g_type_add_class_private.invokeExact(classType.getValue(), privateSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_type_add_instance_private = Interop.downcallHandle(
        "g_type_add_instance_private",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    public static int typeAddInstancePrivate(@NotNull org.gtk.gobject.Type classType, @NotNull long privateSize) {
        int RESULT;
        try {
            RESULT = (int) g_type_add_instance_private.invokeExact(classType.getValue(), privateSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_type_add_interface_check = Interop.downcallHandle(
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
    public static @NotNull void typeAddInterfaceCheck(@NotNull TypeInterfaceCheckFunc checkFunc) {
        try {
            g_type_add_interface_check.invokeExact(
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(checkFunc)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbTypeInterfaceCheckFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_type_add_interface_dynamic = Interop.downcallHandle(
        "g_type_add_interface_dynamic",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds {@code interface_type} to the dynamic {@code instance_type}. The information
     * contained in the {@link TypePlugin} structure pointed to by {@code plugin}
     * is used to manage the relationship.
     */
    public static @NotNull void typeAddInterfaceDynamic(@NotNull org.gtk.gobject.Type instanceType, @NotNull org.gtk.gobject.Type interfaceType, @NotNull TypePlugin plugin) {
        try {
            g_type_add_interface_dynamic.invokeExact(instanceType.getValue(), interfaceType.getValue(), plugin.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_type_add_interface_static = Interop.downcallHandle(
        "g_type_add_interface_static",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Adds {@code interface_type} to the static {@code instance_type}.
     * The information contained in the {@link InterfaceInfo} structure
     * pointed to by {@code info} is used to manage the relationship.
     */
    public static @NotNull void typeAddInterfaceStatic(@NotNull org.gtk.gobject.Type instanceType, @NotNull org.gtk.gobject.Type interfaceType, @NotNull InterfaceInfo info) {
        try {
            g_type_add_interface_static.invokeExact(instanceType.getValue(), interfaceType.getValue(), info.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_type_check_class_cast = Interop.downcallHandle(
        "g_type_check_class_cast",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    public static @NotNull TypeClass typeCheckClassCast(@NotNull TypeClass gClass, @NotNull org.gtk.gobject.Type isAType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_type_check_class_cast.invokeExact(gClass.handle(), isAType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TypeClass(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_type_check_class_is_a = Interop.downcallHandle(
        "g_type_check_class_is_a",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    public static boolean typeCheckClassIsA(@NotNull TypeClass gClass, @NotNull org.gtk.gobject.Type isAType) {
        int RESULT;
        try {
            RESULT = (int) g_type_check_class_is_a.invokeExact(gClass.handle(), isAType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_type_check_instance = Interop.downcallHandle(
        "g_type_check_instance",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Private helper function to aid implementation of the
     * G_TYPE_CHECK_INSTANCE() macro.
     */
    public static boolean typeCheckInstance(@NotNull TypeInstance instance) {
        int RESULT;
        try {
            RESULT = (int) g_type_check_instance.invokeExact(instance.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_type_check_instance_cast = Interop.downcallHandle(
        "g_type_check_instance_cast",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    public static @NotNull TypeInstance typeCheckInstanceCast(@NotNull TypeInstance instance, @NotNull org.gtk.gobject.Type ifaceType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_type_check_instance_cast.invokeExact(instance.handle(), ifaceType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TypeInstance(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_type_check_instance_is_a = Interop.downcallHandle(
        "g_type_check_instance_is_a",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    public static boolean typeCheckInstanceIsA(@NotNull TypeInstance instance, @NotNull org.gtk.gobject.Type ifaceType) {
        int RESULT;
        try {
            RESULT = (int) g_type_check_instance_is_a.invokeExact(instance.handle(), ifaceType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_type_check_instance_is_fundamentally_a = Interop.downcallHandle(
        "g_type_check_instance_is_fundamentally_a",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    public static boolean typeCheckInstanceIsFundamentallyA(@NotNull TypeInstance instance, @NotNull org.gtk.gobject.Type fundamentalType) {
        int RESULT;
        try {
            RESULT = (int) g_type_check_instance_is_fundamentally_a.invokeExact(instance.handle(), fundamentalType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_type_check_is_value_type = Interop.downcallHandle(
        "g_type_check_is_value_type",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)
    );
    
    public static boolean typeCheckIsValueType(@NotNull org.gtk.gobject.Type type) {
        int RESULT;
        try {
            RESULT = (int) g_type_check_is_value_type.invokeExact(type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_type_check_value = Interop.downcallHandle(
        "g_type_check_value",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    public static boolean typeCheckValue(@NotNull Value value) {
        int RESULT;
        try {
            RESULT = (int) g_type_check_value.invokeExact(value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_type_check_value_holds = Interop.downcallHandle(
        "g_type_check_value_holds",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    public static boolean typeCheckValueHolds(@NotNull Value value, @NotNull org.gtk.gobject.Type type) {
        int RESULT;
        try {
            RESULT = (int) g_type_check_value_holds.invokeExact(value.handle(), type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_type_children = Interop.downcallHandle(
        "g_type_children",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Return a newly allocated and 0-terminated array of type IDs, listing
     * the child types of {@code type}.
     */
    public static org.gtk.gobject.Type[] typeChildren(@NotNull org.gtk.gobject.Type type, @NotNull Out<Integer> nChildren) {
        MemorySegment nChildrenPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_type_children.invokeExact(type.getValue(), (Addressable) nChildrenPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nChildren.set(nChildrenPOINTER.get(ValueLayout.JAVA_INT, 0));
        org.gtk.gobject.Type[] resultARRAY = new org.gtk.gobject.Type[nChildren.get().intValue()];
        for (int I = 0; I < nChildren.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.JAVA_LONG, I);
            resultARRAY[I] = new org.gtk.gobject.Type(OBJ);
        }
        return resultARRAY;
    }
    
    private static final MethodHandle g_type_class_adjust_private_offset = Interop.downcallHandle(
        "g_type_class_adjust_private_offset",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    public static @NotNull void typeClassAdjustPrivateOffset(@Nullable java.lang.foreign.MemoryAddress gClass, @NotNull PointerInteger privateSizeOrOffset) {
        try {
            g_type_class_adjust_private_offset.invokeExact(gClass, privateSizeOrOffset.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_type_class_peek = Interop.downcallHandle(
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
    public static @NotNull TypeClass typeClassPeek(@NotNull org.gtk.gobject.Type type) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_type_class_peek.invokeExact(type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TypeClass(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_type_class_peek_static = Interop.downcallHandle(
        "g_type_class_peek_static",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * A more efficient version of g_type_class_peek() which works only for
     * static types.
     */
    public static @NotNull TypeClass typeClassPeekStatic(@NotNull org.gtk.gobject.Type type) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_type_class_peek_static.invokeExact(type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TypeClass(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_type_class_ref = Interop.downcallHandle(
        "g_type_class_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Increments the reference count of the class structure belonging to
     * {@code type}. This function will demand-create the class if it doesn't
     * exist already.
     */
    public static @NotNull TypeClass typeClassRef(@NotNull org.gtk.gobject.Type type) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_type_class_ref.invokeExact(type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TypeClass(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_type_create_instance = Interop.downcallHandle(
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
    public static @NotNull TypeInstance typeCreateInstance(@NotNull org.gtk.gobject.Type type) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_type_create_instance.invokeExact(type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TypeInstance(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_type_default_interface_peek = Interop.downcallHandle(
        "g_type_default_interface_peek",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * If the interface type {@code g_type} is currently in use, returns its
     * default interface vtable.
     */
    public static @NotNull TypeInterface typeDefaultInterfacePeek(@NotNull org.gtk.gobject.Type gType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_type_default_interface_peek.invokeExact(gType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TypeInterface(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_type_default_interface_ref = Interop.downcallHandle(
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
    public static @NotNull TypeInterface typeDefaultInterfaceRef(@NotNull org.gtk.gobject.Type gType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_type_default_interface_ref.invokeExact(gType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TypeInterface(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_type_default_interface_unref = Interop.downcallHandle(
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
    public static @NotNull void typeDefaultInterfaceUnref(@NotNull TypeInterface gIface) {
        try {
            g_type_default_interface_unref.invokeExact(gIface.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_type_depth = Interop.downcallHandle(
        "g_type_depth",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Returns the length of the ancestry of the passed in type. This
     * includes the type itself, so that e.g. a fundamental type has depth 1.
     */
    public static int typeDepth(@NotNull org.gtk.gobject.Type type) {
        int RESULT;
        try {
            RESULT = (int) g_type_depth.invokeExact(type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_type_ensure = Interop.downcallHandle(
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
    public static @NotNull void typeEnsure(@NotNull org.gtk.gobject.Type type) {
        try {
            g_type_ensure.invokeExact(type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_type_free_instance = Interop.downcallHandle(
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
    public static @NotNull void typeFreeInstance(@NotNull TypeInstance instance) {
        try {
            g_type_free_instance.invokeExact(instance.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_type_from_name = Interop.downcallHandle(
        "g_type_from_name",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Look up the type ID from a given type name, returning 0 if no type
     * has been registered under this name (this is the preferred method
     * to find out by name whether a specific type has been registered
     * yet).
     */
    public static @NotNull org.gtk.gobject.Type typeFromName(@NotNull java.lang.String name) {
        long RESULT;
        try {
            RESULT = (long) g_type_from_name.invokeExact(Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Type(RESULT);
    }
    
    private static final MethodHandle g_type_fundamental = Interop.downcallHandle(
        "g_type_fundamental",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Internal function, used to extract the fundamental type ID portion.
     * Use G_TYPE_FUNDAMENTAL() instead.
     */
    public static @NotNull org.gtk.gobject.Type typeFundamental(@NotNull org.gtk.gobject.Type typeId) {
        long RESULT;
        try {
            RESULT = (long) g_type_fundamental.invokeExact(typeId.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Type(RESULT);
    }
    
    private static final MethodHandle g_type_fundamental_next = Interop.downcallHandle(
        "g_type_fundamental_next",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG)
    );
    
    /**
     * Returns the next free fundamental type id which can be used to
     * register a new fundamental type with g_type_register_fundamental().
     * The returned type ID represents the highest currently registered
     * fundamental type identifier.
     */
    public static @NotNull org.gtk.gobject.Type typeFundamentalNext() {
        long RESULT;
        try {
            RESULT = (long) g_type_fundamental_next.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Type(RESULT);
    }
    
    private static final MethodHandle g_type_get_instance_count = Interop.downcallHandle(
        "g_type_get_instance_count",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Returns the number of instances allocated of the particular type;
     * this is only available if GLib is built with debugging support and
     * the instance_count debug flag is set (by setting the GOBJECT_DEBUG
     * variable to include instance-count).
     */
    public static int typeGetInstanceCount(@NotNull org.gtk.gobject.Type type) {
        int RESULT;
        try {
            RESULT = (int) g_type_get_instance_count.invokeExact(type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_type_get_plugin = Interop.downcallHandle(
        "g_type_get_plugin",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Returns the {@link TypePlugin} structure for {@code type}.
     */
    public static @NotNull TypePlugin typeGetPlugin(@NotNull org.gtk.gobject.Type type) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_type_get_plugin.invokeExact(type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TypePlugin.TypePluginImpl(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_type_get_qdata = Interop.downcallHandle(
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
    public static @Nullable java.lang.foreign.MemoryAddress typeGetQdata(@NotNull org.gtk.gobject.Type type, @NotNull org.gtk.glib.Quark quark) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_type_get_qdata.invokeExact(type.getValue(), quark.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_type_get_type_registration_serial = Interop.downcallHandle(
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
        int RESULT;
        try {
            RESULT = (int) g_type_get_type_registration_serial.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_type_interface_add_prerequisite = Interop.downcallHandle(
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
    public static @NotNull void typeInterfaceAddPrerequisite(@NotNull org.gtk.gobject.Type interfaceType, @NotNull org.gtk.gobject.Type prerequisiteType) {
        try {
            g_type_interface_add_prerequisite.invokeExact(interfaceType.getValue(), prerequisiteType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_type_interface_get_plugin = Interop.downcallHandle(
        "g_type_interface_get_plugin",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Returns the {@link TypePlugin} structure for the dynamic interface
     * {@code interface_type} which has been added to {@code instance_type}, or {@code null}
     * if {@code interface_type} has not been added to {@code instance_type} or does
     * not have a {@link TypePlugin} structure. See g_type_add_interface_dynamic().
     */
    public static @NotNull TypePlugin typeInterfaceGetPlugin(@NotNull org.gtk.gobject.Type instanceType, @NotNull org.gtk.gobject.Type interfaceType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_type_interface_get_plugin.invokeExact(instanceType.getValue(), interfaceType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TypePlugin.TypePluginImpl(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_type_interface_instantiatable_prerequisite = Interop.downcallHandle(
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
    public static @NotNull org.gtk.gobject.Type typeInterfaceInstantiatablePrerequisite(@NotNull org.gtk.gobject.Type interfaceType) {
        long RESULT;
        try {
            RESULT = (long) g_type_interface_instantiatable_prerequisite.invokeExact(interfaceType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Type(RESULT);
    }
    
    private static final MethodHandle g_type_interface_peek = Interop.downcallHandle(
        "g_type_interface_peek",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Returns the {@link TypeInterface} structure of an interface to which the
     * passed in class conforms.
     */
    public static @NotNull TypeInterface typeInterfacePeek(@NotNull TypeClass instanceClass, @NotNull org.gtk.gobject.Type ifaceType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_type_interface_peek.invokeExact(instanceClass.handle(), ifaceType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TypeInterface(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_type_interface_prerequisites = Interop.downcallHandle(
        "g_type_interface_prerequisites",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the prerequisites of an interfaces type.
     */
    public static org.gtk.gobject.Type[] typeInterfacePrerequisites(@NotNull org.gtk.gobject.Type interfaceType, @NotNull Out<Integer> nPrerequisites) {
        MemorySegment nPrerequisitesPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_type_interface_prerequisites.invokeExact(interfaceType.getValue(), (Addressable) nPrerequisitesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nPrerequisites.set(nPrerequisitesPOINTER.get(ValueLayout.JAVA_INT, 0));
        org.gtk.gobject.Type[] resultARRAY = new org.gtk.gobject.Type[nPrerequisites.get().intValue()];
        for (int I = 0; I < nPrerequisites.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.JAVA_LONG, I);
            resultARRAY[I] = new org.gtk.gobject.Type(OBJ);
        }
        return resultARRAY;
    }
    
    private static final MethodHandle g_type_interfaces = Interop.downcallHandle(
        "g_type_interfaces",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Return a newly allocated and 0-terminated array of type IDs, listing
     * the interface types that {@code type} conforms to.
     */
    public static org.gtk.gobject.Type[] typeInterfaces(@NotNull org.gtk.gobject.Type type, @NotNull Out<Integer> nInterfaces) {
        MemorySegment nInterfacesPOINTER = Interop.getAllocator().allocate(ValueLayout.JAVA_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_type_interfaces.invokeExact(type.getValue(), (Addressable) nInterfacesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nInterfaces.set(nInterfacesPOINTER.get(ValueLayout.JAVA_INT, 0));
        org.gtk.gobject.Type[] resultARRAY = new org.gtk.gobject.Type[nInterfaces.get().intValue()];
        for (int I = 0; I < nInterfaces.get().intValue(); I++) {
            var OBJ = RESULT.get(ValueLayout.JAVA_LONG, I);
            resultARRAY[I] = new org.gtk.gobject.Type(OBJ);
        }
        return resultARRAY;
    }
    
    private static final MethodHandle g_type_is_a = Interop.downcallHandle(
        "g_type_is_a",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * If {@code is_a_type} is a derivable type, check whether {@code type} is a
     * descendant of {@code is_a_type}. If {@code is_a_type} is an interface, check
     * whether {@code type} conforms to it.
     */
    public static boolean typeIsA(@NotNull org.gtk.gobject.Type type, @NotNull org.gtk.gobject.Type isAType) {
        int RESULT;
        try {
            RESULT = (int) g_type_is_a.invokeExact(type.getValue(), isAType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_type_name = Interop.downcallHandle(
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
    public static @NotNull java.lang.String typeName(@NotNull org.gtk.gobject.Type type) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_type_name.invokeExact(type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_type_name_from_class = Interop.downcallHandle(
        "g_type_name_from_class",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    public static @NotNull java.lang.String typeNameFromClass(@NotNull TypeClass gClass) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_type_name_from_class.invokeExact(gClass.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_type_name_from_instance = Interop.downcallHandle(
        "g_type_name_from_instance",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    public static @NotNull java.lang.String typeNameFromInstance(@NotNull TypeInstance instance) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_type_name_from_instance.invokeExact(instance.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_type_next_base = Interop.downcallHandle(
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
    public static @NotNull org.gtk.gobject.Type typeNextBase(@NotNull org.gtk.gobject.Type leafType, @NotNull org.gtk.gobject.Type rootType) {
        long RESULT;
        try {
            RESULT = (long) g_type_next_base.invokeExact(leafType.getValue(), rootType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Type(RESULT);
    }
    
    private static final MethodHandle g_type_parent = Interop.downcallHandle(
        "g_type_parent",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Return the direct parent type of the passed in type. If the passed
     * in type has no parent, i.e. is a fundamental type, 0 is returned.
     */
    public static @NotNull org.gtk.gobject.Type typeParent(@NotNull org.gtk.gobject.Type type) {
        long RESULT;
        try {
            RESULT = (long) g_type_parent.invokeExact(type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Type(RESULT);
    }
    
    private static final MethodHandle g_type_qname = Interop.downcallHandle(
        "g_type_qname",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Get the corresponding quark of the type IDs name.
     */
    public static @NotNull org.gtk.glib.Quark typeQname(@NotNull org.gtk.gobject.Type type) {
        int RESULT;
        try {
            RESULT = (int) g_type_qname.invokeExact(type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static final MethodHandle g_type_query = Interop.downcallHandle(
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
    public static @NotNull void typeQuery(@NotNull org.gtk.gobject.Type type, @NotNull Out<TypeQuery> query) {
        MemorySegment queryPOINTER = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            g_type_query.invokeExact(type.getValue(), (Addressable) queryPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        query.set(new TypeQuery(Refcounted.get(queryPOINTER.get(ValueLayout.ADDRESS, 0), false)));
    }
    
    private static final MethodHandle g_type_register_dynamic = Interop.downcallHandle(
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
    public static @NotNull org.gtk.gobject.Type typeRegisterDynamic(@NotNull org.gtk.gobject.Type parentType, @NotNull java.lang.String typeName, @NotNull TypePlugin plugin, @NotNull TypeFlags flags) {
        long RESULT;
        try {
            RESULT = (long) g_type_register_dynamic.invokeExact(parentType.getValue(), Interop.allocateNativeString(typeName), plugin.handle(), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Type(RESULT);
    }
    
    private static final MethodHandle g_type_register_fundamental = Interop.downcallHandle(
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
    public static @NotNull org.gtk.gobject.Type typeRegisterFundamental(@NotNull org.gtk.gobject.Type typeId, @NotNull java.lang.String typeName, @NotNull TypeInfo info, @NotNull TypeFundamentalInfo finfo, @NotNull TypeFlags flags) {
        long RESULT;
        try {
            RESULT = (long) g_type_register_fundamental.invokeExact(typeId.getValue(), Interop.allocateNativeString(typeName), info.handle(), finfo.handle(), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Type(RESULT);
    }
    
    private static final MethodHandle g_type_register_static = Interop.downcallHandle(
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
    public static @NotNull org.gtk.gobject.Type typeRegisterStatic(@NotNull org.gtk.gobject.Type parentType, @NotNull java.lang.String typeName, @NotNull TypeInfo info, @NotNull TypeFlags flags) {
        long RESULT;
        try {
            RESULT = (long) g_type_register_static.invokeExact(parentType.getValue(), Interop.allocateNativeString(typeName), info.handle(), flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Type(RESULT);
    }
    
    private static final MethodHandle g_type_remove_class_cache_func = Interop.downcallHandle(
        "g_type_remove_class_cache_func",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes a previously installed {@link TypeClassCacheFunc}. The cache
     * maintained by {@code cache_func} has to be empty when calling
     * g_type_remove_class_cache_func() to avoid leaks.
     */
    public static @NotNull void typeRemoveClassCacheFunc(@NotNull TypeClassCacheFunc cacheFunc) {
        try {
            g_type_remove_class_cache_func.invokeExact(
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(cacheFunc)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbTypeClassCacheFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_type_remove_interface_check = Interop.downcallHandle(
        "g_type_remove_interface_check",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Removes an interface check function added with
     * g_type_add_interface_check().
     */
    public static @NotNull void typeRemoveInterfaceCheck(@NotNull TypeInterfaceCheckFunc checkFunc) {
        try {
            g_type_remove_interface_check.invokeExact(
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(checkFunc)), 
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.class, "__cbTypeInterfaceCheckFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_type_set_qdata = Interop.downcallHandle(
        "g_type_set_qdata",
        FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Attaches arbitrary data to a type.
     */
    public static @NotNull void typeSetQdata(@NotNull org.gtk.gobject.Type type, @NotNull org.gtk.glib.Quark quark, @Nullable java.lang.foreign.MemoryAddress data) {
        try {
            g_type_set_qdata.invokeExact(type.getValue(), quark.getValue(), data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_type_test_flags = Interop.downcallHandle(
        "g_type_test_flags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_INT)
    );
    
    public static boolean typeTestFlags(@NotNull org.gtk.gobject.Type type, @NotNull int flags) {
        int RESULT;
        try {
            RESULT = (int) g_type_test_flags.invokeExact(type.getValue(), flags);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_type_value_table_peek = Interop.downcallHandle(
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
    public static @NotNull TypeValueTable typeValueTablePeek(@NotNull org.gtk.gobject.Type type) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_type_value_table_peek.invokeExact(type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new TypeValueTable(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_value_type_compatible = Interop.downcallHandle(
        "g_value_type_compatible",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Returns whether a {@link Value} of type {@code src_type} can be copied into
     * a {@link Value} of type {@code dest_type}.
     */
    public static boolean valueTypeCompatible(@NotNull org.gtk.gobject.Type srcType, @NotNull org.gtk.gobject.Type destType) {
        int RESULT;
        try {
            RESULT = (int) g_value_type_compatible.invokeExact(srcType.getValue(), destType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_value_type_transformable = Interop.downcallHandle(
        "g_value_type_transformable",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Check whether g_value_transform() is able to transform values
     * of type {@code src_type} into values of type {@code dest_type}. Note that for
     * the types to be transformable, they must be compatible or a
     * transformation function must be registered.
     */
    public static boolean valueTypeTransformable(@NotNull org.gtk.gobject.Type srcType, @NotNull org.gtk.gobject.Type destType) {
        int RESULT;
        try {
            RESULT = (int) g_value_type_transformable.invokeExact(srcType.getValue(), destType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
