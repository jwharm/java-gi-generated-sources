package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * vtable for a {@link TlsClientConnection} implementation.
 * @version 2.26
 */
public class TlsClientConnectionInterface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTlsClientConnectionInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("copy_session_state")
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
     * Allocate a new {@link TlsClientConnectionInterface}
     * @return A new, uninitialized @{link TlsClientConnectionInterface}
     */
    public static TlsClientConnectionInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TlsClientConnectionInterface newInstance = new TlsClientConnectionInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface g_iface$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return new org.gtk.gobject.TypeInterface(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a TlsClientConnectionInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TlsClientConnectionInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private TlsClientConnectionInterface struct;
        
         /**
         * A {@link TlsClientConnectionInterface.Build} object constructs a {@link TlsClientConnectionInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = TlsClientConnectionInterface.allocate();
        }
        
         /**
         * Finish building the {@link TlsClientConnectionInterface} struct.
         * @return A new instance of {@code TlsClientConnectionInterface} with the fields 
         *         that were set in the Build object.
         */
        public TlsClientConnectionInterface construct() {
            return struct;
        }
        
        /**
         * The parent interface.
         * @param g_iface The value for the {@code g_iface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGIface(org.gtk.gobject.TypeInterface g_iface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (g_iface == null ? MemoryAddress.NULL : g_iface.handle()));
            return this;
        }
        
        public Build setCopySessionState(java.lang.foreign.MemoryAddress copy_session_state) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy_session_state"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copy_session_state == null ? MemoryAddress.NULL : copy_session_state));
            return this;
        }
    }
}
