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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
    public org.gtk.gobject.ObjectClass parentClass$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gobject.ObjectClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a TlsDatabaseClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TlsDatabaseClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private TlsDatabaseClass struct;
        
         /**
         * A {@link TlsDatabaseClass.Build} object constructs a {@link TlsDatabaseClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = TlsDatabaseClass.allocate();
        }
        
         /**
         * Finish building the {@link TlsDatabaseClass} struct.
         * @return A new instance of {@code TlsDatabaseClass} with the fields 
         *         that were set in the Build object.
         */
        public TlsDatabaseClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setVerifyChain(java.lang.foreign.MemoryAddress verifyChain) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("verify_chain"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (verifyChain == null ? MemoryAddress.NULL : verifyChain));
            return this;
        }
        
        public Build setVerifyChainAsync(java.lang.foreign.MemoryAddress verifyChainAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("verify_chain_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (verifyChainAsync == null ? MemoryAddress.NULL : verifyChainAsync));
            return this;
        }
        
        public Build setVerifyChainFinish(java.lang.foreign.MemoryAddress verifyChainFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("verify_chain_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (verifyChainFinish == null ? MemoryAddress.NULL : verifyChainFinish));
            return this;
        }
        
        public Build setCreateCertificateHandle(java.lang.foreign.MemoryAddress createCertificateHandle) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_certificate_handle"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createCertificateHandle == null ? MemoryAddress.NULL : createCertificateHandle));
            return this;
        }
        
        public Build setLookupCertificateForHandle(java.lang.foreign.MemoryAddress lookupCertificateForHandle) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_for_handle"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupCertificateForHandle == null ? MemoryAddress.NULL : lookupCertificateForHandle));
            return this;
        }
        
        public Build setLookupCertificateForHandleAsync(java.lang.foreign.MemoryAddress lookupCertificateForHandleAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_for_handle_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupCertificateForHandleAsync == null ? MemoryAddress.NULL : lookupCertificateForHandleAsync));
            return this;
        }
        
        public Build setLookupCertificateForHandleFinish(java.lang.foreign.MemoryAddress lookupCertificateForHandleFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_for_handle_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupCertificateForHandleFinish == null ? MemoryAddress.NULL : lookupCertificateForHandleFinish));
            return this;
        }
        
        public Build setLookupCertificateIssuer(java.lang.foreign.MemoryAddress lookupCertificateIssuer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_issuer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupCertificateIssuer == null ? MemoryAddress.NULL : lookupCertificateIssuer));
            return this;
        }
        
        public Build setLookupCertificateIssuerAsync(java.lang.foreign.MemoryAddress lookupCertificateIssuerAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_issuer_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupCertificateIssuerAsync == null ? MemoryAddress.NULL : lookupCertificateIssuerAsync));
            return this;
        }
        
        public Build setLookupCertificateIssuerFinish(java.lang.foreign.MemoryAddress lookupCertificateIssuerFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_issuer_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupCertificateIssuerFinish == null ? MemoryAddress.NULL : lookupCertificateIssuerFinish));
            return this;
        }
        
        public Build setLookupCertificatesIssuedBy(java.lang.foreign.MemoryAddress lookupCertificatesIssuedBy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificates_issued_by"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupCertificatesIssuedBy == null ? MemoryAddress.NULL : lookupCertificatesIssuedBy));
            return this;
        }
        
        public Build setLookupCertificatesIssuedByAsync(java.lang.foreign.MemoryAddress lookupCertificatesIssuedByAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificates_issued_by_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupCertificatesIssuedByAsync == null ? MemoryAddress.NULL : lookupCertificatesIssuedByAsync));
            return this;
        }
        
        public Build setLookupCertificatesIssuedByFinish(java.lang.foreign.MemoryAddress lookupCertificatesIssuedByFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificates_issued_by_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookupCertificatesIssuedByFinish == null ? MemoryAddress.NULL : lookupCertificatesIssuedByFinish));
            return this;
        }
        
        public Build setPadding(java.lang.foreign.MemoryAddress[] padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false)));
            return this;
        }
    }
}
