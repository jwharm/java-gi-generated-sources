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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TreeDragDestIface newInstance = new TreeDragDestIface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code DragDataReceivedCallback} callback.
     */
    @FunctionalInterface
    public interface DragDataReceivedCallback {
    
        boolean run(org.gtk.gtk.TreeDragDest dragDest, org.gtk.gtk.TreePath dest, org.gtk.gobject.Value value);
        
        @ApiStatus.Internal default int upcall(MemoryAddress dragDest, MemoryAddress dest, MemoryAddress value) {
            var RESULT = run((org.gtk.gtk.TreeDragDest) Interop.register(dragDest, org.gtk.gtk.TreeDragDest.fromAddress).marshal(dragDest, null), org.gtk.gtk.TreePath.fromAddress.marshal(dest, null), org.gtk.gobject.Value.fromAddress.marshal(value, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DragDataReceivedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code drag_data_received}
     * @param dragDataReceived The new value of the field {@code drag_data_received}
     */
    public void setDragDataReceived(DragDataReceivedCallback dragDataReceived) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("drag_data_received"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dragDataReceived == null ? MemoryAddress.NULL : dragDataReceived.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RowDropPossibleCallback} callback.
     */
    @FunctionalInterface
    public interface RowDropPossibleCallback {
    
        boolean run(org.gtk.gtk.TreeDragDest dragDest, org.gtk.gtk.TreePath destPath, org.gtk.gobject.Value value);
        
        @ApiStatus.Internal default int upcall(MemoryAddress dragDest, MemoryAddress destPath, MemoryAddress value) {
            var RESULT = run((org.gtk.gtk.TreeDragDest) Interop.register(dragDest, org.gtk.gtk.TreeDragDest.fromAddress).marshal(dragDest, null), org.gtk.gtk.TreePath.fromAddress.marshal(destPath, null), org.gtk.gobject.Value.fromAddress.marshal(value, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RowDropPossibleCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code row_drop_possible}
     * @param rowDropPossible The new value of the field {@code row_drop_possible}
     */
    public void setRowDropPossible(RowDropPossibleCallback rowDropPossible) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("row_drop_possible"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (rowDropPossible == null ? MemoryAddress.NULL : rowDropPossible.toCallback()));
        }
    }
    
    /**
     * Create a TreeDragDestIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TreeDragDestIface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TreeDragDestIface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TreeDragDestIface(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
                return this;
            }
        }
        
        public Builder setDragDataReceived(DragDataReceivedCallback dragDataReceived) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("drag_data_received"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dragDataReceived == null ? MemoryAddress.NULL : dragDataReceived.toCallback()));
                return this;
            }
        }
        
        public Builder setRowDropPossible(RowDropPossibleCallback rowDropPossible) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("row_drop_possible"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (rowDropPossible == null ? MemoryAddress.NULL : rowDropPossible.toCallback()));
                return this;
            }
        }
    }
}
