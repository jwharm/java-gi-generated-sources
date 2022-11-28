package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Provides an interface for describing TLS-related types.
 * @version 2.28
 */
public class TlsBackendInterface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTlsBackendInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("supports_tls"),
        Interop.valueLayout.ADDRESS.withName("get_certificate_type"),
        Interop.valueLayout.ADDRESS.withName("get_client_connection_type"),
        Interop.valueLayout.ADDRESS.withName("get_server_connection_type"),
        Interop.valueLayout.ADDRESS.withName("get_file_database_type"),
        Interop.valueLayout.ADDRESS.withName("get_default_database"),
        Interop.valueLayout.ADDRESS.withName("supports_dtls"),
        Interop.valueLayout.ADDRESS.withName("get_dtls_client_connection_type"),
        Interop.valueLayout.ADDRESS.withName("get_dtls_server_connection_type")
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
     * Allocate a new {@link TlsBackendInterface}
     * @return A new, uninitialized @{link TlsBackendInterface}
     */
    public static TlsBackendInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TlsBackendInterface newInstance = new TlsBackendInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface gIface$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return new org.gtk.gobject.TypeInterface(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a TlsBackendInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TlsBackendInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private TlsBackendInterface struct;
        
         /**
         * A {@link TlsBackendInterface.Build} object constructs a {@link TlsBackendInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = TlsBackendInterface.allocate();
        }
        
         /**
         * Finish building the {@link TlsBackendInterface} struct.
         * @return A new instance of {@code TlsBackendInterface} with the fields 
         *         that were set in the Build object.
         */
        public TlsBackendInterface construct() {
            return struct;
        }
        
        /**
         * The parent interface.
         * @param gIface The value for the {@code gIface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGIface(org.gtk.gobject.TypeInterface gIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Build setSupportsTls(java.lang.foreign.MemoryAddress supportsTls) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("supports_tls"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (supportsTls == null ? MemoryAddress.NULL : supportsTls));
            return this;
        }
        
        public Build setGetCertificateType(java.lang.foreign.MemoryAddress getCertificateType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_certificate_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getCertificateType == null ? MemoryAddress.NULL : getCertificateType));
            return this;
        }
        
        public Build setGetClientConnectionType(java.lang.foreign.MemoryAddress getClientConnectionType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_client_connection_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getClientConnectionType == null ? MemoryAddress.NULL : getClientConnectionType));
            return this;
        }
        
        public Build setGetServerConnectionType(java.lang.foreign.MemoryAddress getServerConnectionType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_server_connection_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getServerConnectionType == null ? MemoryAddress.NULL : getServerConnectionType));
            return this;
        }
        
        public Build setGetFileDatabaseType(java.lang.foreign.MemoryAddress getFileDatabaseType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_file_database_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFileDatabaseType == null ? MemoryAddress.NULL : getFileDatabaseType));
            return this;
        }
        
        public Build setGetDefaultDatabase(java.lang.foreign.MemoryAddress getDefaultDatabase) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_default_database"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDefaultDatabase == null ? MemoryAddress.NULL : getDefaultDatabase));
            return this;
        }
        
        public Build setSupportsDtls(java.lang.foreign.MemoryAddress supportsDtls) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("supports_dtls"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (supportsDtls == null ? MemoryAddress.NULL : supportsDtls));
            return this;
        }
        
        public Build setGetDtlsClientConnectionType(java.lang.foreign.MemoryAddress getDtlsClientConnectionType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_dtls_client_connection_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDtlsClientConnectionType == null ? MemoryAddress.NULL : getDtlsClientConnectionType));
            return this;
        }
        
        public Build setGetDtlsServerConnectionType(java.lang.foreign.MemoryAddress getDtlsServerConnectionType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_dtls_server_connection_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDtlsServerConnectionType == null ? MemoryAddress.NULL : getDtlsServerConnectionType));
            return this;
        }
    }
}
