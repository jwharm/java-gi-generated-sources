package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A Type/Length/Value field for security parameters
 */
public class MIKEYPayloadSPParam extends Struct {
    
    static {
        GstSdp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstMIKEYPayloadSPParam";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_BYTE.withName("type"),
            Interop.valueLayout.C_BYTE.withName("len"),
            MemoryLayout.paddingLayout(48),
            Interop.valueLayout.ADDRESS.withName("val")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link MIKEYPayloadSPParam}
     * @return A new, uninitialized @{link MIKEYPayloadSPParam}
     */
    public static MIKEYPayloadSPParam allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MIKEYPayloadSPParam newInstance = new MIKEYPayloadSPParam(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public byte getType() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void setType(byte type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), type);
    }
    
    /**
     * Get the value of the field {@code len}
     * @return The value of the field {@code len}
     */
    public byte getLen() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("len"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code len}
     * @param len The new value of the field {@code len}
     */
    public void setLen(byte len) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("len"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), len);
    }
    
    /**
     * Get the value of the field {@code val}
     * @return The value of the field {@code val}
     */
    public PointerByte getVal() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("val"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerByte(RESULT);
    }
    
    /**
     * Change the value of the field {@code val}
     * @param val The new value of the field {@code val}
     */
    public void setVal(PointerByte val) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("val"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (val == null ? MemoryAddress.NULL : val.handle()));
    }
    
    /**
     * Create a MIKEYPayloadSPParam proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected MIKEYPayloadSPParam(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, MIKEYPayloadSPParam> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new MIKEYPayloadSPParam(input, ownership);
    
    /**
     * A {@link MIKEYPayloadSPParam.Builder} object constructs a {@link MIKEYPayloadSPParam} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link MIKEYPayloadSPParam.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final MIKEYPayloadSPParam struct;
        
        private Builder() {
            struct = MIKEYPayloadSPParam.allocate();
        }
        
         /**
         * Finish building the {@link MIKEYPayloadSPParam} struct.
         * @return A new instance of {@code MIKEYPayloadSPParam} with the fields 
         *         that were set in the Builder object.
         */
        public MIKEYPayloadSPParam build() {
            return struct;
        }
        
        /**
         * specifies the type of the parameter
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setType(byte type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), type);
            return this;
        }
        
        /**
         * specifies the length of {@code val}
         * @param len The value for the {@code len} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setLen(byte len) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("len"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), len);
            return this;
        }
        
        /**
         * specifies the value of the parameter
         * @param val The value for the {@code val} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setVal(PointerByte val) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("val"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (val == null ? MemoryAddress.NULL : val.handle()));
            return this;
        }
    }
}
