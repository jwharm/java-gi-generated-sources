package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The virtual function table for {@link ListModel}.
 * @version 2.44
 */
public class ListModelInterface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GListModelInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("get_item_type"),
        Interop.valueLayout.ADDRESS.withName("get_n_items"),
        Interop.valueLayout.ADDRESS.withName("get_item")
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
     * Allocate a new {@link ListModelInterface}
     * @return A new, uninitialized @{link ListModelInterface}
     */
    public static ListModelInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ListModelInterface newInstance = new ListModelInterface(segment.address(), Ownership.NONE);
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
     * Create a ListModelInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public ListModelInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private ListModelInterface struct;
        
         /**
         * A {@link ListModelInterface.Build} object constructs a {@link ListModelInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = ListModelInterface.allocate();
        }
        
         /**
         * Finish building the {@link ListModelInterface} struct.
         * @return A new instance of {@code ListModelInterface} with the fields 
         *         that were set in the Build object.
         */
        public ListModelInterface construct() {
            return struct;
        }
        
        /**
         * parent {@link org.gtk.gobject.TypeInterface}
         * @param g_iface The value for the {@code g_iface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGIface(org.gtk.gobject.TypeInterface g_iface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (g_iface == null ? MemoryAddress.NULL : g_iface.handle()));
            return this;
        }
        
        public Build setGetItemType(java.lang.foreign.MemoryAddress get_item_type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_item_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_item_type == null ? MemoryAddress.NULL : get_item_type));
            return this;
        }
        
        public Build setGetNItems(java.lang.foreign.MemoryAddress get_n_items) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_n_items"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_n_items == null ? MemoryAddress.NULL : get_n_items));
            return this;
        }
        
        public Build setGetItem(java.lang.foreign.MemoryAddress get_item) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_item"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_item == null ? MemoryAddress.NULL : get_item));
            return this;
        }
    }
}
