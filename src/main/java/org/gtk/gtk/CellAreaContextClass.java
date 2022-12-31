package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class CellAreaContextClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkCellAreaContextClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("allocate"),
            Interop.valueLayout.ADDRESS.withName("reset"),
            Interop.valueLayout.ADDRESS.withName("get_preferred_height_for_width"),
            Interop.valueLayout.ADDRESS.withName("get_preferred_width_for_height"),
            MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link CellAreaContextClass}
     * @return A new, uninitialized @{link CellAreaContextClass}
     */
    public static CellAreaContextClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        CellAreaContextClass newInstance = new CellAreaContextClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    @FunctionalInterface
    public interface AllocateCallback {
        void run(org.gtk.gtk.CellAreaContext context, int width, int height);

        @ApiStatus.Internal default void upcall(MemoryAddress context, int width, int height) {
            run((org.gtk.gtk.CellAreaContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gtk.gtk.CellAreaContext.fromAddress).marshal(context, Ownership.NONE), width, height);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AllocateCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code allocate}
     * @param allocate The new value of the field {@code allocate}
     */
    public void setAllocate(AllocateCallback allocate) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("allocate"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (allocate == null ? MemoryAddress.NULL : allocate.toCallback()));
    }
    
    @FunctionalInterface
    public interface ResetCallback {
        void run(org.gtk.gtk.CellAreaContext context);

        @ApiStatus.Internal default void upcall(MemoryAddress context) {
            run((org.gtk.gtk.CellAreaContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gtk.gtk.CellAreaContext.fromAddress).marshal(context, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ResetCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code reset}
     * @param reset The new value of the field {@code reset}
     */
    public void setReset(ResetCallback reset) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("reset"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reset == null ? MemoryAddress.NULL : reset.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetPreferredHeightForWidthCallback {
        void run(org.gtk.gtk.CellAreaContext context, int width, Out<Integer> minimumHeight, Out<Integer> naturalHeight);

        @ApiStatus.Internal default void upcall(MemoryAddress context, int width, MemoryAddress minimumHeight, MemoryAddress naturalHeight) {
            Out<Integer> minimumHeightOUT = new Out<>(minimumHeight.get(Interop.valueLayout.C_INT, 0));
            Out<Integer> naturalHeightOUT = new Out<>(naturalHeight.get(Interop.valueLayout.C_INT, 0));
            run((org.gtk.gtk.CellAreaContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gtk.gtk.CellAreaContext.fromAddress).marshal(context, Ownership.NONE), width, minimumHeightOUT, naturalHeightOUT);
            minimumHeight.set(Interop.valueLayout.C_INT, 0, minimumHeightOUT.get());
            naturalHeight.set(Interop.valueLayout.C_INT, 0, naturalHeightOUT.get());
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
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
    public interface GetPreferredWidthForHeightCallback {
        void run(org.gtk.gtk.CellAreaContext context, int height, Out<Integer> minimumWidth, Out<Integer> naturalWidth);

        @ApiStatus.Internal default void upcall(MemoryAddress context, int height, MemoryAddress minimumWidth, MemoryAddress naturalWidth) {
            Out<Integer> minimumWidthOUT = new Out<>(minimumWidth.get(Interop.valueLayout.C_INT, 0));
            Out<Integer> naturalWidthOUT = new Out<>(naturalWidth.get(Interop.valueLayout.C_INT, 0));
            run((org.gtk.gtk.CellAreaContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gtk.gtk.CellAreaContext.fromAddress).marshal(context, Ownership.NONE), height, minimumWidthOUT, naturalWidthOUT);
            minimumWidth.set(Interop.valueLayout.C_INT, 0, minimumWidthOUT.get());
            naturalWidth.set(Interop.valueLayout.C_INT, 0, naturalWidthOUT.get());
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
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
    
    /**
     * Create a CellAreaContextClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected CellAreaContextClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, CellAreaContextClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new CellAreaContextClass(input, ownership);
    
    /**
     * A {@link CellAreaContextClass.Builder} object constructs a {@link CellAreaContextClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link CellAreaContextClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final CellAreaContextClass struct;
        
        private Builder() {
            struct = CellAreaContextClass.allocate();
        }
        
         /**
         * Finish building the {@link CellAreaContextClass} struct.
         * @return A new instance of {@code CellAreaContextClass} with the fields 
         *         that were set in the Builder object.
         */
        public CellAreaContextClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setAllocate(AllocateCallback allocate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("allocate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (allocate == null ? MemoryAddress.NULL : allocate.toCallback()));
            return this;
        }
        
        public Builder setReset(ResetCallback reset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reset == null ? MemoryAddress.NULL : reset.toCallback()));
            return this;
        }
        
        public Builder setGetPreferredHeightForWidth(GetPreferredHeightForWidthCallback getPreferredHeightForWidth) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_height_for_width"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPreferredHeightForWidth == null ? MemoryAddress.NULL : getPreferredHeightForWidth.toCallback()));
            return this;
        }
        
        public Builder setGetPreferredWidthForHeight(GetPreferredWidthForHeightCallback getPreferredWidthForHeight) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_width_for_height"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPreferredWidthForHeight == null ? MemoryAddress.NULL : getPreferredWidthForHeight.toCallback()));
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
