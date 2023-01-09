package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The video sink class structure. Derived classes should override the
 * {@code show_frame} virtual function.
 */
public class VideoSinkClass extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoSinkClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.base.BaseSinkClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("show_frame"),
            Interop.valueLayout.ADDRESS.withName("set_info"),
            MemoryLayout.sequenceLayout(3, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VideoSinkClass}
     * @return A new, uninitialized @{link VideoSinkClass}
     */
    public static VideoSinkClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VideoSinkClass newInstance = new VideoSinkClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.base.BaseSinkClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.base.BaseSinkClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.base.BaseSinkClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ShowFrameCallback} callback.
     */
    @FunctionalInterface
    public interface ShowFrameCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.video.VideoSink videoSink, org.gstreamer.gst.Buffer buf);
        
        @ApiStatus.Internal default int upcall(MemoryAddress videoSink, MemoryAddress buf) {
            var RESULT = run((org.gstreamer.video.VideoSink) Interop.register(videoSink, org.gstreamer.video.VideoSink.fromAddress).marshal(videoSink, null), org.gstreamer.gst.Buffer.fromAddress.marshal(buf, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ShowFrameCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code show_frame}
     * @param showFrame The new value of the field {@code show_frame}
     */
    public void setShowFrame(ShowFrameCallback showFrame) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("show_frame"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (showFrame == null ? MemoryAddress.NULL : showFrame.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetInfoCallback} callback.
     */
    @FunctionalInterface
    public interface SetInfoCallback {
    
        boolean run(org.gstreamer.video.VideoSink videoSink, org.gstreamer.gst.Caps caps, org.gstreamer.video.VideoInfo info);
        
        @ApiStatus.Internal default int upcall(MemoryAddress videoSink, MemoryAddress caps, MemoryAddress info) {
            var RESULT = run((org.gstreamer.video.VideoSink) Interop.register(videoSink, org.gstreamer.video.VideoSink.fromAddress).marshal(videoSink, null), org.gstreamer.gst.Caps.fromAddress.marshal(caps, null), org.gstreamer.video.VideoInfo.fromAddress.marshal(info, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetInfoCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_info}
     * @param setInfo The new value of the field {@code set_info}
     */
    public void setSetInfo(SetInfoCallback setInfo) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setInfo == null ? MemoryAddress.NULL : setInfo.toCallback()));
        }
    }
    
    /**
     * Create a VideoSinkClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VideoSinkClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoSinkClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VideoSinkClass(input);
    
    /**
     * A {@link VideoSinkClass.Builder} object constructs a {@link VideoSinkClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VideoSinkClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VideoSinkClass struct;
        
        private Builder() {
            struct = VideoSinkClass.allocate();
        }
        
        /**
         * Finish building the {@link VideoSinkClass} struct.
         * @return A new instance of {@code VideoSinkClass} with the fields 
         *         that were set in the Builder object.
         */
        public VideoSinkClass build() {
            return struct;
        }
        
        /**
         * the parent class structure
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gstreamer.base.BaseSinkClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setShowFrame(ShowFrameCallback showFrame) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("show_frame"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (showFrame == null ? MemoryAddress.NULL : showFrame.toCallback()));
                return this;
            }
        }
        
        public Builder setSetInfo(SetInfoCallback setInfo) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_info"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setInfo == null ? MemoryAddress.NULL : setInfo.toCallback()));
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
