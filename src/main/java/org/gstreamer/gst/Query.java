package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Queries can be performed on pads (gst_pad_query()) and elements
 * (gst_element_query()). Please note that some queries might need a running
 * pipeline to work.
 * <p>
 * Queries can be created using the gst_query_new_*() functions.
 * Query values can be set using gst_query_set_*(), and parsed using
 * gst_query_parse_*() helpers.
 * <p>
 * The following example shows how to query the duration of a pipeline:
 * <pre>{@code <!-- language="C" -->
 *   GstQuery *query;
 *   gboolean res;
 *   query = gst_query_new_duration (GST_FORMAT_TIME);
 *   res = gst_element_query (pipeline, query);
 *   if (res) {
 *     gint64 duration;
 *     gst_query_parse_duration (query, NULL, &duration);
 *     g_print ("duration = %"GST_TIME_FORMAT, GST_TIME_ARGS (duration));
 *   } else {
 *     g_print ("duration query failed...");
 *   }
 *   gst_query_unref (query);
 * }</pre>
 */
public class Query extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstQuery";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.MiniObject.getMemoryLayout().withName("mini_object"),
            Interop.valueLayout.C_INT.withName("type")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Query}
     * @return A new, uninitialized @{link Query}
     */
    public static Query allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        Query newInstance = new Query(segment.address());
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
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public org.gstreamer.gst.QueryType getType() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return org.gstreamer.gst.QueryType.of(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void setType(org.gstreamer.gst.QueryType type) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
        }
    }
    
    /**
     * Create a Query proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected Query(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, Query> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new Query(input);
    
    private static MemoryAddress constructNewAcceptCaps(org.gstreamer.gst.Caps caps) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_query_new_accept_caps.invokeExact(caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Constructs a new query object for querying if {@code caps} are accepted.
     * <p>
     * Free-function: gst_query_unref()
     * @param caps a fixed {@link Caps}
     * @return a new {@link Query}
     */
    public static Query newAcceptCaps(org.gstreamer.gst.Caps caps) {
        var RESULT = constructNewAcceptCaps(caps);
        var OBJECT = org.gstreamer.gst.Query.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewAllocation(org.gstreamer.gst.Caps caps, boolean needPool) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_query_new_allocation.invokeExact(
                    caps.handle(),
                    Marshal.booleanToInteger.marshal(needPool, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Constructs a new query object for querying the allocation properties.
     * <p>
     * Free-function: gst_query_unref()
     * @param caps the negotiated caps
     * @param needPool return a pool
     * @return a new {@link Query}
     */
    public static Query newAllocation(org.gstreamer.gst.Caps caps, boolean needPool) {
        var RESULT = constructNewAllocation(caps, needPool);
        var OBJECT = org.gstreamer.gst.Query.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewBitrate() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_query_new_bitrate.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Constructs a new query object for querying the bitrate.
     * <p>
     * Free-function: gst_query_unref()
     * @return a new {@link Query}
     */
    public static Query newBitrate() {
        var RESULT = constructNewBitrate();
        var OBJECT = org.gstreamer.gst.Query.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewBuffering(org.gstreamer.gst.Format format) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_query_new_buffering.invokeExact(format.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Constructs a new query object for querying the buffering status of
     * a stream.
     * <p>
     * Free-function: gst_query_unref()
     * @param format the default {@link Format} for the new query
     * @return a new {@link Query}
     */
    public static Query newBuffering(org.gstreamer.gst.Format format) {
        var RESULT = constructNewBuffering(format);
        var OBJECT = org.gstreamer.gst.Query.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewCaps(org.gstreamer.gst.Caps filter) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_query_new_caps.invokeExact(filter.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Constructs a new query object for querying the caps.
     * <p>
     * The CAPS query should return the allowable caps for a pad in the context
     * of the element's state, its link to other elements, and the devices or files
     * it has opened. These caps must be a subset of the pad template caps. In the
     * NULL state with no links, the CAPS query should ideally return the same caps
     * as the pad template. In rare circumstances, an object property can affect
     * the caps returned by the CAPS query, but this is discouraged.
     * <p>
     * For most filters, the caps returned by CAPS query is directly affected by the
     * allowed caps on other pads. For demuxers and decoders, the caps returned by
     * the srcpad's getcaps function is directly related to the stream data. Again,
     * the CAPS query should return the most specific caps it reasonably can, since this
     * helps with autoplugging.
     * <p>
     * The {@code filter} is used to restrict the result caps, only the caps matching
     * {@code filter} should be returned from the CAPS query. Specifying a filter might
     * greatly reduce the amount of processing an element needs to do.
     * <p>
     * Free-function: gst_query_unref()
     * @param filter a filter
     * @return a new {@link Query}
     */
    public static Query newCaps(org.gstreamer.gst.Caps filter) {
        var RESULT = constructNewCaps(filter);
        var OBJECT = org.gstreamer.gst.Query.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewContext(java.lang.String contextType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_query_new_context.invokeExact(Marshal.stringToAddress.marshal(contextType, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
        
    /**
     * Constructs a new query object for querying the pipeline-local context.
     * <p>
     * Free-function: gst_query_unref()
     * @param contextType Context type to query
     * @return a new {@link Query}
     */
    public static Query newContext(java.lang.String contextType) {
        var RESULT = constructNewContext(contextType);
        var OBJECT = org.gstreamer.gst.Query.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewConvert(org.gstreamer.gst.Format srcFormat, long value, org.gstreamer.gst.Format destFormat) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_query_new_convert.invokeExact(
                    srcFormat.getValue(),
                    value,
                    destFormat.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Constructs a new convert query object. Use gst_query_unref()
     * when done with it. A convert query is used to ask for a conversion between
     * one format and another.
     * <p>
     * Free-function: gst_query_unref()
     * @param srcFormat the source {@link Format} for the new query
     * @param value the value to convert
     * @param destFormat the target {@link Format}
     * @return a {@link Query}
     */
    public static Query newConvert(org.gstreamer.gst.Format srcFormat, long value, org.gstreamer.gst.Format destFormat) {
        var RESULT = constructNewConvert(srcFormat, value, destFormat);
        var OBJECT = org.gstreamer.gst.Query.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewCustom(org.gstreamer.gst.QueryType type, @Nullable org.gstreamer.gst.Structure structure) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_query_new_custom.invokeExact(
                    type.getValue(),
                    (Addressable) (structure == null ? MemoryAddress.NULL : structure.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        structure.yieldOwnership();
        return RESULT;
    }
        
    /**
     * Constructs a new custom query object. Use gst_query_unref()
     * when done with it.
     * <p>
     * Free-function: gst_query_unref()
     * @param type the query type
     * @param structure a structure for the query
     * @return a new {@link Query}
     */
    public static Query newCustom(org.gstreamer.gst.QueryType type, @Nullable org.gstreamer.gst.Structure structure) {
        var RESULT = constructNewCustom(type, structure);
        var OBJECT = org.gstreamer.gst.Query.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewDrain() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_query_new_drain.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Constructs a new query object for querying the drain state.
     * <p>
     * Free-function: gst_query_unref()
     * @return a new {@link Query}
     */
    public static Query newDrain() {
        var RESULT = constructNewDrain();
        var OBJECT = org.gstreamer.gst.Query.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewDuration(org.gstreamer.gst.Format format) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_query_new_duration.invokeExact(format.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Constructs a new stream duration query object to query in the given format.
     * Use gst_query_unref() when done with it. A duration query will give the
     * total length of the stream.
     * <p>
     * Free-function: gst_query_unref()
     * @param format the {@link Format} for this duration query
     * @return a new {@link Query}
     */
    public static Query newDuration(org.gstreamer.gst.Format format) {
        var RESULT = constructNewDuration(format);
        var OBJECT = org.gstreamer.gst.Query.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewFormats() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_query_new_formats.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Constructs a new query object for querying formats of
     * the stream.
     * <p>
     * Free-function: gst_query_unref()
     * @return a new {@link Query}
     */
    public static Query newFormats() {
        var RESULT = constructNewFormats();
        var OBJECT = org.gstreamer.gst.Query.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewLatency() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_query_new_latency.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Constructs a new latency query object.
     * Use gst_query_unref() when done with it. A latency query is usually performed
     * by sinks to compensate for additional latency introduced by elements in the
     * pipeline.
     * <p>
     * Free-function: gst_query_unref()
     * @return a {@link Query}
     */
    public static Query newLatency() {
        var RESULT = constructNewLatency();
        var OBJECT = org.gstreamer.gst.Query.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewPosition(org.gstreamer.gst.Format format) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_query_new_position.invokeExact(format.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Constructs a new query stream position query object. Use gst_query_unref()
     * when done with it. A position query is used to query the current position
     * of playback in the streams, in some format.
     * <p>
     * Free-function: gst_query_unref()
     * @param format the default {@link Format} for the new query
     * @return a new {@link Query}
     */
    public static Query newPosition(org.gstreamer.gst.Format format) {
        var RESULT = constructNewPosition(format);
        var OBJECT = org.gstreamer.gst.Query.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewScheduling() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_query_new_scheduling.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Constructs a new query object for querying the scheduling properties.
     * <p>
     * Free-function: gst_query_unref()
     * @return a new {@link Query}
     */
    public static Query newScheduling() {
        var RESULT = constructNewScheduling();
        var OBJECT = org.gstreamer.gst.Query.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewSeeking(org.gstreamer.gst.Format format) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_query_new_seeking.invokeExact(format.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Constructs a new query object for querying seeking properties of
     * the stream.
     * <p>
     * Free-function: gst_query_unref()
     * @param format the default {@link Format} for the new query
     * @return a new {@link Query}
     */
    public static Query newSeeking(org.gstreamer.gst.Format format) {
        var RESULT = constructNewSeeking(format);
        var OBJECT = org.gstreamer.gst.Query.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewSegment(org.gstreamer.gst.Format format) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_query_new_segment.invokeExact(format.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Constructs a new segment query object. Use gst_query_unref()
     * when done with it. A segment query is used to discover information about the
     * currently configured segment for playback.
     * <p>
     * Free-function: gst_query_unref()
     * @param format the {@link Format} for the new query
     * @return a new {@link Query}
     */
    public static Query newSegment(org.gstreamer.gst.Format format) {
        var RESULT = constructNewSegment(format);
        var OBJECT = org.gstreamer.gst.Query.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    private static MemoryAddress constructNewUri() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_query_new_uri.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
        
    /**
     * Constructs a new query URI query object. Use gst_query_unref()
     * when done with it. An URI query is used to query the current URI
     * that is used by the source or sink.
     * <p>
     * Free-function: gst_query_unref()
     * @return a new {@link Query}
     */
    public static Query newUri() {
        var RESULT = constructNewUri();
        var OBJECT = org.gstreamer.gst.Query.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Add {@code api} with {@code params} as one of the supported metadata API to {@code query}.
     * @param api the metadata API
     * @param params API specific parameters
     */
    public void addAllocationMeta(org.gtk.glib.Type api, @Nullable org.gstreamer.gst.Structure params) {
        try {
            DowncallHandles.gst_query_add_allocation_meta.invokeExact(
                    handle(),
                    api.getValue().longValue(),
                    (Addressable) (params == null ? MemoryAddress.NULL : params.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Add {@code allocator} and its {@code params} as a supported memory allocator.
     * @param allocator the memory allocator
     * @param params a {@link AllocationParams}
     */
    public void addAllocationParam(@Nullable org.gstreamer.gst.Allocator allocator, @Nullable org.gstreamer.gst.AllocationParams params) {
        try {
            DowncallHandles.gst_query_add_allocation_param.invokeExact(
                    handle(),
                    (Addressable) (allocator == null ? MemoryAddress.NULL : allocator.handle()),
                    (Addressable) (params == null ? MemoryAddress.NULL : params.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the pool parameters in {@code query}.
     * @param pool the {@link BufferPool}
     * @param size the buffer size
     * @param minBuffers the min buffers
     * @param maxBuffers the max buffers
     */
    public void addAllocationPool(@Nullable org.gstreamer.gst.BufferPool pool, int size, int minBuffers, int maxBuffers) {
        try {
            DowncallHandles.gst_query_add_allocation_pool.invokeExact(
                    handle(),
                    (Addressable) (pool == null ? MemoryAddress.NULL : pool.handle()),
                    size,
                    minBuffers,
                    maxBuffers);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the buffering-ranges array field in {@code query}. The current last
     * start position of the array should be inferior to {@code start}.
     * @param start start position of the range
     * @param stop stop position of the range
     * @return a {@code gboolean} indicating if the range was added or not.
     */
    public boolean addBufferingRange(long start, long stop) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_query_add_buffering_range.invokeExact(
                    handle(),
                    start,
                    stop);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Add {@code mode} as one of the supported scheduling modes to {@code query}.
     * @param mode a {@link PadMode}
     */
    public void addSchedulingMode(org.gstreamer.gst.PadMode mode) {
        try {
            DowncallHandles.gst_query_add_scheduling_mode.invokeExact(
                    handle(),
                    mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Check if {@code query} has metadata {@code api} set. When this function returns {@code true},
     * {@code index} will contain the index where the requested API and the parameters
     * can be found.
     * @param api the metadata API
     * @param index the index
     * @return {@code true} when {@code api} is in the list of metadata.
     */
    public boolean findAllocationMeta(org.gtk.glib.Type api, Out<Integer> index) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment indexPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_query_find_allocation_meta.invokeExact(
                        handle(),
                        api.getValue().longValue(),
                        (Addressable) (index == null ? MemoryAddress.NULL : (Addressable) indexPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (index != null) index.set(indexPOINTER.get(Interop.valueLayout.C_INT, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Retrieve the number of values currently stored in the
     * meta API array of the query's structure.
     * @return the metadata API array size as a {@code guint}.
     */
    public int getNAllocationMetas() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_query_get_n_allocation_metas.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieve the number of values currently stored in the
     * allocator params array of the query's structure.
     * <p>
     * If no memory allocator is specified, the downstream element can handle
     * the default memory allocator. The first memory allocator in the query
     * should be generic and allow mapping to system memory, all following
     * allocators should be ordered by preference with the preferred one first.
     * @return the allocator array size as a {@code guint}.
     */
    public int getNAllocationParams() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_query_get_n_allocation_params.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieve the number of values currently stored in the
     * pool array of the query's structure.
     * @return the pool array size as a {@code guint}.
     */
    public int getNAllocationPools() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_query_get_n_allocation_pools.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieve the number of values currently stored in the
     * buffered-ranges array of the query's structure.
     * @return the range array size as a {@code guint}.
     */
    public int getNBufferingRanges() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_query_get_n_buffering_ranges.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieve the number of values currently stored in the
     * scheduling mode array of the query's structure.
     * @return the scheduling mode array size as a {@code guint}.
     */
    public int getNSchedulingModes() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_query_get_n_scheduling_modes.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Get the structure of a query.
     * @return the {@link Structure} of the query. The
     *     structure is still owned by the query and will therefore be freed when the
     *     query is unreffed.
     */
    public @Nullable org.gstreamer.gst.Structure getStructure() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_query_get_structure.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Check if {@code query} has scheduling mode set.
     * <p>
     * <blockquote>
     *  When checking if upstream supports pull mode, it is usually not
     *  enough to just check for GST_PAD_MODE_PULL with this function, you
     *  also want to check whether the scheduling flags returned by
     *  gst_query_parse_scheduling() have the seeking flag set (meaning
     *  random access is supported, not only sequential pulls).
     * </blockquote>
     * @param mode the scheduling mode
     * @return {@code true} when {@code mode} is in the list of scheduling modes.
     */
    public boolean hasSchedulingMode(org.gstreamer.gst.PadMode mode) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_query_has_scheduling_mode.invokeExact(
                    handle(),
                    mode.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Check if {@code query} has scheduling mode set and {@code flags} is set in
     * query scheduling flags.
     * @param mode the scheduling mode
     * @param flags {@link SchedulingFlags}
     * @return {@code true} when {@code mode} is in the list of scheduling modes
     *    and {@code flags} are compatible with query flags.
     */
    public boolean hasSchedulingModeWithFlags(org.gstreamer.gst.PadMode mode, org.gstreamer.gst.SchedulingFlags flags) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_query_has_scheduling_mode_with_flags.invokeExact(
                    handle(),
                    mode.getValue(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the caps from {@code query}. The caps remains valid as long as {@code query} remains
     * valid.
     * @param caps A pointer to the caps
     */
    public void parseAcceptCaps(Out<org.gstreamer.gst.Caps> caps) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment capsPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.gst_query_parse_accept_caps.invokeExact(
                        handle(),
                        (Addressable) capsPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    caps.set(org.gstreamer.gst.Caps.fromAddress.marshal(capsPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        }
    }
    
    /**
     * Parse the result from {@code query} and store in {@code result}.
     * @param result location for the result
     */
    public void parseAcceptCapsResult(Out<Boolean> result) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment resultPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gst_query_parse_accept_caps_result.invokeExact(
                        handle(),
                        (Addressable) (result == null ? MemoryAddress.NULL : (Addressable) resultPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (result != null) result.set(resultPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
        }
    }
    
    /**
     * Parse an allocation query, writing the requested caps in {@code caps} and
     * whether a pool is needed in {@code need_pool}, if the respective parameters
     * are non-{@code null}.
     * <p>
     * Pool details can be retrieved using gst_query_get_n_allocation_pools() and
     * gst_query_parse_nth_allocation_pool().
     * @param caps The {@link Caps}
     * @param needPool Whether a {@link BufferPool} is needed
     */
    public void parseAllocation(@Nullable Out<org.gstreamer.gst.Caps> caps, Out<Boolean> needPool) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment capsPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment needPoolPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gst_query_parse_allocation.invokeExact(
                        handle(),
                        (Addressable) (caps == null ? MemoryAddress.NULL : (Addressable) capsPOINTER.address()),
                        (Addressable) (needPool == null ? MemoryAddress.NULL : (Addressable) needPoolPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (caps != null) caps.set(org.gstreamer.gst.Caps.fromAddress.marshal(capsPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (needPool != null) needPool.set(needPoolPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
        }
    }
    
    /**
     * Get the results of a bitrate query. See also gst_query_set_bitrate().
     * @param nominalBitrate The resulting bitrate in bits per second
     */
    public void parseBitrate(Out<Integer> nominalBitrate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment nominalBitratePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gst_query_parse_bitrate.invokeExact(
                        handle(),
                        (Addressable) (nominalBitrate == null ? MemoryAddress.NULL : (Addressable) nominalBitratePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (nominalBitrate != null) nominalBitrate.set(nominalBitratePOINTER.get(Interop.valueLayout.C_INT, 0));
        }
    }
    
    /**
     * Get the percentage of buffered data. This is a value between 0 and 100.
     * The {@code busy} indicator is {@code true} when the buffering is in progress.
     * @param busy if buffering is busy, or {@code null}
     * @param percent a buffering percent, or {@code null}
     */
    public void parseBufferingPercent(Out<Boolean> busy, Out<Integer> percent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment busyPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment percentPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gst_query_parse_buffering_percent.invokeExact(
                        handle(),
                        (Addressable) (busy == null ? MemoryAddress.NULL : (Addressable) busyPOINTER.address()),
                        (Addressable) (percent == null ? MemoryAddress.NULL : (Addressable) percentPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (busy != null) busy.set(busyPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
                    if (percent != null) percent.set(percentPOINTER.get(Interop.valueLayout.C_INT, 0));
        }
    }
    
    /**
     * Parse an available query, writing the format into {@code format}, and
     * other results into the passed parameters, if the respective parameters
     * are non-{@code null}
     * @param format the format to set for the {@code segment_start}
     *     and {@code segment_end} values, or {@code null}
     * @param start the start to set, or {@code null}
     * @param stop the stop to set, or {@code null}
     * @param estimatedTotal estimated total amount of download
     *     time remaining in milliseconds, or {@code null}
     */
    public void parseBufferingRange(@Nullable Out<org.gstreamer.gst.Format> format, Out<Long> start, Out<Long> stop, Out<Long> estimatedTotal) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment formatPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment startPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment stopPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment estimatedTotalPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            try {
                DowncallHandles.gst_query_parse_buffering_range.invokeExact(
                        handle(),
                        (Addressable) (format == null ? MemoryAddress.NULL : (Addressable) formatPOINTER.address()),
                        (Addressable) (start == null ? MemoryAddress.NULL : (Addressable) startPOINTER.address()),
                        (Addressable) (stop == null ? MemoryAddress.NULL : (Addressable) stopPOINTER.address()),
                        (Addressable) (estimatedTotal == null ? MemoryAddress.NULL : (Addressable) estimatedTotalPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (format != null) format.set(org.gstreamer.gst.Format.of(formatPOINTER.get(Interop.valueLayout.C_INT, 0)));
                    if (start != null) start.set(startPOINTER.get(Interop.valueLayout.C_LONG, 0));
                    if (stop != null) stop.set(stopPOINTER.get(Interop.valueLayout.C_LONG, 0));
                    if (estimatedTotal != null) estimatedTotal.set(estimatedTotalPOINTER.get(Interop.valueLayout.C_LONG, 0));
        }
    }
    
    /**
     * Extracts the buffering stats values from {@code query}.
     * @param mode a buffering mode, or {@code null}
     * @param avgIn the average input rate, or {@code null}
     * @param avgOut the average output rat, or {@code null}
     * @param bufferingLeft amount of buffering time left in
     *     milliseconds, or {@code null}
     */
    public void parseBufferingStats(@Nullable Out<org.gstreamer.gst.BufferingMode> mode, Out<Integer> avgIn, Out<Integer> avgOut, Out<Long> bufferingLeft) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment modePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment avgInPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment avgOutPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment bufferingLeftPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            try {
                DowncallHandles.gst_query_parse_buffering_stats.invokeExact(
                        handle(),
                        (Addressable) (mode == null ? MemoryAddress.NULL : (Addressable) modePOINTER.address()),
                        (Addressable) (avgIn == null ? MemoryAddress.NULL : (Addressable) avgInPOINTER.address()),
                        (Addressable) (avgOut == null ? MemoryAddress.NULL : (Addressable) avgOutPOINTER.address()),
                        (Addressable) (bufferingLeft == null ? MemoryAddress.NULL : (Addressable) bufferingLeftPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (mode != null) mode.set(org.gstreamer.gst.BufferingMode.of(modePOINTER.get(Interop.valueLayout.C_INT, 0)));
                    if (avgIn != null) avgIn.set(avgInPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (avgOut != null) avgOut.set(avgOutPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (bufferingLeft != null) bufferingLeft.set(bufferingLeftPOINTER.get(Interop.valueLayout.C_LONG, 0));
        }
    }
    
    /**
     * Get the filter from the caps {@code query}. The caps remains valid as long as
     * {@code query} remains valid.
     * @param filter A pointer to the caps filter
     */
    public void parseCaps(Out<org.gstreamer.gst.Caps> filter) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment filterPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.gst_query_parse_caps.invokeExact(
                        handle(),
                        (Addressable) filterPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    filter.set(org.gstreamer.gst.Caps.fromAddress.marshal(filterPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        }
    }
    
    /**
     * Get the caps result from {@code query}. The caps remains valid as long as
     * {@code query} remains valid.
     * @param caps A pointer to the caps
     */
    public void parseCapsResult(Out<org.gstreamer.gst.Caps> caps) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment capsPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.gst_query_parse_caps_result.invokeExact(
                        handle(),
                        (Addressable) capsPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    caps.set(org.gstreamer.gst.Caps.fromAddress.marshal(capsPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        }
    }
    
    /**
     * Get the context from the context {@code query}. The context remains valid as long as
     * {@code query} remains valid.
     * @param context A pointer to store the {@link Context}
     */
    public void parseContext(Out<org.gstreamer.gst.Context> context) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment contextPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.gst_query_parse_context.invokeExact(
                        handle(),
                        (Addressable) contextPOINTER.address());
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    context.set(org.gstreamer.gst.Context.fromAddress.marshal(contextPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        }
    }
    
    /**
     * Parse a context type from an existing GST_QUERY_CONTEXT query.
     * @param contextType the context type, or {@code null}
     * @return a {@code gboolean} indicating if the parsing succeeded.
     */
    public boolean parseContextType(@Nullable Out<java.lang.String> contextType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment contextTypePOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_query_parse_context_type.invokeExact(
                        handle(),
                        (Addressable) (contextType == null ? MemoryAddress.NULL : (Addressable) contextTypePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (contextType != null) contextType.set(Marshal.addressToString.marshal(contextTypePOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Parse a convert query answer. Any of {@code src_format}, {@code src_value}, {@code dest_format},
     * and {@code dest_value} may be {@code null}, in which case that value is omitted.
     * @param srcFormat the storage for the {@link Format} of the
     *     source value, or {@code null}
     * @param srcValue the storage for the source value, or {@code null}
     * @param destFormat the storage for the {@link Format} of the
     *     destination value, or {@code null}
     * @param destValue the storage for the destination value,
     *     or {@code null}
     */
    public void parseConvert(@Nullable Out<org.gstreamer.gst.Format> srcFormat, Out<Long> srcValue, @Nullable Out<org.gstreamer.gst.Format> destFormat, Out<Long> destValue) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment srcFormatPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment srcValuePOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment destFormatPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment destValuePOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            try {
                DowncallHandles.gst_query_parse_convert.invokeExact(
                        handle(),
                        (Addressable) (srcFormat == null ? MemoryAddress.NULL : (Addressable) srcFormatPOINTER.address()),
                        (Addressable) (srcValue == null ? MemoryAddress.NULL : (Addressable) srcValuePOINTER.address()),
                        (Addressable) (destFormat == null ? MemoryAddress.NULL : (Addressable) destFormatPOINTER.address()),
                        (Addressable) (destValue == null ? MemoryAddress.NULL : (Addressable) destValuePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (srcFormat != null) srcFormat.set(org.gstreamer.gst.Format.of(srcFormatPOINTER.get(Interop.valueLayout.C_INT, 0)));
                    if (srcValue != null) srcValue.set(srcValuePOINTER.get(Interop.valueLayout.C_LONG, 0));
                    if (destFormat != null) destFormat.set(org.gstreamer.gst.Format.of(destFormatPOINTER.get(Interop.valueLayout.C_INT, 0)));
                    if (destValue != null) destValue.set(destValuePOINTER.get(Interop.valueLayout.C_LONG, 0));
        }
    }
    
    /**
     * Parse a duration query answer. Write the format of the duration into {@code format},
     * and the value into {@code duration}, if the respective variables are non-{@code null}.
     * @param format the storage for the {@link Format} of the duration
     *     value, or {@code null}.
     * @param duration the storage for the total duration, or {@code null}.
     */
    public void parseDuration(@Nullable Out<org.gstreamer.gst.Format> format, Out<Long> duration) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment formatPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment durationPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            try {
                DowncallHandles.gst_query_parse_duration.invokeExact(
                        handle(),
                        (Addressable) (format == null ? MemoryAddress.NULL : (Addressable) formatPOINTER.address()),
                        (Addressable) (duration == null ? MemoryAddress.NULL : (Addressable) durationPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (format != null) format.set(org.gstreamer.gst.Format.of(formatPOINTER.get(Interop.valueLayout.C_INT, 0)));
                    if (duration != null) duration.set(durationPOINTER.get(Interop.valueLayout.C_LONG, 0));
        }
    }
    
    /**
     * Parse a latency query answer.
     * @param live storage for live or {@code null}
     * @param minLatency the storage for the min latency or {@code null}
     * @param maxLatency the storage for the max latency or {@code null}
     */
    public void parseLatency(Out<Boolean> live, @Nullable org.gstreamer.gst.ClockTime minLatency, @Nullable org.gstreamer.gst.ClockTime maxLatency) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment livePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment minLatencyPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment maxLatencyPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            try {
                DowncallHandles.gst_query_parse_latency.invokeExact(
                        handle(),
                        (Addressable) (live == null ? MemoryAddress.NULL : (Addressable) livePOINTER.address()),
                        (Addressable) (minLatency == null ? MemoryAddress.NULL : (Addressable) minLatencyPOINTER.address()),
                        (Addressable) (maxLatency == null ? MemoryAddress.NULL : (Addressable) maxLatencyPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (live != null) live.set(livePOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
                    if (minLatency != null) minLatency.setValue(minLatencyPOINTER.get(Interop.valueLayout.C_LONG, 0));
                    if (maxLatency != null) maxLatency.setValue(maxLatencyPOINTER.get(Interop.valueLayout.C_LONG, 0));
        }
    }
    
    /**
     * Parse the number of formats in the formats {@code query}.
     * @param nFormats the number of formats in this query.
     */
    public void parseNFormats(Out<Integer> nFormats) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment nFormatsPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gst_query_parse_n_formats.invokeExact(
                        handle(),
                        (Addressable) (nFormats == null ? MemoryAddress.NULL : (Addressable) nFormatsPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (nFormats != null) nFormats.set(nFormatsPOINTER.get(Interop.valueLayout.C_INT, 0));
        }
    }
    
    /**
     * Parse an available query and get the metadata API
     * at {@code index} of the metadata API array.
     * @param index position in the metadata API array to read
     * @param params API specific parameters
     * @return a {@link org.gtk.glib.Type} of the metadata API at {@code index}.
     */
    public org.gtk.glib.Type parseNthAllocationMeta(int index, @Nullable Out<org.gstreamer.gst.Structure> params) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment paramsPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            long RESULT;
            try {
                RESULT = (long) DowncallHandles.gst_query_parse_nth_allocation_meta.invokeExact(
                        handle(),
                        index,
                        (Addressable) (params == null ? MemoryAddress.NULL : (Addressable) paramsPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (params != null) params.set(org.gstreamer.gst.Structure.fromAddress.marshal(paramsPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
            return new org.gtk.glib.Type(RESULT);
        }
    }
    
    /**
     * Parse an available query and get the allocator and its params
     * at {@code index} of the allocator array.
     * @param index position in the allocator array to read
     * @param allocator variable to hold the result
     * @param params parameters for the allocator
     */
    public void parseNthAllocationParam(int index, @Nullable Out<org.gstreamer.gst.Allocator> allocator, @Nullable org.gstreamer.gst.AllocationParams params) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment allocatorPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.gst_query_parse_nth_allocation_param.invokeExact(
                        handle(),
                        index,
                        (Addressable) (allocator == null ? MemoryAddress.NULL : (Addressable) allocatorPOINTER.address()),
                        (Addressable) (params == null ? MemoryAddress.NULL : params.handle()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (allocator != null) allocator.set((org.gstreamer.gst.Allocator) Interop.register(allocatorPOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gstreamer.gst.Allocator.fromAddress).marshal(allocatorPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        }
    }
    
    /**
     * Get the pool parameters in {@code query}.
     * <p>
     * Unref {@code pool} with gst_object_unref() when it's not needed any more.
     * @param index index to parse
     * @param pool the {@link BufferPool}
     * @param size the buffer size
     * @param minBuffers the min buffers
     * @param maxBuffers the max buffers
     */
    public void parseNthAllocationPool(int index, @Nullable Out<org.gstreamer.gst.BufferPool> pool, Out<Integer> size, Out<Integer> minBuffers, Out<Integer> maxBuffers) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment poolPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemorySegment sizePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment minBuffersPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment maxBuffersPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gst_query_parse_nth_allocation_pool.invokeExact(
                        handle(),
                        index,
                        (Addressable) (pool == null ? MemoryAddress.NULL : (Addressable) poolPOINTER.address()),
                        (Addressable) (size == null ? MemoryAddress.NULL : (Addressable) sizePOINTER.address()),
                        (Addressable) (minBuffers == null ? MemoryAddress.NULL : (Addressable) minBuffersPOINTER.address()),
                        (Addressable) (maxBuffers == null ? MemoryAddress.NULL : (Addressable) maxBuffersPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (pool != null) pool.set((org.gstreamer.gst.BufferPool) Interop.register(poolPOINTER.get(Interop.valueLayout.ADDRESS, 0), org.gstreamer.gst.BufferPool.fromAddress).marshal(poolPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
                    if (size != null) size.set(sizePOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (minBuffers != null) minBuffers.set(minBuffersPOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (maxBuffers != null) maxBuffers.set(maxBuffersPOINTER.get(Interop.valueLayout.C_INT, 0));
        }
    }
    
    /**
     * Parse an available query and get the start and stop values stored
     * at the {@code index} of the buffered ranges array.
     * @param index position in the buffered-ranges array to read
     * @param start the start position to set, or {@code null}
     * @param stop the stop position to set, or {@code null}
     * @return a {@code gboolean} indicating if the parsing succeeded.
     */
    public boolean parseNthBufferingRange(int index, Out<Long> start, Out<Long> stop) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment startPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment stopPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_query_parse_nth_buffering_range.invokeExact(
                        handle(),
                        index,
                        (Addressable) (start == null ? MemoryAddress.NULL : (Addressable) startPOINTER.address()),
                        (Addressable) (stop == null ? MemoryAddress.NULL : (Addressable) stopPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (start != null) start.set(startPOINTER.get(Interop.valueLayout.C_LONG, 0));
                    if (stop != null) stop.set(stopPOINTER.get(Interop.valueLayout.C_LONG, 0));
            return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
        }
    }
    
    /**
     * Parse the format query and retrieve the {@code nth} format from it into
     * {@code format}. If the list contains less elements than {@code nth}, {@code format} will be
     * set to GST_FORMAT_UNDEFINED.
     * @param nth the nth format to retrieve.
     * @param format a pointer to store the nth format
     */
    public void parseNthFormat(int nth, @Nullable Out<org.gstreamer.gst.Format> format) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment formatPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gst_query_parse_nth_format.invokeExact(
                        handle(),
                        nth,
                        (Addressable) (format == null ? MemoryAddress.NULL : (Addressable) formatPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (format != null) format.set(org.gstreamer.gst.Format.of(formatPOINTER.get(Interop.valueLayout.C_INT, 0)));
        }
    }
    
    /**
     * Parse an available query and get the scheduling mode
     * at {@code index} of the scheduling modes array.
     * @param index position in the scheduling modes array to read
     * @return a {@link PadMode} of the scheduling mode at {@code index}.
     */
    public org.gstreamer.gst.PadMode parseNthSchedulingMode(int index) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_query_parse_nth_scheduling_mode.invokeExact(
                    handle(),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.PadMode.of(RESULT);
    }
    
    /**
     * Parse a position query, writing the format into {@code format}, and the position
     * into {@code cur}, if the respective parameters are non-{@code null}.
     * @param format the storage for the {@link Format} of the
     *     position values (may be {@code null})
     * @param cur the storage for the current position (may be {@code null})
     */
    public void parsePosition(@Nullable Out<org.gstreamer.gst.Format> format, Out<Long> cur) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment formatPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment curPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            try {
                DowncallHandles.gst_query_parse_position.invokeExact(
                        handle(),
                        (Addressable) (format == null ? MemoryAddress.NULL : (Addressable) formatPOINTER.address()),
                        (Addressable) (cur == null ? MemoryAddress.NULL : (Addressable) curPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (format != null) format.set(org.gstreamer.gst.Format.of(formatPOINTER.get(Interop.valueLayout.C_INT, 0)));
                    if (cur != null) cur.set(curPOINTER.get(Interop.valueLayout.C_LONG, 0));
        }
    }
    
    /**
     * Set the scheduling properties.
     * @param flags {@link SchedulingFlags}
     * @param minsize the suggested minimum size of pull requests
     * @param maxsize the suggested maximum size of pull requests:
     * @param align the suggested alignment of pull requests
     */
    public void parseScheduling(@Nullable Out<org.gstreamer.gst.SchedulingFlags> flags, Out<Integer> minsize, Out<Integer> maxsize, Out<Integer> align) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment flagsPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment minsizePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment maxsizePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment alignPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gst_query_parse_scheduling.invokeExact(
                        handle(),
                        (Addressable) (flags == null ? MemoryAddress.NULL : (Addressable) flagsPOINTER.address()),
                        (Addressable) (minsize == null ? MemoryAddress.NULL : (Addressable) minsizePOINTER.address()),
                        (Addressable) (maxsize == null ? MemoryAddress.NULL : (Addressable) maxsizePOINTER.address()),
                        (Addressable) (align == null ? MemoryAddress.NULL : (Addressable) alignPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (flags != null) flags.set(new org.gstreamer.gst.SchedulingFlags(flagsPOINTER.get(Interop.valueLayout.C_INT, 0)));
                    if (minsize != null) minsize.set(minsizePOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (maxsize != null) maxsize.set(maxsizePOINTER.get(Interop.valueLayout.C_INT, 0));
                    if (align != null) align.set(alignPOINTER.get(Interop.valueLayout.C_INT, 0));
        }
    }
    
    /**
     * Parse a seeking query, writing the format into {@code format}, and
     * other results into the passed parameters, if the respective parameters
     * are non-{@code null}
     * @param format the format to set for the {@code segment_start}
     *     and {@code segment_end} values, or {@code null}
     * @param seekable the seekable flag to set, or {@code null}
     * @param segmentStart the segment_start to set, or {@code null}
     * @param segmentEnd the segment_end to set, or {@code null}
     */
    public void parseSeeking(@Nullable Out<org.gstreamer.gst.Format> format, Out<Boolean> seekable, Out<Long> segmentStart, Out<Long> segmentEnd) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment formatPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment seekablePOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment segmentStartPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment segmentEndPOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            try {
                DowncallHandles.gst_query_parse_seeking.invokeExact(
                        handle(),
                        (Addressable) (format == null ? MemoryAddress.NULL : (Addressable) formatPOINTER.address()),
                        (Addressable) (seekable == null ? MemoryAddress.NULL : (Addressable) seekablePOINTER.address()),
                        (Addressable) (segmentStart == null ? MemoryAddress.NULL : (Addressable) segmentStartPOINTER.address()),
                        (Addressable) (segmentEnd == null ? MemoryAddress.NULL : (Addressable) segmentEndPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (format != null) format.set(org.gstreamer.gst.Format.of(formatPOINTER.get(Interop.valueLayout.C_INT, 0)));
                    if (seekable != null) seekable.set(seekablePOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
                    if (segmentStart != null) segmentStart.set(segmentStartPOINTER.get(Interop.valueLayout.C_LONG, 0));
                    if (segmentEnd != null) segmentEnd.set(segmentEndPOINTER.get(Interop.valueLayout.C_LONG, 0));
        }
    }
    
    /**
     * Parse a segment query answer. Any of {@code rate}, {@code format}, {@code start_value}, and
     * {@code stop_value} may be {@code null}, which will cause this value to be omitted.
     * <p>
     * See gst_query_set_segment() for an explanation of the function arguments.
     * @param rate the storage for the rate of the segment, or {@code null}
     * @param format the storage for the {@link Format} of the values,
     *     or {@code null}
     * @param startValue the storage for the start value, or {@code null}
     * @param stopValue the storage for the stop value, or {@code null}
     */
    public void parseSegment(Out<Double> rate, @Nullable Out<org.gstreamer.gst.Format> format, Out<Long> startValue, Out<Long> stopValue) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment ratePOINTER = SCOPE.allocate(Interop.valueLayout.C_DOUBLE);
            MemorySegment formatPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            MemorySegment startValuePOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            MemorySegment stopValuePOINTER = SCOPE.allocate(Interop.valueLayout.C_LONG);
            try {
                DowncallHandles.gst_query_parse_segment.invokeExact(
                        handle(),
                        (Addressable) (rate == null ? MemoryAddress.NULL : (Addressable) ratePOINTER.address()),
                        (Addressable) (format == null ? MemoryAddress.NULL : (Addressable) formatPOINTER.address()),
                        (Addressable) (startValue == null ? MemoryAddress.NULL : (Addressable) startValuePOINTER.address()),
                        (Addressable) (stopValue == null ? MemoryAddress.NULL : (Addressable) stopValuePOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (rate != null) rate.set(ratePOINTER.get(Interop.valueLayout.C_DOUBLE, 0));
                    if (format != null) format.set(org.gstreamer.gst.Format.of(formatPOINTER.get(Interop.valueLayout.C_INT, 0)));
                    if (startValue != null) startValue.set(startValuePOINTER.get(Interop.valueLayout.C_LONG, 0));
                    if (stopValue != null) stopValue.set(stopValuePOINTER.get(Interop.valueLayout.C_LONG, 0));
        }
    }
    
    /**
     * Parse an URI query, writing the URI into {@code uri} as a newly
     * allocated string, if the respective parameters are non-{@code null}.
     * Free the string with g_free() after usage.
     * @param uri the storage for the current URI
     *     (may be {@code null})
     */
    public void parseUri(@Nullable Out<java.lang.String> uri) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment uriPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.gst_query_parse_uri.invokeExact(
                        handle(),
                        (Addressable) (uri == null ? MemoryAddress.NULL : (Addressable) uriPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (uri != null) uri.set(Marshal.addressToString.marshal(uriPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        }
    }
    
    /**
     * Parse an URI query, writing the URI into {@code uri} as a newly
     * allocated string, if the respective parameters are non-{@code null}.
     * Free the string with g_free() after usage.
     * @param uri the storage for the redirect URI
     *     (may be {@code null})
     */
    public void parseUriRedirection(@Nullable Out<java.lang.String> uri) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment uriPOINTER = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            try {
                DowncallHandles.gst_query_parse_uri_redirection.invokeExact(
                        handle(),
                        (Addressable) (uri == null ? MemoryAddress.NULL : (Addressable) uriPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (uri != null) uri.set(Marshal.addressToString.marshal(uriPOINTER.get(Interop.valueLayout.ADDRESS, 0), null));
        }
    }
    
    /**
     * Parse an URI query, and set {@code permanent} to {@code true} if there is a redirection
     * and it should be considered permanent. If a redirection is permanent,
     * applications should update their internal storage of the URI, otherwise
     * they should make all future requests to the original URI.
     * @param permanent if the URI redirection is permanent
     *     (may be {@code null})
     */
    public void parseUriRedirectionPermanent(Out<Boolean> permanent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment permanentPOINTER = SCOPE.allocate(Interop.valueLayout.C_INT);
            try {
                DowncallHandles.gst_query_parse_uri_redirection_permanent.invokeExact(
                        handle(),
                        (Addressable) (permanent == null ? MemoryAddress.NULL : (Addressable) permanentPOINTER.address()));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
                    if (permanent != null) permanent.set(permanentPOINTER.get(Interop.valueLayout.C_INT, 0) != 0);
        }
    }
    
    /**
     * Remove the metadata API at {@code index} of the metadata API array.
     * @param index position in the metadata API array to remove
     */
    public void removeNthAllocationMeta(int index) {
        try {
            DowncallHandles.gst_query_remove_nth_allocation_meta.invokeExact(
                    handle(),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Remove the allocation param at {@code index} of the allocation param array.
     * @param index position in the allocation param array to remove
     */
    public void removeNthAllocationParam(int index) {
        try {
            DowncallHandles.gst_query_remove_nth_allocation_param.invokeExact(
                    handle(),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Remove the allocation pool at {@code index} of the allocation pool array.
     * @param index position in the allocation pool array to remove
     */
    public void removeNthAllocationPool(int index) {
        try {
            DowncallHandles.gst_query_remove_nth_allocation_pool.invokeExact(
                    handle(),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set {@code result} as the result for the {@code query}.
     * @param result the result to set
     */
    public void setAcceptCapsResult(boolean result) {
        try {
            DowncallHandles.gst_query_set_accept_caps_result.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(result, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the results of a bitrate query.  The nominal bitrate is the average
     * bitrate expected over the length of the stream as advertised in file
     * headers (or similar).
     * @param nominalBitrate the nominal bitrate in bits per second
     */
    public void setBitrate(int nominalBitrate) {
        try {
            DowncallHandles.gst_query_set_bitrate.invokeExact(
                    handle(),
                    nominalBitrate);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the percentage of buffered data. This is a value between 0 and 100.
     * The {@code busy} indicator is {@code true} when the buffering is in progress.
     * @param busy if buffering is busy
     * @param percent a buffering percent
     */
    public void setBufferingPercent(boolean busy, int percent) {
        try {
            DowncallHandles.gst_query_set_buffering_percent.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(busy, null).intValue(),
                    percent);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the available query result fields in {@code query}.
     * @param format the format to set for the {@code start} and {@code stop} values
     * @param start the start to set
     * @param stop the stop to set
     * @param estimatedTotal estimated total amount of download time remaining in
     *     milliseconds
     */
    public void setBufferingRange(org.gstreamer.gst.Format format, long start, long stop, long estimatedTotal) {
        try {
            DowncallHandles.gst_query_set_buffering_range.invokeExact(
                    handle(),
                    format.getValue(),
                    start,
                    stop,
                    estimatedTotal);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Configures the buffering stats values in {@code query}.
     * @param mode a buffering mode
     * @param avgIn the average input rate
     * @param avgOut the average output rate
     * @param bufferingLeft amount of buffering time left in milliseconds
     */
    public void setBufferingStats(org.gstreamer.gst.BufferingMode mode, int avgIn, int avgOut, long bufferingLeft) {
        try {
            DowncallHandles.gst_query_set_buffering_stats.invokeExact(
                    handle(),
                    mode.getValue(),
                    avgIn,
                    avgOut,
                    bufferingLeft);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the {@code caps} result in {@code query}.
     * @param caps A pointer to the caps
     */
    public void setCapsResult(org.gstreamer.gst.Caps caps) {
        try {
            DowncallHandles.gst_query_set_caps_result.invokeExact(
                    handle(),
                    caps.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Answer a context query by setting the requested context.
     * @param context the requested {@link Context}
     */
    public void setContext(org.gstreamer.gst.Context context) {
        try {
            DowncallHandles.gst_query_set_context.invokeExact(
                    handle(),
                    context.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Answer a convert query by setting the requested values.
     * @param srcFormat the source {@link Format}
     * @param srcValue the source value
     * @param destFormat the destination {@link Format}
     * @param destValue the destination value
     */
    public void setConvert(org.gstreamer.gst.Format srcFormat, long srcValue, org.gstreamer.gst.Format destFormat, long destValue) {
        try {
            DowncallHandles.gst_query_set_convert.invokeExact(
                    handle(),
                    srcFormat.getValue(),
                    srcValue,
                    destFormat.getValue(),
                    destValue);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Answer a duration query by setting the requested value in the given format.
     * @param format the {@link Format} for the duration
     * @param duration the duration of the stream
     */
    public void setDuration(org.gstreamer.gst.Format format, long duration) {
        try {
            DowncallHandles.gst_query_set_duration.invokeExact(
                    handle(),
                    format.getValue(),
                    duration);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the formats query result fields in {@code query}. The number of formats passed
     * must be equal to {@code n_formats}.
     * @param nFormats the number of formats to set.
     * @param varargs A number of {@code GstFormats} equal to {@code n_formats}.
     */
    public void setFormats(int nFormats, java.lang.Object... varargs) {
        try {
            DowncallHandles.gst_query_set_formats.invokeExact(
                    handle(),
                    nFormats,
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the formats query result fields in {@code query}. The number of formats passed
     * in the {@code formats} array must be equal to {@code n_formats}.
     * @param nFormats the number of formats to set.
     * @param formats an array containing {@code n_formats}
     *     {@code GstFormat} values.
     */
    public void setFormatsv(int nFormats, org.gstreamer.gst.Format[] formats) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_query_set_formatsv.invokeExact(
                        handle(),
                        nFormats,
                        Interop.allocateNativeArray(Enumeration.getValues(formats), false, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Answer a latency query by setting the requested values in the given format.
     * @param live if there is a live element upstream
     * @param minLatency the minimal latency of the upstream elements
     * @param maxLatency the maximal latency of the upstream elements
     */
    public void setLatency(boolean live, org.gstreamer.gst.ClockTime minLatency, org.gstreamer.gst.ClockTime maxLatency) {
        try {
            DowncallHandles.gst_query_set_latency.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(live, null).intValue(),
                    minLatency.getValue().longValue(),
                    maxLatency.getValue().longValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Parse an available query and get the allocator and its params
     * at {@code index} of the allocator array.
     * @param index position in the allocator array to set
     * @param allocator new allocator to set
     * @param params parameters for the allocator
     */
    public void setNthAllocationParam(int index, @Nullable org.gstreamer.gst.Allocator allocator, @Nullable org.gstreamer.gst.AllocationParams params) {
        try {
            DowncallHandles.gst_query_set_nth_allocation_param.invokeExact(
                    handle(),
                    index,
                    (Addressable) (allocator == null ? MemoryAddress.NULL : allocator.handle()),
                    (Addressable) (params == null ? MemoryAddress.NULL : params.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the pool parameters in {@code query}.
     * @param index index to modify
     * @param pool the {@link BufferPool}
     * @param size the buffer size
     * @param minBuffers the min buffers
     * @param maxBuffers the max buffers
     */
    public void setNthAllocationPool(int index, @Nullable org.gstreamer.gst.BufferPool pool, int size, int minBuffers, int maxBuffers) {
        try {
            DowncallHandles.gst_query_set_nth_allocation_pool.invokeExact(
                    handle(),
                    index,
                    (Addressable) (pool == null ? MemoryAddress.NULL : pool.handle()),
                    size,
                    minBuffers,
                    maxBuffers);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Answer a position query by setting the requested value in the given format.
     * @param format the requested {@link Format}
     * @param cur the position to set
     */
    public void setPosition(org.gstreamer.gst.Format format, long cur) {
        try {
            DowncallHandles.gst_query_set_position.invokeExact(
                    handle(),
                    format.getValue(),
                    cur);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the scheduling properties.
     * @param flags {@link SchedulingFlags}
     * @param minsize the suggested minimum size of pull requests
     * @param maxsize the suggested maximum size of pull requests
     * @param align the suggested alignment of pull requests
     */
    public void setScheduling(org.gstreamer.gst.SchedulingFlags flags, int minsize, int maxsize, int align) {
        try {
            DowncallHandles.gst_query_set_scheduling.invokeExact(
                    handle(),
                    flags.getValue(),
                    minsize,
                    maxsize,
                    align);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the seeking query result fields in {@code query}.
     * @param format the format to set for the {@code segment_start} and {@code segment_end} values
     * @param seekable the seekable flag to set
     * @param segmentStart the segment_start to set
     * @param segmentEnd the segment_end to set
     */
    public void setSeeking(org.gstreamer.gst.Format format, boolean seekable, long segmentStart, long segmentEnd) {
        try {
            DowncallHandles.gst_query_set_seeking.invokeExact(
                    handle(),
                    format.getValue(),
                    Marshal.booleanToInteger.marshal(seekable, null).intValue(),
                    segmentStart,
                    segmentEnd);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Answer a segment query by setting the requested values. The normal
     * playback segment of a pipeline is 0 to duration at the default rate of
     * 1.0. If a seek was performed on the pipeline to play a different
     * segment, this query will return the range specified in the last seek.
     * <p>
     * {@code start_value} and {@code stop_value} will respectively contain the configured
     * playback range start and stop values expressed in {@code format}.
     * The values are always between 0 and the duration of the media and
     * {@code start_value} &lt;= {@code stop_value}. {@code rate} will contain the playback rate. For
     * negative rates, playback will actually happen from {@code stop_value} to
     * {@code start_value}.
     * @param rate the rate of the segment
     * @param format the {@link Format} of the segment values ({@code start_value} and {@code stop_value})
     * @param startValue the start value
     * @param stopValue the stop value
     */
    public void setSegment(double rate, org.gstreamer.gst.Format format, long startValue, long stopValue) {
        try {
            DowncallHandles.gst_query_set_segment.invokeExact(
                    handle(),
                    rate,
                    format.getValue(),
                    startValue,
                    stopValue);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Answer a URI query by setting the requested URI.
     * @param uri the URI to set
     */
    public void setUri(java.lang.String uri) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_query_set_uri.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Answer a URI query by setting the requested URI redirection.
     * @param uri the URI to set
     */
    public void setUriRedirection(java.lang.String uri) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            try {
                DowncallHandles.gst_query_set_uri_redirection.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(uri, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    /**
     * Answer a URI query by setting the requested URI redirection
     * to permanent or not.
     * @param permanent whether the redirect is permanent or not
     */
    public void setUriRedirectionPermanent(boolean permanent) {
        try {
            DowncallHandles.gst_query_set_uri_redirection_permanent.invokeExact(
                    handle(),
                    Marshal.booleanToInteger.marshal(permanent, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the structure of a query. This method should be called with a writable
     * {@code query} so that the returned structure is guaranteed to be writable.
     * @return the {@link Structure} of the query. The structure is
     *     still owned by the query and will therefore be freed when the query
     *     is unreffed.
     */
    public org.gstreamer.gst.Structure writableStructure() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_query_writable_structure.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Structure.fromAddress.marshal(RESULT, null);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_query_new_accept_caps = Interop.downcallHandle(
                "gst_query_new_accept_caps",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_new_allocation = Interop.downcallHandle(
                "gst_query_new_allocation",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_query_new_bitrate = Interop.downcallHandle(
                "gst_query_new_bitrate",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_new_buffering = Interop.downcallHandle(
                "gst_query_new_buffering",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_query_new_caps = Interop.downcallHandle(
                "gst_query_new_caps",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_new_context = Interop.downcallHandle(
                "gst_query_new_context",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_new_convert = Interop.downcallHandle(
                "gst_query_new_convert",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_query_new_custom = Interop.downcallHandle(
                "gst_query_new_custom",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_new_drain = Interop.downcallHandle(
                "gst_query_new_drain",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_new_duration = Interop.downcallHandle(
                "gst_query_new_duration",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_query_new_formats = Interop.downcallHandle(
                "gst_query_new_formats",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_new_latency = Interop.downcallHandle(
                "gst_query_new_latency",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_new_position = Interop.downcallHandle(
                "gst_query_new_position",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_query_new_scheduling = Interop.downcallHandle(
                "gst_query_new_scheduling",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_new_seeking = Interop.downcallHandle(
                "gst_query_new_seeking",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_query_new_segment = Interop.downcallHandle(
                "gst_query_new_segment",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_query_new_uri = Interop.downcallHandle(
                "gst_query_new_uri",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_add_allocation_meta = Interop.downcallHandle(
                "gst_query_add_allocation_meta",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_add_allocation_param = Interop.downcallHandle(
                "gst_query_add_allocation_param",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_add_allocation_pool = Interop.downcallHandle(
                "gst_query_add_allocation_pool",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_query_add_buffering_range = Interop.downcallHandle(
                "gst_query_add_buffering_range",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_query_add_scheduling_mode = Interop.downcallHandle(
                "gst_query_add_scheduling_mode",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_query_find_allocation_meta = Interop.downcallHandle(
                "gst_query_find_allocation_meta",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_get_n_allocation_metas = Interop.downcallHandle(
                "gst_query_get_n_allocation_metas",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_get_n_allocation_params = Interop.downcallHandle(
                "gst_query_get_n_allocation_params",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_get_n_allocation_pools = Interop.downcallHandle(
                "gst_query_get_n_allocation_pools",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_get_n_buffering_ranges = Interop.downcallHandle(
                "gst_query_get_n_buffering_ranges",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_get_n_scheduling_modes = Interop.downcallHandle(
                "gst_query_get_n_scheduling_modes",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_get_structure = Interop.downcallHandle(
                "gst_query_get_structure",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_has_scheduling_mode = Interop.downcallHandle(
                "gst_query_has_scheduling_mode",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_query_has_scheduling_mode_with_flags = Interop.downcallHandle(
                "gst_query_has_scheduling_mode_with_flags",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_query_parse_accept_caps = Interop.downcallHandle(
                "gst_query_parse_accept_caps",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_parse_accept_caps_result = Interop.downcallHandle(
                "gst_query_parse_accept_caps_result",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_query_parse_allocation = Interop.downcallHandle(
                "gst_query_parse_allocation",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_query_parse_bitrate = Interop.downcallHandle(
                "gst_query_parse_bitrate",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_parse_buffering_percent = Interop.downcallHandle(
                "gst_query_parse_buffering_percent",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_parse_buffering_range = Interop.downcallHandle(
                "gst_query_parse_buffering_range",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_parse_buffering_stats = Interop.downcallHandle(
                "gst_query_parse_buffering_stats",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_parse_caps = Interop.downcallHandle(
                "gst_query_parse_caps",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_parse_caps_result = Interop.downcallHandle(
                "gst_query_parse_caps_result",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_parse_context = Interop.downcallHandle(
                "gst_query_parse_context",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_parse_context_type = Interop.downcallHandle(
                "gst_query_parse_context_type",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_parse_convert = Interop.downcallHandle(
                "gst_query_parse_convert",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_parse_duration = Interop.downcallHandle(
                "gst_query_parse_duration",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_parse_latency = Interop.downcallHandle(
                "gst_query_parse_latency",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_parse_n_formats = Interop.downcallHandle(
                "gst_query_parse_n_formats",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_parse_nth_allocation_meta = Interop.downcallHandle(
                "gst_query_parse_nth_allocation_meta",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_parse_nth_allocation_param = Interop.downcallHandle(
                "gst_query_parse_nth_allocation_param",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_parse_nth_allocation_pool = Interop.downcallHandle(
                "gst_query_parse_nth_allocation_pool",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_parse_nth_buffering_range = Interop.downcallHandle(
                "gst_query_parse_nth_buffering_range",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_parse_nth_format = Interop.downcallHandle(
                "gst_query_parse_nth_format",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_query_parse_nth_scheduling_mode = Interop.downcallHandle(
                "gst_query_parse_nth_scheduling_mode",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_query_parse_position = Interop.downcallHandle(
                "gst_query_parse_position",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_parse_scheduling = Interop.downcallHandle(
                "gst_query_parse_scheduling",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_parse_seeking = Interop.downcallHandle(
                "gst_query_parse_seeking",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_parse_segment = Interop.downcallHandle(
                "gst_query_parse_segment",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_parse_uri = Interop.downcallHandle(
                "gst_query_parse_uri",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_parse_uri_redirection = Interop.downcallHandle(
                "gst_query_parse_uri_redirection",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_parse_uri_redirection_permanent = Interop.downcallHandle(
                "gst_query_parse_uri_redirection_permanent",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_query_remove_nth_allocation_meta = Interop.downcallHandle(
                "gst_query_remove_nth_allocation_meta",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_query_remove_nth_allocation_param = Interop.downcallHandle(
                "gst_query_remove_nth_allocation_param",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_query_remove_nth_allocation_pool = Interop.downcallHandle(
                "gst_query_remove_nth_allocation_pool",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_query_set_accept_caps_result = Interop.downcallHandle(
                "gst_query_set_accept_caps_result",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_query_set_bitrate = Interop.downcallHandle(
                "gst_query_set_bitrate",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_query_set_buffering_percent = Interop.downcallHandle(
                "gst_query_set_buffering_percent",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_query_set_buffering_range = Interop.downcallHandle(
                "gst_query_set_buffering_range",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_query_set_buffering_stats = Interop.downcallHandle(
                "gst_query_set_buffering_stats",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_query_set_caps_result = Interop.downcallHandle(
                "gst_query_set_caps_result",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_set_context = Interop.downcallHandle(
                "gst_query_set_context",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_set_convert = Interop.downcallHandle(
                "gst_query_set_convert",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_query_set_duration = Interop.downcallHandle(
                "gst_query_set_duration",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_query_set_formats = Interop.downcallHandle(
                "gst_query_set_formats",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                true
        );
        
        private static final MethodHandle gst_query_set_formatsv = Interop.downcallHandle(
                "gst_query_set_formatsv",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_set_latency = Interop.downcallHandle(
                "gst_query_set_latency",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_query_set_nth_allocation_param = Interop.downcallHandle(
                "gst_query_set_nth_allocation_param",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_set_nth_allocation_pool = Interop.downcallHandle(
                "gst_query_set_nth_allocation_pool",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_query_set_position = Interop.downcallHandle(
                "gst_query_set_position",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_query_set_scheduling = Interop.downcallHandle(
                "gst_query_set_scheduling",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_query_set_seeking = Interop.downcallHandle(
                "gst_query_set_seeking",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_query_set_segment = Interop.downcallHandle(
                "gst_query_set_segment",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_DOUBLE, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG),
                false
        );
        
        private static final MethodHandle gst_query_set_uri = Interop.downcallHandle(
                "gst_query_set_uri",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_set_uri_redirection = Interop.downcallHandle(
                "gst_query_set_uri_redirection",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_query_set_uri_redirection_permanent = Interop.downcallHandle(
                "gst_query_set_uri_redirection_permanent",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle gst_query_writable_structure = Interop.downcallHandle(
                "gst_query_writable_structure",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link Query.Builder} object constructs a {@link Query} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link Query.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final Query struct;
        
        private Builder() {
            struct = Query.allocate();
        }
        
        /**
         * Finish building the {@link Query} struct.
         * @return A new instance of {@code Query} with the fields 
         *         that were set in the Builder object.
         */
        public Query build() {
            return struct;
        }
        
        /**
         * The parent {@link MiniObject} type
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
         * the {@link QueryType}
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setType(org.gstreamer.gst.QueryType type) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (type == null ? MemoryAddress.NULL : type.getValue()));
                return this;
            }
        }
    }
}
