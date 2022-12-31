package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A collection of {@link Stream} that are available.
 * <p>
 * A {@link StreamCollection} will be provided by elements that can make those
 * streams available. Applications can use the collection to show the user
 * what streams are available by using {@link StreamCollection#getStream}()
 * <p>
 * Once posted, a {@link StreamCollection} is immutable. Updates are made by sending
 * a new {@link StreamCollection} message, which may or may not share some of
 * the {@link Stream} objects from the collection it replaces. The receiver can check
 * the sender of a stream collection message to know which collection is
 * obsoleted.
 * <p>
 * Several elements in a pipeline can provide {@link StreamCollection}.
 * <p>
 * Applications can activate streams from a collection by using the
 * {@code GST_EVENT_SELECT_STREAMS} event on a pipeline, bin or element.
 * @version 1.10
 */
public class StreamCollection extends org.gstreamer.gst.GstObject {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstStreamCollection";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.GstObject.getMemoryLayout().withName("object"),
            Interop.valueLayout.ADDRESS.withName("upstream_id"),
            Interop.valueLayout.ADDRESS.withName("priv"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a StreamCollection proxy instance for the provided memory address.
     * <p>
     * Because StreamCollection is an {@code InitiallyUnowned} instance, when 
     * {@code ownership == Ownership.NONE}, the ownership is set to {@code FULL} 
     * and a call to {@code g_object_ref_sink()} is executed to sink the floating reference.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected StreamCollection(Addressable address, Ownership ownership) {
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
    public static final Marshal<Addressable, StreamCollection> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new StreamCollection(input, ownership);
    
    private static MemoryAddress constructNew(@Nullable java.lang.String upstreamId) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_stream_collection_new.invokeExact(
                    (Addressable) (upstreamId == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(upstreamId, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Create a new {@link StreamCollection}.
     * @param upstreamId The stream id of the parent stream
     */
    public StreamCollection(@Nullable java.lang.String upstreamId) {
        super(constructNew(upstreamId), Ownership.FULL);
    }
    
    /**
     * Add the given {@code stream} to the {@code collection}.
     * @param stream the {@link Stream} to add
     * @return {@code true} if the {@code stream} was properly added, else {@code false}
     */
    public boolean addStream(org.gstreamer.gst.Stream stream) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_stream_collection_add_stream.invokeExact(
                    handle(),
                    stream.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        stream.yieldOwnership();
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
    }
    
    /**
     * Get the number of streams this collection contains
     * @return The number of streams that {@code collection} contains
     */
    public int getSize() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_stream_collection_get_size.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Retrieve the {@link Stream} with index {@code index} from the collection.
     * <p>
     * The caller should not modify the returned {@link Stream}
     * @param index Index of the stream to retrieve
     * @return A {@link Stream}
     */
    public @Nullable org.gstreamer.gst.Stream getStream(int index) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_stream_collection_get_stream.invokeExact(
                    handle(),
                    index);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gstreamer.gst.Stream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gstreamer.gst.Stream.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Returns the upstream id of the {@code collection}.
     * @return The upstream id
     */
    public @Nullable java.lang.String getUpstreamId() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_stream_collection_get_upstream_id.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.gst_stream_collection_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface StreamNotify {
        void run(org.gstreamer.gst.Stream object, org.gtk.gobject.ParamSpec p0);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceStreamCollection, MemoryAddress object, MemoryAddress p0) {
            run((org.gstreamer.gst.Stream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(object)), org.gstreamer.gst.Stream.fromAddress).marshal(object, Ownership.NONE), (org.gtk.gobject.ParamSpec) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(p0)), org.gtk.gobject.ParamSpec.fromAddress).marshal(p0, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StreamNotify.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    public Signal<StreamCollection.StreamNotify> onStreamNotify(@Nullable String detail, StreamCollection.StreamNotify handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("stream-notify" + ((detail == null || detail.isBlank()) ? "" : ("::" + detail))), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link StreamCollection.Builder} object constructs a {@link StreamCollection} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link StreamCollection.Builder#build()}. 
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
         * Finish building the {@link StreamCollection} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link StreamCollection}.
         * @return A new instance of {@code StreamCollection} with the properties 
         *         that were set in the Builder object.
         */
        public StreamCollection build() {
            return (StreamCollection) org.gtk.gobject.GObject.newWithProperties(
                StreamCollection.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
        
        public Builder setUpstreamId(java.lang.String upstreamId) {
            names.add("upstream-id");
            values.add(org.gtk.gobject.Value.create(upstreamId));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_stream_collection_new = Interop.downcallHandle(
            "gst_stream_collection_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_stream_collection_add_stream = Interop.downcallHandle(
            "gst_stream_collection_add_stream",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_stream_collection_get_size = Interop.downcallHandle(
            "gst_stream_collection_get_size",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_stream_collection_get_stream = Interop.downcallHandle(
            "gst_stream_collection_get_stream",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle gst_stream_collection_get_upstream_id = Interop.downcallHandle(
            "gst_stream_collection_get_upstream_id",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_stream_collection_get_type = Interop.downcallHandle(
            "gst_stream_collection_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
