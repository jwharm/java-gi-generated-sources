package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class CellRendererTextClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellRendererTextClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gtk.CellRendererClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("edited"),
            MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link CellRendererTextClass}
     * @return A new, uninitialized @{link CellRendererTextClass}
     */
    public static CellRendererTextClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        CellRendererTextClass newInstance = new CellRendererTextClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gtk.CellRendererClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gtk.CellRendererClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gtk.CellRendererClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code EditedCallback} callback.
     */
    @FunctionalInterface
    public interface EditedCallback {
    
        void run(org.gtk.gtk.CellRendererText cellRendererText, java.lang.String path, java.lang.String newText);
        
        @ApiStatus.Internal default void upcall(MemoryAddress cellRendererText, MemoryAddress path, MemoryAddress newText) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gtk.CellRendererText) Interop.register(cellRendererText, org.gtk.gtk.CellRendererText.fromAddress).marshal(cellRendererText, null), Marshal.addressToString.marshal(path, null), Marshal.addressToString.marshal(newText, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EditedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code edited}
     * @param edited The new value of the field {@code edited}
     */
    public void setEdited(EditedCallback edited) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("edited"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (edited == null ? MemoryAddress.NULL : edited.toCallback()));
        }
    }
    
    /**
     * Create a CellRendererTextClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected CellRendererTextClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, CellRendererTextClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new CellRendererTextClass(input);
    
    /**
     * A {@link CellRendererTextClass.Builder} object constructs a {@link CellRendererTextClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link CellRendererTextClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final CellRendererTextClass struct;
        
        private Builder() {
            struct = CellRendererTextClass.allocate();
        }
        
        /**
         * Finish building the {@link CellRendererTextClass} struct.
         * @return A new instance of {@code CellRendererTextClass} with the fields 
         *         that were set in the Builder object.
         */
        public CellRendererTextClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gtk.CellRendererClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setEdited(EditedCallback edited) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("edited"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (edited == null ? MemoryAddress.NULL : edited.toCallback()));
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
