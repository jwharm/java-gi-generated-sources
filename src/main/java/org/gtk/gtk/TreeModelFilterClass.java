package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class TreeModelFilterClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkTreeModelFilterClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("visible"),
            Interop.valueLayout.ADDRESS.withName("modify"),
            MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TreeModelFilterClass}
     * @return A new, uninitialized @{link TreeModelFilterClass}
     */
    public static TreeModelFilterClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TreeModelFilterClass newInstance = new TreeModelFilterClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gobject.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gobject.ObjectClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface VisibleCallback {
        boolean run(org.gtk.gtk.TreeModelFilter self, org.gtk.gtk.TreeModel childModel, org.gtk.gtk.TreeIter iter);

        @ApiStatus.Internal default int upcall(MemoryAddress self, MemoryAddress childModel, MemoryAddress iter) {
            var RESULT = run((org.gtk.gtk.TreeModelFilter) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gtk.gtk.TreeModelFilter.fromAddress).marshal(self, Ownership.NONE), (org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(childModel)), org.gtk.gtk.TreeModel.fromAddress).marshal(childModel, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(VisibleCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code visible}
     * @param visible The new value of the field {@code visible}
     */
    public void setVisible(VisibleCallback visible) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("visible"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (visible == null ? MemoryAddress.NULL : visible.toCallback()));
    }
    
    @FunctionalInterface
    public interface ModifyCallback {
        void run(org.gtk.gtk.TreeModelFilter self, org.gtk.gtk.TreeModel childModel, org.gtk.gtk.TreeIter iter, org.gtk.gobject.Value value, int column);

        @ApiStatus.Internal default void upcall(MemoryAddress self, MemoryAddress childModel, MemoryAddress iter, MemoryAddress value, int column) {
            run((org.gtk.gtk.TreeModelFilter) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(self)), org.gtk.gtk.TreeModelFilter.fromAddress).marshal(self, Ownership.NONE), (org.gtk.gtk.TreeModel) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(childModel)), org.gtk.gtk.TreeModel.fromAddress).marshal(childModel, Ownership.NONE), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, Ownership.NONE), org.gtk.gobject.Value.fromAddress.marshal(value, Ownership.NONE), column);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ModifyCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code modify}
     * @param modify The new value of the field {@code modify}
     */
    public void setModify(ModifyCallback modify) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("modify"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (modify == null ? MemoryAddress.NULL : modify.toCallback()));
    }
    
    /**
     * Create a TreeModelFilterClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TreeModelFilterClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TreeModelFilterClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TreeModelFilterClass(input, ownership);
    
    /**
     * A {@link TreeModelFilterClass.Builder} object constructs a {@link TreeModelFilterClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TreeModelFilterClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TreeModelFilterClass struct;
        
        private Builder() {
            struct = TreeModelFilterClass.allocate();
        }
        
         /**
         * Finish building the {@link TreeModelFilterClass} struct.
         * @return A new instance of {@code TreeModelFilterClass} with the fields 
         *         that were set in the Builder object.
         */
        public TreeModelFilterClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setVisible(VisibleCallback visible) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("visible"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (visible == null ? MemoryAddress.NULL : visible.toCallback()));
            return this;
        }
        
        public Builder setModify(ModifyCallback modify) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("modify"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (modify == null ? MemoryAddress.NULL : modify.toCallback()));
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
