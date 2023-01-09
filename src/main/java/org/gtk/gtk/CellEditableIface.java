package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class CellEditableIface extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellEditableIface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("editing_done"),
            Interop.valueLayout.ADDRESS.withName("remove_widget"),
            Interop.valueLayout.ADDRESS.withName("start_editing")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link CellEditableIface}
     * @return A new, uninitialized @{link CellEditableIface}
     */
    public static CellEditableIface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        CellEditableIface newInstance = new CellEditableIface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code EditingDoneCallback} callback.
     */
    @FunctionalInterface
    public interface EditingDoneCallback {
    
        void run(org.gtk.gtk.CellEditable cellEditable);
        
        @ApiStatus.Internal default void upcall(MemoryAddress cellEditable) {
            run((org.gtk.gtk.CellEditable) Interop.register(cellEditable, org.gtk.gtk.CellEditable.fromAddress).marshal(cellEditable, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EditingDoneCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code editing_done}
     * @param editingDone The new value of the field {@code editing_done}
     */
    public void setEditingDone(EditingDoneCallback editingDone) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("editing_done"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (editingDone == null ? MemoryAddress.NULL : editingDone.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RemoveWidgetCallback} callback.
     */
    @FunctionalInterface
    public interface RemoveWidgetCallback {
    
        void run(org.gtk.gtk.CellEditable cellEditable);
        
        @ApiStatus.Internal default void upcall(MemoryAddress cellEditable) {
            run((org.gtk.gtk.CellEditable) Interop.register(cellEditable, org.gtk.gtk.CellEditable.fromAddress).marshal(cellEditable, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RemoveWidgetCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code remove_widget}
     * @param removeWidget The new value of the field {@code remove_widget}
     */
    public void setRemoveWidget(RemoveWidgetCallback removeWidget) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("remove_widget"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (removeWidget == null ? MemoryAddress.NULL : removeWidget.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code StartEditingCallback} callback.
     */
    @FunctionalInterface
    public interface StartEditingCallback {
    
        void run(org.gtk.gtk.CellEditable cellEditable, @Nullable org.gtk.gdk.Event event);
        
        @ApiStatus.Internal default void upcall(MemoryAddress cellEditable, MemoryAddress event) {
            run((org.gtk.gtk.CellEditable) Interop.register(cellEditable, org.gtk.gtk.CellEditable.fromAddress).marshal(cellEditable, null), (org.gtk.gdk.Event) Interop.register(event, org.gtk.gdk.Event.fromAddress).marshal(event, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
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
     * Create a CellEditableIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected CellEditableIface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, CellEditableIface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new CellEditableIface(input);
    
    /**
     * A {@link CellEditableIface.Builder} object constructs a {@link CellEditableIface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link CellEditableIface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final CellEditableIface struct;
        
        private Builder() {
            struct = CellEditableIface.allocate();
        }
        
        /**
         * Finish building the {@link CellEditableIface} struct.
         * @return A new instance of {@code CellEditableIface} with the fields 
         *         that were set in the Builder object.
         */
        public CellEditableIface build() {
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
        
        public Builder setEditingDone(EditingDoneCallback editingDone) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("editing_done"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (editingDone == null ? MemoryAddress.NULL : editingDone.toCallback()));
                return this;
            }
        }
        
        public Builder setRemoveWidget(RemoveWidgetCallback removeWidget) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("remove_widget"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (removeWidget == null ? MemoryAddress.NULL : removeWidget.toCallback()));
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
    }
}
