package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Subclasses can override any of the available virtual methods or not, as
 * needed. At minimum {@code handle_frame} needs to be overridden.
 */
public class BaseParseClass extends Struct {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstBaseParseClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ElementClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("start"),
            Interop.valueLayout.ADDRESS.withName("stop"),
            Interop.valueLayout.ADDRESS.withName("set_sink_caps"),
            Interop.valueLayout.ADDRESS.withName("handle_frame"),
            Interop.valueLayout.ADDRESS.withName("pre_push_frame"),
            Interop.valueLayout.ADDRESS.withName("convert"),
            Interop.valueLayout.ADDRESS.withName("sink_event"),
            Interop.valueLayout.ADDRESS.withName("src_event"),
            Interop.valueLayout.ADDRESS.withName("get_sink_caps"),
            Interop.valueLayout.ADDRESS.withName("detect"),
            Interop.valueLayout.ADDRESS.withName("sink_query"),
            Interop.valueLayout.ADDRESS.withName("src_query"),
            MemoryLayout.sequenceLayout(18, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link BaseParseClass}
     * @return A new, uninitialized @{link BaseParseClass}
     */
    public static BaseParseClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        BaseParseClass newInstance = new BaseParseClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ElementClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.gst.ElementClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.gst.ElementClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface StartCallback {
        boolean run(org.gstreamer.base.BaseParse parse);

        @ApiStatus.Internal default int upcall(MemoryAddress parse) {
            var RESULT = run((org.gstreamer.base.BaseParse) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(parse)), org.gstreamer.base.BaseParse.fromAddress).marshal(parse, Ownership.NONE));
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
        boolean run(org.gstreamer.base.BaseParse parse);

