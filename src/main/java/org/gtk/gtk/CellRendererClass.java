package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class CellRendererClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellRendererClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.InitiallyUnownedClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("get_request_mode"),
        Interop.valueLayout.ADDRESS.withName("get_preferred_width"),
        Interop.valueLayout.ADDRESS.withName("get_preferred_height_for_width"),
        Interop.valueLayout.ADDRESS.withName("get_preferred_height"),
        Interop.valueLayout.ADDRESS.withName("get_preferred_width_for_height"),
        Interop.valueLayout.ADDRESS.withName("get_aligned_area"),
        Interop.valueLayout.ADDRESS.withName("snapshot"),
        Interop.valueLayout.ADDRESS.withName("activate"),
        Interop.valueLayout.ADDRESS.withName("start_editing"),
        Interop.valueLayout.ADDRESS.withName("editing_canceled"),
        Interop.valueLayout.ADDRESS.withName("editing_started"),
        MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("padding")
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
     * Allocate a new {@link CellRendererClass}
     * @return A new, uninitialized @{link CellRendererClass}
     */
    public static CellRendererClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        CellRendererClass newInstance = new CellRendererClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a CellRendererClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CellRendererClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private CellRendererClass struct;
        
         /**
         * A {@link CellRendererClass.Build} object constructs a {@link CellRendererClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = CellRendererClass.allocate();
        }
        
         /**
         * Finish building the {@link CellRendererClass} struct.
         * @return A new instance of {@code CellRendererClass} with the fields 
         *         that were set in the Build object.
         */
        public CellRendererClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gobject.InitiallyUnownedClass parent_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_class == null ? MemoryAddress.NULL : parent_class.handle()));
            return this;
        }
        
        public Build setGetRequestMode(java.lang.foreign.MemoryAddress get_request_mode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_request_mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_request_mode == null ? MemoryAddress.NULL : get_request_mode));
            return this;
        }
        
        public Build setGetPreferredWidth(java.lang.foreign.MemoryAddress get_preferred_width) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_width"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_preferred_width == null ? MemoryAddress.NULL : get_preferred_width));
            return this;
        }
        
        public Build setGetPreferredHeightForWidth(java.lang.foreign.MemoryAddress get_preferred_height_for_width) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_height_for_width"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_preferred_height_for_width == null ? MemoryAddress.NULL : get_preferred_height_for_width));
            return this;
        }
        
        public Build setGetPreferredHeight(java.lang.foreign.MemoryAddress get_preferred_height) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_height"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_preferred_height == null ? MemoryAddress.NULL : get_preferred_height));
            return this;
        }
        
        public Build setGetPreferredWidthForHeight(java.lang.foreign.MemoryAddress get_preferred_width_for_height) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_width_for_height"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_preferred_width_for_height == null ? MemoryAddress.NULL : get_preferred_width_for_height));
            return this;
        }
        
        public Build setGetAlignedArea(java.lang.foreign.MemoryAddress get_aligned_area) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_aligned_area"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_aligned_area == null ? MemoryAddress.NULL : get_aligned_area));
            return this;
        }
        
        public Build setSnapshot(java.lang.foreign.MemoryAddress snapshot) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("snapshot"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (snapshot == null ? MemoryAddress.NULL : snapshot));
            return this;
        }
        
        public Build setActivate(java.lang.foreign.MemoryAddress activate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activate == null ? MemoryAddress.NULL : activate));
            return this;
        }
        
        public Build setStartEditing(java.lang.foreign.MemoryAddress start_editing) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_editing"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (start_editing == null ? MemoryAddress.NULL : start_editing));
            return this;
        }
        
        public Build setEditingCanceled(java.lang.foreign.MemoryAddress editing_canceled) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("editing_canceled"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (editing_canceled == null ? MemoryAddress.NULL : editing_canceled));
            return this;
        }
        
        public Build setEditingStarted(java.lang.foreign.MemoryAddress editing_started) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("editing_started"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (editing_started == null ? MemoryAddress.NULL : editing_started));
            return this;
        }
        
        public Build setPadding(java.lang.foreign.MemoryAddress[] padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false)));
            return this;
        }
    }
}
