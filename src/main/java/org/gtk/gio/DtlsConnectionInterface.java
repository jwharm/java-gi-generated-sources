package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Virtual method table for a {@link DtlsConnection} implementation.
 * @version 2.48
 */
public class DtlsConnectionInterface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDtlsConnectionInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("accept_certificate"),
        Interop.valueLayout.ADDRESS.withName("handshake"),
        Interop.valueLayout.ADDRESS.withName("handshake_async"),
        Interop.valueLayout.ADDRESS.withName("handshake_finish"),
        Interop.valueLayout.ADDRESS.withName("shutdown"),
        Interop.valueLayout.ADDRESS.withName("shutdown_async"),
        Interop.valueLayout.ADDRESS.withName("shutdown_finish"),
        Interop.valueLayout.ADDRESS.withName("set_advertised_protocols"),
        Interop.valueLayout.ADDRESS.withName("get_negotiated_protocol"),
        Interop.valueLayout.ADDRESS.withName("get_binding_data")
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
     * Allocate a new {@link DtlsConnectionInterface}
     * @return A new, uninitialized @{link DtlsConnectionInterface}
     */
    public static DtlsConnectionInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DtlsConnectionInterface newInstance = new DtlsConnectionInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface g_iface$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return new org.gtk.gobject.TypeInterface(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a DtlsConnectionInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DtlsConnectionInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private DtlsConnectionInterface struct;
        
         /**
         * A {@link DtlsConnectionInterface.Build} object constructs a {@link DtlsConnectionInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = DtlsConnectionInterface.allocate();
        }
        
         /**
         * Finish building the {@link DtlsConnectionInterface} struct.
         * @return A new instance of {@code DtlsConnectionInterface} with the fields 
         *         that were set in the Build object.
         */
        public DtlsConnectionInterface construct() {
            return struct;
        }
        
        /**
         * The parent interface.
         * @param g_iface The value for the {@code g_iface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGIface(org.gtk.gobject.TypeInterface g_iface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (g_iface == null ? MemoryAddress.NULL : g_iface.handle()));
            return this;
        }
        
        public Build setAcceptCertificate(java.lang.foreign.MemoryAddress accept_certificate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("accept_certificate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (accept_certificate == null ? MemoryAddress.NULL : accept_certificate));
            return this;
        }
        
        public Build setHandshake(java.lang.foreign.MemoryAddress handshake) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handshake"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handshake == null ? MemoryAddress.NULL : handshake));
            return this;
        }
        
        public Build setHandshakeAsync(java.lang.foreign.MemoryAddress handshake_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handshake_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handshake_async == null ? MemoryAddress.NULL : handshake_async));
            return this;
        }
        
        public Build setHandshakeFinish(java.lang.foreign.MemoryAddress handshake_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handshake_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handshake_finish == null ? MemoryAddress.NULL : handshake_finish));
            return this;
        }
        
        public Build setShutdown(java.lang.foreign.MemoryAddress shutdown) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("shutdown"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (shutdown == null ? MemoryAddress.NULL : shutdown));
            return this;
        }
        
        public Build setShutdownAsync(java.lang.foreign.MemoryAddress shutdown_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("shutdown_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (shutdown_async == null ? MemoryAddress.NULL : shutdown_async));
            return this;
        }
        
        public Build setShutdownFinish(java.lang.foreign.MemoryAddress shutdown_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("shutdown_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (shutdown_finish == null ? MemoryAddress.NULL : shutdown_finish));
            return this;
        }
        
        public Build setSetAdvertisedProtocols(java.lang.foreign.MemoryAddress set_advertised_protocols) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_advertised_protocols"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_advertised_protocols == null ? MemoryAddress.NULL : set_advertised_protocols));
            return this;
        }
        
        public Build setGetNegotiatedProtocol(java.lang.foreign.MemoryAddress get_negotiated_protocol) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_negotiated_protocol"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_negotiated_protocol == null ? MemoryAddress.NULL : get_negotiated_protocol));
            return this;
        }
        
        public Build setGetBindingData(java.lang.foreign.MemoryAddress get_binding_data) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_binding_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_binding_data == null ? MemoryAddress.NULL : get_binding_data));
            return this;
        }
    }
}
