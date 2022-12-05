package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * List of tags and values used to describe media metadata.
 * <p>
 * Strings in structures must be ASCII or UTF-8 encoded. Other encodings are
 * not allowed. Strings must not be empty or {@code null}.
 */
public class TagList extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstTagList";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.MiniObject.getMemoryLayout().withName("mini_object")
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
    
    /**
     * Allocate a new {@link TagList}
     * @return A new, uninitialized @{link TagList}
     */
    public static TagList allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TagList newInstance = new TagList(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code mini_object}
     * @return The value of the field {@code mini_object}
     */
    public org.gstreamer.gst.MiniObject miniObject$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("mini_object"));
        return new org.gstreamer.gst.MiniObject(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a TagList proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TagList(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew(@NotNull java.lang.String tag, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_list_new.invokeExact(
                    Interop.allocateNativeString(tag),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new taglist and appends the values for the given tags. It expects
     * tag-value pairs like gst_tag_list_add(), and a {@code null} terminator after the
     * last pair. The type of the values is implicit and is documented in the API
     * reference, but can also be queried at runtime with gst_tag_get_type(). It
     * is an error to pass a value of a type not matching the tag type into this
     * function. The tag list will make copies of any arguments passed
     * (e.g. strings, buffers).
     * <p>
     * After creation you might also want to set a {@link TagScope} on the returned
     * taglist to signal if the contained tags are global or stream tags. By
     * default stream scope is assumes. See gst_tag_list_set_scope().
     * <p>
     * Free-function: gst_tag_list_unref
     * @param tag tag
     * @param varargs {@code null}-terminated list of values to set
     */
    public TagList(@NotNull java.lang.String tag, java.lang.Object... varargs) {
        super(constructNew(tag, varargs), Ownership.FULL);
    }
    
    private static Addressable constructNewEmpty() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_list_new_empty.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new empty GstTagList.
     * <p>
     * Free-function: gst_tag_list_unref
     * @return An empty tag list
     */
    public static TagList newEmpty() {
        return new TagList(constructNewEmpty(), Ownership.FULL);
    }
    
    private static Addressable constructNewFromString(@NotNull java.lang.String str) {
        java.util.Objects.requireNonNull(str, "Parameter 'str' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_list_new_from_string.invokeExact(
                    Interop.allocateNativeString(str));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Deserializes a tag list.
     * @param str a string created with gst_tag_list_to_string()
     * @return a new {@link TagList}, or {@code null} in case of an
     * error.
     */
    public static TagList newFromString(@NotNull java.lang.String str) {
        return new TagList(constructNewFromString(str), Ownership.FULL);
    }
    
    private static Addressable constructNewValist(@NotNull VaList varArgs) {
        java.util.Objects.requireNonNull(varArgs, "Parameter 'varArgs' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_list_new_valist.invokeExact(
                    varArgs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Just like gst_tag_list_new(), only that it takes a va_list argument.
     * Useful mostly for language bindings.
     * <p>
     * Free-function: gst_tag_list_unref
     * @param varArgs tag / value pairs to set
     * @return a new {@link TagList}. Free with gst_tag_list_unref()
     *     when no longer needed.
     */
    public static TagList newValist(@NotNull VaList varArgs) {
        return new TagList(constructNewValist(varArgs), Ownership.FULL);
    }
    
    /**
     * Sets the values for the given tags using the specified mode.
     * @param mode the mode to use
     * @param tag tag
     * @param varargs {@code null}-terminated list of values to set
     */
    public void add(@NotNull org.gstreamer.gst.TagMergeMode mode, @NotNull java.lang.String tag, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(mode, "Parameter 'mode' must not be null");
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        try {
            DowncallHandles.gst_tag_list_add.invokeExact(
                    handle(),
                    mode.getValue(),
                    Interop.allocateNativeString(tag),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the values for the given tags using the specified mode.
     * @param mode the mode to use
     * @param tag tag
     * @param varArgs tag / value pairs to set
     */
    public void addValist(@NotNull org.gstreamer.gst.TagMergeMode mode, @NotNull java.lang.String tag, @NotNull VaList varArgs) {
        java.util.Objects.requireNonNull(mode, "Parameter 'mode' must not be null");
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        java.util.Objects.requireNonNull(varArgs, "Parameter 'varArgs' must not be null");
        try {
            DowncallHandles.gst_tag_list_add_valist.invokeExact(
                    handle(),
                    mode.getValue(),
                    Interop.allocateNativeString(tag),
                    varArgs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the GValues for the given tags using the specified mode.
     * @param mode the mode to use
     * @param tag tag
     * @param varArgs tag / GValue pairs to set
     */
    public void addValistValues(@NotNull org.gstreamer.gst.TagMergeMode mode, @NotNull java.lang.String tag, @NotNull VaList varArgs) {
        java.util.Objects.requireNonNull(mode, "Parameter 'mode' must not be null");
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        java.util.Objects.requireNonNull(varArgs, "Parameter 'varArgs' must not be null");
        try {
            DowncallHandles.gst_tag_list_add_valist_values.invokeExact(
                    handle(),
                    mode.getValue(),
                    Interop.allocateNativeString(tag),
                    varArgs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the GValue for a given tag using the specified mode.
     * @param mode the mode to use
     * @param tag tag
     * @param value GValue for this tag
     */
    public void addValue(@NotNull org.gstreamer.gst.TagMergeMode mode, @NotNull java.lang.String tag, @NotNull org.gtk.gobject.Value value) {
        java.util.Objects.requireNonNull(mode, "Parameter 'mode' must not be null");
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.gst_tag_list_add_value.invokeExact(
                    handle(),
                    mode.getValue(),
                    Interop.allocateNativeString(tag),
                    value.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the GValues for the given tags using the specified mode.
     * @param mode the mode to use
     * @param tag tag
     * @param varargs GValues to set
     */
    public void addValues(@NotNull org.gstreamer.gst.TagMergeMode mode, @NotNull java.lang.String tag, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(mode, "Parameter 'mode' must not be null");
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        try {
            DowncallHandles.gst_tag_list_add_values.invokeExact(
                    handle(),
                    mode.getValue(),
                    Interop.allocateNativeString(tag),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link TagList} as a copy of the old {@code taglist}. The new taglist
     * will have a refcount of 1, owned by the caller, and will be writable as
     * a result.
     * <p>
     * Note that this function is the semantic equivalent of a gst_tag_list_ref()
     * followed by a gst_tag_list_make_writable(). If you only want to hold on to a
     * reference to the data, you should use gst_tag_list_ref().
     * <p>
     * When you are finished with the taglist, call gst_tag_list_unref() on it.
     * @return the new {@link TagList}
     */
    public @NotNull org.gstreamer.gst.TagList copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_list_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.TagList(RESULT, Ownership.FULL);
    }
    
    /**
     * Calls the given function for each tag inside the tag list. Note that if there
     * is no tag, the function won't be called at all.
     * @param func function to be called for each tag
     */
    public void foreach(@NotNull org.gstreamer.gst.TagForeachFunc func) {
        java.util.Objects.requireNonNull(func, "Parameter 'func' must not be null");
        try {
            DowncallHandles.gst_tag_list_foreach.invokeExact(
                    handle(),
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Gst.Callbacks.class, "cbTagForeachFunc",
                            MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(func)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Copies the contents for the given tag into the value, merging multiple values
     * into one if multiple values are associated with the tag.
     * @param tag tag to read out
     * @param value location for the result
     * @return {@code true}, if a value was copied, {@code false} if the tag didn't exist in the
     *              given list.
     */
    public boolean getBoolean(@NotNull java.lang.String tag, Out<Boolean> value) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_get_boolean.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tag),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
        return RESULT != 0;
    }
    
    /**
     * Gets the value that is at the given index for the given tag in the given
     * list.
     * @param tag tag to read out
     * @param index number of entry to read out
     * @param value location for the result
     * @return {@code true}, if a value was copied, {@code false} if the tag didn't exist in the
     *              given list.
     */
    public boolean getBooleanIndex(@NotNull java.lang.String tag, int index, Out<Boolean> value) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_get_boolean_index.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tag),
                    index,
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
        return RESULT != 0;
    }
    
    /**
     * Copies the first date for the given tag in the taglist into the variable
     * pointed to by {@code value}. Free the date with g_date_free() when it is no longer
     * needed.
     * <p>
     * Free-function: g_date_free
     * @param tag tag to read out
     * @param value address of a GDate pointer
     *     variable to store the result into
     * @return {@code true}, if a date was copied, {@code false} if the tag didn't exist in the
     *              given list or if it was {@code null}.
     */
    public boolean getDate(@NotNull java.lang.String tag, @NotNull Out<org.gtk.glib.Date> value) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_get_date.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tag),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(new org.gtk.glib.Date(valuePOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return RESULT != 0;
    }
    
    /**
     * Gets the date that is at the given index for the given tag in the given
     * list and copies it into the variable pointed to by {@code value}. Free the date
     * with g_date_free() when it is no longer needed.
     * <p>
     * Free-function: g_date_free
     * @param tag tag to read out
     * @param index number of entry to read out
     * @param value location for the result
     * @return {@code true}, if a value was copied, {@code false} if the tag didn't exist in the
     *              given list or if it was {@code null}.
     */
    public boolean getDateIndex(@NotNull java.lang.String tag, int index, @NotNull Out<org.gtk.glib.Date> value) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_get_date_index.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tag),
                    index,
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(new org.gtk.glib.Date(valuePOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return RESULT != 0;
    }
    
    /**
     * Copies the first datetime for the given tag in the taglist into the variable
     * pointed to by {@code value}. Unref the date with gst_date_time_unref() when
     * it is no longer needed.
     * <p>
     * Free-function: gst_date_time_unref
     * @param tag tag to read out
     * @param value address of a {@link DateTime}
     *     pointer variable to store the result into
     * @return {@code true}, if a datetime was copied, {@code false} if the tag didn't exist in
     *              the given list or if it was {@code null}.
     */
    public boolean getDateTime(@NotNull java.lang.String tag, @NotNull Out<org.gstreamer.gst.DateTime> value) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_get_date_time.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tag),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(new org.gstreamer.gst.DateTime(valuePOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return RESULT != 0;
    }
    
    /**
     * Gets the datetime that is at the given index for the given tag in the given
     * list and copies it into the variable pointed to by {@code value}. Unref the datetime
     * with gst_date_time_unref() when it is no longer needed.
     * <p>
     * Free-function: gst_date_time_unref
     * @param tag tag to read out
     * @param index number of entry to read out
     * @param value location for the result
     * @return {@code true}, if a value was copied, {@code false} if the tag didn't exist in the
     *              given list or if it was {@code null}.
     */
    public boolean getDateTimeIndex(@NotNull java.lang.String tag, int index, @NotNull Out<org.gstreamer.gst.DateTime> value) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_get_date_time_index.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tag),
                    index,
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(new org.gstreamer.gst.DateTime(valuePOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return RESULT != 0;
    }
    
    /**
     * Copies the contents for the given tag into the value, merging multiple values
     * into one if multiple values are associated with the tag.
     * @param tag tag to read out
     * @param value location for the result
     * @return {@code true}, if a value was copied, {@code false} if the tag didn't exist in the
     *              given list.
     */
    public boolean getDouble(@NotNull java.lang.String tag, Out<Double> value) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_get_double.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tag),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return RESULT != 0;
    }
    
    /**
     * Gets the value that is at the given index for the given tag in the given
     * list.
     * @param tag tag to read out
     * @param index number of entry to read out
     * @param value location for the result
     * @return {@code true}, if a value was copied, {@code false} if the tag didn't exist in the
     *              given list.
     */
    public boolean getDoubleIndex(@NotNull java.lang.String tag, int index, Out<Double> value) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_DOUBLE);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_get_double_index.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tag),
                    index,
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
        return RESULT != 0;
    }
    
    /**
     * Copies the contents for the given tag into the value, merging multiple values
     * into one if multiple values are associated with the tag.
     * @param tag tag to read out
     * @param value location for the result
     * @return {@code true}, if a value was copied, {@code false} if the tag didn't exist in the
     *              given list.
     */
    public boolean getFloat(@NotNull java.lang.String tag, Out<Float> value) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_FLOAT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_get_float.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tag),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_FLOAT, 0));
        return RESULT != 0;
    }
    
    /**
     * Gets the value that is at the given index for the given tag in the given
     * list.
     * @param tag tag to read out
     * @param index number of entry to read out
     * @param value location for the result
     * @return {@code true}, if a value was copied, {@code false} if the tag didn't exist in the
     *              given list.
     */
    public boolean getFloatIndex(@NotNull java.lang.String tag, int index, Out<Float> value) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_FLOAT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_get_float_index.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tag),
                    index,
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_FLOAT, 0));
        return RESULT != 0;
    }
    
    /**
     * Copies the contents for the given tag into the value, merging multiple values
     * into one if multiple values are associated with the tag.
     * @param tag tag to read out
     * @param value location for the result
     * @return {@code true}, if a value was copied, {@code false} if the tag didn't exist in the
     *              given list.
     */
    public boolean getInt(@NotNull java.lang.String tag, Out<Integer> value) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_get_int.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tag),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Copies the contents for the given tag into the value, merging multiple values
     * into one if multiple values are associated with the tag.
     * @param tag tag to read out
     * @param value location for the result
     * @return {@code true}, if a value was copied, {@code false} if the tag didn't exist in the
     *              given list.
     */
    public boolean getInt64(@NotNull java.lang.String tag, Out<Long> value) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_get_int64.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tag),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT != 0;
    }
    
    /**
     * Gets the value that is at the given index for the given tag in the given
     * list.
     * @param tag tag to read out
     * @param index number of entry to read out
     * @param value location for the result
     * @return {@code true}, if a value was copied, {@code false} if the tag didn't exist in the
     *              given list.
     */
    public boolean getInt64Index(@NotNull java.lang.String tag, int index, Out<Long> value) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_get_int64_index.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tag),
                    index,
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT != 0;
    }
    
    /**
     * Gets the value that is at the given index for the given tag in the given
     * list.
     * @param tag tag to read out
     * @param index number of entry to read out
     * @param value location for the result
     * @return {@code true}, if a value was copied, {@code false} if the tag didn't exist in the
     *              given list.
     */
    public boolean getIntIndex(@NotNull java.lang.String tag, int index, Out<Integer> value) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_get_int_index.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tag),
                    index,
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Copies the contents for the given tag into the value, merging multiple values
     * into one if multiple values are associated with the tag.
     * @param tag tag to read out
     * @param value location for the result
     * @return {@code true}, if a value was copied, {@code false} if the tag didn't exist in the
     *              given list.
     */
    public boolean getPointer(@NotNull java.lang.String tag, @Nullable Out<java.lang.foreign.MemoryAddress> value) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_get_pointer.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tag),
                    (Addressable) (value == null ? MemoryAddress.NULL : (Addressable) valuePOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (value != null) value.set(valuePOINTER.get(Interop.valueLayout.ADDRESS, 0));
        return RESULT != 0;
    }
    
    /**
     * Gets the value that is at the given index for the given tag in the given
     * list.
     * @param tag tag to read out
     * @param index number of entry to read out
     * @param value location for the result
     * @return {@code true}, if a value was copied, {@code false} if the tag didn't exist in the
     *              given list.
     */
    public boolean getPointerIndex(@NotNull java.lang.String tag, int index, @Nullable Out<java.lang.foreign.MemoryAddress> value) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_get_pointer_index.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tag),
                    index,
                    (Addressable) (value == null ? MemoryAddress.NULL : (Addressable) valuePOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (value != null) value.set(valuePOINTER.get(Interop.valueLayout.ADDRESS, 0));
        return RESULT != 0;
    }
    
    /**
     * Copies the first sample for the given tag in the taglist into the variable
     * pointed to by {@code sample}. Free the sample with gst_sample_unref() when it is
     * no longer needed. You can retrieve the buffer from the sample using
     * gst_sample_get_buffer() and the associated caps (if any) with
     * gst_sample_get_caps().
     * <p>
     * Free-function: gst_sample_unref
     * @param tag tag to read out
     * @param sample address of a GstSample
     *     pointer variable to store the result into
     * @return {@code true}, if a sample was returned, {@code false} if the tag didn't exist in
     *              the given list or if it was {@code null}.
     */
    public boolean getSample(@NotNull java.lang.String tag, @NotNull Out<org.gstreamer.gst.Sample> sample) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        java.util.Objects.requireNonNull(sample, "Parameter 'sample' must not be null");
        MemorySegment samplePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_get_sample.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tag),
                    (Addressable) samplePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        sample.set(new org.gstreamer.gst.Sample(samplePOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return RESULT != 0;
    }
    
    /**
     * Gets the sample that is at the given index for the given tag in the given
     * list and copies it into the variable pointed to by {@code sample}. Free the sample
     * with gst_sample_unref() when it is no longer needed. You can retrieve the
     * buffer from the sample using gst_sample_get_buffer() and the associated
     * caps (if any) with gst_sample_get_caps().
     * <p>
     * Free-function: gst_sample_unref
     * @param tag tag to read out
     * @param index number of entry to read out
     * @param sample address of a GstSample
     *     pointer variable to store the result into
     * @return {@code true}, if a sample was copied, {@code false} if the tag didn't exist in the
     *              given list or if it was {@code null}.
     */
    public boolean getSampleIndex(@NotNull java.lang.String tag, int index, @NotNull Out<org.gstreamer.gst.Sample> sample) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        java.util.Objects.requireNonNull(sample, "Parameter 'sample' must not be null");
        MemorySegment samplePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_get_sample_index.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tag),
                    index,
                    (Addressable) samplePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        sample.set(new org.gstreamer.gst.Sample(samplePOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
        return RESULT != 0;
    }
    
    /**
     * Gets the scope of {@code list}.
     * @return The scope of {@code list}
     */
    public @NotNull org.gstreamer.gst.TagScope getScope() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_get_scope.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.TagScope.of(RESULT);
    }
    
    /**
     * Copies the contents for the given tag into the value, possibly merging
     * multiple values into one if multiple values are associated with the tag.
     * <p>
     * Use gst_tag_list_get_string_index (list, tag, 0, value) if you want
     * to retrieve the first string associated with this tag unmodified.
     * <p>
     * The resulting string in {@code value} will be in UTF-8 encoding and should be
     * freed by the caller using g_free when no longer needed. The
     * returned string is also guaranteed to be non-{@code null} and non-empty.
     * <p>
     * Free-function: g_free
     * @param tag tag to read out
     * @param value location for the result
     * @return {@code true}, if a value was copied, {@code false} if the tag didn't exist in the
     *              given list.
     */
    public boolean getString(@NotNull java.lang.String tag, @NotNull Out<java.lang.String> value) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_get_string.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tag),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(Interop.getStringFrom(valuePOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        return RESULT != 0;
    }
    
    /**
     * Gets the value that is at the given index for the given tag in the given
     * list.
     * <p>
     * The resulting string in {@code value} will be in UTF-8 encoding and should be
     * freed by the caller using g_free when no longer needed. The
     * returned string is also guaranteed to be non-{@code null} and non-empty.
     * <p>
     * Free-function: g_free
     * @param tag tag to read out
     * @param index number of entry to read out
     * @param value location for the result
     * @return {@code true}, if a value was copied, {@code false} if the tag didn't exist in the
     *              given list.
     */
    public boolean getStringIndex(@NotNull java.lang.String tag, int index, @NotNull Out<java.lang.String> value) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_get_string_index.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tag),
                    index,
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(Interop.getStringFrom(valuePOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        return RESULT != 0;
    }
    
    /**
     * Checks how many value are stored in this tag list for the given tag.
     * @param tag the tag to query
     * @return The number of tags stored
     */
    public int getTagSize(@NotNull java.lang.String tag) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_get_tag_size.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tag));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Copies the contents for the given tag into the value, merging multiple values
     * into one if multiple values are associated with the tag.
     * @param tag tag to read out
     * @param value location for the result
     * @return {@code true}, if a value was copied, {@code false} if the tag didn't exist in the
     *              given list.
     */
    public boolean getUint(@NotNull java.lang.String tag, Out<Integer> value) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_get_uint.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tag),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Copies the contents for the given tag into the value, merging multiple values
     * into one if multiple values are associated with the tag.
     * @param tag tag to read out
     * @param value location for the result
     * @return {@code true}, if a value was copied, {@code false} if the tag didn't exist in the
     *              given list.
     */
    public boolean getUint64(@NotNull java.lang.String tag, Out<Long> value) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_get_uint64.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tag),
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT != 0;
    }
    
    /**
     * Gets the value that is at the given index for the given tag in the given
     * list.
     * @param tag tag to read out
     * @param index number of entry to read out
     * @param value location for the result
     * @return {@code true}, if a value was copied, {@code false} if the tag didn't exist in the
     *              given list.
     */
    public boolean getUint64Index(@NotNull java.lang.String tag, int index, Out<Long> value) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_get_uint64_index.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tag),
                    index,
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT != 0;
    }
    
    /**
     * Gets the value that is at the given index for the given tag in the given
     * list.
     * @param tag tag to read out
     * @param index number of entry to read out
     * @param value location for the result
     * @return {@code true}, if a value was copied, {@code false} if the tag didn't exist in the
     *              given list.
     */
    public boolean getUintIndex(@NotNull java.lang.String tag, int index, Out<Integer> value) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_get_uint_index.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tag),
                    index,
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(valuePOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT != 0;
    }
    
    /**
     * Gets the value that is at the given index for the given tag in the given
     * list.
     * @param tag tag to read out
     * @param index number of entry to read out
     * @return The GValue for the specified
     *          entry or {@code null} if the tag wasn't available or the tag
     *          doesn't have as many entries
     */
    public @Nullable org.gtk.gobject.Value getValueIndex(@NotNull java.lang.String tag, int index) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_list_get_value_index.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tag),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Value(RESULT, Ownership.NONE);
    }
    
    /**
     * Inserts the tags of the {@code from} list into the first list using the given mode.
     * @param from list to merge from
     * @param mode the mode to use
     */
    public void insert(@NotNull org.gstreamer.gst.TagList from, @NotNull org.gstreamer.gst.TagMergeMode mode) {
        java.util.Objects.requireNonNull(from, "Parameter 'from' must not be null");
        java.util.Objects.requireNonNull(mode, "Parameter 'mode' must not be null");
        try {
            DowncallHandles.gst_tag_list_insert.invokeExact(
                    handle(),
                    from.handle(),
                    mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Checks if the given taglist is empty.
     * @return {@code true} if the taglist is empty, otherwise {@code false}.
     */
    public boolean isEmpty() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_is_empty.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Checks if the two given taglists are equal.
     * @param list2 a {@link TagList}.
     * @return {@code true} if the taglists are equal, otherwise {@code false}
     */
    public boolean isEqual(@NotNull org.gstreamer.gst.TagList list2) {
        java.util.Objects.requireNonNull(list2, "Parameter 'list2' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_is_equal.invokeExact(
                    handle(),
                    list2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Merges the two given lists into a new list. If one of the lists is {@code null}, a
     * copy of the other is returned. If both lists are {@code null}, {@code null} is returned.
     * <p>
     * Free-function: gst_tag_list_unref
     * @param list2 second list to merge
     * @param mode the mode to use
     * @return the new list
     */
    public @Nullable org.gstreamer.gst.TagList merge(@Nullable org.gstreamer.gst.TagList list2, @NotNull org.gstreamer.gst.TagMergeMode mode) {
        java.util.Objects.requireNonNull(mode, "Parameter 'mode' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_list_merge.invokeExact(
                    handle(),
                    (Addressable) (list2 == null ? MemoryAddress.NULL : list2.handle()),
                    mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.TagList(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the number of tags in {@code list}.
     * @return The number of tags in {@code list}.
     */
    public int nTags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_n_tags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the name of the tag in {@code list} at {@code index}.
     * @param index the index
     * @return The name of the tag at {@code index}.
     */
    public @NotNull java.lang.String nthTagName(int index) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_list_nth_tag_name.invokeExact(
                    handle(),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Peeks at the value that is at the given index for the given tag in the given
     * list.
     * <p>
     * The resulting string in {@code value} will be in UTF-8 encoding and doesn't need
     * to be freed by the caller. The returned string is also guaranteed to
     * be non-{@code null} and non-empty.
     * @param tag tag to read out
     * @param index number of entry to read out
     * @param value location for the result
     * @return {@code true}, if a value was set, {@code false} if the tag didn't exist in the
     *              given list.
     */
    public boolean peekStringIndex(@NotNull java.lang.String tag, int index, @NotNull Out<java.lang.String> value) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_peek_string_index.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tag),
                    index,
                    (Addressable) valuePOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        value.set(Interop.getStringFrom(valuePOINTER.get(Interop.valueLayout.ADDRESS, 0)));
        return RESULT != 0;
    }
    
    /**
     * Removes the given tag from the taglist.
     * @param tag tag to remove
     */
    public void removeTag(@NotNull java.lang.String tag) {
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        try {
            DowncallHandles.gst_tag_list_remove_tag.invokeExact(
                    handle(),
                    Interop.allocateNativeString(tag));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the scope of {@code list} to {@code scope}. By default the scope
     * of a taglist is stream scope.
     * @param scope new scope for {@code list}
     */
    public void setScope(@NotNull org.gstreamer.gst.TagScope scope) {
        java.util.Objects.requireNonNull(scope, "Parameter 'scope' must not be null");
        try {
            DowncallHandles.gst_tag_list_set_scope.invokeExact(
                    handle(),
                    scope.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Serializes a tag list to a string.
     * @return a newly-allocated string, or {@code null} in case of
     *     an error. The string must be freed with g_free() when no longer
     *     needed.
     */
    public @Nullable java.lang.String toString() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_list_to_string.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Copies the contents for the given tag into the value,
     * merging multiple values into one if multiple values are associated
     * with the tag.
     * You must g_value_unset() the value after use.
     * @param dest uninitialized {@link org.gtk.gobject.Value} to copy into
     * @param list list to get the tag from
     * @param tag tag to read out
     * @return {@code true}, if a value was copied, {@code false} if the tag didn't exist in the
     *          given list.
     */
    public static boolean copyValue(@NotNull org.gtk.gobject.Value dest, @NotNull org.gstreamer.gst.TagList list, @NotNull java.lang.String tag) {
        java.util.Objects.requireNonNull(dest, "Parameter 'dest' must not be null");
        java.util.Objects.requireNonNull(list, "Parameter 'list' must not be null");
        java.util.Objects.requireNonNull(tag, "Parameter 'tag' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_list_copy_value.invokeExact(
                    dest.handle(),
                    list.handle(),
                    Interop.allocateNativeString(tag));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_tag_list_new = Interop.downcallHandle(
            "gst_tag_list_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gst_tag_list_new_empty = Interop.downcallHandle(
            "gst_tag_list_new_empty",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_new_from_string = Interop.downcallHandle(
            "gst_tag_list_new_from_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_new_valist = Interop.downcallHandle(
            "gst_tag_list_new_valist",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_add = Interop.downcallHandle(
            "gst_tag_list_add",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gst_tag_list_add_valist = Interop.downcallHandle(
            "gst_tag_list_add_valist",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_add_valist_values = Interop.downcallHandle(
            "gst_tag_list_add_valist_values",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_add_value = Interop.downcallHandle(
            "gst_tag_list_add_value",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_add_values = Interop.downcallHandle(
            "gst_tag_list_add_values",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gst_tag_list_copy = Interop.downcallHandle(
            "gst_tag_list_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_foreach = Interop.downcallHandle(
            "gst_tag_list_foreach",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_get_boolean = Interop.downcallHandle(
            "gst_tag_list_get_boolean",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_tag_list_get_boolean_index = Interop.downcallHandle(
            "gst_tag_list_get_boolean_index",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_tag_list_get_date = Interop.downcallHandle(
            "gst_tag_list_get_date",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_get_date_index = Interop.downcallHandle(
            "gst_tag_list_get_date_index",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_get_date_time = Interop.downcallHandle(
            "gst_tag_list_get_date_time",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_get_date_time_index = Interop.downcallHandle(
            "gst_tag_list_get_date_time_index",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_get_double = Interop.downcallHandle(
            "gst_tag_list_get_double",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_get_double_index = Interop.downcallHandle(
            "gst_tag_list_get_double_index",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_get_float = Interop.downcallHandle(
            "gst_tag_list_get_float",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_get_float_index = Interop.downcallHandle(
            "gst_tag_list_get_float_index",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_get_int = Interop.downcallHandle(
            "gst_tag_list_get_int",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_get_int64 = Interop.downcallHandle(
            "gst_tag_list_get_int64",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_get_int64_index = Interop.downcallHandle(
            "gst_tag_list_get_int64_index",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_get_int_index = Interop.downcallHandle(
            "gst_tag_list_get_int_index",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_get_pointer = Interop.downcallHandle(
            "gst_tag_list_get_pointer",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_get_pointer_index = Interop.downcallHandle(
            "gst_tag_list_get_pointer_index",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_get_sample = Interop.downcallHandle(
            "gst_tag_list_get_sample",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_get_sample_index = Interop.downcallHandle(
            "gst_tag_list_get_sample_index",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_get_scope = Interop.downcallHandle(
            "gst_tag_list_get_scope",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_get_string = Interop.downcallHandle(
            "gst_tag_list_get_string",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_get_string_index = Interop.downcallHandle(
            "gst_tag_list_get_string_index",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_get_tag_size = Interop.downcallHandle(
            "gst_tag_list_get_tag_size",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_get_uint = Interop.downcallHandle(
            "gst_tag_list_get_uint",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_get_uint64 = Interop.downcallHandle(
            "gst_tag_list_get_uint64",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_get_uint64_index = Interop.downcallHandle(
            "gst_tag_list_get_uint64_index",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_get_uint_index = Interop.downcallHandle(
            "gst_tag_list_get_uint_index",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_get_value_index = Interop.downcallHandle(
            "gst_tag_list_get_value_index",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_tag_list_insert = Interop.downcallHandle(
            "gst_tag_list_insert",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_tag_list_is_empty = Interop.downcallHandle(
            "gst_tag_list_is_empty",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_is_equal = Interop.downcallHandle(
            "gst_tag_list_is_equal",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_merge = Interop.downcallHandle(
            "gst_tag_list_merge",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_tag_list_n_tags = Interop.downcallHandle(
            "gst_tag_list_n_tags",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_nth_tag_name = Interop.downcallHandle(
            "gst_tag_list_nth_tag_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_tag_list_peek_string_index = Interop.downcallHandle(
            "gst_tag_list_peek_string_index",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_remove_tag = Interop.downcallHandle(
            "gst_tag_list_remove_tag",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_set_scope = Interop.downcallHandle(
            "gst_tag_list_set_scope",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_tag_list_to_string = Interop.downcallHandle(
            "gst_tag_list_to_string",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_tag_list_copy_value = Interop.downcallHandle(
            "gst_tag_list_copy_value",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private TagList struct;
        
         /**
         * A {@link TagList.Build} object constructs a {@link TagList} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = TagList.allocate();
        }
        
         /**
         * Finish building the {@link TagList} struct.
         * @return A new instance of {@code TagList} with the fields 
         *         that were set in the Build object.
         */
        public TagList construct() {
            return struct;
        }
        
        /**
         * the parent type
         * @param miniObject The value for the {@code miniObject} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMiniObject(org.gstreamer.gst.MiniObject miniObject) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mini_object"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (miniObject == null ? MemoryAddress.NULL : miniObject.handle()));
            return this;
        }
    }
}
