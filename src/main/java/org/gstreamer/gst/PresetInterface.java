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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
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
    public org.gtk.gobject.TypeInterface parent$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent"));
        return new org.gtk.gobject.TypeInterface(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a PresetInterface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PresetInterface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private PresetInterface struct;
        
         /**
         * A {@link PresetInterface.Build} object constructs a {@link PresetInterface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = PresetInterface.allocate();
        }
        
         /**
         * Finish building the {@link PresetInterface} struct.
         * @return A new instance of {@code PresetInterface} with the fields 
         *         that were set in the Build object.
         */
        public PresetInterface construct() {
            return struct;
        }
        
        /**
         * parent interface type.
         * @param parent The value for the {@code parent} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParent(org.gtk.gobject.TypeInterface parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent == null ? MemoryAddress.NULL : parent.handle()));
            return this;
        }
        
        public Build setGetPresetNames(java.lang.foreign.MemoryAddress getPresetNames) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_preset_names"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPresetNames == null ? MemoryAddress.NULL : getPresetNames));
            return this;
        }
        
        public Build setGetPropertyNames(java.lang.foreign.MemoryAddress getPropertyNames) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_property_names"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPropertyNames == null ? MemoryAddress.NULL : getPropertyNames));
            return this;
        }
        
        public Build setLoadPreset(java.lang.foreign.MemoryAddress loadPreset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("load_preset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (loadPreset == null ? MemoryAddress.NULL : loadPreset));
            return this;
        }
        
        public Build setSavePreset(java.lang.foreign.MemoryAddress savePreset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("save_preset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (savePreset == null ? MemoryAddress.NULL : savePreset));
            return this;
        }
        
        public Build setRenamePreset(java.lang.foreign.MemoryAddress renamePreset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("rename_preset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (renamePreset == null ? MemoryAddress.NULL : renamePreset));
            return this;
        }
        
        public Build setDeletePreset(java.lang.foreign.MemoryAddress deletePreset) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delete_preset"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deletePreset == null ? MemoryAddress.NULL : deletePreset));
            return this;
        }
        
        public Build setSetMeta(java.lang.foreign.MemoryAddress setMeta) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_meta"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setMeta == null ? MemoryAddress.NULL : setMeta));
            return this;
        }
        
        public Build setGetMeta(java.lang.foreign.MemoryAddress getMeta) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_meta"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getMeta == null ? MemoryAddress.NULL : getMeta));
            return this;
        }
        
        public Build setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
