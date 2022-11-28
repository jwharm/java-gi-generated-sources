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
    public org.gtk.gtk.WidgetClass parentClass$get() {
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
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentClass(org.gtk.gtk.WidgetClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setMoveCursor(java.lang.foreign.MemoryAddress moveCursor) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("move_cursor"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (moveCursor == null ? MemoryAddress.NULL : moveCursor));
            return this;
        }
        
        public Build setSetAnchor(java.lang.foreign.MemoryAddress setAnchor) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_anchor"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setAnchor == null ? MemoryAddress.NULL : setAnchor));
            return this;
        }
        
        public Build setInsertAtCursor(java.lang.foreign.MemoryAddress insertAtCursor) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("insert_at_cursor"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (insertAtCursor == null ? MemoryAddress.NULL : insertAtCursor));
            return this;
        }
        
        public Build setDeleteFromCursor(java.lang.foreign.MemoryAddress deleteFromCursor) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delete_from_cursor"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deleteFromCursor == null ? MemoryAddress.NULL : deleteFromCursor));
            return this;
        }
        
        public Build setBackspace(java.lang.foreign.MemoryAddress backspace) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("backspace"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (backspace == null ? MemoryAddress.NULL : backspace));
            return this;
        }
        
        public Build setCutClipboard(java.lang.foreign.MemoryAddress cutClipboard) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cut_clipboard"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (cutClipboard == null ? MemoryAddress.NULL : cutClipboard));
            return this;
        }
        
        public Build setCopyClipboard(java.lang.foreign.MemoryAddress copyClipboard) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy_clipboard"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copyClipboard == null ? MemoryAddress.NULL : copyClipboard));
            return this;
        }
        
        public Build setPasteClipboard(java.lang.foreign.MemoryAddress pasteClipboard) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("paste_clipboard"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pasteClipboard == null ? MemoryAddress.NULL : pasteClipboard));
            return this;
        }
        
        public Build setToggleOverwrite(java.lang.foreign.MemoryAddress toggleOverwrite) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("toggle_overwrite"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (toggleOverwrite == null ? MemoryAddress.NULL : toggleOverwrite));
            return this;
        }
        
        public Build setCreateBuffer(java.lang.foreign.MemoryAddress createBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createBuffer == null ? MemoryAddress.NULL : createBuffer));
            return this;
        }
        
        public Build setSnapshotLayer(java.lang.foreign.MemoryAddress snapshotLayer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("snapshot_layer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (snapshotLayer == null ? MemoryAddress.NULL : snapshotLayer));
            return this;
        }
        
        public Build setExtendSelection(java.lang.foreign.MemoryAddress extendSelection) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("extend_selection"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (extendSelection == null ? MemoryAddress.NULL : extendSelection));
            return this;
        }
        
        public Build setInsertEmoji(java.lang.foreign.MemoryAddress insertEmoji) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("insert_emoji"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (insertEmoji == null ? MemoryAddress.NULL : insertEmoji));
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
