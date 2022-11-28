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
    public org.gtk.gobject.TypeInterface gIface$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return new org.gtk.gobject.TypeInterface(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Get the value of the field {@code supports_thread_contexts}
     * @return The value of the field {@code supports_thread_contexts}
     */
    public boolean supportsThreadContexts$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("supports_thread_contexts"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT != 0;
    }
    
    /**
     * Change the value of the field {@code supports_thread_contexts}
     * @param supportsThreadContexts The new value of the field {@code supports_thread_contexts}
     */
    public void supportsThreadContexts$set(boolean supportsThreadContexts) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("supports_thread_contexts"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), supportsThreadContexts ? 1 : 0);
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
        
        public Build setIsNative(java.lang.foreign.MemoryAddress isNative) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_native"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (isNative == null ? MemoryAddress.NULL : isNative));
            return this;
        }
        
        public Build setHasUriScheme(java.lang.foreign.MemoryAddress hasUriScheme) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("has_uri_scheme"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (hasUriScheme == null ? MemoryAddress.NULL : hasUriScheme));
            return this;
        }
        
        public Build setGetUriScheme(java.lang.foreign.MemoryAddress getUriScheme) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_uri_scheme"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getUriScheme == null ? MemoryAddress.NULL : getUriScheme));
            return this;
        }
        
        public Build setGetBasename(java.lang.foreign.MemoryAddress getBasename) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_basename"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getBasename == null ? MemoryAddress.NULL : getBasename));
            return this;
        }
        
        public Build setGetPath(java.lang.foreign.MemoryAddress getPath) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_path"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getPath == null ? MemoryAddress.NULL : getPath));
            return this;
        }
        
        public Build setGetUri(java.lang.foreign.MemoryAddress getUri) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_uri"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getUri == null ? MemoryAddress.NULL : getUri));
            return this;
        }
        
        public Build setGetParseName(java.lang.foreign.MemoryAddress getParseName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_parse_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getParseName == null ? MemoryAddress.NULL : getParseName));
            return this;
        }
        
        public Build setGetParent(java.lang.foreign.MemoryAddress getParent) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_parent"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getParent == null ? MemoryAddress.NULL : getParent));
            return this;
        }
        
        public Build setPrefixMatches(java.lang.foreign.MemoryAddress prefixMatches) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("prefix_matches"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (prefixMatches == null ? MemoryAddress.NULL : prefixMatches));
            return this;
        }
        
        public Build setGetRelativePath(java.lang.foreign.MemoryAddress getRelativePath) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_relative_path"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getRelativePath == null ? MemoryAddress.NULL : getRelativePath));
            return this;
        }
        
        public Build setResolveRelativePath(java.lang.foreign.MemoryAddress resolveRelativePath) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("resolve_relative_path"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (resolveRelativePath == null ? MemoryAddress.NULL : resolveRelativePath));
            return this;
        }
        
        public Build setGetChildForDisplayName(java.lang.foreign.MemoryAddress getChildForDisplayName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_child_for_display_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getChildForDisplayName == null ? MemoryAddress.NULL : getChildForDisplayName));
            return this;
        }
        
        public Build setEnumerateChildren(java.lang.foreign.MemoryAddress enumerateChildren) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enumerate_children"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (enumerateChildren == null ? MemoryAddress.NULL : enumerateChildren));
            return this;
        }
        
        public Build setEnumerateChildrenAsync(java.lang.foreign.MemoryAddress enumerateChildrenAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enumerate_children_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (enumerateChildrenAsync == null ? MemoryAddress.NULL : enumerateChildrenAsync));
            return this;
        }
        
        public Build setEnumerateChildrenFinish(java.lang.foreign.MemoryAddress enumerateChildrenFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enumerate_children_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (enumerateChildrenFinish == null ? MemoryAddress.NULL : enumerateChildrenFinish));
            return this;
        }
        
        public Build setQueryInfo(java.lang.foreign.MemoryAddress queryInfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (queryInfo == null ? MemoryAddress.NULL : queryInfo));
            return this;
        }
        
        public Build setQueryInfoAsync(java.lang.foreign.MemoryAddress queryInfoAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_info_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (queryInfoAsync == null ? MemoryAddress.NULL : queryInfoAsync));
            return this;
        }
        
        public Build setQueryInfoFinish(java.lang.foreign.MemoryAddress queryInfoFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_info_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (queryInfoFinish == null ? MemoryAddress.NULL : queryInfoFinish));
            return this;
        }
        
        public Build setQueryFilesystemInfo(java.lang.foreign.MemoryAddress queryFilesystemInfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_filesystem_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (queryFilesystemInfo == null ? MemoryAddress.NULL : queryFilesystemInfo));
            return this;
        }
        
        public Build setQueryFilesystemInfoAsync(java.lang.foreign.MemoryAddress queryFilesystemInfoAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_filesystem_info_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (queryFilesystemInfoAsync == null ? MemoryAddress.NULL : queryFilesystemInfoAsync));
            return this;
        }
        
        public Build setQueryFilesystemInfoFinish(java.lang.foreign.MemoryAddress queryFilesystemInfoFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_filesystem_info_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (queryFilesystemInfoFinish == null ? MemoryAddress.NULL : queryFilesystemInfoFinish));
            return this;
        }
        
        public Build setFindEnclosingMount(java.lang.foreign.MemoryAddress findEnclosingMount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("find_enclosing_mount"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (findEnclosingMount == null ? MemoryAddress.NULL : findEnclosingMount));
            return this;
        }
        
        public Build setFindEnclosingMountAsync(java.lang.foreign.MemoryAddress findEnclosingMountAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("find_enclosing_mount_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (findEnclosingMountAsync == null ? MemoryAddress.NULL : findEnclosingMountAsync));
            return this;
        }
        
        public Build setFindEnclosingMountFinish(java.lang.foreign.MemoryAddress findEnclosingMountFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("find_enclosing_mount_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (findEnclosingMountFinish == null ? MemoryAddress.NULL : findEnclosingMountFinish));
            return this;
        }
        
        public Build setSetDisplayName(java.lang.foreign.MemoryAddress setDisplayName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_display_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setDisplayName == null ? MemoryAddress.NULL : setDisplayName));
            return this;
        }
        
        public Build setSetDisplayNameAsync(java.lang.foreign.MemoryAddress setDisplayNameAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_display_name_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setDisplayNameAsync == null ? MemoryAddress.NULL : setDisplayNameAsync));
            return this;
        }
        
        public Build setSetDisplayNameFinish(java.lang.foreign.MemoryAddress setDisplayNameFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_display_name_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setDisplayNameFinish == null ? MemoryAddress.NULL : setDisplayNameFinish));
            return this;
        }
        
        public Build setQuerySettableAttributes(java.lang.foreign.MemoryAddress querySettableAttributes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_settable_attributes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (querySettableAttributes == null ? MemoryAddress.NULL : querySettableAttributes));
            return this;
        }
        
        public Build setQuerySettableAttributesAsync(java.lang.foreign.MemoryAddress QuerySettableAttributesAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_query_settable_attributes_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (QuerySettableAttributesAsync == null ? MemoryAddress.NULL : QuerySettableAttributesAsync));
            return this;
        }
        
        public Build setQuerySettableAttributesFinish(java.lang.foreign.MemoryAddress QuerySettableAttributesFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_query_settable_attributes_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (QuerySettableAttributesFinish == null ? MemoryAddress.NULL : QuerySettableAttributesFinish));
            return this;
        }
        
        public Build setQueryWritableNamespaces(java.lang.foreign.MemoryAddress queryWritableNamespaces) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("query_writable_namespaces"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (queryWritableNamespaces == null ? MemoryAddress.NULL : queryWritableNamespaces));
            return this;
        }
        
        public Build setQueryWritableNamespacesAsync(java.lang.foreign.MemoryAddress QueryWritableNamespacesAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_query_writable_namespaces_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (QueryWritableNamespacesAsync == null ? MemoryAddress.NULL : QueryWritableNamespacesAsync));
            return this;
        }
        
        public Build setQueryWritableNamespacesFinish(java.lang.foreign.MemoryAddress QueryWritableNamespacesFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_query_writable_namespaces_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (QueryWritableNamespacesFinish == null ? MemoryAddress.NULL : QueryWritableNamespacesFinish));
            return this;
        }
        
        public Build setSetAttribute(java.lang.foreign.MemoryAddress setAttribute) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_attribute"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setAttribute == null ? MemoryAddress.NULL : setAttribute));
            return this;
        }
        
        public Build setSetAttributesFromInfo(java.lang.foreign.MemoryAddress setAttributesFromInfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_attributes_from_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setAttributesFromInfo == null ? MemoryAddress.NULL : setAttributesFromInfo));
            return this;
        }
        
        public Build setSetAttributesAsync(java.lang.foreign.MemoryAddress setAttributesAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_attributes_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setAttributesAsync == null ? MemoryAddress.NULL : setAttributesAsync));
            return this;
        }
        
        public Build setSetAttributesFinish(java.lang.foreign.MemoryAddress setAttributesFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_attributes_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setAttributesFinish == null ? MemoryAddress.NULL : setAttributesFinish));
            return this;
        }
        
        public Build setReadFn(java.lang.foreign.MemoryAddress readFn) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("read_fn"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (readFn == null ? MemoryAddress.NULL : readFn));
            return this;
        }
        
        public Build setReadAsync(java.lang.foreign.MemoryAddress readAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("read_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (readAsync == null ? MemoryAddress.NULL : readAsync));
            return this;
        }
        
        public Build setReadFinish(java.lang.foreign.MemoryAddress readFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("read_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (readFinish == null ? MemoryAddress.NULL : readFinish));
            return this;
        }
        
        public Build setAppendTo(java.lang.foreign.MemoryAddress appendTo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("append_to"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (appendTo == null ? MemoryAddress.NULL : appendTo));
            return this;
        }
        
        public Build setAppendToAsync(java.lang.foreign.MemoryAddress appendToAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("append_to_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (appendToAsync == null ? MemoryAddress.NULL : appendToAsync));
            return this;
        }
        
        public Build setAppendToFinish(java.lang.foreign.MemoryAddress appendToFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("append_to_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (appendToFinish == null ? MemoryAddress.NULL : appendToFinish));
            return this;
        }
        
        public Build setCreate(java.lang.foreign.MemoryAddress create) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (create == null ? MemoryAddress.NULL : create));
            return this;
        }
        
        public Build setCreateAsync(java.lang.foreign.MemoryAddress createAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createAsync == null ? MemoryAddress.NULL : createAsync));
            return this;
        }
        
        public Build setCreateFinish(java.lang.foreign.MemoryAddress createFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createFinish == null ? MemoryAddress.NULL : createFinish));
            return this;
        }
        
        public Build setReplace(java.lang.foreign.MemoryAddress replace) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("replace"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (replace == null ? MemoryAddress.NULL : replace));
            return this;
        }
        
        public Build setReplaceAsync(java.lang.foreign.MemoryAddress replaceAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("replace_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (replaceAsync == null ? MemoryAddress.NULL : replaceAsync));
            return this;
        }
        
        public Build setReplaceFinish(java.lang.foreign.MemoryAddress replaceFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("replace_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (replaceFinish == null ? MemoryAddress.NULL : replaceFinish));
            return this;
        }
        
        public Build setDeleteFile(java.lang.foreign.MemoryAddress deleteFile) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delete_file"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deleteFile == null ? MemoryAddress.NULL : deleteFile));
            return this;
        }
        
        public Build setDeleteFileAsync(java.lang.foreign.MemoryAddress deleteFileAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delete_file_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deleteFileAsync == null ? MemoryAddress.NULL : deleteFileAsync));
            return this;
        }
        
        public Build setDeleteFileFinish(java.lang.foreign.MemoryAddress deleteFileFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("delete_file_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deleteFileFinish == null ? MemoryAddress.NULL : deleteFileFinish));
            return this;
        }
        
        public Build setTrash(java.lang.foreign.MemoryAddress trash) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("trash"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (trash == null ? MemoryAddress.NULL : trash));
            return this;
        }
        
        public Build setTrashAsync(java.lang.foreign.MemoryAddress trashAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("trash_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (trashAsync == null ? MemoryAddress.NULL : trashAsync));
            return this;
        }
        
        public Build setTrashFinish(java.lang.foreign.MemoryAddress trashFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("trash_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (trashFinish == null ? MemoryAddress.NULL : trashFinish));
            return this;
        }
        
        public Build setMakeDirectory(java.lang.foreign.MemoryAddress makeDirectory) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("make_directory"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (makeDirectory == null ? MemoryAddress.NULL : makeDirectory));
            return this;
        }
        
        public Build setMakeDirectoryAsync(java.lang.foreign.MemoryAddress makeDirectoryAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("make_directory_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (makeDirectoryAsync == null ? MemoryAddress.NULL : makeDirectoryAsync));
            return this;
        }
        
        public Build setMakeDirectoryFinish(java.lang.foreign.MemoryAddress makeDirectoryFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("make_directory_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (makeDirectoryFinish == null ? MemoryAddress.NULL : makeDirectoryFinish));
            return this;
        }
        
        public Build setMakeSymbolicLink(java.lang.foreign.MemoryAddress makeSymbolicLink) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("make_symbolic_link"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (makeSymbolicLink == null ? MemoryAddress.NULL : makeSymbolicLink));
            return this;
        }
        
        public Build setMakeSymbolicLinkAsync(java.lang.foreign.MemoryAddress makeSymbolicLinkAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("make_symbolic_link_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (makeSymbolicLinkAsync == null ? MemoryAddress.NULL : makeSymbolicLinkAsync));
            return this;
        }
        
        public Build setMakeSymbolicLinkFinish(java.lang.foreign.MemoryAddress makeSymbolicLinkFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("make_symbolic_link_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (makeSymbolicLinkFinish == null ? MemoryAddress.NULL : makeSymbolicLinkFinish));
            return this;
        }
        
        public Build setCopy(java.lang.foreign.MemoryAddress copy) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copy == null ? MemoryAddress.NULL : copy));
            return this;
        }
        
        public Build setCopyAsync(java.lang.foreign.MemoryAddress copyAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copyAsync == null ? MemoryAddress.NULL : copyAsync));
            return this;
        }
        
        public Build setCopyFinish(java.lang.foreign.MemoryAddress copyFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("copy_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (copyFinish == null ? MemoryAddress.NULL : copyFinish));
            return this;
        }
        
        public Build setMove(java.lang.foreign.MemoryAddress move) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("move"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (move == null ? MemoryAddress.NULL : move));
            return this;
        }
        
        public Build setMoveAsync(java.lang.foreign.MemoryAddress moveAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("move_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (moveAsync == null ? MemoryAddress.NULL : moveAsync));
            return this;
        }
        
        public Build setMoveFinish(java.lang.foreign.MemoryAddress moveFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("move_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (moveFinish == null ? MemoryAddress.NULL : moveFinish));
            return this;
        }
        
        public Build setMountMountable(java.lang.foreign.MemoryAddress mountMountable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_mountable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mountMountable == null ? MemoryAddress.NULL : mountMountable));
            return this;
        }
        
        public Build setMountMountableFinish(java.lang.foreign.MemoryAddress mountMountableFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_mountable_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mountMountableFinish == null ? MemoryAddress.NULL : mountMountableFinish));
            return this;
        }
        
        public Build setUnmountMountable(java.lang.foreign.MemoryAddress unmountMountable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmount_mountable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmountMountable == null ? MemoryAddress.NULL : unmountMountable));
            return this;
        }
        
        public Build setUnmountMountableFinish(java.lang.foreign.MemoryAddress unmountMountableFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmount_mountable_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmountMountableFinish == null ? MemoryAddress.NULL : unmountMountableFinish));
            return this;
        }
        
        public Build setEjectMountable(java.lang.foreign.MemoryAddress ejectMountable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject_mountable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ejectMountable == null ? MemoryAddress.NULL : ejectMountable));
            return this;
        }
        
        public Build setEjectMountableFinish(java.lang.foreign.MemoryAddress ejectMountableFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject_mountable_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ejectMountableFinish == null ? MemoryAddress.NULL : ejectMountableFinish));
            return this;
        }
        
        public Build setMountEnclosingVolume(java.lang.foreign.MemoryAddress mountEnclosingVolume) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_enclosing_volume"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mountEnclosingVolume == null ? MemoryAddress.NULL : mountEnclosingVolume));
            return this;
        }
        
        public Build setMountEnclosingVolumeFinish(java.lang.foreign.MemoryAddress mountEnclosingVolumeFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_enclosing_volume_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mountEnclosingVolumeFinish == null ? MemoryAddress.NULL : mountEnclosingVolumeFinish));
            return this;
        }
        
        public Build setMonitorDir(java.lang.foreign.MemoryAddress monitorDir) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("monitor_dir"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (monitorDir == null ? MemoryAddress.NULL : monitorDir));
            return this;
        }
        
        public Build setMonitorFile(java.lang.foreign.MemoryAddress monitorFile) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("monitor_file"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (monitorFile == null ? MemoryAddress.NULL : monitorFile));
            return this;
        }
        
        public Build setOpenReadwrite(java.lang.foreign.MemoryAddress openReadwrite) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("open_readwrite"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (openReadwrite == null ? MemoryAddress.NULL : openReadwrite));
            return this;
        }
        
        public Build setOpenReadwriteAsync(java.lang.foreign.MemoryAddress openReadwriteAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("open_readwrite_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (openReadwriteAsync == null ? MemoryAddress.NULL : openReadwriteAsync));
            return this;
        }
        
        public Build setOpenReadwriteFinish(java.lang.foreign.MemoryAddress openReadwriteFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("open_readwrite_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (openReadwriteFinish == null ? MemoryAddress.NULL : openReadwriteFinish));
            return this;
        }
        
        public Build setCreateReadwrite(java.lang.foreign.MemoryAddress createReadwrite) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_readwrite"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createReadwrite == null ? MemoryAddress.NULL : createReadwrite));
            return this;
        }
        
        public Build setCreateReadwriteAsync(java.lang.foreign.MemoryAddress createReadwriteAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_readwrite_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createReadwriteAsync == null ? MemoryAddress.NULL : createReadwriteAsync));
            return this;
        }
        
        public Build setCreateReadwriteFinish(java.lang.foreign.MemoryAddress createReadwriteFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_readwrite_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createReadwriteFinish == null ? MemoryAddress.NULL : createReadwriteFinish));
            return this;
        }
        
        public Build setReplaceReadwrite(java.lang.foreign.MemoryAddress replaceReadwrite) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("replace_readwrite"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (replaceReadwrite == null ? MemoryAddress.NULL : replaceReadwrite));
            return this;
        }
        
        public Build setReplaceReadwriteAsync(java.lang.foreign.MemoryAddress replaceReadwriteAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("replace_readwrite_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (replaceReadwriteAsync == null ? MemoryAddress.NULL : replaceReadwriteAsync));
            return this;
        }
        
        public Build setReplaceReadwriteFinish(java.lang.foreign.MemoryAddress replaceReadwriteFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("replace_readwrite_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (replaceReadwriteFinish == null ? MemoryAddress.NULL : replaceReadwriteFinish));
            return this;
        }
        
        public Build setStartMountable(java.lang.foreign.MemoryAddress startMountable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_mountable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (startMountable == null ? MemoryAddress.NULL : startMountable));
            return this;
        }
        
        public Build setStartMountableFinish(java.lang.foreign.MemoryAddress startMountableFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_mountable_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (startMountableFinish == null ? MemoryAddress.NULL : startMountableFinish));
            return this;
        }
        
        public Build setStopMountable(java.lang.foreign.MemoryAddress stopMountable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop_mountable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stopMountable == null ? MemoryAddress.NULL : stopMountable));
            return this;
        }
        
        public Build setStopMountableFinish(java.lang.foreign.MemoryAddress stopMountableFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop_mountable_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stopMountableFinish == null ? MemoryAddress.NULL : stopMountableFinish));
            return this;
        }
        
        /**
         * a boolean that indicates whether the {@link File} implementation supports thread-default contexts. Since 2.22.
         * @param supportsThreadContexts The value for the {@code supportsThreadContexts} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSupportsThreadContexts(boolean supportsThreadContexts) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("supports_thread_contexts"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), supportsThreadContexts ? 1 : 0);
            return this;
        }
        
        public Build setUnmountMountableWithOperation(java.lang.foreign.MemoryAddress unmountMountableWithOperation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmount_mountable_with_operation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmountMountableWithOperation == null ? MemoryAddress.NULL : unmountMountableWithOperation));
            return this;
        }
        
        public Build setUnmountMountableWithOperationFinish(java.lang.foreign.MemoryAddress unmountMountableWithOperationFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmount_mountable_with_operation_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmountMountableWithOperationFinish == null ? MemoryAddress.NULL : unmountMountableWithOperationFinish));
            return this;
        }
        
        public Build setEjectMountableWithOperation(java.lang.foreign.MemoryAddress ejectMountableWithOperation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject_mountable_with_operation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ejectMountableWithOperation == null ? MemoryAddress.NULL : ejectMountableWithOperation));
            return this;
        }
        
        public Build setEjectMountableWithOperationFinish(java.lang.foreign.MemoryAddress ejectMountableWithOperationFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject_mountable_with_operation_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ejectMountableWithOperationFinish == null ? MemoryAddress.NULL : ejectMountableWithOperationFinish));
            return this;
        }
        
        public Build setPollMountable(java.lang.foreign.MemoryAddress pollMountable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("poll_mountable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pollMountable == null ? MemoryAddress.NULL : pollMountable));
            return this;
        }
        
        public Build setPollMountableFinish(java.lang.foreign.MemoryAddress pollMountableFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("poll_mountable_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pollMountableFinish == null ? MemoryAddress.NULL : pollMountableFinish));
            return this;
        }
        
        public Build setMeasureDiskUsage(java.lang.foreign.MemoryAddress measureDiskUsage) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("measure_disk_usage"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (measureDiskUsage == null ? MemoryAddress.NULL : measureDiskUsage));
            return this;
        }
        
        public Build setMeasureDiskUsageAsync(java.lang.foreign.MemoryAddress measureDiskUsageAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("measure_disk_usage_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (measureDiskUsageAsync == null ? MemoryAddress.NULL : measureDiskUsageAsync));
            return this;
        }
        
        public Build setMeasureDiskUsageFinish(java.lang.foreign.MemoryAddress measureDiskUsageFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("measure_disk_usage_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (measureDiskUsageFinish == null ? MemoryAddress.NULL : measureDiskUsageFinish));
            return this;
        }
    }
}
