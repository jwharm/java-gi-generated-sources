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
    public org.gtk.gobject.TypeInterface g_iface$get() {
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
         * @param g_iface The value for the {@code g_iface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGIface(org.gtk.gobject.TypeInterface g_iface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (g_iface == null ? MemoryAddress.NULL : g_iface.handle()));
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
        
        public Build setGetName(java.lang.foreign.MemoryAddress get_name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_name == null ? MemoryAddress.NULL : get_name));
            return this;
        }
        
        public Build setGetIcon(java.lang.foreign.MemoryAddress get_icon) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_icon"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_icon == null ? MemoryAddress.NULL : get_icon));
            return this;
        }
        
        public Build setGetUuid(java.lang.foreign.MemoryAddress get_uuid) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_uuid"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_uuid == null ? MemoryAddress.NULL : get_uuid));
            return this;
        }
        
        public Build setGetDrive(java.lang.foreign.MemoryAddress get_drive) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_drive"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_drive == null ? MemoryAddress.NULL : get_drive));
            return this;
        }
        
        public Build setGetMount(java.lang.foreign.MemoryAddress get_mount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_mount"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_mount == null ? MemoryAddress.NULL : get_mount));
            return this;
        }
        
        public Build setCanMount(java.lang.foreign.MemoryAddress can_mount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_mount"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (can_mount == null ? MemoryAddress.NULL : can_mount));
            return this;
        }
        
        public Build setCanEject(java.lang.foreign.MemoryAddress can_eject) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_eject"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (can_eject == null ? MemoryAddress.NULL : can_eject));
            return this;
        }
        
        public Build setMountFn(java.lang.foreign.MemoryAddress mount_fn) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_fn"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mount_fn == null ? MemoryAddress.NULL : mount_fn));
            return this;
        }
        
        public Build setMountFinish(java.lang.foreign.MemoryAddress mount_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mount_finish == null ? MemoryAddress.NULL : mount_finish));
            return this;
        }
        
        public Build setEject(java.lang.foreign.MemoryAddress eject) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (eject == null ? MemoryAddress.NULL : eject));
            return this;
        }
        
        public Build setEjectFinish(java.lang.foreign.MemoryAddress eject_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (eject_finish == null ? MemoryAddress.NULL : eject_finish));
            return this;
        }
        
        public Build setGetIdentifier(java.lang.foreign.MemoryAddress get_identifier) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_identifier"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_identifier == null ? MemoryAddress.NULL : get_identifier));
            return this;
        }
        
        public Build setEnumerateIdentifiers(java.lang.foreign.MemoryAddress enumerate_identifiers) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enumerate_identifiers"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (enumerate_identifiers == null ? MemoryAddress.NULL : enumerate_identifiers));
            return this;
        }
        
        public Build setShouldAutomount(java.lang.foreign.MemoryAddress should_automount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("should_automount"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (should_automount == null ? MemoryAddress.NULL : should_automount));
            return this;
        }
        
        public Build setGetActivationRoot(java.lang.foreign.MemoryAddress get_activation_root) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_activation_root"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_activation_root == null ? MemoryAddress.NULL : get_activation_root));
            return this;
        }
        
        public Build setEjectWithOperation(java.lang.foreign.MemoryAddress eject_with_operation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject_with_operation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (eject_with_operation == null ? MemoryAddress.NULL : eject_with_operation));
            return this;
        }
        
        public Build setEjectWithOperationFinish(java.lang.foreign.MemoryAddress eject_with_operation_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject_with_operation_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (eject_with_operation_finish == null ? MemoryAddress.NULL : eject_with_operation_finish));
            return this;
        }
        
        public Build setGetSortKey(java.lang.foreign.MemoryAddress get_sort_key) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_sort_key"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_sort_key == null ? MemoryAddress.NULL : get_sort_key));
            return this;
        }
        
        public Build setGetSymbolicIcon(java.lang.foreign.MemoryAddress get_symbolic_icon) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_symbolic_icon"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_symbolic_icon == null ? MemoryAddress.NULL : get_symbolic_icon));
            return this;
        }
    }
}
