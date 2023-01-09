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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        AudioAggregatorPadClass newInstance = new AudioAggregatorPadClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.base.AggregatorPadClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.base.AggregatorPadClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.base.AggregatorPadClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ConvertBufferCallback} callback.
     */
    @FunctionalInterface
    public interface ConvertBufferCallback {
    
        org.gstreamer.gst.Buffer run(org.gstreamer.audio.AudioAggregatorPad pad, org.gstreamer.audio.AudioInfo inInfo, org.gstreamer.audio.AudioInfo outInfo, org.gstreamer.gst.Buffer buffer);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress pad, MemoryAddress inInfo, MemoryAddress outInfo, MemoryAddress buffer) {
            var RESULT = run((org.gstreamer.audio.AudioAggregatorPad) Interop.register(pad, org.gstreamer.audio.AudioAggregatorPad.fromAddress).marshal(pad, null), org.gstreamer.audio.AudioInfo.fromAddress.marshal(inInfo, null), org.gstreamer.audio.AudioInfo.fromAddress.marshal(outInfo, null), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ConvertBufferCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code convert_buffer}
     * @param convertBuffer The new value of the field {@code convert_buffer}
     */
    public void setConvertBuffer(ConvertBufferCallback convertBuffer) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("convert_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (convertBuffer == null ? MemoryAddress.NULL : convertBuffer.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code UpdateConversionInfoCallback} callback.
     */
    @FunctionalInterface
    public interface UpdateConversionInfoCallback {
    
        void run(org.gstreamer.audio.AudioAggregatorPad pad);
        
        @ApiStatus.Internal default void upcall(MemoryAddress pad) {
            run((org.gstreamer.audio.AudioAggregatorPad) Interop.register(pad, org.gstreamer.audio.AudioAggregatorPad.fromAddress).marshal(pad, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UpdateConversionInfoCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code update_conversion_info}
     * @param updateConversionInfo The new value of the field {@code update_conversion_info}
     */
    public void setUpdateConversionInfo(UpdateConversionInfoCallback updateConversionInfo) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("update_conversion_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (updateConversionInfo == null ? MemoryAddress.NULL : updateConversionInfo.toCallback()));
        }
    }
    
    /**
     * Create a AudioAggregatorPadClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AudioAggregatorPadClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AudioAggregatorPadClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AudioAggregatorPadClass(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setConvertBuffer(ConvertBufferCallback convertBuffer) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("convert_buffer"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (convertBuffer == null ? MemoryAddress.NULL : convertBuffer.toCallback()));
                return this;
            }
        }
        
        public Builder setUpdateConversionInfo(UpdateConversionInfoCallback updateConversionInfo) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("update_conversion_info"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (updateConversionInfo == null ? MemoryAddress.NULL : updateConversionInfo.toCallback()));
                return this;
            }
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false, SCOPE)));
                return this;
            }
        }
    }
}
