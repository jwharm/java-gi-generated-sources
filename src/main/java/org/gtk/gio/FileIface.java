package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An interface for writing VFS file handles.
 */
public class FileIface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GFileIface";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
        Interop.valueLayout.ADDRESS.withName("dup"),
        Interop.valueLayout.ADDRESS.withName("hash"),
        Interop.valueLayout.ADDRESS.withName("equal"),
        Interop.valueLayout.ADDRESS.withName("is_native"),
        Interop.valueLayout.ADDRESS.withName("has_uri_scheme"),
        Interop.valueLayout.ADDRESS.withName("get_uri_scheme"),
        Interop.valueLayout.ADDRESS.withName("get_basename"),
        Interop.valueLayout.ADDRESS.withName("get_path"),
        Interop.valueLayout.ADDRESS.withName("get_uri"),
        Interop.valueLayout.ADDRESS.withName("get_parse_name"),
        Interop.valueLayout.ADDRESS.withName("get_parent"),
        Interop.valueLayout.ADDRESS.withName("prefix_matches"),
        Interop.valueLayout.ADDRESS.withName("get_relative_path"),
        Interop.valueLayout.ADDRESS.withName("resolve_relative_path"),
        Interop.valueLayout.ADDRESS.withName("get_child_for_display_name"),
        Interop.valueLayout.ADDRESS.withName("enumerate_children"),
        Interop.valueLayout.ADDRESS.withName("enumerate_children_async"),
        Interop.valueLayout.ADDRESS.withName("enumerate_children_finish"),
        Interop.valueLayout.ADDRESS.withName("query_info"),
        Interop.valueLayout.ADDRESS.withName("query_info_async"),
        Interop.valueLayout.ADDRESS.withName("query_info_finish"),
        Interop.valueLayout.ADDRESS.withName("query_filesystem_info"),
        Interop.valueLayout.ADDRESS.withName("query_filesystem_info_async"),
        Interop.valueLayout.ADDRESS.withName("query_filesystem_info_finish"),
        Interop.valueLayout.ADDRESS.withName("find_enclosing_mount"),
        Interop.valueLayout.ADDRESS.withName("find_enclosing_mount_async"),
        Interop.valueLayout.ADDRESS.withName("find_enclosing_mount_finish"),
        Interop.valueLayout.ADDRESS.withName("set_display_name"),
        Interop.valueLayout.ADDRESS.withName("set_display_name_async"),
        Interop.valueLayout.ADDRESS.withName("set_display_name_finish"),
        Interop.valueLayout.ADDRESS.withName("query_settable_attributes"),
        Interop.valueLayout.ADDRESS.withName("_query_settable_attributes_async"),
        Interop.valueLayout.ADDRESS.withName("_query_settable_attributes_finish"),
        Interop.valueLayout.ADDRESS.withName("query_writable_namespaces"),
        Interop.valueLayout.ADDRESS.withName("_query_writable_namespaces_async"),
        Interop.valueLayout.ADDRESS.withName("_query_writable_namespaces_finish"),
        Interop.valueLayout.ADDRESS.withName("set_attribute"),
        Interop.valueLayout.ADDRESS.withName("set_attributes_from_info"),
        Interop.valueLayout.ADDRESS.withName("set_attributes_async"),
        Interop.valueLayout.ADDRESS.withName("set_attributes_finish"),
        Interop.valueLayout.ADDRESS.withName("read_fn"),
        Interop.valueLayout.ADDRESS.withName("read_async"),
        Interop.valueLayout.ADDRESS.withName("read_finish"),
        Interop.valueLayout.ADDRESS.withName("append_to"),
        Interop.valueLayout.ADDRESS.withName("append_to_async"),
        Interop.valueLayout.ADDRESS.withName("append_to_finish"),
        Interop.valueLayout.ADDRESS.withName("create"),
        Interop.valueLayout.ADDRESS.withName("create_async"),
        Interop.valueLayout.ADDRESS.withName("create_finish"),
        Interop.valueLayout.ADDRESS.withName("replace"),
        Interop.valueLayout.ADDRESS.withName("replace_async"),
        Interop.valueLayout.ADDRESS.withName("replace_finish"),
        Interop.valueLayout.ADDRESS.withName("delete_file"),
        Interop.valueLayout.ADDRESS.withName("delete_file_async"),
        Interop.valueLayout.ADDRESS.withName("delete_file_finish"),
        Interop.valueLayout.ADDRESS.withName("trash"),
        Interop.valueLayout.ADDRESS.withName("trash_async"),
        Interop.valueLayout.ADDRESS.withName("trash_finish"),
        Interop.valueLayout.ADDRESS.withName("make_directory"),
        Interop.valueLayout.ADDRESS.withName("make_directory_async"),
        Interop.valueLayout.ADDRESS.withName("make_directory_finish"),
        Interop.valueLayout.ADDRESS.withName("make_symbolic_link"),
        Interop.valueLayout.ADDRESS.withName("make_symbolic_link_async"),
        Interop.valueLayout.ADDRESS.withName("make_symbolic_link_finish"),
        Interop.valueLayout.ADDRESS.withName("copy"),
        Interop.valueLayout.ADDRESS.withName("copy_async"),
        Interop.valueLayout.ADDRESS.withName("copy_finish"),
        Interop.valueLayout.ADDRESS.withName("move"),
        Interop.valueLayout.ADDRESS.withName("move_async"),
        Interop.valueLayout.ADDRESS.withName("move_finish"),
        Interop.valueLayout.ADDRESS.withName("mount_mountable"),
        Interop.valueLayout.ADDRESS.withName("mount_mountable_finish"),
        Interop.valueLayout.ADDRESS.withName("unmount_mountable"),
        Interop.valueLayout.ADDRESS.withName("unmount_mountable_finish"),
        Interop.valueLayout.ADDRESS.withName("eject_mountable"),
        Interop.valueLayout.ADDRESS.withName("eject_mountable_finish"),
        Interop.valueLayout.ADDRESS.withName("mount_enclosing_volume"),
        Interop.valueLayout.ADDRESS.withName("mount_enclosing_volume_finish"),
        Interop.valueLayout.ADDRESS.withName("monitor_dir"),
        Interop.valueLayout.ADDRESS.withName("monitor_file"),
        Interop.valueLayout.ADDRESS.withName("open_readwrite"),
        Interop.valueLayout.ADDRESS.withName("open_readwrite_async"),
        Interop.valueLayout.ADDRESS.withName("open_readwrite_finish"),
        Interop.valueLayout.ADDRESS.withName("create_readwrite"),
        Interop.valueLayout.ADDRESS.withName("create_readwrite_async"),
        Interop.valueLayout.ADDRESS.withName("create_readwrite_finish"),
        Interop.valueLayout.ADDRESS.withName("replace_readwrite"),
        Interop.valueLayout.ADDRESS.withName("replace_readwrite_async"),
        Interop.valueLayout.ADDRESS.withName("replace_readwrite_finish"),
        Interop.valueLayout.ADDRESS.withName("start_mountable"),
        Interop.valueLayout.ADDRESS.withName("start_mountable_finish"),
        Interop.valueLayout.ADDRESS.withName("stop_mountable"),
        Interop.valueLayout.ADDRESS.withName("stop_mountable_finish"),
        Interop.valueLayout.C_INT.withName("supports_thread_contexts"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("unmount_mountable_with_operation"),
        Interop.valueLayout.ADDRESS.withName("unmount_mountable_with_operation_finish"),
        Interop.valueLayout.ADDRESS.withName("eject_mountable_with_operation"),
        Interop.valueLayout.ADDRESS.withName("eject_mountable_with_operation_finish"),
        Interop.valueLayout.ADDRESS.withName("poll_mountable"),
        Interop.valueLayout.ADDRESS.withName("poll_mountable_finish"),
        Interop.valueLayout.ADDRESS.withName("measure_disk_usage"),
        Interop.valueLayout.ADDRESS.withName("measure_disk_usage_async"),
        Interop.valueLayout.ADDRESS.withName("measure_disk_usage_finish")
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
     * Allocate a new {@link FileIface}
     * @return A new, uninitialized @{link FileIface}
     */
    public static FileIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FileIface newInstance = new FileIface(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code supports_thread_contexts}
     * @return The value of the field {@code supports_thread_contexts}
     */
    public boolean supports_thread_contexts$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("supports_thread_contexts"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code supports_thread_contexts}
     * @param supports_thread_contexts The new value of the field {@code supports_thread_contexts}
     */
    public void supports_thread_contexts$set(boolean supports_thread_contexts) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("supports_thread_contexts"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), supports_thread_contexts ? 1 : 0);
    }
    
    /**
     * Create a FileIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FileIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private FileIface struct;
        
         /**
         * A {@link FileIface.Build} object constructs a {@link FileIface} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = FileIface.allocate();
        }
        
         /**
         * Finish building the {@link FileIface} struct.
         * @return A new instance of {@code FileIface} with the fields 
         *         that were set in the Build object.
         */
        public FileIface construct() {
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
        
        public Build setHash(java.lang.foreign.MemoryAddress hash) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("hash"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (hash == null ? MemoryAddress.NULL : hash));
            return this;
        }
        
        public Build setEqual(java.lang.foreign.MemoryAddress equal) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("equal"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (equal == null ? MemoryAddress.NULL : equal));
            return this;
        }
        
        public Build setIsNative(java.lang.foreign.MemoryAddress is_native) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_native"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (is_native == null ? MemoryAddress.NULL : is_native));
            return this;
        }
        
        public Build setHasUriScheme(java.lang.foreign.MemoryAddress has_uri_scheme) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("has_uri_scheme"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (has_uri_scheme == null ? MemoryAddress.NULL : has_uri_scheme));
            return this;
        }
        
        public Build setGetUriScheme(java.lang.foreign.MemoryAddress get_uri_scheme) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_uri_scheme"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_uri_scheme == null ? MemoryAddress.NULL : get_uri_scheme));
            return this;
        }
        
        public Build setGetBasename(java.lang.foreign.MemoryAddress get_basename) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_basename"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_basename == null ? MemoryAddress.NULL : get_basename));
            return this;
        }
        
        public Build setGetPath(java.lang.foreign.MemoryAddress get_path) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_path"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_path == null ? MemoryAddress.NULL : get_path));
            return this;
        }
        
        public Build setGetUri(java.lang.foreign.MemoryAddress get_uri) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_uri"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_uri == null ? MemoryAddress.NULL : get_uri));
            return this;
        }
        
        public Build setGetParseName(java.lang.foreign.MemoryAddress get_parse_name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_parse_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_parse_name == null ? MemoryAddress.NULL : get_parse_name));
            return this;
        }
        
        public Build setGetParent(java.lang.foreign.MemoryAddress get_parent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_parent == null ? MemoryAddress.NULL : get_parent));
            return this;
        }
        
        public Build setPrefixMatches(java.lang.foreign.MemoryAddress prefix_matches) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prefix_matches"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prefix_matches == null ? MemoryAddress.NULL : prefix_matches));
            return this;
        }
        
        public Build setGetRelativePath(java.lang.foreign.MemoryAddress get_relative_path) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_relative_path"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_relative_path == null ? MemoryAddress.NULL : get_relative_path));
            return this;
        }
        
        public Build setResolveRelativePath(java.lang.foreign.MemoryAddress resolve_relative_path) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("resolve_relative_path"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (resolve_relative_path == null ? MemoryAddress.NULL : resolve_relative_path));
            return this;
        }
        
        public Build setGetChildForDisplayName(java.lang.foreign.MemoryAddress get_child_for_display_name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_child_for_display_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_child_for_display_name == null ? MemoryAddress.NULL : get_child_for_display_name));
            return this;
        }
        
        public Build setEnumerateChildren(java.lang.foreign.MemoryAddress enumerate_children) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enumerate_children"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (enumerate_children == null ? MemoryAddress.NULL : enumerate_children));
            return this;
        }
        
        public Build setEnumerateChildrenAsync(java.lang.foreign.MemoryAddress enumerate_children_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enumerate_children_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (enumerate_children_async == null ? MemoryAddress.NULL : enumerate_children_async));
            return this;
        }
        
        public Build setEnumerateChildrenFinish(java.lang.foreign.MemoryAddress enumerate_children_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enumerate_children_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (enumerate_children_finish == null ? MemoryAddress.NULL : enumerate_children_finish));
            return this;
        }
        
        public Build setQueryInfo(java.lang.foreign.MemoryAddress query_info) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (query_info == null ? MemoryAddress.NULL : query_info));
            return this;
        }
        
        public Build setQueryInfoAsync(java.lang.foreign.MemoryAddress query_info_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_info_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (query_info_async == null ? MemoryAddress.NULL : query_info_async));
            return this;
        }
        
        public Build setQueryInfoFinish(java.lang.foreign.MemoryAddress query_info_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_info_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (query_info_finish == null ? MemoryAddress.NULL : query_info_finish));
            return this;
        }
        
        public Build setQueryFilesystemInfo(java.lang.foreign.MemoryAddress query_filesystem_info) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_filesystem_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (query_filesystem_info == null ? MemoryAddress.NULL : query_filesystem_info));
            return this;
        }
        
        public Build setQueryFilesystemInfoAsync(java.lang.foreign.MemoryAddress query_filesystem_info_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_filesystem_info_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (query_filesystem_info_async == null ? MemoryAddress.NULL : query_filesystem_info_async));
            return this;
        }
        
        public Build setQueryFilesystemInfoFinish(java.lang.foreign.MemoryAddress query_filesystem_info_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_filesystem_info_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (query_filesystem_info_finish == null ? MemoryAddress.NULL : query_filesystem_info_finish));
            return this;
        }
        
        public Build setFindEnclosingMount(java.lang.foreign.MemoryAddress find_enclosing_mount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("find_enclosing_mount"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (find_enclosing_mount == null ? MemoryAddress.NULL : find_enclosing_mount));
            return this;
        }
        
        public Build setFindEnclosingMountAsync(java.lang.foreign.MemoryAddress find_enclosing_mount_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("find_enclosing_mount_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (find_enclosing_mount_async == null ? MemoryAddress.NULL : find_enclosing_mount_async));
            return this;
        }
        
        public Build setFindEnclosingMountFinish(java.lang.foreign.MemoryAddress find_enclosing_mount_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("find_enclosing_mount_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (find_enclosing_mount_finish == null ? MemoryAddress.NULL : find_enclosing_mount_finish));
            return this;
        }
        
        public Build setSetDisplayName(java.lang.foreign.MemoryAddress set_display_name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_display_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_display_name == null ? MemoryAddress.NULL : set_display_name));
            return this;
        }
        
        public Build setSetDisplayNameAsync(java.lang.foreign.MemoryAddress set_display_name_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_display_name_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_display_name_async == null ? MemoryAddress.NULL : set_display_name_async));
            return this;
        }
        
        public Build setSetDisplayNameFinish(java.lang.foreign.MemoryAddress set_display_name_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_display_name_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_display_name_finish == null ? MemoryAddress.NULL : set_display_name_finish));
            return this;
        }
        
        public Build setQuerySettableAttributes(java.lang.foreign.MemoryAddress query_settable_attributes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_settable_attributes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (query_settable_attributes == null ? MemoryAddress.NULL : query_settable_attributes));
            return this;
        }
        
        public Build setQuerySettableAttributesAsync(java.lang.foreign.MemoryAddress _query_settable_attributes_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_query_settable_attributes_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_query_settable_attributes_async == null ? MemoryAddress.NULL : _query_settable_attributes_async));
            return this;
        }
        
        public Build setQuerySettableAttributesFinish(java.lang.foreign.MemoryAddress _query_settable_attributes_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_query_settable_attributes_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_query_settable_attributes_finish == null ? MemoryAddress.NULL : _query_settable_attributes_finish));
            return this;
        }
        
        public Build setQueryWritableNamespaces(java.lang.foreign.MemoryAddress query_writable_namespaces) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_writable_namespaces"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (query_writable_namespaces == null ? MemoryAddress.NULL : query_writable_namespaces));
            return this;
        }
        
        public Build setQueryWritableNamespacesAsync(java.lang.foreign.MemoryAddress _query_writable_namespaces_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_query_writable_namespaces_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_query_writable_namespaces_async == null ? MemoryAddress.NULL : _query_writable_namespaces_async));
            return this;
        }
        
        public Build setQueryWritableNamespacesFinish(java.lang.foreign.MemoryAddress _query_writable_namespaces_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_query_writable_namespaces_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_query_writable_namespaces_finish == null ? MemoryAddress.NULL : _query_writable_namespaces_finish));
            return this;
        }
        
        public Build setSetAttribute(java.lang.foreign.MemoryAddress set_attribute) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_attribute"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_attribute == null ? MemoryAddress.NULL : set_attribute));
            return this;
        }
        
        public Build setSetAttributesFromInfo(java.lang.foreign.MemoryAddress set_attributes_from_info) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_attributes_from_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_attributes_from_info == null ? MemoryAddress.NULL : set_attributes_from_info));
            return this;
        }
        
        public Build setSetAttributesAsync(java.lang.foreign.MemoryAddress set_attributes_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_attributes_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_attributes_async == null ? MemoryAddress.NULL : set_attributes_async));
            return this;
        }
        
        public Build setSetAttributesFinish(java.lang.foreign.MemoryAddress set_attributes_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_attributes_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (set_attributes_finish == null ? MemoryAddress.NULL : set_attributes_finish));
            return this;
        }
        
        public Build setReadFn(java.lang.foreign.MemoryAddress read_fn) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("read_fn"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (read_fn == null ? MemoryAddress.NULL : read_fn));
            return this;
        }
        
        public Build setReadAsync(java.lang.foreign.MemoryAddress read_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("read_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (read_async == null ? MemoryAddress.NULL : read_async));
            return this;
        }
        
        public Build setReadFinish(java.lang.foreign.MemoryAddress read_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("read_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (read_finish == null ? MemoryAddress.NULL : read_finish));
            return this;
        }
        
        public Build setAppendTo(java.lang.foreign.MemoryAddress append_to) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("append_to"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (append_to == null ? MemoryAddress.NULL : append_to));
            return this;
        }
        
        public Build setAppendToAsync(java.lang.foreign.MemoryAddress append_to_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("append_to_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (append_to_async == null ? MemoryAddress.NULL : append_to_async));
            return this;
        }
        
        public Build setAppendToFinish(java.lang.foreign.MemoryAddress append_to_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("append_to_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (append_to_finish == null ? MemoryAddress.NULL : append_to_finish));
            return this;
        }
        
        public Build setCreate(java.lang.foreign.MemoryAddress create) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (create == null ? MemoryAddress.NULL : create));
            return this;
        }
        
        public Build setCreateAsync(java.lang.foreign.MemoryAddress create_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (create_async == null ? MemoryAddress.NULL : create_async));
            return this;
        }
        
        public Build setCreateFinish(java.lang.foreign.MemoryAddress create_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (create_finish == null ? MemoryAddress.NULL : create_finish));
            return this;
        }
        
        public Build setReplace(java.lang.foreign.MemoryAddress replace) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("replace"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (replace == null ? MemoryAddress.NULL : replace));
            return this;
        }
        
        public Build setReplaceAsync(java.lang.foreign.MemoryAddress replace_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("replace_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (replace_async == null ? MemoryAddress.NULL : replace_async));
            return this;
        }
        
        public Build setReplaceFinish(java.lang.foreign.MemoryAddress replace_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("replace_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (replace_finish == null ? MemoryAddress.NULL : replace_finish));
            return this;
        }
        
        public Build setDeleteFile(java.lang.foreign.MemoryAddress delete_file) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delete_file"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (delete_file == null ? MemoryAddress.NULL : delete_file));
            return this;
        }
        
        public Build setDeleteFileAsync(java.lang.foreign.MemoryAddress delete_file_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delete_file_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (delete_file_async == null ? MemoryAddress.NULL : delete_file_async));
            return this;
        }
        
        public Build setDeleteFileFinish(java.lang.foreign.MemoryAddress delete_file_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delete_file_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (delete_file_finish == null ? MemoryAddress.NULL : delete_file_finish));
            return this;
        }
        
        public Build setTrash(java.lang.foreign.MemoryAddress trash) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("trash"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (trash == null ? MemoryAddress.NULL : trash));
            return this;
        }
        
        public Build setTrashAsync(java.lang.foreign.MemoryAddress trash_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("trash_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (trash_async == null ? MemoryAddress.NULL : trash_async));
            return this;
        }
        
        public Build setTrashFinish(java.lang.foreign.MemoryAddress trash_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("trash_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (trash_finish == null ? MemoryAddress.NULL : trash_finish));
            return this;
        }
        
        public Build setMakeDirectory(java.lang.foreign.MemoryAddress make_directory) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("make_directory"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (make_directory == null ? MemoryAddress.NULL : make_directory));
            return this;
        }
        
        public Build setMakeDirectoryAsync(java.lang.foreign.MemoryAddress make_directory_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("make_directory_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (make_directory_async == null ? MemoryAddress.NULL : make_directory_async));
            return this;
        }
        
        public Build setMakeDirectoryFinish(java.lang.foreign.MemoryAddress make_directory_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("make_directory_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (make_directory_finish == null ? MemoryAddress.NULL : make_directory_finish));
            return this;
        }
        
        public Build setMakeSymbolicLink(java.lang.foreign.MemoryAddress make_symbolic_link) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("make_symbolic_link"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (make_symbolic_link == null ? MemoryAddress.NULL : make_symbolic_link));
            return this;
        }
        
        public Build setMakeSymbolicLinkAsync(java.lang.foreign.MemoryAddress make_symbolic_link_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("make_symbolic_link_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (make_symbolic_link_async == null ? MemoryAddress.NULL : make_symbolic_link_async));
            return this;
        }
        
        public Build setMakeSymbolicLinkFinish(java.lang.foreign.MemoryAddress make_symbolic_link_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("make_symbolic_link_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (make_symbolic_link_finish == null ? MemoryAddress.NULL : make_symbolic_link_finish));
            return this;
        }
        
        public Build setCopy(java.lang.foreign.MemoryAddress copy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copy == null ? MemoryAddress.NULL : copy));
            return this;
        }
        
        public Build setCopyAsync(java.lang.foreign.MemoryAddress copy_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copy_async == null ? MemoryAddress.NULL : copy_async));
            return this;
        }
        
        public Build setCopyFinish(java.lang.foreign.MemoryAddress copy_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copy_finish == null ? MemoryAddress.NULL : copy_finish));
            return this;
        }
        
        public Build setMove(java.lang.foreign.MemoryAddress move) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("move"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (move == null ? MemoryAddress.NULL : move));
            return this;
        }
        
        public Build setMoveAsync(java.lang.foreign.MemoryAddress move_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("move_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (move_async == null ? MemoryAddress.NULL : move_async));
            return this;
        }
        
        public Build setMoveFinish(java.lang.foreign.MemoryAddress move_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("move_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (move_finish == null ? MemoryAddress.NULL : move_finish));
            return this;
        }
        
        public Build setMountMountable(java.lang.foreign.MemoryAddress mount_mountable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_mountable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mount_mountable == null ? MemoryAddress.NULL : mount_mountable));
            return this;
        }
        
        public Build setMountMountableFinish(java.lang.foreign.MemoryAddress mount_mountable_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_mountable_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mount_mountable_finish == null ? MemoryAddress.NULL : mount_mountable_finish));
            return this;
        }
        
        public Build setUnmountMountable(java.lang.foreign.MemoryAddress unmount_mountable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmount_mountable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmount_mountable == null ? MemoryAddress.NULL : unmount_mountable));
            return this;
        }
        
        public Build setUnmountMountableFinish(java.lang.foreign.MemoryAddress unmount_mountable_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmount_mountable_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmount_mountable_finish == null ? MemoryAddress.NULL : unmount_mountable_finish));
            return this;
        }
        
        public Build setEjectMountable(java.lang.foreign.MemoryAddress eject_mountable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject_mountable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (eject_mountable == null ? MemoryAddress.NULL : eject_mountable));
            return this;
        }
        
        public Build setEjectMountableFinish(java.lang.foreign.MemoryAddress eject_mountable_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject_mountable_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (eject_mountable_finish == null ? MemoryAddress.NULL : eject_mountable_finish));
            return this;
        }
        
        public Build setMountEnclosingVolume(java.lang.foreign.MemoryAddress mount_enclosing_volume) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_enclosing_volume"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mount_enclosing_volume == null ? MemoryAddress.NULL : mount_enclosing_volume));
            return this;
        }
        
        public Build setMountEnclosingVolumeFinish(java.lang.foreign.MemoryAddress mount_enclosing_volume_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_enclosing_volume_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mount_enclosing_volume_finish == null ? MemoryAddress.NULL : mount_enclosing_volume_finish));
            return this;
        }
        
        public Build setMonitorDir(java.lang.foreign.MemoryAddress monitor_dir) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("monitor_dir"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (monitor_dir == null ? MemoryAddress.NULL : monitor_dir));
            return this;
        }
        
        public Build setMonitorFile(java.lang.foreign.MemoryAddress monitor_file) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("monitor_file"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (monitor_file == null ? MemoryAddress.NULL : monitor_file));
            return this;
        }
        
        public Build setOpenReadwrite(java.lang.foreign.MemoryAddress open_readwrite) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("open_readwrite"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (open_readwrite == null ? MemoryAddress.NULL : open_readwrite));
            return this;
        }
        
        public Build setOpenReadwriteAsync(java.lang.foreign.MemoryAddress open_readwrite_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("open_readwrite_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (open_readwrite_async == null ? MemoryAddress.NULL : open_readwrite_async));
            return this;
        }
        
        public Build setOpenReadwriteFinish(java.lang.foreign.MemoryAddress open_readwrite_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("open_readwrite_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (open_readwrite_finish == null ? MemoryAddress.NULL : open_readwrite_finish));
            return this;
        }
        
        public Build setCreateReadwrite(java.lang.foreign.MemoryAddress create_readwrite) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_readwrite"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (create_readwrite == null ? MemoryAddress.NULL : create_readwrite));
            return this;
        }
        
        public Build setCreateReadwriteAsync(java.lang.foreign.MemoryAddress create_readwrite_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_readwrite_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (create_readwrite_async == null ? MemoryAddress.NULL : create_readwrite_async));
            return this;
        }
        
        public Build setCreateReadwriteFinish(java.lang.foreign.MemoryAddress create_readwrite_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_readwrite_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (create_readwrite_finish == null ? MemoryAddress.NULL : create_readwrite_finish));
            return this;
        }
        
        public Build setReplaceReadwrite(java.lang.foreign.MemoryAddress replace_readwrite) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("replace_readwrite"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (replace_readwrite == null ? MemoryAddress.NULL : replace_readwrite));
            return this;
        }
        
        public Build setReplaceReadwriteAsync(java.lang.foreign.MemoryAddress replace_readwrite_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("replace_readwrite_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (replace_readwrite_async == null ? MemoryAddress.NULL : replace_readwrite_async));
            return this;
        }
        
        public Build setReplaceReadwriteFinish(java.lang.foreign.MemoryAddress replace_readwrite_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("replace_readwrite_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (replace_readwrite_finish == null ? MemoryAddress.NULL : replace_readwrite_finish));
            return this;
        }
        
        public Build setStartMountable(java.lang.foreign.MemoryAddress start_mountable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_mountable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (start_mountable == null ? MemoryAddress.NULL : start_mountable));
            return this;
        }
        
        public Build setStartMountableFinish(java.lang.foreign.MemoryAddress start_mountable_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_mountable_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (start_mountable_finish == null ? MemoryAddress.NULL : start_mountable_finish));
            return this;
        }
        
        public Build setStopMountable(java.lang.foreign.MemoryAddress stop_mountable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop_mountable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stop_mountable == null ? MemoryAddress.NULL : stop_mountable));
            return this;
        }
        
        public Build setStopMountableFinish(java.lang.foreign.MemoryAddress stop_mountable_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop_mountable_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stop_mountable_finish == null ? MemoryAddress.NULL : stop_mountable_finish));
            return this;
        }
        
        /**
         * a boolean that indicates whether the {@link File} implementation supports thread-default contexts. Since 2.22.
         * @param supports_thread_contexts The value for the {@code supports_thread_contexts} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSupportsThreadContexts(boolean supports_thread_contexts) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("supports_thread_contexts"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), supports_thread_contexts ? 1 : 0);
            return this;
        }
        
        public Build setUnmountMountableWithOperation(java.lang.foreign.MemoryAddress unmount_mountable_with_operation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmount_mountable_with_operation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmount_mountable_with_operation == null ? MemoryAddress.NULL : unmount_mountable_with_operation));
            return this;
        }
        
        public Build setUnmountMountableWithOperationFinish(java.lang.foreign.MemoryAddress unmount_mountable_with_operation_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmount_mountable_with_operation_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmount_mountable_with_operation_finish == null ? MemoryAddress.NULL : unmount_mountable_with_operation_finish));
            return this;
        }
        
        public Build setEjectMountableWithOperation(java.lang.foreign.MemoryAddress eject_mountable_with_operation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject_mountable_with_operation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (eject_mountable_with_operation == null ? MemoryAddress.NULL : eject_mountable_with_operation));
            return this;
        }
        
        public Build setEjectMountableWithOperationFinish(java.lang.foreign.MemoryAddress eject_mountable_with_operation_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject_mountable_with_operation_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (eject_mountable_with_operation_finish == null ? MemoryAddress.NULL : eject_mountable_with_operation_finish));
            return this;
        }
        
        public Build setPollMountable(java.lang.foreign.MemoryAddress poll_mountable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("poll_mountable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (poll_mountable == null ? MemoryAddress.NULL : poll_mountable));
            return this;
        }
        
        public Build setPollMountableFinish(java.lang.foreign.MemoryAddress poll_mountable_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("poll_mountable_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (poll_mountable_finish == null ? MemoryAddress.NULL : poll_mountable_finish));
            return this;
        }
        
        public Build setMeasureDiskUsage(java.lang.foreign.MemoryAddress measure_disk_usage) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("measure_disk_usage"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (measure_disk_usage == null ? MemoryAddress.NULL : measure_disk_usage));
            return this;
        }
        
        public Build setMeasureDiskUsageAsync(java.lang.foreign.MemoryAddress measure_disk_usage_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("measure_disk_usage_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (measure_disk_usage_async == null ? MemoryAddress.NULL : measure_disk_usage_async));
            return this;
        }
        
        public Build setMeasureDiskUsageFinish(java.lang.foreign.MemoryAddress measure_disk_usage_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("measure_disk_usage_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (measure_disk_usage_finish == null ? MemoryAddress.NULL : measure_disk_usage_finish));
            return this;
        }
    }
}
