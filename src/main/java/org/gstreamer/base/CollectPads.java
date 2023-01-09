package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Manages a set of pads that operate in collect mode. This means that control
 * is given to the manager of this object when all pads have data.
 * <p>
 *   * Collectpads are created with gst_collect_pads_new(). A callback should then
 *     be installed with gst_collect_pads_set_function ().
 * <p>
 *   * Pads are added to the collection with gst_collect_pads_add_pad()/
 *     gst_collect_pads_remove_pad(). The pad has to be a sinkpad. When added,
 *     the chain, event and query functions of the pad are overridden. The
 *     element_private of the pad is used to store private information for the
 *     collectpads.
 * <p>
 *   * For each pad, data is queued in the _chain function or by
 *     performing a pull_range.
 * <p>
 *   * When data is queued on all pads in waiting mode, the callback function is called.
 * <p>
 *   * Data can be dequeued from the pad with the gst_collect_pads_pop() method.
 *     One can peek at the data with the gst_collect_pads_peek() function.
 *     These functions will return {@code null} if the pad received an EOS event. When all
 *     pads return {@code null} from a gst_collect_pads_peek(), the element can emit an EOS
 *     event itself.
 * <p>
 *   * Data can also be dequeued in byte units using the gst_collect_pads_available(),
 *     gst_collect_pads_read_buffer() and gst_collect_pads_flush() calls.
 * <p>
 *   * Elements should call gst_collect_pads_start() and gst_collect_pads_stop() in
 *     their state change functions to start and stop the processing of the collectpads.
 *     The gst_collect_pads_stop() call should be called before calling the parent
 *     element state change function in the PAUSED_TO_READY state change to ensure
 *     no pad is blocked and the element can finish streaming.
 * <p>
 *   * gst_collect_pads_set_waiting() sets a pad to waiting or non-waiting mode.
 *     CollectPads element is not waiting for data to be collected on non-waiting pads.
 *     Thus these pads may but need not have data when the callback is called.
 *     All pads are in waiting mode by default.
 */
