package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Provides an interface for socket-like objects which have datagram semantics,
 * following the Berkeley sockets API. The interface methods are thin wrappers
 * around the corresponding virtual methods, and no pre-processing of inputs is
 * implemented — so implementations of this API must handle all functionality
 * documented in the interface methods.
 * @version 2.48
 */
public class DatagramBasedInterface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDatagramBasedInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("receive_messages"),
        Interop.valueLayout.ADDRESS.withName("send_messages"),
        Interop.valueLayout.ADDRESS.withName("create_source"),
        Interop.valueLayout.ADDRESS.withName("condition_check"),
        Interop.valueLayout.ADDRESS.withName("condition_wait")
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
     * Allocate a new {@link DatagramBasedInterface}
     * @return A new, uninitialized @{link DatagramBasedInterface}
     */
    public static DatagramBasedInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DatagramBasedInterface newInstance = new DatagramBasedInterface(segment.address(), Ownership.NONE);
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
     * Create a DatagramBasedInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DatagramBasedInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private DatagramBasedInterface struct;
        
         /**
         * A {@link DatagramBasedInterface.Build} object constructs a {@link DatagramBasedInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = DatagramBasedInterface.allocate();
        }
        
         /**
         * Finish building the {@link DatagramBasedInterface} struct.
         * @return A new instance of {@code DatagramBasedInterface} with the fields 
         *         that were set in the Build object.
         */
        public DatagramBasedInterface construct() {
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
        
        public Build setReceiveMessages(java.lang.foreign.MemoryAddress receiveMessages) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("receive_messages"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (receiveMessages == null ? MemoryAddress.NULL : receiveMessages));
            return this;
        }
        
        public Build setSendMessages(java.lang.foreign.MemoryAddress sendMessages) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("send_messages"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sendMessages == null ? MemoryAddress.NULL : sendMessages));
            return this;
        }
        
        public Build setCreateSource(java.lang.foreign.MemoryAddress createSource) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_source"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createSource == null ? MemoryAddress.NULL : createSource));
            return this;
        }
        
        public Build setConditionCheck(java.lang.foreign.MemoryAddress conditionCheck) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("condition_check"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (conditionCheck == null ? MemoryAddress.NULL : conditionCheck));
            return this;
        }
        
        public Build setConditionWait(java.lang.foreign.MemoryAddress conditionWait) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("condition_wait"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (conditionWait == null ? MemoryAddress.NULL : conditionWait));
            return this;
        }
    }
}
