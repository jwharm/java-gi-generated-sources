package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Interface that is used by backends to associate default
 * handlers with URI schemes.
 */
public class DesktopAppInfoLookupIface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDesktopAppInfoLookupIface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("get_default_for_uri_scheme")
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
     * Allocate a new {@link DesktopAppInfoLookupIface}
     * @return A new, uninitialized @{link DesktopAppInfoLookupIface}
     */
    public static DesktopAppInfoLookupIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DesktopAppInfoLookupIface newInstance = new DesktopAppInfoLookupIface(segment.address(), Ownership.NONE);
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
     * Create a DesktopAppInfoLookupIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DesktopAppInfoLookupIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private DesktopAppInfoLookupIface struct;
        
         /**
         * A {@link DesktopAppInfoLookupIface.Build} object constructs a {@link DesktopAppInfoLookupIface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = DesktopAppInfoLookupIface.allocate();
        }
        
         /**
         * Finish building the {@link DesktopAppInfoLookupIface} struct.
         * @return A new instance of {@code DesktopAppInfoLookupIface} with the fields 
         *         that were set in the Build object.
         */
        public DesktopAppInfoLookupIface construct() {
            return struct;
        }
        
        public Build setGIface(org.gtk.gobject.TypeInterface g_iface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (g_iface == null ? MemoryAddress.NULL : g_iface.handle()));
            return this;
        }
        
        public Build setGetDefaultForUriScheme(java.lang.foreign.MemoryAddress get_default_for_uri_scheme) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_default_for_uri_scheme"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_default_for_uri_scheme == null ? MemoryAddress.NULL : get_default_for_uri_scheme));
            return this;
        }
    }
}
