package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TlsCertificateClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTlsCertificateClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("verify"),
            MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TlsCertificateClass}
     * @return A new, uninitialized @{link TlsCertificateClass}
     */
    public static TlsCertificateClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TlsCertificateClass newInstance = new TlsCertificateClass(segment.address(), Ownership.NONE);
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
    public interface VerifyCallback {
        org.gtk.gio.TlsCertificateFlags run(org.gtk.gio.TlsCertificate cert, @Nullable org.gtk.gio.SocketConnectable identity, @Nullable org.gtk.gio.TlsCertificate trustedCa);

        @ApiStatus.Internal default int upcall(MemoryAddress cert, MemoryAddress identity, MemoryAddress trustedCa) {
            var RESULT = run((org.gtk.gio.TlsCertificate) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cert)), org.gtk.gio.TlsCertificate.fromAddress).marshal(cert, Ownership.NONE), (org.gtk.gio.SocketConnectable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(identity)), org.gtk.gio.SocketConnectable.fromAddress).marshal(identity, Ownership.NONE), (org.gtk.gio.TlsCertificate) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(trustedCa)), org.gtk.gio.TlsCertificate.fromAddress).marshal(trustedCa, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(VerifyCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code verify}
     * @param verify The new value of the field {@code verify}
     */
    public void setVerify(VerifyCallback verify) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("verify"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (verify == null ? MemoryAddress.NULL : verify.toCallback()));
    }
    
    /**
     * Create a TlsCertificateClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TlsCertificateClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TlsCertificateClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TlsCertificateClass(input, ownership);
    
    /**
     * A {@link TlsCertificateClass.Builder} object constructs a {@link TlsCertificateClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TlsCertificateClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TlsCertificateClass struct;
        
        private Builder() {
            struct = TlsCertificateClass.allocate();
        }
        
         /**
         * Finish building the {@link TlsCertificateClass} struct.
         * @return A new instance of {@code TlsCertificateClass} with the fields 
         *         that were set in the Builder object.
         */
        public TlsCertificateClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setVerify(VerifyCallback verify) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("verify"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (verify == null ? MemoryAddress.NULL : verify.toCallback()));
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
