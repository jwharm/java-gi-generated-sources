package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link AudioBaseSink} class. Override the vmethod to implement
 * functionality.
 */
public class AudioBaseSinkClass extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioBaseSinkClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.base.BaseSinkClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("create_ringbuffer"),
            Interop.valueLayout.ADDRESS.withName("payload"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AudioBaseSinkClass}
     * @return A new, uninitialized @{link AudioBaseSinkClass}
     */
    public static AudioBaseSinkClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AudioBaseSinkClass newInstance = new AudioBaseSinkClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.base.BaseSinkClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.base.BaseSinkClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.base.BaseSinkClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface CreateRingbufferCallback {
        org.gstreamer.audio.AudioRingBuffer run(org.gstreamer.audio.AudioBaseSink sink);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress sink) {
            var RESULT = run((org.gstreamer.audio.AudioBaseSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.audio.AudioBaseSink.fromAddress).marshal(sink, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CreateRingbufferCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_ringbuffer}
     * @param createRingbuffer The new value of the field {@code create_ringbuffer}
     */
    public void setCreateRingbuffer(CreateRingbufferCallback createRingbuffer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("create_ringbuffer"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createRingbuffer == null ? MemoryAddress.NULL : createRingbuffer.toCallback()));
    }
    
    @FunctionalInterface
    public interface PayloadCallback {
        org.gstreamer.gst.Buffer run(org.gstreamer.audio.AudioBaseSink sink, org.gstreamer.gst.Buffer buffer);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress sink, MemoryAddress buffer) {
            var RESULT = run((org.gstreamer.audio.AudioBaseSink) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(sink)), org.gstreamer.audio.AudioBaseSink.fromAddress).marshal(sink, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PayloadCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code payload}
     * @param payload The new value of the field {@code payload}
     */
    public void setPayload(PayloadCallback payload) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("payload"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (payload == null ? MemoryAddress.NULL : payload.toCallback()));
    }
    
    /**
     * Create a AudioBaseSinkClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AudioBaseSinkClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioBaseSinkClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AudioBaseSinkClass(input, ownership);
    
    /**
     * A {@link AudioBaseSinkClass.Builder} object constructs a {@link AudioBaseSinkClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AudioBaseSinkClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AudioBaseSinkClass struct;
        
        private Builder() {
            struct = AudioBaseSinkClass.allocate();
        }
        
         /**
         * Finish building the {@link AudioBaseSinkClass} struct.
         * @return A new instance of {@code AudioBaseSinkClass} with the fields 
         *         that were set in the Builder object.
         */
        public AudioBaseSinkClass build() {
            return struct;
        }
        
        /**
         * the parent class.
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gstreamer.base.BaseSinkClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setCreateRingbuffer(CreateRingbufferCallback createRingbuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_ringbuffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createRingbuffer == null ? MemoryAddress.NULL : createRingbuffer.toCallback()));
            return this;
        }
        
        public Builder setPayload(PayloadCallback payload) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("payload"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (payload == null ? MemoryAddress.NULL : payload.toCallback()));
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
