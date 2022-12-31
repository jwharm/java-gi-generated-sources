package org.gstreamer.rtsp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * RTSP Authentication parameter
 * @version 1.12
 */
public class RTSPAuthParam extends Struct {
    
    static {
        GstRtsp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstRTSPAuthParam";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("name"),
            Interop.valueLayout.ADDRESS.withName("value")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link RTSPAuthParam}
     * @return A new, uninitialized @{link RTSPAuthParam}
     */
    public static RTSPAuthParam allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        RTSPAuthParam newInstance = new RTSPAuthParam(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code name}
     * @return The value of the field {@code name}
     */
    public java.lang.String getName() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code name}
     * @param name The new value of the field {@code name}
     */
    public void setName(java.lang.String name) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)));
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
     * Create a RTSPAuthParam proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected RTSPAuthParam(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, RTSPAuthParam> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new RTSPAuthParam(input, ownership);
    
    public org.gstreamer.rtsp.RTSPAuthParam copy() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.gst_rtsp_auth_param_copy.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.rtsp.RTSPAuthParam.fromAddress.marshal(RESULT, Ownership.FULL);
    }
    
    public void free() {
        try {
            DowncallHandles.gst_rtsp_auth_param_free.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_rtsp_auth_param_copy = Interop.downcallHandle(
            "gst_rtsp_auth_param_copy",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle gst_rtsp_auth_param_free = Interop.downcallHandle(
            "gst_rtsp_auth_param_free",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }
    
    /**
     * A {@link RTSPAuthParam.Builder} object constructs a {@link RTSPAuthParam} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link RTSPAuthParam.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final RTSPAuthParam struct;
        
        private Builder() {
            struct = RTSPAuthParam.allocate();
        }
        
         /**
         * Finish building the {@link RTSPAuthParam} struct.
         * @return A new instance of {@code RTSPAuthParam} with the fields 
         *         that were set in the Builder object.
         */
        public RTSPAuthParam build() {
            return struct;
        }
        
        /**
         * The name of the parameter
         * @param name The value for the {@code name} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setName(java.lang.String name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)));
            return this;
        }
        
        /**
         * The value of the parameter
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
