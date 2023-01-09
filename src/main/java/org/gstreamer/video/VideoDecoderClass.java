package org.gstreamer.video;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Subclasses can override any of the available virtual methods or not, as
 * needed. At minimum {@code handle_frame} needs to be overridden, and {@code set_format}
 * and likely as well.  If non-packetized input is supported or expected,
 * {@code parse} needs to be overridden as well.
 */
public class VideoDecoderClass extends Struct {
    
    static {
        GstVideo.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstVideoDecoderClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ElementClass.getMemoryLayout().withName("element_class"),
            Interop.valueLayout.ADDRESS.withName("open"),
            Interop.valueLayout.ADDRESS.withName("close"),
            Interop.valueLayout.ADDRESS.withName("start"),
            Interop.valueLayout.ADDRESS.withName("stop"),
            Interop.valueLayout.ADDRESS.withName("parse"),
            Interop.valueLayout.ADDRESS.withName("set_format"),
            Interop.valueLayout.ADDRESS.withName("reset"),
            Interop.valueLayout.ADDRESS.withName("finish"),
            Interop.valueLayout.ADDRESS.withName("handle_frame"),
            Interop.valueLayout.ADDRESS.withName("sink_event"),
            Interop.valueLayout.ADDRESS.withName("src_event"),
            Interop.valueLayout.ADDRESS.withName("negotiate"),
            Interop.valueLayout.ADDRESS.withName("decide_allocation"),
            Interop.valueLayout.ADDRESS.withName("propose_allocation"),
            Interop.valueLayout.ADDRESS.withName("flush"),
            Interop.valueLayout.ADDRESS.withName("sink_query"),
            Interop.valueLayout.ADDRESS.withName("src_query"),
            Interop.valueLayout.ADDRESS.withName("getcaps"),
            Interop.valueLayout.ADDRESS.withName("drain"),
            Interop.valueLayout.ADDRESS.withName("transform_meta"),
            Interop.valueLayout.ADDRESS.withName("handle_missing_data"),
            MemoryLayout.sequenceLayout(13, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VideoDecoderClass}
     * @return A new, uninitialized @{link VideoDecoderClass}
     */
    public static VideoDecoderClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VideoDecoderClass newInstance = new VideoDecoderClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code OpenCallback} callback.
     */
    @FunctionalInterface
    public interface OpenCallback {
    
