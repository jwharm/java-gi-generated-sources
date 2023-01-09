package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Buffers are the basic unit of data transfer in GStreamer. They contain the
 * timing and offset along with other arbitrary metadata that is associated
 * with the {@link Memory} blocks that the buffer contains.
 * <p>
 * Buffers are usually created with gst_buffer_new(). After a buffer has been
 * created one will typically allocate memory for it and add it to the buffer.
 * The following example creates a buffer that can hold a given video frame
 * with a given width, height and bits per plane.
 * <pre>{@code  C
 *   GstBuffer *buffer;
 *   GstMemory *memory;
 *   gint size, width, height, bpp;
 *   ...
 *   size = width * height * bpp;
 *   buffer = gst_buffer_new ();
 *   memory = gst_allocator_alloc (NULL, size, NULL);
 *   gst_buffer_insert_memory (buffer, -1, memory);
 *   ...
 * }</pre>
 * <p>
 * Alternatively, use gst_buffer_new_allocate() to create a buffer with
 * preallocated data of a given size.
 * <p>
 * Buffers can contain a list of {@link Memory} objects. You can retrieve how many
 * memory objects with gst_buffer_n_memory() and you can get a pointer
 * to memory with gst_buffer_peek_memory()
 * <p>
 * A buffer will usually have timestamps, and a duration, but neither of these
 * are guaranteed (they may be set to {@code GST_CLOCK_TIME_NONE}). Whenever a
 * meaningful value can be given for these, they should be set. The timestamps
 * and duration are measured in nanoseconds (they are {@link ClockTime} values).
 * <p>
 * The buffer DTS refers to the timestamp when the buffer should be decoded and
 * is usually monotonically increasing. The buffer PTS refers to the timestamp when
 * the buffer content should be presented to the user and is not always
 * monotonically increasing.
 * <p>
 * A buffer can also have one or both of a start and an end offset. These are
 * media-type specific. For video buffers, the start offset will generally be
 * the frame number. For audio buffers, it will be the number of samples
 * produced so far. For compressed data, it could be the byte offset in a
 * source or destination file. Likewise, the end offset will be the offset of
 * the end of the buffer. These can only be meaningfully interpreted if you
 * know the media type of the buffer (the preceding CAPS event). Either or both
 * can be set to {@code GST_BUFFER_OFFSET_NONE}.
 * <p>
 * gst_buffer_ref() is used to increase the refcount of a buffer. This must be
 * done when you want to keep a handle to the buffer after pushing it to the
 * next element. The buffer refcount determines the writability of the buffer, a
 * buffer is only writable when the refcount is exactly 1, i.e. when the caller
 * has the only reference to the buffer.
 * <p>
 * To efficiently create a smaller buffer out of an existing one, you can
 * use gst_buffer_copy_region(). This method tries to share the memory objects
 * between the two buffers.
 * <p>
 * If a plug-in wants to modify the buffer data or metadata in-place, it should
 * first obtain a buffer that is safe to modify by using
 * gst_buffer_make_writable(). This function is optimized so that a copy will
 * only be made when it is necessary.
 * <p>
 * Several flags of the buffer can be set and unset with the
 * GST_BUFFER_FLAG_SET() and GST_BUFFER_FLAG_UNSET() macros. Use
 * GST_BUFFER_FLAG_IS_SET() to test if a certain {@link BufferFlags} flag is set.
 * <p>
 * Buffers can be efficiently merged into a larger buffer with
 * gst_buffer_append(). Copying of memory will only be done when absolutely
 * needed.
 * <p>
 * Arbitrary extra metadata can be set on a buffer with gst_buffer_add_meta().
 * Metadata can be retrieved with gst_buffer_get_meta(). See also {@link Meta}.
 * <p>
 * An element should either unref the buffer or push it out on a src pad
 * using gst_pad_push() (see {@link Pad}).
 * <p>
 * Buffers are usually freed by unreffing them with gst_buffer_unref(). When
 * the refcount drops to 0, any memory and metadata pointed to by the buffer is
 * unreffed as well. Buffers allocated from a {@link BufferPool} will be returned to
 * the pool when the refcount drops to 0.
 * <p>
 * The {@link ParentBufferMeta} is a meta which can be attached to a {@link Buffer}
 * to hold a reference to another buffer that is only released when the child
 * {@link Buffer} is released.
 * <p>
 * Typically, {@link ParentBufferMeta} is used when the child buffer is directly
 * using the {@link Memory} of the parent buffer, and wants to prevent the parent
 * buffer from being returned to a buffer pool until the {@link Memory} is available
 * for re-use. (Since: 1.6)
 */
