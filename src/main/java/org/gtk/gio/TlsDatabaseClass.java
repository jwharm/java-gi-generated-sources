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
    public org.gtk.gobject.ObjectClass parent_class$get() {
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
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parent_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_class == null ? MemoryAddress.NULL : parent_class.handle()));
            return this;
        }
        
        public Build setVerifyChain(java.lang.foreign.MemoryAddress verify_chain) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("verify_chain"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (verify_chain == null ? MemoryAddress.NULL : verify_chain));
            return this;
        }
        
        public Build setVerifyChainAsync(java.lang.foreign.MemoryAddress verify_chain_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("verify_chain_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (verify_chain_async == null ? MemoryAddress.NULL : verify_chain_async));
            return this;
        }
        
        public Build setVerifyChainFinish(java.lang.foreign.MemoryAddress verify_chain_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("verify_chain_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (verify_chain_finish == null ? MemoryAddress.NULL : verify_chain_finish));
            return this;
        }
        
        public Build setCreateCertificateHandle(java.lang.foreign.MemoryAddress create_certificate_handle) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_certificate_handle"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (create_certificate_handle == null ? MemoryAddress.NULL : create_certificate_handle));
            return this;
        }
        
        public Build setLookupCertificateForHandle(java.lang.foreign.MemoryAddress lookup_certificate_for_handle) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_for_handle"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookup_certificate_for_handle == null ? MemoryAddress.NULL : lookup_certificate_for_handle));
            return this;
        }
        
        public Build setLookupCertificateForHandleAsync(java.lang.foreign.MemoryAddress lookup_certificate_for_handle_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_for_handle_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookup_certificate_for_handle_async == null ? MemoryAddress.NULL : lookup_certificate_for_handle_async));
            return this;
        }
        
        public Build setLookupCertificateForHandleFinish(java.lang.foreign.MemoryAddress lookup_certificate_for_handle_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_for_handle_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookup_certificate_for_handle_finish == null ? MemoryAddress.NULL : lookup_certificate_for_handle_finish));
            return this;
        }
        
        public Build setLookupCertificateIssuer(java.lang.foreign.MemoryAddress lookup_certificate_issuer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_issuer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookup_certificate_issuer == null ? MemoryAddress.NULL : lookup_certificate_issuer));
            return this;
        }
        
        public Build setLookupCertificateIssuerAsync(java.lang.foreign.MemoryAddress lookup_certificate_issuer_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_issuer_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookup_certificate_issuer_async == null ? MemoryAddress.NULL : lookup_certificate_issuer_async));
            return this;
        }
        
        public Build setLookupCertificateIssuerFinish(java.lang.foreign.MemoryAddress lookup_certificate_issuer_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificate_issuer_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookup_certificate_issuer_finish == null ? MemoryAddress.NULL : lookup_certificate_issuer_finish));
            return this;
        }
        
        public Build setLookupCertificatesIssuedBy(java.lang.foreign.MemoryAddress lookup_certificates_issued_by) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificates_issued_by"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookup_certificates_issued_by == null ? MemoryAddress.NULL : lookup_certificates_issued_by));
            return this;
        }
        
        public Build setLookupCertificatesIssuedByAsync(java.lang.foreign.MemoryAddress lookup_certificates_issued_by_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificates_issued_by_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookup_certificates_issued_by_async == null ? MemoryAddress.NULL : lookup_certificates_issued_by_async));
            return this;
        }
        
        public Build setLookupCertificatesIssuedByFinish(java.lang.foreign.MemoryAddress lookup_certificates_issued_by_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_certificates_issued_by_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookup_certificates_issued_by_finish == null ? MemoryAddress.NULL : lookup_certificates_issued_by_finish));
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
