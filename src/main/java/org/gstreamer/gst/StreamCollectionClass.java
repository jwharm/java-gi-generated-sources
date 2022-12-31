package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GstStreamCollection class structure
 */
public class StreamCollectionClass extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstStreamCollectionClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("stream_notify"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link StreamCollectionClass}
     * @return A new, uninitialized @{link StreamCollectionClass}
     */
    public static StreamCollectionClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        StreamCollectionClass newInstance = new StreamCollectionClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.gst.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface StreamNotifyCallback {
        void run(org.gstreamer.gst.StreamCollection collection, org.gstreamer.gst.Stream stream, org.gtk.gobject.ParamSpec pspec);

        @ApiStatus.Internal default void upcall(MemoryAddress collection, MemoryAddress stream, MemoryAddress pspec) {
            run((org.gstreamer.gst.StreamCollection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(collection)), org.gstreamer.gst.StreamCollection.fromAddress).marshal(collection, Ownership.NONE), (org.gstreamer.gst.Stream) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(stream)), org.gstreamer.gst.Stream.fromAddress).marshal(stream, Ownership.NONE), (org.gtk.gobject.ParamSpec) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pspec)), org.gtk.gobject.ParamSpec.fromAddress).marshal(pspec, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StreamNotifyCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code stream_notify}
     * @param streamNotify The new value of the field {@code stream_notify}
     */
    public void setStreamNotify(StreamNotifyCallback streamNotify) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("stream_notify"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (streamNotify == null ? MemoryAddress.NULL : streamNotify.toCallback()));
    }
    
    /**
     * Create a StreamCollectionClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected StreamCollectionClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, StreamCollectionClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new StreamCollectionClass(input, ownership);
    
    /**
     * A {@link StreamCollectionClass.Builder} object constructs a {@link StreamCollectionClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link StreamCollectionClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final StreamCollectionClass struct;
        
        private Builder() {
            struct = StreamCollectionClass.allocate();
        }
        
         /**
         * Finish building the {@link StreamCollectionClass} struct.
         * @return A new instance of {@code StreamCollectionClass} with the fields 
         *         that were set in the Builder object.
         */
        public StreamCollectionClass build() {
            return struct;
        }
        
        /**
         * the parent class structure
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setStreamNotify(StreamNotifyCallback streamNotify) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stream_notify"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (streamNotify == null ? MemoryAddress.NULL : streamNotify.toCallback()));
            return this;
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
