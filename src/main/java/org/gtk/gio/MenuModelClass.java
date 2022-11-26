package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class MenuModelClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GMenuModelClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("is_mutable"),
        Interop.valueLayout.ADDRESS.withName("get_n_items"),
        Interop.valueLayout.ADDRESS.withName("get_item_attributes"),
        Interop.valueLayout.ADDRESS.withName("iterate_item_attributes"),
        Interop.valueLayout.ADDRESS.withName("get_item_attribute_value"),
        Interop.valueLayout.ADDRESS.withName("get_item_links"),
        Interop.valueLayout.ADDRESS.withName("iterate_item_links"),
        Interop.valueLayout.ADDRESS.withName("get_item_link")
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
     * Allocate a new {@link MenuModelClass}
     * @return A new, uninitialized @{link MenuModelClass}
     */
    public static MenuModelClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MenuModelClass newInstance = new MenuModelClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass parent_class$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gobject.ObjectClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a MenuModelClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MenuModelClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private MenuModelClass struct;
        
         /**
         * A {@link MenuModelClass.Build} object constructs a {@link MenuModelClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = MenuModelClass.allocate();
        }
        
         /**
         * Finish building the {@link MenuModelClass} struct.
         * @return A new instance of {@code MenuModelClass} with the fields 
         *         that were set in the Build object.
         */
        public MenuModelClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parent_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_class == null ? MemoryAddress.NULL : parent_class.handle()));
            return this;
        }
        
        public Build setIsMutable(java.lang.foreign.MemoryAddress is_mutable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_mutable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (is_mutable == null ? MemoryAddress.NULL : is_mutable));
            return this;
        }
        
        public Build setGetNItems(java.lang.foreign.MemoryAddress get_n_items) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_n_items"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_n_items == null ? MemoryAddress.NULL : get_n_items));
            return this;
        }
        
        public Build setGetItemAttributes(java.lang.foreign.MemoryAddress get_item_attributes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_item_attributes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_item_attributes == null ? MemoryAddress.NULL : get_item_attributes));
            return this;
        }
        
        public Build setIterateItemAttributes(java.lang.foreign.MemoryAddress iterate_item_attributes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iterate_item_attributes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iterate_item_attributes == null ? MemoryAddress.NULL : iterate_item_attributes));
            return this;
        }
        
        public Build setGetItemAttributeValue(java.lang.foreign.MemoryAddress get_item_attribute_value) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_item_attribute_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_item_attribute_value == null ? MemoryAddress.NULL : get_item_attribute_value));
            return this;
        }
        
        public Build setGetItemLinks(java.lang.foreign.MemoryAddress get_item_links) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_item_links"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_item_links == null ? MemoryAddress.NULL : get_item_links));
            return this;
        }
        
        public Build setIterateItemLinks(java.lang.foreign.MemoryAddress iterate_item_links) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iterate_item_links"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iterate_item_links == null ? MemoryAddress.NULL : iterate_item_links));
            return this;
        }
        
        public Build setGetItemLink(java.lang.foreign.MemoryAddress get_item_link) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_item_link"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_item_link == null ? MemoryAddress.NULL : get_item_link));
            return this;
        }
    }
}
