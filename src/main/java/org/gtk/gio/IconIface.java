package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GIconIface is used to implement GIcon types for various
 * different systems. See {@link ThemedIcon} and {@link LoadableIcon} for
 * examples of how to implement this interface.
 */
public class IconIface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GIconIface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("hash"),
        Interop.valueLayout.ADDRESS.withName("equal"),
        Interop.valueLayout.ADDRESS.withName("to_tokens"),
        Interop.valueLayout.ADDRESS.withName("from_tokens"),
        Interop.valueLayout.ADDRESS.withName("serialize")
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
     * Allocate a new {@link IconIface}
     * @return A new, uninitialized @{link IconIface}
     */
    public static IconIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        IconIface newInstance = new IconIface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface gIface$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return new org.gtk.gobject.TypeInterface(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a IconIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public IconIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private IconIface struct;
        
         /**
         * A {@link IconIface.Build} object constructs a {@link IconIface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = IconIface.allocate();
        }
        
         /**
         * Finish building the {@link IconIface} struct.
         * @return A new instance of {@code IconIface} with the fields 
         *         that were set in the Build object.
         */
        public IconIface construct() {
            return struct;
        }
        
        /**
         * The parent interface.
         * @param gIface The value for the {@code gIface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGIface(org.gtk.gobject.TypeInterface gIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Build setHash(java.lang.foreign.MemoryAddress hash) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("hash"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (hash == null ? MemoryAddress.NULL : hash));
            return this;
        }
        
        public Build setEqual(java.lang.foreign.MemoryAddress equal) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("equal"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (equal == null ? MemoryAddress.NULL : equal));
            return this;
        }
        
        public Build setToTokens(java.lang.foreign.MemoryAddress toTokens) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("to_tokens"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (toTokens == null ? MemoryAddress.NULL : toTokens));
            return this;
        }
        
        public Build setFromTokens(java.lang.foreign.MemoryAddress fromTokens) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("from_tokens"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fromTokens == null ? MemoryAddress.NULL : fromTokens));
            return this;
        }
        
        public Build setSerialize(java.lang.foreign.MemoryAddress serialize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("serialize"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (serialize == null ? MemoryAddress.NULL : serialize));
            return this;
        }
    }
}
