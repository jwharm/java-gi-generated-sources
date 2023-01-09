package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A structure that provides information to the type system which is
 * used specifically for managing interface types.
 */
public class InterfaceInfo extends Struct {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GInterfaceInfo";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("interface_init"),
            Interop.valueLayout.ADDRESS.withName("interface_finalize"),
            Interop.valueLayout.ADDRESS.withName("interface_data")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link InterfaceInfo}
     * @return A new, uninitialized @{link InterfaceInfo}
     */
    public static InterfaceInfo allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        InterfaceInfo newInstance = new InterfaceInfo(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code interface_init}
     * @return The value of the field {@code interface_init}
     */
    public org.gtk.gobject.InterfaceInitFunc getInterfaceInit() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interface_init"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code interface_init}
     * @param interfaceInit The new value of the field {@code interface_init}
     */
    public void setInterfaceInit(org.gtk.gobject.InterfaceInitFunc interfaceInit) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interface_init"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (interfaceInit == null ? MemoryAddress.NULL : (Addressable) interfaceInit.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code interface_finalize}
     * @return The value of the field {@code interface_finalize}
     */
    public org.gtk.gobject.InterfaceFinalizeFunc getInterfaceFinalize() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interface_finalize"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code interface_finalize}
     * @param interfaceFinalize The new value of the field {@code interface_finalize}
     */
    public void setInterfaceFinalize(org.gtk.gobject.InterfaceFinalizeFunc interfaceFinalize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interface_finalize"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (interfaceFinalize == null ? MemoryAddress.NULL : (Addressable) interfaceFinalize.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code interface_data}
     * @return The value of the field {@code interface_data}
     */
    public java.lang.foreign.MemoryAddress getInterfaceData() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interface_data"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code interface_data}
     * @param interfaceData The new value of the field {@code interface_data}
     */
    public void setInterfaceData(java.lang.foreign.MemoryAddress interfaceData) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interface_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (interfaceData == null ? MemoryAddress.NULL : (Addressable) interfaceData));
        }
    }
    
    /**
     * Create a InterfaceInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected InterfaceInfo(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, InterfaceInfo> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new InterfaceInfo(input);
    
    /**
     * A {@link InterfaceInfo.Builder} object constructs a {@link InterfaceInfo} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link InterfaceInfo.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final InterfaceInfo struct;
        
        private Builder() {
            struct = InterfaceInfo.allocate();
        }
        
        /**
         * Finish building the {@link InterfaceInfo} struct.
         * @return A new instance of {@code InterfaceInfo} with the fields 
         *         that were set in the Builder object.
         */
        public InterfaceInfo build() {
            return struct;
        }
        
        /**
         * location of the interface initialization function
         * @param interfaceInit The value for the {@code interfaceInit} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInterfaceInit(org.gtk.gobject.InterfaceInitFunc interfaceInit) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("interface_init"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (interfaceInit == null ? MemoryAddress.NULL : (Addressable) interfaceInit.toCallback()));
                return this;
            }
        }
        
        /**
         * location of the interface finalization function
         * @param interfaceFinalize The value for the {@code interfaceFinalize} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInterfaceFinalize(org.gtk.gobject.InterfaceFinalizeFunc interfaceFinalize) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("interface_finalize"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (interfaceFinalize == null ? MemoryAddress.NULL : (Addressable) interfaceFinalize.toCallback()));
                return this;
            }
        }
        
        /**
         * user-supplied data passed to the interface init/finalize functions
         * @param interfaceData The value for the {@code interfaceData} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInterfaceData(java.lang.foreign.MemoryAddress interfaceData) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("interface_data"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (interfaceData == null ? MemoryAddress.NULL : (Addressable) interfaceData));
                return this;
            }
        }
    }
}
