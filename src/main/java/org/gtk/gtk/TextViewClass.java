package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TextViewClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTextViewClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gtk.WidgetClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("move_cursor"),
        Interop.valueLayout.ADDRESS.withName("set_anchor"),
        Interop.valueLayout.ADDRESS.withName("insert_at_cursor"),
        Interop.valueLayout.ADDRESS.withName("delete_from_cursor"),
        Interop.valueLayout.ADDRESS.withName("backspace"),
        Interop.valueLayout.ADDRESS.withName("cut_clipboard"),
        Interop.valueLayout.ADDRESS.withName("copy_clipboard"),
        Interop.valueLayout.ADDRESS.withName("paste_clipboard"),
        Interop.valueLayout.ADDRESS.withName("toggle_overwrite"),
        Interop.valueLayout.ADDRESS.withName("create_buffer"),
        Interop.valueLayout.ADDRESS.withName("snapshot_layer"),
        Interop.valueLayout.ADDRESS.withName("extend_selection"),
        Interop.valueLayout.ADDRESS.withName("insert_emoji"),
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
     * Allocate a new {@link TextViewClass}
     * @return A new, uninitialized @{link TextViewClass}
     */
    public static TextViewClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TextViewClass newInstance = new TextViewClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gtk.WidgetClass parent_class$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gtk.WidgetClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a TextViewClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TextViewClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private TextViewClass struct;
        
         /**
         * A {@link TextViewClass.Build} object constructs a {@link TextViewClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = TextViewClass.allocate();
        }
        
         /**
         * Finish building the {@link TextViewClass} struct.
         * @return A new instance of {@code TextViewClass} with the fields 
         *         that were set in the Build object.
         */
        public TextViewClass construct() {
            return struct;
        }
        
        /**
         * The object class structure needs to be the first
         * @param parent_class The value for the {@code parent_class} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentClass(org.gtk.gtk.WidgetClass parent_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_class == null ? MemoryAddress.NULL : parent_class.handle()));
            return this;
        }
        
        public Build setMoveCursor(java.lang.foreign.MemoryAddress move_cursor) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("move_cursor"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (move_cursor == null ? MemoryAddress.NULL : move_cursor));
            return this;
        }
        
        public Build setSetAnchor(java.lang.foreign.MemoryAddress set_anchor) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_anchor"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_anchor == null ? MemoryAddress.NULL : set_anchor));
            return this;
        }
        
        public Build setInsertAtCursor(java.lang.foreign.MemoryAddress insert_at_cursor) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("insert_at_cursor"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (insert_at_cursor == null ? MemoryAddress.NULL : insert_at_cursor));
            return this;
        }
        
        public Build setDeleteFromCursor(java.lang.foreign.MemoryAddress delete_from_cursor) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delete_from_cursor"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (delete_from_cursor == null ? MemoryAddress.NULL : delete_from_cursor));
            return this;
        }
        
        public Build setBackspace(java.lang.foreign.MemoryAddress backspace) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("backspace"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (backspace == null ? MemoryAddress.NULL : backspace));
            return this;
        }
        
        public Build setCutClipboard(java.lang.foreign.MemoryAddress cut_clipboard) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cut_clipboard"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cut_clipboard == null ? MemoryAddress.NULL : cut_clipboard));
            return this;
        }
        
        public Build setCopyClipboard(java.lang.foreign.MemoryAddress copy_clipboard) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy_clipboard"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copy_clipboard == null ? MemoryAddress.NULL : copy_clipboard));
            return this;
        }
        
        public Build setPasteClipboard(java.lang.foreign.MemoryAddress paste_clipboard) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("paste_clipboard"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (paste_clipboard == null ? MemoryAddress.NULL : paste_clipboard));
            return this;
        }
        
        public Build setToggleOverwrite(java.lang.foreign.MemoryAddress toggle_overwrite) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("toggle_overwrite"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (toggle_overwrite == null ? MemoryAddress.NULL : toggle_overwrite));
            return this;
        }
        
        public Build setCreateBuffer(java.lang.foreign.MemoryAddress create_buffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (create_buffer == null ? MemoryAddress.NULL : create_buffer));
            return this;
        }
        
        public Build setSnapshotLayer(java.lang.foreign.MemoryAddress snapshot_layer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("snapshot_layer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (snapshot_layer == null ? MemoryAddress.NULL : snapshot_layer));
            return this;
        }
        
        public Build setExtendSelection(java.lang.foreign.MemoryAddress extend_selection) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("extend_selection"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (extend_selection == null ? MemoryAddress.NULL : extend_selection));
            return this;
        }
        
        public Build setInsertEmoji(java.lang.foreign.MemoryAddress insert_emoji) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("insert_emoji"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (insert_emoji == null ? MemoryAddress.NULL : insert_emoji));
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
