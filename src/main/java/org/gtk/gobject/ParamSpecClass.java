package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The class structure for the GParamSpec type.
 * Normally, GParamSpec classes are filled by
 * g_param_type_register_static().
 */
public class ParamSpecClass extends Struct {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GParamSpecClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeClass.getMemoryLayout().withName("g_type_class"),
            Interop.valueLayout.C_LONG.withName("value_type"),
            Interop.valueLayout.ADDRESS.withName("finalize"),
            Interop.valueLayout.ADDRESS.withName("value_set_default"),
            Interop.valueLayout.ADDRESS.withName("value_validate"),
            Interop.valueLayout.ADDRESS.withName("values_cmp"),
            Interop.valueLayout.ADDRESS.withName("value_is_valid"),
            MemoryLayout.sequenceLayout(3, Interop.valueLayout.ADDRESS).withName("dummy")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ParamSpecClass}
     * @return A new, uninitialized @{link ParamSpecClass}
     */
    public static ParamSpecClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ParamSpecClass newInstance = new ParamSpecClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_type_class}
     * @return The value of the field {@code g_type_class}
     */
    public org.gtk.gobject.TypeClass getGTypeClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_type_class"));
        return org.gtk.gobject.TypeClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code g_type_class}
     * @param gTypeClass The new value of the field {@code g_type_class}
     */
    public void setGTypeClass(org.gtk.gobject.TypeClass gTypeClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_type_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gTypeClass == null ? MemoryAddress.NULL : gTypeClass.handle()));
        }
    }
    
    /**
     * Get the value of the field {@code value_type}
     * @return The value of the field {@code value_type}
     */
    public org.gtk.glib.Type getValueType() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (long) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_type"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new org.gtk.glib.Type(RESULT);
        }
    }
    
    /**
     * Change the value of the field {@code value_type}
     * @param valueType The new value of the field {@code value_type}
     */
    public void setValueType(org.gtk.glib.Type valueType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (valueType == null ? MemoryAddress.NULL : valueType.getValue().longValue()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code FinalizeCallback} callback.
     */
    @FunctionalInterface
    public interface FinalizeCallback {
    
        void run(org.gtk.gobject.ParamSpec pspec);
        
        @ApiStatus.Internal default void upcall(MemoryAddress pspec) {
            run((org.gtk.gobject.ParamSpec) Interop.register(pspec, org.gtk.gobject.ParamSpec.fromAddress).marshal(pspec, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), FinalizeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code finalize}
     * @param finalize The new value of the field {@code finalize}
     */
    public void setFinalize(FinalizeCallback finalize) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("finalize"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (finalize == null ? MemoryAddress.NULL : finalize.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ValueSetDefaultCallback} callback.
     */
    @FunctionalInterface
    public interface ValueSetDefaultCallback {
    
        void run(org.gtk.gobject.ParamSpec pspec, org.gtk.gobject.Value value);
        
        @ApiStatus.Internal default void upcall(MemoryAddress pspec, MemoryAddress value) {
            run((org.gtk.gobject.ParamSpec) Interop.register(pspec, org.gtk.gobject.ParamSpec.fromAddress).marshal(pspec, null), org.gtk.gobject.Value.fromAddress.marshal(value, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ValueSetDefaultCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code value_set_default}
     * @param valueSetDefault The new value of the field {@code value_set_default}
     */
    public void setValueSetDefault(ValueSetDefaultCallback valueSetDefault) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_set_default"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (valueSetDefault == null ? MemoryAddress.NULL : valueSetDefault.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ValueValidateCallback} callback.
     */
    @FunctionalInterface
    public interface ValueValidateCallback {
    
        boolean run(org.gtk.gobject.ParamSpec pspec, org.gtk.gobject.Value value);
        
        @ApiStatus.Internal default int upcall(MemoryAddress pspec, MemoryAddress value) {
            var RESULT = run((org.gtk.gobject.ParamSpec) Interop.register(pspec, org.gtk.gobject.ParamSpec.fromAddress).marshal(pspec, null), org.gtk.gobject.Value.fromAddress.marshal(value, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ValueValidateCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code value_validate}
     * @param valueValidate The new value of the field {@code value_validate}
     */
    public void setValueValidate(ValueValidateCallback valueValidate) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_validate"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (valueValidate == null ? MemoryAddress.NULL : valueValidate.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ValuesCmpCallback} callback.
     */
    @FunctionalInterface
    public interface ValuesCmpCallback {
    
        int run(org.gtk.gobject.ParamSpec pspec, org.gtk.gobject.Value value1, org.gtk.gobject.Value value2);
        
        @ApiStatus.Internal default int upcall(MemoryAddress pspec, MemoryAddress value1, MemoryAddress value2) {
            var RESULT = run((org.gtk.gobject.ParamSpec) Interop.register(pspec, org.gtk.gobject.ParamSpec.fromAddress).marshal(pspec, null), org.gtk.gobject.Value.fromAddress.marshal(value1, null), org.gtk.gobject.Value.fromAddress.marshal(value2, null));
            return RESULT;
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ValuesCmpCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code values_cmp}
     * @param valuesCmp The new value of the field {@code values_cmp}
     */
    public void setValuesCmp(ValuesCmpCallback valuesCmp) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("values_cmp"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (valuesCmp == null ? MemoryAddress.NULL : valuesCmp.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ValueIsValidCallback} callback.
     */
    @FunctionalInterface
    public interface ValueIsValidCallback {
    
        boolean run(org.gtk.gobject.ParamSpec pspec, org.gtk.gobject.Value value);
        
        @ApiStatus.Internal default int upcall(MemoryAddress pspec, MemoryAddress value) {
            var RESULT = run((org.gtk.gobject.ParamSpec) Interop.register(pspec, org.gtk.gobject.ParamSpec.fromAddress).marshal(pspec, null), org.gtk.gobject.Value.fromAddress.marshal(value, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ValueIsValidCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code value_is_valid}
     * @param valueIsValid The new value of the field {@code value_is_valid}
     */
    public void setValueIsValid(ValueIsValidCallback valueIsValid) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_is_valid"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (valueIsValid == null ? MemoryAddress.NULL : valueIsValid.toCallback()));
        }
    }
    
    /**
     * Create a ParamSpecClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ParamSpecClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ParamSpecClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ParamSpecClass(input);
    
    /**
     * A {@link ParamSpecClass.Builder} object constructs a {@link ParamSpecClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ParamSpecClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ParamSpecClass struct;
        
        private Builder() {
            struct = ParamSpecClass.allocate();
        }
        
        /**
         * Finish building the {@link ParamSpecClass} struct.
         * @return A new instance of {@code ParamSpecClass} with the fields 
         *         that were set in the Builder object.
         */
        public ParamSpecClass build() {
            return struct;
        }
        
        /**
         * the parent class
         * @param gTypeClass The value for the {@code gTypeClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGTypeClass(org.gtk.gobject.TypeClass gTypeClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("g_type_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gTypeClass == null ? MemoryAddress.NULL : gTypeClass.handle()));
                return this;
            }
        }
        
        /**
         * the {@link Value} type for this parameter
         * @param valueType The value for the {@code valueType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValueType(org.gtk.glib.Type valueType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("value_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (valueType == null ? MemoryAddress.NULL : valueType.getValue().longValue()));
                return this;
            }
        }
        
        public Builder setFinalize(FinalizeCallback finalize) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("finalize"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (finalize == null ? MemoryAddress.NULL : finalize.toCallback()));
                return this;
            }
        }
        
        public Builder setValueSetDefault(ValueSetDefaultCallback valueSetDefault) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("value_set_default"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (valueSetDefault == null ? MemoryAddress.NULL : valueSetDefault.toCallback()));
                return this;
            }
        }
        
        public Builder setValueValidate(ValueValidateCallback valueValidate) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("value_validate"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (valueValidate == null ? MemoryAddress.NULL : valueValidate.toCallback()));
                return this;
            }
        }
        
        public Builder setValuesCmp(ValuesCmpCallback valuesCmp) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("values_cmp"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (valuesCmp == null ? MemoryAddress.NULL : valuesCmp.toCallback()));
                return this;
            }
        }
        
        public Builder setValueIsValid(ValueIsValidCallback valueIsValid) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("value_is_valid"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (valueIsValid == null ? MemoryAddress.NULL : valueIsValid.toCallback()));
                return this;
            }
        }
        
        public Builder setDummy(java.lang.foreign.MemoryAddress[] dummy) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("dummy"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dummy == null ? MemoryAddress.NULL : Interop.allocateNativeArray(dummy, false, SCOPE)));
                return this;
            }
        }
    }
}
