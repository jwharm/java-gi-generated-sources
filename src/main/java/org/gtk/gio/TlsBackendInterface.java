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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    public org.gtk.gobject.TypeInterface getGIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code g_iface}
     * @param gIface The new value of the field {@code g_iface}
     */
    public void setGIface(org.gtk.gobject.TypeInterface gIface) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
    }
    
    @FunctionalInterface
    public interface SupportsTlsCallback {
        boolean run(org.gtk.gio.TlsBackend backend);

        @ApiStatus.Internal default int upcall(MemoryAddress backend) {
            var RESULT = run((org.gtk.gio.TlsBackend) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(backend)), org.gtk.gio.TlsBackend.fromAddress).marshal(backend, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SupportsTlsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code supports_tls}
     * @param supportsTls The new value of the field {@code supports_tls}
     */
    public void setSupportsTls(SupportsTlsCallback supportsTls) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("supports_tls"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (supportsTls == null ? MemoryAddress.NULL : supportsTls.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetCertificateTypeCallback {
        org.gtk.glib.Type run();

        @ApiStatus.Internal default long upcall() {
            var RESULT = run();
            return RESULT.getValue().longValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetCertificateTypeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_certificate_type}
     * @param getCertificateType The new value of the field {@code get_certificate_type}
     */
    public void setGetCertificateType(GetCertificateTypeCallback getCertificateType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_certificate_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getCertificateType == null ? MemoryAddress.NULL : getCertificateType.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetClientConnectionTypeCallback {
        org.gtk.glib.Type run();

        @ApiStatus.Internal default long upcall() {
            var RESULT = run();
            return RESULT.getValue().longValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetClientConnectionTypeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_client_connection_type}
     * @param getClientConnectionType The new value of the field {@code get_client_connection_type}
     */
    public void setGetClientConnectionType(GetClientConnectionTypeCallback getClientConnectionType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_client_connection_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getClientConnectionType == null ? MemoryAddress.NULL : getClientConnectionType.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetServerConnectionTypeCallback {
        org.gtk.glib.Type run();

        @ApiStatus.Internal default long upcall() {
            var RESULT = run();
            return RESULT.getValue().longValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetServerConnectionTypeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_server_connection_type}
     * @param getServerConnectionType The new value of the field {@code get_server_connection_type}
     */
    public void setGetServerConnectionType(GetServerConnectionTypeCallback getServerConnectionType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_server_connection_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getServerConnectionType == null ? MemoryAddress.NULL : getServerConnectionType.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetFileDatabaseTypeCallback {
        org.gtk.glib.Type run();

        @ApiStatus.Internal default long upcall() {
            var RESULT = run();
            return RESULT.getValue().longValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetFileDatabaseTypeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_file_database_type}
     * @param getFileDatabaseType The new value of the field {@code get_file_database_type}
     */
    public void setGetFileDatabaseType(GetFileDatabaseTypeCallback getFileDatabaseType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_file_database_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFileDatabaseType == null ? MemoryAddress.NULL : getFileDatabaseType.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetDefaultDatabaseCallback {
        org.gtk.gio.TlsDatabase run(org.gtk.gio.TlsBackend backend);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress backend) {
            var RESULT = run((org.gtk.gio.TlsBackend) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(backend)), org.gtk.gio.TlsBackend.fromAddress).marshal(backend, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetDefaultDatabaseCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_default_database}
     * @param getDefaultDatabase The new value of the field {@code get_default_database}
     */
    public void setGetDefaultDatabase(GetDefaultDatabaseCallback getDefaultDatabase) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_default_database"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDefaultDatabase == null ? MemoryAddress.NULL : getDefaultDatabase.toCallback()));
    }
    
    @FunctionalInterface
    public interface SupportsDtlsCallback {
        boolean run(org.gtk.gio.TlsBackend backend);

        @ApiStatus.Internal default int upcall(MemoryAddress backend) {
            var RESULT = run((org.gtk.gio.TlsBackend) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(backend)), org.gtk.gio.TlsBackend.fromAddress).marshal(backend, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SupportsDtlsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code supports_dtls}
     * @param supportsDtls The new value of the field {@code supports_dtls}
     */
    public void setSupportsDtls(SupportsDtlsCallback supportsDtls) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("supports_dtls"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (supportsDtls == null ? MemoryAddress.NULL : supportsDtls.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetDtlsClientConnectionTypeCallback {
        org.gtk.glib.Type run();

        @ApiStatus.Internal default long upcall() {
            var RESULT = run();
            return RESULT.getValue().longValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetDtlsClientConnectionTypeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_dtls_client_connection_type}
     * @param getDtlsClientConnectionType The new value of the field {@code get_dtls_client_connection_type}
     */
    public void setGetDtlsClientConnectionType(GetDtlsClientConnectionTypeCallback getDtlsClientConnectionType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_dtls_client_connection_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDtlsClientConnectionType == null ? MemoryAddress.NULL : getDtlsClientConnectionType.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetDtlsServerConnectionTypeCallback {
        org.gtk.glib.Type run();

        @ApiStatus.Internal default long upcall() {
            var RESULT = run();
            return RESULT.getValue().longValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetDtlsServerConnectionTypeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_dtls_server_connection_type}
     * @param getDtlsServerConnectionType The new value of the field {@code get_dtls_server_connection_type}
     */
    public void setGetDtlsServerConnectionType(GetDtlsServerConnectionTypeCallback getDtlsServerConnectionType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_dtls_server_connection_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDtlsServerConnectionType == null ? MemoryAddress.NULL : getDtlsServerConnectionType.toCallback()));
    }
    
    /**
     * Create a TlsBackendInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TlsBackendInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TlsBackendInterface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TlsBackendInterface(input, ownership);
    
    /**
     * A {@link TlsBackendInterface.Builder} object constructs a {@link TlsBackendInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TlsBackendInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TlsBackendInterface struct;
        
        private Builder() {
            struct = TlsBackendInterface.allocate();
        }
        
         /**
         * Finish building the {@link TlsBackendInterface} struct.
         * @return A new instance of {@code TlsBackendInterface} with the fields 
         *         that were set in the Builder object.
         */
        public TlsBackendInterface build() {
            return struct;
        }
        
        /**
         * The parent interface.
         * @param gIface The value for the {@code gIface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGIface(org.gtk.gobject.TypeInterface gIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Builder setSupportsTls(SupportsTlsCallback supportsTls) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("supports_tls"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (supportsTls == null ? MemoryAddress.NULL : supportsTls.toCallback()));
            return this;
        }
        
        public Builder setGetCertificateType(GetCertificateTypeCallback getCertificateType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_certificate_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getCertificateType == null ? MemoryAddress.NULL : getCertificateType.toCallback()));
            return this;
        }
        
        public Builder setGetClientConnectionType(GetClientConnectionTypeCallback getClientConnectionType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_client_connection_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getClientConnectionType == null ? MemoryAddress.NULL : getClientConnectionType.toCallback()));
            return this;
        }
        
        public Builder setGetServerConnectionType(GetServerConnectionTypeCallback getServerConnectionType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_server_connection_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getServerConnectionType == null ? MemoryAddress.NULL : getServerConnectionType.toCallback()));
            return this;
        }
        
        public Builder setGetFileDatabaseType(GetFileDatabaseTypeCallback getFileDatabaseType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_file_database_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFileDatabaseType == null ? MemoryAddress.NULL : getFileDatabaseType.toCallback()));
            return this;
        }
        
        public Builder setGetDefaultDatabase(GetDefaultDatabaseCallback getDefaultDatabase) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_default_database"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDefaultDatabase == null ? MemoryAddress.NULL : getDefaultDatabase.toCallback()));
            return this;
        }
        
        public Builder setSupportsDtls(SupportsDtlsCallback supportsDtls) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("supports_dtls"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (supportsDtls == null ? MemoryAddress.NULL : supportsDtls.toCallback()));
            return this;
        }
        
        public Builder setGetDtlsClientConnectionType(GetDtlsClientConnectionTypeCallback getDtlsClientConnectionType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_dtls_client_connection_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDtlsClientConnectionType == null ? MemoryAddress.NULL : getDtlsClientConnectionType.toCallback()));
            return this;
        }
        
        public Builder setGetDtlsServerConnectionType(GetDtlsServerConnectionTypeCallback getDtlsServerConnectionType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_dtls_server_connection_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDtlsServerConnectionType == null ? MemoryAddress.NULL : getDtlsServerConnectionType.toCallback()));
            return this;
        }
    }
}
