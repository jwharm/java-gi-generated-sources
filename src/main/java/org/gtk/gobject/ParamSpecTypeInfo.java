package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This structure is used to provide the type system with the information
 * required to initialize and destruct (finalize) a parameter's class and
 * instances thereof.
 * <p>
 * The initialized structure is passed to the g_param_type_register_static()
 * The type system will perform a deep copy of this structure, so its memory
 * does not need to be persistent across invocation of
 * g_param_type_register_static().
 */
public class ParamSpecTypeInfo extends Struct {
    
    static {
        GObjects.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GParamSpecTypeInfo";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_SHORT.withName("instance_size"),
            Interop.valueLayout.C_SHORT.withName("n_preallocs"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("instance_init"),
            Interop.valueLayout.C_LONG.withName("value_type"),
            Interop.valueLayout.ADDRESS.withName("finalize"),
            Interop.valueLayout.ADDRESS.withName("value_set_default"),
            Interop.valueLayout.ADDRESS.withName("value_validate"),
            Interop.valueLayout.ADDRESS.withName("values_cmp")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ParamSpecTypeInfo}
     * @return A new, uninitialized @{link ParamSpecTypeInfo}
     */
    public static ParamSpecTypeInfo allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        ParamSpecTypeInfo newInstance = new ParamSpecTypeInfo(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code instance_size}
     * @return The value of the field {@code instance_size}
     */
    public short getInstanceSize() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("instance_size"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code instance_size}
     * @param instanceSize The new value of the field {@code instance_size}
     */
    public void setInstanceSize(short instanceSize) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("instance_size"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), instanceSize);
    }
    
    /**
     * Get the value of the field {@code n_preallocs}
     * @return The value of the field {@code n_preallocs}
     */
    public short getNPreallocs() {
        var RESULT = (short) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_preallocs"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code n_preallocs}
     * @param nPreallocs The new value of the field {@code n_preallocs}
     */
    public void setNPreallocs(short nPreallocs) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("n_preallocs"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), nPreallocs);
    }
    
    @FunctionalInterface
    public interface InstanceInitCallback {
        void run(org.gtk.gobject.ParamSpec pspec);

        @ApiStatus.Internal default void upcall(MemoryAddress pspec) {
            run((org.gtk.gobject.ParamSpec) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pspec)), org.gtk.gobject.ParamSpec.fromAddress).marshal(pspec, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(InstanceInitCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code instance_init}
     * @param instanceInit The new value of the field {@code instance_init}
     */
    public void setInstanceInit(InstanceInitCallback instanceInit) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("instance_init"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (instanceInit == null ? MemoryAddress.NULL : instanceInit.toCallback()));
    }
    
    /**
     * Get the value of the field {@code value_type}
     * @return The value of the field {@code value_type}
     */
    public org.gtk.glib.Type getValueType() {
        var RESULT = (long) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value_type"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * Change the value of the field {@code value_type}
     * @param valueType The new value of the field {@code value_type}
     */
    public void setValueType(org.gtk.glib.Type valueType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valueType == null ? MemoryAddress.NULL : valueType.getValue().longValue()));
    }
    
    @FunctionalInterface
    public interface FinalizeCallback {
        void run(org.gtk.gobject.ParamSpec pspec);

        @ApiStatus.Internal default void upcall(MemoryAddress pspec) {
            run((org.gtk.gobject.ParamSpec) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pspec)), org.gtk.gobject.ParamSpec.fromAddress).marshal(pspec, Ownership.NONE));
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
    public interface ValueSetDefaultCallback {
        void run(org.gtk.gobject.ParamSpec pspec, org.gtk.gobject.Value value);

        @ApiStatus.Internal default void upcall(MemoryAddress pspec, MemoryAddress value) {
            run((org.gtk.gobject.ParamSpec) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pspec)), org.gtk.gobject.ParamSpec.fromAddress).marshal(pspec, Ownership.NONE), org.gtk.gobject.Value.fromAddress.marshal(value, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ValueSetDefaultCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code value_set_default}
     * @param valueSetDefault The new value of the field {@code value_set_default}
     */
    public void setValueSetDefault(ValueSetDefaultCallback valueSetDefault) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value_set_default"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valueSetDefault == null ? MemoryAddress.NULL : valueSetDefault.toCallback()));
    }
    
    @FunctionalInterface
    public interface ValueValidateCallback {
        boolean run(org.gtk.gobject.ParamSpec pspec, org.gtk.gobject.Value value);

        @ApiStatus.Internal default int upcall(MemoryAddress pspec, MemoryAddress value) {
            var RESULT = run((org.gtk.gobject.ParamSpec) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pspec)), org.gtk.gobject.ParamSpec.fromAddress).marshal(pspec, Ownership.NONE), org.gtk.gobject.Value.fromAddress.marshal(value, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ValueValidateCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code value_validate}
     * @param valueValidate The new value of the field {@code value_validate}
     */
    public void setValueValidate(ValueValidateCallback valueValidate) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("value_validate"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valueValidate == null ? MemoryAddress.NULL : valueValidate.toCallback()));
    }
    
    @FunctionalInterface
    public interface ValuesCmpCallback {
        int run(org.gtk.gobject.ParamSpec pspec, org.gtk.gobject.Value value1, org.gtk.gobject.Value value2);

        @ApiStatus.Internal default int upcall(MemoryAddress pspec, MemoryAddress value1, MemoryAddress value2) {
            var RESULT = run((org.gtk.gobject.ParamSpec) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pspec)), org.gtk.gobject.ParamSpec.fromAddress).marshal(pspec, Ownership.NONE), org.gtk.gobject.Value.fromAddress.marshal(value1, Ownership.NONE), org.gtk.gobject.Value.fromAddress.marshal(value2, Ownership.NONE));
            return RESULT;
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ValuesCmpCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code values_cmp}
     * @param valuesCmp The new value of the field {@code values_cmp}
     */
    public void setValuesCmp(ValuesCmpCallback valuesCmp) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("values_cmp"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valuesCmp == null ? MemoryAddress.NULL : valuesCmp.toCallback()));
    }
    
    /**
     * Create a ParamSpecTypeInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected ParamSpecTypeInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, ParamSpecTypeInfo> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new ParamSpecTypeInfo(input, ownership);
    
    /**
     * A {@link ParamSpecTypeInfo.Builder} object constructs a {@link ParamSpecTypeInfo} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ParamSpecTypeInfo.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ParamSpecTypeInfo struct;
        
        private Builder() {
            struct = ParamSpecTypeInfo.allocate();
        }
        
         /**
         * Finish building the {@link ParamSpecTypeInfo} struct.
         * @return A new instance of {@code ParamSpecTypeInfo} with the fields 
         *         that were set in the Builder object.
         */
        public ParamSpecTypeInfo build() {
            return struct;
        }
        
        /**
         * Size of the instance (object) structure.
         * @param instanceSize The value for the {@code instanceSize} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInstanceSize(short instanceSize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("instance_size"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), instanceSize);
            return this;
        }
        
        /**
         * Prior to GLib 2.10, it specified the number of pre-allocated (cached) instances to reserve memory for (0 indicates no caching). Since GLib 2.10, it is ignored, since instances are allocated with the [slice allocator][glib-Memory-Slices] now.
         * @param nPreallocs The value for the {@code nPreallocs} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNPreallocs(short nPreallocs) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("n_preallocs"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), nPreallocs);
            return this;
        }
        
        public Builder setInstanceInit(InstanceInitCallback instanceInit) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("instance_init"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (instanceInit == null ? MemoryAddress.NULL : instanceInit.toCallback()));
            return this;
        }
        
        /**
         * The {@link org.gtk.glib.Type} of values conforming to this {@link ParamSpec}
         * @param valueType The value for the {@code valueType} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setValueType(org.gtk.glib.Type valueType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valueType == null ? MemoryAddress.NULL : valueType.getValue().longValue()));
            return this;
        }
        
        public Builder setFinalize(FinalizeCallback finalize) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("finalize"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (finalize == null ? MemoryAddress.NULL : finalize.toCallback()));
            return this;
        }
        
        public Builder setValueSetDefault(ValueSetDefaultCallback valueSetDefault) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_set_default"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valueSetDefault == null ? MemoryAddress.NULL : valueSetDefault.toCallback()));
            return this;
        }
        
        public Builder setValueValidate(ValueValidateCallback valueValidate) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("value_validate"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valueValidate == null ? MemoryAddress.NULL : valueValidate.toCallback()));
            return this;
        }
        
        public Builder setValuesCmp(ValuesCmpCallback valuesCmp) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("values_cmp"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (valuesCmp == null ? MemoryAddress.NULL : valuesCmp.toCallback()));
            return this;
        }
    }
}
