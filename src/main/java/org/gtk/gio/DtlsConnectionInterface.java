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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DtlsConnectionInterface newInstance = new DtlsConnectionInterface(segment.address());
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
     * Functional interface declaration of the {@code AcceptCertificateCallback} callback.
     */
    @FunctionalInterface
    public interface AcceptCertificateCallback {
    
        boolean run(org.gtk.gio.DtlsConnection connection, org.gtk.gio.TlsCertificate peerCert, org.gtk.gio.TlsCertificateFlags errors);
        
        @ApiStatus.Internal default int upcall(MemoryAddress connection, MemoryAddress peerCert, int errors) {
            var RESULT = run((org.gtk.gio.DtlsConnection) Interop.register(connection, org.gtk.gio.DtlsConnection.fromAddress).marshal(connection, null), (org.gtk.gio.TlsCertificate) Interop.register(peerCert, org.gtk.gio.TlsCertificate.fromAddress).marshal(peerCert, null), new org.gtk.gio.TlsCertificateFlags(errors));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AcceptCertificateCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code accept_certificate}
     * @param acceptCertificate The new value of the field {@code accept_certificate}
     */
    public void setAcceptCertificate(AcceptCertificateCallback acceptCertificate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("accept_certificate"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (acceptCertificate == null ? MemoryAddress.NULL : acceptCertificate.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code HandshakeCallback} callback.
     */
    @FunctionalInterface
    public interface HandshakeCallback {
    
        boolean run(org.gtk.gio.DtlsConnection conn, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default int upcall(MemoryAddress conn, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.DtlsConnection) Interop.register(conn, org.gtk.gio.DtlsConnection.fromAddress).marshal(conn, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), HandshakeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code handshake}
     * @param handshake The new value of the field {@code handshake}
     */
    public void setHandshake(HandshakeCallback handshake) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handshake"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (handshake == null ? MemoryAddress.NULL : handshake.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code HandshakeAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface HandshakeAsyncCallback {
    
        void run(org.gtk.gio.DtlsConnection conn, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress conn, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.DtlsConnection) Interop.register(conn, org.gtk.gio.DtlsConnection.fromAddress).marshal(conn, null), ioPriority, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), HandshakeAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code handshake_async}
     * @param handshakeAsync The new value of the field {@code handshake_async}
     */
    public void setHandshakeAsync(HandshakeAsyncCallback handshakeAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handshake_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (handshakeAsync == null ? MemoryAddress.NULL : handshakeAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code HandshakeFinishCallback} callback.
     */
    @FunctionalInterface
    public interface HandshakeFinishCallback {
    
        boolean run(org.gtk.gio.DtlsConnection conn, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default int upcall(MemoryAddress conn, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.DtlsConnection) Interop.register(conn, org.gtk.gio.DtlsConnection.fromAddress).marshal(conn, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), HandshakeFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code handshake_finish}
     * @param handshakeFinish The new value of the field {@code handshake_finish}
     */
    public void setHandshakeFinish(HandshakeFinishCallback handshakeFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handshake_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (handshakeFinish == null ? MemoryAddress.NULL : handshakeFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ShutdownCallback} callback.
     */
    @FunctionalInterface
    public interface ShutdownCallback {
    
        boolean run(org.gtk.gio.DtlsConnection conn, boolean shutdownRead, boolean shutdownWrite, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default int upcall(MemoryAddress conn, int shutdownRead, int shutdownWrite, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.DtlsConnection) Interop.register(conn, org.gtk.gio.DtlsConnection.fromAddress).marshal(conn, null), Marshal.integerToBoolean.marshal(shutdownRead, null).booleanValue(), Marshal.integerToBoolean.marshal(shutdownWrite, null).booleanValue(), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ShutdownCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code shutdown}
     * @param shutdown The new value of the field {@code shutdown}
     */
    public void setShutdown(ShutdownCallback shutdown) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("shutdown"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (shutdown == null ? MemoryAddress.NULL : shutdown.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ShutdownAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface ShutdownAsyncCallback {
    
        void run(org.gtk.gio.DtlsConnection conn, boolean shutdownRead, boolean shutdownWrite, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress conn, int shutdownRead, int shutdownWrite, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.DtlsConnection) Interop.register(conn, org.gtk.gio.DtlsConnection.fromAddress).marshal(conn, null), Marshal.integerToBoolean.marshal(shutdownRead, null).booleanValue(), Marshal.integerToBoolean.marshal(shutdownWrite, null).booleanValue(), ioPriority, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ShutdownAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code shutdown_async}
     * @param shutdownAsync The new value of the field {@code shutdown_async}
     */
    public void setShutdownAsync(ShutdownAsyncCallback shutdownAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("shutdown_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (shutdownAsync == null ? MemoryAddress.NULL : shutdownAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ShutdownFinishCallback} callback.
     */
    @FunctionalInterface
    public interface ShutdownFinishCallback {
    
        boolean run(org.gtk.gio.DtlsConnection conn, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default int upcall(MemoryAddress conn, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.DtlsConnection) Interop.register(conn, org.gtk.gio.DtlsConnection.fromAddress).marshal(conn, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ShutdownFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code shutdown_finish}
     * @param shutdownFinish The new value of the field {@code shutdown_finish}
     */
    public void setShutdownFinish(ShutdownFinishCallback shutdownFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("shutdown_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (shutdownFinish == null ? MemoryAddress.NULL : shutdownFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetAdvertisedProtocolsCallback} callback.
     */
    @FunctionalInterface
    public interface SetAdvertisedProtocolsCallback {
    
        void run(org.gtk.gio.DtlsConnection conn, @Nullable PointerString protocols);
        
        @ApiStatus.Internal default void upcall(MemoryAddress conn, MemoryAddress protocols) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.DtlsConnection) Interop.register(conn, org.gtk.gio.DtlsConnection.fromAddress).marshal(conn, null), new PointerString(protocols));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetAdvertisedProtocolsCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_advertised_protocols}
     * @param setAdvertisedProtocols The new value of the field {@code set_advertised_protocols}
     */
    public void setSetAdvertisedProtocols(SetAdvertisedProtocolsCallback setAdvertisedProtocols) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_advertised_protocols"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setAdvertisedProtocols == null ? MemoryAddress.NULL : setAdvertisedProtocols.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetNegotiatedProtocolCallback} callback.
     */
    @FunctionalInterface
    public interface GetNegotiatedProtocolCallback {
    
        @Nullable java.lang.String run(org.gtk.gio.DtlsConnection conn);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress conn) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.DtlsConnection) Interop.register(conn, org.gtk.gio.DtlsConnection.fromAddress).marshal(conn, null));
                return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, SCOPE)).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetNegotiatedProtocolCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_negotiated_protocol}
     * @param getNegotiatedProtocol The new value of the field {@code get_negotiated_protocol}
     */
    public void setGetNegotiatedProtocol(GetNegotiatedProtocolCallback getNegotiatedProtocol) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_negotiated_protocol"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getNegotiatedProtocol == null ? MemoryAddress.NULL : getNegotiatedProtocol.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetBindingDataCallback} callback.
     */
    @FunctionalInterface
    public interface GetBindingDataCallback {
    
        boolean run(org.gtk.gio.DtlsConnection conn, org.gtk.gio.TlsChannelBindingType type, PointerByte data);
        
        @ApiStatus.Internal default int upcall(MemoryAddress conn, int type, MemoryAddress data) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.DtlsConnection) Interop.register(conn, org.gtk.gio.DtlsConnection.fromAddress).marshal(conn, null), org.gtk.gio.TlsChannelBindingType.of(type), new PointerByte(data));
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetBindingDataCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_binding_data}
     * @param getBindingData The new value of the field {@code get_binding_data}
     */
    public void setGetBindingData(GetBindingDataCallback getBindingData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_binding_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getBindingData == null ? MemoryAddress.NULL : getBindingData.toCallback()));
        }
    }
    
    /**
     * Create a DtlsConnectionInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DtlsConnectionInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DtlsConnectionInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DtlsConnectionInterface(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
                return this;
            }
        }
        
        public Builder setAcceptCertificate(AcceptCertificateCallback acceptCertificate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("accept_certificate"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (acceptCertificate == null ? MemoryAddress.NULL : acceptCertificate.toCallback()));
                return this;
            }
        }
        
        public Builder setHandshake(HandshakeCallback handshake) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("handshake"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (handshake == null ? MemoryAddress.NULL : handshake.toCallback()));
                return this;
            }
        }
        
        public Builder setHandshakeAsync(HandshakeAsyncCallback handshakeAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("handshake_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (handshakeAsync == null ? MemoryAddress.NULL : handshakeAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setHandshakeFinish(HandshakeFinishCallback handshakeFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("handshake_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (handshakeFinish == null ? MemoryAddress.NULL : handshakeFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setShutdown(ShutdownCallback shutdown) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("shutdown"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (shutdown == null ? MemoryAddress.NULL : shutdown.toCallback()));
                return this;
            }
        }
        
        public Builder setShutdownAsync(ShutdownAsyncCallback shutdownAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("shutdown_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (shutdownAsync == null ? MemoryAddress.NULL : shutdownAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setShutdownFinish(ShutdownFinishCallback shutdownFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("shutdown_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (shutdownFinish == null ? MemoryAddress.NULL : shutdownFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setSetAdvertisedProtocols(SetAdvertisedProtocolsCallback setAdvertisedProtocols) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_advertised_protocols"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setAdvertisedProtocols == null ? MemoryAddress.NULL : setAdvertisedProtocols.toCallback()));
                return this;
            }
        }
        
        public Builder setGetNegotiatedProtocol(GetNegotiatedProtocolCallback getNegotiatedProtocol) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_negotiated_protocol"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getNegotiatedProtocol == null ? MemoryAddress.NULL : getNegotiatedProtocol.toCallback()));
                return this;
            }
        }
        
        public Builder setGetBindingData(GetBindingDataCallback getBindingData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_binding_data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getBindingData == null ? MemoryAddress.NULL : getBindingData.toCallback()));
                return this;
            }
        }
    }
}
