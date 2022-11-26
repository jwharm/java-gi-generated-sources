package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Provides an interface for returning a {@link SocketAddressEnumerator}
 * and {@link ProxyAddressEnumerator}
 */
public class SocketConnectableIface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GSocketConnectableIface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("enumerate"),
        Interop.valueLayout.ADDRESS.withName("proxy_enumerate"),
        Interop.valueLayout.ADDRESS.withName("to_string")
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
     * Allocate a new {@link SocketConnectableIface}
     * @return A new, uninitialized @{link SocketConnectableIface}
     */
    public static SocketConnectableIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SocketConnectableIface newInstance = new SocketConnectableIface(segment.address(), Ownership.NONE);
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
     * Create a SocketConnectableIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SocketConnectableIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SocketConnectableIface struct;
        
         /**
         * A {@link SocketConnectableIface.Build} object constructs a {@link SocketConnectableIface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SocketConnectableIface.allocate();
        }
        
         /**
         * Finish building the {@link SocketConnectableIface} struct.
         * @return A new instance of {@code SocketConnectableIface} with the fields 
         *         that were set in the Build object.
         */
        public SocketConnectableIface construct() {
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
        
        public Build setEnumerate(java.lang.foreign.MemoryAddress enumerate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enumerate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (enumerate == null ? MemoryAddress.NULL : enumerate));
            return this;
        }
        
        public Build setProxyEnumerate(java.lang.foreign.MemoryAddress proxy_enumerate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("proxy_enumerate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (proxy_enumerate == null ? MemoryAddress.NULL : proxy_enumerate));
            return this;
        }
        
        public Build setToString(java.lang.foreign.MemoryAddress to_string) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("to_string"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (to_string == null ? MemoryAddress.NULL : to_string));
            return this;
        }
    }
}
