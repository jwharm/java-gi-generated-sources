package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A high-level object representing a single stream. It might be backed, or
 * not, by an actual flow of data in a pipeline ({@link Pad}).
 * <p>
 * A {@link Stream} does not care about data changes (such as decoding, encoding,
 * parsing,...) as long as the underlying data flow corresponds to the same
 * high-level flow (ex: a certain audio track).
 * <p>
 * A {@link Stream} contains all the information pertinent to a stream, such as
 * stream-id, tags, caps, type, ...
 * <p>
 * Elements can subclass a {@link Stream} for internal usage (to contain information
 * pertinent to streams of data).
 * @version 1.10
 */
public class Stream extends org.gstreamer.gst.GstObject {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstStream";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("object"),
            Interop.valueLayout.ADDRESS.withName("stream_id"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a Stream proxy instance for the provided memory address.
     * <p>
     * Because Stream is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Stream(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, Stream> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Stream(input, ownership);
    
    private static MemoryAddress constructNew(@Nullable java.lang.String streamId, @Nullable org.gstreamer.gst.Caps caps, org.gstreamer.gst.StreamType type, org.gstreamer.gst.StreamFlags flags) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_stream_new.invokeExact(
                    (Addressable) (streamId == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(streamId, null)),
                    (Addressable) (caps == null ? MemoryAddress.NULL : caps.handle()),
                    type.getValue(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new {@link Stream} for the given {@code stream_id}, {@code caps}, {@code type}
     * and {@code flags}
     * @param streamId the id for the new stream. If {@code null},
     * a new one will be automatically generated
     * @param caps the {@link Caps} of the stream
     * @param type the {@link StreamType} of the stream
     * @param flags the {@link StreamFlags} of the stream
     */
    public Stream(@Nullable java.lang.String streamId, @Nullable org.gstreamer.gst.Caps caps, org.gstreamer.gst.StreamType type, org.gstreamer.gst.StreamFlags flags) {
        super(constructNew(streamId, caps, type, flags), Ownership.FULL);
    }
    
    /**
     * Retrieve the caps for {@code stream}, if any
     * @return The {@link Caps} for {@code stream}
     */
    public @Nullable org.gstreamer.gst.Caps getCaps() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_stream_get_caps.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.Caps.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Retrieve the current stream flags for {@code stream}
     * @return The {@link StreamFlags} for {@code stream}
     */
    public org.gstreamer.gst.StreamFlags getStreamFlags() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_stream_get_stream_flags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.StreamFlags(RESULT);
    }
    
    /**
     * Returns the stream ID of {@code stream}.
     * @return the stream ID of {@code stream}. Only valid
     * during the lifetime of {@code stream}.
     */
    public @Nullable java.lang.String getStreamId() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_stream_get_stream_id.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Retrieve the stream type for {@code stream}
     * @return The {@link StreamType} for {@code stream}
     */
    public org.gstreamer.gst.StreamType getStreamType() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_stream_get_stream_type.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gstreamer.gst.StreamType(RESULT);
    }
    
    /**
     * Retrieve the tags for {@code stream}, if any
     * @return The {@link TagList} for {@code stream}
     */
    public @Nullable org.gstreamer.gst.TagList getTags() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_stream_get_tags.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.gst.TagList.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Set the caps for the {@link Stream}
     * @param caps a {@link Caps}
     */
    public void setCaps(@Nullable org.gstreamer.gst.Caps caps) {
        try {
            DowncallHandles.gst_stream_set_caps.invokeExact(
                    handle(),
                    (Addressable) (caps == null ? MemoryAddress.NULL : caps.handle()));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the {@code flags} for the {@code stream}.
     * @param flags the flags to set on {@code stream}
     */
    public void setStreamFlags(org.gstreamer.gst.StreamFlags flags) {
        try {
            DowncallHandles.gst_stream_set_stream_flags.invokeExact(
                    handle(),
                    flags.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the stream type of {@code stream}
     * @param streamType the type to set on {@code stream}
     */
    public void setStreamType(org.gstreamer.gst.StreamType streamType) {
        try {
            DowncallHandles.gst_stream_set_stream_type.invokeExact(
                    handle(),
                    streamType.getValue());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Set the tags for the {@link Stream}
     * @param tags a {@link TagList}
     */
    public void setTags(@Nullable org.gstreamer.gst.TagList tags) {
        try {
            DowncallHandles.gst_stream_set_tags.invokeExact(
                    handle(),
                    (Addressable) (tags == null ? MemoryAddress.NULL : tags.handle()));
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
            RESULT = (long) DowncallHandles.gst_stream_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link Stream.Builder} object constructs a {@link Stream} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link Stream.Builder#build()}. 
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
         * Finish building the {@link Stream} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link Stream}.
         * @return A new instance of {@code Stream} with the properties 
         *         that were set in the Builder object.
         */
        public Stream build() {
            return (Stream) org.gtk.gobject.GObject.newWithProperties(
                Stream.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        /**
         * The {@link Caps} of the {@link Stream}.
         * @param caps The value for the {@code caps} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setCaps(org.gstreamer.gst.Caps caps) {
            names.add("caps");
            values.add(org.gtk.gobject.Value.create(caps));
            return this;
        }
        
        public Builder setStreamFlags(org.gstreamer.gst.StreamFlags streamFlags) {
            names.add("stream-flags");
            values.add(org.gtk.gobject.Value.create(streamFlags));
            return this;
        }
        
        /**
         * The unique identifier of the {@link Stream}. Can only be set at construction
         * time.
         * @param streamId The value for the {@code stream-id} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStreamId(java.lang.String streamId) {
            names.add("stream-id");
            values.add(org.gtk.gobject.Value.create(streamId));
            return this;
        }
        
        /**
         * The {@link StreamType} of the {@link Stream}. Can only be set at construction time.
         * @param streamType The value for the {@code stream-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setStreamType(org.gstreamer.gst.StreamType streamType) {
            names.add("stream-type");
            values.add(org.gtk.gobject.Value.create(streamType));
            return this;
        }
        
        /**
         * The {@link TagList} of the {@link Stream}.
         * @param tags The value for the {@code tags} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTags(org.gstreamer.gst.TagList tags) {
            names.add("tags");
            values.add(org.gtk.gobject.Value.create(tags));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_stream_new = Interop.downcallHandle(
            "gst_stream_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_stream_get_caps = Interop.downcallHandle(
            "gst_stream_get_caps",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_stream_get_stream_flags = Interop.downcallHandle(
            "gst_stream_get_stream_flags",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_stream_get_stream_id = Interop.downcallHandle(
            "gst_stream_get_stream_id",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_stream_get_stream_type = Interop.downcallHandle(
            "gst_stream_get_stream_type",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_stream_get_tags = Interop.downcallHandle(
            "gst_stream_get_tags",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_stream_set_caps = Interop.downcallHandle(
            "gst_stream_set_caps",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_stream_set_stream_flags = Interop.downcallHandle(
            "gst_stream_set_stream_flags",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_stream_set_stream_type = Interop.downcallHandle(
            "gst_stream_set_stream_type",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_stream_set_tags = Interop.downcallHandle(
            "gst_stream_set_tags",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_stream_get_type = Interop.downcallHandle(
            "gst_stream_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
