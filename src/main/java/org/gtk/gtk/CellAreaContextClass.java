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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        CellAreaContextClass newInstance = new CellAreaContextClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Functional interface declaration of the {@code AllocateCallback} callback.
     */
    @FunctionalInterface
    public interface AllocateCallback {
    
        void run(org.gtk.gtk.CellAreaContext context, int width, int height);
        
        @ApiStatus.Internal default void upcall(MemoryAddress context, int width, int height) {
            run((org.gtk.gtk.CellAreaContext) Interop.register(context, org.gtk.gtk.CellAreaContext.fromAddress).marshal(context, null), width, height);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AllocateCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code allocate}
     * @param allocate The new value of the field {@code allocate}
     */
    public void setAllocate(AllocateCallback allocate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("allocate"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (allocate == null ? MemoryAddress.NULL : allocate.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ResetCallback} callback.
     */
    @FunctionalInterface
    public interface ResetCallback {
    
        void run(org.gtk.gtk.CellAreaContext context);
        
        @ApiStatus.Internal default void upcall(MemoryAddress context) {
            run((org.gtk.gtk.CellAreaContext) Interop.register(context, org.gtk.gtk.CellAreaContext.fromAddress).marshal(context, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ResetCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code reset}
     * @param reset The new value of the field {@code reset}
     */
    public void setReset(ResetCallback reset) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reset"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (reset == null ? MemoryAddress.NULL : reset.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetPreferredHeightForWidthCallback} callback.
     */
    @FunctionalInterface
    public interface GetPreferredHeightForWidthCallback {
    
        void run(org.gtk.gtk.CellAreaContext context, int width, Out<Integer> minimumHeight, Out<Integer> naturalHeight);
        
        @ApiStatus.Internal default void upcall(MemoryAddress context, int width, MemoryAddress minimumHeight, MemoryAddress naturalHeight) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Integer> minimumHeightOUT = new Out<>(minimumHeight.get(Interop.valueLayout.C_INT, 0));
                Out<Integer> naturalHeightOUT = new Out<>(naturalHeight.get(Interop.valueLayout.C_INT, 0));
                run((org.gtk.gtk.CellAreaContext) Interop.register(context, org.gtk.gtk.CellAreaContext.fromAddress).marshal(context, null), width, minimumHeightOUT, naturalHeightOUT);
                minimumHeight.set(Interop.valueLayout.C_INT, 0, minimumHeightOUT.get());
                naturalHeight.set(Interop.valueLayout.C_INT, 0, naturalHeightOUT.get());
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
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
     * Functional interface declaration of the {@code GetPreferredWidthForHeightCallback} callback.
     */
    @FunctionalInterface
    public interface GetPreferredWidthForHeightCallback {
    
        void run(org.gtk.gtk.CellAreaContext context, int height, Out<Integer> minimumWidth, Out<Integer> naturalWidth);
        
        @ApiStatus.Internal default void upcall(MemoryAddress context, int height, MemoryAddress minimumWidth, MemoryAddress naturalWidth) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<Integer> minimumWidthOUT = new Out<>(minimumWidth.get(Interop.valueLayout.C_INT, 0));
                Out<Integer> naturalWidthOUT = new Out<>(naturalWidth.get(Interop.valueLayout.C_INT, 0));
                run((org.gtk.gtk.CellAreaContext) Interop.register(context, org.gtk.gtk.CellAreaContext.fromAddress).marshal(context, null), height, minimumWidthOUT, naturalWidthOUT);
                minimumWidth.set(Interop.valueLayout.C_INT, 0, minimumWidthOUT.get());
                naturalWidth.set(Interop.valueLayout.C_INT, 0, naturalWidthOUT.get());
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
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
     * Create a CellAreaContextClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected CellAreaContextClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, CellAreaContextClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new CellAreaContextClass(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setAllocate(AllocateCallback allocate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("allocate"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (allocate == null ? MemoryAddress.NULL : allocate.toCallback()));
                return this;
            }
        }
        
        public Builder setReset(ResetCallback reset) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("reset"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (reset == null ? MemoryAddress.NULL : reset.toCallback()));
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
        
        public Builder setGetPreferredWidthForHeight(GetPreferredWidthForHeightCallback getPreferredWidthForHeight) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_preferred_width_for_height"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPreferredWidthForHeight == null ? MemoryAddress.NULL : getPreferredWidthForHeight.toCallback()));
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
