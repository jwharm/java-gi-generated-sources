package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Tracing modules will create instances of this class to announce the data they
 * will log and create a log formatter.
 * @version 1.8
 */
public class TracerRecord extends org.gstreamer.gst.GstObject {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstTracerRecord";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a TracerRecord proxy instance for the provided memory address.
     * <p>
     * Because TracerRecord is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TracerRecord(Addressable address, Ownership ownership) {
        super(address, Ownership.FULL);
        if (ownership == Ownership.NONE) {
            try {
                var RESULT = (MemoryAddress) Interop.g_object_ref_sink.invokeExact(address);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
        }
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TracerRecord> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TracerRecord(input, ownership);
    
    private static MemoryAddress constructNew(java.lang.String name, java.lang.String firstfield, java.lang.Object... varargs) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tracer_record_new.invokeExact(
                    Marshal.stringToAddress.marshal(name, null),
                    Marshal.stringToAddress.marshal(firstfield, null),
                    varargs);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new tracer record. The record instance can be used to efficiently
     * log entries using gst_tracer_record_log().
     * {@code null} terminator required after the last argument.
     * <p>
     * The {@code name} without the ".class" suffix will be used for the log records.
     * There must be fields for each value that gets logged where the field name is
     * the value name. The field must be a {@link Structure} describing the value. The
     * sub structure must contain a field called 'type' of {@code G_TYPE_GTYPE} that
     * contains the GType of the value. The resulting {@link TracerRecord} will take
     * ownership of the field structures.
     * <p>
     * The way to deal with optional values is to log an additional boolean before
     * the optional field, that if {@code true} signals that the optional field is valid
     * and {@code false} signals that the optional field should be ignored. One must still
     * log a placeholder value for the optional field though. Please also note, that
     * pointer type values must not be NULL - the underlying serialisation can not
     * handle that right now.
     * <p>
     * <blockquote>
     *  Please note that this is still under discussion and subject to change.
     * </blockquote>
     * @param name name of new record, must end on ".class".
     * @param firstfield name of first field to set
     * @param varargs additional arguments
     */
    public TracerRecord(java.lang.String name, java.lang.String firstfield, java.lang.Object... varargs) {
        super(constructNew(name, firstfield, varargs), Ownership.FULL);
    }
    
    /**
     * Serialzes the trace event into the log.
     * <p>
     * Right now this is using the gstreamer debug log with the level TRACE (7) and
     * the category "GST_TRACER".
     * <p>
     * <blockquote>
     *  Please note that this is still under discussion and subject to change.
     * </blockquote>
     * @param varargs the args as described in the spec-
     */
    public void log(java.lang.Object... varargs) {
        try {
            DowncallHandles.gst_tracer_record_log.invokeExact(
                    handle(),
                    varargs);
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
            RESULT = (long) DowncallHandles.gst_tracer_record_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link TracerRecord.Builder} object constructs a {@link TracerRecord} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link TracerRecord.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gstreamer.gst.GstObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link TracerRecord} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TracerRecord}.
         * @return A new instance of {@code TracerRecord} with the properties 
         *         that were set in the Builder object.
         */
        public TracerRecord build() {
            return (TracerRecord) org.gtk.gobject.GObject.newWithProperties(
                TracerRecord.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_tracer_record_new = Interop.downcallHandle(
            "gst_tracer_record_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gst_tracer_record_log = Interop.downcallHandle(
            "gst_tracer_record_log",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            true
        );
        
        private static final MethodHandle gst_tracer_record_get_type = Interop.downcallHandle(
            "gst_tracer_record_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
