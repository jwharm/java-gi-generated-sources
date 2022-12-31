package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TreeDragSourceIface extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTreeDragSourceIface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("row_draggable"),
            Interop.valueLayout.ADDRESS.withName("drag_data_get"),
            Interop.valueLayout.ADDRESS.withName("drag_data_delete")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TreeDragSourceIface}
     * @return A new, uninitialized @{link TreeDragSourceIface}
     */
    public static TreeDragSourceIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TreeDragSourceIface newInstance = new TreeDragSourceIface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @FunctionalInterface
    public interface RowDraggableCallback {
        boolean run(org.gtk.gtk.TreeDragSource dragSource, org.gtk.gtk.TreePath path);

        @ApiStatus.Internal default int upcall(MemoryAddress dragSource, MemoryAddress path) {
            var RESULT = run((org.gtk.gtk.TreeDragSource) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(dragSource)), org.gtk.gtk.TreeDragSource.fromAddress).marshal(dragSource, Ownership.NONE), org.gtk.gtk.TreePath.fromAddress.marshal(path, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RowDraggableCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code row_draggable}
     * @param rowDraggable The new value of the field {@code row_draggable}
     */
    public void setRowDraggable(RowDraggableCallback rowDraggable) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("row_draggable"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rowDraggable == null ? MemoryAddress.NULL : rowDraggable.toCallback()));
    }
    
    @FunctionalInterface
    public interface DragDataGetCallback {
        @Nullable org.gtk.gdk.ContentProvider run(org.gtk.gtk.TreeDragSource dragSource, org.gtk.gtk.TreePath path);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress dragSource, MemoryAddress path) {
            var RESULT = run((org.gtk.gtk.TreeDragSource) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(dragSource)), org.gtk.gtk.TreeDragSource.fromAddress).marshal(dragSource, Ownership.NONE), org.gtk.gtk.TreePath.fromAddress.marshal(path, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DragDataGetCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code drag_data_get}
     * @param dragDataGet The new value of the field {@code drag_data_get}
     */
    public void setDragDataGet(DragDataGetCallback dragDataGet) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("drag_data_get"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dragDataGet == null ? MemoryAddress.NULL : dragDataGet.toCallback()));
    }
    
    @FunctionalInterface
    public interface DragDataDeleteCallback {
        boolean run(org.gtk.gtk.TreeDragSource dragSource, org.gtk.gtk.TreePath path);

        @ApiStatus.Internal default int upcall(MemoryAddress dragSource, MemoryAddress path) {
            var RESULT = run((org.gtk.gtk.TreeDragSource) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(dragSource)), org.gtk.gtk.TreeDragSource.fromAddress).marshal(dragSource, Ownership.NONE), org.gtk.gtk.TreePath.fromAddress.marshal(path, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DragDataDeleteCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code drag_data_delete}
     * @param dragDataDelete The new value of the field {@code drag_data_delete}
     */
    public void setDragDataDelete(DragDataDeleteCallback dragDataDelete) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("drag_data_delete"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dragDataDelete == null ? MemoryAddress.NULL : dragDataDelete.toCallback()));
    }
    
    /**
     * Create a TreeDragSourceIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TreeDragSourceIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TreeDragSourceIface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TreeDragSourceIface(input, ownership);
    
    /**
     * A {@link TreeDragSourceIface.Builder} object constructs a {@link TreeDragSourceIface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TreeDragSourceIface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TreeDragSourceIface struct;
        
        private Builder() {
            struct = TreeDragSourceIface.allocate();
        }
        
         /**
         * Finish building the {@link TreeDragSourceIface} struct.
         * @return A new instance of {@code TreeDragSourceIface} with the fields 
         *         that were set in the Builder object.
         */
        public TreeDragSourceIface build() {
            return struct;
        }
        
        public Builder setGIface(org.gtk.gobject.TypeInterface gIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Builder setRowDraggable(RowDraggableCallback rowDraggable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_draggable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rowDraggable == null ? MemoryAddress.NULL : rowDraggable.toCallback()));
            return this;
        }
        
        public Builder setDragDataGet(DragDataGetCallback dragDataGet) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("drag_data_get"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dragDataGet == null ? MemoryAddress.NULL : dragDataGet.toCallback()));
            return this;
        }
        
        public Builder setDragDataDelete(DragDataDeleteCallback dragDataDelete) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("drag_data_delete"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dragDataDelete == null ? MemoryAddress.NULL : dragDataDelete.toCallback()));
            return this;
        }
    }
}