public class Buffer extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstBuffer";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.MiniObject.getMemoryLayout().withName("mini_object"),
            Interop.valueLayout.ADDRESS.withName("pool"),
            Interop.valueLayout.C_LONG.withName("pts"),
            Interop.valueLayout.C_LONG.withName("dts"),
            Interop.valueLayout.C_LONG.withName("duration"),
            Interop.valueLayout.C_LONG.withName("offset"),
            Interop.valueLayout.C_LONG.withName("offset_end")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Buffer}
     * @return A new, uninitialized @{link Buffer}
     */
    public static Buffer allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Buffer newInstance = new Buffer(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code mini_object}
     * @return The value of the field {@code mini_object}
     */
    public org.gstreamer.gst.MiniObject getMiniObject() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("mini_object"));
        return org.gstreamer.gst.MiniObject.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code mini_object}
     * @param miniObject The new value of the field {@code mini_object}
     */
    public void setMiniObject(org.gstreamer.gst.MiniObject miniObject) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mini_object"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (miniObject == null ? MemoryAddress.NULL : miniObject.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code pool}
     * @return The value of the field {@code pool}
     */
    public org.gstreamer.gst.BufferPool getPool() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pool"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return (org.gstreamer.gst.BufferPool) Interop.register(RESULT, org.gstreamer.gst.BufferPool.fromAddress).marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code pool}
     * @param pool The new value of the field {@code pool}
     */
    public void setPool(org.gstreamer.gst.BufferPool pool) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pool"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pool == null ? MemoryAddress.NULL : pool.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code pts}
     * @return The value of the field {@code pts}
     */
    public org.gstreamer.gst.ClockTime getPts() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pts"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.gstreamer.gst.ClockTime(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code pts}
     * @param pts The new value of the field {@code pts}
     */
    public void setPts(org.gstreamer.gst.ClockTime pts) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pts"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pts == null ? MemoryAddress.NULL : pts.getValue().longValue()));
        }
    }
    
    /**
     * Get the value of the field {@code dts}
     * @return The value of the field {@code dts}
     */
    public org.gstreamer.gst.ClockTime getDts() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dts"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.gstreamer.gst.ClockTime(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code dts}
     * @param dts The new value of the field {@code dts}
     */
    public void setDts(org.gstreamer.gst.ClockTime dts) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dts"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dts == null ? MemoryAddress.NULL : dts.getValue().longValue()));
        }
    }
    
    /**
     * Get the value of the field {@code duration}
     * @return The value of the field {@code duration}
     */
    public org.gstreamer.gst.ClockTime getDuration() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("duration"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.gstreamer.gst.ClockTime(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code duration}
     * @param duration The new value of the field {@code duration}
     */
    public void setDuration(org.gstreamer.gst.ClockTime duration) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("duration"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (duration == null ? MemoryAddress.NULL : duration.getValue().longValue()));
        }
    }
    
    /**
     * Get the value of the field {@code offset}
     * @return The value of the field {@code offset}
     */
    public long getOffset() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("offset"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code offset}
     * @param offset The new value of the field {@code offset}
     */
    public void setOffset(long offset) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("offset"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), offset);
        }
    }
    
    /**
     * Get the value of the field {@code offset_end}
     * @return The value of the field {@code offset_end}
     */
    public long getOffsetEnd() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("offset_end"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code offset_end}
     * @param offsetEnd The new value of the field {@code offset_end}
     */
    public void setOffsetEnd(long offsetEnd) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("offset_end"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), offsetEnd);
        }
    }
    
    /**
     * Create a Buffer proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Buffer(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Buffer> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Buffer(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a newly allocated buffer without any data.
     */
    public Buffer() {
        super(constructNew());
        this.takeOwnership();
    }
    
    private static MemoryAddress constructNewAllocate(@Nullable org.gstreamer.gst.Allocator allocator, long size, @Nullable org.gstreamer.gst.AllocationParams params) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_new_allocate.invokeExact(
                    (Addressable) (allocator == null ? MemoryAddress.NULL : allocator.handle()),
                    size,
                    (Addressable) (params == null ? MemoryAddress.NULL : params.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Tries to create a newly allocated buffer with data of the given size and
     * extra parameters from {@code allocator}. If the requested amount of memory can't be
     * allocated, {@code null} will be returned. The allocated buffer memory is not cleared.
     * <p>
     * When {@code allocator} is {@code null}, the default memory allocator will be used.
     * <p>
     * Note that when {@code size} == 0, the buffer will not have memory associated with it.
     * @param allocator the {@link Allocator} to use, or {@code null} to use the
     *     default allocator
     * @param size the size in bytes of the new buffer's data.
     * @param params optional parameters
     * @return a new {@link Buffer}
     */
    public static Buffer newAllocate(@Nullable org.gstreamer.gst.Allocator allocator, long size, @Nullable org.gstreamer.gst.AllocationParams params) {
        var RESULT = constructNewAllocate(allocator, size, params);
        var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewMemdup(byte[] data, long size) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_buffer_new_memdup.invokeExact(
                        Interop.allocateNativeArray(data, false, SCOPE),
                        size);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a new buffer of size {@code size} and fills it with a copy of {@code data}.
     * @param data data to copy into new buffer
     * @param size size of {@code data} in bytes
     * @return a new {@link Buffer}
     */
    public static Buffer newMemdup(byte[] data, long size) {
        var RESULT = constructNewMemdup(data, size);
        var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewWrapped(byte[] data, long size) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_buffer_new_wrapped.invokeExact(
                        Interop.allocateNativeArray(data, false, SCOPE),
                        size);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * Creates a new buffer that wraps the given {@code data}. The memory will be freed
     * with g_free() and will be marked writable.
     * @param data data to wrap
     * @param size allocated size of {@code data}
     * @return a new {@link Buffer}
     */
    public static Buffer newWrapped(byte[] data, long size) {
        var RESULT = constructNewWrapped(data, size);
        var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewWrappedBytes(org.gtk.glib.Bytes bytes) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_new_wrapped_bytes.invokeExact(bytes.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Creates a new {@link Buffer} that wraps the given {@code bytes}. The data inside
     * {@code bytes} cannot be {@code null} and the resulting buffer will be marked as read only.
     * @param bytes a {@link org.gtk.glib.Bytes} to wrap
     * @return a new {@link Buffer} wrapping {@code bytes}
     */
    public static Buffer newWrappedBytes(org.gtk.glib.Bytes bytes) {
        var RESULT = constructNewWrappedBytes(bytes);
        var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewWrappedFull(org.gstreamer.gst.MemoryFlags flags, byte[] data, long maxsize, long offset, long size, @Nullable org.gtk.glib.DestroyNotify notify) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_buffer_new_wrapped_full.invokeExact(
                        flags.getValue(),
                        Interop.allocateNativeArray(data, false, SCOPE),
                        maxsize,
                        offset,
                        size,
                        (Addressable) MemoryAddress.NULL,
                        (Addressable) (notify == null ? MemoryAddress.NULL : (Addressable) notify.toCallback()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * Allocates a new buffer that wraps the given memory. {@code data} must point to
     * {@code maxsize} of memory, the wrapped buffer will have the region from {@code offset} and
     * {@code size} visible.
     * <p>
     * When the buffer is destroyed, {@code notify} will be called with {@code user_data}.
     * <p>
     * The prefix/padding must be filled with 0 if {@code flags} contains
     * {@code GST_MEMORY_FLAG_ZERO_PREFIXED} and {@code GST_MEMORY_FLAG_ZERO_PADDED} respectively.
     * @param flags {@link MemoryFlags}
     * @param data data to wrap
     * @param maxsize allocated size of {@code data}
     * @param offset offset in {@code data}
     * @param size size of valid data
     * @param notify called with {@code user_data} when the memory is freed
     * @return a new {@link Buffer}
     */
    public static Buffer newWrappedFull(org.gstreamer.gst.MemoryFlags flags, byte[] data, long maxsize, long offset, long size, @Nullable org.gtk.glib.DestroyNotify notify) {
        var RESULT = constructNewWrappedFull(flags, data, maxsize, offset, size, notify);
        var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Creates and adds a {@link CustomMeta} for the desired {@code name}. {@code name} must have
     * been successfully registered with gst_meta_register_custom().
     * @param name the registered name of the desired custom meta
     * @return The {@link CustomMeta} that was added to the buffer
     */
    public @Nullable org.gstreamer.gst.CustomMeta addCustomMeta(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_buffer_add_custom_meta.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gstreamer.gst.CustomMeta.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Adds metadata for {@code info} to {@code buffer} using the parameters in {@code params}.
     * @param info a {@link MetaInfo}
     * @param params params for {@code info}
     * @return the metadata for the api in {@code info} on {@code buffer}.
     */
    public @Nullable org.gstreamer.gst.Meta addMeta(org.gstreamer.gst.MetaInfo info, @Nullable java.lang.foreign.MemoryAddress params) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_add_meta.invokeExact(
                    handle(),
                    info.handle(),
                    (Addressable) (params == null ? MemoryAddress.NULL : (Addressable) params));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Meta.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Adds a {@link ParentBufferMeta} to {@code buffer} that holds a reference on
     * {@code ref} until the buffer is freed.
     * @param ref a {@link Buffer} to ref
     * @return The {@link ParentBufferMeta} that was added to the buffer
     */
    public @Nullable org.gstreamer.gst.ParentBufferMeta addParentBufferMeta(org.gstreamer.gst.Buffer ref) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_add_parent_buffer_meta.invokeExact(
                    handle(),
                    ref.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.ParentBufferMeta.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Attaches protection metadata to a {@link Buffer}.
     * @param info a {@link Structure} holding cryptographic
     *     information relating to the sample contained in {@code buffer}. This
     *     function takes ownership of {@code info}.
     * @return a pointer to the added {@link ProtectionMeta} if successful
     */
    public org.gstreamer.gst.ProtectionMeta addProtectionMeta(org.gstreamer.gst.Structure info) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_add_protection_meta.invokeExact(
                    handle(),
                    info.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        info.yieldOwnership();
        return org.gstreamer.gst.ProtectionMeta.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Adds a {@link ReferenceTimestampMeta} to {@code buffer} that holds a {@code timestamp} and
     * optionally {@code duration} based on a specific timestamp {@code reference}. See the
     * documentation of {@link ReferenceTimestampMeta} for details.
     * @param reference identifier for the timestamp reference.
     * @param timestamp timestamp
     * @param duration duration, or {@code GST_CLOCK_TIME_NONE}
     * @return The {@link ReferenceTimestampMeta} that was added to the buffer
     */
    public @Nullable org.gstreamer.gst.ReferenceTimestampMeta addReferenceTimestampMeta(org.gstreamer.gst.Caps reference, org.gstreamer.gst.ClockTime timestamp, org.gstreamer.gst.ClockTime duration) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_add_reference_timestamp_meta.invokeExact(
                    handle(),
                    reference.handle(),
                    timestamp.getValue().longValue(),
                    duration.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.ReferenceTimestampMeta.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Appends all the memory from {@code buf2} to {@code buf1}. The result buffer will contain a
     * concatenation of the memory of {@code buf1} and {@code buf2}.
     * @param buf2 the second source {@link Buffer} to append.
     * @return the new {@link Buffer} that contains the memory
     *     of the two source buffers.
     */
    public org.gstreamer.gst.Buffer append(org.gstreamer.gst.Buffer buf2) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_append.invokeExact(
                    handle(),
                    buf2.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        buf2.yieldOwnership();
        var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Appends the memory block {@code mem} to {@code buffer}. This function takes
     * ownership of {@code mem} and thus doesn't increase its refcount.
     * <p>
     * This function is identical to gst_buffer_insert_memory() with an index of -1.
     * See gst_buffer_insert_memory() for more details.
     * @param mem a {@link Memory}.
     */
    public void appendMemory(org.gstreamer.gst.Memory mem) {
        try {
            DowncallHandles.gst_buffer_append_memory.invokeExact(
                    handle(),
                    mem.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        mem.yieldOwnership();
    }
    
    /**
     * Appends {@code size} bytes at {@code offset} from {@code buf2} to {@code buf1}. The result buffer will
     * contain a concatenation of the memory of {@code buf1} and the requested region of
     * {@code buf2}.
     * @param buf2 the second source {@link Buffer} to append.
     * @param offset the offset in {@code buf2}
     * @param size the size or -1 of {@code buf2}
     * @return the new {@link Buffer} that contains the memory
     *     of the two source buffers.
     */
    public org.gstreamer.gst.Buffer appendRegion(org.gstreamer.gst.Buffer buf2, long offset, long size) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_append_region.invokeExact(
                    handle(),
                    buf2.handle(),
                    offset,
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        buf2.yieldOwnership();
        var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Creates a copy of the given buffer. This will make a newly allocated
     * copy of the data the source buffer contains.
     * @return a new copy of {@code buf}.
     */
    public org.gstreamer.gst.Buffer copyDeep() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_copy_deep.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Copies the information from {@code src} into {@code dest}.
     * <p>
     * If {@code dest} already contains memory and {@code flags} contains GST_BUFFER_COPY_MEMORY,
     * the memory from {@code src} will be appended to {@code dest}.
     * <p>
     * {@code flags} indicate which fields will be copied.
     * @param src a source {@link Buffer}
     * @param flags flags indicating what metadata fields should be copied.
     * @param offset offset to copy from
     * @param size total size to copy. If -1, all data is copied.
     * @return {@code true} if the copying succeeded, {@code false} otherwise.
     */
    public boolean copyInto(org.gstreamer.gst.Buffer src, org.gstreamer.gst.BufferCopyFlags flags, long offset, long size) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_buffer_copy_into.invokeExact(
                    handle(),
                    src.handle(),
                    flags.getValue(),
                    offset,
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Creates a sub-buffer from {@code parent} at {@code offset} and {@code size}.
     * This sub-buffer uses the actual memory space of the parent buffer.
     * This function will copy the offset and timestamp fields when the
     * offset is 0. If not, they will be set to {@code GST_CLOCK_TIME_NONE} and
     * {@code GST_BUFFER_OFFSET_NONE}.
     * If {@code offset} equals 0 and {@code size} equals the total size of {@code buffer}, the
     * duration and offset end fields are also copied. If not they will be set
     * to {@code GST_CLOCK_TIME_NONE} and {@code GST_BUFFER_OFFSET_NONE}.
     * @param flags the {@link BufferCopyFlags}
     * @param offset the offset into parent {@link Buffer} at which the new sub-buffer
     *          begins.
     * @param size the size of the new {@link Buffer} sub-buffer, in bytes. If -1, all
     *        data is copied.
     * @return the new {@link Buffer} or {@code null} if the arguments were
     *     invalid.
     */
    public org.gstreamer.gst.Buffer copyRegion(org.gstreamer.gst.BufferCopyFlags flags, long offset, long size) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_copy_region.invokeExact(
                    handle(),
                    flags.getValue(),
                    offset,
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Copies {@code size} bytes starting from {@code offset} in {@code buffer} to {@code dest}.
     * @param offset the offset to extract
     * @param dest the destination address
     * @param size the size to extract
     * @return The amount of bytes extracted. This value can be lower than {@code size}
     *    when {@code buffer} did not contain enough data.
     */
    public long extract(long offset, Out<byte[]> dest, long size) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment destPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.gst_buffer_extract.invokeExact(
                        handle(),
                        offset,
                        (Addressable) destPOINTER.address(),
                        size);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            dest.set(MemorySegment.ofAddress(destPOINTER.get(Interop.valueLayout.ADDRESS, 0), size * Interop.valueLayout.C_BYTE.byteSize(), SCOPE).toArray(Interop.valueLayout.C_BYTE));
            return RESULT;
        }
    }
    
    /**
     * Extracts a copy of at most {@code size} bytes the data at {@code offset} into
     * newly-allocated memory. {@code dest} must be freed using g_free() when done.
     * @param offset the offset to extract
     * @param size the size to extract
     * @param dest A pointer where
     *  the destination array will be written. Might be {@code null} if the size is 0.
     * @param destSize A location where the size of {@code dest} can be written
     */
    public void extractDup(long offset, long size, Out<byte[]> dest, Out<Long> destSize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment destPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment destSizePOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            try {
                DowncallHandles.gst_buffer_extract_dup.invokeExact(
                        handle(),
                        offset,
                        size,
                        (Addressable) destPOINTER.address(),
                        (Addressable) destSizePOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    destSize.set(destSizePOINTER.get(Interop.valueLayout.C_LONG, 0));
            dest.set(MemorySegment.ofAddress(destPOINTER.get(Interop.valueLayout.ADDRESS, 0), destSize.get().intValue() * Interop.valueLayout.C_BYTE.byteSize(), SCOPE).toArray(Interop.valueLayout.C_BYTE));
        }
    }
    
    /**
     * Copies {@code size} bytes from {@code src} to {@code buffer} at {@code offset}.
     * @param offset the offset to fill
     * @param src the source address
     * @param size the size to fill
     * @return The amount of bytes copied. This value can be lower than {@code size}
     *    when {@code buffer} did not contain enough data.
     */
    public long fill(long offset, byte[] src, long size) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.gst_buffer_fill.invokeExact(
                        handle(),
                        offset,
                        Interop.allocateNativeArray(src, false, SCOPE),
                        size);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Finds the memory blocks that span {@code size} bytes starting from {@code offset}
     * in {@code buffer}.
     * <p>
     * When this function returns {@code true}, {@code idx} will contain the index of the first
     * memory block where the byte for {@code offset} can be found and {@code length} contains the
     * number of memory blocks containing the {@code size} remaining bytes. {@code skip} contains
     * the number of bytes to skip in the memory block at {@code idx} to get to the byte
     * for {@code offset}.
     * <p>
     * {@code size} can be -1 to get all the memory blocks after {@code idx}.
     * @param offset an offset
     * @param size a size
     * @param idx pointer to index
     * @param length pointer to length
     * @param skip pointer to skip
     * @return {@code true} when {@code size} bytes starting from {@code offset} could be found in
     * {@code buffer} and {@code idx}, {@code length} and {@code skip} will be filled.
     */
    public boolean findMemory(long offset, long size, Out<Integer> idx, Out<Integer> length, Out<Long> skip) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment idxPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment lengthPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment skipPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_buffer_find_memory.invokeExact(
                        handle(),
                        offset,
                        size,
                        (Addressable) idxPOINTER.address(),
                        (Addressable) lengthPOINTER.address(),
                        (Addressable) skipPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    idx.set(idxPOINTER.get(Interop.valueLayout.C_INT, 0));
                    length.set(lengthPOINTER.get(Interop.valueLayout.C_INT, 0));
                    skip.set(skipPOINTER.get(Interop.valueLayout.C_LONG, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Calls {@code func} with {@code user_data} for each meta in {@code buffer}.
     * <p>
     * {@code func} can modify the passed meta pointer or its contents. The return value
     * of {@code func} defines if this function returns or if the remaining metadata items
     * in the buffer should be skipped.
     * @param func a {@link BufferForeachMetaFunc} to call
     * @return {@code false} when {@code func} returned {@code false} for one of the metadata.
     */
    public boolean foreachMeta(org.gstreamer.gst.BufferForeachMetaFunc func) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_buffer_foreach_meta.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets all the memory blocks in {@code buffer}. The memory blocks will be merged
     * into one large {@link Memory}.
     * @return a {@link Memory} that contains the merged memory.
     */
    public @Nullable org.gstreamer.gst.Memory getAllMemory() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_get_all_memory.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Memory.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Finds the first {@link CustomMeta} on {@code buffer} for the desired {@code name}.
     * @param name the registered name of the custom meta to retrieve.
     * @return the {@link CustomMeta}
     */
    public @Nullable org.gstreamer.gst.CustomMeta getCustomMeta(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_buffer_get_custom_meta.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gstreamer.gst.CustomMeta.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Gets the {@link BufferFlags} flags set on this buffer.
     * @return the flags set on this buffer.
     */
    public org.gstreamer.gst.BufferFlags getFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_buffer_get_flags.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.BufferFlags(RESULT);
    }
    
    /**
     * Gets the memory block at index {@code idx} in {@code buffer}.
     * @param idx an index
     * @return a {@link Memory} that contains the data of the
     * memory block at {@code idx}.
     */
    public @Nullable org.gstreamer.gst.Memory getMemory(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_get_memory.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Memory.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets {@code length} memory blocks in {@code buffer} starting at {@code idx}. The memory blocks will
     * be merged into one large {@link Memory}.
     * <p>
     * If {@code length} is -1, all memory starting from {@code idx} is merged.
     * @param idx an index
     * @param length a length
     * @return a {@link Memory} that contains the merged data of {@code length}
     *    blocks starting at {@code idx}.
     */
    public @Nullable org.gstreamer.gst.Memory getMemoryRange(int idx, int length) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_get_memory_range.invokeExact(
                    handle(),
                    idx,
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Memory.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Gets the metadata for {@code api} on buffer. When there is no such metadata, {@code null} is
     * returned. If multiple metadata with the given {@code api} are attached to this
     * buffer only the first one is returned.  To handle multiple metadata with a
     * given API use gst_buffer_iterate_meta() or gst_buffer_foreach_meta() instead
     * and check the {@code meta->info.api} member for the API type.
     * @param api the {@link org.gtk.glib.Type} of an API
     * @return the metadata for {@code api} on {@code buffer}.
     */
    public @Nullable org.gstreamer.gst.Meta getMeta(org.gtk.glib.Type api) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_get_meta.invokeExact(
                    handle(),
                    api.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Meta.fromAddress.marshal(RESULT, null);
    }
    
    public int getNMeta(org.gtk.glib.Type apiType) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_buffer_get_n_meta.invokeExact(
                    handle(),
                    apiType.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Finds the first {@link ReferenceTimestampMeta} on {@code buffer} that conforms to
     * {@code reference}. Conformance is tested by checking if the meta's reference is a
     * subset of {@code reference}.
     * <p>
     * Buffers can contain multiple {@link ReferenceTimestampMeta} metadata items.
     * @param reference a reference {@link Caps}
     * @return the {@link ReferenceTimestampMeta} or {@code null} when there
     * is no such metadata on {@code buffer}.
     */
    public @Nullable org.gstreamer.gst.ReferenceTimestampMeta getReferenceTimestampMeta(@Nullable org.gstreamer.gst.Caps reference) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_get_reference_timestamp_meta.invokeExact(
                    handle(),
                    (Addressable) (reference == null ? MemoryAddress.NULL : reference.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.ReferenceTimestampMeta.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Gets the total size of the memory blocks in {@code buffer}.
     * @return total size of the memory blocks in {@code buffer}.
     */
    public long getSize() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_buffer_get_size.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the total size of the memory blocks in {@code buffer}.
     * <p>
     * When not {@code null}, {@code offset} will contain the offset of the data in the
     * first memory block in {@code buffer} and {@code maxsize} will contain the sum of
     * the size and {@code offset} and the amount of extra padding on the last
     * memory block.  {@code offset} and {@code maxsize} can be used to resize the
     * buffer memory blocks with gst_buffer_resize().
     * @param offset a pointer to the offset
     * @param maxsize a pointer to the maxsize
     * @return total size of the memory blocks in {@code buffer}.
     */
    public long getSizes(Out<Long> offset, Out<Long> maxsize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment offsetPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment maxsizePOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.gst_buffer_get_sizes.invokeExact(
                        handle(),
                        (Addressable) (offset == null ? MemoryAddress.NULL : (Addressable) offsetPOINTER.address()),
                        (Addressable) (maxsize == null ? MemoryAddress.NULL : (Addressable) maxsizePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (offset != null) offset.set(offsetPOINTER.get(Interop.valueLayout.C_LONG, 0));
                    if (maxsize != null) maxsize.set(maxsizePOINTER.get(Interop.valueLayout.C_LONG, 0));
            return RESULT;
        }
    }
    
    /**
     * Gets the total size of {@code length} memory blocks stating from {@code idx} in {@code buffer}.
     * <p>
     * When not {@code null}, {@code offset} will contain the offset of the data in the
     * memory block in {@code buffer} at {@code idx} and {@code maxsize} will contain the sum of the size
     * and {@code offset} and the amount of extra padding on the memory block at {@code idx} +
     * {@code length} -1.
     * {@code offset} and {@code maxsize} can be used to resize the buffer memory blocks with
     * gst_buffer_resize_range().
     * @param idx an index
     * @param length a length
     * @param offset a pointer to the offset
     * @param maxsize a pointer to the maxsize
     * @return total size of {@code length} memory blocks starting at {@code idx} in {@code buffer}.
     */
    public long getSizesRange(int idx, int length, Out<Long> offset, Out<Long> maxsize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment offsetPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment maxsizePOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.gst_buffer_get_sizes_range.invokeExact(
                        handle(),
                        idx,
                        length,
                        (Addressable) (offset == null ? MemoryAddress.NULL : (Addressable) offsetPOINTER.address()),
                        (Addressable) (maxsize == null ? MemoryAddress.NULL : (Addressable) maxsizePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (offset != null) offset.set(offsetPOINTER.get(Interop.valueLayout.C_LONG, 0));
                    if (maxsize != null) maxsize.set(maxsizePOINTER.get(Interop.valueLayout.C_LONG, 0));
            return RESULT;
        }
    }
    
    /**
     * Gives the status of a specific flag on a buffer.
     * @param flags the {@link BufferFlags} flag to check.
     * @return {@code true} if all flags in {@code flags} are found on {@code buffer}.
     */
    public boolean hasFlags(org.gstreamer.gst.BufferFlags flags) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_buffer_has_flags.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Inserts the memory block {@code mem} into {@code buffer} at {@code idx}. This function takes ownership
     * of {@code mem} and thus doesn't increase its refcount.
     * <p>
     * Only gst_buffer_get_max_memory() can be added to a buffer. If more memory is
     * added, existing memory blocks will automatically be merged to make room for
     * the new memory.
     * @param idx the index to add the memory at, or -1 to append it to the end
     * @param mem a {@link Memory}.
     */
    public void insertMemory(int idx, org.gstreamer.gst.Memory mem) {
        try {
            DowncallHandles.gst_buffer_insert_memory.invokeExact(
                    handle(),
                    idx,
                    mem.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        mem.yieldOwnership();
    }
    
    /**
     * Checks if all memory blocks in {@code buffer} are writable.
     * <p>
     * Note that this function does not check if {@code buffer} is writable, use
     * gst_buffer_is_writable() to check that if needed.
     * @return {@code true} if all memory blocks in {@code buffer} are writable
     */
    public boolean isAllMemoryWritable() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_buffer_is_all_memory_writable.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Checks if {@code length} memory blocks in {@code buffer} starting from {@code idx} are writable.
     * <p>
     * {@code length} can be -1 to check all the memory blocks after {@code idx}.
     * <p>
     * Note that this function does not check if {@code buffer} is writable, use
     * gst_buffer_is_writable() to check that if needed.
     * @param idx an index
     * @param length a length, should not be 0
     * @return {@code true} if the memory range is writable
     */
    public boolean isMemoryRangeWritable(int idx, int length) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_buffer_is_memory_range_writable.invokeExact(
                    handle(),
                    idx,
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Retrieves the next {@link Meta} after {@code current}. If {@code state} points
     * to {@code null}, the first metadata is returned.
     * <p>
     * {@code state} will be updated with an opaque state pointer
     * @param state an opaque state pointer
     * @return The next {@link Meta} or {@code null}
     * when there are no more items.
     */
    public @Nullable org.gstreamer.gst.Meta iterateMeta(@Nullable Out<java.lang.foreign.MemoryAddress> state) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment statePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_buffer_iterate_meta.invokeExact(
                        handle(),
                        (Addressable) (state == null ? MemoryAddress.NULL : (Addressable) statePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (state != null) state.set(statePOINTER.get(Interop.valueLayout.ADDRESS, 0));
            return org.gstreamer.gst.Meta.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Retrieves the next {@link Meta} of type {@code meta_api_type} after the current one
     * according to {@code state}. If {@code state} points to {@code null}, the first metadata of
     * type {@code meta_api_type} is returned.
     * <p>
     * {@code state} will be updated with an opaque state pointer
     * @param state an opaque state pointer
     * @param metaApiType only return {@link Meta} of this type
     * @return The next {@link Meta} of type
     * {@code meta_api_type} or {@code null} when there are no more items.
     */
    public @Nullable org.gstreamer.gst.Meta iterateMetaFiltered(@Nullable Out<java.lang.foreign.MemoryAddress> state, org.gtk.glib.Type metaApiType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment statePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_buffer_iterate_meta_filtered.invokeExact(
                        handle(),
                        (Addressable) (state == null ? MemoryAddress.NULL : (Addressable) statePOINTER.address()),
                        metaApiType.getValue().longValue());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (state != null) state.set(statePOINTER.get(Interop.valueLayout.ADDRESS, 0));
            return org.gstreamer.gst.Meta.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Fills {@code info} with the {@link MapInfo} of all merged memory blocks in {@code buffer}.
     * <p>
     * {@code flags} describe the desired access of the memory. When {@code flags} is
     * {@code GST_MAP_WRITE}, {@code buffer} should be writable (as returned from
     * gst_buffer_is_writable()).
     * <p>
     * When {@code buffer} is writable but the memory isn't, a writable copy will
     * automatically be created and returned. The readonly copy of the
     * buffer memory will then also be replaced with this writable copy.
     * <p>
     * The memory in {@code info} should be unmapped with gst_buffer_unmap() after
     * usage.
     * @param info info about the mapping
     * @param flags flags for the mapping
     * @return {@code true} if the map succeeded and {@code info} contains valid data.
     */
    public boolean map(org.gstreamer.gst.MapInfo info, org.gstreamer.gst.MapFlags flags) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_buffer_map.invokeExact(
                    handle(),
                    info.handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Fills {@code info} with the {@link MapInfo} of {@code length} merged memory blocks
     * starting at {@code idx} in {@code buffer}. When {@code length} is -1, all memory blocks starting
     * from {@code idx} are merged and mapped.
     * <p>
     * {@code flags} describe the desired access of the memory. When {@code flags} is
     * {@code GST_MAP_WRITE}, {@code buffer} should be writable (as returned from
     * gst_buffer_is_writable()).
     * <p>
     * When {@code buffer} is writable but the memory isn't, a writable copy will
     * automatically be created and returned. The readonly copy of the buffer memory
     * will then also be replaced with this writable copy.
     * <p>
     * The memory in {@code info} should be unmapped with gst_buffer_unmap() after usage.
     * @param idx an index
     * @param length a length
     * @param info info about the mapping
     * @param flags flags for the mapping
     * @return {@code true} if the map succeeded and {@code info} contains valid
     * data.
     */
    public boolean mapRange(int idx, int length, org.gstreamer.gst.MapInfo info, org.gstreamer.gst.MapFlags flags) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_buffer_map_range.invokeExact(
                    handle(),
                    idx,
                    length,
                    info.handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Compares {@code size} bytes starting from {@code offset} in {@code buffer} with the memory in {@code mem}.
     * @param offset the offset in {@code buffer}
     * @param mem the memory to compare
     * @param size the size to compare
     * @return 0 if the memory is equal.
     */
    public int memcmp(long offset, byte[] mem, long size) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_buffer_memcmp.invokeExact(
                        handle(),
                        offset,
                        Interop.allocateNativeArray(mem, false, SCOPE),
                        size);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Fills {@code buf} with {@code size} bytes with {@code val} starting from {@code offset}.
     * @param offset the offset in {@code buffer}
     * @param val the value to set
     * @param size the size to set
     * @return The amount of bytes filled. This value can be lower than {@code size}
     *    when {@code buffer} did not contain enough data.
     */
    public long memset(long offset, byte val, long size) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_buffer_memset.invokeExact(
                    handle(),
                    offset,
                    val,
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the amount of memory blocks that this buffer has. This amount is never
     * larger than what gst_buffer_get_max_memory() returns.
     * @return the number of memory blocks this buffer is made of.
     */
    public int nMemory() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_buffer_n_memory.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the memory block at {@code idx} in {@code buffer}. The memory block stays valid until
     * the memory block in {@code buffer} is removed, replaced or merged, typically with
     * any call that modifies the memory in {@code buffer}.
     * @param idx an index
     * @return the {@link Memory} at {@code idx}.
     */
    public @Nullable org.gstreamer.gst.Memory peekMemory(int idx) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_buffer_peek_memory.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Memory.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Prepends the memory block {@code mem} to {@code buffer}. This function takes
     * ownership of {@code mem} and thus doesn't increase its refcount.
     * <p>
     * This function is identical to gst_buffer_insert_memory() with an index of 0.
     * See gst_buffer_insert_memory() for more details.
     * @param mem a {@link Memory}.
     */
    public void prependMemory(org.gstreamer.gst.Memory mem) {
        try {
            DowncallHandles.gst_buffer_prepend_memory.invokeExact(
                    handle(),
                    mem.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        mem.yieldOwnership();
    }
    
    /**
     * Removes all the memory blocks in {@code buffer}.
     */
    public void removeAllMemory() {
        try {
            DowncallHandles.gst_buffer_remove_all_memory.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes the memory block in {@code b} at index {@code i}.
     * @param idx an index
     */
    public void removeMemory(int idx) {
        try {
            DowncallHandles.gst_buffer_remove_memory.invokeExact(
                    handle(),
                    idx);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes {@code length} memory blocks in {@code buffer} starting from {@code idx}.
     * <p>
     * {@code length} can be -1, in which case all memory starting from {@code idx} is removed.
     * @param idx an index
     * @param length a length
     */
    public void removeMemoryRange(int idx, int length) {
        try {
            DowncallHandles.gst_buffer_remove_memory_range.invokeExact(
                    handle(),
                    idx,
                    length);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes the metadata for {@code meta} on {@code buffer}.
     * @param meta a {@link Meta}
     * @return {@code true} if the metadata existed and was removed, {@code false} if no such
     * metadata was on {@code buffer}.
     */
    public boolean removeMeta(org.gstreamer.gst.Meta meta) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_buffer_remove_meta.invokeExact(
                    handle(),
                    meta.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Replaces all memory in {@code buffer} with {@code mem}.
     * @param mem a {@link Memory}
     */
    public void replaceAllMemory(org.gstreamer.gst.Memory mem) {
        try {
            DowncallHandles.gst_buffer_replace_all_memory.invokeExact(
                    handle(),
                    mem.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        mem.yieldOwnership();
    }
    
    /**
     * Replaces the memory block at index {@code idx} in {@code buffer} with {@code mem}.
     * @param idx an index
     * @param mem a {@link Memory}
     */
    public void replaceMemory(int idx, org.gstreamer.gst.Memory mem) {
        try {
            DowncallHandles.gst_buffer_replace_memory.invokeExact(
                    handle(),
                    idx,
                    mem.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        mem.yieldOwnership();
    }
    
    /**
     * Replaces {@code length} memory blocks in {@code buffer} starting at {@code idx} with {@code mem}.
     * <p>
     * If {@code length} is -1, all memory starting from {@code idx} will be removed and
     * replaced with {@code mem}.
     * <p>
     * {@code buffer} should be writable.
     * @param idx an index
     * @param length a length, should not be 0
     * @param mem a {@link Memory}
     */
    public void replaceMemoryRange(int idx, int length, org.gstreamer.gst.Memory mem) {
        try {
            DowncallHandles.gst_buffer_replace_memory_range.invokeExact(
                    handle(),
                    idx,
                    length,
                    mem.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        mem.yieldOwnership();
    }
    
    /**
     * Sets the offset and total size of the memory blocks in {@code buffer}.
     * @param offset the offset adjustment
     * @param size the new size or -1 to just adjust the offset
     */
    public void resize(long offset, long size) {
        try {
            DowncallHandles.gst_buffer_resize.invokeExact(
                    handle(),
                    offset,
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the total size of the {@code length} memory blocks starting at {@code idx} in
     * {@code buffer}
     * @param idx an index
     * @param length a length
     * @param offset the offset adjustment
     * @param size the new size or -1 to just adjust the offset
     * @return {@code true} if resizing succeeded, {@code false} otherwise.
     */
    public boolean resizeRange(int idx, int length, long offset, long size) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_buffer_resize_range.invokeExact(
                    handle(),
                    idx,
                    length,
                    offset,
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets one or more buffer flags on a buffer.
     * @param flags the {@link BufferFlags} to set.
     * @return {@code true} if {@code flags} were successfully set on buffer.
     */
    public boolean setFlags(org.gstreamer.gst.BufferFlags flags) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_buffer_set_flags.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Sets the total size of the memory blocks in {@code buffer}.
     * @param size the new size
     */
    public void setSize(long size) {
        try {
            DowncallHandles.gst_buffer_set_size.invokeExact(
                    handle(),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Releases the memory previously mapped with gst_buffer_map().
     * @param info a {@link MapInfo}
     */
    public void unmap(org.gstreamer.gst.MapInfo info) {
        try {
            DowncallHandles.gst_buffer_unmap.invokeExact(
                    handle(),
                    info.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Clears one or more buffer flags.
     * @param flags the {@link BufferFlags} to clear
     * @return true if {@code flags} is successfully cleared from buffer.
     */
    public boolean unsetFlags(org.gstreamer.gst.BufferFlags flags) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_buffer_unset_flags.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Gets the maximum amount of memory blocks that a buffer can hold. This is a
     * compile time constant that can be queried with the function.
     * <p>
     * When more memory blocks are added, existing memory blocks will be merged
     * together to make room for the new block.
     * @return the maximum amount of memory blocks that a buffer can hold.
     */
    public static int getMaxMemory() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_buffer_get_max_memory.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_buffer_new = Interop.downcallHandle(
                "gst_buffer_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_new_allocate = Interop.downcallHandle(
                "gst_buffer_new_allocate",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_new_memdup = Interop.downcallHandle(
                "gst_buffer_new_memdup",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_buffer_new_wrapped = Interop.downcallHandle(
                "gst_buffer_new_wrapped",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_buffer_new_wrapped_bytes = Interop.downcallHandle(
                "gst_buffer_new_wrapped_bytes",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_new_wrapped_full = Interop.downcallHandle(
                "gst_buffer_new_wrapped_full",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_add_custom_meta = Interop.downcallHandle(
                "gst_buffer_add_custom_meta",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_add_meta = Interop.downcallHandle(
                "gst_buffer_add_meta",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_add_parent_buffer_meta = Interop.downcallHandle(
                "gst_buffer_add_parent_buffer_meta",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_add_protection_meta = Interop.downcallHandle(
                "gst_buffer_add_protection_meta",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_add_reference_timestamp_meta = Interop.downcallHandle(
                "gst_buffer_add_reference_timestamp_meta",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_buffer_append = Interop.downcallHandle(
                "gst_buffer_append",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_append_memory = Interop.downcallHandle(
                "gst_buffer_append_memory",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_append_region = Interop.downcallHandle(
                "gst_buffer_append_region",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_buffer_copy_deep = Interop.downcallHandle(
                "gst_buffer_copy_deep",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_copy_into = Interop.downcallHandle(
                "gst_buffer_copy_into",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_buffer_copy_region = Interop.downcallHandle(
                "gst_buffer_copy_region",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_buffer_extract = Interop.downcallHandle(
                "gst_buffer_extract",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_buffer_extract_dup = Interop.downcallHandle(
                "gst_buffer_extract_dup",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_fill = Interop.downcallHandle(
                "gst_buffer_fill",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_buffer_find_memory = Interop.downcallHandle(
                "gst_buffer_find_memory",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_foreach_meta = Interop.downcallHandle(
                "gst_buffer_foreach_meta",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_get_all_memory = Interop.downcallHandle(
                "gst_buffer_get_all_memory",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_get_custom_meta = Interop.downcallHandle(
                "gst_buffer_get_custom_meta",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_get_flags = Interop.downcallHandle(
                "gst_buffer_get_flags",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_get_memory = Interop.downcallHandle(
                "gst_buffer_get_memory",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_buffer_get_memory_range = Interop.downcallHandle(
                "gst_buffer_get_memory_range",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_buffer_get_meta = Interop.downcallHandle(
                "gst_buffer_get_meta",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_buffer_get_n_meta = Interop.downcallHandle(
                "gst_buffer_get_n_meta",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_buffer_get_reference_timestamp_meta = Interop.downcallHandle(
                "gst_buffer_get_reference_timestamp_meta",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_get_size = Interop.downcallHandle(
                "gst_buffer_get_size",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_get_sizes = Interop.downcallHandle(
                "gst_buffer_get_sizes",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_get_sizes_range = Interop.downcallHandle(
                "gst_buffer_get_sizes_range",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_has_flags = Interop.downcallHandle(
                "gst_buffer_has_flags",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_buffer_insert_memory = Interop.downcallHandle(
                "gst_buffer_insert_memory",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_is_all_memory_writable = Interop.downcallHandle(
                "gst_buffer_is_all_memory_writable",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_is_memory_range_writable = Interop.downcallHandle(
                "gst_buffer_is_memory_range_writable",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_buffer_iterate_meta = Interop.downcallHandle(
                "gst_buffer_iterate_meta",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_iterate_meta_filtered = Interop.downcallHandle(
                "gst_buffer_iterate_meta_filtered",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_buffer_map = Interop.downcallHandle(
                "gst_buffer_map",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_buffer_map_range = Interop.downcallHandle(
                "gst_buffer_map_range",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_buffer_memcmp = Interop.downcallHandle(
                "gst_buffer_memcmp",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_buffer_memset = Interop.downcallHandle(
                "gst_buffer_memset",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_BYTE, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_buffer_n_memory = Interop.downcallHandle(
                "gst_buffer_n_memory",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_peek_memory = Interop.downcallHandle(
                "gst_buffer_peek_memory",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_buffer_prepend_memory = Interop.downcallHandle(
                "gst_buffer_prepend_memory",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_remove_all_memory = Interop.downcallHandle(
                "gst_buffer_remove_all_memory",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_remove_memory = Interop.downcallHandle(
                "gst_buffer_remove_memory",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_buffer_remove_memory_range = Interop.downcallHandle(
                "gst_buffer_remove_memory_range",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_buffer_remove_meta = Interop.downcallHandle(
                "gst_buffer_remove_meta",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_replace_all_memory = Interop.downcallHandle(
                "gst_buffer_replace_all_memory",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_replace_memory = Interop.downcallHandle(
                "gst_buffer_replace_memory",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_replace_memory_range = Interop.downcallHandle(
                "gst_buffer_replace_memory_range",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_resize = Interop.downcallHandle(
                "gst_buffer_resize",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_buffer_resize_range = Interop.downcallHandle(
                "gst_buffer_resize_range",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_buffer_set_flags = Interop.downcallHandle(
                "gst_buffer_set_flags",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_buffer_set_size = Interop.downcallHandle(
                "gst_buffer_set_size",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_buffer_unmap = Interop.downcallHandle(
                "gst_buffer_unmap",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_buffer_unset_flags = Interop.downcallHandle(
                "gst_buffer_unset_flags",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_buffer_get_max_memory = Interop.downcallHandle(
                "gst_buffer_get_max_memory",
                FunctionDescriptor.of(Interop.valueLayout.C_INT),
                false
        );
    }
    
    /**
     * A {@link Buffer.Builder} object constructs a {@link Buffer} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Buffer.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Buffer struct;
        
        private Builder() {
            struct = Buffer.allocate();
        }
        
        /**
         * Finish building the {@link Buffer} struct.
         * @return A new instance of {@code Buffer} with the fields 
         *         that were set in the Builder object.
         */
        public Buffer build() {
            return struct;
        }
        
        /**
         * the parent structure
         * @param miniObject The value for the {@code miniObject} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMiniObject(org.gstreamer.gst.MiniObject miniObject) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("mini_object"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (miniObject == null ? MemoryAddress.NULL : miniObject.handle()));
                return this;
            }
        }
        
        /**
         * pointer to the pool owner of the buffer
         * @param pool The value for the {@code pool} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPool(org.gstreamer.gst.BufferPool pool) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("pool"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pool == null ? MemoryAddress.NULL : pool.handle()));
                return this;
            }
        }
        
        /**
         * presentation timestamp of the buffer, can be {@code GST_CLOCK_TIME_NONE} when the
         *     pts is not known or relevant. The pts contains the timestamp when the
         *     media should be presented to the user.
         * @param pts The value for the {@code pts} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPts(org.gstreamer.gst.ClockTime pts) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("pts"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pts == null ? MemoryAddress.NULL : pts.getValue().longValue()));
                return this;
            }
        }
        
        /**
         * decoding timestamp of the buffer, can be {@code GST_CLOCK_TIME_NONE} when the
         *     dts is not known or relevant. The dts contains the timestamp when the
         *     media should be processed.
         * @param dts The value for the {@code dts} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDts(org.gstreamer.gst.ClockTime dts) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("dts"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dts == null ? MemoryAddress.NULL : dts.getValue().longValue()));
                return this;
            }
        }
        
        /**
         * duration in time of the buffer data, can be {@code GST_CLOCK_TIME_NONE}
         *     when the duration is not known or relevant.
         * @param duration The value for the {@code duration} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setDuration(org.gstreamer.gst.ClockTime duration) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("duration"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (duration == null ? MemoryAddress.NULL : duration.getValue().longValue()));
                return this;
            }
        }
        
        /**
         * a media specific offset for the buffer data.
         *     For video frames, this is the frame number of this buffer.
         *     For audio samples, this is the offset of the first sample in this buffer.
         *     For file data or compressed data this is the byte offset of the first
         *       byte in this buffer.
         * @param offset The value for the {@code offset} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOffset(long offset) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("offset"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), offset);
                return this;
            }
        }
        
        /**
         * the last offset contained in this buffer. It has the same
         *     format as {@code offset}.
         * @param offsetEnd The value for the {@code offsetEnd} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setOffsetEnd(long offsetEnd) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("offset_end"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), offsetEnd);
                return this;
            }
        }
    }
}
