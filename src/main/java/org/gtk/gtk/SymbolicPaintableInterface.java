package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The list of virtual functions for the {@code GtkSymbolicPaintable} interface.
 * No function must be implemented, default implementations exist for each one.
 */
public class SymbolicPaintableInterface extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkSymbolicPaintableInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("snapshot_symbolic")
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
     * Allocate a new {@link SymbolicPaintableInterface}
     * @return A new, uninitialized @{link SymbolicPaintableInterface}
     */
    public static SymbolicPaintableInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SymbolicPaintableInterface newInstance = new SymbolicPaintableInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SymbolicPaintableInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SymbolicPaintableInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SymbolicPaintableInterface struct;
        
         /**
         * A {@link SymbolicPaintableInterface.Build} object constructs a {@link SymbolicPaintableInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SymbolicPaintableInterface.allocate();
        }
        
         /**
         * Finish building the {@link SymbolicPaintableInterface} struct.
         * @return A new instance of {@code SymbolicPaintableInterface} with the fields 
         *         that were set in the Build object.
         */
        public SymbolicPaintableInterface construct() {
            return struct;
        }
        
        public Build setGIface(org.gtk.gobject.TypeInterface gIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Build setSnapshotSymbolic(java.lang.foreign.MemoryAddress snapshotSymbolic) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("snapshot_symbolic"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (snapshotSymbolic == null ? MemoryAddress.NULL : snapshotSymbolic));
            return this;
        }
    }
}
