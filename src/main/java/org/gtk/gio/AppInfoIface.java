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
    public org.gtk.gobject.TypeInterface g_iface$get() {
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
         * @param g_iface The value for the {@code g_iface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setGIface(org.gtk.gobject.TypeInterface g_iface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (g_iface == null ? MemoryAddress.NULL : g_iface.handle()));
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
        
        public Build setGetId(java.lang.foreign.MemoryAddress get_id) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_id == null ? MemoryAddress.NULL : get_id));
            return this;
        }
        
        public Build setGetName(java.lang.foreign.MemoryAddress get_name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_name == null ? MemoryAddress.NULL : get_name));
            return this;
        }
        
        public Build setGetDescription(java.lang.foreign.MemoryAddress get_description) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_description"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_description == null ? MemoryAddress.NULL : get_description));
            return this;
        }
        
        public Build setGetExecutable(java.lang.foreign.MemoryAddress get_executable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_executable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_executable == null ? MemoryAddress.NULL : get_executable));
            return this;
        }
        
        public Build setGetIcon(java.lang.foreign.MemoryAddress get_icon) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_icon"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_icon == null ? MemoryAddress.NULL : get_icon));
            return this;
        }
        
        public Build setLaunch(java.lang.foreign.MemoryAddress launch) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("launch"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (launch == null ? MemoryAddress.NULL : launch));
            return this;
        }
        
        public Build setSupportsUris(java.lang.foreign.MemoryAddress supports_uris) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("supports_uris"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (supports_uris == null ? MemoryAddress.NULL : supports_uris));
            return this;
        }
        
        public Build setSupportsFiles(java.lang.foreign.MemoryAddress supports_files) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("supports_files"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (supports_files == null ? MemoryAddress.NULL : supports_files));
            return this;
        }
        
        public Build setLaunchUris(java.lang.foreign.MemoryAddress launch_uris) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("launch_uris"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (launch_uris == null ? MemoryAddress.NULL : launch_uris));
            return this;
        }
        
        public Build setShouldShow(java.lang.foreign.MemoryAddress should_show) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("should_show"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (should_show == null ? MemoryAddress.NULL : should_show));
            return this;
        }
        
        public Build setSetAsDefaultForType(java.lang.foreign.MemoryAddress set_as_default_for_type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_as_default_for_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_as_default_for_type == null ? MemoryAddress.NULL : set_as_default_for_type));
            return this;
        }
        
        public Build setSetAsDefaultForExtension(java.lang.foreign.MemoryAddress set_as_default_for_extension) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_as_default_for_extension"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_as_default_for_extension == null ? MemoryAddress.NULL : set_as_default_for_extension));
            return this;
        }
        
        public Build setAddSupportsType(java.lang.foreign.MemoryAddress add_supports_type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add_supports_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (add_supports_type == null ? MemoryAddress.NULL : add_supports_type));
            return this;
        }
        
        public Build setCanRemoveSupportsType(java.lang.foreign.MemoryAddress can_remove_supports_type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_remove_supports_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (can_remove_supports_type == null ? MemoryAddress.NULL : can_remove_supports_type));
            return this;
        }
        
        public Build setRemoveSupportsType(java.lang.foreign.MemoryAddress remove_supports_type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("remove_supports_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (remove_supports_type == null ? MemoryAddress.NULL : remove_supports_type));
            return this;
        }
        
        public Build setCanDelete(java.lang.foreign.MemoryAddress can_delete) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_delete"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (can_delete == null ? MemoryAddress.NULL : can_delete));
            return this;
        }
        
        public Build setDoDelete(java.lang.foreign.MemoryAddress do_delete) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("do_delete"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (do_delete == null ? MemoryAddress.NULL : do_delete));
            return this;
        }
        
        public Build setGetCommandline(java.lang.foreign.MemoryAddress get_commandline) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_commandline"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_commandline == null ? MemoryAddress.NULL : get_commandline));
            return this;
        }
        
        public Build setGetDisplayName(java.lang.foreign.MemoryAddress get_display_name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_display_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_display_name == null ? MemoryAddress.NULL : get_display_name));
            return this;
        }
        
        public Build setSetAsLastUsedForType(java.lang.foreign.MemoryAddress set_as_last_used_for_type) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_as_last_used_for_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_as_last_used_for_type == null ? MemoryAddress.NULL : set_as_last_used_for_type));
            return this;
        }
        
        public Build setGetSupportedTypes(java.lang.foreign.MemoryAddress get_supported_types) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_supported_types"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_supported_types == null ? MemoryAddress.NULL : get_supported_types));
            return this;
        }
        
        public Build setLaunchUrisAsync(java.lang.foreign.MemoryAddress launch_uris_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("launch_uris_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (launch_uris_async == null ? MemoryAddress.NULL : launch_uris_async));
            return this;
        }
        
        public Build setLaunchUrisFinish(java.lang.foreign.MemoryAddress launch_uris_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("launch_uris_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (launch_uris_finish == null ? MemoryAddress.NULL : launch_uris_finish));
            return this;
        }
    }
}
