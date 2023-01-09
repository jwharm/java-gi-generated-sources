package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The class for {@link TlsDatabase}. Derived classes should implement the various
 * virtual methods. _async and _finish methods have a default
 * implementation that runs the corresponding sync method in a thread.
 * @version 2.30
 */
public class TlsDatabaseClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTlsDatabaseClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("verify_chain"),
            Interop.valueLayout.ADDRESS.withName("verify_chain_async"),
            Interop.valueLayout.ADDRESS.withName("verify_chain_finish"),
            Interop.valueLayout.ADDRESS.withName("create_certificate_handle"),
            Interop.valueLayout.ADDRESS.withName("lookup_certificate_for_handle"),
            Interop.valueLayout.ADDRESS.withName("lookup_certificate_for_handle_async"),
            Interop.valueLayout.ADDRESS.withName("lookup_certificate_for_handle_finish"),
            Interop.valueLayout.ADDRESS.withName("lookup_certificate_issuer"),
            Interop.valueLayout.ADDRESS.withName("lookup_certificate_issuer_async"),
            Interop.valueLayout.ADDRESS.withName("lookup_certificate_issuer_finish"),
            Interop.valueLayout.ADDRESS.withName("lookup_certificates_issued_by"),
            Interop.valueLayout.ADDRESS.withName("lookup_certificates_issued_by_async"),
            Interop.valueLayout.ADDRESS.withName("lookup_certificates_issued_by_finish"),
            MemoryLayout.sequenceLayout(16, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TlsDatabaseClass}
     * @return A new, uninitialized @{link TlsDatabaseClass}
     */
    public static TlsDatabaseClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TlsDatabaseClass newInstance = new TlsDatabaseClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gobject.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gobject.ObjectClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code VerifyChainCallback} callback.
     */
    @FunctionalInterface
    public interface VerifyChainCallback {
    
        org.gtk.gio.TlsCertificateFlags run(org.gtk.gio.TlsDatabase self, org.gtk.gio.TlsCertificate chain, java.lang.String purpose, @Nullable org.gtk.gio.SocketConnectable identity, @Nullable org.gtk.gio.TlsInteraction interaction, org.gtk.gio.TlsDatabaseVerifyFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default int upcall(MemoryAddress self, MemoryAddress chain, MemoryAddress purpose, MemoryAddress identity, MemoryAddress interaction, int flags, MemoryAddress cancellable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.TlsDatabase) Interop.register(self, org.gtk.gio.TlsDatabase.fromAddress).marshal(self, null), (org.gtk.gio.TlsCertificate) Interop.register(chain, org.gtk.gio.TlsCertificate.fromAddress).marshal(chain, null), Marshal.addressToString.marshal(purpose, null), (org.gtk.gio.SocketConnectable) Interop.register(identity, org.gtk.gio.SocketConnectable.fromAddress).marshal(identity, null), (org.gtk.gio.TlsInteraction) Interop.register(interaction, org.gtk.gio.TlsInteraction.fromAddress).marshal(interaction, null), new org.gtk.gio.TlsDatabaseVerifyFlags(flags), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
                return RESULT.getValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), VerifyChainCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code verify_chain}
     * @param verifyChain The new value of the field {@code verify_chain}
     */
    public void setVerifyChain(VerifyChainCallback verifyChain) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("verify_chain"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (verifyChain == null ? MemoryAddress.NULL : verifyChain.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code VerifyChainAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface VerifyChainAsyncCallback {
    
        void run(org.gtk.gio.TlsDatabase self, org.gtk.gio.TlsCertificate chain, java.lang.String purpose, @Nullable org.gtk.gio.SocketConnectable identity, @Nullable org.gtk.gio.TlsInteraction interaction, org.gtk.gio.TlsDatabaseVerifyFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress self, MemoryAddress chain, MemoryAddress purpose, MemoryAddress identity, MemoryAddress interaction, int flags, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.TlsDatabase) Interop.register(self, org.gtk.gio.TlsDatabase.fromAddress).marshal(self, null), (org.gtk.gio.TlsCertificate) Interop.register(chain, org.gtk.gio.TlsCertificate.fromAddress).marshal(chain, null), Marshal.addressToString.marshal(purpose, null), (org.gtk.gio.SocketConnectable) Interop.register(identity, org.gtk.gio.SocketConnectable.fromAddress).marshal(identity, null), (org.gtk.gio.TlsInteraction) Interop.register(interaction, org.gtk.gio.TlsInteraction.fromAddress).marshal(interaction, null), new org.gtk.gio.TlsDatabaseVerifyFlags(flags), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), VerifyChainAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code verify_chain_async}
     * @param verifyChainAsync The new value of the field {@code verify_chain_async}
     */
    public void setVerifyChainAsync(VerifyChainAsyncCallback verifyChainAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("verify_chain_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (verifyChainAsync == null ? MemoryAddress.NULL : verifyChainAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code VerifyChainFinishCallback} callback.
     */
    @FunctionalInterface
    public interface VerifyChainFinishCallback {
    
        org.gtk.gio.TlsCertificateFlags run(org.gtk.gio.TlsDatabase self, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default int upcall(MemoryAddress self, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.TlsDatabase) Interop.register(self, org.gtk.gio.TlsDatabase.fromAddress).marshal(self, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), VerifyChainFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code verify_chain_finish}
     * @param verifyChainFinish The new value of the field {@code verify_chain_finish}
     */
    public void setVerifyChainFinish(VerifyChainFinishCallback verifyChainFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("verify_chain_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (verifyChainFinish == null ? MemoryAddress.NULL : verifyChainFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CreateCertificateHandleCallback} callback.
     */
    @FunctionalInterface
    public interface CreateCertificateHandleCallback {
    
        @Nullable java.lang.String run(org.gtk.gio.TlsDatabase self, org.gtk.gio.TlsCertificate certificate);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress self, MemoryAddress certificate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.TlsDatabase) Interop.register(self, org.gtk.gio.TlsDatabase.fromAddress).marshal(self, null), (org.gtk.gio.TlsCertificate) Interop.register(certificate, org.gtk.gio.TlsCertificate.fromAddress).marshal(certificate, null));
                return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, SCOPE)).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CreateCertificateHandleCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_certificate_handle}
     * @param createCertificateHandle The new value of the field {@code create_certificate_handle}
     */
    public void setCreateCertificateHandle(CreateCertificateHandleCallback createCertificateHandle) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_certificate_handle"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createCertificateHandle == null ? MemoryAddress.NULL : createCertificateHandle.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LookupCertificateForHandleCallback} callback.
     */
    @FunctionalInterface
    public interface LookupCertificateForHandleCallback {
    
        @Nullable org.gtk.gio.TlsCertificate run(org.gtk.gio.TlsDatabase self, java.lang.String handle, @Nullable org.gtk.gio.TlsInteraction interaction, org.gtk.gio.TlsDatabaseLookupFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress self, MemoryAddress handle, MemoryAddress interaction, int flags, MemoryAddress cancellable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.TlsDatabase) Interop.register(self, org.gtk.gio.TlsDatabase.fromAddress).marshal(self, null), Marshal.addressToString.marshal(handle, null), (org.gtk.gio.TlsInteraction) Interop.register(interaction, org.gtk.gio.TlsInteraction.fromAddress).marshal(interaction, null), org.gtk.gio.TlsDatabaseLookupFlags.of(flags), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
                RESULT.yieldOwnership();
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LookupCertificateForHandleCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_certificate_for_handle}
     * @param lookupCertificateForHandle The new value of the field {@code lookup_certificate_for_handle}
     */
    public void setLookupCertificateForHandle(LookupCertificateForHandleCallback lookupCertificateForHandle) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_for_handle"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupCertificateForHandle == null ? MemoryAddress.NULL : lookupCertificateForHandle.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LookupCertificateForHandleAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface LookupCertificateForHandleAsyncCallback {
    
        void run(org.gtk.gio.TlsDatabase self, java.lang.String handle, @Nullable org.gtk.gio.TlsInteraction interaction, org.gtk.gio.TlsDatabaseLookupFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress self, MemoryAddress handle, MemoryAddress interaction, int flags, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.TlsDatabase) Interop.register(self, org.gtk.gio.TlsDatabase.fromAddress).marshal(self, null), Marshal.addressToString.marshal(handle, null), (org.gtk.gio.TlsInteraction) Interop.register(interaction, org.gtk.gio.TlsInteraction.fromAddress).marshal(interaction, null), org.gtk.gio.TlsDatabaseLookupFlags.of(flags), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LookupCertificateForHandleAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_certificate_for_handle_async}
     * @param lookupCertificateForHandleAsync The new value of the field {@code lookup_certificate_for_handle_async}
     */
    public void setLookupCertificateForHandleAsync(LookupCertificateForHandleAsyncCallback lookupCertificateForHandleAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_for_handle_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupCertificateForHandleAsync == null ? MemoryAddress.NULL : lookupCertificateForHandleAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LookupCertificateForHandleFinishCallback} callback.
     */
    @FunctionalInterface
    public interface LookupCertificateForHandleFinishCallback {
    
        org.gtk.gio.TlsCertificate run(org.gtk.gio.TlsDatabase self, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress self, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.TlsDatabase) Interop.register(self, org.gtk.gio.TlsDatabase.fromAddress).marshal(self, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LookupCertificateForHandleFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_certificate_for_handle_finish}
     * @param lookupCertificateForHandleFinish The new value of the field {@code lookup_certificate_for_handle_finish}
     */
    public void setLookupCertificateForHandleFinish(LookupCertificateForHandleFinishCallback lookupCertificateForHandleFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_for_handle_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupCertificateForHandleFinish == null ? MemoryAddress.NULL : lookupCertificateForHandleFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LookupCertificateIssuerCallback} callback.
     */
    @FunctionalInterface
    public interface LookupCertificateIssuerCallback {
    
        org.gtk.gio.TlsCertificate run(org.gtk.gio.TlsDatabase self, org.gtk.gio.TlsCertificate certificate, @Nullable org.gtk.gio.TlsInteraction interaction, org.gtk.gio.TlsDatabaseLookupFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress self, MemoryAddress certificate, MemoryAddress interaction, int flags, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.TlsDatabase) Interop.register(self, org.gtk.gio.TlsDatabase.fromAddress).marshal(self, null), (org.gtk.gio.TlsCertificate) Interop.register(certificate, org.gtk.gio.TlsCertificate.fromAddress).marshal(certificate, null), (org.gtk.gio.TlsInteraction) Interop.register(interaction, org.gtk.gio.TlsInteraction.fromAddress).marshal(interaction, null), org.gtk.gio.TlsDatabaseLookupFlags.of(flags), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LookupCertificateIssuerCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_certificate_issuer}
     * @param lookupCertificateIssuer The new value of the field {@code lookup_certificate_issuer}
     */
    public void setLookupCertificateIssuer(LookupCertificateIssuerCallback lookupCertificateIssuer) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_issuer"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupCertificateIssuer == null ? MemoryAddress.NULL : lookupCertificateIssuer.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LookupCertificateIssuerAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface LookupCertificateIssuerAsyncCallback {
    
        void run(org.gtk.gio.TlsDatabase self, org.gtk.gio.TlsCertificate certificate, @Nullable org.gtk.gio.TlsInteraction interaction, org.gtk.gio.TlsDatabaseLookupFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress self, MemoryAddress certificate, MemoryAddress interaction, int flags, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.TlsDatabase) Interop.register(self, org.gtk.gio.TlsDatabase.fromAddress).marshal(self, null), (org.gtk.gio.TlsCertificate) Interop.register(certificate, org.gtk.gio.TlsCertificate.fromAddress).marshal(certificate, null), (org.gtk.gio.TlsInteraction) Interop.register(interaction, org.gtk.gio.TlsInteraction.fromAddress).marshal(interaction, null), org.gtk.gio.TlsDatabaseLookupFlags.of(flags), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LookupCertificateIssuerAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_certificate_issuer_async}
     * @param lookupCertificateIssuerAsync The new value of the field {@code lookup_certificate_issuer_async}
     */
    public void setLookupCertificateIssuerAsync(LookupCertificateIssuerAsyncCallback lookupCertificateIssuerAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_issuer_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupCertificateIssuerAsync == null ? MemoryAddress.NULL : lookupCertificateIssuerAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LookupCertificateIssuerFinishCallback} callback.
     */
    @FunctionalInterface
    public interface LookupCertificateIssuerFinishCallback {
    
        org.gtk.gio.TlsCertificate run(org.gtk.gio.TlsDatabase self, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress self, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.TlsDatabase) Interop.register(self, org.gtk.gio.TlsDatabase.fromAddress).marshal(self, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LookupCertificateIssuerFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_certificate_issuer_finish}
     * @param lookupCertificateIssuerFinish The new value of the field {@code lookup_certificate_issuer_finish}
     */
    public void setLookupCertificateIssuerFinish(LookupCertificateIssuerFinishCallback lookupCertificateIssuerFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_issuer_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupCertificateIssuerFinish == null ? MemoryAddress.NULL : lookupCertificateIssuerFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LookupCertificatesIssuedByCallback} callback.
     */
    @FunctionalInterface
    public interface LookupCertificatesIssuedByCallback {
    
        org.gtk.glib.List run(org.gtk.gio.TlsDatabase self, PointerByte issuerRawDn, @Nullable org.gtk.gio.TlsInteraction interaction, org.gtk.gio.TlsDatabaseLookupFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress self, MemoryAddress issuerRawDn, MemoryAddress interaction, int flags, MemoryAddress cancellable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.TlsDatabase) Interop.register(self, org.gtk.gio.TlsDatabase.fromAddress).marshal(self, null), new PointerByte(issuerRawDn), (org.gtk.gio.TlsInteraction) Interop.register(interaction, org.gtk.gio.TlsInteraction.fromAddress).marshal(interaction, null), org.gtk.gio.TlsDatabaseLookupFlags.of(flags), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
                RESULT.yieldOwnership();
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LookupCertificatesIssuedByCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_certificates_issued_by}
     * @param lookupCertificatesIssuedBy The new value of the field {@code lookup_certificates_issued_by}
     */
    public void setLookupCertificatesIssuedBy(LookupCertificatesIssuedByCallback lookupCertificatesIssuedBy) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificates_issued_by"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupCertificatesIssuedBy == null ? MemoryAddress.NULL : lookupCertificatesIssuedBy.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LookupCertificatesIssuedByAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface LookupCertificatesIssuedByAsyncCallback {
    
        void run(org.gtk.gio.TlsDatabase self, PointerByte issuerRawDn, @Nullable org.gtk.gio.TlsInteraction interaction, org.gtk.gio.TlsDatabaseLookupFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress self, MemoryAddress issuerRawDn, MemoryAddress interaction, int flags, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.TlsDatabase) Interop.register(self, org.gtk.gio.TlsDatabase.fromAddress).marshal(self, null), new PointerByte(issuerRawDn), (org.gtk.gio.TlsInteraction) Interop.register(interaction, org.gtk.gio.TlsInteraction.fromAddress).marshal(interaction, null), org.gtk.gio.TlsDatabaseLookupFlags.of(flags), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LookupCertificatesIssuedByAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_certificates_issued_by_async}
     * @param lookupCertificatesIssuedByAsync The new value of the field {@code lookup_certificates_issued_by_async}
     */
    public void setLookupCertificatesIssuedByAsync(LookupCertificatesIssuedByAsyncCallback lookupCertificatesIssuedByAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificates_issued_by_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupCertificatesIssuedByAsync == null ? MemoryAddress.NULL : lookupCertificatesIssuedByAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LookupCertificatesIssuedByFinishCallback} callback.
     */
    @FunctionalInterface
    public interface LookupCertificatesIssuedByFinishCallback {
    
        org.gtk.glib.List run(org.gtk.gio.TlsDatabase self, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress self, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.TlsDatabase) Interop.register(self, org.gtk.gio.TlsDatabase.fromAddress).marshal(self, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LookupCertificatesIssuedByFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_certificates_issued_by_finish}
     * @param lookupCertificatesIssuedByFinish The new value of the field {@code lookup_certificates_issued_by_finish}
     */
    public void setLookupCertificatesIssuedByFinish(LookupCertificatesIssuedByFinishCallback lookupCertificatesIssuedByFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificates_issued_by_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupCertificatesIssuedByFinish == null ? MemoryAddress.NULL : lookupCertificatesIssuedByFinish.toCallback()));
        }
    }
    
    /**
     * Create a TlsDatabaseClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TlsDatabaseClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TlsDatabaseClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TlsDatabaseClass(input);
    
    /**
     * A {@link TlsDatabaseClass.Builder} object constructs a {@link TlsDatabaseClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TlsDatabaseClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TlsDatabaseClass struct;
        
        private Builder() {
            struct = TlsDatabaseClass.allocate();
        }
        
        /**
         * Finish building the {@link TlsDatabaseClass} struct.
         * @return A new instance of {@code TlsDatabaseClass} with the fields 
         *         that were set in the Builder object.
         */
        public TlsDatabaseClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setVerifyChain(VerifyChainCallback verifyChain) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("verify_chain"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (verifyChain == null ? MemoryAddress.NULL : verifyChain.toCallback()));
                return this;
            }
        }
        
        public Builder setVerifyChainAsync(VerifyChainAsyncCallback verifyChainAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("verify_chain_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (verifyChainAsync == null ? MemoryAddress.NULL : verifyChainAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setVerifyChainFinish(VerifyChainFinishCallback verifyChainFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("verify_chain_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (verifyChainFinish == null ? MemoryAddress.NULL : verifyChainFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setCreateCertificateHandle(CreateCertificateHandleCallback createCertificateHandle) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("create_certificate_handle"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createCertificateHandle == null ? MemoryAddress.NULL : createCertificateHandle.toCallback()));
                return this;
            }
        }
        
        public Builder setLookupCertificateForHandle(LookupCertificateForHandleCallback lookupCertificateForHandle) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_for_handle"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupCertificateForHandle == null ? MemoryAddress.NULL : lookupCertificateForHandle.toCallback()));
                return this;
            }
        }
        
        public Builder setLookupCertificateForHandleAsync(LookupCertificateForHandleAsyncCallback lookupCertificateForHandleAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_for_handle_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupCertificateForHandleAsync == null ? MemoryAddress.NULL : lookupCertificateForHandleAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setLookupCertificateForHandleFinish(LookupCertificateForHandleFinishCallback lookupCertificateForHandleFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_for_handle_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupCertificateForHandleFinish == null ? MemoryAddress.NULL : lookupCertificateForHandleFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setLookupCertificateIssuer(LookupCertificateIssuerCallback lookupCertificateIssuer) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_issuer"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupCertificateIssuer == null ? MemoryAddress.NULL : lookupCertificateIssuer.toCallback()));
                return this;
            }
        }
        
        public Builder setLookupCertificateIssuerAsync(LookupCertificateIssuerAsyncCallback lookupCertificateIssuerAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_issuer_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupCertificateIssuerAsync == null ? MemoryAddress.NULL : lookupCertificateIssuerAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setLookupCertificateIssuerFinish(LookupCertificateIssuerFinishCallback lookupCertificateIssuerFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_issuer_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupCertificateIssuerFinish == null ? MemoryAddress.NULL : lookupCertificateIssuerFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setLookupCertificatesIssuedBy(LookupCertificatesIssuedByCallback lookupCertificatesIssuedBy) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificates_issued_by"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupCertificatesIssuedBy == null ? MemoryAddress.NULL : lookupCertificatesIssuedBy.toCallback()));
                return this;
            }
        }
        
        public Builder setLookupCertificatesIssuedByAsync(LookupCertificatesIssuedByAsyncCallback lookupCertificatesIssuedByAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificates_issued_by_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupCertificatesIssuedByAsync == null ? MemoryAddress.NULL : lookupCertificatesIssuedByAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setLookupCertificatesIssuedByFinish(LookupCertificatesIssuedByFinishCallback lookupCertificatesIssuedByFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificates_issued_by_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (lookupCertificatesIssuedByFinish == null ? MemoryAddress.NULL : lookupCertificatesIssuedByFinish.toCallback()));
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