        @ApiStatus.Internal default int upcall(MemoryAddress parse) {
            var RESULT = run((org.gstreamer.base.BaseParse) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(parse)), org.gstreamer.base.BaseParse.fromAddress).marshal(parse, Ownership.NONE));
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
    public interface SetSinkCapsCallback {
        boolean run(org.gstreamer.base.BaseParse parse, org.gstreamer.gst.Caps caps);

        @ApiStatus.Internal default int upcall(MemoryAddress parse, MemoryAddress caps) {
            var RESULT = run((org.gstreamer.base.BaseParse) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(parse)), org.gstreamer.base.BaseParse.fromAddress).marshal(parse, Ownership.NONE), org.gstreamer.gst.Caps.fromAddress.marshal(caps, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetSinkCapsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_sink_caps}
     * @param setSinkCaps The new value of the field {@code set_sink_caps}
     */
    public void setSetSinkCaps(SetSinkCapsCallback setSinkCaps) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_sink_caps"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setSinkCaps == null ? MemoryAddress.NULL : setSinkCaps.toCallback()));
    }
    
    @FunctionalInterface
    public interface HandleFrameCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.BaseParse parse, org.gstreamer.base.BaseParseFrame frame, Out<Integer> skipsize);

        @ApiStatus.Internal default int upcall(MemoryAddress parse, MemoryAddress frame, MemoryAddress skipsize) {
            Out<Integer> skipsizeOUT = new Out<>(skipsize.get(Interop.valueLayout.C_INT, 0));
            var RESULT = run((org.gstreamer.base.BaseParse) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(parse)), org.gstreamer.base.BaseParse.fromAddress).marshal(parse, Ownership.NONE), org.gstreamer.base.BaseParseFrame.fromAddress.marshal(frame, Ownership.NONE), skipsizeOUT);
            skipsize.set(Interop.valueLayout.C_INT, 0, skipsizeOUT.get());
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
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
    public interface PrePushFrameCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.BaseParse parse, org.gstreamer.base.BaseParseFrame frame);

        @ApiStatus.Internal default int upcall(MemoryAddress parse, MemoryAddress frame) {
            var RESULT = run((org.gstreamer.base.BaseParse) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(parse)), org.gstreamer.base.BaseParse.fromAddress).marshal(parse, Ownership.NONE), org.gstreamer.base.BaseParseFrame.fromAddress.marshal(frame, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PrePushFrameCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code pre_push_frame}
     * @param prePushFrame The new value of the field {@code pre_push_frame}
     */
    public void setPrePushFrame(PrePushFrameCallback prePushFrame) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pre_push_frame"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prePushFrame == null ? MemoryAddress.NULL : prePushFrame.toCallback()));
    }
    
    @FunctionalInterface
    public interface ConvertCallback {
        boolean run(org.gstreamer.base.BaseParse parse, org.gstreamer.gst.Format srcFormat, long srcValue, org.gstreamer.gst.Format destFormat, PointerLong destValue);

        @ApiStatus.Internal default int upcall(MemoryAddress parse, int srcFormat, long srcValue, int destFormat, MemoryAddress destValue) {
            var RESULT = run((org.gstreamer.base.BaseParse) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(parse)), org.gstreamer.base.BaseParse.fromAddress).marshal(parse, Ownership.NONE), org.gstreamer.gst.Format.of(srcFormat), srcValue, org.gstreamer.gst.Format.of(destFormat), new PointerLong(destValue));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ConvertCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code convert}
     * @param convert The new value of the field {@code convert}
     */
    public void setConvert(ConvertCallback convert) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("convert"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (convert == null ? MemoryAddress.NULL : convert.toCallback()));
    }
    
    @FunctionalInterface
    public interface SinkEventCallback {
        boolean run(org.gstreamer.base.BaseParse parse, org.gstreamer.gst.Event event);

        @ApiStatus.Internal default int upcall(MemoryAddress parse, MemoryAddress event) {
            var RESULT = run((org.gstreamer.base.BaseParse) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(parse)), org.gstreamer.base.BaseParse.fromAddress).marshal(parse, Ownership.NONE), org.gstreamer.gst.Event.fromAddress.marshal(event, Ownership.NONE));
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
        boolean run(org.gstreamer.base.BaseParse parse, org.gstreamer.gst.Event event);

        @ApiStatus.Internal default int upcall(MemoryAddress parse, MemoryAddress event) {
            var RESULT = run((org.gstreamer.base.BaseParse) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(parse)), org.gstreamer.base.BaseParse.fromAddress).marshal(parse, Ownership.NONE), org.gstreamer.gst.Event.fromAddress.marshal(event, Ownership.NONE));
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
    public interface GetSinkCapsCallback {
        org.gstreamer.gst.Caps run(org.gstreamer.base.BaseParse parse, org.gstreamer.gst.Caps filter);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress parse, MemoryAddress filter) {
            var RESULT = run((org.gstreamer.base.BaseParse) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(parse)), org.gstreamer.base.BaseParse.fromAddress).marshal(parse, Ownership.NONE), org.gstreamer.gst.Caps.fromAddress.marshal(filter, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetSinkCapsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_sink_caps}
     * @param getSinkCaps The new value of the field {@code get_sink_caps}
     */
    public void setGetSinkCaps(GetSinkCapsCallback getSinkCaps) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_sink_caps"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSinkCaps == null ? MemoryAddress.NULL : getSinkCaps.toCallback()));
    }
    
    @FunctionalInterface
    public interface DetectCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.BaseParse parse, org.gstreamer.gst.Buffer buffer);

        @ApiStatus.Internal default int upcall(MemoryAddress parse, MemoryAddress buffer) {
            var RESULT = run((org.gstreamer.base.BaseParse) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(parse)), org.gstreamer.base.BaseParse.fromAddress).marshal(parse, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DetectCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code detect}
     * @param detect The new value of the field {@code detect}
     */
    public void setDetect(DetectCallback detect) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("detect"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (detect == null ? MemoryAddress.NULL : detect.toCallback()));
    }
    
    @FunctionalInterface
    public interface SinkQueryCallback {
        boolean run(org.gstreamer.base.BaseParse parse, org.gstreamer.gst.Query query);

        @ApiStatus.Internal default int upcall(MemoryAddress parse, MemoryAddress query) {
            var RESULT = run((org.gstreamer.base.BaseParse) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(parse)), org.gstreamer.base.BaseParse.fromAddress).marshal(parse, Ownership.NONE), org.gstreamer.gst.Query.fromAddress.marshal(query, Ownership.NONE));
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
        boolean run(org.gstreamer.base.BaseParse parse, org.gstreamer.gst.Query query);

        @ApiStatus.Internal default int upcall(MemoryAddress parse, MemoryAddress query) {
            var RESULT = run((org.gstreamer.base.BaseParse) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(parse)), org.gstreamer.base.BaseParse.fromAddress).marshal(parse, Ownership.NONE), org.gstreamer.gst.Query.fromAddress.marshal(query, Ownership.NONE));
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
    
    /**
     * Create a BaseParseClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected BaseParseClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, BaseParseClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new BaseParseClass(input, ownership);
    
    /**
     * A {@link BaseParseClass.Builder} object constructs a {@link BaseParseClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link BaseParseClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final BaseParseClass struct;
        
        private Builder() {
            struct = BaseParseClass.allocate();
        }
        
         /**
         * Finish building the {@link BaseParseClass} struct.
         * @return A new instance of {@code BaseParseClass} with the fields 
         *         that were set in the Builder object.
         */
        public BaseParseClass build() {
            return struct;
        }
        
        /**
         * the parent class
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gstreamer.gst.ElementClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
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
        
        public Builder setSetSinkCaps(SetSinkCapsCallback setSinkCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_sink_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setSinkCaps == null ? MemoryAddress.NULL : setSinkCaps.toCallback()));
            return this;
        }
        
        public Builder setHandleFrame(HandleFrameCallback handleFrame) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle_frame"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handleFrame == null ? MemoryAddress.NULL : handleFrame.toCallback()));
            return this;
        }
        
        public Builder setPrePushFrame(PrePushFrameCallback prePushFrame) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pre_push_frame"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prePushFrame == null ? MemoryAddress.NULL : prePushFrame.toCallback()));
            return this;
        }
        
        public Builder setConvert(ConvertCallback convert) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("convert"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (convert == null ? MemoryAddress.NULL : convert.toCallback()));
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
        
        public Builder setGetSinkCaps(GetSinkCapsCallback getSinkCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_sink_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSinkCaps == null ? MemoryAddress.NULL : getSinkCaps.toCallback()));
            return this;
        }
        
        public Builder setDetect(DetectCallback detect) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("detect"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (detect == null ? MemoryAddress.NULL : detect.toCallback()));
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
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
