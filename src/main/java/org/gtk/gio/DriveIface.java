package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Interface for creating {@link Drive} implementations.
 */
public class DriveIface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDriveIface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("changed"),
        Interop.valueLayout.ADDRESS.withName("disconnected"),
        Interop.valueLayout.ADDRESS.withName("eject_button"),
        Interop.valueLayout.ADDRESS.withName("get_name"),
        Interop.valueLayout.ADDRESS.withName("get_icon"),
        Interop.valueLayout.ADDRESS.withName("has_volumes"),
        Interop.valueLayout.ADDRESS.withName("get_volumes"),
        Interop.valueLayout.ADDRESS.withName("is_media_removable"),
        Interop.valueLayout.ADDRESS.withName("has_media"),
        Interop.valueLayout.ADDRESS.withName("is_media_check_automatic"),
        Interop.valueLayout.ADDRESS.withName("can_eject"),
        Interop.valueLayout.ADDRESS.withName("can_poll_for_media"),
        Interop.valueLayout.ADDRESS.withName("eject"),
        Interop.valueLayout.ADDRESS.withName("eject_finish"),
        Interop.valueLayout.ADDRESS.withName("poll_for_media"),
        Interop.valueLayout.ADDRESS.withName("poll_for_media_finish"),
        Interop.valueLayout.ADDRESS.withName("get_identifier"),
        Interop.valueLayout.ADDRESS.withName("enumerate_identifiers"),
        Interop.valueLayout.ADDRESS.withName("get_start_stop_type"),
        Interop.valueLayout.ADDRESS.withName("can_start"),
        Interop.valueLayout.ADDRESS.withName("can_start_degraded"),
        Interop.valueLayout.ADDRESS.withName("start"),
        Interop.valueLayout.ADDRESS.withName("start_finish"),
        Interop.valueLayout.ADDRESS.withName("can_stop"),
        Interop.valueLayout.ADDRESS.withName("stop"),
        Interop.valueLayout.ADDRESS.withName("stop_finish"),
        Interop.valueLayout.ADDRESS.withName("stop_button"),
        Interop.valueLayout.ADDRESS.withName("eject_with_operation"),
        Interop.valueLayout.ADDRESS.withName("eject_with_operation_finish"),
        Interop.valueLayout.ADDRESS.withName("get_sort_key"),
        Interop.valueLayout.ADDRESS.withName("get_symbolic_icon"),
        Interop.valueLayout.ADDRESS.withName("is_removable")
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
     * Allocate a new {@link DriveIface}
     * @return A new, uninitialized @{link DriveIface}
     */
    public static DriveIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DriveIface newInstance = new DriveIface(segment.address(), Ownership.NONE);
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
     * Create a DriveIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DriveIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private DriveIface struct;
        
         /**
         * A {@link DriveIface.Build} object constructs a {@link DriveIface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = DriveIface.allocate();
        }
        
         /**
         * Finish building the {@link DriveIface} struct.
         * @return A new instance of {@code DriveIface} with the fields 
         *         that were set in the Build object.
         */
        public DriveIface construct() {
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
        
        public Build setDisconnected(java.lang.foreign.MemoryAddress disconnected) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("disconnected"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (disconnected == null ? MemoryAddress.NULL : disconnected));
            return this;
        }
        
        public Build setEjectButton(java.lang.foreign.MemoryAddress eject_button) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject_button"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (eject_button == null ? MemoryAddress.NULL : eject_button));
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
        
        public Build setHasVolumes(java.lang.foreign.MemoryAddress has_volumes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("has_volumes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (has_volumes == null ? MemoryAddress.NULL : has_volumes));
            return this;
        }
        
        public Build setGetVolumes(java.lang.foreign.MemoryAddress get_volumes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_volumes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_volumes == null ? MemoryAddress.NULL : get_volumes));
            return this;
        }
        
        public Build setIsMediaRemovable(java.lang.foreign.MemoryAddress is_media_removable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_media_removable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (is_media_removable == null ? MemoryAddress.NULL : is_media_removable));
            return this;
        }
        
        public Build setHasMedia(java.lang.foreign.MemoryAddress has_media) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("has_media"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (has_media == null ? MemoryAddress.NULL : has_media));
            return this;
        }
        
        public Build setIsMediaCheckAutomatic(java.lang.foreign.MemoryAddress is_media_check_automatic) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_media_check_automatic"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (is_media_check_automatic == null ? MemoryAddress.NULL : is_media_check_automatic));
            return this;
        }
        
        public Build setCanEject(java.lang.foreign.MemoryAddress can_eject) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_eject"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (can_eject == null ? MemoryAddress.NULL : can_eject));
            return this;
        }
        
        public Build setCanPollForMedia(java.lang.foreign.MemoryAddress can_poll_for_media) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_poll_for_media"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (can_poll_for_media == null ? MemoryAddress.NULL : can_poll_for_media));
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
        
        public Build setPollForMedia(java.lang.foreign.MemoryAddress poll_for_media) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("poll_for_media"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (poll_for_media == null ? MemoryAddress.NULL : poll_for_media));
            return this;
        }
        
        public Build setPollForMediaFinish(java.lang.foreign.MemoryAddress poll_for_media_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("poll_for_media_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (poll_for_media_finish == null ? MemoryAddress.NULL : poll_for_media_finish));
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
        
        public Build setGetStartStopType(java.lang.foreign.MemoryAddress get_start_stop_type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_start_stop_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_start_stop_type == null ? MemoryAddress.NULL : get_start_stop_type));
            return this;
        }
        
        public Build setCanStart(java.lang.foreign.MemoryAddress can_start) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (can_start == null ? MemoryAddress.NULL : can_start));
            return this;
        }
        
        public Build setCanStartDegraded(java.lang.foreign.MemoryAddress can_start_degraded) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_start_degraded"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (can_start_degraded == null ? MemoryAddress.NULL : can_start_degraded));
            return this;
        }
        
        public Build setStart(java.lang.foreign.MemoryAddress start) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (start == null ? MemoryAddress.NULL : start));
            return this;
        }
        
        public Build setStartFinish(java.lang.foreign.MemoryAddress start_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (start_finish == null ? MemoryAddress.NULL : start_finish));
            return this;
        }
        
        public Build setCanStop(java.lang.foreign.MemoryAddress can_stop) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (can_stop == null ? MemoryAddress.NULL : can_stop));
            return this;
        }
        
        public Build setStop(java.lang.foreign.MemoryAddress stop) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stop == null ? MemoryAddress.NULL : stop));
            return this;
        }
        
        public Build setStopFinish(java.lang.foreign.MemoryAddress stop_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stop_finish == null ? MemoryAddress.NULL : stop_finish));
            return this;
        }
        
        public Build setStopButton(java.lang.foreign.MemoryAddress stop_button) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop_button"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stop_button == null ? MemoryAddress.NULL : stop_button));
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
        
        public Build setIsRemovable(java.lang.foreign.MemoryAddress is_removable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_removable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (is_removable == null ? MemoryAddress.NULL : is_removable));
            return this;
        }
    }
}
