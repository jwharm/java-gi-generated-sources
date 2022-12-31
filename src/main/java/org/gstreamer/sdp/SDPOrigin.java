package org.gstreamer.sdp;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The contents of the SDP "o=" field which gives the originator of the session
 * (their username and the address of the user's host) plus a session id and
 * session version number.
 */
public class SDPOrigin extends Struct {
    
    static {
        GstSdp.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstSDPOrigin";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("username"),
            Interop.valueLayout.ADDRESS.withName("sess_id"),
            Interop.valueLayout.ADDRESS.withName("sess_version"),
            Interop.valueLayout.ADDRESS.withName("nettype"),
            Interop.valueLayout.ADDRESS.withName("addrtype"),
            Interop.valueLayout.ADDRESS.withName("addr")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link SDPOrigin}
     * @return A new, uninitialized @{link SDPOrigin}
     */
    public static SDPOrigin allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SDPOrigin newInstance = new SDPOrigin(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code username}
     * @return The value of the field {@code username}
     */
    public java.lang.String getUsername() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("username"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code username}
     * @param username The new value of the field {@code username}
     */
    public void setUsername(java.lang.String username) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("username"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (username == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(username, null)));
    }
    
    /**
     * Get the value of the field {@code sess_id}
     * @return The value of the field {@code sess_id}
     */
    public java.lang.String getSessId() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("sess_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code sess_id}
     * @param sessId The new value of the field {@code sess_id}
     */
    public void setSessId(java.lang.String sessId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("sess_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sessId == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(sessId, null)));
    }
    
    /**
     * Get the value of the field {@code sess_version}
     * @return The value of the field {@code sess_version}
     */
    public java.lang.String getSessVersion() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("sess_version"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code sess_version}
     * @param sessVersion The new value of the field {@code sess_version}
     */
    public void setSessVersion(java.lang.String sessVersion) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("sess_version"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sessVersion == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(sessVersion, null)));
    }
    
    /**
     * Get the value of the field {@code nettype}
     * @return The value of the field {@code nettype}
     */
    public java.lang.String getNettype() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("nettype"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code nettype}
     * @param nettype The new value of the field {@code nettype}
     */
    public void setNettype(java.lang.String nettype) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("nettype"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nettype == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(nettype, null)));
    }
    
    /**
     * Get the value of the field {@code addrtype}
     * @return The value of the field {@code addrtype}
     */
    public java.lang.String getAddrtype() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("addrtype"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code addrtype}
     * @param addrtype The new value of the field {@code addrtype}
     */
    public void setAddrtype(java.lang.String addrtype) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("addrtype"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (addrtype == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(addrtype, null)));
    }
    
    /**
     * Get the value of the field {@code addr}
     * @return The value of the field {@code addr}
     */
    public java.lang.String getAddr() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("addr"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Change the value of the field {@code addr}
     * @param addr The new value of the field {@code addr}
     */
    public void setAddr(java.lang.String addr) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("addr"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (addr == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(addr, null)));
    }
    
    /**
     * Create a SDPOrigin proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected SDPOrigin(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, SDPOrigin> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new SDPOrigin(input, ownership);
    
    /**
     * A {@link SDPOrigin.Builder} object constructs a {@link SDPOrigin} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link SDPOrigin.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final SDPOrigin struct;
        
        private Builder() {
            struct = SDPOrigin.allocate();
        }
        
         /**
         * Finish building the {@link SDPOrigin} struct.
         * @return A new instance of {@code SDPOrigin} with the fields 
         *         that were set in the Builder object.
         */
        public SDPOrigin build() {
            return struct;
        }
        
        /**
         * the user's login on the originating host, or it is "-"
         *    if the originating host does not support the concept of user ids.
         * @param username The value for the {@code username} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setUsername(java.lang.String username) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("username"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (username == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(username, null)));
            return this;
        }
        
        /**
         * is a numeric string such that the tuple of {@code username}, {@code sess_id},
         *    {@code nettype}, {@code addrtype} and {@code addr} form a globally unique identifier for the
         *    session.
         * @param sessId The value for the {@code sessId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSessId(java.lang.String sessId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sess_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sessId == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(sessId, null)));
            return this;
        }
        
        /**
         * a version number for this announcement
         * @param sessVersion The value for the {@code sessVersion} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSessVersion(java.lang.String sessVersion) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sess_version"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sessVersion == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(sessVersion, null)));
            return this;
        }
        
        /**
         * the type of network. "IN" is defined to have the meaning
         *    "Internet".
         * @param nettype The value for the {@code nettype} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNettype(java.lang.String nettype) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("nettype"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nettype == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(nettype, null)));
            return this;
        }
        
        /**
         * the type of {@code addr}.
         * @param addrtype The value for the {@code addrtype} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAddrtype(java.lang.String addrtype) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("addrtype"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (addrtype == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(addrtype, null)));
            return this;
        }
        
        /**
         * the globally unique address of the machine from which the session was
         *     created.
         * @param addr The value for the {@code addr} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAddr(java.lang.String addr) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("addr"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (addr == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(addr, null)));
            return this;
        }
    }
}
