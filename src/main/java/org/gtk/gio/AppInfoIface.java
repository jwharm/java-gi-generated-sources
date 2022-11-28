package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Application Information interface, for operating system portability.
 */
public class AppInfoIface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GAppInfoIface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("dup"),
        Interop.valueLayout.ADDRESS.withName("equal"),
        Interop.valueLayout.ADDRESS.withName("get_id"),
        Interop.valueLayout.ADDRESS.withName("get_name"),
        Interop.valueLayout.ADDRESS.withName("get_description"),
        Interop.valueLayout.ADDRESS.withName("get_executable"),
        Interop.valueLayout.ADDRESS.withName("get_icon"),
        Interop.valueLayout.ADDRESS.withName("launch"),
        Interop.valueLayout.ADDRESS.withName("supports_uris"),
        Interop.valueLayout.ADDRESS.withName("supports_files"),
        Interop.valueLayout.ADDRESS.withName("launch_uris"),
        Interop.valueLayout.ADDRESS.withName("should_show"),
        Interop.valueLayout.ADDRESS.withName("set_as_default_for_type"),
        Interop.valueLayout.ADDRESS.withName("set_as_default_for_extension"),
        Interop.valueLayout.ADDRESS.withName("add_supports_type"),
        Interop.valueLayout.ADDRESS.withName("can_remove_supports_type"),
        Interop.valueLayout.ADDRESS.withName("remove_supports_type"),
        Interop.valueLayout.ADDRESS.withName("can_delete"),
        Interop.valueLayout.ADDRESS.withName("do_delete"),
        Interop.valueLayout.ADDRESS.withName("get_commandline"),
        Interop.valueLayout.ADDRESS.withName("get_display_name"),
        Interop.valueLayout.ADDRESS.withName("set_as_last_used_for_type"),
        Interop.valueLayout.ADDRESS.withName("get_supported_types"),
        Interop.valueLayout.ADDRESS.withName("launch_uris_async"),
        Interop.valueLayout.ADDRESS.withName("launch_uris_finish")
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
     * Allocate a new {@link AppInfoIface}
     * @return A new, uninitialized @{link AppInfoIface}
     */
    public static AppInfoIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AppInfoIface newInstance = new AppInfoIface(segment.address(), Ownership.NONE);
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
     * Create a AppInfoIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AppInfoIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private AppInfoIface struct;
        
         /**
         * A {@link AppInfoIface.Build} object constructs a {@link AppInfoIface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = AppInfoIface.allocate();
        }
        
         /**
         * Finish building the {@link AppInfoIface} struct.
         * @return A new instance of {@code AppInfoIface} with the fields 
         *         that were set in the Build object.
         */
        public AppInfoIface construct() {
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
        
        public Build setDup(java.lang.foreign.MemoryAddress dup) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dup"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dup == null ? MemoryAddress.NULL : dup));
            return this;
        }
        
        public Build setEqual(java.lang.foreign.MemoryAddress equal) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("equal"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (equal == null ? MemoryAddress.NULL : equal));
            return this;
        }
        
        public Build setGetId(java.lang.foreign.MemoryAddress getId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getId == null ? MemoryAddress.NULL : getId));
            return this;
        }
        
        public Build setGetName(java.lang.foreign.MemoryAddress getName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getName == null ? MemoryAddress.NULL : getName));
            return this;
        }
        
        public Build setGetDescription(java.lang.foreign.MemoryAddress getDescription) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_description"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDescription == null ? MemoryAddress.NULL : getDescription));
            return this;
        }
        
        public Build setGetExecutable(java.lang.foreign.MemoryAddress getExecutable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_executable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getExecutable == null ? MemoryAddress.NULL : getExecutable));
            return this;
        }
        
        public Build setGetIcon(java.lang.foreign.MemoryAddress getIcon) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_icon"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getIcon == null ? MemoryAddress.NULL : getIcon));
            return this;
        }
        
        public Build setLaunch(java.lang.foreign.MemoryAddress launch) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("launch"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (launch == null ? MemoryAddress.NULL : launch));
            return this;
        }
        
        public Build setSupportsUris(java.lang.foreign.MemoryAddress supportsUris) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("supports_uris"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (supportsUris == null ? MemoryAddress.NULL : supportsUris));
            return this;
        }
        
        public Build setSupportsFiles(java.lang.foreign.MemoryAddress supportsFiles) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("supports_files"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (supportsFiles == null ? MemoryAddress.NULL : supportsFiles));
            return this;
        }
        
        public Build setLaunchUris(java.lang.foreign.MemoryAddress launchUris) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("launch_uris"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (launchUris == null ? MemoryAddress.NULL : launchUris));
            return this;
        }
        
        public Build setShouldShow(java.lang.foreign.MemoryAddress shouldShow) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("should_show"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (shouldShow == null ? MemoryAddress.NULL : shouldShow));
            return this;
        }
        
        public Build setSetAsDefaultForType(java.lang.foreign.MemoryAddress setAsDefaultForType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_as_default_for_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setAsDefaultForType == null ? MemoryAddress.NULL : setAsDefaultForType));
            return this;
        }
        
        public Build setSetAsDefaultForExtension(java.lang.foreign.MemoryAddress setAsDefaultForExtension) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_as_default_for_extension"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setAsDefaultForExtension == null ? MemoryAddress.NULL : setAsDefaultForExtension));
            return this;
        }
        
        public Build setAddSupportsType(java.lang.foreign.MemoryAddress addSupportsType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add_supports_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (addSupportsType == null ? MemoryAddress.NULL : addSupportsType));
            return this;
        }
        
        public Build setCanRemoveSupportsType(java.lang.foreign.MemoryAddress canRemoveSupportsType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_remove_supports_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canRemoveSupportsType == null ? MemoryAddress.NULL : canRemoveSupportsType));
            return this;
        }
        
        public Build setRemoveSupportsType(java.lang.foreign.MemoryAddress removeSupportsType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("remove_supports_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (removeSupportsType == null ? MemoryAddress.NULL : removeSupportsType));
            return this;
        }
        
        public Build setCanDelete(java.lang.foreign.MemoryAddress canDelete) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_delete"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canDelete == null ? MemoryAddress.NULL : canDelete));
            return this;
        }
        
        public Build setDoDelete(java.lang.foreign.MemoryAddress doDelete) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("do_delete"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (doDelete == null ? MemoryAddress.NULL : doDelete));
            return this;
        }
        
        public Build setGetCommandline(java.lang.foreign.MemoryAddress getCommandline) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_commandline"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getCommandline == null ? MemoryAddress.NULL : getCommandline));
            return this;
        }
        
        public Build setGetDisplayName(java.lang.foreign.MemoryAddress getDisplayName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_display_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDisplayName == null ? MemoryAddress.NULL : getDisplayName));
            return this;
        }
        
        public Build setSetAsLastUsedForType(java.lang.foreign.MemoryAddress setAsLastUsedForType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_as_last_used_for_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setAsLastUsedForType == null ? MemoryAddress.NULL : setAsLastUsedForType));
            return this;
        }
        
        public Build setGetSupportedTypes(java.lang.foreign.MemoryAddress getSupportedTypes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_supported_types"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSupportedTypes == null ? MemoryAddress.NULL : getSupportedTypes));
            return this;
        }
        
        public Build setLaunchUrisAsync(java.lang.foreign.MemoryAddress launchUrisAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("launch_uris_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (launchUrisAsync == null ? MemoryAddress.NULL : launchUrisAsync));
            return this;
        }
        
        public Build setLaunchUrisFinish(java.lang.foreign.MemoryAddress launchUrisFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("launch_uris_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (launchUrisFinish == null ? MemoryAddress.NULL : launchUrisFinish));
            return this;
        }
    }
}
