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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TlsBackendInterface newInstance = new TlsBackendInterface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface getGIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code g_iface}
     * @param gIface The new value of the field {@code g_iface}
     */
    public void setGIface(org.gtk.gobject.TypeInterface gIface) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SupportsTlsCallback} callback.
     */
    @FunctionalInterface
    public interface SupportsTlsCallback {
    
        boolean run(org.gtk.gio.TlsBackend backend);
        
        @ApiStatus.Internal default int upcall(MemoryAddress backend) {
            var RESULT = run((org.gtk.gio.TlsBackend) Interop.register(backend, org.gtk.gio.TlsBackend.fromAddress).marshal(backend, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SupportsTlsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code supports_tls}
     * @param supportsTls The new value of the field {@code supports_tls}
     */
    public void setSupportsTls(SupportsTlsCallback supportsTls) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("supports_tls"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (supportsTls == null ? MemoryAddress.NULL : supportsTls.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetCertificateTypeCallback} callback.
     */
    @FunctionalInterface
    public interface GetCertificateTypeCallback {
    
        org.gtk.glib.Type run();
        
        @ApiStatus.Internal default long upcall() {
            var RESULT = run();
            return RESULT.getValue().longValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetCertificateTypeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_certificate_type}
     * @param getCertificateType The new value of the field {@code get_certificate_type}
     */
    public void setGetCertificateType(GetCertificateTypeCallback getCertificateType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_certificate_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getCertificateType == null ? MemoryAddress.NULL : getCertificateType.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetClientConnectionTypeCallback} callback.
     */
    @FunctionalInterface
    public interface GetClientConnectionTypeCallback {
    
        org.gtk.glib.Type run();
        
        @ApiStatus.Internal default long upcall() {
            var RESULT = run();
            return RESULT.getValue().longValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetClientConnectionTypeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_client_connection_type}
     * @param getClientConnectionType The new value of the field {@code get_client_connection_type}
     */
    public void setGetClientConnectionType(GetClientConnectionTypeCallback getClientConnectionType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_client_connection_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getClientConnectionType == null ? MemoryAddress.NULL : getClientConnectionType.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetServerConnectionTypeCallback} callback.
     */
    @FunctionalInterface
    public interface GetServerConnectionTypeCallback {
    
        org.gtk.glib.Type run();
        
        @ApiStatus.Internal default long upcall() {
            var RESULT = run();
            return RESULT.getValue().longValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetServerConnectionTypeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_server_connection_type}
     * @param getServerConnectionType The new value of the field {@code get_server_connection_type}
     */
    public void setGetServerConnectionType(GetServerConnectionTypeCallback getServerConnectionType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_server_connection_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getServerConnectionType == null ? MemoryAddress.NULL : getServerConnectionType.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetFileDatabaseTypeCallback} callback.
     */
    @FunctionalInterface
    public interface GetFileDatabaseTypeCallback {
    
        org.gtk.glib.Type run();
        
        @ApiStatus.Internal default long upcall() {
            var RESULT = run();
            return RESULT.getValue().longValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetFileDatabaseTypeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_file_database_type}
     * @param getFileDatabaseType The new value of the field {@code get_file_database_type}
     */
    public void setGetFileDatabaseType(GetFileDatabaseTypeCallback getFileDatabaseType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_file_database_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getFileDatabaseType == null ? MemoryAddress.NULL : getFileDatabaseType.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetDefaultDatabaseCallback} callback.
     */
    @FunctionalInterface
    public interface GetDefaultDatabaseCallback {
    
        org.gtk.gio.TlsDatabase run(org.gtk.gio.TlsBackend backend);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress backend) {
            var RESULT = run((org.gtk.gio.TlsBackend) Interop.register(backend, org.gtk.gio.TlsBackend.fromAddress).marshal(backend, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetDefaultDatabaseCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_default_database}
     * @param getDefaultDatabase The new value of the field {@code get_default_database}
     */
    public void setGetDefaultDatabase(GetDefaultDatabaseCallback getDefaultDatabase) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_default_database"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getDefaultDatabase == null ? MemoryAddress.NULL : getDefaultDatabase.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SupportsDtlsCallback} callback.
     */
    @FunctionalInterface
    public interface SupportsDtlsCallback {
    
        boolean run(org.gtk.gio.TlsBackend backend);
        
        @ApiStatus.Internal default int upcall(MemoryAddress backend) {
            var RESULT = run((org.gtk.gio.TlsBackend) Interop.register(backend, org.gtk.gio.TlsBackend.fromAddress).marshal(backend, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SupportsDtlsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code supports_dtls}
     * @param supportsDtls The new value of the field {@code supports_dtls}
     */
    public void setSupportsDtls(SupportsDtlsCallback supportsDtls) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("supports_dtls"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (supportsDtls == null ? MemoryAddress.NULL : supportsDtls.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetDtlsClientConnectionTypeCallback} callback.
     */
    @FunctionalInterface
    public interface GetDtlsClientConnectionTypeCallback {
    
        org.gtk.glib.Type run();
        
        @ApiStatus.Internal default long upcall() {
            var RESULT = run();
            return RESULT.getValue().longValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetDtlsClientConnectionTypeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_dtls_client_connection_type}
     * @param getDtlsClientConnectionType The new value of the field {@code get_dtls_client_connection_type}
     */
    public void setGetDtlsClientConnectionType(GetDtlsClientConnectionTypeCallback getDtlsClientConnectionType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_dtls_client_connection_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getDtlsClientConnectionType == null ? MemoryAddress.NULL : getDtlsClientConnectionType.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetDtlsServerConnectionTypeCallback} callback.
     */
    @FunctionalInterface
    public interface GetDtlsServerConnectionTypeCallback {
    
        org.gtk.glib.Type run();
        
        @ApiStatus.Internal default long upcall() {
            var RESULT = run();
            return RESULT.getValue().longValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_LONG);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetDtlsServerConnectionTypeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_dtls_server_connection_type}
     * @param getDtlsServerConnectionType The new value of the field {@code get_dtls_server_connection_type}
     */
    public void setGetDtlsServerConnectionType(GetDtlsServerConnectionTypeCallback getDtlsServerConnectionType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_dtls_server_connection_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getDtlsServerConnectionType == null ? MemoryAddress.NULL : getDtlsServerConnectionType.toCallback()));
        }
    }
    
    /**
     * Create a TlsBackendInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TlsBackendInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TlsBackendInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TlsBackendInterface(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
                return this;
            }
        }
        
        public Builder setSupportsTls(SupportsTlsCallback supportsTls) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("supports_tls"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (supportsTls == null ? MemoryAddress.NULL : supportsTls.toCallback()));
                return this;
            }
        }
        
        public Builder setGetCertificateType(GetCertificateTypeCallback getCertificateType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_certificate_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getCertificateType == null ? MemoryAddress.NULL : getCertificateType.toCallback()));
                return this;
            }
        }
        
        public Builder setGetClientConnectionType(GetClientConnectionTypeCallback getClientConnectionType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_client_connection_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getClientConnectionType == null ? MemoryAddress.NULL : getClientConnectionType.toCallback()));
                return this;
            }
        }
        
        public Builder setGetServerConnectionType(GetServerConnectionTypeCallback getServerConnectionType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_server_connection_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getServerConnectionType == null ? MemoryAddress.NULL : getServerConnectionType.toCallback()));
                return this;
            }
        }
        
        public Builder setGetFileDatabaseType(GetFileDatabaseTypeCallback getFileDatabaseType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_file_database_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getFileDatabaseType == null ? MemoryAddress.NULL : getFileDatabaseType.toCallback()));
                return this;
            }
        }
        
        public Builder setGetDefaultDatabase(GetDefaultDatabaseCallback getDefaultDatabase) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_default_database"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getDefaultDatabase == null ? MemoryAddress.NULL : getDefaultDatabase.toCallback()));
                return this;
            }
        }
        
        public Builder setSupportsDtls(SupportsDtlsCallback supportsDtls) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("supports_dtls"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (supportsDtls == null ? MemoryAddress.NULL : supportsDtls.toCallback()));
                return this;
            }
        }
        
        public Builder setGetDtlsClientConnectionType(GetDtlsClientConnectionTypeCallback getDtlsClientConnectionType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_dtls_client_connection_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getDtlsClientConnectionType == null ? MemoryAddress.NULL : getDtlsClientConnectionType.toCallback()));
                return this;
            }
        }
        
        public Builder setGetDtlsServerConnectionType(GetDtlsServerConnectionTypeCallback getDtlsServerConnectionType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_dtls_server_connection_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getDtlsServerConnectionType == null ? MemoryAddress.NULL : getDtlsServerConnectionType.toCallback()));
                return this;
            }
        }
    }
}
