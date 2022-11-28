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
public class TracerRecord extends org.gstreamer.gst.Object {
    
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
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TracerRecord(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to TracerRecord if its GType is a (or inherits from) "GstTracerRecord".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TracerRecord} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstTracerRecord", a ClassCastException will be thrown.
     */
    public static TracerRecord castFrom(org.gtk.gobject.Object gobject) {
            return new TracerRecord(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew(@NotNull java.lang.String name, @NotNull java.lang.String firstfield, java.lang.Object... varargs) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(firstfield, "Parameter 'firstfield' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tracer_record_new.invokeExact(
                    Interop.allocateNativeString(name),
                    Interop.allocateNativeString(firstfield),
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
    public TracerRecord(@NotNull java.lang.String name, @NotNull java.lang.String firstfield, java.lang.Object... varargs) {
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
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_tracer_record_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Object.Build {
        
         /**
         * A {@link TracerRecord.Build} object constructs a {@link TracerRecord} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link TracerRecord} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link TracerRecord} using {@link TracerRecord#castFrom}.
         * @return A new instance of {@code TracerRecord} with the properties 
         *         that were set in the Build object.
         */
        public TracerRecord construct() {
            return TracerRecord.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    TracerRecord.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
