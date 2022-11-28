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
    public org.gtk.gobject.ObjectClass parentClass$get() {
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
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setIsMutable(java.lang.foreign.MemoryAddress isMutable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_mutable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (isMutable == null ? MemoryAddress.NULL : isMutable));
            return this;
        }
        
        public Build setGetNItems(java.lang.foreign.MemoryAddress getNItems) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_n_items"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getNItems == null ? MemoryAddress.NULL : getNItems));
            return this;
        }
        
        public Build setGetItemAttributes(java.lang.foreign.MemoryAddress getItemAttributes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_item_attributes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getItemAttributes == null ? MemoryAddress.NULL : getItemAttributes));
            return this;
        }
        
        public Build setIterateItemAttributes(java.lang.foreign.MemoryAddress iterateItemAttributes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iterate_item_attributes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iterateItemAttributes == null ? MemoryAddress.NULL : iterateItemAttributes));
            return this;
        }
        
        public Build setGetItemAttributeValue(java.lang.foreign.MemoryAddress getItemAttributeValue) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_item_attribute_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getItemAttributeValue == null ? MemoryAddress.NULL : getItemAttributeValue));
            return this;
        }
        
        public Build setGetItemLinks(java.lang.foreign.MemoryAddress getItemLinks) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_item_links"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getItemLinks == null ? MemoryAddress.NULL : getItemLinks));
            return this;
        }
        
        public Build setIterateItemLinks(java.lang.foreign.MemoryAddress iterateItemLinks) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("iterate_item_links"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (iterateItemLinks == null ? MemoryAddress.NULL : iterateItemLinks));
            return this;
        }
        
        public Build setGetItemLink(java.lang.foreign.MemoryAddress getItemLink) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_item_link"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getItemLink == null ? MemoryAddress.NULL : getItemLink));
            return this;
        }
    }
}
