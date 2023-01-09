package org.gstreamer.rtp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Base class for RTP depayloaders.
 */
public class RTPBaseDepayloadClass extends Struct {
    
    static {
        GstRtp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTPBaseDepayloadClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ElementClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("set_caps"),
            Interop.valueLayout.ADDRESS.withName("process"),
            Interop.valueLayout.ADDRESS.withName("packet_lost"),
            Interop.valueLayout.ADDRESS.withName("handle_event"),
            Interop.valueLayout.ADDRESS.withName("process_rtp_packet"),
            MemoryLayout.sequenceLayout(3, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link RTPBaseDepayloadClass}
     * @return A new, uninitialized @{link RTPBaseDepayloadClass}
     */
    public static RTPBaseDepayloadClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        RTPBaseDepayloadClass newInstance = new RTPBaseDepayloadClass(segment.address());
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
     * Functional interface declaration of the {@code SetCapsCallback} callback.
     */
    @FunctionalInterface
    public interface SetCapsCallback {
    
        boolean run(org.gstreamer.rtp.RTPBaseDepayload filter, org.gstreamer.gst.Caps caps);
        
        @ApiStatus.Internal default int upcall(MemoryAddress filter, MemoryAddress caps) {
            var RESULT = run((org.gstreamer.rtp.RTPBaseDepayload) Interop.register(filter, org.gstreamer.rtp.RTPBaseDepayload.fromAddress).marshal(filter, null), org.gstreamer.gst.Caps.fromAddress.marshal(caps, null));
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
     * Functional interface declaration of the {@code ProcessCallback} callback.
     */
    @FunctionalInterface
    public interface ProcessCallback {
    
        org.gstreamer.gst.Buffer run(org.gstreamer.rtp.RTPBaseDepayload base, org.gstreamer.gst.Buffer in);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress base, MemoryAddress in) {
            var RESULT = run((org.gstreamer.rtp.RTPBaseDepayload) Interop.register(base, org.gstreamer.rtp.RTPBaseDepayload.fromAddress).marshal(base, null), org.gstreamer.gst.Buffer.fromAddress.marshal(in, null));
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ProcessCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code process}
     * @param process The new value of the field {@code process}
     */
    public void setProcess(ProcessCallback process) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("process"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (process == null ? MemoryAddress.NULL : process.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PacketLostCallback} callback.
     */
    @FunctionalInterface
    public interface PacketLostCallback {
    
        boolean run(org.gstreamer.rtp.RTPBaseDepayload filter, org.gstreamer.gst.Event event);
        
        @ApiStatus.Internal default int upcall(MemoryAddress filter, MemoryAddress event) {
            var RESULT = run((org.gstreamer.rtp.RTPBaseDepayload) Interop.register(filter, org.gstreamer.rtp.RTPBaseDepayload.fromAddress).marshal(filter, null), org.gstreamer.gst.Event.fromAddress.marshal(event, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PacketLostCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code packet_lost}
     * @param packetLost The new value of the field {@code packet_lost}
     */
    public void setPacketLost(PacketLostCallback packetLost) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("packet_lost"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (packetLost == null ? MemoryAddress.NULL : packetLost.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code HandleEventCallback} callback.
     */
    @FunctionalInterface
    public interface HandleEventCallback {
    
        boolean run(org.gstreamer.rtp.RTPBaseDepayload filter, org.gstreamer.gst.Event event);
        
        @ApiStatus.Internal default int upcall(MemoryAddress filter, MemoryAddress event) {
            var RESULT = run((org.gstreamer.rtp.RTPBaseDepayload) Interop.register(filter, org.gstreamer.rtp.RTPBaseDepayload.fromAddress).marshal(filter, null), org.gstreamer.gst.Event.fromAddress.marshal(event, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), HandleEventCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code handle_event}
     * @param handleEvent The new value of the field {@code handle_event}
     */
    public void setHandleEvent(HandleEventCallback handleEvent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (handleEvent == null ? MemoryAddress.NULL : handleEvent.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ProcessRtpPacketCallback} callback.
     */
    @FunctionalInterface
    public interface ProcessRtpPacketCallback {
    
        org.gstreamer.gst.Buffer run(org.gstreamer.rtp.RTPBaseDepayload base, org.gstreamer.rtp.RTPBuffer rtpBuffer);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress base, MemoryAddress rtpBuffer) {
            var RESULT = run((org.gstreamer.rtp.RTPBaseDepayload) Interop.register(base, org.gstreamer.rtp.RTPBaseDepayload.fromAddress).marshal(base, null), org.gstreamer.rtp.RTPBuffer.fromAddress.marshal(rtpBuffer, null));
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ProcessRtpPacketCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code process_rtp_packet}
     * @param processRtpPacket The new value of the field {@code process_rtp_packet}
     */
    public void setProcessRtpPacket(ProcessRtpPacketCallback processRtpPacket) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("process_rtp_packet"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (processRtpPacket == null ? MemoryAddress.NULL : processRtpPacket.toCallback()));
        }
    }
    
    /**
     * Create a RTPBaseDepayloadClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected RTPBaseDepayloadClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, RTPBaseDepayloadClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new RTPBaseDepayloadClass(input);
    
    /**
     * A {@link RTPBaseDepayloadClass.Builder} object constructs a {@link RTPBaseDepayloadClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link RTPBaseDepayloadClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final RTPBaseDepayloadClass struct;
        
        private Builder() {
            struct = RTPBaseDepayloadClass.allocate();
        }
        
        /**
         * Finish building the {@link RTPBaseDepayloadClass} struct.
         * @return A new instance of {@code RTPBaseDepayloadClass} with the fields 
         *         that were set in the Builder object.
         */
        public RTPBaseDepayloadClass build() {
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
        
        public Builder setSetCaps(SetCapsCallback setCaps) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_caps"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setCaps == null ? MemoryAddress.NULL : setCaps.toCallback()));
                return this;
            }
        }
        
        public Builder setProcess(ProcessCallback process) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("process"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (process == null ? MemoryAddress.NULL : process.toCallback()));
                return this;
            }
        }
        
        public Builder setPacketLost(PacketLostCallback packetLost) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("packet_lost"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (packetLost == null ? MemoryAddress.NULL : packetLost.toCallback()));
                return this;
            }
        }
        
        public Builder setHandleEvent(HandleEventCallback handleEvent) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("handle_event"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (handleEvent == null ? MemoryAddress.NULL : handleEvent.toCallback()));
                return this;
            }
        }
        
        public Builder setProcessRtpPacket(ProcessRtpPacketCallback processRtpPacket) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("process_rtp_packet"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (processRtpPacket == null ? MemoryAddress.NULL : processRtpPacket.toCallback()));
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
