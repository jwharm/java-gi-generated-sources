package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Standard predefined Query types
 */
public enum QueryType implements io.github.jwharm.javagi.Enumeration {
    /**
     * unknown query type
     */
    UNKNOWN(0),
    /**
     * current position in stream
     */
    POSITION(2563),
    /**
     * total duration of the stream
     */
    DURATION(5123),
    /**
     * latency of stream
     */
    LATENCY(7683),
    /**
     * current jitter of stream
     */
    JITTER(10243),
    /**
     * current rate of the stream
     */
    RATE(12803),
    /**
     * seeking capabilities
     */
    SEEKING(15363),
    /**
     * segment start/stop positions
     */
    SEGMENT(17923),
    /**
     * convert values between formats
     */
    CONVERT(20483),
    /**
     * query supported formats for convert
     */
    FORMATS(23043),
    /**
     * query available media for efficient seeking.
     */
    BUFFERING(28163),
    /**
     * a custom application or element defined query.
     */
    CUSTOM(30723),
    /**
     * query the URI of the source or sink.
     */
    URI(33283),
    /**
     * the buffer allocation properties
     */
    ALLOCATION(35846),
    /**
     * the scheduling properties
     */
    SCHEDULING(38401),
    /**
     * the accept caps query
     */
    ACCEPT_CAPS(40963),
    /**
     * the caps query
     */
    CAPS(43523),
    /**
     * wait till all serialized data is consumed downstream
     */
    DRAIN(46086),
    /**
     * query the pipeline-local context from
     *     downstream or upstream (since 1.2)
     */
    CONTEXT(48643),
    /**
     * the bitrate query (since 1.16)
     */
    BITRATE(51202);
    
    private static final java.lang.String C_TYPE_NAME = "GstQueryType";
    
    private final int value;
    QueryType(int value) {
        this.value = value;
    }
    
    @Override
    public int getValue() {
        return value;
    }
    
    public static QueryType of(int value) {
        return switch (value) {
            case 0 -> UNKNOWN;
            case 2563 -> POSITION;
            case 5123 -> DURATION;
            case 7683 -> LATENCY;
            case 10243 -> JITTER;
            case 12803 -> RATE;
            case 15363 -> SEEKING;
            case 17923 -> SEGMENT;
            case 20483 -> CONVERT;
            case 23043 -> FORMATS;
            case 28163 -> BUFFERING;
            case 30723 -> CUSTOM;
            case 33283 -> URI;
            case 35846 -> ALLOCATION;
            case 38401 -> SCHEDULING;
            case 40963 -> ACCEPT_CAPS;
            case 43523 -> CAPS;
            case 46086 -> DRAIN;
            case 48643 -> CONTEXT;
            case 51202 -> BITRATE;
            default -> throw new IllegalStateException("Unexpected value: " + value);
        };
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
