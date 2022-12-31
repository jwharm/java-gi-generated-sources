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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TlsDatabaseClass newInstance = new TlsDatabaseClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gobject.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gobject.ObjectClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface VerifyChainCallback {
        org.gtk.gio.TlsCertificateFlags run(org.gtk.gio.TlsDatabase self, org.gtk.gio.TlsCertificate chain, java.lang.String purpose, @Nullable org.gtk.gio.SocketConnectable identity, @Nullable org.gtk.gio.TlsInteraction interaction, org.gtk.gio.TlsDatabaseVerifyFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default int upcall(MemoryAddress self, MemoryAddress chain, MemoryAddress purpose, MemoryAddress identity, MemoryAddress interaction, int flags, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.TlsDatabase) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gtk.gio.TlsDatabase.fromAddress).marshal(self, Ownership.NONE), (org.gtk.gio.TlsCertificate) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(chain)), org.gtk.gio.TlsCertificate.fromAddress).marshal(chain, Ownership.NONE), Marshal.addressToString.marshal(purpose, null), (org.gtk.gio.SocketConnectable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(identity)), org.gtk.gio.SocketConnectable.fromAddress).marshal(identity, Ownership.NONE), (org.gtk.gio.TlsInteraction) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interaction)), org.gtk.gio.TlsInteraction.fromAddress).marshal(interaction, Ownership.NONE), new org.gtk.gio.TlsDatabaseVerifyFlags(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(VerifyChainCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code verify_chain}
     * @param verifyChain The new value of the field {@code verify_chain}
     */
    public void setVerifyChain(VerifyChainCallback verifyChain) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("verify_chain"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (verifyChain == null ? MemoryAddress.NULL : verifyChain.toCallback()));
    }
    
    @FunctionalInterface
    public interface VerifyChainAsyncCallback {
        void run(org.gtk.gio.TlsDatabase self, org.gtk.gio.TlsCertificate chain, java.lang.String purpose, @Nullable org.gtk.gio.SocketConnectable identity, @Nullable org.gtk.gio.TlsInteraction interaction, org.gtk.gio.TlsDatabaseVerifyFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress self, MemoryAddress chain, MemoryAddress purpose, MemoryAddress identity, MemoryAddress interaction, int flags, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.TlsDatabase) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gtk.gio.TlsDatabase.fromAddress).marshal(self, Ownership.NONE), (org.gtk.gio.TlsCertificate) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(chain)), org.gtk.gio.TlsCertificate.fromAddress).marshal(chain, Ownership.NONE), Marshal.addressToString.marshal(purpose, null), (org.gtk.gio.SocketConnectable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(identity)), org.gtk.gio.SocketConnectable.fromAddress).marshal(identity, Ownership.NONE), (org.gtk.gio.TlsInteraction) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interaction)), org.gtk.gio.TlsInteraction.fromAddress).marshal(interaction, Ownership.NONE), new org.gtk.gio.TlsDatabaseVerifyFlags(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(VerifyChainAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code verify_chain_async}
     * @param verifyChainAsync The new value of the field {@code verify_chain_async}
     */
    public void setVerifyChainAsync(VerifyChainAsyncCallback verifyChainAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("verify_chain_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (verifyChainAsync == null ? MemoryAddress.NULL : verifyChainAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface VerifyChainFinishCallback {
        org.gtk.gio.TlsCertificateFlags run(org.gtk.gio.TlsDatabase self, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress self, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.TlsDatabase) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gtk.gio.TlsDatabase.fromAddress).marshal(self, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(VerifyChainFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code verify_chain_finish}
     * @param verifyChainFinish The new value of the field {@code verify_chain_finish}
     */
    public void setVerifyChainFinish(VerifyChainFinishCallback verifyChainFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("verify_chain_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (verifyChainFinish == null ? MemoryAddress.NULL : verifyChainFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface CreateCertificateHandleCallback {
        @Nullable java.lang.String run(org.gtk.gio.TlsDatabase self, org.gtk.gio.TlsCertificate certificate);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress self, MemoryAddress certificate) {
            var RESULT = run((org.gtk.gio.TlsDatabase) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gtk.gio.TlsDatabase.fromAddress).marshal(self, Ownership.NONE), (org.gtk.gio.TlsCertificate) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(certificate)), org.gtk.gio.TlsCertificate.fromAddress).marshal(certificate, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CreateCertificateHandleCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_certificate_handle}
     * @param createCertificateHandle The new value of the field {@code create_certificate_handle}
     */
    public void setCreateCertificateHandle(CreateCertificateHandleCallback createCertificateHandle) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("create_certificate_handle"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createCertificateHandle == null ? MemoryAddress.NULL : createCertificateHandle.toCallback()));
    }
    
    @FunctionalInterface
    public interface LookupCertificateForHandleCallback {
        @Nullable org.gtk.gio.TlsCertificate run(org.gtk.gio.TlsDatabase self, java.lang.String handle, @Nullable org.gtk.gio.TlsInteraction interaction, org.gtk.gio.TlsDatabaseLookupFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress self, MemoryAddress handle, MemoryAddress interaction, int flags, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.TlsDatabase) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gtk.gio.TlsDatabase.fromAddress).marshal(self, Ownership.NONE), Marshal.addressToString.marshal(handle, null), (org.gtk.gio.TlsInteraction) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interaction)), org.gtk.gio.TlsInteraction.fromAddress).marshal(interaction, Ownership.NONE), org.gtk.gio.TlsDatabaseLookupFlags.of(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LookupCertificateForHandleCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_certificate_for_handle}
     * @param lookupCertificateForHandle The new value of the field {@code lookup_certificate_for_handle}
     */
    public void setLookupCertificateForHandle(LookupCertificateForHandleCallback lookupCertificateForHandle) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_for_handle"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupCertificateForHandle == null ? MemoryAddress.NULL : lookupCertificateForHandle.toCallback()));
    }
    
    @FunctionalInterface
    public interface LookupCertificateForHandleAsyncCallback {
        void run(org.gtk.gio.TlsDatabase self, java.lang.String handle, @Nullable org.gtk.gio.TlsInteraction interaction, org.gtk.gio.TlsDatabaseLookupFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress self, MemoryAddress handle, MemoryAddress interaction, int flags, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.TlsDatabase) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gtk.gio.TlsDatabase.fromAddress).marshal(self, Ownership.NONE), Marshal.addressToString.marshal(handle, null), (org.gtk.gio.TlsInteraction) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interaction)), org.gtk.gio.TlsInteraction.fromAddress).marshal(interaction, Ownership.NONE), org.gtk.gio.TlsDatabaseLookupFlags.of(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LookupCertificateForHandleAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_certificate_for_handle_async}
     * @param lookupCertificateForHandleAsync The new value of the field {@code lookup_certificate_for_handle_async}
     */
    public void setLookupCertificateForHandleAsync(LookupCertificateForHandleAsyncCallback lookupCertificateForHandleAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_for_handle_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupCertificateForHandleAsync == null ? MemoryAddress.NULL : lookupCertificateForHandleAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface LookupCertificateForHandleFinishCallback {
        org.gtk.gio.TlsCertificate run(org.gtk.gio.TlsDatabase self, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress self, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.TlsDatabase) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gtk.gio.TlsDatabase.fromAddress).marshal(self, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LookupCertificateForHandleFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_certificate_for_handle_finish}
     * @param lookupCertificateForHandleFinish The new value of the field {@code lookup_certificate_for_handle_finish}
     */
    public void setLookupCertificateForHandleFinish(LookupCertificateForHandleFinishCallback lookupCertificateForHandleFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_for_handle_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupCertificateForHandleFinish == null ? MemoryAddress.NULL : lookupCertificateForHandleFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface LookupCertificateIssuerCallback {
        org.gtk.gio.TlsCertificate run(org.gtk.gio.TlsDatabase self, org.gtk.gio.TlsCertificate certificate, @Nullable org.gtk.gio.TlsInteraction interaction, org.gtk.gio.TlsDatabaseLookupFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress self, MemoryAddress certificate, MemoryAddress interaction, int flags, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.TlsDatabase) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gtk.gio.TlsDatabase.fromAddress).marshal(self, Ownership.NONE), (org.gtk.gio.TlsCertificate) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(certificate)), org.gtk.gio.TlsCertificate.fromAddress).marshal(certificate, Ownership.NONE), (org.gtk.gio.TlsInteraction) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interaction)), org.gtk.gio.TlsInteraction.fromAddress).marshal(interaction, Ownership.NONE), org.gtk.gio.TlsDatabaseLookupFlags.of(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LookupCertificateIssuerCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_certificate_issuer}
     * @param lookupCertificateIssuer The new value of the field {@code lookup_certificate_issuer}
     */
    public void setLookupCertificateIssuer(LookupCertificateIssuerCallback lookupCertificateIssuer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_issuer"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupCertificateIssuer == null ? MemoryAddress.NULL : lookupCertificateIssuer.toCallback()));
    }
    
    @FunctionalInterface
    public interface LookupCertificateIssuerAsyncCallback {
        void run(org.gtk.gio.TlsDatabase self, org.gtk.gio.TlsCertificate certificate, @Nullable org.gtk.gio.TlsInteraction interaction, org.gtk.gio.TlsDatabaseLookupFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress self, MemoryAddress certificate, MemoryAddress interaction, int flags, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.TlsDatabase) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gtk.gio.TlsDatabase.fromAddress).marshal(self, Ownership.NONE), (org.gtk.gio.TlsCertificate) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(certificate)), org.gtk.gio.TlsCertificate.fromAddress).marshal(certificate, Ownership.NONE), (org.gtk.gio.TlsInteraction) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interaction)), org.gtk.gio.TlsInteraction.fromAddress).marshal(interaction, Ownership.NONE), org.gtk.gio.TlsDatabaseLookupFlags.of(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LookupCertificateIssuerAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_certificate_issuer_async}
     * @param lookupCertificateIssuerAsync The new value of the field {@code lookup_certificate_issuer_async}
     */
    public void setLookupCertificateIssuerAsync(LookupCertificateIssuerAsyncCallback lookupCertificateIssuerAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_issuer_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupCertificateIssuerAsync == null ? MemoryAddress.NULL : lookupCertificateIssuerAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface LookupCertificateIssuerFinishCallback {
        org.gtk.gio.TlsCertificate run(org.gtk.gio.TlsDatabase self, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress self, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.TlsDatabase) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gtk.gio.TlsDatabase.fromAddress).marshal(self, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LookupCertificateIssuerFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_certificate_issuer_finish}
     * @param lookupCertificateIssuerFinish The new value of the field {@code lookup_certificate_issuer_finish}
     */
    public void setLookupCertificateIssuerFinish(LookupCertificateIssuerFinishCallback lookupCertificateIssuerFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_issuer_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupCertificateIssuerFinish == null ? MemoryAddress.NULL : lookupCertificateIssuerFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface LookupCertificatesIssuedByCallback {
        org.gtk.glib.List run(org.gtk.gio.TlsDatabase self, PointerByte issuerRawDn, @Nullable org.gtk.gio.TlsInteraction interaction, org.gtk.gio.TlsDatabaseLookupFlags flags, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress self, MemoryAddress issuerRawDn, MemoryAddress interaction, int flags, MemoryAddress cancellable) {
            var RESULT = run((org.gtk.gio.TlsDatabase) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gtk.gio.TlsDatabase.fromAddress).marshal(self, Ownership.NONE), new PointerByte(issuerRawDn), (org.gtk.gio.TlsInteraction) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interaction)), org.gtk.gio.TlsInteraction.fromAddress).marshal(interaction, Ownership.NONE), org.gtk.gio.TlsDatabaseLookupFlags.of(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LookupCertificatesIssuedByCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_certificates_issued_by}
     * @param lookupCertificatesIssuedBy The new value of the field {@code lookup_certificates_issued_by}
     */
    public void setLookupCertificatesIssuedBy(LookupCertificatesIssuedByCallback lookupCertificatesIssuedBy) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificates_issued_by"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupCertificatesIssuedBy == null ? MemoryAddress.NULL : lookupCertificatesIssuedBy.toCallback()));
    }
    
    @FunctionalInterface
    public interface LookupCertificatesIssuedByAsyncCallback {
        void run(org.gtk.gio.TlsDatabase self, PointerByte issuerRawDn, @Nullable org.gtk.gio.TlsInteraction interaction, org.gtk.gio.TlsDatabaseLookupFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress self, MemoryAddress issuerRawDn, MemoryAddress interaction, int flags, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.TlsDatabase) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gtk.gio.TlsDatabase.fromAddress).marshal(self, Ownership.NONE), new PointerByte(issuerRawDn), (org.gtk.gio.TlsInteraction) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(interaction)), org.gtk.gio.TlsInteraction.fromAddress).marshal(interaction, Ownership.NONE), org.gtk.gio.TlsDatabaseLookupFlags.of(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LookupCertificatesIssuedByAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_certificates_issued_by_async}
     * @param lookupCertificatesIssuedByAsync The new value of the field {@code lookup_certificates_issued_by_async}
     */
    public void setLookupCertificatesIssuedByAsync(LookupCertificatesIssuedByAsyncCallback lookupCertificatesIssuedByAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificates_issued_by_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupCertificatesIssuedByAsync == null ? MemoryAddress.NULL : lookupCertificatesIssuedByAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface LookupCertificatesIssuedByFinishCallback {
        org.gtk.glib.List run(org.gtk.gio.TlsDatabase self, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress self, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.TlsDatabase) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gtk.gio.TlsDatabase.fromAddress).marshal(self, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LookupCertificatesIssuedByFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code lookup_certificates_issued_by_finish}
     * @param lookupCertificatesIssuedByFinish The new value of the field {@code lookup_certificates_issued_by_finish}
     */
    public void setLookupCertificatesIssuedByFinish(LookupCertificatesIssuedByFinishCallback lookupCertificatesIssuedByFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificates_issued_by_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupCertificatesIssuedByFinish == null ? MemoryAddress.NULL : lookupCertificatesIssuedByFinish.toCallback()));
    }
    
    /**
     * Create a TlsDatabaseClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TlsDatabaseClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TlsDatabaseClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TlsDatabaseClass(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setVerifyChain(VerifyChainCallback verifyChain) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("verify_chain"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (verifyChain == null ? MemoryAddress.NULL : verifyChain.toCallback()));
            return this;
        }
        
        public Builder setVerifyChainAsync(VerifyChainAsyncCallback verifyChainAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("verify_chain_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (verifyChainAsync == null ? MemoryAddress.NULL : verifyChainAsync.toCallback()));
            return this;
        }
        
        public Builder setVerifyChainFinish(VerifyChainFinishCallback verifyChainFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("verify_chain_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (verifyChainFinish == null ? MemoryAddress.NULL : verifyChainFinish.toCallback()));
            return this;
        }
        
        public Builder setCreateCertificateHandle(CreateCertificateHandleCallback createCertificateHandle) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_certificate_handle"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createCertificateHandle == null ? MemoryAddress.NULL : createCertificateHandle.toCallback()));
            return this;
        }
        
        public Builder setLookupCertificateForHandle(LookupCertificateForHandleCallback lookupCertificateForHandle) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_for_handle"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupCertificateForHandle == null ? MemoryAddress.NULL : lookupCertificateForHandle.toCallback()));
            return this;
        }
        
        public Builder setLookupCertificateForHandleAsync(LookupCertificateForHandleAsyncCallback lookupCertificateForHandleAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_for_handle_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupCertificateForHandleAsync == null ? MemoryAddress.NULL : lookupCertificateForHandleAsync.toCallback()));
            return this;
        }
        
        public Builder setLookupCertificateForHandleFinish(LookupCertificateForHandleFinishCallback lookupCertificateForHandleFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_for_handle_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupCertificateForHandleFinish == null ? MemoryAddress.NULL : lookupCertificateForHandleFinish.toCallback()));
            return this;
        }
        
        public Builder setLookupCertificateIssuer(LookupCertificateIssuerCallback lookupCertificateIssuer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_issuer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupCertificateIssuer == null ? MemoryAddress.NULL : lookupCertificateIssuer.toCallback()));
            return this;
        }
        
        public Builder setLookupCertificateIssuerAsync(LookupCertificateIssuerAsyncCallback lookupCertificateIssuerAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_issuer_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupCertificateIssuerAsync == null ? MemoryAddress.NULL : lookupCertificateIssuerAsync.toCallback()));
            return this;
        }
        
        public Builder setLookupCertificateIssuerFinish(LookupCertificateIssuerFinishCallback lookupCertificateIssuerFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_issuer_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupCertificateIssuerFinish == null ? MemoryAddress.NULL : lookupCertificateIssuerFinish.toCallback()));
            return this;
        }
        
        public Builder setLookupCertificatesIssuedBy(LookupCertificatesIssuedByCallback lookupCertificatesIssuedBy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificates_issued_by"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupCertificatesIssuedBy == null ? MemoryAddress.NULL : lookupCertificatesIssuedBy.toCallback()));
            return this;
        }
        
        public Builder setLookupCertificatesIssuedByAsync(LookupCertificatesIssuedByAsyncCallback lookupCertificatesIssuedByAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificates_issued_by_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupCertificatesIssuedByAsync == null ? MemoryAddress.NULL : lookupCertificatesIssuedByAsync.toCallback()));
            return this;
        }
        
        public Builder setLookupCertificatesIssuedByFinish(LookupCertificatesIssuedByFinishCallback lookupCertificatesIssuedByFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificates_issued_by_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupCertificatesIssuedByFinish == null ? MemoryAddress.NULL : lookupCertificatesIssuedByFinish.toCallback()));
            return this;
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false)));
            return this;
        }
    }
}
