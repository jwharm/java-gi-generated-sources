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
     * @param address   The memory address of the native object
     */
    protected StreamCollection(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, StreamCollection> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new StreamCollection(input);
    
    private static MemoryAddress constructNew(@Nullable java.lang.String upstreamId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.gst_stream_collection_new.invokeExact((Addressable) (upstreamId == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(upstreamId, SCOPE)));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return RESULT;
        }
    }
    
    /**
     * Create a new {@link StreamCollection}.
     * @param upstreamId The stream id of the parent stream
     */
    public StreamCollection(@Nullable java.lang.String upstreamId) {
        super(constructNew(upstreamId));
        this.takeOwnership();
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
            RESULT = (int) DowncallHandles.gst_stream_collection_get_size.invokeExact(handle());
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
        return (org.gstreamer.gst.Stream) Interop.register(RESULT, org.gstreamer.gst.Stream.fromAddress).marshal(RESULT, null);
    }
    
    /**
     * Returns the upstream id of the {@code collection}.
     * @return The upstream id
     */
    public @Nullable java.lang.String getUpstreamId() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_stream_collection_get_upstream_id.invokeExact(handle());
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
    
    /**
     * Functional interface declaration of the {@code StreamNotify} callback.
     */
    @FunctionalInterface
    public interface StreamNotify {
    
        void run(org.gstreamer.gst.Stream object, org.gtk.gobject.ParamSpec p0);
        
        @ApiStatus.Internal default void upcall(MemoryAddress sourceStreamCollection, MemoryAddress object, MemoryAddress p0) {
            run((org.gstreamer.gst.Stream) Interop.register(object, org.gstreamer.gst.Stream.fromAddress).marshal(object, null), (org.gtk.gobject.ParamSpec) Interop.register(p0, org.gtk.gobject.ParamSpec.fromAddress).marshal(p0, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), StreamNotify.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    public Signal<StreamCollection.StreamNotify> onStreamNotify(@Nullable String detail, StreamCollection.StreamNotify handler) {
        MemorySession SCOPE = MemorySession.openImplicit();
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("stream-notify" + ((detail == null || detail.isBlank()) ? "" : ("::" + detail)), SCOPE), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
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
        
        /**
         * Default constructor for a {@code Builder} object.
         */
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
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.gst_stream_collection_get_type != null;
    }
}
