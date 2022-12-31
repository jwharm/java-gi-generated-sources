package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The contents of the SDP "a=" field which contains a key/value pair.
 */
public class SDPAttribute extends Struct {
    
    static {
        GstSdp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstSDPAttribute";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("key"),
            Interop.valueLayout.ADDRESS.withName("value")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SDPAttribute}
     * @return A new, uninitialized @{link SDPAttribute}
     */
    public static SDPAttribute allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SDPAttribute newInstance = new SDPAttribute(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code key}
     * @return The value of the field {@code key}
     */
    public java.lang.String getKey() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("key"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code key}
     * @param key The new value of the field {@code key}
     */
    public void setKey(java.lang.String key) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("key"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (key == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(key, null)));
    }
    
    /**
     * Get the value of the field {@code value}
     * @return The value of the field {@code value}
     */
    public java.lang.String getValue() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code value}
     * @param value The new value of the field {@code value}
     */
    public void setValue(java.lang.String value) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (value == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(value, null)));
    }
    
    /**
     * Create a SDPAttribute proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected SDPAttribute(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SDPAttribute> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SDPAttribute(input, ownership);
    
    /**
     * Clear the attribute.
     * @return {@code GST_SDP_OK}.
     */
    public org.gstreamer.sdp.SDPResult clear() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_attribute_clear.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Set the attribute with {@code key} and {@code value}.
     * @param key the key
     * @param value the value
     * @return {@code GST_SDP_OK}.
     */
    public org.gstreamer.sdp.SDPResult set(java.lang.String key, @Nullable java.lang.String value) {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_attribute_set.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(key, null),
                    (Addressable) (value == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(value, null)));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_sdp_attribute_clear = Interop.downcallHandle(
            "gst_sdp_attribute_clear",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_sdp_attribute_set = Interop.downcallHandle(
            "gst_sdp_attribute_set",
            FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link SDPAttribute.Builder} object constructs a {@link SDPAttribute} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link SDPAttribute.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final SDPAttribute struct;
        
        private Builder() {
            struct = SDPAttribute.allocate();
        }
        
         /**
         * Finish building the {@link SDPAttribute} struct.
         * @return A new instance of {@code SDPAttribute} with the fields 
         *         that were set in the Builder object.
         */
        public SDPAttribute build() {
            return struct;
        }
        
        /**
         * the attribute key
         * @param key The value for the {@code key} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setKey(java.lang.String key) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("key"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (key == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(key, null)));
            return this;
        }
        
        /**
         * the attribute value or NULL when it was a property attribute
         * @param value The value for the {@code value} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValue(java.lang.String value) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (value == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(value, null)));
            return this;
        }
    }
}
