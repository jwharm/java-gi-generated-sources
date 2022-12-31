package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This class is for elements that receive buffers in an undesired size.
 * While for example raw video contains one image per buffer, the same is not
 * true for a lot of other formats, especially those that come directly from
 * a file. So if you have undefined buffer sizes and require a specific size,
 * this object is for you.
 * <p>
 * An adapter is created with gst_adapter_new(). It can be freed again with
 * g_object_unref().
 * <p>
 * The theory of operation is like this: All buffers received are put
 * into the adapter using gst_adapter_push() and the data is then read back
 * in chunks of the desired size using gst_adapter_map()/gst_adapter_unmap()
 * and/or gst_adapter_copy(). After the data has been processed, it is freed
 * using gst_adapter_unmap().
 * <p>
 * Other methods such as gst_adapter_take() and gst_adapter_take_buffer()
 * combine gst_adapter_map() and gst_adapter_unmap() in one method and are
 * potentially more convenient for some use cases.
 * <p>
 * For example, a sink pad's chain function that needs to pass data to a library
 * in 512-byte chunks could be implemented like this:
 * <pre>{@code <!-- language="C" -->
 * static GstFlowReturn
 * sink_pad_chain (GstPad *pad, GstObject *parent, GstBuffer *buffer)
 * {
 *   MyElement *this;
 *   GstAdapter *adapter;
 *   GstFlowReturn ret = GST_FLOW_OK;
 * 
 *   this = MY_ELEMENT (parent);
 * 
 *   adapter = this->adapter;
 * 
 *   // put buffer into adapter
 *   gst_adapter_push (adapter, buffer);
 * 
 *   // while we can read out 512 bytes, process them
 *   while (gst_adapter_available (adapter) >= 512 && ret == GST_FLOW_OK) {
 *     const guint8 *data = gst_adapter_map (adapter, 512);
 *     // use flowreturn as an error value
 *     ret = my_library_foo (data);
 *     gst_adapter_unmap (adapter);
 *     gst_adapter_flush (adapter, 512);
 *   }
 *   return ret;
 * }
 * }</pre>
 * <p>
 * For another example, a simple element inside GStreamer that uses {@link Adapter}
 * is the libvisual element.
 * <p>
 * An element using {@link Adapter} in its sink pad chain function should ensure that
 * when the FLUSH_STOP event is received, that any queued data is cleared using
 * gst_adapter_clear(). Data should also be cleared or processed on EOS and
 * when changing state from {@link org.gstreamer.gst.State#PAUSED} to {@link org.gstreamer.gst.State#READY}.
 * <p>
 * Also check the GST_BUFFER_FLAG_DISCONT flag on the buffer. Some elements might
 * need to clear the adapter after a discontinuity.
 * <p>
 * The adapter will keep track of the timestamps of the buffers
 * that were pushed. The last seen timestamp before the current position
 * can be queried with gst_adapter_prev_pts(). This function can
 * optionally return the number of bytes between the start of the buffer that
 * carried the timestamp and the current adapter position. The distance is
 * useful when dealing with, for example, raw audio samples because it allows
 * you to calculate the timestamp of the current adapter position by using the
 * last seen timestamp and the amount of bytes since.  Additionally, the
 * gst_adapter_prev_pts_at_offset() can be used to determine the last
 * seen timestamp at a particular offset in the adapter.
 * <p>
 * The adapter will also keep track of the offset of the buffers
 * ({@code GST_BUFFER_OFFSET}) that were pushed. The last seen offset before the
 * current position can be queried with gst_adapter_prev_offset(). This function
 * can optionally return the number of bytes between the start of the buffer
 * that carried the offset and the current adapter position.
 * <p>
 * Additionally the adapter also keeps track of the PTS, DTS and buffer offset
 * at the last discontinuity, which can be retrieved with
 * gst_adapter_pts_at_discont(), gst_adapter_dts_at_discont() and
 * gst_adapter_offset_at_discont(). The number of bytes that were consumed
 * since then can be queried with gst_adapter_distance_from_discont().
 * <p>
 * A last thing to note is that while {@link Adapter} is pretty optimized,
 * merging buffers still might be an operation that requires a {@code malloc()} and
 * {@code memcpy()} operation, and these operations are not the fastest. Because of
 * this, some functions like gst_adapter_available_fast() are provided to help
 * speed up such cases should you want to. To avoid repeated memory allocations,
 * gst_adapter_copy() can be used to copy data into a (statically allocated)
 * user provided buffer.
 * <p>
 * {@link Adapter} is not MT safe. All operations on an adapter must be serialized by
 * the caller. This is not normally a problem, however, as the normal use case
 * of {@link Adapter} is inside one pad's chain function, in which case access is
 * serialized via the pad's STREAM_LOCK.
 * <p>
 * Note that gst_adapter_push() takes ownership of the buffer passed. Use
 * gst_buffer_ref() before pushing it into the adapter if you still want to
 * access the buffer later. The adapter will never modify the data in the
 * buffer pushed in it.
 */
public class Adapter extends org.gtk.gobject.GObject {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAdapter";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a Adapter proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Adapter(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Adapter> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Adapter(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_adapter_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link Adapter}. Free with g_object_unref().
     */
    public Adapter() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Gets the maximum amount of bytes available, that is it returns the maximum
     * value that can be supplied to gst_adapter_map() without that function
     * returning {@code null}.
     * @return number of bytes available in {@code adapter}
     */
    public long available() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_adapter_available.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Gets the maximum number of bytes that are immediately available without
     * requiring any expensive operations (like copying the data into a
     * temporary buffer).
     * @return number of bytes that are available in {@code adapter} without expensive
     * operations
     */
    public long availableFast() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_adapter_available_fast.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Removes all buffers from {@code adapter}.
     */
    public void clear() {
        try {
            DowncallHandles.gst_adapter_clear.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Similar to gst_adapter_copy, but more suitable for language bindings. {@code size}
     * bytes of data starting at {@code offset} will be copied out of the buffers contained
     * in {@code adapter} and into a new {@link org.gtk.glib.Bytes} structure which is returned. Depending on
     * the value of the {@code size} argument an empty {@link org.gtk.glib.Bytes} structure may be returned.
     * @param offset the bytes offset in the adapter to start from
     * @param size the number of bytes to copy
     * @return A new {@link org.gtk.glib.Bytes} structure containing the copied data.
     */
    public org.gtk.glib.Bytes copy(long offset, long size) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_adapter_copy_bytes.invokeExact(
                    handle(),
                    offset,
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Bytes.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the distance in bytes since the last buffer with the
     * {@link org.gstreamer.gst.BufferFlags#DISCONT} flag.
     * <p>
     * The distance will be reset to 0 for all buffers with
     * {@link org.gstreamer.gst.BufferFlags#DISCONT} on them, and then calculated for all other
     * following buffers based on their size.
     * @return The offset. Can be {@code GST_BUFFER_OFFSET_NONE}.
     */
    public long distanceFromDiscont() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_adapter_distance_from_discont.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the DTS that was on the last buffer with the GST_BUFFER_FLAG_DISCONT
     * flag, or GST_CLOCK_TIME_NONE.
     * @return The DTS at the last discont or GST_CLOCK_TIME_NONE.
     */
    public org.gstreamer.gst.ClockTime dtsAtDiscont() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_adapter_dts_at_discont.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Flushes the first {@code flush} bytes in the {@code adapter}. The caller must ensure that
     * at least this many bytes are available.
     * <p>
     * See also: gst_adapter_map(), gst_adapter_unmap()
     * @param flush the number of bytes to flush
     */
    public void flush(long flush) {
        try {
            DowncallHandles.gst_adapter_flush.invokeExact(
                    handle(),
                    flush);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Returns a {@link org.gstreamer.gst.Buffer} containing the first {@code nbytes} of the {@code adapter}, but
     * does not flush them from the adapter. See gst_adapter_take_buffer()
     * for details.
     * <p>
     * Caller owns a reference to the returned buffer. gst_buffer_unref() after
     * usage.
     * <p>
     * Free-function: gst_buffer_unref
     * @param nbytes the number of bytes to get
     * @return a {@link org.gstreamer.gst.Buffer} containing the first
     *     {@code nbytes} of the adapter, or {@code null} if {@code nbytes} bytes are not available.
     *     gst_buffer_unref() when no longer needed.
     */
    public @Nullable org.gstreamer.gst.Buffer getBuffer(long nbytes) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_adapter_get_buffer.invokeExact(
                    handle(),
                    nbytes);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns a {@link org.gstreamer.gst.Buffer} containing the first {@code nbytes} of the {@code adapter}, but
     * does not flush them from the adapter. See gst_adapter_take_buffer_fast()
     * for details.
     * <p>
     * Caller owns a reference to the returned buffer. gst_buffer_unref() after
     * usage.
     * <p>
     * Free-function: gst_buffer_unref
     * @param nbytes the number of bytes to get
     * @return a {@link org.gstreamer.gst.Buffer} containing the first
     *     {@code nbytes} of the adapter, or {@code null} if {@code nbytes} bytes are not available.
     *     gst_buffer_unref() when no longer needed.
     */
    public @Nullable org.gstreamer.gst.Buffer getBufferFast(long nbytes) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_adapter_get_buffer_fast.invokeExact(
                    handle(),
                    nbytes);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns a {@link org.gstreamer.gst.BufferList} of buffers containing the first {@code nbytes} bytes of
     * the {@code adapter} but does not flush them from the adapter. See
     * gst_adapter_take_buffer_list() for details.
     * <p>
     * Caller owns the returned list. Call gst_buffer_list_unref() to free
     * the list after usage.
     * @param nbytes the number of bytes to get
     * @return a {@link org.gstreamer.gst.BufferList} of buffers containing
     *     the first {@code nbytes} of the adapter, or {@code null} if {@code nbytes} bytes are not
     *     available
     */
    public @Nullable org.gstreamer.gst.BufferList getBufferList(long nbytes) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_adapter_get_buffer_list.invokeExact(
                    handle(),
                    nbytes);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.BufferList.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns a {@link org.gtk.glib.List} of buffers containing the first {@code nbytes} bytes of the
     * {@code adapter}, but does not flush them from the adapter. See
     * gst_adapter_take_list() for details.
     * <p>
     * Caller owns returned list and contained buffers. gst_buffer_unref() each
     * buffer in the list before freeing the list after usage.
     * @param nbytes the number of bytes to get
     * @return a {@link org.gtk.glib.List} of
     *     buffers containing the first {@code nbytes} of the adapter, or {@code null} if {@code nbytes}
     *     bytes are not available
     */
    public @Nullable org.gtk.glib.List getList(long nbytes) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_adapter_get_list.invokeExact(
                    handle(),
                    nbytes);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the first {@code size} bytes stored in the {@code adapter}. The returned pointer is
     * valid until the next function is called on the adapter.
     * <p>
     * Note that setting the returned pointer as the data of a {@link org.gstreamer.gst.Buffer} is
     * incorrect for general-purpose plugins. The reason is that if a downstream
     * element stores the buffer so that it has access to it outside of the bounds
     * of its chain function, the buffer will have an invalid data pointer after
     * your element flushes the bytes. In that case you should use
     * gst_adapter_take(), which returns a freshly-allocated buffer that you can set
     * as {@link org.gstreamer.gst.Buffer} memory or the potentially more performant
     * gst_adapter_take_buffer().
     * <p>
     * Returns {@code null} if {@code size} bytes are not available.
     * @param size the number of bytes to map/peek
     * @return a pointer to the first {@code size} bytes of data, or {@code null}
     */
    public byte[] map(long size) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_adapter_map.invokeExact(
                    handle(),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (RESULT.equals(MemoryAddress.NULL)) return null;
        return MemorySegment.ofAddress(RESULT.get(Interop.valueLayout.ADDRESS, 0), size * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE);
    }
    
    /**
     * Scan for pattern {@code pattern} with applied mask {@code mask} in the adapter data,
     * starting from offset {@code offset}.
     * <p>
     * The bytes in {@code pattern} and {@code mask} are interpreted left-to-right, regardless
     * of endianness.  All four bytes of the pattern must be present in the
     * adapter for it to match, even if the first or last bytes are masked out.
     * <p>
     * It is an error to call this function without making sure that there is
     * enough data (offset+size bytes) in the adapter.
     * <p>
     * This function calls gst_adapter_masked_scan_uint32_peek() passing {@code null}
     * for value.
     * @param mask mask to apply to data before matching against {@code pattern}
     * @param pattern pattern to match (after mask is applied)
     * @param offset offset into the adapter data from which to start scanning, returns
     *          the last scanned position.
     * @param size number of bytes to scan from offset
     * @return offset of the first match, or -1 if no match was found.
     * <p>
     * Example:
     * <pre>{@code 
     * // Assume the adapter contains 0x00 0x01 0x02 ... 0xfe 0xff
     * 
     * gst_adapter_masked_scan_uint32 (adapter, 0xffffffff, 0x00010203, 0, 256);
     * // -> returns 0
     * gst_adapter_masked_scan_uint32 (adapter, 0xffffffff, 0x00010203, 1, 255);
     * // -> returns -1
     * gst_adapter_masked_scan_uint32 (adapter, 0xffffffff, 0x01020304, 1, 255);
     * // -> returns 1
     * gst_adapter_masked_scan_uint32 (adapter, 0xffff, 0x0001, 0, 256);
     * // -> returns -1
     * gst_adapter_masked_scan_uint32 (adapter, 0xffff, 0x0203, 0, 256);
     * // -> returns 0
     * gst_adapter_masked_scan_uint32 (adapter, 0xffff0000, 0x02030000, 0, 256);
     * // -> returns 2
     * gst_adapter_masked_scan_uint32 (adapter, 0xffff0000, 0x02030000, 0, 4);
     * // -> returns -1
     * }</pre>
     */
    public long maskedScanUint32(int mask, int pattern, long offset, long size) {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_adapter_masked_scan_uint32.invokeExact(
                    handle(),
                    mask,
                    pattern,
                    offset,
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Scan for pattern {@code pattern} with applied mask {@code mask} in the adapter data,
     * starting from offset {@code offset}.  If a match is found, the value that matched
     * is returned through {@code value}, otherwise {@code value} is left untouched.
     * <p>
     * The bytes in {@code pattern} and {@code mask} are interpreted left-to-right, regardless
     * of endianness.  All four bytes of the pattern must be present in the
     * adapter for it to match, even if the first or last bytes are masked out.
     * <p>
     * It is an error to call this function without making sure that there is
     * enough data (offset+size bytes) in the adapter.
     * @param mask mask to apply to data before matching against {@code pattern}
     * @param pattern pattern to match (after mask is applied)
     * @param offset offset into the adapter data from which to start scanning, returns
     *          the last scanned position.
     * @param size number of bytes to scan from offset
     * @param value pointer to uint32 to return matching data
     * @return offset of the first match, or -1 if no match was found.
     */
    public long maskedScanUint32Peek(int mask, int pattern, long offset, long size, Out<Integer> value) {
        MemorySegment valuePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_adapter_masked_scan_uint32_peek.invokeExact(
                    handle(),
                    mask,
                    pattern,
                    offset,
                    size,
                    (Addressable) (value == null ? MemoryAddress.NULL : (Addressable) valuePOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (value != null) value.set(valuePOINTER.get(Interop.valueLayout.C_INT, 0));
        return RESULT;
    }
    
    /**
     * Get the offset that was on the last buffer with the GST_BUFFER_FLAG_DISCONT
     * flag, or GST_BUFFER_OFFSET_NONE.
     * @return The offset at the last discont or GST_BUFFER_OFFSET_NONE.
     */
    public long offsetAtDiscont() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_adapter_offset_at_discont.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the dts that was before the current byte in the adapter. When
     * {@code distance} is given, the amount of bytes between the dts and the current
     * position is returned.
     * <p>
     * The dts is reset to GST_CLOCK_TIME_NONE and the distance is set to 0 when
     * the adapter is first created or when it is cleared. This also means that before
     * the first byte with a dts is removed from the adapter, the dts
     * and distance returned are GST_CLOCK_TIME_NONE and 0 respectively.
     * @param distance pointer to location for distance, or {@code null}
     * @return The previously seen dts.
     */
    public org.gstreamer.gst.ClockTime prevDts(Out<Long> distance) {
        MemorySegment distancePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_adapter_prev_dts.invokeExact(
                    handle(),
                    (Addressable) (distance == null ? MemoryAddress.NULL : (Addressable) distancePOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (distance != null) distance.set(distancePOINTER.get(Interop.valueLayout.C_LONG, 0));
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Get the dts that was before the byte at offset {@code offset} in the adapter. When
     * {@code distance} is given, the amount of bytes between the dts and the current
     * position is returned.
     * <p>
     * The dts is reset to GST_CLOCK_TIME_NONE and the distance is set to 0 when
     * the adapter is first created or when it is cleared. This also means that before
     * the first byte with a dts is removed from the adapter, the dts
     * and distance returned are GST_CLOCK_TIME_NONE and 0 respectively.
     * @param offset the offset in the adapter at which to get timestamp
     * @param distance pointer to location for distance, or {@code null}
     * @return The previously seen dts at given offset.
     */
    public org.gstreamer.gst.ClockTime prevDtsAtOffset(long offset, Out<Long> distance) {
        MemorySegment distancePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_adapter_prev_dts_at_offset.invokeExact(
                    handle(),
                    offset,
                    (Addressable) (distance == null ? MemoryAddress.NULL : (Addressable) distancePOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (distance != null) distance.set(distancePOINTER.get(Interop.valueLayout.C_LONG, 0));
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Get the offset that was before the current byte in the adapter. When
     * {@code distance} is given, the amount of bytes between the offset and the current
     * position is returned.
     * <p>
     * The offset is reset to GST_BUFFER_OFFSET_NONE and the distance is set to 0
     * when the adapter is first created or when it is cleared. This also means that
     * before the first byte with an offset is removed from the adapter, the offset
     * and distance returned are GST_BUFFER_OFFSET_NONE and 0 respectively.
     * @param distance pointer to a location for distance, or {@code null}
     * @return The previous seen offset.
     */
    public long prevOffset(Out<Long> distance) {
        MemorySegment distancePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_adapter_prev_offset.invokeExact(
                    handle(),
                    (Addressable) (distance == null ? MemoryAddress.NULL : (Addressable) distancePOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (distance != null) distance.set(distancePOINTER.get(Interop.valueLayout.C_LONG, 0));
        return RESULT;
    }
    
    /**
     * Get the pts that was before the current byte in the adapter. When
     * {@code distance} is given, the amount of bytes between the pts and the current
     * position is returned.
     * <p>
     * The pts is reset to GST_CLOCK_TIME_NONE and the distance is set to 0 when
     * the adapter is first created or when it is cleared. This also means that before
     * the first byte with a pts is removed from the adapter, the pts
     * and distance returned are GST_CLOCK_TIME_NONE and 0 respectively.
     * @param distance pointer to location for distance, or {@code null}
     * @return The previously seen pts.
     */
    public org.gstreamer.gst.ClockTime prevPts(Out<Long> distance) {
        MemorySegment distancePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_adapter_prev_pts.invokeExact(
                    handle(),
                    (Addressable) (distance == null ? MemoryAddress.NULL : (Addressable) distancePOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (distance != null) distance.set(distancePOINTER.get(Interop.valueLayout.C_LONG, 0));
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Get the pts that was before the byte at offset {@code offset} in the adapter. When
     * {@code distance} is given, the amount of bytes between the pts and the current
     * position is returned.
     * <p>
     * The pts is reset to GST_CLOCK_TIME_NONE and the distance is set to 0 when
     * the adapter is first created or when it is cleared. This also means that before
     * the first byte with a pts is removed from the adapter, the pts
     * and distance returned are GST_CLOCK_TIME_NONE and 0 respectively.
     * @param offset the offset in the adapter at which to get timestamp
     * @param distance pointer to location for distance, or {@code null}
     * @return The previously seen pts at given offset.
     */
    public org.gstreamer.gst.ClockTime prevPtsAtOffset(long offset, Out<Long> distance) {
        MemorySegment distancePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_adapter_prev_pts_at_offset.invokeExact(
                    handle(),
                    offset,
                    (Addressable) (distance == null ? MemoryAddress.NULL : (Addressable) distancePOINTER.address()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (distance != null) distance.set(distancePOINTER.get(Interop.valueLayout.C_LONG, 0));
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Get the PTS that was on the last buffer with the GST_BUFFER_FLAG_DISCONT
     * flag, or GST_CLOCK_TIME_NONE.
     * @return The PTS at the last discont or GST_CLOCK_TIME_NONE.
     */
    public org.gstreamer.gst.ClockTime ptsAtDiscont() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_adapter_pts_at_discont.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.ClockTime(RESULT);
    }
    
    /**
     * Adds the data from {@code buf} to the data stored inside {@code adapter} and takes
     * ownership of the buffer.
     * @param buf a {@link org.gstreamer.gst.Buffer} to add to queue in the adapter
     */
    public void push(org.gstreamer.gst.Buffer buf) {
        try {
            DowncallHandles.gst_adapter_push.invokeExact(
                    handle(),
                    buf.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        buf.yieldOwnership();
    }
    
    /**
     * Returns a freshly allocated buffer containing the first {@code nbytes} bytes of the
     * {@code adapter}. The returned bytes will be flushed from the adapter.
     * <p>
     * Caller owns returned value. g_free after usage.
     * <p>
     * Free-function: g_free
     * @param nbytes the number of bytes to take
     * @return oven-fresh hot data, or {@code null} if {@code nbytes} bytes are not available
     */
    public byte[] take(long nbytes) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_adapter_take.invokeExact(
                    handle(),
                    nbytes);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (RESULT.equals(MemoryAddress.NULL)) return null;
        return MemorySegment.ofAddress(RESULT.get(Interop.valueLayout.ADDRESS, 0), nbytes * Interop.valueLayout.C_BYTE.byteSize(), Interop.getScope()).toArray(Interop.valueLayout.C_BYTE);
    }
    
    /**
     * Returns a {@link org.gstreamer.gst.Buffer} containing the first {@code nbytes} bytes of the
     * {@code adapter}. The returned bytes will be flushed from the adapter.
     * This function is potentially more performant than
     * gst_adapter_take() since it can reuse the memory in pushed buffers
     * by subbuffering or merging. This function will always return a
     * buffer with a single memory region.
     * <p>
     * Note that no assumptions should be made as to whether certain buffer
     * flags such as the DISCONT flag are set on the returned buffer, or not.
     * The caller needs to explicitly set or unset flags that should be set or
     * unset.
     * <p>
     * Since 1.6 this will also copy over all GstMeta of the input buffers except
     * for meta with the {@link org.gstreamer.gst.MetaFlags#POOLED} flag or with the "memory" tag.
     * <p>
     * Caller owns a reference to the returned buffer. gst_buffer_unref() after
     * usage.
     * <p>
     * Free-function: gst_buffer_unref
     * @param nbytes the number of bytes to take
     * @return a {@link org.gstreamer.gst.Buffer} containing the first
     *     {@code nbytes} of the adapter, or {@code null} if {@code nbytes} bytes are not available.
     *     gst_buffer_unref() when no longer needed.
     */
    public @Nullable org.gstreamer.gst.Buffer takeBuffer(long nbytes) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_adapter_take_buffer.invokeExact(
                    handle(),
                    nbytes);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns a {@link org.gstreamer.gst.Buffer} containing the first {@code nbytes} of the {@code adapter}.
     * The returned bytes will be flushed from the adapter.  This function
     * is potentially more performant than gst_adapter_take_buffer() since
     * it can reuse the memory in pushed buffers by subbuffering or
     * merging. Unlike gst_adapter_take_buffer(), the returned buffer may
     * be composed of multiple non-contiguous {@link org.gstreamer.gst.Memory} objects, no
     * copies are made.
     * <p>
     * Note that no assumptions should be made as to whether certain buffer
     * flags such as the DISCONT flag are set on the returned buffer, or not.
     * The caller needs to explicitly set or unset flags that should be set or
     * unset.
     * <p>
     * This will also copy over all GstMeta of the input buffers except
     * for meta with the {@link org.gstreamer.gst.MetaFlags#POOLED} flag or with the "memory" tag.
     * <p>
     * This function can return buffer up to the return value of
     * gst_adapter_available() without making copies if possible.
     * <p>
     * Caller owns a reference to the returned buffer. gst_buffer_unref() after
     * usage.
     * <p>
     * Free-function: gst_buffer_unref
     * @param nbytes the number of bytes to take
     * @return a {@link org.gstreamer.gst.Buffer} containing the first
     *     {@code nbytes} of the adapter, or {@code null} if {@code nbytes} bytes are not available.
     *     gst_buffer_unref() when no longer needed.
     */
    public @Nullable org.gstreamer.gst.Buffer takeBufferFast(long nbytes) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_adapter_take_buffer_fast.invokeExact(
                    handle(),
                    nbytes);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns a {@link org.gstreamer.gst.BufferList} of buffers containing the first {@code nbytes} bytes of
     * the {@code adapter}. The returned bytes will be flushed from the adapter.
     * When the caller can deal with individual buffers, this function is more
     * performant because no memory should be copied.
     * <p>
     * Caller owns the returned list. Call gst_buffer_list_unref() to free
     * the list after usage.
     * @param nbytes the number of bytes to take
     * @return a {@link org.gstreamer.gst.BufferList} of buffers containing
     *     the first {@code nbytes} of the adapter, or {@code null} if {@code nbytes} bytes are not
     *     available
     */
    public @Nullable org.gstreamer.gst.BufferList takeBufferList(long nbytes) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_adapter_take_buffer_list.invokeExact(
                    handle(),
                    nbytes);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.BufferList.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Returns a {@link org.gtk.glib.List} of buffers containing the first {@code nbytes} bytes of the
     * {@code adapter}. The returned bytes will be flushed from the adapter.
     * When the caller can deal with individual buffers, this function is more
     * performant because no memory should be copied.
     * <p>
     * Caller owns returned list and contained buffers. gst_buffer_unref() each
     * buffer in the list before freeing the list after usage.
     * @param nbytes the number of bytes to take
     * @return a {@link org.gtk.glib.List} of
     *     buffers containing the first {@code nbytes} of the adapter, or {@code null} if {@code nbytes}
     *     bytes are not available
     */
    public @Nullable org.gtk.glib.List takeList(long nbytes) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_adapter_take_list.invokeExact(
                    handle(),
                    nbytes);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.List.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Releases the memory obtained with the last gst_adapter_map().
     */
    public void unmap() {
        try {
            DowncallHandles.gst_adapter_unmap.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_adapter_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Adapter.Builder} object constructs a {@link Adapter} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Adapter.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link Adapter} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Adapter}.
         * @return A new instance of {@code Adapter} with the properties 
         *         that were set in the Builder object.
         */
        public Adapter build() {
            return (Adapter) org.gtk.gobject.GObject.newWithProperties(
                Adapter.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_adapter_new = Interop.downcallHandle(
            "gst_adapter_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_adapter_available = Interop.downcallHandle(
            "gst_adapter_available",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_adapter_available_fast = Interop.downcallHandle(
            "gst_adapter_available_fast",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_adapter_clear = Interop.downcallHandle(
            "gst_adapter_clear",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_adapter_copy_bytes = Interop.downcallHandle(
            "gst_adapter_copy_bytes",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_adapter_distance_from_discont = Interop.downcallHandle(
            "gst_adapter_distance_from_discont",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_adapter_dts_at_discont = Interop.downcallHandle(
            "gst_adapter_dts_at_discont",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_adapter_flush = Interop.downcallHandle(
            "gst_adapter_flush",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_adapter_get_buffer = Interop.downcallHandle(
            "gst_adapter_get_buffer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_adapter_get_buffer_fast = Interop.downcallHandle(
            "gst_adapter_get_buffer_fast",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_adapter_get_buffer_list = Interop.downcallHandle(
            "gst_adapter_get_buffer_list",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_adapter_get_list = Interop.downcallHandle(
            "gst_adapter_get_list",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_adapter_map = Interop.downcallHandle(
            "gst_adapter_map",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_adapter_masked_scan_uint32 = Interop.downcallHandle(
            "gst_adapter_masked_scan_uint32",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_adapter_masked_scan_uint32_peek = Interop.downcallHandle(
            "gst_adapter_masked_scan_uint32_peek",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_adapter_offset_at_discont = Interop.downcallHandle(
            "gst_adapter_offset_at_discont",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_adapter_prev_dts = Interop.downcallHandle(
            "gst_adapter_prev_dts",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_adapter_prev_dts_at_offset = Interop.downcallHandle(
            "gst_adapter_prev_dts_at_offset",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_adapter_prev_offset = Interop.downcallHandle(
            "gst_adapter_prev_offset",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_adapter_prev_pts = Interop.downcallHandle(
            "gst_adapter_prev_pts",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_adapter_prev_pts_at_offset = Interop.downcallHandle(
            "gst_adapter_prev_pts_at_offset",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_adapter_pts_at_discont = Interop.downcallHandle(
            "gst_adapter_pts_at_discont",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_adapter_push = Interop.downcallHandle(
            "gst_adapter_push",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_adapter_take = Interop.downcallHandle(
            "gst_adapter_take",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_adapter_take_buffer = Interop.downcallHandle(
            "gst_adapter_take_buffer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_adapter_take_buffer_fast = Interop.downcallHandle(
            "gst_adapter_take_buffer_fast",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_adapter_take_buffer_list = Interop.downcallHandle(
            "gst_adapter_take_buffer_list",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_adapter_take_list = Interop.downcallHandle(
            "gst_adapter_take_list",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_adapter_unmap = Interop.downcallHandle(
            "gst_adapter_unmap",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_adapter_get_type = Interop.downcallHandle(
            "gst_adapter_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
