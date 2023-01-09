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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        RTPBasePayloadClass newInstance = new RTPBasePayloadClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ElementClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.gst.ElementClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.gst.ElementClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetCapsCallback} callback.
     */
    @FunctionalInterface
    public interface GetCapsCallback {
    
        org.gstreamer.gst.Caps run(org.gstreamer.rtp.RTPBasePayload payload, org.gstreamer.gst.Pad pad, org.gstreamer.gst.Caps filter);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress payload, MemoryAddress pad, MemoryAddress filter) {
            var RESULT = run((org.gstreamer.rtp.RTPBasePayload) Interop.register(payload, org.gstreamer.rtp.RTPBasePayload.fromAddress).marshal(payload, null), (org.gstreamer.gst.Pad) Interop.register(pad, org.gstreamer.gst.Pad.fromAddress).marshal(pad, null), org.gstreamer.gst.Caps.fromAddress.marshal(filter, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetCapsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_caps}
     * @param getCaps The new value of the field {@code get_caps}
     */
    public void setGetCaps(GetCapsCallback getCaps) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getCaps == null ? MemoryAddress.NULL : getCaps.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetCapsCallback} callback.
     */
    @FunctionalInterface
    public interface SetCapsCallback {
    
        boolean run(org.gstreamer.rtp.RTPBasePayload payload, org.gstreamer.gst.Caps caps);
        
        @ApiStatus.Internal default int upcall(MemoryAddress payload, MemoryAddress caps) {
            var RESULT = run((org.gstreamer.rtp.RTPBasePayload) Interop.register(payload, org.gstreamer.rtp.RTPBasePayload.fromAddress).marshal(payload, null), org.gstreamer.gst.Caps.fromAddress.marshal(caps, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetCapsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_caps}
     * @param setCaps The new value of the field {@code set_caps}
     */
    public void setSetCaps(SetCapsCallback setCaps) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setCaps == null ? MemoryAddress.NULL : setCaps.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code HandleBufferCallback} callback.
     */
    @FunctionalInterface
    public interface HandleBufferCallback {
    
        org.gstreamer.gst.FlowReturn run(org.gstreamer.rtp.RTPBasePayload payload, org.gstreamer.gst.Buffer buffer);
        
        @ApiStatus.Internal default int upcall(MemoryAddress payload, MemoryAddress buffer) {
            var RESULT = run((org.gstreamer.rtp.RTPBasePayload) Interop.register(payload, org.gstreamer.rtp.RTPBasePayload.fromAddress).marshal(payload, null), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), HandleBufferCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code handle_buffer}
     * @param handleBuffer The new value of the field {@code handle_buffer}
     */
    public void setHandleBuffer(HandleBufferCallback handleBuffer) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (handleBuffer == null ? MemoryAddress.NULL : handleBuffer.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SinkEventCallback} callback.
     */
    @FunctionalInterface
    public interface SinkEventCallback {
    
        boolean run(org.gstreamer.rtp.RTPBasePayload payload, org.gstreamer.gst.Event event);
        
        @ApiStatus.Internal default int upcall(MemoryAddress payload, MemoryAddress event) {
            var RESULT = run((org.gstreamer.rtp.RTPBasePayload) Interop.register(payload, org.gstreamer.rtp.RTPBasePayload.fromAddress).marshal(payload, null), org.gstreamer.gst.Event.fromAddress.marshal(event, null));
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
    
        boolean run(org.gstreamer.rtp.RTPBasePayload payload, org.gstreamer.gst.Event event);
        
        @ApiStatus.Internal default int upcall(MemoryAddress payload, MemoryAddress event) {
            var RESULT = run((org.gstreamer.rtp.RTPBasePayload) Interop.register(payload, org.gstreamer.rtp.RTPBasePayload.fromAddress).marshal(payload, null), org.gstreamer.gst.Event.fromAddress.marshal(event, null));
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
     * Functional interface declaration of the {@code QueryCallback} callback.
     */
    @FunctionalInterface
    public interface QueryCallback {
    
        boolean run(org.gstreamer.rtp.RTPBasePayload payload, org.gstreamer.gst.Pad pad, org.gstreamer.gst.Query query);
        
        @ApiStatus.Internal default int upcall(MemoryAddress payload, MemoryAddress pad, MemoryAddress query) {
            var RESULT = run((org.gstreamer.rtp.RTPBasePayload) Interop.register(payload, org.gstreamer.rtp.RTPBasePayload.fromAddress).marshal(payload, null), (org.gstreamer.gst.Pad) Interop.register(pad, org.gstreamer.gst.Pad.fromAddress).marshal(pad, null), org.gstreamer.gst.Query.fromAddress.marshal(query, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), QueryCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code query}
     * @param query The new value of the field {@code query}
     */
    public void setQuery(QueryCallback query) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (query == null ? MemoryAddress.NULL : query.toCallback()));
        }
    }
    
    /**
     * Create a RTPBasePayloadClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected RTPBasePayloadClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, RTPBasePayloadClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new RTPBasePayloadClass(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setGetCaps(GetCapsCallback getCaps) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_caps"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getCaps == null ? MemoryAddress.NULL : getCaps.toCallback()));
                return this;
            }
        }
        
        public Builder setSetCaps(SetCapsCallback setCaps) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_caps"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setCaps == null ? MemoryAddress.NULL : setCaps.toCallback()));
                return this;
            }
        }
        
        public Builder setHandleBuffer(HandleBufferCallback handleBuffer) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("handle_buffer"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (handleBuffer == null ? MemoryAddress.NULL : handleBuffer.toCallback()));
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
        
        public Builder setQuery(QueryCallback query) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("query"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (query == null ? MemoryAddress.NULL : query.toCallback()));
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
