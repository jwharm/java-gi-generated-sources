package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An opaque structure used to hold different types of values.
 * <p>
 * The data within the structure has protected scope: it is accessible only
 * to functions within a {@link TypeValueTable} structure, or implementations of
 * the g_value_*() API. That is, code portions which implement new fundamental
 * types.
 * <p>
 * {@link Value} users cannot make any assumptions about how data is stored
 * within the 2 element {@code data} union, and the {@code g_type} member should
 * only be accessed through the G_VALUE_TYPE() macro.
 */
public class Value extends io.github.jwharm.javagi.ResourceBase {

    public Value(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_value_copy = Interop.downcallHandle(
        "g_value_copy",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Copies the value of {@code src_value} into {@code dest_value}.
     */
    public @NotNull void copy(@NotNull Value destValue) {
        try {
            g_value_copy.invokeExact(handle(), destValue.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_dup_boxed = Interop.downcallHandle(
        "g_value_dup_boxed",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the contents of a {@code G_TYPE_BOXED} derived {@link Value}.  Upon getting,
     * the boxed value is duplicated and needs to be later freed with
     * g_boxed_free(), e.g. like: g_boxed_free (G_VALUE_TYPE ({@code value}),
     * return_value);
     */
    public @Nullable java.lang.foreign.MemoryAddress dupBoxed() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_value_dup_boxed.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_value_dup_object = Interop.downcallHandle(
        "g_value_dup_object",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the contents of a {@code G_TYPE_OBJECT} derived {@link Value}, increasing
     * its reference count. If the contents of the {@link Value} are {@code null}, then
     * {@code null} will be returned.
     */
    public @NotNull Object dupObject() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_value_dup_object.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Object(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_value_dup_param = Interop.downcallHandle(
        "g_value_dup_param",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the contents of a {@code G_TYPE_PARAM} {@link Value}, increasing its
     * reference count.
     */
    public @NotNull ParamSpec dupParam() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_value_dup_param.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_value_dup_string = Interop.downcallHandle(
        "g_value_dup_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get a copy the contents of a {@code G_TYPE_STRING} {@link Value}.
     */
    public @NotNull java.lang.String dupString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_value_dup_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_value_dup_variant = Interop.downcallHandle(
        "g_value_dup_variant",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the contents of a variant {@link Value}, increasing its refcount. The returned
     * {@link org.gtk.glib.Variant} is never floating.
     */
    public @Nullable org.gtk.glib.Variant dupVariant() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_value_dup_variant.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Variant(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_value_fits_pointer = Interop.downcallHandle(
        "g_value_fits_pointer",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Determines if {@code value} will fit inside the size of a pointer value.
     * This is an internal function introduced mainly for C marshallers.
     */
    public boolean fitsPointer() {
        int RESULT;
        try {
            RESULT = (int) g_value_fits_pointer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_value_get_boolean = Interop.downcallHandle(
        "g_value_get_boolean",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the contents of a {@code G_TYPE_BOOLEAN} {@link Value}.
     */
    public boolean getBoolean() {
        int RESULT;
        try {
            RESULT = (int) g_value_get_boolean.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_value_get_boxed = Interop.downcallHandle(
        "g_value_get_boxed",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the contents of a {@code G_TYPE_BOXED} derived {@link Value}.
     */
    public @Nullable java.lang.foreign.MemoryAddress getBoxed() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_value_get_boxed.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_value_get_double = Interop.downcallHandle(
        "g_value_get_double",
        FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the contents of a {@code G_TYPE_DOUBLE} {@link Value}.
     */
    public double getDouble() {
        double RESULT;
        try {
            RESULT = (double) g_value_get_double.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_value_get_enum = Interop.downcallHandle(
        "g_value_get_enum",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the contents of a {@code G_TYPE_ENUM} {@link Value}.
     */
    public int getEnum() {
        int RESULT;
        try {
            RESULT = (int) g_value_get_enum.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_value_get_flags = Interop.downcallHandle(
        "g_value_get_flags",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the contents of a {@code G_TYPE_FLAGS} {@link Value}.
     */
    public int getFlags() {
        int RESULT;
        try {
            RESULT = (int) g_value_get_flags.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_value_get_float = Interop.downcallHandle(
        "g_value_get_float",
        FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the contents of a {@code G_TYPE_FLOAT} {@link Value}.
     */
    public float getFloat() {
        float RESULT;
        try {
            RESULT = (float) g_value_get_float.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_value_get_gtype = Interop.downcallHandle(
        "g_value_get_gtype",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the contents of a {@code G_TYPE_GTYPE} {@link Value}.
     */
    public @NotNull org.gtk.gobject.Type getGtype() {
        long RESULT;
        try {
            RESULT = (long) g_value_get_gtype.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Type(RESULT);
    }
    
    private static final MethodHandle g_value_get_int = Interop.downcallHandle(
        "g_value_get_int",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the contents of a {@code G_TYPE_INT} {@link Value}.
     */
    public int getInt() {
        int RESULT;
        try {
            RESULT = (int) g_value_get_int.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_value_get_int64 = Interop.downcallHandle(
        "g_value_get_int64",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the contents of a {@code G_TYPE_INT64} {@link Value}.
     */
    public long getInt64() {
        long RESULT;
        try {
            RESULT = (long) g_value_get_int64.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_value_get_long = Interop.downcallHandle(
        "g_value_get_long",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the contents of a {@code G_TYPE_LONG} {@link Value}.
     */
    public long getLong() {
        long RESULT;
        try {
            RESULT = (long) g_value_get_long.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_value_get_object = Interop.downcallHandle(
        "g_value_get_object",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the contents of a {@code G_TYPE_OBJECT} derived {@link Value}.
     */
    public @NotNull Object getObject() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_value_get_object.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Object(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_value_get_param = Interop.downcallHandle(
        "g_value_get_param",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the contents of a {@code G_TYPE_PARAM} {@link Value}.
     */
    public @NotNull ParamSpec getParam() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_value_get_param.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new ParamSpec(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_value_get_pointer = Interop.downcallHandle(
        "g_value_get_pointer",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the contents of a pointer {@link Value}.
     */
    public @Nullable java.lang.foreign.MemoryAddress getPointer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_value_get_pointer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_value_get_schar = Interop.downcallHandle(
        "g_value_get_schar",
        FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the contents of a {@code G_TYPE_CHAR} {@link Value}.
     */
    public byte getSchar() {
        byte RESULT;
        try {
            RESULT = (byte) g_value_get_schar.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_value_get_string = Interop.downcallHandle(
        "g_value_get_string",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the contents of a {@code G_TYPE_STRING} {@link Value}.
     */
    public @NotNull java.lang.String getString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_value_get_string.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_value_get_uchar = Interop.downcallHandle(
        "g_value_get_uchar",
        FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the contents of a {@code G_TYPE_UCHAR} {@link Value}.
     */
    public byte getUchar() {
        byte RESULT;
        try {
            RESULT = (byte) g_value_get_uchar.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_value_get_uint = Interop.downcallHandle(
        "g_value_get_uint",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the contents of a {@code G_TYPE_UINT} {@link Value}.
     */
    public int getUint() {
        int RESULT;
        try {
            RESULT = (int) g_value_get_uint.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_value_get_uint64 = Interop.downcallHandle(
        "g_value_get_uint64",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the contents of a {@code G_TYPE_UINT64} {@link Value}.
     */
    public long getUint64() {
        long RESULT;
        try {
            RESULT = (long) g_value_get_uint64.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_value_get_ulong = Interop.downcallHandle(
        "g_value_get_ulong",
        FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the contents of a {@code G_TYPE_ULONG} {@link Value}.
     */
    public long getUlong() {
        long RESULT;
        try {
            RESULT = (long) g_value_get_ulong.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_value_get_variant = Interop.downcallHandle(
        "g_value_get_variant",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Get the contents of a variant {@link Value}.
     */
    public @Nullable org.gtk.glib.Variant getVariant() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_value_get_variant.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Variant(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_value_init = Interop.downcallHandle(
        "g_value_init",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Initializes {@code value} with the default value of {@code type}.
     */
    public @NotNull Value init(@NotNull org.gtk.gobject.Type gType) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_value_init.invokeExact(handle(), gType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Value(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_value_init_from_instance = Interop.downcallHandle(
        "g_value_init_from_instance",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initializes and sets {@code value} from an instantiatable type via the
     * value_table's collect_value() function.
     * <p>
     * Note: The {@code value} will be initialised with the exact type of
     * {@code instance}.  If you wish to set the {@code value}'s type to a different GType
     * (such as a parent class GType), you need to manually call
     * g_value_init() and g_value_set_instance().
     */
    public @NotNull void initFromInstance(@NotNull TypeInstance instance) {
        try {
            g_value_init_from_instance.invokeExact(handle(), instance.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_peek_pointer = Interop.downcallHandle(
        "g_value_peek_pointer",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the value contents as pointer. This function asserts that
     * g_value_fits_pointer() returned {@code true} for the passed in value.
     * This is an internal function introduced mainly for C marshallers.
     */
    public @Nullable java.lang.foreign.MemoryAddress peekPointer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_value_peek_pointer.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static final MethodHandle g_value_reset = Interop.downcallHandle(
        "g_value_reset",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Clears the current value in {@code value} and resets it to the default value
     * (as if the value had just been initialized).
     */
    public @NotNull Value reset() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_value_reset.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new Value(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_value_set_boolean = Interop.downcallHandle(
        "g_value_set_boolean",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Set the contents of a {@code G_TYPE_BOOLEAN} {@link Value} to {@code v_boolean}.
     */
    public @NotNull void setBoolean(@NotNull boolean vBoolean) {
        try {
            g_value_set_boolean.invokeExact(handle(), vBoolean ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_set_boxed = Interop.downcallHandle(
        "g_value_set_boxed",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Set the contents of a {@code G_TYPE_BOXED} derived {@link Value} to {@code v_boxed}.
     */
    public @NotNull void setBoxed(@Nullable java.lang.foreign.MemoryAddress vBoxed) {
        try {
            g_value_set_boxed.invokeExact(handle(), vBoxed);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_set_double = Interop.downcallHandle(
        "g_value_set_double",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE)
    );
    
    /**
     * Set the contents of a {@code G_TYPE_DOUBLE} {@link Value} to {@code v_double}.
     */
    public @NotNull void setDouble(@NotNull double vDouble) {
        try {
            g_value_set_double.invokeExact(handle(), vDouble);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_set_enum = Interop.downcallHandle(
        "g_value_set_enum",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Set the contents of a {@code G_TYPE_ENUM} {@link Value} to {@code v_enum}.
     */
    public @NotNull void setEnum(@NotNull int vEnum) {
        try {
            g_value_set_enum.invokeExact(handle(), vEnum);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_set_flags = Interop.downcallHandle(
        "g_value_set_flags",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Set the contents of a {@code G_TYPE_FLAGS} {@link Value} to {@code v_flags}.
     */
    public @NotNull void setFlags(@NotNull int vFlags) {
        try {
            g_value_set_flags.invokeExact(handle(), vFlags);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_set_float = Interop.downcallHandle(
        "g_value_set_float",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT)
    );
    
    /**
     * Set the contents of a {@code G_TYPE_FLOAT} {@link Value} to {@code v_float}.
     */
    public @NotNull void setFloat(@NotNull float vFloat) {
        try {
            g_value_set_float.invokeExact(handle(), vFloat);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_set_gtype = Interop.downcallHandle(
        "g_value_set_gtype",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Set the contents of a {@code G_TYPE_GTYPE} {@link Value} to {@code v_gtype}.
     */
    public @NotNull void setGtype(@NotNull org.gtk.gobject.Type vGtype) {
        try {
            g_value_set_gtype.invokeExact(handle(), vGtype.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_set_instance = Interop.downcallHandle(
        "g_value_set_instance",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets {@code value} from an instantiatable type via the
     * value_table's collect_value() function.
     */
    public @NotNull void setInstance(@Nullable java.lang.foreign.MemoryAddress instance) {
        try {
            g_value_set_instance.invokeExact(handle(), instance);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_set_int = Interop.downcallHandle(
        "g_value_set_int",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Set the contents of a {@code G_TYPE_INT} {@link Value} to {@code v_int}.
     */
    public @NotNull void setInt(@NotNull int vInt) {
        try {
            g_value_set_int.invokeExact(handle(), vInt);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_set_int64 = Interop.downcallHandle(
        "g_value_set_int64",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Set the contents of a {@code G_TYPE_INT64} {@link Value} to {@code v_int64}.
     */
    public @NotNull void setInt64(@NotNull long vInt64) {
        try {
            g_value_set_int64.invokeExact(handle(), vInt64);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_set_interned_string = Interop.downcallHandle(
        "g_value_set_interned_string",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Set the contents of a {@code G_TYPE_STRING} {@link Value} to {@code v_string}.  The string is
     * assumed to be static and interned (canonical, for example from
     * g_intern_string()), and is thus not duplicated when setting the {@link Value}.
     */
    public @NotNull void setInternedString(@Nullable java.lang.String vString) {
        try {
            g_value_set_interned_string.invokeExact(handle(), Interop.allocateNativeString(vString));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_set_long = Interop.downcallHandle(
        "g_value_set_long",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Set the contents of a {@code G_TYPE_LONG} {@link Value} to {@code v_long}.
     */
    public @NotNull void setLong(@NotNull long vLong) {
        try {
            g_value_set_long.invokeExact(handle(), vLong);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_set_object = Interop.downcallHandle(
        "g_value_set_object",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Set the contents of a {@code G_TYPE_OBJECT} derived {@link Value} to {@code v_object}.
     * <p>
     * g_value_set_object() increases the reference count of {@code v_object}
     * (the {@link Value} holds a reference to {@code v_object}).  If you do not wish
     * to increase the reference count of the object (i.e. you wish to
     * pass your current reference to the {@link Value} because you no longer
     * need it), use g_value_take_object() instead.
     * <p>
     * It is important that your {@link Value} holds a reference to {@code v_object} (either its
     * own, or one it has taken) to ensure that the object won't be destroyed while
     * the {@link Value} still exists).
     */
    public @NotNull void setObject(@Nullable Object vObject) {
        try {
            g_value_set_object.invokeExact(handle(), vObject.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_set_param = Interop.downcallHandle(
        "g_value_set_param",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Set the contents of a {@code G_TYPE_PARAM} {@link Value} to {@code param}.
     */
    public @NotNull void setParam(@Nullable ParamSpec param) {
        try {
            g_value_set_param.invokeExact(handle(), param.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_set_pointer = Interop.downcallHandle(
        "g_value_set_pointer",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Set the contents of a pointer {@link Value} to {@code v_pointer}.
     */
    public @NotNull void setPointer(@Nullable java.lang.foreign.MemoryAddress vPointer) {
        try {
            g_value_set_pointer.invokeExact(handle(), vPointer);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_set_schar = Interop.downcallHandle(
        "g_value_set_schar",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE)
    );
    
    /**
     * Set the contents of a {@code G_TYPE_CHAR} {@link Value} to {@code v_char}.
     */
    public @NotNull void setSchar(@NotNull byte vChar) {
        try {
            g_value_set_schar.invokeExact(handle(), vChar);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_set_static_boxed = Interop.downcallHandle(
        "g_value_set_static_boxed",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Set the contents of a {@code G_TYPE_BOXED} derived {@link Value} to {@code v_boxed}.
     * <p>
     * The boxed value is assumed to be static, and is thus not duplicated
     * when setting the {@link Value}.
     */
    public @NotNull void setStaticBoxed(@Nullable java.lang.foreign.MemoryAddress vBoxed) {
        try {
            g_value_set_static_boxed.invokeExact(handle(), vBoxed);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_set_static_string = Interop.downcallHandle(
        "g_value_set_static_string",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Set the contents of a {@code G_TYPE_STRING} {@link Value} to {@code v_string}.
     * The string is assumed to be static, and is thus not duplicated
     * when setting the {@link Value}.
     * <p>
     * If the the string is a canonical string, using g_value_set_interned_string()
     * is more appropriate.
     */
    public @NotNull void setStaticString(@Nullable java.lang.String vString) {
        try {
            g_value_set_static_string.invokeExact(handle(), Interop.allocateNativeString(vString));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_set_string = Interop.downcallHandle(
        "g_value_set_string",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Set the contents of a {@code G_TYPE_STRING} {@link Value} to a copy of {@code v_string}.
     */
    public @NotNull void setString(@Nullable java.lang.String vString) {
        try {
            g_value_set_string.invokeExact(handle(), Interop.allocateNativeString(vString));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_set_uchar = Interop.downcallHandle(
        "g_value_set_uchar",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE)
    );
    
    /**
     * Set the contents of a {@code G_TYPE_UCHAR} {@link Value} to {@code v_uchar}.
     */
    public @NotNull void setUchar(@NotNull byte vUchar) {
        try {
            g_value_set_uchar.invokeExact(handle(), vUchar);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_set_uint = Interop.downcallHandle(
        "g_value_set_uint",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    /**
     * Set the contents of a {@code G_TYPE_UINT} {@link Value} to {@code v_uint}.
     */
    public @NotNull void setUint(@NotNull int vUint) {
        try {
            g_value_set_uint.invokeExact(handle(), vUint);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_set_uint64 = Interop.downcallHandle(
        "g_value_set_uint64",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Set the contents of a {@code G_TYPE_UINT64} {@link Value} to {@code v_uint64}.
     */
    public @NotNull void setUint64(@NotNull long vUint64) {
        try {
            g_value_set_uint64.invokeExact(handle(), vUint64);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_set_ulong = Interop.downcallHandle(
        "g_value_set_ulong",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Set the contents of a {@code G_TYPE_ULONG} {@link Value} to {@code v_ulong}.
     */
    public @NotNull void setUlong(@NotNull long vUlong) {
        try {
            g_value_set_ulong.invokeExact(handle(), vUlong);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_set_variant = Interop.downcallHandle(
        "g_value_set_variant",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Set the contents of a variant {@link Value} to {@code variant}.
     * If the variant is floating, it is consumed.
     */
    public @NotNull void setVariant(@Nullable org.gtk.glib.Variant variant) {
        try {
            g_value_set_variant.invokeExact(handle(), variant.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_take_boxed = Interop.downcallHandle(
        "g_value_take_boxed",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the contents of a {@code G_TYPE_BOXED} derived {@link Value} to {@code v_boxed}
     * and takes over the ownership of the caller’s reference to {@code v_boxed};
     * the caller doesn’t have to unref it any more.
     */
    public @NotNull void takeBoxed(@Nullable java.lang.foreign.MemoryAddress vBoxed) {
        try {
            g_value_take_boxed.invokeExact(handle(), vBoxed);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_take_object = Interop.downcallHandle(
        "g_value_take_object",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the contents of a {@code G_TYPE_OBJECT} derived {@link Value} to {@code v_object}
     * and takes over the ownership of the caller’s reference to {@code v_object};
     * the caller doesn’t have to unref it any more (i.e. the reference
     * count of the object is not increased).
     * <p>
     * If you want the {@link Value} to hold its own reference to {@code v_object}, use
     * g_value_set_object() instead.
     */
    public @NotNull void takeObject(@Nullable java.lang.foreign.MemoryAddress vObject) {
        try {
            g_value_take_object.invokeExact(handle(), vObject);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_take_param = Interop.downcallHandle(
        "g_value_take_param",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the contents of a {@code G_TYPE_PARAM} {@link Value} to {@code param} and takes
     * over the ownership of the caller’s reference to {@code param}; the caller
     * doesn’t have to unref it any more.
     */
    public @NotNull void takeParam(@Nullable ParamSpec param) {
        try {
            g_value_take_param.invokeExact(handle(), param.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_take_string = Interop.downcallHandle(
        "g_value_take_string",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Sets the contents of a {@code G_TYPE_STRING} {@link Value} to {@code v_string}.
     */
    public @NotNull void takeString(@Nullable java.lang.String vString) {
        try {
            g_value_take_string.invokeExact(handle(), Interop.allocateNativeString(vString));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_take_variant = Interop.downcallHandle(
        "g_value_take_variant",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Set the contents of a variant {@link Value} to {@code variant}, and takes over
     * the ownership of the caller's reference to {@code variant};
     * the caller doesn't have to unref it any more (i.e. the reference
     * count of the variant is not increased).
     * <p>
     * If {@code variant} was floating then its floating reference is converted to
     * a hard reference.
     * <p>
     * If you want the {@link Value} to hold its own reference to {@code variant}, use
     * g_value_set_variant() instead.
     * <p>
     * This is an internal function introduced mainly for C marshallers.
     */
    public @NotNull void takeVariant(@Nullable org.gtk.glib.Variant variant) {
        try {
            g_value_take_variant.invokeExact(handle(), variant.refcounted().unowned().handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_transform = Interop.downcallHandle(
        "g_value_transform",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Tries to cast the contents of {@code src_value} into a type appropriate
     * to store in {@code dest_value}, e.g. to transform a {@code G_TYPE_INT} value
     * into a {@code G_TYPE_FLOAT} value. Performing transformations between
     * value types might incur precision lossage. Especially
     * transformations into strings might reveal seemingly arbitrary
     * results and shouldn't be relied upon for production code (such
     * as rcfile value or object property serialization).
     */
    public boolean transform(@NotNull Value destValue) {
        int RESULT;
        try {
            RESULT = (int) g_value_transform.invokeExact(handle(), destValue.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_value_unset = Interop.downcallHandle(
        "g_value_unset",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Clears the current value in {@code value} (if any) and "unsets" the type,
     * this releases all resources associated with this GValue. An unset
     * value is the same as an uninitialized (zero-filled) {@link Value}
     * structure.
     */
    public @NotNull void unset() {
        try {
            g_value_unset.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_value_type_compatible = Interop.downcallHandle(
        "g_value_type_compatible",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG)
    );
    
    /**
     * Returns whether a {@link Value} of type {@code src_type} can be copied into
     * a {@link Value} of type {@code dest_type}.
     */
    public static boolean typeCompatible(@NotNull org.gtk.gobject.Type srcType, @NotNull org.gtk.gobject.Type destType) {
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
    public static boolean typeTransformable(@NotNull org.gtk.gobject.Type srcType, @NotNull org.gtk.gobject.Type destType) {
        int RESULT;
        try {
            RESULT = (int) g_value_type_transformable.invokeExact(srcType.getValue(), destType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
}
