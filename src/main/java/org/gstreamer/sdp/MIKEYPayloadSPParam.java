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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_BYTE.withName("type"),
        Interop.valueLayout.C_BYTE.withName("len"),
        MemoryLayout.paddingLayout(48),
        Interop.valueLayout.ADDRESS.withName("val")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
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
    public byte type$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void type$set(byte type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), type);
    }
    
    /**
     * Get the value of the field {@code len}
     * @return The value of the field {@code len}
     */
    public byte len$get() {
        var RESULT = (byte) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("len"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code len}
     * @param len The new value of the field {@code len}
     */
    public void len$set(byte len) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("len"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), len);
    }
    
    /**
     * Get the value of the field {@code val}
     * @return The value of the field {@code val}
     */
    public PointerByte val$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("val"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new PointerByte(RESULT);
    }
    
    /**
     * Change the value of the field {@code val}
     * @param val The new value of the field {@code val}
     */
    public void val$set(PointerByte val) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("val"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), val.handle());
    }
    
    /**
     * Create a MIKEYPayloadSPParam proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MIKEYPayloadSPParam(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private MIKEYPayloadSPParam struct;
        
         /**
         * A {@link MIKEYPayloadSPParam.Build} object constructs a {@link MIKEYPayloadSPParam} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = MIKEYPayloadSPParam.allocate();
        }
        
         /**
         * Finish building the {@link MIKEYPayloadSPParam} struct.
         * @return A new instance of {@code MIKEYPayloadSPParam} with the fields 
         *         that were set in the Build object.
         */
        public MIKEYPayloadSPParam construct() {
            return struct;
        }
        
        /**
         * specifies the type of the parameter
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setType(byte type) {
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
        public Build setLen(byte len) {
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
        public Build setVal(PointerByte val) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("val"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (val == null ? MemoryAddress.NULL : val.handle()));
            return this;
        }
    }
}
