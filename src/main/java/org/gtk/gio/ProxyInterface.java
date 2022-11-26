package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Provides an interface for handling proxy connection and payload.
 * @version 2.26
 */
public class ProxyInterface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GProxyInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("connect"),
        Interop.valueLayout.ADDRESS.withName("connect_async"),
        Interop.valueLayout.ADDRESS.withName("connect_finish"),
        Interop.valueLayout.ADDRESS.withName("supports_hostname")
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
     * Allocate a new {@link ProxyInterface}
     * @return A new, uninitialized @{link ProxyInterface}
     */
    public static ProxyInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ProxyInterface newInstance = new ProxyInterface(segment.address(), Ownership.NONE);
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
     * Create a ProxyInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ProxyInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ProxyInterface struct;
        
         /**
         * A {@link ProxyInterface.Build} object constructs a {@link ProxyInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ProxyInterface.allocate();
        }
        
         /**
         * Finish building the {@link ProxyInterface} struct.
         * @return A new instance of {@code ProxyInterface} with the fields 
         *         that were set in the Build object.
         */
        public ProxyInterface construct() {
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
        
        public Build setConnect(java.lang.foreign.MemoryAddress connect) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("connect"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (connect == null ? MemoryAddress.NULL : connect));
            return this;
        }
        
        public Build setConnectAsync(java.lang.foreign.MemoryAddress connect_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("connect_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (connect_async == null ? MemoryAddress.NULL : connect_async));
            return this;
        }
        
        public Build setConnectFinish(java.lang.foreign.MemoryAddress connect_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("connect_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (connect_finish == null ? MemoryAddress.NULL : connect_finish));
            return this;
        }
        
        public Build setSupportsHostname(java.lang.foreign.MemoryAddress supports_hostname) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("supports_hostname"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (supports_hostname == null ? MemoryAddress.NULL : supports_hostname));
            return this;
        }
    }
}
