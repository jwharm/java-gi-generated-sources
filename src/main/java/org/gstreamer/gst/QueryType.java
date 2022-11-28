package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Standard predefined Query types
 */
public class QueryType extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "GstQueryType";
    
    /**
     * unknown query type
     */
    public static final QueryType UNKNOWN = new QueryType(0);
    
    /**
     * current position in stream
     */
    public static final QueryType POSITION = new QueryType(2563);
    
    /**
     * total duration of the stream
     */
    public static final QueryType DURATION = new QueryType(5123);
    
    /**
     * latency of stream
     */
    public static final QueryType LATENCY = new QueryType(7683);
    
    /**
     * current jitter of stream
     */
    public static final QueryType JITTER = new QueryType(10243);
    
    /**
     * current rate of the stream
     */
    public static final QueryType RATE = new QueryType(12803);
    
    /**
     * seeking capabilities
     */
    public static final QueryType SEEKING = new QueryType(15363);
    
    /**
     * segment start/stop positions
     */
    public static final QueryType SEGMENT = new QueryType(17923);
    
    /**
     * convert values between formats
     */
    public static final QueryType CONVERT = new QueryType(20483);
    
    /**
     * query supported formats for convert
     */
    public static final QueryType FORMATS = new QueryType(23043);
    
    /**
     * query available media for efficient seeking.
     */
    public static final QueryType BUFFERING = new QueryType(28163);
    
    /**
     * a custom application or element defined query.
     */
    public static final QueryType CUSTOM = new QueryType(30723);
    
    /**
     * query the URI of the source or sink.
     */
    public static final QueryType URI = new QueryType(33283);
    
    /**
     * the buffer allocation properties
     */
    public static final QueryType ALLOCATION = new QueryType(35846);
    
    /**
     * the scheduling properties
     */
    public static final QueryType SCHEDULING = new QueryType(38401);
    
    /**
     * the accept caps query
     */
    public static final QueryType ACCEPT_CAPS = new QueryType(40963);
    
    /**
     * the caps query
     */
    public static final QueryType CAPS = new QueryType(43523);
    
    /**
     * wait till all serialized data is consumed downstream
     */
    public static final QueryType DRAIN = new QueryType(46086);
    
    /**
     * query the pipeline-local context from
     *     downstream or upstream (since 1.2)
     */
    public static final QueryType CONTEXT = new QueryType(48643);
    
    /**
     * the bitrate query (since 1.16)
     */
    public static final QueryType BITRATE = new QueryType(51202);
    
    public QueryType(int value) {
        super(value);
    }
    
    /**
     * Gets the {@link QueryTypeFlags} associated with {@code type}.
     * @param type a {@link QueryType}
     * @return a {@link QueryTypeFlags}.
     */
    public static @NotNull org.gstreamer.gst.QueryTypeFlags getFlags(@NotNull org.gstreamer.gst.QueryType type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_query_type_get_flags.invokeExact(
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.QueryTypeFlags(RESULT);
    }
    
    /**
     * Get a printable name for the given query type. Do not modify or free.
     * @param type the query type
     * @return a reference to the static name of the query.
     */
    public static @NotNull java.lang.String getName(@NotNull org.gstreamer.gst.QueryType type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_query_type_get_name.invokeExact(
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get the unique quark for the given query type.
     * @param type the query type
     * @return the quark associated with the query type
     */
    public static @NotNull org.gtk.glib.Quark toQuark(@NotNull org.gstreamer.gst.QueryType type) {
        java.util.Objects.requireNonNull(type, "Parameter 'type' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_query_type_to_quark.invokeExact(
                    type.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_query_type_get_flags = Interop.downcallHandle(
            "gst_query_type_get_flags",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_query_type_get_name = Interop.downcallHandle(
            "gst_query_type_get_name",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_query_type_to_quark = Interop.downcallHandle(
            "gst_query_type_to_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
    }
}
