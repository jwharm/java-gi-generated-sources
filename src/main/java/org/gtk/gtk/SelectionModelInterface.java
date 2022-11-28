package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The list of virtual functions for the {@code GtkSelectionModel} interface.
 * No function must be implemented, but unless {@code GtkSelectionModel::is_selected()}
 * is implemented, it will not be possible to select items in the set.
 * <p>
 * The model does not need to implement any functions to support either
 * selecting or unselecting items. Of course, if the model does not do that,
 * it means that users cannot select or unselect items in a list widget
 * using the model.
 * <p>
 * All selection functions fall back to {@code GtkSelectionModel::set_selection()}
 * so it is sufficient to implement just that function for full selection
 * support.
 */
public class SelectionModelInterface extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkSelectionModelInterface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("is_selected"),
        Interop.valueLayout.ADDRESS.withName("get_selection_in_range"),
        Interop.valueLayout.ADDRESS.withName("select_item"),
        Interop.valueLayout.ADDRESS.withName("unselect_item"),
        Interop.valueLayout.ADDRESS.withName("select_range"),
        Interop.valueLayout.ADDRESS.withName("unselect_range"),
        Interop.valueLayout.ADDRESS.withName("select_all"),
        Interop.valueLayout.ADDRESS.withName("unselect_all"),
        Interop.valueLayout.ADDRESS.withName("set_selection")
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
     * Allocate a new {@link SelectionModelInterface}
     * @return A new, uninitialized @{link SelectionModelInterface}
     */
    public static SelectionModelInterface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        SelectionModelInterface newInstance = new SelectionModelInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a SelectionModelInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public SelectionModelInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private SelectionModelInterface struct;
        
         /**
         * A {@link SelectionModelInterface.Build} object constructs a {@link SelectionModelInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = SelectionModelInterface.allocate();
        }
        
         /**
         * Finish building the {@link SelectionModelInterface} struct.
         * @return A new instance of {@code SelectionModelInterface} with the fields 
         *         that were set in the Build object.
         */
        public SelectionModelInterface construct() {
            return struct;
        }
        
        public Build setGIface(org.gtk.gobject.TypeInterface gIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Build setIsSelected(java.lang.foreign.MemoryAddress isSelected) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_selected"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (isSelected == null ? MemoryAddress.NULL : isSelected));
            return this;
        }
        
        public Build setGetSelectionInRange(java.lang.foreign.MemoryAddress getSelectionInRange) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_selection_in_range"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSelectionInRange == null ? MemoryAddress.NULL : getSelectionInRange));
            return this;
        }
        
        public Build setSelectItem(java.lang.foreign.MemoryAddress selectItem) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("select_item"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (selectItem == null ? MemoryAddress.NULL : selectItem));
            return this;
        }
        
        public Build setUnselectItem(java.lang.foreign.MemoryAddress unselectItem) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unselect_item"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unselectItem == null ? MemoryAddress.NULL : unselectItem));
            return this;
        }
        
        public Build setSelectRange(java.lang.foreign.MemoryAddress selectRange) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("select_range"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (selectRange == null ? MemoryAddress.NULL : selectRange));
            return this;
        }
        
        public Build setUnselectRange(java.lang.foreign.MemoryAddress unselectRange) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unselect_range"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unselectRange == null ? MemoryAddress.NULL : unselectRange));
            return this;
        }
        
        public Build setSelectAll(java.lang.foreign.MemoryAddress selectAll) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("select_all"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (selectAll == null ? MemoryAddress.NULL : selectAll));
            return this;
        }
        
        public Build setUnselectAll(java.lang.foreign.MemoryAddress unselectAll) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unselect_all"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unselectAll == null ? MemoryAddress.NULL : unselectAll));
            return this;
        }
        
        public Build setSetSelection(java.lang.foreign.MemoryAddress setSelection) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_selection"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setSelection == null ? MemoryAddress.NULL : setSelection));
            return this;
        }
    }
}
