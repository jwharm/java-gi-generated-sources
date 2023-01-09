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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TextViewClass}
     * @return A new, uninitialized @{link TextViewClass}
     */
    public static TextViewClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TextViewClass newInstance = new TextViewClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gtk.WidgetClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gtk.WidgetClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gtk.WidgetClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MoveCursorCallback} callback.
     */
    @FunctionalInterface
    public interface MoveCursorCallback {
    
        void run(org.gtk.gtk.TextView textView, org.gtk.gtk.MovementStep step, int count, boolean extendSelection);
        
        @ApiStatus.Internal default void upcall(MemoryAddress textView, int step, int count, int extendSelection) {
            run((org.gtk.gtk.TextView) Interop.register(textView, org.gtk.gtk.TextView.fromAddress).marshal(textView, null), org.gtk.gtk.MovementStep.of(step), count, Marshal.integerToBoolean.marshal(extendSelection, null).booleanValue());
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MoveCursorCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code move_cursor}
     * @param moveCursor The new value of the field {@code move_cursor}
     */
    public void setMoveCursor(MoveCursorCallback moveCursor) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("move_cursor"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (moveCursor == null ? MemoryAddress.NULL : moveCursor.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetAnchorCallback} callback.
     */
    @FunctionalInterface
    public interface SetAnchorCallback {
    
        void run(org.gtk.gtk.TextView textView);
        
        @ApiStatus.Internal default void upcall(MemoryAddress textView) {
            run((org.gtk.gtk.TextView) Interop.register(textView, org.gtk.gtk.TextView.fromAddress).marshal(textView, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetAnchorCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_anchor}
     * @param setAnchor The new value of the field {@code set_anchor}
     */
    public void setSetAnchor(SetAnchorCallback setAnchor) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_anchor"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setAnchor == null ? MemoryAddress.NULL : setAnchor.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code InsertAtCursorCallback} callback.
     */
    @FunctionalInterface
    public interface InsertAtCursorCallback {
    
        void run(org.gtk.gtk.TextView textView, java.lang.String str);
        
        @ApiStatus.Internal default void upcall(MemoryAddress textView, MemoryAddress str) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gtk.TextView) Interop.register(textView, org.gtk.gtk.TextView.fromAddress).marshal(textView, null), Marshal.addressToString.marshal(str, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), InsertAtCursorCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code insert_at_cursor}
     * @param insertAtCursor The new value of the field {@code insert_at_cursor}
     */
    public void setInsertAtCursor(InsertAtCursorCallback insertAtCursor) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("insert_at_cursor"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (insertAtCursor == null ? MemoryAddress.NULL : insertAtCursor.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DeleteFromCursorCallback} callback.
     */
    @FunctionalInterface
    public interface DeleteFromCursorCallback {
    
        void run(org.gtk.gtk.TextView textView, org.gtk.gtk.DeleteType type, int count);
        
        @ApiStatus.Internal default void upcall(MemoryAddress textView, int type, int count) {
            run((org.gtk.gtk.TextView) Interop.register(textView, org.gtk.gtk.TextView.fromAddress).marshal(textView, null), org.gtk.gtk.DeleteType.of(type), count);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DeleteFromCursorCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code delete_from_cursor}
     * @param deleteFromCursor The new value of the field {@code delete_from_cursor}
     */
    public void setDeleteFromCursor(DeleteFromCursorCallback deleteFromCursor) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delete_from_cursor"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (deleteFromCursor == null ? MemoryAddress.NULL : deleteFromCursor.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code BackspaceCallback} callback.
     */
    @FunctionalInterface
    public interface BackspaceCallback {
    
        void run(org.gtk.gtk.TextView textView);
        
        @ApiStatus.Internal default void upcall(MemoryAddress textView) {
            run((org.gtk.gtk.TextView) Interop.register(textView, org.gtk.gtk.TextView.fromAddress).marshal(textView, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), BackspaceCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code backspace}
     * @param backspace The new value of the field {@code backspace}
     */
    public void setBackspace(BackspaceCallback backspace) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("backspace"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (backspace == null ? MemoryAddress.NULL : backspace.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CutClipboardCallback} callback.
     */
    @FunctionalInterface
    public interface CutClipboardCallback {
    
        void run(org.gtk.gtk.TextView textView);
        
        @ApiStatus.Internal default void upcall(MemoryAddress textView) {
            run((org.gtk.gtk.TextView) Interop.register(textView, org.gtk.gtk.TextView.fromAddress).marshal(textView, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CutClipboardCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code cut_clipboard}
     * @param cutClipboard The new value of the field {@code cut_clipboard}
     */
    public void setCutClipboard(CutClipboardCallback cutClipboard) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("cut_clipboard"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (cutClipboard == null ? MemoryAddress.NULL : cutClipboard.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CopyClipboardCallback} callback.
     */
    @FunctionalInterface
    public interface CopyClipboardCallback {
    
        void run(org.gtk.gtk.TextView textView);
        
        @ApiStatus.Internal default void upcall(MemoryAddress textView) {
            run((org.gtk.gtk.TextView) Interop.register(textView, org.gtk.gtk.TextView.fromAddress).marshal(textView, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CopyClipboardCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code copy_clipboard}
     * @param copyClipboard The new value of the field {@code copy_clipboard}
     */
    public void setCopyClipboard(CopyClipboardCallback copyClipboard) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy_clipboard"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (copyClipboard == null ? MemoryAddress.NULL : copyClipboard.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code PasteClipboardCallback} callback.
     */
    @FunctionalInterface
    public interface PasteClipboardCallback {
    
        void run(org.gtk.gtk.TextView textView);
        
        @ApiStatus.Internal default void upcall(MemoryAddress textView) {
            run((org.gtk.gtk.TextView) Interop.register(textView, org.gtk.gtk.TextView.fromAddress).marshal(textView, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PasteClipboardCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code paste_clipboard}
     * @param pasteClipboard The new value of the field {@code paste_clipboard}
     */
    public void setPasteClipboard(PasteClipboardCallback pasteClipboard) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("paste_clipboard"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pasteClipboard == null ? MemoryAddress.NULL : pasteClipboard.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ToggleOverwriteCallback} callback.
     */
    @FunctionalInterface
    public interface ToggleOverwriteCallback {
    
        void run(org.gtk.gtk.TextView textView);
        
        @ApiStatus.Internal default void upcall(MemoryAddress textView) {
            run((org.gtk.gtk.TextView) Interop.register(textView, org.gtk.gtk.TextView.fromAddress).marshal(textView, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ToggleOverwriteCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code toggle_overwrite}
     * @param toggleOverwrite The new value of the field {@code toggle_overwrite}
     */
    public void setToggleOverwrite(ToggleOverwriteCallback toggleOverwrite) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("toggle_overwrite"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (toggleOverwrite == null ? MemoryAddress.NULL : toggleOverwrite.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CreateBufferCallback} callback.
     */
    @FunctionalInterface
    public interface CreateBufferCallback {
    
        org.gtk.gtk.TextBuffer run(org.gtk.gtk.TextView textView);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress textView) {
            var RESULT = run((org.gtk.gtk.TextView) Interop.register(textView, org.gtk.gtk.TextView.fromAddress).marshal(textView, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CreateBufferCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_buffer}
     * @param createBuffer The new value of the field {@code create_buffer}
     */
    public void setCreateBuffer(CreateBufferCallback createBuffer) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createBuffer == null ? MemoryAddress.NULL : createBuffer.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SnapshotLayerCallback} callback.
     */
    @FunctionalInterface
    public interface SnapshotLayerCallback {
    
        void run(org.gtk.gtk.TextView textView, org.gtk.gtk.TextViewLayer layer, org.gtk.gtk.Snapshot snapshot);
        
        @ApiStatus.Internal default void upcall(MemoryAddress textView, int layer, MemoryAddress snapshot) {
            run((org.gtk.gtk.TextView) Interop.register(textView, org.gtk.gtk.TextView.fromAddress).marshal(textView, null), org.gtk.gtk.TextViewLayer.of(layer), (org.gtk.gtk.Snapshot) Interop.register(snapshot, org.gtk.gtk.Snapshot.fromAddress).marshal(snapshot, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SnapshotLayerCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code snapshot_layer}
     * @param snapshotLayer The new value of the field {@code snapshot_layer}
     */
    public void setSnapshotLayer(SnapshotLayerCallback snapshotLayer) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("snapshot_layer"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (snapshotLayer == null ? MemoryAddress.NULL : snapshotLayer.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ExtendSelectionCallback} callback.
     */
    @FunctionalInterface
    public interface ExtendSelectionCallback {
    
        boolean run(org.gtk.gtk.TextView textView, org.gtk.gtk.TextExtendSelection granularity, org.gtk.gtk.TextIter location, org.gtk.gtk.TextIter start, org.gtk.gtk.TextIter end);
        
        @ApiStatus.Internal default int upcall(MemoryAddress textView, int granularity, MemoryAddress location, MemoryAddress start, MemoryAddress end) {
            var RESULT = run((org.gtk.gtk.TextView) Interop.register(textView, org.gtk.gtk.TextView.fromAddress).marshal(textView, null), org.gtk.gtk.TextExtendSelection.of(granularity), org.gtk.gtk.TextIter.fromAddress.marshal(location, null), org.gtk.gtk.TextIter.fromAddress.marshal(start, null), org.gtk.gtk.TextIter.fromAddress.marshal(end, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ExtendSelectionCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code extend_selection}
     * @param extendSelection The new value of the field {@code extend_selection}
     */
    public void setExtendSelection(ExtendSelectionCallback extendSelection) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("extend_selection"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (extendSelection == null ? MemoryAddress.NULL : extendSelection.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code InsertEmojiCallback} callback.
     */
    @FunctionalInterface
    public interface InsertEmojiCallback {
    
        void run(org.gtk.gtk.TextView textView);
        
        @ApiStatus.Internal default void upcall(MemoryAddress textView) {
            run((org.gtk.gtk.TextView) Interop.register(textView, org.gtk.gtk.TextView.fromAddress).marshal(textView, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), InsertEmojiCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code insert_emoji}
     * @param insertEmoji The new value of the field {@code insert_emoji}
     */
    public void setInsertEmoji(InsertEmojiCallback insertEmoji) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("insert_emoji"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (insertEmoji == null ? MemoryAddress.NULL : insertEmoji.toCallback()));
        }
    }
    
    /**
     * Create a TextViewClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TextViewClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TextViewClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TextViewClass(input);
    
    /**
     * A {@link TextViewClass.Builder} object constructs a {@link TextViewClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TextViewClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TextViewClass struct;
        
        private Builder() {
            struct = TextViewClass.allocate();
        }
        
        /**
         * Finish building the {@link TextViewClass} struct.
         * @return A new instance of {@code TextViewClass} with the fields 
         *         that were set in the Builder object.
         */
        public TextViewClass build() {
            return struct;
        }
        
        /**
         * The object class structure needs to be the first
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gtk.gtk.WidgetClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setMoveCursor(MoveCursorCallback moveCursor) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("move_cursor"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (moveCursor == null ? MemoryAddress.NULL : moveCursor.toCallback()));
                return this;
            }
        }
        
        public Builder setSetAnchor(SetAnchorCallback setAnchor) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_anchor"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setAnchor == null ? MemoryAddress.NULL : setAnchor.toCallback()));
                return this;
            }
        }
        
        public Builder setInsertAtCursor(InsertAtCursorCallback insertAtCursor) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("insert_at_cursor"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (insertAtCursor == null ? MemoryAddress.NULL : insertAtCursor.toCallback()));
                return this;
            }
        }
        
        public Builder setDeleteFromCursor(DeleteFromCursorCallback deleteFromCursor) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("delete_from_cursor"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (deleteFromCursor == null ? MemoryAddress.NULL : deleteFromCursor.toCallback()));
                return this;
            }
        }
        
        public Builder setBackspace(BackspaceCallback backspace) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("backspace"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (backspace == null ? MemoryAddress.NULL : backspace.toCallback()));
                return this;
            }
        }
        
        public Builder setCutClipboard(CutClipboardCallback cutClipboard) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("cut_clipboard"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (cutClipboard == null ? MemoryAddress.NULL : cutClipboard.toCallback()));
                return this;
            }
        }
        
        public Builder setCopyClipboard(CopyClipboardCallback copyClipboard) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("copy_clipboard"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (copyClipboard == null ? MemoryAddress.NULL : copyClipboard.toCallback()));
                return this;
            }
        }
        
        public Builder setPasteClipboard(PasteClipboardCallback pasteClipboard) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("paste_clipboard"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (pasteClipboard == null ? MemoryAddress.NULL : pasteClipboard.toCallback()));
                return this;
            }
        }
        
        public Builder setToggleOverwrite(ToggleOverwriteCallback toggleOverwrite) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("toggle_overwrite"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (toggleOverwrite == null ? MemoryAddress.NULL : toggleOverwrite.toCallback()));
                return this;
            }
        }
        
        public Builder setCreateBuffer(CreateBufferCallback createBuffer) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("create_buffer"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createBuffer == null ? MemoryAddress.NULL : createBuffer.toCallback()));
                return this;
            }
        }
        
        public Builder setSnapshotLayer(SnapshotLayerCallback snapshotLayer) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("snapshot_layer"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (snapshotLayer == null ? MemoryAddress.NULL : snapshotLayer.toCallback()));
                return this;
            }
        }
        
        public Builder setExtendSelection(ExtendSelectionCallback extendSelection) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("extend_selection"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (extendSelection == null ? MemoryAddress.NULL : extendSelection.toCallback()));
                return this;
            }
        }
        
        public Builder setInsertEmoji(InsertEmojiCallback insertEmoji) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("insert_emoji"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (insertEmoji == null ? MemoryAddress.NULL : insertEmoji.toCallback()));
                return this;
            }
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false, SCOPE)));
                return this;
            }
        }
    }
}
