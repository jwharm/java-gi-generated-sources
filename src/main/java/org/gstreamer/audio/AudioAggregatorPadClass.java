package org.gstreamer.audio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AudioAggregatorPadClass extends Struct {
    
    static {
        GstAudio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAudioAggregatorPadClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.base.AggregatorPadClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("convert_buffer"),
            Interop.valueLayout.ADDRESS.withName("update_conversion_info"),
            MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AudioAggregatorPadClass}
     * @return A new, uninitialized @{link AudioAggregatorPadClass}
     */
    public static AudioAggregatorPadClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AudioAggregatorPadClass newInstance = new AudioAggregatorPadClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.base.AggregatorPadClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.base.AggregatorPadClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.base.AggregatorPadClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface ConvertBufferCallback {
        org.gstreamer.gst.Buffer run(org.gstreamer.audio.AudioAggregatorPad pad, org.gstreamer.audio.AudioInfo inInfo, org.gstreamer.audio.AudioInfo outInfo, org.gstreamer.gst.Buffer buffer);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress pad, MemoryAddress inInfo, MemoryAddress outInfo, MemoryAddress buffer) {
            var RESULT = run((org.gstreamer.audio.AudioAggregatorPad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pad)), org.gstreamer.audio.AudioAggregatorPad.fromAddress).marshal(pad, Ownership.NONE), org.gstreamer.audio.AudioInfo.fromAddress.marshal(inInfo, Ownership.NONE), org.gstreamer.audio.AudioInfo.fromAddress.marshal(outInfo, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ConvertBufferCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code convert_buffer}
     * @param convertBuffer The new value of the field {@code convert_buffer}
     */
    public void setConvertBuffer(ConvertBufferCallback convertBuffer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("convert_buffer"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (convertBuffer == null ? MemoryAddress.NULL : convertBuffer.toCallback()));
    }
    
    @FunctionalInterface
    public interface UpdateConversionInfoCallback {
        void run(org.gstreamer.audio.AudioAggregatorPad pad);

        @ApiStatus.Internal default void upcall(MemoryAddress pad) {
            run((org.gstreamer.audio.AudioAggregatorPad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pad)), org.gstreamer.audio.AudioAggregatorPad.fromAddress).marshal(pad, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UpdateConversionInfoCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code update_conversion_info}
     * @param updateConversionInfo The new value of the field {@code update_conversion_info}
     */
    public void setUpdateConversionInfo(UpdateConversionInfoCallback updateConversionInfo) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("update_conversion_info"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (updateConversionInfo == null ? MemoryAddress.NULL : updateConversionInfo.toCallback()));
    }
    
    /**
     * Create a AudioAggregatorPadClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AudioAggregatorPadClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioAggregatorPadClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AudioAggregatorPadClass(input, ownership);
    
    /**
     * A {@link AudioAggregatorPadClass.Builder} object constructs a {@link AudioAggregatorPadClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AudioAggregatorPadClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AudioAggregatorPadClass struct;
        
        private Builder() {
            struct = AudioAggregatorPadClass.allocate();
        }
        
         /**
         * Finish building the {@link AudioAggregatorPadClass} struct.
         * @return A new instance of {@code AudioAggregatorPadClass} with the fields 
         *         that were set in the Builder object.
         */
        public AudioAggregatorPadClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gstreamer.base.AggregatorPadClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setConvertBuffer(ConvertBufferCallback convertBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("convert_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (convertBuffer == null ? MemoryAddress.NULL : convertBuffer.toCallback()));
            return this;
        }
        
        public Builder setUpdateConversionInfo(UpdateConversionInfoCallback updateConversionInfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("update_conversion_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (updateConversionInfo == null ? MemoryAddress.NULL : updateConversionInfo.toCallback()));
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
