package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The class structure for the {@link TlsConnection} type.
 * @version 2.28
 */
public class TlsConnectionClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTlsConnectionClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gio.IOStreamClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("accept_certificate"),
            Interop.valueLayout.ADDRESS.withName("handshake"),
            Interop.valueLayout.ADDRESS.withName("handshake_async"),
            Interop.valueLayout.ADDRESS.withName("handshake_finish"),
            Interop.valueLayout.ADDRESS.withName("get_binding_data"),
            Interop.valueLayout.ADDRESS.withName("get_negotiated_protocol"),
            MemoryLayout.sequenceLayout(6, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TlsConnectionClass}
     * @return A new, uninitialized @{link TlsConnectionClass}
     */
    public static TlsConnectionClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TlsConnectionClass newInstance = new TlsConnectionClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gio.IOStreamClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gio.IOStreamClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gio.IOStreamClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code AcceptCertificateCallback} callback.
     */
    @FunctionalInterface
    public interface AcceptCertificateCallback {
    
        boolean run(org.gtk.gio.TlsConnection connection, org.gtk.gio.TlsCertificate peerCert, org.gtk.gio.TlsCertificateFlags errors);
        
        @ApiStatus.Internal default int upcall(MemoryAddress connection, MemoryAddress peerCert, int errors) {
            var RESULT = run((org.gtk.gio.TlsConnection) Interop.register(connection, org.gtk.gio.TlsConnection.fromAddress).marshal(connection, null), (org.gtk.gio.TlsCertificate) Interop.register(peerCert, org.gtk.gio.TlsCertificate.fromAddress).marshal(peerCert, null), new org.gtk.gio.TlsCertificateFlags(errors));
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
    
        boolean run(org.gtk.gio.TlsConnection conn, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default int upcall(MemoryAddress conn, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.TlsConnection) Interop.register(conn, org.gtk.gio.TlsConnection.fromAddress).marshal(conn, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
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
    
        void run(org.gtk.gio.TlsConnection conn, int ioPriority, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress conn, int ioPriority, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.TlsConnection) Interop.register(conn, org.gtk.gio.TlsConnection.fromAddress).marshal(conn, null), ioPriority, (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
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
    
        boolean run(org.gtk.gio.TlsConnection conn, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default int upcall(MemoryAddress conn, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.TlsConnection) Interop.register(conn, org.gtk.gio.TlsConnection.fromAddress).marshal(conn, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
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
     * Functional interface declaration of the {@code GetBindingDataCallback} callback.
     */
    @FunctionalInterface
    public interface GetBindingDataCallback {
    
        boolean run(org.gtk.gio.TlsConnection conn, org.gtk.gio.TlsChannelBindingType type, PointerByte data);
        
        @ApiStatus.Internal default int upcall(MemoryAddress conn, int type, MemoryAddress data) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.TlsConnection) Interop.register(conn, org.gtk.gio.TlsConnection.fromAddress).marshal(conn, null), org.gtk.gio.TlsChannelBindingType.of(type), new PointerByte(data));
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
     * Functional interface declaration of the {@code GetNegotiatedProtocolCallback} callback.
     */
    @FunctionalInterface
    public interface GetNegotiatedProtocolCallback {
    
        @Nullable java.lang.String run(org.gtk.gio.TlsConnection conn);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress conn) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.TlsConnection) Interop.register(conn, org.gtk.gio.TlsConnection.fromAddress).marshal(conn, null));
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
     * Create a TlsConnectionClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TlsConnectionClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TlsConnectionClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TlsConnectionClass(input);
    
    /**
     * A {@link TlsConnectionClass.Builder} object constructs a {@link TlsConnectionClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TlsConnectionClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TlsConnectionClass struct;
        
        private Builder() {
            struct = TlsConnectionClass.allocate();
        }
        
        /**
         * Finish building the {@link TlsConnectionClass} struct.
         * @return A new instance of {@code TlsConnectionClass} with the fields 
         *         that were set in the Builder object.
         */
        public TlsConnectionClass build() {
            return struct;
        }
        
        /**
         * The parent class.
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gtk.gio.IOStreamClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
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
        
        public Builder setGetBindingData(GetBindingDataCallback getBindingData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_binding_data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getBindingData == null ? MemoryAddress.NULL : getBindingData.toCallback()));
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
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false, SCOPE)));
                return this;
            }
        }
    }
}
