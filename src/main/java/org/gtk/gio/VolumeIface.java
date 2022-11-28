package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Interface for implementing operations for mountable volumes.
 */
public class VolumeIface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GVolumeIface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("changed"),
        Interop.valueLayout.ADDRESS.withName("removed"),
        Interop.valueLayout.ADDRESS.withName("get_name"),
        Interop.valueLayout.ADDRESS.withName("get_icon"),
        Interop.valueLayout.ADDRESS.withName("get_uuid"),
        Interop.valueLayout.ADDRESS.withName("get_drive"),
        Interop.valueLayout.ADDRESS.withName("get_mount"),
        Interop.valueLayout.ADDRESS.withName("can_mount"),
        Interop.valueLayout.ADDRESS.withName("can_eject"),
        Interop.valueLayout.ADDRESS.withName("mount_fn"),
        Interop.valueLayout.ADDRESS.withName("mount_finish"),
        Interop.valueLayout.ADDRESS.withName("eject"),
        Interop.valueLayout.ADDRESS.withName("eject_finish"),
        Interop.valueLayout.ADDRESS.withName("get_identifier"),
        Interop.valueLayout.ADDRESS.withName("enumerate_identifiers"),
        Interop.valueLayout.ADDRESS.withName("should_automount"),
        Interop.valueLayout.ADDRESS.withName("get_activation_root"),
        Interop.valueLayout.ADDRESS.withName("eject_with_operation"),
        Interop.valueLayout.ADDRESS.withName("eject_with_operation_finish"),
        Interop.valueLayout.ADDRESS.withName("get_sort_key"),
        Interop.valueLayout.ADDRESS.withName("get_symbolic_icon")
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
     * Allocate a new {@link VolumeIface}
     * @return A new, uninitialized @{link VolumeIface}
     */
    public static VolumeIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VolumeIface newInstance = new VolumeIface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface gIface$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return new org.gtk.gobject.TypeInterface(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a VolumeIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VolumeIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VolumeIface struct;
        
         /**
         * A {@link VolumeIface.Build} object constructs a {@link VolumeIface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VolumeIface.allocate();
        }
        
         /**
         * Finish building the {@link VolumeIface} struct.
         * @return A new instance of {@code VolumeIface} with the fields 
         *         that were set in the Build object.
         */
        public VolumeIface construct() {
            return struct;
        }
        
        /**
         * The parent interface.
         * @param gIface The value for the {@code gIface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGIface(org.gtk.gobject.TypeInterface gIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Build setChanged(java.lang.foreign.MemoryAddress changed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (changed == null ? MemoryAddress.NULL : changed));
            return this;
        }
        
        public Build setRemoved(java.lang.foreign.MemoryAddress removed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (removed == null ? MemoryAddress.NULL : removed));
            return this;
        }
        
        public Build setGetName(java.lang.foreign.MemoryAddress getName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getName == null ? MemoryAddress.NULL : getName));
            return this;
        }
        
        public Build setGetIcon(java.lang.foreign.MemoryAddress getIcon) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_icon"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getIcon == null ? MemoryAddress.NULL : getIcon));
            return this;
        }
        
        public Build setGetUuid(java.lang.foreign.MemoryAddress getUuid) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_uuid"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getUuid == null ? MemoryAddress.NULL : getUuid));
            return this;
        }
        
        public Build setGetDrive(java.lang.foreign.MemoryAddress getDrive) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_drive"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDrive == null ? MemoryAddress.NULL : getDrive));
            return this;
        }
        
        public Build setGetMount(java.lang.foreign.MemoryAddress getMount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_mount"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getMount == null ? MemoryAddress.NULL : getMount));
            return this;
        }
        
        public Build setCanMount(java.lang.foreign.MemoryAddress canMount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_mount"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canMount == null ? MemoryAddress.NULL : canMount));
            return this;
        }
        
        public Build setCanEject(java.lang.foreign.MemoryAddress canEject) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_eject"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canEject == null ? MemoryAddress.NULL : canEject));
            return this;
        }
        
        public Build setMountFn(java.lang.foreign.MemoryAddress mountFn) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_fn"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mountFn == null ? MemoryAddress.NULL : mountFn));
            return this;
        }
        
        public Build setMountFinish(java.lang.foreign.MemoryAddress mountFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mountFinish == null ? MemoryAddress.NULL : mountFinish));
            return this;
        }
        
        public Build setEject(java.lang.foreign.MemoryAddress eject) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (eject == null ? MemoryAddress.NULL : eject));
            return this;
        }
        
        public Build setEjectFinish(java.lang.foreign.MemoryAddress ejectFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ejectFinish == null ? MemoryAddress.NULL : ejectFinish));
            return this;
        }
        
        public Build setGetIdentifier(java.lang.foreign.MemoryAddress getIdentifier) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_identifier"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getIdentifier == null ? MemoryAddress.NULL : getIdentifier));
            return this;
        }
        
        public Build setEnumerateIdentifiers(java.lang.foreign.MemoryAddress enumerateIdentifiers) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enumerate_identifiers"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (enumerateIdentifiers == null ? MemoryAddress.NULL : enumerateIdentifiers));
            return this;
        }
        
        public Build setShouldAutomount(java.lang.foreign.MemoryAddress shouldAutomount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("should_automount"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (shouldAutomount == null ? MemoryAddress.NULL : shouldAutomount));
            return this;
        }
        
        public Build setGetActivationRoot(java.lang.foreign.MemoryAddress getActivationRoot) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_activation_root"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getActivationRoot == null ? MemoryAddress.NULL : getActivationRoot));
            return this;
        }
        
        public Build setEjectWithOperation(java.lang.foreign.MemoryAddress ejectWithOperation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject_with_operation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ejectWithOperation == null ? MemoryAddress.NULL : ejectWithOperation));
            return this;
        }
        
        public Build setEjectWithOperationFinish(java.lang.foreign.MemoryAddress ejectWithOperationFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject_with_operation_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ejectWithOperationFinish == null ? MemoryAddress.NULL : ejectWithOperationFinish));
            return this;
        }
        
        public Build setGetSortKey(java.lang.foreign.MemoryAddress getSortKey) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_sort_key"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSortKey == null ? MemoryAddress.NULL : getSortKey));
            return this;
        }
        
        public Build setGetSymbolicIcon(java.lang.foreign.MemoryAddress getSymbolicIcon) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_symbolic_icon"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSymbolicIcon == null ? MemoryAddress.NULL : getSymbolicIcon));
            return this;
        }
    }
}
