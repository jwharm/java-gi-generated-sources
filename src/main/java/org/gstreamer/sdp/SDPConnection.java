package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The contents of the SDP "c=" field which contains connection data.
 */
public class SDPConnection extends Struct {
    
    static {
        GstSdp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstSDPConnection";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("nettype"),
            Interop.valueLayout.ADDRESS.withName("addrtype"),
            Interop.valueLayout.ADDRESS.withName("address"),
            Interop.valueLayout.C_INT.withName("ttl"),
            Interop.valueLayout.C_INT.withName("addr_number")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SDPConnection}
     * @return A new, uninitialized @{link SDPConnection}
     */
    public static SDPConnection allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        SDPConnection newInstance = new SDPConnection(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code nettype}
     * @return The value of the field {@code nettype}
     */
    public java.lang.String getNettype() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("nettype"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code nettype}
     * @param nettype The new value of the field {@code nettype}
     */
    public void setNettype(java.lang.String nettype) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("nettype"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (nettype == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(nettype, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code addrtype}
     * @return The value of the field {@code addrtype}
     */
    public java.lang.String getAddrtype() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("addrtype"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code addrtype}
     * @param addrtype The new value of the field {@code addrtype}
     */
    public void setAddrtype(java.lang.String addrtype) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("addrtype"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (addrtype == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(addrtype, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code address}
     * @return The value of the field {@code address}
     */
    public java.lang.String getAddress() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("address"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code address}
     * @param address The new value of the field {@code address}
     */
    public void setAddress(java.lang.String address) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("address"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (address == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(address, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code ttl}
     * @return The value of the field {@code ttl}
     */
    public int getTtl() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ttl"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code ttl}
     * @param ttl The new value of the field {@code ttl}
     */
    public void setTtl(int ttl) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ttl"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), ttl);
        }
    }
    
    /**
     * Get the value of the field {@code addr_number}
     * @return The value of the field {@code addr_number}
     */
    public int getAddrNumber() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("addr_number"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code addr_number}
     * @param addrNumber The new value of the field {@code addr_number}
     */
    public void setAddrNumber(int addrNumber) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("addr_number"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), addrNumber);
        }
    }
    
    /**
     * Create a SDPConnection proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected SDPConnection(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, SDPConnection> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new SDPConnection(input);
    
    /**
     * Clear the connection.
     * @return {@code GST_SDP_OK}.
     */
    public org.gstreamer.sdp.SDPResult clear() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_connection_clear.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
    }
    
    /**
     * Set the connection with the given parameters.
     * @param nettype the type of network. "IN" is defined to have the meaning
     * "Internet".
     * @param addrtype the type of address.
     * @param address the address
     * @param ttl the time to live of the address
     * @param addrNumber the number of layers
     * @return {@code GST_SDP_OK}.
     */
    public org.gstreamer.sdp.SDPResult set(java.lang.String nettype, java.lang.String addrtype, java.lang.String address, int ttl, int addrNumber) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            int RESULT;
            try {
                RESULT = (int) DowncallHandles.gst_sdp_connection_set.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(nettype, SCOPE),
                        Marshal.stringToAddress.marshal(addrtype, SCOPE),
                        Marshal.stringToAddress.marshal(address, SCOPE),
                        ttl,
                        addrNumber);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gstreamer.sdp.SDPResult.of(RESULT);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle gst_sdp_connection_clear = Interop.downcallHandle(
                "gst_sdp_connection_clear",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle gst_sdp_connection_set = Interop.downcallHandle(
                "gst_sdp_connection_set",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT),
                false
        );
    }
    
    /**
     * A {@link SDPConnection.Builder} object constructs a {@link SDPConnection} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link SDPConnection.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final SDPConnection struct;
        
        private Builder() {
            struct = SDPConnection.allocate();
        }
        
        /**
         * Finish building the {@link SDPConnection} struct.
         * @return A new instance of {@code SDPConnection} with the fields 
         *         that were set in the Builder object.
         */
        public SDPConnection build() {
            return struct;
        }
        
        /**
         * the type of network. "IN" is defined to have the meaning
         *    "Internet".
         * @param nettype The value for the {@code nettype} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNettype(java.lang.String nettype) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("nettype"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (nettype == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(nettype, SCOPE)));
                return this;
            }
        }
        
        /**
         * the type of {@code address}.
         * @param addrtype The value for the {@code addrtype} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAddrtype(java.lang.String addrtype) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("addrtype"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (addrtype == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(addrtype, SCOPE)));
                return this;
            }
        }
        
        /**
         * the address
         * @param address The value for the {@code address} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAddress(java.lang.String address) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("address"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (address == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(address, SCOPE)));
                return this;
            }
        }
        
        /**
         * the time to live of the address
         * @param ttl The value for the {@code ttl} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setTtl(int ttl) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("ttl"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), ttl);
                return this;
            }
        }
        
        /**
         * the number of layers
         * @param addrNumber The value for the {@code addrNumber} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAddrNumber(int addrNumber) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("addr_number"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), addrNumber);
                return this;
            }
        }
    }
}
