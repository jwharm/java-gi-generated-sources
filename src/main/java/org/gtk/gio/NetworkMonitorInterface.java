package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The virtual function table for {@link NetworkMonitor}.
 * @version 2.32
 */
public class NetworkMonitorInterface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GNetworkMonitorInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("network_changed"),
        Interop.valueLayout.ADDRESS.withName("can_reach"),
        Interop.valueLayout.ADDRESS.withName("can_reach_async"),
        Interop.valueLayout.ADDRESS.withName("can_reach_finish")
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
     * Allocate a new {@link NetworkMonitorInterface}
     * @return A new, uninitialized @{link NetworkMonitorInterface}
     */
    public static NetworkMonitorInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        NetworkMonitorInterface newInstance = new NetworkMonitorInterface(segment.address(), Ownership.NONE);
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
     * Create a NetworkMonitorInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public NetworkMonitorInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private NetworkMonitorInterface struct;
        
         /**
         * A {@link NetworkMonitorInterface.Build} object constructs a {@link NetworkMonitorInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = NetworkMonitorInterface.allocate();
        }
        
         /**
         * Finish building the {@link NetworkMonitorInterface} struct.
         * @return A new instance of {@code NetworkMonitorInterface} with the fields 
         *         that were set in the Build object.
         */
        public NetworkMonitorInterface construct() {
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
        
        public Build setNetworkChanged(java.lang.foreign.MemoryAddress network_changed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("network_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (network_changed == null ? MemoryAddress.NULL : network_changed));
            return this;
        }
        
        public Build setCanReach(java.lang.foreign.MemoryAddress can_reach) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_reach"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (can_reach == null ? MemoryAddress.NULL : can_reach));
            return this;
        }
        
        public Build setCanReachAsync(java.lang.foreign.MemoryAddress can_reach_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_reach_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (can_reach_async == null ? MemoryAddress.NULL : can_reach_async));
            return this;
        }
        
        public Build setCanReachFinish(java.lang.foreign.MemoryAddress can_reach_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_reach_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (can_reach_finish == null ? MemoryAddress.NULL : can_reach_finish));
            return this;
        }
    }
}
