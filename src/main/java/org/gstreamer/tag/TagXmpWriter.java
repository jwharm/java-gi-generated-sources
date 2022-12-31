package org.gstreamer.tag;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This interface is implemented by elements that are able to do XMP serialization. Examples for
 * such elements are {@code jifmux} and {@code qtmux}.
 * <p>
 * Applications can use this interface to configure which XMP schemas should be used when serializing
 * tags into XMP. Schemas are represented by their names, a full list of the supported schemas can be
 * obtained from gst_tag_xmp_list_schemas(). By default, all schemas are used.
 */
public interface TagXmpWriter extends io.github.jwharm.javagi.Proxy {
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TagXmpWriterImpl> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TagXmpWriterImpl(input, ownership);
    
    /**
     * Adds all available XMP schemas to the configuration. Meaning that
     * all will be used.
     */
    default void addAllSchemas() {
        try {
            DowncallHandles.gst_tag_xmp_writer_add_all_schemas.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Adds {@code schema} to the list schemas
     * @param schema the schema to be added
     */
    default void addSchema(java.lang.String schema) {
        try {
            DowncallHandles.gst_tag_xmp_writer_add_schema.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(schema, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Checks if {@code schema} is going to be used
     * @param schema the schema to test
     * @return {@code true} if it is going to be used
     */
    default boolean hasSchema(java.lang.String schema) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_xmp_writer_has_schema.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(schema, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Removes all schemas from the list of schemas to use. Meaning that no
     * XMP will be generated.
     */
    default void removeAllSchemas() {
        try {
            DowncallHandles.gst_tag_xmp_writer_remove_all_schemas.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Removes a schema from the list of schemas to use. Nothing is done if
     * the schema wasn't in the list
     * @param schema the schema to remove
     */
    default void removeSchema(java.lang.String schema) {
        try {
            DowncallHandles.gst_tag_xmp_writer_remove_schema.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(schema, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    default org.gstreamer.gst.Buffer tagListToXmpBuffer(org.gstreamer.gst.TagList taglist, boolean readOnly) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_xmp_writer_tag_list_to_xmp_buffer.invokeExact(
                    handle(),
                    taglist.handle(),
                    Marshal.booleanToInteger.marshal(readOnly, null).intValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Buffer.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_tag_xmp_writer_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @ApiStatus.Internal
    static class DowncallHandles {
        
        @ApiStatus.Internal
        static final MethodHandle gst_tag_xmp_writer_add_all_schemas = Interop.downcallHandle(
            "gst_tag_xmp_writer_add_all_schemas",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_tag_xmp_writer_add_schema = Interop.downcallHandle(
            "gst_tag_xmp_writer_add_schema",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_tag_xmp_writer_has_schema = Interop.downcallHandle(
            "gst_tag_xmp_writer_has_schema",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_tag_xmp_writer_remove_all_schemas = Interop.downcallHandle(
            "gst_tag_xmp_writer_remove_all_schemas",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_tag_xmp_writer_remove_schema = Interop.downcallHandle(
            "gst_tag_xmp_writer_remove_schema",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_tag_xmp_writer_tag_list_to_xmp_buffer = Interop.downcallHandle(
            "gst_tag_xmp_writer_tag_list_to_xmp_buffer",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        @ApiStatus.Internal
        static final MethodHandle gst_tag_xmp_writer_get_type = Interop.downcallHandle(
            "gst_tag_xmp_writer_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
    
    class TagXmpWriterImpl extends org.gtk.gobject.GObject implements TagXmpWriter {
        
        static {
            GstTag.javagi$ensureInitialized();
        }
        
        public TagXmpWriterImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
