package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The Security Policy payload defines a set of policies that apply to a
 * specific security protocol
 */
public class MIKEYPayloadSP extends Struct {
    
    static {
        GstSdp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMIKEYPayloadSP";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.sdp.MIKEYPayload.getMemoryLayout().withName("pt"),
            Interop.valueLayout.C_INT.withName("policy"),
            Interop.valueLayout.C_INT.withName("proto"),
            Interop.valueLayout.ADDRESS.withName("params")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link MIKEYPayloadSP}
     * @return A new, uninitialized @{link MIKEYPayloadSP}
     */
    public static MIKEYPayloadSP allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MIKEYPayloadSP newInstance = new MIKEYPayloadSP(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code pt}
     * @return The value of the field {@code pt}
     */
    public org.gstreamer.sdp.MIKEYPayload getPt() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("pt"));
        return org.gstreamer.sdp.MIKEYPayload.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code pt}
     * @param pt The new value of the field {@code pt}
     */
    public void setPt(org.gstreamer.sdp.MIKEYPayload pt) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pt"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pt == null ? MemoryAddress.NULL : pt.handle()));
    }
    
    /**
     * Get the value of the field {@code policy}
     * @return The value of the field {@code policy}
     */
    public int getPolicy() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("policy"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code policy}
     * @param policy The new value of the field {@code policy}
     */
    public void setPolicy(int policy) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("policy"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), policy);
    }
    
    /**
     * Get the value of the field {@code proto}
     * @return The value of the field {@code proto}
     */
    public org.gstreamer.sdp.MIKEYSecProto getProto() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("proto"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return org.gstreamer.sdp.MIKEYSecProto.of(RESULT);
    }
    
    /**
     * Change the value of the field {@code proto}
     * @param proto The new value of the field {@code proto}
     */
    public void setProto(org.gstreamer.sdp.MIKEYSecProto proto) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("proto"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (proto == null ? MemoryAddress.NULL : proto.getValue()));
    }
    
    /**
     * Get the value of the field {@code params}
     * @return The value of the field {@code params}
     */
    public PointerAddress getParams() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("params"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerAddress(RESULT);
    }
    
    /**
     * Change the value of the field {@code params}
     * @param params The new value of the field {@code params}
     */
    public void setParams(java.lang.foreign.MemoryAddress[] params) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("params"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (params == null ? MemoryAddress.NULL : Interop.allocateNativeArray(params, false)));
    }
    
    /**
     * Create a MIKEYPayloadSP proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected MIKEYPayloadSP(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, MIKEYPayloadSP> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new MIKEYPayloadSP(input, ownership);
    
    /**
     * A {@link MIKEYPayloadSP.Builder} object constructs a {@link MIKEYPayloadSP} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link MIKEYPayloadSP.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final MIKEYPayloadSP struct;
        
        private Builder() {
            struct = MIKEYPayloadSP.allocate();
        }
        
         /**
         * Finish building the {@link MIKEYPayloadSP} struct.
         * @return A new instance of {@code MIKEYPayloadSP} with the fields 
         *         that were set in the Builder object.
         */
        public MIKEYPayloadSP build() {
            return struct;
        }
        
        /**
         * the payload header
         * @param pt The value for the {@code pt} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPt(org.gstreamer.sdp.MIKEYPayload pt) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pt"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pt == null ? MemoryAddress.NULL : pt.handle()));
            return this;
        }
        
        /**
         * the policy number
         * @param policy The value for the {@code policy} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPolicy(int policy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("policy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), policy);
            return this;
        }
        
        /**
         * the security protocol
         * @param proto The value for the {@code proto} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setProto(org.gstreamer.sdp.MIKEYSecProto proto) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("proto"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (proto == null ? MemoryAddress.NULL : proto.getValue()));
            return this;
        }
        
        /**
         * array of {@link MIKEYPayloadSPParam}
         * @param params The value for the {@code params} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParams(java.lang.foreign.MemoryAddress[] params) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("params"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (params == null ? MemoryAddress.NULL : Interop.allocateNativeArray(params, false)));
            return this;
        }
    }
}