public class CollectPads extends org.gstreamer.gst.GstObject {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstCollectPads";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("object"),
            Interop.valueLayout.ADDRESS.withName("data"),
            org.gtk.glib.RecMutex.getMemoryLayout().withName("stream_lock"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a CollectPads proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected CollectPads(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, CollectPads> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new CollectPads(input);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_collect_pads_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new instance of {@link CollectPads}.
     * <p>
     * MT safe.
     */
    public CollectPads() {
        super(constructNew());
        this.takeOwnership();
    }
    
    /**
     * Add a pad to the collection of collect pads. The pad has to be
     * a sinkpad. The refcount of the pad is incremented. Use
     * gst_collect_pads_remove_pad() to remove the pad from the collection
     * again.
     * <p>
     * You specify a size for the returned {@link CollectData} structure
     * so that you can use it to store additional information.
     * <p>
     * You can also specify a {@link CollectDataDestroyNotify} that will be called
     * just before the {@link CollectData} structure is freed. It is passed the
     * pointer to the structure and should free any custom memory and resources
     * allocated for it.
     * <p>
     * Keeping a pad locked in waiting state is only relevant when using
     * the default collection algorithm (providing the oldest buffer).
     * It ensures a buffer must be available on this pad for a collection
     * to take place.  This is of typical use to a muxer element where
     * non-subtitle streams should always be in waiting state,
     * e.g. to assure that caps information is available on all these streams
     * when initial headers have to be written.
     * <p>
     * The pad will be automatically activated in push mode when {@code pads} is
     * started.
     * <p>
     * MT safe.
     * @param pad the pad to add
     * @param size the size of the returned {@link CollectData} structure
     * @param destroyNotify function to be called before the returned
     *   {@link CollectData} structure is freed
     * @param lock whether to lock this pad in usual waiting state
     * @return a new {@link CollectData} to identify the
     *   new pad. Or {@code null} if wrong parameters are supplied.
     */
    public @Nullable org.gstreamer.base.CollectData addPad(org.gstreamer.gst.Pad pad, int size, org.gstreamer.base.CollectDataDestroyNotify destroyNotify, boolean lock) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_collect_pads_add_pad.invokeExact(
                    handle(),
                    pad.handle(),
                    size,
                    (Addressable) destroyNotify.toCallback(),
                    Marshal.booleanToInteger.marshal(lock, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.base.CollectData.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Query how much bytes can be read from each queued buffer. This means
     * that the result of this call is the maximum number of bytes that can
     * be read from each of the pads.
     * <p>
     * This function should be called with {@code pads} STREAM_LOCK held, such as
     * in the callback.
     * <p>
     * MT safe.
     * @return The maximum number of bytes queued on all pads. This function
     * returns 0 if a pad has no queued buffer.
     */
    public int available() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_collect_pads_available.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Convenience clipping function that converts incoming buffer's timestamp
     * to running time, or clips the buffer if outside configured segment.
     * <p>
     * Since 1.6, this clipping function also sets the DTS parameter of the
     * GstCollectData structure. This version of the running time DTS can be
     * negative. G_MININT64 is used to indicate invalid value.
     * @param cdata collect data of corresponding pad
     * @param buf buffer being clipped
     * @param outbuf output buffer with running time, or NULL if clipped
     */
    public org.gstreamer.gst.FlowReturn clipRunningTime(org.gstreamer.base.CollectData cdata, org.gstreamer.gst.Buffer buf, @Nullable Out<org.gstreamer.gst.Buffer> outbuf) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment outbufPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_collect_pads_clip_running_time.invokeExact(
                        handle(),
                        cdata.handle(),
                        buf.handle(),
                        (Addressable) (outbuf == null ? MemoryAddress.NULL : (Addressable) outbufPOINTER.address()),
                        (Addressable) MemoryAddress.NULL);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (outbuf != null) outbuf.set(org.gstreamer.gst.Buffer.fromAddress.marshal(outbufPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return org.gstreamer.gst.FlowReturn.of(RESULT);
        }
    }
    
    /**
     * Default {@link CollectPads} event handling that elements should always
     * chain up to to ensure proper operation.  Element might however indicate
     * event should not be forwarded downstream.
     * @param data collect data of corresponding pad
     * @param event event being processed
     * @param discard process but do not send event downstream
     */
    public boolean eventDefault(org.gstreamer.base.CollectData data, org.gstreamer.gst.Event event, boolean discard) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_collect_pads_event_default.invokeExact(
                    handle(),
                    data.handle(),
                    event.handle(),
                    Marshal.booleanToInteger.marshal(discard, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Flush {@code size} bytes from the pad {@code data}.
     * <p>
     * This function should be called with {@code pads} STREAM_LOCK held, such as
     * in the callback.
     * <p>
     * MT safe.
     * @param data the data to use
     * @param size the number of bytes to flush
     * @return The number of bytes flushed This can be less than {@code size} and
     * is 0 if the pad was end-of-stream.
     */
    public int flush(org.gstreamer.base.CollectData data, int size) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_collect_pads_flush.invokeExact(
                    handle(),
                    data.handle(),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Peek at the buffer currently queued in {@code data}. This function
     * should be called with the {@code pads} STREAM_LOCK held, such as in the callback
     * handler.
     * <p>
     * MT safe.
     * @param data the data to use
     * @return The buffer in {@code data} or {@code null} if no
     * buffer is queued. should unref the buffer after usage.
     */
    public @Nullable org.gstreamer.gst.Buffer peek(org.gstreamer.base.CollectData data) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_collect_pads_peek.invokeExact(
                    handle(),
                    data.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Pop the buffer currently queued in {@code data}. This function
     * should be called with the {@code pads} STREAM_LOCK held, such as in the callback
     * handler.
     * <p>
     * MT safe.
     * @param data the data to use
     * @return The buffer in {@code data} or {@code null} if no
     * buffer was queued. You should unref the buffer after usage.
     */
    public @Nullable org.gstreamer.gst.Buffer pop(org.gstreamer.base.CollectData data) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_collect_pads_pop.invokeExact(
                    handle(),
                    data.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Default {@link CollectPads} query handling that elements should always
     * chain up to to ensure proper operation.  Element might however indicate
     * query should not be forwarded downstream.
     * @param data collect data of corresponding pad
     * @param query query being processed
     * @param discard process but do not send event downstream
     */
    public boolean queryDefault(org.gstreamer.base.CollectData data, org.gstreamer.gst.Query query, boolean discard) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_collect_pads_query_default.invokeExact(
                    handle(),
                    data.handle(),
                    query.handle(),
                    Marshal.booleanToInteger.marshal(discard, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get a subbuffer of {@code size} bytes from the given pad {@code data}.
     * <p>
     * This function should be called with {@code pads} STREAM_LOCK held, such as in the
     * callback.
     * <p>
     * MT safe.
     * @param data the data to use
     * @param size the number of bytes to read
     * @return A sub buffer. The size of the buffer can
     * be less that requested. A return of {@code null} signals that the pad is
     * end-of-stream. Unref the buffer after use.
     */
    public @Nullable org.gstreamer.gst.Buffer readBuffer(org.gstreamer.base.CollectData data, int size) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_collect_pads_read_buffer.invokeExact(
                    handle(),
                    data.handle(),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Remove a pad from the collection of collect pads. This function will also
     * free the {@link CollectData} and all the resources that were allocated with
     * gst_collect_pads_add_pad().
     * <p>
     * The pad will be deactivated automatically when {@code pads} is stopped.
     * <p>
     * MT safe.
     * @param pad the pad to remove
     * @return {@code true} if the pad could be removed.
     */
    public boolean removePad(org.gstreamer.gst.Pad pad) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_collect_pads_remove_pad.invokeExact(
                    handle(),
                    pad.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Set the callback function and user data that will be called with
     * the oldest buffer when all pads have been collected, or {@code null} on EOS.
     * If a buffer is passed, the callback owns a reference and must unref
     * it.
     * <p>
     * MT safe.
     * @param func the function to set
     */
    public void setBufferFunction(org.gstreamer.base.CollectPadsBufferFunction func) {
        try {
            DowncallHandles.gst_collect_pads_set_buffer_function.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Install a clipping function that is called right after a buffer is received
     * on a pad managed by {@code pads}. See {@link CollectPadsClipFunction} for more info.
     * @param clipfunc clip function to install
     */
    public void setClipFunction(org.gstreamer.base.CollectPadsClipFunction clipfunc) {
        try {
            DowncallHandles.gst_collect_pads_set_clip_function.invokeExact(
                    handle(),
                    (Addressable) clipfunc.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the timestamp comparison function.
     * <p>
     * MT safe.
     * @param func the function to set
     */
    public void setCompareFunction(org.gstreamer.base.CollectPadsCompareFunction func) {
        try {
            DowncallHandles.gst_collect_pads_set_compare_function.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the event callback function and user data that will be called when
     * collectpads has received an event originating from one of the collected
     * pads.  If the event being processed is a serialized one, this callback is
     * called with {@code pads} STREAM_LOCK held, otherwise not.  As this lock should be
     * held when calling a number of CollectPads functions, it should be acquired
     * if so (unusually) needed.
     * <p>
     * MT safe.
     * @param func the function to set
     */
    public void setEventFunction(org.gstreamer.base.CollectPadsEventFunction func) {
        try {
            DowncallHandles.gst_collect_pads_set_event_function.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Install a flush function that is called when the internal
     * state of all pads should be flushed as part of flushing seek
     * handling. See {@link CollectPadsFlushFunction} for more info.
     * @param func flush function to install
     */
    public void setFlushFunction(org.gstreamer.base.CollectPadsFlushFunction func) {
        try {
            DowncallHandles.gst_collect_pads_set_flush_function.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Change the flushing state of all the pads in the collection. No pad
     * is able to accept anymore data when {@code flushing} is {@code true}. Calling this
     * function with {@code flushing} {@code false} makes {@code pads} accept data again.
     * Caller must ensure that downstream streaming (thread) is not blocked,
     * e.g. by sending a FLUSH_START downstream.
     * <p>
     * MT safe.
     * @param flushing desired state of the pads
     */
    public void setFlushing(boolean flushing) {
        try {
            DowncallHandles.gst_collect_pads_set_flushing.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(flushing, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * CollectPads provides a default collection algorithm that will determine
     * the oldest buffer available on all of its pads, and then delegate
     * to a configured callback.
     * However, if circumstances are more complicated and/or more control
     * is desired, this sets a callback that will be invoked instead when
     * all the pads added to the collection have buffers queued.
     * Evidently, this callback is not compatible with
     * gst_collect_pads_set_buffer_function() callback.
     * If this callback is set, the former will be unset.
     * <p>
     * MT safe.
     * @param func the function to set
     */
    public void setFunction(org.gstreamer.base.CollectPadsFunction func) {
        try {
            DowncallHandles.gst_collect_pads_set_function.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the query callback function and user data that will be called after
     * collectpads has received a query originating from one of the collected
     * pads.  If the query being processed is a serialized one, this callback is
     * called with {@code pads} STREAM_LOCK held, otherwise not.  As this lock should be
     * held when calling a number of CollectPads functions, it should be acquired
     * if so (unusually) needed.
     * <p>
     * MT safe.
     * @param func the function to set
     */
    public void setQueryFunction(org.gstreamer.base.CollectPadsQueryFunction func) {
        try {
            DowncallHandles.gst_collect_pads_set_query_function.invokeExact(
                    handle(),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets a pad to waiting or non-waiting mode, if at least this pad
     * has not been created with locked waiting state,
     * in which case nothing happens.
     * <p>
     * This function should be called with {@code pads} STREAM_LOCK held, such as
     * in the callback.
     * <p>
     * MT safe.
     * @param data the data to use
     * @param waiting boolean indicating whether this pad should operate
     *           in waiting or non-waiting mode
     */
    public void setWaiting(org.gstreamer.base.CollectData data, boolean waiting) {
        try {
            DowncallHandles.gst_collect_pads_set_waiting.invokeExact(
                    handle(),
                    data.handle(),
                    Marshal.booleanToInteger.marshal(waiting, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Default {@link CollectPads} event handling for the src pad of elements.
     * Elements can chain up to this to let flushing seek event handling
     * be done by {@link CollectPads}.
     * @param pad src {@link org.gstreamer.gst.Pad} that received the event
     * @param event event being processed
     */
    public boolean srcEventDefault(org.gstreamer.gst.Pad pad, org.gstreamer.gst.Event event) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_collect_pads_src_event_default.invokeExact(
                    handle(),
                    pad.handle(),
                    event.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Starts the processing of data in the collect_pads.
     * <p>
     * MT safe.
     */
    public void start() {
        try {
            DowncallHandles.gst_collect_pads_start.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Stops the processing of data in the collect_pads. this function
     * will also unblock any blocking operations.
     * <p>
     * MT safe.
     */
    public void stop() {
        try {
            DowncallHandles.gst_collect_pads_stop.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get a subbuffer of {@code size} bytes from the given pad {@code data}. Flushes the amount
     * of read bytes.
     * <p>
     * This function should be called with {@code pads} STREAM_LOCK held, such as in the
     * callback.
     * <p>
     * MT safe.
     * @param data the data to use
     * @param size the number of bytes to read
     * @return A sub buffer. The size of the buffer can
     * be less that requested. A return of {@code null} signals that the pad is
     * end-of-stream. Unref the buffer after use.
     */
    public @Nullable org.gstreamer.gst.Buffer takeBuffer(org.gstreamer.base.CollectData data, int size) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_collect_pads_take_buffer.invokeExact(
                    handle(),
                    data.handle(),
                    size);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_collect_pads_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link CollectPads.Builder} object constructs a {@link CollectPads} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link CollectPads.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.GstObject.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link CollectPads} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CollectPads}.
         * @return A new instance of {@code CollectPads} with the properties 
         *         that were set in the Builder object.
         */
        public CollectPads build() {
            return (CollectPads) org.gtk.gobject.GObject.newWithProperties(
                CollectPads.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_collect_pads_new = Interop.downcallHandle(
                "gst_collect_pads_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_collect_pads_add_pad = Interop.downcallHandle(
                "gst_collect_pads_add_pad",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_collect_pads_available = Interop.downcallHandle(
                "gst_collect_pads_available",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_collect_pads_clip_running_time = Interop.downcallHandle(
                "gst_collect_pads_clip_running_time",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_collect_pads_event_default = Interop.downcallHandle(
                "gst_collect_pads_event_default",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_collect_pads_flush = Interop.downcallHandle(
                "gst_collect_pads_flush",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_collect_pads_peek = Interop.downcallHandle(
                "gst_collect_pads_peek",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_collect_pads_pop = Interop.downcallHandle(
                "gst_collect_pads_pop",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_collect_pads_query_default = Interop.downcallHandle(
                "gst_collect_pads_query_default",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_collect_pads_read_buffer = Interop.downcallHandle(
                "gst_collect_pads_read_buffer",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_collect_pads_remove_pad = Interop.downcallHandle(
                "gst_collect_pads_remove_pad",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_collect_pads_set_buffer_function = Interop.downcallHandle(
                "gst_collect_pads_set_buffer_function",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_collect_pads_set_clip_function = Interop.downcallHandle(
                "gst_collect_pads_set_clip_function",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_collect_pads_set_compare_function = Interop.downcallHandle(
                "gst_collect_pads_set_compare_function",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_collect_pads_set_event_function = Interop.downcallHandle(
                "gst_collect_pads_set_event_function",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_collect_pads_set_flush_function = Interop.downcallHandle(
                "gst_collect_pads_set_flush_function",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_collect_pads_set_flushing = Interop.downcallHandle(
                "gst_collect_pads_set_flushing",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_collect_pads_set_function = Interop.downcallHandle(
                "gst_collect_pads_set_function",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_collect_pads_set_query_function = Interop.downcallHandle(
                "gst_collect_pads_set_query_function",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_collect_pads_set_waiting = Interop.downcallHandle(
                "gst_collect_pads_set_waiting",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_collect_pads_src_event_default = Interop.downcallHandle(
                "gst_collect_pads_src_event_default",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_collect_pads_start = Interop.downcallHandle(
                "gst_collect_pads_start",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_collect_pads_stop = Interop.downcallHandle(
                "gst_collect_pads_stop",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_collect_pads_take_buffer = Interop.downcallHandle(
                "gst_collect_pads_take_buffer",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_collect_pads_get_type = Interop.downcallHandle(
                "gst_collect_pads_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_collect_pads_get_type != null;
    }
}