        boolean run(org.gstreamer.video.VideoDecoder decoder);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) Interop.register(decoder, org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), OpenCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code open}
     * @param open The new value of the field {@code open}
     */
    public void setOpen(OpenCallback open) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("open"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (open == null ? MemoryAddress.NULL : open.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CloseCallback} callback.
     */
    @FunctionalInterface
    public interface CloseCallback {
    
        boolean run(org.gstreamer.video.VideoDecoder decoder);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) Interop.register(decoder, org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CloseCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code close}
     * @param close The new value of the field {@code close}
     */
    public void setClose(CloseCallback close) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (close == null ? MemoryAddress.NULL : close.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code StartCallback} callback.
     */
    @FunctionalInterface
    public interface StartCallback {
    
        boolean run(org.gstreamer.video.VideoDecoder decoder);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) Interop.register(decoder, org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), StartCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code start}
     * @param start The new value of the field {@code start}
     */
    public void setStart(StartCallback start) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (start == null ? MemoryAddress.NULL : start.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code StopCallback} callback.
     */
    @FunctionalInterface
    public interface StopCallback {
    
        boolean run(org.gstreamer.video.VideoDecoder decoder);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) Interop.register(decoder, org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), StopCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code stop}
     * @param stop The new value of the field {@code stop}
     */
    public void setStop(StopCallback stop) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (stop == null ? MemoryAddress.NULL : stop.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ParseCallback} callback.
     */
    @FunctionalInterface
    public interface ParseCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.video.VideoDecoder decoder, org.gstreamer.video.VideoCodecFrame frame, org.gstreamer.base.Adapter adapter, boolean atEos);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress frame, MemoryAddress adapter, int atEos) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) Interop.register(decoder, org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, null), org.gstreamer.video.VideoCodecFrame.fromAddress.marshal(frame, null), (org.gstreamer.base.Adapter) Interop.register(adapter, org.gstreamer.base.Adapter.fromAddress).marshal(adapter, null), Marshal.integerToBoolean.marshal(atEos, null).booleanValue());
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ParseCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code parse}
     * @param parse The new value of the field {@code parse}
     */
    public void setParse(ParseCallback parse) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parse"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parse == null ? MemoryAddress.NULL : parse.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetFormatCallback} callback.
     */
    @FunctionalInterface
    public interface SetFormatCallback {
    
        boolean run(org.gstreamer.video.VideoDecoder decoder, org.gstreamer.video.VideoCodecState state);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress state) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) Interop.register(decoder, org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, null), org.gstreamer.video.VideoCodecState.fromAddress.marshal(state, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetFormatCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_format}
     * @param setFormat The new value of the field {@code set_format}
     */
    public void setSetFormat(SetFormatCallback setFormat) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_format"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setFormat == null ? MemoryAddress.NULL : setFormat.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ResetCallback} callback.
     */
    @FunctionalInterface
    public interface ResetCallback {
    
        boolean run(org.gstreamer.video.VideoDecoder decoder, boolean hard);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder, int hard) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) Interop.register(decoder, org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, null), Marshal.integerToBoolean.marshal(hard, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ResetCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code reset}
     * @param reset The new value of the field {@code reset}
     */
    public void setReset(ResetCallback reset) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reset"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (reset == null ? MemoryAddress.NULL : reset.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code FinishCallback} callback.
     */
    @FunctionalInterface
    public interface FinishCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.video.VideoDecoder decoder);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) Interop.register(decoder, org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code finish}
     * @param finish The new value of the field {@code finish}
     */
    public void setFinish(FinishCallback finish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (finish == null ? MemoryAddress.NULL : finish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code HandleFrameCallback} callback.
     */
    @FunctionalInterface
    public interface HandleFrameCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.video.VideoDecoder decoder, org.gstreamer.video.VideoCodecFrame frame);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress frame) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) Interop.register(decoder, org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, null), org.gstreamer.video.VideoCodecFrame.fromAddress.marshal(frame, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), HandleFrameCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code handle_frame}
     * @param handleFrame The new value of the field {@code handle_frame}
     */
    public void setHandleFrame(HandleFrameCallback handleFrame) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle_frame"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (handleFrame == null ? MemoryAddress.NULL : handleFrame.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SinkEventCallback} callback.
     */
    @FunctionalInterface
    public interface SinkEventCallback {
    
        boolean run(org.gstreamer.video.VideoDecoder decoder, org.gstreamer.gst.Event event);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress event) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) Interop.register(decoder, org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, null), org.gstreamer.gst.Event.fromAddress.marshal(event, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SinkEventCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code sink_event}
     * @param sinkEvent The new value of the field {@code sink_event}
     */
    public void setSinkEvent(SinkEventCallback sinkEvent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sink_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (sinkEvent == null ? MemoryAddress.NULL : sinkEvent.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SrcEventCallback} callback.
     */
    @FunctionalInterface
    public interface SrcEventCallback {
    
        boolean run(org.gstreamer.video.VideoDecoder decoder, org.gstreamer.gst.Event event);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress event) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) Interop.register(decoder, org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, null), org.gstreamer.gst.Event.fromAddress.marshal(event, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SrcEventCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code src_event}
     * @param srcEvent The new value of the field {@code src_event}
     */
    public void setSrcEvent(SrcEventCallback srcEvent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("src_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (srcEvent == null ? MemoryAddress.NULL : srcEvent.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code NegotiateCallback} callback.
     */
    @FunctionalInterface
    public interface NegotiateCallback {
    
        boolean run(org.gstreamer.video.VideoDecoder decoder);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) Interop.register(decoder, org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), NegotiateCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code negotiate}
     * @param negotiate The new value of the field {@code negotiate}
     */
    public void setNegotiate(NegotiateCallback negotiate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("negotiate"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (negotiate == null ? MemoryAddress.NULL : negotiate.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DecideAllocationCallback} callback.
     */
    @FunctionalInterface
    public interface DecideAllocationCallback {
    
        boolean run(org.gstreamer.video.VideoDecoder decoder, org.gstreamer.gst.Query query);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress query) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) Interop.register(decoder, org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, null), org.gstreamer.gst.Query.fromAddress.marshal(query, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DecideAllocationCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code decide_allocation}
     * @param decideAllocation The new value of the field {@code decide_allocation}
     */
    public void setDecideAllocation(DecideAllocationCallback decideAllocation) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("decide_allocation"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (decideAllocation == null ? MemoryAddress.NULL : decideAllocation.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ProposeAllocationCallback} callback.
     */
    @FunctionalInterface
    public interface ProposeAllocationCallback {
    
        boolean run(org.gstreamer.video.VideoDecoder decoder, org.gstreamer.gst.Query query);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress query) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) Interop.register(decoder, org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, null), org.gstreamer.gst.Query.fromAddress.marshal(query, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ProposeAllocationCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code propose_allocation}
     * @param proposeAllocation The new value of the field {@code propose_allocation}
     */
    public void setProposeAllocation(ProposeAllocationCallback proposeAllocation) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("propose_allocation"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (proposeAllocation == null ? MemoryAddress.NULL : proposeAllocation.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code FlushCallback} callback.
     */
    @FunctionalInterface
    public interface FlushCallback {
    
        boolean run(org.gstreamer.video.VideoDecoder decoder);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) Interop.register(decoder, org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FlushCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code flush}
     * @param flush The new value of the field {@code flush}
     */
    public void setFlush(FlushCallback flush) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flush"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (flush == null ? MemoryAddress.NULL : flush.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SinkQueryCallback} callback.
     */
    @FunctionalInterface
    public interface SinkQueryCallback {
    
        boolean run(org.gstreamer.video.VideoDecoder decoder, org.gstreamer.gst.Query query);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress query) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) Interop.register(decoder, org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, null), org.gstreamer.gst.Query.fromAddress.marshal(query, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SinkQueryCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code sink_query}
     * @param sinkQuery The new value of the field {@code sink_query}
     */
    public void setSinkQuery(SinkQueryCallback sinkQuery) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sink_query"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (sinkQuery == null ? MemoryAddress.NULL : sinkQuery.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SrcQueryCallback} callback.
     */
    @FunctionalInterface
    public interface SrcQueryCallback {
    
        boolean run(org.gstreamer.video.VideoDecoder decoder, org.gstreamer.gst.Query query);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress query) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) Interop.register(decoder, org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, null), org.gstreamer.gst.Query.fromAddress.marshal(query, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SrcQueryCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code src_query}
     * @param srcQuery The new value of the field {@code src_query}
     */
    public void setSrcQuery(SrcQueryCallback srcQuery) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("src_query"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (srcQuery == null ? MemoryAddress.NULL : srcQuery.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetcapsCallback} callback.
     */
    @FunctionalInterface
    public interface GetcapsCallback {
    
        org.gstreamer.gst.Caps run(org.gstreamer.video.VideoDecoder decoder, org.gstreamer.gst.Caps filter);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress decoder, MemoryAddress filter) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) Interop.register(decoder, org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, null), org.gstreamer.gst.Caps.fromAddress.marshal(filter, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetcapsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code getcaps}
     * @param getcaps The new value of the field {@code getcaps}
     */
    public void setGetcaps(GetcapsCallback getcaps) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("getcaps"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getcaps == null ? MemoryAddress.NULL : getcaps.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DrainCallback} callback.
     */
    @FunctionalInterface
    public interface DrainCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.video.VideoDecoder decoder);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) Interop.register(decoder, org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DrainCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code drain}
     * @param drain The new value of the field {@code drain}
     */
    public void setDrain(DrainCallback drain) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("drain"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (drain == null ? MemoryAddress.NULL : drain.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code TransformMetaCallback} callback.
     */
    @FunctionalInterface
    public interface TransformMetaCallback {
    
        boolean run(org.gstreamer.video.VideoDecoder decoder, org.gstreamer.video.VideoCodecFrame frame, org.gstreamer.gst.Meta meta);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress frame, MemoryAddress meta) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) Interop.register(decoder, org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, null), org.gstreamer.video.VideoCodecFrame.fromAddress.marshal(frame, null), org.gstreamer.gst.Meta.fromAddress.marshal(meta, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TransformMetaCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code transform_meta}
     * @param transformMeta The new value of the field {@code transform_meta}
     */
    public void setTransformMeta(TransformMetaCallback transformMeta) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform_meta"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (transformMeta == null ? MemoryAddress.NULL : transformMeta.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code HandleMissingDataCallback} callback.
     */
    @FunctionalInterface
    public interface HandleMissingDataCallback {
    
        boolean run(org.gstreamer.video.VideoDecoder decoder, org.gstreamer.gst.ClockTime timestamp, org.gstreamer.gst.ClockTime duration);
        
        @ApiStatus.Internal default int upcall(MemoryAddress decoder, long timestamp, long duration) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) Interop.register(decoder, org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, null), new org.gstreamer.gst.ClockTime(timestamp), new org.gstreamer.gst.ClockTime(duration));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), HandleMissingDataCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code handle_missing_data}
     * @param handleMissingData The new value of the field {@code handle_missing_data}
     */
    public void setHandleMissingData(HandleMissingDataCallback handleMissingData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle_missing_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (handleMissingData == null ? MemoryAddress.NULL : handleMissingData.toCallback()));
        }
    }
    
    /**
     * Create a VideoDecoderClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VideoDecoderClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoDecoderClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VideoDecoderClass(input);
    
    /**
     * A {@link VideoDecoderClass.Builder} object constructs a {@link VideoDecoderClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VideoDecoderClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VideoDecoderClass struct;
        
        private Builder() {
            struct = VideoDecoderClass.allocate();
        }
        
        /**
         * Finish building the {@link VideoDecoderClass} struct.
         * @return A new instance of {@code VideoDecoderClass} with the fields 
         *         that were set in the Builder object.
         */
        public VideoDecoderClass build() {
            return struct;
        }
        
        public Builder setElementClass(org.gstreamer.gst.ElementClass elementClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("element_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (elementClass == null ? MemoryAddress.NULL : elementClass.handle()));
                return this;
            }
        }
        
        public Builder setOpen(OpenCallback open) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("open"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (open == null ? MemoryAddress.NULL : open.toCallback()));
                return this;
            }
        }
        
        public Builder setClose(CloseCallback close) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("close"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (close == null ? MemoryAddress.NULL : close.toCallback()));
                return this;
            }
        }
        
        public Builder setStart(StartCallback start) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("start"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (start == null ? MemoryAddress.NULL : start.toCallback()));
                return this;
            }
        }
        
        public Builder setStop(StopCallback stop) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (stop == null ? MemoryAddress.NULL : stop.toCallback()));
                return this;
            }
        }
        
        public Builder setParse(ParseCallback parse) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parse"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parse == null ? MemoryAddress.NULL : parse.toCallback()));
                return this;
            }
        }
        
        public Builder setSetFormat(SetFormatCallback setFormat) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_format"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setFormat == null ? MemoryAddress.NULL : setFormat.toCallback()));
                return this;
            }
        }
        
        public Builder setReset(ResetCallback reset) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("reset"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (reset == null ? MemoryAddress.NULL : reset.toCallback()));
                return this;
            }
        }
        
        public Builder setFinish(FinishCallback finish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (finish == null ? MemoryAddress.NULL : finish.toCallback()));
                return this;
            }
        }
        
        public Builder setHandleFrame(HandleFrameCallback handleFrame) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("handle_frame"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (handleFrame == null ? MemoryAddress.NULL : handleFrame.toCallback()));
                return this;
            }
        }
        
        public Builder setSinkEvent(SinkEventCallback sinkEvent) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("sink_event"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (sinkEvent == null ? MemoryAddress.NULL : sinkEvent.toCallback()));
                return this;
            }
        }
        
        public Builder setSrcEvent(SrcEventCallback srcEvent) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("src_event"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (srcEvent == null ? MemoryAddress.NULL : srcEvent.toCallback()));
                return this;
            }
        }
        
        public Builder setNegotiate(NegotiateCallback negotiate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("negotiate"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (negotiate == null ? MemoryAddress.NULL : negotiate.toCallback()));
                return this;
            }
        }
        
        public Builder setDecideAllocation(DecideAllocationCallback decideAllocation) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("decide_allocation"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (decideAllocation == null ? MemoryAddress.NULL : decideAllocation.toCallback()));
                return this;
            }
        }
        
        public Builder setProposeAllocation(ProposeAllocationCallback proposeAllocation) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("propose_allocation"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (proposeAllocation == null ? MemoryAddress.NULL : proposeAllocation.toCallback()));
                return this;
            }
        }
        
        public Builder setFlush(FlushCallback flush) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("flush"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (flush == null ? MemoryAddress.NULL : flush.toCallback()));
                return this;
            }
        }
        
        public Builder setSinkQuery(SinkQueryCallback sinkQuery) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("sink_query"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (sinkQuery == null ? MemoryAddress.NULL : sinkQuery.toCallback()));
                return this;
            }
        }
        
        public Builder setSrcQuery(SrcQueryCallback srcQuery) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("src_query"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (srcQuery == null ? MemoryAddress.NULL : srcQuery.toCallback()));
                return this;
            }
        }
        
        public Builder setGetcaps(GetcapsCallback getcaps) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("getcaps"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getcaps == null ? MemoryAddress.NULL : getcaps.toCallback()));
                return this;
            }
        }
        
        public Builder setDrain(DrainCallback drain) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("drain"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (drain == null ? MemoryAddress.NULL : drain.toCallback()));
                return this;
            }
        }
        
        public Builder setTransformMeta(TransformMetaCallback transformMeta) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("transform_meta"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (transformMeta == null ? MemoryAddress.NULL : transformMeta.toCallback()));
                return this;
            }
        }
        
        public Builder setHandleMissingData(HandleMissingDataCallback handleMissingData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("handle_missing_data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (handleMissingData == null ? MemoryAddress.NULL : handleMissingData.toCallback()));
                return this;
            }
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false, SCOPE)));
                return this;
            }
        }
    }
}
