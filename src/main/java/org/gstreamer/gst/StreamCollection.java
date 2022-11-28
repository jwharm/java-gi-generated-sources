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
public class StreamCollection extends org.gstreamer.gst.Object {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstStreamCollection";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gstreamer.gst.Object.getMemoryLayout().withName("object"),
        Interop.valueLayout.ADDRESS.withName("upstream_id"),
        Interop.valueLayout.ADDRESS.withName("priv"),
        MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Create a StreamCollection proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public StreamCollection(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to StreamCollection if its GType is a (or inherits from) "GstStreamCollection".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code StreamCollection} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GstStreamCollection", a ClassCastException will be thrown.
     */
    public static StreamCollection castFrom(org.gtk.gobject.Object gobject) {
            return new StreamCollection(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew(@Nullable java.lang.String upstreamId) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_stream_collection_new.invokeExact(
                    (Addressable) (upstreamId == null ? MemoryAddress.NULL : Interop.allocateNativeString(upstreamId)));
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
    public boolean addStream(@NotNull org.gstreamer.gst.Stream stream) {
        java.util.Objects.requireNonNull(stream, "Parameter 'stream' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_stream_collection_add_stream.invokeExact(
                    handle(),
                    stream.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        stream.yieldOwnership();
        return RESULT != 0;
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
        return new org.gstreamer.gst.Stream(RESULT, Ownership.NONE);
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
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
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
        void signalReceived(StreamCollection source, @NotNull org.gstreamer.gst.Stream object, @NotNull org.gtk.gobject.ParamSpec p0);
    }
    
    public Signal<StreamCollection.StreamNotify> onStreamNotify(@Nullable String detail, StreamCollection.StreamNotify handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("stream-notify" + ((detail == null || detail.isBlank()) ? "" : ("::" + detail))),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(StreamCollection.Callbacks.class, "signalStreamCollectionStreamNotify",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<StreamCollection.StreamNotify>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gstreamer.gst.Object.Build {
        
         /**
         * A {@link StreamCollection.Build} object constructs a {@link StreamCollection} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link StreamCollection} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link StreamCollection} using {@link StreamCollection#castFrom}.
         * @return A new instance of {@code StreamCollection} with the properties 
         *         that were set in the Build object.
         */
        public StreamCollection construct() {
            return StreamCollection.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    StreamCollection.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        public Build setUpstreamId(java.lang.String upstreamId) {
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
    
    private static class Callbacks {
        
        public static void signalStreamCollectionStreamNotify(MemoryAddress source, MemoryAddress object, MemoryAddress p0, MemoryAddress data) {
            int HASH = data.get(Interop.valueLayout.C_INT, 0);
            var HANDLER = (StreamCollection.StreamNotify) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new StreamCollection(source, Ownership.NONE), new org.gstreamer.gst.Stream(object, Ownership.NONE), new org.gtk.gobject.ParamSpec(p0, Ownership.NONE));
        }
    }
}
