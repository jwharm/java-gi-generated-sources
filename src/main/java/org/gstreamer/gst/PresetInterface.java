package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * {@link Preset} interface.
 */
public class PresetInterface extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPresetInterface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("parent"),
            Interop.valueLayout.ADDRESS.withName("get_preset_names"),
            Interop.valueLayout.ADDRESS.withName("get_property_names"),
            Interop.valueLayout.ADDRESS.withName("load_preset"),
            Interop.valueLayout.ADDRESS.withName("save_preset"),
            Interop.valueLayout.ADDRESS.withName("rename_preset"),
            Interop.valueLayout.ADDRESS.withName("delete_preset"),
            Interop.valueLayout.ADDRESS.withName("set_meta"),
            Interop.valueLayout.ADDRESS.withName("get_meta"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PresetInterface}
     * @return A new, uninitialized @{link PresetInterface}
     */
    public static PresetInterface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        PresetInterface newInstance = new PresetInterface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gtk.gobject.TypeInterface getParent() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent}
     * @param parent The new value of the field {@code parent}
     */
    public void setParent(org.gtk.gobject.TypeInterface parent) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetPresetNamesCallback} callback.
     */
    @FunctionalInterface
    public interface GetPresetNamesCallback {
    
        java.lang.String[] run(org.gstreamer.gst.Preset preset);
        
        @ApiStatus.Internal default void upcall(MemoryAddress preset) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gstreamer.gst.Preset) Interop.register(preset, org.gstreamer.gst.Preset.fromAddress).marshal(preset, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetPresetNamesCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_preset_names}
     * @param getPresetNames The new value of the field {@code get_preset_names}
     */
    public void setGetPresetNames(GetPresetNamesCallback getPresetNames) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preset_names"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPresetNames == null ? MemoryAddress.NULL : getPresetNames.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetPropertyNamesCallback} callback.
     */
    @FunctionalInterface
    public interface GetPropertyNamesCallback {
    
        java.lang.String[] run(org.gstreamer.gst.Preset preset);
        
        @ApiStatus.Internal default void upcall(MemoryAddress preset) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gstreamer.gst.Preset) Interop.register(preset, org.gstreamer.gst.Preset.fromAddress).marshal(preset, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetPropertyNamesCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_property_names}
     * @param getPropertyNames The new value of the field {@code get_property_names}
     */
    public void setGetPropertyNames(GetPropertyNamesCallback getPropertyNames) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_property_names"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPropertyNames == null ? MemoryAddress.NULL : getPropertyNames.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LoadPresetCallback} callback.
     */
    @FunctionalInterface
    public interface LoadPresetCallback {
    
        boolean run(org.gstreamer.gst.Preset preset, java.lang.String name);
        
        @ApiStatus.Internal default int upcall(MemoryAddress preset, MemoryAddress name) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gstreamer.gst.Preset) Interop.register(preset, org.gstreamer.gst.Preset.fromAddress).marshal(preset, null), Marshal.addressToString.marshal(name, null));
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LoadPresetCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code load_preset}
     * @param loadPreset The new value of the field {@code load_preset}
     */
    public void setLoadPreset(LoadPresetCallback loadPreset) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("load_preset"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (loadPreset == null ? MemoryAddress.NULL : loadPreset.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SavePresetCallback} callback.
     */
    @FunctionalInterface
    public interface SavePresetCallback {
    
        boolean run(org.gstreamer.gst.Preset preset, java.lang.String name);
        
        @ApiStatus.Internal default int upcall(MemoryAddress preset, MemoryAddress name) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gstreamer.gst.Preset) Interop.register(preset, org.gstreamer.gst.Preset.fromAddress).marshal(preset, null), Marshal.addressToString.marshal(name, null));
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SavePresetCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code save_preset}
     * @param savePreset The new value of the field {@code save_preset}
     */
    public void setSavePreset(SavePresetCallback savePreset) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("save_preset"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (savePreset == null ? MemoryAddress.NULL : savePreset.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RenamePresetCallback} callback.
     */
    @FunctionalInterface
    public interface RenamePresetCallback {
    
        boolean run(org.gstreamer.gst.Preset preset, java.lang.String oldName, java.lang.String newName);
        
        @ApiStatus.Internal default int upcall(MemoryAddress preset, MemoryAddress oldName, MemoryAddress newName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gstreamer.gst.Preset) Interop.register(preset, org.gstreamer.gst.Preset.fromAddress).marshal(preset, null), Marshal.addressToString.marshal(oldName, null), Marshal.addressToString.marshal(newName, null));
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RenamePresetCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code rename_preset}
     * @param renamePreset The new value of the field {@code rename_preset}
     */
    public void setRenamePreset(RenamePresetCallback renamePreset) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("rename_preset"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (renamePreset == null ? MemoryAddress.NULL : renamePreset.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DeletePresetCallback} callback.
     */
    @FunctionalInterface
    public interface DeletePresetCallback {
    
        boolean run(org.gstreamer.gst.Preset preset, java.lang.String name);
        
        @ApiStatus.Internal default int upcall(MemoryAddress preset, MemoryAddress name) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gstreamer.gst.Preset) Interop.register(preset, org.gstreamer.gst.Preset.fromAddress).marshal(preset, null), Marshal.addressToString.marshal(name, null));
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DeletePresetCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code delete_preset}
     * @param deletePreset The new value of the field {@code delete_preset}
     */
    public void setDeletePreset(DeletePresetCallback deletePreset) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delete_preset"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (deletePreset == null ? MemoryAddress.NULL : deletePreset.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetMetaCallback} callback.
     */
    @FunctionalInterface
    public interface SetMetaCallback {
    
        boolean run(org.gstreamer.gst.Preset preset, java.lang.String name, java.lang.String tag, @Nullable java.lang.String value);
        
        @ApiStatus.Internal default int upcall(MemoryAddress preset, MemoryAddress name, MemoryAddress tag, MemoryAddress value) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gstreamer.gst.Preset) Interop.register(preset, org.gstreamer.gst.Preset.fromAddress).marshal(preset, null), Marshal.addressToString.marshal(name, null), Marshal.addressToString.marshal(tag, null), Marshal.addressToString.marshal(value, null));
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetMetaCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_meta}
     * @param setMeta The new value of the field {@code set_meta}
     */
    public void setSetMeta(SetMetaCallback setMeta) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_meta"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setMeta == null ? MemoryAddress.NULL : setMeta.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetMetaCallback} callback.
     */
    @FunctionalInterface
    public interface GetMetaCallback {
    
        boolean run(org.gstreamer.gst.Preset preset, java.lang.String name, java.lang.String tag, Out<java.lang.String> value);
        
        @ApiStatus.Internal default int upcall(MemoryAddress preset, MemoryAddress name, MemoryAddress tag, MemoryAddress value) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                Out<java.lang.String> valueOUT = new Out<>(Marshal.addressToString.marshal(value, null));
                var RESULT = run((org.gstreamer.gst.Preset) Interop.register(preset, org.gstreamer.gst.Preset.fromAddress).marshal(preset, null), Marshal.addressToString.marshal(name, null), Marshal.addressToString.marshal(tag, null), valueOUT);
                value.set(Interop.valueLayout.ADDRESS, 0, Marshal.stringToAddress.marshal(valueOUT.get(), SCOPE));
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetMetaCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_meta}
     * @param getMeta The new value of the field {@code get_meta}
     */
    public void setGetMeta(GetMetaCallback getMeta) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_meta"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getMeta == null ? MemoryAddress.NULL : getMeta.toCallback()));
        }
    }
    
    /**
     * Create a PresetInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected PresetInterface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, PresetInterface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new PresetInterface(input);
    
    /**
     * A {@link PresetInterface.Builder} object constructs a {@link PresetInterface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link PresetInterface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final PresetInterface struct;
        
        private Builder() {
            struct = PresetInterface.allocate();
        }
        
        /**
         * Finish building the {@link PresetInterface} struct.
         * @return A new instance of {@code PresetInterface} with the fields 
         *         that were set in the Builder object.
         */
        public PresetInterface build() {
            return struct;
        }
        
        /**
         * parent interface type.
         * @param parent The value for the {@code parent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParent(org.gtk.gobject.TypeInterface parent) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
                return this;
            }
        }
        
        public Builder setGetPresetNames(GetPresetNamesCallback getPresetNames) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_preset_names"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPresetNames == null ? MemoryAddress.NULL : getPresetNames.toCallback()));
                return this;
            }
        }
        
        public Builder setGetPropertyNames(GetPropertyNamesCallback getPropertyNames) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_property_names"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getPropertyNames == null ? MemoryAddress.NULL : getPropertyNames.toCallback()));
                return this;
            }
        }
        
        public Builder setLoadPreset(LoadPresetCallback loadPreset) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("load_preset"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (loadPreset == null ? MemoryAddress.NULL : loadPreset.toCallback()));
                return this;
            }
        }
        
        public Builder setSavePreset(SavePresetCallback savePreset) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("save_preset"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (savePreset == null ? MemoryAddress.NULL : savePreset.toCallback()));
                return this;
            }
        }
        
        public Builder setRenamePreset(RenamePresetCallback renamePreset) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("rename_preset"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (renamePreset == null ? MemoryAddress.NULL : renamePreset.toCallback()));
                return this;
            }
        }
        
        public Builder setDeletePreset(DeletePresetCallback deletePreset) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("delete_preset"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (deletePreset == null ? MemoryAddress.NULL : deletePreset.toCallback()));
                return this;
            }
        }
        
        public Builder setSetMeta(SetMetaCallback setMeta) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_meta"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setMeta == null ? MemoryAddress.NULL : setMeta.toCallback()));
                return this;
            }
        }
        
        public Builder setGetMeta(GetMetaCallback getMeta) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_meta"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getMeta == null ? MemoryAddress.NULL : getMeta.toCallback()));
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
