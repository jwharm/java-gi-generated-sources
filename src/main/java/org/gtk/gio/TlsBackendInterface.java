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
    public org.gtk.gobject.TypeInterface g_iface$get() {
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
         * @param g_iface The value for the {@code g_iface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGIface(org.gtk.gobject.TypeInterface g_iface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (g_iface == null ? MemoryAddress.NULL : g_iface.handle()));
            return this;
        }
        
        public Build setSupportsTls(java.lang.foreign.MemoryAddress supports_tls) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("supports_tls"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (supports_tls == null ? MemoryAddress.NULL : supports_tls));
            return this;
        }
        
        public Build setGetCertificateType(java.lang.foreign.MemoryAddress get_certificate_type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_certificate_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_certificate_type == null ? MemoryAddress.NULL : get_certificate_type));
            return this;
        }
        
        public Build setGetClientConnectionType(java.lang.foreign.MemoryAddress get_client_connection_type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_client_connection_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_client_connection_type == null ? MemoryAddress.NULL : get_client_connection_type));
            return this;
        }
        
        public Build setGetServerConnectionType(java.lang.foreign.MemoryAddress get_server_connection_type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_server_connection_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_server_connection_type == null ? MemoryAddress.NULL : get_server_connection_type));
            return this;
        }
        
        public Build setGetFileDatabaseType(java.lang.foreign.MemoryAddress get_file_database_type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_file_database_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_file_database_type == null ? MemoryAddress.NULL : get_file_database_type));
            return this;
        }
        
        public Build setGetDefaultDatabase(java.lang.foreign.MemoryAddress get_default_database) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_default_database"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_default_database == null ? MemoryAddress.NULL : get_default_database));
            return this;
        }
        
        public Build setSupportsDtls(java.lang.foreign.MemoryAddress supports_dtls) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("supports_dtls"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (supports_dtls == null ? MemoryAddress.NULL : supports_dtls));
            return this;
        }
        
        public Build setGetDtlsClientConnectionType(java.lang.foreign.MemoryAddress get_dtls_client_connection_type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_dtls_client_connection_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_dtls_client_connection_type == null ? MemoryAddress.NULL : get_dtls_client_connection_type));
            return this;
        }
        
        public Build setGetDtlsServerConnectionType(java.lang.foreign.MemoryAddress get_dtls_server_connection_type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_dtls_server_connection_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_dtls_server_connection_type == null ? MemoryAddress.NULL : get_dtls_server_connection_type));
            return this;
        }
    }
}
