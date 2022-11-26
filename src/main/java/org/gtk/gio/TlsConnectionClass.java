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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gio.IOStreamClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("accept_certificate"),
        Interop.valueLayout.ADDRESS.withName("handshake"),
        Interop.valueLayout.ADDRESS.withName("handshake_async"),
        Interop.valueLayout.ADDRESS.withName("handshake_finish"),
        Interop.valueLayout.ADDRESS.withName("get_binding_data"),
        Interop.valueLayout.ADDRESS.withName("get_negotiated_protocol"),
        MemoryLayout.sequenceLayout(6, Interop.valueLayout.ADDRESS).withName("padding")
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
     * Allocate a new {@link TlsConnectionClass}
     * @return A new, uninitialized @{link TlsConnectionClass}
     */
    public static TlsConnectionClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TlsConnectionClass newInstance = new TlsConnectionClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gio.IOStreamClass parent_class$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gio.IOStreamClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a TlsConnectionClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TlsConnectionClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private TlsConnectionClass struct;
        
         /**
         * A {@link TlsConnectionClass.Build} object constructs a {@link TlsConnectionClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = TlsConnectionClass.allocate();
        }
        
         /**
         * Finish building the {@link TlsConnectionClass} struct.
         * @return A new instance of {@code TlsConnectionClass} with the fields 
         *         that were set in the Build object.
         */
        public TlsConnectionClass construct() {
            return struct;
        }
        
        /**
         * The parent class.
         * @param parent_class The value for the {@code parent_class} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentClass(org.gtk.gio.IOStreamClass parent_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_class == null ? MemoryAddress.NULL : parent_class.handle()));
            return this;
        }
        
        public Build setAcceptCertificate(java.lang.foreign.MemoryAddress accept_certificate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("accept_certificate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (accept_certificate == null ? MemoryAddress.NULL : accept_certificate));
            return this;
        }
        
        public Build setHandshake(java.lang.foreign.MemoryAddress handshake) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handshake"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handshake == null ? MemoryAddress.NULL : handshake));
            return this;
        }
        
        public Build setHandshakeAsync(java.lang.foreign.MemoryAddress handshake_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handshake_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handshake_async == null ? MemoryAddress.NULL : handshake_async));
            return this;
        }
        
        public Build setHandshakeFinish(java.lang.foreign.MemoryAddress handshake_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("handshake_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (handshake_finish == null ? MemoryAddress.NULL : handshake_finish));
            return this;
        }
        
        public Build setGetBindingData(java.lang.foreign.MemoryAddress get_binding_data) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_binding_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_binding_data == null ? MemoryAddress.NULL : get_binding_data));
            return this;
        }
        
        public Build setGetNegotiatedProtocol(java.lang.foreign.MemoryAddress get_negotiated_protocol) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_negotiated_protocol"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_negotiated_protocol == null ? MemoryAddress.NULL : get_negotiated_protocol));
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
