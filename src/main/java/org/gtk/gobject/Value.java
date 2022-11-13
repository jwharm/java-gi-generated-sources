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
public class Value extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GValue";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("g_type"),
        MemoryLayout.paddingLayout(64),
        MemoryLayout.sequenceLayout(2, ValueLayout.ADDRESS).withName("data")
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
    
    public static Value allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Value newInstance = new Value(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Value proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public Value(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Copies the value of {@code src_value} into {@code dest_value}.
     * @param destValue An initialized {@link Value} structure of the same type as {@code src_value}.
     */
    public void copy(@NotNull org.gtk.gobject.Value destValue) {
        java.util.Objects.requireNonNull(destValue, "Parameter 'destValue' must not be null");
        try {
            DowncallHandles.g_value_copy.invokeExact(
                    handle(),
                    destValue.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the contents of a {@code G_TYPE_BOXED} derived {@link Value}.  Upon getting,
     * the boxed value is duplicated and needs to be later freed with
     * g_boxed_free(), e.g. like: g_boxed_free (G_VALUE_TYPE ({@code value}),
     * return_value);
     * @return boxed contents of {@code value}
     */
    public @Nullable java.lang.foreign.MemoryAddress dupBoxed() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_value_dup_boxed.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_OBJECT} derived {@link Value}, increasing
     * its reference count. If the contents of the {@link Value} are {@code null}, then
     * {@code null} will be returned.
     * @return object content of {@code value},
     *          should be unreferenced when no longer needed.
     */
    public @NotNull org.gtk.gobject.Object dupObject() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_value_dup_object.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Object(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the contents of a {@code G_TYPE_PARAM} {@link Value}, increasing its
     * reference count.
     * @return {@link ParamSpec} content of {@code value}, should be
     *     unreferenced when no longer needed.
     */
    public @NotNull org.gtk.gobject.ParamSpec dupParam() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_value_dup_param.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.FULL);
    }
    
    /**
     * Get a copy the contents of a {@code G_TYPE_STRING} {@link Value}.
     * @return a newly allocated copy of the string content of {@code value}
     */
    public @NotNull java.lang.String dupString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_value_dup_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get the contents of a variant {@link Value}, increasing its refcount. The returned
     * {@link org.gtk.glib.Variant} is never floating.
     * @return variant contents of {@code value} (may be {@code null});
     *    should be unreffed using g_variant_unref() when no longer needed
     */
    public @Nullable org.gtk.glib.Variant dupVariant() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_value_dup_variant.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Variant(RESULT, Ownership.FULL);
    }
    
    /**
     * Determines if {@code value} will fit inside the size of a pointer value.
     * This is an internal function introduced mainly for C marshallers.
     * @return {@code true} if {@code value} will fit inside a pointer value.
     */
    public boolean fitsPointer() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_value_fits_pointer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_BOOLEAN} {@link Value}.
     * @return boolean contents of {@code value}
     */
    public boolean getBoolean() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_value_get_boolean.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_BOXED} derived {@link Value}.
     * @return boxed contents of {@code value}
     */
    public @Nullable java.lang.foreign.MemoryAddress getBoxed() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_value_get_boxed.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Do not use this function; it is broken on platforms where the {@code char}
     * type is unsigned, such as ARM and PowerPC.  See g_value_get_schar().
     * <p>
     * Get the contents of a {@code G_TYPE_CHAR} {@link Value}.
     * @return character contents of {@code value}
     * @deprecated This function's return type is broken, see g_value_get_schar()
     */
    @Deprecated
    public byte getChar() {
        byte RESULT;
        try {
            RESULT = (byte) DowncallHandles.g_value_get_char.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_DOUBLE} {@link Value}.
     * @return double contents of {@code value}
     */
    public double getDouble() {
        double RESULT;
        try {
            RESULT = (double) DowncallHandles.g_value_get_double.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_ENUM} {@link Value}.
     * @return enum contents of {@code value}
     */
    public int getEnum() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_value_get_enum.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_FLAGS} {@link Value}.
     * @return flags contents of {@code value}
     */
    public int getFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_value_get_flags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_FLOAT} {@link Value}.
     * @return float contents of {@code value}
     */
    public float getFloat() {
        float RESULT;
        try {
            RESULT = (float) DowncallHandles.g_value_get_float.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_GTYPE} {@link Value}.
     * @return the {@link Type} stored in {@code value}
     */
    public @NotNull org.gtk.glib.Type getGtype() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_value_get_gtype.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Get the contents of a {@code G_TYPE_INT} {@link Value}.
     * @return integer contents of {@code value}
     */
    public int getInt() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_value_get_int.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_INT64} {@link Value}.
     * @return 64bit integer contents of {@code value}
     */
    public long getInt64() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_value_get_int64.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_LONG} {@link Value}.
     * @return long integer contents of {@code value}
     */
    public long getLong() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_value_get_long.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_OBJECT} derived {@link Value}.
     * @return object contents of {@code value}
     */
    public @NotNull org.gtk.gobject.Object getObject() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_value_get_object.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Object(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the contents of a {@code G_TYPE_PARAM} {@link Value}.
     * @return {@link ParamSpec} content of {@code value}
     */
    public @NotNull org.gtk.gobject.ParamSpec getParam() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_value_get_param.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the contents of a pointer {@link Value}.
     * @return pointer contents of {@code value}
     */
    public @Nullable java.lang.foreign.MemoryAddress getPointer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_value_get_pointer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_CHAR} {@link Value}.
     * @return signed 8 bit integer contents of {@code value}
     */
    public byte getSchar() {
        byte RESULT;
        try {
            RESULT = (byte) DowncallHandles.g_value_get_schar.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_STRING} {@link Value}.
     * @return string content of {@code value}
     */
    public @NotNull java.lang.String getString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_value_get_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get the contents of a {@code G_TYPE_UCHAR} {@link Value}.
     * @return unsigned character contents of {@code value}
     */
    public byte getUchar() {
        byte RESULT;
        try {
            RESULT = (byte) DowncallHandles.g_value_get_uchar.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_UINT} {@link Value}.
     * @return unsigned integer contents of {@code value}
     */
    public int getUint() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_value_get_uint.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_UINT64} {@link Value}.
     * @return unsigned 64bit integer contents of {@code value}
     */
    public long getUint64() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_value_get_uint64.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the contents of a {@code G_TYPE_ULONG} {@link Value}.
     * @return unsigned long integer contents of {@code value}
     */
    public long getUlong() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_value_get_ulong.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the contents of a variant {@link Value}.
     * @return variant contents of {@code value} (may be {@code null})
     */
    public @Nullable org.gtk.glib.Variant getVariant() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_value_get_variant.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Variant(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes {@code value} with the default value of {@code type}.
     * @param gType Type the {@link Value} should hold values of.
     * @return the {@link Value} structure that has been passed in
     */
    public @NotNull org.gtk.gobject.Value init(@NotNull org.gtk.glib.Type gType) {
        java.util.Objects.requireNonNull(gType, "Parameter 'gType' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_value_init.invokeExact(
                    handle(),
                    gType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Value(RESULT, Ownership.NONE);
    }
    
    /**
     * Initializes and sets {@code value} from an instantiatable type via the
     * value_table's collect_value() function.
     * <p>
     * Note: The {@code value} will be initialised with the exact type of
     * {@code instance}.  If you wish to set the {@code value}'s type to a different GType
     * (such as a parent class GType), you need to manually call
     * g_value_init() and g_value_set_instance().
     * @param instance the instance
     */
    public void initFromInstance(@NotNull org.gtk.gobject.TypeInstance instance) {
        java.util.Objects.requireNonNull(instance, "Parameter 'instance' must not be null");
        try {
            DowncallHandles.g_value_init_from_instance.invokeExact(
                    handle(),
                    instance.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns the value contents as pointer. This function asserts that
     * g_value_fits_pointer() returned {@code true} for the passed in value.
     * This is an internal function introduced mainly for C marshallers.
     * @return the value contents as pointer
     */
    public @Nullable java.lang.foreign.MemoryAddress peekPointer() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_value_peek_pointer.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Clears the current value in {@code value} and resets it to the default value
     * (as if the value had just been initialized).
     * @return the {@link Value} structure that has been passed in
     */
    public @NotNull org.gtk.gobject.Value reset() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_value_reset.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Value(RESULT, Ownership.FULL);
    }
    
    /**
     * Set the contents of a {@code G_TYPE_BOOLEAN} {@link Value} to {@code v_boolean}.
     * @param vBoolean boolean value to be set
     */
    public void setBoolean(boolean vBoolean) {
        try {
            DowncallHandles.g_value_set_boolean.invokeExact(
                    handle(),
                    vBoolean ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the contents of a {@code G_TYPE_BOXED} derived {@link Value} to {@code v_boxed}.
     * @param vBoxed boxed value to be set
     */
    public void setBoxed(@Nullable java.lang.foreign.MemoryAddress vBoxed) {
        try {
            DowncallHandles.g_value_set_boxed.invokeExact(
                    handle(),
                    (Addressable) (vBoxed == null ? MemoryAddress.NULL : vBoxed));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This is an internal function introduced mainly for C marshallers.
     * @param vBoxed duplicated unowned boxed value to be set
     * @deprecated Use g_value_take_boxed() instead.
     */
    @Deprecated
    public void setBoxedTakeOwnership(@Nullable java.lang.foreign.MemoryAddress vBoxed) {
        try {
            DowncallHandles.g_value_set_boxed_take_ownership.invokeExact(
                    handle(),
                    (Addressable) (vBoxed == null ? MemoryAddress.NULL : vBoxed));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the contents of a {@code G_TYPE_CHAR} {@link Value} to {@code v_char}.
     * @param vChar character value to be set
     * @deprecated This function's input type is broken, see g_value_set_schar()
     */
    @Deprecated
    public void setChar(byte vChar) {
        try {
            DowncallHandles.g_value_set_char.invokeExact(
                    handle(),
                    vChar);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the contents of a {@code G_TYPE_DOUBLE} {@link Value} to {@code v_double}.
     * @param vDouble double value to be set
     */
    public void setDouble(double vDouble) {
        try {
            DowncallHandles.g_value_set_double.invokeExact(
                    handle(),
                    vDouble);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the contents of a {@code G_TYPE_ENUM} {@link Value} to {@code v_enum}.
     * @param vEnum enum value to be set
     */
    public void setEnum(int vEnum) {
        try {
            DowncallHandles.g_value_set_enum.invokeExact(
                    handle(),
                    vEnum);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the contents of a {@code G_TYPE_FLAGS} {@link Value} to {@code v_flags}.
     * @param vFlags flags value to be set
     */
    public void setFlags(int vFlags) {
        try {
            DowncallHandles.g_value_set_flags.invokeExact(
                    handle(),
                    vFlags);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the contents of a {@code G_TYPE_FLOAT} {@link Value} to {@code v_float}.
     * @param vFloat float value to be set
     */
    public void setFloat(float vFloat) {
        try {
            DowncallHandles.g_value_set_float.invokeExact(
                    handle(),
                    vFloat);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the contents of a {@code G_TYPE_GTYPE} {@link Value} to {@code v_gtype}.
     * @param vGtype {@link Type} to be set
     */
    public void setGtype(@NotNull org.gtk.glib.Type vGtype) {
        java.util.Objects.requireNonNull(vGtype, "Parameter 'vGtype' must not be null");
        try {
            DowncallHandles.g_value_set_gtype.invokeExact(
                    handle(),
                    vGtype.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets {@code value} from an instantiatable type via the
     * value_table's collect_value() function.
     * @param instance the instance
     */
    public void setInstance(@Nullable java.lang.foreign.MemoryAddress instance) {
        try {
            DowncallHandles.g_value_set_instance.invokeExact(
                    handle(),
                    (Addressable) (instance == null ? MemoryAddress.NULL : instance));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the contents of a {@code G_TYPE_INT} {@link Value} to {@code v_int}.
     * @param vInt integer value to be set
     */
    public void setInt(int vInt) {
        try {
            DowncallHandles.g_value_set_int.invokeExact(
                    handle(),
                    vInt);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the contents of a {@code G_TYPE_INT64} {@link Value} to {@code v_int64}.
     * @param vInt64 64bit integer value to be set
     */
    public void setInt64(long vInt64) {
        try {
            DowncallHandles.g_value_set_int64.invokeExact(
                    handle(),
                    vInt64);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the contents of a {@code G_TYPE_STRING} {@link Value} to {@code v_string}.  The string is
     * assumed to be static and interned (canonical, for example from
     * g_intern_string()), and is thus not duplicated when setting the {@link Value}.
     * @param vString static string to be set
     */
    public void setInternedString(@Nullable java.lang.String vString) {
        try {
            DowncallHandles.g_value_set_interned_string.invokeExact(
                    handle(),
                    (Addressable) (vString == null ? MemoryAddress.NULL : Interop.allocateNativeString(vString)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the contents of a {@code G_TYPE_LONG} {@link Value} to {@code v_long}.
     * @param vLong long integer value to be set
     */
    public void setLong(long vLong) {
        try {
            DowncallHandles.g_value_set_long.invokeExact(
                    handle(),
                    vLong);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param vObject object value to be set
     */
    public void setObject(@Nullable org.gtk.gobject.Object vObject) {
        try {
            DowncallHandles.g_value_set_object.invokeExact(
                    handle(),
                    (Addressable) (vObject == null ? MemoryAddress.NULL : vObject.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This is an internal function introduced mainly for C marshallers.
     * @param vObject object value to be set
     * @deprecated Use g_value_take_object() instead.
     */
    @Deprecated
    public void setObjectTakeOwnership(@Nullable java.lang.foreign.MemoryAddress vObject) {
        try {
            DowncallHandles.g_value_set_object_take_ownership.invokeExact(
                    handle(),
                    (Addressable) (vObject == null ? MemoryAddress.NULL : vObject));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the contents of a {@code G_TYPE_PARAM} {@link Value} to {@code param}.
     * @param param the {@link ParamSpec} to be set
     */
    public void setParam(@Nullable org.gtk.gobject.ParamSpec param) {
        try {
            DowncallHandles.g_value_set_param.invokeExact(
                    handle(),
                    (Addressable) (param == null ? MemoryAddress.NULL : param.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This is an internal function introduced mainly for C marshallers.
     * @param param the {@link ParamSpec} to be set
     * @deprecated Use g_value_take_param() instead.
     */
    @Deprecated
    public void setParamTakeOwnership(@Nullable org.gtk.gobject.ParamSpec param) {
        try {
            DowncallHandles.g_value_set_param_take_ownership.invokeExact(
                    handle(),
                    (Addressable) (param == null ? MemoryAddress.NULL : param.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the contents of a pointer {@link Value} to {@code v_pointer}.
     * @param vPointer pointer value to be set
     */
    public void setPointer(@Nullable java.lang.foreign.MemoryAddress vPointer) {
        try {
            DowncallHandles.g_value_set_pointer.invokeExact(
                    handle(),
                    (Addressable) (vPointer == null ? MemoryAddress.NULL : vPointer));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the contents of a {@code G_TYPE_CHAR} {@link Value} to {@code v_char}.
     * @param vChar signed 8 bit integer to be set
     */
    public void setSchar(byte vChar) {
        try {
            DowncallHandles.g_value_set_schar.invokeExact(
                    handle(),
                    vChar);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the contents of a {@code G_TYPE_BOXED} derived {@link Value} to {@code v_boxed}.
     * <p>
     * The boxed value is assumed to be static, and is thus not duplicated
     * when setting the {@link Value}.
     * @param vBoxed static boxed value to be set
     */
    public void setStaticBoxed(@Nullable java.lang.foreign.MemoryAddress vBoxed) {
        try {
            DowncallHandles.g_value_set_static_boxed.invokeExact(
                    handle(),
                    (Addressable) (vBoxed == null ? MemoryAddress.NULL : vBoxed));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the contents of a {@code G_TYPE_STRING} {@link Value} to {@code v_string}.
     * The string is assumed to be static, and is thus not duplicated
     * when setting the {@link Value}.
     * <p>
     * If the the string is a canonical string, using g_value_set_interned_string()
     * is more appropriate.
     * @param vString static string to be set
     */
    public void setStaticString(@Nullable java.lang.String vString) {
        try {
            DowncallHandles.g_value_set_static_string.invokeExact(
                    handle(),
                    (Addressable) (vString == null ? MemoryAddress.NULL : Interop.allocateNativeString(vString)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the contents of a {@code G_TYPE_STRING} {@link Value} to a copy of {@code v_string}.
     * @param vString caller-owned string to be duplicated for the {@link Value}
     */
    public void setString(@Nullable java.lang.String vString) {
        try {
            DowncallHandles.g_value_set_string.invokeExact(
                    handle(),
                    (Addressable) (vString == null ? MemoryAddress.NULL : Interop.allocateNativeString(vString)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * This is an internal function introduced mainly for C marshallers.
     * @param vString duplicated unowned string to be set
     * @deprecated Use g_value_take_string() instead.
     */
    @Deprecated
    public void setStringTakeOwnership(@Nullable java.lang.String vString) {
        try {
            DowncallHandles.g_value_set_string_take_ownership.invokeExact(
                    handle(),
                    (Addressable) (vString == null ? MemoryAddress.NULL : Interop.allocateNativeString(vString)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the contents of a {@code G_TYPE_UCHAR} {@link Value} to {@code v_uchar}.
     * @param vUchar unsigned character value to be set
     */
    public void setUchar(byte vUchar) {
        try {
            DowncallHandles.g_value_set_uchar.invokeExact(
                    handle(),
                    vUchar);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the contents of a {@code G_TYPE_UINT} {@link Value} to {@code v_uint}.
     * @param vUint unsigned integer value to be set
     */
    public void setUint(int vUint) {
        try {
            DowncallHandles.g_value_set_uint.invokeExact(
                    handle(),
                    vUint);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the contents of a {@code G_TYPE_UINT64} {@link Value} to {@code v_uint64}.
     * @param vUint64 unsigned 64bit integer value to be set
     */
    public void setUint64(long vUint64) {
        try {
            DowncallHandles.g_value_set_uint64.invokeExact(
                    handle(),
                    vUint64);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the contents of a {@code G_TYPE_ULONG} {@link Value} to {@code v_ulong}.
     * @param vUlong unsigned long integer value to be set
     */
    public void setUlong(long vUlong) {
        try {
            DowncallHandles.g_value_set_ulong.invokeExact(
                    handle(),
                    vUlong);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the contents of a variant {@link Value} to {@code variant}.
     * If the variant is floating, it is consumed.
     * @param variant a {@link org.gtk.glib.Variant}, or {@code null}
     */
    public void setVariant(@Nullable org.gtk.glib.Variant variant) {
        try {
            DowncallHandles.g_value_set_variant.invokeExact(
                    handle(),
                    (Addressable) (variant == null ? MemoryAddress.NULL : variant.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the contents of a {@code G_TYPE_BOXED} derived {@link Value} to {@code v_boxed}
     * and takes over the ownership of the caller’s reference to {@code v_boxed};
     * the caller doesn’t have to unref it any more.
     * @param vBoxed duplicated unowned boxed value to be set
     */
    public void takeBoxed(@Nullable java.lang.foreign.MemoryAddress vBoxed) {
        try {
            DowncallHandles.g_value_take_boxed.invokeExact(
                    handle(),
                    (Addressable) (vBoxed == null ? MemoryAddress.NULL : vBoxed));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the contents of a {@code G_TYPE_OBJECT} derived {@link Value} to {@code v_object}
     * and takes over the ownership of the caller’s reference to {@code v_object};
     * the caller doesn’t have to unref it any more (i.e. the reference
     * count of the object is not increased).
     * <p>
     * If you want the {@link Value} to hold its own reference to {@code v_object}, use
     * g_value_set_object() instead.
     * @param vObject object value to be set
     */
    public void takeObject(@Nullable java.lang.foreign.MemoryAddress vObject) {
        try {
            DowncallHandles.g_value_take_object.invokeExact(
                    handle(),
                    (Addressable) (vObject == null ? MemoryAddress.NULL : vObject));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the contents of a {@code G_TYPE_PARAM} {@link Value} to {@code param} and takes
     * over the ownership of the caller’s reference to {@code param}; the caller
     * doesn’t have to unref it any more.
     * @param param the {@link ParamSpec} to be set
     */
    public void takeParam(@Nullable org.gtk.gobject.ParamSpec param) {
        try {
            DowncallHandles.g_value_take_param.invokeExact(
                    handle(),
                    (Addressable) (param == null ? MemoryAddress.NULL : param.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the contents of a {@code G_TYPE_STRING} {@link Value} to {@code v_string}.
     * @param vString string to take ownership of
     */
    public void takeString(@Nullable java.lang.String vString) {
        try {
            DowncallHandles.g_value_take_string.invokeExact(
                    handle(),
                    (Addressable) (vString == null ? MemoryAddress.NULL : Interop.allocateNativeString(vString)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
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
     * @param variant a {@link org.gtk.glib.Variant}, or {@code null}
     */
    public void takeVariant(@Nullable org.gtk.glib.Variant variant) {
        try {
            DowncallHandles.g_value_take_variant.invokeExact(
                    handle(),
                    (Addressable) (variant == null ? MemoryAddress.NULL : variant.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        variant.yieldOwnership();
    }
    
    /**
     * Tries to cast the contents of {@code src_value} into a type appropriate
     * to store in {@code dest_value}, e.g. to transform a {@code G_TYPE_INT} value
     * into a {@code G_TYPE_FLOAT} value. Performing transformations between
     * value types might incur precision lossage. Especially
     * transformations into strings might reveal seemingly arbitrary
     * results and shouldn't be relied upon for production code (such
     * as rcfile value or object property serialization).
     * @param destValue Target value.
     * @return Whether a transformation rule was found and could be applied.
     *  Upon failing transformations, {@code dest_value} is left untouched.
     */
    public boolean transform(@NotNull org.gtk.gobject.Value destValue) {
        java.util.Objects.requireNonNull(destValue, "Parameter 'destValue' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_value_transform.invokeExact(
                    handle(),
                    destValue.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Clears the current value in {@code value} (if any) and "unsets" the type,
     * this releases all resources associated with this GValue. An unset
     * value is the same as an uninitialized (zero-filled) {@link Value}
     * structure.
     */
    public void unset() {
        try {
            DowncallHandles.g_value_unset.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
    public static void registerTransformFunc(@NotNull org.gtk.glib.Type srcType, @NotNull org.gtk.glib.Type destType, @NotNull org.gtk.gobject.ValueTransform transformFunc) {
        throw new UnsupportedOperationException("Operation not supported yet");
    }
    
    /**
     * Returns whether a {@link Value} of type {@code src_type} can be copied into
     * a {@link Value} of type {@code dest_type}.
     * @param srcType source type to be copied.
     * @param destType destination type for copying.
     * @return {@code true} if g_value_copy() is possible with {@code src_type} and {@code dest_type}.
     */
    public static boolean typeCompatible(@NotNull org.gtk.glib.Type srcType, @NotNull org.gtk.glib.Type destType) {
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
    public static boolean typeTransformable(@NotNull org.gtk.glib.Type srcType, @NotNull org.gtk.glib.Type destType) {
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
        
        private static final MethodHandle g_value_copy = Interop.downcallHandle(
            "g_value_copy",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_dup_boxed = Interop.downcallHandle(
            "g_value_dup_boxed",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_dup_object = Interop.downcallHandle(
            "g_value_dup_object",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_dup_param = Interop.downcallHandle(
            "g_value_dup_param",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_dup_string = Interop.downcallHandle(
            "g_value_dup_string",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_dup_variant = Interop.downcallHandle(
            "g_value_dup_variant",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_fits_pointer = Interop.downcallHandle(
            "g_value_fits_pointer",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_get_boolean = Interop.downcallHandle(
            "g_value_get_boolean",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_get_boxed = Interop.downcallHandle(
            "g_value_get_boxed",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_get_char = Interop.downcallHandle(
            "g_value_get_char",
            FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_get_double = Interop.downcallHandle(
            "g_value_get_double",
            FunctionDescriptor.of(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_get_enum = Interop.downcallHandle(
            "g_value_get_enum",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_get_flags = Interop.downcallHandle(
            "g_value_get_flags",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_get_float = Interop.downcallHandle(
            "g_value_get_float",
            FunctionDescriptor.of(ValueLayout.JAVA_FLOAT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_get_gtype = Interop.downcallHandle(
            "g_value_get_gtype",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_get_int = Interop.downcallHandle(
            "g_value_get_int",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_get_int64 = Interop.downcallHandle(
            "g_value_get_int64",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_get_long = Interop.downcallHandle(
            "g_value_get_long",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_get_object = Interop.downcallHandle(
            "g_value_get_object",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_get_param = Interop.downcallHandle(
            "g_value_get_param",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_get_pointer = Interop.downcallHandle(
            "g_value_get_pointer",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_get_schar = Interop.downcallHandle(
            "g_value_get_schar",
            FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_get_string = Interop.downcallHandle(
            "g_value_get_string",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_get_uchar = Interop.downcallHandle(
            "g_value_get_uchar",
            FunctionDescriptor.of(ValueLayout.JAVA_BYTE, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_get_uint = Interop.downcallHandle(
            "g_value_get_uint",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_get_uint64 = Interop.downcallHandle(
            "g_value_get_uint64",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_get_ulong = Interop.downcallHandle(
            "g_value_get_ulong",
            FunctionDescriptor.of(ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_get_variant = Interop.downcallHandle(
            "g_value_get_variant",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_init = Interop.downcallHandle(
            "g_value_init",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_LONG),
            false
        );
        
        private static final MethodHandle g_value_init_from_instance = Interop.downcallHandle(
            "g_value_init_from_instance",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_peek_pointer = Interop.downcallHandle(
            "g_value_peek_pointer",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_reset = Interop.downcallHandle(
            "g_value_reset",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_set_boolean = Interop.downcallHandle(
            "g_value_set_boolean",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_value_set_boxed = Interop.downcallHandle(
            "g_value_set_boxed",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_set_boxed_take_ownership = Interop.downcallHandle(
            "g_value_set_boxed_take_ownership",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_set_char = Interop.downcallHandle(
            "g_value_set_char",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE),
            false
        );
        
        private static final MethodHandle g_value_set_double = Interop.downcallHandle(
            "g_value_set_double",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_DOUBLE),
            false
        );
        
        private static final MethodHandle g_value_set_enum = Interop.downcallHandle(
            "g_value_set_enum",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_value_set_flags = Interop.downcallHandle(
            "g_value_set_flags",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_value_set_float = Interop.downcallHandle(
            "g_value_set_float",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_FLOAT),
            false
        );
        
        private static final MethodHandle g_value_set_gtype = Interop.downcallHandle(
            "g_value_set_gtype",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG),
            false
        );
        
        private static final MethodHandle g_value_set_instance = Interop.downcallHandle(
            "g_value_set_instance",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_set_int = Interop.downcallHandle(
            "g_value_set_int",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_value_set_int64 = Interop.downcallHandle(
            "g_value_set_int64",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG),
            false
        );
        
        private static final MethodHandle g_value_set_interned_string = Interop.downcallHandle(
            "g_value_set_interned_string",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_set_long = Interop.downcallHandle(
            "g_value_set_long",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG),
            false
        );
        
        private static final MethodHandle g_value_set_object = Interop.downcallHandle(
            "g_value_set_object",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_set_object_take_ownership = Interop.downcallHandle(
            "g_value_set_object_take_ownership",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_set_param = Interop.downcallHandle(
            "g_value_set_param",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_set_param_take_ownership = Interop.downcallHandle(
            "g_value_set_param_take_ownership",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_set_pointer = Interop.downcallHandle(
            "g_value_set_pointer",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_set_schar = Interop.downcallHandle(
            "g_value_set_schar",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE),
            false
        );
        
        private static final MethodHandle g_value_set_static_boxed = Interop.downcallHandle(
            "g_value_set_static_boxed",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_set_static_string = Interop.downcallHandle(
            "g_value_set_static_string",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_set_string = Interop.downcallHandle(
            "g_value_set_string",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_set_string_take_ownership = Interop.downcallHandle(
            "g_value_set_string_take_ownership",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_set_uchar = Interop.downcallHandle(
            "g_value_set_uchar",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_BYTE),
            false
        );
        
        private static final MethodHandle g_value_set_uint = Interop.downcallHandle(
            "g_value_set_uint",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_value_set_uint64 = Interop.downcallHandle(
            "g_value_set_uint64",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG),
            false
        );
        
        private static final MethodHandle g_value_set_ulong = Interop.downcallHandle(
            "g_value_set_ulong",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_LONG),
            false
        );
        
        private static final MethodHandle g_value_set_variant = Interop.downcallHandle(
            "g_value_set_variant",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_take_boxed = Interop.downcallHandle(
            "g_value_take_boxed",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_take_object = Interop.downcallHandle(
            "g_value_take_object",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_take_param = Interop.downcallHandle(
            "g_value_take_param",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_take_string = Interop.downcallHandle(
            "g_value_take_string",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_take_variant = Interop.downcallHandle(
            "g_value_take_variant",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_transform = Interop.downcallHandle(
            "g_value_transform",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_unset = Interop.downcallHandle(
            "g_value_unset",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_register_transform_func = Interop.downcallHandle(
            "g_value_register_transform_func",
            FunctionDescriptor.ofVoid(ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_value_type_compatible = Interop.downcallHandle(
            "g_value_type_compatible",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG),
            false
        );
        
        private static final MethodHandle g_value_type_transformable = Interop.downcallHandle(
            "g_value_type_transformable",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.JAVA_LONG, ValueLayout.JAVA_LONG),
            false
        );
    }
}
