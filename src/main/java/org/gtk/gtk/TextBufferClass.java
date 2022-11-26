package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The class structure for {@code GtkTextBuffer}.
 */
public class TextBufferClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTextBufferClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("insert_text"),
        Interop.valueLayout.ADDRESS.withName("insert_paintable"),
        Interop.valueLayout.ADDRESS.withName("insert_child_anchor"),
        Interop.valueLayout.ADDRESS.withName("delete_range"),
        Interop.valueLayout.ADDRESS.withName("changed"),
        Interop.valueLayout.ADDRESS.withName("modified_changed"),
        Interop.valueLayout.ADDRESS.withName("mark_set"),
        Interop.valueLayout.ADDRESS.withName("mark_deleted"),
        Interop.valueLayout.ADDRESS.withName("apply_tag"),
        Interop.valueLayout.ADDRESS.withName("remove_tag"),
        Interop.valueLayout.ADDRESS.withName("begin_user_action"),
        Interop.valueLayout.ADDRESS.withName("end_user_action"),
        Interop.valueLayout.ADDRESS.withName("paste_done"),
        Interop.valueLayout.ADDRESS.withName("undo"),
        Interop.valueLayout.ADDRESS.withName("redo"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved1"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved2"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved3"),
        Interop.valueLayout.ADDRESS.withName("_gtk_reserved4")
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
     * Allocate a new {@link TextBufferClass}
     * @return A new, uninitialized @{link TextBufferClass}
     */
    public static TextBufferClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TextBufferClass newInstance = new TextBufferClass(segment.address(), Ownership.NONE);
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
     * Create a TextBufferClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public TextBufferClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private TextBufferClass struct;
        
         /**
         * A {@link TextBufferClass.Build} object constructs a {@link TextBufferClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = TextBufferClass.allocate();
        }
        
         /**
         * Finish building the {@link TextBufferClass} struct.
         * @return A new instance of {@code TextBufferClass} with the fields 
         *         that were set in the Build object.
         */
        public TextBufferClass construct() {
            return struct;
        }
        
        /**
         * The object class structure needs to be the first.
         * @param parent_class The value for the {@code parent_class} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParentClass(org.gtk.gobject.ObjectClass parent_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_class == null ? MemoryAddress.NULL : parent_class.handle()));
            return this;
        }
        
        public Build setInsertText(java.lang.foreign.MemoryAddress insert_text) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("insert_text"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (insert_text == null ? MemoryAddress.NULL : insert_text));
            return this;
        }
        
        public Build setInsertPaintable(java.lang.foreign.MemoryAddress insert_paintable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("insert_paintable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (insert_paintable == null ? MemoryAddress.NULL : insert_paintable));
            return this;
        }
        
        public Build setInsertChildAnchor(java.lang.foreign.MemoryAddress insert_child_anchor) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("insert_child_anchor"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (insert_child_anchor == null ? MemoryAddress.NULL : insert_child_anchor));
            return this;
        }
        
        public Build setDeleteRange(java.lang.foreign.MemoryAddress delete_range) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delete_range"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (delete_range == null ? MemoryAddress.NULL : delete_range));
            return this;
        }
        
        public Build setChanged(java.lang.foreign.MemoryAddress changed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (changed == null ? MemoryAddress.NULL : changed));
            return this;
        }
        
        public Build setModifiedChanged(java.lang.foreign.MemoryAddress modified_changed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("modified_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (modified_changed == null ? MemoryAddress.NULL : modified_changed));
            return this;
        }
        
        public Build setMarkSet(java.lang.foreign.MemoryAddress mark_set) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mark_set"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mark_set == null ? MemoryAddress.NULL : mark_set));
            return this;
        }
        
        public Build setMarkDeleted(java.lang.foreign.MemoryAddress mark_deleted) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mark_deleted"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mark_deleted == null ? MemoryAddress.NULL : mark_deleted));
            return this;
        }
        
        public Build setApplyTag(java.lang.foreign.MemoryAddress apply_tag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("apply_tag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (apply_tag == null ? MemoryAddress.NULL : apply_tag));
            return this;
        }
        
        public Build setRemoveTag(java.lang.foreign.MemoryAddress remove_tag) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("remove_tag"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (remove_tag == null ? MemoryAddress.NULL : remove_tag));
            return this;
        }
        
        public Build setBeginUserAction(java.lang.foreign.MemoryAddress begin_user_action) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("begin_user_action"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (begin_user_action == null ? MemoryAddress.NULL : begin_user_action));
            return this;
        }
        
        public Build setEndUserAction(java.lang.foreign.MemoryAddress end_user_action) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end_user_action"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (end_user_action == null ? MemoryAddress.NULL : end_user_action));
            return this;
        }
        
        public Build setPasteDone(java.lang.foreign.MemoryAddress paste_done) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("paste_done"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (paste_done == null ? MemoryAddress.NULL : paste_done));
            return this;
        }
        
        public Build setUndo(java.lang.foreign.MemoryAddress undo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("undo"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (undo == null ? MemoryAddress.NULL : undo));
            return this;
        }
        
        public Build setRedo(java.lang.foreign.MemoryAddress redo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("redo"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (redo == null ? MemoryAddress.NULL : redo));
            return this;
        }
        
        public Build setGtkReserved1(java.lang.foreign.MemoryAddress _gtk_reserved1) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_gtk_reserved1 == null ? MemoryAddress.NULL : _gtk_reserved1));
            return this;
        }
        
        public Build setGtkReserved2(java.lang.foreign.MemoryAddress _gtk_reserved2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_gtk_reserved2 == null ? MemoryAddress.NULL : _gtk_reserved2));
            return this;
        }
        
        public Build setGtkReserved3(java.lang.foreign.MemoryAddress _gtk_reserved3) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_gtk_reserved3 == null ? MemoryAddress.NULL : _gtk_reserved3));
            return this;
        }
        
        public Build setGtkReserved4(java.lang.foreign.MemoryAddress _gtk_reserved4) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_gtk_reserved4 == null ? MemoryAddress.NULL : _gtk_reserved4));
            return this;
        }
    }
}
