package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VideoAggregatorConvertPadClass extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoAggregatorConvertPadClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.video.VideoAggregatorPadClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("create_conversion_info"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VideoAggregatorConvertPadClass}
     * @return A new, uninitialized @{link VideoAggregatorConvertPadClass}
     */
    public static VideoAggregatorConvertPadClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoAggregatorConvertPadClass newInstance = new VideoAggregatorConvertPadClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.video.VideoAggregatorPadClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.video.VideoAggregatorPadClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.video.VideoAggregatorPadClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface CreateConversionInfoCallback {
        void run(org.gstreamer.video.VideoAggregatorConvertPad pad, org.gstreamer.video.VideoAggregator agg, org.gstreamer.video.VideoInfo conversionInfo);

        @ApiStatus.Internal default void upcall(MemoryAddress pad, MemoryAddress agg, MemoryAddress conversionInfo) {
            run((org.gstreamer.video.VideoAggregatorConvertPad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pad)), org.gstreamer.video.VideoAggregatorConvertPad.fromAddress).marshal(pad, Ownership.NONE), (org.gstreamer.video.VideoAggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(agg)), org.gstreamer.video.VideoAggregator.fromAddress).marshal(agg, Ownership.NONE), org.gstreamer.video.VideoInfo.fromAddress.marshal(conversionInfo, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CreateConversionInfoCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_conversion_info}
     * @param createConversionInfo The new value of the field {@code create_conversion_info}
     */
    public void setCreateConversionInfo(CreateConversionInfoCallback createConversionInfo) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("create_conversion_info"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createConversionInfo == null ? MemoryAddress.NULL : createConversionInfo.toCallback()));
    }
    
    /**
     * Create a VideoAggregatorConvertPadClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VideoAggregatorConvertPadClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoAggregatorConvertPadClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VideoAggregatorConvertPadClass(input, ownership);
    
    /**
     * A {@link VideoAggregatorConvertPadClass.Builder} object constructs a {@link VideoAggregatorConvertPadClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VideoAggregatorConvertPadClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VideoAggregatorConvertPadClass struct;
        
        private Builder() {
            struct = VideoAggregatorConvertPadClass.allocate();
        }
        
         /**
         * Finish building the {@link VideoAggregatorConvertPadClass} struct.
         * @return A new instance of {@code VideoAggregatorConvertPadClass} with the fields 
         *         that were set in the Builder object.
         */
        public VideoAggregatorConvertPadClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gstreamer.video.VideoAggregatorPadClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setCreateConversionInfo(CreateConversionInfoCallback createConversionInfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_conversion_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createConversionInfo == null ? MemoryAddress.NULL : createConversionInfo.toCallback()));
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
