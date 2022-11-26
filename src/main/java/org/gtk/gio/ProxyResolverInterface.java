package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The virtual function table for {@link ProxyResolver}.
 */
public class ProxyResolverInterface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GProxyResolverInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("is_supported"),
        Interop.valueLayout.ADDRESS.withName("lookup"),
        Interop.valueLayout.ADDRESS.withName("lookup_async"),
        Interop.valueLayout.ADDRESS.withName("lookup_finish")
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
     * Allocate a new {@link ProxyResolverInterface}
     * @return A new, uninitialized @{link ProxyResolverInterface}
     */
    public static ProxyResolverInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ProxyResolverInterface newInstance = new ProxyResolverInterface(segment.address(), Ownership.NONE);
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
     * Create a ProxyResolverInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ProxyResolverInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ProxyResolverInterface struct;
        
         /**
         * A {@link ProxyResolverInterface.Build} object constructs a {@link ProxyResolverInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ProxyResolverInterface.allocate();
        }
        
         /**
         * Finish building the {@link ProxyResolverInterface} struct.
         * @return A new instance of {@code ProxyResolverInterface} with the fields 
         *         that were set in the Build object.
         */
        public ProxyResolverInterface construct() {
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
        
        public Build setIsSupported(java.lang.foreign.MemoryAddress is_supported) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_supported"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (is_supported == null ? MemoryAddress.NULL : is_supported));
            return this;
        }
        
        public Build setLookup(java.lang.foreign.MemoryAddress lookup) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookup == null ? MemoryAddress.NULL : lookup));
            return this;
        }
        
        public Build setLookupAsync(java.lang.foreign.MemoryAddress lookup_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookup_async == null ? MemoryAddress.NULL : lookup_async));
            return this;
        }
        
        public Build setLookupFinish(java.lang.foreign.MemoryAddress lookup_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("lookup_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (lookup_finish == null ? MemoryAddress.NULL : lookup_finish));
            return this;
        }
    }
}
