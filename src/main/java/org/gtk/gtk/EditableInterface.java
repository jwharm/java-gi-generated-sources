package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class EditableInterface extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkEditableInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("base_iface"),
        Interop.valueLayout.ADDRESS.withName("insert_text"),
        Interop.valueLayout.ADDRESS.withName("delete_text"),
        Interop.valueLayout.ADDRESS.withName("changed"),
        Interop.valueLayout.ADDRESS.withName("get_text"),
        Interop.valueLayout.ADDRESS.withName("do_insert_text"),
        Interop.valueLayout.ADDRESS.withName("do_delete_text"),
        Interop.valueLayout.ADDRESS.withName("get_selection_bounds"),
        Interop.valueLayout.ADDRESS.withName("set_selection_bounds"),
        Interop.valueLayout.ADDRESS.withName("get_delegate")
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
     * Allocate a new {@link EditableInterface}
     * @return A new, uninitialized @{link EditableInterface}
     */
    public static EditableInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        EditableInterface newInstance = new EditableInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code base_iface}
     * @return The value of the field {@code base_iface}
     */
    public org.gtk.gobject.TypeInterface base_iface$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("base_iface"));
        return new org.gtk.gobject.TypeInterface(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a EditableInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public EditableInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private EditableInterface struct;
        
         /**
         * A {@link EditableInterface.Build} object constructs a {@link EditableInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = EditableInterface.allocate();
        }
        
         /**
         * Finish building the {@link EditableInterface} struct.
         * @return A new instance of {@code EditableInterface} with the fields 
         *         that were set in the Build object.
         */
        public EditableInterface construct() {
            return struct;
        }
        
        public Build setBaseIface(org.gtk.gobject.TypeInterface base_iface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("base_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (base_iface == null ? MemoryAddress.NULL : base_iface.handle()));
            return this;
        }
        
        public Build setInsertText(java.lang.foreign.MemoryAddress insert_text) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("insert_text"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (insert_text == null ? MemoryAddress.NULL : insert_text));
            return this;
        }
        
        public Build setDeleteText(java.lang.foreign.MemoryAddress delete_text) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delete_text"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (delete_text == null ? MemoryAddress.NULL : delete_text));
            return this;
        }
        
        public Build setChanged(java.lang.foreign.MemoryAddress changed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (changed == null ? MemoryAddress.NULL : changed));
            return this;
        }
        
        public Build setGetText(java.lang.foreign.MemoryAddress get_text) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_text"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_text == null ? MemoryAddress.NULL : get_text));
            return this;
        }
        
        public Build setDoInsertText(java.lang.foreign.MemoryAddress do_insert_text) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("do_insert_text"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (do_insert_text == null ? MemoryAddress.NULL : do_insert_text));
            return this;
        }
        
        public Build setDoDeleteText(java.lang.foreign.MemoryAddress do_delete_text) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("do_delete_text"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (do_delete_text == null ? MemoryAddress.NULL : do_delete_text));
            return this;
        }
        
        public Build setGetSelectionBounds(java.lang.foreign.MemoryAddress get_selection_bounds) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_selection_bounds"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_selection_bounds == null ? MemoryAddress.NULL : get_selection_bounds));
            return this;
        }
        
        public Build setSetSelectionBounds(java.lang.foreign.MemoryAddress set_selection_bounds) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_selection_bounds"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_selection_bounds == null ? MemoryAddress.NULL : set_selection_bounds));
            return this;
        }
        
        public Build setGetDelegate(java.lang.foreign.MemoryAddress get_delegate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_delegate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_delegate == null ? MemoryAddress.NULL : get_delegate));
            return this;
        }
    }
}
