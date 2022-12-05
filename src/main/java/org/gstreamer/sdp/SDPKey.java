package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The contents of the SDP "k=" field which is used to convey encryption
 * keys.
 */
public class SDPKey extends Struct {
    
    static {
        GstSdp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstSDPKey";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("type"),
        Interop.valueLayout.ADDRESS.withName("data")
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
     * Allocate a new {@link SDPKey}
     * @return A new, uninitialized @{link SDPKey}
     */
    public static SDPKey allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SDPKey newInstance = new SDPKey(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code type}
     * @return The value of the field {@code type}
     */
    public java.lang.String type$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code type}
     * @param type The new value of the field {@code type}
     */
    public void type$set(java.lang.String type) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(type));
    }
    
    /**
     * Get the value of the field {@code data}
     * @return The value of the field {@code data}
     */
    public java.lang.String data$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code data}
     * @param data The new value of the field {@code data}
     */
    public void data$set(java.lang.String data) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(data));
    }
    
    /**
     * Create a SDPKey proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SDPKey(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SDPKey struct;
        
         /**
         * A {@link SDPKey.Build} object constructs a {@link SDPKey} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SDPKey.allocate();
        }
        
         /**
         * Finish building the {@link SDPKey} struct.
         * @return A new instance of {@code SDPKey} with the fields 
         *         that were set in the Build object.
         */
        public SDPKey construct() {
            return struct;
        }
        
        /**
         * the encryption type
         * @param type The value for the {@code type} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setType(java.lang.String type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (type == null ? MemoryAddress.NULL : Interop.allocateNativeString(type)));
            return this;
        }
        
        /**
         * the encryption data
         * @param data The value for the {@code data} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setData(java.lang.String data) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (data == null ? MemoryAddress.NULL : Interop.allocateNativeString(data)));
            return this;
        }
    }
}
