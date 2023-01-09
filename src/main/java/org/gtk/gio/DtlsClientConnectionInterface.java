package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * vtable for a {@link DtlsClientConnection} implementation.
 * @version 2.48
 */
public class DtlsClientConnectionInterface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDtlsClientConnectionInterface";
    
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
     * Allocate a new {@link DtlsClientConnectionInterface}
     * @return A new, uninitialized @{link DtlsClientConnectionInterface}
     */
    public static DtlsClientConnectionInterface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DtlsClientConnectionInterface newInstance = new DtlsClientConnectionInterface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface getGIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code g_iface}
     * @param gIface The new value of the field {@code g_iface}
     */
    public void setGIface(org.gtk.gobject.TypeInterface gIface) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
        }
    }
    
    /**
     * Create a DtlsClientConnectionInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DtlsClientConnectionInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DtlsClientConnectionInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DtlsClientConnectionInterface(input);
    
    /**
     * A {@link DtlsClientConnectionInterface.Builder} object constructs a {@link DtlsClientConnectionInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DtlsClientConnectionInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DtlsClientConnectionInterface struct;
        
        private Builder() {
            struct = DtlsClientConnectionInterface.allocate();
        }
        
        /**
         * Finish building the {@link DtlsClientConnectionInterface} struct.
         * @return A new instance of {@code DtlsClientConnectionInterface} with the fields 
         *         that were set in the Builder object.
         */
        public DtlsClientConnectionInterface build() {
            return struct;
        }
        
        /**
         * The parent interface.
         * @param gIface The value for the {@code gIface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGIface(org.gtk.gobject.TypeInterface gIface) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
                return this;
            }
        }
    }
}
