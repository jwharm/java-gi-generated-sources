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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RTPBaseDepayloadClass newInstance = new RTPBaseDepayloadClass(segment.address(), Ownership.NONE);
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
    public interface SetCapsCallback {
        boolean run(org.gstreamer.rtp.RTPBaseDepayload filter, org.gstreamer.gst.Caps caps);

        @ApiStatus.Internal default int upcall(MemoryAddress filter, MemoryAddress caps) {
            var RESULT = run((org.gstreamer.rtp.RTPBaseDepayload) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(filter)), org.gstreamer.rtp.RTPBaseDepayload.fromAddress).marshal(filter, Ownership.NONE), org.gstreamer.gst.Caps.fromAddress.marshal(caps, Ownership.NONE));
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
    public interface ProcessCallback {
        org.gstreamer.gst.Buffer run(org.gstreamer.rtp.RTPBaseDepayload base, org.gstreamer.gst.Buffer in);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress base, MemoryAddress in) {
            var RESULT = run((org.gstreamer.rtp.RTPBaseDepayload) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(base)), org.gstreamer.rtp.RTPBaseDepayload.fromAddress).marshal(base, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(in, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ProcessCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code process}
     * @param process The new value of the field {@code process}
     */
    public void setProcess(ProcessCallback process) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("process"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (process == null ? MemoryAddress.NULL : process.toCallback()));
    }
    
    @FunctionalInterface
    public interface PacketLostCallback {
        boolean run(org.gstreamer.rtp.RTPBaseDepayload filter, org.gstreamer.gst.Event event);

        @ApiStatus.Internal default int upcall(MemoryAddress filter, MemoryAddress event) {
            var RESULT = run((org.gstreamer.rtp.RTPBaseDepayload) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(filter)), org.gstreamer.rtp.RTPBaseDepayload.fromAddress).marshal(filter, Ownership.NONE), org.gstreamer.gst.Event.fromAddress.marshal(event, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PacketLostCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code packet_lost}
     * @param packetLost The new value of the field {@code packet_lost}
     */
    public void setPacketLost(PacketLostCallback packetLost) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("packet_lost"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (packetLost == null ? MemoryAddress.NULL : packetLost.toCallback()));
    }
    
    @FunctionalInterface
    public interface HandleEventCallback {
        boolean run(org.gstreamer.rtp.RTPBaseDepayload filter, org.gstreamer.gst.Event event);

        @ApiStatus.Internal default int upcall(MemoryAddress filter, MemoryAddress event) {
            var RESULT = run((org.gstreamer.rtp.RTPBaseDepayload) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(filter)), org.gstreamer.rtp.RTPBaseDepayload.fromAddress).marshal(filter, Ownership.NONE), org.gstreamer.gst.Event.fromAddress.marshal(event, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(HandleEventCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code handle_event}
     * @param handleEvent The new value of the field {@code handle_event}
     */
    public void setHandleEvent(HandleEventCallback handleEvent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("handle_event"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handleEvent == null ? MemoryAddress.NULL : handleEvent.toCallback()));
    }
    
    @FunctionalInterface
    public interface ProcessRtpPacketCallback {
        org.gstreamer.gst.Buffer run(org.gstreamer.rtp.RTPBaseDepayload base, org.gstreamer.rtp.RTPBuffer rtpBuffer);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress base, MemoryAddress rtpBuffer) {
            var RESULT = run((org.gstreamer.rtp.RTPBaseDepayload) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(base)), org.gstreamer.rtp.RTPBaseDepayload.fromAddress).marshal(base, Ownership.NONE), org.gstreamer.rtp.RTPBuffer.fromAddress.marshal(rtpBuffer, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ProcessRtpPacketCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code process_rtp_packet}
     * @param processRtpPacket The new value of the field {@code process_rtp_packet}
     */
    public void setProcessRtpPacket(ProcessRtpPacketCallback processRtpPacket) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("process_rtp_packet"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (processRtpPacket == null ? MemoryAddress.NULL : processRtpPacket.toCallback()));
    }
    
    /**
     * Create a RTPBaseDepayloadClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected RTPBaseDepayloadClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, RTPBaseDepayloadClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new RTPBaseDepayloadClass(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setSetCaps(SetCapsCallback setCaps) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_caps"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setCaps == null ? MemoryAddress.NULL : setCaps.toCallback()));
            return this;
        }
        
        public Builder setProcess(ProcessCallback process) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("process"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (process == null ? MemoryAddress.NULL : process.toCallback()));
            return this;
        }
        
        public Builder setPacketLost(PacketLostCallback packetLost) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("packet_lost"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (packetLost == null ? MemoryAddress.NULL : packetLost.toCallback()));
            return this;
        }
        
        public Builder setHandleEvent(HandleEventCallback handleEvent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handle_event"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handleEvent == null ? MemoryAddress.NULL : handleEvent.toCallback()));
            return this;
        }
        
        public Builder setProcessRtpPacket(ProcessRtpPacketCallback processRtpPacket) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("process_rtp_packet"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (processRtpPacket == null ? MemoryAddress.NULL : processRtpPacket.toCallback()));
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
