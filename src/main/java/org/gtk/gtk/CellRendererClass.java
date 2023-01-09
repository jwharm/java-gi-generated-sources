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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
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
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link CellRendererClass}
     * @return A new, uninitialized @{link CellRendererClass}
     */
    public static CellRendererClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        CellRendererClass newInstance = new CellRendererClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code GetRequestModeCallback} callback.
     */
    @FunctionalInterface
    public interface GetRequestModeCallback {
    
        org.gtk.gtk.SizeRequestMode run(org.gtk.gtk.CellRenderer cell);
        
        @ApiStatus.Internal default int upcall(MemoryAddress cell) {
            var RESULT = run((org.gtk.gtk.CellRenderer) Interop.register(cell, org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, null));
            return RESULT.getValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetRequestModeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_request_mode}
     * @param getRequestMode The new value of the field {@code get_request_mode}
     */
    public void setGetRequestMode(GetRequestModeCallback getRequestMode) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_request_mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getRequestMode == null ? MemoryAddress.NULL : getRequestMode.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetPreferredWidthCallback} callback.
     */
    @FunctionalInterface
    public interface GetPreferredWidthCallback {
    
        void run(org.gtk.gtk.CellRenderer cell, org.gtk.gtk.Widget widget, Out<Integer> minimumSize, Out<Integer> naturalSize);
        
        @ApiStatus.Internal default void upcall(MemoryAddress cell, MemoryAddress widget, MemoryAddress minimumSize, MemoryAddress naturalSize) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Integer> minimumSizeOUT = new Out<>(minimumSize.get(Interop.valueLayout.C_INT, 0));
                Out<Integer> naturalSizeOUT = new Out<>(naturalSize.get(Interop.valueLayout.C_INT, 0));
                run((org.gtk.gtk.CellRenderer) Interop.register(cell, org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, null), (org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), minimumSizeOUT, naturalSizeOUT);
                minimumSize.set(Interop.valueLayout.C_INT, 0, minimumSizeOUT.get());
                naturalSize.set(Interop.valueLayout.C_INT, 0, naturalSizeOUT.get());
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetPreferredWidthCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_preferred_width}
     * @param getPreferredWidth The new value of the field {@code get_preferred_width}
     */
    public void setGetPreferredWidth(GetPreferredWidthCallback getPreferredWidth) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_width"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPreferredWidth == null ? MemoryAddress.NULL : getPreferredWidth.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetPreferredHeightForWidthCallback} callback.
     */
    @FunctionalInterface
    public interface GetPreferredHeightForWidthCallback {
    
        void run(org.gtk.gtk.CellRenderer cell, org.gtk.gtk.Widget widget, int width, Out<Integer> minimumHeight, Out<Integer> naturalHeight);
        
        @ApiStatus.Internal default void upcall(MemoryAddress cell, MemoryAddress widget, int width, MemoryAddress minimumHeight, MemoryAddress naturalHeight) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Integer> minimumHeightOUT = new Out<>(minimumHeight.get(Interop.valueLayout.C_INT, 0));
                Out<Integer> naturalHeightOUT = new Out<>(naturalHeight.get(Interop.valueLayout.C_INT, 0));
                run((org.gtk.gtk.CellRenderer) Interop.register(cell, org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, null), (org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), width, minimumHeightOUT, naturalHeightOUT);
                minimumHeight.set(Interop.valueLayout.C_INT, 0, minimumHeightOUT.get());
                naturalHeight.set(Interop.valueLayout.C_INT, 0, naturalHeightOUT.get());
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetPreferredHeightForWidthCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_preferred_height_for_width}
     * @param getPreferredHeightForWidth The new value of the field {@code get_preferred_height_for_width}
     */
    public void setGetPreferredHeightForWidth(GetPreferredHeightForWidthCallback getPreferredHeightForWidth) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_height_for_width"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPreferredHeightForWidth == null ? MemoryAddress.NULL : getPreferredHeightForWidth.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetPreferredHeightCallback} callback.
     */
    @FunctionalInterface
    public interface GetPreferredHeightCallback {
    
        void run(org.gtk.gtk.CellRenderer cell, org.gtk.gtk.Widget widget, Out<Integer> minimumSize, Out<Integer> naturalSize);
        
        @ApiStatus.Internal default void upcall(MemoryAddress cell, MemoryAddress widget, MemoryAddress minimumSize, MemoryAddress naturalSize) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Integer> minimumSizeOUT = new Out<>(minimumSize.get(Interop.valueLayout.C_INT, 0));
                Out<Integer> naturalSizeOUT = new Out<>(naturalSize.get(Interop.valueLayout.C_INT, 0));
                run((org.gtk.gtk.CellRenderer) Interop.register(cell, org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, null), (org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), minimumSizeOUT, naturalSizeOUT);
                minimumSize.set(Interop.valueLayout.C_INT, 0, minimumSizeOUT.get());
                naturalSize.set(Interop.valueLayout.C_INT, 0, naturalSizeOUT.get());
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetPreferredHeightCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_preferred_height}
     * @param getPreferredHeight The new value of the field {@code get_preferred_height}
     */
    public void setGetPreferredHeight(GetPreferredHeightCallback getPreferredHeight) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_height"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPreferredHeight == null ? MemoryAddress.NULL : getPreferredHeight.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetPreferredWidthForHeightCallback} callback.
     */
    @FunctionalInterface
    public interface GetPreferredWidthForHeightCallback {
    
        void run(org.gtk.gtk.CellRenderer cell, org.gtk.gtk.Widget widget, int height, Out<Integer> minimumWidth, Out<Integer> naturalWidth);
        
        @ApiStatus.Internal default void upcall(MemoryAddress cell, MemoryAddress widget, int height, MemoryAddress minimumWidth, MemoryAddress naturalWidth) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Integer> minimumWidthOUT = new Out<>(minimumWidth.get(Interop.valueLayout.C_INT, 0));
                Out<Integer> naturalWidthOUT = new Out<>(naturalWidth.get(Interop.valueLayout.C_INT, 0));
                run((org.gtk.gtk.CellRenderer) Interop.register(cell, org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, null), (org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), height, minimumWidthOUT, naturalWidthOUT);
                minimumWidth.set(Interop.valueLayout.C_INT, 0, minimumWidthOUT.get());
                naturalWidth.set(Interop.valueLayout.C_INT, 0, naturalWidthOUT.get());
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetPreferredWidthForHeightCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_preferred_width_for_height}
     * @param getPreferredWidthForHeight The new value of the field {@code get_preferred_width_for_height}
     */
    public void setGetPreferredWidthForHeight(GetPreferredWidthForHeightCallback getPreferredWidthForHeight) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_width_for_height"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPreferredWidthForHeight == null ? MemoryAddress.NULL : getPreferredWidthForHeight.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetAlignedAreaCallback} callback.
     */
    @FunctionalInterface
    public interface GetAlignedAreaCallback {
    
        void run(org.gtk.gtk.CellRenderer cell, org.gtk.gtk.Widget widget, org.gtk.gtk.CellRendererState flags, org.gtk.gdk.Rectangle cellArea, org.gtk.gdk.Rectangle alignedArea);
        
        @ApiStatus.Internal default void upcall(MemoryAddress cell, MemoryAddress widget, int flags, MemoryAddress cellArea, MemoryAddress alignedArea) {
            run((org.gtk.gtk.CellRenderer) Interop.register(cell, org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, null), (org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), new org.gtk.gtk.CellRendererState(flags), org.gtk.gdk.Rectangle.fromAddress.marshal(cellArea, null), org.gtk.gdk.Rectangle.fromAddress.marshal(alignedArea, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetAlignedAreaCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_aligned_area}
     * @param getAlignedArea The new value of the field {@code get_aligned_area}
     */
    public void setGetAlignedArea(GetAlignedAreaCallback getAlignedArea) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_aligned_area"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getAlignedArea == null ? MemoryAddress.NULL : getAlignedArea.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SnapshotCallback} callback.
     */
    @FunctionalInterface
    public interface SnapshotCallback {
    
        void run(org.gtk.gtk.CellRenderer cell, org.gtk.gtk.Snapshot snapshot, org.gtk.gtk.Widget widget, org.gtk.gdk.Rectangle backgroundArea, org.gtk.gdk.Rectangle cellArea, org.gtk.gtk.CellRendererState flags);
        
        @ApiStatus.Internal default void upcall(MemoryAddress cell, MemoryAddress snapshot, MemoryAddress widget, MemoryAddress backgroundArea, MemoryAddress cellArea, int flags) {
            run((org.gtk.gtk.CellRenderer) Interop.register(cell, org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, null), (org.gtk.gtk.Snapshot) Interop.register(snapshot, org.gtk.gtk.Snapshot.fromAddress).marshal(snapshot, null), (org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), org.gtk.gdk.Rectangle.fromAddress.marshal(backgroundArea, null), org.gtk.gdk.Rectangle.fromAddress.marshal(cellArea, null), new org.gtk.gtk.CellRendererState(flags));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SnapshotCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code snapshot}
     * @param snapshot The new value of the field {@code snapshot}
     */
    public void setSnapshot(SnapshotCallback snapshot) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("snapshot"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (snapshot == null ? MemoryAddress.NULL : snapshot.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ActivateCallback} callback.
     */
    @FunctionalInterface
    public interface ActivateCallback {
    
        boolean run(org.gtk.gtk.CellRenderer cell, org.gtk.gdk.Event event, org.gtk.gtk.Widget widget, java.lang.String path, org.gtk.gdk.Rectangle backgroundArea, org.gtk.gdk.Rectangle cellArea, org.gtk.gtk.CellRendererState flags);
        
        @ApiStatus.Internal default int upcall(MemoryAddress cell, MemoryAddress event, MemoryAddress widget, MemoryAddress path, MemoryAddress backgroundArea, MemoryAddress cellArea, int flags) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gtk.CellRenderer) Interop.register(cell, org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, null), (org.gtk.gdk.Event) Interop.register(event, org.gtk.gdk.Event.fromAddress).marshal(event, null), (org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), Marshal.addressToString.marshal(path, null), org.gtk.gdk.Rectangle.fromAddress.marshal(backgroundArea, null), org.gtk.gdk.Rectangle.fromAddress.marshal(cellArea, null), new org.gtk.gtk.CellRendererState(flags));
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ActivateCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code activate}
     * @param activate The new value of the field {@code activate}
     */
    public void setActivate(ActivateCallback activate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (activate == null ? MemoryAddress.NULL : activate.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code StartEditingCallback} callback.
     */
    @FunctionalInterface
    public interface StartEditingCallback {
    
        @Nullable org.gtk.gtk.CellEditable run(org.gtk.gtk.CellRenderer cell, @Nullable org.gtk.gdk.Event event, org.gtk.gtk.Widget widget, java.lang.String path, org.gtk.gdk.Rectangle backgroundArea, org.gtk.gdk.Rectangle cellArea, org.gtk.gtk.CellRendererState flags);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress cell, MemoryAddress event, MemoryAddress widget, MemoryAddress path, MemoryAddress backgroundArea, MemoryAddress cellArea, int flags) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gtk.CellRenderer) Interop.register(cell, org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, null), (org.gtk.gdk.Event) Interop.register(event, org.gtk.gdk.Event.fromAddress).marshal(event, null), (org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), Marshal.addressToString.marshal(path, null), org.gtk.gdk.Rectangle.fromAddress.marshal(backgroundArea, null), org.gtk.gdk.Rectangle.fromAddress.marshal(cellArea, null), new org.gtk.gtk.CellRendererState(flags));
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), StartEditingCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code start_editing}
     * @param startEditing The new value of the field {@code start_editing}
     */
    public void setStartEditing(StartEditingCallback startEditing) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_editing"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (startEditing == null ? MemoryAddress.NULL : startEditing.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code EditingCanceledCallback} callback.
     */
    @FunctionalInterface
    public interface EditingCanceledCallback {
    
        void run(org.gtk.gtk.CellRenderer cell);
        
        @ApiStatus.Internal default void upcall(MemoryAddress cell) {
            run((org.gtk.gtk.CellRenderer) Interop.register(cell, org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EditingCanceledCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code editing_canceled}
     * @param editingCanceled The new value of the field {@code editing_canceled}
     */
    public void setEditingCanceled(EditingCanceledCallback editingCanceled) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("editing_canceled"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (editingCanceled == null ? MemoryAddress.NULL : editingCanceled.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code EditingStartedCallback} callback.
     */
    @FunctionalInterface
    public interface EditingStartedCallback {
    
        void run(org.gtk.gtk.CellRenderer cell, org.gtk.gtk.CellEditable editable, java.lang.String path);
        
        @ApiStatus.Internal default void upcall(MemoryAddress cell, MemoryAddress editable, MemoryAddress path) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gtk.CellRenderer) Interop.register(cell, org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, null), (org.gtk.gtk.CellEditable) Interop.register(editable, org.gtk.gtk.CellEditable.fromAddress).marshal(editable, null), Marshal.addressToString.marshal(path, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EditingStartedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code editing_started}
     * @param editingStarted The new value of the field {@code editing_started}
     */
    public void setEditingStarted(EditingStartedCallback editingStarted) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("editing_started"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (editingStarted == null ? MemoryAddress.NULL : editingStarted.toCallback()));
        }
    }
    
    /**
     * Create a CellRendererClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected CellRendererClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, CellRendererClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new CellRendererClass(input);
    
    /**
     * A {@link CellRendererClass.Builder} object constructs a {@link CellRendererClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link CellRendererClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final CellRendererClass struct;
        
        private Builder() {
            struct = CellRendererClass.allocate();
        }
        
        /**
         * Finish building the {@link CellRendererClass} struct.
         * @return A new instance of {@code CellRendererClass} with the fields 
         *         that were set in the Builder object.
         */
        public CellRendererClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.InitiallyUnownedClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setGetRequestMode(GetRequestModeCallback getRequestMode) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_request_mode"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getRequestMode == null ? MemoryAddress.NULL : getRequestMode.toCallback()));
                return this;
            }
        }
        
        public Builder setGetPreferredWidth(GetPreferredWidthCallback getPreferredWidth) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_width"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPreferredWidth == null ? MemoryAddress.NULL : getPreferredWidth.toCallback()));
                return this;
            }
        }
        
        public Builder setGetPreferredHeightForWidth(GetPreferredHeightForWidthCallback getPreferredHeightForWidth) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_height_for_width"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPreferredHeightForWidth == null ? MemoryAddress.NULL : getPreferredHeightForWidth.toCallback()));
                return this;
            }
        }
        
        public Builder setGetPreferredHeight(GetPreferredHeightCallback getPreferredHeight) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_height"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPreferredHeight == null ? MemoryAddress.NULL : getPreferredHeight.toCallback()));
                return this;
            }
        }
        
        public Builder setGetPreferredWidthForHeight(GetPreferredWidthForHeightCallback getPreferredWidthForHeight) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_width_for_height"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPreferredWidthForHeight == null ? MemoryAddress.NULL : getPreferredWidthForHeight.toCallback()));
                return this;
            }
        }
        
        public Builder setGetAlignedArea(GetAlignedAreaCallback getAlignedArea) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_aligned_area"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getAlignedArea == null ? MemoryAddress.NULL : getAlignedArea.toCallback()));
                return this;
            }
        }
        
        public Builder setSnapshot(SnapshotCallback snapshot) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("snapshot"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (snapshot == null ? MemoryAddress.NULL : snapshot.toCallback()));
                return this;
            }
        }
        
        public Builder setActivate(ActivateCallback activate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("activate"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (activate == null ? MemoryAddress.NULL : activate.toCallback()));
                return this;
            }
        }
        
        public Builder setStartEditing(StartEditingCallback startEditing) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("start_editing"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (startEditing == null ? MemoryAddress.NULL : startEditing.toCallback()));
                return this;
            }
        }
        
        public Builder setEditingCanceled(EditingCanceledCallback editingCanceled) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("editing_canceled"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (editingCanceled == null ? MemoryAddress.NULL : editingCanceled.toCallback()));
                return this;
            }
        }
        
        public Builder setEditingStarted(EditingStartedCallback editingStarted) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("editing_started"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (editingStarted == null ? MemoryAddress.NULL : editingStarted.toCallback()));
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
