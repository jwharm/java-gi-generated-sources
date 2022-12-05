package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This is a generic base class for source elements. The following
 * types of sources are supported:
 * <p>
 *   * random access sources like files
 *   * seekable sources
 *   * live sources
 * <p>
 * The source can be configured to operate in any {@link org.gstreamer.gst.Format} with the
 * gst_base_src_set_format() method. The currently set format determines
 * the format of the internal {@link org.gstreamer.gst.Segment} and any {@link org.gstreamer.gst.EventType#SEGMENT}
 * events. The default format for {@link BaseSrc} is {@link org.gstreamer.gst.Format#BYTES}.
 * <p>
 * {@link BaseSrc} always supports push mode scheduling. If the following
 * conditions are met, it also supports pull mode scheduling:
 * <p>
 *   * The format is set to {@link org.gstreamer.gst.Format#BYTES} (default).
 *   * {@link BaseSrcClass}::is_seekable returns {@code true}.
 * <p>
 * If all the conditions are met for operating in pull mode, {@link BaseSrc} is
 * automatically seekable in push mode as well. The following conditions must
 * be met to make the element seekable in push mode when the format is not
 * {@link org.gstreamer.gst.Format#BYTES}:
 * <p>
 * * {@link BaseSrcClass}::is_seekable returns {@code true}.
 * * {@link BaseSrcClass}::query can convert all supported seek formats to the
 *   internal format as set with gst_base_src_set_format().
 * * {@link BaseSrcClass}::do_seek is implemented, performs the seek and returns
 *    {@code true}.
 * <p>
 * When the element does not meet the requirements to operate in pull mode, the
 * offset and length in the {@link BaseSrcClass}::create method should be ignored.
 * It is recommended to subclass {@link PushSrc} instead, in this situation. If the
 * element can operate in pull mode but only with specific offsets and
 * lengths, it is allowed to generate an error when the wrong values are passed
 * to the {@link BaseSrcClass}::create function.
 * <p>
 * {@link BaseSrc} has support for live sources. Live sources are sources that when
 * paused discard data, such as audio or video capture devices. A typical live
 * source also produces data at a fixed rate and thus provides a clock to publish
 * this rate.
 * Use gst_base_src_set_live() to activate the live source mode.
 * <p>
 * A live source does not produce data in the PAUSED state. This means that the
 * {@link BaseSrcClass}::create method will not be called in PAUSED but only in
 * PLAYING. To signal the pipeline that the element will not produce data, the
 * return value from the READY to PAUSED state will be
 * {@link org.gstreamer.gst.StateChangeReturn#NO_PREROLL}.
 * <p>
 * A typical live source will timestamp the buffers it creates with the
 * current running time of the pipeline. This is one reason why a live source
 * can only produce data in the PLAYING state, when the clock is actually
 * distributed and running.
 * <p>
 * Live sources that synchronize and block on the clock (an audio source, for
 * example) can use gst_base_src_wait_playing() when the
 * {@link BaseSrcClass}::create function was interrupted by a state change to
 * PAUSED.
 * <p>
 * The {@link BaseSrcClass}::get_times method can be used to implement pseudo-live
 * sources. It only makes sense to implement the {@link BaseSrcClass}::get_times
 * function if the source is a live source. The {@link BaseSrcClass}::get_times
 * function should return timestamps starting from 0, as if it were a non-live
 * source. The base class will make sure that the timestamps are transformed
 * into the current running_time. The base source will then wait for the
 * calculated running_time before pushing out the buffer.
 * <p>
 * For live sources, the base class will by default report a latency of 0.
 * For pseudo live sources, the base class will by default measure the difference
 * between the first buffer timestamp and the start time of get_times and will
 * report this value as the latency.
 * Subclasses should override the query function when this behaviour is not
 * acceptable.
 * <p>
 * There is only support in {@link BaseSrc} for exactly one source pad, which
 * should be named "src". A source implementation (subclass of {@link BaseSrc})
 * should install a pad template in its class_init function, like so:
 * <pre>{@code <!-- language="C" -->
 * static void
 * my_element_class_init (GstMyElementClass *klass)
 * {
 *   GstElementClass *gstelement_class = GST_ELEMENT_CLASS (klass);
 *   // srctemplate should be a #GstStaticPadTemplate with direction
 *   // %GST_PAD_SRC and name "src"
 *   gst_element_class_add_static_pad_template (gstelement_class, &srctemplate);
 * 
 *   gst_element_class_set_static_metadata (gstelement_class,
 *      "Source name",
 *      "Source",
 *      "My Source element",
 *      "The author <my.sink@my.email>");
 * }
 * }</pre>
 * <p>
 * <strong>Controlled shutdown of live sources in applications</strong><br/>
 * Applications that record from a live source may want to stop recording
 * in a controlled way, so that the recording is stopped, but the data
 * already in the pipeline is processed to the end (remember that many live
 * sources would go on recording forever otherwise). For that to happen the
 * application needs to make the source stop recording and send an EOS
 * event down the pipeline. The application would then wait for an
 * EOS message posted on the pipeline's bus to know when all data has
 * been processed and the pipeline can safely be stopped.
 * <p>
 * An application may send an EOS event to a source element to make it
 * perform the EOS logic (send EOS event downstream or post a
 * {@link org.gstreamer.gst.MessageType#SEGMENT_DONE} on the bus). This can typically be done
 * with the gst_element_send_event() function on the element or its parent bin.
 * <p>
 * After the EOS has been sent to the element, the application should wait for
 * an EOS message to be posted on the pipeline's bus. Once this EOS message is
 * received, it may safely shut down the entire pipeline.
 */
public class BaseSrc extends org.gstreamer.gst.Element {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstBaseSrc";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Element.getMemoryLayout().withName("element"),
        Interop.valueLayout.ADDRESS.withName("srcpad"),
        org.gtk.glib.Mutex.getMemoryLayout().withName("live_lock"),
        org.gtk.glib.Cond.getMemoryLayout().withName("live_cond"),
        Interop.valueLayout.C_INT.withName("is_live"),
        Interop.valueLayout.C_INT.withName("live_running"),
        Interop.valueLayout.C_INT.withName("blocksize"),
        Interop.valueLayout.C_INT.withName("can_activate_push"),
        Interop.valueLayout.C_INT.withName("random_access"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("clock_id"),
        org.gstreamer.gst.Segment.getMemoryLayout().withName("segment"),
        Interop.valueLayout.C_INT.withName("need_newsegment"),
        Interop.valueLayout.C_INT.withName("num_buffers"),
        Interop.valueLayout.C_INT.withName("num_buffers_left"),
        Interop.valueLayout.C_INT.withName("typefind"),
        Interop.valueLayout.C_INT.withName("running"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("pending_seek"),
        Interop.valueLayout.ADDRESS.withName("priv"),
        MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a BaseSrc proxy instance for the provided memory address.
     * <p>
     * Because BaseSrc is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code refSink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public BaseSrc(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            refSink();
        }
    }
    
    /**
     * Cast object to BaseSrc if its GType is a (or inherits from) "GstBaseSrc".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code BaseSrc} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstBaseSrc", a ClassCastException will be thrown.
     */
    public static BaseSrc castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), BaseSrc.getType())) {
            return new BaseSrc(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstBaseSrc");
        }
    }
    
    /**
     * Lets {@link BaseSrc} sub-classes to know the memory {@code allocator}
     * used by the base class and its {@code params}.
     * <p>
     * Unref the {@code allocator} after usage.
     * @param allocator the {@link org.gstreamer.gst.Allocator}
     * used
     * @param params the {@link org.gstreamer.gst.AllocationParams} of {@code allocator}
     */
    public void getAllocator(@Nullable Out<org.gstreamer.gst.Allocator> allocator, @NotNull org.gstreamer.gst.AllocationParams params) {
        MemorySegment allocatorPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        java.util.Objects.requireNonNull(params, "Parameter 'params' must not be null");
        try {
            DowncallHandles.gst_base_src_get_allocator.invokeExact(
                    handle(),
                    (Addressable) (allocator == null ? MemoryAddress.NULL : (Addressable) allocatorPOINTER.address()),
                    params.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (allocator != null) allocator.set(new org.gstreamer.gst.Allocator(allocatorPOINTER.get(Interop.valueLayout.ADDRESS, 0), Ownership.FULL));
    }
    
    /**
     * Get the number of bytes that {@code src} will push out with each buffer.
     * @return the number of bytes pushed with each buffer.
     */
    public int getBlocksize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_src_get_blocksize.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    public @Nullable org.gstreamer.gst.BufferPool getBufferPool() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_base_src_get_buffer_pool.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.BufferPool(RESULT, Ownership.FULL);
    }
    
    /**
     * Query if {@code src} timestamps outgoing buffers based on the current running_time.
     * @return {@code true} if the base class will automatically timestamp outgoing buffers.
     */
    public boolean getDoTimestamp() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_src_get_do_timestamp.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Get the current async behaviour of {@code src}. See also gst_base_src_set_async().
     * @return {@code true} if {@code src} is operating in async mode.
     */
    public boolean isAsync() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_src_is_async.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Check if an element is in live mode.
     * @return {@code true} if element is in live mode.
     */
    public boolean isLive() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_src_is_live.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Negotiates src pad caps with downstream elements.
     * Unmarks GST_PAD_FLAG_NEED_RECONFIGURE in any case. But marks it again
     * if {@link BaseSrcClass}::negotiate fails.
     * <p>
     * Do not call this in the {@link BaseSrcClass}::fill vmethod. Call this in
     * {@link BaseSrcClass}::create or in {@link BaseSrcClass}::alloc, _before_ any
     * buffer is allocated.
     * @return {@code true} if the negotiation succeeded, else {@code false}.
     */
    public boolean negotiate() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_src_negotiate.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Prepare a new seamless segment for emission downstream. This function must
     * only be called by derived sub-classes, and only from the {@link BaseSrcClass}::create function,
     * as the stream-lock needs to be held.
     * <p>
     * The format for the new segment will be the current format of the source, as
     * configured with gst_base_src_set_format()
     * @param start The new start value for the segment
     * @param stop Stop value for the new segment
     * @param time The new time value for the start of the new segment
     * @return {@code true} if preparation of the seamless segment succeeded.
     * @deprecated Use gst_base_src_new_segment()
     */
    @Deprecated
    public boolean newSeamlessSegment(long start, long stop, long time) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_src_new_seamless_segment.invokeExact(
                    handle(),
                    start,
                    stop,
                    time);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Prepare a new segment for emission downstream. This function must
     * only be called by derived sub-classes, and only from the {@link BaseSrcClass}::create function,
     * as the stream-lock needs to be held.
     * <p>
     * The format for the {@code segment} must be identical with the current format
     * of the source, as configured with gst_base_src_set_format().
     * <p>
     * The format of {@code src} must not be {@link org.gstreamer.gst.Format#UNDEFINED} and the format
     * should be configured via gst_base_src_set_format() before calling this method.
     * @param segment a pointer to a {@link org.gstreamer.gst.Segment}
     * @return {@code true} if preparation of new segment succeeded.
     */
    public boolean newSegment(@NotNull org.gstreamer.gst.Segment segment) {
        java.util.Objects.requireNonNull(segment, "Parameter 'segment' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_src_new_segment.invokeExact(
                    handle(),
                    segment.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Query the source for the latency parameters. {@code live} will be {@code true} when {@code src} is
     * configured as a live source. {@code min_latency} and {@code max_latency} will be set
     * to the difference between the running time and the timestamp of the first
     * buffer.
     * <p>
     * This function is mostly used by subclasses.
     * @param live if the source is live
     * @param minLatency the min latency of the source
     * @param maxLatency the max latency of the source
     * @return {@code true} if the query succeeded.
     */
    public boolean queryLatency(Out<Boolean> live, @NotNull Out<org.gstreamer.gst.ClockTime> minLatency, @NotNull Out<org.gstreamer.gst.ClockTime> maxLatency) {
        java.util.Objects.requireNonNull(live, "Parameter 'live' must not be null");
        MemorySegment livePOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_INT);
        java.util.Objects.requireNonNull(minLatency, "Parameter 'minLatency' must not be null");
        MemorySegment minLatencyPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        java.util.Objects.requireNonNull(maxLatency, "Parameter 'maxLatency' must not be null");
        MemorySegment maxLatencyPOINTER = Interop.getAllocator().allocate(Interop.valueLayout.C_LONG);
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_src_query_latency.invokeExact(
                    handle(),
                    (Addressable) livePOINTER.address(),
                    (Addressable) minLatencyPOINTER.address(),
                    (Addressable) maxLatencyPOINTER.address());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        live.set(livePOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
        minLatency.set(new org.gstreamer.gst.ClockTime(minLatencyPOINTER.get(Interop.valueLayout.C_LONG, 0)));
        maxLatency.set(new org.gstreamer.gst.ClockTime(maxLatencyPOINTER.get(Interop.valueLayout.C_LONG, 0)));
        return RESULT != 0;
    }
    
    /**
     * Configure async behaviour in {@code src}, no state change will block. The open,
     * close, start, stop, play and pause virtual methods will be executed in a
     * different thread and are thus allowed to perform blocking operations. Any
     * blocking operation should be unblocked with the unlock vmethod.
     * @param async new async mode
     */
    public void setAsync(boolean async) {
        try {
            DowncallHandles.gst_base_src_set_async.invokeExact(
                    handle(),
                    async ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If {@code automatic_eos} is {@code true}, {@code src} will automatically go EOS if a buffer
     * after the total size is returned. By default this is {@code true} but sources
     * that can't return an authoritative size and only know that they're EOS
     * when trying to read more should set this to {@code false}.
     * <p>
     * When {@code src} operates in {@link org.gstreamer.gst.Format#TIME}, {@link BaseSrc} will send an EOS
     * when a buffer outside of the currently configured segment is pushed if
     * {@code automatic_eos} is {@code true}. Since 1.16, if {@code automatic_eos} is {@code false} an
     * EOS will be pushed only when the {@link BaseSrcClass}::create implementation
     * returns {@link org.gstreamer.gst.FlowReturn#EOS}.
     * @param automaticEos automatic eos
     */
    public void setAutomaticEos(boolean automaticEos) {
        try {
            DowncallHandles.gst_base_src_set_automatic_eos.invokeExact(
                    handle(),
                    automaticEos ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the number of bytes that {@code src} will push out with each buffer. When
     * {@code blocksize} is set to -1, a default length will be used.
     * @param blocksize the new blocksize in bytes
     */
    public void setBlocksize(int blocksize) {
        try {
            DowncallHandles.gst_base_src_set_blocksize.invokeExact(
                    handle(),
                    blocksize);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set new caps on the basesrc source pad.
     * @param caps a {@link org.gstreamer.gst.Caps}
     * @return {@code true} if the caps could be set
     */
    public boolean setCaps(@NotNull org.gstreamer.gst.Caps caps) {
        java.util.Objects.requireNonNull(caps, "Parameter 'caps' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_src_set_caps.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Configure {@code src} to automatically timestamp outgoing buffers based on the
     * current running_time of the pipeline. This property is mostly useful for live
     * sources.
     * @param timestamp enable or disable timestamping
     */
    public void setDoTimestamp(boolean timestamp) {
        try {
            DowncallHandles.gst_base_src_set_do_timestamp.invokeExact(
                    handle(),
                    timestamp ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If not {@code dynamic}, size is only updated when needed, such as when trying to
     * read past current tracked size.  Otherwise, size is checked for upon each
     * read.
     * @param dynamic new dynamic size mode
     */
    public void setDynamicSize(boolean dynamic) {
        try {
            DowncallHandles.gst_base_src_set_dynamic_size.invokeExact(
                    handle(),
                    dynamic ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Sets the default format of the source. This will be the format used
     * for sending SEGMENT events and for performing seeks.
     * <p>
     * If a format of GST_FORMAT_BYTES is set, the element will be able to
     * operate in pull mode if the {@link BaseSrcClass}::is_seekable returns {@code true}.
     * <p>
     * This function must only be called in states &lt; {@link org.gstreamer.gst.State#PAUSED}.
     * @param format the format to use
     */
    public void setFormat(@NotNull org.gstreamer.gst.Format format) {
        java.util.Objects.requireNonNull(format, "Parameter 'format' must not be null");
        try {
            DowncallHandles.gst_base_src_set_format.invokeExact(
                    handle(),
                    format.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * If the element listens to a live source, {@code live} should
     * be set to {@code true}.
     * <p>
     * A live source will not produce data in the PAUSED state and
     * will therefore not be able to participate in the PREROLL phase
     * of a pipeline. To signal this fact to the application and the
     * pipeline, the state change return value of the live source will
     * be GST_STATE_CHANGE_NO_PREROLL.
     * @param live new live-mode
     */
    public void setLive(boolean live) {
        try {
            DowncallHandles.gst_base_src_set_live.invokeExact(
                    handle(),
                    live ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Complete an asynchronous start operation. When the subclass overrides the
     * start method, it should call gst_base_src_start_complete() when the start
     * operation completes either from the same thread or from an asynchronous
     * helper thread.
     * @param ret a {@link org.gstreamer.gst.FlowReturn}
     */
    public void startComplete(@NotNull org.gstreamer.gst.FlowReturn ret) {
        java.util.Objects.requireNonNull(ret, "Parameter 'ret' must not be null");
        try {
            DowncallHandles.gst_base_src_start_complete.invokeExact(
                    handle(),
                    ret.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Wait until the start operation completes.
     * @return a {@link org.gstreamer.gst.FlowReturn}.
     */
    public @NotNull org.gstreamer.gst.FlowReturn startWait() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_src_start_wait.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Subclasses can call this from their create virtual method implementation
     * to submit a buffer list to be pushed out later. This is useful in
     * cases where the create function wants to produce multiple buffers to be
     * pushed out in one go in form of a {@link org.gstreamer.gst.BufferList}, which can reduce overhead
     * drastically, especially for packetised inputs (for data streams where
     * the packetisation/chunking is not important it is usually more efficient
     * to return larger buffers instead).
     * <p>
     * Subclasses that use this function from their create function must return
     * {@link org.gstreamer.gst.FlowReturn#OK} and no buffer from their create virtual method implementation.
     * If a buffer is returned after a buffer list has also been submitted via this
     * function the behaviour is undefined.
     * <p>
     * Subclasses must only call this function once per create function call and
     * subclasses must only call this function when the source operates in push
     * mode.
     * @param bufferList a {@link org.gstreamer.gst.BufferList}
     */
    public void submitBufferList(@NotNull org.gstreamer.gst.BufferList bufferList) {
        java.util.Objects.requireNonNull(bufferList, "Parameter 'bufferList' must not be null");
        try {
            DowncallHandles.gst_base_src_submit_buffer_list.invokeExact(
                    handle(),
                    bufferList.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        bufferList.yieldOwnership();
    }
    
    /**
     * If the {@link BaseSrcClass}::create method performs its own synchronisation
     * against the clock it must unblock when going from PLAYING to the PAUSED state
     * and call this method before continuing to produce the remaining data.
     * <p>
     * This function will block until a state change to PLAYING happens (in which
     * case this function returns {@link org.gstreamer.gst.FlowReturn#OK}) or the processing must be stopped due
     * to a state change to READY or a FLUSH event (in which case this function
     * returns {@link org.gstreamer.gst.FlowReturn#FLUSHING}).
     * @return {@link org.gstreamer.gst.FlowReturn#OK} if {@code src} is PLAYING and processing can
     * continue. Any other return value should be returned from the create vmethod.
     */
    public @NotNull org.gstreamer.gst.FlowReturn waitPlaying() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_base_src_wait_playing.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.FlowReturn.of(RESULT);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_base_src_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Element.Build {
        
         /**
         * A {@link BaseSrc.Build} object constructs a {@link BaseSrc} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link BaseSrc} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link BaseSrc} using {@link BaseSrc#castFrom}.
         * @return A new instance of {@code BaseSrc} with the properties 
         *         that were set in the Build object.
         */
        public BaseSrc construct() {
            return BaseSrc.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    BaseSrc.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setBlocksize(int blocksize) {
            names.add("blocksize");
            values.add(org.gtk.gobject.Value.create(blocksize));
            return this;
        }
        
        public Build setDoTimestamp(boolean doTimestamp) {
            names.add("do-timestamp");
            values.add(org.gtk.gobject.Value.create(doTimestamp));
            return this;
        }
        
        public Build setNumBuffers(int numBuffers) {
            names.add("num-buffers");
            values.add(org.gtk.gobject.Value.create(numBuffers));
            return this;
        }
        
        public Build setTypefind(boolean typefind) {
            names.add("typefind");
            values.add(org.gtk.gobject.Value.create(typefind));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_base_src_get_allocator = Interop.downcallHandle(
            "gst_base_src_get_allocator",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_src_get_blocksize = Interop.downcallHandle(
            "gst_base_src_get_blocksize",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_src_get_buffer_pool = Interop.downcallHandle(
            "gst_base_src_get_buffer_pool",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_src_get_do_timestamp = Interop.downcallHandle(
            "gst_base_src_get_do_timestamp",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_src_is_async = Interop.downcallHandle(
            "gst_base_src_is_async",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_src_is_live = Interop.downcallHandle(
            "gst_base_src_is_live",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_src_negotiate = Interop.downcallHandle(
            "gst_base_src_negotiate",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_src_new_seamless_segment = Interop.downcallHandle(
            "gst_base_src_new_seamless_segment",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
            false
        );
        
        private static final MethodHandle gst_base_src_new_segment = Interop.downcallHandle(
            "gst_base_src_new_segment",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_src_query_latency = Interop.downcallHandle(
            "gst_base_src_query_latency",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_src_set_async = Interop.downcallHandle(
            "gst_base_src_set_async",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_src_set_automatic_eos = Interop.downcallHandle(
            "gst_base_src_set_automatic_eos",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_src_set_blocksize = Interop.downcallHandle(
            "gst_base_src_set_blocksize",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_src_set_caps = Interop.downcallHandle(
            "gst_base_src_set_caps",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_src_set_do_timestamp = Interop.downcallHandle(
            "gst_base_src_set_do_timestamp",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_src_set_dynamic_size = Interop.downcallHandle(
            "gst_base_src_set_dynamic_size",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_src_set_format = Interop.downcallHandle(
            "gst_base_src_set_format",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_src_set_live = Interop.downcallHandle(
            "gst_base_src_set_live",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_src_start_complete = Interop.downcallHandle(
            "gst_base_src_start_complete",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_base_src_start_wait = Interop.downcallHandle(
            "gst_base_src_start_wait",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_src_submit_buffer_list = Interop.downcallHandle(
            "gst_base_src_submit_buffer_list",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_src_wait_playing = Interop.downcallHandle(
            "gst_base_src_wait_playing",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_base_src_get_type = Interop.downcallHandle(
            "gst_base_src_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
