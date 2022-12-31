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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        CellRendererClass newInstance = new CellRendererClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @FunctionalInterface
    public interface GetRequestModeCallback {
        org.gtk.gtk.SizeRequestMode run(org.gtk.gtk.CellRenderer cell);

        @ApiStatus.Internal default int upcall(MemoryAddress cell) {
            var RESULT = run((org.gtk.gtk.CellRenderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cell)), org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetRequestModeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_request_mode}
     * @param getRequestMode The new value of the field {@code get_request_mode}
     */
    public void setGetRequestMode(GetRequestModeCallback getRequestMode) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_request_mode"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getRequestMode == null ? MemoryAddress.NULL : getRequestMode.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetPreferredWidthCallback {
        void run(org.gtk.gtk.CellRenderer cell, org.gtk.gtk.Widget widget, Out<Integer> minimumSize, Out<Integer> naturalSize);

        @ApiStatus.Internal default void upcall(MemoryAddress cell, MemoryAddress widget, MemoryAddress minimumSize, MemoryAddress naturalSize) {
            Out<Integer> minimumSizeOUT = new Out<>(minimumSize.get(Interop.valueLayout.C_INT, 0));
            Out<Integer> naturalSizeOUT = new Out<>(naturalSize.get(Interop.valueLayout.C_INT, 0));
            run((org.gtk.gtk.CellRenderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cell)), org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, Ownership.NONE), (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(widget)), org.gtk.gtk.Widget.fromAddress).marshal(widget, Ownership.NONE), minimumSizeOUT, naturalSizeOUT);
            minimumSize.set(Interop.valueLayout.C_INT, 0, minimumSizeOUT.get());
            naturalSize.set(Interop.valueLayout.C_INT, 0, naturalSizeOUT.get());
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetPreferredWidthCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_preferred_width}
     * @param getPreferredWidth The new value of the field {@code get_preferred_width}
     */
    public void setGetPreferredWidth(GetPreferredWidthCallback getPreferredWidth) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_width"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPreferredWidth == null ? MemoryAddress.NULL : getPreferredWidth.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetPreferredHeightForWidthCallback {
        void run(org.gtk.gtk.CellRenderer cell, org.gtk.gtk.Widget widget, int width, Out<Integer> minimumHeight, Out<Integer> naturalHeight);

        @ApiStatus.Internal default void upcall(MemoryAddress cell, MemoryAddress widget, int width, MemoryAddress minimumHeight, MemoryAddress naturalHeight) {
            Out<Integer> minimumHeightOUT = new Out<>(minimumHeight.get(Interop.valueLayout.C_INT, 0));
            Out<Integer> naturalHeightOUT = new Out<>(naturalHeight.get(Interop.valueLayout.C_INT, 0));
            run((org.gtk.gtk.CellRenderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cell)), org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, Ownership.NONE), (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(widget)), org.gtk.gtk.Widget.fromAddress).marshal(widget, Ownership.NONE), width, minimumHeightOUT, naturalHeightOUT);
            minimumHeight.set(Interop.valueLayout.C_INT, 0, minimumHeightOUT.get());
            naturalHeight.set(Interop.valueLayout.C_INT, 0, naturalHeightOUT.get());
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetPreferredHeightForWidthCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_preferred_height_for_width}
     * @param getPreferredHeightForWidth The new value of the field {@code get_preferred_height_for_width}
     */
    public void setGetPreferredHeightForWidth(GetPreferredHeightForWidthCallback getPreferredHeightForWidth) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_height_for_width"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPreferredHeightForWidth == null ? MemoryAddress.NULL : getPreferredHeightForWidth.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetPreferredHeightCallback {
        void run(org.gtk.gtk.CellRenderer cell, org.gtk.gtk.Widget widget, Out<Integer> minimumSize, Out<Integer> naturalSize);

        @ApiStatus.Internal default void upcall(MemoryAddress cell, MemoryAddress widget, MemoryAddress minimumSize, MemoryAddress naturalSize) {
            Out<Integer> minimumSizeOUT = new Out<>(minimumSize.get(Interop.valueLayout.C_INT, 0));
            Out<Integer> naturalSizeOUT = new Out<>(naturalSize.get(Interop.valueLayout.C_INT, 0));
            run((org.gtk.gtk.CellRenderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cell)), org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, Ownership.NONE), (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(widget)), org.gtk.gtk.Widget.fromAddress).marshal(widget, Ownership.NONE), minimumSizeOUT, naturalSizeOUT);
            minimumSize.set(Interop.valueLayout.C_INT, 0, minimumSizeOUT.get());
            naturalSize.set(Interop.valueLayout.C_INT, 0, naturalSizeOUT.get());
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetPreferredHeightCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_preferred_height}
     * @param getPreferredHeight The new value of the field {@code get_preferred_height}
     */
    public void setGetPreferredHeight(GetPreferredHeightCallback getPreferredHeight) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_height"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPreferredHeight == null ? MemoryAddress.NULL : getPreferredHeight.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetPreferredWidthForHeightCallback {
        void run(org.gtk.gtk.CellRenderer cell, org.gtk.gtk.Widget widget, int height, Out<Integer> minimumWidth, Out<Integer> naturalWidth);

        @ApiStatus.Internal default void upcall(MemoryAddress cell, MemoryAddress widget, int height, MemoryAddress minimumWidth, MemoryAddress naturalWidth) {
            Out<Integer> minimumWidthOUT = new Out<>(minimumWidth.get(Interop.valueLayout.C_INT, 0));
            Out<Integer> naturalWidthOUT = new Out<>(naturalWidth.get(Interop.valueLayout.C_INT, 0));
            run((org.gtk.gtk.CellRenderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cell)), org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, Ownership.NONE), (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(widget)), org.gtk.gtk.Widget.fromAddress).marshal(widget, Ownership.NONE), height, minimumWidthOUT, naturalWidthOUT);
            minimumWidth.set(Interop.valueLayout.C_INT, 0, minimumWidthOUT.get());
            naturalWidth.set(Interop.valueLayout.C_INT, 0, naturalWidthOUT.get());
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetPreferredWidthForHeightCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_preferred_width_for_height}
     * @param getPreferredWidthForHeight The new value of the field {@code get_preferred_width_for_height}
     */
    public void setGetPreferredWidthForHeight(GetPreferredWidthForHeightCallback getPreferredWidthForHeight) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_width_for_height"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPreferredWidthForHeight == null ? MemoryAddress.NULL : getPreferredWidthForHeight.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetAlignedAreaCallback {
        void run(org.gtk.gtk.CellRenderer cell, org.gtk.gtk.Widget widget, org.gtk.gtk.CellRendererState flags, org.gtk.gdk.Rectangle cellArea, org.gtk.gdk.Rectangle alignedArea);

        @ApiStatus.Internal default void upcall(MemoryAddress cell, MemoryAddress widget, int flags, MemoryAddress cellArea, MemoryAddress alignedArea) {
            run((org.gtk.gtk.CellRenderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cell)), org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, Ownership.NONE), (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(widget)), org.gtk.gtk.Widget.fromAddress).marshal(widget, Ownership.NONE), new org.gtk.gtk.CellRendererState(flags), org.gtk.gdk.Rectangle.fromAddress.marshal(cellArea, Ownership.NONE), org.gtk.gdk.Rectangle.fromAddress.marshal(alignedArea, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetAlignedAreaCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_aligned_area}
     * @param getAlignedArea The new value of the field {@code get_aligned_area}
     */
    public void setGetAlignedArea(GetAlignedAreaCallback getAlignedArea) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_aligned_area"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getAlignedArea == null ? MemoryAddress.NULL : getAlignedArea.toCallback()));
    }
    
    @FunctionalInterface
    public interface SnapshotCallback {
        void run(org.gtk.gtk.CellRenderer cell, org.gtk.gtk.Snapshot snapshot, org.gtk.gtk.Widget widget, org.gtk.gdk.Rectangle backgroundArea, org.gtk.gdk.Rectangle cellArea, org.gtk.gtk.CellRendererState flags);

        @ApiStatus.Internal default void upcall(MemoryAddress cell, MemoryAddress snapshot, MemoryAddress widget, MemoryAddress backgroundArea, MemoryAddress cellArea, int flags) {
            run((org.gtk.gtk.CellRenderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cell)), org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, Ownership.NONE), (org.gtk.gtk.Snapshot) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(snapshot)), org.gtk.gtk.Snapshot.fromAddress).marshal(snapshot, Ownership.NONE), (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(widget)), org.gtk.gtk.Widget.fromAddress).marshal(widget, Ownership.NONE), org.gtk.gdk.Rectangle.fromAddress.marshal(backgroundArea, Ownership.NONE), org.gtk.gdk.Rectangle.fromAddress.marshal(cellArea, Ownership.NONE), new org.gtk.gtk.CellRendererState(flags));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SnapshotCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code snapshot}
     * @param snapshot The new value of the field {@code snapshot}
     */
    public void setSnapshot(SnapshotCallback snapshot) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("snapshot"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (snapshot == null ? MemoryAddress.NULL : snapshot.toCallback()));
    }
    
    @FunctionalInterface
    public interface ActivateCallback {
        boolean run(org.gtk.gtk.CellRenderer cell, org.gtk.gdk.Event event, org.gtk.gtk.Widget widget, java.lang.String path, org.gtk.gdk.Rectangle backgroundArea, org.gtk.gdk.Rectangle cellArea, org.gtk.gtk.CellRendererState flags);

        @ApiStatus.Internal default int upcall(MemoryAddress cell, MemoryAddress event, MemoryAddress widget, MemoryAddress path, MemoryAddress backgroundArea, MemoryAddress cellArea, int flags) {
            var RESULT = run((org.gtk.gtk.CellRenderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cell)), org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, Ownership.NONE), (org.gtk.gdk.Event) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(event)), org.gtk.gdk.Event.fromAddress).marshal(event, Ownership.NONE), (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(widget)), org.gtk.gtk.Widget.fromAddress).marshal(widget, Ownership.NONE), Marshal.addressToString.marshal(path, null), org.gtk.gdk.Rectangle.fromAddress.marshal(backgroundArea, Ownership.NONE), org.gtk.gdk.Rectangle.fromAddress.marshal(cellArea, Ownership.NONE), new org.gtk.gtk.CellRendererState(flags));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ActivateCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code activate}
     * @param activate The new value of the field {@code activate}
     */
    public void setActivate(ActivateCallback activate) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("activate"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activate == null ? MemoryAddress.NULL : activate.toCallback()));
    }
    
    @FunctionalInterface
    public interface StartEditingCallback {
        @Nullable org.gtk.gtk.CellEditable run(org.gtk.gtk.CellRenderer cell, @Nullable org.gtk.gdk.Event event, org.gtk.gtk.Widget widget, java.lang.String path, org.gtk.gdk.Rectangle backgroundArea, org.gtk.gdk.Rectangle cellArea, org.gtk.gtk.CellRendererState flags);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress cell, MemoryAddress event, MemoryAddress widget, MemoryAddress path, MemoryAddress backgroundArea, MemoryAddress cellArea, int flags) {
            var RESULT = run((org.gtk.gtk.CellRenderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cell)), org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, Ownership.NONE), (org.gtk.gdk.Event) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(event)), org.gtk.gdk.Event.fromAddress).marshal(event, Ownership.NONE), (org.gtk.gtk.Widget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(widget)), org.gtk.gtk.Widget.fromAddress).marshal(widget, Ownership.NONE), Marshal.addressToString.marshal(path, null), org.gtk.gdk.Rectangle.fromAddress.marshal(backgroundArea, Ownership.NONE), org.gtk.gdk.Rectangle.fromAddress.marshal(cellArea, Ownership.NONE), new org.gtk.gtk.CellRendererState(flags));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StartEditingCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code start_editing}
     * @param startEditing The new value of the field {@code start_editing}
     */
    public void setStartEditing(StartEditingCallback startEditing) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_editing"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (startEditing == null ? MemoryAddress.NULL : startEditing.toCallback()));
    }
    
    @FunctionalInterface
    public interface EditingCanceledCallback {
        void run(org.gtk.gtk.CellRenderer cell);

        @ApiStatus.Internal default void upcall(MemoryAddress cell) {
            run((org.gtk.gtk.CellRenderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cell)), org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EditingCanceledCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code editing_canceled}
     * @param editingCanceled The new value of the field {@code editing_canceled}
     */
    public void setEditingCanceled(EditingCanceledCallback editingCanceled) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("editing_canceled"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (editingCanceled == null ? MemoryAddress.NULL : editingCanceled.toCallback()));
    }
    
    @FunctionalInterface
    public interface EditingStartedCallback {
        void run(org.gtk.gtk.CellRenderer cell, org.gtk.gtk.CellEditable editable, java.lang.String path);

        @ApiStatus.Internal default void upcall(MemoryAddress cell, MemoryAddress editable, MemoryAddress path) {
            run((org.gtk.gtk.CellRenderer) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cell)), org.gtk.gtk.CellRenderer.fromAddress).marshal(cell, Ownership.NONE), (org.gtk.gtk.CellEditable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(editable)), org.gtk.gtk.CellEditable.fromAddress).marshal(editable, Ownership.NONE), Marshal.addressToString.marshal(path, null));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EditingStartedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code editing_started}
     * @param editingStarted The new value of the field {@code editing_started}
     */
    public void setEditingStarted(EditingStartedCallback editingStarted) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("editing_started"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (editingStarted == null ? MemoryAddress.NULL : editingStarted.toCallback()));
    }
    
    /**
     * Create a CellRendererClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected CellRendererClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, CellRendererClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new CellRendererClass(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setGetRequestMode(GetRequestModeCallback getRequestMode) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_request_mode"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getRequestMode == null ? MemoryAddress.NULL : getRequestMode.toCallback()));
            return this;
        }
        
        public Builder setGetPreferredWidth(GetPreferredWidthCallback getPreferredWidth) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_width"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPreferredWidth == null ? MemoryAddress.NULL : getPreferredWidth.toCallback()));
            return this;
        }
        
        public Builder setGetPreferredHeightForWidth(GetPreferredHeightForWidthCallback getPreferredHeightForWidth) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_height_for_width"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPreferredHeightForWidth == null ? MemoryAddress.NULL : getPreferredHeightForWidth.toCallback()));
            return this;
        }
        
        public Builder setGetPreferredHeight(GetPreferredHeightCallback getPreferredHeight) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_height"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPreferredHeight == null ? MemoryAddress.NULL : getPreferredHeight.toCallback()));
            return this;
        }
        
        public Builder setGetPreferredWidthForHeight(GetPreferredWidthForHeightCallback getPreferredWidthForHeight) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_width_for_height"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPreferredWidthForHeight == null ? MemoryAddress.NULL : getPreferredWidthForHeight.toCallback()));
            return this;
        }
        
        public Builder setGetAlignedArea(GetAlignedAreaCallback getAlignedArea) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_aligned_area"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getAlignedArea == null ? MemoryAddress.NULL : getAlignedArea.toCallback()));
            return this;
        }
        
        public Builder setSnapshot(SnapshotCallback snapshot) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("snapshot"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (snapshot == null ? MemoryAddress.NULL : snapshot.toCallback()));
            return this;
        }
        
        public Builder setActivate(ActivateCallback activate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("activate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (activate == null ? MemoryAddress.NULL : activate.toCallback()));
            return this;
        }
        
        public Builder setStartEditing(StartEditingCallback startEditing) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_editing"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (startEditing == null ? MemoryAddress.NULL : startEditing.toCallback()));
            return this;
        }
        
        public Builder setEditingCanceled(EditingCanceledCallback editingCanceled) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("editing_canceled"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (editingCanceled == null ? MemoryAddress.NULL : editingCanceled.toCallback()));
            return this;
        }
        
        public Builder setEditingStarted(EditingStartedCallback editingStarted) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("editing_started"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (editingStarted == null ? MemoryAddress.NULL : editingStarted.toCallback()));
            return this;
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false)));
            return this;
        }
    }
}
