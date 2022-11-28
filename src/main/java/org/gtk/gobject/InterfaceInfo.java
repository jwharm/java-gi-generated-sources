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
        GObject.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GInterfaceInfo";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("interface_init"),
        Interop.valueLayout.ADDRESS.withName("interface_finalize"),
        Interop.valueLayout.ADDRESS.withName("interface_data")
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
     * Allocate a new {@link InterfaceInfo}
     * @return A new, uninitialized @{link InterfaceInfo}
     */
    public static InterfaceInfo allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        InterfaceInfo newInstance = new InterfaceInfo(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code interface_init}
     * @return The value of the field {@code interface_init}
     */
    public org.gtk.gobject.InterfaceInitFunc interfaceInit$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("interface_init"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code interface_finalize}
     * @return The value of the field {@code interface_finalize}
     */
    public org.gtk.gobject.InterfaceFinalizeFunc interfaceFinalize$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("interface_finalize"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code interface_data}
     * @return The value of the field {@code interface_data}
     */
    public java.lang.foreign.MemoryAddress interfaceData$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("interface_data"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code interface_data}
     * @param interfaceData The new value of the field {@code interface_data}
     */
    public void interfaceData$set(java.lang.foreign.MemoryAddress interfaceData) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("interface_data"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) interfaceData);
    }
    
    /**
     * Create a InterfaceInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public InterfaceInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private InterfaceInfo struct;
        
         /**
         * A {@link InterfaceInfo.Build} object constructs a {@link InterfaceInfo} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = InterfaceInfo.allocate();
        }
        
         /**
         * Finish building the {@link InterfaceInfo} struct.
         * @return A new instance of {@code InterfaceInfo} with the fields 
         *         that were set in the Build object.
         */
        public InterfaceInfo construct() {
            return struct;
        }
        
        /**
         * location of the interface initialization function
         * @param interfaceInit The value for the {@code interfaceInit} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInterfaceInit(java.lang.foreign.MemoryAddress interfaceInit) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interface_init"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (interfaceInit == null ? MemoryAddress.NULL : interfaceInit));
            return this;
        }
        
        /**
         * location of the interface finalization function
         * @param interfaceFinalize The value for the {@code interfaceFinalize} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInterfaceFinalize(java.lang.foreign.MemoryAddress interfaceFinalize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interface_finalize"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (interfaceFinalize == null ? MemoryAddress.NULL : interfaceFinalize));
            return this;
        }
        
        /**
         * user-supplied data passed to the interface init/finalize functions
         * @param interfaceData The value for the {@code interfaceData} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInterfaceData(java.lang.foreign.MemoryAddress interfaceData) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interface_data"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (interfaceData == null ? MemoryAddress.NULL : (Addressable) interfaceData));
            return this;
        }
    }
}
