package org.gstreamer.rtp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Base class for audio RTP payloader.
 */
public class RTPBasePayloadClass extends Struct {
    
    static {
        GstRtp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTPBasePayloadClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ElementClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("get_caps"),
            Interop.valueLayout.ADDRESS.withName("set_caps"),
            Interop.valueLayout.ADDRESS.withName("handle_buffer"),
            Interop.valueLayout.ADDRESS.withName("sink_event"),
            Interop.valueLayout.ADDRESS.withName("src_event"),
            Interop.valueLayout.ADDRESS.withName("query"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link RTPBasePayloadClass}
     * @return A new, uninitialized @{link RTPBasePayloadClass}
     */
    public static RTPBasePayloadClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RTPBasePayloadClass newInstance = new RTPBasePayloadClass(segment.address(), Ownership.NONE);
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
    public interface GetCapsCallback {
        org.gstreamer.gst.Caps run(org.gstreamer.rtp.RTPBasePayload payload, org.gstreamer.gst.Pad pad, org.gstreamer.gst.Caps filter);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress payload, MemoryAddress pad, MemoryAddress filter) {
            var RESULT = run((org.gstreamer.rtp.RTPBasePayload) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(payload)), org.gstreamer.rtp.RTPBasePayload.fromAddress).marshal(payload, Ownership.NONE), (org.gstreamer.gst.Pad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pad)), org.gstreamer.gst.Pad.fromAddress).marshal(pad, Ownership.NONE), org.gstreamer.gst.Caps.fromAddress.marshal(filter, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetCapsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_caps}
     * @param getCaps The new value of the field {@code get_caps}
     */
    public void setGetCaps(GetCapsCallback getCaps) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_caps"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getCaps == null ? MemoryAddress.NULL : getCaps.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetCapsCallback {
        boolean run(org.gstreamer.rtp.RTPBasePayload payload, org.gstreamer.gst.Caps caps);

        @ApiStatus.Internal default int upcall(MemoryAddress payload, MemoryAddress caps) {
            var RESULT = run((org.gstreamer.rtp.RTPBasePayload) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(payload)), org.gstreamer.rtp.RTPBasePayload.fromAddress).marshal(payload, Ownership.NONE), org.gstreamer.gst.Caps.fromAddress.marshal(caps, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetCapsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_caps}
     * @param setCaps The new value of the field {@code set_caps}
     */
    public void setSetCaps(SetCapsCallback setCaps) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_caps"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setCaps == null ? MemoryAddress.NULL : setCaps.toCallback()));
    }
    
    @FunctionalInterface
    public interface HandleBufferCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.rtp.RTPBasePayload payload, org.gstreamer.gst.Buffer buffer);

        @ApiStatus.Internal default int upcall(MemoryAddress payload, MemoryAddress buffer) {
            var RESULT = run((org.gstreamer.rtp.RTPBasePayload) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(payload)), org.gstreamer.rtp.RTPBasePayload.fromAddress).marshal(payload, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(HandleBufferCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code handle_buffer}
     * @param handleBuffer The new value of the field {@code handle_buffer}
     */
    public void setHandleBuffer(HandleBufferCallback handleBuffer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("handle_buffer"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handleBuffer == null ? MemoryAddress.NULL : handleBuffer.toCallback()));
    }
    
    @FunctionalInterface
    public interface SinkEventCallback {
        boolean run(org.gstreamer.rtp.RTPBasePayload payload, org.gstreamer.gst.Event event);

        @ApiStatus.Internal default int upcall(MemoryAddress payload, MemoryAddress event) {
            var RESULT = run((org.gstreamer.rtp.RTPBasePayload) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(payload)), org.gstreamer.rtp.RTPBasePayload.fromAddress).marshal(payload, Ownership.NONE), org.gstreamer.gst.Event.fromAddress.marshal(event, Ownership.NONE));
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
        boolean run(org.gstreamer.rtp.RTPBasePayload payload, org.gstreamer.gst.Event event);

        @ApiStatus.Internal default int upcall(MemoryAddress payload, MemoryAddress event) {
            var RESULT = run((org.gstreamer.rtp.RTPBasePayload) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(payload)), org.gstreamer.rtp.RTPBasePayload.fromAddress).marshal(payload, Ownership.NONE), org.gstreamer.gst.Event.fromAddress.marshal(event, Ownership.NONE));
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
    public interface QueryCallback {
        boolean run(org.gstreamer.rtp.RTPBasePayload payload, org.gstreamer.gst.Pad pad, org.gstreamer.gst.Query query);

        @ApiStatus.Internal default int upcall(MemoryAddress payload, MemoryAddress pad, MemoryAddress query) {
            var RESULT = run((org.gstreamer.rtp.RTPBasePayload) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(payload)), org.gstreamer.rtp.RTPBasePayload.fromAddress).marshal(payload, Ownership.NONE), (org.gstreamer.gst.Pad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pad)), org.gstreamer.gst.Pad.fromAddress).marshal(pad, Ownership.NONE), org.gstreamer.gst.Query.fromAddress.marshal(query, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(QueryCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code query}
     * @param query The new value of the field {@code query}
     */
    public void setQuery(QueryCallback query) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("query"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (query == null ? MemoryAddress.NULL : query.toCallback()));
    }
    
    /**
     * Create a RTPBasePayloadClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected RTPBasePayloadClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, RTPBasePayloadClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new RTPBasePayloadClass(input, ownership);
    
    /**
     * A {@link RTPBasePayloadClass.Builder} object constructs a {@link RTPBasePayloadClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link RTPBasePayloadClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final RTPBasePayloadClass struct;
        
        private Builder() {
            struct = RTPBasePayloadClass.allocate();
        }
        
         /**
         * Finish building the {@link RTPBasePayloadClass} struct.
         * @return A new instance of {@code RTPBasePayloadClass} with the fields 
         *         that were set in the Builder object.
         */
        public RTPBasePayloadClass build() {
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
        
        public Builder setGetCaps(GetCapsCallback getCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getCaps == null ? MemoryAddress.NULL : getCaps.toCallback()));
            return this;
        }
        
        public Builder setSetCaps(SetCapsCallback setCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setCaps == null ? MemoryAddress.NULL : setCaps.toCallback()));
            return this;
        }
        
        public Builder setHandleBuffer(HandleBufferCallback handleBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handleBuffer == null ? MemoryAddress.NULL : handleBuffer.toCallback()));
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
        
        public Builder setQuery(QueryCallback query) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (query == null ? MemoryAddress.NULL : query.toCallback()));
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
