package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VideoAggregatorPadClass extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoAggregatorPadClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.base.AggregatorPadClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("update_conversion_info"),
            Interop.valueLayout.ADDRESS.withName("prepare_frame"),
            Interop.valueLayout.ADDRESS.withName("clean_frame"),
            Interop.valueLayout.ADDRESS.withName("prepare_frame_start"),
            Interop.valueLayout.ADDRESS.withName("prepare_frame_finish"),
            MemoryLayout.sequenceLayout(18, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VideoAggregatorPadClass}
     * @return A new, uninitialized @{link VideoAggregatorPadClass}
     */
    public static VideoAggregatorPadClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoAggregatorPadClass newInstance = new VideoAggregatorPadClass(segment.address(), Ownership.NONE);
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
    public interface UpdateConversionInfoCallback {
        void run(org.gstreamer.video.VideoAggregatorPad pad);

        @ApiStatus.Internal default void upcall(MemoryAddress pad) {
            run((org.gstreamer.video.VideoAggregatorPad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pad)), org.gstreamer.video.VideoAggregatorPad.fromAddress).marshal(pad, Ownership.NONE));
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
    
    @FunctionalInterface
    public interface PrepareFrameCallback {
        boolean run(org.gstreamer.video.VideoAggregatorPad pad, org.gstreamer.video.VideoAggregator videoaggregator, org.gstreamer.gst.Buffer buffer, org.gstreamer.video.VideoFrame preparedFrame);

        @ApiStatus.Internal default int upcall(MemoryAddress pad, MemoryAddress videoaggregator, MemoryAddress buffer, MemoryAddress preparedFrame) {
            var RESULT = run((org.gstreamer.video.VideoAggregatorPad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pad)), org.gstreamer.video.VideoAggregatorPad.fromAddress).marshal(pad, Ownership.NONE), (org.gstreamer.video.VideoAggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(videoaggregator)), org.gstreamer.video.VideoAggregator.fromAddress).marshal(videoaggregator, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, Ownership.NONE), org.gstreamer.video.VideoFrame.fromAddress.marshal(preparedFrame, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PrepareFrameCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code prepare_frame}
     * @param prepareFrame The new value of the field {@code prepare_frame}
     */
    public void setPrepareFrame(PrepareFrameCallback prepareFrame) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("prepare_frame"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prepareFrame == null ? MemoryAddress.NULL : prepareFrame.toCallback()));
    }
    
    @FunctionalInterface
    public interface CleanFrameCallback {
        void run(org.gstreamer.video.VideoAggregatorPad pad, org.gstreamer.video.VideoAggregator videoaggregator, org.gstreamer.video.VideoFrame preparedFrame);

        @ApiStatus.Internal default void upcall(MemoryAddress pad, MemoryAddress videoaggregator, MemoryAddress preparedFrame) {
            run((org.gstreamer.video.VideoAggregatorPad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pad)), org.gstreamer.video.VideoAggregatorPad.fromAddress).marshal(pad, Ownership.NONE), (org.gstreamer.video.VideoAggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(videoaggregator)), org.gstreamer.video.VideoAggregator.fromAddress).marshal(videoaggregator, Ownership.NONE), org.gstreamer.video.VideoFrame.fromAddress.marshal(preparedFrame, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CleanFrameCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code clean_frame}
     * @param cleanFrame The new value of the field {@code clean_frame}
     */
    public void setCleanFrame(CleanFrameCallback cleanFrame) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("clean_frame"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cleanFrame == null ? MemoryAddress.NULL : cleanFrame.toCallback()));
    }
    
    @FunctionalInterface
    public interface PrepareFrameStartCallback {
        void run(org.gstreamer.video.VideoAggregatorPad pad, org.gstreamer.video.VideoAggregator videoaggregator, org.gstreamer.gst.Buffer buffer, org.gstreamer.video.VideoFrame preparedFrame);

        @ApiStatus.Internal default void upcall(MemoryAddress pad, MemoryAddress videoaggregator, MemoryAddress buffer, MemoryAddress preparedFrame) {
            run((org.gstreamer.video.VideoAggregatorPad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pad)), org.gstreamer.video.VideoAggregatorPad.fromAddress).marshal(pad, Ownership.NONE), (org.gstreamer.video.VideoAggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(videoaggregator)), org.gstreamer.video.VideoAggregator.fromAddress).marshal(videoaggregator, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, Ownership.NONE), org.gstreamer.video.VideoFrame.fromAddress.marshal(preparedFrame, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PrepareFrameStartCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code prepare_frame_start}
     * @param prepareFrameStart The new value of the field {@code prepare_frame_start}
     */
    public void setPrepareFrameStart(PrepareFrameStartCallback prepareFrameStart) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("prepare_frame_start"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prepareFrameStart == null ? MemoryAddress.NULL : prepareFrameStart.toCallback()));
    }
    
    @FunctionalInterface
    public interface PrepareFrameFinishCallback {
        void run(org.gstreamer.video.VideoAggregatorPad pad, org.gstreamer.video.VideoAggregator videoaggregator, org.gstreamer.video.VideoFrame preparedFrame);

        @ApiStatus.Internal default void upcall(MemoryAddress pad, MemoryAddress videoaggregator, MemoryAddress preparedFrame) {
            run((org.gstreamer.video.VideoAggregatorPad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pad)), org.gstreamer.video.VideoAggregatorPad.fromAddress).marshal(pad, Ownership.NONE), (org.gstreamer.video.VideoAggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(videoaggregator)), org.gstreamer.video.VideoAggregator.fromAddress).marshal(videoaggregator, Ownership.NONE), org.gstreamer.video.VideoFrame.fromAddress.marshal(preparedFrame, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PrepareFrameFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code prepare_frame_finish}
     * @param prepareFrameFinish The new value of the field {@code prepare_frame_finish}
     */
    public void setPrepareFrameFinish(PrepareFrameFinishCallback prepareFrameFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("prepare_frame_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prepareFrameFinish == null ? MemoryAddress.NULL : prepareFrameFinish.toCallback()));
    }
    
    /**
     * Get the value of the field {@code _gst_reserved}
     * @return The value of the field {@code _gst_reserved}
     */
    public java.lang.foreign.MemoryAddress[] getGstReserved() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getAddressArrayFrom(RESULT, 18);
    }
    
    /**
     * Change the value of the field {@code _gst_reserved}
     * @param GstReserved The new value of the field {@code _gst_reserved}
     */
    public void setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
    }
    
    /**
     * Create a VideoAggregatorPadClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VideoAggregatorPadClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoAggregatorPadClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VideoAggregatorPadClass(input, ownership);
    
    /**
     * A {@link VideoAggregatorPadClass.Builder} object constructs a {@link VideoAggregatorPadClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VideoAggregatorPadClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VideoAggregatorPadClass struct;
        
        private Builder() {
            struct = VideoAggregatorPadClass.allocate();
        }
        
         /**
         * Finish building the {@link VideoAggregatorPadClass} struct.
         * @return A new instance of {@code VideoAggregatorPadClass} with the fields 
         *         that were set in the Builder object.
         */
        public VideoAggregatorPadClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gstreamer.base.AggregatorPadClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setUpdateConversionInfo(UpdateConversionInfoCallback updateConversionInfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("update_conversion_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (updateConversionInfo == null ? MemoryAddress.NULL : updateConversionInfo.toCallback()));
            return this;
        }
        
        public Builder setPrepareFrame(PrepareFrameCallback prepareFrame) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prepare_frame"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prepareFrame == null ? MemoryAddress.NULL : prepareFrame.toCallback()));
            return this;
        }
        
        public Builder setCleanFrame(CleanFrameCallback cleanFrame) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("clean_frame"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cleanFrame == null ? MemoryAddress.NULL : cleanFrame.toCallback()));
            return this;
        }
        
        public Builder setPrepareFrameStart(PrepareFrameStartCallback prepareFrameStart) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prepare_frame_start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prepareFrameStart == null ? MemoryAddress.NULL : prepareFrameStart.toCallback()));
            return this;
        }
        
        public Builder setPrepareFrameFinish(PrepareFrameFinishCallback prepareFrameFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prepare_frame_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prepareFrameFinish == null ? MemoryAddress.NULL : prepareFrameFinish.toCallback()));
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
