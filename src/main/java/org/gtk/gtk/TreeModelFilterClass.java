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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        TreeModelFilterClass newInstance = new TreeModelFilterClass(segment.address());
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
     * Functional interface declaration of the {@code VisibleCallback} callback.
     */
    @FunctionalInterface
    public interface VisibleCallback {
    
        boolean run(org.gtk.gtk.TreeModelFilter self, org.gtk.gtk.TreeModel childModel, org.gtk.gtk.TreeIter iter);
        
        @ApiStatus.Internal default int upcall(MemoryAddress self, MemoryAddress childModel, MemoryAddress iter) {
            var RESULT = run((org.gtk.gtk.TreeModelFilter) Interop.register(self, org.gtk.gtk.TreeModelFilter.fromAddress).marshal(self, null), (org.gtk.gtk.TreeModel) Interop.register(childModel, org.gtk.gtk.TreeModel.fromAddress).marshal(childModel, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), VisibleCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code visible}
     * @param visible The new value of the field {@code visible}
     */
    public void setVisible(VisibleCallback visible) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("visible"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (visible == null ? MemoryAddress.NULL : visible.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ModifyCallback} callback.
     */
    @FunctionalInterface
    public interface ModifyCallback {
    
        void run(org.gtk.gtk.TreeModelFilter self, org.gtk.gtk.TreeModel childModel, org.gtk.gtk.TreeIter iter, org.gtk.gobject.Value value, int column);
        
        @ApiStatus.Internal default void upcall(MemoryAddress self, MemoryAddress childModel, MemoryAddress iter, MemoryAddress value, int column) {
            run((org.gtk.gtk.TreeModelFilter) Interop.register(self, org.gtk.gtk.TreeModelFilter.fromAddress).marshal(self, null), (org.gtk.gtk.TreeModel) Interop.register(childModel, org.gtk.gtk.TreeModel.fromAddress).marshal(childModel, null), org.gtk.gtk.TreeIter.fromAddress.marshal(iter, null), org.gtk.gobject.Value.fromAddress.marshal(value, null), column);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ModifyCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code modify}
     * @param modify The new value of the field {@code modify}
     */
    public void setModify(ModifyCallback modify) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("modify"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (modify == null ? MemoryAddress.NULL : modify.toCallback()));
        }
    }
    
    /**
     * Create a TreeModelFilterClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected TreeModelFilterClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, TreeModelFilterClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new TreeModelFilterClass(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setVisible(VisibleCallback visible) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("visible"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (visible == null ? MemoryAddress.NULL : visible.toCallback()));
                return this;
            }
        }
        
        public Builder setModify(ModifyCallback modify) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("modify"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (modify == null ? MemoryAddress.NULL : modify.toCallback()));
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
