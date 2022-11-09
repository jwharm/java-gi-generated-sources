package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An interface for writing VFS file handles.
 */
public class FileIface extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GFileIface";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
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
        Interop.valueLayout.ADDRESS.withName("_make_symbolic_link_async"),
        Interop.valueLayout.ADDRESS.withName("_make_symbolic_link_finish"),
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
        ValueLayout.JAVA_INT.withName("supports_thread_contexts"),
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
}
