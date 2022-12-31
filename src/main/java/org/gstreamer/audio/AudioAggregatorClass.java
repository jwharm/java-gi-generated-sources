package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AudioAggregatorClass extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioAggregatorClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.base.AggregatorClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("create_output_buffer"),
            Interop.valueLayout.ADDRESS.withName("aggregate_one_buffer"),
            MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AudioAggregatorClass}
     * @return A new, uninitialized @{link AudioAggregatorClass}
     */
    public static AudioAggregatorClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AudioAggregatorClass newInstance = new AudioAggregatorClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.base.AggregatorClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.base.AggregatorClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.base.AggregatorClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface CreateOutputBufferCallback {
        org.gstreamer.gst.Buffer run(org.gstreamer.audio.AudioAggregator aagg, int numFrames);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress aagg, int numFrames) {
            var RESULT = run((org.gstreamer.audio.AudioAggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(aagg)), org.gstreamer.audio.AudioAggregator.fromAddress).marshal(aagg, Ownership.NONE), numFrames);
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CreateOutputBufferCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_output_buffer}
     * @param createOutputBuffer The new value of the field {@code create_output_buffer}
     */
    public void setCreateOutputBuffer(CreateOutputBufferCallback createOutputBuffer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("create_output_buffer"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createOutputBuffer == null ? MemoryAddress.NULL : createOutputBuffer.toCallback()));
    }
    
    @FunctionalInterface
    public interface AggregateOneBufferCallback {
        boolean run(org.gstreamer.audio.AudioAggregator aagg, org.gstreamer.audio.AudioAggregatorPad pad, org.gstreamer.gst.Buffer inbuf, int inOffset, org.gstreamer.gst.Buffer outbuf, int outOffset, int numFrames);

        @ApiStatus.Internal default int upcall(MemoryAddress aagg, MemoryAddress pad, MemoryAddress inbuf, int inOffset, MemoryAddress outbuf, int outOffset, int numFrames) {
            var RESULT = run((org.gstreamer.audio.AudioAggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(aagg)), org.gstreamer.audio.AudioAggregator.fromAddress).marshal(aagg, Ownership.NONE), (org.gstreamer.audio.AudioAggregatorPad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pad)), org.gstreamer.audio.AudioAggregatorPad.fromAddress).marshal(pad, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(inbuf, Ownership.NONE), inOffset, org.gstreamer.gst.Buffer.fromAddress.marshal(outbuf, Ownership.NONE), outOffset, numFrames);
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AggregateOneBufferCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code aggregate_one_buffer}
     * @param aggregateOneBuffer The new value of the field {@code aggregate_one_buffer}
     */
    public void setAggregateOneBuffer(AggregateOneBufferCallback aggregateOneBuffer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("aggregate_one_buffer"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (aggregateOneBuffer == null ? MemoryAddress.NULL : aggregateOneBuffer.toCallback()));
    }
    
    /**
     * Create a AudioAggregatorClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AudioAggregatorClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioAggregatorClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AudioAggregatorClass(input, ownership);
    
    /**
     * A {@link AudioAggregatorClass.Builder} object constructs a {@link AudioAggregatorClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AudioAggregatorClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AudioAggregatorClass struct;
        
        private Builder() {
            struct = AudioAggregatorClass.allocate();
        }
        
         /**
         * Finish building the {@link AudioAggregatorClass} struct.
         * @return A new instance of {@code AudioAggregatorClass} with the fields 
         *         that were set in the Builder object.
         */
        public AudioAggregatorClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gstreamer.base.AggregatorClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setCreateOutputBuffer(CreateOutputBufferCallback createOutputBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_output_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createOutputBuffer == null ? MemoryAddress.NULL : createOutputBuffer.toCallback()));
            return this;
        }
        
        public Builder setAggregateOneBuffer(AggregateOneBufferCallback aggregateOneBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("aggregate_one_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (aggregateOneBuffer == null ? MemoryAddress.NULL : aggregateOneBuffer.toCallback()));
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
