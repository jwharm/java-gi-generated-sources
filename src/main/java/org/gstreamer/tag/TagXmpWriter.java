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
    
    /**
     * Cast object to TagXmpWriter if its GType is a (or inherits from) "GstTagXmpWriter".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code TagXmpWriter} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstTagXmpWriter", a ClassCastException will be thrown.
     */
    public static TagXmpWriter castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), TagXmpWriter.getType())) {
            return new TagXmpWriterImpl(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GstTagXmpWriter");
        }
    }
    
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
    default void addSchema(@NotNull java.lang.String schema) {
        java.util.Objects.requireNonNull(schema, "Parameter 'schema' must not be null");
        try {
            DowncallHandles.gst_tag_xmp_writer_add_schema.invokeExact(
                    handle(),
                    Interop.allocateNativeString(schema));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Checks if {@code schema} is going to be used
     * @param schema the schema to test
     * @return {@code true} if it is going to be used
     */
    default boolean hasSchema(@NotNull java.lang.String schema) {
        java.util.Objects.requireNonNull(schema, "Parameter 'schema' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_tag_xmp_writer_has_schema.invokeExact(
                    handle(),
                    Interop.allocateNativeString(schema));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
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
    default void removeSchema(@NotNull java.lang.String schema) {
        java.util.Objects.requireNonNull(schema, "Parameter 'schema' must not be null");
        try {
            DowncallHandles.gst_tag_xmp_writer_remove_schema.invokeExact(
                    handle(),
                    Interop.allocateNativeString(schema));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    default @NotNull org.gstreamer.gst.Buffer tagListToXmpBuffer(@NotNull org.gstreamer.gst.TagList taglist, boolean readOnly) {
        java.util.Objects.requireNonNull(taglist, "Parameter 'taglist' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_tag_xmp_writer_tag_list_to_xmp_buffer.invokeExact(
                    handle(),
                    taglist.handle(),
                    readOnly ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.Buffer(RESULT, Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
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
    
    class TagXmpWriterImpl extends org.gtk.gobject.Object implements TagXmpWriter {
        
        static {
            GstTag.javagi$ensureInitialized();
        }
        
        public TagXmpWriterImpl(Addressable address, Ownership ownership) {
            super(address, ownership);
        }
    }
}
