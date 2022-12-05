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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("username"),
        Interop.valueLayout.ADDRESS.withName("sess_id"),
        Interop.valueLayout.ADDRESS.withName("sess_version"),
        Interop.valueLayout.ADDRESS.withName("nettype"),
        Interop.valueLayout.ADDRESS.withName("addrtype"),
        Interop.valueLayout.ADDRESS.withName("addr")
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
    public java.lang.String username$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("username"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code username}
     * @param username The new value of the field {@code username}
     */
    public void username$set(java.lang.String username) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("username"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(username));
    }
    
    /**
     * Get the value of the field {@code sess_id}
     * @return The value of the field {@code sess_id}
     */
    public java.lang.String sessId$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("sess_id"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code sess_id}
     * @param sessId The new value of the field {@code sess_id}
     */
    public void sessId$set(java.lang.String sessId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("sess_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(sessId));
    }
    
    /**
     * Get the value of the field {@code sess_version}
     * @return The value of the field {@code sess_version}
     */
    public java.lang.String sessVersion$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("sess_version"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code sess_version}
     * @param sessVersion The new value of the field {@code sess_version}
     */
    public void sessVersion$set(java.lang.String sessVersion) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("sess_version"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(sessVersion));
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
     * Get the value of the field {@code addr}
     * @return The value of the field {@code addr}
     */
    public java.lang.String addr$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("addr"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code addr}
     * @param addr The new value of the field {@code addr}
     */
    public void addr$set(java.lang.String addr) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("addr"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(addr));
    }
    
    /**
     * Create a SDPOrigin proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SDPOrigin(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SDPOrigin struct;
        
         /**
         * A {@link SDPOrigin.Build} object constructs a {@link SDPOrigin} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SDPOrigin.allocate();
        }
        
         /**
         * Finish building the {@link SDPOrigin} struct.
         * @return A new instance of {@code SDPOrigin} with the fields 
         *         that were set in the Build object.
         */
        public SDPOrigin construct() {
            return struct;
        }
        
        /**
         * the user's login on the originating host, or it is "-"
         *    if the originating host does not support the concept of user ids.
         * @param username The value for the {@code username} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setUsername(java.lang.String username) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("username"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (username == null ? MemoryAddress.NULL : Interop.allocateNativeString(username)));
            return this;
        }
        
        /**
         * is a numeric string such that the tuple of {@code username}, {@code sess_id},
         *    {@code nettype}, {@code addrtype} and {@code addr} form a globally unique identifier for the
         *    session.
         * @param sessId The value for the {@code sessId} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSessId(java.lang.String sessId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sess_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sessId == null ? MemoryAddress.NULL : Interop.allocateNativeString(sessId)));
            return this;
        }
        
        /**
         * a version number for this announcement
         * @param sessVersion The value for the {@code sessVersion} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSessVersion(java.lang.String sessVersion) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sess_version"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sessVersion == null ? MemoryAddress.NULL : Interop.allocateNativeString(sessVersion)));
            return this;
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
         * the type of {@code addr}.
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
         * the globally unique address of the machine from which the session was
         *     created.
         * @param addr The value for the {@code addr} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAddr(java.lang.String addr) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("addr"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (addr == null ? MemoryAddress.NULL : Interop.allocateNativeString(addr)));
            return this;
        }
    }
}
