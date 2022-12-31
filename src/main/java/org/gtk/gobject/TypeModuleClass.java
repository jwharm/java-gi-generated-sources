package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * In order to implement dynamic loading of types based on {@link TypeModule},
 * the {@code load} and {@code unload} functions in {@link TypeModuleClass} must be implemented.
 */
public class TypeModuleClass extends Struct {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GTypeModuleClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("load"),
            Interop.valueLayout.ADDRESS.withName("unload"),
            Interop.valueLayout.ADDRESS.withName("reserved1"),
            Interop.valueLayout.ADDRESS.withName("reserved2"),
            Interop.valueLayout.ADDRESS.withName("reserved3"),
            Interop.valueLayout.ADDRESS.withName("reserved4")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link TypeModuleClass}
     * @return A new, uninitialized @{link TypeModuleClass}
     */
    public static TypeModuleClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        TypeModuleClass newInstance = new TypeModuleClass(segment.address(), Ownership.NONE);
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
    public interface LoadCallback {
        boolean run(org.gtk.gobject.TypeModule module);

        @ApiStatus.Internal default int upcall(MemoryAddress module) {
            var RESULT = run((org.gtk.gobject.TypeModule) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(module)), org.gtk.gobject.TypeModule.fromAddress).marshal(module, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LoadCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code load}
     * @param load The new value of the field {@code load}
     */
    public void setLoad(LoadCallback load) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("load"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (load == null ? MemoryAddress.NULL : load.toCallback()));
    }
    
    @FunctionalInterface
    public interface UnloadCallback {
        void run(org.gtk.gobject.TypeModule module);

        @ApiStatus.Internal default void upcall(MemoryAddress module) {
            run((org.gtk.gobject.TypeModule) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(module)), org.gtk.gobject.TypeModule.fromAddress).marshal(module, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UnloadCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unload}
     * @param unload The new value of the field {@code unload}
     */
    public void setUnload(UnloadCallback unload) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unload"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unload == null ? MemoryAddress.NULL : unload.toCallback()));
    }
    
    @FunctionalInterface
    public interface Reserved1Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Reserved1Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code reserved1}
     * @param reserved1 The new value of the field {@code reserved1}
     */
    public void setReserved1(Reserved1Callback reserved1) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("reserved1"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved1 == null ? MemoryAddress.NULL : reserved1.toCallback()));
    }
    
    @FunctionalInterface
    public interface Reserved2Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Reserved2Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code reserved2}
     * @param reserved2 The new value of the field {@code reserved2}
     */
    public void setReserved2(Reserved2Callback reserved2) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("reserved2"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved2 == null ? MemoryAddress.NULL : reserved2.toCallback()));
    }
    
    @FunctionalInterface
    public interface Reserved3Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Reserved3Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code reserved3}
     * @param reserved3 The new value of the field {@code reserved3}
     */
    public void setReserved3(Reserved3Callback reserved3) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("reserved3"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved3 == null ? MemoryAddress.NULL : reserved3.toCallback()));
    }
    
    @FunctionalInterface
    public interface Reserved4Callback {
        void run();

        @ApiStatus.Internal default void upcall() {
            run();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid();
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Reserved4Callback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code reserved4}
     * @param reserved4 The new value of the field {@code reserved4}
     */
    public void setReserved4(Reserved4Callback reserved4) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("reserved4"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved4 == null ? MemoryAddress.NULL : reserved4.toCallback()));
    }
    
    /**
     * Create a TypeModuleClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected TypeModuleClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, TypeModuleClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new TypeModuleClass(input, ownership);
    
    /**
     * A {@link TypeModuleClass.Builder} object constructs a {@link TypeModuleClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link TypeModuleClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final TypeModuleClass struct;
        
        private Builder() {
            struct = TypeModuleClass.allocate();
        }
        
         /**
         * Finish building the {@link TypeModuleClass} struct.
         * @return A new instance of {@code TypeModuleClass} with the fields 
         *         that were set in the Builder object.
         */
        public TypeModuleClass build() {
            return struct;
        }
        
        /**
         * the parent class
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setLoad(LoadCallback load) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("load"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (load == null ? MemoryAddress.NULL : load.toCallback()));
            return this;
        }
        
        public Builder setUnload(UnloadCallback unload) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unload"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unload == null ? MemoryAddress.NULL : unload.toCallback()));
            return this;
        }
        
        public Builder setReserved1(Reserved1Callback reserved1) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reserved1"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved1 == null ? MemoryAddress.NULL : reserved1.toCallback()));
            return this;
        }
        
        public Builder setReserved2(Reserved2Callback reserved2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved2 == null ? MemoryAddress.NULL : reserved2.toCallback()));
            return this;
        }
        
        public Builder setReserved3(Reserved3Callback reserved3) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved3 == null ? MemoryAddress.NULL : reserved3.toCallback()));
            return this;
        }
        
        public Builder setReserved4(Reserved4Callback reserved4) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reserved4"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reserved4 == null ? MemoryAddress.NULL : reserved4.toCallback()));
            return this;
        }
    }
}
