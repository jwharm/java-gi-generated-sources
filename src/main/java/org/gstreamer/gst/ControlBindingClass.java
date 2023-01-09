package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The class structure of {@link ControlBinding}.
 */
public class ControlBindingClass extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstControlBindingClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("sync_values"),
            Interop.valueLayout.ADDRESS.withName("get_value"),
            Interop.valueLayout.ADDRESS.withName("get_value_array"),
            Interop.valueLayout.ADDRESS.withName("get_g_value_array"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link ControlBindingClass}
     * @return A new, uninitialized @{link ControlBindingClass}
     */
    public static ControlBindingClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        ControlBindingClass newInstance = new ControlBindingClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.gst.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SyncValuesCallback} callback.
     */
    @FunctionalInterface
    public interface SyncValuesCallback {
    
        boolean run(org.gstreamer.gst.ControlBinding binding, org.gstreamer.gst.GstObject object, org.gstreamer.gst.ClockTime timestamp, org.gstreamer.gst.ClockTime lastSync);
        
        @ApiStatus.Internal default int upcall(MemoryAddress binding, MemoryAddress object, long timestamp, long lastSync) {
            var RESULT = run((org.gstreamer.gst.ControlBinding) Interop.register(binding, org.gstreamer.gst.ControlBinding.fromAddress).marshal(binding, null), (org.gstreamer.gst.GstObject) Interop.register(object, org.gstreamer.gst.GstObject.fromAddress).marshal(object, null), new org.gstreamer.gst.ClockTime(timestamp), new org.gstreamer.gst.ClockTime(lastSync));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SyncValuesCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code sync_values}
     * @param syncValues The new value of the field {@code sync_values}
     */
    public void setSyncValues(SyncValuesCallback syncValues) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sync_values"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (syncValues == null ? MemoryAddress.NULL : syncValues.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetValueCallback} callback.
     */
    @FunctionalInterface
    public interface GetValueCallback {
    
        @Nullable org.gtk.gobject.Value run(org.gstreamer.gst.ControlBinding binding, org.gstreamer.gst.ClockTime timestamp);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress binding, long timestamp) {
            var RESULT = run((org.gstreamer.gst.ControlBinding) Interop.register(binding, org.gstreamer.gst.ControlBinding.fromAddress).marshal(binding, null), new org.gstreamer.gst.ClockTime(timestamp));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetValueCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_value}
     * @param getValue The new value of the field {@code get_value}
     */
    public void setGetValue(GetValueCallback getValue) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_value"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getValue == null ? MemoryAddress.NULL : getValue.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetValueArrayCallback} callback.
     */
    @FunctionalInterface
    public interface GetValueArrayCallback {
    
        boolean run(org.gstreamer.gst.ControlBinding binding, org.gstreamer.gst.ClockTime timestamp, org.gstreamer.gst.ClockTime interval, int nValues, java.lang.foreign.MemoryAddress[] values);
        
        @ApiStatus.Internal default int upcall(MemoryAddress binding, long timestamp, long interval, int nValues, MemoryAddress values) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gstreamer.gst.ControlBinding) Interop.register(binding, org.gstreamer.gst.ControlBinding.fromAddress).marshal(binding, null), new org.gstreamer.gst.ClockTime(timestamp), new org.gstreamer.gst.ClockTime(interval), nValues, Interop.getAddressArrayFrom(values, nValues));
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetValueArrayCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_value_array}
     * @param getValueArray The new value of the field {@code get_value_array}
     */
    public void setGetValueArray(GetValueArrayCallback getValueArray) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_value_array"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getValueArray == null ? MemoryAddress.NULL : getValueArray.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetGValueArrayCallback} callback.
     */
    @FunctionalInterface
    public interface GetGValueArrayCallback {
    
        boolean run(org.gstreamer.gst.ControlBinding binding, org.gstreamer.gst.ClockTime timestamp, org.gstreamer.gst.ClockTime interval, int nValues, org.gtk.gobject.Value[] values);
        
        @ApiStatus.Internal default int upcall(MemoryAddress binding, long timestamp, long interval, int nValues, MemoryAddress values) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gstreamer.gst.ControlBinding) Interop.register(binding, org.gstreamer.gst.ControlBinding.fromAddress).marshal(binding, null), new org.gstreamer.gst.ClockTime(timestamp), new org.gstreamer.gst.ClockTime(interval), nValues, new PointerProxy<org.gtk.gobject.Value>(values, org.gtk.gobject.Value.fromAddress).toArray((int) nValues, org.gtk.gobject.Value.class));
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_LONG, Interop.valueLayout.C_LONG, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetGValueArrayCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_g_value_array}
     * @param getGValueArray The new value of the field {@code get_g_value_array}
     */
    public void setGetGValueArray(GetGValueArrayCallback getGValueArray) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_g_value_array"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getGValueArray == null ? MemoryAddress.NULL : getGValueArray.toCallback()));
        }
    }
    
    /**
     * Create a ControlBindingClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected ControlBindingClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, ControlBindingClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new ControlBindingClass(input);
    
    /**
     * A {@link ControlBindingClass.Builder} object constructs a {@link ControlBindingClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link ControlBindingClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final ControlBindingClass struct;
        
        private Builder() {
            struct = ControlBindingClass.allocate();
        }
        
        /**
         * Finish building the {@link ControlBindingClass} struct.
         * @return A new instance of {@code ControlBindingClass} with the fields 
         *         that were set in the Builder object.
         */
        public ControlBindingClass build() {
            return struct;
        }
        
        /**
         * Parent class
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setSyncValues(SyncValuesCallback syncValues) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("sync_values"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (syncValues == null ? MemoryAddress.NULL : syncValues.toCallback()));
                return this;
            }
        }
        
        public Builder setGetValue(GetValueCallback getValue) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_value"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getValue == null ? MemoryAddress.NULL : getValue.toCallback()));
                return this;
            }
        }
        
        public Builder setGetValueArray(GetValueArrayCallback getValueArray) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_value_array"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getValueArray == null ? MemoryAddress.NULL : getValueArray.toCallback()));
                return this;
            }
        }
        
        public Builder setGetGValueArray(GetGValueArrayCallback getGValueArray) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_g_value_array"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getGValueArray == null ? MemoryAddress.NULL : getGValueArray.toCallback()));
                return this;
            }
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false, SCOPE)));
                return this;
            }
        }
    }
}
