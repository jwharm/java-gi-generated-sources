package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The class structure for the GInitiallyUnowned type.
 */
public class InitiallyUnownedClass extends Struct {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GInitiallyUnownedClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeClass.getMemoryLayout().withName("g_type_class"),
            Interop.valueLayout.ADDRESS.withName("construct_properties"),
            Interop.valueLayout.ADDRESS.withName("constructor"),
            Interop.valueLayout.ADDRESS.withName("set_property"),
            Interop.valueLayout.ADDRESS.withName("get_property"),
            Interop.valueLayout.ADDRESS.withName("dispose"),
            Interop.valueLayout.ADDRESS.withName("finalize"),
            Interop.valueLayout.ADDRESS.withName("dispatch_properties_changed"),
            Interop.valueLayout.ADDRESS.withName("notify"),
            Interop.valueLayout.ADDRESS.withName("constructed"),
            Interop.valueLayout.C_LONG.withName("flags"),
            Interop.valueLayout.C_LONG.withName("n_construct_properties"),
            Interop.valueLayout.ADDRESS.withName("pspecs"),
            Interop.valueLayout.C_LONG.withName("n_pspecs"),
            MemoryLayout.sequenceLayout(3, Interop.valueLayout.ADDRESS).withName("pdummy")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link InitiallyUnownedClass}
     * @return A new, uninitialized @{link InitiallyUnownedClass}
     */
    public static InitiallyUnownedClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        InitiallyUnownedClass newInstance = new InitiallyUnownedClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_type_class}
     * @return The value of the field {@code g_type_class}
     */
    public org.gtk.gobject.TypeClass getGTypeClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_type_class"));
        return org.gtk.gobject.TypeClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code g_type_class}
     * @param gTypeClass The new value of the field {@code g_type_class}
     */
    public void setGTypeClass(org.gtk.gobject.TypeClass gTypeClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("g_type_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gTypeClass == null ? MemoryAddress.NULL : gTypeClass.handle()));
    }
    
    @FunctionalInterface
    public interface ConstructorCallback {
        org.gtk.gobject.GObject run(org.gtk.glib.Type type, int nConstructProperties, org.gtk.gobject.ObjectConstructParam constructProperties);

        @ApiStatus.Internal default Addressable upcall(long type, int nConstructProperties, MemoryAddress constructProperties) {
            var RESULT = run(new org.gtk.glib.Type(type), nConstructProperties, org.gtk.gobject.ObjectConstructParam.fromAddress.marshal(constructProperties, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ConstructorCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code constructor}
     * @param constructor The new value of the field {@code constructor}
     */
    public void setConstructor(ConstructorCallback constructor) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("constructor"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (constructor == null ? MemoryAddress.NULL : constructor.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetPropertyCallback {
        void run(org.gtk.gobject.GObject object, int propertyId, org.gtk.gobject.Value value, org.gtk.gobject.ParamSpec pspec);

        @ApiStatus.Internal default void upcall(MemoryAddress object, int propertyId, MemoryAddress value, MemoryAddress pspec) {
            run((org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(object)), org.gtk.gobject.GObject.fromAddress).marshal(object, Ownership.NONE), propertyId, org.gtk.gobject.Value.fromAddress.marshal(value, Ownership.NONE), (org.gtk.gobject.ParamSpec) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pspec)), org.gtk.gobject.ParamSpec.fromAddress).marshal(pspec, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetPropertyCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_property}
     * @param setProperty The new value of the field {@code set_property}
     */
    public void setSetProperty(SetPropertyCallback setProperty) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_property"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setProperty == null ? MemoryAddress.NULL : setProperty.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetPropertyCallback {
        void run(org.gtk.gobject.GObject object, int propertyId, org.gtk.gobject.Value value, org.gtk.gobject.ParamSpec pspec);

        @ApiStatus.Internal default void upcall(MemoryAddress object, int propertyId, MemoryAddress value, MemoryAddress pspec) {
            run((org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(object)), org.gtk.gobject.GObject.fromAddress).marshal(object, Ownership.NONE), propertyId, org.gtk.gobject.Value.fromAddress.marshal(value, Ownership.NONE), (org.gtk.gobject.ParamSpec) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pspec)), org.gtk.gobject.ParamSpec.fromAddress).marshal(pspec, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetPropertyCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_property}
     * @param getProperty The new value of the field {@code get_property}
     */
    public void setGetProperty(GetPropertyCallback getProperty) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_property"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getProperty == null ? MemoryAddress.NULL : getProperty.toCallback()));
    }
    
    @FunctionalInterface
    public interface DisposeCallback {
        void run(org.gtk.gobject.GObject object);

        @ApiStatus.Internal default void upcall(MemoryAddress object) {
            run((org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(object)), org.gtk.gobject.GObject.fromAddress).marshal(object, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DisposeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code dispose}
     * @param dispose The new value of the field {@code dispose}
     */
    public void setDispose(DisposeCallback dispose) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dispose"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dispose == null ? MemoryAddress.NULL : dispose.toCallback()));
    }
    
    @FunctionalInterface
    public interface FinalizeCallback {
        void run(org.gtk.gobject.GObject object);

        @ApiStatus.Internal default void upcall(MemoryAddress object) {
            run((org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(object)), org.gtk.gobject.GObject.fromAddress).marshal(object, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FinalizeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code finalize}
     * @param finalize The new value of the field {@code finalize}
     */
    public void setFinalize(FinalizeCallback finalize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("finalize"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (finalize == null ? MemoryAddress.NULL : finalize.toCallback()));
    }
    
    @FunctionalInterface
    public interface DispatchPropertiesChangedCallback {
        void run(org.gtk.gobject.GObject object, int nPspecs, PointerProxy<org.gtk.gobject.ParamSpec> pspecs);

        @ApiStatus.Internal default void upcall(MemoryAddress object, int nPspecs, MemoryAddress pspecs) {
            run((org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(object)), org.gtk.gobject.GObject.fromAddress).marshal(object, Ownership.NONE), nPspecs, new PointerProxy<org.gtk.gobject.ParamSpec>(pspecs, org.gtk.gobject.ParamSpec.fromAddress));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DispatchPropertiesChangedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code dispatch_properties_changed}
     * @param dispatchPropertiesChanged The new value of the field {@code dispatch_properties_changed}
     */
    public void setDispatchPropertiesChanged(DispatchPropertiesChangedCallback dispatchPropertiesChanged) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dispatch_properties_changed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dispatchPropertiesChanged == null ? MemoryAddress.NULL : dispatchPropertiesChanged.toCallback()));
    }
    
    @FunctionalInterface
    public interface NotifyCallback {
        void run(org.gtk.gobject.GObject object, org.gtk.gobject.ParamSpec pspec);

        @ApiStatus.Internal default void upcall(MemoryAddress object, MemoryAddress pspec) {
            run((org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(object)), org.gtk.gobject.GObject.fromAddress).marshal(object, Ownership.NONE), (org.gtk.gobject.ParamSpec) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pspec)), org.gtk.gobject.ParamSpec.fromAddress).marshal(pspec, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(NotifyCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code notify}
     * @param notify The new value of the field {@code notify}
     */
    public void setNotify(NotifyCallback notify) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("notify"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (notify == null ? MemoryAddress.NULL : notify.toCallback()));
    }
    
    @FunctionalInterface
    public interface ConstructedCallback {
        void run(org.gtk.gobject.GObject object);

        @ApiStatus.Internal default void upcall(MemoryAddress object) {
            run((org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(object)), org.gtk.gobject.GObject.fromAddress).marshal(object, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ConstructedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code constructed}
     * @param constructed The new value of the field {@code constructed}
     */
    public void setConstructed(ConstructedCallback constructed) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("constructed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (constructed == null ? MemoryAddress.NULL : constructed.toCallback()));
    }
    
    /**
     * Create a InitiallyUnownedClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected InitiallyUnownedClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, InitiallyUnownedClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new InitiallyUnownedClass(input, ownership);
    
    /**
     * A {@link InitiallyUnownedClass.Builder} object constructs a {@link InitiallyUnownedClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link InitiallyUnownedClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final InitiallyUnownedClass struct;
        
        private Builder() {
            struct = InitiallyUnownedClass.allocate();
        }
        
         /**
         * Finish building the {@link InitiallyUnownedClass} struct.
         * @return A new instance of {@code InitiallyUnownedClass} with the fields 
         *         that were set in the Builder object.
         */
        public InitiallyUnownedClass build() {
            return struct;
        }
        
        /**
         * the parent class
         * @param gTypeClass The value for the {@code gTypeClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGTypeClass(org.gtk.gobject.TypeClass gTypeClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_type_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gTypeClass == null ? MemoryAddress.NULL : gTypeClass.handle()));
            return this;
        }
        
        public Builder setConstructProperties(org.gtk.glib.SList constructProperties) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("construct_properties"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (constructProperties == null ? MemoryAddress.NULL : constructProperties.handle()));
            return this;
        }
        
        public Builder setConstructor(ConstructorCallback constructor) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("constructor"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (constructor == null ? MemoryAddress.NULL : constructor.toCallback()));
            return this;
        }
        
        public Builder setSetProperty(SetPropertyCallback setProperty) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_property"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setProperty == null ? MemoryAddress.NULL : setProperty.toCallback()));
            return this;
        }
        
        public Builder setGetProperty(GetPropertyCallback getProperty) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_property"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getProperty == null ? MemoryAddress.NULL : getProperty.toCallback()));
            return this;
        }
        
        public Builder setDispose(DisposeCallback dispose) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dispose"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dispose == null ? MemoryAddress.NULL : dispose.toCallback()));
            return this;
        }
        
        public Builder setFinalize(FinalizeCallback finalize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("finalize"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (finalize == null ? MemoryAddress.NULL : finalize.toCallback()));
            return this;
        }
        
        public Builder setDispatchPropertiesChanged(DispatchPropertiesChangedCallback dispatchPropertiesChanged) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dispatch_properties_changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dispatchPropertiesChanged == null ? MemoryAddress.NULL : dispatchPropertiesChanged.toCallback()));
            return this;
        }
        
        public Builder setNotify(NotifyCallback notify) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("notify"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (notify == null ? MemoryAddress.NULL : notify.toCallback()));
            return this;
        }
        
        public Builder setConstructed(ConstructedCallback constructed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("constructed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (constructed == null ? MemoryAddress.NULL : constructed.toCallback()));
            return this;
        }
        
        public Builder setFlags(long flags) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flags"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), flags);
            return this;
        }
        
        public Builder setNConstructProperties(long nConstructProperties) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_construct_properties"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), nConstructProperties);
            return this;
        }
        
        public Builder setPspecs(java.lang.foreign.MemoryAddress pspecs) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pspecs"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pspecs == null ? MemoryAddress.NULL : (Addressable) pspecs));
            return this;
        }
        
        public Builder setNPspecs(long nPspecs) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_pspecs"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), nPspecs);
            return this;
        }
        
        public Builder setPdummy(java.lang.foreign.MemoryAddress[] pdummy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pdummy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pdummy == null ? MemoryAddress.NULL : Interop.allocateNativeArray(pdummy, false)));
            return this;
        }
    }
}
