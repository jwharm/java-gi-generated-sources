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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TextBufferClass}
     * @return A new, uninitialized @{link TextBufferClass}
     */
    public static TextBufferClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TextBufferClass newInstance = new TextBufferClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gobject.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gobject.ObjectClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code InsertTextCallback} callback.
     */
    @FunctionalInterface
    public interface InsertTextCallback {
    
        void run(org.gtk.gtk.TextBuffer buffer, org.gtk.gtk.TextIter pos, java.lang.String newText, int newTextLength);
        
        @ApiStatus.Internal default void upcall(MemoryAddress buffer, MemoryAddress pos, MemoryAddress newText, int newTextLength) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gtk.TextBuffer) Interop.register(buffer, org.gtk.gtk.TextBuffer.fromAddress).marshal(buffer, null), org.gtk.gtk.TextIter.fromAddress.marshal(pos, null), Marshal.addressToString.marshal(newText, null), newTextLength);
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), InsertTextCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code insert_text}
     * @param insertText The new value of the field {@code insert_text}
     */
    public void setInsertText(InsertTextCallback insertText) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("insert_text"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (insertText == null ? MemoryAddress.NULL : insertText.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code InsertPaintableCallback} callback.
     */
    @FunctionalInterface
    public interface InsertPaintableCallback {
    
        void run(org.gtk.gtk.TextBuffer buffer, org.gtk.gtk.TextIter iter, org.gtk.gdk.Paintable paintable);
        
        @ApiStatus.Internal default void upcall(MemoryAddress buffer, MemoryAddress iter, MemoryAddress paintable) {
            run((org.gtk.gtk.TextBuffer) Interop.register(buffer, org.gtk.gtk.TextBuffer.fromAddress).marshal(buffer, null), org.gtk.gtk.TextIter.fromAddress.marshal(iter, null), (org.gtk.gdk.Paintable) Interop.register(paintable, org.gtk.gdk.Paintable.fromAddress).marshal(paintable, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), InsertPaintableCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code insert_paintable}
     * @param insertPaintable The new value of the field {@code insert_paintable}
     */
    public void setInsertPaintable(InsertPaintableCallback insertPaintable) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("insert_paintable"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (insertPaintable == null ? MemoryAddress.NULL : insertPaintable.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code InsertChildAnchorCallback} callback.
     */
    @FunctionalInterface
    public interface InsertChildAnchorCallback {
    
        void run(org.gtk.gtk.TextBuffer buffer, org.gtk.gtk.TextIter iter, org.gtk.gtk.TextChildAnchor anchor);
        
        @ApiStatus.Internal default void upcall(MemoryAddress buffer, MemoryAddress iter, MemoryAddress anchor) {
            run((org.gtk.gtk.TextBuffer) Interop.register(buffer, org.gtk.gtk.TextBuffer.fromAddress).marshal(buffer, null), org.gtk.gtk.TextIter.fromAddress.marshal(iter, null), (org.gtk.gtk.TextChildAnchor) Interop.register(anchor, org.gtk.gtk.TextChildAnchor.fromAddress).marshal(anchor, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), InsertChildAnchorCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code insert_child_anchor}
     * @param insertChildAnchor The new value of the field {@code insert_child_anchor}
     */
    public void setInsertChildAnchor(InsertChildAnchorCallback insertChildAnchor) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("insert_child_anchor"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (insertChildAnchor == null ? MemoryAddress.NULL : insertChildAnchor.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DeleteRangeCallback} callback.
     */
    @FunctionalInterface
    public interface DeleteRangeCallback {
    
        void run(org.gtk.gtk.TextBuffer buffer, org.gtk.gtk.TextIter start, org.gtk.gtk.TextIter end);
        
        @ApiStatus.Internal default void upcall(MemoryAddress buffer, MemoryAddress start, MemoryAddress end) {
            run((org.gtk.gtk.TextBuffer) Interop.register(buffer, org.gtk.gtk.TextBuffer.fromAddress).marshal(buffer, null), org.gtk.gtk.TextIter.fromAddress.marshal(start, null), org.gtk.gtk.TextIter.fromAddress.marshal(end, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DeleteRangeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code delete_range}
     * @param deleteRange The new value of the field {@code delete_range}
     */
    public void setDeleteRange(DeleteRangeCallback deleteRange) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delete_range"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (deleteRange == null ? MemoryAddress.NULL : deleteRange.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ChangedCallback} callback.
     */
    @FunctionalInterface
    public interface ChangedCallback {
    
        void run(org.gtk.gtk.TextBuffer buffer);
        
        @ApiStatus.Internal default void upcall(MemoryAddress buffer) {
            run((org.gtk.gtk.TextBuffer) Interop.register(buffer, org.gtk.gtk.TextBuffer.fromAddress).marshal(buffer, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ChangedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code changed}
     * @param changed The new value of the field {@code changed}
     */
    public void setChanged(ChangedCallback changed) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (changed == null ? MemoryAddress.NULL : changed.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ModifiedChangedCallback} callback.
     */
    @FunctionalInterface
    public interface ModifiedChangedCallback {
    
        void run(org.gtk.gtk.TextBuffer buffer);
        
        @ApiStatus.Internal default void upcall(MemoryAddress buffer) {
            run((org.gtk.gtk.TextBuffer) Interop.register(buffer, org.gtk.gtk.TextBuffer.fromAddress).marshal(buffer, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ModifiedChangedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code modified_changed}
     * @param modifiedChanged The new value of the field {@code modified_changed}
     */
    public void setModifiedChanged(ModifiedChangedCallback modifiedChanged) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("modified_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (modifiedChanged == null ? MemoryAddress.NULL : modifiedChanged.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MarkSetCallback} callback.
     */
    @FunctionalInterface
    public interface MarkSetCallback {
    
        void run(org.gtk.gtk.TextBuffer buffer, org.gtk.gtk.TextIter location, org.gtk.gtk.TextMark mark);
        
        @ApiStatus.Internal default void upcall(MemoryAddress buffer, MemoryAddress location, MemoryAddress mark) {
            run((org.gtk.gtk.TextBuffer) Interop.register(buffer, org.gtk.gtk.TextBuffer.fromAddress).marshal(buffer, null), org.gtk.gtk.TextIter.fromAddress.marshal(location, null), (org.gtk.gtk.TextMark) Interop.register(mark, org.gtk.gtk.TextMark.fromAddress).marshal(mark, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MarkSetCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code mark_set}
     * @param markSet The new value of the field {@code mark_set}
     */
    public void setMarkSet(MarkSetCallback markSet) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mark_set"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (markSet == null ? MemoryAddress.NULL : markSet.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MarkDeletedCallback} callback.
     */
    @FunctionalInterface
    public interface MarkDeletedCallback {
    
        void run(org.gtk.gtk.TextBuffer buffer, org.gtk.gtk.TextMark mark);
        
        @ApiStatus.Internal default void upcall(MemoryAddress buffer, MemoryAddress mark) {
            run((org.gtk.gtk.TextBuffer) Interop.register(buffer, org.gtk.gtk.TextBuffer.fromAddress).marshal(buffer, null), (org.gtk.gtk.TextMark) Interop.register(mark, org.gtk.gtk.TextMark.fromAddress).marshal(mark, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MarkDeletedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code mark_deleted}
     * @param markDeleted The new value of the field {@code mark_deleted}
     */
    public void setMarkDeleted(MarkDeletedCallback markDeleted) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mark_deleted"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (markDeleted == null ? MemoryAddress.NULL : markDeleted.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ApplyTagCallback} callback.
     */
    @FunctionalInterface
    public interface ApplyTagCallback {
    
        void run(org.gtk.gtk.TextBuffer buffer, org.gtk.gtk.TextTag tag, org.gtk.gtk.TextIter start, org.gtk.gtk.TextIter end);
        
        @ApiStatus.Internal default void upcall(MemoryAddress buffer, MemoryAddress tag, MemoryAddress start, MemoryAddress end) {
            run((org.gtk.gtk.TextBuffer) Interop.register(buffer, org.gtk.gtk.TextBuffer.fromAddress).marshal(buffer, null), (org.gtk.gtk.TextTag) Interop.register(tag, org.gtk.gtk.TextTag.fromAddress).marshal(tag, null), org.gtk.gtk.TextIter.fromAddress.marshal(start, null), org.gtk.gtk.TextIter.fromAddress.marshal(end, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ApplyTagCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code apply_tag}
     * @param applyTag The new value of the field {@code apply_tag}
     */
    public void setApplyTag(ApplyTagCallback applyTag) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("apply_tag"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (applyTag == null ? MemoryAddress.NULL : applyTag.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RemoveTagCallback} callback.
     */
    @FunctionalInterface
    public interface RemoveTagCallback {
    
        void run(org.gtk.gtk.TextBuffer buffer, org.gtk.gtk.TextTag tag, org.gtk.gtk.TextIter start, org.gtk.gtk.TextIter end);
        
        @ApiStatus.Internal default void upcall(MemoryAddress buffer, MemoryAddress tag, MemoryAddress start, MemoryAddress end) {
            run((org.gtk.gtk.TextBuffer) Interop.register(buffer, org.gtk.gtk.TextBuffer.fromAddress).marshal(buffer, null), (org.gtk.gtk.TextTag) Interop.register(tag, org.gtk.gtk.TextTag.fromAddress).marshal(tag, null), org.gtk.gtk.TextIter.fromAddress.marshal(start, null), org.gtk.gtk.TextIter.fromAddress.marshal(end, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RemoveTagCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code remove_tag}
     * @param removeTag The new value of the field {@code remove_tag}
     */
    public void setRemoveTag(RemoveTagCallback removeTag) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("remove_tag"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (removeTag == null ? MemoryAddress.NULL : removeTag.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code BeginUserActionCallback} callback.
     */
    @FunctionalInterface
    public interface BeginUserActionCallback {
    
        void run(org.gtk.gtk.TextBuffer buffer);
        
        @ApiStatus.Internal default void upcall(MemoryAddress buffer) {
            run((org.gtk.gtk.TextBuffer) Interop.register(buffer, org.gtk.gtk.TextBuffer.fromAddress).marshal(buffer, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), BeginUserActionCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code begin_user_action}
     * @param beginUserAction The new value of the field {@code begin_user_action}
     */
    public void setBeginUserAction(BeginUserActionCallback beginUserAction) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("begin_user_action"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (beginUserAction == null ? MemoryAddress.NULL : beginUserAction.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code EndUserActionCallback} callback.
     */
    @FunctionalInterface
    public interface EndUserActionCallback {
    
        void run(org.gtk.gtk.TextBuffer buffer);
        
        @ApiStatus.Internal default void upcall(MemoryAddress buffer) {
            run((org.gtk.gtk.TextBuffer) Interop.register(buffer, org.gtk.gtk.TextBuffer.fromAddress).marshal(buffer, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EndUserActionCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code end_user_action}
     * @param endUserAction The new value of the field {@code end_user_action}
     */
    public void setEndUserAction(EndUserActionCallback endUserAction) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("end_user_action"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (endUserAction == null ? MemoryAddress.NULL : endUserAction.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PasteDoneCallback} callback.
     */
    @FunctionalInterface
    public interface PasteDoneCallback {
    
        void run(org.gtk.gtk.TextBuffer buffer, org.gtk.gdk.Clipboard clipboard);
        
        @ApiStatus.Internal default void upcall(MemoryAddress buffer, MemoryAddress clipboard) {
            run((org.gtk.gtk.TextBuffer) Interop.register(buffer, org.gtk.gtk.TextBuffer.fromAddress).marshal(buffer, null), (org.gtk.gdk.Clipboard) Interop.register(clipboard, org.gtk.gdk.Clipboard.fromAddress).marshal(clipboard, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PasteDoneCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code paste_done}
     * @param pasteDone The new value of the field {@code paste_done}
     */
    public void setPasteDone(PasteDoneCallback pasteDone) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("paste_done"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pasteDone == null ? MemoryAddress.NULL : pasteDone.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code UndoCallback} callback.
     */
    @FunctionalInterface
    public interface UndoCallback {
    
        void run(org.gtk.gtk.TextBuffer buffer);
        
        @ApiStatus.Internal default void upcall(MemoryAddress buffer) {
            run((org.gtk.gtk.TextBuffer) Interop.register(buffer, org.gtk.gtk.TextBuffer.fromAddress).marshal(buffer, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), UndoCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code undo}
     * @param undo The new value of the field {@code undo}
     */
    public void setUndo(UndoCallback undo) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("undo"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (undo == null ? MemoryAddress.NULL : undo.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RedoCallback} callback.
     */
    @FunctionalInterface
    public interface RedoCallback {
    
        void run(org.gtk.gtk.TextBuffer buffer);
        
        @ApiStatus.Internal default void upcall(MemoryAddress buffer) {
            run((org.gtk.gtk.TextBuffer) Interop.register(buffer, org.gtk.gtk.TextBuffer.fromAddress).marshal(buffer, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RedoCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code redo}
     * @param redo The new value of the field {@code redo}
     */
    public void setRedo(RedoCallback redo) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("redo"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (redo == null ? MemoryAddress.NULL : redo.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GtkReserved1Callback} callback.
     */
    @FunctionalInterface
    public interface GtkReserved1Callback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GtkReserved1Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved1}
     * @param GtkReserved1 The new value of the field {@code _gtk_reserved1}
     */
    public void setGtkReserved1(GtkReserved1Callback GtkReserved1) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved1 == null ? MemoryAddress.NULL : GtkReserved1.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GtkReserved2Callback} callback.
     */
    @FunctionalInterface
    public interface GtkReserved2Callback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GtkReserved2Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved2}
     * @param GtkReserved2 The new value of the field {@code _gtk_reserved2}
     */
    public void setGtkReserved2(GtkReserved2Callback GtkReserved2) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved2 == null ? MemoryAddress.NULL : GtkReserved2.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GtkReserved3Callback} callback.
     */
    @FunctionalInterface
    public interface GtkReserved3Callback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GtkReserved3Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved3}
     * @param GtkReserved3 The new value of the field {@code _gtk_reserved3}
     */
    public void setGtkReserved3(GtkReserved3Callback GtkReserved3) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved3 == null ? MemoryAddress.NULL : GtkReserved3.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GtkReserved4Callback} callback.
     */
    @FunctionalInterface
    public interface GtkReserved4Callback {
    
        void run();
        
        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GtkReserved4Callback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved4}
     * @param GtkReserved4 The new value of the field {@code _gtk_reserved4}
     */
    public void setGtkReserved4(GtkReserved4Callback GtkReserved4) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved4 == null ? MemoryAddress.NULL : GtkReserved4.toCallback()));
        }
    }
    
    /**
     * Create a TextBufferClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TextBufferClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TextBufferClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TextBufferClass(input);
    
    /**
     * A {@link TextBufferClass.Builder} object constructs a {@link TextBufferClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TextBufferClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TextBufferClass struct;
        
        private Builder() {
            struct = TextBufferClass.allocate();
        }
        
        /**
         * Finish building the {@link TextBufferClass} struct.
         * @return A new instance of {@code TextBufferClass} with the fields 
         *         that were set in the Builder object.
         */
        public TextBufferClass build() {
            return struct;
        }
        
        /**
         * The object class structure needs to be the first.
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setInsertText(InsertTextCallback insertText) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("insert_text"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (insertText == null ? MemoryAddress.NULL : insertText.toCallback()));
                return this;
            }
        }
        
        public Builder setInsertPaintable(InsertPaintableCallback insertPaintable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("insert_paintable"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (insertPaintable == null ? MemoryAddress.NULL : insertPaintable.toCallback()));
                return this;
            }
        }
        
        public Builder setInsertChildAnchor(InsertChildAnchorCallback insertChildAnchor) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("insert_child_anchor"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (insertChildAnchor == null ? MemoryAddress.NULL : insertChildAnchor.toCallback()));
                return this;
            }
        }
        
        public Builder setDeleteRange(DeleteRangeCallback deleteRange) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("delete_range"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (deleteRange == null ? MemoryAddress.NULL : deleteRange.toCallback()));
                return this;
            }
        }
        
        public Builder setChanged(ChangedCallback changed) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("changed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (changed == null ? MemoryAddress.NULL : changed.toCallback()));
                return this;
            }
        }
        
        public Builder setModifiedChanged(ModifiedChangedCallback modifiedChanged) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("modified_changed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (modifiedChanged == null ? MemoryAddress.NULL : modifiedChanged.toCallback()));
                return this;
            }
        }
        
        public Builder setMarkSet(MarkSetCallback markSet) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("mark_set"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (markSet == null ? MemoryAddress.NULL : markSet.toCallback()));
                return this;
            }
        }
        
        public Builder setMarkDeleted(MarkDeletedCallback markDeleted) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("mark_deleted"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (markDeleted == null ? MemoryAddress.NULL : markDeleted.toCallback()));
                return this;
            }
        }
        
        public Builder setApplyTag(ApplyTagCallback applyTag) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("apply_tag"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (applyTag == null ? MemoryAddress.NULL : applyTag.toCallback()));
                return this;
            }
        }
        
        public Builder setRemoveTag(RemoveTagCallback removeTag) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("remove_tag"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (removeTag == null ? MemoryAddress.NULL : removeTag.toCallback()));
                return this;
            }
        }
        
        public Builder setBeginUserAction(BeginUserActionCallback beginUserAction) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("begin_user_action"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (beginUserAction == null ? MemoryAddress.NULL : beginUserAction.toCallback()));
                return this;
            }
        }
        
        public Builder setEndUserAction(EndUserActionCallback endUserAction) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("end_user_action"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (endUserAction == null ? MemoryAddress.NULL : endUserAction.toCallback()));
                return this;
            }
        }
        
        public Builder setPasteDone(PasteDoneCallback pasteDone) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("paste_done"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pasteDone == null ? MemoryAddress.NULL : pasteDone.toCallback()));
                return this;
            }
        }
        
        public Builder setUndo(UndoCallback undo) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("undo"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (undo == null ? MemoryAddress.NULL : undo.toCallback()));
                return this;
            }
        }
        
        public Builder setRedo(RedoCallback redo) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("redo"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (redo == null ? MemoryAddress.NULL : redo.toCallback()));
                return this;
            }
        }
        
        public Builder setGtkReserved1(GtkReserved1Callback GtkReserved1) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved1 == null ? MemoryAddress.NULL : GtkReserved1.toCallback()));
                return this;
            }
        }
        
        public Builder setGtkReserved2(GtkReserved2Callback GtkReserved2) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved2 == null ? MemoryAddress.NULL : GtkReserved2.toCallback()));
                return this;
            }
        }
        
        public Builder setGtkReserved3(GtkReserved3Callback GtkReserved3) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved3 == null ? MemoryAddress.NULL : GtkReserved3.toCallback()));
                return this;
            }
        }
        
        public Builder setGtkReserved4(GtkReserved4Callback GtkReserved4) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GtkReserved4 == null ? MemoryAddress.NULL : GtkReserved4.toCallback()));
                return this;
            }
        }
    }
}
