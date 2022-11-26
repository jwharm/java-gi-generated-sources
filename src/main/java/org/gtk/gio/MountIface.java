package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Interface for implementing operations for mounts.
 */
public class MountIface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GMountIface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("changed"),
        Interop.valueLayout.ADDRESS.withName("unmounted"),
        Interop.valueLayout.ADDRESS.withName("get_root"),
        Interop.valueLayout.ADDRESS.withName("get_name"),
        Interop.valueLayout.ADDRESS.withName("get_icon"),
        Interop.valueLayout.ADDRESS.withName("get_uuid"),
        Interop.valueLayout.ADDRESS.withName("get_volume"),
        Interop.valueLayout.ADDRESS.withName("get_drive"),
        Interop.valueLayout.ADDRESS.withName("can_unmount"),
        Interop.valueLayout.ADDRESS.withName("can_eject"),
        Interop.valueLayout.ADDRESS.withName("unmount"),
        Interop.valueLayout.ADDRESS.withName("unmount_finish"),
        Interop.valueLayout.ADDRESS.withName("eject"),
        Interop.valueLayout.ADDRESS.withName("eject_finish"),
        Interop.valueLayout.ADDRESS.withName("remount"),
        Interop.valueLayout.ADDRESS.withName("remount_finish"),
        Interop.valueLayout.ADDRESS.withName("guess_content_type"),
        Interop.valueLayout.ADDRESS.withName("guess_content_type_finish"),
        Interop.valueLayout.ADDRESS.withName("guess_content_type_sync"),
        Interop.valueLayout.ADDRESS.withName("pre_unmount"),
        Interop.valueLayout.ADDRESS.withName("unmount_with_operation"),
        Interop.valueLayout.ADDRESS.withName("unmount_with_operation_finish"),
        Interop.valueLayout.ADDRESS.withName("eject_with_operation"),
        Interop.valueLayout.ADDRESS.withName("eject_with_operation_finish"),
        Interop.valueLayout.ADDRESS.withName("get_default_location"),
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
     * Allocate a new {@link MountIface}
     * @return A new, uninitialized @{link MountIface}
     */
    public static MountIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MountIface newInstance = new MountIface(segment.address(), Ownership.NONE);
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
     * Create a MountIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MountIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private MountIface struct;
        
         /**
         * A {@link MountIface.Build} object constructs a {@link MountIface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = MountIface.allocate();
        }
        
         /**
         * Finish building the {@link MountIface} struct.
         * @return A new instance of {@code MountIface} with the fields 
         *         that were set in the Build object.
         */
        public MountIface construct() {
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
        
        public Build setUnmounted(java.lang.foreign.MemoryAddress unmounted) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmounted"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmounted == null ? MemoryAddress.NULL : unmounted));
            return this;
        }
        
        public Build setGetRoot(java.lang.foreign.MemoryAddress get_root) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_root"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_root == null ? MemoryAddress.NULL : get_root));
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
        
        public Build setGetVolume(java.lang.foreign.MemoryAddress get_volume) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_volume"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_volume == null ? MemoryAddress.NULL : get_volume));
            return this;
        }
        
        public Build setGetDrive(java.lang.foreign.MemoryAddress get_drive) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_drive"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_drive == null ? MemoryAddress.NULL : get_drive));
            return this;
        }
        
        public Build setCanUnmount(java.lang.foreign.MemoryAddress can_unmount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_unmount"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (can_unmount == null ? MemoryAddress.NULL : can_unmount));
            return this;
        }
        
        public Build setCanEject(java.lang.foreign.MemoryAddress can_eject) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_eject"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (can_eject == null ? MemoryAddress.NULL : can_eject));
            return this;
        }
        
        public Build setUnmount(java.lang.foreign.MemoryAddress unmount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmount"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmount == null ? MemoryAddress.NULL : unmount));
            return this;
        }
        
        public Build setUnmountFinish(java.lang.foreign.MemoryAddress unmount_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmount_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmount_finish == null ? MemoryAddress.NULL : unmount_finish));
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
        
        public Build setRemount(java.lang.foreign.MemoryAddress remount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("remount"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (remount == null ? MemoryAddress.NULL : remount));
            return this;
        }
        
        public Build setRemountFinish(java.lang.foreign.MemoryAddress remount_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("remount_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (remount_finish == null ? MemoryAddress.NULL : remount_finish));
            return this;
        }
        
        public Build setGuessContentType(java.lang.foreign.MemoryAddress guess_content_type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("guess_content_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (guess_content_type == null ? MemoryAddress.NULL : guess_content_type));
            return this;
        }
        
        public Build setGuessContentTypeFinish(java.lang.foreign.MemoryAddress guess_content_type_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("guess_content_type_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (guess_content_type_finish == null ? MemoryAddress.NULL : guess_content_type_finish));
            return this;
        }
        
        public Build setGuessContentTypeSync(java.lang.foreign.MemoryAddress guess_content_type_sync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("guess_content_type_sync"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (guess_content_type_sync == null ? MemoryAddress.NULL : guess_content_type_sync));
            return this;
        }
        
        public Build setPreUnmount(java.lang.foreign.MemoryAddress pre_unmount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pre_unmount"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pre_unmount == null ? MemoryAddress.NULL : pre_unmount));
            return this;
        }
        
        public Build setUnmountWithOperation(java.lang.foreign.MemoryAddress unmount_with_operation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmount_with_operation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmount_with_operation == null ? MemoryAddress.NULL : unmount_with_operation));
            return this;
        }
        
        public Build setUnmountWithOperationFinish(java.lang.foreign.MemoryAddress unmount_with_operation_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmount_with_operation_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmount_with_operation_finish == null ? MemoryAddress.NULL : unmount_with_operation_finish));
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
        
        public Build setGetDefaultLocation(java.lang.foreign.MemoryAddress get_default_location) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_default_location"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_default_location == null ? MemoryAddress.NULL : get_default_location));
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
