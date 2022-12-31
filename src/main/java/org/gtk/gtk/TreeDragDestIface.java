package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TreeDragDestIface extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTreeDragDestIface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("drag_data_received"),
            Interop.valueLayout.ADDRESS.withName("row_drop_possible")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TreeDragDestIface}
     * @return A new, uninitialized @{link TreeDragDestIface}
     */
    public static TreeDragDestIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TreeDragDestIface newInstance = new TreeDragDestIface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @FunctionalInterface
    public interface DragDataReceivedCallback {
        boolean run(org.gtk.gtk.TreeDragDest dragDest, org.gtk.gtk.TreePath dest, org.gtk.gobject.Value value);

        @ApiStatus.Internal default int upcall(MemoryAddress dragDest, MemoryAddress dest, MemoryAddress value) {
            var RESULT = run((org.gtk.gtk.TreeDragDest) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(dragDest)), org.gtk.gtk.TreeDragDest.fromAddress).marshal(dragDest, Ownership.NONE), org.gtk.gtk.TreePath.fromAddress.marshal(dest, Ownership.NONE), org.gtk.gobject.Value.fromAddress.marshal(value, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DragDataReceivedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code drag_data_received}
     * @param dragDataReceived The new value of the field {@code drag_data_received}
     */
    public void setDragDataReceived(DragDataReceivedCallback dragDataReceived) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("drag_data_received"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dragDataReceived == null ? MemoryAddress.NULL : dragDataReceived.toCallback()));
    }
    
    @FunctionalInterface
    public interface RowDropPossibleCallback {
        boolean run(org.gtk.gtk.TreeDragDest dragDest, org.gtk.gtk.TreePath destPath, org.gtk.gobject.Value value);

        @ApiStatus.Internal default int upcall(MemoryAddress dragDest, MemoryAddress destPath, MemoryAddress value) {
            var RESULT = run((org.gtk.gtk.TreeDragDest) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(dragDest)), org.gtk.gtk.TreeDragDest.fromAddress).marshal(dragDest, Ownership.NONE), org.gtk.gtk.TreePath.fromAddress.marshal(destPath, Ownership.NONE), org.gtk.gobject.Value.fromAddress.marshal(value, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RowDropPossibleCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code row_drop_possible}
     * @param rowDropPossible The new value of the field {@code row_drop_possible}
     */
    public void setRowDropPossible(RowDropPossibleCallback rowDropPossible) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("row_drop_possible"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rowDropPossible == null ? MemoryAddress.NULL : rowDropPossible.toCallback()));
    }
    
    /**
     * Create a TreeDragDestIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TreeDragDestIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TreeDragDestIface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TreeDragDestIface(input, ownership);
    
    /**
     * A {@link TreeDragDestIface.Builder} object constructs a {@link TreeDragDestIface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TreeDragDestIface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TreeDragDestIface struct;
        
        private Builder() {
            struct = TreeDragDestIface.allocate();
        }
        
         /**
         * Finish building the {@link TreeDragDestIface} struct.
         * @return A new instance of {@code TreeDragDestIface} with the fields 
         *         that were set in the Builder object.
         */
        public TreeDragDestIface build() {
            return struct;
        }
        
        public Builder setGIface(org.gtk.gobject.TypeInterface gIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Builder setDragDataReceived(DragDataReceivedCallback dragDataReceived) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("drag_data_received"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dragDataReceived == null ? MemoryAddress.NULL : dragDataReceived.toCallback()));
            return this;
        }
        
        public Builder setRowDropPossible(RowDropPossibleCallback rowDropPossible) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_drop_possible"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (rowDropPossible == null ? MemoryAddress.NULL : rowDropPossible.toCallback()));
            return this;
        }
    }
}
