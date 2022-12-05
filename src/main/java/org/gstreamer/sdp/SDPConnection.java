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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("nettype"),
        Interop.valueLayout.ADDRESS.withName("addrtype"),
        Interop.valueLayout.ADDRESS.withName("address"),
        Interop.valueLayout.C_INT.withName("ttl"),
        Interop.valueLayout.C_INT.withName("addr_number")
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
     * Allocate a new {@link SDPConnection}
     * @return A new, uninitialized @{link SDPConnection}
     */
    public static SDPConnection allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SDPConnection newInstance = new SDPConnection(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code nettype}
     * @return The value of the field {@code nettype}
     */
    public java.lang.String nettype$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("nettype"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code nettype}
     * @param nettype The new value of the field {@code nettype}
     */
    public void nettype$set(java.lang.String nettype) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("nettype"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(nettype));
    }
    
    /**
     * Get the value of the field {@code addrtype}
     * @return The value of the field {@code addrtype}
     */
    public java.lang.String addrtype$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("addrtype"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code addrtype}
     * @param addrtype The new value of the field {@code addrtype}
     */
    public void addrtype$set(java.lang.String addrtype) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("addrtype"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(addrtype));
    }
    
    /**
     * Get the value of the field {@code address}
     * @return The value of the field {@code address}
     */
    public java.lang.String address$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("address"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code address}
     * @param address The new value of the field {@code address}
     */
    public void address$set(java.lang.String address) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("address"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(address));
    }
    
    /**
     * Get the value of the field {@code ttl}
     * @return The value of the field {@code ttl}
     */
    public int ttl$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ttl"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code ttl}
     * @param ttl The new value of the field {@code ttl}
     */
    public void ttl$set(int ttl) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ttl"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), ttl);
    }
    
    /**
     * Get the value of the field {@code addr_number}
     * @return The value of the field {@code addr_number}
     */
    public int addrNumber$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("addr_number"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code addr_number}
     * @param addrNumber The new value of the field {@code addr_number}
     */
    public void addrNumber$set(int addrNumber) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("addr_number"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), addrNumber);
    }
    
    /**
     * Create a SDPConnection proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SDPConnection(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Clear the connection.
     * @return {@code GST_SDP_OK}.
     */
    public @NotNull org.gstreamer.sdp.SDPResult clear() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_connection_clear.invokeExact(
                    handle());
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
    public @NotNull org.gstreamer.sdp.SDPResult set(@NotNull java.lang.String nettype, @NotNull java.lang.String addrtype, @NotNull java.lang.String address, int ttl, int addrNumber) {
        java.util.Objects.requireNonNull(nettype, "Parameter 'nettype' must not be null");
        java.util.Objects.requireNonNull(addrtype, "Parameter 'addrtype' must not be null");
        java.util.Objects.requireNonNull(address, "Parameter 'address' must not be null");
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.gst_sdp_connection_set.invokeExact(
                    handle(),
                    Interop.allocateNativeString(nettype),
                    Interop.allocateNativeString(addrtype),
                    Interop.allocateNativeString(address),
                    ttl,
                    addrNumber);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gstreamer.sdp.SDPResult.of(RESULT);
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SDPConnection struct;
        
         /**
         * A {@link SDPConnection.Build} object constructs a {@link SDPConnection} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SDPConnection.allocate();
        }
        
         /**
         * Finish building the {@link SDPConnection} struct.
         * @return A new instance of {@code SDPConnection} with the fields 
         *         that were set in the Build object.
         */
        public SDPConnection construct() {
            return struct;
        }
        
        /**
         * the type of network. "IN" is defined to have the meaning
         *    "Internet".
         * @param nettype The value for the {@code nettype} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNettype(java.lang.String nettype) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("nettype"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nettype == null ? MemoryAddress.NULL : Interop.allocateNativeString(nettype)));
            return this;
        }
        
        /**
         * the type of {@code address}.
         * @param addrtype The value for the {@code addrtype} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAddrtype(java.lang.String addrtype) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("addrtype"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (addrtype == null ? MemoryAddress.NULL : Interop.allocateNativeString(addrtype)));
            return this;
        }
        
        /**
         * the address
         * @param address The value for the {@code address} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAddress(java.lang.String address) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("address"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (address == null ? MemoryAddress.NULL : Interop.allocateNativeString(address)));
            return this;
        }
        
        /**
         * the time to live of the address
         * @param ttl The value for the {@code ttl} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setTtl(int ttl) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ttl"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), ttl);
            return this;
        }
        
        /**
         * the number of layers
         * @param addrNumber The value for the {@code addrNumber} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAddrNumber(int addrNumber) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("addr_number"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), addrNumber);
            return this;
        }
    }
}
