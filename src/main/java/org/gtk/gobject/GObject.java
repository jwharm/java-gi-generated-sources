package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Constants and functions that are declared in the global GObject namespace.
 */
public final class GObject {
    
    static {
        System.loadLibrary("gobject-2.0");
    }
    
    @ApiStatus.Internal static void javagi$ensureInitialized() {}
    
    /**
     * Mask containing the bits of {@link ParamSpec}.flags which are reserved for GLib.
     */
    public static final int PARAM_MASK = 255;
    
    /**
     * {@link ParamFlags} value alias for {@link ParamFlags#STATIC_NAME} | {@link ParamFlags#STATIC_NICK} | {@link ParamFlags#STATIC_BLURB}.
     * <p>
     * It is recommended to use this for all properties by default, as it allows for
     * internal performance improvements in GObject.
     * <p>
     * It is very rare that a property would have a dynamically constructed name,
     * nickname or blurb.
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
    
    /**
     * Provide a copy of a boxed structure {@code src_boxed} which is of type {@code boxed_type}.
     * @param boxedType The type of {@code src_boxed}.
     * @param srcBoxed The boxed structure to be copied.
     * @return The newly created copy of the boxed
     *    structure.
     */
    public static @NotNull java.lang.foreign.MemoryAddress boxedCopy(@NotNull org.gtk.glib.Type boxedType, @NotNull java.lang.foreign.MemoryAddress srcBoxed) {
        java.util.Objects.requireNonNull(boxedType, "Parameter 'boxedType' must not be null");
        java.util.Objects.requireNonNull(srcBoxed, "Parameter 'srcBoxed' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_boxed_copy.invokeExact(
                    boxedType.getValue().longValue(),
                    (Addressable) srcBoxed);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Free the boxed structure {@code boxed} which is of type {@code boxed_type}.
     * @param boxedType The type of {@code boxed}.
     * @param boxed The boxed structure to be freed.
     */
    public static void boxedFree(@NotNull org.gtk.glib.Type boxedType, @NotNull java.lang.foreign.MemoryAddress boxed) {
        java.util.Objects.requireNonNull(boxedType, "Parameter 'boxedType' must not be null");
        java.util.Objects.requireNonNull(boxed, "Parameter 'boxed' must not be null");
        try {
            DowncallHandles.g_boxed_free.invokeExact(
                    boxedType.getValue().longValue(),
                    (Addressable) boxed);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This function creates a new {@code G_TYPE_BOXED} derived type id for a new
     * boxed type with name {@code name}.
     * <p>
     * Boxed type handling functions have to be provided to copy and free
     * opaque boxed structures of this type.
     * <p>
     * For the general case, it is recommended to use G_DEFINE_BOXED_TYPE()
     * instead of calling g_boxed_type_register_static() directly. The macro
     * will create the appropriate {@code *_get_type()} function for the boxed type.
     * @param name Name of the new boxed type.
     * @param boxedCopy Boxed structure copy function.
     * @param boxedFree Boxed structure free function.
     * @return New {@code G_TYPE_BOXED} derived type id for {@code name}.
     */
    public static @NotNull org.gtk.glib.Type boxedTypeRegisterStatic(@NotNull java.lang.String name, @NotNull org.gtk.gobject.BoxedCopyFunc boxedCopy, @NotNull org.gtk.gobject.BoxedFreeFunc boxedFree) {
        throw new UnsupportedOperationException("Operation not supported yet");
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
    public static void cclosureMarshalBOOLEANBOXEDBOXED(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_BOOLEAN__BOXED_BOXED.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) marshalData);
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
    public static void cclosureMarshalBOOLEANFLAGS(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_BOOLEAN__FLAGS.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) marshalData);
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
    public static void cclosureMarshalSTRINGOBJECTPOINTER(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_STRING__OBJECT_POINTER.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) marshalData);
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
    public static void cclosureMarshalVOIDBOOLEAN(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__BOOLEAN.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) marshalData);
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
    public static void cclosureMarshalVOIDBOXED(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__BOXED.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) marshalData);
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
    public static void cclosureMarshalVOIDCHAR(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__CHAR.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) marshalData);
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
    public static void cclosureMarshalVOIDDOUBLE(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__DOUBLE.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) marshalData);
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
    public static void cclosureMarshalVOIDENUM(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__ENUM.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) marshalData);
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
    public static void cclosureMarshalVOIDFLAGS(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__FLAGS.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) marshalData);
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
    public static void cclosureMarshalVOIDFLOAT(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__FLOAT.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) marshalData);
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
    public static void cclosureMarshalVOIDINT(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__INT.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) marshalData);
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
    public static void cclosureMarshalVOIDLONG(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__LONG.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) marshalData);
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
    public static void cclosureMarshalVOIDOBJECT(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__OBJECT.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) marshalData);
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
    public static void cclosureMarshalVOIDPARAM(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__PARAM.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) marshalData);
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
    public static void cclosureMarshalVOIDPOINTER(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__POINTER.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) marshalData);
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
    public static void cclosureMarshalVOIDSTRING(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__STRING.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) marshalData);
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
    public static void cclosureMarshalVOIDUCHAR(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__UCHAR.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) marshalData);
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
    public static void cclosureMarshalVOIDUINT(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__UINT.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) marshalData);
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
    public static void cclosureMarshalVOIDUINTPOINTER(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__UINT_POINTER.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) marshalData);
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
    public static void cclosureMarshalVOIDULONG(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__ULONG.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) marshalData);
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
    public static void cclosureMarshalVOIDVARIANT(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__VARIANT.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) marshalData);
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
    public static void cclosureMarshalVOIDVOID(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnValue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_VOID__VOID.invokeExact(
                    closure.handle(),
                    returnValue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) marshalData);
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
    public static void cclosureMarshalGeneric(@NotNull org.gtk.gobject.Closure closure, @NotNull org.gtk.gobject.Value returnGvalue, int nParamValues, @NotNull org.gtk.gobject.Value paramValues, @Nullable java.lang.foreign.MemoryAddress invocationHint, @Nullable java.lang.foreign.MemoryAddress marshalData) {
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        java.util.Objects.requireNonNull(returnGvalue, "Parameter 'returnGvalue' must not be null");
        java.util.Objects.requireNonNull(paramValues, "Parameter 'paramValues' must not be null");
        try {
            DowncallHandles.g_cclosure_marshal_generic.invokeExact(
                    closure.handle(),
                    returnGvalue.handle(),
                    nParamValues,
                    paramValues.handle(),
                    (Addressable) (invocationHint == null ? MemoryAddress.NULL : (Addressable) invocationHint),
                    (Addressable) marshalData);
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
    public static @NotNull org.gtk.gobject.Closure cclosureNew(@Nullable org.gtk.gobject.Callback callbackFunc, @NotNull org.gtk.gobject.ClosureNotify destroyData) {
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
    public static @NotNull org.gtk.gobject.Closure cclosureNewObject(@NotNull org.gtk.gobject.Callback callbackFunc, @NotNull org.gtk.gobject.Object object) {
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
    public static @NotNull org.gtk.gobject.Closure cclosureNewObjectSwap(@NotNull org.gtk.gobject.Callback callbackFunc, @NotNull org.gtk.gobject.Object object) {
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
    public static @NotNull org.gtk.gobject.Closure cclosureNewSwap(@Nullable org.gtk.gobject.Callback callbackFunc, @NotNull org.gtk.gobject.ClosureNotify destroyData) {
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
     * @param objectPtr a pointer to a {@link Object} reference
     */
    public static void clearObject(@NotNull PointerProxy<org.gtk.gobject.Object> objectPtr) {
        java.util.Objects.requireNonNull(objectPtr, "Parameter 'objectPtr' must not be null");
        try {
            DowncallHandles.g_clear_object.invokeExact(
                    objectPtr.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Disconnects a handler from {@code instance} so it will not be called during
     * any future or currently ongoing emissions of the signal it has been
     * connected to. The {@code handler_id_ptr} is then set to zero, which is never a valid handler ID value (see g_signal_connect()).
     * <p>
     * If the handler ID is 0 then this function does nothing.
     * <p>
     * There is also a macro version of this function so that the code
     * will be inlined.
     * @param handlerIdPtr A pointer to a handler ID (of type {@code gulong}) of the handler to be disconnected.
     * @param instance The instance to remove the signal handler from.
     *   This pointer may be {@code null} or invalid, if the handler ID is zero.
     */
    public static void clearSignalHandler(PointerLong handlerIdPtr, @NotNull org.gtk.gobject.Object instance) {
        java.util.Objects.requireNonNull(handlerIdPtr, "Parameter 'handlerIdPtr' must not be null");
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        try {
            DowncallHandles.g_clear_signal_handler.invokeExact(
                    handlerIdPtr.handle(),
                    instance.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This function is meant to be called from the {@code complete_type_info}
     * function of a {@link TypePlugin} implementation, as in the following
     * example:
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
     * @param gEnumType the type identifier of the type being completed
     * @param info the {@link TypeInfo} struct to be filled in
     * @param constValues An array of {@link EnumValue} structs for the possible
     *  enumeration values. The array is terminated by a struct with all
     *  members being 0.
     */
    public static void enumCompleteTypeInfo(@NotNull org.gtk.glib.Type gEnumType, @NotNull org.gtk.gobject.TypeInfo info, @NotNull org.gtk.gobject.EnumValue constValues) {
        java.util.Objects.requireNonNull(gEnumType, "Parameter 'gEnumType' must not be null");
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        java.util.Objects.requireNonNull(constValues, "Parameter 'constValues' must not be null");
        try {
            DowncallHandles.g_enum_complete_type_info.invokeExact(
                    gEnumType.getValue().longValue(),
                    info.handle(),
                    constValues.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        info.yieldOwnership();
    }
    
    /**
     * Returns the {@link EnumValue} for a value.
     * @param enumClass a {@link EnumClass}
     * @param value the value to look up
     * @return the {@link EnumValue} for {@code value}, or {@code null}
     *          if {@code value} is not a member of the enumeration
     */
    public static @Nullable org.gtk.gobject.EnumValue enumGetValue(@NotNull org.gtk.gobject.EnumClass enumClass, int value) {
        java.util.Objects.requireNonNull(enumClass, "Parameter 'enumClass' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_enum_get_value.invokeExact(
                    enumClass.handle(),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.EnumValue(RESULT, Ownership.NONE);
    }
    
    /**
     * Looks up a {@link EnumValue} by name.
     * @param enumClass a {@link EnumClass}
     * @param name the name to look up
     * @return the {@link EnumValue} with name {@code name},
     *          or {@code null} if the enumeration doesn't have a member
     *          with that name
     */
    public static @Nullable org.gtk.gobject.EnumValue enumGetValueByName(@NotNull org.gtk.gobject.EnumClass enumClass, @NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(enumClass, "Parameter 'enumClass' must not be null");
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_enum_get_value_by_name.invokeExact(
                    enumClass.handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.EnumValue(RESULT, Ownership.NONE);
    }
    
    /**
     * Looks up a {@link EnumValue} by nickname.
     * @param enumClass a {@link EnumClass}
     * @param nick the nickname to look up
     * @return the {@link EnumValue} with nickname {@code nick},
     *          or {@code null} if the enumeration doesn't have a member
     *          with that nickname
     */
    public static @Nullable org.gtk.gobject.EnumValue enumGetValueByNick(@NotNull org.gtk.gobject.EnumClass enumClass, @NotNull java.lang.String nick) {
        java.util.Objects.requireNonNull(enumClass, "Parameter 'enumClass' must not be null");
        java.util.Objects.requireNonNull(nick, "Parameter 'nick' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_enum_get_value_by_nick.invokeExact(
                    enumClass.handle(),
                    Interop.allocateNativeString(nick));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.EnumValue(RESULT, Ownership.NONE);
    }
    
    /**
     * Registers a new static enumeration type with the name {@code name}.
     * <p>
     * It is normally more convenient to let [glib-mkenums][glib-mkenums],
     * generate a my_enum_get_type() function from a usual C enumeration
     * definition  than to write one yourself using g_enum_register_static().
     * @param name A nul-terminated string used as the name of the new type.
     * @param constStaticValues An array of {@link EnumValue} structs for the possible
     *  enumeration values. The array is terminated by a struct with all
     *  members being 0. GObject keeps a reference to the data, so it cannot
     *  be stack-allocated.
     * @return The new type identifier.
     */
    public static @NotNull org.gtk.glib.Type enumRegisterStatic(@NotNull java.lang.String name, @NotNull org.gtk.gobject.EnumValue constStaticValues) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(constStaticValues, "Parameter 'constStaticValues' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_enum_register_static.invokeExact(
                    Interop.allocateNativeString(name),
                    constStaticValues.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Pretty-prints {@code value} in the form of the enum’s name.
     * <p>
     * This is intended to be used for debugging purposes. The format of the output
     * may change in the future.
     * @param gEnumType the type identifier of a {@link EnumClass} type
     * @param value the value
     * @return a newly-allocated text string
     */
    public static @NotNull java.lang.String enumToString(@NotNull org.gtk.glib.Type gEnumType, int value) {
        java.util.Objects.requireNonNull(gEnumType, "Parameter 'gEnumType' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_enum_to_string.invokeExact(
                    gEnumType.getValue().longValue(),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * This function is meant to be called from the complete_type_info()
     * function of a {@link TypePlugin} implementation, see the example for
     * g_enum_complete_type_info() above.
     * @param gFlagsType the type identifier of the type being completed
     * @param info the {@link TypeInfo} struct to be filled in
     * @param constValues An array of {@link FlagsValue} structs for the possible
     *  enumeration values. The array is terminated by a struct with all
     *  members being 0.
     */
    public static void flagsCompleteTypeInfo(@NotNull org.gtk.glib.Type gFlagsType, @NotNull org.gtk.gobject.TypeInfo info, @NotNull org.gtk.gobject.FlagsValue constValues) {
        java.util.Objects.requireNonNull(gFlagsType, "Parameter 'gFlagsType' must not be null");
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        java.util.Objects.requireNonNull(constValues, "Parameter 'constValues' must not be null");
        try {
            DowncallHandles.g_flags_complete_type_info.invokeExact(
                    gFlagsType.getValue().longValue(),
                    info.handle(),
                    constValues.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        info.yieldOwnership();
    }
    
    /**
     * Returns the first {@link FlagsValue} which is set in {@code value}.
     * @param flagsClass a {@link FlagsClass}
     * @param value the value
     * @return the first {@link FlagsValue} which is set in
     *          {@code value}, or {@code null} if none is set
     */
    public static @Nullable org.gtk.gobject.FlagsValue flagsGetFirstValue(@NotNull org.gtk.gobject.FlagsClass flagsClass, int value) {
        java.util.Objects.requireNonNull(flagsClass, "Parameter 'flagsClass' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_flags_get_first_value.invokeExact(
                    flagsClass.handle(),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.FlagsValue(RESULT, Ownership.NONE);
    }
    
    /**
     * Looks up a {@link FlagsValue} by name.
     * @param flagsClass a {@link FlagsClass}
     * @param name the name to look up
     * @return the {@link FlagsValue} with name {@code name},
     *          or {@code null} if there is no flag with that name
     */
    public static @Nullable org.gtk.gobject.FlagsValue flagsGetValueByName(@NotNull org.gtk.gobject.FlagsClass flagsClass, @NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(flagsClass, "Parameter 'flagsClass' must not be null");
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_flags_get_value_by_name.invokeExact(
                    flagsClass.handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.FlagsValue(RESULT, Ownership.NONE);
    }
    
    /**
     * Looks up a {@link FlagsValue} by nickname.
     * @param flagsClass a {@link FlagsClass}
     * @param nick the nickname to look up
     * @return the {@link FlagsValue} with nickname {@code nick},
     *          or {@code null} if there is no flag with that nickname
     */
    public static @Nullable org.gtk.gobject.FlagsValue flagsGetValueByNick(@NotNull org.gtk.gobject.FlagsClass flagsClass, @NotNull java.lang.String nick) {
        java.util.Objects.requireNonNull(flagsClass, "Parameter 'flagsClass' must not be null");
        java.util.Objects.requireNonNull(nick, "Parameter 'nick' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_flags_get_value_by_nick.invokeExact(
                    flagsClass.handle(),
                    Interop.allocateNativeString(nick));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.FlagsValue(RESULT, Ownership.NONE);
    }
    
    /**
     * Registers a new static flags type with the name {@code name}.
     * <p>
     * It is normally more convenient to let [glib-mkenums][glib-mkenums]
     * generate a my_flags_get_type() function from a usual C enumeration
     * definition than to write one yourself using g_flags_register_static().
     * @param name A nul-terminated string used as the name of the new type.
     * @param constStaticValues An array of {@link FlagsValue} structs for the possible
     *  flags values. The array is terminated by a struct with all members being 0.
     *  GObject keeps a reference to the data, so it cannot be stack-allocated.
     * @return The new type identifier.
     */
    public static @NotNull org.gtk.glib.Type flagsRegisterStatic(@NotNull java.lang.String name, @NotNull org.gtk.gobject.FlagsValue constStaticValues) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(constStaticValues, "Parameter 'constStaticValues' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_flags_register_static.invokeExact(
                    Interop.allocateNativeString(name),
                    constStaticValues.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Pretty-prints {@code value} in the form of the flag names separated by {@code  | } and
     * sorted. Any extra bits will be shown at the end as a hexadecimal number.
     * <p>
     * This is intended to be used for debugging purposes. The format of the output
     * may change in the future.
     * @param flagsType the type identifier of a {@link FlagsClass} type
     * @param value the value
     * @return a newly-allocated text string
     */
    public static @NotNull java.lang.String flagsToString(@NotNull org.gtk.glib.Type flagsType, int value) {
        java.util.Objects.requireNonNull(flagsType, "Parameter 'flagsType' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_flags_to_string.invokeExact(
                    flagsType.getValue().longValue(),
                    value);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    public static @NotNull org.gtk.glib.Type gtypeGetType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_gtype_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Creates a new {@link ParamSpecBoolean} instance specifying a {@code G_TYPE_BOOLEAN}
     * property. In many cases, it may be more appropriate to use an enum with
     * g_param_spec_enum(), both to improve code clarity by using explicitly named
     * values, and to allow for more values to be added in future without breaking
     * API.
     * <p>
     * See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param defaultValue default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public static @NotNull org.gtk.gobject.ParamSpec paramSpecBoolean(@NotNull java.lang.String name, @Nullable java.lang.String nick, @Nullable java.lang.String blurb, boolean defaultValue, @NotNull org.gtk.gobject.ParamFlags flags) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_boolean.invokeExact(
                    Interop.allocateNativeString(name),
                    (Addressable) (nick == null ? MemoryAddress.NULL : Interop.allocateNativeString(nick)),
                    (Addressable) (blurb == null ? MemoryAddress.NULL : Interop.allocateNativeString(blurb)),
                    defaultValue ? 1 : 0,
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link ParamSpecBoxed} instance specifying a {@code G_TYPE_BOXED}
     * derived property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param boxedType {@code G_TYPE_BOXED} derived type of this property
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public static @NotNull org.gtk.gobject.ParamSpec paramSpecBoxed(@NotNull java.lang.String name, @Nullable java.lang.String nick, @Nullable java.lang.String blurb, @NotNull org.gtk.glib.Type boxedType, @NotNull org.gtk.gobject.ParamFlags flags) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(boxedType, "Parameter 'boxedType' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_boxed.invokeExact(
                    Interop.allocateNativeString(name),
                    (Addressable) (nick == null ? MemoryAddress.NULL : Interop.allocateNativeString(nick)),
                    (Addressable) (blurb == null ? MemoryAddress.NULL : Interop.allocateNativeString(blurb)),
                    boxedType.getValue().longValue(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link ParamSpecChar} instance specifying a {@code G_TYPE_CHAR} property.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param minimum minimum value for the property specified
     * @param maximum maximum value for the property specified
     * @param defaultValue default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public static @NotNull org.gtk.gobject.ParamSpec paramSpecChar(@NotNull java.lang.String name, @Nullable java.lang.String nick, @Nullable java.lang.String blurb, byte minimum, byte maximum, byte defaultValue, @NotNull org.gtk.gobject.ParamFlags flags) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_char.invokeExact(
                    Interop.allocateNativeString(name),
                    (Addressable) (nick == null ? MemoryAddress.NULL : Interop.allocateNativeString(nick)),
                    (Addressable) (blurb == null ? MemoryAddress.NULL : Interop.allocateNativeString(blurb)),
                    minimum,
                    maximum,
                    defaultValue,
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link ParamSpecDouble} instance specifying a {@code G_TYPE_DOUBLE}
     * property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param minimum minimum value for the property specified
     * @param maximum maximum value for the property specified
     * @param defaultValue default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public static @NotNull org.gtk.gobject.ParamSpec paramSpecDouble(@NotNull java.lang.String name, @Nullable java.lang.String nick, @Nullable java.lang.String blurb, double minimum, double maximum, double defaultValue, @NotNull org.gtk.gobject.ParamFlags flags) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_double.invokeExact(
                    Interop.allocateNativeString(name),
                    (Addressable) (nick == null ? MemoryAddress.NULL : Interop.allocateNativeString(nick)),
                    (Addressable) (blurb == null ? MemoryAddress.NULL : Interop.allocateNativeString(blurb)),
                    minimum,
                    maximum,
                    defaultValue,
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link ParamSpecEnum} instance specifying a {@code G_TYPE_ENUM}
     * property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param enumType a {@link Type} derived from {@code G_TYPE_ENUM}
     * @param defaultValue default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public static @NotNull org.gtk.gobject.ParamSpec paramSpecEnum(@NotNull java.lang.String name, @Nullable java.lang.String nick, @Nullable java.lang.String blurb, @NotNull org.gtk.glib.Type enumType, int defaultValue, @NotNull org.gtk.gobject.ParamFlags flags) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(enumType, "Parameter 'enumType' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_enum.invokeExact(
                    Interop.allocateNativeString(name),
                    (Addressable) (nick == null ? MemoryAddress.NULL : Interop.allocateNativeString(nick)),
                    (Addressable) (blurb == null ? MemoryAddress.NULL : Interop.allocateNativeString(blurb)),
                    enumType.getValue().longValue(),
                    defaultValue,
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link ParamSpecFlags} instance specifying a {@code G_TYPE_FLAGS}
     * property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param flagsType a {@link Type} derived from {@code G_TYPE_FLAGS}
     * @param defaultValue default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public static @NotNull org.gtk.gobject.ParamSpec paramSpecFlags(@NotNull java.lang.String name, @Nullable java.lang.String nick, @Nullable java.lang.String blurb, @NotNull org.gtk.glib.Type flagsType, int defaultValue, @NotNull org.gtk.gobject.ParamFlags flags) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(flagsType, "Parameter 'flagsType' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_flags.invokeExact(
                    Interop.allocateNativeString(name),
                    (Addressable) (nick == null ? MemoryAddress.NULL : Interop.allocateNativeString(nick)),
                    (Addressable) (blurb == null ? MemoryAddress.NULL : Interop.allocateNativeString(blurb)),
                    flagsType.getValue().longValue(),
                    defaultValue,
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link ParamSpecFloat} instance specifying a {@code G_TYPE_FLOAT} property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param minimum minimum value for the property specified
     * @param maximum maximum value for the property specified
     * @param defaultValue default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public static @NotNull org.gtk.gobject.ParamSpec paramSpecFloat(@NotNull java.lang.String name, @Nullable java.lang.String nick, @Nullable java.lang.String blurb, float minimum, float maximum, float defaultValue, @NotNull org.gtk.gobject.ParamFlags flags) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_float.invokeExact(
                    Interop.allocateNativeString(name),
                    (Addressable) (nick == null ? MemoryAddress.NULL : Interop.allocateNativeString(nick)),
                    (Addressable) (blurb == null ? MemoryAddress.NULL : Interop.allocateNativeString(blurb)),
                    minimum,
                    maximum,
                    defaultValue,
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link ParamSpecGType} instance specifying a
     * {@code G_TYPE_GTYPE} property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param isAType a {@link Type} whose subtypes are allowed as values
     *  of the property (use {@code G_TYPE_NONE} for any type)
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public static @NotNull org.gtk.gobject.ParamSpec paramSpecGtype(@NotNull java.lang.String name, @Nullable java.lang.String nick, @Nullable java.lang.String blurb, @NotNull org.gtk.glib.Type isAType, @NotNull org.gtk.gobject.ParamFlags flags) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(isAType, "Parameter 'isAType' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_gtype.invokeExact(
                    Interop.allocateNativeString(name),
                    (Addressable) (nick == null ? MemoryAddress.NULL : Interop.allocateNativeString(nick)),
                    (Addressable) (blurb == null ? MemoryAddress.NULL : Interop.allocateNativeString(blurb)),
                    isAType.getValue().longValue(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link ParamSpecInt} instance specifying a {@code G_TYPE_INT} property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param minimum minimum value for the property specified
     * @param maximum maximum value for the property specified
     * @param defaultValue default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public static @NotNull org.gtk.gobject.ParamSpec paramSpecInt(@NotNull java.lang.String name, @Nullable java.lang.String nick, @Nullable java.lang.String blurb, int minimum, int maximum, int defaultValue, @NotNull org.gtk.gobject.ParamFlags flags) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_int.invokeExact(
                    Interop.allocateNativeString(name),
                    (Addressable) (nick == null ? MemoryAddress.NULL : Interop.allocateNativeString(nick)),
                    (Addressable) (blurb == null ? MemoryAddress.NULL : Interop.allocateNativeString(blurb)),
                    minimum,
                    maximum,
                    defaultValue,
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link ParamSpecInt64} instance specifying a {@code G_TYPE_INT64} property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param minimum minimum value for the property specified
     * @param maximum maximum value for the property specified
     * @param defaultValue default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public static @NotNull org.gtk.gobject.ParamSpec paramSpecInt64(@NotNull java.lang.String name, @Nullable java.lang.String nick, @Nullable java.lang.String blurb, long minimum, long maximum, long defaultValue, @NotNull org.gtk.gobject.ParamFlags flags) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_int64.invokeExact(
                    Interop.allocateNativeString(name),
                    (Addressable) (nick == null ? MemoryAddress.NULL : Interop.allocateNativeString(nick)),
                    (Addressable) (blurb == null ? MemoryAddress.NULL : Interop.allocateNativeString(blurb)),
                    minimum,
                    maximum,
                    defaultValue,
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link ParamSpecLong} instance specifying a {@code G_TYPE_LONG} property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param minimum minimum value for the property specified
     * @param maximum maximum value for the property specified
     * @param defaultValue default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public static @NotNull org.gtk.gobject.ParamSpec paramSpecLong(@NotNull java.lang.String name, @Nullable java.lang.String nick, @Nullable java.lang.String blurb, long minimum, long maximum, long defaultValue, @NotNull org.gtk.gobject.ParamFlags flags) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_long.invokeExact(
                    Interop.allocateNativeString(name),
                    (Addressable) (nick == null ? MemoryAddress.NULL : Interop.allocateNativeString(nick)),
                    (Addressable) (blurb == null ? MemoryAddress.NULL : Interop.allocateNativeString(blurb)),
                    minimum,
                    maximum,
                    defaultValue,
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link ParamSpecBoxed} instance specifying a {@code G_TYPE_OBJECT}
     * derived property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param objectType {@code G_TYPE_OBJECT} derived type of this property
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public static @NotNull org.gtk.gobject.ParamSpec paramSpecObject(@NotNull java.lang.String name, @Nullable java.lang.String nick, @Nullable java.lang.String blurb, @NotNull org.gtk.glib.Type objectType, @NotNull org.gtk.gobject.ParamFlags flags) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(objectType, "Parameter 'objectType' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_object.invokeExact(
                    Interop.allocateNativeString(name),
                    (Addressable) (nick == null ? MemoryAddress.NULL : Interop.allocateNativeString(nick)),
                    (Addressable) (blurb == null ? MemoryAddress.NULL : Interop.allocateNativeString(blurb)),
                    objectType.getValue().longValue(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new property of type {@link ParamSpecOverride}. This is used
     * to direct operations to another paramspec, and will not be directly
     * useful unless you are implementing a new base type similar to GObject.
     * @param name the name of the property.
     * @param overridden The property that is being overridden
     * @return the newly created {@link ParamSpec}
     */
    public static @NotNull org.gtk.gobject.ParamSpec paramSpecOverride(@NotNull java.lang.String name, @NotNull org.gtk.gobject.ParamSpec overridden) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(overridden, "Parameter 'overridden' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_override.invokeExact(
                    Interop.allocateNativeString(name),
                    overridden.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Creates a new {@link ParamSpecParam} instance specifying a {@code G_TYPE_PARAM}
     * property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param paramType a {@link Type} derived from {@code G_TYPE_PARAM}
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public static @NotNull org.gtk.gobject.ParamSpec paramSpecParam(@NotNull java.lang.String name, @Nullable java.lang.String nick, @Nullable java.lang.String blurb, @NotNull org.gtk.glib.Type paramType, @NotNull org.gtk.gobject.ParamFlags flags) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(paramType, "Parameter 'paramType' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_param.invokeExact(
                    Interop.allocateNativeString(name),
                    (Addressable) (nick == null ? MemoryAddress.NULL : Interop.allocateNativeString(nick)),
                    (Addressable) (blurb == null ? MemoryAddress.NULL : Interop.allocateNativeString(blurb)),
                    paramType.getValue().longValue(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link ParamSpecPointer} instance specifying a pointer property.
     * Where possible, it is better to use g_param_spec_object() or
     * g_param_spec_boxed() to expose memory management information.
     * <p>
     * See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public static @NotNull org.gtk.gobject.ParamSpec paramSpecPointer(@NotNull java.lang.String name, @Nullable java.lang.String nick, @Nullable java.lang.String blurb, @NotNull org.gtk.gobject.ParamFlags flags) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_pointer.invokeExact(
                    Interop.allocateNativeString(name),
                    (Addressable) (nick == null ? MemoryAddress.NULL : Interop.allocateNativeString(nick)),
                    (Addressable) (blurb == null ? MemoryAddress.NULL : Interop.allocateNativeString(blurb)),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link ParamSpecString} instance.
     * <p>
     * See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param defaultValue default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public static @NotNull org.gtk.gobject.ParamSpec paramSpecString(@NotNull java.lang.String name, @Nullable java.lang.String nick, @Nullable java.lang.String blurb, @Nullable java.lang.String defaultValue, @NotNull org.gtk.gobject.ParamFlags flags) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_string.invokeExact(
                    Interop.allocateNativeString(name),
                    (Addressable) (nick == null ? MemoryAddress.NULL : Interop.allocateNativeString(nick)),
                    (Addressable) (blurb == null ? MemoryAddress.NULL : Interop.allocateNativeString(blurb)),
                    (Addressable) (defaultValue == null ? MemoryAddress.NULL : Interop.allocateNativeString(defaultValue)),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link ParamSpecUChar} instance specifying a {@code G_TYPE_UCHAR} property.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param minimum minimum value for the property specified
     * @param maximum maximum value for the property specified
     * @param defaultValue default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public static @NotNull org.gtk.gobject.ParamSpec paramSpecUchar(@NotNull java.lang.String name, @Nullable java.lang.String nick, @Nullable java.lang.String blurb, byte minimum, byte maximum, byte defaultValue, @NotNull org.gtk.gobject.ParamFlags flags) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_uchar.invokeExact(
                    Interop.allocateNativeString(name),
                    (Addressable) (nick == null ? MemoryAddress.NULL : Interop.allocateNativeString(nick)),
                    (Addressable) (blurb == null ? MemoryAddress.NULL : Interop.allocateNativeString(blurb)),
                    minimum,
                    maximum,
                    defaultValue,
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link ParamSpecUInt} instance specifying a {@code G_TYPE_UINT} property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param minimum minimum value for the property specified
     * @param maximum maximum value for the property specified
     * @param defaultValue default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public static @NotNull org.gtk.gobject.ParamSpec paramSpecUint(@NotNull java.lang.String name, @Nullable java.lang.String nick, @Nullable java.lang.String blurb, int minimum, int maximum, int defaultValue, @NotNull org.gtk.gobject.ParamFlags flags) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_uint.invokeExact(
                    Interop.allocateNativeString(name),
                    (Addressable) (nick == null ? MemoryAddress.NULL : Interop.allocateNativeString(nick)),
                    (Addressable) (blurb == null ? MemoryAddress.NULL : Interop.allocateNativeString(blurb)),
                    minimum,
                    maximum,
                    defaultValue,
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link ParamSpecUInt64} instance specifying a {@code G_TYPE_UINT64}
     * property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param minimum minimum value for the property specified
     * @param maximum maximum value for the property specified
     * @param defaultValue default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public static @NotNull org.gtk.gobject.ParamSpec paramSpecUint64(@NotNull java.lang.String name, @Nullable java.lang.String nick, @Nullable java.lang.String blurb, long minimum, long maximum, long defaultValue, @NotNull org.gtk.gobject.ParamFlags flags) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_uint64.invokeExact(
                    Interop.allocateNativeString(name),
                    (Addressable) (nick == null ? MemoryAddress.NULL : Interop.allocateNativeString(nick)),
                    (Addressable) (blurb == null ? MemoryAddress.NULL : Interop.allocateNativeString(blurb)),
                    minimum,
                    maximum,
                    defaultValue,
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link ParamSpecULong} instance specifying a {@code G_TYPE_ULONG}
     * property.
     * <p>
     * See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param minimum minimum value for the property specified
     * @param maximum maximum value for the property specified
     * @param defaultValue default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public static @NotNull org.gtk.gobject.ParamSpec paramSpecUlong(@NotNull java.lang.String name, @Nullable java.lang.String nick, @Nullable java.lang.String blurb, long minimum, long maximum, long defaultValue, @NotNull org.gtk.gobject.ParamFlags flags) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_ulong.invokeExact(
                    Interop.allocateNativeString(name),
                    (Addressable) (nick == null ? MemoryAddress.NULL : Interop.allocateNativeString(nick)),
                    (Addressable) (blurb == null ? MemoryAddress.NULL : Interop.allocateNativeString(blurb)),
                    minimum,
                    maximum,
                    defaultValue,
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link ParamSpecUnichar} instance specifying a {@code G_TYPE_UINT}
     * property. {@link Value} structures for this property can be accessed with
     * g_value_set_uint() and g_value_get_uint().
     * <p>
     * See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param defaultValue default value for the property specified
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public static @NotNull org.gtk.gobject.ParamSpec paramSpecUnichar(@NotNull java.lang.String name, @Nullable java.lang.String nick, @Nullable java.lang.String blurb, int defaultValue, @NotNull org.gtk.gobject.ParamFlags flags) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_unichar.invokeExact(
                    Interop.allocateNativeString(name),
                    (Addressable) (nick == null ? MemoryAddress.NULL : Interop.allocateNativeString(nick)),
                    (Addressable) (blurb == null ? MemoryAddress.NULL : Interop.allocateNativeString(blurb)),
                    defaultValue,
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.FULL);
    }
    
    /**
     * Creates a new {@link ParamSpecValueArray} instance specifying a
     * {@code G_TYPE_VALUE_ARRAY} property. {@code G_TYPE_VALUE_ARRAY} is a
     * {@code G_TYPE_BOXED} type, as such, {@link Value} structures for this property
     * can be accessed with g_value_set_boxed() and g_value_get_boxed().
     * <p>
     * See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param elementSpec a {@link ParamSpec} describing the elements contained in
     *  arrays of this property, may be {@code null}
     * @param flags flags for the property specified
     * @return a newly created parameter specification
     */
    public static @NotNull org.gtk.gobject.ParamSpec paramSpecValueArray(@NotNull java.lang.String name, @Nullable java.lang.String nick, @Nullable java.lang.String blurb, @NotNull org.gtk.gobject.ParamSpec elementSpec, @NotNull org.gtk.gobject.ParamFlags flags) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(elementSpec, "Parameter 'elementSpec' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_value_array.invokeExact(
                    Interop.allocateNativeString(name),
                    (Addressable) (nick == null ? MemoryAddress.NULL : Interop.allocateNativeString(nick)),
                    (Addressable) (blurb == null ? MemoryAddress.NULL : Interop.allocateNativeString(blurb)),
                    elementSpec.handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Creates a new {@link ParamSpecVariant} instance specifying a {@link org.gtk.glib.Variant}
     * property.
     * <p>
     * If {@code default_value} is floating, it is consumed.
     * <p>
     * See g_param_spec_internal() for details on property names.
     * @param name canonical name of the property specified
     * @param nick nick name for the property specified
     * @param blurb description of the property specified
     * @param type a {@link org.gtk.glib.VariantType}
     * @param defaultValue a {@link org.gtk.glib.Variant} of type {@code type} to
     *                 use as the default value, or {@code null}
     * @param flags flags for the property specified
     * @return the newly created {@link ParamSpec}
     */
    public static @NotNull org.gtk.gobject.ParamSpec paramSpecVariant(@NotNull java.lang.String name, @Nullable java.lang.String nick, @Nullable java.lang.String blurb, @NotNull org.gtk.glib.VariantType type, @Nullable org.gtk.glib.Variant defaultValue, @NotNull org.gtk.gobject.ParamFlags flags) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_param_spec_variant.invokeExact(
                    Interop.allocateNativeString(name),
                    (Addressable) (nick == null ? MemoryAddress.NULL : Interop.allocateNativeString(nick)),
                    (Addressable) (blurb == null ? MemoryAddress.NULL : Interop.allocateNativeString(blurb)),
                    type.handle(),
                    (Addressable) (defaultValue == null ? MemoryAddress.NULL : defaultValue.handle()),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        defaultValue.yieldOwnership();
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.FULL);
    }
    
    /**
     * Registers {@code name} as the name of a new static type derived
     * from {@code G_TYPE_PARAM}.
     * <p>
     * The type system uses the information contained in the {@link ParamSpecTypeInfo}
     * structure pointed to by {@code info} to manage the {@link ParamSpec} type and its
     * instances.
     * @param name 0-terminated string used as the name of the new {@link ParamSpec} type.
     * @param pspecInfo The {@link ParamSpecTypeInfo} for this {@link ParamSpec} type.
     * @return The new type identifier.
     */
    public static @NotNull org.gtk.glib.Type paramTypeRegisterStatic(@NotNull java.lang.String name, @NotNull org.gtk.gobject.ParamSpecTypeInfo pspecInfo) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(pspecInfo, "Parameter 'pspecInfo' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_param_type_register_static.invokeExact(
                    Interop.allocateNativeString(name),
                    pspecInfo.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Transforms {@code src_value} into {@code dest_value} if possible, and then
     * validates {@code dest_value}, in order for it to conform to {@code pspec}.  If
     * {@code strict_validation} is {@code true} this function will only succeed if the
     * transformed {@code dest_value} complied to {@code pspec} without modifications.
     * <p>
     * See also g_value_type_transformable(), g_value_transform() and
     * g_param_value_validate().
     * @param pspec a valid {@link ParamSpec}
     * @param srcValue source {@link Value}
     * @param destValue destination {@link Value} of correct type for {@code pspec}
     * @param strictValidation {@code true} requires {@code dest_value} to conform to {@code pspec}
     * without modifications
     * @return {@code true} if transformation and validation were successful,
     *  {@code false} otherwise and {@code dest_value} is left untouched.
     */
    public static boolean paramValueConvert(@NotNull org.gtk.gobject.ParamSpec pspec, @NotNull org.gtk.gobject.Value srcValue, @NotNull org.gtk.gobject.Value destValue, boolean strictValidation) {
        java.util.Objects.requireNonNull(pspec, "Parameter 'pspec' must not be null");
        java.util.Objects.requireNonNull(srcValue, "Parameter 'srcValue' must not be null");
        java.util.Objects.requireNonNull(destValue, "Parameter 'destValue' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_param_value_convert.invokeExact(
                    pspec.handle(),
                    srcValue.handle(),
                    destValue.handle(),
                    strictValidation ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks whether {@code value} contains the default value as specified in {@code pspec}.
     * @param pspec a valid {@link ParamSpec}
     * @param value a {@link Value} of correct type for {@code pspec}
     * @return whether {@code value} contains the canonical default for this {@code pspec}
     */
    public static boolean paramValueDefaults(@NotNull org.gtk.gobject.ParamSpec pspec, @NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(pspec, "Parameter 'pspec' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_param_value_defaults.invokeExact(
                    pspec.handle(),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Return whether the contents of {@code value} comply with the specifications
     * set out by {@code pspec}.
     * @param pspec a valid {@link ParamSpec}
     * @param value a {@link Value} of correct type for {@code pspec}
     * @return whether the contents of {@code value} comply with the specifications
     *   set out by {@code pspec}.
     */
    public static boolean paramValueIsValid(@NotNull org.gtk.gobject.ParamSpec pspec, @NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(pspec, "Parameter 'pspec' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_param_value_is_valid.invokeExact(
                    pspec.handle(),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Sets {@code value} to its default value as specified in {@code pspec}.
     * @param pspec a valid {@link ParamSpec}
     * @param value a {@link Value} of correct type for {@code pspec}; since 2.64, you
     *   can also pass an empty {@link Value}, initialized with {@code G_VALUE_INIT}
     */
    public static void paramValueSetDefault(@NotNull org.gtk.gobject.ParamSpec pspec, @NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(pspec, "Parameter 'pspec' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.g_param_value_set_default.invokeExact(
                    pspec.handle(),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Ensures that the contents of {@code value} comply with the specifications
     * set out by {@code pspec}. For example, a {@link ParamSpecInt} might require
     * that integers stored in {@code value} may not be smaller than -42 and not be
     * greater than +42. If {@code value} contains an integer outside of this range,
     * it is modified accordingly, so the resulting value will fit into the
     * range -42 .. +42.
     * @param pspec a valid {@link ParamSpec}
     * @param value a {@link Value} of correct type for {@code pspec}
     * @return whether modifying {@code value} was necessary to ensure validity
     */
    public static boolean paramValueValidate(@NotNull org.gtk.gobject.ParamSpec pspec, @NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(pspec, "Parameter 'pspec' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_param_value_validate.invokeExact(
                    pspec.handle(),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Compares {@code value1} with {@code value2} according to {@code pspec}, and return -1, 0 or +1,
     * if {@code value1} is found to be less than, equal to or greater than {@code value2},
     * respectively.
     * @param pspec a valid {@link ParamSpec}
     * @param value1 a {@link Value} of correct type for {@code pspec}
     * @param value2 a {@link Value} of correct type for {@code pspec}
     * @return -1, 0 or +1, for a less than, equal to or greater than result
     */
    public static int paramValuesCmp(@NotNull org.gtk.gobject.ParamSpec pspec, @NotNull org.gtk.gobject.Value value1, @NotNull org.gtk.gobject.Value value2) {
        java.util.Objects.requireNonNull(pspec, "Parameter 'pspec' must not be null");
        java.util.Objects.requireNonNull(value1, "Parameter 'value1' must not be null");
        java.util.Objects.requireNonNull(value2, "Parameter 'value2' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_param_values_cmp.invokeExact(
                    pspec.handle(),
                    value1.handle(),
                    value2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code G_TYPE_POINTER} derived type id for a new
     * pointer type with name {@code name}.
     * @param name the name of the new pointer type.
     * @return a new {@code G_TYPE_POINTER} derived type id for {@code name}.
     */
    public static @NotNull org.gtk.glib.Type pointerTypeRegisterStatic(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_pointer_type_register_static.invokeExact(
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
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
     * @param ihint standard {@link SignalAccumulator} parameter
     * @param returnAccu standard {@link SignalAccumulator} parameter
     * @param handlerReturn standard {@link SignalAccumulator} parameter
     * @param dummy standard {@link SignalAccumulator} parameter
     * @return standard {@link SignalAccumulator} result
     */
    public static boolean signalAccumulatorFirstWins(@NotNull org.gtk.gobject.SignalInvocationHint ihint, @NotNull org.gtk.gobject.Value returnAccu, @NotNull org.gtk.gobject.Value handlerReturn, @Nullable java.lang.foreign.MemoryAddress dummy) {
        java.util.Objects.requireNonNull(ihint, "Parameter 'ihint' must not be null");
        java.util.Objects.requireNonNull(returnAccu, "Parameter 'returnAccu' must not be null");
        java.util.Objects.requireNonNull(handlerReturn, "Parameter 'handlerReturn' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_signal_accumulator_first_wins.invokeExact(
                    ihint.handle(),
                    returnAccu.handle(),
                    handlerReturn.handle(),
                    (Addressable) (dummy == null ? MemoryAddress.NULL : (Addressable) dummy));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * A predefined {@link SignalAccumulator} for signals that return a
     * boolean values. The behavior that this accumulator gives is
     * that a return of {@code true} stops the signal emission: no further
     * callbacks will be invoked, while a return of {@code false} allows
     * the emission to continue. The idea here is that a {@code true} return
     * indicates that the callback handled the signal, and no further
     * handling is needed.
     * @param ihint standard {@link SignalAccumulator} parameter
     * @param returnAccu standard {@link SignalAccumulator} parameter
     * @param handlerReturn standard {@link SignalAccumulator} parameter
     * @param dummy standard {@link SignalAccumulator} parameter
     * @return standard {@link SignalAccumulator} result
     */
    public static boolean signalAccumulatorTrueHandled(@NotNull org.gtk.gobject.SignalInvocationHint ihint, @NotNull org.gtk.gobject.Value returnAccu, @NotNull org.gtk.gobject.Value handlerReturn, @Nullable java.lang.foreign.MemoryAddress dummy) {
        java.util.Objects.requireNonNull(ihint, "Parameter 'ihint' must not be null");
        java.util.Objects.requireNonNull(returnAccu, "Parameter 'returnAccu' must not be null");
        java.util.Objects.requireNonNull(handlerReturn, "Parameter 'handlerReturn' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_signal_accumulator_true_handled.invokeExact(
                    ihint.handle(),
                    returnAccu.handle(),
                    handlerReturn.handle(),
                    (Addressable) (dummy == null ? MemoryAddress.NULL : (Addressable) dummy));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Adds an emission hook for a signal, which will get called for any emission
     * of that signal, independent of the instance. This is possible only
     * for signals which don't have {@link SignalFlags#NO_HOOKS} flag set.
     * @param signalId the signal identifier, as returned by g_signal_lookup().
     * @param detail the detail on which to call the hook.
     * @param hookFunc a {@link SignalEmissionHook} function.
     * @return the hook id, for later use with g_signal_remove_emission_hook().
     */
    public static long signalAddEmissionHook(int signalId, @NotNull org.gtk.glib.Quark detail, @NotNull org.gtk.gobject.SignalEmissionHook hookFunc) {
        java.util.Objects.requireNonNull(detail, "Parameter 'detail' must not be null");
        java.util.Objects.requireNonNull(hookFunc, "Parameter 'hookFunc' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_signal_add_emission_hook.invokeExact(
                    signalId,
                    detail.getValue().intValue(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbSignalEmissionHook",
                            MethodType.methodType(int.class, MemoryAddress.class, int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(hookFunc)),
                    Interop.cbDestroyNotifySymbol());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Calls the original class closure of a signal. This function should only
     * be called from an overridden class closure; see
     * g_signal_override_class_closure() and
     * g_signal_override_class_handler().
     * @param instanceAndParams the argument list of the signal emission.
     *  The first element in the array is a {@link Value} for the instance the signal
     *  is being emitted on. The rest are any arguments to be passed to the signal.
     * @param returnValue Location for the return value.
     */
    public static void signalChainFromOverridden(@NotNull org.gtk.gobject.Value[] instanceAndParams, @NotNull org.gtk.gobject.Value returnValue) {
        java.util.Objects.requireNonNull(instanceAndParams, "Parameter 'instanceAndParams' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        try {
            DowncallHandles.g_signal_chain_from_overridden.invokeExact(
                    Interop.allocateNativeArray(instanceAndParams, org.gtk.gobject.Value.getMemoryLayout(), false),
                    returnValue.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Calls the original class closure of a signal. This function should
     * only be called from an overridden class closure; see
     * g_signal_override_class_closure() and
     * g_signal_override_class_handler().
     * @param instance the instance the signal is being
     *    emitted on.
     * @param varargs parameters to be passed to the parent class closure, followed by a
     *  location for the return value. If the return type of the signal
     *  is {@code G_TYPE_NONE}, the return value location can be omitted.
     */
    public static void signalChainFromOverriddenHandler(@NotNull org.gtk.gobject.TypeInstance instance, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        try {
            DowncallHandles.g_signal_chain_from_overridden_handler.invokeExact(
                    instance.handle(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Connects a closure to a signal for a particular object.
     * @param instance the instance to connect to.
     * @param detailedSignal a string of the form "signal-name::detail".
     * @param closure the closure to connect.
     * @param after whether the handler should be called before or after the
     *  default handler of the signal.
     * @return the handler ID (always greater than 0 for successful connections)
     */
    public static long signalConnectClosure(@NotNull org.gtk.gobject.Object instance, @NotNull java.lang.String detailedSignal, @NotNull org.gtk.gobject.Closure closure, boolean after) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(detailedSignal, "Parameter 'detailedSignal' must not be null");
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_signal_connect_closure.invokeExact(
                    instance.handle(),
                    Interop.allocateNativeString(detailedSignal),
                    closure.handle(),
                    after ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Connects a closure to a signal for a particular object.
     * @param instance the instance to connect to.
     * @param signalId the id of the signal.
     * @param detail the detail.
     * @param closure the closure to connect.
     * @param after whether the handler should be called before or after the
     *  default handler of the signal.
     * @return the handler ID (always greater than 0 for successful connections)
     */
    public static long signalConnectClosureById(@NotNull org.gtk.gobject.Object instance, int signalId, @NotNull org.gtk.glib.Quark detail, @NotNull org.gtk.gobject.Closure closure, boolean after) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(detail, "Parameter 'detail' must not be null");
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_signal_connect_closure_by_id.invokeExact(
                    instance.handle(),
                    signalId,
                    detail.getValue().intValue(),
                    closure.handle(),
                    after ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Connects a {@link Callback} function to a signal for a particular object. Similar
     * to g_signal_connect(), but allows to provide a {@link ClosureNotify} for the data
     * which will be called when the signal handler is disconnected and no longer
     * used. Specify {@code connect_flags} if you need {@code ..._after()} or
     * {@code ..._swapped()} variants of this function.
     * @param instance the instance to connect to.
     * @param detailedSignal a string of the form "signal-name::detail".
     * @param cHandler the {@link Callback} to connect.
     * @param destroyData a {@link ClosureNotify} for {@code data}.
     * @param connectFlags a combination of {@link ConnectFlags}.
     * @return the handler ID (always greater than 0 for successful connections)
     */
    public static long signalConnectData(@NotNull org.gtk.gobject.Object instance, @NotNull java.lang.String detailedSignal, @NotNull org.gtk.gobject.Callback cHandler, @Nullable org.gtk.gobject.ClosureNotify destroyData, @NotNull org.gtk.gobject.ConnectFlags connectFlags) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(detailedSignal, "Parameter 'detailedSignal' must not be null");
        java.util.Objects.requireNonNull(cHandler, "Parameter 'cHandler' must not be null");
        java.util.Objects.requireNonNull(connectFlags, "Parameter 'connectFlags' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_signal_connect_data.invokeExact(
                    instance.handle(),
                    Interop.allocateNativeString(detailedSignal),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbCallback",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(cHandler)),
                    (Addressable) (destroyData == null ? MemoryAddress.NULL : (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbClosureNotify",
                            MethodType.methodType(void.class)),
                        FunctionDescriptor.ofVoid(),
                        Interop.getScope())),
                    connectFlags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * This is similar to g_signal_connect_data(), but uses a closure which
     * ensures that the {@code gobject} stays alive during the call to {@code c_handler}
     * by temporarily adding a reference count to {@code gobject}.
     * <p>
     * When the {@code gobject} is destroyed the signal handler will be automatically
     * disconnected.  Note that this is not currently threadsafe (ie:
     * emitting a signal while {@code gobject} is being destroyed in another thread
     * is not safe).
     * @param instance the instance to connect to.
     * @param detailedSignal a string of the form "signal-name::detail".
     * @param cHandler the {@link Callback} to connect.
     * @param gobject the object to pass as data
     *    to {@code c_handler}.
     * @param connectFlags a combination of {@link ConnectFlags}.
     * @return the handler id.
     */
    public static long signalConnectObject(@NotNull org.gtk.gobject.TypeInstance instance, @NotNull java.lang.String detailedSignal, @NotNull org.gtk.gobject.Callback cHandler, @Nullable org.gtk.gobject.Object gobject, @NotNull org.gtk.gobject.ConnectFlags connectFlags) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Emits a signal. Signal emission is done synchronously.
     * The method will only return control after all handlers are called or signal emission was stopped.
     * <p>
     * Note that g_signal_emit() resets the return value to the default
     * if no handlers are connected, in contrast to g_signal_emitv().
     * @param instance the instance the signal is being emitted on.
     * @param signalId the signal id
     * @param detail the detail
     * @param varargs parameters to be passed to the signal, followed by a
     *  location for the return value. If the return type of the signal
     *  is {@code G_TYPE_NONE}, the return value location can be omitted.
     */
    public static void signalEmit(@NotNull org.gtk.gobject.Object instance, int signalId, @NotNull org.gtk.glib.Quark detail, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(detail, "Parameter 'detail' must not be null");
        try {
            DowncallHandles.g_signal_emit.invokeExact(
                    instance.handle(),
                    signalId,
                    detail.getValue().intValue(),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Emits a signal. Signal emission is done synchronously.
     * The method will only return control after all handlers are called or signal emission was stopped.
     * <p>
     * Note that g_signal_emit_by_name() resets the return value to the default
     * if no handlers are connected, in contrast to g_signal_emitv().
     * @param instance the instance the signal is being emitted on.
     * @param detailedSignal a string of the form "signal-name::detail".
     * @param varargs parameters to be passed to the signal, followed by a
     *  location for the return value. If the return type of the signal
     *  is {@code G_TYPE_NONE}, the return value location can be omitted. The
     *  number of parameters to pass to this function is defined when creating the signal.
     */
    public static void signalEmitByName(@NotNull org.gtk.gobject.Object instance, @NotNull java.lang.String detailedSignal, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(detailedSignal, "Parameter 'detailedSignal' must not be null");
        try {
            DowncallHandles.g_signal_emit_by_name.invokeExact(
                    instance.handle(),
                    Interop.allocateNativeString(detailedSignal),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Emits a signal. Signal emission is done synchronously.
     * The method will only return control after all handlers are called or signal emission was stopped.
     * <p>
     * Note that g_signal_emit_valist() resets the return value to the default
     * if no handlers are connected, in contrast to g_signal_emitv().
     * @param instance the instance the signal is being
     *    emitted on.
     * @param signalId the signal id
     * @param detail the detail
     * @param varArgs a list of parameters to be passed to the signal, followed by a
     *  location for the return value. If the return type of the signal
     *  is {@code G_TYPE_NONE}, the return value location can be omitted.
     */
    public static void signalEmitValist(@NotNull org.gtk.gobject.TypeInstance instance, int signalId, @NotNull org.gtk.glib.Quark detail, @NotNull VaList varArgs) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(detail, "Parameter 'detail' must not be null");
        java.util.Objects.requireNonNull(varArgs, "Parameter 'varArgs' must not be null");
        try {
            DowncallHandles.g_signal_emit_valist.invokeExact(
                    instance.handle(),
                    signalId,
                    detail.getValue().intValue(),
                    varArgs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Emits a signal. Signal emission is done synchronously.
     * The method will only return control after all handlers are called or signal emission was stopped.
     * <p>
     * Note that g_signal_emitv() doesn't change {@code return_value} if no handlers are
     * connected, in contrast to g_signal_emit() and g_signal_emit_valist().
     * @param instanceAndParams argument list for the signal emission.
     *  The first element in the array is a {@link Value} for the instance the signal
     *  is being emitted on. The rest are any arguments to be passed to the signal.
     * @param signalId the signal id
     * @param detail the detail
     * @param returnValue Location to
     * store the return value of the signal emission. This must be provided if the
     * specified signal returns a value, but may be ignored otherwise.
     */
    public static void signalEmitv(@NotNull org.gtk.gobject.Value[] instanceAndParams, int signalId, @NotNull org.gtk.glib.Quark detail, @NotNull org.gtk.gobject.Value returnValue) {
        java.util.Objects.requireNonNull(instanceAndParams, "Parameter 'instanceAndParams' must not be null");
        java.util.Objects.requireNonNull(detail, "Parameter 'detail' must not be null");
        java.util.Objects.requireNonNull(returnValue, "Parameter 'returnValue' must not be null");
        try {
            DowncallHandles.g_signal_emitv.invokeExact(
                    Interop.allocateNativeArray(instanceAndParams, org.gtk.gobject.Value.getMemoryLayout(), false),
                    signalId,
                    detail.getValue().intValue(),
                    returnValue.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        returnValue.yieldOwnership();
    }
    
    /**
     * Returns the invocation hint of the innermost signal emission of instance.
     * @param instance the instance to query
     * @return the invocation hint of the innermost
     *     signal emission, or {@code null} if not found.
     */
    public static @Nullable org.gtk.gobject.SignalInvocationHint signalGetInvocationHint(@NotNull org.gtk.gobject.Object instance) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_signal_get_invocation_hint.invokeExact(
                    instance.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.SignalInvocationHint(RESULT, Ownership.NONE);
    }
    
    /**
     * Blocks a handler of an instance so it will not be called during any
     * signal emissions unless it is unblocked again. Thus "blocking" a
     * signal handler means to temporarily deactivate it, a signal handler
     * has to be unblocked exactly the same amount of times it has been
     * blocked before to become active again.
     * <p>
     * The {@code handler_id} has to be a valid signal handler id, connected to a
     * signal of {@code instance}.
     * @param instance The instance to block the signal handler of.
     * @param handlerId Handler id of the handler to be blocked.
     */
    public static void signalHandlerBlock(@NotNull org.gtk.gobject.Object instance, long handlerId) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        try {
            DowncallHandles.g_signal_handler_block.invokeExact(
                    instance.handle(),
                    handlerId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Disconnects a handler from an instance so it will not be called during
     * any future or currently ongoing emissions of the signal it has been
     * connected to. The {@code handler_id} becomes invalid and may be reused.
     * <p>
     * The {@code handler_id} has to be a valid signal handler id, connected to a
     * signal of {@code instance}.
     * @param instance The instance to remove the signal handler from.
     * @param handlerId Handler id of the handler to be disconnected.
     */
    public static void signalHandlerDisconnect(@NotNull org.gtk.gobject.Object instance, long handlerId) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        try {
            DowncallHandles.g_signal_handler_disconnect.invokeExact(
                    instance.handle(),
                    handlerId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Finds the first signal handler that matches certain selection criteria.
     * The criteria mask is passed as an OR-ed combination of {@link SignalMatchType}
     * flags, and the criteria values are passed as arguments.
     * The match {@code mask} has to be non-0 for successful matches.
     * If no handler was found, 0 is returned.
     * @param instance The instance owning the signal handler to be found.
     * @param mask Mask indicating which of {@code signal_id}, {@code detail}, {@code closure}, {@code func}
     *  and/or {@code data} the handler has to match.
     * @param signalId Signal the handler has to be connected to.
     * @param detail Signal detail the handler has to be connected to.
     * @param closure The closure the handler will invoke.
     * @param func The C closure callback of the handler (useless for non-C closures).
     * @param data The closure data of the handler's closure.
     * @return A valid non-0 signal handler id for a successful match.
     */
    public static long signalHandlerFind(@NotNull org.gtk.gobject.Object instance, @NotNull org.gtk.gobject.SignalMatchType mask, int signalId, @NotNull org.gtk.glib.Quark detail, @Nullable org.gtk.gobject.Closure closure, @Nullable java.lang.foreign.MemoryAddress func, @Nullable java.lang.foreign.MemoryAddress data) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(mask, "Parameter 'mask' must not be null");
        java.util.Objects.requireNonNull(detail, "Parameter 'detail' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_signal_handler_find.invokeExact(
                    instance.handle(),
                    mask.getValue(),
                    signalId,
                    detail.getValue().intValue(),
                    (Addressable) (closure == null ? MemoryAddress.NULL : closure.handle()),
                    (Addressable) (func == null ? MemoryAddress.NULL : (Addressable) func),
                    (Addressable) data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns whether {@code handler_id} is the ID of a handler connected to {@code instance}.
     * @param instance The instance where a signal handler is sought.
     * @param handlerId the handler ID.
     * @return whether {@code handler_id} identifies a handler connected to {@code instance}.
     */
    public static boolean signalHandlerIsConnected(@NotNull org.gtk.gobject.Object instance, long handlerId) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_signal_handler_is_connected.invokeExact(
                    instance.handle(),
                    handlerId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
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
     * @param instance The instance to unblock the signal handler of.
     * @param handlerId Handler id of the handler to be unblocked.
     */
    public static void signalHandlerUnblock(@NotNull org.gtk.gobject.Object instance, long handlerId) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        try {
            DowncallHandles.g_signal_handler_unblock.invokeExact(
                    instance.handle(),
                    handlerId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Blocks all handlers on an instance that match a certain selection criteria.
     * The criteria mask is passed as an OR-ed combination of {@link SignalMatchType}
     * flags, and the criteria values are passed as arguments.
     * Passing at least one of the {@link SignalMatchType#CLOSURE}, {@link SignalMatchType#FUNC}
     * or {@link SignalMatchType#DATA} match flags is required for successful matches.
     * If no handlers were found, 0 is returned, the number of blocked handlers
     * otherwise.
     * @param instance The instance to block handlers from.
     * @param mask Mask indicating which of {@code signal_id}, {@code detail}, {@code closure}, {@code func}
     *  and/or {@code data} the handlers have to match.
     * @param signalId Signal the handlers have to be connected to.
     * @param detail Signal detail the handlers have to be connected to.
     * @param closure The closure the handlers will invoke.
     * @param func The C closure callback of the handlers (useless for non-C closures).
     * @param data The closure data of the handlers' closures.
     * @return The number of handlers that matched.
     */
    public static int signalHandlersBlockMatched(@NotNull org.gtk.gobject.Object instance, @NotNull org.gtk.gobject.SignalMatchType mask, int signalId, @NotNull org.gtk.glib.Quark detail, @Nullable org.gtk.gobject.Closure closure, @Nullable java.lang.foreign.MemoryAddress func, @Nullable java.lang.foreign.MemoryAddress data) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(mask, "Parameter 'mask' must not be null");
        java.util.Objects.requireNonNull(detail, "Parameter 'detail' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_signal_handlers_block_matched.invokeExact(
                    instance.handle(),
                    mask.getValue(),
                    signalId,
                    detail.getValue().intValue(),
                    (Addressable) (closure == null ? MemoryAddress.NULL : closure.handle()),
                    (Addressable) (func == null ? MemoryAddress.NULL : (Addressable) func),
                    (Addressable) data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Destroy all signal handlers of a type instance. This function is
     * an implementation detail of the {@link Object} dispose implementation,
     * and should not be used outside of the type system.
     * @param instance The instance whose signal handlers are destroyed
     */
    public static void signalHandlersDestroy(@NotNull org.gtk.gobject.Object instance) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        try {
            DowncallHandles.g_signal_handlers_destroy.invokeExact(
                    instance.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Disconnects all handlers on an instance that match a certain
     * selection criteria. The criteria mask is passed as an OR-ed
     * combination of {@link SignalMatchType} flags, and the criteria values are
     * passed as arguments.  Passing at least one of the
     * {@link SignalMatchType#CLOSURE}, {@link SignalMatchType#FUNC} or
     * {@link SignalMatchType#DATA} match flags is required for successful
     * matches.  If no handlers were found, 0 is returned, the number of
     * disconnected handlers otherwise.
     * @param instance The instance to remove handlers from.
     * @param mask Mask indicating which of {@code signal_id}, {@code detail}, {@code closure}, {@code func}
     *  and/or {@code data} the handlers have to match.
     * @param signalId Signal the handlers have to be connected to.
     * @param detail Signal detail the handlers have to be connected to.
     * @param closure The closure the handlers will invoke.
     * @param func The C closure callback of the handlers (useless for non-C closures).
     * @param data The closure data of the handlers' closures.
     * @return The number of handlers that matched.
     */
    public static int signalHandlersDisconnectMatched(@NotNull org.gtk.gobject.Object instance, @NotNull org.gtk.gobject.SignalMatchType mask, int signalId, @NotNull org.gtk.glib.Quark detail, @Nullable org.gtk.gobject.Closure closure, @Nullable java.lang.foreign.MemoryAddress func, @Nullable java.lang.foreign.MemoryAddress data) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(mask, "Parameter 'mask' must not be null");
        java.util.Objects.requireNonNull(detail, "Parameter 'detail' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_signal_handlers_disconnect_matched.invokeExact(
                    instance.handle(),
                    mask.getValue(),
                    signalId,
                    detail.getValue().intValue(),
                    (Addressable) (closure == null ? MemoryAddress.NULL : closure.handle()),
                    (Addressable) (func == null ? MemoryAddress.NULL : (Addressable) func),
                    (Addressable) data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Unblocks all handlers on an instance that match a certain selection
     * criteria. The criteria mask is passed as an OR-ed combination of
     * {@link SignalMatchType} flags, and the criteria values are passed as arguments.
     * Passing at least one of the {@link SignalMatchType#CLOSURE}, {@link SignalMatchType#FUNC}
     * or {@link SignalMatchType#DATA} match flags is required for successful matches.
     * If no handlers were found, 0 is returned, the number of unblocked handlers
     * otherwise. The match criteria should not apply to any handlers that are
     * not currently blocked.
     * @param instance The instance to unblock handlers from.
     * @param mask Mask indicating which of {@code signal_id}, {@code detail}, {@code closure}, {@code func}
     *  and/or {@code data} the handlers have to match.
     * @param signalId Signal the handlers have to be connected to.
     * @param detail Signal detail the handlers have to be connected to.
     * @param closure The closure the handlers will invoke.
     * @param func The C closure callback of the handlers (useless for non-C closures).
     * @param data The closure data of the handlers' closures.
     * @return The number of handlers that matched.
     */
    public static int signalHandlersUnblockMatched(@NotNull org.gtk.gobject.Object instance, @NotNull org.gtk.gobject.SignalMatchType mask, int signalId, @NotNull org.gtk.glib.Quark detail, @Nullable org.gtk.gobject.Closure closure, @Nullable java.lang.foreign.MemoryAddress func, @Nullable java.lang.foreign.MemoryAddress data) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(mask, "Parameter 'mask' must not be null");
        java.util.Objects.requireNonNull(detail, "Parameter 'detail' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_signal_handlers_unblock_matched.invokeExact(
                    instance.handle(),
                    mask.getValue(),
                    signalId,
                    detail.getValue().intValue(),
                    (Addressable) (closure == null ? MemoryAddress.NULL : closure.handle()),
                    (Addressable) (func == null ? MemoryAddress.NULL : (Addressable) func),
                    (Addressable) data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
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
     * @param instance the object whose signal handlers are sought.
     * @param signalId the signal id.
     * @param detail the detail.
     * @param mayBeBlocked whether blocked handlers should count as match.
     * @return {@code true} if a handler is connected to the signal, {@code false}
     *          otherwise.
     */
    public static boolean signalHasHandlerPending(@NotNull org.gtk.gobject.Object instance, int signalId, @NotNull org.gtk.glib.Quark detail, boolean mayBeBlocked) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(detail, "Parameter 'detail' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_signal_has_handler_pending.invokeExact(
                    instance.handle(),
                    signalId,
                    detail.getValue().intValue(),
                    mayBeBlocked ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Validate a signal name. This can be useful for dynamically-generated signals
     * which need to be validated at run-time before actually trying to create them.
     * <p>
     * See [canonical parameter names][canonical-parameter-names] for details of
     * the rules for valid names. The rules for signal names are the same as those
     * for property names.
     * @param name the canonical name of the signal
     * @return {@code true} if {@code name} is a valid signal name, {@code false} otherwise.
     */
    public static boolean signalIsValidName(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_signal_is_valid_name.invokeExact(
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Lists the signals by id that a certain instance or interface type
     * created. Further information about the signals can be acquired through
     * g_signal_query().
     * @param itype Instance or interface type.
     * @param nIds Location to store the number of signal ids for {@code itype}.
     * @return Newly allocated array of signal IDs.
     */
    public static @NotNull int[] signalListIds(@NotNull org.gtk.glib.Type itype, Out<Integer> nIds) {
        java.util.Objects.requireNonNull(itype, "Parameter 'itype' must not be null");
        java.util.Objects.requireNonNull(nIds, "Parameter 'nIds' must not be null");
        MemorySegment nIdsPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_signal_list_ids.invokeExact(
                    itype.getValue().longValue(),
                    (Addressable) nIdsPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nIds.set(nIdsPOINTER.get(Interop.valueLayout.C_INT, 0));
        return MemorySegment.ofAddress(RESULT.get(Interop.valueLayout.ADDRESS, 0), nIds.get().intValue() * Interop.valueLayout.C_INT.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_INT);
    }
    
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
     * @param name the signal's name.
     * @param itype the type that the signal operates on.
     * @return the signal's identifying number, or 0 if no signal was found.
     */
    public static int signalLookup(@NotNull java.lang.String name, @NotNull org.gtk.glib.Type itype) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(itype, "Parameter 'itype' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_signal_lookup.invokeExact(
                    Interop.allocateNativeString(name),
                    itype.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Given the signal's identifier, finds its name.
     * <p>
     * Two different signals may have the same name, if they have differing types.
     * @param signalId the signal's identifying number.
     * @return the signal name, or {@code null} if the signal number was invalid.
     */
    public static @Nullable java.lang.String signalName(int signalId) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_signal_name.invokeExact(
                    signalId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Overrides the class closure (i.e. the default handler) for the given signal
     * for emissions on instances of {@code instance_type}. {@code instance_type} must be derived
     * from the type to which the signal belongs.
     * <p>
     * See g_signal_chain_from_overridden() and
     * g_signal_chain_from_overridden_handler() for how to chain up to the
     * parent class closure from inside the overridden one.
     * @param signalId the signal id
     * @param instanceType the instance type on which to override the class closure
     *  for the signal.
     * @param classClosure the closure.
     */
    public static void signalOverrideClassClosure(int signalId, @NotNull org.gtk.glib.Type instanceType, @NotNull org.gtk.gobject.Closure classClosure) {
        java.util.Objects.requireNonNull(instanceType, "Parameter 'instanceType' must not be null");
        java.util.Objects.requireNonNull(classClosure, "Parameter 'classClosure' must not be null");
        try {
            DowncallHandles.g_signal_override_class_closure.invokeExact(
                    signalId,
                    instanceType.getValue().longValue(),
                    classClosure.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Overrides the class closure (i.e. the default handler) for the
     * given signal for emissions on instances of {@code instance_type} with
     * callback {@code class_handler}. {@code instance_type} must be derived from the
     * type to which the signal belongs.
     * <p>
     * See g_signal_chain_from_overridden() and
     * g_signal_chain_from_overridden_handler() for how to chain up to the
     * parent class closure from inside the overridden one.
     * @param signalName the name for the signal
     * @param instanceType the instance type on which to override the class handler
     *  for the signal.
     * @param classHandler the handler.
     */
    public static void signalOverrideClassHandler(@NotNull java.lang.String signalName, @NotNull org.gtk.glib.Type instanceType, @NotNull org.gtk.gobject.Callback classHandler) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Internal function to parse a signal name into its {@code signal_id}
     * and {@code detail} quark.
     * @param detailedSignal a string of the form "signal-name::detail".
     * @param itype The interface/instance type that introduced "signal-name".
     * @param signalIdP Location to store the signal id.
     * @param detailP Location to store the detail quark.
     * @param forceDetailQuark {@code true} forces creation of a {@link org.gtk.glib.Quark} for the detail.
     * @return Whether the signal name could successfully be parsed and {@code signal_id_p} and {@code detail_p} contain valid return values.
     */
    public static boolean signalParseName(@NotNull java.lang.String detailedSignal, @NotNull org.gtk.glib.Type itype, Out<Integer> signalIdP, @NotNull Out<org.gtk.glib.Quark> detailP, boolean forceDetailQuark) {
        java.util.Objects.requireNonNull(detailedSignal, "Parameter 'detailedSignal' must not be null");
        java.util.Objects.requireNonNull(itype, "Parameter 'itype' must not be null");
        java.util.Objects.requireNonNull(signalIdP, "Parameter 'signalIdP' must not be null");
        MemorySegment signalIdPPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(detailP, "Parameter 'detailP' must not be null");
        MemorySegment detailPPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_signal_parse_name.invokeExact(
                    Interop.allocateNativeString(detailedSignal),
                    itype.getValue().longValue(),
                    (Addressable) signalIdPPOINTER.address(),
                    (Addressable) detailPPOINTER.address(),
                    forceDetailQuark ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        signalIdP.set(signalIdPPOINTER.get(Interop.valueLayout.C_INT, 0));
        detailP.set(new org.gtk.glib.Quark(detailPPOINTER.get(Interop.valueLayout.C_INT, 0)));
        return RESULT != 0;
    }
    
    /**
     * Queries the signal system for in-depth information about a
     * specific signal. This function will fill in a user-provided
     * structure to hold signal-specific information. If an invalid
     * signal id is passed in, the {@code signal_id} member of the {@link SignalQuery}
     * is 0. All members filled into the {@link SignalQuery} structure should
     * be considered constant and have to be left untouched.
     * @param signalId The signal id of the signal to query information for.
     * @param query A user provided structure that is
     *  filled in with constant values upon success.
     */
    public static void signalQuery(int signalId, @NotNull org.gtk.gobject.SignalQuery query) {
        java.util.Objects.requireNonNull(query, "Parameter 'query' must not be null");
        try {
            DowncallHandles.g_signal_query.invokeExact(
                    signalId,
                    query.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Deletes an emission hook.
     * @param signalId the id of the signal
     * @param hookId the id of the emission hook, as returned by
     *  g_signal_add_emission_hook()
     */
    public static void signalRemoveEmissionHook(int signalId, long hookId) {
        try {
            DowncallHandles.g_signal_remove_emission_hook.invokeExact(
                    signalId,
                    hookId);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Stops a signal's current emission.
     * <p>
     * This will prevent the default method from running, if the signal was
     * {@link SignalFlags#RUN_LAST} and you connected normally (i.e. without the "after"
     * flag).
     * <p>
     * Prints a warning if used on a signal which isn't being emitted.
     * @param instance the object whose signal handlers you wish to stop.
     * @param signalId the signal identifier, as returned by g_signal_lookup().
     * @param detail the detail which the signal was emitted with.
     */
    public static void signalStopEmission(@NotNull org.gtk.gobject.Object instance, int signalId, @NotNull org.gtk.glib.Quark detail) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(detail, "Parameter 'detail' must not be null");
        try {
            DowncallHandles.g_signal_stop_emission.invokeExact(
                    instance.handle(),
                    signalId,
                    detail.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Stops a signal's current emission.
     * <p>
     * This is just like g_signal_stop_emission() except it will look up the
     * signal id for you.
     * @param instance the object whose signal handlers you wish to stop.
     * @param detailedSignal a string of the form "signal-name::detail".
     */
    public static void signalStopEmissionByName(@NotNull org.gtk.gobject.Object instance, @NotNull java.lang.String detailedSignal) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(detailedSignal, "Parameter 'detailedSignal' must not be null");
        try {
            DowncallHandles.g_signal_stop_emission_by_name.invokeExact(
                    instance.handle(),
                    Interop.allocateNativeString(detailedSignal));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new closure which invokes the function found at the offset
     * {@code struct_offset} in the class structure of the interface or classed type
     * identified by {@code itype}.
     * @param itype the {@link Type} identifier of an interface or classed type
     * @param structOffset the offset of the member function of {@code itype}'s class
     *  structure which is to be invoked by the new closure
     * @return a floating reference to a new {@link CClosure}
     */
    public static @NotNull org.gtk.gobject.Closure signalTypeCclosureNew(@NotNull org.gtk.glib.Type itype, int structOffset) {
        java.util.Objects.requireNonNull(itype, "Parameter 'itype' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_signal_type_cclosure_new.invokeExact(
                    itype.getValue().longValue(),
                    structOffset);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Closure(RESULT, Ownership.NONE);
    }
    
    /**
     * Set the callback for a source as a {@link Closure}.
     * <p>
     * If the source is not one of the standard GLib types, the {@code closure_callback}
     * and {@code closure_marshal} fields of the {@link org.gtk.glib.SourceFuncs} structure must have been
     * filled in with pointers to appropriate functions.
     * @param source the source
     * @param closure a {@link Closure}
     */
    public static void sourceSetClosure(@NotNull org.gtk.glib.Source source, @NotNull org.gtk.gobject.Closure closure) {
        java.util.Objects.requireNonNull(source, "Parameter 'source' must not be null");
        java.util.Objects.requireNonNull(closure, "Parameter 'closure' must not be null");
        try {
            DowncallHandles.g_source_set_closure.invokeExact(
                    source.handle(),
                    closure.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param source the source
     */
    public static void sourceSetDummyCallback(@NotNull org.gtk.glib.Source source) {
        java.util.Objects.requireNonNull(source, "Parameter 'source' must not be null");
        try {
            DowncallHandles.g_source_set_dummy_callback.invokeExact(
                    source.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Return a newly allocated string, which describes the contents of a
     * {@link Value}.  The main purpose of this function is to describe {@link Value}
     * contents for debugging output, the way in which the contents are
     * described may change between different GLib versions.
     * @param value {@link Value} which contents are to be described.
     * @return Newly allocated string.
     */
    public static @NotNull java.lang.String strdupValueContents(@NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_strdup_value_contents.invokeExact(
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Adds a {@link TypeClassCacheFunc} to be called before the reference count of a
     * class goes from one to zero. This can be used to prevent premature class
     * destruction. All installed {@link TypeClassCacheFunc} functions will be chained
     * until one of them returns {@code true}. The functions have to check the class id
     * passed in to figure whether they actually want to cache the class of this
     * type, since all classes are routed through the same {@link TypeClassCacheFunc}
     * chain.
     * @param cacheFunc a {@link TypeClassCacheFunc}
     */
    public static void typeAddClassCacheFunc(@NotNull org.gtk.gobject.TypeClassCacheFunc cacheFunc) {
        java.util.Objects.requireNonNull(cacheFunc, "Parameter 'cacheFunc' must not be null");
        try {
            DowncallHandles.g_type_add_class_cache_func.invokeExact(
                    (Addressable) (Interop.registerCallback(cacheFunc)),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbTypeClassCacheFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param classType GType of a classed type
     * @param privateSize size of private structure
     */
    public static void typeAddClassPrivate(@NotNull org.gtk.glib.Type classType, long privateSize) {
        java.util.Objects.requireNonNull(classType, "Parameter 'classType' must not be null");
        try {
            DowncallHandles.g_type_add_class_private.invokeExact(
                    classType.getValue().longValue(),
                    privateSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static int typeAddInstancePrivate(@NotNull org.gtk.glib.Type classType, long privateSize) {
        java.util.Objects.requireNonNull(classType, "Parameter 'classType' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_type_add_instance_private.invokeExact(
                    classType.getValue().longValue(),
                    privateSize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
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
     * @param checkFunc function to be called after each interface
     *     is initialized
     */
    public static void typeAddInterfaceCheck(@NotNull org.gtk.gobject.TypeInterfaceCheckFunc checkFunc) {
        java.util.Objects.requireNonNull(checkFunc, "Parameter 'checkFunc' must not be null");
        try {
            DowncallHandles.g_type_add_interface_check.invokeExact(
                    (Addressable) (Interop.registerCallback(checkFunc)),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbTypeInterfaceCheckFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds {@code interface_type} to the dynamic {@code instance_type}. The information
     * contained in the {@link TypePlugin} structure pointed to by {@code plugin}
     * is used to manage the relationship.
     * @param instanceType {@link Type} value of an instantiatable type
     * @param interfaceType {@link Type} value of an interface type
     * @param plugin {@link TypePlugin} structure to retrieve the {@link InterfaceInfo} from
     */
    public static void typeAddInterfaceDynamic(@NotNull org.gtk.glib.Type instanceType, @NotNull org.gtk.glib.Type interfaceType, @NotNull org.gtk.gobject.TypePlugin plugin) {
        java.util.Objects.requireNonNull(instanceType, "Parameter 'instanceType' must not be null");
        java.util.Objects.requireNonNull(interfaceType, "Parameter 'interfaceType' must not be null");
        java.util.Objects.requireNonNull(plugin, "Parameter 'plugin' must not be null");
        try {
            DowncallHandles.g_type_add_interface_dynamic.invokeExact(
                    instanceType.getValue().longValue(),
                    interfaceType.getValue().longValue(),
                    plugin.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds {@code interface_type} to the static {@code instance_type}.
     * The information contained in the {@link InterfaceInfo} structure
     * pointed to by {@code info} is used to manage the relationship.
     * @param instanceType {@link Type} value of an instantiatable type
     * @param interfaceType {@link Type} value of an interface type
     * @param info {@link InterfaceInfo} structure for this
     *        ({@code instance_type}, {@code interface_type}) combination
     */
    public static void typeAddInterfaceStatic(@NotNull org.gtk.glib.Type instanceType, @NotNull org.gtk.glib.Type interfaceType, @NotNull org.gtk.gobject.InterfaceInfo info) {
        java.util.Objects.requireNonNull(instanceType, "Parameter 'instanceType' must not be null");
        java.util.Objects.requireNonNull(interfaceType, "Parameter 'interfaceType' must not be null");
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        try {
            DowncallHandles.g_type_add_interface_static.invokeExact(
                    instanceType.getValue().longValue(),
                    interfaceType.getValue().longValue(),
                    info.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static @NotNull org.gtk.gobject.TypeClass typeCheckClassCast(@NotNull org.gtk.gobject.TypeClass gClass, @NotNull org.gtk.glib.Type isAType) {
        java.util.Objects.requireNonNull(gClass, "Parameter 'gClass' must not be null");
        java.util.Objects.requireNonNull(isAType, "Parameter 'isAType' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_check_class_cast.invokeExact(
                    gClass.handle(),
                    isAType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.TypeClass(RESULT, Ownership.UNKNOWN);
    }
    
    public static boolean typeCheckClassIsA(@NotNull org.gtk.gobject.TypeClass gClass, @NotNull org.gtk.glib.Type isAType) {
        java.util.Objects.requireNonNull(gClass, "Parameter 'gClass' must not be null");
        java.util.Objects.requireNonNull(isAType, "Parameter 'isAType' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_type_check_class_is_a.invokeExact(
                    gClass.handle(),
                    isAType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Private helper function to aid implementation of the
     * G_TYPE_CHECK_INSTANCE() macro.
     * @param instance a valid {@link TypeInstance} structure
     * @return {@code true} if {@code instance} is valid, {@code false} otherwise
     */
    public static boolean typeCheckInstance(@NotNull org.gtk.gobject.TypeInstance instance) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_type_check_instance.invokeExact(
                    instance.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public static @NotNull org.gtk.gobject.TypeInstance typeCheckInstanceCast(@NotNull org.gtk.gobject.TypeInstance instance, @NotNull org.gtk.glib.Type ifaceType) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(ifaceType, "Parameter 'ifaceType' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_check_instance_cast.invokeExact(
                    instance.handle(),
                    ifaceType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.TypeInstance(RESULT, Ownership.UNKNOWN);
    }
    
    public static boolean typeCheckInstanceIsA(@NotNull org.gtk.gobject.TypeInstance instance, @NotNull org.gtk.glib.Type ifaceType) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(ifaceType, "Parameter 'ifaceType' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_type_check_instance_is_a.invokeExact(
                    instance.handle(),
                    ifaceType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public static boolean typeCheckInstanceIsFundamentallyA(@NotNull org.gtk.gobject.TypeInstance instance, @NotNull org.gtk.glib.Type fundamentalType) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        java.util.Objects.requireNonNull(fundamentalType, "Parameter 'fundamentalType' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_type_check_instance_is_fundamentally_a.invokeExact(
                    instance.handle(),
                    fundamentalType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public static boolean typeCheckIsValueType(@NotNull org.gtk.glib.Type type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_type_check_is_value_type.invokeExact(
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public static boolean typeCheckValue(@NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_type_check_value.invokeExact(
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    public static boolean typeCheckValueHolds(@NotNull org.gtk.gobject.Value value, @NotNull org.gtk.glib.Type type) {
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_type_check_value_holds.invokeExact(
                    value.handle(),
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Return a newly allocated and 0-terminated array of type IDs, listing
     * the child types of {@code type}.
     * @param type the parent type
     * @param nChildren location to store the length of
     *     the returned array, or {@code null}
     * @return Newly allocated
     *     and 0-terminated array of child types, free with g_free()
     */
    public static @NotNull org.gtk.glib.Type[] typeChildren(@NotNull org.gtk.glib.Type type, Out<Integer> nChildren) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(nChildren, "Parameter 'nChildren' must not be null");
        MemorySegment nChildrenPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_children.invokeExact(
                    type.getValue().longValue(),
                    (Addressable) nChildrenPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nChildren.set(nChildrenPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.gtk.glib.Type[] resultARRAY = new org.gtk.glib.Type[nChildren.get().intValue()];
        for (int I = 0; I < nChildren.get().intValue(); I++) {
            var OBJ = RESULT.get(Interop.valueLayout.C_LONG, I);
            resultARRAY[I] = new org.gtk.glib.Type(OBJ);
        }
        return resultARRAY;
    }
    
    public static void typeClassAdjustPrivateOffset(@Nullable java.lang.foreign.MemoryAddress gClass, PointerInteger privateSizeOrOffset) {
        java.util.Objects.requireNonNull(privateSizeOrOffset, "Parameter 'privateSizeOrOffset' must not be null");
        try {
            DowncallHandles.g_type_class_adjust_private_offset.invokeExact(
                    (Addressable) (gClass == null ? MemoryAddress.NULL : (Addressable) gClass),
                    privateSizeOrOffset.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This function is essentially the same as g_type_class_ref(),
     * except that the classes reference count isn't incremented.
     * As a consequence, this function may return {@code null} if the class
     * of the type passed in does not currently exist (hasn't been
     * referenced before).
     * @param type type ID of a classed type
     * @return the {@link TypeClass}
     *     structure for the given type ID or {@code null} if the class does not
     *     currently exist
     */
    public static @NotNull org.gtk.gobject.TypeClass typeClassPeek(@NotNull org.gtk.glib.Type type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_class_peek.invokeExact(
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.TypeClass(RESULT, Ownership.NONE);
    }
    
    /**
     * A more efficient version of g_type_class_peek() which works only for
     * static types.
     * @param type type ID of a classed type
     * @return the {@link TypeClass}
     *     structure for the given type ID or {@code null} if the class does not
     *     currently exist or is dynamically loaded
     */
    public static @NotNull org.gtk.gobject.TypeClass typeClassPeekStatic(@NotNull org.gtk.glib.Type type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_class_peek_static.invokeExact(
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.TypeClass(RESULT, Ownership.NONE);
    }
    
    /**
     * Increments the reference count of the class structure belonging to
     * {@code type}. This function will demand-create the class if it doesn't
     * exist already.
     * @param type type ID of a classed type
     * @return the {@link TypeClass}
     *     structure for the given type ID
     */
    public static @NotNull org.gtk.gobject.TypeClass typeClassRef(@NotNull org.gtk.glib.Type type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_class_ref.invokeExact(
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.TypeClass(RESULT, Ownership.NONE);
    }
    
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
     * @param type an instantiatable type to create an instance for
     * @return an allocated and initialized instance, subject to further
     *     treatment by the fundamental type implementation
     */
    public static @NotNull org.gtk.gobject.TypeInstance typeCreateInstance(@NotNull org.gtk.glib.Type type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_create_instance.invokeExact(
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.TypeInstance(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * If the interface type {@code g_type} is currently in use, returns its
     * default interface vtable.
     * @param gType an interface type
     * @return the default
     *     vtable for the interface, or {@code null} if the type is not currently
     *     in use
     */
    public static @NotNull org.gtk.gobject.TypeInterface typeDefaultInterfacePeek(@NotNull org.gtk.glib.Type gType) {
        java.util.Objects.requireNonNull(gType, "Parameter 'gType' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_default_interface_peek.invokeExact(
                    gType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.TypeInterface(RESULT, Ownership.NONE);
    }
    
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
     * @param gType an interface type
     * @return the default
     *     vtable for the interface; call g_type_default_interface_unref()
     *     when you are done using the interface.
     */
    public static @NotNull org.gtk.gobject.TypeInterface typeDefaultInterfaceRef(@NotNull org.gtk.glib.Type gType) {
        java.util.Objects.requireNonNull(gType, "Parameter 'gType' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_default_interface_ref.invokeExact(
                    gType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.TypeInterface(RESULT, Ownership.NONE);
    }
    
    /**
     * Decrements the reference count for the type corresponding to the
     * interface default vtable {@code g_iface}. If the type is dynamic, then
     * when no one is using the interface and all references have
     * been released, the finalize function for the interface's default
     * vtable (the {@code class_finalize} member of {@link TypeInfo}) will be called.
     * @param gIface the default vtable
     *     structure for an interface, as returned by g_type_default_interface_ref()
     */
    public static void typeDefaultInterfaceUnref(@NotNull org.gtk.gobject.TypeInterface gIface) {
        java.util.Objects.requireNonNull(gIface, "Parameter 'gIface' must not be null");
        try {
            DowncallHandles.g_type_default_interface_unref.invokeExact(
                    gIface.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the length of the ancestry of the passed in type. This
     * includes the type itself, so that e.g. a fundamental type has depth 1.
     * @param type a {@link Type}
     * @return the depth of {@code type}
     */
    public static int typeDepth(@NotNull org.gtk.glib.Type type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_type_depth.invokeExact(
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
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
     * @param type a {@link Type}
     */
    public static void typeEnsure(@NotNull org.gtk.glib.Type type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        try {
            DowncallHandles.g_type_ensure.invokeExact(
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Frees an instance of a type, returning it to the instance pool for
     * the type, if there is one.
     * <p>
     * Like g_type_create_instance(), this function is reserved for
     * implementors of fundamental types.
     * @param instance an instance of a type
     */
    public static void typeFreeInstance(@NotNull org.gtk.gobject.TypeInstance instance) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        try {
            DowncallHandles.g_type_free_instance.invokeExact(
                    instance.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Look up the type ID from a given type name, returning 0 if no type
     * has been registered under this name (this is the preferred method
     * to find out by name whether a specific type has been registered
     * yet).
     * @param name type name to look up
     * @return corresponding type ID or 0
     */
    public static @NotNull org.gtk.glib.Type typeFromName(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_type_from_name.invokeExact(
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Internal function, used to extract the fundamental type ID portion.
     * Use G_TYPE_FUNDAMENTAL() instead.
     * @param typeId valid type ID
     * @return fundamental type ID
     */
    public static @NotNull org.gtk.glib.Type typeFundamental(@NotNull org.gtk.glib.Type typeId) {
        java.util.Objects.requireNonNull(typeId, "Parameter 'typeId' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_type_fundamental.invokeExact(
                    typeId.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Returns the next free fundamental type id which can be used to
     * register a new fundamental type with g_type_register_fundamental().
     * The returned type ID represents the highest currently registered
     * fundamental type identifier.
     * @return the next available fundamental type ID to be registered,
     *     or 0 if the type system ran out of fundamental type IDs
     */
    public static @NotNull org.gtk.glib.Type typeFundamentalNext() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_type_fundamental_next.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Returns the number of instances allocated of the particular type;
     * this is only available if GLib is built with debugging support and
     * the instance_count debug flag is set (by setting the GOBJECT_DEBUG
     * variable to include instance-count).
     * @param type a {@link Type}
     * @return the number of instances allocated of the given type;
     *   if instance counts are not available, returns 0.
     */
    public static int typeGetInstanceCount(@NotNull org.gtk.glib.Type type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_type_get_instance_count.invokeExact(
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns the {@link TypePlugin} structure for {@code type}.
     * @param type {@link Type} to retrieve the plugin for
     * @return the corresponding plugin
     *     if {@code type} is a dynamic type, {@code null} otherwise
     */
    public static @NotNull org.gtk.gobject.TypePlugin typeGetPlugin(@NotNull org.gtk.glib.Type type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_get_plugin.invokeExact(
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.TypePlugin.TypePluginImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Obtains data which has previously been attached to {@code type}
     * with g_type_set_qdata().
     * <p>
     * Note that this does not take subtyping into account; data
     * attached to one type with g_type_set_qdata() cannot
     * be retrieved from a subtype using g_type_get_qdata().
     * @param type a {@link Type}
     * @param quark a {@link org.gtk.glib.Quark} id to identify the data
     * @return the data, or {@code null} if no data was found
     */
    public static @Nullable java.lang.foreign.MemoryAddress typeGetQdata(@NotNull org.gtk.glib.Type type, @NotNull org.gtk.glib.Quark quark) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(quark, "Parameter 'quark' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_get_qdata.invokeExact(
                    type.getValue().longValue(),
                    quark.getValue().intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Returns an opaque serial number that represents the state of the set
     * of registered types. Any time a type is registered this serial changes,
     * which means you can cache information based on type lookups (such as
     * g_type_from_name()) and know if the cache is still valid at a later
     * time by comparing the current serial with the one at the type lookup.
     * @return An unsigned int, representing the state of type registrations
     */
    public static int typeGetTypeRegistrationSerial() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_type_get_type_registration_serial.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * This function used to initialise the type system.  Since GLib 2.36,
     * the type system is initialised automatically and this function does
     * nothing.
     * @deprecated the type system is now initialised automatically
     */
    @Deprecated
    public static void typeInit() {
        try {
            DowncallHandles.g_type_init.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This function used to initialise the type system with debugging
     * flags.  Since GLib 2.36, the type system is initialised automatically
     * and this function does nothing.
     * <p>
     * If you need to enable debugging features, use the GOBJECT_DEBUG
     * environment variable.
     * @param debugFlags bitwise combination of {@link TypeDebugFlags} values for
     *     debugging purposes
     * @deprecated the type system is now initialised automatically
     */
    @Deprecated
    public static void typeInitWithDebugFlags(@NotNull org.gtk.gobject.TypeDebugFlags debugFlags) {
        java.util.Objects.requireNonNull(debugFlags, "Parameter 'debugFlags' must not be null");
        try {
            DowncallHandles.g_type_init_with_debug_flags.invokeExact(
                    debugFlags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds {@code prerequisite_type} to the list of prerequisites of {@code interface_type}.
     * This means that any type implementing {@code interface_type} must also implement
     * {@code prerequisite_type}. Prerequisites can be thought of as an alternative to
     * interface derivation (which GType doesn't support). An interface can have
     * at most one instantiatable prerequisite type.
     * @param interfaceType {@link Type} value of an interface type
     * @param prerequisiteType {@link Type} value of an interface or instantiatable type
     */
    public static void typeInterfaceAddPrerequisite(@NotNull org.gtk.glib.Type interfaceType, @NotNull org.gtk.glib.Type prerequisiteType) {
        java.util.Objects.requireNonNull(interfaceType, "Parameter 'interfaceType' must not be null");
        java.util.Objects.requireNonNull(prerequisiteType, "Parameter 'prerequisiteType' must not be null");
        try {
            DowncallHandles.g_type_interface_add_prerequisite.invokeExact(
                    interfaceType.getValue().longValue(),
                    prerequisiteType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the {@link TypePlugin} structure for the dynamic interface
     * {@code interface_type} which has been added to {@code instance_type}, or {@code null}
     * if {@code interface_type} has not been added to {@code instance_type} or does
     * not have a {@link TypePlugin} structure. See g_type_add_interface_dynamic().
     * @param instanceType {@link Type} of an instantiatable type
     * @param interfaceType {@link Type} of an interface type
     * @return the {@link TypePlugin} for the dynamic
     *     interface {@code interface_type} of {@code instance_type}
     */
    public static @NotNull org.gtk.gobject.TypePlugin typeInterfaceGetPlugin(@NotNull org.gtk.glib.Type instanceType, @NotNull org.gtk.glib.Type interfaceType) {
        java.util.Objects.requireNonNull(instanceType, "Parameter 'instanceType' must not be null");
        java.util.Objects.requireNonNull(interfaceType, "Parameter 'interfaceType' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_interface_get_plugin.invokeExact(
                    instanceType.getValue().longValue(),
                    interfaceType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.TypePlugin.TypePluginImpl(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the most specific instantiatable prerequisite of an
     * interface type. If the interface type has no instantiatable
     * prerequisite, {@code G_TYPE_INVALID} is returned.
     * <p>
     * See g_type_interface_add_prerequisite() for more information
     * about prerequisites.
     * @param interfaceType an interface type
     * @return the instantiatable prerequisite type or {@code G_TYPE_INVALID} if none
     */
    public static @NotNull org.gtk.glib.Type typeInterfaceInstantiatablePrerequisite(@NotNull org.gtk.glib.Type interfaceType) {
        java.util.Objects.requireNonNull(interfaceType, "Parameter 'interfaceType' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_type_interface_instantiatable_prerequisite.invokeExact(
                    interfaceType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Returns the {@link TypeInterface} structure of an interface to which the
     * passed in class conforms.
     * @param instanceClass a {@link TypeClass} structure
     * @param ifaceType an interface ID which this class conforms to
     * @return the {@link TypeInterface}
     *     structure of {@code iface_type} if implemented by {@code instance_class}, {@code null}
     *     otherwise
     */
    public static @NotNull org.gtk.gobject.TypeInterface typeInterfacePeek(@NotNull org.gtk.gobject.TypeClass instanceClass, @NotNull org.gtk.glib.Type ifaceType) {
        java.util.Objects.requireNonNull(instanceClass, "Parameter 'instanceClass' must not be null");
        java.util.Objects.requireNonNull(ifaceType, "Parameter 'ifaceType' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_interface_peek.invokeExact(
                    instanceClass.handle(),
                    ifaceType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.TypeInterface(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the prerequisites of an interfaces type.
     * @param interfaceType an interface type
     * @param nPrerequisites location to return the number
     *     of prerequisites, or {@code null}
     * @return a
     *     newly-allocated zero-terminated array of {@link Type} containing
     *     the prerequisites of {@code interface_type}
     */
    public static @NotNull org.gtk.glib.Type[] typeInterfacePrerequisites(@NotNull org.gtk.glib.Type interfaceType, Out<Integer> nPrerequisites) {
        java.util.Objects.requireNonNull(interfaceType, "Parameter 'interfaceType' must not be null");
        java.util.Objects.requireNonNull(nPrerequisites, "Parameter 'nPrerequisites' must not be null");
        MemorySegment nPrerequisitesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_interface_prerequisites.invokeExact(
                    interfaceType.getValue().longValue(),
                    (Addressable) nPrerequisitesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nPrerequisites.set(nPrerequisitesPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.gtk.glib.Type[] resultARRAY = new org.gtk.glib.Type[nPrerequisites.get().intValue()];
        for (int I = 0; I < nPrerequisites.get().intValue(); I++) {
            var OBJ = RESULT.get(Interop.valueLayout.C_LONG, I);
            resultARRAY[I] = new org.gtk.glib.Type(OBJ);
        }
        return resultARRAY;
    }
    
    /**
     * Return a newly allocated and 0-terminated array of type IDs, listing
     * the interface types that {@code type} conforms to.
     * @param type the type to list interface types for
     * @param nInterfaces location to store the length of
     *     the returned array, or {@code null}
     * @return Newly allocated
     *     and 0-terminated array of interface types, free with g_free()
     */
    public static @NotNull org.gtk.glib.Type[] typeInterfaces(@NotNull org.gtk.glib.Type type, Out<Integer> nInterfaces) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(nInterfaces, "Parameter 'nInterfaces' must not be null");
        MemorySegment nInterfacesPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_interfaces.invokeExact(
                    type.getValue().longValue(),
                    (Addressable) nInterfacesPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        nInterfaces.set(nInterfacesPOINTER.get(Interop.valueLayout.C_INT, 0));
        org.gtk.glib.Type[] resultARRAY = new org.gtk.glib.Type[nInterfaces.get().intValue()];
        for (int I = 0; I < nInterfaces.get().intValue(); I++) {
            var OBJ = RESULT.get(Interop.valueLayout.C_LONG, I);
            resultARRAY[I] = new org.gtk.glib.Type(OBJ);
        }
        return resultARRAY;
    }
    
    /**
     * If {@code is_a_type} is a derivable type, check whether {@code type} is a
     * descendant of {@code is_a_type}. If {@code is_a_type} is an interface, check
     * whether {@code type} conforms to it.
     * @param type type to check ancestry for
     * @param isAType possible ancestor of {@code type} or interface that {@code type}
     *     could conform to
     * @return {@code true} if {@code type} is a {@code is_a_type}
     */
    public static boolean typeIsA(@NotNull org.gtk.glib.Type type, @NotNull org.gtk.glib.Type isAType) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(isAType, "Parameter 'isAType' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_type_is_a.invokeExact(
                    type.getValue().longValue(),
                    isAType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the unique name that is assigned to a type ID.  Note that this
     * function (like all other GType API) cannot cope with invalid type
     * IDs. {@code G_TYPE_INVALID} may be passed to this function, as may be any
     * other validly registered type ID, but randomized type IDs should
     * not be passed in and will most likely lead to a crash.
     * @param type type to return name for
     * @return static type name or {@code null}
     */
    public static @NotNull java.lang.String typeName(@NotNull org.gtk.glib.Type type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_name.invokeExact(
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    public static @NotNull java.lang.String typeNameFromClass(@NotNull org.gtk.gobject.TypeClass gClass) {
        java.util.Objects.requireNonNull(gClass, "Parameter 'gClass' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_name_from_class.invokeExact(
                    gClass.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    public static @NotNull java.lang.String typeNameFromInstance(@NotNull org.gtk.gobject.TypeInstance instance) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_name_from_instance.invokeExact(
                    instance.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Given a {@code leaf_type} and a {@code root_type} which is contained in its
     * ancestry, return the type that {@code root_type} is the immediate parent
     * of. In other words, this function determines the type that is
     * derived directly from {@code root_type} which is also a base class of
     * {@code leaf_type}.  Given a root type and a leaf type, this function can
     * be used to determine the types and order in which the leaf type is
     * descended from the root type.
     * @param leafType descendant of {@code root_type} and the type to be returned
     * @param rootType immediate parent of the returned type
     * @return immediate child of {@code root_type} and ancestor of {@code leaf_type}
     */
    public static @NotNull org.gtk.glib.Type typeNextBase(@NotNull org.gtk.glib.Type leafType, @NotNull org.gtk.glib.Type rootType) {
        java.util.Objects.requireNonNull(leafType, "Parameter 'leafType' must not be null");
        java.util.Objects.requireNonNull(rootType, "Parameter 'rootType' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_type_next_base.invokeExact(
                    leafType.getValue().longValue(),
                    rootType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Return the direct parent type of the passed in type. If the passed
     * in type has no parent, i.e. is a fundamental type, 0 is returned.
     * @param type the derived type
     * @return the parent type
     */
    public static @NotNull org.gtk.glib.Type typeParent(@NotNull org.gtk.glib.Type type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_type_parent.invokeExact(
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Get the corresponding quark of the type IDs name.
     * @param type type to return quark of type name for
     * @return the type names quark or 0
     */
    public static @NotNull org.gtk.glib.Quark typeQname(@NotNull org.gtk.glib.Type type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_type_qname.invokeExact(
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    /**
     * Queries the type system for information about a specific type.
     * This function will fill in a user-provided structure to hold
     * type-specific information. If an invalid {@link Type} is passed in, the
     * {@code type} member of the {@link TypeQuery} is 0. All members filled into the
     * {@link TypeQuery} structure should be considered constant and have to be
     * left untouched.
     * @param type {@link Type} of a static, classed type
     * @param query a user provided structure that is
     *     filled in with constant values upon success
     */
    public static void typeQuery(@NotNull org.gtk.glib.Type type, @NotNull org.gtk.gobject.TypeQuery query) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(query, "Parameter 'query' must not be null");
        try {
            DowncallHandles.g_type_query.invokeExact(
                    type.getValue().longValue(),
                    query.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Registers {@code type_name} as the name of a new dynamic type derived from
     * {@code parent_type}.  The type system uses the information contained in the
     * {@link TypePlugin} structure pointed to by {@code plugin} to manage the type and its
     * instances (if not abstract).  The value of {@code flags} determines the nature
     * (e.g. abstract or not) of the type.
     * @param parentType type from which this type will be derived
     * @param typeName 0-terminated string used as the name of the new type
     * @param plugin {@link TypePlugin} structure to retrieve the {@link TypeInfo} from
     * @param flags bitwise combination of {@link TypeFlags} values
     * @return the new type identifier or {@code G_TYPE_INVALID} if registration failed
     */
    public static @NotNull org.gtk.glib.Type typeRegisterDynamic(@NotNull org.gtk.glib.Type parentType, @NotNull java.lang.String typeName, @NotNull org.gtk.gobject.TypePlugin plugin, @NotNull org.gtk.gobject.TypeFlags flags) {
        java.util.Objects.requireNonNull(parentType, "Parameter 'parentType' must not be null");
        java.util.Objects.requireNonNull(typeName, "Parameter 'typeName' must not be null");
        java.util.Objects.requireNonNull(plugin, "Parameter 'plugin' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_type_register_dynamic.invokeExact(
                    parentType.getValue().longValue(),
                    Interop.allocateNativeString(typeName),
                    plugin.handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Registers {@code type_id} as the predefined identifier and {@code type_name} as the
     * name of a fundamental type. If {@code type_id} is already registered, or a
     * type named {@code type_name} is already registered, the behaviour is undefined.
     * The type system uses the information contained in the {@link TypeInfo} structure
     * pointed to by {@code info} and the {@link TypeFundamentalInfo} structure pointed to by
     * {@code finfo} to manage the type and its instances. The value of {@code flags} determines
     * additional characteristics of the fundamental type.
     * @param typeId a predefined type identifier
     * @param typeName 0-terminated string used as the name of the new type
     * @param info {@link TypeInfo} structure for this type
     * @param finfo {@link TypeFundamentalInfo} structure for this type
     * @param flags bitwise combination of {@link TypeFlags} values
     * @return the predefined type identifier
     */
    public static @NotNull org.gtk.glib.Type typeRegisterFundamental(@NotNull org.gtk.glib.Type typeId, @NotNull java.lang.String typeName, @NotNull org.gtk.gobject.TypeInfo info, @NotNull org.gtk.gobject.TypeFundamentalInfo finfo, @NotNull org.gtk.gobject.TypeFlags flags) {
        java.util.Objects.requireNonNull(typeId, "Parameter 'typeId' must not be null");
        java.util.Objects.requireNonNull(typeName, "Parameter 'typeName' must not be null");
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        java.util.Objects.requireNonNull(finfo, "Parameter 'finfo' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_type_register_fundamental.invokeExact(
                    typeId.getValue().longValue(),
                    Interop.allocateNativeString(typeName),
                    info.handle(),
                    finfo.handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Registers {@code type_name} as the name of a new static type derived from
     * {@code parent_type}. The type system uses the information contained in the
     * {@link TypeInfo} structure pointed to by {@code info} to manage the type and its
     * instances (if not abstract). The value of {@code flags} determines the nature
     * (e.g. abstract or not) of the type.
     * @param parentType type from which this type will be derived
     * @param typeName 0-terminated string used as the name of the new type
     * @param info {@link TypeInfo} structure for this type
     * @param flags bitwise combination of {@link TypeFlags} values
     * @return the new type identifier
     */
    public static @NotNull org.gtk.glib.Type typeRegisterStatic(@NotNull org.gtk.glib.Type parentType, @NotNull java.lang.String typeName, @NotNull org.gtk.gobject.TypeInfo info, @NotNull org.gtk.gobject.TypeFlags flags) {
        java.util.Objects.requireNonNull(parentType, "Parameter 'parentType' must not be null");
        java.util.Objects.requireNonNull(typeName, "Parameter 'typeName' must not be null");
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        java.util.Objects.requireNonNull(flags, "Parameter 'flags' must not be null");
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_type_register_static.invokeExact(
                    parentType.getValue().longValue(),
                    Interop.allocateNativeString(typeName),
                    info.handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Registers {@code type_name} as the name of a new static type derived from
     * {@code parent_type}.  The value of {@code flags} determines the nature (e.g.
     * abstract or not) of the type. It works by filling a {@link TypeInfo}
     * struct and calling g_type_register_static().
     * @param parentType type from which this type will be derived
     * @param typeName 0-terminated string used as the name of the new type
     * @param classSize size of the class structure (see {@link TypeInfo})
     * @param classInit location of the class initialization function (see {@link TypeInfo})
     * @param instanceSize size of the instance structure (see {@link TypeInfo})
     * @param instanceInit location of the instance initialization function (see {@link TypeInfo})
     * @param flags bitwise combination of {@link TypeFlags} values
     * @return the new type identifier
     */
    public static @NotNull org.gtk.glib.Type typeRegisterStaticSimple(@NotNull org.gtk.glib.Type parentType, @NotNull java.lang.String typeName, int classSize, @NotNull org.gtk.gobject.ClassInitFunc classInit, int instanceSize, @NotNull org.gtk.gobject.InstanceInitFunc instanceInit, @NotNull org.gtk.gobject.TypeFlags flags) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Removes a previously installed {@link TypeClassCacheFunc}. The cache
     * maintained by {@code cache_func} has to be empty when calling
     * g_type_remove_class_cache_func() to avoid leaks.
     * @param cacheFunc a {@link TypeClassCacheFunc}
     */
    public static void typeRemoveClassCacheFunc(@NotNull org.gtk.gobject.TypeClassCacheFunc cacheFunc) {
        java.util.Objects.requireNonNull(cacheFunc, "Parameter 'cacheFunc' must not be null");
        try {
            DowncallHandles.g_type_remove_class_cache_func.invokeExact(
                    (Addressable) (Interop.registerCallback(cacheFunc)),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbTypeClassCacheFunc",
                            MethodType.methodType(int.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes an interface check function added with
     * g_type_add_interface_check().
     * @param checkFunc callback function passed to g_type_add_interface_check()
     */
    public static void typeRemoveInterfaceCheck(@NotNull org.gtk.gobject.TypeInterfaceCheckFunc checkFunc) {
        java.util.Objects.requireNonNull(checkFunc, "Parameter 'checkFunc' must not be null");
        try {
            DowncallHandles.g_type_remove_interface_check.invokeExact(
                    (Addressable) (Interop.registerCallback(checkFunc)),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(GObject.Callbacks.class, "cbTypeInterfaceCheckFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Attaches arbitrary data to a type.
     * @param type a {@link Type}
     * @param quark a {@link org.gtk.glib.Quark} id to identify the data
     * @param data the data
     */
    public static void typeSetQdata(@NotNull org.gtk.glib.Type type, @NotNull org.gtk.glib.Quark quark, @Nullable java.lang.foreign.MemoryAddress data) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        java.util.Objects.requireNonNull(quark, "Parameter 'quark' must not be null");
        try {
            DowncallHandles.g_type_set_qdata.invokeExact(
                    type.getValue().longValue(),
                    quark.getValue().intValue(),
                    (Addressable) data);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static boolean typeTestFlags(@NotNull org.gtk.glib.Type type, int flags) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_type_test_flags.invokeExact(
                    type.getValue().longValue(),
                    flags);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Returns the location of the {@link TypeValueTable} associated with {@code type}.
     * <p>
     * Note that this function should only be used from source code
     * that implements or has internal knowledge of the implementation of
     * {@code type}.
     * @param type a {@link Type}
     * @return location of the {@link TypeValueTable} associated with {@code type} or
     *     {@code null} if there is no {@link TypeValueTable} associated with {@code type}
     */
    public static @NotNull org.gtk.gobject.TypeValueTable typeValueTablePeek(@NotNull org.gtk.glib.Type type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_type_value_table_peek.invokeExact(
                    type.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.TypeValueTable(RESULT, Ownership.UNKNOWN);
    }
    
    /**
     * Registers a value transformation function for use in g_value_transform().
     * A previously registered transformation function for {@code src_type} and {@code dest_type}
     * will be replaced.
     * @param srcType Source type.
     * @param destType Target type.
     * @param transformFunc a function which transforms values of type {@code src_type}
     *  into value of type {@code dest_type}
     */
    public static void valueRegisterTransformFunc(@NotNull org.gtk.glib.Type srcType, @NotNull org.gtk.glib.Type destType, @NotNull org.gtk.gobject.ValueTransform transformFunc) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Returns whether a {@link Value} of type {@code src_type} can be copied into
     * a {@link Value} of type {@code dest_type}.
     * @param srcType source type to be copied.
     * @param destType destination type for copying.
     * @return {@code true} if g_value_copy() is possible with {@code src_type} and {@code dest_type}.
     */
    public static boolean valueTypeCompatible(@NotNull org.gtk.glib.Type srcType, @NotNull org.gtk.glib.Type destType) {
        java.util.Objects.requireNonNull(srcType, "Parameter 'srcType' must not be null");
        java.util.Objects.requireNonNull(destType, "Parameter 'destType' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_value_type_compatible.invokeExact(
                    srcType.getValue().longValue(),
                    destType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Check whether g_value_transform() is able to transform values
     * of type {@code src_type} into values of type {@code dest_type}. Note that for
     * the types to be transformable, they must be compatible or a
     * transformation function must be registered.
     * @param srcType Source type.
     * @param destType Target type.
     * @return {@code true} if the transformation is possible, {@code false} otherwise.
     */
    public static boolean valueTypeTransformable(@NotNull org.gtk.glib.Type srcType, @NotNull org.gtk.glib.Type destType) {
        java.util.Objects.requireNonNull(srcType, "Parameter 'srcType' must not be null");
        java.util.Objects.requireNonNull(destType, "Parameter 'destType' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_value_type_transformable.invokeExact(
                    srcType.getValue().longValue(),
                    destType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_boxed_copy = Interop.downcallHandle(
            "g_boxed_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_boxed_free = Interop.downcallHandle(
            "g_boxed_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_boxed_type_register_static = Interop.downcallHandle(
            "g_boxed_type_register_static",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_BOOLEAN__BOXED_BOXED = Interop.downcallHandle(
            "g_cclosure_marshal_BOOLEAN__BOXED_BOXED",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_BOOLEAN__FLAGS = Interop.downcallHandle(
            "g_cclosure_marshal_BOOLEAN__FLAGS",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_STRING__OBJECT_POINTER = Interop.downcallHandle(
            "g_cclosure_marshal_STRING__OBJECT_POINTER",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__BOOLEAN = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__BOOLEAN",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__BOXED = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__BOXED",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__CHAR = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__CHAR",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__DOUBLE = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__DOUBLE",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__ENUM = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__ENUM",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__FLAGS = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__FLAGS",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__FLOAT = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__FLOAT",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__INT = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__INT",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__LONG = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__LONG",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__OBJECT = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__OBJECT",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__PARAM = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__PARAM",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__POINTER = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__POINTER",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__STRING = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__STRING",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__UCHAR = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__UCHAR",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
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
        
        private static final MethodHandle g_cclosure_marshal_VOID__ULONG = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__ULONG",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__VARIANT = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__VARIANT",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_VOID__VOID = Interop.downcallHandle(
            "g_cclosure_marshal_VOID__VOID",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_cclosure_marshal_generic = Interop.downcallHandle(
            "g_cclosure_marshal_generic",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
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
        
        private static final MethodHandle g_clear_object = Interop.downcallHandle(
            "g_clear_object",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_clear_signal_handler = Interop.downcallHandle(
            "g_clear_signal_handler",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_enum_complete_type_info = Interop.downcallHandle(
            "g_enum_complete_type_info",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_enum_get_value = Interop.downcallHandle(
            "g_enum_get_value",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_enum_get_value_by_name = Interop.downcallHandle(
            "g_enum_get_value_by_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_enum_get_value_by_nick = Interop.downcallHandle(
            "g_enum_get_value_by_nick",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_enum_register_static = Interop.downcallHandle(
            "g_enum_register_static",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_enum_to_string = Interop.downcallHandle(
            "g_enum_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_flags_complete_type_info = Interop.downcallHandle(
            "g_flags_complete_type_info",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_flags_get_first_value = Interop.downcallHandle(
            "g_flags_get_first_value",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_flags_get_value_by_name = Interop.downcallHandle(
            "g_flags_get_value_by_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_flags_get_value_by_nick = Interop.downcallHandle(
            "g_flags_get_value_by_nick",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_flags_register_static = Interop.downcallHandle(
            "g_flags_register_static",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_flags_to_string = Interop.downcallHandle(
            "g_flags_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_gtype_get_type = Interop.downcallHandle(
            "g_gtype_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_param_spec_boolean = Interop.downcallHandle(
            "g_param_spec_boolean",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_param_spec_boxed = Interop.downcallHandle(
            "g_param_spec_boxed",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_param_spec_char = Interop.downcallHandle(
            "g_param_spec_char",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_param_spec_double = Interop.downcallHandle(
            "g_param_spec_double",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_param_spec_enum = Interop.downcallHandle(
            "g_param_spec_enum",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_param_spec_flags = Interop.downcallHandle(
            "g_param_spec_flags",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_param_spec_float = Interop.downcallHandle(
            "g_param_spec_float",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_FLOAT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_param_spec_gtype = Interop.downcallHandle(
            "g_param_spec_gtype",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_param_spec_int = Interop.downcallHandle(
            "g_param_spec_int",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_param_spec_int64 = Interop.downcallHandle(
            "g_param_spec_int64",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_param_spec_long = Interop.downcallHandle(
            "g_param_spec_long",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_param_spec_object = Interop.downcallHandle(
            "g_param_spec_object",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_param_spec_override = Interop.downcallHandle(
            "g_param_spec_override",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_param_spec_param = Interop.downcallHandle(
            "g_param_spec_param",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_param_spec_pointer = Interop.downcallHandle(
            "g_param_spec_pointer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_param_spec_string = Interop.downcallHandle(
            "g_param_spec_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_param_spec_uchar = Interop.downcallHandle(
            "g_param_spec_uchar",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_param_spec_uint = Interop.downcallHandle(
            "g_param_spec_uint",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_param_spec_uint64 = Interop.downcallHandle(
            "g_param_spec_uint64",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_param_spec_ulong = Interop.downcallHandle(
            "g_param_spec_ulong",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_param_spec_unichar = Interop.downcallHandle(
            "g_param_spec_unichar",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_param_spec_value_array = Interop.downcallHandle(
            "g_param_spec_value_array",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_param_spec_variant = Interop.downcallHandle(
            "g_param_spec_variant",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_param_type_register_static = Interop.downcallHandle(
            "g_param_type_register_static",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_param_value_convert = Interop.downcallHandle(
            "g_param_value_convert",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_param_value_defaults = Interop.downcallHandle(
            "g_param_value_defaults",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_param_value_is_valid = Interop.downcallHandle(
            "g_param_value_is_valid",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_param_value_set_default = Interop.downcallHandle(
            "g_param_value_set_default",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_param_value_validate = Interop.downcallHandle(
            "g_param_value_validate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_param_values_cmp = Interop.downcallHandle(
            "g_param_values_cmp",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_pointer_type_register_static = Interop.downcallHandle(
            "g_pointer_type_register_static",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_signal_accumulator_first_wins = Interop.downcallHandle(
            "g_signal_accumulator_first_wins",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_signal_accumulator_true_handled = Interop.downcallHandle(
            "g_signal_accumulator_true_handled",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_signal_add_emission_hook = Interop.downcallHandle(
            "g_signal_add_emission_hook",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_signal_chain_from_overridden = Interop.downcallHandle(
            "g_signal_chain_from_overridden",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_signal_chain_from_overridden_handler = Interop.downcallHandle(
            "g_signal_chain_from_overridden_handler",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle g_signal_connect_closure = Interop.downcallHandle(
            "g_signal_connect_closure",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_signal_connect_closure_by_id = Interop.downcallHandle(
            "g_signal_connect_closure_by_id",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_signal_connect_data = Interop.downcallHandle(
            "g_signal_connect_data",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_signal_connect_object = Interop.downcallHandle(
            "g_signal_connect_object",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_signal_emit = Interop.downcallHandle(
            "g_signal_emit",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            true
        );
        
        private static final MethodHandle g_signal_emit_by_name = Interop.downcallHandle(
            "g_signal_emit_by_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle g_signal_emit_valist = Interop.downcallHandle(
            "g_signal_emit_valist",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_signal_emitv = Interop.downcallHandle(
            "g_signal_emitv",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_signal_get_invocation_hint = Interop.downcallHandle(
            "g_signal_get_invocation_hint",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_signal_handler_block = Interop.downcallHandle(
            "g_signal_handler_block",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_signal_handler_disconnect = Interop.downcallHandle(
            "g_signal_handler_disconnect",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_signal_handler_find = Interop.downcallHandle(
            "g_signal_handler_find",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_signal_handler_is_connected = Interop.downcallHandle(
            "g_signal_handler_is_connected",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_signal_handler_unblock = Interop.downcallHandle(
            "g_signal_handler_unblock",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_signal_handlers_block_matched = Interop.downcallHandle(
            "g_signal_handlers_block_matched",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_signal_handlers_destroy = Interop.downcallHandle(
            "g_signal_handlers_destroy",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_signal_handlers_disconnect_matched = Interop.downcallHandle(
            "g_signal_handlers_disconnect_matched",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_signal_handlers_unblock_matched = Interop.downcallHandle(
            "g_signal_handlers_unblock_matched",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_signal_has_handler_pending = Interop.downcallHandle(
            "g_signal_has_handler_pending",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_signal_is_valid_name = Interop.downcallHandle(
            "g_signal_is_valid_name",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_signal_list_ids = Interop.downcallHandle(
            "g_signal_list_ids",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_signal_lookup = Interop.downcallHandle(
            "g_signal_lookup",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_signal_name = Interop.downcallHandle(
            "g_signal_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_signal_override_class_closure = Interop.downcallHandle(
            "g_signal_override_class_closure",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_signal_override_class_handler = Interop.downcallHandle(
            "g_signal_override_class_handler",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_signal_parse_name = Interop.downcallHandle(
            "g_signal_parse_name",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_signal_query = Interop.downcallHandle(
            "g_signal_query",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_signal_remove_emission_hook = Interop.downcallHandle(
            "g_signal_remove_emission_hook",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_signal_stop_emission = Interop.downcallHandle(
            "g_signal_stop_emission",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_signal_stop_emission_by_name = Interop.downcallHandle(
            "g_signal_stop_emission_by_name",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_signal_type_cclosure_new = Interop.downcallHandle(
            "g_signal_type_cclosure_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_source_set_closure = Interop.downcallHandle(
            "g_source_set_closure",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_source_set_dummy_callback = Interop.downcallHandle(
            "g_source_set_dummy_callback",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_strdup_value_contents = Interop.downcallHandle(
            "g_strdup_value_contents",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_type_add_class_cache_func = Interop.downcallHandle(
            "g_type_add_class_cache_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_type_add_class_private = Interop.downcallHandle(
            "g_type_add_class_private",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_type_add_instance_private = Interop.downcallHandle(
            "g_type_add_instance_private",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_type_add_interface_check = Interop.downcallHandle(
            "g_type_add_interface_check",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_type_add_interface_dynamic = Interop.downcallHandle(
            "g_type_add_interface_dynamic",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_type_add_interface_static = Interop.downcallHandle(
            "g_type_add_interface_static",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_type_check_class_cast = Interop.downcallHandle(
            "g_type_check_class_cast",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_type_check_class_is_a = Interop.downcallHandle(
            "g_type_check_class_is_a",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_type_check_instance = Interop.downcallHandle(
            "g_type_check_instance",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_type_check_instance_cast = Interop.downcallHandle(
            "g_type_check_instance_cast",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_type_check_instance_is_a = Interop.downcallHandle(
            "g_type_check_instance_is_a",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_type_check_instance_is_fundamentally_a = Interop.downcallHandle(
            "g_type_check_instance_is_fundamentally_a",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_type_check_is_value_type = Interop.downcallHandle(
            "g_type_check_is_value_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_type_check_value = Interop.downcallHandle(
            "g_type_check_value",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_type_check_value_holds = Interop.downcallHandle(
            "g_type_check_value_holds",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_type_children = Interop.downcallHandle(
            "g_type_children",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_type_class_adjust_private_offset = Interop.downcallHandle(
            "g_type_class_adjust_private_offset",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_type_class_peek = Interop.downcallHandle(
            "g_type_class_peek",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_type_class_peek_static = Interop.downcallHandle(
            "g_type_class_peek_static",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_type_class_ref = Interop.downcallHandle(
            "g_type_class_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_type_create_instance = Interop.downcallHandle(
            "g_type_create_instance",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_type_default_interface_peek = Interop.downcallHandle(
            "g_type_default_interface_peek",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_type_default_interface_ref = Interop.downcallHandle(
            "g_type_default_interface_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_type_default_interface_unref = Interop.downcallHandle(
            "g_type_default_interface_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_type_depth = Interop.downcallHandle(
            "g_type_depth",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_type_ensure = Interop.downcallHandle(
            "g_type_ensure",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_type_free_instance = Interop.downcallHandle(
            "g_type_free_instance",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_type_from_name = Interop.downcallHandle(
            "g_type_from_name",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_type_fundamental = Interop.downcallHandle(
            "g_type_fundamental",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_type_fundamental_next = Interop.downcallHandle(
            "g_type_fundamental_next",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_type_get_instance_count = Interop.downcallHandle(
            "g_type_get_instance_count",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_type_get_plugin = Interop.downcallHandle(
            "g_type_get_plugin",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_type_get_qdata = Interop.downcallHandle(
            "g_type_get_qdata",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_type_get_type_registration_serial = Interop.downcallHandle(
            "g_type_get_type_registration_serial",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_type_init = Interop.downcallHandle(
            "g_type_init",
            FunctionDescriptor.ofVoid(),
            false
        );
        
        private static final MethodHandle g_type_init_with_debug_flags = Interop.downcallHandle(
            "g_type_init_with_debug_flags",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_type_interface_add_prerequisite = Interop.downcallHandle(
            "g_type_interface_add_prerequisite",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_type_interface_get_plugin = Interop.downcallHandle(
            "g_type_interface_get_plugin",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_type_interface_instantiatable_prerequisite = Interop.downcallHandle(
            "g_type_interface_instantiatable_prerequisite",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_type_interface_peek = Interop.downcallHandle(
            "g_type_interface_peek",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_type_interface_prerequisites = Interop.downcallHandle(
            "g_type_interface_prerequisites",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_type_interfaces = Interop.downcallHandle(
            "g_type_interfaces",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_type_is_a = Interop.downcallHandle(
            "g_type_is_a",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_type_name = Interop.downcallHandle(
            "g_type_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_type_name_from_class = Interop.downcallHandle(
            "g_type_name_from_class",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_type_name_from_instance = Interop.downcallHandle(
            "g_type_name_from_instance",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_type_next_base = Interop.downcallHandle(
            "g_type_next_base",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_type_parent = Interop.downcallHandle(
            "g_type_parent",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_type_qname = Interop.downcallHandle(
            "g_type_qname",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_type_query = Interop.downcallHandle(
            "g_type_query",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_type_register_dynamic = Interop.downcallHandle(
            "g_type_register_dynamic",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_type_register_fundamental = Interop.downcallHandle(
            "g_type_register_fundamental",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_type_register_static = Interop.downcallHandle(
            "g_type_register_static",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_type_register_static_simple = Interop.downcallHandle(
            "g_type_register_static_simple",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_type_remove_class_cache_func = Interop.downcallHandle(
            "g_type_remove_class_cache_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_type_remove_interface_check = Interop.downcallHandle(
            "g_type_remove_interface_check",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_type_set_qdata = Interop.downcallHandle(
            "g_type_set_qdata",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_type_test_flags = Interop.downcallHandle(
            "g_type_test_flags",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_type_value_table_peek = Interop.downcallHandle(
            "g_type_value_table_peek",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_value_register_transform_func = Interop.downcallHandle(
            "g_value_register_transform_func",
            FunctionDescriptor.ofVoid(Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_type_compatible = Interop.downcallHandle(
            "g_value_type_compatible",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle g_value_type_transformable = Interop.downcallHandle(
            "g_value_type_transformable",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
    }
    
    @ApiStatus.Internal
    public static class Callbacks {
        
        public static void cbToggleNotify(MemoryAddress data, MemoryAddress object, int isLastRef) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (ToggleNotify) Interop.signalRegistry.get(HASH);
            HANDLER.onToggleNotify(new org.gtk.gobject.Object(object, Ownership.NONE), isLastRef != 0);
        }
        
        public static void cbClassInitFunc(MemoryAddress gClass, MemoryAddress classData) {
            int HASH = classData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (ClassInitFunc) Interop.signalRegistry.get(HASH);
            HANDLER.onClassInitFunc(new org.gtk.gobject.TypeClass(gClass, Ownership.NONE));
        }
        
        public static void cbInterfaceInitFunc(MemoryAddress gIface, MemoryAddress ifaceData) {
            int HASH = ifaceData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (InterfaceInitFunc) Interop.signalRegistry.get(HASH);
            HANDLER.onInterfaceInitFunc(new org.gtk.gobject.TypeInterface(gIface, Ownership.NONE));
        }
        
        public static boolean cbSignalAccumulator(MemoryAddress ihint, MemoryAddress returnAccu, MemoryAddress handlerReturn, MemoryAddress userData) {
            int HASH = userData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (SignalAccumulator) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onSignalAccumulator(new org.gtk.gobject.SignalInvocationHint(ihint, Ownership.NONE), new org.gtk.gobject.Value(returnAccu, Ownership.NONE), new org.gtk.gobject.Value(handlerReturn, Ownership.NONE));
            return RESULT;
        }
        
        public static void cbClosureMarshal(MemoryAddress closure, MemoryAddress returnValue, int nParamValues, MemoryAddress paramValues, MemoryAddress invocationHint, MemoryAddress userData) {
            int HASH = userData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (ClosureMarshal) Interop.signalRegistry.get(HASH);
            HANDLER.onClosureMarshal(new org.gtk.gobject.Closure(closure, Ownership.NONE), new org.gtk.gobject.Value(returnValue, Ownership.NONE), nParamValues, new PointerProxy<org.gtk.gobject.Value>(paramValues, org.gtk.gobject.Value.class), invocationHint);
        }
        
        public static void cbClosureNotify(MemoryAddress data, MemoryAddress closure) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (ClosureNotify) Interop.signalRegistry.get(HASH);
            HANDLER.onClosureNotify(new org.gtk.gobject.Closure(closure, Ownership.NONE));
        }
        
        public static boolean cbTypeClassCacheFunc(MemoryAddress cacheData, MemoryAddress gClass) {
            int HASH = cacheData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (TypeClassCacheFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onTypeClassCacheFunc(new org.gtk.gobject.TypeClass(gClass, Ownership.NONE));
            return RESULT;
        }
        
        public static boolean cbBindingTransformFunc(MemoryAddress binding, MemoryAddress fromValue, MemoryAddress toValue, MemoryAddress userData) {
            int HASH = userData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (BindingTransformFunc) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onBindingTransformFunc(new org.gtk.gobject.Binding(binding, Ownership.NONE), new org.gtk.gobject.Value(fromValue, Ownership.NONE), new org.gtk.gobject.Value(toValue, Ownership.NONE));
            return RESULT;
        }
        
        public static void cbClassFinalizeFunc(MemoryAddress gClass, MemoryAddress classData) {
            int HASH = classData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (ClassFinalizeFunc) Interop.signalRegistry.get(HASH);
            HANDLER.onClassFinalizeFunc(new org.gtk.gobject.TypeClass(gClass, Ownership.NONE));
        }
        
        public static boolean cbSignalEmissionHook(MemoryAddress ihint, int nParamValues, MemoryAddress paramValues, MemoryAddress userData) {
            int HASH = userData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (SignalEmissionHook) Interop.signalRegistry.get(HASH);
            var RESULT = HANDLER.onSignalEmissionHook(new org.gtk.gobject.SignalInvocationHint(ihint, Ownership.NONE), nParamValues, new PointerProxy<org.gtk.gobject.Value>(paramValues, org.gtk.gobject.Value.class));
            return RESULT;
        }
        
        public static void cbInterfaceFinalizeFunc(MemoryAddress gIface, MemoryAddress ifaceData) {
            int HASH = ifaceData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (InterfaceFinalizeFunc) Interop.signalRegistry.get(HASH);
            HANDLER.onInterfaceFinalizeFunc(new org.gtk.gobject.TypeInterface(gIface, Ownership.NONE));
        }
        
        public static void cbWeakNotify(MemoryAddress data, MemoryAddress whereTheObjectWas) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (WeakNotify) Interop.signalRegistry.get(HASH);
            HANDLER.onWeakNotify(new org.gtk.gobject.Object(whereTheObjectWas, Ownership.NONE));
        }
        
        public static void cbTypeInterfaceCheckFunc(MemoryAddress checkData, MemoryAddress gIface) {
            int HASH = checkData.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (TypeInterfaceCheckFunc) Interop.signalRegistry.get(HASH);
            HANDLER.onTypeInterfaceCheckFunc(new org.gtk.gobject.TypeInterface(gIface, Ownership.NONE));
        }
    }
}
