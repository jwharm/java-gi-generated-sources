package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The class for {@link TlsInteraction}. Derived classes implement the various
 * virtual interaction methods to handle TLS interactions.
 * <p>
 * Derived classes can choose to implement whichever interactions methods they'd
 * like to support by overriding those virtual methods in their class
 * initialization function. If a derived class implements an async method,
 * it must also implement the corresponding finish method.
 * <p>
 * The synchronous interaction methods should implement to display modal dialogs,
 * and the asynchronous methods to display modeless dialogs.
 * <p>
 * If the user cancels an interaction, then the result should be
 * {@link TlsInteractionResult#FAILED} and the error should be set with a domain of
 * {@code G_IO_ERROR} and code of {@link IOErrorEnum#CANCELLED}.
 * @version 2.30
 */
public class TlsInteractionClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTlsInteractionClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("ask_password"),
        Interop.valueLayout.ADDRESS.withName("ask_password_async"),
        Interop.valueLayout.ADDRESS.withName("ask_password_finish"),
        Interop.valueLayout.ADDRESS.withName("request_certificate"),
        Interop.valueLayout.ADDRESS.withName("request_certificate_async"),
        Interop.valueLayout.ADDRESS.withName("request_certificate_finish"),
        MemoryLayout.sequenceLayout(21, Interop.valueLayout.ADDRESS).withName("padding")
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
     * Allocate a new {@link TlsInteractionClass}
     * @return A new, uninitialized @{link TlsInteractionClass}
     */
    public static TlsInteractionClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TlsInteractionClass newInstance = new TlsInteractionClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a TlsInteractionClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TlsInteractionClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private TlsInteractionClass struct;
        
         /**
         * A {@link TlsInteractionClass.Build} object constructs a {@link TlsInteractionClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = TlsInteractionClass.allocate();
        }
        
         /**
         * Finish building the {@link TlsInteractionClass} struct.
         * @return A new instance of {@code TlsInteractionClass} with the fields 
         *         that were set in the Build object.
         */
        public TlsInteractionClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parent_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_class == null ? MemoryAddress.NULL : parent_class.handle()));
            return this;
        }
        
        public Build setAskPassword(java.lang.foreign.MemoryAddress ask_password) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ask_password"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ask_password == null ? MemoryAddress.NULL : ask_password));
            return this;
        }
        
        public Build setAskPasswordAsync(java.lang.foreign.MemoryAddress ask_password_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ask_password_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ask_password_async == null ? MemoryAddress.NULL : ask_password_async));
            return this;
        }
        
        public Build setAskPasswordFinish(java.lang.foreign.MemoryAddress ask_password_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ask_password_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ask_password_finish == null ? MemoryAddress.NULL : ask_password_finish));
            return this;
        }
        
        public Build setRequestCertificate(java.lang.foreign.MemoryAddress request_certificate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("request_certificate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (request_certificate == null ? MemoryAddress.NULL : request_certificate));
            return this;
        }
        
        public Build setRequestCertificateAsync(java.lang.foreign.MemoryAddress request_certificate_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("request_certificate_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (request_certificate_async == null ? MemoryAddress.NULL : request_certificate_async));
            return this;
        }
        
        public Build setRequestCertificateFinish(java.lang.foreign.MemoryAddress request_certificate_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("request_certificate_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (request_certificate_finish == null ? MemoryAddress.NULL : request_certificate_finish));
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
