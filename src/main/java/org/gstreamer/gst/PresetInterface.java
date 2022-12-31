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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PresetInterface newInstance = new PresetInterface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent}
     * @return The value of the field {@code parent}
     */
    public org.gtk.gobject.TypeInterface getParent() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent}
     * @param parent The new value of the field {@code parent}
     */
    public void setParent(org.gtk.gobject.TypeInterface parent) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
    }
    
    @FunctionalInterface
    public interface GetPresetNamesCallback {
        java.lang.String[] run(org.gstreamer.gst.Preset preset);

        @ApiStatus.Internal default void upcall(MemoryAddress preset) {
            run((org.gstreamer.gst.Preset) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(preset)), org.gstreamer.gst.Preset.fromAddress).marshal(preset, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetPresetNamesCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_preset_names}
     * @param getPresetNames The new value of the field {@code get_preset_names}
     */
    public void setGetPresetNames(GetPresetNamesCallback getPresetNames) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_preset_names"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPresetNames == null ? MemoryAddress.NULL : getPresetNames.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetPropertyNamesCallback {
        java.lang.String[] run(org.gstreamer.gst.Preset preset);

        @ApiStatus.Internal default void upcall(MemoryAddress preset) {
            run((org.gstreamer.gst.Preset) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(preset)), org.gstreamer.gst.Preset.fromAddress).marshal(preset, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetPropertyNamesCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_property_names}
     * @param getPropertyNames The new value of the field {@code get_property_names}
     */
    public void setGetPropertyNames(GetPropertyNamesCallback getPropertyNames) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_property_names"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPropertyNames == null ? MemoryAddress.NULL : getPropertyNames.toCallback()));
    }
    
    @FunctionalInterface
    public interface LoadPresetCallback {
        boolean run(org.gstreamer.gst.Preset preset, java.lang.String name);

        @ApiStatus.Internal default int upcall(MemoryAddress preset, MemoryAddress name) {
            var RESULT = run((org.gstreamer.gst.Preset) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(preset)), org.gstreamer.gst.Preset.fromAddress).marshal(preset, Ownership.NONE), Marshal.addressToString.marshal(name, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LoadPresetCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code load_preset}
     * @param loadPreset The new value of the field {@code load_preset}
     */
    public void setLoadPreset(LoadPresetCallback loadPreset) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("load_preset"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (loadPreset == null ? MemoryAddress.NULL : loadPreset.toCallback()));
    }
    
    @FunctionalInterface
    public interface SavePresetCallback {
        boolean run(org.gstreamer.gst.Preset preset, java.lang.String name);

        @ApiStatus.Internal default int upcall(MemoryAddress preset, MemoryAddress name) {
            var RESULT = run((org.gstreamer.gst.Preset) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(preset)), org.gstreamer.gst.Preset.fromAddress).marshal(preset, Ownership.NONE), Marshal.addressToString.marshal(name, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SavePresetCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code save_preset}
     * @param savePreset The new value of the field {@code save_preset}
     */
    public void setSavePreset(SavePresetCallback savePreset) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("save_preset"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (savePreset == null ? MemoryAddress.NULL : savePreset.toCallback()));
    }
    
    @FunctionalInterface
    public interface RenamePresetCallback {
        boolean run(org.gstreamer.gst.Preset preset, java.lang.String oldName, java.lang.String newName);

        @ApiStatus.Internal default int upcall(MemoryAddress preset, MemoryAddress oldName, MemoryAddress newName) {
            var RESULT = run((org.gstreamer.gst.Preset) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(preset)), org.gstreamer.gst.Preset.fromAddress).marshal(preset, Ownership.NONE), Marshal.addressToString.marshal(oldName, null), Marshal.addressToString.marshal(newName, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RenamePresetCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code rename_preset}
     * @param renamePreset The new value of the field {@code rename_preset}
     */
    public void setRenamePreset(RenamePresetCallback renamePreset) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("rename_preset"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (renamePreset == null ? MemoryAddress.NULL : renamePreset.toCallback()));
    }
    
    @FunctionalInterface
    public interface DeletePresetCallback {
        boolean run(org.gstreamer.gst.Preset preset, java.lang.String name);

        @ApiStatus.Internal default int upcall(MemoryAddress preset, MemoryAddress name) {
            var RESULT = run((org.gstreamer.gst.Preset) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(preset)), org.gstreamer.gst.Preset.fromAddress).marshal(preset, Ownership.NONE), Marshal.addressToString.marshal(name, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DeletePresetCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code delete_preset}
     * @param deletePreset The new value of the field {@code delete_preset}
     */
    public void setDeletePreset(DeletePresetCallback deletePreset) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("delete_preset"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deletePreset == null ? MemoryAddress.NULL : deletePreset.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetMetaCallback {
        boolean run(org.gstreamer.gst.Preset preset, java.lang.String name, java.lang.String tag, @Nullable java.lang.String value);

        @ApiStatus.Internal default int upcall(MemoryAddress preset, MemoryAddress name, MemoryAddress tag, MemoryAddress value) {
            var RESULT = run((org.gstreamer.gst.Preset) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(preset)), org.gstreamer.gst.Preset.fromAddress).marshal(preset, Ownership.NONE), Marshal.addressToString.marshal(name, null), Marshal.addressToString.marshal(tag, null), Marshal.addressToString.marshal(value, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetMetaCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_meta}
     * @param setMeta The new value of the field {@code set_meta}
     */
    public void setSetMeta(SetMetaCallback setMeta) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_meta"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setMeta == null ? MemoryAddress.NULL : setMeta.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetMetaCallback {
        boolean run(org.gstreamer.gst.Preset preset, java.lang.String name, java.lang.String tag, Out<java.lang.String> value);

        @ApiStatus.Internal default int upcall(MemoryAddress preset, MemoryAddress name, MemoryAddress tag, MemoryAddress value) {
            Out<java.lang.String> valueOUT = new Out<>(Marshal.addressToString.marshal(value, null));
            var RESULT = run((org.gstreamer.gst.Preset) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(preset)), org.gstreamer.gst.Preset.fromAddress).marshal(preset, Ownership.NONE), Marshal.addressToString.marshal(name, null), Marshal.addressToString.marshal(tag, null), valueOUT);
            value.set(Interop.valueLayout.ADDRESS, 0, Marshal.stringToAddress.marshal(valueOUT.get(), null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetMetaCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_meta}
     * @param getMeta The new value of the field {@code get_meta}
     */
    public void setGetMeta(GetMetaCallback getMeta) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_meta"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getMeta == null ? MemoryAddress.NULL : getMeta.toCallback()));
    }
    
    /**
     * Create a PresetInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PresetInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PresetInterface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PresetInterface(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            return this;
        }
        
        public Builder setGetPresetNames(GetPresetNamesCallback getPresetNames) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preset_names"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPresetNames == null ? MemoryAddress.NULL : getPresetNames.toCallback()));
            return this;
        }
        
        public Builder setGetPropertyNames(GetPropertyNamesCallback getPropertyNames) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_property_names"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPropertyNames == null ? MemoryAddress.NULL : getPropertyNames.toCallback()));
            return this;
        }
        
        public Builder setLoadPreset(LoadPresetCallback loadPreset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("load_preset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (loadPreset == null ? MemoryAddress.NULL : loadPreset.toCallback()));
            return this;
        }
        
        public Builder setSavePreset(SavePresetCallback savePreset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("save_preset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (savePreset == null ? MemoryAddress.NULL : savePreset.toCallback()));
            return this;
        }
        
        public Builder setRenamePreset(RenamePresetCallback renamePreset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("rename_preset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (renamePreset == null ? MemoryAddress.NULL : renamePreset.toCallback()));
            return this;
        }
        
        public Builder setDeletePreset(DeletePresetCallback deletePreset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delete_preset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deletePreset == null ? MemoryAddress.NULL : deletePreset.toCallback()));
            return this;
        }
        
        public Builder setSetMeta(SetMetaCallback setMeta) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_meta"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setMeta == null ? MemoryAddress.NULL : setMeta.toCallback()));
            return this;
        }
        
        public Builder setGetMeta(GetMetaCallback getMeta) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_meta"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getMeta == null ? MemoryAddress.NULL : getMeta.toCallback()));
            return this;
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
