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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VideoDecoderClass newInstance = new VideoDecoderClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @FunctionalInterface
    public interface OpenCallback {
        boolean run(org.gstreamer.video.VideoDecoder decoder);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(OpenCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code open}
     * @param open The new value of the field {@code open}
     */
    public void setOpen(OpenCallback open) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("open"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (open == null ? MemoryAddress.NULL : open.toCallback()));
    }
    
    @FunctionalInterface
    public interface CloseCallback {
        boolean run(org.gstreamer.video.VideoDecoder decoder);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CloseCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code close}
     * @param close The new value of the field {@code close}
     */
    public void setClose(CloseCallback close) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("close"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (close == null ? MemoryAddress.NULL : close.toCallback()));
    }
    
    @FunctionalInterface
    public interface StartCallback {
        boolean run(org.gstreamer.video.VideoDecoder decoder);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StartCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code start}
     * @param start The new value of the field {@code start}
     */
    public void setStart(StartCallback start) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (start == null ? MemoryAddress.NULL : start.toCallback()));
    }
    
    @FunctionalInterface
    public interface StopCallback {
        boolean run(org.gstreamer.video.VideoDecoder decoder);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StopCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code stop}
     * @param stop The new value of the field {@code stop}
     */
    public void setStop(StopCallback stop) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("stop"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stop == null ? MemoryAddress.NULL : stop.toCallback()));
    }
    
    @FunctionalInterface
    public interface ParseCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.video.VideoDecoder decoder, org.gstreamer.video.VideoCodecFrame frame, org.gstreamer.base.Adapter adapter, boolean atEos);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress frame, MemoryAddress adapter, int atEos) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, Ownership.NONE), org.gstreamer.video.VideoCodecFrame.fromAddress.marshal(frame, Ownership.NONE), (org.gstreamer.base.Adapter) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(adapter)), org.gstreamer.base.Adapter.fromAddress).marshal(adapter, Ownership.NONE), Marshal.integerToBoolean.marshal(atEos, null).booleanValue());
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ParseCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code parse}
     * @param parse The new value of the field {@code parse}
     */
    public void setParse(ParseCallback parse) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parse"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parse == null ? MemoryAddress.NULL : parse.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetFormatCallback {
        boolean run(org.gstreamer.video.VideoDecoder decoder, org.gstreamer.video.VideoCodecState state);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress state) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, Ownership.NONE), org.gstreamer.video.VideoCodecState.fromAddress.marshal(state, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetFormatCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_format}
     * @param setFormat The new value of the field {@code set_format}
     */
    public void setSetFormat(SetFormatCallback setFormat) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_format"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setFormat == null ? MemoryAddress.NULL : setFormat.toCallback()));
    }
    
    @FunctionalInterface
    public interface ResetCallback {
        boolean run(org.gstreamer.video.VideoDecoder decoder, boolean hard);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, int hard) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, Ownership.NONE), Marshal.integerToBoolean.marshal(hard, null).booleanValue());
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ResetCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code reset}
     * @param reset The new value of the field {@code reset}
     */
    public void setReset(ResetCallback reset) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("reset"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reset == null ? MemoryAddress.NULL : reset.toCallback()));
    }
    
    @FunctionalInterface
    public interface FinishCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.video.VideoDecoder decoder);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code finish}
     * @param finish The new value of the field {@code finish}
     */
    public void setFinish(FinishCallback finish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (finish == null ? MemoryAddress.NULL : finish.toCallback()));
    }
    
    @FunctionalInterface
    public interface HandleFrameCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.video.VideoDecoder decoder, org.gstreamer.video.VideoCodecFrame frame);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress frame) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, Ownership.NONE), org.gstreamer.video.VideoCodecFrame.fromAddress.marshal(frame, Ownership.FULL));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(HandleFrameCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code handle_frame}
     * @param handleFrame The new value of the field {@code handle_frame}
     */
    public void setHandleFrame(HandleFrameCallback handleFrame) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("handle_frame"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handleFrame == null ? MemoryAddress.NULL : handleFrame.toCallback()));
    }
    
    @FunctionalInterface
    public interface SinkEventCallback {
        boolean run(org.gstreamer.video.VideoDecoder decoder, org.gstreamer.gst.Event event);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress event) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, Ownership.NONE), org.gstreamer.gst.Event.fromAddress.marshal(event, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SinkEventCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code sink_event}
     * @param sinkEvent The new value of the field {@code sink_event}
     */
    public void setSinkEvent(SinkEventCallback sinkEvent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("sink_event"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sinkEvent == null ? MemoryAddress.NULL : sinkEvent.toCallback()));
    }
    
    @FunctionalInterface
    public interface SrcEventCallback {
        boolean run(org.gstreamer.video.VideoDecoder decoder, org.gstreamer.gst.Event event);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress event) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, Ownership.NONE), org.gstreamer.gst.Event.fromAddress.marshal(event, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SrcEventCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code src_event}
     * @param srcEvent The new value of the field {@code src_event}
     */
    public void setSrcEvent(SrcEventCallback srcEvent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("src_event"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (srcEvent == null ? MemoryAddress.NULL : srcEvent.toCallback()));
    }
    
    @FunctionalInterface
    public interface NegotiateCallback {
        boolean run(org.gstreamer.video.VideoDecoder decoder);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(NegotiateCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code negotiate}
     * @param negotiate The new value of the field {@code negotiate}
     */
    public void setNegotiate(NegotiateCallback negotiate) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("negotiate"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (negotiate == null ? MemoryAddress.NULL : negotiate.toCallback()));
    }
    
    @FunctionalInterface
    public interface DecideAllocationCallback {
        boolean run(org.gstreamer.video.VideoDecoder decoder, org.gstreamer.gst.Query query);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress query) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, Ownership.NONE), org.gstreamer.gst.Query.fromAddress.marshal(query, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DecideAllocationCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code decide_allocation}
     * @param decideAllocation The new value of the field {@code decide_allocation}
     */
    public void setDecideAllocation(DecideAllocationCallback decideAllocation) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("decide_allocation"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (decideAllocation == null ? MemoryAddress.NULL : decideAllocation.toCallback()));
    }
    
    @FunctionalInterface
    public interface ProposeAllocationCallback {
        boolean run(org.gstreamer.video.VideoDecoder decoder, org.gstreamer.gst.Query query);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress query) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, Ownership.NONE), org.gstreamer.gst.Query.fromAddress.marshal(query, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ProposeAllocationCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code propose_allocation}
     * @param proposeAllocation The new value of the field {@code propose_allocation}
     */
    public void setProposeAllocation(ProposeAllocationCallback proposeAllocation) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("propose_allocation"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (proposeAllocation == null ? MemoryAddress.NULL : proposeAllocation.toCallback()));
    }
    
    @FunctionalInterface
    public interface FlushCallback {
        boolean run(org.gstreamer.video.VideoDecoder decoder);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FlushCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code flush}
     * @param flush The new value of the field {@code flush}
     */
    public void setFlush(FlushCallback flush) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flush"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flush == null ? MemoryAddress.NULL : flush.toCallback()));
    }
    
    @FunctionalInterface
    public interface SinkQueryCallback {
        boolean run(org.gstreamer.video.VideoDecoder decoder, org.gstreamer.gst.Query query);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress query) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, Ownership.NONE), org.gstreamer.gst.Query.fromAddress.marshal(query, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SinkQueryCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code sink_query}
     * @param sinkQuery The new value of the field {@code sink_query}
     */
    public void setSinkQuery(SinkQueryCallback sinkQuery) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("sink_query"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sinkQuery == null ? MemoryAddress.NULL : sinkQuery.toCallback()));
    }
    
    @FunctionalInterface
    public interface SrcQueryCallback {
        boolean run(org.gstreamer.video.VideoDecoder decoder, org.gstreamer.gst.Query query);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress query) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, Ownership.NONE), org.gstreamer.gst.Query.fromAddress.marshal(query, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SrcQueryCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code src_query}
     * @param srcQuery The new value of the field {@code src_query}
     */
    public void setSrcQuery(SrcQueryCallback srcQuery) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("src_query"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (srcQuery == null ? MemoryAddress.NULL : srcQuery.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetcapsCallback {
        org.gstreamer.gst.Caps run(org.gstreamer.video.VideoDecoder decoder, org.gstreamer.gst.Caps filter);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress decoder, MemoryAddress filter) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, Ownership.NONE), org.gstreamer.gst.Caps.fromAddress.marshal(filter, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetcapsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code getcaps}
     * @param getcaps The new value of the field {@code getcaps}
     */
    public void setGetcaps(GetcapsCallback getcaps) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("getcaps"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getcaps == null ? MemoryAddress.NULL : getcaps.toCallback()));
    }
    
    @FunctionalInterface
    public interface DrainCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.video.VideoDecoder decoder);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DrainCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code drain}
     * @param drain The new value of the field {@code drain}
     */
    public void setDrain(DrainCallback drain) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("drain"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drain == null ? MemoryAddress.NULL : drain.toCallback()));
    }
    
    @FunctionalInterface
    public interface TransformMetaCallback {
        boolean run(org.gstreamer.video.VideoDecoder decoder, org.gstreamer.video.VideoCodecFrame frame, org.gstreamer.gst.Meta meta);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, MemoryAddress frame, MemoryAddress meta) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, Ownership.NONE), org.gstreamer.video.VideoCodecFrame.fromAddress.marshal(frame, Ownership.NONE), org.gstreamer.gst.Meta.fromAddress.marshal(meta, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(TransformMetaCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code transform_meta}
     * @param transformMeta The new value of the field {@code transform_meta}
     */
    public void setTransformMeta(TransformMetaCallback transformMeta) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("transform_meta"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transformMeta == null ? MemoryAddress.NULL : transformMeta.toCallback()));
    }
    
    @FunctionalInterface
    public interface HandleMissingDataCallback {
        boolean run(org.gstreamer.video.VideoDecoder decoder, org.gstreamer.gst.ClockTime timestamp, org.gstreamer.gst.ClockTime duration);

        @ApiStatus.Internal default int upcall(MemoryAddress decoder, long timestamp, long duration) {
            var RESULT = run((org.gstreamer.video.VideoDecoder) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(decoder)), org.gstreamer.video.VideoDecoder.fromAddress).marshal(decoder, Ownership.NONE), new org.gstreamer.gst.ClockTime(timestamp), new org.gstreamer.gst.ClockTime(duration));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(HandleMissingDataCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code handle_missing_data}
     * @param handleMissingData The new value of the field {@code handle_missing_data}
     */
    public void setHandleMissingData(HandleMissingDataCallback handleMissingData) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("handle_missing_data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handleMissingData == null ? MemoryAddress.NULL : handleMissingData.toCallback()));
    }
    
    /**
     * Create a VideoDecoderClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VideoDecoderClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VideoDecoderClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VideoDecoderClass(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("element_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (elementClass == null ? MemoryAddress.NULL : elementClass.handle()));
            return this;
        }
        
        public Builder setOpen(OpenCallback open) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("open"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (open == null ? MemoryAddress.NULL : open.toCallback()));
            return this;
        }
        
        public Builder setClose(CloseCallback close) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (close == null ? MemoryAddress.NULL : close.toCallback()));
            return this;
        }
        
        public Builder setStart(StartCallback start) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (start == null ? MemoryAddress.NULL : start.toCallback()));
            return this;
        }
        
        public Builder setStop(StopCallback stop) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stop == null ? MemoryAddress.NULL : stop.toCallback()));
            return this;
        }
        
        public Builder setParse(ParseCallback parse) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parse"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parse == null ? MemoryAddress.NULL : parse.toCallback()));
            return this;
        }
        
        public Builder setSetFormat(SetFormatCallback setFormat) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_format"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setFormat == null ? MemoryAddress.NULL : setFormat.toCallback()));
            return this;
        }
        
        public Builder setReset(ResetCallback reset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reset == null ? MemoryAddress.NULL : reset.toCallback()));
            return this;
        }
        
        public Builder setFinish(FinishCallback finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (finish == null ? MemoryAddress.NULL : finish.toCallback()));
            return this;
        }
        
        public Builder setHandleFrame(HandleFrameCallback handleFrame) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle_frame"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handleFrame == null ? MemoryAddress.NULL : handleFrame.toCallback()));
            return this;
        }
        
        public Builder setSinkEvent(SinkEventCallback sinkEvent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sink_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sinkEvent == null ? MemoryAddress.NULL : sinkEvent.toCallback()));
            return this;
        }
        
        public Builder setSrcEvent(SrcEventCallback srcEvent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("src_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (srcEvent == null ? MemoryAddress.NULL : srcEvent.toCallback()));
            return this;
        }
        
        public Builder setNegotiate(NegotiateCallback negotiate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("negotiate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (negotiate == null ? MemoryAddress.NULL : negotiate.toCallback()));
            return this;
        }
        
        public Builder setDecideAllocation(DecideAllocationCallback decideAllocation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("decide_allocation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (decideAllocation == null ? MemoryAddress.NULL : decideAllocation.toCallback()));
            return this;
        }
        
        public Builder setProposeAllocation(ProposeAllocationCallback proposeAllocation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("propose_allocation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (proposeAllocation == null ? MemoryAddress.NULL : proposeAllocation.toCallback()));
            return this;
        }
        
        public Builder setFlush(FlushCallback flush) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flush"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flush == null ? MemoryAddress.NULL : flush.toCallback()));
            return this;
        }
        
        public Builder setSinkQuery(SinkQueryCallback sinkQuery) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sink_query"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sinkQuery == null ? MemoryAddress.NULL : sinkQuery.toCallback()));
            return this;
        }
        
        public Builder setSrcQuery(SrcQueryCallback srcQuery) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("src_query"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (srcQuery == null ? MemoryAddress.NULL : srcQuery.toCallback()));
            return this;
        }
        
        public Builder setGetcaps(GetcapsCallback getcaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("getcaps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getcaps == null ? MemoryAddress.NULL : getcaps.toCallback()));
            return this;
        }
        
        public Builder setDrain(DrainCallback drain) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("drain"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (drain == null ? MemoryAddress.NULL : drain.toCallback()));
            return this;
        }
        
        public Builder setTransformMeta(TransformMetaCallback transformMeta) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("transform_meta"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (transformMeta == null ? MemoryAddress.NULL : transformMeta.toCallback()));
            return this;
        }
        
        public Builder setHandleMissingData(HandleMissingDataCallback handleMissingData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle_missing_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handleMissingData == null ? MemoryAddress.NULL : handleMissingData.toCallback()));
            return this;
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false)));
            return this;
        }
    }
}
