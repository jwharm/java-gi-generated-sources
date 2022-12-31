package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The virtual function table for {@link PowerProfileMonitor}.
 * @version 2.70
 */
public class PowerProfileMonitorInterface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GPowerProfileMonitorInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PowerProfileMonitorInterface}
     * @return A new, uninitialized @{link PowerProfileMonitorInterface}
     */
    public static PowerProfileMonitorInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PowerProfileMonitorInterface newInstance = new PowerProfileMonitorInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a PowerProfileMonitorInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PowerProfileMonitorInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PowerProfileMonitorInterface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PowerProfileMonitorInterface(input, ownership);
    
    /**
     * A {@link PowerProfileMonitorInterface.Builder} object constructs a {@link PowerProfileMonitorInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link PowerProfileMonitorInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final PowerProfileMonitorInterface struct;
        
        private Builder() {
            struct = PowerProfileMonitorInterface.allocate();
        }
        
         /**
         * Finish building the {@link PowerProfileMonitorInterface} struct.
         * @return A new instance of {@code PowerProfileMonitorInterface} with the fields 
         *         that were set in the Builder object.
         */
        public PowerProfileMonitorInterface build() {
            return struct;
        }
        
        /**
         * The parent interface.
         * @param gIface The value for the {@code gIface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGIface(org.gtk.gobject.TypeInterface gIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
    }
}
