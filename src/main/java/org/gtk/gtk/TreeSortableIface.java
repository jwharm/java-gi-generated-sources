package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TreeSortableIface extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTreeSortableIface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("sort_column_changed"),
        Interop.valueLayout.ADDRESS.withName("get_sort_column_id"),
        Interop.valueLayout.ADDRESS.withName("set_sort_column_id"),
        Interop.valueLayout.ADDRESS.withName("set_sort_func"),
        Interop.valueLayout.ADDRESS.withName("set_default_sort_func"),
        Interop.valueLayout.ADDRESS.withName("has_default_sort_func")
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
     * Allocate a new {@link TreeSortableIface}
     * @return A new, uninitialized @{link TreeSortableIface}
     */
    public static TreeSortableIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TreeSortableIface newInstance = new TreeSortableIface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a TreeSortableIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TreeSortableIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private TreeSortableIface struct;
        
         /**
         * A {@link TreeSortableIface.Build} object constructs a {@link TreeSortableIface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = TreeSortableIface.allocate();
        }
        
         /**
         * Finish building the {@link TreeSortableIface} struct.
         * @return A new instance of {@code TreeSortableIface} with the fields 
         *         that were set in the Build object.
         */
        public TreeSortableIface construct() {
            return struct;
        }
        
        public Build setGIface(org.gtk.gobject.TypeInterface g_iface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (g_iface == null ? MemoryAddress.NULL : g_iface.handle()));
            return this;
        }
        
        public Build setSortColumnChanged(java.lang.foreign.MemoryAddress sort_column_changed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sort_column_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (sort_column_changed == null ? MemoryAddress.NULL : sort_column_changed));
            return this;
        }
        
        public Build setGetSortColumnId(java.lang.foreign.MemoryAddress get_sort_column_id) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_sort_column_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_sort_column_id == null ? MemoryAddress.NULL : get_sort_column_id));
            return this;
        }
        
        public Build setSetSortColumnId(java.lang.foreign.MemoryAddress set_sort_column_id) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_sort_column_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_sort_column_id == null ? MemoryAddress.NULL : set_sort_column_id));
            return this;
        }
        
        public Build setSetSortFunc(java.lang.foreign.MemoryAddress set_sort_func) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_sort_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_sort_func == null ? MemoryAddress.NULL : set_sort_func));
            return this;
        }
        
        public Build setSetDefaultSortFunc(java.lang.foreign.MemoryAddress set_default_sort_func) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_default_sort_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_default_sort_func == null ? MemoryAddress.NULL : set_default_sort_func));
            return this;
        }
        
        public Build setHasDefaultSortFunc(java.lang.foreign.MemoryAddress has_default_sort_func) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("has_default_sort_func"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (has_default_sort_func == null ? MemoryAddress.NULL : has_default_sort_func));
            return this;
        }
    }
}
