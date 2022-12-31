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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    public interface AcceptCertificateCallback {
        boolean run(org.gtk.gio.DtlsConnection connection, org.gtk.gio.TlsCertificate peerCert, org.gtk.gio.TlsCertificateFlags errors);

        @ApiStatus.Internal default int upcall(MemoryAddress connection, MemoryAddress peerCert, int errors) {
            var RESULT = run((org.gtk.gio.DtlsConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(connection)), org.gtk.gio.DtlsConnection.fromAddress).marshal(connection, Ownership.NONE), (org.gtk.gio.TlsCertificate) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(peerCert)), org.gtk.gio.TlsCertificate.fromAddress).marshal(peerCert, Ownership.NONE), new org.gtk.gio.TlsCertificateFlags(errors));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AcceptCertificateCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code accept_certificate}
     * @param acceptCertificate The new value of the field {@code accept_certificate}
     */
    public void setAcceptCertificate(AcceptCertificateCallback acceptCertificate) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("accept_certificate"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (acceptCertificate == null ? MemoryAddress.NULL : acceptCertificate.toCallback()));
    }
    
    @FunctionalInterface
    public interface HandshakeCallback {
        boolean run(org.gtk.gio.DtlsConnection conn, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default int upcall(MemoryAddress conn, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.DtlsConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(conn)), org.gtk.gio.DtlsConnection.fromAddress).marshal(conn, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(HandshakeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code handshake}
     * @param handshake The new value of the field {@code handshake}
     */
    public void setHandshake(HandshakeCallback handshake) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("handshake"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handshake == null ? MemoryAddress.NULL : handshake.toCallback()));
    }
    
    @FunctionalInterface
    public interface HandshakeAsyncCallback {
        void run(org.gtk.gio.DtlsConnection conn, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress conn, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.DtlsConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(conn)), org.gtk.gio.DtlsConnection.fromAddress).marshal(conn, Ownership.NONE), ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(HandshakeAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code handshake_async}
     * @param handshakeAsync The new value of the field {@code handshake_async}
     */
    public void setHandshakeAsync(HandshakeAsyncCallback handshakeAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("handshake_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handshakeAsync == null ? MemoryAddress.NULL : handshakeAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface HandshakeFinishCallback {
        boolean run(org.gtk.gio.DtlsConnection conn, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress conn, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.DtlsConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(conn)), org.gtk.gio.DtlsConnection.fromAddress).marshal(conn, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(HandshakeFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code handshake_finish}
     * @param handshakeFinish The new value of the field {@code handshake_finish}
     */
    public void setHandshakeFinish(HandshakeFinishCallback handshakeFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("handshake_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handshakeFinish == null ? MemoryAddress.NULL : handshakeFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface ShutdownCallback {
        boolean run(org.gtk.gio.DtlsConnection conn, boolean shutdownRead, boolean shutdownWrite, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default int upcall(MemoryAddress conn, int shutdownRead, int shutdownWrite, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.DtlsConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(conn)), org.gtk.gio.DtlsConnection.fromAddress).marshal(conn, Ownership.NONE), Marshal.integerToBoolean.marshal(shutdownRead, null).booleanValue(), Marshal.integerToBoolean.marshal(shutdownWrite, null).booleanValue(), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ShutdownCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code shutdown}
     * @param shutdown The new value of the field {@code shutdown}
     */
    public void setShutdown(ShutdownCallback shutdown) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("shutdown"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (shutdown == null ? MemoryAddress.NULL : shutdown.toCallback()));
    }
    
    @FunctionalInterface
    public interface ShutdownAsyncCallback {
        void run(org.gtk.gio.DtlsConnection conn, boolean shutdownRead, boolean shutdownWrite, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress conn, int shutdownRead, int shutdownWrite, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.DtlsConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(conn)), org.gtk.gio.DtlsConnection.fromAddress).marshal(conn, Ownership.NONE), Marshal.integerToBoolean.marshal(shutdownRead, null).booleanValue(), Marshal.integerToBoolean.marshal(shutdownWrite, null).booleanValue(), ioPriority, (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ShutdownAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code shutdown_async}
     * @param shutdownAsync The new value of the field {@code shutdown_async}
     */
    public void setShutdownAsync(ShutdownAsyncCallback shutdownAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("shutdown_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (shutdownAsync == null ? MemoryAddress.NULL : shutdownAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface ShutdownFinishCallback {
        boolean run(org.gtk.gio.DtlsConnection conn, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress conn, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.DtlsConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(conn)), org.gtk.gio.DtlsConnection.fromAddress).marshal(conn, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ShutdownFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code shutdown_finish}
     * @param shutdownFinish The new value of the field {@code shutdown_finish}
     */
    public void setShutdownFinish(ShutdownFinishCallback shutdownFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("shutdown_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (shutdownFinish == null ? MemoryAddress.NULL : shutdownFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetAdvertisedProtocolsCallback {
        void run(org.gtk.gio.DtlsConnection conn, @Nullable PointerString protocols);

        @ApiStatus.Internal default void upcall(MemoryAddress conn, MemoryAddress protocols) {
            run((org.gtk.gio.DtlsConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(conn)), org.gtk.gio.DtlsConnection.fromAddress).marshal(conn, Ownership.NONE), new PointerString(protocols));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetAdvertisedProtocolsCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_advertised_protocols}
     * @param setAdvertisedProtocols The new value of the field {@code set_advertised_protocols}
     */
    public void setSetAdvertisedProtocols(SetAdvertisedProtocolsCallback setAdvertisedProtocols) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_advertised_protocols"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setAdvertisedProtocols == null ? MemoryAddress.NULL : setAdvertisedProtocols.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetNegotiatedProtocolCallback {
        @Nullable java.lang.String run(org.gtk.gio.DtlsConnection conn);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress conn) {
            var RESULT = run((org.gtk.gio.DtlsConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(conn)), org.gtk.gio.DtlsConnection.fromAddress).marshal(conn, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetNegotiatedProtocolCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_negotiated_protocol}
     * @param getNegotiatedProtocol The new value of the field {@code get_negotiated_protocol}
     */
    public void setGetNegotiatedProtocol(GetNegotiatedProtocolCallback getNegotiatedProtocol) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_negotiated_protocol"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getNegotiatedProtocol == null ? MemoryAddress.NULL : getNegotiatedProtocol.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetBindingDataCallback {
        boolean run(org.gtk.gio.DtlsConnection conn, org.gtk.gio.TlsChannelBindingType type, PointerByte data);

        @ApiStatus.Internal default int upcall(MemoryAddress conn, int type, MemoryAddress data) {
            var RESULT = run((org.gtk.gio.DtlsConnection) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(conn)), org.gtk.gio.DtlsConnection.fromAddress).marshal(conn, Ownership.NONE), org.gtk.gio.TlsChannelBindingType.of(type), new PointerByte(data));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetBindingDataCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_binding_data}
     * @param getBindingData The new value of the field {@code get_binding_data}
     */
    public void setGetBindingData(GetBindingDataCallback getBindingData) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_binding_data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getBindingData == null ? MemoryAddress.NULL : getBindingData.toCallback()));
    }
    
    /**
     * Create a DtlsConnectionInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DtlsConnectionInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DtlsConnectionInterface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DtlsConnectionInterface(input, ownership);
    
    /**
     * A {@link DtlsConnectionInterface.Builder} object constructs a {@link DtlsConnectionInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DtlsConnectionInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DtlsConnectionInterface struct;
        
        private Builder() {
            struct = DtlsConnectionInterface.allocate();
        }
        
         /**
         * Finish building the {@link DtlsConnectionInterface} struct.
         * @return A new instance of {@code DtlsConnectionInterface} with the fields 
         *         that were set in the Builder object.
         */
        public DtlsConnectionInterface build() {
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
        
        public Builder setAcceptCertificate(AcceptCertificateCallback acceptCertificate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("accept_certificate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (acceptCertificate == null ? MemoryAddress.NULL : acceptCertificate.toCallback()));
            return this;
        }
        
        public Builder setHandshake(HandshakeCallback handshake) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handshake"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handshake == null ? MemoryAddress.NULL : handshake.toCallback()));
            return this;
        }
        
        public Builder setHandshakeAsync(HandshakeAsyncCallback handshakeAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handshake_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handshakeAsync == null ? MemoryAddress.NULL : handshakeAsync.toCallback()));
            return this;
        }
        
        public Builder setHandshakeFinish(HandshakeFinishCallback handshakeFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handshake_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handshakeFinish == null ? MemoryAddress.NULL : handshakeFinish.toCallback()));
            return this;
        }
        
        public Builder setShutdown(ShutdownCallback shutdown) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("shutdown"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (shutdown == null ? MemoryAddress.NULL : shutdown.toCallback()));
            return this;
        }
        
        public Builder setShutdownAsync(ShutdownAsyncCallback shutdownAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("shutdown_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (shutdownAsync == null ? MemoryAddress.NULL : shutdownAsync.toCallback()));
            return this;
        }
        
        public Builder setShutdownFinish(ShutdownFinishCallback shutdownFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("shutdown_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (shutdownFinish == null ? MemoryAddress.NULL : shutdownFinish.toCallback()));
            return this;
        }
        
        public Builder setSetAdvertisedProtocols(SetAdvertisedProtocolsCallback setAdvertisedProtocols) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_advertised_protocols"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setAdvertisedProtocols == null ? MemoryAddress.NULL : setAdvertisedProtocols.toCallback()));
            return this;
        }
        
        public Builder setGetNegotiatedProtocol(GetNegotiatedProtocolCallback getNegotiatedProtocol) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_negotiated_protocol"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getNegotiatedProtocol == null ? MemoryAddress.NULL : getNegotiatedProtocol.toCallback()));
            return this;
        }
        
        public Builder setGetBindingData(GetBindingDataCallback getBindingData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_binding_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getBindingData == null ? MemoryAddress.NULL : getBindingData.toCallback()));
            return this;
        }
    }
}
