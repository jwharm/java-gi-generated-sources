package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AdjustmentClass extends Struct {
    
    static {
        Gtk.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GtkAdjustmentClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.InitiallyUnownedClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("changed"),
            Interop.valueLayout.ADDRESS.withName("value_changed"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved1"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved2"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved3"),
            Interop.valueLayout.ADDRESS.withName("_gtk_reserved4")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AdjustmentClass}
     * @return A new, uninitialized @{link AdjustmentClass}
     */
    public static AdjustmentClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AdjustmentClass newInstance = new AdjustmentClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.InitiallyUnownedClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gobject.InitiallyUnownedClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gobject.InitiallyUnownedClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface ChangedCallback {
        void run(org.gtk.gtk.Adjustment adjustment);

        @ApiStatus.Internal default void upcall(MemoryAddress adjustment) {
            run((org.gtk.gtk.Adjustment) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(adjustment)), org.gtk.gtk.Adjustment.fromAddress).marshal(adjustment, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ChangedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code changed}
     * @param changed The new value of the field {@code changed}
     */
    public void setChanged(ChangedCallback changed) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("changed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (changed == null ? MemoryAddress.NULL : changed.toCallback()));
    }
    
    @FunctionalInterface
    public interface ValueChangedCallback {
        void run(org.gtk.gtk.Adjustment adjustment);

        @ApiStatus.Internal default void upcall(MemoryAddress adjustment) {
            run((org.gtk.gtk.Adjustment) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(adjustment)), org.gtk.gtk.Adjustment.fromAddress).marshal(adjustment, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ValueChangedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code value_changed}
     * @param valueChanged The new value of the field {@code value_changed}
     */
    public void setValueChanged(ValueChangedCallback valueChanged) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value_changed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valueChanged == null ? MemoryAddress.NULL : valueChanged.toCallback()));
    }
    
    @FunctionalInterface
    public interface GtkReserved1Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GtkReserved1Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved1}
     * @param GtkReserved1 The new value of the field {@code _gtk_reserved1}
     */
    public void setGtkReserved1(GtkReserved1Callback GtkReserved1) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved1 == null ? MemoryAddress.NULL : GtkReserved1.toCallback()));
    }
    
    @FunctionalInterface
    public interface GtkReserved2Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GtkReserved2Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved2}
     * @param GtkReserved2 The new value of the field {@code _gtk_reserved2}
     */
    public void setGtkReserved2(GtkReserved2Callback GtkReserved2) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved2 == null ? MemoryAddress.NULL : GtkReserved2.toCallback()));
    }
    
    @FunctionalInterface
    public interface GtkReserved3Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GtkReserved3Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved3}
     * @param GtkReserved3 The new value of the field {@code _gtk_reserved3}
     */
    public void setGtkReserved3(GtkReserved3Callback GtkReserved3) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved3 == null ? MemoryAddress.NULL : GtkReserved3.toCallback()));
    }
    
    @FunctionalInterface
    public interface GtkReserved4Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GtkReserved4Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code _gtk_reserved4}
     * @param GtkReserved4 The new value of the field {@code _gtk_reserved4}
     */
    public void setGtkReserved4(GtkReserved4Callback GtkReserved4) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved4 == null ? MemoryAddress.NULL : GtkReserved4.toCallback()));
    }
    
    /**
     * Create a AdjustmentClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AdjustmentClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AdjustmentClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AdjustmentClass(input, ownership);
    
    /**
     * A {@link AdjustmentClass.Builder} object constructs a {@link AdjustmentClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AdjustmentClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AdjustmentClass struct;
        
        private Builder() {
            struct = AdjustmentClass.allocate();
        }
        
         /**
         * Finish building the {@link AdjustmentClass} struct.
         * @return A new instance of {@code AdjustmentClass} with the fields 
         *         that were set in the Builder object.
         */
        public AdjustmentClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.InitiallyUnownedClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setChanged(ChangedCallback changed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (changed == null ? MemoryAddress.NULL : changed.toCallback()));
            return this;
        }
        
        public Builder setValueChanged(ValueChangedCallback valueChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valueChanged == null ? MemoryAddress.NULL : valueChanged.toCallback()));
            return this;
        }
        
        public Builder setGtkReserved1(GtkReserved1Callback GtkReserved1) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved1"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved1 == null ? MemoryAddress.NULL : GtkReserved1.toCallback()));
            return this;
        }
        
        public Builder setGtkReserved2(GtkReserved2Callback GtkReserved2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved2 == null ? MemoryAddress.NULL : GtkReserved2.toCallback()));
            return this;
        }
        
        public Builder setGtkReserved3(GtkReserved3Callback GtkReserved3) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved3 == null ? MemoryAddress.NULL : GtkReserved3.toCallback()));
            return this;
        }
        
        public Builder setGtkReserved4(GtkReserved4Callback GtkReserved4) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GtkReserved4 == null ? MemoryAddress.NULL : GtkReserved4.toCallback()));
            return this;
        }
    }
}
