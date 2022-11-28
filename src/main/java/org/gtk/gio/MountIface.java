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
    public org.gtk.gobject.TypeInterface gIface$get() {
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
        
        public Build setUnmounted(java.lang.foreign.MemoryAddress unmounted) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmounted"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmounted == null ? MemoryAddress.NULL : unmounted));
            return this;
        }
        
        public Build setGetRoot(java.lang.foreign.MemoryAddress getRoot) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_root"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getRoot == null ? MemoryAddress.NULL : getRoot));
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
        
        public Build setGetVolume(java.lang.foreign.MemoryAddress getVolume) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_volume"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getVolume == null ? MemoryAddress.NULL : getVolume));
            return this;
        }
        
        public Build setGetDrive(java.lang.foreign.MemoryAddress getDrive) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_drive"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDrive == null ? MemoryAddress.NULL : getDrive));
            return this;
        }
        
        public Build setCanUnmount(java.lang.foreign.MemoryAddress canUnmount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_unmount"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canUnmount == null ? MemoryAddress.NULL : canUnmount));
            return this;
        }
        
        public Build setCanEject(java.lang.foreign.MemoryAddress canEject) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_eject"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canEject == null ? MemoryAddress.NULL : canEject));
            return this;
        }
        
        public Build setUnmount(java.lang.foreign.MemoryAddress unmount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmount"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmount == null ? MemoryAddress.NULL : unmount));
            return this;
        }
        
        public Build setUnmountFinish(java.lang.foreign.MemoryAddress unmountFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmount_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmountFinish == null ? MemoryAddress.NULL : unmountFinish));
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
        
        public Build setRemount(java.lang.foreign.MemoryAddress remount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("remount"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (remount == null ? MemoryAddress.NULL : remount));
            return this;
        }
        
        public Build setRemountFinish(java.lang.foreign.MemoryAddress remountFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("remount_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (remountFinish == null ? MemoryAddress.NULL : remountFinish));
            return this;
        }
        
        public Build setGuessContentType(java.lang.foreign.MemoryAddress guessContentType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("guess_content_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (guessContentType == null ? MemoryAddress.NULL : guessContentType));
            return this;
        }
        
        public Build setGuessContentTypeFinish(java.lang.foreign.MemoryAddress guessContentTypeFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("guess_content_type_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (guessContentTypeFinish == null ? MemoryAddress.NULL : guessContentTypeFinish));
            return this;
        }
        
        public Build setGuessContentTypeSync(java.lang.foreign.MemoryAddress guessContentTypeSync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("guess_content_type_sync"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (guessContentTypeSync == null ? MemoryAddress.NULL : guessContentTypeSync));
            return this;
        }
        
        public Build setPreUnmount(java.lang.foreign.MemoryAddress preUnmount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pre_unmount"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (preUnmount == null ? MemoryAddress.NULL : preUnmount));
            return this;
        }
        
        public Build setUnmountWithOperation(java.lang.foreign.MemoryAddress unmountWithOperation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmount_with_operation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmountWithOperation == null ? MemoryAddress.NULL : unmountWithOperation));
            return this;
        }
        
        public Build setUnmountWithOperationFinish(java.lang.foreign.MemoryAddress unmountWithOperationFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmount_with_operation_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmountWithOperationFinish == null ? MemoryAddress.NULL : unmountWithOperationFinish));
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
        
        public Build setGetDefaultLocation(java.lang.foreign.MemoryAddress getDefaultLocation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_default_location"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDefaultLocation == null ? MemoryAddress.NULL : getDefaultLocation));
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
