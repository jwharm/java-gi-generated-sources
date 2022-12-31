package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The Security policy Map item for SRTP
 */
public class MIKEYMapSRTP extends Struct {
    
    static {
        GstSdp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMIKEYMapSRTP";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_BYTE.withName("policy"),
            MemoryLayout.paddingLayout(24),
            Interop.valueLayout.C_INT.withName("ssrc"),
            Interop.valueLayout.C_INT.withName("roc")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link MIKEYMapSRTP}
     * @return A new, uninitialized @{link MIKEYMapSRTP}
     */
    public static MIKEYMapSRTP allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MIKEYMapSRTP newInstance = new MIKEYMapSRTP(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code policy}
     * @return The value of the field {@code policy}
     */
    public byte getPolicy() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("policy"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code policy}
     * @param policy The new value of the field {@code policy}
     */
    public void setPolicy(byte policy) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("policy"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), policy);
    }
    
    /**
     * Get the value of the field {@code ssrc}
     * @return The value of the field {@code ssrc}
     */
    public int getSsrc() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ssrc"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code ssrc}
     * @param ssrc The new value of the field {@code ssrc}
     */
    public void setSsrc(int ssrc) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ssrc"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), ssrc);
    }
    
    /**
     * Get the value of the field {@code roc}
     * @return The value of the field {@code roc}
     */
    public int getRoc() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("roc"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code roc}
     * @param roc The new value of the field {@code roc}
     */
    public void setRoc(int roc) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("roc"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), roc);
    }
    
    /**
     * Create a MIKEYMapSRTP proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected MIKEYMapSRTP(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, MIKEYMapSRTP> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new MIKEYMapSRTP(input, ownership);
    
    /**
     * A {@link MIKEYMapSRTP.Builder} object constructs a {@link MIKEYMapSRTP} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link MIKEYMapSRTP.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final MIKEYMapSRTP struct;
        
        private Builder() {
            struct = MIKEYMapSRTP.allocate();
        }
        
         /**
         * Finish building the {@link MIKEYMapSRTP} struct.
         * @return A new instance of {@code MIKEYMapSRTP} with the fields 
         *         that were set in the Builder object.
         */
        public MIKEYMapSRTP build() {
            return struct;
        }
        
        /**
         * The security policy applied for the stream with {@code ssrc}
         * @param policy The value for the {@code policy} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPolicy(byte policy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("policy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), policy);
            return this;
        }
        
        /**
         * the SSRC that must be used for the stream
         * @param ssrc The value for the {@code ssrc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSsrc(int ssrc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ssrc"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), ssrc);
            return this;
        }
        
        /**
         * current rollover counter
         * @param roc The value for the {@code roc} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRoc(int roc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("roc"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), roc);
            return this;
        }
    }
}
